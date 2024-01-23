package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureYuanchuDangMingLingBeiZhiXingShi.class */
public class ProcedureYuanchuDangMingLingBeiZhiXingShi extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureYuanchuDangMingLingBeiZhiXingShi(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 454);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYuanchuDangMingLingBeiZhiXingShi$1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYuanchuDangMingLingBeiZhiXingShi$2] */
    /* JADX WARN: Type inference failed for: r0v16, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYuanchuDangMingLingBeiZhiXingShi$3] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYuanchuDangMingLingBeiZhiXingShi.1
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals("mr")) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYuanchuDangMingLingBeiZhiXingShi.2
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("true")) {
                if (entityPlayer instanceof EntityPlayer) {
                    Scoreboard _sc = entityPlayer.func_96123_co();
                    ScoreObjective _so = _sc.func_96518_b("yuanchumr");
                    if (_so == null) {
                        _so = _sc.func_96535_a("yuanchumr", ScoreCriteria.field_96641_b);
                    }
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    _scr.func_96647_c(0);
                }
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("已启用经验提示"), false);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYuanchuDangMingLingBeiZhiXingShi.3
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("false")) {
                if (entityPlayer instanceof EntityPlayer) {
                    Scoreboard _sc2 = entityPlayer.func_96123_co();
                    ScoreObjective _so2 = _sc2.func_96518_b("yuanchumr");
                    if (_so2 == null) {
                        _so2 = _sc2.func_96535_a("yuanchumr", ScoreCriteria.field_96641_b);
                    }
                    Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                    _scr2.func_96647_c(1);
                }
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("已关闭经验提示"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("输入true开启提示  输入false关闭提示"), false);
            }
        }
    }
}
