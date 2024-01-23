package org.spongepowered.tools.obfuscation;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.tools.obfuscation.mirror.AnnotationHandle;
import org.spongepowered.tools.obfuscation.mirror.TypeUtils;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/MixinObfuscationProcessorInjection.class */
public class MixinObfuscationProcessorInjection extends MixinObfuscationProcessor {
    public Set<String> getSupportedAnnotationTypes() {
        Set<String> supportedAnnotationTypes = new HashSet<>();
        supportedAnnotationTypes.add(At.class.getName());
        for (Class<? extends Annotation> annotationType : InjectionInfo.getRegisteredAnnotations()) {
            supportedAnnotationTypes.add(annotationType.getName());
        }
        return supportedAnnotationTypes;
    }

    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        if (roundEnv.processingOver()) {
            postProcess(roundEnv);
            return true;
        }
        processMixins(roundEnv);
        for (Class<? extends Annotation> annotationType : InjectionInfo.getRegisteredAnnotations()) {
            processInjectors(roundEnv, annotationType);
        }
        postProcess(roundEnv);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongepowered.tools.obfuscation.MixinObfuscationProcessor
    public void postProcess(RoundEnvironment roundEnv) {
        super.postProcess(roundEnv);
        try {
            this.mixins.writeReferences();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void processInjectors(RoundEnvironment roundEnv, Class<? extends Annotation> injectorClass) {
        for (ExecutableElement executableElement : roundEnv.getElementsAnnotatedWith(injectorClass)) {
            TypeElement enclosingElement = executableElement.getEnclosingElement();
            if (!(enclosingElement instanceof TypeElement)) {
                throw new IllegalStateException("@" + injectorClass.getSimpleName() + " element has unexpected parent with type " + TypeUtils.getElementType(enclosingElement));
            }
            AnnotationHandle inject = AnnotationHandle.of(executableElement, injectorClass);
            if (executableElement.getKind() == ElementKind.METHOD) {
                this.mixins.registerInjector(enclosingElement, executableElement, inject);
            } else {
                this.mixins.printMessage(Diagnostic.Kind.WARNING, "Found an @" + injectorClass.getSimpleName() + " annotation on an element which is not a method: " + executableElement.toString());
            }
        }
    }
}
