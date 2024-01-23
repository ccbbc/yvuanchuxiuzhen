package org.spongepowered.asm.service;

import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/ISyntheticClassInfo.class */
public interface ISyntheticClassInfo {
    IMixinInfo getMixin();

    String getName();

    String getClassName();

    boolean isLoaded();
}
