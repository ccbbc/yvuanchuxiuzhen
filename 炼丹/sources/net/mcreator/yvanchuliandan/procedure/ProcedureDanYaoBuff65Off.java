package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanYaoBuff65Off.class */
public class ProcedureDanYaoBuff65Off extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanYaoBuff65Off(ElementsYvanchuliandanMod instance) {
        super(instance, 430);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74767_n("YaoDan65Buff")) {
            entity.getEntityData().func_74780_a("HealthMax", entity.getEntityData().func_74769_h("HealthMax") - 1080.0d);
            entity.getEntityData().func_74780_a("HealthMaxTemp", entity.getEntityData().func_74769_h("HealthMaxTemp") - 1080.0d);
            entity.getEntityData().func_74757_a("YaoDan65Buff", false);
        }
    }
}
