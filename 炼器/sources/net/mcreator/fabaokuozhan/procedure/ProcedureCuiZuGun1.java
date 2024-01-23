package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureCuiZuGun1.class */
public class ProcedureCuiZuGun1 extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCuiZuGun1(ElementsFabaokuozhanMod instance) {
        super(instance, 427);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("sourceentity") == null) {
            return;
        }
        Entity sourceentity = (Entity) dependencies.get("sourceentity");
        sourceentity.getEntityData().func_74780_a("Power", sourceentity.getEntityData().func_74769_h("Power") - 3.0d);
        if (sourceentity.getEntityData().func_74769_h("翠竹棍") <= 0.0d) {
            sourceentity.getEntityData().func_74780_a("翠竹棍", 60.0d);
            sourceentity.getEntityData().func_74780_a("MagicDefenseTemp", sourceentity.getEntityData().func_74769_h("MagicDefenseTemp") + 4.0d);
            sourceentity.getEntityData().func_74780_a("MagicDefense", sourceentity.getEntityData().func_74769_h("MagicDefense") + 4.0d);
            return;
        }
        sourceentity.getEntityData().func_74780_a("翠竹棍", 60.0d);
    }
}
