package org.spongepowered.tools.obfuscation.mirror.mapping;

import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.tools.obfuscation.mirror.TypeHandle;
import org.spongepowered.tools.obfuscation.mirror.TypeUtils;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/mirror/mapping/MappingMethodResolvable.class */
public final class MappingMethodResolvable extends MappingMethod {
    private final TypeHandle ownerHandle;

    public MappingMethodResolvable(TypeHandle owner, String name, String desc) {
        super(owner.getName(), name, desc);
        this.ownerHandle = owner;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.spongepowered.asm.obfuscation.mapping.common.MappingMethod, org.spongepowered.asm.obfuscation.mapping.IMapping
    public MappingMethod getSuper() {
        if (this.ownerHandle == null) {
            return super.getSuper();
        }
        String name = getSimpleName();
        String desc = getDesc();
        String signature = TypeUtils.getJavaSignature(desc);
        TypeHandle superClass = this.ownerHandle.getSuperclass();
        if (superClass != null && superClass.findMethod(name, signature) != null) {
            return superClass.getMappingMethod(name, desc);
        }
        for (TypeHandle iface : this.ownerHandle.getInterfaces()) {
            if (iface.findMethod(name, signature) != null) {
                return iface.getMappingMethod(name, desc);
            }
        }
        if (superClass != null) {
            return superClass.getMappingMethod(name, desc).getSuper();
        }
        return super.getSuper();
    }

    public MappingMethod move(TypeHandle newOwner) {
        return new MappingMethodResolvable(newOwner, getSimpleName(), getDesc());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.spongepowered.asm.obfuscation.mapping.common.MappingMethod, org.spongepowered.asm.obfuscation.mapping.IMapping
    public MappingMethod remap(String newName) {
        return new MappingMethodResolvable(this.ownerHandle, newName, getDesc());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.spongepowered.asm.obfuscation.mapping.common.MappingMethod, org.spongepowered.asm.obfuscation.mapping.IMapping
    public MappingMethod transform(String newDesc) {
        return new MappingMethodResolvable(this.ownerHandle, getSimpleName(), newDesc);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.spongepowered.asm.obfuscation.mapping.common.MappingMethod, org.spongepowered.asm.obfuscation.mapping.IMapping
    public MappingMethod copy() {
        return new MappingMethodResolvable(this.ownerHandle, getSimpleName(), getDesc());
    }
}
