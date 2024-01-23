package org.spongepowered.asm.mixin.gen;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.util.Bytecode;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/gen/AccessorGeneratorMethodProxy.class */
public class AccessorGeneratorMethodProxy extends AccessorGenerator {
    protected final MethodNode targetMethod;
    protected final Type[] argTypes;
    protected final Type returnType;

    public AccessorGeneratorMethodProxy(AccessorInfo info) {
        super(info, Bytecode.isStatic(info.getTargetMethod()));
        this.targetMethod = info.getTargetMethod();
        this.argTypes = info.getArgTypes();
        this.returnType = info.getReturnType();
        checkModifiers();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AccessorGeneratorMethodProxy(AccessorInfo info, boolean isStatic) {
        super(info, isStatic);
        this.targetMethod = info.getTargetMethod();
        this.argTypes = info.getArgTypes();
        this.returnType = info.getReturnType();
    }

    @Override // org.spongepowered.asm.mixin.gen.AccessorGenerator
    public MethodNode generate() {
        int size = Bytecode.getArgsSize(this.argTypes) + this.returnType.getSize() + (this.targetIsStatic ? 0 : 1);
        MethodNode method = createMethod(size, size);
        if (!this.targetIsStatic) {
            method.instructions.add(new VarInsnNode(25, 0));
        }
        Bytecode.loadArgs(this.argTypes, method.instructions, this.targetIsStatic ? 0 : 1);
        boolean isPrivate = Bytecode.hasFlag(this.targetMethod, 2);
        int opcode = this.targetIsStatic ? 184 : isPrivate ? 183 : 182;
        method.instructions.add(new MethodInsnNode(opcode, this.info.getClassNode().name, this.targetMethod.name, this.targetMethod.desc, false));
        method.instructions.add(new InsnNode(this.returnType.getOpcode(172)));
        return method;
    }
}
