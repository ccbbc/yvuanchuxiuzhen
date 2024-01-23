package org.spongepowered.asm.mixin.transformer.ext;

import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.transformer.ClassInfo;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/ext/ITargetClassContext.class */
public interface ITargetClassContext {
    ClassInfo getClassInfo();

    ClassNode getClassNode();
}
