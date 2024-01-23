package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureShanghai1DangMingLingBeiZhiXingShi.class */
public class ProcedureShanghai1DangMingLingBeiZhiXingShi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShanghai1DangMingLingBeiZhiXingShi(ElementsFabaokuozhanMod instance) {
        super(instance, 297);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShanghai1DangMingLingBeiZhiXingShi$1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShanghai1DangMingLingBeiZhiXingShi$2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShanghai1DangMingLingBeiZhiXingShi$3] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        if (!(entity instanceof EntityItem) && !entity.func_145748_c_().func_150260_c().equals(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShanghai1DangMingLingBeiZhiXingShi.1
            public String getText() {
                String param = (String) cmdparams.get("1");
                if (param != null) {
                    return param;
                }
                return "";
            }
        }.getText())) {
            entity.getEntityData().func_74780_a("BeMagicAttack", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShanghai1DangMingLingBeiZhiXingShi.2
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShanghai1DangMingLingBeiZhiXingShi.3
                public String getText() {
                    String param = (String) cmdparams.get("0");
                    if (param != null) {
                        return param;
                    }
                    return "";
                }
            }.getText()));
        }
    }
}
