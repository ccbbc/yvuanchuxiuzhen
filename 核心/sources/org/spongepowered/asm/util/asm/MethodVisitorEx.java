package org.spongepowered.asm.util.asm;

import org.objectweb.asm.MethodVisitor;
import org.spongepowered.asm.util.Bytecode;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/util/asm/MethodVisitorEx.class */
public class MethodVisitorEx extends MethodVisitor {
    public MethodVisitorEx(MethodVisitor mv) {
        super(ASM.API_VERSION, mv);
    }

    public void visitConstant(byte constant) {
        if (constant > -2 && constant < 6) {
            visitInsn(Bytecode.CONSTANTS_INT[constant + 1]);
        } else {
            visitIntInsn(16, constant);
        }
    }
}
