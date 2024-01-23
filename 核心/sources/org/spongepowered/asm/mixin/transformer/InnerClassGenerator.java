package org.spongepowered.asm.mixin.transformer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.ArgsClassGenerator;
import org.spongepowered.asm.mixin.transformer.ClassInfo;
import org.spongepowered.asm.mixin.transformer.ext.IClassGenerator;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.service.ISyntheticClassInfo;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.IConsumer;
import org.spongepowered.asm.util.asm.ASM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/InnerClassGenerator.class */
public final class InnerClassGenerator implements IClassGenerator {
    private static final Logger logger = LogManager.getLogger(MixinLaunchPlugin.NAME);
    private final IConsumer<ISyntheticClassInfo> registry;
    private final Map<String, String> innerClassNames = new HashMap();
    private final Map<String, InnerClassInfo> innerClasses = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/InnerClassGenerator$InnerClassInfo.class */
    public static class InnerClassInfo extends Remapper implements ISyntheticClassInfo {
        private final IMixinInfo mixin;
        private final String name;
        private final String originalName;
        private final MixinInfo owner;
        private final MixinTargetContext target;
        private final String ownerName;
        private final String targetName;
        private int loadCounter;

        InnerClassInfo(IMixinInfo mixin, String name, String originalName, MixinInfo owner, MixinTargetContext target) {
            this.mixin = mixin;
            this.name = name;
            this.originalName = originalName;
            this.owner = owner;
            this.ownerName = owner.getClassRef();
            this.target = target;
            this.targetName = target.getTargetClassRef();
        }

        @Override // org.spongepowered.asm.service.ISyntheticClassInfo
        public IMixinInfo getMixin() {
            return this.mixin;
        }

        @Override // org.spongepowered.asm.service.ISyntheticClassInfo
        public boolean isLoaded() {
            return this.loadCounter > 0;
        }

        @Override // org.spongepowered.asm.service.ISyntheticClassInfo
        public String getName() {
            return this.name;
        }

        @Override // org.spongepowered.asm.service.ISyntheticClassInfo
        public String getClassName() {
            return this.name.replace('/', '.');
        }

        String getOriginalName() {
            return this.originalName;
        }

        MixinInfo getOwner() {
            return this.owner;
        }

        MixinTargetContext getTarget() {
            return this.target;
        }

        String getOwnerName() {
            return this.ownerName;
        }

        String getTargetName() {
            return this.targetName;
        }

        void accept(ClassVisitor classVisitor) throws ClassNotFoundException, IOException {
            ClassNode classNode = MixinService.getService().getBytecodeProvider().getClassNode(this.originalName);
            classNode.accept(classVisitor);
            this.loadCounter++;
        }

        public String mapMethodName(String owner, String name, String desc) {
            ClassInfo.Method method;
            if (this.ownerName.equalsIgnoreCase(owner) && (method = this.owner.getClassInfo().findMethod(name, desc, 10)) != null) {
                return method.getName();
            }
            return super.mapMethodName(owner, name, desc);
        }

        public String map(String key) {
            if (this.originalName.equals(key)) {
                return this.name;
            }
            if (this.ownerName.equals(key)) {
                return this.targetName;
            }
            return key;
        }

        public String toString() {
            return this.name;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/InnerClassGenerator$InnerClassAdapter.class */
    public static class InnerClassAdapter extends ClassRemapper {
        private final InnerClassInfo info;

        public InnerClassAdapter(ClassVisitor cv, InnerClassInfo info) {
            super(ASM.API_VERSION, cv, info);
            this.info = info;
        }

        public void visitSource(String source, String debug) {
            super.visitSource(source, debug);
            AnnotationVisitor av = this.cv.visitAnnotation("Lorg/spongepowered/asm/mixin/transformer/meta/MixinInner;", false);
            av.visit(MixinLaunchPlugin.NAME, this.info.getOwner().toString());
            av.visit("name", this.info.getOriginalName().substring(this.info.getOriginalName().lastIndexOf(47) + 1));
            av.visitEnd();
        }

        public void visitInnerClass(String name, String outerName, String innerName, int access) {
            if (name.startsWith(this.info.getOriginalName() + ArgsClassGenerator.GETTER_PREFIX)) {
                throw new InvalidMixinException(this.info.getOwner(), "Found unsupported nested inner class " + name + " in " + this.info.getOriginalName());
            }
            super.visitInnerClass(name, outerName, innerName, access);
        }
    }

    public InnerClassGenerator(IConsumer<ISyntheticClassInfo> registry) {
        this.registry = registry;
    }

    @Override // org.spongepowered.asm.mixin.transformer.ext.IClassGenerator
    public String getName() {
        return "inner";
    }

    public String registerInnerClass(MixinInfo owner, String originalName, MixinTargetContext context) {
        String id = String.format("%s%s", originalName, context);
        String ref = this.innerClassNames.get(id);
        if (ref == null) {
            ref = getUniqueReference(originalName, context);
            InnerClassInfo info = new InnerClassInfo(owner, ref, originalName, owner, context);
            this.innerClassNames.put(id, ref);
            this.innerClasses.put(ref, info);
            this.registry.accept(info);
            logger.debug("Inner class {} in {} on {} gets unique name {}", new Object[]{originalName, owner.getClassRef(), context.getTargetClassRef(), ref});
        }
        return ref;
    }

    @Override // org.spongepowered.asm.mixin.transformer.ext.IClassGenerator
    public boolean generate(String name, ClassNode classNode) {
        String ref = name.replace('.', '/');
        InnerClassInfo info = this.innerClasses.get(ref);
        if (info == null) {
            return false;
        }
        return generate(info, classNode);
    }

    private boolean generate(InnerClassInfo info, ClassNode classNode) {
        try {
            logger.debug("Generating mapped inner class {} (originally {})", new Object[]{info.getName(), info.getOriginalName()});
            info.accept(new InnerClassAdapter(classNode, info));
            return true;
        } catch (InvalidMixinException ex) {
            throw ex;
        } catch (Exception ex2) {
            logger.catching(ex2);
            return false;
        }
    }

    private static String getUniqueReference(String originalName, MixinTargetContext context) {
        String name = originalName.substring(originalName.lastIndexOf(36) + 1);
        if (name.matches("^[0-9]+$")) {
            name = "Anonymous";
        }
        return String.format("%s$%s$%s", context.getTargetClassRef(), name, UUID.randomUUID().toString().replace("-", ""));
    }
}
