package net.mcreator.yvanchuxiuzhen.procedure;

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
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedurePower.class */
public class ProcedurePower extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedurePower(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 105);
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedurePower$1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedurePower$3] */
    /* JADX WARN: Type inference failed for: r4v2, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedurePower$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        entityPlayer.getEntityData().func_74780_a("灵力恢复延迟", entityPlayer.getEntityData().func_74769_h("灵力恢复延迟") + 1.0d);
        if (entityPlayer.getEntityData().func_74769_h("灵力恢复延迟") >= 20.0d) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc = entityPlayer.func_96123_co();
                ScoreObjective _so = _sc.func_96518_b("Power");
                if (_so == null) {
                    _so = _sc.func_96535_a("Power", ScoreCriteria.field_96641_b);
                }
                Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                _scr.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("Power"));
            }
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc2 = entityPlayer.func_96123_co();
                ScoreObjective _so2 = _sc2.func_96518_b("Power");
                if (_so2 == null) {
                    _so2 = _sc2.func_96535_a("Power", ScoreCriteria.field_96641_b);
                }
                Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                _scr2.func_96647_c((int) (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedurePower.1
                    public int getScore(String score) {
                        Scoreboard _sc3;
                        ScoreObjective _so3;
                        if ((entityPlayer instanceof EntityPlayer) && (_so3 = (_sc3 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
                            return _scr3.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("Power") + entityPlayer.getEntityData().func_74769_h("PowerReply") + (entityPlayer.getEntityData().func_74769_h("PowerReply") * new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedurePower.2
                    public int getScore(String score) {
                        Scoreboard _sc3;
                        ScoreObjective _so3;
                        if ((entityPlayer instanceof EntityPlayer) && (_so3 = (_sc3 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
                            return _scr3.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("PowerReply2") * 0.01d)));
            }
            entityPlayer.getEntityData().func_74780_a("Power", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedurePower.3
                public int getScore(String score) {
                    Scoreboard _sc3;
                    ScoreObjective _so3;
                    if ((entityPlayer instanceof EntityPlayer) && (_so3 = (_sc3 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
                        return _scr3.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("Power"));
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc3 = entityPlayer.func_96123_co();
                ScoreObjective _so3 = _sc3.func_96518_b("PowerReply2");
                if (_so3 == null) {
                    _so3 = _sc3.func_96535_a("PowerReply2", ScoreCriteria.field_96641_b);
                }
                Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
                _scr3.func_96647_c(0);
            }
            if (entityPlayer.getEntityData().func_74769_h("Power") >= entityPlayer.getEntityData().func_74769_h("PowerMax")) {
                entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("PowerMax"));
            }
            entityPlayer.getEntityData().func_74780_a("灵力恢复延迟", 0.0d);
        }
    }
}
