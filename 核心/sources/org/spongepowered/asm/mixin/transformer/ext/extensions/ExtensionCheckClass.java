package org.spongepowered.asm.mixin.transformer.ext.extensions;

import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.util.CheckClassAdapter;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.throwables.MixinException;
import org.spongepowered.asm.mixin.transformer.ext.IExtension;
import org.spongepowered.asm.mixin.transformer.ext.ITargetClassContext;
import org.spongepowered.asm.transformers.MixinClassWriter;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/ext/extensions/ExtensionCheckClass.class */
public class ExtensionCheckClass implements IExtension {

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/ext/extensions/ExtensionCheckClass$ValidationFailedException.class */
    public static class ValidationFailedException extends MixinException {
        private static final long serialVersionUID = 1;

        public ValidationFailedException(String message, Throwable cause) {
            super(message, cause);
        }

        public ValidationFailedException(String message) {
            super(message);
        }

        public ValidationFailedException(Throwable cause) {
            super(cause);
        }
    }

    @Override // org.spongepowered.asm.mixin.transformer.ext.IExtension
    public boolean checkActive(MixinEnvironment environment) {
        return environment.getOption(MixinEnvironment.Option.DEBUG_VERIFY);
    }

    @Override // org.spongepowered.asm.mixin.transformer.ext.IExtension
    public void preApply(ITargetClassContext context) {
    }

    @Override // org.spongepowered.asm.mixin.transformer.ext.IExtension
    public void postApply(ITargetClassContext context) {
        try {
            context.getClassNode().accept(new CheckClassAdapter(new MixinClassWriter(2)));
        } catch (RuntimeException ex) {
            throw new ValidationFailedException(ex.getMessage(), ex);
        }
    }

    @Override // org.spongepowered.asm.mixin.transformer.ext.IExtension
    public void export(MixinEnvironment env, String name, boolean force, ClassNode classNode) {
    }
}
