package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.potion.PotionYuanShenChuTiBuff;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureQuKeUse.class */
public class ProcedureQuKeUse extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureQuKeUse(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 406);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeUse$1] */
    /* JADX WARN: Type inference failed for: r2v18, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeUse$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if ((((entityPlayer instanceof EntityPlayer) && entityPlayer.field_71075_bZ.field_75098_d) || entityPlayer.getEntityData().func_74769_h("Power") >= entityPlayer.getEntityData().func_74769_h("PowerMax") * 0.15d) && entityPlayer.getEntityData().func_74769_h("JingJieNum") == 1.0d && ((((EntityLivingBase) entityPlayer).func_70644_a(PotionYuanShenChuTiBuff.potion) || entityPlayer.getEntityData().func_74767_n("YuanShenUp")) && !entityPlayer.getEntityData().func_74767_n("修炼"))) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc = entityPlayer.func_96123_co();
                ScoreObjective _so = _sc.func_96518_b("已重伤");
                if (_so == null) {
                    _so = _sc.func_96535_a("已重伤", ScoreCriteria.field_96641_b);
                }
                Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                _scr.func_96647_c(0);
            }
            entityPlayer.getEntityData().func_74757_a("YuanShenUp", false);
            entityPlayer.getEntityData().func_74780_a("Attack", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeUse.1
                public int getScore(String score) {
                    Scoreboard _sc2;
                    ScoreObjective _so2;
                    if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                        return _scr2.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("Attack"));
            entityPlayer.getEntityData().func_74780_a("AttackTemp", 0.0d);
            entityPlayer.getEntityData().func_74780_a("MagicAttack", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeUse.2
                public int getScore(String score) {
                    Scoreboard _sc2;
                    ScoreObjective _so2;
                    if ((entityPlayer instanceof EntityPlayer) && (_so2 = (_sc2 = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                        return _scr2.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("MagicAttack"));
            entityPlayer.getEntityData().func_74780_a("MagicAttackTemp", 0.0d);
            entityPlayer.getEntityData().func_74780_a("ThunderAttackTemp", 0.0d);
            entityPlayer.getEntityData().func_74780_a("FireAttackTemp", 0.0d);
            entityPlayer.getEntityData().func_74780_a("PoisonAttackTemp", 0.0d);
            entityPlayer.getEntityData().func_74780_a("DefenseTemp", 0.0d);
            entityPlayer.getEntityData().func_74780_a("MagicDefenseTemp", 0.0d);
            entityPlayer.getEntityData().func_74780_a("ThunderDefenseTemp", 0.0d);
            entityPlayer.getEntityData().func_74780_a("FireDefenseTemp", 0.0d);
            entityPlayer.getEntityData().func_74780_a("PoisonDefenseTemp", 0.0d);
            if (entityPlayer instanceof EntityLivingBase) {
                ((EntityLivingBase) entityPlayer).func_70674_bp();
            }
            if ((entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_110143_aJ() : -1.0f) < entityPlayer.getEntityData().func_74769_h("HealthMax") * 0.2d && (entityPlayer instanceof EntityLivingBase)) {
                ((EntityLivingBase) entityPlayer).func_70606_j((float) (entityPlayer.getEntityData().func_74769_h("HealthMax") * 0.2d));
            }
            if (!(entityPlayer instanceof EntityPlayer) || !entityPlayer.field_71075_bZ.field_75098_d) {
                entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - (entityPlayer.getEntityData().func_74769_h("PowerMax") * 0.15d));
            }
            entityPlayer.getEntityData().func_74757_a("TuPoLimit", false);
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc2 = entityPlayer.func_96123_co();
                ScoreObjective _so2 = _sc2.func_96518_b("死前已重伤");
                if (_so2 == null) {
                    _so2 = _sc2.func_96535_a("死前已重伤", ScoreCriteria.field_96641_b);
                }
                Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                _scr2.func_96647_c(0);
            }
            itemstack.func_190918_g(1);
        } else if (entityPlayer.getEntityData().func_74769_h("Power") < entityPlayer.getEntityData().func_74769_h("PowerMax") * 0.15d) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("灵力不足总体的15%，不可使用"), false);
            }
        } else if (entityPlayer.getEntityData().func_74767_n("修炼")) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("修炼时不可使用"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") != 1.0d) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("非炼气不可使用"), false);
            }
        } else if (!entityPlayer.getEntityData().func_74767_n("YuanShenUp") && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("非重伤不可使用"), false);
        }
        entityPlayer.getEntityData().func_74780_a("躯壳清除计时", 0.0d);
    }
}
