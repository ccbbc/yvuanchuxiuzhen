package org.spongepowered.asm.mixin.throwables;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/throwables/MixinApplyError.class */
public class MixinApplyError extends MixinError {
    private static final long serialVersionUID = 1;

    public MixinApplyError(String message) {
        super(message);
    }

    public MixinApplyError(Throwable cause) {
        super(cause);
    }

    public MixinApplyError(String message, Throwable cause) {
        super(message, cause);
    }
}
