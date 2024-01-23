package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenFaTp1.class */
public class ProcedureZhenFaTp1 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhenFaTp1(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 385);
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1$3] */
    /* JADX WARN: Type inference failed for: r1v13, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1$4] */
    /* JADX WARN: Type inference failed for: r1v15, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1$5] */
    /* JADX WARN: Type inference failed for: r1v17, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1$6] */
    /* JADX WARN: Type inference failed for: r1v19, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1$7] */
    /* JADX WARN: Type inference failed for: r1v7, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1$1] */
    /* JADX WARN: Type inference failed for: r1v9, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1$2] */
    /* JADX WARN: Type inference failed for: r2v7, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1$8] */
    /* JADX WARN: Type inference failed for: r2v9, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1$9] */
    /* JADX WARN: Type inference failed for: r3v10, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1$11] */
    /* JADX WARN: Type inference failed for: r3v8, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1$10] */
    /* JADX WARN: Type inference failed for: r4v3, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1$12] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if (!(entity instanceof EntityItem) && !entity.func_145748_c_().func_150260_c().contains("entity.entitybullet") && !entity.func_145748_c_().func_150260_c().contains("阵法") && !entity.func_145748_c_().func_150260_c().contains("execute ") && !entity.func_189512_bd().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1.1
            public String getText() {
                String param = (String) cmdparams.get("3");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1.2
            public String getText() {
                String param = (String) cmdparams.get("4");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1.3
            public String getText() {
                String param = (String) cmdparams.get("5");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1.4
            public String getText() {
                String param = (String) cmdparams.get("6");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1.5
            public String getText() {
                String param = (String) cmdparams.get("7");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1.6
            public String getText() {
                String param = (String) cmdparams.get("8");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText())) {
            entity.func_70634_a(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1.7
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1.8
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText()), new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1.9
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1.10
                public String getText() {
                    String param = (String) cmdparams.get("1");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText()), new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1.11
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaTp1.12
                public String getText() {
                    String param = (String) cmdparams.get("2");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText()));
        }
    }
}
