package org.spongepowered.tools.obfuscation.mcp;

import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import org.spongepowered.tools.obfuscation.ObfuscationEnvironment;
import org.spongepowered.tools.obfuscation.ObfuscationType;
import org.spongepowered.tools.obfuscation.mapping.IMappingProvider;
import org.spongepowered.tools.obfuscation.mapping.IMappingWriter;
import org.spongepowered.tools.obfuscation.mapping.mcp.MappingProviderSrg;
import org.spongepowered.tools.obfuscation.mapping.mcp.MappingWriterSrg;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/mcp/ObfuscationEnvironmentMCP.class */
public class ObfuscationEnvironmentMCP extends ObfuscationEnvironment {
    protected ObfuscationEnvironmentMCP(ObfuscationType type) {
        super(type);
    }

    @Override // org.spongepowered.tools.obfuscation.ObfuscationEnvironment
    protected IMappingProvider getMappingProvider(Messager messager, Filer filer) {
        return new MappingProviderSrg(messager, filer);
    }

    @Override // org.spongepowered.tools.obfuscation.ObfuscationEnvironment
    protected IMappingWriter getMappingWriter(Messager messager, Filer filer) {
        return new MappingWriterSrg(messager, filer);
    }
}
