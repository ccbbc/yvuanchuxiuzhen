package org.spongepowered.tools.obfuscation.fg3;

import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import org.spongepowered.tools.obfuscation.ObfuscationEnvironment;
import org.spongepowered.tools.obfuscation.ObfuscationType;
import org.spongepowered.tools.obfuscation.mapping.IMappingProvider;
import org.spongepowered.tools.obfuscation.mapping.IMappingWriter;
import org.spongepowered.tools.obfuscation.mapping.fg3.MappingProviderTSrg;
import org.spongepowered.tools.obfuscation.mapping.fg3.MappingWriterTSrg;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/fg3/ObfuscationEnvironmentFG3.class */
public class ObfuscationEnvironmentFG3 extends ObfuscationEnvironment {
    private MappingProviderTSrg provider;

    protected ObfuscationEnvironmentFG3(ObfuscationType type) {
        super(type);
    }

    @Override // org.spongepowered.tools.obfuscation.ObfuscationEnvironment
    protected IMappingProvider getMappingProvider(Messager messager, Filer filer) {
        MappingProviderTSrg mappingProviderTSrg = new MappingProviderTSrg(messager, filer);
        this.provider = mappingProviderTSrg;
        return mappingProviderTSrg;
    }

    @Override // org.spongepowered.tools.obfuscation.ObfuscationEnvironment
    protected IMappingWriter getMappingWriter(Messager messager, Filer filer) {
        String outputBehaviour = this.ap.getOption(ObfuscationServiceFG3.TSRG_OUTPUT_BEHAVIOUR);
        return new MappingWriterTSrg(messager, filer, this.provider, outputBehaviour != null && outputBehaviour.equalsIgnoreCase("merge"));
    }
}
