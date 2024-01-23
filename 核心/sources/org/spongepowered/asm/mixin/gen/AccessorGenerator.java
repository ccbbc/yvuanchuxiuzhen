package org.spongepowered.asm.mixin.gen;

import java.util.ArrayList;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.util.asm.ASM;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/gen/AccessorGenerator.class */
public abstract class AccessorGenerator {
    protected final AccessorInfo info;
    protected final boolean targetIsStatic;

    public abstract MethodNode generate();

    public AccessorGenerator(AccessorInfo info, boolean isStatic) {
        this.info = info;
        this.targetIsStatic = isStatic;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void checkModifiers() {
        if (this.info.isStatic() && !this.targetIsStatic) {
            IMixinContext context = this.info.getContext();
            Object[] objArr = new Object[2];
            objArr[0] = this.info;
            objArr[1] = this.info.isStatic() ? "" : " not";
            throw new InvalidInjectionException(context, String.format("%s is invalid. Accessor method is%s static but the target is not.", objArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final MethodNode createMethod(int maxLocals, int maxStack) {
        MethodNode method = this.info.getMethod();
        MethodNode accessor = new MethodNode(ASM.API_VERSION, (method.access & (-1025)) | 4096, method.name, method.desc, (String) null, (String[]) null);
        accessor.visibleAnnotations = new ArrayList();
        accessor.visibleAnnotations.add(this.info.getAnnotation());
        accessor.maxLocals = maxLocals;
        accessor.maxStack = maxStack;
        return accessor;
    }

    public void validate() {
    }
}
