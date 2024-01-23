package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureShenShiCommand.class */
public class ProcedureShenShiCommand extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShenShiCommand(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 568);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShenShiCommand$1] */
    /* JADX WARN: Type inference failed for: r0v19, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShenShiCommand$2] */
    /* JADX WARN: Type inference failed for: r1v11, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShenShiCommand$3] */
    /* JADX WARN: Type inference failed for: r2v1, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShenShiCommand$9] */
    /* JADX WARN: Type inference failed for: r2v10, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShenShiCommand$5] */
    /* JADX WARN: Type inference failed for: r2v8, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShenShiCommand$4] */
    /* JADX WARN: Type inference failed for: r3v1, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShenShiCommand$10] */
    /* JADX WARN: Type inference failed for: r3v9, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShenShiCommand$6] */
    /* JADX WARN: Type inference failed for: r5v4, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShenShiCommand$7] */
    /* JADX WARN: Type inference failed for: r6v2, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureShenShiCommand$8] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShenShiCommand.1
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals("shenshi")) {
            if (entityPlayer instanceof EntityPlayer) {
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShenShiCommand.2
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("ShenShiNum") >= 1 && entityPlayer.getEntityData().func_74769_h("ShenShi") < new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShenShiCommand.3
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShenShiCommand.4
                    public String getText() {
                        String param = (String) cmdparams.get("1");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText())) {
                    entityPlayer.getEntityData().func_74780_a("BeMagicAttack", (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShenShiCommand.5
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShenShiCommand.6
                        public String getText() {
                            String param = (String) cmdparams.get("1");
                            if (param != null) {
                                return param;
                            }
                            return "";
                        }
                    }.getText()) - entityPlayer.getEntityData().func_74769_h("ShenShi")) + entityPlayer.getEntityData().func_74769_h("MagicDefense"));
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("受到来自强者神识的" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShenShiCommand.7
                            int convert(String s) {
                                try {
                                    return Integer.parseInt(s.trim());
                                } catch (Exception e) {
                                    return 0;
                                }
                            }
                        }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShenShiCommand.8
                            public String getText() {
                                String param = (String) cmdparams.get("1");
                                if (param != null) {
                                    return param;
                                }
                                return "";
                            }
                        }.getText()) - entityPlayer.getEntityData().func_74769_h("ShenShi")) + "点伤害"), false);
                    }
                    if (entityPlayer instanceof EntityLivingBase) {
                        ((EntityLivingBase) entityPlayer).func_70690_d(new PotionEffect(MobEffects.field_76421_d, 60, 1));
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        Scoreboard _sc = entityPlayer.func_96123_co();
                        ScoreObjective _so = _sc.func_96518_b("ShenShiNum");
                        if (_so == null) {
                            _so = _sc.func_96535_a("ShenShiNum", ScoreCriteria.field_96641_b);
                        }
                        Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                        _scr.func_96647_c(0);
                    }
                }
            } else if (!(entityPlayer instanceof EntityItem)) {
                entityPlayer.getEntityData().func_74780_a("BeMagicAttack", (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShenShiCommand.9
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureShenShiCommand.10
                    public String getText() {
                        String param = (String) cmdparams.get("1");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()) * 0.5d) + entityPlayer.getEntityData().func_74769_h("MagicDefense"));
            }
        }
    }
}
