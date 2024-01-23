package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureQingShiEat.class */
public class ProcedureQingShiEat extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureQingShiEat(ElementsYvanchuliandanMod instance) {
        super(instance, 729);
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [net.mcreator.yvanchuliandan.procedure.ProcedureQingShiEat$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") + 235.0d);
        if (entityLivingBase instanceof EntityLivingBase) {
            entityLivingBase.func_70691_i(125.0f);
        }
        if (entityLivingBase instanceof EntityPlayer) {
            Scoreboard _sc = ((EntityPlayer) entityLivingBase).func_96123_co();
            ScoreObjective _so = _sc.func_96518_b("NiangJiu21");
            if (_so == null) {
                _so = _sc.func_96535_a("NiangJiu21", ScoreCriteria.field_96641_b);
            }
            Score _scr = _sc.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so);
            _scr.func_96647_c(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureQingShiEat.1
                public int getScore(String score) {
                    Scoreboard _sc2;
                    ScoreObjective _so2;
                    if ((entityLivingBase instanceof EntityPlayer) && (_so2 = (_sc2 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr2 = _sc2.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so2);
                        return _scr2.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("NiangJiu21") + 1);
        }
    }
}
