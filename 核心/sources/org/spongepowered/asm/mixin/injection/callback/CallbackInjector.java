package org.spongepowered.asm.mixin.injection.callback;

import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.injection.Coerce;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.Surrogate;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.injection.throwables.InjectionError;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.Constants;
import org.spongepowered.asm.util.Locals;
import org.spongepowered.asm.util.PrettyPrinter;
import org.spongepowered.asm.util.SignaturePrinter;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/callback/CallbackInjector.class */
public class CallbackInjector extends Injector {
    private final boolean cancellable;
    private final LocalCapture localCapture;
    private final String identifier;
    private final Map<Integer, String> ids;
    private int totalInjections;
    private int callbackInfoVar;
    private String lastId;
    private String lastDesc;
    private Target lastTarget;
    private String callbackInfoClass;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/callback/CallbackInjector$Callback.class */
    public class Callback extends InsnList {
        private final MethodNode handler;
        private final AbstractInsnNode head;
        final Target target;
        final InjectionNodes.InjectionNode node;
        final LocalVariableNode[] locals;
        final Type[] localTypes;
        final int frameSize;
        final int extraArgs;
        final boolean canCaptureLocals;
        final boolean isAtReturn;
        final String desc;
        final String descl;
        final String[] argNames;
        Target.Extension ctor;
        Target.Extension invoke;
        private int marshalVar = -1;
        private boolean captureArgs = true;

        Callback(MethodNode handler, Target target, InjectionNodes.InjectionNode node, LocalVariableNode[] locals, boolean captureLocals) {
            this.handler = handler;
            this.target = target;
            this.head = target.insns.getFirst();
            this.node = node;
            this.locals = locals;
            this.localTypes = locals != null ? new Type[locals.length] : null;
            this.frameSize = Bytecode.getFirstNonArgLocalIndex(target.arguments, !target.isStatic);
            List<String> argNames = null;
            if (locals != null) {
                int baseArgIndex = CallbackInjector.this.isStatic() ? 0 : 1;
                argNames = new ArrayList<>();
                for (int l = 0; l <= locals.length; l++) {
                    if (l == this.frameSize) {
                        argNames.add(target.returnType == Type.VOID_TYPE ? "ci" : "cir");
                    }
                    if (l < locals.length && locals[l] != null) {
                        this.localTypes[l] = Type.getType(locals[l].desc);
                        if (l >= baseArgIndex) {
                            argNames.add(CallbackInjector.meltSnowman(l, locals[l].name));
                        }
                    }
                }
            }
            Type[] handlerArgs = Type.getArgumentTypes(this.handler.desc);
            this.extraArgs = Math.max(0, (handlerArgs.length - target.arguments.length) - 1);
            this.argNames = argNames != null ? (String[]) argNames.toArray(new String[argNames.size()]) : null;
            this.canCaptureLocals = captureLocals && locals != null && locals.length > this.frameSize;
            this.isAtReturn = (this.node.getCurrentTarget() instanceof InsnNode) && isValueReturnOpcode(this.node.getCurrentTarget().getOpcode());
            this.desc = target.getCallbackDescriptor(this.localTypes, target.arguments);
            this.descl = target.getCallbackDescriptor(true, this.localTypes, target.arguments, this.frameSize, this.extraArgs);
            this.invoke = target.extendStack();
            this.ctor = target.extendStack();
            this.invoke.add(target.arguments.length);
            if (this.canCaptureLocals) {
                this.invoke.add(this.localTypes.length - this.frameSize);
            }
        }

        private boolean isValueReturnOpcode(int opcode) {
            return opcode >= 172 && opcode < 177;
        }

        String getDescriptor() {
            return this.canCaptureLocals ? this.descl : this.desc;
        }

        String getDescriptorWithAllLocals() {
            return this.target.getCallbackDescriptor(true, this.localTypes, this.target.arguments, this.frameSize, 32767);
        }

        String getCallbackInfoConstructorDescriptor() {
            return this.isAtReturn ? CallbackInfo.getConstructorDescriptor(this.target.returnType) : CallbackInfo.getConstructorDescriptor();
        }

        void add(AbstractInsnNode insn, boolean ctorStack, boolean invokeStack) {
            add(insn, ctorStack, invokeStack, false);
        }

        void add(AbstractInsnNode insn, boolean ctorStack, boolean invokeStack, boolean head) {
            if (head) {
                this.target.insns.insertBefore(this.head, insn);
            } else {
                add(insn);
            }
            if (ctorStack) {
                this.ctor.add();
            }
            if (invokeStack) {
                this.invoke.add();
            }
        }

        void inject() {
            this.target.insertBefore(this.node, this);
            this.invoke.apply();
            this.ctor.apply();
        }

        boolean checkDescriptor(String desc) {
            if (getDescriptor().equals(desc)) {
                return true;
            }
            if (this.target.getSimpleCallbackDescriptor().equals(desc) && !this.canCaptureLocals) {
                this.captureArgs = false;
                return true;
            }
            Type[] inTypes = Type.getArgumentTypes(desc);
            Type[] myTypes = Type.getArgumentTypes(this.descl);
            if (inTypes.length != myTypes.length) {
                return false;
            }
            for (int arg = 0; arg < myTypes.length; arg++) {
                Type type = inTypes[arg];
                if (!type.equals(myTypes[arg]) && (type.getSort() == 9 || Annotations.getInvisibleParameter(this.handler, Coerce.class, arg) == null || !Injector.canCoerce(inTypes[arg], myTypes[arg]))) {
                    return false;
                }
            }
            return true;
        }

        boolean captureArgs() {
            return this.captureArgs;
        }

        int marshalVar() {
            if (this.marshalVar < 0) {
                this.marshalVar = this.target.allocateLocal();
            }
            return this.marshalVar;
        }
    }

    public CallbackInjector(InjectionInfo info, boolean cancellable, LocalCapture localCapture, String identifier) {
        super(info, "@Inject");
        this.ids = new HashMap();
        this.totalInjections = 0;
        this.callbackInfoVar = -1;
        this.cancellable = cancellable;
        this.localCapture = localCapture;
        this.identifier = identifier;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongepowered.asm.mixin.injection.code.Injector
    public void sanityCheck(Target target, List<InjectionPoint> injectionPoints) {
        super.sanityCheck(target, injectionPoints);
        checkTargetModifiers(target, true);
    }

    @Override // org.spongepowered.asm.mixin.injection.code.Injector
    protected void addTargetNode(Target target, List<InjectionNodes.InjectionNode> myNodes, AbstractInsnNode node, Set<InjectionPoint> nominators) {
        InjectionNodes.InjectionNode injectionNode = target.addInjectionNode(node);
        Iterator<InjectionPoint> it = nominators.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InjectionPoint ip = it.next();
            try {
                checkTargetForNode(target, injectionNode, ip.getTargetRestriction(this.info));
                String id = ip.getId();
                if (!Strings.isNullOrEmpty(id)) {
                    String existingId = this.ids.get(Integer.valueOf(injectionNode.getId()));
                    if (existingId != null && !existingId.equals(id)) {
                        Injector.logger.warn("Conflicting id for {} insn in {}, found id {} on {}, previously defined as {}", new Object[]{Bytecode.getOpcodeName(node), target.toString(), id, this.info, existingId});
                        break;
                    }
                    this.ids.put(Integer.valueOf(injectionNode.getId()), id);
                }
            } catch (InvalidInjectionException ex) {
                throw new InvalidInjectionException(this.info, String.format("%s selector %s", ip, ex.getMessage()));
            }
        }
        myNodes.add(injectionNode);
        this.totalInjections++;
    }

    @Override // org.spongepowered.asm.mixin.injection.code.Injector
    protected void inject(Target target, InjectionNodes.InjectionNode node) {
        LocalVariableNode[] locals = null;
        if (this.localCapture.isCaptureLocals() || this.localCapture.isPrintLocals()) {
            locals = Locals.getLocalsAt(this.classNode, target.method, node.getCurrentTarget());
            for (int j = 0; j < locals.length; j++) {
                if (locals[j] != null && locals[j].desc != null && locals[j].desc.startsWith("Lorg/spongepowered/asm/mixin/injection/callback/")) {
                    locals[j] = null;
                }
            }
        }
        inject(new Callback(this.methodNode, target, node, locals, this.localCapture.isCaptureLocals()));
    }

    private void inject(Callback callback) {
        if (this.localCapture.isPrintLocals()) {
            printLocals(callback);
            this.info.addCallbackInvocation(this.methodNode);
            return;
        }
        MethodNode callbackMethod = this.methodNode;
        if (!callback.checkDescriptor(this.methodNode.desc)) {
            if (this.info.getTargets().size() > 1) {
                return;
            }
            if (callback.canCaptureLocals) {
                MethodNode surrogateHandler = Bytecode.findMethod(this.classNode, this.methodNode.name, callback.getDescriptor());
                if (surrogateHandler != null && Annotations.getVisible(surrogateHandler, Surrogate.class) != null) {
                    callbackMethod = surrogateHandler;
                } else {
                    String message = generateBadLVTMessage(callback);
                    switch (this.localCapture) {
                        case CAPTURE_FAILEXCEPTION:
                            Injector.logger.error("Injection error: {}", new Object[]{message});
                            callbackMethod = generateErrorMethod(callback, "org/spongepowered/asm/mixin/injection/throwables/InjectionError", message);
                            break;
                        case CAPTURE_FAILSOFT:
                            Injector.logger.warn("Injection warning: {}", new Object[]{message});
                            return;
                        default:
                            Injector.logger.error("Critical injection failure: {}", new Object[]{message});
                            throw new InjectionError(message);
                    }
                }
            } else {
                String returnableSig = this.methodNode.desc.replace("Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;", "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;");
                if (callback.checkDescriptor(returnableSig)) {
                    throw new InvalidInjectionException(this.info, "Invalid descriptor on " + this.info + "! CallbackInfoReturnable is required!");
                }
                MethodNode surrogateHandler2 = Bytecode.findMethod(this.classNode, this.methodNode.name, callback.getDescriptor());
                if (surrogateHandler2 != null && Annotations.getVisible(surrogateHandler2, Surrogate.class) != null) {
                    callbackMethod = surrogateHandler2;
                } else {
                    throw new InvalidInjectionException(this.info, "Invalid descriptor on " + this.info + "! Expected " + callback.getDescriptor() + " but found " + this.methodNode.desc);
                }
            }
        }
        dupReturnValue(callback);
        if (this.cancellable || this.totalInjections > 1) {
            createCallbackInfo(callback, true);
        }
        invokeCallback(callback, callbackMethod);
        injectCancellationCode(callback);
        callback.inject();
        this.info.notifyInjected(callback.target);
    }

    private String generateBadLVTMessage(Callback callback) {
        int position = callback.target.indexOf(callback.node);
        List<String> expected = summariseLocals(this.methodNode.desc, callback.target.arguments.length + 1);
        List<String> found = summariseLocals(callback.getDescriptor(), callback.frameSize + (callback.target.isStatic ? 1 : 0));
        if (expected.equals(found)) {
            return String.format("Invalid descriptor on %s! Expected %s but found %s", this.info, callback.getDescriptor(), this.methodNode.desc);
        }
        return String.format("LVT in %s has incompatible changes at opcode %d in callback %s.\nExpected: %s\n   Found: %s", callback.target, Integer.valueOf(position), this, expected, found);
    }

    private MethodNode generateErrorMethod(Callback callback, String errorClass, String message) {
        MethodNode method = this.info.addMethod(this.methodNode.access, this.methodNode.name + "$missing", callback.getDescriptor());
        method.maxLocals = Bytecode.getFirstNonArgLocalIndex(Type.getArgumentTypes(callback.getDescriptor()), !this.isStatic);
        method.maxStack = 3;
        InsnList insns = method.instructions;
        insns.add(new TypeInsnNode(187, errorClass));
        insns.add(new InsnNode(89));
        insns.add(new LdcInsnNode(message));
        insns.add(new MethodInsnNode(183, errorClass, Constants.CTOR, "(Ljava/lang/String;)V", false));
        insns.add(new InsnNode(191));
        return method;
    }

    private void printLocals(Callback callback) {
        Type[] args = Type.getArgumentTypes(callback.getDescriptorWithAllLocals());
        SignaturePrinter methodSig = new SignaturePrinter(callback.target.method, callback.argNames);
        SignaturePrinter handlerSig = new SignaturePrinter(this.info.getMethodName(), callback.target.returnType, args, callback.argNames);
        handlerSig.setModifiers(this.methodNode);
        PrettyPrinter printer = new PrettyPrinter();
        printer.kv("Target Class", this.classNode.name.replace('/', '.'));
        printer.kv("Target Method", methodSig);
        printer.kv("Target Max LOCALS", Integer.valueOf(callback.target.getMaxLocals()));
        printer.kv("Initial Frame Size", Integer.valueOf(callback.frameSize));
        printer.kv("Callback Name", this.info.getMethodName());
        printer.kv("Instruction", "%s %s", callback.node.getClass().getSimpleName(), Bytecode.getOpcodeName(callback.node.getCurrentTarget().getOpcode()));
        printer.hr();
        if (callback.locals.length > callback.frameSize) {
            printer.add("  %s  %20s  %s", "LOCAL", "TYPE", "NAME");
            int l = 0;
            while (l < callback.locals.length) {
                String marker = l == callback.frameSize ? ">" : " ";
                if (callback.locals[l] != null) {
                    Object[] objArr = new Object[5];
                    objArr[0] = marker;
                    objArr[1] = Integer.valueOf(l);
                    objArr[2] = SignaturePrinter.getTypeName(callback.localTypes[l], false);
                    objArr[3] = meltSnowman(l, callback.locals[l].name);
                    objArr[4] = l >= callback.frameSize ? "<capture>" : "";
                    printer.add("%s [%3d]  %20s  %-50s %s", objArr);
                } else {
                    boolean isTop = l > 0 && callback.localTypes[l - 1] != null && callback.localTypes[l - 1].getSize() > 1;
                    Object[] objArr2 = new Object[3];
                    objArr2[0] = marker;
                    objArr2[1] = Integer.valueOf(l);
                    objArr2[2] = isTop ? "<top>" : "-";
                    printer.add("%s [%3d]  %20s", objArr2);
                }
                l++;
            }
            printer.hr();
        }
        printer.add().add("/**").add(" * Expected callback signature").add(" * /");
        printer.add("%s {", handlerSig);
        printer.add("    // Method body").add("}").add().print(System.err);
    }

    private void createCallbackInfo(Callback callback, boolean store) {
        if (callback.target != this.lastTarget) {
            this.lastId = null;
            this.lastDesc = null;
        }
        this.lastTarget = callback.target;
        String id = getIdentifier(callback);
        String desc = callback.getCallbackInfoConstructorDescriptor();
        if (id.equals(this.lastId) && desc.equals(this.lastDesc) && !callback.isAtReturn && !this.cancellable) {
            return;
        }
        instanceCallbackInfo(callback, id, desc, store);
    }

    private void loadOrCreateCallbackInfo(Callback callback) {
        if (this.cancellable || this.totalInjections > 1) {
            callback.add(new VarInsnNode(25, this.callbackInfoVar), false, true);
        } else {
            createCallbackInfo(callback, false);
        }
    }

    private void dupReturnValue(Callback callback) {
        if (!callback.isAtReturn) {
            return;
        }
        int dupCode = callback.target.returnType.getSize() == 1 ? 89 : 92;
        callback.add(new InsnNode(dupCode));
        callback.add(new VarInsnNode(callback.target.returnType.getOpcode(54), callback.marshalVar()));
    }

    protected void instanceCallbackInfo(Callback callback, String id, String desc, boolean store) {
        this.lastId = id;
        this.lastDesc = desc;
        this.callbackInfoVar = callback.marshalVar();
        this.callbackInfoClass = callback.target.getCallbackInfoClass();
        boolean head = store && this.totalInjections > 1 && !callback.isAtReturn && !this.cancellable;
        callback.add(new TypeInsnNode(187, this.callbackInfoClass), true, !store, head);
        callback.add(new InsnNode(89), true, true, head);
        callback.add(new LdcInsnNode(id), true, !store, head);
        callback.add(new InsnNode(this.cancellable ? 4 : 3), true, !store, head);
        if (callback.isAtReturn) {
            callback.add(new VarInsnNode(callback.target.returnType.getOpcode(21), callback.marshalVar()), true, !store);
            callback.add(new MethodInsnNode(183, this.callbackInfoClass, Constants.CTOR, desc, false));
        } else {
            callback.add(new MethodInsnNode(183, this.callbackInfoClass, Constants.CTOR, desc, false), false, false, head);
        }
        if (store) {
            callback.target.addLocalVariable(this.callbackInfoVar, "callbackInfo" + this.callbackInfoVar, "L" + this.callbackInfoClass + ";");
            callback.add(new VarInsnNode(58, this.callbackInfoVar), false, false, head);
        }
    }

    private void invokeCallback(Callback callback, MethodNode callbackMethod) {
        if (!this.isStatic) {
            callback.add(new VarInsnNode(25, 0), false, true);
        }
        if (callback.captureArgs()) {
            Bytecode.loadArgs(callback.target.arguments, callback, this.isStatic ? 0 : 1, -1);
        }
        loadOrCreateCallbackInfo(callback);
        if (callback.canCaptureLocals) {
            Locals.loadLocals(callback.localTypes, callback, callback.frameSize, callback.extraArgs);
        }
        invokeHandler(callback, callbackMethod);
    }

    private String getIdentifier(Callback callback) {
        String baseId = Strings.isNullOrEmpty(this.identifier) ? callback.target.method.name : this.identifier;
        String locationId = this.ids.get(Integer.valueOf(callback.node.getId()));
        return baseId + (Strings.isNullOrEmpty(locationId) ? "" : ":" + locationId);
    }

    protected void injectCancellationCode(Callback callback) {
        if (!this.cancellable) {
            return;
        }
        callback.add(new VarInsnNode(25, this.callbackInfoVar));
        callback.add(new MethodInsnNode(182, this.callbackInfoClass, CallbackInfo.getIsCancelledMethodName(), CallbackInfo.getIsCancelledMethodSig(), false));
        LabelNode notCancelled = new LabelNode();
        callback.add(new JumpInsnNode(153, notCancelled));
        injectReturnCode(callback);
        callback.add(notCancelled);
    }

    protected void injectReturnCode(Callback callback) {
        if (callback.target.returnType.equals(Type.VOID_TYPE)) {
            callback.add(new InsnNode(177));
            return;
        }
        callback.add(new VarInsnNode(25, callback.marshalVar()));
        String accessor = CallbackInfoReturnable.getReturnAccessor(callback.target.returnType);
        String descriptor = CallbackInfoReturnable.getReturnDescriptor(callback.target.returnType);
        callback.add(new MethodInsnNode(182, this.callbackInfoClass, accessor, descriptor, false));
        if (callback.target.returnType.getSort() >= 9) {
            callback.add(new TypeInsnNode(192, callback.target.returnType.getInternalName()));
        }
        callback.add(new InsnNode(callback.target.returnType.getOpcode(172)));
    }

    protected boolean isStatic() {
        return this.isStatic;
    }

    private static List<String> summariseLocals(String desc, int pos) {
        return summariseLocals(Type.getArgumentTypes(desc), pos);
    }

    private static List<String> summariseLocals(Type[] locals, int pos) {
        List<String> list = new ArrayList<>();
        if (locals != null) {
            while (pos < locals.length) {
                if (locals[pos] != null) {
                    list.add(locals[pos].toString());
                }
                pos++;
            }
        }
        return list;
    }

    static String meltSnowman(int index, String varName) {
        return (varName == null || 9731 != varName.charAt(0)) ? varName : "var" + index;
    }
}
