package org.spongepowered.asm.mixin;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.CLASS)
/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/Interface.class */
public @interface Interface {
    Class<?> iface();

    String prefix();

    boolean unique() default false;

    Remap remap() default Remap.ALL;

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/Interface$Remap.class */
    public enum Remap {
        ALL,
        FORCE(true),
        ONLY_PREFIXED,
        NONE;
        
        private final boolean forceRemap;

        Remap() {
            this(false);
        }

        Remap(boolean forceRemap) {
            this.forceRemap = forceRemap;
        }

        public boolean forceRemap() {
            return this.forceRemap;
        }
    }
}
