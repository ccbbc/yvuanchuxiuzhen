package org.spongepowered.asm.transformers;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.spongepowered.asm.mixin.transformer.ClassInfo;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/transformers/MixinClassWriter.class */
public class MixinClassWriter extends ClassWriter {
    public MixinClassWriter(int flags) {
        super(flags);
    }

    public MixinClassWriter(ClassReader classReader, int flags) {
        super(classReader, flags);
    }

    protected String getCommonSuperClass(String type1, String type2) {
        return ClassInfo.getCommonSuperClass(type1, type2).getName();
    }
}
