package org.spongepowered.asm.mixin.transformer;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.SoftOverride;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.gen.AccessorInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectorGroupInfo;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.injection.throwables.InjectionError;
import org.spongepowered.asm.mixin.injection.throwables.InjectionValidationException;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.mixin.refmap.IReferenceMapper;
import org.spongepowered.asm.mixin.struct.MemberRef;
import org.spongepowered.asm.mixin.struct.SourceMap;
import org.spongepowered.asm.mixin.throwables.ClassMetadataNotFoundException;
import org.spongepowered.asm.mixin.transformer.ActivityStack;
import org.spongepowered.asm.mixin.transformer.ClassInfo;
import org.spongepowered.asm.mixin.transformer.ext.Extensions;
import org.spongepowered.asm.mixin.transformer.meta.MixinMerged;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.mixin.transformer.throwables.MixinTransformerError;
import org.spongepowered.asm.obfuscation.RemapperChain;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.ClassSignature;
import org.spongepowered.asm.util.Constants;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/MixinTargetContext.class */
public class MixinTargetContext extends ClassContext implements IMixinContext {
    private static final Logger logger = LogManager.getLogger(MixinLaunchPlugin.NAME);
    private final MixinInfo mixin;
    private final ClassNode classNode;
    private final TargetClassContext targetClass;
    private final String sessionId;
    private final ClassInfo targetClassInfo;
    private final boolean inheritsFromMixin;
    private final boolean detachedSuper;
    private final SourceMap.File stratum;
    protected final ActivityStack activities = new ActivityStack(null);
    private final BiMap<String, String> innerClasses = HashBiMap.create();
    private final List<MethodNode> shadowMethods = new ArrayList();
    private final Map<FieldNode, ClassInfo.Field> shadowFields = new LinkedHashMap();
    private final List<MethodNode> mergedMethods = new ArrayList();
    private final InjectorGroupInfo.Map injectorGroups = new InjectorGroupInfo.Map();
    private final List<InjectionInfo> injectors = new ArrayList();
    private final List<AccessorInfo> accessors = new ArrayList();
    private int minRequiredClassVersion = MixinEnvironment.CompatibilityLevel.JAVA_6.classVersion();

    /* JADX INFO: Access modifiers changed from: package-private */
    public MixinTargetContext(MixinInfo mixin, ClassNode classNode, TargetClassContext context) {
        this.mixin = mixin;
        this.classNode = classNode;
        this.targetClass = context;
        this.targetClassInfo = context.getClassInfo();
        this.stratum = context.getSourceMap().addFile(this.classNode);
        this.inheritsFromMixin = mixin.getClassInfo().hasMixinInHierarchy() || this.targetClassInfo.hasMixinTargetInHierarchy();
        this.detachedSuper = !this.classNode.superName.equals(getTarget().getClassNode().superName);
        this.sessionId = context.getSessionId();
        requireVersion(classNode.version);
        InnerClassGenerator icg = (InnerClassGenerator) context.getExtensions().getGenerator(InnerClassGenerator.class);
        for (String innerClass : this.mixin.getInnerClasses()) {
            this.innerClasses.put(innerClass, icg.registerInnerClass(this.mixin, innerClass, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addShadowMethod(MethodNode method) {
        this.shadowMethods.add(method);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addShadowField(FieldNode fieldNode, ClassInfo.Field fieldInfo) {
        this.shadowFields.put(fieldNode, fieldInfo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addAccessorMethod(MethodNode method, Class<? extends Annotation> type) {
        this.accessors.add(AccessorInfo.of(this, method, type));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addMixinMethod(MethodNode method) {
        Annotations.setVisible(method, MixinMerged.class, MixinLaunchPlugin.NAME, getClassName());
        getTarget().addMixinMethod(method);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void methodMerged(MethodNode method) {
        this.mergedMethods.add(method);
        this.targetClassInfo.addMethod(method);
        getTarget().methodMerged(method);
        Annotations.setVisible(method, MixinMerged.class, MixinLaunchPlugin.NAME, getClassName(), "priority", Integer.valueOf(getPriority()), "sessionId", this.sessionId);
    }

    public String toString() {
        return this.mixin.toString();
    }

    public MixinEnvironment getEnvironment() {
        return this.mixin.getParent().getEnvironment();
    }

    @Override // org.spongepowered.asm.mixin.refmap.IMixinContext
    public boolean getOption(MixinEnvironment.Option option) {
        return getEnvironment().getOption(option);
    }

    @Override // org.spongepowered.asm.mixin.transformer.ClassContext
    public ClassNode getClassNode() {
        return this.classNode;
    }

    @Override // org.spongepowered.asm.mixin.refmap.IMixinContext
    public String getClassName() {
        return this.mixin.getClassName();
    }

    @Override // org.spongepowered.asm.mixin.transformer.ClassContext, org.spongepowered.asm.mixin.refmap.IMixinContext
    public String getClassRef() {
        return this.mixin.getClassRef();
    }

    public TargetClassContext getTarget() {
        return this.targetClass;
    }

    @Override // org.spongepowered.asm.mixin.refmap.IMixinContext
    public String getTargetClassRef() {
        return getTarget().getClassRef();
    }

    public ClassNode getTargetClassNode() {
        return getTarget().getClassNode();
    }

    public ClassInfo getTargetClassInfo() {
        return this.targetClassInfo;
    }

    @Override // org.spongepowered.asm.mixin.transformer.ClassContext
    public ClassInfo getClassInfo() {
        return this.mixin.getClassInfo();
    }

    public ClassSignature getSignature() {
        return getClassInfo().getSignature();
    }

    public SourceMap.File getStratum() {
        return this.stratum;
    }

    public int getMinRequiredClassVersion() {
        return this.minRequiredClassVersion;
    }

    public int getDefaultRequiredInjections() {
        return this.mixin.getParent().getDefaultRequiredInjections();
    }

    public String getDefaultInjectorGroup() {
        return this.mixin.getParent().getDefaultInjectorGroup();
    }

    public int getMaxShiftByValue() {
        return this.mixin.getParent().getMaxShiftByValue();
    }

    public InjectorGroupInfo.Map getInjectorGroups() {
        return this.injectorGroups;
    }

    public boolean requireOverwriteAnnotations() {
        return this.mixin.getParent().requireOverwriteAnnotations();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void transformMethod(MethodNode method) {
        this.activities.clear();
        try {
            ActivityStack.Activity activity = this.activities.begin("Validate");
            validateMethod(method);
            activity.next("Transform Descriptor");
            transformDescriptor(method);
            activity.next("Transform LVT");
            transformLVT(method);
            activity.next("Transform Line Numbers");
            this.stratum.applyOffset(method);
            activity.next("Transform Instructions");
            MethodInsnNode methodInsnNode = null;
            Iterator<AbstractInsnNode> iter = method.instructions.iterator();
            while (iter.hasNext()) {
                AbstractInsnNode next = iter.next();
                ActivityStack.Activity insnActivity = this.activities.begin(Bytecode.getOpcodeName(next) + " ");
                if (next instanceof MethodInsnNode) {
                    MethodInsnNode methodNode = (MethodInsnNode) next;
                    insnActivity.append("%s::%s%s", methodNode.owner, methodNode.name, methodNode.desc);
                    transformMethodRef(method, iter, new MemberRef.Method(methodNode));
                } else if (next instanceof FieldInsnNode) {
                    FieldInsnNode fieldNode = (FieldInsnNode) next;
                    insnActivity.append("%s::%s:%s", fieldNode.owner, fieldNode.name, fieldNode.desc);
                    transformFieldRef(method, iter, new MemberRef.Field(fieldNode));
                    checkFinal(method, iter, fieldNode);
                } else if (next instanceof TypeInsnNode) {
                    TypeInsnNode typeNode = (TypeInsnNode) next;
                    insnActivity.append(typeNode.desc);
                    transformTypeNode(method, iter, typeNode, methodInsnNode);
                } else if (next instanceof LdcInsnNode) {
                    transformConstantNode(method, iter, (LdcInsnNode) next);
                } else if (next instanceof InvokeDynamicInsnNode) {
                    InvokeDynamicInsnNode invokeNode = (InvokeDynamicInsnNode) next;
                    insnActivity.append("%s %s", invokeNode.name, invokeNode.desc);
                    transformInvokeDynamicNode(method, iter, invokeNode);
                }
                methodInsnNode = next;
                insnActivity.end();
            }
            activity.end();
        } catch (InvalidMixinException ex) {
            ex.prepend(this.activities);
            throw ex;
        } catch (Exception ex2) {
            throw new InvalidMixinException(this, "Unexpecteded " + ex2.getClass().getSimpleName() + " whilst transforming the mixin class:", ex2, this.activities);
        }
    }

    private void validateMethod(MethodNode method) {
        ClassInfo.Method superMethod;
        if (Annotations.getInvisible(method, SoftOverride.class) != null) {
            if (Bytecode.getVisibility(method) == Bytecode.Visibility.PRIVATE) {
                throw new InvalidMixinException(this, "Mixin method " + method.name + method.desc + " is tagged with @SoftOverride but the method is PRIVATE");
            }
            ClassInfo.Method superMethod2 = this.targetClassInfo.findMethodInHierarchy(method.name, method.desc, ClassInfo.SearchType.SUPER_CLASSES_ONLY, ClassInfo.Traversal.SUPER);
            if (superMethod2 == null || !superMethod2.isInjected()) {
                throw new InvalidMixinException(this, "Mixin method " + method.name + method.desc + " is tagged with @SoftOverride but no valid method was found in superclasses of " + getTarget().getClassName());
            }
        }
        if (Bytecode.isVirtual(method) && (superMethod = this.targetClassInfo.findMethodInHierarchy(method, ClassInfo.SearchType.SUPER_CLASSES_ONLY, ClassInfo.Traversal.ALL, 0)) != null && superMethod.isFinal()) {
            throw new InvalidMixinException(this.mixin, String.format("%s%s in %s overrides a final method from %s", method.name, method.desc, this.mixin, superMethod.getOwner().getClassName()));
        }
    }

    private void transformLVT(MethodNode method) {
        if (method.localVariables == null) {
            return;
        }
        ActivityStack.Activity localVarActivity = this.activities.begin("?");
        for (LocalVariableNode local : method.localVariables) {
            if (local != null && local.desc != null) {
                localVarActivity.next("var=%s", local.name);
                local.desc = transformSingleDescriptor(Type.getType(local.desc));
            }
        }
        localVarActivity.end();
    }

    private void transformMethodRef(MethodNode method, Iterator<AbstractInsnNode> iter, MemberRef methodRef) {
        transformDescriptor(methodRef);
        if (methodRef.getOwner().equals(getClassRef())) {
            methodRef.setOwner(getTarget().getClassRef());
            ClassInfo.Method md = getClassInfo().findMethod(methodRef.getName(), methodRef.getDesc(), 10);
            if (md != null && md.isRenamed() && md.getOriginalName().equals(methodRef.getName()) && (md.isSynthetic() || md.isConformed())) {
                methodRef.setName(md.getName());
            }
            upgradeMethodRef(method, methodRef, md);
        } else if (this.innerClasses.containsKey(methodRef.getOwner())) {
            methodRef.setOwner((String) this.innerClasses.get(methodRef.getOwner()));
            methodRef.setDesc(transformMethodDescriptor(methodRef.getDesc()));
        } else if (this.detachedSuper || this.inheritsFromMixin) {
            if (methodRef.getOpcode() == 183) {
                updateStaticBinding(method, methodRef);
            } else if (methodRef.getOpcode() == 182 && ClassInfo.forName(methodRef.getOwner()).isMixin()) {
                updateDynamicBinding(method, methodRef);
            }
        }
    }

    private void transformFieldRef(MethodNode method, Iterator<AbstractInsnNode> iter, MemberRef fieldRef) {
        if (Constants.IMAGINARY_SUPER.equals(fieldRef.getName())) {
            if (fieldRef instanceof MemberRef.Field) {
                processImaginarySuper(method, ((MemberRef.Field) fieldRef).insn);
                iter.remove();
            } else {
                throw new InvalidMixinException(this.mixin, "Cannot call imaginary super from method handle.");
            }
        }
        transformDescriptor(fieldRef);
        if (fieldRef.getOwner().equals(getClassRef())) {
            fieldRef.setOwner(getTarget().getClassRef());
            ClassInfo.Field field = getClassInfo().findField(fieldRef.getName(), fieldRef.getDesc(), 10);
            if (field != null && field.isRenamed() && field.getOriginalName().equals(fieldRef.getName()) && field.isStatic()) {
                fieldRef.setName(field.getName());
                return;
            }
            return;
        }
        ClassInfo fieldOwner = ClassInfo.forName(fieldRef.getOwner());
        if (fieldOwner.isMixin()) {
            ClassInfo actualOwner = this.targetClassInfo.findCorrespondingType(fieldOwner);
            fieldRef.setOwner(actualOwner != null ? actualOwner.getName() : getTarget().getClassRef());
        }
    }

    private void checkFinal(MethodNode method, Iterator<AbstractInsnNode> iter, FieldInsnNode fieldNode) {
        int opcode;
        if (!fieldNode.owner.equals(getTarget().getClassRef()) || (opcode = fieldNode.getOpcode()) == 180 || opcode == 178) {
            return;
        }
        for (Map.Entry<FieldNode, ClassInfo.Field> shadow : this.shadowFields.entrySet()) {
            FieldNode shadowFieldNode = shadow.getKey();
            if (shadowFieldNode.desc.equals(fieldNode.desc) && shadowFieldNode.name.equals(fieldNode.name)) {
                ClassInfo.Field shadowField = shadow.getValue();
                if (shadowField.isDecoratedFinal()) {
                    if (shadowField.isDecoratedMutable()) {
                        if (this.mixin.getParent().getEnvironment().getOption(MixinEnvironment.Option.DEBUG_VERBOSE)) {
                            logger.warn("Write access to @Mutable @Final field {} in {}::{}", new Object[]{shadowField, this.mixin, method.name});
                            return;
                        }
                        return;
                    } else if (Constants.CTOR.equals(method.name) || Constants.CLINIT.equals(method.name)) {
                        logger.warn("@Final field {} in {} should be final", new Object[]{shadowField, this.mixin});
                        return;
                    } else {
                        logger.error("Write access detected to @Final field {} in {}::{}", new Object[]{shadowField, this.mixin, method.name});
                        if (this.mixin.getParent().getEnvironment().getOption(MixinEnvironment.Option.DEBUG_VERIFY)) {
                            throw new InvalidMixinException(this.mixin, "Write access detected to @Final field " + shadowField + " in " + this.mixin + "::" + method.name);
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    private void transformTypeNode(MethodNode method, Iterator<AbstractInsnNode> iter, TypeInsnNode typeInsn, AbstractInsnNode lastNode) {
        if (typeInsn.getOpcode() == 192 && typeInsn.desc.equals(getTarget().getClassRef()) && lastNode.getOpcode() == 25 && ((VarInsnNode) lastNode).var == 0) {
            iter.remove();
            return;
        }
        if (typeInsn.desc.equals(getClassRef())) {
            typeInsn.desc = getTarget().getClassRef();
        } else {
            String newName = (String) this.innerClasses.get(typeInsn.desc);
            if (newName != null) {
                typeInsn.desc = newName;
            }
        }
        transformDescriptor(typeInsn);
    }

    private void transformConstantNode(MethodNode method, Iterator<AbstractInsnNode> iter, LdcInsnNode ldcInsn) {
        ldcInsn.cst = transformConstant(method, iter, ldcInsn.cst);
    }

    private void transformInvokeDynamicNode(MethodNode method, Iterator<AbstractInsnNode> iter, InvokeDynamicInsnNode dynInsn) {
        requireVersion(51);
        dynInsn.desc = transformMethodDescriptor(dynInsn.desc);
        dynInsn.bsm = transformHandle(method, iter, dynInsn.bsm);
        for (int i = 0; i < dynInsn.bsmArgs.length; i++) {
            dynInsn.bsmArgs[i] = transformConstant(method, iter, dynInsn.bsmArgs[i]);
        }
    }

    private Object transformConstant(MethodNode method, Iterator<AbstractInsnNode> iter, Object constant) {
        if (constant instanceof Type) {
            Type type = (Type) constant;
            String desc = transformDescriptor(type);
            if (!type.toString().equals(desc)) {
                return Type.getType(desc);
            }
            return constant;
        } else if (constant instanceof Handle) {
            return transformHandle(method, iter, (Handle) constant);
        } else {
            return constant;
        }
    }

    private Handle transformHandle(MethodNode method, Iterator<AbstractInsnNode> iter, Handle handle) {
        MemberRef.Handle memberRef = new MemberRef.Handle(handle);
        if (memberRef.isField()) {
            transformFieldRef(method, iter, memberRef);
        } else {
            transformMethodRef(method, iter, memberRef);
        }
        return memberRef.getMethodHandle();
    }

    private void processImaginarySuper(MethodNode method, FieldInsnNode fieldInsn) {
        if (fieldInsn.getOpcode() != 180) {
            if (Constants.CTOR.equals(method.name)) {
                throw new InvalidMixinException(this, "Illegal imaginary super declaration: field " + fieldInsn.name + " must not specify an initialiser");
            }
            throw new InvalidMixinException(this, "Illegal imaginary super access: found " + Bytecode.getOpcodeName(fieldInsn.getOpcode()) + " opcode in " + method.name + method.desc);
        } else if ((method.access & 2) != 0 || (method.access & 8) != 0) {
            throw new InvalidMixinException(this, "Illegal imaginary super access: method " + method.name + method.desc + " is private or static");
        } else {
            if (Annotations.getInvisible(method, SoftOverride.class) == null) {
                throw new InvalidMixinException(this, "Illegal imaginary super access: method " + method.name + method.desc + " is not decorated with @SoftOverride");
            }
            Iterator<AbstractInsnNode> methodIter = method.instructions.iterator(method.instructions.indexOf(fieldInsn));
            while (methodIter.hasNext()) {
                AbstractInsnNode next = methodIter.next();
                if (next instanceof MethodInsnNode) {
                    MethodInsnNode methodNode = (MethodInsnNode) next;
                    if (methodNode.owner.equals(getClassRef()) && methodNode.name.equals(method.name) && methodNode.desc.equals(method.desc)) {
                        methodNode.setOpcode(183);
                        updateStaticBinding(method, new MemberRef.Method(methodNode));
                        return;
                    }
                }
            }
            throw new InvalidMixinException(this, "Illegal imaginary super access: could not find INVOKE for " + method.name + method.desc);
        }
    }

    private void updateStaticBinding(MethodNode method, MemberRef methodRef) {
        updateBinding(method, methodRef, ClassInfo.Traversal.SUPER);
    }

    private void updateDynamicBinding(MethodNode method, MemberRef methodRef) {
        updateBinding(method, methodRef, ClassInfo.Traversal.ALL);
    }

    private void updateBinding(MethodNode method, MemberRef methodRef, ClassInfo.Traversal traversal) {
        if (Constants.CTOR.equals(method.name) || methodRef.getOwner().equals(getTarget().getClassRef()) || getTarget().getClassRef().startsWith("<")) {
            return;
        }
        ClassInfo.Method superMethod = this.targetClassInfo.findMethodInHierarchy(methodRef.getName(), methodRef.getDesc(), traversal.getSearchType(), traversal);
        if (superMethod != null) {
            if (superMethod.getOwner().isMixin()) {
                throw new InvalidMixinException(this, "Invalid " + methodRef + " in " + this + " resolved " + superMethod.getOwner() + " but is mixin.");
            }
            methodRef.setOwner(superMethod.getImplementor().getName());
        } else if (ClassInfo.forName(methodRef.getOwner()).isMixin()) {
            throw new MixinTransformerError("Error resolving " + methodRef + " in " + this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void transformDescriptor(FieldNode field) {
        if (!this.inheritsFromMixin && this.innerClasses.size() == 0) {
            return;
        }
        field.desc = transformSingleDescriptor(field.desc, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void transformDescriptor(MethodNode method) {
        if (!this.inheritsFromMixin && this.innerClasses.size() == 0) {
            return;
        }
        method.desc = transformMethodDescriptor(method.desc);
    }

    void transformDescriptor(MemberRef member) {
        if (!this.inheritsFromMixin && this.innerClasses.size() == 0) {
            return;
        }
        if (member.isField()) {
            member.setDesc(transformSingleDescriptor(member.getDesc(), false));
        } else {
            member.setDesc(transformMethodDescriptor(member.getDesc()));
        }
    }

    void transformDescriptor(TypeInsnNode typeInsn) {
        if (!this.inheritsFromMixin && this.innerClasses.size() == 0) {
            return;
        }
        typeInsn.desc = transformSingleDescriptor(typeInsn.desc, true);
    }

    private String transformDescriptor(Type type) {
        if (type.getSort() == 11) {
            return transformMethodDescriptor(type.getDescriptor());
        }
        return transformSingleDescriptor(type);
    }

    private String transformSingleDescriptor(Type type) {
        if (type.getSort() < 9) {
            return type.toString();
        }
        return transformSingleDescriptor(type.toString(), false);
    }

    private String transformSingleDescriptor(String desc, boolean isObject) {
        ActivityStack.Activity descriptorActivity = this.activities.begin("desc=%s", desc);
        boolean isArray = false;
        String type = desc;
        while (true) {
            if (!type.startsWith("[") && !type.startsWith("L")) {
                break;
            } else if (type.startsWith("[")) {
                type = type.substring(1);
                isArray = true;
            } else {
                type = type.substring(1, type.indexOf(";"));
                isObject = true;
            }
        }
        if (!isObject) {
            descriptorActivity.end();
            return desc;
        }
        if (isArray && type.length() == 1) {
            Type parsedType = Type.getType(type);
            if (parsedType.getSort() <= 8) {
                descriptorActivity.end();
                return desc;
            }
        }
        String innerClassName = (String) this.innerClasses.get(type);
        if (innerClassName != null) {
            descriptorActivity.end();
            return desc.replace(type, innerClassName);
        } else if (this.innerClasses.inverse().containsKey(type)) {
            descriptorActivity.end();
            return desc;
        } else {
            ClassInfo typeInfo = ClassInfo.forName(type);
            if (typeInfo == null) {
                throw new ClassMetadataNotFoundException(type.replace('/', '.'));
            }
            if (!typeInfo.isMixin() || typeInfo.isLoadable()) {
                descriptorActivity.end();
                return desc;
            }
            String realDesc = desc.replace(type, findRealType(typeInfo).toString());
            descriptorActivity.end();
            return realDesc;
        }
    }

    private String transformMethodDescriptor(String desc) {
        Type[] argumentTypes;
        StringBuilder newDesc = new StringBuilder();
        newDesc.append('(');
        for (Type arg : Type.getArgumentTypes(desc)) {
            newDesc.append(transformSingleDescriptor(arg));
        }
        return newDesc.append(')').append(transformSingleDescriptor(Type.getReturnType(desc))).toString();
    }

    @Override // org.spongepowered.asm.mixin.refmap.IMixinContext
    public Target getTargetMethod(MethodNode method) {
        return getTarget().getTargetMethod(method);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MethodNode findMethod(MethodNode method, AnnotationNode annotation) {
        List<String> aka;
        Deque<String> aliases = new LinkedList<>();
        aliases.add(method.name);
        if (annotation != null && (aka = (List) Annotations.getValue(annotation, "aliases")) != null) {
            aliases.addAll(aka);
        }
        return getTarget().findMethod(aliases, method.desc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MethodNode findRemappedMethod(MethodNode method) {
        RemapperChain remapperChain = getEnvironment().getRemappers();
        String remappedName = remapperChain.mapMethodName(getTarget().getClassRef(), method.name, method.desc);
        if (remappedName.equals(method.name)) {
            return null;
        }
        Deque<String> aliases = new LinkedList<>();
        aliases.add(remappedName);
        return getTarget().findAliasedMethod(aliases, method.desc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FieldNode findField(FieldNode field, AnnotationNode shadow) {
        List<String> aka;
        Deque<String> aliases = new LinkedList<>();
        aliases.add(field.name);
        if (shadow != null && (aka = (List) Annotations.getValue(shadow, "aliases")) != null) {
            aliases.addAll(aka);
        }
        return getTarget().findAliasedField(aliases, field.desc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FieldNode findRemappedField(FieldNode field) {
        RemapperChain remapperChain = getEnvironment().getRemappers();
        String remappedName = remapperChain.mapFieldName(getTarget().getClassRef(), field.name, field.desc);
        if (remappedName.equals(field.name)) {
            return null;
        }
        Deque<String> aliases = new LinkedList<>();
        aliases.add(remappedName);
        return getTarget().findAliasedField(aliases, field.desc);
    }

    protected void requireVersion(int version) {
        this.minRequiredClassVersion = Math.max(this.minRequiredClassVersion, version);
        if (version > MixinEnvironment.getCompatibilityLevel().classVersion()) {
            throw new InvalidMixinException(this, "Unsupported mixin class version " + version);
        }
    }

    @Override // org.spongepowered.asm.mixin.refmap.IMixinContext
    public Extensions getExtensions() {
        return this.targetClass.getExtensions();
    }

    @Override // org.spongepowered.asm.mixin.refmap.IMixinContext
    public IMixinInfo getMixin() {
        return this.mixin;
    }

    MixinInfo getInfo() {
        return this.mixin;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isRequired() {
        return this.mixin.isRequired();
    }

    @Override // org.spongepowered.asm.mixin.refmap.IMixinContext
    public int getPriority() {
        return this.mixin.getPriority();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<String> getInterfaces() {
        return this.mixin.getInterfaces();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<MethodNode> getShadowMethods() {
        return this.shadowMethods;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<MethodNode> getMethods() {
        return this.classNode.methods;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<Map.Entry<FieldNode, ClassInfo.Field>> getShadowFields() {
        return this.shadowFields.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<FieldNode> getFields() {
        return this.classNode.fields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Level getLoggingLevel() {
        return this.mixin.getLoggingLevel();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean shouldSetSourceFile() {
        return this.mixin.getParent().shouldSetSourceFile();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getSourceFile() {
        return this.classNode.sourceFile;
    }

    @Override // org.spongepowered.asm.mixin.refmap.IMixinContext
    public IReferenceMapper getReferenceMapper() {
        return this.mixin.getParent().getReferenceMapper();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void preApply(String transformedName, ClassNode targetClass) {
        this.mixin.preApply(transformedName, targetClass);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void postApply(String transformedName, ClassNode targetClass) {
        this.activities.clear();
        try {
            ActivityStack.Activity activity = this.activities.begin("Validating Injector Groups");
            this.injectorGroups.validateAll();
            activity.next("Plugin Post-Application");
            this.mixin.postApply(transformedName, targetClass);
            activity.end();
        } catch (InjectionValidationException ex) {
            InjectorGroupInfo group = ex.getGroup();
            throw new InjectionError(String.format("Critical injection failure: Callback group %s in %s failed injection check: %s", group, this.mixin, ex.getMessage()));
        } catch (InvalidMixinException ex2) {
            ex2.prepend(this.activities);
            throw ex2;
        } catch (Exception ex3) {
            throw new InvalidMixinException(this, "Unexpecteded " + ex3.getClass().getSimpleName() + " whilst transforming the mixin class:", ex3, this.activities);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getUniqueName(MethodNode method, boolean preservePrefix) {
        return this.targetClassInfo.getMethodMapper().getUniqueName(method, this.sessionId, preservePrefix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getUniqueName(FieldNode field) {
        return this.targetClassInfo.getMethodMapper().getUniqueName(field, this.sessionId);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void prepareInjections() {
        this.activities.clear();
        try {
            this.injectors.clear();
            ActivityStack.Activity prepareActivity = this.activities.begin("?");
            for (MethodNode method : this.mergedMethods) {
                prepareActivity.next("%s%s", method.name, method.desc);
                ActivityStack.Activity methodActivity = this.activities.begin("Parse");
                InjectionInfo injectInfo = InjectionInfo.parse(this, method);
                if (injectInfo != null) {
                    methodActivity.next("Validate");
                    if (injectInfo.isValid()) {
                        methodActivity.next("Prepare");
                        injectInfo.prepare();
                        this.injectors.add(injectInfo);
                    }
                    methodActivity.next("Undecorate");
                    method.visibleAnnotations.remove(injectInfo.getAnnotation());
                    methodActivity.end();
                }
            }
            prepareActivity.end();
        } catch (InvalidMixinException ex) {
            ex.prepend(this.activities);
            throw ex;
        } catch (Exception ex2) {
            throw new InvalidMixinException(this, "Unexpecteded " + ex2.getClass().getSimpleName() + " whilst transforming the mixin class:", ex2, this.activities);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void applyInjections() {
        this.activities.clear();
        try {
            ActivityStack.Activity applyActivity = this.activities.begin("Inject");
            ActivityStack.Activity injectActivity = this.activities.begin("?");
            for (InjectionInfo injectInfo : this.injectors) {
                injectActivity.next(injectInfo.toString());
                injectInfo.inject();
            }
            applyActivity.next("PostInject");
            ActivityStack.Activity postInjectActivity = this.activities.begin("?");
            for (InjectionInfo injectInfo2 : this.injectors) {
                postInjectActivity.next(injectInfo2.toString());
                injectInfo2.postInject();
            }
            applyActivity.end();
            this.injectors.clear();
        } catch (InvalidMixinException ex) {
            ex.prepend(this.activities);
            throw ex;
        } catch (Exception ex2) {
            throw new InvalidMixinException(this, "Unexpecteded " + ex2.getClass().getSimpleName() + " whilst transforming the mixin class:", ex2, this.activities);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<MethodNode> generateAccessors() {
        this.activities.clear();
        List<MethodNode> methods = new ArrayList<>();
        try {
            ActivityStack.Activity accessorActivity = this.activities.begin("Locate");
            ActivityStack.Activity locateActivity = this.activities.begin("?");
            for (AccessorInfo accessor : this.accessors) {
                locateActivity.next(accessor.toString());
                accessor.locate();
            }
            accessorActivity.next("Validate");
            ActivityStack.Activity validateActivity = this.activities.begin("?");
            for (AccessorInfo accessor2 : this.accessors) {
                validateActivity.next(accessor2.toString());
                accessor2.validate();
            }
            accessorActivity.next("Generate");
            ActivityStack.Activity generateActivity = this.activities.begin("?");
            for (AccessorInfo accessor3 : this.accessors) {
                generateActivity.next(accessor3.toString());
                MethodNode generated = accessor3.generate();
                getTarget().addMixinMethod(generated);
                methods.add(generated);
            }
            accessorActivity.end();
            return methods;
        } catch (InvalidMixinException ex) {
            ex.prepend(this.activities);
            throw ex;
        } catch (Exception ex2) {
            throw new InvalidMixinException(this, "Unexpecteded " + ex2.getClass().getSimpleName() + " whilst transforming the mixin class:", ex2, this.activities);
        }
    }

    private ClassInfo findRealType(ClassInfo mixin) {
        if (mixin == getClassInfo()) {
            return this.targetClassInfo;
        }
        ClassInfo type = this.targetClassInfo.findCorrespondingType(mixin);
        if (type == null) {
            throw new InvalidMixinException(this, "Resolution error: unable to find corresponding type for " + mixin + " in hierarchy of " + this.targetClassInfo);
        }
        return type;
    }
}
