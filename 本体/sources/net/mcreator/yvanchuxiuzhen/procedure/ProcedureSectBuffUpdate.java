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
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureSectBuffUpdate.class */
public class ProcedureSectBuffUpdate extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSectBuffUpdate(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 565);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectBuffUpdate$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        double ZhiYeXpAdd = 0.0d;
        double DaZuoAdd = 0.0d;
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectBuffUpdate.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entity instanceof EntityPlayer) && (_so = (_sc = entity.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entity.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("SectJobUn") != 1) {
            if (entity.getEntityData().func_74767_n("境界提升属性更新")) {
                entity.getEntityData().func_74780_a("SectLevelBuff", 60.0d);
                entity.getEntityData().func_74780_a("SectLayerNum", 0.0d);
            } else if (entity.func_70089_S()) {
                if (entity.getEntityData().func_74769_h("SectLevelBuff") <= 0.0d) {
                    if (entity.getEntityData().func_74769_h("JingJieNum") > 0.0d) {
                        if (entity.getEntityData().func_74769_h("SectLevel") == 1.0d) {
                            DaZuoAdd = 0.1d;
                            if (entity.getEntityData().func_74769_h("SectJobLevel") == 6.0d) {
                                ZhiYeXpAdd = 0.1d;
                            }
                        } else if (entity.getEntityData().func_74769_h("SectLevel") == 2.0d) {
                            DaZuoAdd = 0.2d;
                            if (entity.getEntityData().func_74769_h("SectJobLevel") == 6.0d) {
                                ZhiYeXpAdd = 0.2d;
                                entity.getEntityData().func_74780_a("SectAttackNum", 3.0d);
                            } else if (entity.getEntityData().func_74769_h("SectJobLevel") == 4.0d) {
                                entity.getEntityData().func_74780_a("SectAttackNum", 5.0d);
                            } else if (entity.getEntityData().func_74769_h("SectJobLevel") == 3.0d) {
                                ZhiYeXpAdd = 0.2d;
                            } else if (entity.getEntityData().func_74769_h("SectJobLevel") == 2.0d) {
                                entity.getEntityData().func_74780_a("SectAttackNum", 3.0d);
                            }
                        } else if (entity.getEntityData().func_74769_h("SectLevel") == 3.0d) {
                            DaZuoAdd = 0.3d;
                            if (entity.getEntityData().func_74769_h("SectJobLevel") == 6.0d) {
                                ZhiYeXpAdd = 0.3d;
                                entity.getEntityData().func_74780_a("SectAttackNum", 6.0d);
                            } else if (entity.getEntityData().func_74769_h("SectJobLevel") == 5.0d) {
                                ZhiYeXpAdd = 0.3d;
                            } else if (entity.getEntityData().func_74769_h("SectJobLevel") == 4.0d) {
                                entity.getEntityData().func_74780_a("SectAttackNum", 10.0d);
                            } else if (entity.getEntityData().func_74769_h("SectJobLevel") == 3.0d) {
                                ZhiYeXpAdd = 0.3d;
                            } else if (entity.getEntityData().func_74769_h("SectJobLevel") == 2.0d) {
                                entity.getEntityData().func_74780_a("SectAttackNum", 6.0d);
                            }
                        } else if (entity.getEntityData().func_74769_h("SectLevel") == 4.0d) {
                            DaZuoAdd = 0.4d;
                            if (entity.getEntityData().func_74769_h("SectJobLevel") == 6.0d) {
                                ZhiYeXpAdd = 0.4d;
                                entity.getEntityData().func_74780_a("SectAttackNum", 9.0d);
                            } else if (entity.getEntityData().func_74769_h("SectJobLevel") == 5.0d) {
                                ZhiYeXpAdd = 0.4d;
                            } else if (entity.getEntityData().func_74769_h("SectJobLevel") == 4.0d) {
                                entity.getEntityData().func_74780_a("SectAttackNum", 15.0d);
                            } else if (entity.getEntityData().func_74769_h("SectJobLevel") == 3.0d) {
                                ZhiYeXpAdd = 0.4d;
                            } else if (entity.getEntityData().func_74769_h("SectJobLevel") == 2.0d) {
                                entity.getEntityData().func_74780_a("SectAttackNum", 9.0d);
                            }
                        } else if (entity.getEntityData().func_74769_h("SectLevel") == 5.0d) {
                            DaZuoAdd = 0.5d;
                            if (entity.getEntityData().func_74769_h("SectJobLevel") == 6.0d) {
                                ZhiYeXpAdd = 0.5d;
                                entity.getEntityData().func_74780_a("SectAttackNum", 12.0d);
                            } else if (entity.getEntityData().func_74769_h("SectJobLevel") == 5.0d) {
                                ZhiYeXpAdd = 0.5d;
                            } else if (entity.getEntityData().func_74769_h("SectJobLevel") == 4.0d) {
                                entity.getEntityData().func_74780_a("SectAttackNum", 20.0d);
                            } else if (entity.getEntityData().func_74769_h("SectJobLevel") == 3.0d) {
                                ZhiYeXpAdd = 0.5d;
                            } else if (entity.getEntityData().func_74769_h("SectJobLevel") == 2.0d) {
                                entity.getEntityData().func_74780_a("SectAttackNum", 12.0d);
                            }
                        }
                    }
                    entity.getEntityData().func_74780_a("SectLevelBuff", 60.0d);
                    entity.getEntityData().func_74780_a("SectJobXpAdd", ZhiYeXpAdd);
                    entity.getEntityData().func_74780_a("SectGain", DaZuoAdd);
                }
                entity.getEntityData().func_74780_a("SectLevelBuff", entity.getEntityData().func_74769_h("SectLevelBuff") - 1.0d);
            }
        }
    }
}
