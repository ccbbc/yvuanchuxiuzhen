package org.spongepowered.asm.mixin.transformer.throwables;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/throwables/IllegalClassLoadError.class */
public class IllegalClassLoadError extends MixinTransformerError {
    private static final long serialVersionUID = 1;

    public IllegalClassLoadError(String message) {
        super(message);
    }

    public IllegalClassLoadError(Throwable cause) {
        super(cause);
    }

    public IllegalClassLoadError(String message, Throwable cause) {
        super(message, cause);
    }
}
