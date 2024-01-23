package net.mcreator.lianqisanqiannian.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.text.TextComponentString;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/procedure/ProcedureLqsqnCmdDo.class */
public class ProcedureLqsqnCmdDo extends ElementsLianqisanqiannianMod.ModElement {
    public ProcedureLqsqnCmdDo(ElementsLianqisanqiannianMod instance) {
        super(instance, 40);
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureLqsqnCmdDo$1] */
    /* JADX WARN: Type inference failed for: r1v12, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureLqsqnCmdDo$2] */
    /* JADX WARN: Type inference failed for: r1v20, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureLqsqnCmdDo$3] */
    /* JADX WARN: Type inference failed for: r2v10, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureLqsqnCmdDo$4] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 1.0d && entityPlayer.getEntityData().func_74769_h("GongFa3000") > 0.0d) {
            if (entityPlayer.func_70003_b(4, "")) {
                if (new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureLqsqnCmdDo.1
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureLqsqnCmdDo.2
                    public String getText() {
                        String param = (String) cmdparams.get("0");
                        if (param != null) {
                            return param;
                        }
                        return "";
                    }
                }.getText()) > 0) {
                    if (entityPlayer instanceof EntityPlayer) {
                        Scoreboard _sc = entityPlayer.func_96123_co();
                        ScoreObjective _so = _sc.func_96518_b("lqsqn");
                        if (_so == null) {
                            _so = _sc.func_96535_a("lqsqn", ScoreCriteria.field_96641_b);
                        }
                        Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                        _scr.func_96647_c(new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureLqsqnCmdDo.3
                            int convert(String s) {
                                try {
                                    return Integer.parseInt(s.trim());
                                } catch (Exception e) {
                                    return 0;
                                }
                            }
                        }.convert(new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureLqsqnCmdDo.4
                            public String getText() {
                                String param = (String) cmdparams.get("0");
                                if (param != null) {
                                    return param;
                                }
                                return "";
                            }
                        }.getText()));
                    }
                } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("错误，正确的使用方法是/lqsqn 数字(层数)"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("非管理员无法使用此指令"), false);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("请进入炼气期再使用此指令(需修习无极培元功)"), false);
        }
    }
}
