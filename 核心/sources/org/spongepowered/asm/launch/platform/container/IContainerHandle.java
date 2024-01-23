package org.spongepowered.asm.launch.platform.container;

import java.util.Collection;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/platform/container/IContainerHandle.class */
public interface IContainerHandle {
    String getAttribute(String str);

    Collection<IContainerHandle> getNestedContainers();
}
