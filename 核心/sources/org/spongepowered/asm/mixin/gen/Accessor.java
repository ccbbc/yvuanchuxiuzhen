package org.spongepowered.asm.mixin.gen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/gen/Accessor.class */
public @interface Accessor {
    String value() default "";

    boolean remap() default true;
}
