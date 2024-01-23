package org.spongepowered.asm.launch.platform;

import cpw.mods.modlauncher.Environment;
import cpw.mods.modlauncher.Launcher;
import cpw.mods.modlauncher.api.IEnvironment;
import cpw.mods.modlauncher.api.TypesafeMap;
import java.util.Collection;
import java.util.Locale;
import org.spongepowered.asm.launch.platform.IMixinPlatformAgent;
import org.spongepowered.asm.launch.platform.container.IContainerHandle;
import org.spongepowered.asm.util.Constants;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/platform/MixinPlatformAgentMinecraftForge.class */
public class MixinPlatformAgentMinecraftForge extends MixinPlatformAgentAbstract implements IMixinPlatformServiceAgent {
    @Override // org.spongepowered.asm.launch.platform.IMixinPlatformServiceAgent
    public void init() {
    }

    @Override // org.spongepowered.asm.launch.platform.MixinPlatformAgentAbstract, org.spongepowered.asm.launch.platform.IMixinPlatformAgent
    public IMixinPlatformAgent.AcceptResult accept(MixinPlatformManager manager, IContainerHandle handle) {
        return IMixinPlatformAgent.AcceptResult.REJECTED;
    }

    @Override // org.spongepowered.asm.launch.platform.IMixinPlatformServiceAgent
    public String getSideName() {
        Environment environment = Launcher.INSTANCE.environment();
        String launchTarget = ((String) environment.getProperty((TypesafeMap.Key) IEnvironment.Keys.LAUNCHTARGET.get()).orElse("missing")).toLowerCase(Locale.ROOT);
        if (launchTarget.contains("server")) {
            return Constants.SIDE_SERVER;
        }
        if (launchTarget.contains("client")) {
            return Constants.SIDE_CLIENT;
        }
        return null;
    }

    @Override // org.spongepowered.asm.launch.platform.IMixinPlatformServiceAgent
    public Collection<IContainerHandle> getMixinContainers() {
        return null;
    }
}
