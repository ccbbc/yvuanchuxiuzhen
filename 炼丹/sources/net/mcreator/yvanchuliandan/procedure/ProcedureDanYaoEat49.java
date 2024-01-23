package net.mcreator.yvanchuliandan.procedure;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanYaoEat49.class */
public class ProcedureDanYaoEat49 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanYaoEat49(ElementsYvanchuliandanMod instance) {
        super(instance, 393);
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoEat49$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        entityPlayer.getEntityData().func_74780_a("永久增加丹药暂存", 480.0d);
        entityPlayer.getEntityData().func_74778_a("永久增加丹药名暂存", "danyao49");
        if (ProcedureShuXingWuXiao.executeProcedure(ImmutableMap.of("entity", entityPlayer))) {
            entityPlayer.getEntityData().func_74780_a("PowerMax", entityPlayer.getEntityData().func_74769_h("PowerMax") + entityPlayer.getEntityData().func_74769_h("永久增加丹药暂存"));
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc = entityPlayer.func_96123_co();
                ScoreObjective _so = _sc.func_96518_b(entityPlayer.getEntityData().func_74779_i("永久增加丹药名暂存"));
                if (_so == null) {
                    _so = _sc.func_96535_a(entityPlayer.getEntityData().func_74779_i("永久增加丹药名暂存"), ScoreCriteria.field_96641_b);
                }
                Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                _scr.func_96647_c(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoEat49.1
                    public int getScore(String score) {
                        Scoreboard _sc2;
                        ScoreObjective _so2;
                        if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                            return _scr2.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore(entityPlayer.getEntityData().func_74779_i("永久增加丹药名暂存")) + 1);
            }
        }
    }
}
