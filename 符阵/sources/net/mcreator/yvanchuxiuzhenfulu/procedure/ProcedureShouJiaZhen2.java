package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureShouJiaZhen2.class */
public class ProcedureShouJiaZhen2 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureShouJiaZhen2(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 436);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureShouJiaZhen2$4] */
    /* JADX WARN: Type inference failed for: r1v12, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureShouJiaZhen2$5] */
    /* JADX WARN: Type inference failed for: r1v14, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureShouJiaZhen2$6] */
    /* JADX WARN: Type inference failed for: r1v4, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureShouJiaZhen2$1] */
    /* JADX WARN: Type inference failed for: r1v6, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureShouJiaZhen2$2] */
    /* JADX WARN: Type inference failed for: r1v8, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureShouJiaZhen2$3] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if (!entity.func_189512_bd().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureShouJiaZhen2.1
            public String getText() {
                String param = (String) cmdparams.get("0");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureShouJiaZhen2.2
            public String getText() {
                String param = (String) cmdparams.get("1");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureShouJiaZhen2.3
            public String getText() {
                String param = (String) cmdparams.get("2");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureShouJiaZhen2.4
            public String getText() {
                String param = (String) cmdparams.get("3");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureShouJiaZhen2.5
            public String getText() {
                String param = (String) cmdparams.get("4");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText()) && !entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureShouJiaZhen2.6
            public String getText() {
                String param = (String) cmdparams.get("5");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText())) {
            entity.getEntityData().func_74780_a("守家阵", 22.0d);
        }
    }
}
