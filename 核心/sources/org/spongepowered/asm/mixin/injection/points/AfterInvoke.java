package org.spongepowered.asm.mixin.injection.points;

import java.util.Collection;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;

@InjectionPoint.AtCode("INVOKE_ASSIGN")
/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/points/AfterInvoke.class */
public class AfterInvoke extends BeforeInvoke {
    public AfterInvoke(InjectionPointData data) {
        super(data);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongepowered.asm.mixin.injection.points.BeforeInvoke
    public boolean addInsn(InsnList insns, Collection<AbstractInsnNode> nodes, AbstractInsnNode insn) {
        MethodInsnNode methodNode = (MethodInsnNode) insn;
        if (Type.getReturnType(methodNode.desc) == Type.VOID_TYPE) {
            return false;
        }
        AbstractInsnNode insn2 = InjectionPoint.nextNode(insns, insn);
        if ((insn2 instanceof VarInsnNode) && insn2.getOpcode() >= 54) {
            insn2 = InjectionPoint.nextNode(insns, insn2);
        }
        nodes.add(insn2);
        return true;
    }
}
