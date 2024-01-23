package org.spongepowered.tools.obfuscation.ext;

import java.util.HashSet;
import java.util.Set;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/ext/SpecialPackages.class */
public final class SpecialPackages {
    private static final Set<String> suppressWarningsForPackages = new HashSet();

    static {
        addExcludedPackage("java.");
        addExcludedPackage("javax.");
        addExcludedPackage("sun.");
        addExcludedPackage("com.sun.");
    }

    private SpecialPackages() {
    }

    public static final void addExcludedPackage(String packageName) {
        String internalName = packageName.replace('.', '/');
        if (!internalName.endsWith("/")) {
            internalName = internalName + "/";
        }
        suppressWarningsForPackages.add(internalName);
    }

    public static boolean isExcludedPackage(String internalName) {
        for (String prefix : suppressWarningsForPackages) {
            if (internalName.startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }
}
