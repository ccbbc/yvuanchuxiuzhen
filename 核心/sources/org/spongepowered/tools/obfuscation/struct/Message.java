package org.spongepowered.tools.obfuscation.struct;

import javax.annotation.processing.Messager;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic;
import org.spongepowered.tools.obfuscation.mirror.AnnotationHandle;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/struct/Message.class */
public class Message {
    private Diagnostic.Kind kind;
    private CharSequence msg;
    private final Element element;
    private final AnnotationMirror annotation;
    private final AnnotationValue value;

    public Message(Diagnostic.Kind kind, CharSequence msg) {
        this(kind, msg, (Element) null, (AnnotationMirror) null, (AnnotationValue) null);
    }

    public Message(Diagnostic.Kind kind, CharSequence msg, Element element) {
        this(kind, msg, element, (AnnotationMirror) null, (AnnotationValue) null);
    }

    public Message(Diagnostic.Kind kind, CharSequence msg, Element element, AnnotationHandle annotation) {
        this(kind, msg, element, annotation.asMirror(), (AnnotationValue) null);
    }

    public Message(Diagnostic.Kind kind, CharSequence msg, Element element, AnnotationMirror annotation) {
        this(kind, msg, element, annotation, (AnnotationValue) null);
    }

    public Message(Diagnostic.Kind kind, CharSequence msg, Element element, AnnotationHandle annotation, AnnotationValue value) {
        this(kind, msg, element, annotation.asMirror(), value);
    }

    public Message(Diagnostic.Kind kind, CharSequence msg, Element element, AnnotationMirror annotation, AnnotationValue value) {
        this.kind = kind;
        this.msg = msg;
        this.element = element;
        this.annotation = annotation;
        this.value = value;
    }

    public Message sendTo(Messager messager) {
        if (this.value != null) {
            messager.printMessage(this.kind, this.msg, this.element, this.annotation, this.value);
        } else if (this.annotation != null) {
            messager.printMessage(this.kind, this.msg, this.element, this.annotation);
        } else if (this.element != null) {
            messager.printMessage(this.kind, this.msg, this.element);
        } else {
            messager.printMessage(this.kind, this.msg);
        }
        return this;
    }

    public Diagnostic.Kind getKind() {
        return this.kind;
    }

    public Message setKind(Diagnostic.Kind kind) {
        this.kind = kind;
        return this;
    }

    public CharSequence getMsg() {
        return this.msg;
    }

    public Message setMsg(CharSequence msg) {
        this.msg = msg;
        return this;
    }

    public Element getElement() {
        return this.element;
    }

    public AnnotationMirror getAnnotation() {
        return this.annotation;
    }

    public AnnotationValue getValue() {
        return this.value;
    }
}
