package org.spongepowered.asm.mixin.injection.modify;

import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;

@InjectionPoint.AtCode("STORE")
/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/modify/AfterStoreLocal.class */
public class AfterStoreLocal extends BeforeLoadLocal {
    public AfterStoreLocal(InjectionPointData data) {
        super(data, 54, true);
    }
}
