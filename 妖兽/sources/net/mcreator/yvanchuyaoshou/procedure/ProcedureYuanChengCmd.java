package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureYuanChengCmd.class */
public class ProcedureYuanChengCmd extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureYuanChengCmd(ElementsYvanchuyaoshouMod instance) {
        super(instance, 241);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureYuanChengCmd$1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureYuanChengCmd$3] */
    /* JADX WARN: Type inference failed for: r2v6, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureYuanChengCmd$5] */
    /* JADX WARN: Type inference failed for: r2v9, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureYuanChengCmd$7] */
    /* JADX WARN: Type inference failed for: r3v1, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureYuanChengCmd$2] */
    /* JADX WARN: Type inference failed for: r3v4, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureYuanChengCmd$4] */
    /* JADX WARN: Type inference failed for: r3v7, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureYuanChengCmd$6] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        entity.getEntityData().func_74780_a("PosX", new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureYuanChengCmd.1
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureYuanChengCmd.2
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()));
        entity.getEntityData().func_74780_a("PosY", new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureYuanChengCmd.3
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureYuanChengCmd.4
            public String getText() {
                String param = (String) cmdparams.get("1");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()));
        entity.getEntityData().func_74780_a("PosZ", new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureYuanChengCmd.5
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureYuanChengCmd.6
            public String getText() {
                String param = (String) cmdparams.get("2");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()));
        entity.getEntityData().func_74778_a("攻击类型", new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureYuanChengCmd.7
            public String getText() {
                String param = (String) cmdparams.get("3");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText());
        entity.func_96094_a("");
    }
}
