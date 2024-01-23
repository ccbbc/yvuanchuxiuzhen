package org.spongepowered.asm.mixin.injection.throwables;

import org.spongepowered.asm.mixin.injection.struct.InjectorGroupInfo;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/throwables/InjectionValidationException.class */
public class InjectionValidationException extends Exception {
    private static final long serialVersionUID = 1;
    private final InjectorGroupInfo group;

    public InjectionValidationException(InjectorGroupInfo group, String message) {
        super(message);
        this.group = group;
    }

    public InjectorGroupInfo getGroup() {
        return this.group;
    }
}
