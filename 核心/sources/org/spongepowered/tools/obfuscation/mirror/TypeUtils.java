package org.spongepowered.tools.obfuscation.mirror;

import java.util.List;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.Name;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.invoke.arg.ArgsClassGenerator;
import org.spongepowered.asm.mixin.transformer.ClassInfo;
import org.spongepowered.asm.util.Constants;
import org.spongepowered.asm.util.SignaturePrinter;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/mirror/TypeUtils.class */
public abstract class TypeUtils {
    private static final int MAX_GENERIC_RECURSION_DEPTH = 5;
    private static final String OBJECT_SIG = "java.lang.Object";

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/mirror/TypeUtils$Equivalency.class */
    public enum Equivalency {
        NOT_EQUIVALENT,
        EQUIVALENT_BUT_RAW,
        BOUNDS_MISMATCH,
        EQUIVALENT
    }

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/mirror/TypeUtils$EquivalencyResult.class */
    public static class EquivalencyResult {
        static final EquivalencyResult EQUIVALENT = new EquivalencyResult(Equivalency.EQUIVALENT, "", 0);
        public final Equivalency type;
        public final String detail;
        public final int rawType;

        EquivalencyResult(Equivalency type, String detail, int rawType) {
            this.type = type;
            this.detail = detail;
            this.rawType = rawType;
        }

        public String toString() {
            return this.detail;
        }

        static EquivalencyResult notEquivalent(String format, Object... args) {
            return new EquivalencyResult(Equivalency.NOT_EQUIVALENT, String.format(format, args), 0);
        }

        static EquivalencyResult boundsMismatch(String format, Object... args) {
            return new EquivalencyResult(Equivalency.BOUNDS_MISMATCH, String.format(format, args), 0);
        }

        static EquivalencyResult equivalentButRaw(int rawType) {
            return new EquivalencyResult(Equivalency.EQUIVALENT_BUT_RAW, String.format("Type %d is raw", Integer.valueOf(rawType)), rawType);
        }
    }

    private TypeUtils() {
    }

    public static PackageElement getPackage(TypeMirror type) {
        if (!(type instanceof DeclaredType)) {
            return null;
        }
        return getPackage(((DeclaredType) type).asElement());
    }

    public static PackageElement getPackage(TypeElement type) {
        Element parent;
        Element enclosingElement = type.getEnclosingElement();
        while (true) {
            parent = enclosingElement;
            if (parent == null || (parent instanceof PackageElement)) {
                break;
            }
            enclosingElement = parent.getEnclosingElement();
        }
        return (PackageElement) parent;
    }

    public static String getElementType(Element element) {
        if (element instanceof TypeElement) {
            return "TypeElement";
        }
        if (element instanceof ExecutableElement) {
            return "ExecutableElement";
        }
        if (element instanceof VariableElement) {
            return "VariableElement";
        }
        if (element instanceof PackageElement) {
            return "PackageElement";
        }
        if (element instanceof TypeParameterElement) {
            return "TypeParameterElement";
        }
        return element.getClass().getSimpleName();
    }

    public static String stripGenerics(String type) {
        StringBuilder sb = new StringBuilder();
        int depth = 0;
        for (int pos = 0; pos < type.length(); pos++) {
            char c = type.charAt(pos);
            if (c == '<') {
                depth++;
            }
            if (depth == 0) {
                sb.append(c);
            } else if (c == '>') {
                depth--;
            }
        }
        return sb.toString();
    }

    public static String getName(VariableElement field) {
        if (field != null) {
            return field.getSimpleName().toString();
        }
        return null;
    }

    public static String getName(ExecutableElement method) {
        if (method != null) {
            return method.getSimpleName().toString();
        }
        return null;
    }

    public static String getJavaSignature(Element element) {
        if (element instanceof ExecutableElement) {
            ExecutableElement method = (ExecutableElement) element;
            StringBuilder desc = new StringBuilder().append("(");
            boolean extra = false;
            for (VariableElement arg : method.getParameters()) {
                if (extra) {
                    desc.append(',');
                }
                desc.append(getTypeName(arg.asType()));
                extra = true;
            }
            desc.append(')').append(getTypeName(method.getReturnType()));
            return desc.toString();
        }
        return getTypeName(element.asType());
    }

    public static String getJavaSignature(String descriptor) {
        return new SignaturePrinter("", descriptor).setFullyQualified(true).toDescriptor();
    }

    public static String getSimpleName(TypeMirror type) {
        String name = getTypeName(type);
        int pos = name.lastIndexOf(46);
        return pos > 0 ? name.substring(pos + 1) : name;
    }

    public static String getTypeName(TypeMirror type) {
        switch (AnonymousClass1.$SwitchMap$javax$lang$model$type$TypeKind[type.getKind().ordinal()]) {
            case 1:
                return getTypeName(((ArrayType) type).getComponentType()) + "[]";
            case 2:
                return getTypeName((DeclaredType) type);
            case 3:
                return getTypeName(getUpperBound(type));
            case MixinEnvironment.CompatibilityLevel.LanguageFeature.NESTING /* 4 */:
                return OBJECT_SIG;
            default:
                return type.toString();
        }
    }

    public static String getTypeName(DeclaredType type) {
        if (type == null) {
            return OBJECT_SIG;
        }
        return getInternalName(type.asElement()).replace('/', '.');
    }

    public static String getDescriptor(Element element) {
        if (element instanceof ExecutableElement) {
            return getDescriptor((ExecutableElement) element);
        }
        if (element instanceof VariableElement) {
            return getInternalName((VariableElement) element);
        }
        return getInternalName(element.asType());
    }

    public static String getDescriptor(ExecutableElement method) {
        if (method == null) {
            return null;
        }
        StringBuilder signature = new StringBuilder();
        for (VariableElement var : method.getParameters()) {
            signature.append(getInternalName(var));
        }
        String returnType = getInternalName(method.getReturnType());
        return String.format("(%s)%s", signature, returnType);
    }

    public static String getInternalName(VariableElement field) {
        if (field == null) {
            return null;
        }
        return getInternalName(field.asType());
    }

    public static String getInternalName(TypeMirror type) {
        switch (AnonymousClass1.$SwitchMap$javax$lang$model$type$TypeKind[type.getKind().ordinal()]) {
            case 1:
                return "[" + getInternalName(((ArrayType) type).getComponentType());
            case 2:
                return "L" + getInternalName((DeclaredType) type) + ";";
            case 3:
                return "L" + getInternalName(getUpperBound(type)) + ";";
            case MixinEnvironment.CompatibilityLevel.LanguageFeature.NESTING /* 4 */:
                return Constants.OBJECT_DESC;
            case 5:
                return "Z";
            case 6:
                return "B";
            case 7:
                return "C";
            case 8:
                return "D";
            case 9:
                return "F";
            case ClassInfo.INCLUDE_ALL /* 10 */:
                return "I";
            case 11:
                return "J";
            case 12:
                return "S";
            case 13:
                return "V";
            default:
                throw new IllegalArgumentException("Unable to parse type symbol " + type + " with " + type.getKind() + " to equivalent bytecode type");
        }
    }

    public static String getInternalName(DeclaredType type) {
        if (type == null) {
            return Constants.OBJECT;
        }
        return getInternalName(type.asElement());
    }

    public static String getInternalName(TypeElement element) {
        if (element == null) {
            return null;
        }
        StringBuilder reference = new StringBuilder();
        reference.append((CharSequence) element.getSimpleName());
        Element enclosingElement = element.getEnclosingElement();
        while (true) {
            Element parent = enclosingElement;
            if (parent != null) {
                if (parent instanceof TypeElement) {
                    reference.insert(0, ArgsClassGenerator.GETTER_PREFIX).insert(0, (CharSequence) parent.getSimpleName());
                } else if (parent instanceof PackageElement) {
                    reference.insert(0, "/").insert(0, ((PackageElement) parent).getQualifiedName().toString().replace('.', '/'));
                }
                enclosingElement = parent.getEnclosingElement();
            } else {
                return reference.toString();
            }
        }
    }

    private static DeclaredType getUpperBound(TypeMirror type) {
        try {
            return getUpperBound0(type, 5);
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException("Unable to compute upper bound of type symbol " + type, ex);
        } catch (IllegalStateException ex2) {
            throw new IllegalArgumentException("Type symbol \"" + type + "\" is too complex", ex2);
        }
    }

    private static DeclaredType getUpperBound0(TypeMirror type, int depth) {
        if (depth == 0) {
            throw new IllegalStateException("Generic symbol \"" + type + "\" is too complex, exceeded 5 iterations attempting to determine upper bound");
        }
        if (type instanceof DeclaredType) {
            return (DeclaredType) type;
        }
        if (type instanceof TypeVariable) {
            try {
                TypeMirror upper = ((TypeVariable) type).getUpperBound();
                return getUpperBound0(upper, depth - 1);
            } catch (IllegalArgumentException ex) {
                throw ex;
            } catch (IllegalStateException ex2) {
                throw ex2;
            } catch (Exception e) {
                throw new IllegalArgumentException("Unable to compute upper bound of type symbol " + type);
            }
        }
        return null;
    }

    private static String describeGenericBound(TypeMirror type) {
        if (type instanceof TypeVariable) {
            StringBuilder description = new StringBuilder("<");
            TypeVariable typeVar = (TypeVariable) type;
            description.append(typeVar.toString());
            TypeMirror lowerBound = typeVar.getLowerBound();
            if (lowerBound.getKind() != TypeKind.NULL) {
                description.append(" super ").append(lowerBound);
            }
            TypeMirror upperBound = typeVar.getUpperBound();
            if (upperBound.getKind() != TypeKind.NULL) {
                description.append(" extends ").append(upperBound);
            }
            return description.append(">").toString();
        }
        return type.toString();
    }

    public static boolean isAssignable(ProcessingEnvironment processingEnv, TypeMirror targetType, TypeMirror superClass) {
        boolean assignable = processingEnv.getTypeUtils().isAssignable(targetType, superClass);
        if (!assignable && (targetType instanceof DeclaredType) && (superClass instanceof DeclaredType)) {
            TypeMirror rawTargetType = toRawType(processingEnv, (DeclaredType) targetType);
            TypeMirror rawSuperType = toRawType(processingEnv, (DeclaredType) superClass);
            return processingEnv.getTypeUtils().isAssignable(rawTargetType, rawSuperType);
        }
        return assignable;
    }

    public static EquivalencyResult isEquivalentType(ProcessingEnvironment processingEnv, TypeMirror t1, TypeMirror t2) {
        if (t1 == null || t2 == null) {
            return EquivalencyResult.notEquivalent("Invalid types supplied: %s, %s", t1, t2);
        }
        if (processingEnv.getTypeUtils().isSameType(t1, t2)) {
            return EquivalencyResult.EQUIVALENT;
        }
        if ((t1 instanceof TypeVariable) && (t2 instanceof TypeVariable)) {
            t1 = getUpperBound(t1);
            t2 = getUpperBound(t2);
            if (processingEnv.getTypeUtils().isSameType(t1, t2)) {
                return EquivalencyResult.EQUIVALENT;
            }
        }
        if ((t1 instanceof DeclaredType) && (t2 instanceof DeclaredType)) {
            DeclaredType dtT1 = (DeclaredType) t1;
            DeclaredType dtT2 = (DeclaredType) t2;
            TypeMirror rawT1 = toRawType(processingEnv, dtT1);
            TypeMirror rawT2 = toRawType(processingEnv, dtT2);
            if (!processingEnv.getTypeUtils().isSameType(rawT1, rawT2)) {
                return EquivalencyResult.notEquivalent("Base types %s and %s are not compatible", rawT1, rawT2);
            }
            List<? extends TypeMirror> argsT1 = dtT1.getTypeArguments();
            List<? extends TypeMirror> argsT2 = dtT2.getTypeArguments();
            if (argsT1.size() != argsT2.size()) {
                if (argsT1.size() == 0) {
                    return EquivalencyResult.equivalentButRaw(1);
                }
                if (argsT2.size() == 0) {
                    return EquivalencyResult.equivalentButRaw(2);
                }
                return EquivalencyResult.notEquivalent("Mismatched generic argument counts %s<[%d]> and %s<[%d]>", rawT1, Integer.valueOf(argsT1.size()), rawT2, Integer.valueOf(argsT2.size()));
            }
            for (int arg = 0; arg < argsT1.size(); arg++) {
                TypeMirror argT1 = (TypeMirror) argsT1.get(arg);
                TypeMirror argT2 = (TypeMirror) argsT2.get(arg);
                if (isEquivalentType(processingEnv, argT1, argT2).type != Equivalency.EQUIVALENT) {
                    return EquivalencyResult.boundsMismatch("Generic bounds mismatch between %s and %s", describeGenericBound(argT1), describeGenericBound(argT2));
                }
            }
            return EquivalencyResult.EQUIVALENT;
        }
        return EquivalencyResult.notEquivalent("%s and %s do not match", t1, t2);
    }

    private static TypeMirror toRawType(ProcessingEnvironment processingEnv, DeclaredType targetType) {
        if (targetType.getKind() == TypeKind.INTERSECTION) {
            return targetType;
        }
        Name qualifiedName = targetType.asElement().getQualifiedName();
        TypeElement typeElement = processingEnv.getElementUtils().getTypeElement(qualifiedName);
        return typeElement != null ? typeElement.asType() : targetType;
    }

    public static Visibility getVisibility(Element element) {
        if (element == null) {
            return null;
        }
        for (Modifier modifier : element.getModifiers()) {
            switch (AnonymousClass1.$SwitchMap$javax$lang$model$element$Modifier[modifier.ordinal()]) {
                case 1:
                    return Visibility.PUBLIC;
                case 2:
                    return Visibility.PROTECTED;
                case 3:
                    return Visibility.PRIVATE;
            }
        }
        return Visibility.PACKAGE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.spongepowered.tools.obfuscation.mirror.TypeUtils$1  reason: invalid class name */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/mirror/TypeUtils$1.class */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$javax$lang$model$type$TypeKind;
        static final /* synthetic */ int[] $SwitchMap$javax$lang$model$element$Modifier = new int[Modifier.values().length];

        static {
            try {
                $SwitchMap$javax$lang$model$element$Modifier[Modifier.PUBLIC.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$javax$lang$model$element$Modifier[Modifier.PROTECTED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$javax$lang$model$element$Modifier[Modifier.PRIVATE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $SwitchMap$javax$lang$model$type$TypeKind = new int[TypeKind.values().length];
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.DECLARED.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.TYPEVAR.ordinal()] = 3;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.BYTE.ordinal()] = 6;
            } catch (NoSuchFieldError e9) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.CHAR.ordinal()] = 7;
            } catch (NoSuchFieldError e10) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError e11) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError e12) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.INT.ordinal()] = 10;
            } catch (NoSuchFieldError e13) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.LONG.ordinal()] = 11;
            } catch (NoSuchFieldError e14) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.SHORT.ordinal()] = 12;
            } catch (NoSuchFieldError e15) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.VOID.ordinal()] = 13;
            } catch (NoSuchFieldError e16) {
            }
        }
    }
}
