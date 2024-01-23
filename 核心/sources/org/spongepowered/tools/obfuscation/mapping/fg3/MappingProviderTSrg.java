package org.spongepowered.tools.obfuscation.mapping.fg3;

import com.google.common.base.Strings;
import com.google.common.collect.BiMap;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import org.spongepowered.asm.obfuscation.mapping.common.MappingField;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.asm.obfuscation.mapping.mcp.MappingFieldSrg;
import org.spongepowered.tools.obfuscation.mapping.common.MappingProvider;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/mapping/fg3/MappingProviderTSrg.class */
public class MappingProviderTSrg extends MappingProvider {
    private List<String> inputMappings;

    public MappingProviderTSrg(Messager messager, Filer filer) {
        super(messager, filer);
        this.inputMappings = new ArrayList();
    }

    @Override // org.spongepowered.tools.obfuscation.mapping.IMappingProvider
    public void read(File input) throws IOException {
        BiMap<String, String> packageMap = this.packageMap;
        BiMap<String, String> classMap = this.classMap;
        BiMap<MappingField, MappingField> fieldMap = this.fieldMap;
        BiMap<MappingMethod, MappingMethod> methodMap = this.methodMap;
        String fromClass = null;
        String toClass = null;
        this.inputMappings.addAll(Files.readLines(input, Charset.defaultCharset()));
        for (String line : this.inputMappings) {
            if (!Strings.isNullOrEmpty(line) && !line.startsWith("#")) {
                String[] parts = line.split(" ");
                if (line.startsWith("\t")) {
                    if (fromClass == null) {
                        throw new IllegalStateException("Error parsing TSRG file, found member declaration with no class: " + line);
                    }
                    parts[0] = parts[0].substring(1);
                    if (parts.length == 2) {
                        fieldMap.forcePut(new MappingField(fromClass, parts[0]), new MappingField(toClass, parts[1]));
                    } else if (parts.length == 3) {
                        methodMap.forcePut(new MappingMethod(fromClass, parts[0], parts[1]), new MappingMethodLazy(toClass, parts[2], parts[1], this));
                    } else {
                        throw new IllegalStateException("Error parsing TSRG file, too many arguments: " + line);
                    }
                } else if (parts.length > 1) {
                    String from = parts[0];
                    if (parts.length == 2) {
                        String to = parts[1];
                        if (from.endsWith("/")) {
                            packageMap.forcePut(from.substring(0, from.length() - 1), to.substring(0, to.length() - 1));
                        } else {
                            classMap.forcePut(from, to);
                            fromClass = from;
                            toClass = to;
                        }
                    } else if (parts.length <= 2) {
                        continue;
                    } else {
                        String to2 = (String) classMap.get(from);
                        if (to2 == null) {
                            throw new IllegalStateException("Error parsing TSRG file, found inline member before class mapping: " + line);
                        }
                        if (parts.length == 3) {
                            fieldMap.forcePut(new MappingField(from, parts[1]), new MappingField(to2, parts[2]));
                        } else if (parts.length == 4) {
                            methodMap.forcePut(new MappingMethod(from, parts[1], parts[2]), new MappingMethodLazy(to2, parts[3], parts[2], this));
                        } else {
                            throw new IllegalStateException("Error parsing TSRG file, too many arguments: " + line);
                        }
                    }
                } else {
                    throw new IllegalStateException("Error parsing TSRG, unrecognised directive: " + line);
                }
            }
        }
    }

    @Override // org.spongepowered.tools.obfuscation.mapping.common.MappingProvider, org.spongepowered.tools.obfuscation.mapping.IMappingProvider
    public MappingField getFieldMapping(MappingField field) {
        if (field.getDesc() != null) {
            field = new MappingFieldSrg(field);
        }
        return (MappingField) this.fieldMap.get(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<String> getInputMappings() {
        return this.inputMappings;
    }
}
