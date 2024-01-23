package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu0302;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureShouJiAndTuoZhan.class */
public class ProcedureShouJiAndTuoZhan extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShouJiAndTuoZhan(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityMoXiu0302.ENTITYID_RANGED);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase.getEntityData().func_74767_n("受击")) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) > 0.0f) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) < (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) && (entityLivingBase instanceof EntityLivingBase)) {
                    entityLivingBase.func_70691_i((float) entityLivingBase.getEntityData().func_74769_h("战斗恢复"));
                }
            }
            entityLivingBase.getEntityData().func_74780_a("受击计数", entityLivingBase.getEntityData().func_74769_h("受击计数") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("受击计数") >= 10.0d) {
                entityLivingBase.getEntityData().func_74757_a("脱战", true);
                entityLivingBase.getEntityData().func_74757_a("受击", false);
                entityLivingBase.getEntityData().func_74780_a("受击计数", 0.0d);
            }
        } else if (entityLivingBase.getEntityData().func_74767_n("脱战")) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) > 0.0f) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) < (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f)) {
                    if (entityLivingBase instanceof EntityLivingBase) {
                        entityLivingBase.func_70691_i((float) entityLivingBase.getEntityData().func_74769_h("脱战恢复"));
                        return;
                    }
                    return;
                }
            }
            entityLivingBase.getEntityData().func_74757_a("脱战", false);
        }
    }
}
