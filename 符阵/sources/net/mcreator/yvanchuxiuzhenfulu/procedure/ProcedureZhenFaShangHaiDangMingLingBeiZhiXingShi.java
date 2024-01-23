package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.util.DamageSource;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi.class */
public class ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 507);
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi$17] */
    /* JADX WARN: Type inference failed for: r0v54, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi$7] */
    /* JADX WARN: Type inference failed for: r0v57, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi$8] */
    /* JADX WARN: Type inference failed for: r0v60, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi$11] */
    /* JADX WARN: Type inference failed for: r0v63, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi$14] */
    /* JADX WARN: Type inference failed for: r1v12, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi$2] */
    /* JADX WARN: Type inference failed for: r1v14, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi$3] */
    /* JADX WARN: Type inference failed for: r1v16, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi$4] */
    /* JADX WARN: Type inference failed for: r1v18, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi$5] */
    /* JADX WARN: Type inference failed for: r1v20, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi$6] */
    /* JADX WARN: Type inference failed for: r1v7, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi$1] */
    /* JADX WARN: Type inference failed for: r4v0, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi$15] */
    /* JADX WARN: Type inference failed for: r4v3, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi$12] */
    /* JADX WARN: Type inference failed for: r4v6, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi$9] */
    /* JADX WARN: Type inference failed for: r5v1, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi$16] */
    /* JADX WARN: Type inference failed for: r5v4, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi$13] */
    /* JADX WARN: Type inference failed for: r5v7, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi$10] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if (!(entityLivingBase instanceof EntityItem) && !entityLivingBase.func_145748_c_().func_150260_c().contains("entity.entitybullet") && !entityLivingBase.func_145748_c_().func_150260_c().contains("阵法") && !entityLivingBase.func_145748_c_().func_150260_c().contains("execute ")) {
            if (!entityLivingBase.func_189512_bd().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi.1
                public String getText() {
                    String param = (String) cmdparams.get("2");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText()) && !entityLivingBase.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi.2
                public String getText() {
                    String param = (String) cmdparams.get("3");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText()) && !entityLivingBase.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi.3
                public String getText() {
                    String param = (String) cmdparams.get("4");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText()) && !entityLivingBase.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi.4
                public String getText() {
                    String param = (String) cmdparams.get("5");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText()) && !entityLivingBase.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi.5
                public String getText() {
                    String param = (String) cmdparams.get("6");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText()) && !entityLivingBase.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi.6
                public String getText() {
                    String param = (String) cmdparams.get("7");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText())) {
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi.7
                    public String getText() {
                        String param = (String) cmdparams.get("0");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText().equals("a1")) {
                    if (entityLivingBase.getEntityData().func_74769_h("GongFa24") >= 1.0d) {
                        entityLivingBase.func_70097_a(DamageSource.field_76377_j, (float) (entityLivingBase.getEntityData().func_74769_h("Attack") * 1.5d));
                    } else {
                        entityLivingBase.func_70097_a(DamageSource.field_76377_j, (float) (entityLivingBase.getEntityData().func_74769_h("Attack") * 1.3d));
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi.8
                    public String getText() {
                        String param = (String) cmdparams.get("0");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText().equals("a2")) {
                    entityLivingBase.getEntityData().func_74780_a("BeThunderAttack", 280.0d + (1.9d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi.9
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi.10
                        public String getText() {
                            String param = (String) cmdparams.get("1");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText())));
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi.11
                    public String getText() {
                        String param = (String) cmdparams.get("0");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText().equals("a3")) {
                    entityLivingBase.getEntityData().func_74780_a("BeMagicAttack", 900.0d + (1.2d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi.12
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi.13
                        public String getText() {
                            String param = (String) cmdparams.get("1");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText())));
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi.14
                    public String getText() {
                        String param = (String) cmdparams.get("0");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText().equals("a4")) {
                    entityLivingBase.getEntityData().func_74780_a("BeFireAttack", 300.0d + (1.5d * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi.15
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi.16
                        public String getText() {
                            String param = (String) cmdparams.get("1");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText())));
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaShangHaiDangMingLingBeiZhiXingShi.17
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("a4") && (entityLivingBase instanceof EntityLivingBase)) {
                entityLivingBase.func_70691_i(90.0f);
            }
        }
    }
}
