package net.mcreator.lianqisanqiannian.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/procedure/ProcedureLqsqnDo.class */
public class ProcedureLqsqnDo extends ElementsLianqisanqiannianMod.ModElement {
    public ProcedureLqsqnDo(ElementsLianqisanqiannianMod instance) {
        super(instance, 41);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureLqsqnDo$3] */
    /* JADX WARN: Type inference failed for: r0v5, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureLqsqnDo$1] */
    /* JADX WARN: Type inference failed for: r1v27, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureLqsqnDo$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureLqsqnDo.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("lqsqn") > 0) {
            entityPlayer.getEntityData().func_74780_a("lqsqnTime", entityPlayer.getEntityData().func_74769_h("lqsqnTime") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("lqsqnTime") >= 3.0d) {
                entityPlayer.getEntityData().func_74780_a("lqsqnTime", 0.0d);
                Map<String, Object> $_dependencies = new HashMap<>();
                $_dependencies.put("entity", entityPlayer);
                ProcedureJingJieTuPo.executeProcedure($_dependencies);
                Map<String, Object> $_dependencies2 = new HashMap<>();
                $_dependencies2.put("entity", entityPlayer);
                ProcedureGongFaAdd.executeProcedure($_dependencies2);
                if (entityPlayer instanceof EntityPlayer) {
                    Scoreboard _sc = entityPlayer.func_96123_co();
                    ScoreObjective _so = _sc.func_96518_b("lqsqn");
                    if (_so == null) {
                        _so = _sc.func_96535_a("lqsqn", ScoreCriteria.field_96641_b);
                    }
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    _scr.func_96647_c(new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureLqsqnDo.2
                        public int getScore(String score) {
                            Scoreboard _sc2;
                            ScoreObjective _so2;
                            if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                                Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                                return _scr2.func_96652_c();
                            }
                            return 0;
                        }
                    }.getScore("lqsqn") - 1);
                }
            }
            if (new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureLqsqnDo.3
                public int getScore(String score) {
                    Scoreboard _sc2;
                    ScoreObjective _so2;
                    if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                        return _scr2.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("lqsqn") <= 0) {
                entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("PowerMax"));
                if (entityPlayer instanceof EntityLivingBase) {
                    ((EntityLivingBase) entityPlayer).func_70691_i(entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_110138_aP() : -1.0f);
                }
            }
        }
    }
}
