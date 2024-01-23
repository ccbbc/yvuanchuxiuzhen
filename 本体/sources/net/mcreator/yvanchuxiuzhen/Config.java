package net.mcreator.yvanchuxiuzhen;

import java.io.File;
import net.minecraftforge.common.config.Configuration;

/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/Config.class */
public class Config {
    public static Configuration config;
    public static boolean Autoban;
    public static boolean SpecialEdition;
    public static boolean ActiveCapability;
    public static boolean RiskFunction;
    public static int Magnification;

    public static void init(File configFile) {
        if (config == null) {
            config = new Configuration(configFile);
            syncConfig();
        }
    }

    public static void syncConfig() {
        Autoban = config.getBoolean("AutoBan", "general", false, "启用该配置会在服务器玩家寿元尽后自动封禁玩家");
        SpecialEdition = config.getBoolean("SpecialEdition", "general", false, "是否开启随机特别篇,开启后玩家会随机出三千年特别篇模式");
        ActiveCapability = config.getBoolean("ActiveCapability", "general", true, "开启玄宝主动能力");
        RiskFunction = config.getBoolean("RiskFunction", "general", false, "是否开启助手红色按钮使用权限");
        Magnification = config.getInt("Magnification", "general", 0, 0, 990, "设置数值来调整你的世界对于境界提升的难度例子:真元 = (1 + Magnification / 10) * 基础真元");
        if (config.hasChanged()) {
            config.save();
        }
    }
}
