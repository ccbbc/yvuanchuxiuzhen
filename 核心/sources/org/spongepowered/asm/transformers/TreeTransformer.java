package org.spongepowered.asm.transformers;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.service.ILegacyClassTransformer;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/transformers/TreeTransformer.class */
public abstract class TreeTransformer implements ILegacyClassTransformer {
    private ClassReader classReader;
    private ClassNode classNode;

    /* JADX INFO: Access modifiers changed from: protected */
    public final ClassNode readClass(byte[] basicClass) {
        return readClass(basicClass, true);
    }

    protected final ClassNode readClass(byte[] basicClass, boolean cacheReader) {
        ClassReader classReader = new ClassReader(basicClass);
        if (cacheReader) {
            this.classReader = classReader;
        }
        ClassNode classNode = new ClassNode();
        classReader.accept(classNode, 8);
        return classNode;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final byte[] writeClass(ClassNode classNode) {
        if (this.classReader != null && this.classNode == classNode) {
            this.classNode = null;
            ClassWriter writer = new MixinClassWriter(this.classReader, 3);
            this.classReader = null;
            classNode.accept(writer);
            return writer.toByteArray();
        }
        this.classNode = null;
        ClassWriter writer2 = new MixinClassWriter(3);
        classNode.accept(writer2);
        return writer2.toByteArray();
    }
}
