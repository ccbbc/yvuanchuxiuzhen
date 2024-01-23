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
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureDanYaoReset.class */
public class ProcedureDanYaoReset extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureDanYaoReset(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 382);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        for (int index0 = 0; index0 < 70; index0++) {
            entityPlayer.getEntityData().func_74780_a("丹药名暂存", entityPlayer.getEntityData().func_74769_h("丹药名暂存") + 1.0d);
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc = entityPlayer.func_96123_co();
                ScoreObjective _so = _sc.func_96518_b("danyao" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("丹药名暂存")));
                if (_so == null) {
                    _so = _sc.func_96535_a("danyao" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("丹药名暂存")), ScoreCriteria.field_96641_b);
                }
                Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                _scr.func_96647_c(0);
            }
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc2 = entityPlayer.func_96123_co();
            ScoreObjective _so2 = _sc2.func_96518_b("紫阴丸计数");
            if (_so2 == null) {
                _so2 = _sc2.func_96535_a("紫阴丸计数", ScoreCriteria.field_96641_b);
            }
            Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
            _scr2.func_96647_c(0);
        }
        entityPlayer.getEntityData().func_74780_a("丹药名暂存", 0.0d);
        for (int index1 = 0; index1 < 9; index1++) {
            entityPlayer.getEntityData().func_74780_a("丹药名暂存", entityPlayer.getEntityData().func_74769_h("丹药名暂存") + 1.0d);
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc3 = entityPlayer.func_96123_co();
                ScoreObjective _so3 = _sc3.func_96518_b("danyao0" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("丹药名暂存")));
                if (_so3 == null) {
                    _so3 = _sc3.func_96535_a("danyao0" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("丹药名暂存")), ScoreCriteria.field_96641_b);
                }
                Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
                _scr3.func_96647_c(0);
            }
        }
    }
}
