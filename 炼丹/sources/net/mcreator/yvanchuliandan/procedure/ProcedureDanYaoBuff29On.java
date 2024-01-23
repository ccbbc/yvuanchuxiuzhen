package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanYaoBuff29On.class */
public class ProcedureDanYaoBuff29On extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanYaoBuff29On(ElementsYvanchuliandanMod instance) {
        super(instance, 358);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (!entity.getEntityData().func_74767_n("YaoDan29Buff")) {
            entity.getEntityData().func_74780_a("HealthMaxTemp", entity.getEntityData().func_74769_h("HealthMaxTemp") + 40.0d);
            entity.getEntityData().func_74780_a("HealthMax", entity.getEntityData().func_74769_h("HealthMax") + 40.0d);
            entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 2.0d);
            entity.getEntityData().func_74780_a("Base", entity.getEntityData().func_74769_h("Base") - 20.0d);
            entity.getEntityData().func_74757_a("YaoDan29Buff", true);
        }
    }
}
