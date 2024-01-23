package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureHuiLingZhen02.class */
public class ProcedureHuiLingZhen02 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureHuiLingZhen02(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 368);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuiLingZhen02$7] */
    /* JADX WARN: Type inference failed for: r0v16, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuiLingZhen02$8] */
    /* JADX WARN: Type inference failed for: r1v12, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuiLingZhen02$2] */
    /* JADX WARN: Type inference failed for: r1v14, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuiLingZhen02$3] */
    /* JADX WARN: Type inference failed for: r1v16, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuiLingZhen02$4] */
    /* JADX WARN: Type inference failed for: r1v18, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuiLingZhen02$5] */
    /* JADX WARN: Type inference failed for: r1v20, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuiLingZhen02$6] */
    /* JADX WARN: Type inference failed for: r1v4, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuiLingZhen02$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if (entity.func_189512_bd().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuiLingZhen02.1
            public String getText() {
                String param = (String) cmdparams.get("1");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) || entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuiLingZhen02.2
            public String getText() {
                String param = (String) cmdparams.get("2");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) || entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuiLingZhen02.3
            public String getText() {
                String param = (String) cmdparams.get("3");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) || entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuiLingZhen02.4
            public String getText() {
                String param = (String) cmdparams.get("4");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) || entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuiLingZhen02.5
            public String getText() {
                String param = (String) cmdparams.get("5");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) || entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuiLingZhen02.6
            public String getText() {
                String param = (String) cmdparams.get("6");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText())) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuiLingZhen02.7
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("1")) {
                entity.getEntityData().func_74780_a("涌泉阵", 22.0d);
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuiLingZhen02.8
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText().equals("2")) {
                entity.getEntityData().func_74780_a("万象阵", 22.0d);
            }
        }
    }
}
