package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureShanghaiDangMingLingBeiZhiXingShi.class */
public class ProcedureShanghaiDangMingLingBeiZhiXingShi extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShanghaiDangMingLingBeiZhiXingShi(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 348);
    }

    /* JADX WARN: Type inference failed for: r0v46, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$8] */
    /* JADX WARN: Type inference failed for: r0v49, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$11] */
    /* JADX WARN: Type inference failed for: r0v52, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$14] */
    /* JADX WARN: Type inference failed for: r0v55, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$17] */
    /* JADX WARN: Type inference failed for: r0v58, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$20] */
    /* JADX WARN: Type inference failed for: r1v11, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$4] */
    /* JADX WARN: Type inference failed for: r1v13, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$5] */
    /* JADX WARN: Type inference failed for: r1v15, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$6] */
    /* JADX WARN: Type inference failed for: r1v17, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$7] */
    /* JADX WARN: Type inference failed for: r1v5, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$1] */
    /* JADX WARN: Type inference failed for: r1v7, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$2] */
    /* JADX WARN: Type inference failed for: r1v9, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$3] */
    /* JADX WARN: Type inference failed for: r2v12, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$21] */
    /* JADX WARN: Type inference failed for: r2v15, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$18] */
    /* JADX WARN: Type inference failed for: r2v18, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$15] */
    /* JADX WARN: Type inference failed for: r2v21, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$12] */
    /* JADX WARN: Type inference failed for: r2v24, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$9] */
    /* JADX WARN: Type inference failed for: r3v11, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$19] */
    /* JADX WARN: Type inference failed for: r3v14, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$16] */
    /* JADX WARN: Type inference failed for: r3v17, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$13] */
    /* JADX WARN: Type inference failed for: r3v20, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$10] */
    /* JADX WARN: Type inference failed for: r3v8, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi$22] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if ((!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71075_bZ.field_75098_d) && !(entityPlayer instanceof EntityItem) && !entityPlayer.func_145748_c_().func_150260_c().contains("entity.entitybullet") && !entityPlayer.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.1
            public String getText() {
                String param = (String) cmdparams.get("2");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entityPlayer.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.2
            public String getText() {
                String param = (String) cmdparams.get("3");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entityPlayer.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.3
            public String getText() {
                String param = (String) cmdparams.get("4");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entityPlayer.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.4
            public String getText() {
                String param = (String) cmdparams.get("5");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entityPlayer.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.5
            public String getText() {
                String param = (String) cmdparams.get("6");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entityPlayer.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.6
            public String getText() {
                String param = (String) cmdparams.get("7");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entityPlayer.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.7
            public String getText() {
                String param = (String) cmdparams.get("8");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText())) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.8
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("m")) {
                entityPlayer.getEntityData().func_74780_a("BeMagicAttack", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.9
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.10
                    public String getText() {
                        String param = (String) cmdparams.get("1");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()));
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.11
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("t")) {
                entityPlayer.getEntityData().func_74780_a("BeThunderAttack", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.12
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.13
                    public String getText() {
                        String param = (String) cmdparams.get("1");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()));
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.14
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("f")) {
                entityPlayer.getEntityData().func_74780_a("BeFireAttack", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.15
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.16
                    public String getText() {
                        String param = (String) cmdparams.get("1");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()));
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.17
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("p")) {
                entityPlayer.getEntityData().func_74780_a("BePoisonAttack", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.18
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.19
                    public String getText() {
                        String param = (String) cmdparams.get("1");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()));
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.20
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("a")) {
                entityPlayer.func_70097_a(DamageSource.field_76380_i, new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.21
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShanghaiDangMingLingBeiZhiXingShi.22
                    public String getText() {
                        String param = (String) cmdparams.get("1");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()));
            }
        }
    }
}
