package org.spongepowered.asm.mixin.throwables;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/throwables/CompanionPluginError.class */
public class CompanionPluginError extends LinkageError {
    private static final long serialVersionUID = 1;

    public CompanionPluginError() {
    }

    public CompanionPluginError(String message) {
        super(message);
    }

    public CompanionPluginError(String message, Throwable cause) {
        super(message, cause);
    }
}
