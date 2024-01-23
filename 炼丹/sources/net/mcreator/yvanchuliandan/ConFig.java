package net.mcreator.yvanchuliandan;

import java.io.File;
import net.minecraftforge.common.config.Configuration;

/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/ConFig.class */
public class ConFig {
    public static Configuration config;
    public static boolean StreetsMarkets;

    public static void init(File configFile) {
        if (config == null) {
            config = new Configuration(configFile);
            syncConfig();
        }
    }

    public static void syncConfig() {
        StreetsMarkets = config.getBoolean("StreetsMarkets", "general", true, "此配置决定是否在世界生成坊市结构");
        if (config.hasChanged()) {
            config.save();
        }
    }
}
