package org.spongepowered.asm.launch;

import org.spongepowered.asm.mixin.throwables.MixinError;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/MixinInitialisationError.class */
public class MixinInitialisationError extends MixinError {
    private static final long serialVersionUID = 1;

    public MixinInitialisationError() {
    }

    public MixinInitialisationError(String message) {
        super(message);
    }

    public MixinInitialisationError(Throwable cause) {
        super(cause);
    }

    public MixinInitialisationError(String message, Throwable cause) {
        super(message, cause);
    }
}
