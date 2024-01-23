package org.spongepowered.asm.mixin.throwables;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/throwables/MixinPrepareError.class */
public class MixinPrepareError extends MixinError {
    private static final long serialVersionUID = 1;

    public MixinPrepareError(String message) {
        super(message);
    }

    public MixinPrepareError(Throwable cause) {
        super(cause);
    }

    public MixinPrepareError(String message, Throwable cause) {
        super(message, cause);
    }
}
