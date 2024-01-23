package org.spongepowered.asm.mixin.injection.throwables;

import org.spongepowered.asm.mixin.throwables.MixinError;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/throwables/InjectionError.class */
public class InjectionError extends MixinError {
    private static final long serialVersionUID = 1;

    public InjectionError() {
    }

    public InjectionError(String message) {
        super(message);
    }

    public InjectionError(Throwable cause) {
        super(cause);
    }

    public InjectionError(String message, Throwable cause) {
        super(message, cause);
    }
}
