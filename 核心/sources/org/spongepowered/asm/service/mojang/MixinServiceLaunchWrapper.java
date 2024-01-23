package org.spongepowered.asm.service.mojang;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.common.io.ByteStreams;
import com.google.common.io.Closeables;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import net.minecraft.launchwrapper.IClassNameTransformer;
import net.minecraft.launchwrapper.IClassTransformer;
import net.minecraft.launchwrapper.Launch;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.launch.GlobalProperties;
import org.spongepowered.asm.launch.platform.MainAttributes;
import org.spongepowered.asm.launch.platform.container.ContainerHandleURI;
import org.spongepowered.asm.launch.platform.container.ContainerHandleVirtual;
import org.spongepowered.asm.launch.platform.container.IContainerHandle;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.throwables.MixinException;
import org.spongepowered.asm.service.IClassBytecodeProvider;
import org.spongepowered.asm.service.IClassProvider;
import org.spongepowered.asm.service.IClassTracker;
import org.spongepowered.asm.service.ILegacyClassTransformer;
import org.spongepowered.asm.service.IMixinAuditTrail;
import org.spongepowered.asm.service.ITransformer;
import org.spongepowered.asm.service.ITransformerProvider;
import org.spongepowered.asm.service.MixinServiceAbstract;
import org.spongepowered.asm.util.Constants;
import org.spongepowered.asm.util.perf.Profiler;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/mojang/MixinServiceLaunchWrapper.class */
public class MixinServiceLaunchWrapper extends MixinServiceAbstract implements IClassProvider, IClassBytecodeProvider, ITransformerProvider {
    private static final String MIXIN_TWEAKER_CLASS = "org.spongepowered.asm.launch.MixinTweaker";
    private static final String STATE_TWEAKER = "org.spongepowered.asm.mixin.EnvironmentStateTweaker";
    private static final String TRANSFORMER_PROXY_CLASS = "org.spongepowered.asm.mixin.transformer.Proxy";
    private final LaunchClassLoaderUtil classLoaderUtil = new LaunchClassLoaderUtil(Launch.classLoader);
    private List<ILegacyClassTransformer> delegatedTransformers;
    private IClassNameTransformer nameTransformer;
    public static final GlobalProperties.Keys BLACKBOARD_KEY_TWEAKCLASSES = GlobalProperties.Keys.of("TweakClasses");
    public static final GlobalProperties.Keys BLACKBOARD_KEY_TWEAKS = GlobalProperties.Keys.of("Tweaks");
    private static final Set<String> excludeTransformers = Sets.newHashSet(new String[]{"net.minecraftforge.fml.common.asm.transformers.EventSubscriptionTransformer", "cpw.mods.fml.common.asm.transformers.EventSubscriptionTransformer", "net.minecraftforge.fml.common.asm.transformers.TerminalTransformer", "cpw.mods.fml.common.asm.transformers.TerminalTransformer"});

    @Override // org.spongepowered.asm.service.IMixinService
    public String getName() {
        return "LaunchWrapper";
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public boolean isValid() {
        try {
            Launch.classLoader.hashCode();
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    @Override // org.spongepowered.asm.service.MixinServiceAbstract, org.spongepowered.asm.service.IMixinService
    public void prepare() {
        Launch.classLoader.addClassLoaderExclusion("org.spongepowered.asm.launch.");
    }

    @Override // org.spongepowered.asm.service.MixinServiceAbstract, org.spongepowered.asm.service.IMixinService
    public MixinEnvironment.Phase getInitialPhase() {
        String command = System.getProperty("sun.java.command");
        if (command != null && command.contains("GradleStart")) {
            System.setProperty("mixin.env.remapRefMap", "true");
        }
        if (findInStackTrace("net.minecraft.launchwrapper.Launch", "launch") > 132) {
            return MixinEnvironment.Phase.DEFAULT;
        }
        return MixinEnvironment.Phase.PREINIT;
    }

    @Override // org.spongepowered.asm.service.MixinServiceAbstract, org.spongepowered.asm.service.IMixinService
    public MixinEnvironment.CompatibilityLevel getMaxCompatibilityLevel() {
        return MixinEnvironment.CompatibilityLevel.JAVA_8;
    }

    @Override // org.spongepowered.asm.service.MixinServiceAbstract, org.spongepowered.asm.service.IMixinService
    public void init() {
        if (findInStackTrace("net.minecraft.launchwrapper.Launch", "launch") < 4) {
            MixinServiceAbstract.logger.error("MixinBootstrap.doInit() called during a tweak constructor!");
        }
        List<String> tweakClasses = (List) GlobalProperties.get(BLACKBOARD_KEY_TWEAKCLASSES);
        if (tweakClasses != null) {
            tweakClasses.add(STATE_TWEAKER);
        }
        super.init();
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public Collection<String> getPlatformAgents() {
        return ImmutableList.of("org.spongepowered.asm.launch.platform.MixinPlatformAgentFMLLegacy", "org.spongepowered.asm.launch.platform.MixinPlatformAgentLiteLoaderLegacy");
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public IContainerHandle getPrimaryContainer() {
        try {
            URI uri = getClass().getProtectionDomain().getCodeSource().getLocation().toURI();
            if (uri != null) {
                return new ContainerHandleURI(uri);
            }
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }
        return new ContainerHandleVirtual(getName());
    }

    @Override // org.spongepowered.asm.service.MixinServiceAbstract, org.spongepowered.asm.service.IMixinService
    public Collection<IContainerHandle> getMixinContainers() {
        ImmutableList.Builder<IContainerHandle> list = ImmutableList.builder();
        getContainersFromClassPath(list);
        getContainersFromAgents(list);
        return list.build();
    }

    private void getContainersFromClassPath(ImmutableList.Builder<IContainerHandle> list) {
        URL[] sources = getClassPath();
        if (sources != null) {
            for (URL url : sources) {
                try {
                    URI uri = url.toURI();
                    MixinServiceAbstract.logger.debug("Scanning {} for mixin tweaker", new Object[]{uri});
                    if ("file".equals(uri.getScheme()) && new File(uri).exists()) {
                        MainAttributes attributes = MainAttributes.of(uri);
                        String tweaker = attributes.get(Constants.ManifestAttributes.TWEAKER);
                        if (MIXIN_TWEAKER_CLASS.equals(tweaker)) {
                            list.add(new ContainerHandleURI(uri));
                        }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public IClassProvider getClassProvider() {
        return this;
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public IClassBytecodeProvider getBytecodeProvider() {
        return this;
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public ITransformerProvider getTransformerProvider() {
        return this;
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public IClassTracker getClassTracker() {
        return this.classLoaderUtil;
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public IMixinAuditTrail getAuditTrail() {
        return null;
    }

    @Override // org.spongepowered.asm.service.IClassProvider
    public Class<?> findClass(String name) throws ClassNotFoundException {
        return Launch.classLoader.findClass(name);
    }

    @Override // org.spongepowered.asm.service.IClassProvider
    public Class<?> findClass(String name, boolean initialize) throws ClassNotFoundException {
        return Class.forName(name, initialize, Launch.classLoader);
    }

    @Override // org.spongepowered.asm.service.IClassProvider
    public Class<?> findAgentClass(String name, boolean initialize) throws ClassNotFoundException {
        return Class.forName(name, initialize, Launch.class.getClassLoader());
    }

    @Override // org.spongepowered.asm.service.MixinServiceAbstract, org.spongepowered.asm.service.IMixinService
    public void beginPhase() {
        Launch.classLoader.registerTransformer(TRANSFORMER_PROXY_CLASS);
        this.delegatedTransformers = null;
    }

    @Override // org.spongepowered.asm.service.MixinServiceAbstract, org.spongepowered.asm.service.IMixinService
    public void checkEnv(Object bootSource) {
        if (bootSource.getClass().getClassLoader() != Launch.class.getClassLoader()) {
            throw new MixinException("Attempted to init the mixin environment in the wrong classloader");
        }
    }

    @Override // org.spongepowered.asm.service.IMixinService
    public InputStream getResourceAsStream(String name) {
        return Launch.classLoader.getResourceAsStream(name);
    }

    @Override // org.spongepowered.asm.service.IClassProvider
    @Deprecated
    public URL[] getClassPath() {
        return (URL[]) Launch.classLoader.getSources().toArray(new URL[0]);
    }

    @Override // org.spongepowered.asm.service.ITransformerProvider
    public Collection<ITransformer> getTransformers() {
        List<IClassTransformer> transformers = Launch.classLoader.getTransformers();
        List<ITransformer> wrapped = new ArrayList<>(transformers.size());
        for (IClassTransformer iClassTransformer : transformers) {
            if (iClassTransformer instanceof ITransformer) {
                wrapped.add((ITransformer) iClassTransformer);
            } else {
                wrapped.add(new LegacyTransformerHandle(iClassTransformer));
            }
            if (iClassTransformer instanceof IClassNameTransformer) {
                MixinServiceAbstract.logger.debug("Found name transformer: {}", new Object[]{iClassTransformer.getClass().getName()});
                this.nameTransformer = (IClassNameTransformer) iClassTransformer;
            }
        }
        return wrapped;
    }

    @Override // org.spongepowered.asm.service.ITransformerProvider
    public List<ITransformer> getDelegatedTransformers() {
        return Collections.unmodifiableList(getDelegatedLegacyTransformers());
    }

    private List<ILegacyClassTransformer> getDelegatedLegacyTransformers() {
        if (this.delegatedTransformers == null) {
            buildTransformerDelegationList();
        }
        return this.delegatedTransformers;
    }

    private void buildTransformerDelegationList() {
        MixinServiceAbstract.logger.debug("Rebuilding transformer delegation list:");
        this.delegatedTransformers = new ArrayList();
        for (ITransformer transformer : getTransformers()) {
            if (transformer instanceof ILegacyClassTransformer) {
                ILegacyClassTransformer legacyTransformer = (ILegacyClassTransformer) transformer;
                String transformerName = legacyTransformer.getName();
                boolean include = true;
                Iterator<String> it = excludeTransformers.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String excludeClass = it.next();
                    if (transformerName.contains(excludeClass)) {
                        include = false;
                        break;
                    }
                }
                if (include && !legacyTransformer.isDelegationExcluded()) {
                    MixinServiceAbstract.logger.debug("  Adding:    {}", new Object[]{transformerName});
                    this.delegatedTransformers.add(legacyTransformer);
                } else {
                    MixinServiceAbstract.logger.debug("  Excluding: {}", new Object[]{transformerName});
                }
            }
        }
        MixinServiceAbstract.logger.debug("Transformer delegation list created with {} entries", new Object[]{Integer.valueOf(this.delegatedTransformers.size())});
    }

    @Override // org.spongepowered.asm.service.ITransformerProvider
    public void addTransformerExclusion(String name) {
        excludeTransformers.add(name);
        this.delegatedTransformers = null;
    }

    @Deprecated
    public byte[] getClassBytes(String name, String transformedName) throws IOException {
        URLClassLoader appClassLoader;
        byte[] classBytes = Launch.classLoader.getClassBytes(name);
        if (classBytes != null) {
            return classBytes;
        }
        if (Launch.class.getClassLoader() instanceof URLClassLoader) {
            appClassLoader = (URLClassLoader) Launch.class.getClassLoader();
        } else {
            appClassLoader = new URLClassLoader(new URL[0], Launch.class.getClassLoader());
        }
        InputStream classStream = null;
        try {
            String resourcePath = transformedName.replace('.', '/').concat(".class");
            classStream = appClassLoader.getResourceAsStream(resourcePath);
            byte[] byteArray = ByteStreams.toByteArray(classStream);
            Closeables.closeQuietly(classStream);
            return byteArray;
        } catch (Exception e) {
            Closeables.closeQuietly(classStream);
            return null;
        } catch (Throwable th) {
            Closeables.closeQuietly(classStream);
            throw th;
        }
    }

    @Deprecated
    public byte[] getClassBytes(String className, boolean runTransformers) throws ClassNotFoundException, IOException {
        String transformedName = className.replace('/', '.');
        String name = unmapClassName(transformedName);
        Profiler profiler = MixinEnvironment.getProfiler();
        Profiler.Section loadTime = profiler.begin(1, "class.load");
        byte[] classBytes = getClassBytes(name, transformedName);
        loadTime.end();
        if (runTransformers) {
            Profiler.Section transformTime = profiler.begin(1, "class.transform");
            classBytes = applyTransformers(name, transformedName, classBytes, profiler);
            transformTime.end();
        }
        if (classBytes == null) {
            throw new ClassNotFoundException(String.format("The specified class '%s' was not found", transformedName));
        }
        return classBytes;
    }

    private byte[] applyTransformers(String name, String transformedName, byte[] basicClass, Profiler profiler) {
        if (this.classLoaderUtil.isClassExcluded(name, transformedName)) {
            return basicClass;
        }
        for (ILegacyClassTransformer transformer : getDelegatedLegacyTransformers()) {
            this.lock.clear();
            int pos = transformer.getName().lastIndexOf(46);
            String simpleName = transformer.getName().substring(pos + 1);
            Profiler.Section transformTime = profiler.begin(2, simpleName.toLowerCase(Locale.ROOT));
            transformTime.setInfo(transformer.getName());
            basicClass = transformer.transformClassBytes(name, transformedName, basicClass);
            transformTime.end();
            if (this.lock.isSet()) {
                addTransformerExclusion(transformer.getName());
                this.lock.clear();
                MixinServiceAbstract.logger.info("A re-entrant transformer '{}' was detected and will no longer process meta class data", new Object[]{transformer.getName()});
            }
        }
        return basicClass;
    }

    private String unmapClassName(String className) {
        if (this.nameTransformer == null) {
            findNameTransformer();
        }
        if (this.nameTransformer != null) {
            return this.nameTransformer.unmapClassName(className);
        }
        return className;
    }

    private void findNameTransformer() {
        List<IClassTransformer> transformers = Launch.classLoader.getTransformers();
        for (IClassTransformer iClassTransformer : transformers) {
            if (iClassTransformer instanceof IClassNameTransformer) {
                MixinServiceAbstract.logger.debug("Found name transformer: {}", new Object[]{iClassTransformer.getClass().getName()});
                this.nameTransformer = (IClassNameTransformer) iClassTransformer;
            }
        }
    }

    @Override // org.spongepowered.asm.service.IClassBytecodeProvider
    public ClassNode getClassNode(String className) throws ClassNotFoundException, IOException {
        return getClassNode(getClassBytes(className, true), 8);
    }

    @Override // org.spongepowered.asm.service.IClassBytecodeProvider
    public ClassNode getClassNode(String className, boolean runTransformers) throws ClassNotFoundException, IOException {
        return getClassNode(getClassBytes(className, true), 8);
    }

    private ClassNode getClassNode(byte[] classBytes, int flags) {
        ClassNode classNode = new ClassNode();
        ClassReader classReader = new ClassReader(classBytes);
        classReader.accept(classNode, flags);
        return classNode;
    }

    private static int findInStackTrace(String className, String methodName) {
        Thread currentThread = Thread.currentThread();
        if (!"main".equals(currentThread.getName())) {
            return 0;
        }
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        for (StackTraceElement s : stackTrace) {
            if (className.equals(s.getClassName()) && methodName.equals(s.getMethodName())) {
                return s.getLineNumber();
            }
        }
        return 0;
    }
}
