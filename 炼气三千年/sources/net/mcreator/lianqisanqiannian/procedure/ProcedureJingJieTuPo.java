package net.mcreator.lianqisanqiannian.procedure;

import java.text.DecimalFormat;
import java.util.Map;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/procedure/ProcedureJingJieTuPo.class */
public class ProcedureJingJieTuPo extends ElementsLianqisanqiannianMod.ModElement {
    public ProcedureJingJieTuPo(ElementsLianqisanqiannianMod instance) {
        super(instance, 22);
    }

    /* JADX WARN: Type inference failed for: r0v289, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo$7] */
    /* JADX WARN: Type inference failed for: r0v87, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo$4] */
    /* JADX WARN: Type inference failed for: r1v122, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo$8] */
    /* JADX WARN: Type inference failed for: r1v75, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo$14] */
    /* JADX WARN: Type inference failed for: r1v90, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo$11] */
    /* JADX WARN: Type inference failed for: r3v113, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo$9] */
    /* JADX WARN: Type inference failed for: r3v155, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo$5] */
    /* JADX WARN: Type inference failed for: r3v35, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo$2] */
    /* JADX WARN: Type inference failed for: r3v57, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo$15] */
    /* JADX WARN: Type inference failed for: r3v78, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo$12] */
    /* JADX WARN: Type inference failed for: r4v20, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo$16] */
    /* JADX WARN: Type inference failed for: r4v31, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo$13] */
    /* JADX WARN: Type inference failed for: r4v45, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo$10] */
    /* JADX WARN: Type inference failed for: r4v59, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo$6] */
    /* JADX WARN: Type inference failed for: r4v8, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo$3] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("入门计时", 0.0d);
        if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
            entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo.1
                public String func_70005_c_() {
                    return "";
                }

                public boolean func_70003_b(int permission, String command) {
                    return true;
                }

                public World func_130014_f_() {
                    return entity.field_70170_p;
                }

                public MinecraftServer func_184102_h() {
                    return entity.field_70170_p.func_73046_m();
                }

                public boolean func_174792_t_() {
                    return false;
                }

                public BlockPos func_180425_c() {
                    return entity.func_180425_c();
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v);
                }

                public Entity func_174793_f() {
                    return entity;
                }
            }, "playsound yvanchuxiuzhen:levelup player @s");
        }
        entity.getEntityData().func_74780_a("LayerNum", entity.getEntityData().func_74769_h("LayerNum") + 1.0d);
        entity.getEntityData().func_74778_a("LayerNumTemp", new DecimalFormat("0").format(entity.getEntityData().func_74769_h("LayerNum")));
        entity.getEntityData().func_74778_a("LayerNumTemp1", "");
        entity.getEntityData().func_74778_a("LayerNumTemp2", "");
        entity.getEntityData().func_74778_a("LayerNumTemp3", "");
        entity.getEntityData().func_74778_a("数字暂存", "一二三四五六七八九");
        entity.getEntityData().func_74780_a("文本顺序", 0.0d);
        entity.getEntityData().func_74780_a("层数文本长度", entity.getEntityData().func_74779_i("LayerNumTemp").length());
        for (int index0 = 0; index0 < entity.getEntityData().func_74779_i("LayerNumTemp").length(); index0++) {
            entity.getEntityData().func_74780_a("文本顺序", entity.getEntityData().func_74769_h("文本顺序") + 1.0d);
            entity.getEntityData().func_74778_a("LayerNumTemp1", entity.getEntityData().func_74779_i("LayerNumTemp").substring(new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo.2
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new DecimalFormat("0").format(entity.getEntityData().func_74769_h("文本顺序") - 1.0d)), new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo.3
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new DecimalFormat("0").format(entity.getEntityData().func_74769_h("文本顺序")))));
            if (new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo.4
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(entity.getEntityData().func_74779_i("LayerNumTemp1")) != 0) {
                entity.getEntityData().func_74778_a("LayerNumTemp2", entity.getEntityData().func_74779_i("数字暂存").substring(new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo.5
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(entity.getEntityData().func_74779_i("LayerNumTemp1")) - 1, new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo.6
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(entity.getEntityData().func_74779_i("LayerNumTemp1"))));
            }
            if (entity.getEntityData().func_74769_h("文本顺序") <= entity.getEntityData().func_74769_h("层数文本长度") - 1.0d && new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo.7
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(entity.getEntityData().func_74779_i("LayerNumTemp1")) == 0) {
                entity.getEntityData().func_74778_a("LayerNumTemp2", "零");
            }
            entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("LayerNumTemp3") + "" + entity.getEntityData().func_74779_i("LayerNumTemp2"));
            if (entity.getEntityData().func_74769_h("层数文本长度") == 2.0d) {
                if (entity.getEntityData().func_74779_i("LayerNumTemp3").substring(0, 1).equals("一")) {
                    entity.getEntityData().func_74778_a("LayerNumTemp3", "十");
                } else if (entity.getEntityData().func_74769_h("文本顺序") == 1.0d) {
                    entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("LayerNumTemp3") + "十");
                }
            } else if (entity.getEntityData().func_74769_h("层数文本长度") == 3.0d) {
                if (entity.getEntityData().func_74769_h("文本顺序") == 1.0d) {
                    entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("LayerNumTemp3") + "百");
                } else if (entity.getEntityData().func_74769_h("文本顺序") == 2.0d) {
                    if (!entity.getEntityData().func_74779_i("LayerNumTemp3").substring(2, 3).equals("零")) {
                        entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("LayerNumTemp3") + "十");
                    }
                } else if (entity.getEntityData().func_74769_h("文本顺序") == 3.0d && entity.getEntityData().func_74779_i("LayerNumTemp3").substring(2, 3).equals("零") && entity.getEntityData().func_74779_i("LayerNumTemp3").length() == 3) {
                    entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("LayerNumTemp3").replace("零", ""));
                }
            } else if (entity.getEntityData().func_74769_h("层数文本长度") == 4.0d) {
                if (entity.getEntityData().func_74769_h("文本顺序") == 1.0d) {
                    entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("LayerNumTemp3") + "千");
                } else if (entity.getEntityData().func_74769_h("文本顺序") == 2.0d) {
                    if (!entity.getEntityData().func_74779_i("LayerNumTemp3").substring(2, 3).equals("零")) {
                        entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("LayerNumTemp3") + "百");
                    }
                } else if (entity.getEntityData().func_74769_h("文本顺序") == 3.0d) {
                    if (entity.getEntityData().func_74779_i("LayerNumTemp3").contains("零零")) {
                        entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("LayerNumTemp3").replace("零零", "零"));
                        entity.getEntityData().func_74778_a("LayerNumTemp4", entity.getEntityData().func_74779_i("LayerNumTemp").substring(0, 1));
                        if (entity.getEntityData().func_74769_h("LayerNum") / 1000.0d == new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo.8
                            int convert(String s) {
                                try {
                                    return Integer.parseInt(s.trim());
                                } catch (Exception e) {
                                    return 0;
                                }
                            }
                        }.convert(entity.getEntityData().func_74779_i("LayerNumTemp4"))) {
                            entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("数字暂存").substring(new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo.9
                                int convert(String s) {
                                    try {
                                        return Integer.parseInt(s.trim());
                                    } catch (Exception e) {
                                        return 0;
                                    }
                                }
                            }.convert(entity.getEntityData().func_74779_i("LayerNumTemp4")) - 1, new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo.10
                                int convert(String s) {
                                    try {
                                        return Integer.parseInt(s.trim());
                                    } catch (Exception e) {
                                        return 0;
                                    }
                                }
                            }.convert(entity.getEntityData().func_74779_i("LayerNumTemp4"))));
                            entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("LayerNumTemp3") + "千");
                        }
                    } else if (!entity.getEntityData().func_74779_i("LayerNumTemp3").substring(3, 4).equals("零")) {
                        entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("LayerNumTemp3") + "十");
                    }
                    if (entity.getEntityData().func_74779_i("LayerNumTemp3").substring(4, 5).equals("零") && entity.getEntityData().func_74779_i("LayerNumTemp3").length() == 5) {
                        entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("LayerNumTemp3").replace("零", ""));
                    }
                }
            } else if (entity.getEntityData().func_74769_h("层数文本长度") == 5.0d) {
                if (entity.getEntityData().func_74769_h("文本顺序") == 1.0d) {
                    entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("LayerNumTemp3") + "万");
                } else if (entity.getEntityData().func_74769_h("文本顺序") == 2.0d) {
                    if (!entity.getEntityData().func_74779_i("LayerNumTemp3").substring(2, 3).equals("零")) {
                        entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("LayerNumTemp3") + "千");
                    }
                } else if (entity.getEntityData().func_74769_h("文本顺序") == 3.0d) {
                    if (entity.getEntityData().func_74779_i("LayerNumTemp3").contains("零零")) {
                        entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("LayerNumTemp3").replace("零零", "零"));
                        entity.getEntityData().func_74778_a("LayerNumTemp4", entity.getEntityData().func_74779_i("LayerNumTemp").substring(0, 1));
                        if (entity.getEntityData().func_74769_h("LayerNum") / 1000.0d == new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo.11
                            int convert(String s) {
                                try {
                                    return Integer.parseInt(s.trim());
                                } catch (Exception e) {
                                    return 0;
                                }
                            }
                        }.convert(entity.getEntityData().func_74779_i("LayerNumTemp4"))) {
                            entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("数字暂存").substring(new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo.12
                                int convert(String s) {
                                    try {
                                        return Integer.parseInt(s.trim());
                                    } catch (Exception e) {
                                        return 0;
                                    }
                                }
                            }.convert(entity.getEntityData().func_74779_i("LayerNumTemp4")) - 1, new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo.13
                                int convert(String s) {
                                    try {
                                        return Integer.parseInt(s.trim());
                                    } catch (Exception e) {
                                        return 0;
                                    }
                                }
                            }.convert(entity.getEntityData().func_74779_i("LayerNumTemp4"))));
                            entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("LayerNumTemp3") + "千");
                        }
                    } else if (!entity.getEntityData().func_74779_i("LayerNumTemp3").substring(3, 4).equals("零")) {
                        entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("LayerNumTemp3") + "百");
                    }
                } else if (entity.getEntityData().func_74769_h("文本顺序") == 4.0d) {
                    if (entity.getEntityData().func_74779_i("LayerNumTemp3").contains("零零")) {
                        entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("LayerNumTemp3").replace("零零", "零"));
                        entity.getEntityData().func_74778_a("LayerNumTemp4", entity.getEntityData().func_74779_i("LayerNumTemp").substring(0, 1));
                        if (entity.getEntityData().func_74769_h("LayerNum") / 10000.0d == new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo.14
                            int convert(String s) {
                                try {
                                    return Integer.parseInt(s.trim());
                                } catch (Exception e) {
                                    return 0;
                                }
                            }
                        }.convert(entity.getEntityData().func_74779_i("LayerNumTemp4"))) {
                            entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("数字暂存").substring(new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo.15
                                int convert(String s) {
                                    try {
                                        return Integer.parseInt(s.trim());
                                    } catch (Exception e) {
                                        return 0;
                                    }
                                }
                            }.convert(entity.getEntityData().func_74779_i("LayerNumTemp4")) - 1, new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo.16
                                int convert(String s) {
                                    try {
                                        return Integer.parseInt(s.trim());
                                    } catch (Exception e) {
                                        return 0;
                                    }
                                }
                            }.convert(entity.getEntityData().func_74779_i("LayerNumTemp4"))));
                            entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("LayerNumTemp3") + "万");
                        }
                    } else if (!entity.getEntityData().func_74779_i("LayerNumTemp3").substring(3, 4).equals("零")) {
                        entity.getEntityData().func_74778_a("LayerNumTemp3", entity.getEntityData().func_74779_i("LayerNumTemp3") + "十");
                    }
                }
            }
            entity.getEntityData().func_74778_a("LayerNumTemp1", "");
            entity.getEntityData().func_74778_a("LayerNumTemp2", "");
        }
        entity.getEntityData().func_74778_a("Layer", entity.getEntityData().func_74779_i("LayerNumTemp3") + "层");
        if (entity.getEntityData().func_74769_h("LayerNum") == 1.0d) {
            entity.getEntityData().func_74780_a("BaseMax", 80.0d);
        }
        if (entity.getEntityData().func_74769_h("LayerNum") > 1.0d) {
            entity.getEntityData().func_74780_a("BaseMax", 80.0d + (entity.getEntityData().func_74769_h("LayerNum") * 5.0d));
        }
        entity.getEntityData().func_74780_a("JingJieNum", 1.0d);
        entity.getEntityData().func_74780_a("XiaoJingJieNum", 6.0d);
        entity.getEntityData().func_74778_a("JingJie", "炼气");
        entity.getEntityData().func_74778_a("XiaoJingJie", "无极");
        entity.getEntityData().func_74780_a("Base", 0.0d);
        entity.getEntityData().func_74780_a("Attack", entity.getEntityData().func_74769_h("Attack") + 2.0d);
        entity.getEntityData().func_74780_a("MagicAttack", entity.getEntityData().func_74769_h("MagicAttack") + 2.0d);
        entity.getEntityData().func_74780_a("MagicDefense", entity.getEntityData().func_74769_h("MagicDefense") + 2.0d);
        entity.getEntityData().func_74780_a("Defense", entity.getEntityData().func_74769_h("Defense") + 2.0d);
        entity.getEntityData().func_74780_a("HealthMax", entity.getEntityData().func_74769_h("HealthMax") + 20.0d);
        entity.getEntityData().func_74780_a("PowerMax", entity.getEntityData().func_74769_h("PowerMax") + 40.0d);
        entity.getEntityData().func_74780_a("ShenShi", entity.getEntityData().func_74769_h("ShenShi") + 5.0d);
        if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
            entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJingJieTuPo.17
                public String func_70005_c_() {
                    return "";
                }

                public boolean func_70003_b(int permission, String command) {
                    return true;
                }

                public World func_130014_f_() {
                    return entity.field_70170_p;
                }

                public MinecraftServer func_184102_h() {
                    return entity.field_70170_p.func_73046_m();
                }

                public boolean func_174792_t_() {
                    return false;
                }

                public BlockPos func_180425_c() {
                    return entity.func_180425_c();
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v);
                }

                public Entity func_174793_f() {
                    return entity;
                }
            }, "title @s title {\"text\":\"§6境界突破\"}");
        }
        entity.getEntityData().func_74757_a("境界提升属性更新", true);
        entity.getEntityData().func_74757_a("境界突破血量回复", true);
    }
}
