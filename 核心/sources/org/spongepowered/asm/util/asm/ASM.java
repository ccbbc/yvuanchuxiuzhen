package org.spongepowered.asm.util.asm;

import java.lang.reflect.Field;
import org.objectweb.asm.Opcodes;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/util/asm/ASM.class */
public final class ASM {
    private static int majorVersion = 5;
    private static int minorVersion = 0;
    private static String maxVersion = "FALLBACK";
    public static final int API_VERSION = detectVersion();

    private ASM() {
    }

    public static int getApiVersionMajor() {
        return majorVersion;
    }

    public static int getApiVersionMinor() {
        return minorVersion;
    }

    public static String getApiVersionString() {
        return String.format("ASM %d.%d (%s)", Integer.valueOf(majorVersion), Integer.valueOf(minorVersion), maxVersion);
    }

    private static int detectVersion() {
        Field[] declaredFields;
        int apiVersion = 262144;
        for (Field field : Opcodes.class.getDeclaredFields()) {
            if (field.getType() == Integer.TYPE && field.getName().startsWith("ASM")) {
                try {
                    int version = field.getInt(null);
                    int minor = (version >> 8) & 255;
                    int major = (version >> 16) & 255;
                    boolean experimental = ((version >> 24) & 255) != 0;
                    if (major >= majorVersion) {
                        maxVersion = field.getName();
                        if (!experimental) {
                            apiVersion = version;
                            majorVersion = major;
                            minorVersion = minor;
                        }
                    }
                } catch (ReflectiveOperationException ex) {
                    throw new Error(ex);
                }
            }
        }
        return apiVersion;
    }
}
