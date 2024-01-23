package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanYaoSpoils02DangShiWuBeiChiShi.class */
public class ProcedureDanYaoSpoils02DangShiWuBeiChiShi extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanYaoSpoils02DangShiWuBeiChiShi(ElementsYvanchuliandanMod instance) {
        super(instance, 474);
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoSpoils02DangShiWuBeiChiShi$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        entityPlayer.getEntityData().func_74780_a("ShaQi", entityPlayer.getEntityData().func_74769_h("ShaQi") + 16.0d);
        entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") + 16.0d);
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc = entityPlayer.func_96123_co();
            ScoreObjective _so = _sc.func_96518_b("danyao02");
            if (_so == null) {
                _so = _sc.func_96535_a("danyao02", ScoreCriteria.field_96641_b);
            }
            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
            _scr.func_96647_c(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoSpoils02DangShiWuBeiChiShi.1
                public int getScore(String score) {
                    Scoreboard _sc2;
                    ScoreObjective _so2;
                    if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                        return _scr2.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("danyao02") + 1);
        }
    }
}
