package org.spongepowered.asm.mixin.injection.selectors;

import org.spongepowered.asm.mixin.throwables.MixinException;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/selectors/InvalidSelectorException.class */
public class InvalidSelectorException extends MixinException {
    private static final long serialVersionUID = 1;

    public InvalidSelectorException(String message) {
        super(message);
    }

    public InvalidSelectorException(Throwable cause) {
        super(cause);
    }

    public InvalidSelectorException(String message, Throwable cause) {
        super(message, cause);
    }
}
