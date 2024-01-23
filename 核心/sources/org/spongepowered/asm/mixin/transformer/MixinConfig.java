package org.spongepowered.asm.mixin.transformer;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.spongepowered.asm.launch.MixinInitialisationError;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.extensibility.IMixinConfig;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.refmap.IReferenceMapper;
import org.spongepowered.asm.mixin.refmap.ReferenceMapper;
import org.spongepowered.asm.mixin.refmap.RemappingReferenceMapper;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.service.IMixinService;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.VersionNumber;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/MixinConfig.class */
public final class MixinConfig implements Comparable<MixinConfig>, IMixinConfig {
    private static int configOrder = 0;
    private static final Set<String> globalMixinList = new HashSet();
    private transient Config handle;
    private transient MixinConfig parent;
    @SerializedName("parent")
    private String parentName;
    @SerializedName("target")
    private String selector;
    @SerializedName("minVersion")
    private String version;
    @SerializedName("compatibilityLevel")
    private String compatibility;
    @SerializedName("required")
    private Boolean requiredValue;
    private transient boolean required;
    @SerializedName("package")
    private String mixinPackage;
    @SerializedName("mixins")
    private List<String> mixinClasses;
    @SerializedName("client")
    private List<String> mixinClassesClient;
    @SerializedName("server")
    private List<String> mixinClassesServer;
    @SerializedName("refmap")
    private String refMapperConfig;
    @SerializedName("verbose")
    private boolean verboseLogging;
    private final transient int order;
    private final transient List<IListener> listeners;
    private transient IMixinService service;
    private transient MixinEnvironment env;
    private transient String name;
    @SerializedName("plugin")
    private String pluginClassName;
    @SerializedName("injectors")
    private InjectorOptions injectorOptions;
    @SerializedName("overwrites")
    private OverwriteOptions overwriteOptions;
    private transient PluginHandle plugin;
    private transient IReferenceMapper refMapper;
    private transient boolean initialised;
    private transient boolean prepared;
    private transient boolean visited;
    private final Logger logger = LogManager.getLogger(MixinLaunchPlugin.NAME);
    private final transient Map<String, List<MixinInfo>> mixinMapping = new HashMap();
    private final transient Set<String> unhandledTargets = new HashSet();
    private final transient List<MixinInfo> pendingMixins = new ArrayList();
    private final transient List<MixinInfo> mixins = new ArrayList();
    @SerializedName("priority")
    private int priority = -1;
    @SerializedName("mixinPriority")
    private int mixinPriority = -1;
    @SerializedName("setSourceFile")
    private boolean setSourceFile = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/MixinConfig$IListener.class */
    public interface IListener {
        void onPrepare(MixinInfo mixinInfo);

        void onInit(MixinInfo mixinInfo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/MixinConfig$InjectorOptions.class */
    public static class InjectorOptions {
        @SerializedName("injectionPoints")
        List<String> injectionPoints;
        @SerializedName("defaultRequire")
        int defaultRequireValue = 0;
        @SerializedName("defaultGroup")
        String defaultGroup = "default";
        @SerializedName("maxShiftBy")
        int maxShiftBy = 0;

        InjectorOptions() {
        }

        void mergeFrom(InjectorOptions parent) {
            if (this.defaultRequireValue == 0) {
                this.defaultRequireValue = parent.defaultRequireValue;
            }
            if ("default".equals(this.defaultGroup)) {
                this.defaultGroup = parent.defaultGroup;
            }
            if (this.maxShiftBy == 0) {
                this.maxShiftBy = parent.maxShiftBy;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/MixinConfig$OverwriteOptions.class */
    public static class OverwriteOptions {
        @SerializedName("conformVisibility")
        boolean conformAccessModifiers;
        @SerializedName("requireAnnotations")
        boolean requireOverwriteAnnotations;

        OverwriteOptions() {
        }

        void mergeFrom(OverwriteOptions parent) {
            this.conformAccessModifiers |= parent.conformAccessModifiers;
            this.requireOverwriteAnnotations |= parent.requireOverwriteAnnotations;
        }
    }

    private MixinConfig() {
        int i = configOrder;
        configOrder = i + 1;
        this.order = i;
        this.listeners = new ArrayList();
        this.initialised = false;
        this.prepared = false;
        this.visited = false;
    }

    private boolean onLoad(IMixinService service, String name, MixinEnvironment fallbackEnvironment) {
        this.service = service;
        this.name = name;
        if (!Strings.isNullOrEmpty(this.parentName)) {
            return true;
        }
        this.env = parseSelector(this.selector, fallbackEnvironment);
        this.required = (this.requiredValue == null || !this.requiredValue.booleanValue() || this.env.getOption(MixinEnvironment.Option.IGNORE_REQUIRED)) ? false : true;
        initPriority(1000, 1000);
        if (this.injectorOptions == null) {
            this.injectorOptions = new InjectorOptions();
        }
        if (this.overwriteOptions == null) {
            this.overwriteOptions = new OverwriteOptions();
        }
        return postInit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getParentName() {
        return this.parentName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean assignParent(Config parentConfig) {
        boolean z;
        if (this.parent != null) {
            throw new MixinInitialisationError("Mixin config " + this.name + " was already initialised");
        }
        if (parentConfig.get() == this) {
            throw new MixinInitialisationError("Mixin config " + this.name + " cannot be its own parent");
        }
        this.parent = parentConfig.get();
        if (!this.parent.initialised) {
            throw new MixinInitialisationError("Mixin config " + this.name + " attempted to assign uninitialised parent config. This probably means that there is an indirect loop in the mixin configs: child -> parent -> child");
        }
        this.env = parseSelector(this.selector, this.parent.env);
        if (this.requiredValue == null) {
            z = this.parent.required;
        } else {
            z = this.requiredValue.booleanValue() && !this.env.getOption(MixinEnvironment.Option.IGNORE_REQUIRED);
        }
        this.required = z;
        initPriority(this.parent.priority, this.parent.mixinPriority);
        if (this.injectorOptions == null) {
            this.injectorOptions = this.parent.injectorOptions;
        } else {
            this.injectorOptions.mergeFrom(this.parent.injectorOptions);
        }
        if (this.overwriteOptions == null) {
            this.overwriteOptions = this.parent.overwriteOptions;
        } else {
            this.overwriteOptions.mergeFrom(this.parent.overwriteOptions);
        }
        this.setSourceFile |= this.parent.setSourceFile;
        this.verboseLogging |= this.parent.verboseLogging;
        return postInit();
    }

    private void initPriority(int defaultPriority, int defaultMixinPriority) {
        if (this.priority < 0) {
            this.priority = defaultPriority;
        }
        if (this.mixinPriority < 0) {
            this.mixinPriority = defaultMixinPriority;
        }
    }

    private boolean postInit() throws MixinInitialisationError {
        if (this.initialised) {
            throw new MixinInitialisationError("Mixin config " + this.name + " was already initialised.");
        }
        this.initialised = true;
        initCompatibilityLevel();
        initInjectionPoints();
        return checkVersion();
    }

    private void initCompatibilityLevel() {
        MixinEnvironment.CompatibilityLevel level;
        MixinEnvironment.CompatibilityLevel current;
        if (this.compatibility == null || (level = MixinEnvironment.CompatibilityLevel.valueOf(this.compatibility.trim().toUpperCase(Locale.ROOT))) == (current = MixinEnvironment.getCompatibilityLevel())) {
            return;
        }
        if (current.isAtLeast(level) && !current.canSupport(level)) {
            throw new MixinInitialisationError("Mixin config " + this.name + " requires compatibility level " + level + " which is too old");
        }
        if (!current.canElevateTo(level)) {
            throw new MixinInitialisationError("Mixin config " + this.name + " requires compatibility level " + level + " which is prohibited by " + current);
        }
        MixinEnvironment.setCompatibilityLevel(level);
    }

    private MixinEnvironment parseSelector(String target, MixinEnvironment fallbackEnvironment) {
        if (target != null) {
            String[] selectors = target.split("[&\\| ]");
            for (String sel : selectors) {
                String sel2 = sel.trim();
                Pattern environmentSelector = Pattern.compile("^@env(?:ironment)?\\(([A-Z]+)\\)$");
                Matcher environmentSelectorMatcher = environmentSelector.matcher(sel2);
                if (environmentSelectorMatcher.matches()) {
                    return MixinEnvironment.getEnvironment(MixinEnvironment.Phase.forName(environmentSelectorMatcher.group(1)));
                }
            }
            MixinEnvironment.Phase phase = MixinEnvironment.Phase.forName(target);
            if (phase != null) {
                return MixinEnvironment.getEnvironment(phase);
            }
        }
        return fallbackEnvironment;
    }

    private void initInjectionPoints() {
        if (this.injectorOptions.injectionPoints == null) {
            return;
        }
        for (String injectionPointClassName : this.injectorOptions.injectionPoints) {
            initInjectionPoint(injectionPointClassName);
        }
    }

    public void initInjectionPoint(String className) {
        try {
            try {
                Class<?> injectionPointClass = this.service.getClassProvider().findClass(className, true);
                if (!InjectionPoint.class.isAssignableFrom(injectionPointClass)) {
                    this.logger.error("Unable to register injection point {} for {}, class must extend InjectionPoint", new Object[]{className, this});
                    return;
                }
                try {
                    injectionPointClass.getDeclaredMethod("find", String.class, InsnList.class, Collection.class);
                    InjectionPoint.register(injectionPointClass);
                } catch (NoSuchMethodException cnfe) {
                    this.logger.error("Unable to register injection point {} for {}, the class is not compatible with this version of Mixin", new Object[]{className, this, cnfe});
                }
            } catch (ClassNotFoundException cnfe2) {
                this.logger.error("Unable to register injection point {} for {}, the specified class was not found", new Object[]{className, this, cnfe2});
            }
        } catch (Throwable th) {
            this.logger.catching(th);
        }
    }

    private boolean checkVersion() throws MixinInitialisationError {
        if (this.version == null) {
            if (this.parent != null && this.parent.version != null) {
                return true;
            }
            this.logger.error("Mixin config {} does not specify \"minVersion\" property", new Object[]{this.name});
        }
        VersionNumber minVersion = VersionNumber.parse(this.version);
        VersionNumber curVersion = VersionNumber.parse(this.env.getVersion());
        if (minVersion.compareTo(curVersion) > 0) {
            this.logger.warn("Mixin config {} requires mixin subsystem version {} but {} was found. The mixin config will not be applied.", new Object[]{this.name, minVersion, curVersion});
            if (this.required) {
                throw new MixinInitialisationError("Required mixin config " + this.name + " requires mixin subsystem version " + minVersion);
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addListener(IListener listener) {
        this.listeners.add(listener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onSelect() {
        this.plugin = new PluginHandle(this, this.service, this.pluginClassName);
        this.plugin.onLoad(this.mixinPackage);
        if (!this.mixinPackage.endsWith(".")) {
            this.mixinPackage += ".";
        }
        boolean suppressRefMapWarning = false;
        if (this.refMapperConfig == null) {
            this.refMapperConfig = this.plugin.getRefMapperConfig();
            if (this.refMapperConfig == null) {
                suppressRefMapWarning = true;
                this.refMapperConfig = ReferenceMapper.DEFAULT_RESOURCE;
            }
        }
        this.refMapper = ReferenceMapper.read(this.refMapperConfig);
        this.verboseLogging |= this.env.getOption(MixinEnvironment.Option.DEBUG_VERBOSE);
        if (!suppressRefMapWarning && this.refMapper.isDefault() && !this.env.getOption(MixinEnvironment.Option.DISABLE_REFMAP)) {
            this.logger.warn("Reference map '{}' for {} could not be read. If this is a development environment you can ignore this message", new Object[]{this.refMapperConfig, this});
        }
        if (this.env.getOption(MixinEnvironment.Option.REFMAP_REMAP)) {
            this.refMapper = RemappingReferenceMapper.of(this.env, this.refMapper);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void prepare() {
        if (this.prepared) {
            return;
        }
        this.prepared = true;
        prepareMixins(this.mixinClasses, false);
        switch (this.env.getSide()) {
            case CLIENT:
                prepareMixins(this.mixinClassesClient, false);
                return;
            case SERVER:
                prepareMixins(this.mixinClassesServer, false);
                return;
            case UNKNOWN:
            default:
                this.logger.warn("Mixin environment was unable to detect the current side, sided mixins will not be applied");
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void postInitialise() {
        if (this.plugin != null) {
            List<String> pluginMixins = this.plugin.getMixins();
            prepareMixins(pluginMixins, true);
        }
        Iterator<MixinInfo> iter = this.mixins.iterator();
        while (iter.hasNext()) {
            MixinInfo mixin = iter.next();
            try {
                mixin.validate();
                for (IListener listener : this.listeners) {
                    listener.onInit(mixin);
                }
            } catch (InvalidMixinException ex) {
                this.logger.error(ex.getMixin() + ": " + ex.getMessage(), ex);
                removeMixin(mixin);
                iter.remove();
            } catch (Exception ex2) {
                this.logger.error(ex2.getMessage(), ex2);
                removeMixin(mixin);
                iter.remove();
            }
        }
    }

    private void removeMixin(MixinInfo remove) {
        for (List<MixinInfo> mixinsFor : this.mixinMapping.values()) {
            Iterator<MixinInfo> iter = mixinsFor.iterator();
            while (iter.hasNext()) {
                if (remove == iter.next()) {
                    iter.remove();
                }
            }
        }
    }

    private void prepareMixins(List<String> mixinClasses, boolean ignorePlugin) {
        if (mixinClasses == null) {
            return;
        }
        for (String mixinClass : mixinClasses) {
            String fqMixinClass = this.mixinPackage + mixinClass;
            if (mixinClass != null && !globalMixinList.contains(fqMixinClass)) {
                MixinInfo mixin = null;
                try {
                    List<MixinInfo> list = this.pendingMixins;
                    MixinInfo mixinInfo = new MixinInfo(this.service, this, mixinClass, this.plugin, ignorePlugin);
                    mixin = mixinInfo;
                    list.add(mixinInfo);
                    globalMixinList.add(fqMixinClass);
                } catch (InvalidMixinException ex) {
                    if (this.required) {
                        throw ex;
                    }
                    this.logger.error(ex.getMessage(), ex);
                } catch (Exception ex2) {
                    if (this.required) {
                        throw new InvalidMixinException(mixin, "Error initialising mixin " + mixin + " - " + ex2.getClass() + ": " + ex2.getMessage(), ex2);
                    }
                    this.logger.error(ex2.getMessage(), ex2);
                }
            }
        }
        for (MixinInfo mixin2 : this.pendingMixins) {
            try {
                mixin2.parseTargets();
                if (mixin2.getTargetClasses().size() > 0) {
                    for (String targetClass : mixin2.getTargetClasses()) {
                        String targetClassName = targetClass.replace('/', '.');
                        mixinsFor(targetClassName).add(mixin2);
                        this.unhandledTargets.add(targetClassName);
                    }
                    for (IListener listener : this.listeners) {
                        listener.onPrepare(mixin2);
                    }
                    this.mixins.add(mixin2);
                }
            } catch (InvalidMixinException ex3) {
                if (this.required) {
                    throw ex3;
                }
                this.logger.error(ex3.getMessage(), ex3);
            } catch (Exception ex4) {
                if (this.required) {
                    throw new InvalidMixinException(mixin2, "Error initialising mixin " + mixin2 + " - " + ex4.getClass() + ": " + ex4.getMessage(), ex4);
                }
                this.logger.error(ex4.getMessage(), ex4);
            }
        }
        this.pendingMixins.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void postApply(String transformedName, ClassNode targetClass) {
        this.unhandledTargets.remove(transformedName);
    }

    public Config getHandle() {
        if (this.handle == null) {
            this.handle = new Config(this);
        }
        return this.handle;
    }

    @Override // org.spongepowered.asm.mixin.extensibility.IMixinConfig
    public boolean isRequired() {
        return this.required;
    }

    @Override // org.spongepowered.asm.mixin.extensibility.IMixinConfig
    public MixinEnvironment getEnvironment() {
        return this.env;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MixinConfig getParent() {
        return this.parent;
    }

    @Override // org.spongepowered.asm.mixin.extensibility.IMixinConfig
    public String getName() {
        return this.name;
    }

    @Override // org.spongepowered.asm.mixin.extensibility.IMixinConfig
    public String getMixinPackage() {
        return this.mixinPackage;
    }

    @Override // org.spongepowered.asm.mixin.extensibility.IMixinConfig
    public int getPriority() {
        return this.priority;
    }

    public int getDefaultMixinPriority() {
        return this.mixinPriority;
    }

    public int getDefaultRequiredInjections() {
        return this.injectorOptions.defaultRequireValue;
    }

    public String getDefaultInjectorGroup() {
        String defaultGroup = this.injectorOptions.defaultGroup;
        return (defaultGroup == null || defaultGroup.isEmpty()) ? "default" : defaultGroup;
    }

    public boolean conformOverwriteVisibility() {
        return this.overwriteOptions.conformAccessModifiers;
    }

    public boolean requireOverwriteAnnotations() {
        return this.overwriteOptions.requireOverwriteAnnotations;
    }

    public int getMaxShiftByValue() {
        return Math.min(Math.max(this.injectorOptions.maxShiftBy, 0), 5);
    }

    public boolean select(MixinEnvironment environment) {
        this.visited = true;
        return this.env == environment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isVisited() {
        return this.visited;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getDeclaredMixinCount() {
        return getCollectionSize(this.mixinClasses, this.mixinClassesClient, this.mixinClassesServer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMixinCount() {
        return this.mixins.size();
    }

    public List<String> getClasses() {
        List<String>[] listArr;
        ImmutableList.Builder<String> list = ImmutableList.builder();
        for (List<String> classes : new List[]{this.mixinClasses, this.mixinClassesClient, this.mixinClassesServer}) {
            if (classes != null) {
                for (String className : classes) {
                    list.add(this.mixinPackage + className);
                }
            }
        }
        return list.build();
    }

    public boolean shouldSetSourceFile() {
        return this.setSourceFile;
    }

    public IReferenceMapper getReferenceMapper() {
        if (this.env.getOption(MixinEnvironment.Option.DISABLE_REFMAP)) {
            return ReferenceMapper.DEFAULT_MAPPER;
        }
        this.refMapper.setContext(this.env.getRefmapObfuscationContext());
        return this.refMapper;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String remapClassName(String className, String reference) {
        return getReferenceMapper().remap(className, reference);
    }

    @Override // org.spongepowered.asm.mixin.extensibility.IMixinConfig
    public IMixinConfigPlugin getPlugin() {
        return this.plugin.get();
    }

    @Override // org.spongepowered.asm.mixin.extensibility.IMixinConfig
    public Set<String> getTargets() {
        return Collections.unmodifiableSet(this.mixinMapping.keySet());
    }

    public Set<String> getUnhandledTargets() {
        return Collections.unmodifiableSet(this.unhandledTargets);
    }

    public Level getLoggingLevel() {
        return this.verboseLogging ? Level.INFO : Level.DEBUG;
    }

    public boolean packageMatch(String className) {
        return className.startsWith(this.mixinPackage);
    }

    public boolean hasMixinsFor(String targetClass) {
        return this.mixinMapping.containsKey(targetClass);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasPendingMixinsFor(String targetClass) {
        if (packageMatch(targetClass)) {
            return false;
        }
        for (MixinInfo pendingMixin : this.pendingMixins) {
            if (pendingMixin.hasDeclaredTarget(targetClass)) {
                return true;
            }
        }
        return false;
    }

    public List<MixinInfo> getMixinsFor(String targetClass) {
        return mixinsFor(targetClass);
    }

    private List<MixinInfo> mixinsFor(String targetClass) {
        List<MixinInfo> mixins = this.mixinMapping.get(targetClass);
        if (mixins == null) {
            mixins = new ArrayList<>();
            this.mixinMapping.put(targetClass, mixins);
        }
        return mixins;
    }

    public List<String> reloadMixin(String mixinClass, ClassNode classNode) {
        for (MixinInfo mixin : this.mixins) {
            if (mixin.getClassName().equals(mixinClass)) {
                mixin.reloadMixin(classNode);
                return mixin.getTargetClasses();
            }
        }
        return Collections.emptyList();
    }

    public String toString() {
        return this.name;
    }

    @Override // java.lang.Comparable
    public int compareTo(MixinConfig other) {
        if (other == null) {
            return 0;
        }
        if (other.priority == this.priority) {
            return this.order - other.order;
        }
        return this.priority - other.priority;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Config create(String configFile, MixinEnvironment outer) {
        try {
            IMixinService service = MixinService.getService();
            InputStream resource = service.getResourceAsStream(configFile);
            if (resource == null) {
                throw new IllegalArgumentException(String.format("The specified resource '%s' was invalid or could not be read", configFile));
            }
            MixinConfig config = (MixinConfig) new Gson().fromJson(new InputStreamReader(resource), MixinConfig.class);
            if (config.onLoad(service, configFile, outer)) {
                return config.getHandle();
            }
            return null;
        } catch (IllegalArgumentException ex) {
            throw ex;
        } catch (Exception ex2) {
            throw new IllegalArgumentException(String.format("The specified resource '%s' was invalid or could not be read", configFile), ex2);
        }
    }

    private static int getCollectionSize(Collection<?>... collections) {
        int total = 0;
        for (Collection<?> collection : collections) {
            if (collection != null) {
                total += collection.size();
            }
        }
        return total;
    }
}
