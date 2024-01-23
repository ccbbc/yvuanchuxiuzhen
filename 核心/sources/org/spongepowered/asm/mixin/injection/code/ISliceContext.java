package org.spongepowered.asm.mixin.injection.code;

import org.spongepowered.asm.mixin.injection.IInjectionPointContext;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/code/ISliceContext.class */
public interface ISliceContext extends IInjectionPointContext {
    MethodSlice getSlice(String str);
}
