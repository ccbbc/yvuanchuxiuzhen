package org.spongepowered.asm.mixin.injection;

import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.util.IMessageSink;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/IInjectionPointContext.class */
public interface IInjectionPointContext extends IMessageSink {
    IMixinContext getContext();

    MethodNode getMethod();

    AnnotationNode getAnnotation();
}
