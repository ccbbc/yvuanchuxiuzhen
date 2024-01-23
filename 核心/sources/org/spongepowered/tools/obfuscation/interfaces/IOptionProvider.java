package org.spongepowered.tools.obfuscation.interfaces;

import java.util.List;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/interfaces/IOptionProvider.class */
public interface IOptionProvider {
    String getOption(String str);

    String getOption(String str, String str2);

    boolean getOption(String str, boolean z);

    List<String> getOptions(String str);
}
