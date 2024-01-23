package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureJingJieName.class */
public class ProcedureJingJieName extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureJingJieName(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 272);
    }

    /* JADX WARN: Type inference failed for: r0v184, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieName$8] */
    /* JADX WARN: Type inference failed for: r0v196, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieName$11] */
    /* JADX WARN: Type inference failed for: r3v28, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieName$6] */
    /* JADX WARN: Type inference failed for: r3v39, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieName$9] */
    /* JADX WARN: Type inference failed for: r4v13, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieName$7] */
    /* JADX WARN: Type inference failed for: r4v22, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieName$10] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("JingJieNum") < 11.0d) {
            entity.getEntityData().func_74778_a("境界名暂时存储", "炼气筑基结丹元婴化神炼虚合体大乘真仙金仙道祖");
            if (entity.getEntityData().func_74769_h("JingJieNum") == 0.0d) {
                entity.getEntityData().func_74780_a("JingJieNum", entity.getEntityData().func_74769_h("JingJieNum") + 1.0d);
                entity.getEntityData().func_74780_a("LayerNum", entity.getEntityData().func_74769_h("LayerNum") + 1.0d);
                if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                    entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieName.1
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
            } else if (entity.getEntityData().func_74769_h("JingJieNum") == 1.0d) {
                entity.getEntityData().func_74780_a("小境界层数计算暂存", 3.0d);
                if (entity.getEntityData().func_74769_h("LayerNum") >= entity.getEntityData().func_74769_h("小境界层数计算暂存")) {
                    entity.getEntityData().func_74780_a("JingJieNum", entity.getEntityData().func_74769_h("JingJieNum") + 1.0d);
                    entity.getEntityData().func_74780_a("XiaoJingJieNum", 0.0d);
                    entity.getEntityData().func_74780_a("LayerNum", 1.0d);
                    if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                        entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieName.2
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
                } else {
                    entity.getEntityData().func_74780_a("LayerNum", entity.getEntityData().func_74769_h("LayerNum") + 1.0d);
                    if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                        entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieName.3
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
                        }, "playsound yvanchuxiuzhen:littleup player @s");
                    }
                }
            } else if (entity.getEntityData().func_74769_h("JingJieNum") > 1.0d) {
                entity.getEntityData().func_74780_a("小境界层数计算暂存", 4.0d);
                if (entity.getEntityData().func_74769_h("LayerNum") >= entity.getEntityData().func_74769_h("小境界层数计算暂存")) {
                    entity.getEntityData().func_74780_a("JingJieNum", entity.getEntityData().func_74769_h("JingJieNum") + 1.0d);
                    entity.getEntityData().func_74780_a("XiaoJingJieNum", 0.0d);
                    entity.getEntityData().func_74780_a("LayerNum", 1.0d);
                    if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                        entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieName.4
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
                } else {
                    entity.getEntityData().func_74780_a("LayerNum", entity.getEntityData().func_74769_h("LayerNum") + 1.0d);
                    if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                        entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieName.5
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
                        }, "playsound yvanchuxiuzhen:littleup player @s");
                    }
                }
            }
            entity.getEntityData().func_74778_a("JingJie", entity.getEntityData().func_74779_i("境界名暂时存储").substring((int) ((entity.getEntityData().func_74769_h("JingJieNum") * 2.0d) - 2.0d), (int) (entity.getEntityData().func_74769_h("JingJieNum") * 2.0d)));
            entity.getEntityData().func_74778_a("LayerNumTemp", new DecimalFormat("0").format(entity.getEntityData().func_74769_h("LayerNum")));
            entity.getEntityData().func_74778_a("LayerNumTemp1", "");
            entity.getEntityData().func_74778_a("LayerNumTemp2", "");
            entity.getEntityData().func_74778_a("LayerNumTemp3", "");
            entity.getEntityData().func_74778_a("数字暂存", "一二三四五六七八九");
            entity.getEntityData().func_74780_a("文本顺序", 0.0d);
            entity.getEntityData().func_74780_a("层数文本长度", entity.getEntityData().func_74779_i("LayerNumTemp").length());
            for (int index0 = 0; index0 < entity.getEntityData().func_74779_i("LayerNumTemp").length(); index0++) {
                entity.getEntityData().func_74780_a("文本顺序", entity.getEntityData().func_74769_h("文本顺序") + 1.0d);
                entity.getEntityData().func_74778_a("LayerNumTemp1", entity.getEntityData().func_74779_i("LayerNumTemp").substring(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieName.6
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(entity.getEntityData().func_74769_h("文本顺序") - 1.0d)), new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieName.7
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format(entity.getEntityData().func_74769_h("文本顺序")))));
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieName.8
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(entity.getEntityData().func_74779_i("LayerNumTemp1")) != 0) {
                    entity.getEntityData().func_74778_a("LayerNumTemp2", entity.getEntityData().func_74779_i("数字暂存").substring(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieName.9
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(entity.getEntityData().func_74779_i("LayerNumTemp1")) - 1, new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieName.10
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(entity.getEntityData().func_74779_i("LayerNumTemp1")) + 1));
                }
                if (entity.getEntityData().func_74769_h("文本顺序") <= entity.getEntityData().func_74769_h("层数文本长度") - 1.0d && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJingJieName.11
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
                entity.getEntityData().func_74778_a("LayerNumTemp1", "");
                entity.getEntityData().func_74778_a("LayerNumTemp2", "");
            }
            entity.getEntityData().func_74778_a("Layer", "");
            entity.getEntityData().func_74780_a("真元倍率", entity.getEntityData().func_74769_h("LingGenNum"));
            if (entity.getEntityData().func_74779_i("TiZhi").contains("三阳之体")) {
                entity.getEntityData().func_74780_a("真元倍率", 1.5d);
            }
            if (entity.getEntityData().func_74769_h("LingGenNum") == 2.0d) {
                entity.getEntityData().func_74780_a("灵力倍率", 1.2d);
            } else if (entity.getEntityData().func_74769_h("LingGenNum") == 3.0d) {
                entity.getEntityData().func_74780_a("灵力倍率", 1.4d);
            } else if (entity.getEntityData().func_74769_h("LingGenNum") == 4.0d) {
                entity.getEntityData().func_74780_a("灵力倍率", 1.7d);
            } else if (entity.getEntityData().func_74769_h("LingGenNum") == 5.0d) {
                entity.getEntityData().func_74780_a("灵力倍率", 2.0d);
            } else {
                entity.getEntityData().func_74780_a("灵力倍率", 1.0d);
            }
            if (entity.getEntityData().func_74769_h("LingGenNum") == 4.0d || entity.getEntityData().func_74769_h("LingGenNum") == 5.0d) {
                entity.getEntityData().func_74780_a("回灵倍率", 2.0d);
            } else {
                entity.getEntityData().func_74780_a("回灵倍率", 1.0d);
            }
            if (entity.getEntityData().func_74769_h("JingJieNum") == 6.0d && entity.getEntityData().func_74769_h("XiaoJingJieNum") == 1.0d) {
                entity.getEntityData().func_74778_a("TiZhi", "五行之体");
                entity.getEntityData().func_74780_a("体质位置", 9.0d);
            }
            $_dependencies.put("entity", entity);
            ProcedureXiaoJingJieNameSet.executeProcedure($_dependencies);
        }
    }
}
