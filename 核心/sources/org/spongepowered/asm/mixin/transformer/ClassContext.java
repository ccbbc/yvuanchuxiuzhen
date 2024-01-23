package org.spongepowered.asm.mixin.transformer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.struct.MemberRef;
import org.spongepowered.asm.mixin.transformer.ClassInfo;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/ClassContext.class */
abstract class ClassContext {
    private final Set<ClassInfo.Method> upgradedMethods = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String getClassRef();

    abstract ClassNode getClassNode();

    abstract ClassInfo getClassInfo();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addUpgradedMethod(MethodNode method) {
        ClassInfo.Method md = getClassInfo().findMethod(method);
        if (md == null) {
            throw new IllegalStateException("Meta method for " + method.name + " not located in " + this);
        }
        this.upgradedMethods.add(md);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void upgradeMethods() {
        for (MethodNode method : getClassNode().methods) {
            upgradeMethod(method);
        }
    }

    private void upgradeMethod(MethodNode method) {
        Iterator<AbstractInsnNode> iter = method.instructions.iterator();
        while (iter.hasNext()) {
            AbstractInsnNode next = iter.next();
            if (next instanceof MethodInsnNode) {
                MemberRef methodRef = new MemberRef.Method((MethodInsnNode) next);
                if (methodRef.getOwner().equals(getClassRef())) {
                    ClassInfo.Method md = getClassInfo().findMethod(methodRef.getName(), methodRef.getDesc(), 10);
                    upgradeMethodRef(method, methodRef, md);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void upgradeMethodRef(MethodNode containingMethod, MemberRef methodRef, ClassInfo.Method method) {
        if (methodRef.getOpcode() == 183 && this.upgradedMethods.contains(method)) {
            methodRef.setOpcode(182);
        }
    }
}
