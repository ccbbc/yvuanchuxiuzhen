package org.spongepowered.asm.mixin.transformer;

import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.transformer.ClassInfo;
import org.spongepowered.asm.mixin.transformer.MixinInfo;
import org.spongepowered.asm.util.Counter;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/MethodMapper.class */
public class MethodMapper {
    private static final Logger logger = LogManager.getLogger(MixinLaunchPlugin.NAME);
    private static final List<String> classes = new ArrayList();
    private static final Map<String, Counter> methods = new HashMap();
    private final ClassInfo info;
    private int nextUniqueMethodIndex;
    private int nextUniqueFieldIndex;

    public MethodMapper(MixinEnvironment env, ClassInfo info) {
        this.info = info;
    }

    public ClassInfo getClassInfo() {
        return this.info;
    }

    public void remapHandlerMethod(MixinInfo mixin, MethodNode handler, ClassInfo.Method method) {
        if (!(handler instanceof MixinInfo.MixinMethodNode) || !((MixinInfo.MixinMethodNode) handler).isInjector()) {
            return;
        }
        if (method.isUnique()) {
            logger.warn("Redundant @Unique on injector method {} in {}. Injectors are implicitly unique", new Object[]{method, mixin});
        }
        if (method.isRenamed()) {
            handler.name = method.getName();
            return;
        }
        String handlerName = getHandlerName((MixinInfo.MixinMethodNode) handler);
        handler.name = method.conform(handlerName);
    }

    public String getHandlerName(MixinInfo.MixinMethodNode method) {
        String prefix = InjectionInfo.getInjectorPrefix(method.getInjectorAnnotation());
        String classUID = getClassUID(method.getOwner().getClassRef());
        String methodUID = getMethodUID(method.name, method.desc, !method.isSurrogate());
        return String.format("%s$%s%s$%s", prefix, classUID, methodUID, method.name);
    }

    public String getUniqueName(MethodNode method, String sessionId, boolean preservePrefix) {
        int i = this.nextUniqueMethodIndex;
        this.nextUniqueMethodIndex = i + 1;
        String uniqueIndex = Integer.toHexString(i);
        String pattern = preservePrefix ? "%2$s_$md$%1$s$%3$s" : "md%s$%s$%s";
        return String.format(pattern, sessionId.substring(30), method.name, uniqueIndex);
    }

    public String getUniqueName(FieldNode field, String sessionId) {
        int i = this.nextUniqueFieldIndex;
        this.nextUniqueFieldIndex = i + 1;
        String uniqueIndex = Integer.toHexString(i);
        return String.format("fd%s$%s$%s", sessionId.substring(30), field.name, uniqueIndex);
    }

    private static String getClassUID(String classRef) {
        int index = classes.indexOf(classRef);
        if (index < 0) {
            index = classes.size();
            classes.add(classRef);
        }
        return finagle(index);
    }

    private static String getMethodUID(String name, String desc, boolean increment) {
        String descriptor = String.format("%s%s", name, desc);
        Counter id = methods.get(descriptor);
        if (id == null) {
            id = new Counter();
            methods.put(descriptor, id);
        } else if (increment) {
            id.value++;
        }
        return String.format("%03x", Integer.valueOf(id.value));
    }

    private static String finagle(int index) {
        String hex = Integer.toHexString(index);
        StringBuilder sb = new StringBuilder();
        for (int pos = 0; pos < hex.length(); pos++) {
            char c = hex.charAt(pos);
            sb.append((char) (c + (c < ':' ? '1' : '\n')));
        }
        return Strings.padStart(sb.toString(), 3, 'z');
    }
}
