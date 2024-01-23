package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanYaoEat70.class */
public class ProcedureDanYaoEat70 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanYaoEat70(ElementsYvanchuliandanMod instance) {
        super(instance, 965);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("YaoXing", entity.getEntityData().func_74769_h("YaoXing") + 1.0d);
    }
}
