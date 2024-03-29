package org.spongepowered.asm.mixin.injection.invoke;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.invoke.arg.ArgsClassGenerator;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.util.Bytecode;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/invoke/ModifyArgsInjector.class */
public class ModifyArgsInjector extends InvokeInjector {
    private final ArgsClassGenerator argsClassGenerator;

    public ModifyArgsInjector(InjectionInfo info) {
        super(info, "@ModifyArgs");
        this.argsClassGenerator = (ArgsClassGenerator) info.getContext().getExtensions().getGenerator(ArgsClassGenerator.class);
    }

    @Override // org.spongepowered.asm.mixin.injection.invoke.InvokeInjector
    protected void checkTarget(Target target) {
        checkTargetModifiers(target, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongepowered.asm.mixin.injection.invoke.InvokeInjector, org.spongepowered.asm.mixin.injection.code.Injector
    public void inject(Target target, InjectionNodes.InjectionNode node) {
        checkTargetForNode(target, node, InjectionPoint.RestrictTargetLevel.ALLOW_ALL);
        super.inject(target, node);
    }

    @Override // org.spongepowered.asm.mixin.injection.invoke.InvokeInjector
    protected void injectAtInvoke(Target target, InjectionNodes.InjectionNode node) {
        MethodInsnNode targetMethod = (MethodInsnNode) node.getCurrentTarget();
        Type[] args = Type.getArgumentTypes(targetMethod.desc);
        if (args.length == 0) {
            throw new InvalidInjectionException(this.info, "@ModifyArgs injector " + this + " targets a method invocation " + targetMethod.name + targetMethod.desc + " with no arguments!");
        }
        String clArgs = this.argsClassGenerator.getArgsClass(targetMethod.desc, this.info.getContext().getMixin()).getName();
        boolean withArgs = verifyTarget(target);
        InsnList insns = new InsnList();
        Target.Extension extraStack = target.extendStack().add(1);
        packArgs(insns, clArgs, targetMethod);
        if (withArgs) {
            extraStack.add(target.arguments);
            Bytecode.loadArgs(target.arguments, insns, target.isStatic ? 0 : 1);
        }
        invokeHandler(insns);
        unpackArgs(insns, clArgs, args);
        extraStack.apply();
        target.insns.insertBefore(targetMethod, insns);
    }

    private boolean verifyTarget(Target target) {
        String shortDesc = String.format("(L%s;)V", ArgsClassGenerator.ARGS_REF);
        if (!this.methodNode.desc.equals(shortDesc)) {
            String targetDesc = Bytecode.changeDescriptorReturnType(target.method.desc, "V");
            String longDesc = String.format("(L%s;%s", ArgsClassGenerator.ARGS_REF, targetDesc.substring(1));
            if (this.methodNode.desc.equals(longDesc)) {
                return true;
            }
            throw new InvalidInjectionException(this.info, "@ModifyArgs injector " + this + " has an invalid signature " + this.methodNode.desc + ", expected " + shortDesc + " or " + longDesc);
        }
        return false;
    }

    private void packArgs(InsnList insns, String clArgs, MethodInsnNode targetMethod) {
        String factoryDesc = Bytecode.changeDescriptorReturnType(targetMethod.desc, "L" + clArgs + ";");
        insns.add(new MethodInsnNode(184, clArgs, "of", factoryDesc, false));
        insns.add(new InsnNode(89));
        if (!this.isStatic) {
            insns.add(new VarInsnNode(25, 0));
            insns.add(new InsnNode(95));
        }
    }

    private void unpackArgs(InsnList insns, String clArgs, Type[] args) {
        for (int i = 0; i < args.length; i++) {
            if (i < args.length - 1) {
                insns.add(new InsnNode(89));
            }
            insns.add(new MethodInsnNode(182, clArgs, ArgsClassGenerator.GETTER_PREFIX + i, "()" + args[i].getDescriptor(), false));
            if (i < args.length - 1) {
                if (args[i].getSize() == 1) {
                    insns.add(new InsnNode(95));
                } else {
                    insns.add(new InsnNode(93));
                    insns.add(new InsnNode(88));
                }
            }
        }
    }
}
