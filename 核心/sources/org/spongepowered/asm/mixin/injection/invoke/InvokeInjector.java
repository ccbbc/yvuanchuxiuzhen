package org.spongepowered.asm.mixin.injection.invoke;

import java.util.List;
import org.objectweb.asm.tree.MethodInsnNode;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/invoke/InvokeInjector.class */
public abstract class InvokeInjector extends Injector {
    protected abstract void injectAtInvoke(Target target, InjectionNodes.InjectionNode injectionNode);

    public InvokeInjector(InjectionInfo info, String annotationType) {
        super(info, annotationType);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongepowered.asm.mixin.injection.code.Injector
    public void sanityCheck(Target target, List<InjectionPoint> injectionPoints) {
        super.sanityCheck(target, injectionPoints);
        checkTarget(target);
    }

    protected void checkTarget(Target target) {
        checkTargetModifiers(target, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongepowered.asm.mixin.injection.code.Injector
    public void inject(Target target, InjectionNodes.InjectionNode node) {
        if (!(node.getCurrentTarget() instanceof MethodInsnNode)) {
            throw new InvalidInjectionException(this.info, String.format("%s annotation on is targetting a non-method insn in %s in %s", this.annotationType, target, this));
        }
        injectAtInvoke(target, node);
    }
}
