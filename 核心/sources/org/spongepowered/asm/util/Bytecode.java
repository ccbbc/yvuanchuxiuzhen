package org.spongepowered.asm.util;

import com.google.common.base.Joiner;
import com.google.common.primitives.Ints;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.FrameNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.objectweb.asm.util.CheckClassAdapter;
import org.objectweb.asm.util.TraceClassVisitor;
import org.spongepowered.asm.util.asm.ASM;
import org.spongepowered.asm.util.throwables.SyntheticBridgeException;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/util/Bytecode.class */
public final class Bytecode {
    public static final int[] CONSTANTS_INT = {2, 3, 4, 5, 6, 7, 8};
    public static final int[] CONSTANTS_FLOAT = {11, 12, 13};
    public static final int[] CONSTANTS_DOUBLE = {14, 15};
    public static final int[] CONSTANTS_LONG = {9, 10};
    public static final int[] CONSTANTS_ALL = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 192, 193};
    private static final Object[] CONSTANTS_VALUES = {Type.VOID_TYPE, -1, 0, 1, 2, 3, 4, 5, 0L, 1L, Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(2.0f), Double.valueOf(0.0d), Double.valueOf(1.0d)};
    private static final String[] CONSTANTS_TYPES = {null, "I", "I", "I", "I", "I", "I", "I", "J", "J", "F", "F", "F", "D", "D", "I", "I"};
    private static final String[] BOXING_TYPES = {null, "java/lang/Boolean", "java/lang/Character", "java/lang/Byte", "java/lang/Short", "java/lang/Integer", "java/lang/Float", "java/lang/Long", "java/lang/Double", null, null, null};
    private static final String[] UNBOXING_METHODS = {null, "booleanValue", "charValue", "byteValue", "shortValue", "intValue", "floatValue", "longValue", "doubleValue", null, null, null};

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/util/Bytecode$Visibility.class */
    public enum Visibility {
        PRIVATE(2),
        PROTECTED(4),
        PACKAGE(0),
        PUBLIC(1);
        
        static final int MASK = 7;
        final int access;

        Visibility(int access) {
            this.access = access;
        }

        public boolean isAtLeast(Visibility other) {
            return other == null || other.ordinal() <= ordinal();
        }
    }

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/util/Bytecode$DelegateInitialiser.class */
    public static class DelegateInitialiser {
        public static final DelegateInitialiser NONE = new DelegateInitialiser(null, false);
        public final MethodInsnNode insn;
        public final boolean isSuper;
        public final boolean isPresent;

        DelegateInitialiser(MethodInsnNode insn, boolean isSuper) {
            this.insn = insn;
            this.isSuper = isSuper;
            this.isPresent = insn != null;
        }

        public String toString() {
            return this.isSuper ? "super" : "this";
        }
    }

    private Bytecode() {
    }

    public static MethodNode findMethod(ClassNode classNode, String name, String desc) {
        for (MethodNode method : classNode.methods) {
            if (method.name.equals(name) && method.desc.equals(desc)) {
                return method;
            }
        }
        return null;
    }

    public static AbstractInsnNode findInsn(MethodNode method, int opcode) {
        Iterator<AbstractInsnNode> findReturnIter = method.instructions.iterator();
        while (findReturnIter.hasNext()) {
            AbstractInsnNode insn = findReturnIter.next();
            if (insn.getOpcode() == opcode) {
                return insn;
            }
        }
        return null;
    }

    public static DelegateInitialiser findDelegateInit(MethodNode ctor, String superName, String ownerName) {
        if (!Constants.CTOR.equals(ctor.name)) {
            return DelegateInitialiser.NONE;
        }
        int news = 0;
        Iterator<AbstractInsnNode> iter = ctor.instructions.iterator();
        while (iter.hasNext()) {
            AbstractInsnNode next = iter.next();
            if ((next instanceof TypeInsnNode) && next.getOpcode() == 187) {
                news++;
            } else if ((next instanceof MethodInsnNode) && next.getOpcode() == 183) {
                MethodInsnNode methodNode = (MethodInsnNode) next;
                if (!Constants.CTOR.equals(methodNode.name)) {
                    continue;
                } else if (news > 0) {
                    news--;
                } else {
                    boolean isSuper = methodNode.owner.equals(superName);
                    if (isSuper || methodNode.owner.equals(ownerName)) {
                        return new DelegateInitialiser(methodNode, isSuper);
                    }
                }
            }
        }
        return DelegateInitialiser.NONE;
    }

    public static void textify(ClassNode classNode, OutputStream out) {
        classNode.accept(new TraceClassVisitor(new PrintWriter(out)));
    }

    public static void textify(MethodNode methodNode, OutputStream out) {
        TraceClassVisitor trace = new TraceClassVisitor(new PrintWriter(out));
        MethodVisitor mv = trace.visitMethod(methodNode.access, methodNode.name, methodNode.desc, methodNode.signature, (String[]) methodNode.exceptions.toArray(new String[0]));
        methodNode.accept(mv);
        trace.visitEnd();
    }

    public static void dumpClass(ClassNode classNode) {
        ClassWriter cw = new ClassWriter(3);
        classNode.accept(cw);
        dumpClass(cw.toByteArray());
    }

    public static void dumpClass(byte[] bytes) {
        ClassReader cr = new ClassReader(bytes);
        CheckClassAdapter.verify(cr, true, new PrintWriter(System.out));
    }

    public static void printMethodWithOpcodeIndices(MethodNode method) {
        System.err.printf("%s%s\n", method.name, method.desc);
        int i = 0;
        Iterator<AbstractInsnNode> iter = method.instructions.iterator();
        while (iter.hasNext()) {
            int i2 = i;
            i++;
            System.err.printf("[%4d] %s\n", Integer.valueOf(i2), describeNode(iter.next()));
        }
    }

    public static void printMethod(MethodNode method) {
        System.err.printf("%s%s maxStack=%d maxLocals=%d\n", method.name, method.desc, Integer.valueOf(method.maxStack), Integer.valueOf(method.maxLocals));
        int index = 0;
        Iterator<AbstractInsnNode> iter = method.instructions.iterator();
        while (iter.hasNext()) {
            int i = index;
            index++;
            System.err.printf("%-4d  ", Integer.valueOf(i));
            printNode(iter.next());
        }
    }

    public static void printNode(AbstractInsnNode node) {
        System.err.printf("%s\n", describeNode(node));
    }

    public static String describeNode(AbstractInsnNode node) {
        String out;
        if (node == null) {
            return String.format("   %-14s ", "null");
        }
        if (node instanceof LabelNode) {
            return String.format("[%s]", ((LabelNode) node).getLabel());
        }
        String out2 = String.format("   %-14s ", node.getClass().getSimpleName().replace("Node", ""));
        if (node instanceof JumpInsnNode) {
            out = out2 + String.format("[%s] [%s]", getOpcodeName(node), ((JumpInsnNode) node).label.getLabel());
        } else if (node instanceof VarInsnNode) {
            out = out2 + String.format("[%s] %d", getOpcodeName(node), Integer.valueOf(((VarInsnNode) node).var));
        } else if (node instanceof MethodInsnNode) {
            MethodInsnNode mth = (MethodInsnNode) node;
            out = out2 + String.format("[%s] %s::%s%s", getOpcodeName(node), mth.owner, mth.name, mth.desc);
        } else if (node instanceof FieldInsnNode) {
            FieldInsnNode fld = (FieldInsnNode) node;
            out = out2 + String.format("[%s] %s::%s:%s", getOpcodeName(node), fld.owner, fld.name, fld.desc);
        } else if (node instanceof InvokeDynamicInsnNode) {
            InvokeDynamicInsnNode idc = (InvokeDynamicInsnNode) node;
            out = out2 + String.format("[%s] %s%s { %s %s::%s%s }", getOpcodeName(node), idc.name, idc.desc, getOpcodeName(idc.bsm.getTag(), "H_GETFIELD", 1), idc.bsm.getOwner(), idc.bsm.getName(), idc.bsm.getDesc());
        } else if (node instanceof LineNumberNode) {
            LineNumberNode ln = (LineNumberNode) node;
            out = out2 + String.format("LINE=[%d] LABEL=[%s]", Integer.valueOf(ln.line), ln.start.getLabel());
        } else if (node instanceof LdcInsnNode) {
            out = out2 + ((LdcInsnNode) node).cst;
        } else if (node instanceof IntInsnNode) {
            out = out2 + ((IntInsnNode) node).operand;
        } else {
            out = node instanceof FrameNode ? out2 + String.format("[%s] ", getOpcodeName(((FrameNode) node).type, "H_INVOKEINTERFACE", -1)) : out2 + String.format("[%s] ", getOpcodeName(node));
        }
        return out;
    }

    public static String getOpcodeName(AbstractInsnNode node) {
        return node != null ? getOpcodeName(node.getOpcode()) : "";
    }

    public static String getOpcodeName(int opcode) {
        return getOpcodeName(opcode, "UNINITIALIZED_THIS", 1);
    }

    private static String getOpcodeName(int opcode, String start, int min) {
        Field[] declaredFields;
        if (opcode >= min) {
            boolean found = false;
            try {
                for (Field f : Opcodes.class.getDeclaredFields()) {
                    if (found || f.getName().equals(start)) {
                        found = true;
                        if (f.getType() == Integer.TYPE && f.getInt(null) == opcode) {
                            return f.getName();
                        }
                    }
                }
            } catch (Exception e) {
            }
        }
        return opcode >= 0 ? String.valueOf(opcode) : Constants.SIDE_UNKNOWN;
    }

    public static boolean methodHasLineNumbers(MethodNode method) {
        Iterator<AbstractInsnNode> iter = method.instructions.iterator();
        while (iter.hasNext()) {
            if (iter.next() instanceof LineNumberNode) {
                return true;
            }
        }
        return false;
    }

    public static boolean isStatic(MethodNode method) {
        return (method.access & 8) == 8;
    }

    public static boolean isStatic(FieldNode field) {
        return (field.access & 8) == 8;
    }

    public static int getFirstNonArgLocalIndex(MethodNode method) {
        return getFirstNonArgLocalIndex(Type.getArgumentTypes(method.desc), !isStatic(method));
    }

    public static int getFirstNonArgLocalIndex(Type[] args, boolean includeThis) {
        return getArgsSize(args) + (includeThis ? 1 : 0);
    }

    public static int getArgsSize(Type[] args) {
        return getArgsSize(args, 0, args.length);
    }

    public static int getArgsSize(Type[] args, int startIndex, int endIndex) {
        int size = 0;
        for (int index = startIndex; index < args.length && index < endIndex; index++) {
            size += args[index].getSize();
        }
        return size;
    }

    public static void loadArgs(Type[] args, InsnList insns, int pos) {
        loadArgs(args, insns, pos, -1);
    }

    public static void loadArgs(Type[] args, InsnList insns, int start, int end) {
        loadArgs(args, insns, start, end, null);
    }

    public static void loadArgs(Type[] args, InsnList insns, int start, int end, Type[] casts) {
        int pos = start;
        for (int index = 0; index < args.length; index++) {
            insns.add(new VarInsnNode(args[index].getOpcode(21), pos));
            if (casts != null && index < casts.length && casts[index] != null) {
                insns.add(new TypeInsnNode(192, casts[index].getInternalName()));
            }
            pos += args[index].getSize();
            if (end >= start && pos >= end) {
                return;
            }
        }
    }

    public static Map<LabelNode, LabelNode> cloneLabels(InsnList source) {
        Map<LabelNode, LabelNode> labels = new HashMap<>();
        Iterator<AbstractInsnNode> iter = source.iterator();
        while (iter.hasNext()) {
            AbstractInsnNode next = iter.next();
            if (next instanceof LabelNode) {
                labels.put((LabelNode) next, new LabelNode(((LabelNode) next).getLabel()));
            }
        }
        return labels;
    }

    public static String generateDescriptor(Type returnType, Type... args) {
        return generateDescriptor((Object) returnType, (Object[]) args);
    }

    public static String generateDescriptor(Object returnType, Object... args) {
        StringBuilder sb = new StringBuilder().append('(');
        for (Object arg : args) {
            sb.append(toDescriptor(arg));
        }
        return sb.append(')').append(returnType != null ? toDescriptor(returnType) : "V").toString();
    }

    private static String toDescriptor(Object arg) {
        if (arg instanceof String) {
            return (String) arg;
        }
        if (arg instanceof Type) {
            return arg.toString();
        }
        if (arg instanceof Class) {
            return Type.getDescriptor((Class) arg);
        }
        return arg == null ? "" : arg.toString();
    }

    public static String getDescriptor(Type... args) {
        return "(" + Joiner.on("").join(args) + ")";
    }

    public static String getDescriptor(Type returnType, Type... args) {
        return getDescriptor(args) + returnType.toString();
    }

    public static String changeDescriptorReturnType(String desc, String returnType) {
        if (desc == null || !desc.startsWith("(") || desc.lastIndexOf(41) < 1) {
            return null;
        }
        if (returnType == null) {
            return desc;
        }
        return desc.substring(0, desc.lastIndexOf(41) + 1) + returnType;
    }

    public static String getSimpleName(Class<? extends Annotation> annotationType) {
        return annotationType.getSimpleName();
    }

    public static String getSimpleName(Type type) {
        return type.getSort() < 9 ? type.getDescriptor() : getSimpleName(type.getClassName());
    }

    public static String getSimpleName(AnnotationNode annotation) {
        return getSimpleName(annotation.desc);
    }

    public static String getSimpleName(String desc) {
        int pos = Math.max(desc.lastIndexOf(47), 0);
        return desc.substring(pos + 1).replace(";", "");
    }

    public static boolean isConstant(AbstractInsnNode insn) {
        if (insn == null) {
            return false;
        }
        return Ints.contains(CONSTANTS_ALL, insn.getOpcode());
    }

    public static Object getConstant(AbstractInsnNode insn) {
        if (insn == null) {
            return null;
        }
        if (insn instanceof LdcInsnNode) {
            return ((LdcInsnNode) insn).cst;
        }
        if (insn instanceof IntInsnNode) {
            int value = ((IntInsnNode) insn).operand;
            if (insn.getOpcode() == 16 || insn.getOpcode() == 17) {
                return Integer.valueOf(value);
            }
            throw new IllegalArgumentException("IntInsnNode with invalid opcode " + insn.getOpcode() + " in getConstant");
        } else if (insn instanceof TypeInsnNode) {
            if (insn.getOpcode() < 192) {
                return null;
            }
            return Type.getObjectType(((TypeInsnNode) insn).desc);
        } else {
            int index = Ints.indexOf(CONSTANTS_ALL, insn.getOpcode());
            if (index < 0) {
                return null;
            }
            return CONSTANTS_VALUES[index];
        }
    }

    public static Type getConstantType(AbstractInsnNode insn) {
        if (insn == null) {
            return null;
        }
        if (insn instanceof LdcInsnNode) {
            Object cst = ((LdcInsnNode) insn).cst;
            if (cst instanceof Integer) {
                return Type.getType("I");
            }
            if (cst instanceof Float) {
                return Type.getType("F");
            }
            if (cst instanceof Long) {
                return Type.getType("J");
            }
            if (cst instanceof Double) {
                return Type.getType("D");
            }
            if (cst instanceof String) {
                return Type.getType(Constants.STRING_DESC);
            }
            if (cst instanceof Type) {
                return Type.getType(Constants.CLASS_DESC);
            }
            throw new IllegalArgumentException("LdcInsnNode with invalid payload type " + cst.getClass() + " in getConstant");
        } else if (insn instanceof TypeInsnNode) {
            if (insn.getOpcode() < 192) {
                return null;
            }
            return Type.getType(Constants.CLASS_DESC);
        } else {
            int index = Ints.indexOf(CONSTANTS_ALL, insn.getOpcode());
            if (index < 0) {
                return null;
            }
            return Type.getType(CONSTANTS_TYPES[index]);
        }
    }

    public static boolean hasFlag(ClassNode classNode, int flag) {
        return (classNode.access & flag) == flag;
    }

    public static boolean hasFlag(MethodNode method, int flag) {
        return (method.access & flag) == flag;
    }

    public static boolean hasFlag(FieldNode field, int flag) {
        return (field.access & flag) == flag;
    }

    public static boolean compareFlags(MethodNode m1, MethodNode m2, int flag) {
        return hasFlag(m1, flag) == hasFlag(m2, flag);
    }

    public static boolean compareFlags(FieldNode f1, FieldNode f2, int flag) {
        return hasFlag(f1, flag) == hasFlag(f2, flag);
    }

    public static boolean isVirtual(MethodNode method) {
        return (method == null || isStatic(method) || !getVisibility(method).isAtLeast(Visibility.PROTECTED)) ? false : true;
    }

    public static Visibility getVisibility(MethodNode method) {
        return getVisibility(method.access & 7);
    }

    public static Visibility getVisibility(FieldNode field) {
        return getVisibility(field.access & 7);
    }

    private static Visibility getVisibility(int flags) {
        if ((flags & 4) != 0) {
            return Visibility.PROTECTED;
        }
        if ((flags & 2) != 0) {
            return Visibility.PRIVATE;
        }
        if ((flags & 1) != 0) {
            return Visibility.PUBLIC;
        }
        return Visibility.PACKAGE;
    }

    public static void setVisibility(MethodNode method, Visibility visibility) {
        method.access = setVisibility(method.access, visibility.access);
    }

    public static void setVisibility(FieldNode field, Visibility visibility) {
        field.access = setVisibility(field.access, visibility.access);
    }

    public static void setVisibility(MethodNode method, int access) {
        method.access = setVisibility(method.access, access);
    }

    public static void setVisibility(FieldNode field, int access) {
        field.access = setVisibility(field.access, access);
    }

    private static int setVisibility(int oldAccess, int newAccess) {
        return (oldAccess & (-8)) | (newAccess & 7);
    }

    public static int getMaxLineNumber(ClassNode classNode, int min, int pad) {
        int max = 0;
        for (MethodNode method : classNode.methods) {
            Iterator<AbstractInsnNode> iter = method.instructions.iterator();
            while (iter.hasNext()) {
                AbstractInsnNode next = iter.next();
                if (next instanceof LineNumberNode) {
                    max = Math.max(max, ((LineNumberNode) next).line);
                }
            }
        }
        return Math.max(min, max + pad);
    }

    public static String getBoxingType(Type type) {
        if (type == null) {
            return null;
        }
        return BOXING_TYPES[type.getSort()];
    }

    public static String getUnboxingMethod(Type type) {
        if (type == null) {
            return null;
        }
        return UNBOXING_METHODS[type.getSort()];
    }

    public static void compareBridgeMethods(MethodNode a, MethodNode b) {
        ListIterator<AbstractInsnNode> ia = a.instructions.iterator();
        ListIterator<AbstractInsnNode> ib = b.instructions.iterator();
        int index = 0;
        while (ia.hasNext() && ib.hasNext()) {
            AbstractInsnNode next = ia.next();
            AbstractInsnNode next2 = ib.next();
            if (!(next instanceof LabelNode)) {
                if (next instanceof MethodInsnNode) {
                    MethodInsnNode ma = (MethodInsnNode) next;
                    MethodInsnNode mb = (MethodInsnNode) next2;
                    if (!ma.name.equals(mb.name)) {
                        throw new SyntheticBridgeException(SyntheticBridgeException.Problem.BAD_INVOKE_NAME, a.name, a.desc, index, next, next2);
                    }
                    if (!ma.desc.equals(mb.desc)) {
                        throw new SyntheticBridgeException(SyntheticBridgeException.Problem.BAD_INVOKE_DESC, a.name, a.desc, index, next, next2);
                    }
                } else if (next.getOpcode() != next2.getOpcode()) {
                    throw new SyntheticBridgeException(SyntheticBridgeException.Problem.BAD_INSN, a.name, a.desc, index, next, next2);
                } else {
                    if (next instanceof VarInsnNode) {
                        VarInsnNode va = (VarInsnNode) next;
                        VarInsnNode vb = (VarInsnNode) next2;
                        if (va.var != vb.var) {
                            throw new SyntheticBridgeException(SyntheticBridgeException.Problem.BAD_LOAD, a.name, a.desc, index, next, next2);
                        }
                    } else if (next instanceof TypeInsnNode) {
                        TypeInsnNode ta = (TypeInsnNode) next;
                        TypeInsnNode tb = (TypeInsnNode) next2;
                        if (ta.getOpcode() == 192 && !ta.desc.equals(tb.desc)) {
                            throw new SyntheticBridgeException(SyntheticBridgeException.Problem.BAD_CAST, a.name, a.desc, index, next, next2);
                        }
                    } else {
                        continue;
                    }
                }
            }
            index++;
        }
        if (ia.hasNext() || ib.hasNext()) {
            throw new SyntheticBridgeException(SyntheticBridgeException.Problem.BAD_LENGTH, a.name, a.desc, index, null, null);
        }
    }

    public static void merge(ClassNode source, ClassNode dest) {
        if (source == null) {
            return;
        }
        if (dest == null) {
            throw new NullPointerException("Target ClassNode for merge must not be null");
        }
        dest.version = Math.max(source.version, dest.version);
        dest.interfaces = merge(source.interfaces, dest.interfaces);
        dest.invisibleAnnotations = merge(source.invisibleAnnotations, dest.invisibleAnnotations);
        dest.visibleAnnotations = merge(source.visibleAnnotations, dest.visibleAnnotations);
        dest.visibleTypeAnnotations = merge(source.visibleTypeAnnotations, dest.visibleTypeAnnotations);
        dest.invisibleTypeAnnotations = merge(source.invisibleTypeAnnotations, dest.invisibleTypeAnnotations);
        dest.attrs = merge(source.attrs, dest.attrs);
        dest.innerClasses = merge(source.innerClasses, dest.innerClasses);
        dest.fields = merge(source.fields, dest.fields);
        dest.methods = merge(source.methods, dest.methods);
    }

    public static void replace(ClassNode source, ClassNode dest) {
        if (source == null) {
            return;
        }
        if (dest == null) {
            throw new NullPointerException("Target ClassNode for replace must not be null");
        }
        dest.name = source.name;
        dest.signature = source.signature;
        dest.superName = source.superName;
        dest.version = source.version;
        dest.access = source.access;
        dest.sourceDebug = source.sourceDebug;
        dest.sourceFile = source.sourceFile;
        dest.outerClass = source.outerClass;
        dest.outerMethod = source.outerMethod;
        dest.outerMethodDesc = source.outerMethodDesc;
        clear(dest.interfaces);
        clear(dest.visibleAnnotations);
        clear(dest.invisibleAnnotations);
        clear(dest.visibleTypeAnnotations);
        clear(dest.invisibleTypeAnnotations);
        clear(dest.attrs);
        clear(dest.innerClasses);
        clear(dest.fields);
        clear(dest.methods);
        if (ASM.API_VERSION >= 393216) {
            dest.module = source.module;
        }
        merge(source, dest);
    }

    private static <T> void clear(List<T> list) {
        if (list != null) {
            list.clear();
        }
    }

    private static <T> List<T> merge(List<T> source, List<T> destination) {
        if (source == null || source.isEmpty()) {
            return destination;
        }
        if (destination == null) {
            return new ArrayList(source);
        }
        destination.addAll(source);
        return destination;
    }
}
