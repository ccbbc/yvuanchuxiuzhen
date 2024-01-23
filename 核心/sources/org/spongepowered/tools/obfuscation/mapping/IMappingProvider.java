package org.spongepowered.tools.obfuscation.mapping;

import java.io.File;
import java.io.IOException;
import org.spongepowered.asm.obfuscation.mapping.common.MappingField;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/mapping/IMappingProvider.class */
public interface IMappingProvider {
    void clear();

    boolean isEmpty();

    void read(File file) throws IOException;

    MappingMethod getMethodMapping(MappingMethod mappingMethod);

    MappingField getFieldMapping(MappingField mappingField);

    String getClassMapping(String str);

    String getPackageMapping(String str);
}
