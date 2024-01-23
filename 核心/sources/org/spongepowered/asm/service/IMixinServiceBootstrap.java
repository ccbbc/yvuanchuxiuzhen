package org.spongepowered.asm.service;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/IMixinServiceBootstrap.class */
public interface IMixinServiceBootstrap {
    String getName();

    String getServiceClassName();

    void bootstrap();
}
