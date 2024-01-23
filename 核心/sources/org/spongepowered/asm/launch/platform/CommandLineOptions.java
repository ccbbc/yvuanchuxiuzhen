package org.spongepowered.asm.launch.platform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/launch/platform/CommandLineOptions.class */
public final class CommandLineOptions {
    private List<String> configs = new ArrayList();

    private CommandLineOptions() {
    }

    public List<String> getConfigs() {
        return Collections.unmodifiableList(this.configs);
    }

    private void parseArgs(List<String> args) {
        boolean captureNext = false;
        for (String arg : args) {
            if (captureNext) {
                this.configs.add(arg);
            }
            captureNext = "--mixin".equals(arg) || "--mixin.config".equals(arg);
        }
    }

    public static CommandLineOptions defaultArgs() {
        return ofArgs(null);
    }

    public static CommandLineOptions ofArgs(List<String> args) {
        String argv;
        CommandLineOptions options = new CommandLineOptions();
        if (args == null && (argv = System.getProperty("sun.java.command")) != null) {
            args = Arrays.asList(argv.split(" "));
        }
        if (args != null) {
            options.parseArgs(args);
        }
        return options;
    }

    public static CommandLineOptions of(List<String> configs) {
        CommandLineOptions options = new CommandLineOptions();
        options.configs.addAll(configs);
        return options;
    }
}
