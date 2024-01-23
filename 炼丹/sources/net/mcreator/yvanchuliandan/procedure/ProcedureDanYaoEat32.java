package net.mcreator.yvanchuliandan.procedure;

import java.text.DecimalFormat;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanYaoEat32.class */
public class ProcedureDanYaoEat32 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanYaoEat32(ElementsYvanchuliandanMod instance) {
        super(instance, 363);
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoEat32$1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoEat32$2] */
    /* JADX WARN: Type inference failed for: r2v6, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoEat32$3] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        entityPlayer.getEntityData().func_74778_a("恢复丹药nbt暂存", "danyao32");
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc = entityPlayer.func_96123_co();
            ScoreObjective _so = _sc.func_96518_b(entityPlayer.getEntityData().func_74779_i("恢复丹药nbt暂存"));
            if (_so == null) {
                _so = _sc.func_96535_a(entityPlayer.getEntityData().func_74779_i("恢复丹药nbt暂存"), ScoreCriteria.field_96641_b);
            }
            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
            _scr.func_96647_c(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoEat32.1
                public int getScore(String score) {
                    Scoreboard _sc2;
                    ScoreObjective _so2;
                    if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                        return _scr2.func_96652_c();
                    }
                    return 0;
                }
            }.getScore(entityPlayer.getEntityData().func_74779_i("恢复丹药nbt暂存")) + 1);
        }
        entityPlayer.getEntityData().func_74780_a(entityPlayer.getEntityData().func_74779_i("恢复丹药nbt暂存"), new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoEat32.2
            public int getScore(String score) {
                Scoreboard _sc2;
                ScoreObjective _so2;
                if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                    return _scr2.func_96652_c();
                }
                return 0;
            }
        }.getScore(entityPlayer.getEntityData().func_74779_i("恢复丹药nbt暂存")));
        entityPlayer.getEntityData().func_74780_a(entityPlayer.getEntityData().func_74779_i("恢复丹药nbt暂存"), new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoEat32.3
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h(entityPlayer.getEntityData().func_74779_i("恢复丹药nbt暂存")) / 2.0d)));
        entityPlayer.getEntityData().func_74780_a("Power", (240.0d + entityPlayer.getEntityData().func_74769_h("Power")) - entityPlayer.getEntityData().func_74769_h(entityPlayer.getEntityData().func_74779_i("恢复丹药nbt暂存")));
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 3.0d) {
            entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") + (0.05d * entityPlayer.getEntityData().func_74769_h("PowerMax")));
        }
    }
}
