package org.spongepowered.asm.mixin.injection.struct;

import com.google.common.base.Strings;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInjector;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;
import org.spongepowered.asm.util.Annotations;

@InjectionInfo.AnnotationType(Inject.class)
/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/injection/struct/CallbackInjectionInfo.class */
public class CallbackInjectionInfo extends InjectionInfo {
    protected CallbackInjectionInfo(MixinTargetContext mixin, MethodNode method, AnnotationNode annotation) {
        super(mixin, method, annotation);
    }

    @Override // org.spongepowered.asm.mixin.injection.struct.InjectionInfo
    protected Injector parseInjector(AnnotationNode injectAnnotation) {
        boolean cancellable = ((Boolean) Annotations.getValue(injectAnnotation, "cancellable", Boolean.FALSE)).booleanValue();
        LocalCapture locals = (LocalCapture) Annotations.getValue(injectAnnotation, "locals", LocalCapture.class, LocalCapture.NO_CAPTURE);
        String identifier = (String) Annotations.getValue(injectAnnotation, "id", "");
        return new CallbackInjector(this, cancellable, locals, identifier);
    }

    @Override // org.spongepowered.asm.mixin.injection.struct.InjectionInfo
    public String getSliceId(String id) {
        return Strings.nullToEmpty(id);
    }
}
