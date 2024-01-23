package org.spongepowered.tools.obfuscation.mapping;

import org.spongepowered.asm.obfuscation.mapping.common.MappingField;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.tools.obfuscation.ObfuscationType;
import org.spongepowered.tools.obfuscation.mapping.IMappingConsumer;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/mapping/IMappingWriter.class */
public interface IMappingWriter {
    void write(String str, ObfuscationType obfuscationType, IMappingConsumer.MappingSet<MappingField> mappingSet, IMappingConsumer.MappingSet<MappingMethod> mappingSet2);
}
