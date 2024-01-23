package org.spongepowered.asm.mixin.injection.struct;

import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableSet;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.tools.Diagnostic;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.code.ISliceContext;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.code.InjectorTarget;
import org.spongepowered.asm.mixin.injection.code.MethodSlice;
import org.spongepowered.asm.mixin.injection.code.MethodSlices;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelector;
import org.spongepowered.asm.mixin.injection.selectors.InvalidSelectorException;
import org.spongepowered.asm.mixin.injection.selectors.TargetSelector;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.throwables.InjectionError;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.mixin.struct.SpecialMethodInfo;
import org.spongepowered.asm.mixin.throwables.MixinError;
import org.spongepowered.asm.mixin.throwables.MixinException;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;
import org.spongepowered.asm.mixin.transformer.meta.MixinMerged;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.asm.ASM;
import org.spongepowered.asm.util.asm.ElementNode;
import org.spongepowered.asm.util.asm.MethodNodeEx;
import org.spongepowered.asm.util.logging.MessageRouter;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/struct/InjectionInfo.class */
public abstract class InjectionInfo extends SpecialMethodInfo implements ISliceContext {
    public static final String DEFAULT_PREFIX = "handler";
    private static Map<String, InjectorEntry> registry = new LinkedHashMap();
    private static Class<? extends Annotation>[] registeredAnnotations = new Class[0];
    protected final boolean isStatic;
    protected final Deque<MethodNode> targets;
    protected final MethodSlices slices;
    protected final String atKey;
    protected final List<InjectionPoint> injectionPoints;
    protected final Map<Target, List<InjectionNodes.InjectionNode>> targetNodes;
    protected int targetCount;
    protected Injector injector;
    protected InjectorGroupInfo group;
    private final List<MethodNode> injectedMethods;
    private int expectedCallbackCount;
    private int requiredCallbackCount;
    private int maxCallbackCount;
    private int injectedCallbackCount;
    private List<String> messages;

    @java.lang.annotation.Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/struct/InjectionInfo$AnnotationType.class */
    public @interface AnnotationType {
        Class<? extends Annotation> value();
    }

    @java.lang.annotation.Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/struct/InjectionInfo$HandlerPrefix.class */
    public @interface HandlerPrefix {
        String value();
    }

    protected abstract Injector parseInjector(AnnotationNode annotationNode);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/struct/InjectionInfo$InjectorEntry.class */
    public static class InjectorEntry {
        final Class<? extends Annotation> annotationType;
        final Class<? extends InjectionInfo> type;
        final Constructor<? extends InjectionInfo> ctor;
        final String simpleName;
        final String prefix;

        InjectorEntry(Class<? extends Annotation> annotationType, Class<? extends InjectionInfo> type) throws NoSuchMethodException {
            this.annotationType = annotationType;
            this.type = type;
            this.ctor = type.getDeclaredConstructor(MixinTargetContext.class, MethodNode.class, AnnotationNode.class);
            this.simpleName = annotationType.getSimpleName() + ";";
            HandlerPrefix handlerPrefix = (HandlerPrefix) type.getAnnotation(HandlerPrefix.class);
            this.prefix = handlerPrefix != null ? handlerPrefix.value() : InjectionInfo.DEFAULT_PREFIX;
        }

        InjectionInfo create(MixinTargetContext mixin, MethodNode method, AnnotationNode annotation) {
            try {
                return this.ctor.newInstance(mixin, method, annotation);
            } catch (InvocationTargetException itex) {
                Throwable cause = itex.getCause();
                if (cause instanceof MixinException) {
                    throw ((MixinException) cause);
                }
                Throwable ex = cause != null ? cause : itex;
                throw new MixinError("Error initialising injector metaclass [" + this.type + "] for annotation " + annotation.desc, ex);
            } catch (ReflectiveOperationException ex2) {
                throw new MixinError("Failed to instantiate injector metaclass [" + this.type + "] for annotation " + annotation.desc, ex2);
            }
        }
    }

    static {
        register(CallbackInjectionInfo.class);
        register(ModifyArgInjectionInfo.class);
        register(ModifyArgsInjectionInfo.class);
        register(RedirectInjectionInfo.class);
        register(ModifyVariableInjectionInfo.class);
        register(ModifyConstantInjectionInfo.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public InjectionInfo(MixinTargetContext mixin, MethodNode method, AnnotationNode annotation) {
        this(mixin, method, annotation, "at");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public InjectionInfo(MixinTargetContext mixin, MethodNode method, AnnotationNode annotation, String atKey) {
        super(mixin, method, annotation);
        this.targets = new ArrayDeque();
        this.injectionPoints = new ArrayList();
        this.targetNodes = new LinkedHashMap();
        this.targetCount = 0;
        this.injectedMethods = new ArrayList(0);
        this.expectedCallbackCount = 1;
        this.requiredCallbackCount = 0;
        this.maxCallbackCount = Integer.MAX_VALUE;
        this.injectedCallbackCount = 0;
        this.isStatic = Bytecode.isStatic(method);
        this.slices = MethodSlices.parse(this);
        this.atKey = atKey;
        readAnnotation();
    }

    protected void readAnnotation() {
        if (this.annotation == null) {
            return;
        }
        List<AnnotationNode> injectionPoints = readInjectionPoints();
        parseRequirements();
        findMethods(parseTargets());
        parseInjectionPoints(injectionPoints);
        this.injector = parseInjector(this.annotation);
    }

    protected Set<ITargetSelector> parseTargets() {
        List<String> methods = Annotations.getValue(this.annotation, "method", false);
        if (methods == null) {
            throw new InvalidInjectionException(this, String.format("%s annotation on %s is missing method name", this.annotationType, this.methodName));
        }
        Set<ITargetSelector> selectors = new LinkedHashSet<>();
        for (String method : methods) {
            try {
                selectors.add(TargetSelector.parseAndValidate(method, this.mixin).attach(this.mixin));
            } catch (InvalidMemberDescriptorException e) {
                throw new InvalidInjectionException(this, String.format("%s annotation on %s, has invalid target descriptor: \"%s\". %s", this.annotationType, this.methodName, method, this.mixin.getReferenceMapper().getStatus()));
            } catch (TargetNotSupportedException ex) {
                throw new InvalidInjectionException(this, String.format("%s annotation on %s specifies a target class '%s', which is not supported", this.annotationType, this.methodName, ex.getMessage()));
            } catch (InvalidSelectorException ex2) {
                throw new InvalidInjectionException(this, String.format("%s annotation on %s is decorated with an invalid selector: %s", this.annotationType, this.methodName, ex2.getMessage()));
            }
        }
        return selectors;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<AnnotationNode> readInjectionPoints() {
        List<AnnotationNode> ats = Annotations.getValue(this.annotation, this.atKey, false);
        if (ats == null) {
            throw new InvalidInjectionException(this, String.format("%s annotation on %s is missing '%s' value(s)", this.annotationType, this.methodName, this.atKey));
        }
        return ats;
    }

    protected void parseInjectionPoints(List<AnnotationNode> ats) {
        this.injectionPoints.addAll(InjectionPoint.parse(this, ats));
    }

    protected void parseRequirements() {
        this.group = this.mixin.getInjectorGroups().parseGroup(this.method, this.mixin.getDefaultInjectorGroup()).add(this);
        Integer expect = (Integer) Annotations.getValue(this.annotation, "expect");
        if (expect != null) {
            this.expectedCallbackCount = expect.intValue();
        }
        Integer require = (Integer) Annotations.getValue(this.annotation, "require");
        if (require != null && require.intValue() > -1) {
            this.requiredCallbackCount = require.intValue();
        } else if (this.group.isDefault()) {
            this.requiredCallbackCount = this.mixin.getDefaultRequiredInjections();
        }
        Integer allow = (Integer) Annotations.getValue(this.annotation, "allow");
        if (allow != null) {
            this.maxCallbackCount = Math.max(Math.max(this.requiredCallbackCount, 1), allow.intValue());
        }
    }

    public boolean isValid() {
        return this.targets.size() > 0 && this.injectionPoints.size() > 0;
    }

    public void prepare() {
        this.targetNodes.clear();
        for (MethodNode targetMethod : this.targets) {
            Target target = this.mixin.getTargetMethod(targetMethod);
            InjectorTarget injectorTarget = new InjectorTarget(this, target);
            this.targetNodes.put(target, this.injector.find(injectorTarget, this.injectionPoints));
            injectorTarget.dispose();
        }
    }

    public void inject() {
        for (Map.Entry<Target, List<InjectionNodes.InjectionNode>> entry : this.targetNodes.entrySet()) {
            this.injector.inject(entry.getKey(), entry.getValue());
        }
        this.targets.clear();
    }

    public void postInject() {
        for (MethodNode method : this.injectedMethods) {
            this.classNode.methods.add(method);
        }
        String description = getDescription();
        String refMapStatus = this.mixin.getReferenceMapper().getStatus();
        String extraInfo = getDynamicInfo() + getMessages();
        if (this.mixin.getOption(MixinEnvironment.Option.DEBUG_INJECTORS) && this.injectedCallbackCount < this.expectedCallbackCount) {
            throw new InvalidInjectionException(this, String.format("Injection validation failed: %s %s%s in %s expected %d invocation(s) but %d succeeded. Scanned %d target(s). %s%s", description, this.methodName, this.method.desc, this.mixin, Integer.valueOf(this.expectedCallbackCount), Integer.valueOf(this.injectedCallbackCount), Integer.valueOf(this.targetCount), refMapStatus, extraInfo));
        }
        if (this.injectedCallbackCount < this.requiredCallbackCount) {
            throw new InjectionError(String.format("Critical injection failure: %s %s%s in %s failed injection check, (%d/%d) succeeded. Scanned %d target(s). %s%s", description, this.methodName, this.method.desc, this.mixin, Integer.valueOf(this.injectedCallbackCount), Integer.valueOf(this.requiredCallbackCount), Integer.valueOf(this.targetCount), refMapStatus, extraInfo));
        }
        if (this.injectedCallbackCount > this.maxCallbackCount) {
            throw new InjectionError(String.format("Critical injection failure: %s %s%s in %s failed injection check, %d succeeded of %d allowed.%s", description, this.methodName, this.method.desc, this.mixin, Integer.valueOf(this.injectedCallbackCount), Integer.valueOf(this.maxCallbackCount), extraInfo));
        }
    }

    public void notifyInjected(Target target) {
    }

    protected String getDescription() {
        return "Callback method";
    }

    public String toString() {
        return describeInjector(this.mixin, this.annotation, this.method);
    }

    public Collection<MethodNode> getTargets() {
        return this.targets;
    }

    @Override // org.spongepowered.asm.mixin.injection.code.ISliceContext
    public MethodSlice getSlice(String id) {
        return this.slices.get(getSliceId(id));
    }

    public String getSliceId(String id) {
        return "";
    }

    public int getInjectedCallbackCount() {
        return this.injectedCallbackCount;
    }

    public MethodNode addMethod(int access, String name, String desc) {
        MethodNode method = new MethodNode(ASM.API_VERSION, access | 4096, name, desc, (String) null, (String[]) null);
        this.injectedMethods.add(method);
        return method;
    }

    public void addCallbackInvocation(MethodNode handler) {
        this.injectedCallbackCount++;
    }

    @Override // org.spongepowered.asm.mixin.struct.AnnotatedMethodInfo, org.spongepowered.asm.util.IMessageSink
    public void addMessage(String format, Object... args) {
        super.addMessage(format, args);
        if (this.messages == null) {
            this.messages = new ArrayList();
        }
        String message = String.format(format, args);
        this.messages.add(message);
    }

    protected String getMessages() {
        return this.messages != null ? " Messages: { " + Joiner.on(" ").join(this.messages) + "}" : "";
    }

    private void findMethods(Set<ITargetSelector> selectors) {
        this.targets.clear();
        int passes = this.mixin.getOption(MixinEnvironment.Option.REFMAP_REMAP) ? 2 : 1;
        Iterator<ITargetSelector> it = selectors.iterator();
        while (it.hasNext()) {
            ITargetSelector selector = it.next();
            int matchCount = selector.getMatchCount();
            int count = 0;
            for (int pass = 0; pass < passes && count < 1; pass++) {
                for (MethodNode target : this.classNode.methods) {
                    if (selector.match(ElementNode.of(this.classNode, target)).isExactMatch()) {
                        boolean isMixinMethod = Annotations.getVisible(target, MixinMerged.class) != null;
                        if (matchCount <= 1 || (Bytecode.isStatic(target) == this.isStatic && target != this.method && !isMixinMethod)) {
                            checkTarget(target);
                            this.targets.add(target);
                            count++;
                            if (count >= matchCount) {
                                break;
                            }
                        }
                    }
                }
                selector = selector.configure("permissive");
            }
        }
        this.targetCount = this.targets.size();
        if (this.targetCount > 0) {
            return;
        }
        if (this.mixin.getOption(MixinEnvironment.Option.DEBUG_INJECTORS) && this.expectedCallbackCount > 0) {
            throw new InvalidInjectionException(this, String.format("Injection validation failed: %s annotation on %s could not find any targets matching %s in %s. %s%s", this.annotationType, this.methodName, namesOf(selectors), this.mixin.getTarget(), this.mixin.getReferenceMapper().getStatus(), getDynamicInfo()));
        }
        if (this.requiredCallbackCount > 0) {
            throw new InvalidInjectionException(this, String.format("Critical injection failure: %s annotation on %s could not find any targets matching %s in %s. %s%s", this.annotationType, this.methodName, namesOf(selectors), this.mixin.getTarget(), this.mixin.getReferenceMapper().getStatus(), getDynamicInfo()));
        }
    }

    private void checkTarget(MethodNode target) {
        AnnotationNode merged = Annotations.getVisible(target, MixinMerged.class);
        if (merged != null && Annotations.getVisible(target, Final.class) != null) {
            throw new InvalidInjectionException(this, String.format("%s cannot inject into @Final method %s::%s%s merged by %s", this, this.classNode.name, target.name, target.desc, Annotations.getValue(merged, MixinLaunchPlugin.NAME)));
        }
    }

    protected String getDynamicInfo() {
        AnnotationNode annotation = Annotations.getInvisible(this.method, Dynamic.class);
        String description = Strings.nullToEmpty((String) Annotations.getValue(annotation));
        Type upstream = (Type) Annotations.getValue(annotation, MixinLaunchPlugin.NAME);
        if (upstream != null) {
            description = String.format("{%s} %s", upstream.getClassName(), description).trim();
        }
        return description.length() > 0 ? String.format(" Method is @Dynamic(%s).", description) : "";
    }

    public static InjectionInfo parse(MixinTargetContext mixin, MethodNode method) {
        AnnotationNode annotation = getInjectorAnnotation(mixin.getMixin(), method);
        if (annotation == null) {
            return null;
        }
        for (InjectorEntry injector : registry.values()) {
            if (annotation.desc.endsWith(injector.simpleName)) {
                return injector.create(mixin, method, annotation);
            }
        }
        return null;
    }

    public static AnnotationNode getInjectorAnnotation(IMixinInfo mixin, MethodNode method) {
        try {
            AnnotationNode annotation = Annotations.getSingleVisible(method, registeredAnnotations);
            return annotation;
        } catch (IllegalArgumentException ex) {
            throw new InvalidMixinException(mixin, String.format("Error parsing annotations on %s in %s: %s", method.name, mixin.getClassName(), ex.getMessage()));
        }
    }

    public static String getInjectorPrefix(AnnotationNode annotation) {
        if (annotation == null) {
            return DEFAULT_PREFIX;
        }
        for (InjectorEntry injector : registry.values()) {
            if (annotation.desc.endsWith(injector.simpleName)) {
                return injector.prefix;
            }
        }
        return DEFAULT_PREFIX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String describeInjector(IMixinContext mixin, AnnotationNode annotation, MethodNode method) {
        return String.format("%s->@%s::%s%s", mixin.toString(), Bytecode.getSimpleName(annotation), MethodNodeEx.getName(method), method.desc);
    }

    private static String namesOf(Collection<ITargetSelector> selectors) {
        int index = 0;
        int count = selectors.size();
        StringBuilder sb = new StringBuilder();
        for (ITargetSelector selector : selectors) {
            if (index > 0) {
                if (index == count - 1) {
                    sb.append(" or ");
                } else {
                    sb.append(", ");
                }
            }
            sb.append('\'').append(selector.toString()).append('\'');
            index++;
        }
        return sb.toString();
    }

    public static void register(Class<? extends InjectionInfo> type) {
        AnnotationType annotationType = (AnnotationType) type.getAnnotation(AnnotationType.class);
        if (annotationType == null) {
            throw new IllegalArgumentException("Injection info class " + type + " is not annotated with @AnnotationType");
        }
        try {
            InjectorEntry entry = new InjectorEntry(annotationType.value(), type);
            InjectorEntry existing = registry.get(entry.simpleName);
            if (existing != null) {
                MessageRouter.getMessager().printMessage(Diagnostic.Kind.WARNING, String.format("Overriding InjectionInfo for @%s with %s (previously %s)", annotationType.value().getSimpleName(), type.getName(), existing.type.getName()));
            } else {
                MessageRouter.getMessager().printMessage(Diagnostic.Kind.OTHER, String.format("Registering new injector for @%s with %s", annotationType.value().getSimpleName(), type.getName()));
            }
            registry.put(entry.simpleName, entry);
            ArrayList<Class<? extends Annotation>> annotations = new ArrayList<>();
            for (InjectorEntry injector : registry.values()) {
                annotations.add(injector.annotationType);
            }
            registeredAnnotations = (Class[]) annotations.toArray(registeredAnnotations);
        } catch (NoSuchMethodException e) {
            throw new MixinError("InjectionInfo class " + type.getName() + " is missing a valid constructor");
        }
    }

    public static Set<Class<? extends Annotation>> getRegisteredAnnotations() {
        return ImmutableSet.copyOf(registeredAnnotations);
    }
}
