package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureXiaoJingJieNameSet.class */
public class ProcedureXiaoJingJieNameSet extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureXiaoJingJieNameSet(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 275);
    }

    /* JADX WARN: Type inference failed for: r0v101, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureXiaoJingJieNameSet$2] */
    /* JADX WARN: Type inference failed for: r0v135, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureXiaoJingJieNameSet$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("JingJieNum") == 1.0d) {
            entity.getEntityData().func_74780_a("灵力值增加暂存", 160.0d);
            entity.getEntityData().func_74780_a("灵力速度增加暂存", 1.0d);
            if (entity.getEntityData().func_74769_h("LayerNum") == 1.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
                entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") + 50.0d);
                entity.getEntityData().func_74780_a("Attack", entity.getEntityData().func_74769_h("Attack") - 1.0d);
                entity.getEntityData().func_74780_a("BaseMax", 180.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 2.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 3.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else {
                entity.getEntityData().func_74780_a("灵力值增加暂存", 0.0d);
                entity.getEntityData().func_74780_a("灵力速度增加暂存", 0.0d);
            }
            if (entity.getEntityData().func_74769_h("XiaoJingJieNumSave") != entity.getEntityData().func_74769_h("XiaoJingJieNum")) {
                entity.getEntityData().func_74780_a("XiaoJingJieNumSave", entity.getEntityData().func_74769_h("XiaoJingJieNum"));
                entity.getEntityData().func_74780_a("Attack", entity.getEntityData().func_74769_h("Attack") + 2.0d);
                entity.getEntityData().func_74780_a("Defense", entity.getEntityData().func_74769_h("Defense") + 1.0d);
                entity.getEntityData().func_74780_a("MagicAttack", entity.getEntityData().func_74769_h("MagicAttack") + 2.0d);
                entity.getEntityData().func_74780_a("MagicDefense", entity.getEntityData().func_74769_h("MagicDefense") + 1.0d);
                entity.getEntityData().func_74780_a("HealthMax", entity.getEntityData().func_74769_h("HealthMax") + 20.0d);
                entity.getEntityData().func_74780_a("ShenShi", entity.getEntityData().func_74769_h("ShenShi") + 9.0d);
            }
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 2.0d) {
            entity.getEntityData().func_74780_a("灵力值增加暂存", 320.0d);
            entity.getEntityData().func_74780_a("灵力速度增加暂存", 2.0d);
            if (entity.getEntityData().func_74769_h("LayerNum") == 1.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
                entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") + 100.0d);
                entity.getEntityData().func_74780_a("BaseMax", 900.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 2.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 3.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 4.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
                entity.getEntityData().func_74780_a("BaseMax", 1380.0d);
            } else {
                entity.getEntityData().func_74780_a("灵力值增加暂存", 0.0d);
                entity.getEntityData().func_74780_a("灵力速度增加暂存", 0.0d);
            }
            if (entity.getEntityData().func_74769_h("XiaoJingJieNumSave") != entity.getEntityData().func_74769_h("XiaoJingJieNum")) {
                entity.getEntityData().func_74780_a("XiaoJingJieNumSave", entity.getEntityData().func_74769_h("XiaoJingJieNum"));
                entity.getEntityData().func_74780_a("Attack", entity.getEntityData().func_74769_h("Attack") + 4.0d);
                entity.getEntityData().func_74780_a("Defense", entity.getEntityData().func_74769_h("Defense") + 2.0d);
                entity.getEntityData().func_74780_a("HealthMax", entity.getEntityData().func_74769_h("HealthMax") + 40.0d);
                entity.getEntityData().func_74780_a("MagicAttack", entity.getEntityData().func_74769_h("MagicAttack") + 4.0d);
                entity.getEntityData().func_74780_a("MagicDefense", entity.getEntityData().func_74769_h("MagicDefense") + 2.0d);
                entity.getEntityData().func_74780_a("ShenShi", entity.getEntityData().func_74769_h("ShenShi") + 18.0d);
            }
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 3.0d) {
            entity.getEntityData().func_74780_a("灵力值增加暂存", 960.0d);
            entity.getEntityData().func_74780_a("灵力速度增加暂存", 5.0d);
            if (entity.getEntityData().func_74769_h("LayerNum") == 1.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
                entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") + 300.0d);
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureXiaoJingJieNameSet.1
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("danyao03") == 1) {
                    entity.getEntityData().func_74780_a("BaseMax", 4050.0d);
                } else {
                    entity.getEntityData().func_74780_a("BaseMax", 4500.0d);
                }
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 2.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 3.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 4.0d) {
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureXiaoJingJieNameSet.2
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("danyao03") == 1) {
                    entity.getEntityData().func_74780_a("BaseMax", 6210.0d);
                } else {
                    entity.getEntityData().func_74780_a("BaseMax", 6900.0d);
                }
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else {
                entity.getEntityData().func_74780_a("灵力值增加暂存", 0.0d);
                entity.getEntityData().func_74780_a("灵力速度增加暂存", 0.0d);
            }
            if (entity.getEntityData().func_74769_h("XiaoJingJieNumSave") != entity.getEntityData().func_74769_h("XiaoJingJieNum")) {
                entity.getEntityData().func_74780_a("XiaoJingJieNumSave", entity.getEntityData().func_74769_h("XiaoJingJieNum"));
                entity.getEntityData().func_74780_a("Attack", entity.getEntityData().func_74769_h("Attack") + 12.0d);
                entity.getEntityData().func_74780_a("Defense", entity.getEntityData().func_74769_h("Defense") + 6.0d);
                entity.getEntityData().func_74780_a("HealthMax", entity.getEntityData().func_74769_h("HealthMax") + 120.0d);
                entity.getEntityData().func_74780_a("MagicAttack", entity.getEntityData().func_74769_h("MagicAttack") + 12.0d);
                entity.getEntityData().func_74780_a("MagicDefense", entity.getEntityData().func_74769_h("MagicDefense") + 6.0d);
                entity.getEntityData().func_74780_a("ShenShi", entity.getEntityData().func_74769_h("ShenShi") + 50.0d);
            }
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 4.0d) {
            entity.getEntityData().func_74780_a("灵力值增加暂存", 2880.0d);
            entity.getEntityData().func_74780_a("灵力速度增加暂存", 16.0d);
            if (entity.getEntityData().func_74769_h("LayerNum") == 1.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
                entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") + 500.0d);
                entity.getEntityData().func_74780_a("BaseMax", 22500.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 2.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 3.0d) {
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else if (entity.getEntityData().func_74769_h("LayerNum") == 4.0d) {
                entity.getEntityData().func_74780_a("BaseMax", 34500.0d);
                entity.getEntityData().func_74780_a("XiaoJingJieNum", entity.getEntityData().func_74769_h("XiaoJingJieNum") + 1.0d);
            } else {
                entity.getEntityData().func_74780_a("灵力值增加暂存", 0.0d);
                entity.getEntityData().func_74780_a("灵力速度增加暂存", 0.0d);
            }
            if (entity.getEntityData().func_74769_h("XiaoJingJieNumSave") != entity.getEntityData().func_74769_h("XiaoJingJieNum")) {
                entity.getEntityData().func_74780_a("XiaoJingJieNumSave", entity.getEntityData().func_74769_h("XiaoJingJieNum"));
                entity.getEntityData().func_74780_a("Attack", entity.getEntityData().func_74769_h("Attack") + 36.0d);
                entity.getEntityData().func_74780_a("Defense", entity.getEntityData().func_74769_h("Defense") + 18.0d);
                entity.getEntityData().func_74780_a("HealthMax", entity.getEntityData().func_74769_h("HealthMax") + 360.0d);
                entity.getEntityData().func_74780_a("MagicAttack", entity.getEntityData().func_74769_h("MagicAttack") + 36.0d);
                entity.getEntityData().func_74780_a("MagicDefense", entity.getEntityData().func_74769_h("MagicDefense") + 18.0d);
                entity.getEntityData().func_74780_a("ShenShi", entity.getEntityData().func_74769_h("ShenShi") + 150.0d);
            }
        }
        $_dependencies.put("entity", entity);
        ProcedureXiaoJingJieNameSet2.executeProcedure($_dependencies);
    }
}
