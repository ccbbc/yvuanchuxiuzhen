package org.spongepowered.asm.mixin.injection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/ModifyArg.class */
public @interface ModifyArg {
    String[] method();

    Slice slice() default @Slice;

    At at();

    int index() default -1;

    boolean remap() default true;

    int require() default -1;

    int expect() default 1;

    int allow() default -1;

    String constraints() default "";
}
