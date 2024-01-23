package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao04MobIsHitWithTool.class */
public class ProcedureFabao04MobIsHitWithTool extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao04MobIsHitWithTool(ElementsFabaokuozhanMod instance) {
        super(instance, 239);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("sourceentity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        Entity sourceentity = (Entity) dependencies.get("sourceentity");
        sourceentity.getEntityData().func_74780_a("Power", sourceentity.getEntityData().func_74769_h("Power") - 3.0d);
        if (entity.getEntityData().func_74769_h("青虹剑") <= 0.0d) {
            entity.getEntityData().func_74780_a("青虹剑", 40.0d);
            entity.getEntityData().func_74780_a("AttackTemp", entity.getEntityData().func_74769_h("AttackTemp") - 7.0d);
            entity.getEntityData().func_74780_a("Attack", entity.getEntityData().func_74769_h("Attack") - 7.0d);
            entity.getEntityData().func_74780_a("MagicAttackTemp", entity.getEntityData().func_74769_h("MagicAttackTemp") - 2.0d);
            entity.getEntityData().func_74780_a("MagicAttack", entity.getEntityData().func_74769_h("MagicAttack") - 2.0d);
            return;
        }
        entity.getEntityData().func_74780_a("青虹剑", 40.0d);
    }
}
