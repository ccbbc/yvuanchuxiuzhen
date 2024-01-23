package org.spongepowered.asm.mixin.injection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/At.class */
public @interface At {

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/At$Shift.class */
    public enum Shift {
        NONE,
        BEFORE,
        AFTER,
        BY
    }

    String id() default "";

    String value();

    String slice() default "";

    Shift shift() default Shift.NONE;

    int by() default 0;

    String[] args() default {};

    String target() default "";

    int ordinal() default -1;

    int opcode() default -1;

    boolean remap() default true;
}
