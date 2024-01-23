package org.spongepowered.asm.mixin.injection.struct;

import org.spongepowered.asm.mixin.injection.selectors.InvalidSelectorException;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/struct/InvalidMemberDescriptorException.class */
public class InvalidMemberDescriptorException extends InvalidSelectorException {
    private static final long serialVersionUID = 1;

    public InvalidMemberDescriptorException(String message) {
        super(message);
    }

    public InvalidMemberDescriptorException(Throwable cause) {
        super(cause);
    }

    public InvalidMemberDescriptorException(String message, Throwable cause) {
        super(message, cause);
    }
}
