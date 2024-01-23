package org.spongepowered.asm.mixin.gen;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.FieldNode;
import org.spongepowered.asm.util.Bytecode;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/gen/AccessorGeneratorField.class */
public abstract class AccessorGeneratorField extends AccessorGenerator {
    protected final FieldNode targetField;
    protected final Type targetType;

    public AccessorGeneratorField(AccessorInfo info) {
        super(info, Bytecode.isStatic(info.getTargetField()));
        this.targetField = info.getTargetField();
        this.targetType = info.getTargetFieldType();
        checkModifiers();
    }
}
