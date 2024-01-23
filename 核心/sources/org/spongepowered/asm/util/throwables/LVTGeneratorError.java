package org.spongepowered.asm.util.throwables;

import org.spongepowered.asm.mixin.throwables.MixinError;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/util/throwables/LVTGeneratorError.class */
public class LVTGeneratorError extends MixinError {
    private static final long serialVersionUID = 1;

    public LVTGeneratorError(String message) {
        super(message);
    }

    public LVTGeneratorError(String message, Throwable cause) {
        super(message, cause);
    }
}
