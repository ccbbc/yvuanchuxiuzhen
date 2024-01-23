package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityFangShiGuard02;
import net.mcreator.yvanchuyaoshou.entity.EntityGuLang0201;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureShouJiNbt.class */
public class ProcedureShouJiNbt extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShouJiNbt(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityGuLang0201.ENTITYID_RANGED);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        entityLivingBase.getEntityData().func_74757_a("受击", true);
        entityLivingBase.getEntityData().func_74780_a("受击计数", 0.0d);
        entityLivingBase.getEntityData().func_74757_a("脱战", false);
        entityLivingBase.getEntityData().func_74757_a("远攻", true);
        entityLivingBase.getEntityData().func_74780_a("远攻计数", 0.0d);
        entityLivingBase.getEntityData().func_74780_a("清除计时", 0.0d);
        if (entityLivingBase instanceof EntityFangShiGuard02.EntityCustom) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) < 144.0f && !entityLivingBase.getEntityData().func_74767_n("DefenseGain")) {
                entityLivingBase.getEntityData().func_74780_a("Defense", 86.0d);
                entityLivingBase.getEntityData().func_74757_a("DefenseGain", true);
            }
        }
    }
}
