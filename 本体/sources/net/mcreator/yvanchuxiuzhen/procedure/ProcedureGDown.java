package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.potion.PotionYuanShenChuTiBuff;
import net.mcreator.yvanchuxiuzhen.potion.PotionYuanYingChuQiaoBuff;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureGDown.class */
public class ProcedureGDown extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGDown(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 306);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGDown$4] */
    /* JADX WARN: Type inference failed for: r2v34, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGDown$1] */
    /* JADX WARN: Type inference failed for: r2v37, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGDown$2] */
    /* JADX WARN: Type inference failed for: r2v9, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureGDown$3] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (!entityLivingBase.getEntityData().func_74767_n("YuanShenUp") && !entityLivingBase.getEntityData().func_74767_n("YuanYingUp")) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) > 0.0f) {
                if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") >= 1.0d && entityLivingBase.getEntityData().func_74769_h("JingJieNum") <= 3.0d) {
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) > entityLivingBase.getEntityData().func_74769_h("HealthMax") * 0.2d && (entityLivingBase instanceof EntityLivingBase)) {
                        entityLivingBase.func_70606_j((float) (entityLivingBase.getEntityData().func_74769_h("HealthMax") * 0.2d));
                    }
                    if (!entityLivingBase.getEntityData().func_74767_n("YuanShenUp")) {
                        if (entityLivingBase instanceof EntityPlayer) {
                            Scoreboard _sc = ((EntityPlayer) entityLivingBase).func_96123_co();
                            ScoreObjective _so = _sc.func_96518_b("Attack");
                            if (_so == null) {
                                _so = _sc.func_96535_a("Attack", ScoreCriteria.field_96641_b);
                            }
                            Score _scr = _sc.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so);
                            _scr.func_96647_c((int) entityLivingBase.getEntityData().func_74769_h("Attack"));
                        }
                        entityLivingBase.getEntityData().func_74780_a("Attack", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGDown.1
                            int convert(String s) {
                                try {
                                    return Integer.parseInt(s.trim());
                                } catch (Exception e) {
                                    return 0;
                                }
                            }
                        }.convert(new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("Attack") * 0.2d)));
                        if (entityLivingBase instanceof EntityPlayer) {
                            Scoreboard _sc2 = ((EntityPlayer) entityLivingBase).func_96123_co();
                            ScoreObjective _so2 = _sc2.func_96518_b("MagicAttack");
                            if (_so2 == null) {
                                _so2 = _sc2.func_96535_a("MagicAttack", ScoreCriteria.field_96641_b);
                            }
                            Score _scr2 = _sc2.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so2);
                            _scr2.func_96647_c((int) entityLivingBase.getEntityData().func_74769_h("MagicAttack"));
                        }
                        entityLivingBase.getEntityData().func_74780_a("MagicAttack", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGDown.2
                            int convert(String s) {
                                try {
                                    return Integer.parseInt(s.trim());
                                } catch (Exception e) {
                                    return 0;
                                }
                            }
                        }.convert(new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("MagicAttack") * 0.2d)));
                        entityLivingBase.getEntityData().func_74780_a("Base", entityLivingBase.getEntityData().func_74769_h("Base") * 0.9d);
                        $_dependencies.put("entity", entityLivingBase);
                        ProcedureShouYuanCut2.executeProcedure($_dependencies);
                        entityLivingBase.getEntityData().func_74757_a("YuanShenUp", true);
                    }
                    if (entityLivingBase instanceof EntityLivingBase) {
                        entityLivingBase.func_70690_d(new PotionEffect(PotionYuanShenChuTiBuff.potion, 9999999, 0, false, true));
                    }
                    if (entityLivingBase instanceof EntityPlayer) {
                        Scoreboard _sc3 = ((EntityPlayer) entityLivingBase).func_96123_co();
                        ScoreObjective _so3 = _sc3.func_96518_b("已重伤");
                        if (_so3 == null) {
                            _so3 = _sc3.func_96535_a("已重伤", ScoreCriteria.field_96641_b);
                        }
                        Score _scr3 = _sc3.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so3);
                        _scr3.func_96647_c(1);
                        return;
                    }
                    return;
                } else if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") >= 4.0d) {
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) > entityLivingBase.getEntityData().func_74769_h("HealthMax") * 0.5d && (entityLivingBase instanceof EntityLivingBase)) {
                        entityLivingBase.func_70606_j((float) (entityLivingBase.getEntityData().func_74769_h("HealthMax") * 0.5d));
                    }
                    if (!entityLivingBase.getEntityData().func_74767_n("YuanYingUp")) {
                        if (entityLivingBase instanceof EntityPlayer) {
                            Scoreboard _sc4 = ((EntityPlayer) entityLivingBase).func_96123_co();
                            ScoreObjective _so4 = _sc4.func_96518_b("Attack");
                            if (_so4 == null) {
                                _so4 = _sc4.func_96535_a("Attack", ScoreCriteria.field_96641_b);
                            }
                            Score _scr4 = _sc4.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so4);
                            _scr4.func_96647_c((int) entityLivingBase.getEntityData().func_74769_h("Attack"));
                        }
                        entityLivingBase.getEntityData().func_74780_a("Attack", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGDown.3
                            int convert(String s) {
                                try {
                                    return Integer.parseInt(s.trim());
                                } catch (Exception e) {
                                    return 0;
                                }
                            }
                        }.convert(new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("Attack") * 0.5d)));
                        if (entityLivingBase instanceof EntityPlayer) {
                            Scoreboard _sc5 = ((EntityPlayer) entityLivingBase).func_96123_co();
                            ScoreObjective _so5 = _sc5.func_96518_b("MagicAttack");
                            if (_so5 == null) {
                                _so5 = _sc5.func_96535_a("MagicAttack", ScoreCriteria.field_96641_b);
                            }
                            Score _scr5 = _sc5.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so5);
                            _scr5.func_96647_c((int) entityLivingBase.getEntityData().func_74769_h("MagicAttack"));
                        }
                        entityLivingBase.getEntityData().func_74780_a("MagicAttack", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureGDown.4
                            int convert(String s) {
                                try {
                                    return Integer.parseInt(s.trim());
                                } catch (Exception e) {
                                    return 0;
                                }
                            }
                        }.convert(new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("MagicAttack") * 0.5d)));
                        entityLivingBase.getEntityData().func_74780_a("Base", entityLivingBase.getEntityData().func_74769_h("Base") * 0.75d);
                        $_dependencies.put("entity", entityLivingBase);
                        ProcedureShouYuanCut2.executeProcedure($_dependencies);
                        entityLivingBase.getEntityData().func_74757_a("YuanYingUp", true);
                    }
                    if (entityLivingBase instanceof EntityLivingBase) {
                        entityLivingBase.func_70690_d(new PotionEffect(PotionYuanYingChuQiaoBuff.potion, 9999999, 0, false, true));
                    }
                    if (entityLivingBase instanceof EntityPlayer) {
                        Scoreboard _sc6 = ((EntityPlayer) entityLivingBase).func_96123_co();
                        ScoreObjective _so6 = _sc6.func_96518_b("已重伤");
                        if (_so6 == null) {
                            _so6 = _sc6.func_96535_a("已重伤", ScoreCriteria.field_96641_b);
                        }
                        Score _scr6 = _sc6.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so6);
                        _scr6.func_96647_c(1);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") >= 1.0d && entityLivingBase.getEntityData().func_74769_h("JingJieNum") <= 3.0d) {
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("已元神出体"), false);
            }
        } else if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") >= 4.0d && (entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("已元婴出窍"), false);
        }
    }
}
