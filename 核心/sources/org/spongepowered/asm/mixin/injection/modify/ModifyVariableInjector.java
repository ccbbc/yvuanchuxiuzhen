package org.spongepowered.asm.mixin.injection.modify;

import java.util.Collection;
import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.modify.LocalVariableDiscriminator;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.PrettyPrinter;
import org.spongepowered.asm.util.SignaturePrinter;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/modify/ModifyVariableInjector.class */
public class ModifyVariableInjector extends Injector {
    private final LocalVariableDiscriminator discriminator;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/modify/ModifyVariableInjector$Context.class */
    public static class Context extends LocalVariableDiscriminator.Context {
        final InsnList insns;

        public Context(Type returnType, boolean argsOnly, Target target, AbstractInsnNode node) {
            super(returnType, argsOnly, target, node);
            this.insns = new InsnList();
        }
    }

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/modify/ModifyVariableInjector$LocalVariableInjectionPoint.class */
    static abstract class LocalVariableInjectionPoint extends InjectionPoint {
        protected final IMixinContext mixin;

        abstract boolean find(InjectionInfo injectionInfo, Target target, Collection<AbstractInsnNode> collection);

        /* JADX INFO: Access modifiers changed from: package-private */
        public LocalVariableInjectionPoint(InjectionPointData data) {
            super(data);
            this.mixin = data.getContext();
        }

        @Override // org.spongepowered.asm.mixin.injection.InjectionPoint
        public boolean find(String desc, InsnList insns, Collection<AbstractInsnNode> nodes) {
            throw new InvalidInjectionException(this.mixin, getAtCode() + " injection point must be used in conjunction with @ModifyVariable");
        }
    }

    public ModifyVariableInjector(InjectionInfo info, LocalVariableDiscriminator discriminator) {
        super(info, "@ModifyVariable");
        this.discriminator = discriminator;
    }

    @Override // org.spongepowered.asm.mixin.injection.code.Injector
    protected boolean findTargetNodes(MethodNode into, InjectionPoint injectionPoint, InsnList insns, Collection<AbstractInsnNode> nodes) {
        if (injectionPoint instanceof LocalVariableInjectionPoint) {
            Target target = this.info.getContext().getTargetMethod(into);
            return ((LocalVariableInjectionPoint) injectionPoint).find(this.info, target, nodes);
        }
        return injectionPoint.find(into.desc, insns, nodes);
    }

    @Override // org.spongepowered.asm.mixin.injection.code.Injector
    protected void sanityCheck(Target target, List<InjectionPoint> injectionPoints) {
        super.sanityCheck(target, injectionPoints);
        int ordinal = this.discriminator.getOrdinal();
        if (ordinal < -1) {
            throw new InvalidInjectionException(this.info, "Invalid ordinal " + ordinal + " specified in " + this);
        }
        if (this.discriminator.getIndex() == 0 && !target.isStatic) {
            throw new InvalidInjectionException(this.info, "Invalid index 0 specified in non-static variable modifier " + this);
        }
    }

    @Override // org.spongepowered.asm.mixin.injection.code.Injector
    protected void inject(Target target, InjectionNodes.InjectionNode node) {
        if (node.isReplaced()) {
            throw new InvalidInjectionException(this.info, "Variable modifier target for " + this + " was removed by another injector");
        }
        Context context = new Context(this.returnType, this.discriminator.isArgsOnly(), target, node.getCurrentTarget());
        if (this.discriminator.printLVT()) {
            printLocals(target, context);
        }
        checkTargetForNode(target, node, InjectionPoint.RestrictTargetLevel.ALLOW_ALL);
        Injector.InjectorData handler = new Injector.InjectorData(target, InjectionInfo.DEFAULT_PREFIX, false);
        validateParams(handler, this.returnType, this.returnType);
        Target.Extension extraStack = target.extendStack();
        try {
            int local = this.discriminator.findLocal(context);
            if (local > -1) {
                inject(context, handler, extraStack, local);
            }
            extraStack.apply();
            target.insns.insertBefore(context.node, context.insns);
        } catch (InvalidImplicitDiscriminatorException ex) {
            if (this.discriminator.printLVT()) {
                this.info.addCallbackInvocation(this.methodNode);
                return;
            }
            throw new InvalidInjectionException(this.info, "Implicit variable modifier injection failed in " + this, ex);
        }
    }

    private void printLocals(Target target, Context context) {
        SignaturePrinter handlerSig = new SignaturePrinter(this.info.getMethodName(), this.returnType, this.methodArgs, new String[]{"var"});
        handlerSig.setModifiers(this.methodNode);
        String matchMode = "EXPLICIT (match by criteria)";
        if (this.discriminator.isImplicit(context)) {
            int candidateCount = context.getCandidateCount();
            matchMode = "IMPLICIT (match single) - " + (candidateCount == 1 ? "VALID (exactly 1 match)" : "INVALID (" + candidateCount + " matches)");
        }
        new PrettyPrinter().kvWidth(20).kv("Target Class", this.classNode.name.replace('/', '.')).kv("Target Method", context.target.method.name).kv("Callback Name", this.info.getMethodName()).kv("Capture Type", SignaturePrinter.getTypeName(this.returnType, false)).kv("Instruction", "[%d] %s %s", Integer.valueOf(target.insns.indexOf(context.node)), context.node.getClass().getSimpleName(), Bytecode.getOpcodeName(context.node.getOpcode())).hr().kv("Match mode", matchMode).kv("Match ordinal", this.discriminator.getOrdinal() < 0 ? "any" : Integer.valueOf(this.discriminator.getOrdinal())).kv("Match index", this.discriminator.getIndex() < context.baseArgIndex ? "any" : Integer.valueOf(this.discriminator.getIndex())).kv("Match name(s)", this.discriminator.hasNames() ? this.discriminator.getNames() : "any").kv("Args only", Boolean.valueOf(this.discriminator.isArgsOnly())).hr().add((PrettyPrinter.IPrettyPrintable) context).print(System.err);
    }

    private void inject(Context context, Injector.InjectorData handler, Target.Extension extraStack, int local) {
        if (!this.isStatic) {
            context.insns.add(new VarInsnNode(25, 0));
            extraStack.add();
        }
        context.insns.add(new VarInsnNode(this.returnType.getOpcode(21), local));
        extraStack.add();
        if (handler.captureTargetArgs > 0) {
            pushArgs(handler.target.arguments, context.insns, handler.target.getArgIndices(), 0, handler.captureTargetArgs, extraStack);
        }
        invokeHandler(context.insns);
        context.insns.add(new VarInsnNode(this.returnType.getOpcode(54), local));
    }
}
