package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao0801MobIsHitWithTool.class */
public class ProcedureFabao0801MobIsHitWithTool extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao0801MobIsHitWithTool(ElementsFabaokuozhanMod instance) {
        super(instance, 130);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("sourceentity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("sourceentity");
        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 3.0d);
        if (entityLivingBase instanceof EntityLivingBase) {
            entityLivingBase.func_70691_i(2.0f);
        }
    }
}
