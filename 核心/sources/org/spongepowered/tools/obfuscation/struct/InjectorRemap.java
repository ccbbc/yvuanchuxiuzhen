package org.spongepowered.tools.obfuscation.struct;

import javax.annotation.processing.Messager;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic;
import org.spongepowered.tools.obfuscation.mirror.AnnotationHandle;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/struct/InjectorRemap.class */
public class InjectorRemap {
    private final boolean remap;
    private Message message;
    private int remappedCount;

    public InjectorRemap(boolean remap) {
        this.remap = remap;
    }

    public boolean shouldRemap() {
        return this.remap;
    }

    public void notifyRemapped() {
        this.remappedCount++;
        clearMessage();
    }

    public void addMessage(Diagnostic.Kind kind, CharSequence msg, Element element, AnnotationHandle annotation) {
        this.message = new Message(kind, msg, element, annotation);
    }

    public void clearMessage() {
        this.message = null;
    }

    public void dispatchPendingMessages(Messager messager) {
        if (this.remappedCount == 0 && this.message != null) {
            this.message.sendTo(messager);
        }
    }
}
