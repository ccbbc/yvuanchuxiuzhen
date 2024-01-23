package org.spongepowered.asm.mixin.injection.invoke.arg;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/invoke/arg/Args.class */
public abstract class Args {
    protected final Object[] values;

    public abstract <T> void set(int i, T t);

    public abstract void setAll(Object... objArr);

    protected Args(Object[] values) {
        this.values = values;
    }

    public int size() {
        return this.values.length;
    }

    public <T> T get(int index) {
        return (T) this.values[index];
    }
}
