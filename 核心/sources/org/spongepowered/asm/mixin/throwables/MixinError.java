package org.spongepowered.asm.mixin.throwables;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/throwables/MixinError.class */
public class MixinError extends Error {
    private static final long serialVersionUID = 1;

    public MixinError() {
    }

    public MixinError(String message) {
        super(message);
    }

    public MixinError(Throwable cause) {
        super(cause);
    }

    public MixinError(String message, Throwable cause) {
        super(message, cause);
    }
}
