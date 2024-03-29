package org.spongepowered.asm.mixin.injection.callback;

import org.objectweb.asm.Type;
import org.spongepowered.asm.util.Constants;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/callback/CallbackInfo.class */
public class CallbackInfo implements Cancellable {
    private final String name;
    private final boolean cancellable;
    private boolean cancelled;

    public CallbackInfo(String name, boolean cancellable) {
        this.name = name;
        this.cancellable = cancellable;
    }

    public String getId() {
        return this.name;
    }

    public String toString() {
        return String.format("CallbackInfo[TYPE=%s,NAME=%s,CANCELLABLE=%s]", getClass().getSimpleName(), this.name, Boolean.valueOf(this.cancellable));
    }

    @Override // org.spongepowered.asm.mixin.injection.callback.Cancellable
    public final boolean isCancellable() {
        return this.cancellable;
    }

    @Override // org.spongepowered.asm.mixin.injection.callback.Cancellable
    public final boolean isCancelled() {
        return this.cancelled;
    }

    @Override // org.spongepowered.asm.mixin.injection.callback.Cancellable
    public void cancel() throws CancellationException {
        if (!this.cancellable) {
            throw new CancellationException(String.format("The call %s is not cancellable.", this.name));
        }
        this.cancelled = true;
    }

    static String getCallInfoClassName() {
        return CallbackInfo.class.getName();
    }

    public static String getCallInfoClassName(Type returnType) {
        return (returnType.equals(Type.VOID_TYPE) ? CallbackInfo.class.getName() : CallbackInfoReturnable.class.getName()).replace('.', '/');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getConstructorDescriptor(Type returnType) {
        if (returnType.equals(Type.VOID_TYPE)) {
            return getConstructorDescriptor();
        }
        if (returnType.getSort() == 10 || returnType.getSort() == 9) {
            return String.format("(%sZ%s)V", Constants.STRING_DESC, Constants.OBJECT_DESC);
        }
        return String.format("(%sZ%s)V", Constants.STRING_DESC, returnType.getDescriptor());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getConstructorDescriptor() {
        return String.format("(%sZ)V", Constants.STRING_DESC);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getIsCancelledMethodName() {
        return "isCancelled";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getIsCancelledMethodSig() {
        return "()Z";
    }
}
