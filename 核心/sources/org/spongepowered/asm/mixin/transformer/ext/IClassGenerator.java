package org.spongepowered.asm.mixin.transformer.ext;

import org.objectweb.asm.tree.ClassNode;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/ext/IClassGenerator.class */
public interface IClassGenerator {
    String getName();

    boolean generate(String str, ClassNode classNode);
}
