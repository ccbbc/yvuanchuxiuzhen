package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao17MobIsHitWithToolPotionExpires.class */
public class ProcedureFabao17MobIsHitWithToolPotionExpires extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao17MobIsHitWithToolPotionExpires(ElementsFabaokuozhanMod instance) {
        super(instance, 152);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("fabao17", 0.0d);
        entity.getEntityData().func_74780_a("fabao17tick", 0.0d);
        entity.getEntityData().func_74780_a("fabao17tick2", 0.0d);
    }
}
