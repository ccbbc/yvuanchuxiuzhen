package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureSanXianBuffUpdate.class */
public class ProcedureSanXianBuffUpdate extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSanXianBuffUpdate(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 563);
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSanXianBuffUpdate$1] */
    /* JADX WARN: Type inference failed for: r3v9, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSanXianBuffUpdate$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        double TuPoGaiLvAdd = 0.0d;
        double DefenseAdd = 0.0d;
        if (entityPlayer.getEntityData().func_74767_n("境界提升属性更新")) {
            entityPlayer.getEntityData().func_74780_a("SanXianLingBuff", 60.0d);
            entityPlayer.getEntityData().func_74780_a("SxlLayerNum", 0.0d);
        } else if (entityPlayer.func_70089_S()) {
            if (entityPlayer.getEntityData().func_74769_h("SanXianLingBuff") <= 0.0d) {
                if (entityPlayer.getEntityData().func_74769_h("JingJieNum") > 0.0d) {
                    if (entityPlayer.getEntityData().func_74769_h("SanXianLingLevel") == 1.0d) {
                        TuPoGaiLvAdd = 0.01d;
                        DefenseAdd = 0.03d;
                    } else if (entityPlayer.getEntityData().func_74769_h("SanXianLingLevel") == 2.0d) {
                        TuPoGaiLvAdd = 0.02d;
                        DefenseAdd = 0.05d;
                    } else if (entityPlayer.getEntityData().func_74769_h("SanXianLingLevel") == 3.0d) {
                        TuPoGaiLvAdd = 0.03d;
                        DefenseAdd = 0.1d;
                    } else if (entityPlayer.getEntityData().func_74769_h("SanXianLingLevel") == 4.0d) {
                        TuPoGaiLvAdd = 0.04d;
                        DefenseAdd = 0.15d;
                    } else if (entityPlayer.getEntityData().func_74769_h("SanXianLingLevel") == 5.0d) {
                        TuPoGaiLvAdd = 0.05d;
                        DefenseAdd = 0.2d;
                    }
                    if (entityPlayer.getEntityData().func_74769_h("LayerNum") != entityPlayer.getEntityData().func_74769_h("SxlLayerNum")) {
                        entityPlayer.getEntityData().func_74780_a("境界突破附加概率", entityPlayer.getEntityData().func_74769_h("境界突破附加概率") + TuPoGaiLvAdd);
                        if (entityPlayer instanceof EntityPlayer) {
                            Scoreboard _sc = entityPlayer.func_96123_co();
                            ScoreObjective _so = _sc.func_96518_b("SxlDefense");
                            if (_so == null) {
                                _so = _sc.func_96535_a("SxlDefense", ScoreCriteria.field_96641_b);
                            }
                            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                            _scr.func_96647_c((int) (entityPlayer.getEntityData().func_74769_h("Defense") - entityPlayer.getEntityData().func_74769_h("DefenseTemp2")));
                        }
                        entityPlayer.getEntityData().func_74780_a("Defense", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSanXianBuffUpdate.1
                            public int getScore(String score) {
                                Scoreboard _sc2;
                                ScoreObjective _so2;
                                if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                                    Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                                    return _scr2.func_96652_c();
                                }
                                return 0;
                            }
                        }.getScore("SxlDefense"));
                        entityPlayer.getEntityData().func_74780_a("DefenseTemp2", entityPlayer.getEntityData().func_74769_h("Defense") * DefenseAdd);
                        entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") + new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSanXianBuffUpdate.2
                            int convert(String s) {
                                try {
                                    return Integer.parseInt(s.trim());
                                } catch (Exception e) {
                                    return 0;
                                }
                            }
                        }.convert(new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("DefenseTemp2"))));
                        entityPlayer.getEntityData().func_74780_a("SxlLayerNum", entityPlayer.getEntityData().func_74769_h("LayerNum"));
                    }
                }
                entityPlayer.getEntityData().func_74780_a("SanXianLingBuff", 60.0d);
            }
            entityPlayer.getEntityData().func_74780_a("SanXianLingBuff", entityPlayer.getEntityData().func_74769_h("SanXianLingBuff") - 1.0d);
        }
    }
}
