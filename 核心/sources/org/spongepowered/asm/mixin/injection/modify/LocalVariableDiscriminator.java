package org.spongepowered.asm.mixin.injection.modify;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.Locals;
import org.spongepowered.asm.util.PrettyPrinter;
import org.spongepowered.asm.util.SignaturePrinter;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/modify/LocalVariableDiscriminator.class */
public class LocalVariableDiscriminator {
    private final boolean argsOnly;
    private final int ordinal;
    private final int index;
    private final Set<String> names;
    private final boolean print;

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/modify/LocalVariableDiscriminator$Context.class */
    public static class Context implements PrettyPrinter.IPrettyPrintable {
        final Target target;
        final Type returnType;
        final AbstractInsnNode node;
        final int baseArgIndex;
        final Local[] locals;
        private final boolean isStatic;

        /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/modify/LocalVariableDiscriminator$Context$Local.class */
        public class Local {
            int ord = 0;
            String name;
            Type type;

            public Local(String name, Type type) {
                this.name = name;
                this.type = type;
            }

            public String toString() {
                return String.format("Local[ordinal=%d, name=%s, type=%s]", Integer.valueOf(this.ord), this.name, this.type);
            }
        }

        public Context(Type returnType, boolean argsOnly, Target target, AbstractInsnNode node) {
            this.isStatic = Bytecode.isStatic(target.method);
            this.returnType = returnType;
            this.target = target;
            this.node = node;
            this.baseArgIndex = this.isStatic ? 0 : 1;
            this.locals = initLocals(target, argsOnly, node);
            initOrdinals();
        }

        private Local[] initLocals(Target target, boolean argsOnly, AbstractInsnNode node) {
            LocalVariableNode[] locals;
            if (!argsOnly && (locals = Locals.getLocalsAt(target.classNode, target.method, node)) != null) {
                Local[] lvt = new Local[locals.length];
                for (int l = 0; l < locals.length; l++) {
                    if (locals[l] != null) {
                        lvt[l] = new Local(locals[l].name, Type.getType(locals[l].desc));
                    }
                }
                return lvt;
            }
            Local[] lvt2 = new Local[this.baseArgIndex + target.arguments.length];
            if (!this.isStatic) {
                lvt2[0] = new Local("this", Type.getObjectType(target.classNode.name));
            }
            for (int local = this.baseArgIndex; local < lvt2.length; local++) {
                Type arg = target.arguments[local - this.baseArgIndex];
                lvt2[local] = new Local("arg" + local, arg);
            }
            return lvt2;
        }

        private void initOrdinals() {
            Map<Type, Integer> ordinalMap = new HashMap<>();
            for (int l = 0; l < this.locals.length; l++) {
                if (this.locals[l] != null) {
                    Integer ordinal = ordinalMap.get(this.locals[l].type);
                    Type type = this.locals[l].type;
                    Integer ordinal2 = Integer.valueOf(ordinal == null ? 0 : ordinal.intValue() + 1);
                    ordinalMap.put(type, ordinal2);
                    this.locals[l].ord = ordinal2.intValue();
                }
            }
        }

        public int getCandidateCount() {
            int candidateCount = 0;
            for (int l = this.baseArgIndex; l < this.locals.length; l++) {
                if (this.locals[l] != null && this.returnType.equals(this.locals[l].type)) {
                    candidateCount++;
                }
            }
            return candidateCount;
        }

        @Override // org.spongepowered.asm.util.PrettyPrinter.IPrettyPrintable
        public void print(PrettyPrinter printer) {
            printer.add("%5s  %7s  %30s  %-50s  %s", "INDEX", "ORDINAL", "TYPE", "NAME", "CANDIDATE");
            for (int l = this.baseArgIndex; l < this.locals.length; l++) {
                Local local = this.locals[l];
                if (local != null) {
                    Type localType = local.type;
                    String localName = local.name;
                    int ordinal = local.ord;
                    String candidate = this.returnType.equals(localType) ? "YES" : "-";
                    printer.add("[%3d]    [%3d]  %30s  %-50s  %s", Integer.valueOf(l), Integer.valueOf(ordinal), SignaturePrinter.getTypeName(localType, false), localName, candidate);
                } else if (l > 0) {
                    Local prevLocal = this.locals[l - 1];
                    boolean isTop = (prevLocal == null || prevLocal.type == null || prevLocal.type.getSize() <= 1) ? false : true;
                    Object[] objArr = new Object[2];
                    objArr[0] = Integer.valueOf(l);
                    objArr[1] = isTop ? "<top>" : "-";
                    printer.add("[%3d]           %30s", objArr);
                }
            }
        }
    }

    public LocalVariableDiscriminator(boolean argsOnly, int ordinal, int index, Set<String> names, boolean print) {
        this.argsOnly = argsOnly;
        this.ordinal = ordinal;
        this.index = index;
        this.names = Collections.unmodifiableSet(names);
        this.print = print;
    }

    public boolean isArgsOnly() {
        return this.argsOnly;
    }

    public int getOrdinal() {
        return this.ordinal;
    }

    public int getIndex() {
        return this.index;
    }

    public Set<String> getNames() {
        return this.names;
    }

    public boolean hasNames() {
        return !this.names.isEmpty();
    }

    public boolean printLVT() {
        return this.print;
    }

    public String toString() {
        return String.format("ordinal=%d index=%d", Integer.valueOf(this.ordinal), Integer.valueOf(this.index));
    }

    public String toString(Context context) {
        String typeName = SignaturePrinter.getTypeName(context.returnType, false, false);
        if (isImplicit(context)) {
            return "implicit " + typeName;
        }
        return String.format("explicit %s at ordinal=%d index=%d", typeName, Integer.valueOf(this.ordinal), Integer.valueOf(this.index));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isImplicit(Context context) {
        return this.ordinal < 0 && this.index < context.baseArgIndex && this.names.isEmpty();
    }

    public int findLocal(Context context) {
        if (isImplicit(context)) {
            return findImplicitLocal(context);
        }
        return findExplicitLocal(context);
    }

    private int findImplicitLocal(Context context) {
        int found = 0;
        int count = 0;
        for (int index = context.baseArgIndex; index < context.locals.length; index++) {
            Context.Local local = context.locals[index];
            if (local != null && local.type.equals(context.returnType)) {
                count++;
                found = index;
            }
        }
        if (count == 1) {
            return found;
        }
        throw new InvalidImplicitDiscriminatorException("Found " + count + " candidate variables but exactly 1 is required.");
    }

    private int findExplicitLocal(Context context) {
        for (int index = context.baseArgIndex; index < context.locals.length; index++) {
            Context.Local local = context.locals[index];
            if (local != null && local.type.equals(context.returnType)) {
                if (this.ordinal > -1) {
                    if (this.ordinal == local.ord) {
                        return index;
                    }
                } else if (this.index >= context.baseArgIndex) {
                    if (this.index == index) {
                        return index;
                    }
                } else if (this.names.contains(local.name)) {
                    return index;
                }
            }
        }
        return -1;
    }

    public static LocalVariableDiscriminator parse(AnnotationNode annotation) {
        boolean argsOnly = ((Boolean) Annotations.getValue(annotation, "argsOnly", Boolean.FALSE)).booleanValue();
        int ordinal = ((Integer) Annotations.getValue(annotation, "ordinal", -1)).intValue();
        int index = ((Integer) Annotations.getValue(annotation, "index", -1)).intValue();
        boolean print = ((Boolean) Annotations.getValue(annotation, "print", Boolean.FALSE)).booleanValue();
        Set<String> names = new HashSet<>();
        List<String> namesList = (List) Annotations.getValue(annotation, "name", (List) null);
        if (namesList != null) {
            names.addAll(namesList);
        }
        return new LocalVariableDiscriminator(argsOnly, ordinal, index, names, print);
    }
}
