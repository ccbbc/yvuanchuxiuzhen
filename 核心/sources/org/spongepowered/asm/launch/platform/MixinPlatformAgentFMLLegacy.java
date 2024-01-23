package org.spongepowered.asm.launch.platform;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.launchwrapper.ITweaker;
import net.minecraft.launchwrapper.Launch;
import net.minecraft.launchwrapper.LaunchClassLoader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.spongepowered.asm.launch.GlobalProperties;
import org.spongepowered.asm.launch.platform.IMixinPlatformAgent;
import org.spongepowered.asm.launch.platform.container.ContainerHandleURI;
import org.spongepowered.asm.launch.platform.container.IContainerHandle;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.extensibility.IRemapper;
import org.spongepowered.asm.service.mojang.MixinServiceLaunchWrapper;
import org.spongepowered.asm.util.Constants;
import org.spongepowered.asm.util.IConsumer;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/platform/MixinPlatformAgentFMLLegacy.class */
public class MixinPlatformAgentFMLLegacy extends MixinPlatformAgentAbstract implements IMixinPlatformServiceAgent {
    private static final String OLD_LAUNCH_HANDLER_CLASS = "cpw.mods.fml.relauncher.FMLLaunchHandler";
    private static final String NEW_LAUNCH_HANDLER_CLASS = "net.minecraftforge.fml.relauncher.FMLLaunchHandler";
    private static final String CLIENT_TWEAKER_TAIL = ".common.launcher.FMLTweaker";
    private static final String SERVER_TWEAKER_TAIL = ".common.launcher.FMLServerTweaker";
    private static final String GETSIDE_METHOD = "side";
    private static final String LOAD_CORE_MOD_METHOD = "loadCoreMod";
    private static final String GET_REPARSEABLE_COREMODS_METHOD = "getReparseableCoremods";
    private static final String CORE_MOD_MANAGER_CLASS = "net.minecraftforge.fml.relauncher.CoreModManager";
    private static final String CORE_MOD_MANAGER_CLASS_LEGACY = "cpw.mods.fml.relauncher.CoreModManager";
    private static final String GET_IGNORED_MODS_METHOD = "getIgnoredMods";
    private static final String GET_IGNORED_MODS_METHOD_LEGACY = "getLoadedCoremods";
    private static final String FML_REMAPPER_ADAPTER_CLASS = "org.spongepowered.asm.bridge.RemapperAdapterFML";
    private static final String FML_CMDLINE_COREMODS = "fml.coreMods.load";
    private static final String FML_PLUGIN_WRAPPER_CLASS = "FMLPluginWrapper";
    private static final String FML_CORE_MOD_INSTANCE_FIELD = "coreModInstance";
    private static final String MFATT_FORCELOADASMOD = "ForceLoadAsMod";
    private static final String MFATT_FMLCOREPLUGIN = "FMLCorePlugin";
    private static final String MFATT_COREMODCONTAINSMOD = "FMLCorePluginContainsFMLMod";
    private static final String FML_TWEAKER_DEOBF = "FMLDeobfTweaker";
    private static final String FML_TWEAKER_INJECTION = "FMLInjectionAndSortingTweaker";
    private static final String FML_TWEAKER_TERMINAL = "TerminalTweaker";
    private static final Set<String> loadedCoreMods = new HashSet();
    private File file;
    private String fileName;
    private ITweaker coreModWrapper;
    private Class<?> clCoreModManager;
    private boolean initInjectionState;
    static MixinAppender appender;
    static Logger log;
    static Level oldLevel;

    static {
        String[] split;
        for (String cmdLineCoreMod : System.getProperty(FML_CMDLINE_COREMODS, "").split(",")) {
            if (!cmdLineCoreMod.isEmpty()) {
                MixinPlatformAgentAbstract.logger.debug("FML platform agent will ignore coremod {} specified on the command line", new Object[]{cmdLineCoreMod});
                loadedCoreMods.add(cmdLineCoreMod);
            }
        }
        oldLevel = null;
    }

    @Override // org.spongepowered.asm.launch.platform.MixinPlatformAgentAbstract, org.spongepowered.asm.launch.platform.IMixinPlatformAgent
    public IMixinPlatformAgent.AcceptResult accept(MixinPlatformManager manager, IContainerHandle handle) {
        try {
            this.clCoreModManager = getCoreModManagerClass();
            if (!(handle instanceof ContainerHandleURI) || super.accept(manager, handle) != IMixinPlatformAgent.AcceptResult.ACCEPTED) {
                return IMixinPlatformAgent.AcceptResult.REJECTED;
            }
            this.file = ((ContainerHandleURI) handle).getFile();
            this.fileName = this.file.getName();
            this.coreModWrapper = initFMLCoreMod();
            return this.coreModWrapper != null ? IMixinPlatformAgent.AcceptResult.ACCEPTED : IMixinPlatformAgent.AcceptResult.REJECTED;
        } catch (ClassNotFoundException ex) {
            MixinPlatformAgentAbstract.logger.info("FML platform manager could not load class {}. Proceeding without FML support.", new Object[]{ex.getMessage()});
            return IMixinPlatformAgent.AcceptResult.INVALID;
        }
    }

    private ITweaker initFMLCoreMod() {
        try {
            if ("true".equalsIgnoreCase(this.handle.getAttribute(MFATT_FORCELOADASMOD))) {
                MixinPlatformAgentAbstract.logger.debug("ForceLoadAsMod was specified for {}, attempting force-load", new Object[]{this.fileName});
                loadAsMod();
            }
            return injectCorePlugin();
        } catch (Exception ex) {
            MixinPlatformAgentAbstract.logger.catching(ex);
            return null;
        }
    }

    private void loadAsMod() {
        try {
            getIgnoredMods(this.clCoreModManager).remove(this.fileName);
        } catch (Exception ex) {
            MixinPlatformAgentAbstract.logger.catching(ex);
        }
        if (this.handle.getAttribute(MFATT_COREMODCONTAINSMOD) != null) {
            if (isIgnoredReparseable()) {
                MixinPlatformAgentAbstract.logger.debug("Ignoring request to add {} to reparseable coremod collection - it is a deobfuscated dependency", new Object[]{this.fileName});
            } else {
                addReparseableJar();
            }
        }
    }

    private boolean isIgnoredReparseable() {
        return this.handle.toString().contains("deobfedDeps");
    }

    private void addReparseableJar() {
        try {
            Method mdGetReparsedCoremods = this.clCoreModManager.getDeclaredMethod(GlobalProperties.getString(GlobalProperties.Keys.FML_GET_REPARSEABLE_COREMODS, GET_REPARSEABLE_COREMODS_METHOD), new Class[0]);
            List<String> reparsedCoremods = (List) mdGetReparsedCoremods.invoke(null, new Object[0]);
            if (!reparsedCoremods.contains(this.fileName)) {
                MixinPlatformAgentAbstract.logger.debug("Adding {} to reparseable coremod collection", new Object[]{this.fileName});
                reparsedCoremods.add(this.fileName);
            }
        } catch (Exception ex) {
            MixinPlatformAgentAbstract.logger.catching(ex);
        }
    }

    private ITweaker injectCorePlugin() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        String coreModName = this.handle.getAttribute(MFATT_FMLCOREPLUGIN);
        if (coreModName == null) {
            return null;
        }
        if (isAlreadyInjected(coreModName)) {
            MixinPlatformAgentAbstract.logger.debug("{} has core plugin {}. Skipping because it was already injected.", new Object[]{this.fileName, coreModName});
            return null;
        }
        MixinPlatformAgentAbstract.logger.debug("{} has core plugin {}. Injecting it into FML for co-initialisation:", new Object[]{this.fileName, coreModName});
        Method mdLoadCoreMod = this.clCoreModManager.getDeclaredMethod(GlobalProperties.getString(GlobalProperties.Keys.FML_LOAD_CORE_MOD, LOAD_CORE_MOD_METHOD), LaunchClassLoader.class, String.class, File.class);
        mdLoadCoreMod.setAccessible(true);
        ITweaker wrapper = (ITweaker) mdLoadCoreMod.invoke(null, Launch.classLoader, coreModName, this.file);
        if (wrapper == null) {
            MixinPlatformAgentAbstract.logger.debug("Core plugin {} could not be loaded.", new Object[]{coreModName});
            return null;
        }
        this.initInjectionState = isTweakerQueued(FML_TWEAKER_INJECTION);
        loadedCoreMods.add(coreModName);
        return wrapper;
    }

    private boolean isAlreadyInjected(String coreModName) {
        if (loadedCoreMods.contains(coreModName)) {
            return true;
        }
        try {
            List<ITweaker> tweakers = (List) GlobalProperties.get(MixinServiceLaunchWrapper.BLACKBOARD_KEY_TWEAKS);
            if (tweakers == null) {
                return false;
            }
            for (ITweaker tweaker : tweakers) {
                Class<?> cls = tweaker.getClass();
                if (FML_PLUGIN_WRAPPER_CLASS.equals(cls.getSimpleName())) {
                    Field fdCoreModInstance = cls.getField(FML_CORE_MOD_INSTANCE_FIELD);
                    fdCoreModInstance.setAccessible(true);
                    Object coreMod = fdCoreModInstance.get(tweaker);
                    if (coreModName.equals(coreMod.getClass().getName())) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    @Override // org.spongepowered.asm.launch.platform.MixinPlatformAgentAbstract, org.spongepowered.asm.launch.platform.IMixinPlatformAgent
    public String getPhaseProvider() {
        return MixinPlatformAgentFMLLegacy.class.getName() + "$PhaseProvider";
    }

    @Override // org.spongepowered.asm.launch.platform.MixinPlatformAgentAbstract, org.spongepowered.asm.launch.platform.IMixinPlatformAgent
    public void prepare() {
        this.initInjectionState |= isTweakerQueued(FML_TWEAKER_INJECTION);
    }

    @Override // org.spongepowered.asm.launch.platform.MixinPlatformAgentAbstract, org.spongepowered.asm.launch.platform.IMixinPlatformAgent
    public void initPrimaryContainer() {
        if (this.clCoreModManager != null) {
            injectRemapper();
        }
    }

    private void injectRemapper() {
        try {
            MixinPlatformAgentAbstract.logger.debug("Creating FML remapper adapter: {}", new Object[]{FML_REMAPPER_ADAPTER_CLASS});
            Class<?> clFmlRemapperAdapter = Class.forName(FML_REMAPPER_ADAPTER_CLASS, true, Launch.classLoader);
            Method mdCreate = clFmlRemapperAdapter.getDeclaredMethod("create", new Class[0]);
            IRemapper remapper = (IRemapper) mdCreate.invoke(null, new Object[0]);
            MixinEnvironment.getDefaultEnvironment().getRemappers().add(remapper);
        } catch (Exception e) {
            MixinPlatformAgentAbstract.logger.debug("Failed instancing FML remapper adapter, things will probably go horribly for notch-obf'd mods!");
        }
    }

    @Override // org.spongepowered.asm.launch.platform.MixinPlatformAgentAbstract, org.spongepowered.asm.launch.platform.IMixinPlatformAgent
    public void inject() {
        if (this.coreModWrapper != null && checkForCoInitialisation()) {
            MixinPlatformAgentAbstract.logger.debug("FML agent is co-initiralising coremod instance {} for {}", new Object[]{this.coreModWrapper, this.handle});
            this.coreModWrapper.injectIntoClassLoader(Launch.classLoader);
        }
    }

    protected final boolean checkForCoInitialisation() {
        boolean injectionTweaker = isTweakerQueued(FML_TWEAKER_INJECTION);
        boolean terminalTweaker = isTweakerQueued(FML_TWEAKER_TERMINAL);
        if ((!this.initInjectionState || !terminalTweaker) && !injectionTweaker) {
            return !isTweakerQueued(FML_TWEAKER_DEOBF);
        }
        MixinPlatformAgentAbstract.logger.debug("FML agent is skipping co-init for {} because FML will inject it normally", new Object[]{this.coreModWrapper});
        return false;
    }

    private static boolean isTweakerQueued(String tweakerName) {
        for (String tweaker : (List) GlobalProperties.get(MixinServiceLaunchWrapper.BLACKBOARD_KEY_TWEAKCLASSES)) {
            if (tweaker.endsWith(tweakerName)) {
                return true;
            }
        }
        return false;
    }

    private static Class<?> getCoreModManagerClass() throws ClassNotFoundException {
        try {
            return Class.forName(GlobalProperties.getString(GlobalProperties.Keys.FML_CORE_MOD_MANAGER, CORE_MOD_MANAGER_CLASS));
        } catch (ClassNotFoundException e) {
            return Class.forName(CORE_MOD_MANAGER_CLASS_LEGACY);
        }
    }

    private static List<String> getIgnoredMods(Class<?> clCoreModManager) throws IllegalAccessException, InvocationTargetException {
        Method mdGetIgnoredMods;
        try {
            mdGetIgnoredMods = clCoreModManager.getDeclaredMethod(GlobalProperties.getString(GlobalProperties.Keys.FML_GET_IGNORED_MODS, GET_IGNORED_MODS_METHOD), new Class[0]);
        } catch (NoSuchMethodException e) {
            try {
                mdGetIgnoredMods = clCoreModManager.getDeclaredMethod(GET_IGNORED_MODS_METHOD_LEGACY, new Class[0]);
            } catch (NoSuchMethodException ex2) {
                MixinPlatformAgentAbstract.logger.catching(Level.DEBUG, ex2);
                return Collections.emptyList();
            }
        }
        return (List) mdGetIgnoredMods.invoke(null, new Object[0]);
    }

    @Override // org.spongepowered.asm.launch.platform.IMixinPlatformServiceAgent
    public void init() {
    }

    @Override // org.spongepowered.asm.launch.platform.IMixinPlatformServiceAgent
    public String getSideName() {
        List<ITweaker> tweakerList = (List) GlobalProperties.get(MixinServiceLaunchWrapper.BLACKBOARD_KEY_TWEAKS);
        if (tweakerList == null) {
            return null;
        }
        for (ITweaker tweaker : tweakerList) {
            if (tweaker.getClass().getName().endsWith(SERVER_TWEAKER_TAIL)) {
                return Constants.SIDE_SERVER;
            }
            if (tweaker.getClass().getName().endsWith(CLIENT_TWEAKER_TAIL)) {
                return Constants.SIDE_CLIENT;
            }
        }
        String name = MixinPlatformAgentAbstract.invokeStringMethod(Launch.classLoader, NEW_LAUNCH_HANDLER_CLASS, GETSIDE_METHOD);
        if (name != null) {
            return name;
        }
        return MixinPlatformAgentAbstract.invokeStringMethod(Launch.classLoader, OLD_LAUNCH_HANDLER_CLASS, GETSIDE_METHOD);
    }

    @Override // org.spongepowered.asm.launch.platform.IMixinPlatformServiceAgent
    public Collection<IContainerHandle> getMixinContainers() {
        return null;
    }

    @Override // org.spongepowered.asm.launch.platform.MixinPlatformAgentAbstract, org.spongepowered.asm.launch.platform.IMixinPlatformServiceAgent
    @Deprecated
    public void wire(MixinEnvironment.Phase phase, IConsumer<MixinEnvironment.Phase> phaseConsumer) {
        super.wire(phase, phaseConsumer);
        if (phase == MixinEnvironment.Phase.PREINIT) {
            begin(phaseConsumer);
        }
    }

    @Override // org.spongepowered.asm.launch.platform.MixinPlatformAgentAbstract, org.spongepowered.asm.launch.platform.IMixinPlatformServiceAgent
    @Deprecated
    public void unwire() {
        end();
    }

    static void begin(IConsumer<MixinEnvironment.Phase> delegate) {
        Logger logger = LogManager.getLogger("FML");
        if (!(logger instanceof Logger)) {
            return;
        }
        log = logger;
        oldLevel = log.getLevel();
        appender = new MixinAppender(delegate);
        appender.start();
        log.addAppender(appender);
        log.setLevel(Level.ALL);
    }

    static void end() {
        if (log != null) {
            log.removeAppender(appender);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/platform/MixinPlatformAgentFMLLegacy$MixinAppender.class */
    public static class MixinAppender extends AbstractAppender {
        private final IConsumer<MixinEnvironment.Phase> delegate;

        MixinAppender(IConsumer<MixinEnvironment.Phase> delegate) {
            super("MixinLogWatcherAppender", (Filter) null, (Layout) null);
            this.delegate = delegate;
        }

        public void append(LogEvent event) {
            if (event.getLevel() != Level.DEBUG || !"Validating minecraft".equals(event.getMessage().getFormattedMessage())) {
                return;
            }
            this.delegate.accept(MixinEnvironment.Phase.INIT);
            if (MixinPlatformAgentFMLLegacy.log.getLevel() == Level.ALL) {
                MixinPlatformAgentFMLLegacy.log.setLevel(MixinPlatformAgentFMLLegacy.oldLevel);
            }
        }
    }
}
