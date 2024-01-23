package org.spongepowered.asm.mixin.transformer;

import com.google.common.base.Strings;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.launch.MixinInitialisationError;
import org.spongepowered.asm.launch.MixinLaunchPlugin;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.extensibility.IMixinConfig;

/* loaded from: 核心-mc1.12.2-0.0.2.jar:org/spongepowered/asm/mixin/transformer/Config.class */
public class Config {
    private static final Logger logger = LogManager.getLogger(MixinLaunchPlugin.NAME);
    private static final Map<String, Config> allConfigs = new HashMap();
    private final String name;
    private final MixinConfig config;

    public Config(MixinConfig config) {
        this.name = config.getName();
        this.config = config;
    }

    public String getName() {
        return this.name;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MixinConfig get() {
        return this.config;
    }

    public boolean isVisited() {
        return this.config.isVisited();
    }

    public IMixinConfig getConfig() {
        return this.config;
    }

    public MixinEnvironment getEnvironment() {
        return this.config.getEnvironment();
    }

    public Config getParent() {
        MixinConfig parent = this.config.getParent();
        if (parent != null) {
            return parent.getHandle();
        }
        return null;
    }

    public String toString() {
        return this.config.toString();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Config) && this.name.equals(((Config) obj).name);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    @Deprecated
    public static Config create(String configFile, MixinEnvironment outer) {
        Config config = allConfigs.get(configFile);
        if (config != null) {
            return config;
        }
        try {
            Config config2 = MixinConfig.create(configFile, outer);
            if (config2 != null) {
                allConfigs.put(config2.getName(), config2);
            }
            if (config2 == null) {
                return null;
            }
            String parent = config2.get().getParentName();
            if (!Strings.isNullOrEmpty(parent)) {
                try {
                    Config parentConfig = create(parent, outer);
                    if (parentConfig != null) {
                        if (!config2.get().assignParent(parentConfig)) {
                            config2 = null;
                        }
                    }
                    if (parentConfig == null) {
                        logger.error("Error encountered initialising mixin config {0}: The parent {1} could not be read.", new Object[]{configFile, parent});
                    }
                } catch (Throwable th) {
                    throw new MixinInitialisationError("Error initialising parent mixin config " + parent + " of " + configFile, th);
                }
            }
            return config2;
        } catch (Exception ex) {
            throw new MixinInitialisationError("Error initialising mixin config " + configFile, ex);
        }
    }

    public static Config create(String configFile) {
        return MixinConfig.create(configFile, MixinEnvironment.getDefaultEnvironment());
    }
}
