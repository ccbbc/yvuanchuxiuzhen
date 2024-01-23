package org.spongepowered.asm.launch;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.launch.GlobalProperties;
import org.spongepowered.asm.launch.platform.CommandLineOptions;
import org.spongepowered.asm.launch.platform.MixinPlatformManager;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.service.MixinService;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/MixinBootstrap.class */
public abstract class MixinBootstrap {
    public static final String VERSION = "0.8.2";
    private static final Logger logger = LogManager.getLogger(MixinLaunchPlugin.NAME);
    private static boolean initialised = false;
    private static boolean initState = true;
    private static MixinPlatformManager platform;

    static {
        MixinService.boot();
        MixinService.getService().prepare();
    }

    private MixinBootstrap() {
    }

    @Deprecated
    public static void addProxy() {
        MixinService.getService().beginPhase();
    }

    public static MixinPlatformManager getPlatform() {
        if (platform == null) {
            Object globalPlatformManager = GlobalProperties.get(GlobalProperties.Keys.PLATFORM_MANAGER);
            if (globalPlatformManager instanceof MixinPlatformManager) {
                platform = (MixinPlatformManager) globalPlatformManager;
            } else {
                platform = new MixinPlatformManager();
                GlobalProperties.put(GlobalProperties.Keys.PLATFORM_MANAGER, platform);
                platform.init();
            }
        }
        return platform;
    }

    public static void init() {
        if (!start()) {
            return;
        }
        doInit(CommandLineOptions.defaultArgs());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean start() {
        if (isSubsystemRegistered()) {
            if (!checkSubsystemVersion()) {
                throw new MixinInitialisationError("Mixin subsystem version " + getActiveSubsystemVersion() + " was already initialised. Cannot bootstrap version " + VERSION);
            }
            return false;
        }
        registerSubsystem(VERSION);
        if (!initialised) {
            initialised = true;
            MixinEnvironment.Phase initialPhase = MixinService.getService().getInitialPhase();
            if (initialPhase == MixinEnvironment.Phase.DEFAULT) {
                logger.error("Initialising mixin subsystem after game pre-init phase! Some mixins may be skipped.");
                MixinEnvironment.init(initialPhase);
                getPlatform().prepare(CommandLineOptions.defaultArgs());
                initState = false;
            } else {
                MixinEnvironment.init(initialPhase);
            }
            MixinService.getService().beginPhase();
        }
        getPlatform();
        return true;
    }

    @Deprecated
    static void doInit(List<String> args) {
        doInit(CommandLineOptions.ofArgs(args));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void doInit(CommandLineOptions args) {
        if (!initialised) {
            if (isSubsystemRegistered()) {
                logger.warn("Multiple Mixin containers present, init suppressed for 0.8.2");
                return;
            }
            throw new IllegalStateException("MixinBootstrap.doInit() called before MixinBootstrap.start()");
        }
        getPlatform().getPhaseProviderClasses();
        if (initState) {
            getPlatform().prepare(args);
            MixinService.getService().init();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void inject() {
        getPlatform().inject();
    }

    private static boolean isSubsystemRegistered() {
        return GlobalProperties.get(GlobalProperties.Keys.INIT) != null;
    }

    private static boolean checkSubsystemVersion() {
        return VERSION.equals(getActiveSubsystemVersion());
    }

    private static Object getActiveSubsystemVersion() {
        Object version = GlobalProperties.get(GlobalProperties.Keys.INIT);
        return version != null ? version : "";
    }

    private static void registerSubsystem(String version) {
        GlobalProperties.put(GlobalProperties.Keys.INIT, version);
    }
}
