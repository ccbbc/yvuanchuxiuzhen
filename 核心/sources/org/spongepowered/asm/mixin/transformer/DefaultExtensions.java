package org.spongepowered.asm.mixin.transformer;

import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.invoke.arg.ArgsClassGenerator;
import org.spongepowered.asm.mixin.transformer.ext.Extensions;
import org.spongepowered.asm.mixin.transformer.ext.extensions.ExtensionCheckClass;
import org.spongepowered.asm.mixin.transformer.ext.extensions.ExtensionCheckInterfaces;
import org.spongepowered.asm.mixin.transformer.ext.extensions.ExtensionClassExporter;
import org.spongepowered.asm.service.ISyntheticClassInfo;
import org.spongepowered.asm.util.IConsumer;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/DefaultExtensions.class */
final class DefaultExtensions {
    private DefaultExtensions() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void create(MixinEnvironment environment, Extensions extensions, final SyntheticClassRegistry registry) {
        IConsumer<ISyntheticClassInfo> registryDelegate = new IConsumer<ISyntheticClassInfo>() { // from class: org.spongepowered.asm.mixin.transformer.DefaultExtensions.1
            @Override // org.spongepowered.asm.util.IConsumer
            public void accept(ISyntheticClassInfo item) {
                SyntheticClassRegistry.this.registerSyntheticClass(item);
            }
        };
        extensions.add(new ArgsClassGenerator(registryDelegate));
        extensions.add(new InnerClassGenerator(registryDelegate));
        extensions.add(new ExtensionClassExporter(environment));
        extensions.add(new ExtensionCheckClass());
        extensions.add(new ExtensionCheckInterfaces());
    }
}
