package org.spongepowered.tools.obfuscation.service;

import java.util.Collection;
import java.util.Set;
import org.spongepowered.tools.obfuscation.interfaces.IMixinAnnotationProcessor;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/service/IObfuscationService.class */
public interface IObfuscationService {
    Set<String> getSupportedOptions();

    Collection<ObfuscationTypeDescriptor> getObfuscationTypes(IMixinAnnotationProcessor iMixinAnnotationProcessor);
}
