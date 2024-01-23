package org.spongepowered.asm.util;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/util/Counter.class */
public final class Counter {
    public int value;

    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == Counter.class && ((Counter) obj).value == this.value;
    }

    public int hashCode() {
        return this.value;
    }
}
