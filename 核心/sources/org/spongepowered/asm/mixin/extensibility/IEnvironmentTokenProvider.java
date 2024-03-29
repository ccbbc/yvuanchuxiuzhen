package org.spongepowered.asm.mixin.extensibility;

import org.spongepowered.asm.mixin.MixinEnvironment;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/extensibility/IEnvironmentTokenProvider.class */
public interface IEnvironmentTokenProvider {
    public static final int DEFAULT_PRIORITY = 1000;

    int getPriority();

    Integer getToken(String str, MixinEnvironment mixinEnvironment);
}
