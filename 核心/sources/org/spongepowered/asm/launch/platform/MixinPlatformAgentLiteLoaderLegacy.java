package org.spongepowered.asm.launch.platform;

import java.util.Collection;
import net.minecraft.launchwrapper.Launch;
import org.spongepowered.asm.launch.platform.IMixinPlatformAgent;
import org.spongepowered.asm.launch.platform.container.IContainerHandle;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/platform/MixinPlatformAgentLiteLoaderLegacy.class */
public class MixinPlatformAgentLiteLoaderLegacy extends MixinPlatformAgentAbstract implements IMixinPlatformServiceAgent {
    private static final String GETSIDE_METHOD = "getEnvironmentType";
    private static final String LITELOADER_TWEAKER_NAME = "com.mumfrey.liteloader.launch.LiteLoaderTweaker";

    @Override // org.spongepowered.asm.launch.platform.MixinPlatformAgentAbstract, org.spongepowered.asm.launch.platform.IMixinPlatformAgent
    public IMixinPlatformAgent.AcceptResult accept(MixinPlatformManager manager, IContainerHandle handle) {
        return IMixinPlatformAgent.AcceptResult.REJECTED;
    }

    @Override // org.spongepowered.asm.launch.platform.IMixinPlatformServiceAgent
    public String getSideName() {
        return MixinPlatformAgentAbstract.invokeStringMethod(Launch.classLoader, LITELOADER_TWEAKER_NAME, GETSIDE_METHOD);
    }

    @Override // org.spongepowered.asm.launch.platform.IMixinPlatformServiceAgent
    public void init() {
    }

    @Override // org.spongepowered.asm.launch.platform.IMixinPlatformServiceAgent
    public Collection<IContainerHandle> getMixinContainers() {
        return null;
    }
}
