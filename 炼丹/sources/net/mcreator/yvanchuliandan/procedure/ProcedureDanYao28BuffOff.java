package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanYao28BuffOff.class */
public class ProcedureDanYao28BuffOff extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanYao28BuffOff(ElementsYvanchuliandanMod instance) {
        super(instance, 356);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74767_n("YaoDan28Buff")) {
            entity.getEntityData().func_74780_a("DefenseTemp", entity.getEntityData().func_74769_h("DefenseTemp") - 4.0d);
            entity.getEntityData().func_74780_a("Defense", entity.getEntityData().func_74769_h("Defense") - 4.0d);
            entity.getEntityData().func_74757_a("YaoDan28Buff", false);
        }
    }
}
