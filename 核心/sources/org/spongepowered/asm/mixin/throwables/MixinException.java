package org.spongepowered.asm.mixin.throwables;

import org.spongepowered.asm.mixin.transformer.ActivityStack;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/throwables/MixinException.class */
public class MixinException extends RuntimeException {
    private static final long serialVersionUID = 1;
    private String activityDescriptor;

    public MixinException(String message) {
        super(message);
    }

    public MixinException(String message, ActivityStack context) {
        super(message);
        this.activityDescriptor = context != null ? context.toString() : null;
    }

    public MixinException(Throwable cause) {
        super(cause);
    }

    public MixinException(Throwable cause, ActivityStack context) {
        super(cause);
        this.activityDescriptor = context != null ? context.toString() : null;
    }

    public MixinException(String message, Throwable cause) {
        super(message, cause);
    }

    public MixinException(String message, Throwable cause, ActivityStack context) {
        super(message, cause);
        this.activityDescriptor = context != null ? context.toString() : null;
    }

    public void prepend(ActivityStack upstreamContext) {
        String strContext = upstreamContext.toString();
        this.activityDescriptor = this.activityDescriptor != null ? strContext + ActivityStack.GLUE_STRING + this.activityDescriptor : ActivityStack.GLUE_STRING + strContext;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        return this.activityDescriptor != null ? message + " [" + this.activityDescriptor + "]" : message;
    }
}
