package org.spongepowered.asm.mixin.extensibility;

import java.util.Set;
import org.spongepowered.asm.mixin.MixinEnvironment;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/extensibility/IMixinConfig.class */
public interface IMixinConfig {
    public static final int DEFAULT_PRIORITY = 1000;

    MixinEnvironment getEnvironment();

    String getName();

    String getMixinPackage();

    int getPriority();

    IMixinConfigPlugin getPlugin();

    boolean isRequired();

    Set<String> getTargets();
}
