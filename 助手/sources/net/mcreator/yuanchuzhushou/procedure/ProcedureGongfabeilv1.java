package net.mcreator.yuanchuzhushou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.text.TextComponentString;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureGongfabeilv1.class */
public class ProcedureGongfabeilv1 extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureGongfabeilv1(ElementsYuanchuzhushouMod instance) {
        super(instance, 65);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureGongfabeilv1$1] */
    /* JADX WARN: Type inference failed for: r1v20, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureGongfabeilv1$2] */
    /* JADX WARN: Type inference failed for: r2v9, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureGongfabeilv1$3] */
    /* JADX WARN: Type inference failed for: r4v2, types: [net.mcreator.yuanchuzhushou.procedure.ProcedureGongfabeilv1$4] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if (new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureGongfabeilv1.1
            public int getScore(String score) {
                Scoreboard _sc;
                ScoreObjective _so;
                if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    return _scr.func_96652_c();
                }
                return 0;
            }
        }.getScore("gongfabeilv1") > 0) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc = entityPlayer.func_96123_co();
                ScoreObjective _so = _sc.func_96518_b("gongfabeilv");
                if (_so == null) {
                    _so = _sc.func_96535_a("gongfabeilv", ScoreCriteria.field_96641_b);
                }
                Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                _scr.func_96647_c(new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureGongfabeilv1.2
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureGongfabeilv1.3
                    public String getText() {
                        String param = (String) cmdparams.get("0");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()));
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("§b管理员已调整你的功法修炼需求为默认需求的[" + new Object() { // from class: net.mcreator.yuanchuzhushou.procedure.ProcedureGongfabeilv1.4
                    public String getText() {
                        String param = (String) cmdparams.get("0");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText() + "%]"), false);
            }
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc2 = entityPlayer.func_96123_co();
                ScoreObjective _so2 = _sc2.func_96518_b("gongfabeilv1");
                if (_so2 == null) {
                    _so2 = _sc2.func_96535_a("gongfabeilv1", ScoreCriteria.field_96641_b);
                }
                Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                _scr2.func_96647_c(0);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("§4管理员已禁止主动使用该命令！"), false);
        }
    }
}
