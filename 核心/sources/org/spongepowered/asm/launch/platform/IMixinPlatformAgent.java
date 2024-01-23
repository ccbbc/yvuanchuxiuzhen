package org.spongepowered.asm.launch.platform;

import org.spongepowered.asm.launch.platform.container.IContainerHandle;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/platform/IMixinPlatformAgent.class */
public interface IMixinPlatformAgent {

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/platform/IMixinPlatformAgent$AcceptResult.class */
    public enum AcceptResult {
        ACCEPTED,
        REJECTED,
        INVALID
    }

    AcceptResult accept(MixinPlatformManager mixinPlatformManager, IContainerHandle iContainerHandle);

    String getPhaseProvider();

    void prepare();

    void initPrimaryContainer();

    void inject();
}
