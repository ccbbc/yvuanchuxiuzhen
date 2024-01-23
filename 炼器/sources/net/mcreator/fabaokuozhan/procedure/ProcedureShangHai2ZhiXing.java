package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureShangHai2ZhiXing.class */
public class ProcedureShangHai2ZhiXing extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShangHai2ZhiXing(ElementsFabaokuozhanMod instance) {
        super(instance, 377);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShangHai2ZhiXing$1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShangHai2ZhiXing$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("cmdparams") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        final HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
        entity.func_70097_a(DamageSource.field_76377_j, new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShangHai2ZhiXing.1
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShangHai2ZhiXing.2
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
