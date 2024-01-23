package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureWifigongfaDo.class */
public class ProcedureWifigongfaDo extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureWifigongfaDo(ElementsYvanchujiguanMod instance) {
        super(instance, 143);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [net.mcreator.yvanchujiguan.procedure.ProcedureWifigongfaDo$1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [net.mcreator.yvanchujiguan.procedure.ProcedureWifigongfaDo$2] */
    /* JADX WARN: Type inference failed for: r0v16, types: [net.mcreator.yvanchujiguan.procedure.ProcedureWifigongfaDo$3] */
    /* JADX WARN: Type inference failed for: r0v19, types: [net.mcreator.yvanchujiguan.procedure.ProcedureWifigongfaDo$4] */
    /* JADX WARN: Type inference failed for: r0v22, types: [net.mcreator.yvanchujiguan.procedure.ProcedureWifigongfaDo$5] */
    /* JADX WARN: Type inference failed for: r0v25, types: [net.mcreator.yvanchujiguan.procedure.ProcedureWifigongfaDo$6] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yvanchujiguan.procedure.ProcedureWifigongfaDo$7] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureWifigongfaDo.1
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals("daolvshezhi")) {
            $_dependencies.put("entity", entityPlayer);
            $_dependencies.put("cmdparams", cmdparams);
            ProcedureDaoLvBangDingShi.executeProcedure($_dependencies);
        } else if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureWifigongfaDo.2
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals("shuangxiuyiwang")) {
            $_dependencies.put("entity", entityPlayer);
            ProcedureShuangXiuYiwangDo.executeProcedure($_dependencies);
        } else if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureWifigongfaDo.3
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals("shuangxiu1")) {
            $_dependencies.put("entity", entityPlayer);
            ProcedureShuangxiu1Do.executeProcedure($_dependencies);
        } else if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureWifigongfaDo.4
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals("shuangxiu0")) {
            $_dependencies.put("entity", entityPlayer);
            ProcedureShuangxiu0Do.executeProcedure($_dependencies);
        } else if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureWifigongfaDo.5
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals("gongfa1lengque")) {
            $_dependencies.put("entity", entityPlayer);
            ProcedureGongFaZhuDong1Num2.executeProcedure($_dependencies);
        } else if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureWifigongfaDo.6
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals("gongfazhudong2")) {
            $_dependencies.put("entity", entityPlayer);
            ProcedureGongFaZhuDong2Num0.executeProcedure($_dependencies);
        } else if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureWifigongfaDo.7
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals("bixiedianguang")) {
            $_dependencies.put("entity", entityPlayer);
            ProcedureBiXieDianGuangDo.executeProcedure($_dependencies);
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("§c未知指令。请使用/help来查看命令列表。"), false);
        }
    }
}
