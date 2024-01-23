package org.spongepowered.tools.obfuscation.interfaces;

import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorRemappable;
import org.spongepowered.asm.obfuscation.mapping.IMapping;
import org.spongepowered.asm.obfuscation.mapping.common.MappingField;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.tools.obfuscation.ObfuscationData;
import org.spongepowered.tools.obfuscation.mirror.TypeHandle;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/interfaces/IObfuscationDataProvider.class */
public interface IObfuscationDataProvider {
    <T> ObfuscationData<T> getObfEntryRecursive(ITargetSelectorRemappable iTargetSelectorRemappable);

    <T> ObfuscationData<T> getObfEntry(ITargetSelectorRemappable iTargetSelectorRemappable);

    <T> ObfuscationData<T> getObfEntry(IMapping<T> iMapping);

    ObfuscationData<MappingMethod> getObfMethodRecursive(ITargetSelectorRemappable iTargetSelectorRemappable);

    ObfuscationData<MappingMethod> getObfMethod(ITargetSelectorRemappable iTargetSelectorRemappable);

    ObfuscationData<MappingMethod> getRemappedMethod(ITargetSelectorRemappable iTargetSelectorRemappable);

    ObfuscationData<MappingMethod> getObfMethod(MappingMethod mappingMethod);

    ObfuscationData<MappingMethod> getRemappedMethod(MappingMethod mappingMethod);

    ObfuscationData<MappingField> getObfFieldRecursive(ITargetSelectorRemappable iTargetSelectorRemappable);

    ObfuscationData<MappingField> getObfField(ITargetSelectorRemappable iTargetSelectorRemappable);

    ObfuscationData<MappingField> getObfField(MappingField mappingField);

    ObfuscationData<String> getObfClass(TypeHandle typeHandle);

    ObfuscationData<String> getObfClass(String str);
}
