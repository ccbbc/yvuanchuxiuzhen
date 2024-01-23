package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureXiaoJingJieNameSet3.class */
public class ProcedureXiaoJingJieNameSet3 extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureXiaoJingJieNameSet3(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 277);
    }

    /* JADX WARN: Type inference failed for: r0v153, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureXiaoJingJieNameSet3$4] */
    /* JADX WARN: Type inference failed for: r0v163, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureXiaoJingJieNameSet3$6] */
    /* JADX WARN: Type inference failed for: r1v92, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureXiaoJingJieNameSet3$7] */
    /* JADX WARN: Type inference failed for: r2v90, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureXiaoJingJieNameSet3$3] */
    /* JADX WARN: Type inference failed for: r3v40, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureXiaoJingJieNameSet3$1] */
    /* JADX WARN: Type inference failed for: r3v44, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureXiaoJingJieNameSet3$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 9.0d) {
            entityPlayer.getEntityData().func_74780_a("灵力值增加暂存", 2764800.0d);
            entityPlayer.getEntityData().func_74780_a("灵力速度增加暂存", 15360.0d);
            if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 1.0d) {
                entityPlayer.getEntityData().func_74780_a("ShouYuan", entityPlayer.getEntityData().func_74769_h("ShouYuan") + 20000.0d);
                entityPlayer.getEntityData().func_74780_a("BaseMax", 2621440.0d * entityPlayer.getEntityData().func_74769_h("真元倍率"));
                entityPlayer.getEntityData().func_74780_a("XiaoJingJieNum", entityPlayer.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 10.0d) {
                entityPlayer.getEntityData().func_74780_a("XiaoJingJieNum", entityPlayer.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 20.0d) {
                entityPlayer.getEntityData().func_74780_a("XiaoJingJieNum", entityPlayer.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 29.0d) {
                entityPlayer.getEntityData().func_74780_a("BaseMax", 7864320.0d * entityPlayer.getEntityData().func_74769_h("真元倍率"));
                entityPlayer.getEntityData().func_74780_a("XiaoJingJieNum", entityPlayer.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else {
                entityPlayer.getEntityData().func_74780_a("灵力值增加暂存", 0.0d);
                entityPlayer.getEntityData().func_74780_a("灵力速度增加暂存", 0.0d);
            }
            if (entityPlayer.getEntityData().func_74769_h("XiaoJingJieNumSave") != entityPlayer.getEntityData().func_74769_h("XiaoJingJieNum")) {
                entityPlayer.getEntityData().func_74780_a("XiaoJingJieNumSave", entityPlayer.getEntityData().func_74769_h("XiaoJingJieNum"));
                entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 138240.0d);
                entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") + 138240.0d);
                entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") + 1382400.0d);
                entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 138240.0d);
                entityPlayer.getEntityData().func_74780_a("MagicDefense", entityPlayer.getEntityData().func_74769_h("MagicDefense") + 138240.0d);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 10.0d) {
            entityPlayer.getEntityData().func_74780_a("灵力值增加暂存", 1.3824E7d);
            entityPlayer.getEntityData().func_74780_a("灵力速度增加暂存", 76800.0d);
            if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 1.0d) {
                entityPlayer.getEntityData().func_74780_a("ShouYuan", entityPlayer.getEntityData().func_74769_h("ShouYuan") + 50000.0d);
                entityPlayer.getEntityData().func_74780_a("BaseMax", 1.048576E7d * entityPlayer.getEntityData().func_74769_h("真元倍率"));
                entityPlayer.getEntityData().func_74780_a("XiaoJingJieNum", entityPlayer.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 11.0d) {
                entityPlayer.getEntityData().func_74780_a("XiaoJingJieNum", entityPlayer.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 22.0d) {
                entityPlayer.getEntityData().func_74780_a("XiaoJingJieNum", entityPlayer.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entityPlayer.getEntityData().func_74769_h("LayerNum") == 31.0d) {
                entityPlayer.getEntityData().func_74780_a("BaseMax", 3.145728E7d * entityPlayer.getEntityData().func_74769_h("真元倍率"));
                entityPlayer.getEntityData().func_74780_a("XiaoJingJieNum", entityPlayer.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else {
                entityPlayer.getEntityData().func_74780_a("灵力值增加暂存", 0.0d);
                entityPlayer.getEntityData().func_74780_a("灵力速度增加暂存", 0.0d);
            }
            if (entityPlayer.getEntityData().func_74769_h("XiaoJingJieNumSave") != entityPlayer.getEntityData().func_74769_h("XiaoJingJieNum")) {
                entityPlayer.getEntityData().func_74780_a("XiaoJingJieNumSave", entityPlayer.getEntityData().func_74769_h("XiaoJingJieNum"));
                entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 691200.0d);
                entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") + 691200.0d);
                entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") + 6912000.0d);
                entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 691200.0d);
                entityPlayer.getEntityData().func_74780_a("MagicDefense", entityPlayer.getEntityData().func_74769_h("MagicDefense") + 691200.0d);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 11.0d) {
            entityPlayer.getEntityData().func_74778_a("XiaoJingJie", "无上");
            entityPlayer.getEntityData().func_74778_a("Layer", "顶层");
            entityPlayer.getEntityData().func_74780_a("XiaoJingJieNum", 5.0d);
            entityPlayer.getEntityData().func_74780_a("ShouYuan", entityPlayer.getEntityData().func_74769_h("ShouYuan") + 100000.0d);
            entityPlayer.getEntityData().func_74780_a("Base", 0.0d);
            entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 3456000.0d);
            entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") + 3456000.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") + 3456000.0d);
            entityPlayer.getEntityData().func_74780_a("MagicDefense", entityPlayer.getEntityData().func_74769_h("MagicDefense") + 3456000.0d);
            entityPlayer.getEntityData().func_74780_a("HealthMax", entityPlayer.getEntityData().func_74769_h("HealthMax") + 3.456E7d);
            entityPlayer.getEntityData().func_74780_a("灵力值增加暂存", 6.912E7d);
            entityPlayer.getEntityData().func_74780_a("灵力速度增加暂存", 384000.0d);
        }
        entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") + new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureXiaoJingJieNameSet3.1
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("灵力值增加暂存") * entityPlayer.getEntityData().func_74769_h("灵力倍率"))));
        entityPlayer.getEntityData().func_74780_a("PowerReply", entityPlayer.getEntityData().func_74769_h("PowerReply") + new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureXiaoJingJieNameSet3.2
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("灵力速度增加暂存") * entityPlayer.getEntityData().func_74769_h("回灵倍率"))));
        entityPlayer.getEntityData().func_74780_a("BaseMax", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureXiaoJingJieNameSet3.3
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("BaseMax"))));
        entityPlayer.getEntityData().func_74778_a("XiaoJingJieUpper", entityPlayer.getEntityData().func_74779_i("XiaoJingJie"));
        if (entityPlayer.getEntityData().func_74769_h("XiaoJingJieNum") == 1.0d) {
            entityPlayer.getEntityData().func_74778_a("XiaoJingJie", "初期");
        } else if (entityPlayer.getEntityData().func_74769_h("XiaoJingJieNum") == 2.0d) {
            entityPlayer.getEntityData().func_74778_a("XiaoJingJie", "中期");
        } else if (entityPlayer.getEntityData().func_74769_h("XiaoJingJieNum") == 3.0d) {
            entityPlayer.getEntityData().func_74778_a("XiaoJingJie", "后期");
        } else if (entityPlayer.getEntityData().func_74769_h("XiaoJingJieNum") == 4.0d) {
            entityPlayer.getEntityData().func_74778_a("XiaoJingJie", "圆满");
        } else if (entityPlayer.getEntityData().func_74769_h("XiaoJingJieNum") == 5.0d) {
            entityPlayer.getEntityData().func_74778_a("XiaoJingJie", "无上");
        } else {
            entityPlayer.getEntityData().func_74778_a("XiaoJingJie", "凡体");
        }
        if (!entityPlayer.getEntityData().func_74779_i("XiaoJingJie").equals(entityPlayer.getEntityData().func_74779_i("XiaoJingJieUpper"))) {
            entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("PowerMax"));
            entityPlayer.getEntityData().func_74757_a("境界突破血量回复", true);
        }
        entityPlayer.getEntityData().func_74780_a("灵力值增加暂存", 0.0d);
        entityPlayer.getEntityData().func_74780_a("灵力速度增加暂存", 0.0d);
        entityPlayer.getEntityData().func_74780_a("境界突破概率", 0.0d);
        entityPlayer.getEntityData().func_74780_a("境界突破附加概率", 0.0d);
        entityPlayer.getEntityData().func_74757_a("境界提升属性更新", true);
        entityPlayer.getEntityData().func_74780_a("Base", 0.0d);
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 2.0d && entityPlayer.getEntityData().func_74769_h("XiaoJingJieNum") == 1.0d) {
            entityPlayer.getEntityData().func_74780_a("LingYuZhi", entityPlayer.getEntityData().func_74769_h("LingYuZhi") + 150.0d);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureXiaoJingJieNameSet3.4
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("JingJieUpdate") == 0 && !((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
            ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureXiaoJingJieNameSet3.5
                public String func_70005_c_() {
                    return "";
                }

                public boolean func_70003_b(int permission, String command) {
                    return true;
                }

                public World func_130014_f_() {
                    return entityPlayer.field_70170_p;
                }

                public MinecraftServer func_184102_h() {
                    return entityPlayer.field_70170_p.func_73046_m();
                }

                public boolean func_174792_t_() {
                    return false;
                }

                public BlockPos func_180425_c() {
                    return entityPlayer.func_180425_c();
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                }

                public Entity func_174793_f() {
                    return entityPlayer;
                }
            }, "title @s title {\"text\":\"§6§l境界突破\"}");
        }
        entityPlayer.getEntityData().func_74757_a("进行概率突破", false);
        entityPlayer.getEntityData().func_74757_a("TuPoLimit", false);
        if (entityPlayer.getEntityData().func_74769_h("LingYuZhi") > 1000.0d) {
            entityPlayer.getEntityData().func_74780_a("LingYuZhi", 1000.0d);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureXiaoJingJieNameSet3.6
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("移动维度") == 1) {
            $_dependencies.put("entity", entityPlayer);
            ProcedureSaveAttribute.executeProcedure($_dependencies);
        }
        if (entityPlayer.getEntityData().func_74779_i("TiZhi").equals("龙吟之体")) {
            entityPlayer.getEntityData().func_74780_a("ShouYuan", entityPlayer.getEntityData().func_74769_h("ShouYuan") - 1.0d);
            entityPlayer.getEntityData().func_74780_a("DaoLing", entityPlayer.getEntityData().func_74769_h("DaoLing") + 1.0d);
        }
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") != new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureXiaoJingJieNameSet3.7
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("成就境界暂存")) {
            if (!((Entity) entityPlayer).field_70170_p.field_72995_K && ((Entity) entityPlayer).field_70170_p.func_73046_m() != null) {
                ((Entity) entityPlayer).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureXiaoJingJieNameSet3.8
                    public String func_70005_c_() {
                        return "";
                    }

                    public boolean func_70003_b(int permission, String command) {
                        return true;
                    }

                    public World func_130014_f_() {
                        return entityPlayer.field_70170_p;
                    }

                    public MinecraftServer func_184102_h() {
                        return entityPlayer.field_70170_p.func_73046_m();
                    }

                    public boolean func_174792_t_() {
                        return false;
                    }

                    public BlockPos func_180425_c() {
                        return entityPlayer.func_180425_c();
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
                    }

                    public Entity func_174793_f() {
                        return entityPlayer;
                    }
                }, "advancement grant @s only yvanchuxiuzhen:l0" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("JingJieNum")));
            }
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc = entityPlayer.func_96123_co();
                ScoreObjective _so = _sc.func_96518_b("成就境界暂存");
                if (_so == null) {
                    _so = _sc.func_96535_a("成就境界暂存", ScoreCriteria.field_96641_b);
                }
                Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                _scr.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("JingJieNum"));
            }
            entityPlayer.getEntityData().func_74757_a("给成就物品", true);
        }
    }
}
