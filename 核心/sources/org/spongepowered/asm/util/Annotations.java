package org.spongepowered.asm.util;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Intrinsic;
import org.spongepowered.asm.mixin.Overwrite;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/util/Annotations.class */
public final class Annotations {
    private static final Class<?>[] MERGEABLE_MIXIN_ANNOTATIONS = {Overwrite.class, Intrinsic.class, Final.class, Debug.class};
    private static Pattern mergeableAnnotationPattern = getMergeableAnnotationPattern();
    private static final Logger logger = LogManager.getLogger(MixinLaunchPlugin.NAME);

    private Annotations() {
    }

    public static void setVisible(FieldNode field, Class<? extends Annotation> annotationClass, Object... value) {
        AnnotationNode node = createNode(Type.getDescriptor(annotationClass), value);
        field.visibleAnnotations = add(field.visibleAnnotations, node);
    }

    public static void setInvisible(FieldNode field, Class<? extends Annotation> annotationClass, Object... value) {
        AnnotationNode node = createNode(Type.getDescriptor(annotationClass), value);
        field.invisibleAnnotations = add(field.invisibleAnnotations, node);
    }

    public static void setVisible(MethodNode method, Class<? extends Annotation> annotationClass, Object... value) {
        AnnotationNode node = createNode(Type.getDescriptor(annotationClass), value);
        method.visibleAnnotations = add(method.visibleAnnotations, node);
    }

    public static void setInvisible(MethodNode method, Class<? extends Annotation> annotationClass, Object... value) {
        AnnotationNode node = createNode(Type.getDescriptor(annotationClass), value);
        method.invisibleAnnotations = add(method.invisibleAnnotations, node);
    }

    private static AnnotationNode createNode(String annotationType, Object... value) {
        AnnotationNode node = new AnnotationNode(annotationType);
        for (int pos = 0; pos < value.length - 1; pos += 2) {
            if (!(value[pos] instanceof String)) {
                throw new IllegalArgumentException("Annotation keys must be strings, found " + value[pos].getClass().getSimpleName() + " with " + value[pos].toString() + " at index " + pos + " creating " + annotationType);
            }
            node.visit((String) value[pos], value[pos + 1]);
        }
        return node;
    }

    private static List<AnnotationNode> add(List<AnnotationNode> annotations, AnnotationNode node) {
        if (annotations == null) {
            annotations = new ArrayList(1);
        } else {
            annotations.remove(get(annotations, node.desc));
        }
        annotations.add(node);
        return annotations;
    }

    public static AnnotationNode getVisible(FieldNode field, Class<? extends Annotation> annotationClass) {
        return get(field.visibleAnnotations, Type.getDescriptor(annotationClass));
    }

    public static AnnotationNode getInvisible(FieldNode field, Class<? extends Annotation> annotationClass) {
        return get(field.invisibleAnnotations, Type.getDescriptor(annotationClass));
    }

    public static AnnotationNode getVisible(MethodNode method, Class<? extends Annotation> annotationClass) {
        return get(method.visibleAnnotations, Type.getDescriptor(annotationClass));
    }

    public static AnnotationNode getInvisible(MethodNode method, Class<? extends Annotation> annotationClass) {
        return get(method.invisibleAnnotations, Type.getDescriptor(annotationClass));
    }

    public static AnnotationNode getSingleVisible(MethodNode method, Class<? extends Annotation>... annotationClasses) {
        return getSingle(method.visibleAnnotations, annotationClasses);
    }

    public static AnnotationNode getSingleInvisible(MethodNode method, Class<? extends Annotation>... annotationClasses) {
        return getSingle(method.invisibleAnnotations, annotationClasses);
    }

    public static AnnotationNode getVisible(ClassNode classNode, Class<? extends Annotation> annotationClass) {
        return get(classNode.visibleAnnotations, Type.getDescriptor(annotationClass));
    }

    public static AnnotationNode getInvisible(ClassNode classNode, Class<? extends Annotation> annotationClass) {
        return get(classNode.invisibleAnnotations, Type.getDescriptor(annotationClass));
    }

    public static AnnotationNode getVisibleParameter(MethodNode method, Class<? extends Annotation> annotationClass, int paramIndex) {
        if (paramIndex < 0) {
            return getVisible(method, annotationClass);
        }
        return getParameter(method.visibleParameterAnnotations, Type.getDescriptor(annotationClass), paramIndex);
    }

    public static AnnotationNode getInvisibleParameter(MethodNode method, Class<? extends Annotation> annotationClass, int paramIndex) {
        if (paramIndex < 0) {
            return getInvisible(method, annotationClass);
        }
        return getParameter(method.invisibleParameterAnnotations, Type.getDescriptor(annotationClass), paramIndex);
    }

    public static AnnotationNode getParameter(List<AnnotationNode>[] parameterAnnotations, String annotationType, int paramIndex) {
        if (parameterAnnotations == null || paramIndex < 0 || paramIndex >= parameterAnnotations.length) {
            return null;
        }
        return get(parameterAnnotations[paramIndex], annotationType);
    }

    public static AnnotationNode get(List<AnnotationNode> annotations, String annotationType) {
        if (annotations == null) {
            return null;
        }
        for (AnnotationNode annotation : annotations) {
            if (annotationType.equals(annotation.desc)) {
                return annotation;
            }
        }
        return null;
    }

    private static AnnotationNode getSingle(List<AnnotationNode> annotations, Class<? extends Annotation>[] annotationClasses) {
        List<AnnotationNode> nodes = new ArrayList<>();
        for (Class<? extends Annotation> annotationClass : annotationClasses) {
            AnnotationNode annotation = get(annotations, Type.getDescriptor(annotationClass));
            if (annotation != null) {
                nodes.add(annotation);
            }
        }
        int foundNodes = nodes.size();
        if (foundNodes > 1) {
            throw new IllegalArgumentException("Conflicting annotations found: " + Lists.transform(nodes, new Function<AnnotationNode, String>() { // from class: org.spongepowered.asm.util.Annotations.1
                public String apply(AnnotationNode input) {
                    return input.desc;
                }
            }));
        }
        if (foundNodes == 0) {
            return null;
        }
        return nodes.get(0);
    }

    public static <T> T getValue(AnnotationNode annotation) {
        return (T) getValue(annotation, "value");
    }

    public static <T> T getValue(AnnotationNode annotation, String key, T defaultValue) {
        T returnValue = (T) getValue(annotation, key);
        return returnValue != null ? returnValue : defaultValue;
    }

    public static <T> T getValue(AnnotationNode annotation, String key, Class<?> annotationClass) {
        Preconditions.checkNotNull(annotationClass, "annotationClass cannot be null");
        Object value = getValue(annotation, key);
        if (value == null) {
            try {
                value = annotationClass.getDeclaredMethod(key, new Class[0]).getDefaultValue();
            } catch (NoSuchMethodException e) {
            }
        }
        return (T) value;
    }

    public static <T> T getValue(AnnotationNode annotation, String key) {
        boolean getNextValue = false;
        if (annotation == null || annotation.values == null) {
            return null;
        }
        for (T t : annotation.values) {
            if (getNextValue) {
                return t;
            }
            if (t.equals(key)) {
                getNextValue = true;
            }
        }
        return null;
    }

    public static <T extends Enum<T>> T getValue(AnnotationNode annotation, String key, Class<T> enumClass, T defaultValue) {
        String[] value = (String[]) getValue(annotation, key);
        if (value == null) {
            return defaultValue;
        }
        return (T) toEnumValue(enumClass, value);
    }

    public static <T> List<T> getValue(AnnotationNode annotation, String key, boolean notNull) {
        Object value = getValue(annotation, key);
        if (value instanceof List) {
            return (List) value;
        }
        if (value != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(value);
            return arrayList;
        }
        return Collections.emptyList();
    }

    public static <T extends Enum<T>> List<T> getValue(AnnotationNode annotation, String key, boolean notNull, Class<T> enumClass) {
        Object value = getValue(annotation, key);
        if (value instanceof List) {
            ListIterator<Object> iter = ((List) value).listIterator();
            while (iter.hasNext()) {
                iter.set(toEnumValue(enumClass, (String[]) iter.next()));
            }
            return (List) value;
        } else if (value instanceof String[]) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(toEnumValue(enumClass, (String[]) value));
            return arrayList;
        } else {
            return Collections.emptyList();
        }
    }

    public static void setValue(AnnotationNode annotation, String key, Object value) {
        if (annotation == null) {
            return;
        }
        int existingIndex = 0;
        if (annotation.values != null) {
            int pos = 0;
            while (true) {
                if (pos >= annotation.values.size() - 1) {
                    break;
                }
                String keyName = annotation.values.get(pos).toString();
                if (!key.equals(keyName)) {
                    pos += 2;
                } else {
                    existingIndex = pos + 1;
                    break;
                }
            }
        } else {
            annotation.values = new ArrayList();
        }
        if (existingIndex > 0) {
            annotation.values.set(existingIndex, packValue(value));
            return;
        }
        annotation.values.add(key);
        annotation.values.add(packValue(value));
    }

    private static Object packValue(Object value) {
        Class<?> cls = value.getClass();
        return cls.isEnum() ? new String[]{Type.getDescriptor(cls), value.toString()} : value;
    }

    public static void merge(ClassNode from, ClassNode to) {
        to.visibleAnnotations = merge(from.visibleAnnotations, to.visibleAnnotations, "class", from.name);
        to.invisibleAnnotations = merge(from.invisibleAnnotations, to.invisibleAnnotations, "class", from.name);
    }

    public static void merge(MethodNode from, MethodNode to) {
        to.visibleAnnotations = merge(from.visibleAnnotations, to.visibleAnnotations, "method", from.name);
        to.invisibleAnnotations = merge(from.invisibleAnnotations, to.invisibleAnnotations, "method", from.name);
    }

    public static void merge(FieldNode from, FieldNode to) {
        to.visibleAnnotations = merge(from.visibleAnnotations, to.visibleAnnotations, "field", from.name);
        to.invisibleAnnotations = merge(from.invisibleAnnotations, to.invisibleAnnotations, "field", from.name);
    }

    private static List<AnnotationNode> merge(List<AnnotationNode> from, List<AnnotationNode> to, String type, String name) {
        if (from == null) {
            return to;
        }
        if (to == null) {
            try {
                to = new ArrayList();
            } catch (Exception e) {
                logger.warn("Exception encountered whilst merging annotations for {} {}", new Object[]{type, name});
            }
        }
        for (AnnotationNode annotation : from) {
            if (isMergeableAnnotation(annotation)) {
                Iterator<AnnotationNode> iter = to.iterator();
                while (true) {
                    if (iter.hasNext()) {
                        if (iter.next().desc.equals(annotation.desc)) {
                            iter.remove();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                to.add(annotation);
            }
        }
        return to;
    }

    private static boolean isMergeableAnnotation(AnnotationNode annotation) {
        if (annotation.desc.startsWith("L" + Constants.MIXIN_PACKAGE_REF)) {
            return mergeableAnnotationPattern.matcher(annotation.desc).matches();
        }
        return true;
    }

    private static Pattern getMergeableAnnotationPattern() {
        StringBuilder sb = new StringBuilder("^L(");
        for (int i = 0; i < MERGEABLE_MIXIN_ANNOTATIONS.length; i++) {
            if (i > 0) {
                sb.append('|');
            }
            sb.append(MERGEABLE_MIXIN_ANNOTATIONS[i].getName().replace('.', '/'));
        }
        return Pattern.compile(sb.append(");$").toString());
    }

    private static <T extends Enum<T>> T toEnumValue(Class<T> enumClass, String[] value) {
        if (!enumClass.getName().equals(Type.getType(value[0]).getClassName())) {
            throw new IllegalArgumentException("The supplied enum class does not match the stored enum value");
        }
        return (T) Enum.valueOf(enumClass, value[1]);
    }
}
