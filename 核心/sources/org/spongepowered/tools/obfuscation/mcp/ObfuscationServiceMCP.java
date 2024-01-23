package org.spongepowered.tools.obfuscation.mcp;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Set;
import org.spongepowered.tools.obfuscation.SupportedOptions;
import org.spongepowered.tools.obfuscation.interfaces.IMixinAnnotationProcessor;
import org.spongepowered.tools.obfuscation.service.IObfuscationService;
import org.spongepowered.tools.obfuscation.service.ObfuscationTypeDescriptor;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/mcp/ObfuscationServiceMCP.class */
public class ObfuscationServiceMCP implements IObfuscationService {
    public static final String SEARGE = "searge";
    public static final String NOTCH = "notch";
    public static final String REOBF_SRG_FILE = "reobfSrgFile";
    public static final String REOBF_EXTRA_SRG_FILES = "reobfSrgFiles";
    public static final String REOBF_NOTCH_FILE = "reobfNotchSrgFile";
    public static final String REOBF_EXTRA_NOTCH_FILES = "reobfNotchSrgFiles";
    public static final String OUT_SRG_SRG_FILE = "outSrgFile";
    public static final String OUT_NOTCH_SRG_FILE = "outNotchSrgFile";

    @Override // org.spongepowered.tools.obfuscation.service.IObfuscationService
    public Set<String> getSupportedOptions() {
        return ImmutableSet.of(REOBF_SRG_FILE, REOBF_EXTRA_SRG_FILES, REOBF_NOTCH_FILE, REOBF_EXTRA_NOTCH_FILES, OUT_SRG_SRG_FILE, OUT_NOTCH_SRG_FILE, new String[0]);
    }

    @Override // org.spongepowered.tools.obfuscation.service.IObfuscationService
    public Collection<ObfuscationTypeDescriptor> getObfuscationTypes(IMixinAnnotationProcessor ap) {
        ImmutableList.Builder<ObfuscationTypeDescriptor> list = ImmutableList.builder();
        if (!ap.getOptions(SupportedOptions.MAPPING_TYPES).contains("tsrg")) {
            list.add(new ObfuscationTypeDescriptor("searge", REOBF_SRG_FILE, REOBF_EXTRA_SRG_FILES, OUT_SRG_SRG_FILE, ObfuscationEnvironmentMCP.class));
        }
        list.add(new ObfuscationTypeDescriptor(NOTCH, REOBF_NOTCH_FILE, REOBF_EXTRA_NOTCH_FILES, OUT_NOTCH_SRG_FILE, ObfuscationEnvironmentMCP.class));
        return list.build();
    }
}
