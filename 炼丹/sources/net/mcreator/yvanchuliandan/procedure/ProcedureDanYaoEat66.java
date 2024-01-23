package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanYaoEat66.class */
public class ProcedureDanYaoEat66 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanYaoEat66(ElementsYvanchuliandanMod instance) {
        super(instance, 412);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("DanYaoBreach1", 0.1d);
        entity.getEntityData().func_74780_a("境界突破附加概率", entity.getEntityData().func_74769_h("DanYaoBreach1") + entity.getEntityData().func_74769_h("DanYaoBreach2") + entity.getEntityData().func_74769_h("DanYaoBreach3"));
        entity.getEntityData().func_74780_a("PingJin", 1.0d);
        entity.getEntityData().func_74757_a("境界概率更新", true);
    }
}
