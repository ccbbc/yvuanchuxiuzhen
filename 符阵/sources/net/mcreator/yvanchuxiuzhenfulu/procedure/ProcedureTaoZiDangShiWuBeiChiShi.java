package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureTaoZiDangShiWuBeiChiShi.class */
public class ProcedureTaoZiDangShiWuBeiChiShi extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureTaoZiDangShiWuBeiChiShi(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 483);
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureTaoZiDangShiWuBeiChiShi$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase instanceof EntityLivingBase) {
            entityLivingBase.func_70691_i(10.0f);
        }
        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") + 20.0d);
        if (entityLivingBase instanceof EntityPlayer) {
            Scoreboard _sc = ((EntityPlayer) entityLivingBase).func_96123_co();
            ScoreObjective _so = _sc.func_96518_b("NiangJiu22");
            if (_so == null) {
                _so = _sc.func_96535_a("NiangJiu22", ScoreCriteria.field_96641_b);
            }
            Score _scr = _sc.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so);
            _scr.func_96647_c(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureTaoZiDangShiWuBeiChiShi.1
                public int getScore(String score) {
                    Scoreboard _sc2;
                    ScoreObjective _so2;
                    if ((entityLivingBase instanceof EntityPlayer) && (_so2 = (_sc2 = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr2 = _sc2.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so2);
                        return _scr2.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("NiangJiu22") + 1);
        }
    }
}
