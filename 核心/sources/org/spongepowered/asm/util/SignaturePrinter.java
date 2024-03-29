package org.spongepowered.asm.util;

import com.google.common.base.Strings;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorByName;
import org.spongepowered.asm.mixin.transformer.ClassInfo;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/util/SignaturePrinter.class */
public class SignaturePrinter {
    private final String name;
    private final Type returnType;
    private final Type[] argTypes;
    private final String[] argNames;
    private String modifiers;
    private boolean fullyQualified;

    public SignaturePrinter(MethodNode method) {
        this(method.name, Type.VOID_TYPE, Type.getArgumentTypes(method.desc));
        setModifiers(method);
    }

    public SignaturePrinter(MethodNode method, String[] argNames) {
        this(method.name, Type.VOID_TYPE, Type.getArgumentTypes(method.desc), argNames);
        setModifiers(method);
    }

    public SignaturePrinter(ITargetSelectorByName member) {
        this(member.getName(), member.getDesc());
    }

    public SignaturePrinter(String name, String desc) {
        this(name, Type.getReturnType(desc), Type.getArgumentTypes(desc));
    }

    public SignaturePrinter(Type[] args) {
        this((String) null, (Type) null, args);
    }

    public SignaturePrinter(Type returnType, Type[] args) {
        this((String) null, returnType, args);
    }

    public SignaturePrinter(String name, Type returnType, Type[] args) {
        this.modifiers = "private void";
        this.name = name;
        this.returnType = returnType;
        this.argTypes = new Type[args.length];
        this.argNames = new String[args.length];
        int v = 0;
        for (int l = 0; l < args.length; l++) {
            if (args[l] != null) {
                this.argTypes[l] = args[l];
                int i = v;
                v++;
                this.argNames[l] = "var" + i;
            }
        }
    }

    public SignaturePrinter(String name, Type returnType, LocalVariableNode[] args) {
        this.modifiers = "private void";
        this.name = name;
        this.returnType = returnType;
        this.argTypes = new Type[args.length];
        this.argNames = new String[args.length];
        for (int l = 0; l < args.length; l++) {
            if (args[l] != null) {
                this.argTypes[l] = Type.getType(args[l].desc);
                this.argNames[l] = args[l].name;
            }
        }
    }

    public SignaturePrinter(String name, Type returnType, Type[] argTypes, String[] argNames) {
        this.modifiers = "private void";
        this.name = name;
        this.returnType = returnType;
        this.argTypes = argTypes;
        this.argNames = argNames;
        if (this.argTypes.length > this.argNames.length) {
            throw new IllegalArgumentException(String.format("Types array length must not exceed names array length! (names=%d, types=%d)", Integer.valueOf(this.argNames.length), Integer.valueOf(this.argTypes.length)));
        }
    }

    public String getFormattedArgs() {
        return appendArgs(new StringBuilder(), true, true).toString();
    }

    public String getReturnType() {
        return getTypeName(this.returnType, false, this.fullyQualified);
    }

    public void setModifiers(MethodNode method) {
        String returnType = getTypeName(Type.getReturnType(method.desc), false, this.fullyQualified);
        if ((method.access & 1) != 0) {
            setModifiers("public " + returnType);
        } else if ((method.access & 4) != 0) {
            setModifiers("protected " + returnType);
        } else if ((method.access & 2) != 0) {
            setModifiers("private " + returnType);
        } else {
            setModifiers(returnType);
        }
    }

    public SignaturePrinter setModifiers(String modifiers) {
        this.modifiers = modifiers.replace("${returnType}", getReturnType());
        return this;
    }

    public SignaturePrinter setFullyQualified(boolean fullyQualified) {
        this.fullyQualified = fullyQualified;
        return this;
    }

    public boolean isFullyQualified() {
        return this.fullyQualified;
    }

    public String toString() {
        String name = this.name != null ? this.name : "method";
        return appendArgs(new StringBuilder().append(this.modifiers).append(" ").append(name), false, true).toString();
    }

    public String toDescriptor() {
        StringBuilder args = appendArgs(new StringBuilder(), true, false);
        return args.append(getTypeName(this.returnType, false, this.fullyQualified)).toString();
    }

    private StringBuilder appendArgs(StringBuilder sb, boolean typesOnly, boolean pretty) {
        String str;
        sb.append('(');
        for (int var = 0; var < this.argTypes.length; var++) {
            if (this.argTypes[var] != null) {
                if (var > 0) {
                    sb.append(',');
                    if (pretty) {
                        sb.append(' ');
                    }
                }
                if (typesOnly) {
                    str = null;
                } else {
                    try {
                        str = Strings.isNullOrEmpty(this.argNames[var]) ? "unnamed" + var : this.argNames[var];
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                }
                String name = str;
                appendType(sb, this.argTypes[var], name);
            }
        }
        return sb.append(")");
    }

    private StringBuilder appendType(StringBuilder sb, Type type, String name) {
        switch (type.getSort()) {
            case 9:
                return appendArraySuffix(appendType(sb, type.getElementType(), name), type);
            case ClassInfo.INCLUDE_ALL /* 10 */:
                return appendType(sb, type.getClassName(), name);
            default:
                sb.append(getTypeName(type, false, this.fullyQualified));
                if (name != null) {
                    sb.append(' ').append(name);
                }
                return sb;
        }
    }

    private StringBuilder appendType(StringBuilder sb, String typeName, String name) {
        if (!this.fullyQualified) {
            typeName = typeName.substring(typeName.lastIndexOf(46) + 1);
        }
        sb.append(typeName);
        if (typeName.endsWith("CallbackInfoReturnable")) {
            sb.append('<').append(getTypeName(this.returnType, true, this.fullyQualified)).append('>');
        }
        if (name != null) {
            sb.append(' ').append(name);
        }
        return sb;
    }

    public static String getTypeName(Type type) {
        return getTypeName(type, false, true);
    }

    public static String getTypeName(Type type, boolean box) {
        return getTypeName(type, box, false);
    }

    public static String getTypeName(Type type, boolean box, boolean fullyQualified) {
        if (type == null) {
            return "{null?}";
        }
        switch (type.getSort()) {
            case InjectionPoint.DEFAULT_ALLOWED_SHIFT_BY /* 0 */:
                return box ? "Void" : "void";
            case 1:
                return box ? "Boolean" : "boolean";
            case 2:
                return box ? "Character" : "char";
            case 3:
                return box ? "Byte" : "byte";
            case MixinEnvironment.CompatibilityLevel.LanguageFeature.NESTING /* 4 */:
                return box ? "Short" : "short";
            case InjectionPoint.MAX_ALLOWED_SHIFT_BY /* 5 */:
                return box ? "Integer" : "int";
            case 6:
                return box ? "Float" : "float";
            case 7:
                return box ? "Long" : "long";
            case 8:
                return box ? "Double" : "double";
            case 9:
                return getTypeName(type.getElementType(), box, fullyQualified) + arraySuffix(type);
            case ClassInfo.INCLUDE_ALL /* 10 */:
                String typeName = type.getClassName();
                if (!fullyQualified) {
                    typeName = typeName.substring(typeName.lastIndexOf(46) + 1);
                }
                return typeName;
            default:
                return "Object";
        }
    }

    private static String arraySuffix(Type type) {
        return Strings.repeat("[]", type.getDimensions());
    }

    private static StringBuilder appendArraySuffix(StringBuilder sb, Type type) {
        for (int i = 0; i < type.getDimensions(); i++) {
            sb.append("[]");
        }
        return sb;
    }
}
