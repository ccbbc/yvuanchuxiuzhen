package org.spongepowered.asm.mixin.injection.invoke;

import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.util.Bytecode;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/invoke/ModifyArgInjector.class */
public class ModifyArgInjector extends InvokeInjector {
    private final int index;
    private final boolean singleArgMode;

    public ModifyArgInjector(InjectionInfo info, int index) {
        super(info, "@ModifyArg");
        this.index = index;
        this.singleArgMode = this.methodArgs.length == 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongepowered.asm.mixin.injection.invoke.InvokeInjector, org.spongepowered.asm.mixin.injection.code.Injector
    public void sanityCheck(Target target, List<InjectionPoint> injectionPoints) {
        super.sanityCheck(target, injectionPoints);
        if (this.singleArgMode && !this.methodArgs[0].equals(this.returnType)) {
            throw new InvalidInjectionException(this.info, "@ModifyArg return type on " + this + " must match the parameter type. ARG=" + this.methodArgs[0] + " RETURN=" + this.returnType);
        }
    }

    @Override // org.spongepowered.asm.mixin.injection.invoke.InvokeInjector
    protected void checkTarget(Target target) {
        if (!this.isStatic && target.isStatic) {
            throw new InvalidInjectionException(this.info, "non-static callback method " + this + " targets a static method which is not supported");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongepowered.asm.mixin.injection.invoke.InvokeInjector, org.spongepowered.asm.mixin.injection.code.Injector
    public void inject(Target target, InjectionNodes.InjectionNode node) {
        checkTargetForNode(target, node, InjectionPoint.RestrictTargetLevel.ALLOW_ALL);
        super.inject(target, node);
    }

    @Override // org.spongepowered.asm.mixin.injection.invoke.InvokeInjector
    protected void injectAtInvoke(Target target, InjectionNodes.InjectionNode node) {
        MethodInsnNode methodNode = node.getCurrentTarget();
        Type[] args = Type.getArgumentTypes(methodNode.desc);
        int argIndex = findArgIndex(target, args);
        InsnList insns = new InsnList();
        Target.Extension extraLocals = target.extendLocals();
        if (this.singleArgMode) {
            injectSingleArgHandler(target, extraLocals, args, argIndex, insns);
        } else {
            injectMultiArgHandler(target, extraLocals, args, argIndex, insns);
        }
        target.insns.insertBefore(methodNode, insns);
        target.extendStack().set(2 - (extraLocals.get() - 1)).apply();
        extraLocals.apply();
    }

    private void injectSingleArgHandler(Target target, Target.Extension extraLocals, Type[] args, int argIndex, InsnList insns) {
        int[] argMap = storeArgs(target, args, insns, argIndex);
        invokeHandlerWithArgs(args, insns, argMap, argIndex, argIndex + 1);
        pushArgs(args, insns, argMap, argIndex + 1, args.length);
        extraLocals.add((argMap[argMap.length - 1] - target.getMaxLocals()) + args[args.length - 1].getSize());
    }

    private void injectMultiArgHandler(Target target, Target.Extension extraLocals, Type[] args, int argIndex, InsnList insns) {
        if (!Arrays.equals(args, this.methodArgs)) {
            throw new InvalidInjectionException(this.info, "@ModifyArg method " + this + " targets a method with an invalid signature " + Bytecode.getDescriptor(args) + ", expected " + Bytecode.getDescriptor(this.methodArgs));
        }
        int[] argMap = storeArgs(target, args, insns, 0);
        pushArgs(args, insns, argMap, 0, argIndex);
        invokeHandlerWithArgs(args, insns, argMap, 0, args.length);
        pushArgs(args, insns, argMap, argIndex + 1, args.length);
        extraLocals.add((argMap[argMap.length - 1] - target.getMaxLocals()) + args[args.length - 1].getSize());
    }

    protected int findArgIndex(Target target, Type[] args) {
        if (this.index > -1) {
            if (this.index >= args.length || !args[this.index].equals(this.returnType)) {
                throw new InvalidInjectionException(this.info, "Specified index " + this.index + " for @ModifyArg is invalid for args " + Bytecode.getDescriptor(args) + ", expected " + this.returnType + " on " + this);
            }
            return this.index;
        }
        int argIndex = -1;
        for (int arg = 0; arg < args.length; arg++) {
            if (args[arg].equals(this.returnType)) {
                if (argIndex != -1) {
                    throw new InvalidInjectionException(this.info, "Found duplicate args with index [" + argIndex + ", " + arg + "] matching type " + this.returnType + " for @ModifyArg target " + target + " in " + this + ". Please specify index of desired arg.");
                }
                argIndex = arg;
            }
        }
        if (argIndex == -1) {
            throw new InvalidInjectionException(this.info, "Could not find arg matching type " + this.returnType + " for @ModifyArg target " + target + " in " + this);
        }
        return argIndex;
    }
}
