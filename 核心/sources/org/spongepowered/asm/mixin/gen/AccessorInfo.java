package org.spongepowered.asm.mixin.gen;

import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableSet;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.gen.throwables.InvalidAccessorException;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelector;
import org.spongepowered.asm.mixin.injection.selectors.TargetSelector;
import org.spongepowered.asm.mixin.injection.struct.MemberInfo;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.mixin.struct.SpecialMethodInfo;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.asm.ElementNode;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/gen/AccessorInfo.class */
public class AccessorInfo extends SpecialMethodInfo {
    protected final Class<? extends Annotation> annotationClass;
    protected final Type[] argTypes;
    protected final Type returnType;
    protected final boolean isStatic;
    protected final String specifiedName;
    protected final AccessorType type;
    private final Type targetFieldType;
    protected final ITargetSelector target;
    protected FieldNode targetField;
    protected MethodNode targetMethod;
    protected AccessorGenerator generator;

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/gen/AccessorInfo$AccessorType.class */
    public enum AccessorType {
        FIELD_GETTER(ImmutableSet.of("get", "is")) { // from class: org.spongepowered.asm.mixin.gen.AccessorInfo.AccessorType.1
            @Override // org.spongepowered.asm.mixin.gen.AccessorInfo.AccessorType
            AccessorGenerator getGenerator(AccessorInfo info) {
                return new AccessorGeneratorFieldGetter(info);
            }
        },
        FIELD_SETTER(ImmutableSet.of("set")) { // from class: org.spongepowered.asm.mixin.gen.AccessorInfo.AccessorType.2
            @Override // org.spongepowered.asm.mixin.gen.AccessorInfo.AccessorType
            AccessorGenerator getGenerator(AccessorInfo info) {
                return new AccessorGeneratorFieldSetter(info);
            }
        },
        METHOD_PROXY(ImmutableSet.of("call", "invoke")) { // from class: org.spongepowered.asm.mixin.gen.AccessorInfo.AccessorType.3
            @Override // org.spongepowered.asm.mixin.gen.AccessorInfo.AccessorType
            AccessorGenerator getGenerator(AccessorInfo info) {
                return new AccessorGeneratorMethodProxy(info);
            }
        },
        OBJECT_FACTORY(ImmutableSet.of("new", "create")) { // from class: org.spongepowered.asm.mixin.gen.AccessorInfo.AccessorType.4
            @Override // org.spongepowered.asm.mixin.gen.AccessorInfo.AccessorType
            AccessorGenerator getGenerator(AccessorInfo info) {
                return new AccessorGeneratorObjectFactory(info);
            }
        };
        
        private final Set<String> expectedPrefixes;

        abstract AccessorGenerator getGenerator(AccessorInfo accessorInfo);

        AccessorType(Set set) {
            this.expectedPrefixes = set;
        }

        public boolean isExpectedPrefix(String prefix) {
            return this.expectedPrefixes.contains(prefix);
        }

        public Set<String> getExpectedPrefixes() {
            return Collections.unmodifiableSet(this.expectedPrefixes);
        }
    }

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/gen/AccessorInfo$AccessorName.class */
    public static final class AccessorName {
        private static final Pattern PATTERN = Pattern.compile("^(" + getPrefixList() + ")(([A-Z])(.*?))(_\\$md.*)?$");
        public final String methodName;
        public final String prefix;
        public final String name;

        private AccessorName(String methodName, String prefix, String name) {
            this.methodName = methodName;
            this.prefix = prefix;
            this.name = name;
        }

        public String toString() {
            return super.toString();
        }

        public static AccessorName of(String methodName) {
            return of(methodName, true);
        }

        public static AccessorName of(String methodName, boolean toMemberCase) {
            Matcher nameMatcher = PATTERN.matcher(methodName);
            if (nameMatcher.matches()) {
                String prefix = nameMatcher.group(1);
                String namePart = nameMatcher.group(2);
                String firstChar = nameMatcher.group(3);
                String remainder = nameMatcher.group(4);
                boolean nameIsUpperCase = isUpperCase(Locale.ROOT, namePart);
                Object[] objArr = new Object[2];
                objArr[0] = toLowerCaseIf(Locale.ROOT, firstChar, toMemberCase && !nameIsUpperCase);
                objArr[1] = remainder;
                String name = String.format("%s%s", objArr);
                return new AccessorName(methodName, prefix, name);
            }
            return null;
        }

        private static boolean isUpperCase(Locale locale, String string) {
            return string.toUpperCase(locale).equals(string);
        }

        private static String toLowerCaseIf(Locale locale, String string, boolean condition) {
            return condition ? string.toLowerCase(locale) : string;
        }

        private static String getPrefixList() {
            AccessorType[] values;
            List<String> prefixes = new ArrayList<>();
            for (AccessorType type : AccessorType.values()) {
                prefixes.addAll(type.getExpectedPrefixes());
            }
            return Joiner.on('|').join(prefixes);
        }
    }

    public AccessorInfo(MixinTargetContext mixin, MethodNode method) {
        this(mixin, method, Accessor.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AccessorInfo(MixinTargetContext mixin, MethodNode method, Class<? extends Annotation> annotationClass) {
        super(mixin, method, Annotations.getVisible(method, annotationClass));
        this.annotationClass = annotationClass;
        this.argTypes = Type.getArgumentTypes(method.desc);
        this.returnType = Type.getReturnType(method.desc);
        this.isStatic = Bytecode.isStatic(method);
        this.specifiedName = (String) Annotations.getValue(this.annotation);
        this.type = initType();
        this.targetFieldType = initTargetFieldType();
        this.target = initTarget();
    }

    protected AccessorType initType() {
        if (this.returnType.equals(Type.VOID_TYPE)) {
            return AccessorType.FIELD_SETTER;
        }
        return AccessorType.FIELD_GETTER;
    }

    protected Type initTargetFieldType() {
        switch (this.type) {
            case FIELD_GETTER:
                if (this.argTypes.length > 0) {
                    throw new InvalidAccessorException(this.mixin, this + " must take exactly 0 arguments, found " + this.argTypes.length);
                }
                return this.returnType;
            case FIELD_SETTER:
                if (this.argTypes.length != 1) {
                    throw new InvalidAccessorException(this.mixin, this + " must take exactly 1 argument, found " + this.argTypes.length);
                }
                return this.argTypes[0];
            default:
                throw new InvalidAccessorException(this.mixin, "Computed unsupported accessor type " + this.type + " for " + this);
        }
    }

    protected ITargetSelector initTarget() {
        MemberInfo target = new MemberInfo(getTargetName(this.specifiedName), (String) null, this.targetFieldType.getDescriptor());
        this.annotation.visit("target", target.toString());
        return target;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getTargetName(String name) {
        if (Strings.isNullOrEmpty(name)) {
            String inflectedTarget = inflectTarget();
            if (inflectedTarget == null) {
                throw new InvalidAccessorException(this.mixin, String.format("Failed to inflect target name for %s, supported prefixes: %s", this, this.type.getExpectedPrefixes()));
            }
            return inflectedTarget;
        }
        return TargetSelector.parseName(name, this.mixin);
    }

    protected String inflectTarget() {
        return inflectTarget(this.method.name, this.type, toString(), this.mixin, this.mixin.getEnvironment().getOption(MixinEnvironment.Option.DEBUG_VERBOSE));
    }

    public static String inflectTarget(String name, AccessorType type, String description, IMixinContext context, boolean verbose) {
        return inflectTarget(AccessorName.of(name), type, description, context, verbose);
    }

    public static String inflectTarget(AccessorName name, AccessorType type, String description, IMixinContext context, boolean verbose) {
        if (name != null) {
            if (!type.isExpectedPrefix(name.prefix) && verbose) {
                LogManager.getLogger(MixinLaunchPlugin.NAME).warn("Unexpected prefix for {}, found [{}] expecting {}", new Object[]{description, name.prefix, type.getExpectedPrefixes()});
            }
            return TargetSelector.parseName(name.name, context);
        }
        return null;
    }

    public final ITargetSelector getTarget() {
        return this.target;
    }

    public final Type getTargetFieldType() {
        return this.targetFieldType;
    }

    public final FieldNode getTargetField() {
        return this.targetField;
    }

    public final MethodNode getTargetMethod() {
        return this.targetMethod;
    }

    public final Type getReturnType() {
        return this.returnType;
    }

    public final Type[] getArgTypes() {
        return this.argTypes;
    }

    public boolean isStatic() {
        return this.isStatic;
    }

    public String toString() {
        String typeString = this.type != null ? this.type.toString() : "UNPARSED_ACCESSOR";
        return String.format("%s->@%s[%s]::%s%s", this.mixin, Bytecode.getSimpleName(this.annotation), typeString, this.methodName, this.method.desc);
    }

    public void locate() {
        this.targetField = findTargetField();
    }

    public void validate() {
        this.generator = this.type.getGenerator(this);
        this.generator.validate();
    }

    public MethodNode generate() {
        MethodNode generatedAccessor = this.generator.generate();
        Annotations.merge(this.method, generatedAccessor);
        return generatedAccessor;
    }

    private FieldNode findTargetField() {
        return (FieldNode) findTarget(ElementNode.fieldList(this.classNode));
    }

    protected <TNode> TNode findTarget(List<ElementNode<TNode>> nodes) {
        TargetSelector.Result<TNode> result = TargetSelector.run(this.target.configure("orphan"), nodes);
        try {
            return result.getSingleResult(true);
        } catch (IllegalStateException ex) {
            throw new InvalidAccessorException(this, ex.getMessage() + " matching " + this.target + " in " + this.classNode.name + " for " + this);
        }
    }

    public static AccessorInfo of(MixinTargetContext mixin, MethodNode method, Class<? extends Annotation> type) {
        if (type == Accessor.class) {
            return new AccessorInfo(mixin, method);
        }
        if (type == Invoker.class) {
            return new InvokerInfo(mixin, method);
        }
        throw new InvalidAccessorException(mixin, "Could not parse accessor for unknown type " + type.getName());
    }
}
