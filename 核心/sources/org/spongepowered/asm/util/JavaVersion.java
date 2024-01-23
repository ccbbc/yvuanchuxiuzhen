package org.spongepowered.asm.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/util/JavaVersion.class */
public abstract class JavaVersion {
    private static double current = 0.0d;

    private JavaVersion() {
    }

    public static double current() {
        if (current == 0.0d) {
            current = resolveCurrentVersion();
        }
        return current;
    }

    private static double resolveCurrentVersion() {
        String version = System.getProperty("java.version");
        Matcher decimalMatcher = Pattern.compile("[0-9]+\\.[0-9]+").matcher(version);
        if (decimalMatcher.find()) {
            return Double.parseDouble(decimalMatcher.group());
        }
        Matcher numberMatcher = Pattern.compile("[0-9]+").matcher(version);
        if (numberMatcher.find()) {
            return Double.parseDouble(numberMatcher.group());
        }
        return 1.6d;
    }
}
