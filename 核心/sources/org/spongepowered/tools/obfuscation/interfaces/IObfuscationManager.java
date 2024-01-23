package org.spongepowered.tools.obfuscation.interfaces;

import java.util.List;
import org.spongepowered.tools.obfuscation.ObfuscationEnvironment;
import org.spongepowered.tools.obfuscation.mapping.IMappingConsumer;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/interfaces/IObfuscationManager.class */
public interface IObfuscationManager {
    void init();

    IObfuscationDataProvider getDataProvider();

    IReferenceManager getReferenceManager();

    IMappingConsumer createMappingConsumer();

    List<ObfuscationEnvironment> getEnvironments();

    void writeMappings();

    void writeReferences();
}
