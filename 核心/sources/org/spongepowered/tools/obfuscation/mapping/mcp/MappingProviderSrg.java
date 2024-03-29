package org.spongepowered.tools.obfuscation.mapping.mcp;

import com.google.common.base.Strings;
import com.google.common.collect.BiMap;
import com.google.common.io.Files;
import com.google.common.io.LineProcessor;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import org.spongepowered.asm.mixin.throwables.MixinException;
import org.spongepowered.asm.obfuscation.mapping.common.MappingField;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.asm.obfuscation.mapping.mcp.MappingFieldSrg;
import org.spongepowered.tools.obfuscation.mapping.common.MappingProvider;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/mapping/mcp/MappingProviderSrg.class */
public class MappingProviderSrg extends MappingProvider {
    public MappingProviderSrg(Messager messager, Filer filer) {
        super(messager, filer);
    }

    @Override // org.spongepowered.tools.obfuscation.mapping.IMappingProvider
    public void read(final File input) throws IOException {
        final BiMap<String, String> packageMap = this.packageMap;
        final BiMap<String, String> classMap = this.classMap;
        final BiMap<MappingField, MappingField> fieldMap = this.fieldMap;
        final BiMap<MappingMethod, MappingMethod> methodMap = this.methodMap;
        Files.readLines(input, Charset.defaultCharset(), new LineProcessor<String>() { // from class: org.spongepowered.tools.obfuscation.mapping.mcp.MappingProviderSrg.1
            /* renamed from: getResult */
            public String m114getResult() {
                return null;
            }

            public boolean processLine(String line) throws IOException {
                if (Strings.isNullOrEmpty(line) || line.startsWith("#")) {
                    return true;
                }
                String type = line.substring(0, 2);
                String[] args = line.substring(4).split(" ");
                if (type.equals("PK")) {
                    packageMap.forcePut(args[0], args[1]);
                    return true;
                } else if (type.equals("CL")) {
                    classMap.forcePut(args[0], args[1]);
                    return true;
                } else if (type.equals("FD")) {
                    fieldMap.forcePut(new MappingFieldSrg(args[0]).copy(), new MappingFieldSrg(args[1]).copy());
                    return true;
                } else if (type.equals("MD")) {
                    methodMap.forcePut(new MappingMethod(args[0], args[1]), new MappingMethod(args[2], args[3]));
                    return true;
                } else {
                    throw new MixinException("Invalid SRG file: " + input);
                }
            }
        });
    }

    @Override // org.spongepowered.tools.obfuscation.mapping.common.MappingProvider, org.spongepowered.tools.obfuscation.mapping.IMappingProvider
    public MappingField getFieldMapping(MappingField field) {
        if (field.getDesc() != null) {
            field = new MappingFieldSrg(field);
        }
        return (MappingField) this.fieldMap.get(field);
    }
}
