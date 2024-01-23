package org.spongepowered.asm.service;

import org.objectweb.asm.tree.ClassNode;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/ITreeClassTransformer.class */
public interface ITreeClassTransformer extends ITransformer {
    boolean transformClassNode(String str, String str2, ClassNode classNode);
}
