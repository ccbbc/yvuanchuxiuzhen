package net.mcreator.lianqisanqiannian.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.minecraft.entity.Entity;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/procedure/ProcedureJianQiCmdDo.class */
public class ProcedureJianQiCmdDo extends ElementsLianqisanqiannianMod.ModElement {
    public ProcedureJianQiCmdDo(ElementsLianqisanqiannianMod instance) {
        super(instance, 26);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiCmdDo$1] */
    /* JADX WARN: Type inference failed for: r0v16, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiCmdDo$6] */
    /* JADX WARN: Type inference failed for: r0v19, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiCmdDo$7] */
    /* JADX WARN: Type inference failed for: r2v10, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiCmdDo$3] */
    /* JADX WARN: Type inference failed for: r2v12, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiCmdDo$4] */
    /* JADX WARN: Type inference failed for: r2v14, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiCmdDo$5] */
    /* JADX WARN: Type inference failed for: r2v3, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiCmdDo$8] */
    /* JADX WARN: Type inference failed for: r2v8, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiCmdDo$2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiCmdDo$9] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if (!new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiCmdDo.1
            public String getText() {
                String param = (String) cmdparams.get("1");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals("true")) {
            entity.getEntityData().func_74778_a("NumTempSave1", new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiCmdDo.2
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText());
            entity.getEntityData().func_74778_a("NumTempSave2", new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiCmdDo.3
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText());
            entity.getEntityData().func_74778_a("伤害", new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiCmdDo.4
                public String getText() {
                    String param = (String) cmdparams.get("2");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText());
            entity.getEntityData().func_74778_a("剑气主人", new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiCmdDo.5
                public String getText() {
                    String param = (String) cmdparams.get("3");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText());
        } else if (!entity.getEntityData().func_74767_n("剑气伤害") && new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiCmdDo.6
            public String getText() {
                String param = (String) cmdparams.get("1");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals("true") && !new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiCmdDo.7
            public String getText() {
                String param = (String) cmdparams.get("2");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText().equals(entity.func_145748_c_().func_150260_c())) {
            entity.getEntityData().func_74780_a("BeMagicAttack", new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiCmdDo.8
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureJianQiCmdDo.9
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText()));
            entity.getEntityData().func_74757_a("剑气伤害", true);
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                entity.getEntityData().func_74757_a("剑气伤害", false);
            }, 500L, TimeUnit.MILLISECONDS);
        }
    }
}
