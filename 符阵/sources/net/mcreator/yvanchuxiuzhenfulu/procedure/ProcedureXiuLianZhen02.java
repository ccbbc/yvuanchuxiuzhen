package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureXiuLianZhen02.class */
public class ProcedureXiuLianZhen02 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureXiuLianZhen02(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 379);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureXiuLianZhen02$7] */
    /* JADX WARN: Type inference failed for: r0v16, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureXiuLianZhen02$8] */
    /* JADX WARN: Type inference failed for: r0v19, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureXiuLianZhen02$9] */
    /* JADX WARN: Type inference failed for: r0v22, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureXiuLianZhen02$10] */
    /* JADX WARN: Type inference failed for: r1v25, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureXiuLianZhen02$2] */
    /* JADX WARN: Type inference failed for: r1v27, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureXiuLianZhen02$3] */
    /* JADX WARN: Type inference failed for: r1v29, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureXiuLianZhen02$4] */
    /* JADX WARN: Type inference failed for: r1v31, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureXiuLianZhen02$5] */
    /* JADX WARN: Type inference failed for: r1v33, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureXiuLianZhen02$6] */
    /* JADX WARN: Type inference failed for: r1v4, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureXiuLianZhen02$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if (entity.func_189512_bd().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureXiuLianZhen02.1
            public String getText() {
                String param = (String) cmdparams.get("1");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) || entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureXiuLianZhen02.2
            public String getText() {
                String param = (String) cmdparams.get("3");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) || entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureXiuLianZhen02.3
            public String getText() {
                String param = (String) cmdparams.get("4");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) || entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureXiuLianZhen02.4
            public String getText() {
                String param = (String) cmdparams.get("5");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) || entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureXiuLianZhen02.5
            public String getText() {
                String param = (String) cmdparams.get("6");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) || entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureXiuLianZhen02.6
            public String getText() {
                String param = (String) cmdparams.get("7");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText())) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureXiuLianZhen02.7
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("false")) {
                entity.getEntityData().func_74757_a("修炼阵Pro", false);
                entity.getEntityData().func_74780_a("XiuLianXiao", 0.0d);
                entity.getEntityData().func_74780_a("修炼阵", 22.0d);
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureXiuLianZhen02.8
                public String getText() {
                    String param = (String) cmdparams.get("2");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("one")) {
                entity.getEntityData().func_74757_a("修炼阵Pro", true);
                entity.getEntityData().func_74780_a("XiuLianXiao", 1.0d);
                entity.getEntityData().func_74780_a("修炼阵", 22.0d);
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureXiuLianZhen02.9
                public String getText() {
                    String param = (String) cmdparams.get("2");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("two")) {
                entity.getEntityData().func_74757_a("修炼阵Pro", true);
                entity.getEntityData().func_74780_a("XiuLianXiao", 2.0d);
                entity.getEntityData().func_74780_a("修炼阵", 22.0d);
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureXiuLianZhen02.10
                public String getText() {
                    String param = (String) cmdparams.get("2");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("null")) {
                entity.getEntityData().func_74757_a("修炼阵Pro", true);
                entity.getEntityData().func_74780_a("修炼阵", 22.0d);
            }
        }
    }
}
