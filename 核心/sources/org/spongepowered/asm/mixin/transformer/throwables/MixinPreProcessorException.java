package org.spongepowered.asm.mixin.transformer.throwables;

import org.spongepowered.asm.mixin.throwables.MixinException;
import org.spongepowered.asm.mixin.transformer.ActivityStack;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/throwables/MixinPreProcessorException.class */
public class MixinPreProcessorException extends MixinException {
    private static final long serialVersionUID = 1;

    public MixinPreProcessorException(String message, ActivityStack context) {
        super(message, context);
    }

    public MixinPreProcessorException(String message, Throwable cause, ActivityStack context) {
        super(message, cause, context);
    }
}
