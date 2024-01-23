package org.spongepowered.tools.obfuscation;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/tools/obfuscation/SuppressedBy.class */
public enum SuppressedBy {
    CONSTRAINTS("constraints"),
    VISIBILITY("visibility"),
    TARGET("target"),
    MAPPING("mapping"),
    OVERWRITE("overwrite"),
    DEFAULT_PACKAGE("default-package"),
    PUBLIC_TARGET("public-target"),
    RAW_TYPES("rawtypes");
    
    private final String token;

    SuppressedBy(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
