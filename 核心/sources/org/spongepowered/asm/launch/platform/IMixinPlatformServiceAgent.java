package org.spongepowered.asm.launch.platform;

import java.util.Collection;
import org.spongepowered.asm.launch.platform.container.IContainerHandle;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.util.IConsumer;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/platform/IMixinPlatformServiceAgent.class */
public interface IMixinPlatformServiceAgent extends IMixinPlatformAgent {
    void init();

    String getSideName();

    Collection<IContainerHandle> getMixinContainers();

    @Deprecated
    void wire(MixinEnvironment.Phase phase, IConsumer<MixinEnvironment.Phase> iConsumer);

    @Deprecated
    void unwire();
}
