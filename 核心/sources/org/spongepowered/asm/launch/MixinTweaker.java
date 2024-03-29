package org.spongepowered.asm.launch;

import java.io.File;
import java.util.List;
import net.minecraft.launchwrapper.ITweaker;
import net.minecraft.launchwrapper.LaunchClassLoader;
import org.spongepowered.asm.launch.platform.CommandLineOptions;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/MixinTweaker.class */
public class MixinTweaker implements ITweaker {
    public MixinTweaker() {
        MixinBootstrap.start();
    }

    public final void acceptOptions(List<String> args, File gameDir, File assetsDir, String profile) {
        MixinBootstrap.doInit(CommandLineOptions.ofArgs(args));
    }

    public final void injectIntoClassLoader(LaunchClassLoader classLoader) {
        MixinBootstrap.inject();
    }

    public String getLaunchTarget() {
        return MixinBootstrap.getPlatform().getLaunchTarget();
    }

    public String[] getLaunchArguments() {
        return new String[0];
    }
}
