package org.spongepowered.asm.service.mojang;

import javax.annotation.Resource;
import net.minecraft.launchwrapper.IClassTransformer;
import org.spongepowered.asm.service.ILegacyClassTransformer;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/mojang/LegacyTransformerHandle.class */
class LegacyTransformerHandle implements ILegacyClassTransformer {
    private final IClassTransformer transformer;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LegacyTransformerHandle(IClassTransformer transformer) {
        this.transformer = transformer;
    }

    @Override // org.spongepowered.asm.service.ITransformer
    public String getName() {
        return this.transformer.getClass().getName();
    }

    @Override // org.spongepowered.asm.service.ITransformer
    public boolean isDelegationExcluded() {
        return this.transformer.getClass().getAnnotation(Resource.class) != null;
    }

    @Override // org.spongepowered.asm.service.ILegacyClassTransformer, org.spongepowered.asm.mixin.transformer.IMixinTransformer
    public byte[] transformClassBytes(String name, String transformedName, byte[] basicClass) {
        return this.transformer.transform(name, transformedName, basicClass);
    }
}
