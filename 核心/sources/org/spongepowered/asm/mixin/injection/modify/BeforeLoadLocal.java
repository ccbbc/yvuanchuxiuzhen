package org.spongepowered.asm.mixin.injection.modify;

import java.util.Collection;
import java.util.ListIterator;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.modify.LocalVariableDiscriminator;
import org.spongepowered.asm.mixin.injection.modify.ModifyVariableInjector;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;
import org.spongepowered.asm.mixin.injection.struct.Target;

@InjectionPoint.AtCode("LOAD")
/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/modify/BeforeLoadLocal.class */
public class BeforeLoadLocal extends ModifyVariableInjector.LocalVariableInjectionPoint {
    protected final Type returnType;
    protected final LocalVariableDiscriminator discriminator;
    protected final int opcode;
    protected final int ordinal;
    private boolean opcodeAfter;

    @Override // org.spongepowered.asm.mixin.injection.modify.ModifyVariableInjector.LocalVariableInjectionPoint, org.spongepowered.asm.mixin.injection.InjectionPoint
    public /* bridge */ /* synthetic */ boolean find(String str, InsnList insnList, Collection collection) {
        return super.find(str, insnList, collection);
    }

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/modify/BeforeLoadLocal$SearchState.class */
    class SearchState {
        private static final int INVALID_IMPLICIT = -2;
        private final boolean print;
        private int currentOrdinal = 0;
        private boolean pendingCheck = false;
        private boolean found = false;
        private VarInsnNode varNode;

        SearchState() {
            this.print = BeforeLoadLocal.this.discriminator.printLVT();
        }

        boolean success() {
            return this.found;
        }

        boolean isPendingCheck() {
            return this.pendingCheck;
        }

        void setPendingCheck() {
            this.pendingCheck = true;
        }

        void register(VarInsnNode node) {
            this.varNode = node;
        }

        void check(Target target, Collection<AbstractInsnNode> nodes, AbstractInsnNode insn) {
            LocalVariableDiscriminator.Context context = new LocalVariableDiscriminator.Context(BeforeLoadLocal.this.returnType, BeforeLoadLocal.this.discriminator.isArgsOnly(), target, insn);
            int local = INVALID_IMPLICIT;
            try {
                local = BeforeLoadLocal.this.discriminator.findLocal(context);
            } catch (InvalidImplicitDiscriminatorException ex) {
                BeforeLoadLocal.this.addMessage("%s has invalid IMPLICIT discriminator for opcode %d in %s: %s", BeforeLoadLocal.this.toString(context), Integer.valueOf(target.indexOf(insn)), target, ex.getMessage());
            }
            this.pendingCheck = false;
            if (local != this.varNode.var && (local > INVALID_IMPLICIT || !this.print)) {
                this.varNode = null;
                return;
            }
            if (BeforeLoadLocal.this.ordinal == -1 || BeforeLoadLocal.this.ordinal == this.currentOrdinal) {
                nodes.add(insn);
                this.found = true;
            }
            this.currentOrdinal++;
            this.varNode = null;
        }
    }

    protected BeforeLoadLocal(InjectionPointData data) {
        this(data, 21, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BeforeLoadLocal(InjectionPointData data, int opcode, boolean opcodeAfter) {
        super(data);
        this.returnType = data.getMethodReturnType();
        this.discriminator = data.getLocalVariableDiscriminator();
        this.opcode = data.getOpcode(this.returnType.getOpcode(opcode));
        this.ordinal = data.getOrdinal();
        this.opcodeAfter = opcodeAfter;
    }

    @Override // org.spongepowered.asm.mixin.injection.modify.ModifyVariableInjector.LocalVariableInjectionPoint
    boolean find(InjectionInfo info, Target target, Collection<AbstractInsnNode> nodes) {
        SearchState state = new SearchState();
        ListIterator<AbstractInsnNode> iter = target.method.instructions.iterator();
        while (iter.hasNext()) {
            AbstractInsnNode insn = iter.next();
            if (state.isPendingCheck()) {
                state.check(target, nodes, insn);
            } else if ((insn instanceof VarInsnNode) && insn.getOpcode() == this.opcode && (this.ordinal == -1 || !state.success())) {
                state.register((VarInsnNode) insn);
                if (this.opcodeAfter) {
                    state.setPendingCheck();
                } else {
                    state.check(target, nodes, insn);
                }
            }
        }
        return state.success();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongepowered.asm.mixin.injection.InjectionPoint
    public void addMessage(String format, Object... args) {
        super.addMessage(format, args);
    }

    @Override // org.spongepowered.asm.mixin.injection.InjectionPoint
    public String toString() {
        return String.format("@At(\"%s\" %s)", getAtCode(), this.discriminator.toString());
    }

    public String toString(LocalVariableDiscriminator.Context context) {
        return String.format("@At(\"%s\" %s)", getAtCode(), this.discriminator.toString(context));
    }
}
