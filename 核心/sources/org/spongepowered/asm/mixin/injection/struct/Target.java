package org.spongepowered.asm.mixin.injection.struct;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Label;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.transformer.ClassInfo;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.Constants;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/struct/Target.class */
public class Target implements Comparable<Target>, Iterable<AbstractInsnNode> {
    public final ClassNode classNode;
    public final MethodNode method;
    public final InsnList insns;
    public final boolean isStatic;
    public final boolean isCtor;
    public final Type[] arguments;
    public final Type returnType;
    private final int maxStack;
    private final int maxLocals;
    private final InjectionNodes injectionNodes = new InjectionNodes();
    private String callbackInfoClass;
    private String callbackDescriptor;
    private int[] argIndices;
    private List<Integer> argMapVars;
    private LabelNode start;
    private LabelNode end;
    private Bytecode.DelegateInitialiser delegateInitialiser;

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/struct/Target$Extension.class */
    public class Extension {
        private final boolean locals;
        private int size;

        Extension(boolean locals) {
            this.locals = locals;
        }

        public Extension add() {
            this.size++;
            return this;
        }

        public Extension add(int size) {
            this.size += size;
            return this;
        }

        public Extension add(Type[] types) {
            return add(Bytecode.getArgsSize(types));
        }

        public Extension set(int size) {
            this.size = size;
            return this;
        }

        public int get() {
            return this.size;
        }

        public void apply() {
            if (this.locals) {
                Target.this.extendLocalsBy(this.size);
            } else {
                Target.this.extendStackBy(this.size);
            }
            this.size = 0;
        }
    }

    public Target(ClassNode classNode, MethodNode method) {
        this.classNode = classNode;
        this.method = method;
        this.insns = method.instructions;
        this.isStatic = Bytecode.isStatic(method);
        this.isCtor = method.name.equals(Constants.CTOR);
        this.arguments = Type.getArgumentTypes(method.desc);
        this.returnType = Type.getReturnType(method.desc);
        this.maxStack = method.maxStack;
        this.maxLocals = method.maxLocals;
    }

    public InjectionNodes.InjectionNode addInjectionNode(AbstractInsnNode node) {
        return this.injectionNodes.add(node);
    }

    public InjectionNodes.InjectionNode getInjectionNode(AbstractInsnNode node) {
        return this.injectionNodes.get(node);
    }

    public int getMaxLocals() {
        return this.maxLocals;
    }

    public int getMaxStack() {
        return this.maxStack;
    }

    public int getCurrentMaxLocals() {
        return this.method.maxLocals;
    }

    public int getCurrentMaxStack() {
        return this.method.maxStack;
    }

    public int allocateLocal() {
        return allocateLocals(1);
    }

    public int allocateLocals(int locals) {
        int nextLocal = this.method.maxLocals;
        this.method.maxLocals += locals;
        return nextLocal;
    }

    public Extension extendLocals() {
        return new Extension(true);
    }

    public Extension extendStack() {
        return new Extension(false);
    }

    void extendLocalsBy(int locals) {
        setMaxLocals(this.maxLocals + locals);
    }

    private void setMaxLocals(int maxLocals) {
        if (maxLocals > this.method.maxLocals) {
            this.method.maxLocals = maxLocals;
        }
    }

    void extendStackBy(int stack) {
        setMaxStack(this.maxStack + stack);
    }

    private void setMaxStack(int maxStack) {
        if (maxStack > this.method.maxStack) {
            this.method.maxStack = maxStack;
        }
    }

    public int[] generateArgMap(Type[] args, int start) {
        if (this.argMapVars == null) {
            this.argMapVars = new ArrayList();
        }
        int[] argMap = new int[args.length];
        int index = 0;
        for (int arg = start; arg < args.length; arg++) {
            int size = args[arg].getSize();
            argMap[arg] = allocateArgMapLocal(index, size);
            index += size;
        }
        return argMap;
    }

    private int allocateArgMapLocal(int index, int size) {
        if (index >= this.argMapVars.size()) {
            int base = allocateLocals(size);
            for (int offset = 0; offset < size; offset++) {
                this.argMapVars.add(Integer.valueOf(base + offset));
            }
            return base;
        }
        int local = this.argMapVars.get(index).intValue();
        if (size > 1 && index + size > this.argMapVars.size()) {
            int nextLocal = allocateLocals(1);
            if (nextLocal == local + 1) {
                this.argMapVars.add(Integer.valueOf(nextLocal));
                return local;
            }
            this.argMapVars.set(index, Integer.valueOf(nextLocal));
            this.argMapVars.add(Integer.valueOf(allocateLocals(1)));
            return nextLocal;
        }
        return local;
    }

    public int[] getArgIndices() {
        if (this.argIndices == null) {
            this.argIndices = calcArgIndices(this.isStatic ? 0 : 1);
        }
        return this.argIndices;
    }

    private int[] calcArgIndices(int local) {
        int[] argIndices = new int[this.arguments.length];
        for (int arg = 0; arg < this.arguments.length; arg++) {
            argIndices[arg] = local;
            local += this.arguments[arg].getSize();
        }
        return argIndices;
    }

    public String getCallbackInfoClass() {
        if (this.callbackInfoClass == null) {
            this.callbackInfoClass = CallbackInfo.getCallInfoClassName(this.returnType);
        }
        return this.callbackInfoClass;
    }

    public String getSimpleCallbackDescriptor() {
        return String.format("(L%s;)V", getCallbackInfoClass());
    }

    public String getCallbackDescriptor(Type[] locals, Type[] argumentTypes) {
        return getCallbackDescriptor(false, locals, argumentTypes, 0, 32767);
    }

    public String getCallbackDescriptor(boolean captureLocals, Type[] locals, Type[] argumentTypes, int startIndex, int extra) {
        if (this.callbackDescriptor == null) {
            this.callbackDescriptor = String.format("(%sL%s;)V", this.method.desc.substring(1, this.method.desc.indexOf(41)), getCallbackInfoClass());
        }
        if (!captureLocals || locals == null) {
            return this.callbackDescriptor;
        }
        StringBuilder descriptor = new StringBuilder(this.callbackDescriptor.substring(0, this.callbackDescriptor.indexOf(41)));
        for (int l = startIndex; l < locals.length && extra > 0; l++) {
            if (locals[l] != null) {
                descriptor.append(locals[l].getDescriptor());
                extra--;
            }
        }
        return descriptor.append(")V").toString();
    }

    public String toString() {
        return String.format("%s::%s%s", this.classNode.name, this.method.name, this.method.desc);
    }

    @Override // java.lang.Comparable
    public int compareTo(Target o) {
        if (o == null) {
            return Integer.MAX_VALUE;
        }
        return toString().compareTo(o.toString());
    }

    public int indexOf(InjectionNodes.InjectionNode node) {
        return this.insns.indexOf(node.getCurrentTarget());
    }

    public int indexOf(AbstractInsnNode insn) {
        return this.insns.indexOf(insn);
    }

    public AbstractInsnNode get(int index) {
        return this.insns.get(index);
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractInsnNode> iterator() {
        return this.insns.iterator();
    }

    public MethodInsnNode findInitNodeFor(TypeInsnNode newNode) {
        int start = indexOf((AbstractInsnNode) newNode);
        Iterator<AbstractInsnNode> iter = this.insns.iterator(start);
        while (iter.hasNext()) {
            AbstractInsnNode next = iter.next();
            if ((next instanceof MethodInsnNode) && next.getOpcode() == 183) {
                MethodInsnNode methodNode = (MethodInsnNode) next;
                if (Constants.CTOR.equals(methodNode.name) && methodNode.owner.equals(newNode.desc)) {
                    return methodNode;
                }
            }
        }
        return null;
    }

    public Bytecode.DelegateInitialiser findDelegateInitNode() {
        if (!this.isCtor) {
            return null;
        }
        if (this.delegateInitialiser == null) {
            String superName = ClassInfo.forName(this.classNode.name).getSuperName();
            this.delegateInitialiser = Bytecode.findDelegateInit(this.method, superName, this.classNode.name);
        }
        return this.delegateInitialiser;
    }

    public void insertBefore(InjectionNodes.InjectionNode location, InsnList insns) {
        this.insns.insertBefore(location.getCurrentTarget(), insns);
    }

    public void insertBefore(AbstractInsnNode location, InsnList insns) {
        this.insns.insertBefore(location, insns);
    }

    public void replaceNode(AbstractInsnNode location, AbstractInsnNode insn) {
        this.insns.insertBefore(location, insn);
        this.insns.remove(location);
        this.injectionNodes.replace(location, insn);
    }

    public void replaceNode(AbstractInsnNode location, AbstractInsnNode champion, InsnList insns) {
        this.insns.insertBefore(location, insns);
        this.insns.remove(location);
        this.injectionNodes.replace(location, champion);
    }

    public void wrapNode(AbstractInsnNode location, AbstractInsnNode champion, InsnList before, InsnList after) {
        this.insns.insertBefore(location, before);
        this.insns.insert(location, after);
        this.injectionNodes.replace(location, champion);
    }

    public void replaceNode(AbstractInsnNode location, InsnList insns) {
        this.insns.insertBefore(location, insns);
        removeNode(location);
    }

    public void removeNode(AbstractInsnNode insn) {
        this.insns.remove(insn);
        this.injectionNodes.remove(insn);
    }

    public void addLocalVariable(int index, String name, String desc) {
        if (this.start == null) {
            this.start = new LabelNode(new Label());
            this.end = new LabelNode(new Label());
            this.insns.insert(this.start);
            this.insns.add(this.end);
        }
        addLocalVariable(index, name, desc, this.start, this.end);
    }

    private void addLocalVariable(int index, String name, String desc, LabelNode start, LabelNode end) {
        if (this.method.localVariables == null) {
            this.method.localVariables = new ArrayList();
        }
        this.method.localVariables.add(new LocalVariableNode(name, desc, (String) null, start, end, index));
    }
}
