package org.spongepowered.asm.mixin.injection.points;

import java.util.Collection;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LdcInsnNode;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorByName;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;

@InjectionPoint.AtCode("INVOKE_STRING")
/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/points/BeforeStringInvoke.class */
public class BeforeStringInvoke extends BeforeInvoke {
    private static final String STRING_VOID_SIG = "(Ljava/lang/String;)V";
    private final String ldcValue;
    private boolean foundLdc;

    public BeforeStringInvoke(InjectionPointData data) {
        super(data);
        this.ldcValue = data.get("ldc", (String) null);
        if (this.ldcValue == null) {
            throw new IllegalArgumentException(getClass().getSimpleName() + " requires named argument \"ldc\" to specify the desired target");
        }
        if (!(this.target instanceof ITargetSelectorByName) || !STRING_VOID_SIG.equals(((ITargetSelectorByName) this.target).getDesc())) {
            throw new IllegalArgumentException(getClass().getSimpleName() + " requires target method with with signature " + STRING_VOID_SIG);
        }
    }

    @Override // org.spongepowered.asm.mixin.injection.points.BeforeInvoke, org.spongepowered.asm.mixin.injection.InjectionPoint
    public boolean find(String desc, InsnList insns, Collection<AbstractInsnNode> nodes) {
        this.foundLdc = false;
        return super.find(desc, insns, nodes);
    }

    @Override // org.spongepowered.asm.mixin.injection.points.BeforeInvoke
    protected void inspectInsn(String desc, InsnList insns, AbstractInsnNode insn) {
        if (insn instanceof LdcInsnNode) {
            LdcInsnNode node = (LdcInsnNode) insn;
            if ((node.cst instanceof String) && this.ldcValue.equals(node.cst)) {
                log("{} > found a matching LDC with value {}", this.className, node.cst);
                this.foundLdc = true;
                return;
            }
        }
        this.foundLdc = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongepowered.asm.mixin.injection.points.BeforeInvoke
    public boolean matchesOrdinal(int ordinal) {
        log("{} > > found LDC \"{}\" = {}", this.className, this.ldcValue, Boolean.valueOf(this.foundLdc));
        return this.foundLdc && super.matchesOrdinal(ordinal);
    }
}
