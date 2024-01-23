package org.spongepowered.asm.util.throwables;

import java.util.Iterator;
import java.util.ListIterator;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.mixin.throwables.MixinException;
import org.spongepowered.asm.mixin.transformer.ClassInfo;
import org.spongepowered.asm.mixin.transformer.meta.MixinMerged;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.PrettyPrinter;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/util/throwables/SyntheticBridgeException.class */
public class SyntheticBridgeException extends MixinException {
    private static final long serialVersionUID = 1;
    private final Problem problem;
    private final String name;
    private final String desc;
    private final int index;
    private final AbstractInsnNode a;
    private final AbstractInsnNode b;

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/util/throwables/SyntheticBridgeException$Problem.class */
    public enum Problem {
        BAD_INSN("Conflicting opcodes %4$s and %5$s at offset %3$d in synthetic bridge method %1$s%2$s"),
        BAD_LOAD("Conflicting variable access at offset %3$d in synthetic bridge method %1$s%2$s"),
        BAD_CAST("Conflicting type cast at offset %3$d in synthetic bridge method %1$s%2$s"),
        BAD_INVOKE_NAME("Conflicting synthetic bridge target method name in synthetic bridge method %1$s%2$s Existing:%6$s Incoming:%7$s"),
        BAD_INVOKE_DESC("Conflicting synthetic bridge target method descriptor in synthetic bridge method %1$s%2$s Existing:%8$s Incoming:%9$s"),
        BAD_LENGTH("Mismatched bridge method length for synthetic bridge method %1$s%2$s unexpected extra opcode at offset %3$d");
        
        private final String message;

        Problem(String message) {
            this.message = message;
        }

        String getMessage(String name, String desc, int index, AbstractInsnNode a, AbstractInsnNode b) {
            return String.format(this.message, name, desc, Integer.valueOf(index), Bytecode.getOpcodeName(a), Bytecode.getOpcodeName(a), getInsnName(a), getInsnName(b), getInsnDesc(a), getInsnDesc(b));
        }

        private static String getInsnName(AbstractInsnNode node) {
            return node instanceof MethodInsnNode ? ((MethodInsnNode) node).name : "";
        }

        private static String getInsnDesc(AbstractInsnNode node) {
            return node instanceof MethodInsnNode ? ((MethodInsnNode) node).desc : "";
        }
    }

    public SyntheticBridgeException(Problem problem, String name, String desc, int index, AbstractInsnNode a, AbstractInsnNode b) {
        super(problem.getMessage(name, desc, index, a, b));
        this.problem = problem;
        this.name = name;
        this.desc = desc;
        this.index = index;
        this.a = a;
        this.b = b;
    }

    public void printAnalysis(IMixinContext context, MethodNode mda, MethodNode mdb) {
        PrettyPrinter printer = new PrettyPrinter();
        printer.addWrapped(100, getMessage(), new Object[0]).hr();
        printer.add().kv("Method", this.name + this.desc).kv("Problem Type", this.problem).add().hr();
        String merged = (String) Annotations.getValue(Annotations.getVisible(mda, MixinMerged.class), MixinLaunchPlugin.NAME);
        String owner = merged != null ? merged : context.getTargetClassRef().replace('/', '.');
        printMethod(printer.add("Existing method").add().kv("Owner", owner).add(), mda).hr();
        printMethod(printer.add("Incoming method").add().kv("Owner", context.getClassRef().replace('/', '.')).add(), mdb).hr();
        printProblem(printer, context, mda, mdb).print(System.err);
    }

    private PrettyPrinter printMethod(PrettyPrinter printer, MethodNode method) {
        int index = 0;
        Iterator<AbstractInsnNode> iter = method.instructions.iterator();
        while (iter.hasNext()) {
            printer.kv(index == this.index ? ">>>>" : "", Bytecode.describeNode(iter.next()));
            index++;
        }
        return printer.add();
    }

    private PrettyPrinter printProblem(PrettyPrinter printer, IMixinContext context, MethodNode mda, MethodNode mdb) {
        Type target = Type.getObjectType(context.getTargetClassRef());
        printer.add("Analysis").add();
        switch (AnonymousClass1.$SwitchMap$org$spongepowered$asm$util$throwables$SyntheticBridgeException$Problem[this.problem.ordinal()]) {
            case 1:
                printer.add("The bridge methods are not compatible because they contain incompatible opcodes");
                printer.add("at index " + this.index + ":").add();
                printer.kv("Existing opcode: %s", Bytecode.getOpcodeName(this.a));
                printer.kv("Incoming opcode: %s", Bytecode.getOpcodeName(this.b)).add();
                printer.add("This implies that the bridge methods are from different interfaces. This problem");
                printer.add("may not be resolvable without changing the base interfaces.").add();
                break;
            case 2:
                printer.add("The bridge methods are not compatible because they contain different variables at");
                printer.add("opcode index " + this.index + ".").add();
                ListIterator<AbstractInsnNode> ia = mda.instructions.iterator();
                ListIterator<AbstractInsnNode> ib = mdb.instructions.iterator();
                Type[] argsa = Type.getArgumentTypes(mda.desc);
                Type[] argsb = Type.getArgumentTypes(mdb.desc);
                int index = 0;
                while (ia.hasNext() && ib.hasNext()) {
                    AbstractInsnNode next = ia.next();
                    AbstractInsnNode next2 = ib.next();
                    if ((next instanceof VarInsnNode) && (next2 instanceof VarInsnNode)) {
                        VarInsnNode va = (VarInsnNode) next;
                        VarInsnNode vb = (VarInsnNode) next2;
                        Type ta = va.var > 0 ? argsa[va.var - 1] : target;
                        Type tb = vb.var > 0 ? argsb[vb.var - 1] : target;
                        printer.kv("Target " + index, "%8s %-2d %s", Bytecode.getOpcodeName((AbstractInsnNode) va), Integer.valueOf(va.var), ta);
                        printer.kv("Incoming " + index, "%8s %-2d %s", Bytecode.getOpcodeName((AbstractInsnNode) vb), Integer.valueOf(vb.var), tb);
                        if (ta.equals(tb)) {
                            printer.kv("", "Types match: %s", ta);
                        } else if (ta.getSort() != tb.getSort()) {
                            printer.kv("", "Types are incompatible");
                        } else if (ta.getSort() == 10) {
                            ClassInfo superClass = ClassInfo.getCommonSuperClassOrInterface(ta, tb);
                            printer.kv("", "Common supertype: %s", superClass);
                        }
                        printer.add();
                    }
                    index++;
                }
                printer.add("Since this probably means that the methods come from different interfaces, you");
                printer.add("may have a \"multiple inheritance\" problem, it may not be possible to implement");
                printer.add("both root interfaces");
                break;
            case 3:
                printer.add("Incompatible CHECKCAST encountered at opcode " + this.index + ", this could indicate that the bridge");
                printer.add("is casting down for contravariant generic types. It may be possible to coalesce the");
                printer.add("bridges by adjusting the types in the target method.").add();
                Type ta2 = Type.getObjectType(this.a.desc);
                Type tb2 = Type.getObjectType(this.b.desc);
                printer.kv("Target type", ta2);
                printer.kv("Incoming type", tb2);
                printer.kv("Common supertype", ClassInfo.getCommonSuperClassOrInterface(ta2, tb2)).add();
                break;
            case MixinEnvironment.CompatibilityLevel.LanguageFeature.NESTING /* 4 */:
                printer.add("Incompatible invocation targets in synthetic bridge. This is extremely unusual");
                printer.add("and implies that a remapping transformer has incorrectly remapped a method. This");
                printer.add("is an unrecoverable error.");
                break;
            case InjectionPoint.MAX_ALLOWED_SHIFT_BY /* 5 */:
                MethodInsnNode mdna = this.a;
                MethodInsnNode mdnb = this.b;
                Type[] arga = Type.getArgumentTypes(mdna.desc);
                Type[] argb = Type.getArgumentTypes(mdnb.desc);
                if (arga.length != argb.length) {
                    int argCount = Type.getArgumentTypes(mda.desc).length;
                    String winner = arga.length == argCount ? "The TARGET" : argb.length == argCount ? " The INCOMING" : "NEITHER";
                    printer.add("Mismatched invocation descriptors in synthetic bridge implies that a remapping");
                    printer.add("transformer has incorrectly coalesced a bridge method with a conflicting name.");
                    printer.add("Overlapping bridge methods should always have the same number of arguments, yet");
                    printer.add("the target method has %d arguments, the incoming method has %d. This is an", Integer.valueOf(arga.length), Integer.valueOf(argb.length));
                    printer.add("unrecoverable error. %s method has the expected arg count of %d", winner, Integer.valueOf(argCount));
                    break;
                } else {
                    Type rta = Type.getReturnType(mdna.desc);
                    Type rtb = Type.getReturnType(mdnb.desc);
                    printer.add("Incompatible invocation descriptors in synthetic bridge implies that generified");
                    printer.add("types are incompatible over one or more generic superclasses or interfaces. It may");
                    printer.add("be possible to adjust the generic types on implemented members to rectify this");
                    printer.add("problem by coalescing the appropriate generic types.").add();
                    printTypeComparison(printer, "return type", rta, rtb);
                    for (int i = 0; i < arga.length; i++) {
                        printTypeComparison(printer, "arg " + i, arga[i], argb[i]);
                    }
                    break;
                }
            case 6:
                printer.add("Mismatched bridge method length implies the bridge methods are incompatible");
                printer.add("and may originate from different superinterfaces. This is an unrecoverable");
                printer.add("error.").add();
                break;
        }
        return printer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.spongepowered.asm.util.throwables.SyntheticBridgeException$1  reason: invalid class name */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/util/throwables/SyntheticBridgeException$1.class */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$spongepowered$asm$util$throwables$SyntheticBridgeException$Problem = new int[Problem.values().length];

        static {
            try {
                $SwitchMap$org$spongepowered$asm$util$throwables$SyntheticBridgeException$Problem[Problem.BAD_INSN.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$org$spongepowered$asm$util$throwables$SyntheticBridgeException$Problem[Problem.BAD_LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$org$spongepowered$asm$util$throwables$SyntheticBridgeException$Problem[Problem.BAD_CAST.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$org$spongepowered$asm$util$throwables$SyntheticBridgeException$Problem[Problem.BAD_INVOKE_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$org$spongepowered$asm$util$throwables$SyntheticBridgeException$Problem[Problem.BAD_INVOKE_DESC.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$org$spongepowered$asm$util$throwables$SyntheticBridgeException$Problem[Problem.BAD_LENGTH.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
        }
    }

    private PrettyPrinter printTypeComparison(PrettyPrinter printer, String index, Type tpa, Type tpb) {
        printer.kv("Target " + index, "%s", tpa);
        printer.kv("Incoming " + index, "%s", tpb);
        if (tpa.equals(tpb)) {
            printer.kv("Analysis", "Types match: %s", tpa);
        } else if (tpa.getSort() != tpb.getSort()) {
            printer.kv("Analysis", "Types are incompatible");
        } else if (tpa.getSort() == 10) {
            ClassInfo superClass = ClassInfo.getCommonSuperClassOrInterface(tpa, tpb);
            printer.kv("Analysis", "Common supertype: L%s;", superClass);
        }
        return printer.add();
    }
}
