package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao1701OnPotionActiveTick.class */
public class ProcedureFabao1701OnPotionActiveTick extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao1701OnPotionActiveTick(ElementsFabaokuozhanMod instance) {
        super(instance, 151);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("fabao17tick", entity.getEntityData().func_74769_h("fabao17tick") + 1.0d);
        if (entity.getEntityData().func_74769_h("fabao17tick") >= 40.0d) {
            entity.func_70097_a(DamageSource.field_76377_j, (float) entity.getEntityData().func_74769_h("fabao17"));
            entity.getEntityData().func_74780_a("fabao17tick2", entity.getEntityData().func_74769_h("fabao17tick2") + 1.0d);
            entity.getEntityData().func_74780_a("fabao17tick", 0.0d);
        }
        if (entity.getEntityData().func_74769_h("fabao17tick2") >= 4.0d) {
            entity.getEntityData().func_74780_a("fabao17", entity.getEntityData().func_74769_h("fabao17") - 1.0d);
            entity.getEntityData().func_74780_a("fabao17tick2", 0.0d);
        }
    }
}
