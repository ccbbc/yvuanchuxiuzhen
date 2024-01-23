package org.spongepowered.asm.mixin.transformer;

import java.util.List;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.transformer.ext.IExtensionRegistry;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/IMixinTransformer.class */
public interface IMixinTransformer {
    void audit(MixinEnvironment mixinEnvironment);

    List<String> reload(String str, ClassNode classNode);

    byte[] transformClassBytes(String str, String str2, byte[] bArr);

    IExtensionRegistry getExtensions();
}
