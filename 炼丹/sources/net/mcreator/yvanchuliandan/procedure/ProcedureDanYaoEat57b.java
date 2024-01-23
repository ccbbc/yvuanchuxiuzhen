package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanYaoEat57b.class */
public class ProcedureDanYaoEat57b extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanYaoEat57b(ElementsYvanchuliandanMod instance) {
        super(instance, 402);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("Base", entity.getEntityData().func_74769_h("Base") + 1024.0d);
    }
}
