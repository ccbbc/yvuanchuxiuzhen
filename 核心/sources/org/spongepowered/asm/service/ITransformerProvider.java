package org.spongepowered.asm.service;

import java.util.Collection;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/ITransformerProvider.class */
public interface ITransformerProvider {
    Collection<ITransformer> getTransformers();

    Collection<ITransformer> getDelegatedTransformers();

    void addTransformerExclusion(String str);
}
