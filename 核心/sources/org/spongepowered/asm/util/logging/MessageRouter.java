package org.spongepowered.asm.util.logging;

import javax.annotation.processing.Messager;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.InjectionPoint;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/util/logging/MessageRouter.class */
public final class MessageRouter {
    private static Messager messager;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/util/logging/MessageRouter$LoggingMessager.class */
    public static class LoggingMessager implements Messager {
        private static final Logger logger = LogManager.getLogger(MixinLaunchPlugin.NAME);

        LoggingMessager() {
        }

        public void printMessage(Diagnostic.Kind kind, CharSequence msg) {
            logger.log(messageKindToLoggingLevel(kind), msg);
        }

        public void printMessage(Diagnostic.Kind kind, CharSequence msg, Element e) {
            logger.log(messageKindToLoggingLevel(kind), msg);
        }

        public void printMessage(Diagnostic.Kind kind, CharSequence msg, Element e, AnnotationMirror a) {
            logger.log(messageKindToLoggingLevel(kind), msg);
        }

        public void printMessage(Diagnostic.Kind kind, CharSequence msg, Element e, AnnotationMirror a, AnnotationValue v) {
            logger.log(messageKindToLoggingLevel(kind), msg);
        }

        private static Level messageKindToLoggingLevel(Diagnostic.Kind kind) {
            switch (AnonymousClass1.$SwitchMap$javax$tools$Diagnostic$Kind[kind.ordinal()]) {
                case 1:
                    return Level.ERROR;
                case 2:
                case 3:
                    return Level.WARN;
                case MixinEnvironment.CompatibilityLevel.LanguageFeature.NESTING /* 4 */:
                    return Level.INFO;
                case InjectionPoint.MAX_ALLOWED_SHIFT_BY /* 5 */:
                default:
                    return Level.DEBUG;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.spongepowered.asm.util.logging.MessageRouter$1  reason: invalid class name */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/util/logging/MessageRouter$1.class */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$javax$tools$Diagnostic$Kind = new int[Diagnostic.Kind.values().length];

        static {
            try {
                $SwitchMap$javax$tools$Diagnostic$Kind[Diagnostic.Kind.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$javax$tools$Diagnostic$Kind[Diagnostic.Kind.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$javax$tools$Diagnostic$Kind[Diagnostic.Kind.MANDATORY_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$javax$tools$Diagnostic$Kind[Diagnostic.Kind.NOTE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$javax$tools$Diagnostic$Kind[Diagnostic.Kind.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/util/logging/MessageRouter$DebugInterceptingMessager.class */
    static class DebugInterceptingMessager implements Messager {
        private final Messager wrapped;

        DebugInterceptingMessager(Messager messager) {
            this.wrapped = messager;
        }

        public void printMessage(Diagnostic.Kind kind, CharSequence msg) {
            if (kind != Diagnostic.Kind.OTHER) {
                this.wrapped.printMessage(kind, msg);
            }
        }

        public void printMessage(Diagnostic.Kind kind, CharSequence msg, Element e) {
            if (kind != Diagnostic.Kind.OTHER) {
                this.wrapped.printMessage(kind, msg, e);
            }
        }

        public void printMessage(Diagnostic.Kind kind, CharSequence msg, Element e, AnnotationMirror a) {
            if (kind != Diagnostic.Kind.OTHER) {
                this.wrapped.printMessage(kind, msg, e, a);
            }
        }

        public void printMessage(Diagnostic.Kind kind, CharSequence msg, Element e, AnnotationMirror a, AnnotationValue v) {
            if (kind != Diagnostic.Kind.OTHER) {
                this.wrapped.printMessage(kind, msg, e, a, v);
            }
        }
    }

    private MessageRouter() {
    }

    public static Messager getMessager() {
        if (messager == null) {
            messager = new LoggingMessager();
        }
        return messager;
    }

    public static void setMessager(Messager messager2) {
        messager = messager2 == null ? null : new DebugInterceptingMessager(messager2);
    }
}
