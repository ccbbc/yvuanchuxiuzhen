package org.spongepowered.tools.obfuscation.interfaces;

import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorRemappable;
import org.spongepowered.asm.mixin.refmap.ReferenceMapper;
import org.spongepowered.asm.obfuscation.mapping.common.MappingField;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.tools.obfuscation.ObfuscationData;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/interfaces/IReferenceManager.class */
public interface IReferenceManager {
    void setAllowConflicts(boolean z);

    boolean getAllowConflicts();

    void write();

    ReferenceMapper getMapper();

    void addMethodMapping(String str, String str2, ObfuscationData<MappingMethod> obfuscationData);

    void addMethodMapping(String str, String str2, ITargetSelectorRemappable iTargetSelectorRemappable, ObfuscationData<MappingMethod> obfuscationData);

    void addFieldMapping(String str, String str2, ITargetSelectorRemappable iTargetSelectorRemappable, ObfuscationData<MappingField> obfuscationData);

    void addClassMapping(String str, String str2, ObfuscationData<String> obfuscationData);
}
