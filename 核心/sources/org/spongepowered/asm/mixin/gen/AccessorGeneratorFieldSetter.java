package org.spongepowered.asm.mixin.gen;

import org.apache.logging.log4j.LogManager;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.transformer.ClassInfo;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;
import org.spongepowered.asm.util.Bytecode;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/gen/AccessorGeneratorFieldSetter.class */
public class AccessorGeneratorFieldSetter extends AccessorGeneratorField {
    private boolean mutable;

    public AccessorGeneratorFieldSetter(AccessorInfo info) {
        super(info);
    }

    @Override // org.spongepowered.asm.mixin.gen.AccessorGenerator
    public void validate() {
        super.validate();
        ClassInfo.Method method = this.info.getClassInfo().findMethod(this.info.getMethod());
        this.mutable = method.isDecoratedMutable();
        if (!this.mutable && Bytecode.hasFlag(this.targetField, 16) && this.info.getContext().getOption(MixinEnvironment.Option.DEBUG_VERBOSE)) {
            LogManager.getLogger(MixinLaunchPlugin.NAME).warn("{} for final field {}::{} is not @Mutable", new Object[]{this.info, ((MixinTargetContext) this.info.getContext()).getTarget(), this.targetField.name});
        }
    }

    @Override // org.spongepowered.asm.mixin.gen.AccessorGenerator
    public MethodNode generate() {
        if (this.mutable) {
            this.targetField.access &= -17;
        }
        int stackSpace = this.targetIsStatic ? 0 : 1;
        int maxLocals = stackSpace + this.targetType.getSize();
        int maxStack = stackSpace + this.targetType.getSize();
        MethodNode method = createMethod(maxLocals, maxStack);
        if (!this.targetIsStatic) {
            method.instructions.add(new VarInsnNode(25, 0));
        }
        method.instructions.add(new VarInsnNode(this.targetType.getOpcode(21), stackSpace));
        int opcode = this.targetIsStatic ? 179 : 181;
        method.instructions.add(new FieldInsnNode(opcode, this.info.getClassNode().name, this.targetField.name, this.targetField.desc));
        method.instructions.add(new InsnNode(177));
        return method;
    }
}
