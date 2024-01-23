package org.spongepowered.asm.mixin.injection.code;

import java.util.ListIterator;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/code/ReadOnlyInsnList.class */
class ReadOnlyInsnList extends InsnList {
    private InsnList insnList;

    public ReadOnlyInsnList(InsnList insns) {
        this.insnList = insns;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dispose() {
        this.insnList = null;
    }

    public final void set(AbstractInsnNode location, AbstractInsnNode insn) {
        throw new UnsupportedOperationException();
    }

    public final void add(AbstractInsnNode insn) {
        throw new UnsupportedOperationException();
    }

    public final void add(InsnList insns) {
        throw new UnsupportedOperationException();
    }

    public final void insert(AbstractInsnNode insn) {
        throw new UnsupportedOperationException();
    }

    public final void insert(InsnList insns) {
        throw new UnsupportedOperationException();
    }

    public final void insert(AbstractInsnNode location, AbstractInsnNode insn) {
        throw new UnsupportedOperationException();
    }

    public final void insert(AbstractInsnNode location, InsnList insns) {
        throw new UnsupportedOperationException();
    }

    public final void insertBefore(AbstractInsnNode location, AbstractInsnNode insn) {
        throw new UnsupportedOperationException();
    }

    public final void insertBefore(AbstractInsnNode location, InsnList insns) {
        throw new UnsupportedOperationException();
    }

    public final void remove(AbstractInsnNode insn) {
        throw new UnsupportedOperationException();
    }

    public AbstractInsnNode[] toArray() {
        return this.insnList.toArray();
    }

    public int size() {
        return this.insnList.size();
    }

    public AbstractInsnNode getFirst() {
        return this.insnList.getFirst();
    }

    public AbstractInsnNode getLast() {
        return this.insnList.getLast();
    }

    public AbstractInsnNode get(int index) {
        return this.insnList.get(index);
    }

    public boolean contains(AbstractInsnNode insn) {
        return this.insnList.contains(insn);
    }

    public int indexOf(AbstractInsnNode insn) {
        return this.insnList.indexOf(insn);
    }

    @Override // 
    /* renamed from: iterator */
    public ListIterator<AbstractInsnNode> mo36iterator() {
        return this.insnList.iterator();
    }

    public ListIterator<AbstractInsnNode> iterator(int index) {
        return this.insnList.iterator(index);
    }

    public final void resetLabels() {
        this.insnList.resetLabels();
    }
}
