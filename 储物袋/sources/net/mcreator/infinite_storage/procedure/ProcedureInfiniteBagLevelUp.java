package net.mcreator.infinite_storage.procedure;

import java.text.DecimalFormat;
import java.util.Map;
import net.mcreator.infinite_storage.Config;
import net.mcreator.infinite_storage.ElementsInfiniteStorageMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

@ElementsInfiniteStorageMod.ModElement.Tag
/* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/procedure/ProcedureInfiniteBagLevelUp.class */
public class ProcedureInfiniteBagLevelUp extends ElementsInfiniteStorageMod.ModElement {
    public ProcedureInfiniteBagLevelUp(ElementsInfiniteStorageMod instance) {
        super(instance, 31);
    }

    /* JADX WARN: Type inference failed for: r1v33, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagLevelUp$3] */
    /* JADX WARN: Type inference failed for: r1v54, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagLevelUp$1] */
    /* JADX WARN: Type inference failed for: r2v36, types: [net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagLevelUp$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        entityPlayer.getEntityData().func_74780_a("LevelXpTemp", entityPlayer.getEntityData().func_74769_h("ShenShi"));
        entityPlayer.getEntityData().func_74757_a("doubleOn", Config.doubleOn);
        entityPlayer.getEntityData().func_74780_a("needLevel", 500.0d);
        entityPlayer.getEntityData().func_74780_a("doubleBase", Config.doubleBase);
        if (!entityPlayer.getEntityData().func_74767_n("doubleOn")) {
            if (entityPlayer.getEntityData().func_74769_h("LevelXpTemp") >= entityPlayer.getEntityData().func_74769_h("needLevel")) {
                if (entityPlayer instanceof EntityPlayer) {
                    Scoreboard _sc = entityPlayer.func_96123_co();
                    ScoreObjective _so = _sc.func_96518_b("InfiniteBagLv");
                    if (_so == null) {
                        _so = _sc.func_96535_a("InfiniteBagLv", ScoreCriteria.field_96641_b);
                    }
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    _scr.func_96647_c(new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagLevelUp.1
                        public int getScore(String score) {
                            Scoreboard _sc2;
                            ScoreObjective _so2;
                            if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                                Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                                return _scr2.func_96652_c();
                            }
                            return 0;
                        }
                    }.getScore("InfiniteBagLv") + 1);
                }
                entityPlayer.getEntityData().func_74780_a("InfiniteBagLevel", new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagLevelUp.2
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("1").format(entityPlayer.getEntityData().func_74769_h("LevelXpTemp") / 500.0d)));
                entityPlayer.getEntityData().func_74780_a("InfiniteBagPageAdd", entityPlayer.getEntityData().func_74769_h("InfiniteBagLevel"));
                entityPlayer.getEntityData().func_74778_a("InfiniteBagTip", "§2§l升级成功");
            } else if (entityPlayer.getEntityData().func_74769_h("LevelXpTemp") < entityPlayer.getEntityData().func_74769_h("needLevel")) {
                entityPlayer.getEntityData().func_74778_a("InfiniteBagTip", "§4§l神识不足");
            }
        } else if (entityPlayer.getEntityData().func_74767_n("doubleOn")) {
            if (entityPlayer.getEntityData().func_74769_h("LevelXpTemp") >= entityPlayer.getEntityData().func_74769_h("needLevel") * entityPlayer.getEntityData().func_74769_h("doubleBase")) {
                if (entityPlayer instanceof EntityPlayer) {
                    Scoreboard _sc2 = entityPlayer.func_96123_co();
                    ScoreObjective _so2 = _sc2.func_96518_b("InfiniteBagLv");
                    if (_so2 == null) {
                        _so2 = _sc2.func_96535_a("InfiniteBagLv", ScoreCriteria.field_96641_b);
                    }
                    Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                    _scr2.func_96647_c(new Object() { // from class: net.mcreator.infinite_storage.procedure.ProcedureInfiniteBagLevelUp.3
                        public int getScore(String score) {
                            Scoreboard _sc3;
                            ScoreObjective _so3;
                            if ((entityPlayer instanceof EntityPlayer) && (_so3 = (_sc3 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                                Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
                                return _scr3.func_96652_c();
                            }
                            return 0;
                        }
                    }.getScore("InfiniteBagLv") + 1);
                }
                entityPlayer.getEntityData().func_74780_a("InfiniteBagLevel", entityPlayer.getEntityData().func_74769_h("InfiniteBagLevel") + 1.0d);
                entityPlayer.getEntityData().func_74780_a("InfiniteBagPageAdd", entityPlayer.getEntityData().func_74769_h("InfiniteBagLevel"));
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.func_82242_a(-((int) (entityPlayer.getEntityData().func_74769_h("needLevel") * entityPlayer.getEntityData().func_74769_h("doubleBase"))));
                }
                entityPlayer.getEntityData().func_74778_a("InfiniteBagTip", "§2§l升级成功");
            } else if (entityPlayer.getEntityData().func_74769_h("LevelXpTemp") < entityPlayer.getEntityData().func_74769_h("needLevel") * entityPlayer.getEntityData().func_74769_h("doubleBase")) {
                entityPlayer.getEntityData().func_74778_a("InfiniteBagTip", "§4§l神识不足");
            }
        }
    }
}
