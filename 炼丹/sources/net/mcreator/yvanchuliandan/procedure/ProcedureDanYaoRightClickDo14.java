package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.potion.PotionDanYao14Buff;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanYaoRightClickDo14.class */
public class ProcedureDanYaoRightClickDo14 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanYaoRightClickDo14(ElementsYvanchuliandanMod instance) {
        super(instance, 320);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoRightClickDo14$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        entityLivingBase.getEntityData().func_74778_a("丹药名暂存", "danyao14");
        if (entityLivingBase instanceof EntityLivingBase) {
            entityLivingBase.func_70690_d(new PotionEffect(PotionDanYao14Buff.potion, 3600, 0, false, true));
        }
        if (entityLivingBase instanceof EntityPlayer) {
            Scoreboard _sc = ((EntityPlayer) entityLivingBase).func_96123_co();
            ScoreObjective _so = _sc.func_96518_b(entityLivingBase.getEntityData().func_74779_i("丹药名暂存"));
            if (_so == null) {
                _so = _sc.func_96535_a(entityLivingBase.getEntityData().func_74779_i("丹药名暂存"), ScoreCriteria.field_96641_b);
            }
            Score _scr = _sc.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so);
            _scr.func_96647_c(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoRightClickDo14.1
                public int getScore(String score) {
                    Scoreboard _sc2;
                    ScoreObjective _so2;
                    if ((entityLivingBase instanceof EntityPlayer) && (_so2 = (_sc2 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr2 = _sc2.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so2);
                        return _scr2.func_96652_c();
                    }
                    return 0;
                }
            }.getScore(entityLivingBase.getEntityData().func_74779_i("丹药名暂存")) + 1);
        }
    }
}
