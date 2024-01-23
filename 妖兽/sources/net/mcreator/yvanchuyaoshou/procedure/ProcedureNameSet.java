package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureNameSet.class */
public class ProcedureNameSet extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureNameSet(ElementsYvanchuyaoshouMod instance) {
        super(instance, 258);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.func_145748_c_().func_150260_c().length() <= 7) {
            $_dependencies.put("entity", entity);
            ProcedureXingShiSet.executeProcedure($_dependencies);
            $_dependencies.put("entity", entity);
            ProcedureMingSet.executeProcedure($_dependencies);
            entity.func_96094_a(entity.func_145748_c_().func_150260_c() + " " + entity.getEntityData().func_74779_i("姓") + "" + entity.getEntityData().func_74779_i("名"));
        }
    }
}
