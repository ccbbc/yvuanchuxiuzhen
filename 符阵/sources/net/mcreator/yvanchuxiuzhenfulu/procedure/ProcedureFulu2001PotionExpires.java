package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu2001PotionExpires.class */
public class ProcedureFulu2001PotionExpires extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu2001PotionExpires(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 150);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("defense", entity.getEntityData().func_74769_h("defense") - 200.0d);
    }
}
