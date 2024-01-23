package org.spongepowered.asm.mixin.transformer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.struct.SourceMap;
import org.spongepowered.asm.mixin.transformer.ext.Extensions;
import org.spongepowered.asm.mixin.transformer.ext.ITargetClassContext;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.ClassSignature;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/TargetClassContext.class */
public final class TargetClassContext extends ClassContext implements ITargetClassContext {
    private static final Logger logger = LogManager.getLogger(MixinLaunchPlugin.NAME);
    private final MixinEnvironment env;
    private final Extensions extensions;
    private final String sessionId;
    private final String className;
    private final ClassNode classNode;
    private final ClassInfo classInfo;
    private final SourceMap sourceMap;
    private final ClassSignature signature;
    private final SortedSet<MixinInfo> mixins;
    private final Map<String, Target> targetMethods = new HashMap();
    private final Set<MethodNode> mixinMethods = new HashSet();
    private final List<InvalidMixinException> suppressedExceptions = new ArrayList();
    private boolean applied;
    private boolean forceExport;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TargetClassContext(MixinEnvironment env, Extensions extensions, String sessionId, String name, ClassNode classNode, SortedSet<MixinInfo> mixins) {
        this.env = env;
        this.extensions = extensions;
        this.sessionId = sessionId;
        this.className = name;
        this.classNode = classNode;
        this.classInfo = ClassInfo.fromClassNode(classNode);
        this.signature = this.classInfo.getSignature();
        this.mixins = mixins;
        this.sourceMap = new SourceMap(classNode.sourceFile);
        this.sourceMap.addFile(this.classNode);
    }

    public String toString() {
        return this.className;
    }

    boolean isApplied() {
        return this.applied;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isExportForced() {
        return this.forceExport;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Extensions getExtensions() {
        return this.extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongepowered.asm.mixin.transformer.ClassContext, org.spongepowered.asm.mixin.refmap.IMixinContext
    public String getClassRef() {
        return this.classNode.name;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getClassName() {
        return this.className;
    }

    @Override // org.spongepowered.asm.mixin.transformer.ClassContext
    public ClassNode getClassNode() {
        return this.classNode;
    }

    List<MethodNode> getMethods() {
        return this.classNode.methods;
    }

    List<FieldNode> getFields() {
        return this.classNode.fields;
    }

    @Override // org.spongepowered.asm.mixin.transformer.ClassContext
    public ClassInfo getClassInfo() {
        return this.classInfo;
    }

    SortedSet<MixinInfo> getMixins() {
        return this.mixins;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SourceMap getSourceMap() {
        return this.sourceMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void mergeSignature(ClassSignature signature) {
        this.signature.merge(signature);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addMixinMethod(MethodNode method) {
        this.mixinMethods.add(method);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void methodMerged(MethodNode method) {
        if (!this.mixinMethods.remove(method)) {
            logger.debug("Unexpected: Merged unregistered method {}{} in {}", new Object[]{method.name, method.desc, this});
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MethodNode findMethod(Deque<String> aliases, String desc) {
        return findAliasedMethod(aliases, desc, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MethodNode findAliasedMethod(Deque<String> aliases, String desc) {
        return findAliasedMethod(aliases, desc, false);
    }

    private MethodNode findAliasedMethod(Deque<String> aliases, String desc, boolean includeMixinMethods) {
        String alias = aliases.poll();
        if (alias == null) {
            return null;
        }
        for (MethodNode target : this.classNode.methods) {
            if (target.name.equals(alias) && target.desc.equals(desc)) {
                return target;
            }
        }
        if (includeMixinMethods) {
            for (MethodNode target2 : this.mixinMethods) {
                if (target2.name.equals(alias) && target2.desc.equals(desc)) {
                    return target2;
                }
            }
        }
        return findAliasedMethod(aliases, desc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FieldNode findAliasedField(Deque<String> aliases, String desc) {
        String alias = aliases.poll();
        if (alias == null) {
            return null;
        }
        for (FieldNode target : this.classNode.fields) {
            if (target.name.equals(alias) && target.desc.equals(desc)) {
                return target;
            }
        }
        return findAliasedField(aliases, desc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Target getTargetMethod(MethodNode method) {
        if (!this.classNode.methods.contains(method)) {
            throw new IllegalArgumentException("Invalid target method supplied to getTargetMethod()");
        }
        String targetName = method.name + method.desc;
        Target target = this.targetMethods.get(targetName);
        if (target == null) {
            target = new Target(this.classNode, method);
            this.targetMethods.put(targetName, target);
        }
        return target;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void applyMixins() {
        if (this.applied) {
            throw new IllegalStateException("Mixins already applied to target class " + this.className);
        }
        this.applied = true;
        MixinApplicatorStandard applicator = createApplicator();
        applicator.apply(this.mixins);
        applySignature();
        upgradeMethods();
        checkMerges();
    }

    private MixinApplicatorStandard createApplicator() {
        if (this.classInfo.isInterface()) {
            return new MixinApplicatorInterface(this);
        }
        return new MixinApplicatorStandard(this);
    }

    private void applySignature() {
        this.classNode.signature = this.signature.toString();
    }

    private void checkMerges() {
        for (MethodNode method : this.mixinMethods) {
            if (!method.name.startsWith("<")) {
                logger.debug("Unexpected: Registered method {}{} in {} was not merged", new Object[]{method.name, method.desc, this});
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void processDebugTasks() {
        AnnotationNode classDebugAnnotation = Annotations.getVisible(this.classNode, Debug.class);
        this.forceExport = classDebugAnnotation != null && Boolean.TRUE.equals(Annotations.getValue(classDebugAnnotation, "export"));
        if (!this.env.getOption(MixinEnvironment.Option.DEBUG_VERBOSE)) {
            return;
        }
        if (classDebugAnnotation != null && Boolean.TRUE.equals(Annotations.getValue(classDebugAnnotation, "print"))) {
            Bytecode.textify(this.classNode, System.err);
        }
        for (MethodNode method : this.classNode.methods) {
            AnnotationNode methodDebugAnnotation = Annotations.getVisible(method, Debug.class);
            if (methodDebugAnnotation != null && Boolean.TRUE.equals(Annotations.getValue(methodDebugAnnotation, "print"))) {
                Bytecode.textify(method, System.err);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addSuppressed(InvalidMixinException ex) {
        this.suppressedExceptions.add(ex);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<InvalidMixinException> getSuppressedExceptions() {
        return this.suppressedExceptions;
    }
}
