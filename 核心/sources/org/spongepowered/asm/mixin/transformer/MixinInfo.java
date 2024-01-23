package org.spongepowered.asm.mixin.transformer;

import com.google.common.base.Functions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.objectweb.asm.Handle;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InnerClassNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.mixin.Implements;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.extensibility.IMixinConfig;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.injection.Surrogate;
import org.spongepowered.asm.mixin.injection.invoke.arg.ArgsClassGenerator;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.transformer.ClassInfo;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.mixin.transformer.throwables.MixinReloadException;
import org.spongepowered.asm.mixin.transformer.throwables.MixinTargetAlreadyLoadedException;
import org.spongepowered.asm.service.IClassTracker;
import org.spongepowered.asm.service.IMixinService;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.Constants;
import org.spongepowered.asm.util.asm.ASM;
import org.spongepowered.asm.util.asm.MethodNodeEx;
import org.spongepowered.asm.util.perf.Profiler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/MixinInfo.class */
public class MixinInfo implements Comparable<MixinInfo>, IMixinInfo {
    static int mixinOrder = 0;
    private final transient MixinConfig parent;
    private final String name;
    private final String className;
    private final int priority;
    private final boolean virtual;
    private final transient List<DeclaredTarget> declaredTargets;
    private final transient int order;
    private final transient IMixinService service;
    private final transient PluginHandle plugin;
    private final transient MixinEnvironment.Phase phase;
    private final transient ClassInfo info;
    private final transient SubType type;
    private final transient boolean strict;
    private transient State pendingState;
    private transient State state;
    private final transient Logger logger = LogManager.getLogger(MixinLaunchPlugin.NAME);
    private final transient Profiler profiler = MixinEnvironment.getProfiler();
    private final transient List<ClassInfo> targetClasses = new ArrayList();
    private final List<String> targetClassNames = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/MixinInfo$Variant.class */
    public enum Variant {
        STANDARD,
        INTERFACE,
        ACCESSOR,
        PROXY
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/MixinInfo$MixinMethodNode.class */
    public class MixinMethodNode extends MethodNodeEx {
        public MixinMethodNode(int access, String name, String desc, String signature, String[] exceptions) {
            super(access, name, desc, signature, exceptions, MixinInfo.this);
        }

        public void visitInvokeDynamicInsn(String name, String descriptor, Handle bootstrapMethodHandle, Object... bootstrapMethodArguments) {
            Object[] bsmArgs = new Object[bootstrapMethodArguments.length];
            System.arraycopy(bootstrapMethodArguments, 0, bsmArgs, 0, bootstrapMethodArguments.length);
            this.instructions.add(new InvokeDynamicInsnNode(name, descriptor, bootstrapMethodHandle, bsmArgs));
        }

        public boolean isInjector() {
            return getInjectorAnnotation() != null || isSurrogate();
        }

        public boolean isSurrogate() {
            return getVisibleAnnotation(Surrogate.class) != null;
        }

        public boolean isSynthetic() {
            return Bytecode.hasFlag(this, 4096);
        }

        public AnnotationNode getVisibleAnnotation(Class<? extends Annotation> annotationClass) {
            return Annotations.getVisible(this, annotationClass);
        }

        public AnnotationNode getInjectorAnnotation() {
            return InjectionInfo.getInjectorAnnotation(MixinInfo.this, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/MixinInfo$MixinClassNode.class */
    public class MixinClassNode extends ClassNode {
        public final List<MixinMethodNode> mixinMethods;

        MixinClassNode(MixinInfo this$0, MixinInfo mixin) {
            this(ASM.API_VERSION);
        }

        protected MixinClassNode(int api) {
            super(api);
            this.mixinMethods = this.methods;
        }

        public MixinInfo getMixin() {
            return MixinInfo.this;
        }

        public List<FieldNode> getFields() {
            return new ArrayList(this.fields);
        }

        public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
            MixinMethodNode mixinMethodNode = new MixinMethodNode(access, name, desc, signature, exceptions);
            this.methods.add(mixinMethodNode);
            return mixinMethodNode;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/MixinInfo$State.class */
    public class State {
        private final ClassNode classNode;
        private final ClassInfo classInfo;
        private boolean detachedSuper;
        private boolean unique;
        protected final Set<String> interfaces;
        protected final List<InterfaceInfo> softImplements;
        protected final Set<String> syntheticInnerClasses;
        protected final Set<String> innerClasses;
        protected MixinClassNode validationClassNode;

        State(MixinInfo this$0, ClassNode classNode) {
            this(classNode, null);
        }

        State(ClassNode classNode, ClassInfo classInfo) {
            this.interfaces = new HashSet();
            this.softImplements = new ArrayList();
            this.syntheticInnerClasses = new HashSet();
            this.innerClasses = new HashSet();
            this.classNode = classNode;
            connect();
            this.classInfo = classInfo != null ? classInfo : ClassInfo.fromClassNode(getValidationClassNode());
        }

        protected void connect() {
            this.validationClassNode = createClassNode(0);
        }

        protected void complete() {
            this.validationClassNode = null;
        }

        ClassInfo getClassInfo() {
            return this.classInfo;
        }

        ClassNode getClassNode() {
            return this.classNode;
        }

        MixinClassNode getValidationClassNode() {
            if (this.validationClassNode == null) {
                throw new IllegalStateException("Attempted a validation task after validation is complete on " + this + " in " + MixinInfo.this);
            }
            return this.validationClassNode;
        }

        boolean isDetachedSuper() {
            return this.detachedSuper;
        }

        boolean isUnique() {
            return this.unique;
        }

        List<? extends InterfaceInfo> getSoftImplements() {
            return this.softImplements;
        }

        Set<String> getSyntheticInnerClasses() {
            return this.syntheticInnerClasses;
        }

        Set<String> getInnerClasses() {
            return this.innerClasses;
        }

        Set<String> getInterfaces() {
            return this.interfaces;
        }

        MixinClassNode createClassNode(int flags) {
            MixinClassNode mixinClassNode = new MixinClassNode(MixinInfo.this, MixinInfo.this);
            this.classNode.accept(mixinClassNode);
            return mixinClassNode;
        }

        void validate(SubType type, List<ClassInfo> targetClasses) {
            MixinClassNode classNode = getValidationClassNode();
            MixinPreProcessorStandard preProcessor = type.createPreProcessor(classNode).prepare();
            for (ClassInfo target : targetClasses) {
                preProcessor.conform(target);
            }
            type.validate(this, targetClasses);
            this.detachedSuper = type.isDetachedSuper();
            this.unique = Annotations.getVisible(classNode, Unique.class) != null;
            validateInner();
            validateClassVersion();
            validateRemappables(targetClasses);
            readImplementations(type);
            readInnerClasses();
            validateChanges(type, targetClasses);
            complete();
        }

        private void validateInner() {
            if (!this.classInfo.isProbablyStatic()) {
                throw new InvalidMixinException(MixinInfo.this, "Inner class mixin must be declared static");
            }
        }

        private void validateClassVersion() {
            MixinEnvironment.CompatibilityLevel[] values;
            if (this.validationClassNode.version > MixinEnvironment.getCompatibilityLevel().classVersion()) {
                String helpText = ".";
                for (MixinEnvironment.CompatibilityLevel level : MixinEnvironment.CompatibilityLevel.values()) {
                    if (level.classVersion() >= this.validationClassNode.version) {
                        helpText = String.format(". Mixin requires compatibility level %s or above.", level.name());
                    }
                }
                throw new InvalidMixinException(MixinInfo.this, "Unsupported mixin class version " + this.validationClassNode.version + helpText);
            }
        }

        private void validateRemappables(List<ClassInfo> targetClasses) {
            if (targetClasses.size() > 1) {
                for (FieldNode field : this.validationClassNode.fields) {
                    validateRemappable(Shadow.class, field.name, Annotations.getVisible(field, Shadow.class));
                }
                for (MethodNode method : this.validationClassNode.methods) {
                    validateRemappable(Shadow.class, method.name, Annotations.getVisible(method, Shadow.class));
                    AnnotationNode overwrite = Annotations.getVisible(method, Overwrite.class);
                    if (overwrite != null && ((method.access & 8) == 0 || (method.access & 1) == 0)) {
                        throw new InvalidMixinException(MixinInfo.this, "Found @Overwrite annotation on " + method.name + " in " + MixinInfo.this);
                    }
                }
            }
        }

        private void validateRemappable(Class<Shadow> annotationClass, String name, AnnotationNode annotation) {
            if (annotation != null && ((Boolean) Annotations.getValue(annotation, "remap", Boolean.TRUE)).booleanValue()) {
                throw new InvalidMixinException(MixinInfo.this, "Found a remappable @" + annotationClass.getSimpleName() + " annotation on " + name + " in " + this);
            }
        }

        void readImplementations(SubType type) {
            List<AnnotationNode> interfaces;
            this.interfaces.addAll(this.validationClassNode.interfaces);
            this.interfaces.addAll(type.getInterfaces());
            AnnotationNode implementsAnnotation = Annotations.getInvisible(this.validationClassNode, Implements.class);
            if (implementsAnnotation == null || (interfaces = (List) Annotations.getValue(implementsAnnotation)) == null) {
                return;
            }
            for (AnnotationNode interfaceNode : interfaces) {
                InterfaceInfo interfaceInfo = InterfaceInfo.fromAnnotation(MixinInfo.this, interfaceNode);
                this.softImplements.add(interfaceInfo);
                this.interfaces.add(interfaceInfo.getInternalName());
                if (!(this instanceof Reloaded)) {
                    this.classInfo.addInterface(interfaceInfo.getInternalName());
                }
            }
        }

        void readInnerClasses() {
            for (InnerClassNode inner : this.validationClassNode.innerClasses) {
                ClassInfo innerClass = ClassInfo.forName(inner.name);
                if ((inner.outerName != null && inner.outerName.equals(this.classInfo.getName())) || inner.name.startsWith(this.validationClassNode.name + ArgsClassGenerator.GETTER_PREFIX)) {
                    if (innerClass.isProbablyStatic() && innerClass.isSynthetic()) {
                        this.syntheticInnerClasses.add(inner.name);
                    } else {
                        this.innerClasses.add(inner.name);
                    }
                }
            }
        }

        protected void validateChanges(SubType type, List<ClassInfo> targetClasses) {
            type.createPreProcessor(this.validationClassNode).prepare();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/MixinInfo$Reloaded.class */
    public class Reloaded extends State {
        private final State previous;

        Reloaded(State previous, ClassNode classNode) {
            super(classNode, previous.getClassInfo());
            this.previous = previous;
        }

        @Override // org.spongepowered.asm.mixin.transformer.MixinInfo.State
        protected void validateChanges(SubType type, List<ClassInfo> targetClasses) {
            if (!this.syntheticInnerClasses.equals(this.previous.syntheticInnerClasses)) {
                throw new MixinReloadException(MixinInfo.this, "Cannot change inner classes");
            }
            if (!this.interfaces.equals(this.previous.interfaces)) {
                throw new MixinReloadException(MixinInfo.this, "Cannot change interfaces");
            }
            if (!new HashSet(this.softImplements).equals(new HashSet(this.previous.softImplements))) {
                throw new MixinReloadException(MixinInfo.this, "Cannot change soft interfaces");
            }
            List<ClassInfo> targets = MixinInfo.this.readTargetClasses(this.validationClassNode, true);
            if (!new HashSet(targets).equals(new HashSet(targetClasses))) {
                throw new MixinReloadException(MixinInfo.this, "Cannot change target classes");
            }
            int priority = MixinInfo.this.readPriority(this.validationClassNode);
            if (priority != MixinInfo.this.getPriority()) {
                throw new MixinReloadException(MixinInfo.this, "Cannot change mixin priority");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/MixinInfo$SubType.class */
    public static abstract class SubType {
        protected final MixinInfo mixin;
        protected final String annotationType;
        protected final boolean targetMustBeInterface;
        protected boolean detached;

        abstract void validate(State state, List<ClassInfo> list);

        abstract MixinPreProcessorStandard createPreProcessor(MixinClassNode mixinClassNode);

        SubType(MixinInfo info, String annotationType, boolean targetMustBeInterface) {
            this.mixin = info;
            this.annotationType = annotationType;
            this.targetMustBeInterface = targetMustBeInterface;
        }

        Collection<String> getInterfaces() {
            return Collections.emptyList();
        }

        boolean isDetachedSuper() {
            return this.detached;
        }

        boolean isLoadable() {
            return false;
        }

        void validateTarget(String targetName, ClassInfo targetInfo) {
            boolean targetIsInterface = targetInfo.isInterface();
            if (targetIsInterface != this.targetMustBeInterface) {
                String not = targetIsInterface ? "" : "not ";
                throw new InvalidMixinException(this.mixin, this.annotationType + " target type mismatch: " + targetName + " is " + not + "an interface in " + this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/MixinInfo$SubType$Standard.class */
        public static class Standard extends SubType {
            Standard(MixinInfo info) {
                super(info, "@Mixin", false);
            }

            @Override // org.spongepowered.asm.mixin.transformer.MixinInfo.SubType
            void validate(State state, List<ClassInfo> targetClasses) {
                ClassNode classNode = state.getValidationClassNode();
                for (ClassInfo targetClass : targetClasses) {
                    if (!classNode.superName.equals(targetClass.getSuperName())) {
                        if (!targetClass.hasSuperClass(classNode.superName, ClassInfo.Traversal.SUPER)) {
                            ClassInfo superClass = ClassInfo.forName(classNode.superName);
                            if (superClass.isMixin()) {
                                for (ClassInfo superTarget : superClass.getTargets()) {
                                    if (targetClasses.contains(superTarget)) {
                                        throw new InvalidMixinException(this.mixin, "Illegal hierarchy detected. Derived mixin " + this + " targets the same class " + superTarget.getClassName() + " as its superclass " + superClass.getClassName());
                                    }
                                }
                            }
                            throw new InvalidMixinException(this.mixin, "Super class '" + classNode.superName.replace('/', '.') + "' of " + this.mixin.getName() + " was not found in the hierarchy of target class '" + targetClass + "'");
                        }
                        this.detached = true;
                    }
                }
            }

            @Override // org.spongepowered.asm.mixin.transformer.MixinInfo.SubType
            MixinPreProcessorStandard createPreProcessor(MixinClassNode classNode) {
                return new MixinPreProcessorStandard(this.mixin, classNode);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/MixinInfo$SubType$Interface.class */
        public static class Interface extends SubType {
            Interface(MixinInfo info) {
                super(info, "@Mixin", true);
            }

            @Override // org.spongepowered.asm.mixin.transformer.MixinInfo.SubType
            void validate(State state, List<ClassInfo> targetClasses) {
                if (!MixinEnvironment.getCompatibilityLevel().supports(1)) {
                    throw new InvalidMixinException(this.mixin, "Interface mixin not supported in current enviromnment");
                }
                ClassNode classNode = state.getValidationClassNode();
                if (!Constants.OBJECT.equals(classNode.superName)) {
                    throw new InvalidMixinException(this.mixin, "Super class of " + this + " is invalid, found " + classNode.superName.replace('/', '.'));
                }
            }

            @Override // org.spongepowered.asm.mixin.transformer.MixinInfo.SubType
            MixinPreProcessorStandard createPreProcessor(MixinClassNode classNode) {
                return new MixinPreProcessorInterface(this.mixin, classNode);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/MixinInfo$SubType$Accessor.class */
        public static class Accessor extends SubType {
            private final Collection<String> interfaces;

            Accessor(MixinInfo info) {
                super(info, "@Mixin", false);
                this.interfaces = new ArrayList();
                this.interfaces.add(info.getClassRef());
            }

            @Override // org.spongepowered.asm.mixin.transformer.MixinInfo.SubType
            boolean isLoadable() {
                return true;
            }

            @Override // org.spongepowered.asm.mixin.transformer.MixinInfo.SubType
            Collection<String> getInterfaces() {
                return this.interfaces;
            }

            @Override // org.spongepowered.asm.mixin.transformer.MixinInfo.SubType
            void validateTarget(String targetName, ClassInfo targetInfo) {
                boolean targetIsInterface = targetInfo.isInterface();
                if (targetIsInterface && !MixinEnvironment.getCompatibilityLevel().supports(1)) {
                    throw new InvalidMixinException(this.mixin, "Accessor mixin targetting an interface is not supported in current enviromnment");
                }
            }

            @Override // org.spongepowered.asm.mixin.transformer.MixinInfo.SubType
            void validate(State state, List<ClassInfo> targetClasses) {
                ClassNode classNode = state.getValidationClassNode();
                if (!Constants.OBJECT.equals(classNode.superName)) {
                    throw new InvalidMixinException(this.mixin, "Super class of " + this + " is invalid, found " + classNode.superName.replace('/', '.'));
                }
            }

            @Override // org.spongepowered.asm.mixin.transformer.MixinInfo.SubType
            MixinPreProcessorStandard createPreProcessor(MixinClassNode classNode) {
                return new MixinPreProcessorAccessor(this.mixin, classNode);
            }
        }

        static SubType getTypeFor(MixinInfo mixin) {
            Variant variant = MixinInfo.getVariant(mixin.getClassInfo());
            switch (variant) {
                case STANDARD:
                    return new Standard(mixin);
                case INTERFACE:
                    return new Interface(mixin);
                case ACCESSOR:
                    return new Accessor(mixin);
                default:
                    throw new IllegalStateException("Unsupported Mixin variant " + variant + " for " + mixin);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/MixinInfo$DeclaredTarget.class */
    public static final class DeclaredTarget {
        final String name;
        final boolean isPrivate;

        private DeclaredTarget(String name, boolean isPrivate) {
            this.name = name;
            this.isPrivate = isPrivate;
        }

        public String toString() {
            return this.name;
        }

        static DeclaredTarget of(Object target, MixinInfo info) {
            if (target instanceof String) {
                String remappedName = info.remapClassName((String) target);
                if (remappedName != null) {
                    return new DeclaredTarget(remappedName, true);
                }
                return null;
            } else if (target instanceof Type) {
                return new DeclaredTarget(((Type) target).getClassName(), false);
            } else {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MixinInfo(IMixinService service, MixinConfig parent, String name, PluginHandle plugin, boolean ignorePlugin) {
        IClassTracker tracker;
        int i = mixinOrder;
        mixinOrder = i + 1;
        this.order = i;
        this.service = service;
        this.parent = parent;
        this.name = name;
        this.className = parent.getMixinPackage() + name;
        this.plugin = plugin;
        this.phase = parent.getEnvironment().getPhase();
        this.strict = parent.getEnvironment().getOption(MixinEnvironment.Option.DEBUG_TARGETS);
        try {
            ClassNode mixinClassNode = loadMixinClass(this.className);
            this.pendingState = new State(this, mixinClassNode);
            this.info = this.pendingState.getClassInfo();
            this.type = SubType.getTypeFor(this);
            if (!this.type.isLoadable() && (tracker = this.service.getClassTracker()) != null) {
                tracker.registerInvalidClass(this.className);
            }
            try {
                this.priority = readPriority(this.pendingState.getClassNode());
                this.virtual = readPseudo(this.pendingState.getValidationClassNode());
                this.declaredTargets = readDeclaredTargets(this.pendingState.getValidationClassNode(), ignorePlugin);
            } catch (InvalidMixinException ex) {
                throw ex;
            } catch (Exception ex2) {
                throw new InvalidMixinException(this, ex2);
            }
        } catch (InvalidMixinException ex3) {
            throw ex3;
        } catch (Exception ex4) {
            throw new InvalidMixinException(this, ex4.getMessage(), ex4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void parseTargets() {
        try {
            this.targetClasses.addAll(readTargetClasses(this.declaredTargets));
            this.targetClassNames.addAll(Lists.transform(this.targetClasses, Functions.toStringFunction()));
        } catch (InvalidMixinException ex) {
            throw ex;
        } catch (Exception ex2) {
            throw new InvalidMixinException(this, ex2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void validate() {
        if (this.pendingState == null) {
            throw new IllegalStateException("No pending validation state for " + this);
        }
        try {
            this.pendingState.validate(this.type, this.targetClasses);
            this.state = this.pendingState;
        } finally {
            this.pendingState = null;
        }
    }

    protected List<DeclaredTarget> readDeclaredTargets(MixinClassNode classNode, boolean ignorePlugin) {
        if (classNode == null) {
            return Collections.emptyList();
        }
        AnnotationNode mixin = Annotations.getInvisible(classNode, Mixin.class);
        if (mixin == null) {
            throw new InvalidMixinException(this, String.format("The mixin '%s' is missing an @Mixin annotation", this.className));
        }
        IClassTracker tracker = this.service.getClassTracker();
        List<DeclaredTarget> declaredTargets = new ArrayList<>();
        for (Object target : readTargets(mixin)) {
            DeclaredTarget declaredTarget = DeclaredTarget.of(target, this);
            if (declaredTarget != null) {
                if (tracker != null && tracker.isClassLoaded(declaredTarget.name) && !isReloading()) {
                    String message = String.format("Critical problem: %s target %s was loaded too early.", this, declaredTarget.name);
                    if (this.parent.isRequired()) {
                        throw new MixinTargetAlreadyLoadedException(this, message, declaredTarget.name);
                    }
                    this.logger.error(message);
                }
                if (shouldApplyMixin(ignorePlugin, declaredTarget.name)) {
                    declaredTargets.add(declaredTarget);
                }
            }
        }
        return declaredTargets;
    }

    private Iterable<Object> readTargets(AnnotationNode mixin) {
        Iterable<Object> publicTargets = (Iterable) Annotations.getValue(mixin, "value");
        Iterable<Object> privateTargets = (Iterable) Annotations.getValue(mixin, "targets");
        if (publicTargets == null && privateTargets == null) {
            return Collections.emptyList();
        }
        if (publicTargets == null) {
            return privateTargets;
        }
        return privateTargets == null ? publicTargets : Iterables.concat(publicTargets, privateTargets);
    }

    private boolean shouldApplyMixin(boolean ignorePlugin, String targetName) {
        Profiler.Section pluginTimer = this.profiler.begin("plugin");
        boolean result = ignorePlugin || this.plugin.shouldApplyMixin(targetName, this.className);
        pluginTimer.end();
        return result;
    }

    List<ClassInfo> readTargetClasses(MixinClassNode classNode, boolean ignorePlugin) {
        return readTargetClasses(readDeclaredTargets(classNode, ignorePlugin));
    }

    private List<ClassInfo> readTargetClasses(List<DeclaredTarget> declaredTargets) throws InvalidMixinException {
        List<ClassInfo> targetClasses = new ArrayList<>();
        for (DeclaredTarget target : declaredTargets) {
            ClassInfo targetClass = getTargetClass(target);
            if (targetClass != null) {
                targetClasses.add(targetClass);
                targetClass.addMixin(this);
            }
        }
        return targetClasses;
    }

    private ClassInfo getTargetClass(DeclaredTarget target) throws InvalidMixinException {
        ClassInfo targetInfo = ClassInfo.forName(target.name);
        if (targetInfo == null) {
            if (isVirtual()) {
                this.logger.debug("Skipping virtual target {} for {}", new Object[]{target.name, this});
                return null;
            }
            handleTargetError(String.format("@Mixin target %s was not found %s", target.name, this));
            return null;
        }
        this.type.validateTarget(target.name, targetInfo);
        if (target.isPrivate && targetInfo.isPublic() && !isVirtual()) {
            handleTargetError(String.format("@Mixin target %s is public in %s and should be specified in value", target.name, this));
        }
        return targetInfo;
    }

    private void handleTargetError(String message) {
        if (this.strict) {
            this.logger.error(message);
            throw new InvalidMixinException(this, message);
        } else {
            this.logger.warn(message);
        }
    }

    protected int readPriority(ClassNode classNode) {
        if (classNode == null) {
            return this.parent.getDefaultMixinPriority();
        }
        AnnotationNode mixin = Annotations.getInvisible(classNode, Mixin.class);
        if (mixin == null) {
            throw new InvalidMixinException(this, String.format("The mixin '%s' is missing an @Mixin annotation", this.className));
        }
        Integer priority = (Integer) Annotations.getValue(mixin, "priority");
        return priority == null ? this.parent.getDefaultMixinPriority() : priority.intValue();
    }

    protected boolean readPseudo(ClassNode classNode) {
        return Annotations.getInvisible(classNode, Pseudo.class) != null;
    }

    private boolean isReloading() {
        return this.pendingState instanceof Reloaded;
    }

    String remapClassName(String className) {
        return this.parent.remapClassName(getClassRef(), className);
    }

    public boolean hasDeclaredTarget(String targetClass) {
        for (DeclaredTarget declaredTarget : this.declaredTargets) {
            if (targetClass.equals(declaredTarget.name)) {
                return true;
            }
        }
        return false;
    }

    private State getState() {
        return this.state != null ? this.state : this.pendingState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ClassInfo getClassInfo() {
        return this.info;
    }

    @Override // org.spongepowered.asm.mixin.extensibility.IMixinInfo
    public IMixinConfig getConfig() {
        return this.parent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MixinConfig getParent() {
        return this.parent;
    }

    @Override // org.spongepowered.asm.mixin.extensibility.IMixinInfo
    public int getPriority() {
        return this.priority;
    }

    @Override // org.spongepowered.asm.mixin.extensibility.IMixinInfo
    public String getName() {
        return this.name;
    }

    @Override // org.spongepowered.asm.mixin.extensibility.IMixinInfo
    public String getClassName() {
        return this.className;
    }

    @Override // org.spongepowered.asm.mixin.extensibility.IMixinInfo
    public String getClassRef() {
        return getClassInfo().getName();
    }

    @Override // org.spongepowered.asm.mixin.extensibility.IMixinInfo
    public byte[] getClassBytes() {
        throw new RuntimeException("NO");
    }

    @Override // org.spongepowered.asm.mixin.extensibility.IMixinInfo
    public boolean isDetachedSuper() {
        return getState().isDetachedSuper();
    }

    public boolean isUnique() {
        return getState().isUnique();
    }

    public boolean isVirtual() {
        return this.virtual;
    }

    public boolean isAccessor() {
        return this.type instanceof SubType.Accessor;
    }

    public boolean isLoadable() {
        return this.type.isLoadable();
    }

    public boolean isRequired() {
        return this.parent.isRequired();
    }

    public Level getLoggingLevel() {
        return this.parent.getLoggingLevel();
    }

    @Override // org.spongepowered.asm.mixin.extensibility.IMixinInfo
    public MixinEnvironment.Phase getPhase() {
        return this.phase;
    }

    @Override // org.spongepowered.asm.mixin.extensibility.IMixinInfo
    public MixinClassNode getClassNode(int flags) {
        return getState().createClassNode(flags);
    }

    List<String> getDeclaredTargetClasses() {
        return Collections.unmodifiableList(Lists.transform(this.declaredTargets, Functions.toStringFunction()));
    }

    @Override // org.spongepowered.asm.mixin.extensibility.IMixinInfo
    public List<String> getTargetClasses() {
        return Collections.unmodifiableList(this.targetClassNames);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<InterfaceInfo> getSoftImplements() {
        return Collections.unmodifiableList(getState().getSoftImplements());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<String> getSyntheticInnerClasses() {
        return Collections.unmodifiableSet(getState().getSyntheticInnerClasses());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<String> getInnerClasses() {
        return Collections.unmodifiableSet(getState().getInnerClasses());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<ClassInfo> getTargets() {
        return Collections.unmodifiableList(this.targetClasses);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<String> getInterfaces() {
        return getState().getInterfaces();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MixinTargetContext createContextFor(TargetClassContext target) {
        MixinClassNode classNode = getClassNode(8);
        Profiler.Section preTimer = this.profiler.begin("pre");
        MixinTargetContext context = this.type.createPreProcessor(classNode).prepare().createContextFor(target);
        preTimer.end();
        return context;
    }

    private ClassNode loadMixinClass(String mixinClassName) throws ClassNotFoundException {
        try {
            IClassTracker tracker = this.service.getClassTracker();
            if (tracker != null) {
                String restrictions = tracker.getClassRestrictions(mixinClassName);
                if (restrictions.length() > 0) {
                    this.logger.error("Classloader restrictions [{}] encountered loading {}, name: {}", new Object[]{restrictions, this, mixinClassName});
                }
            }
            ClassNode classNode = this.service.getBytecodeProvider().getClassNode(mixinClassName, true);
            return classNode;
        } catch (IOException ex) {
            this.logger.warn("Failed to load mixin {}, the specified mixin will not be applied", new Object[]{mixinClassName});
            throw new InvalidMixinException(this, "An error was encountered whilst loading the mixin class", ex);
        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundException(String.format("The specified mixin '%s' was not found", mixinClassName));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void reloadMixin(ClassNode classNode) {
        if (this.pendingState != null) {
            throw new IllegalStateException("Cannot reload mixin while it is initialising");
        }
        this.pendingState = new Reloaded(this.state, classNode);
        validate();
    }

    @Override // java.lang.Comparable
    public int compareTo(MixinInfo other) {
        if (other == null) {
            return 0;
        }
        if (other.priority == this.priority) {
            return this.order - other.order;
        }
        return this.priority - other.priority;
    }

    public void preApply(String transformedName, ClassNode targetClass) {
        if (this.plugin.isAvailable()) {
            Profiler.Section pluginTimer = this.profiler.begin("plugin");
            try {
                this.plugin.preApply(transformedName, targetClass, this.className, this);
                pluginTimer.end();
            } catch (Throwable th) {
                pluginTimer.end();
                throw th;
            }
        }
    }

    public void postApply(String transformedName, ClassNode targetClass) {
        if (this.plugin.isAvailable()) {
            Profiler.Section pluginTimer = this.profiler.begin("plugin");
            try {
                this.plugin.postApply(transformedName, targetClass, this.className, this);
                pluginTimer.end();
            } catch (Throwable th) {
                pluginTimer.end();
                throw th;
            }
        }
        this.parent.postApply(transformedName, targetClass);
        this.info.addAppliedMixin(this);
    }

    public String toString() {
        return String.format("%s:%s", this.parent.getName(), this.name);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Variant getVariant(ClassNode classNode) {
        return getVariant(ClassInfo.fromClassNode(classNode));
    }

    static Variant getVariant(ClassInfo classInfo) {
        if (!classInfo.isInterface()) {
            return Variant.STANDARD;
        }
        boolean containsNonAccessorMethod = false;
        for (ClassInfo.Method method : classInfo.getMethods()) {
            containsNonAccessorMethod |= (method.isAccessor() || method.isSynthetic()) ? false : true;
        }
        if (containsNonAccessorMethod) {
            return Variant.INTERFACE;
        }
        return Variant.ACCESSOR;
    }
}
