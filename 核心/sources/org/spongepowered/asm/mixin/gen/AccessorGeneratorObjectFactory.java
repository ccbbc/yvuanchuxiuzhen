package org.spongepowered.asm.mixin.gen;

import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.Constants;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/gen/AccessorGeneratorObjectFactory.class */
public class AccessorGeneratorObjectFactory extends AccessorGeneratorMethodProxy {
    public AccessorGeneratorObjectFactory(AccessorInfo info) {
        super(info, true);
        if (!info.isStatic()) {
            throw new InvalidInjectionException(info.getContext(), String.format("%s is invalid. Factory method must be static.", this.info));
        }
    }

    @Override // org.spongepowered.asm.mixin.gen.AccessorGeneratorMethodProxy, org.spongepowered.asm.mixin.gen.AccessorGenerator
    public MethodNode generate() {
        int returnSize = this.returnType.getSize();
        int size = Bytecode.getArgsSize(this.argTypes) + (returnSize * 2);
        MethodNode method = createMethod(size, size);
        String className = this.info.getClassNode().name;
        method.instructions.add(new TypeInsnNode(187, className));
        method.instructions.add(new InsnNode(returnSize == 1 ? 89 : 92));
        Bytecode.loadArgs(this.argTypes, method.instructions, 0);
        method.instructions.add(new MethodInsnNode(183, className, Constants.CTOR, this.targetMethod.desc, false));
        method.instructions.add(new InsnNode(176));
        return method;
    }
}
