package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureYuanShuiZhen02.class */
public class ProcedureYuanShuiZhen02 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureYuanShuiZhen02(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 510);
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYuanShuiZhen02$4] */
    /* JADX WARN: Type inference failed for: r1v13, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYuanShuiZhen02$5] */
    /* JADX WARN: Type inference failed for: r1v15, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYuanShuiZhen02$6] */
    /* JADX WARN: Type inference failed for: r1v4, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYuanShuiZhen02$1] */
    /* JADX WARN: Type inference failed for: r1v7, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYuanShuiZhen02$2] */
    /* JADX WARN: Type inference failed for: r1v9, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYuanShuiZhen02$3] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if (entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYuanShuiZhen02.1
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) || entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYuanShuiZhen02.2
            public String getText() {
                String param = (String) cmdparams.get("1");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) || entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYuanShuiZhen02.3
            public String getText() {
                String param = (String) cmdparams.get("2");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) || entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYuanShuiZhen02.4
            public String getText() {
                String param = (String) cmdparams.get("3");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) || entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYuanShuiZhen02.5
            public String getText() {
                String param = (String) cmdparams.get("4");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) || entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYuanShuiZhen02.6
            public String getText() {
                String param = (String) cmdparams.get("5");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText())) {
            entity.getEntityData().func_74780_a("渊水阵", 22.0d);
        }
    }
}
