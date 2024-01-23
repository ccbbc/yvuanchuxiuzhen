package org.spongepowered.asm.mixin.injection.callback;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/callback/Cancellable.class */
public interface Cancellable {
    boolean isCancellable();

    boolean isCancelled();

    void cancel() throws CancellationException;
}
