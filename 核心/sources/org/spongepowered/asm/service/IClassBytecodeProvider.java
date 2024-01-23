package org.spongepowered.asm.service;

import java.io.IOException;
import org.objectweb.asm.tree.ClassNode;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/service/IClassBytecodeProvider.class */
public interface IClassBytecodeProvider {
    ClassNode getClassNode(String str) throws ClassNotFoundException, IOException;

    ClassNode getClassNode(String str, boolean z) throws ClassNotFoundException, IOException;
}
