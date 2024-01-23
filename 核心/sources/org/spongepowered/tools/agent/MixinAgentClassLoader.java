package org.spongepowered.tools.agent;

import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.util.Constants;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/agent/MixinAgentClassLoader.class */
class MixinAgentClassLoader extends ClassLoader {
    private static final Logger logger = LogManager.getLogger("mixin.agent");
    private Map<Class<?>, byte[]> mixins = new HashMap();
    private Map<String, byte[]> targets = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addMixinClass(String name) {
        logger.debug("Mixin class {} added to class loader", new Object[]{name});
        try {
            byte[] bytes = materialise(name);
            Class<?> clazz = defineClass(name, bytes, 0, bytes.length);
            clazz.newInstance();
            this.mixins.put(clazz, bytes);
        } catch (Throwable e) {
            logger.catching(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addTargetClass(String name, ClassNode classNode) {
        synchronized (this.targets) {
            if (this.targets.containsKey(name)) {
                return;
            }
            try {
                ClassWriter cw = new ClassWriter(0);
                classNode.accept(cw);
                this.targets.put(name, cw.toByteArray());
            } catch (Exception ex) {
                logger.error("Error storing original class bytecode for {} in mixin hotswap agent. {}: {}", new Object[]{name, ex.getClass().getName(), ex.getMessage()});
                logger.debug(ex);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] getFakeMixinBytecode(Class<?> clazz) {
        return this.mixins.get(clazz);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] getOriginalTargetBytecode(String name) {
        byte[] bArr;
        synchronized (this.targets) {
            bArr = this.targets.get(name);
        }
        return bArr;
    }

    private byte[] materialise(String name) {
        ClassWriter cw = new ClassWriter(3);
        cw.visit(MixinEnvironment.getCompatibilityLevel().classVersion(), 1, name.replace('.', '/'), (String) null, Type.getInternalName(Object.class), (String[]) null);
        MethodVisitor mv = cw.visitMethod(1, Constants.CTOR, "()V", (String) null, (String[]) null);
        mv.visitCode();
        mv.visitVarInsn(25, 0);
        mv.visitMethodInsn(183, Type.getInternalName(Object.class), Constants.CTOR, "()V", false);
        mv.visitInsn(177);
        mv.visitMaxs(1, 1);
        mv.visitEnd();
        cw.visitEnd();
        return cw.toByteArray();
    }
}
