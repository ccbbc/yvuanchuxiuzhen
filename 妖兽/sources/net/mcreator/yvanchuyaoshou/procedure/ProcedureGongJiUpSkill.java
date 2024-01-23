package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityHunTieShou03;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureGongJiUpSkill.class */
public class ProcedureGongJiUpSkill extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongJiUpSkill(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityHunTieShou03.ENTITYID_RANGED);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) > 0.0f) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) <= (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) * 0.3d && !entityLivingBase.getEntityData().func_74767_n("攻击暂时提升")) {
                entityLivingBase.getEntityData().func_74780_a("Attack", entityLivingBase.getEntityData().func_74769_h("攻击") * 1.2d);
                entityLivingBase.getEntityData().func_74757_a("攻击暂时提升", true);
                return;
            }
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) > 0.0f) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) <= (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) * 0.3d && entityLivingBase.getEntityData().func_74767_n("攻击暂时提升")) {
                entityLivingBase.getEntityData().func_74780_a("Attack", entityLivingBase.getEntityData().func_74769_h("攻击"));
                entityLivingBase.getEntityData().func_74757_a("攻击暂时提升", false);
            }
        }
    }
}
