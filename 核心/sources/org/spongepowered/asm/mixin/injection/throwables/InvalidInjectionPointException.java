package org.spongepowered.asm.mixin.injection.throwables;

import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.refmap.IMixinContext;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/throwables/InvalidInjectionPointException.class */
public class InvalidInjectionPointException extends InvalidInjectionException {
    private static final long serialVersionUID = 2;

    public InvalidInjectionPointException(IMixinContext context, String format, Object... args) {
        super(context, String.format(format, args));
    }

    public InvalidInjectionPointException(InjectionInfo info, String format, Object... args) {
        super(info, String.format(format, args));
    }

    public InvalidInjectionPointException(IMixinContext context, Throwable cause, String format, Object... args) {
        super(context, String.format(format, args), cause);
    }

    public InvalidInjectionPointException(InjectionInfo info, Throwable cause, String format, Object... args) {
        super(info, String.format(format, args), cause);
    }
}
