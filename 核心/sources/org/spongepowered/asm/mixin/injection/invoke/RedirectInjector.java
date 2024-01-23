package org.spongepowered.asm.mixin.injection.invoke;

import com.google.common.collect.ObjectArrays;
import com.google.common.primitives.Ints;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.points.BeforeFieldAccess;
import org.spongepowered.asm.mixin.injection.points.BeforeNew;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.Constants;
import org.spongepowered.asm.util.SignaturePrinter;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/invoke/RedirectInjector.class */
public class RedirectInjector extends InvokeInjector {
    private static final String GET_CLASS_METHOD = "getClass";
    private static final String IS_ASSIGNABLE_FROM_METHOD = "isAssignableFrom";
    private static final String NPE = "java/lang/NullPointerException";
    private static final String KEY_NOMINATORS = "nominators";
    private static final String KEY_FUZZ = "fuzz";
    private static final String KEY_OPCODE = "opcode";
    protected Meta meta;
    private Map<BeforeNew, ConstructorRedirectData> ctorRedirectors;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/invoke/RedirectInjector$Meta.class */
    public class Meta {
        public static final String KEY = "redirector";
        final int priority;
        final boolean isFinal;
        final String name;
        final String desc;

        public Meta(int priority, boolean isFinal, String name, String desc) {
            this.priority = priority;
            this.isFinal = isFinal;
            this.name = name;
            this.desc = desc;
        }

        RedirectInjector getOwner() {
            return RedirectInjector.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/invoke/RedirectInjector$ConstructorRedirectData.class */
    public static class ConstructorRedirectData {
        public static final String KEY = "ctor";
        boolean wildcard = false;
        int injected = 0;
        InvalidInjectionException lastException;

        ConstructorRedirectData() {
        }

        public void throwOrCollect(InvalidInjectionException ex) {
            if (!this.wildcard) {
                throw ex;
            }
            this.lastException = ex;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/invoke/RedirectInjector$RedirectedInvokeData.class */
    public static class RedirectedInvokeData extends Injector.InjectorData {
        final MethodInsnNode node;
        final Type returnType;
        final Type[] targetArgs;
        final Type[] handlerArgs;

        RedirectedInvokeData(Target target, MethodInsnNode node) {
            super(target);
            this.node = node;
            this.returnType = Type.getReturnType(node.desc);
            this.targetArgs = Type.getArgumentTypes(node.desc);
            this.handlerArgs = node.getOpcode() == 184 ? this.targetArgs : (Type[]) ObjectArrays.concat(Type.getObjectType(node.owner), this.targetArgs);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/invoke/RedirectInjector$RedirectedFieldData.class */
    public static class RedirectedFieldData extends Injector.InjectorData {
        final FieldInsnNode node;
        final int opcode;
        final Type owner;
        final Type type;
        final int dimensions;
        final boolean isStatic;
        final boolean isGetter;
        final boolean isSetter;
        Type elementType;
        int extraDimensions;

        RedirectedFieldData(Target target, FieldInsnNode node) {
            super(target);
            this.extraDimensions = 1;
            this.node = node;
            this.opcode = node.getOpcode();
            this.owner = Type.getObjectType(node.owner);
            this.type = Type.getType(node.desc);
            this.dimensions = this.type.getSort() == 9 ? this.type.getDimensions() : 0;
            this.isStatic = this.opcode == 178 || this.opcode == 179;
            this.isGetter = this.opcode == 178 || this.opcode == 180;
            this.isSetter = this.opcode == 179 || this.opcode == 181;
            this.description = this.isGetter ? "field getter" : this.isSetter ? "field setter" : InjectionInfo.DEFAULT_PREFIX;
        }

        int getTotalDimensions() {
            return this.dimensions + this.extraDimensions;
        }

        Type[] getArrayArgs(Type... extra) {
            int dimensions = getTotalDimensions();
            Type[] args = new Type[dimensions + extra.length];
            int i = 0;
            while (i < args.length) {
                args[i] = i == 0 ? this.type : i < dimensions ? Type.INT_TYPE : extra[dimensions - i];
                i++;
            }
            return args;
        }
    }

    public RedirectInjector(InjectionInfo info) {
        this(info, "@Redirect");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RedirectInjector(InjectionInfo info, String annotationType) {
        super(info, annotationType);
        this.ctorRedirectors = new HashMap();
        int priority = info.getContext().getPriority();
        boolean isFinal = Annotations.getVisible(this.methodNode, Final.class) != null;
        this.meta = new Meta(priority, isFinal, this.info.toString(), this.methodNode.desc);
    }

    @Override // org.spongepowered.asm.mixin.injection.invoke.InvokeInjector
    protected void checkTarget(Target target) {
    }

    @Override // org.spongepowered.asm.mixin.injection.code.Injector
    protected void addTargetNode(Target target, List<InjectionNodes.InjectionNode> myNodes, AbstractInsnNode insn, Set<InjectionPoint> nominators) {
        Meta other;
        InjectionNodes.InjectionNode node = target.getInjectionNode(insn);
        ConstructorRedirectData ctorData = null;
        int fuzz = 8;
        int opcode = 0;
        if ((insn instanceof MethodInsnNode) && Constants.CTOR.equals(((MethodInsnNode) insn).name)) {
            throw new InvalidInjectionException(this.info, String.format("Illegal %s of constructor specified on %s", this.annotationType, this));
        }
        if (node != null && (other = (Meta) node.getDecoration(Meta.KEY)) != null && other.getOwner() != this) {
            if (other.priority >= this.meta.priority) {
                Injector.logger.warn("{} conflict. Skipping {} with priority {}, already redirected by {} with priority {}", new Object[]{this.annotationType, this.info, Integer.valueOf(this.meta.priority), other.name, Integer.valueOf(other.priority)});
                return;
            } else if (other.isFinal) {
                throw new InvalidInjectionException(this.info, String.format("%s conflict: %s failed because target was already remapped by %s", this.annotationType, this, other.name));
            }
        }
        for (InjectionPoint ip : nominators) {
            if (ip instanceof BeforeNew) {
                ctorData = getCtorRedirect((BeforeNew) ip);
                ctorData.wildcard = !((BeforeNew) ip).hasDescriptor();
            } else if (ip instanceof BeforeFieldAccess) {
                BeforeFieldAccess bfa = (BeforeFieldAccess) ip;
                fuzz = bfa.getFuzzFactor();
                opcode = bfa.getArrayOpcode();
            }
        }
        InjectionNodes.InjectionNode targetNode = target.addInjectionNode(insn);
        targetNode.decorate(Meta.KEY, this.meta);
        targetNode.decorate(KEY_NOMINATORS, nominators);
        if ((insn instanceof TypeInsnNode) && insn.getOpcode() == 187) {
            targetNode.decorate(ConstructorRedirectData.KEY, ctorData);
        } else {
            targetNode.decorate(KEY_FUZZ, Integer.valueOf(fuzz));
            targetNode.decorate(KEY_OPCODE, Integer.valueOf(opcode));
        }
        myNodes.add(targetNode);
    }

    private ConstructorRedirectData getCtorRedirect(BeforeNew ip) {
        ConstructorRedirectData ctorRedirect = this.ctorRedirectors.get(ip);
        if (ctorRedirect == null) {
            ctorRedirect = new ConstructorRedirectData();
            this.ctorRedirectors.put(ip, ctorRedirect);
        }
        return ctorRedirect;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongepowered.asm.mixin.injection.invoke.InvokeInjector, org.spongepowered.asm.mixin.injection.code.Injector
    public void inject(Target target, InjectionNodes.InjectionNode node) {
        if (!preInject(node)) {
            return;
        }
        if (node.isReplaced()) {
            throw new UnsupportedOperationException("Redirector target failure for " + this.info);
        }
        if (node.getCurrentTarget() instanceof MethodInsnNode) {
            checkTargetForNode(target, node, InjectionPoint.RestrictTargetLevel.ALLOW_ALL);
            injectAtInvoke(target, node);
        } else if (node.getCurrentTarget() instanceof FieldInsnNode) {
            checkTargetForNode(target, node, InjectionPoint.RestrictTargetLevel.ALLOW_ALL);
            injectAtFieldAccess(target, node);
        } else {
            if (node.getCurrentTarget() instanceof TypeInsnNode) {
                int opcode = node.getCurrentTarget().getOpcode();
                if (opcode == 187) {
                    if (!this.isStatic && target.isStatic) {
                        throw new InvalidInjectionException(this.info, String.format("non-static callback method %s has a static target which is not supported", this));
                    }
                    injectAtConstructor(target, node);
                    return;
                } else if (opcode == 193) {
                    checkTargetModifiers(target, false);
                    injectAtInstanceOf(target, node);
                    return;
                }
            }
            throw new InvalidInjectionException(this.info, String.format("%s annotation on is targetting an invalid insn in %s in %s", this.annotationType, target, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean preInject(InjectionNodes.InjectionNode node) {
        Meta other = (Meta) node.getDecoration(Meta.KEY);
        if (other.getOwner() != this) {
            Injector.logger.warn("{} conflict. Skipping {} with priority {}, already redirected by {} with priority {}", new Object[]{this.annotationType, this.info, Integer.valueOf(this.meta.priority), other.name, Integer.valueOf(other.priority)});
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongepowered.asm.mixin.injection.code.Injector
    public void postInject(Target target, InjectionNodes.InjectionNode node) {
        super.postInject(target, node);
        if ((node.getOriginalTarget() instanceof TypeInsnNode) && node.getOriginalTarget().getOpcode() == 187) {
            ConstructorRedirectData meta = (ConstructorRedirectData) node.getDecoration(ConstructorRedirectData.KEY);
            if (meta.wildcard && meta.injected == 0) {
                throw new InvalidInjectionException(this.info, String.format("%s ctor invocation was not found in %s", this.annotationType, target), meta.lastException);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [int[], int[][]] */
    @Override // org.spongepowered.asm.mixin.injection.invoke.InvokeInjector
    protected void injectAtInvoke(Target target, InjectionNodes.InjectionNode node) {
        RedirectedInvokeData invoke = new RedirectedInvokeData(target, node.getCurrentTarget());
        validateParams(invoke, invoke.returnType, invoke.handlerArgs);
        InsnList insns = new InsnList();
        Target.Extension extraLocals = target.extendLocals().add(invoke.handlerArgs).add(1);
        Target.Extension extraStack = target.extendStack().add(1);
        int[] argMap = storeArgs(target, invoke.handlerArgs, insns, 0);
        if (invoke.captureTargetArgs > 0) {
            int argSize = Bytecode.getArgsSize(target.arguments, 0, invoke.captureTargetArgs);
            extraLocals.add(argSize);
            extraStack.add(argSize);
            argMap = Ints.concat((int[][]) new int[]{argMap, target.getArgIndices()});
        }
        AbstractInsnNode champion = invokeHandlerWithArgs(this.methodArgs, insns, argMap);
        if (invoke.coerceReturnType && invoke.returnType.getSort() >= 9) {
            insns.add(new TypeInsnNode(192, invoke.returnType.getInternalName()));
        }
        target.replaceNode(invoke.node, champion, insns);
        extraLocals.apply();
        extraStack.apply();
    }

    private void injectAtFieldAccess(Target target, InjectionNodes.InjectionNode node) {
        RedirectedFieldData field = new RedirectedFieldData(target, node.getCurrentTarget());
        int handlerDimensions = this.returnType.getSort() == 9 ? this.returnType.getDimensions() : 0;
        if (handlerDimensions > field.dimensions) {
            throw new InvalidInjectionException(this.info, "Dimensionality of handler method is greater than target array on " + this);
        }
        if (handlerDimensions == 0 && field.dimensions > 0) {
            int fuzz = ((Integer) node.getDecoration(KEY_FUZZ)).intValue();
            int opcode = ((Integer) node.getDecoration(KEY_OPCODE)).intValue();
            injectAtArrayField(field, fuzz, opcode);
            return;
        }
        injectAtScalarField(field);
    }

    private void injectAtArrayField(RedirectedFieldData field, int fuzz, int opcode) {
        Type elementType = field.type.getElementType();
        if (field.opcode != 178 && field.opcode != 180) {
            throw new InvalidInjectionException(this.info, String.format("Unspported opcode %s for array access %s", Bytecode.getOpcodeName(field.opcode), this.info));
        }
        if (this.returnType.getSort() != 0) {
            if (opcode != 190) {
                opcode = elementType.getOpcode(46);
            }
            AbstractInsnNode varNode = BeforeFieldAccess.findArrayNode(field.target.insns, field.node, opcode, fuzz);
            injectAtGetArray(field, varNode);
            return;
        }
        AbstractInsnNode varNode2 = BeforeFieldAccess.findArrayNode(field.target.insns, field.node, elementType.getOpcode(79), fuzz);
        injectAtSetArray(field, varNode2);
    }

    private void injectAtGetArray(RedirectedFieldData field, AbstractInsnNode varNode) {
        field.description = "array getter";
        field.elementType = field.type.getElementType();
        if (varNode != null && varNode.getOpcode() == 190) {
            field.elementType = Type.INT_TYPE;
            field.extraDimensions = 0;
        }
        validateParams(field, field.elementType, field.getArrayArgs(new Type[0]));
        injectArrayRedirect(field, varNode, "array getter");
    }

    private void injectAtSetArray(RedirectedFieldData field, AbstractInsnNode varNode) {
        field.description = "array setter";
        Type elementType = field.type.getElementType();
        int valueArgIndex = field.getTotalDimensions();
        if (checkCoerce(valueArgIndex, elementType, String.format("%s array setter method %s from %s", this.annotationType, this, this.info.getContext()), true)) {
            elementType = this.methodArgs[valueArgIndex];
        }
        validateParams(field, Type.VOID_TYPE, field.getArrayArgs(elementType));
        injectArrayRedirect(field, varNode, "array setter");
    }

    private void injectArrayRedirect(RedirectedFieldData field, AbstractInsnNode varNode, String type) {
        if (varNode == null) {
            throw new InvalidInjectionException(this.info, String.format("Array element %s on %s could not locate a matching %s instruction in %s. %s", this.annotationType, this, type, field.target, ""));
        }
        Target.Extension extraStack = field.target.extendStack();
        if (!this.isStatic) {
            VarInsnNode loadThis = new VarInsnNode(25, 0);
            field.target.insns.insert(field.node, loadThis);
            field.target.insns.insert(loadThis, new InsnNode(95));
            extraStack.add();
        }
        InsnList insns = new InsnList();
        if (field.captureTargetArgs > 0) {
            pushArgs(field.target.arguments, insns, field.target.getArgIndices(), 0, field.captureTargetArgs, extraStack);
        }
        extraStack.apply();
        AbstractInsnNode champion = invokeHandler(insns);
        if (field.coerceReturnType && field.type.getSort() >= 9) {
            insns.add(new TypeInsnNode(192, field.elementType.getInternalName()));
        }
        field.target.replaceNode(varNode, champion, insns);
    }

    private void injectAtScalarField(RedirectedFieldData field) {
        AbstractInsnNode invoke;
        InsnList insns = new InsnList();
        if (field.isGetter) {
            invoke = injectAtGetField(field, insns);
        } else if (field.isSetter) {
            invoke = injectAtPutField(field, insns);
        } else {
            throw new InvalidInjectionException(this.info, String.format("Unspported opcode %s for %s", Bytecode.getOpcodeName(field.opcode), this.info));
        }
        field.target.replaceNode(field.node, invoke, insns);
    }

    private AbstractInsnNode injectAtGetField(RedirectedFieldData field, InsnList insns) {
        Type type = field.type;
        Type[] typeArr = new Type[1];
        typeArr[0] = field.isStatic ? null : field.owner;
        validateParams(field, type, typeArr);
        Target.Extension extraStack = field.target.extendStack();
        if (!this.isStatic) {
            extraStack.add();
            insns.add(new VarInsnNode(25, 0));
            if (!field.isStatic) {
                insns.add(new InsnNode(95));
            }
        }
        if (field.captureTargetArgs > 0) {
            pushArgs(field.target.arguments, insns, field.target.getArgIndices(), 0, field.captureTargetArgs, extraStack);
        }
        extraStack.apply();
        AbstractInsnNode champion = invokeHandler(insns);
        if (field.coerceReturnType && field.type.getSort() >= 9) {
            insns.add(new TypeInsnNode(192, field.type.getInternalName()));
        }
        return champion;
    }

    private AbstractInsnNode injectAtPutField(RedirectedFieldData field, InsnList insns) {
        Type type = Type.VOID_TYPE;
        Type[] typeArr = new Type[2];
        typeArr[0] = field.isStatic ? null : field.owner;
        typeArr[1] = field.type;
        validateParams(field, type, typeArr);
        Target.Extension extraStack = field.target.extendStack();
        if (!this.isStatic) {
            if (field.isStatic) {
                insns.add(new VarInsnNode(25, 0));
                insns.add(new InsnNode(95));
            } else {
                extraStack.add();
                int marshallVar = field.target.allocateLocals(field.type.getSize());
                insns.add(new VarInsnNode(field.type.getOpcode(54), marshallVar));
                insns.add(new VarInsnNode(25, 0));
                insns.add(new InsnNode(95));
                insns.add(new VarInsnNode(field.type.getOpcode(21), marshallVar));
            }
        }
        if (field.captureTargetArgs > 0) {
            pushArgs(field.target.arguments, insns, field.target.getArgIndices(), 0, field.captureTargetArgs, extraStack);
        }
        extraStack.apply();
        return invokeHandler(insns);
    }

    protected void injectAtConstructor(Target target, InjectionNodes.InjectionNode node) {
        ConstructorRedirectData meta = (ConstructorRedirectData) node.getDecoration(ConstructorRedirectData.KEY);
        if (meta == null) {
            throw new InvalidInjectionException(this.info, String.format("%s ctor redirector has no metadata, the injector failed a preprocessing phase", this.annotationType));
        }
        TypeInsnNode newNode = node.getCurrentTarget();
        AbstractInsnNode dupNode = target.get(target.indexOf((AbstractInsnNode) newNode) + 1);
        MethodInsnNode initNode = target.findInitNodeFor(newNode);
        if (initNode == null) {
            meta.throwOrCollect(new InvalidInjectionException(this.info, String.format("%s ctor invocation was not found in %s", this.annotationType, target)));
            return;
        }
        boolean isAssigned = dupNode.getOpcode() == 89;
        RedirectedInvokeData ctor = new RedirectedInvokeData(target, initNode);
        ctor.description = "factory";
        try {
            validateParams(ctor, Type.getObjectType(newNode.desc), ctor.targetArgs);
            if (isAssigned) {
                target.removeNode(dupNode);
            }
            if (this.isStatic) {
                target.removeNode(newNode);
            } else {
                target.replaceNode((AbstractInsnNode) newNode, (AbstractInsnNode) new VarInsnNode(25, 0));
            }
            Target.Extension extraStack = target.extendStack();
            InsnList insns = new InsnList();
            if (ctor.captureTargetArgs > 0) {
                pushArgs(target.arguments, insns, target.getArgIndices(), 0, ctor.captureTargetArgs, extraStack);
            }
            invokeHandler(insns);
            if (ctor.coerceReturnType) {
                insns.add(new TypeInsnNode(192, newNode.desc));
            }
            extraStack.apply();
            if (isAssigned) {
                doNullCheck(insns, extraStack, "constructor handler", newNode.desc.replace('/', '.'));
            } else {
                insns.add(new InsnNode(87));
            }
            extraStack.apply();
            target.replaceNode((AbstractInsnNode) initNode, insns);
            meta.injected++;
        } catch (InvalidInjectionException ex) {
            meta.throwOrCollect(ex);
        }
    }

    protected void injectAtInstanceOf(Target target, InjectionNodes.InjectionNode node) {
        injectAtInstanceOf(target, (TypeInsnNode) node.getCurrentTarget());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void injectAtInstanceOf(Target target, TypeInsnNode typeNode) {
        if (this.returnType.getSort() == 1) {
            redirectInstanceOf(target, typeNode, false);
        } else if (this.returnType.equals(Type.getType(Constants.CLASS_DESC))) {
            redirectInstanceOf(target, typeNode, true);
        } else {
            throw new InvalidInjectionException(this.info, String.format("%s on %s has an invalid signature. Found unexpected return type %s. INSTANCEOF handler expects (Ljava/lang/Object;Ljava/lang/Class;)Z or (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Class;", this.annotationType, this, SignaturePrinter.getTypeName(this.returnType)));
        }
    }

    private void redirectInstanceOf(Target target, TypeInsnNode typeNode, boolean dynamic) {
        Target.Extension extraStack = target.extendStack();
        InsnList insns = new InsnList();
        Injector.InjectorData handler = new Injector.InjectorData(target, "instanceof handler", false);
        validateParams(handler, this.returnType, Type.getType(Constants.OBJECT_DESC), Type.getType(Constants.CLASS_DESC));
        if (dynamic) {
            insns.add(new InsnNode(89));
            extraStack.add();
        }
        if (!this.isStatic) {
            insns.add(new VarInsnNode(25, 0));
            insns.add(new InsnNode(95));
            extraStack.add();
        }
        insns.add(new LdcInsnNode(Type.getObjectType(typeNode.desc)));
        extraStack.add();
        if (handler.captureTargetArgs > 0) {
            pushArgs(target.arguments, insns, target.getArgIndices(), 0, handler.captureTargetArgs, extraStack);
        }
        AbstractInsnNode champion = invokeHandler(insns);
        if (dynamic) {
            doNullCheck(insns, extraStack, "instanceof handler", "class type");
            checkIsAssignableFrom(insns, extraStack);
        }
        target.replaceNode(typeNode, champion, insns);
        extraStack.apply();
    }

    private void checkIsAssignableFrom(InsnList insns, Target.Extension extraStack) {
        LabelNode objectIsNull = new LabelNode();
        LabelNode checkComplete = new LabelNode();
        insns.add(new InsnNode(95));
        insns.add(new InsnNode(89));
        extraStack.add();
        insns.add(new JumpInsnNode(198, objectIsNull));
        insns.add(new MethodInsnNode(182, Constants.OBJECT, GET_CLASS_METHOD, "()Ljava/lang/Class;", false));
        insns.add(new MethodInsnNode(182, Constants.CLASS, IS_ASSIGNABLE_FROM_METHOD, "(Ljava/lang/Class;)Z", false));
        insns.add(new JumpInsnNode(167, checkComplete));
        insns.add(objectIsNull);
        insns.add(new InsnNode(87));
        insns.add(new InsnNode(87));
        insns.add(new InsnNode(3));
        insns.add(checkComplete);
        extraStack.add();
    }

    private void doNullCheck(InsnList insns, Target.Extension extraStack, String type, String value) {
        LabelNode nullCheckSucceeded = new LabelNode();
        insns.add(new InsnNode(89));
        insns.add(new JumpInsnNode(199, nullCheckSucceeded));
        throwException(insns, NPE, String.format("%s %s %s returned null for %s", this.annotationType, type, this, value));
        insns.add(nullCheckSucceeded);
        extraStack.add();
    }
}
