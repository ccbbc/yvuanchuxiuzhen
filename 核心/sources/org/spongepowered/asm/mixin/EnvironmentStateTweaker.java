package org.spongepowered.asm.mixin;

import java.io.File;
import java.util.List;
import net.minecraft.launchwrapper.ITweaker;
import net.minecraft.launchwrapper.LaunchClassLoader;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.MixinEnvironment;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/EnvironmentStateTweaker.class */
public class EnvironmentStateTweaker implements ITweaker {
    public void acceptOptions(List<String> args, File gameDir, File assetsDir, String profile) {
    }

    public void injectIntoClassLoader(LaunchClassLoader classLoader) {
        MixinBootstrap.getPlatform().inject();
    }

    public String getLaunchTarget() {
        return "";
    }

    public String[] getLaunchArguments() {
        MixinEnvironment.gotoPhase(MixinEnvironment.Phase.DEFAULT);
        return new String[0];
    }
}
