package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.potion.PotionYuanShenChuTiBuff;
import net.mcreator.yvanchuxiuzhen.potion.PotionYuanYingChuQiaoBuff;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureZhongShangJianCe.class */
public class ProcedureZhongShangJianCe extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZhongShangJianCe(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 308);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhongShangJianCe$1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhongShangJianCe$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhongShangJianCe.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityLivingBase instanceof EntityPlayer) && (_so = (_sc = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("死亡") != 0 || new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhongShangJianCe.2
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityLivingBase instanceof EntityPlayer) && (_so = (_sc = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("JingJieNum") < 1 || entityLivingBase.func_70644_a(PotionYuanYingChuQiaoBuff.potion) || entityLivingBase.func_70644_a(PotionYuanShenChuTiBuff.potion) || entityLivingBase.getEntityData().func_74767_n("YuanShenUp") || entityLivingBase.getEntityData().func_74767_n("YuanYingUp")) {
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) <= (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) * 0.1d) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) > 0.0f) {
                $_dependencies.put("entity", entityLivingBase);
                ProcedureGDown.executeProcedure($_dependencies);
            }
        }
    }
}
