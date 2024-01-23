package net.mcreator.infinite_storage;

import java.io.File;
import net.minecraftforge.common.config.Configuration;

/* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/Config.class */
public class Config {
    public static Configuration config;
    public static boolean bagState;
    public static int needLevel;
    public static boolean doubleOn;
    public static int doubleBase;
    public static int bagWidth;
    public static int bagHeight;
    public static boolean bagTab;

    public static void init(File configFile) {
        if (config == null) {
            config = new Configuration(configFile);
            syncConfig();
        }
    }

    public static void syncConfig() {
        bagState = config.getBoolean("bagState", "general", false, "将随等级提升改为消耗等级提升");
        needLevel = config.getInt("needLevel", "general", 3, 1, 114514, "增加页数所需等级");
        doubleOn = config.getBoolean("doubleOn", "general", false, "是否倍增？");
        doubleBase = config.getInt("doubleBase", "general", 1, 1, 114514, "倍数，倍增不开启不生效");
        bagWidth = config.getInt("bagWidth", "general", 9, 1, 24, "无限空间宽度，单位: 格子，暂不生效");
        bagHeight = config.getInt("bagHeight", "general", 6, 1, 8, "无限空间高度，单位: 格子，暂不生效");
        bagTab = config.getBoolean("bagTab", "general", false, "是否开启物品栏模式，暂不生效");
        if (config.hasChanged()) {
            config.save();
        }
    }
}
