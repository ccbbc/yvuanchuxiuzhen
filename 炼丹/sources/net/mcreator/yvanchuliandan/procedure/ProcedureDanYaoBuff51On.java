package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanYaoBuff51On.class */
public class ProcedureDanYaoBuff51On extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanYaoBuff51On(ElementsYvanchuliandanMod instance) {
        super(instance, 414);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (!entity.getEntityData().func_74767_n("YaoDan51Buff")) {
            entity.getEntityData().func_74780_a("AttackTemp", entity.getEntityData().func_74769_h("AttackTemp") + 36.0d);
            entity.getEntityData().func_74780_a("Attack", entity.getEntityData().func_74769_h("Attack") + 36.0d);
            entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 8.0d);
            entity.getEntityData().func_74780_a("Base", entity.getEntityData().func_74769_h("Base") - 320.0d);
            entity.getEntityData().func_74757_a("YaoDan51Buff", true);
        }
    }
}
