package org.spongepowered.asm.mixin.injection.struct;

import org.spongepowered.asm.mixin.injection.selectors.InvalidSelectorException;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/struct/TargetNotSupportedException.class */
public class TargetNotSupportedException extends InvalidSelectorException {
    private static final long serialVersionUID = 1;

    public TargetNotSupportedException(String message) {
        super(message);
    }

    public TargetNotSupportedException(Throwable cause) {
        super(cause);
    }

    public TargetNotSupportedException(String message, Throwable cause) {
        super(message, cause);
    }
}
