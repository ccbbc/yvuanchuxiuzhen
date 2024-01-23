package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureRosefinchBuffOn.class */
public class ProcedureRosefinchBuffOn extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureRosefinchBuffOn(ElementsFabaokuozhanMod instance) {
        super(instance, 520);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("朱雀环Time", entity.getEntityData().func_74769_h("朱雀环Time") + 1.0d);
        if (entity.getEntityData().func_74769_h("朱雀环Time") >= 20.0d) {
            entity.getEntityData().func_74780_a("朱雀环Time", 0.0d);
            entity.getEntityData().func_74780_a("BeFireAttack", entity.getEntityData().func_74769_h("BeFireAttack") + 2.0d);
        }
    }
}
