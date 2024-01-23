package org.spongepowered.asm.mixin.gen;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.gen.AccessorInfo;
import org.spongepowered.asm.mixin.gen.throwables.InvalidAccessorException;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelector;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorByName;
import org.spongepowered.asm.mixin.injection.selectors.TargetSelector;
import org.spongepowered.asm.mixin.injection.struct.MemberInfo;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.Constants;
import org.spongepowered.asm.util.asm.ElementNode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/gen/InvokerInfo.class */
public class InvokerInfo extends AccessorInfo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public InvokerInfo(MixinTargetContext mixin, MethodNode method) {
        super(mixin, method, Invoker.class);
    }

    @Override // org.spongepowered.asm.mixin.gen.AccessorInfo
    protected AccessorInfo.AccessorType initType() {
        if (this.specifiedName != null) {
            String mappedReference = this.mixin.getReferenceMapper().remap(this.mixin.getClassRef(), this.specifiedName);
            return initType(mappedReference.replace('.', '/'), this.mixin.getTargetClassRef());
        }
        AccessorInfo.AccessorName accessorName = AccessorInfo.AccessorName.of(this.method.name, false);
        if (accessorName != null) {
            for (String prefix : AccessorInfo.AccessorType.OBJECT_FACTORY.getExpectedPrefixes()) {
                if (prefix.equals(accessorName.prefix)) {
                    return initType(accessorName.name, this.mixin.getTargetClassInfo().getSimpleName());
                }
            }
        }
        return AccessorInfo.AccessorType.METHOD_PROXY;
    }

    private AccessorInfo.AccessorType initType(String targetName, String targetClassName) {
        if (Constants.CTOR.equals(targetName) || targetClassName.equals(targetName)) {
            if (!this.returnType.equals(this.mixin.getTargetClassInfo().getType())) {
                throw new InvalidAccessorException(this.mixin, String.format("%s appears to have an invalid return type. %s requires matching return type. Found %s expected %s", this, AccessorInfo.AccessorType.OBJECT_FACTORY, Bytecode.getSimpleName(this.returnType), this.mixin.getTargetClassInfo().getSimpleName()));
            }
            if (!this.isStatic) {
                throw new InvalidAccessorException(this.mixin, String.format("%s for %s must be static", this, AccessorInfo.AccessorType.OBJECT_FACTORY, Bytecode.getSimpleName(this.returnType)));
            }
            return AccessorInfo.AccessorType.OBJECT_FACTORY;
        }
        return AccessorInfo.AccessorType.METHOD_PROXY;
    }

    @Override // org.spongepowered.asm.mixin.gen.AccessorInfo
    protected Type initTargetFieldType() {
        return null;
    }

    @Override // org.spongepowered.asm.mixin.gen.AccessorInfo
    protected ITargetSelector initTarget() {
        if (this.type == AccessorInfo.AccessorType.OBJECT_FACTORY) {
            return new MemberInfo(Constants.CTOR, (String) null, Bytecode.changeDescriptorReturnType(this.method.desc, "V"));
        }
        return new MemberInfo(getTargetName(this.specifiedName), (String) null, this.method.desc);
    }

    @Override // org.spongepowered.asm.mixin.gen.AccessorInfo
    public void locate() {
        this.targetMethod = findTargetMethod();
    }

    private MethodNode findTargetMethod() {
        String name;
        TargetSelector.Result<MethodNode> result = TargetSelector.run(this.target.configure("orphan"), ElementNode.methodList(this.classNode));
        try {
            return result.getSingleResult(true);
        } catch (IllegalStateException ex) {
            String message = ex.getMessage() + " matching " + this.target + " in " + this.classNode.name + " for " + this;
            if (this.type == AccessorInfo.AccessorType.METHOD_PROXY && this.specifiedName != null && (this.target instanceof ITargetSelectorByName) && (name = ((ITargetSelectorByName) this.target).getName()) != null && (name.contains(".") || name.contains("/"))) {
                throw new InvalidAccessorException(this, "Invalid factory invoker failed to match the target class. " + message);
            }
            throw new InvalidAccessorException(this, message);
        }
    }
}
