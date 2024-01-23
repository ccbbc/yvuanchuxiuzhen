package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityHeHuanZong1;
import net.mcreator.yvanchuyaoshou.entity.EntityJiHunXie01;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureBaiZeSkill.class */
public class ProcedureBaiZeSkill extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureBaiZeSkill(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityHeHuanZong1.ENTITYID);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        entityLivingBase.getEntityData().func_74780_a("白泽技能计时", entityLivingBase.getEntityData().func_74769_h("白泽技能计时") + 1.0d);
        if (entityLivingBase.getEntityData().func_74769_h("白泽技能计时") >= 60.0d) {
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76429_m, (int) EntityJiHunXie01.ENTITYID, 1, false, true));
            }
            entityLivingBase.getEntityData().func_74780_a("白泽技能计时", 0.0d);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) > 0.0f) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) <= (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) * 0.5d && !entityLivingBase.getEntityData().func_74767_n("白泽技能")) {
                entityLivingBase.getEntityData().func_74780_a("Attack", entityLivingBase.getEntityData().func_74769_h("攻击") * 1.2d);
                entityLivingBase.getEntityData().func_74757_a("白泽技能", true);
                return;
            }
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) > 0.0f) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) > (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) * 0.5d && entityLivingBase.getEntityData().func_74767_n("白泽技能")) {
                entityLivingBase.getEntityData().func_74780_a("Attack", entityLivingBase.getEntityData().func_74769_h("攻击"));
                entityLivingBase.getEntityData().func_74757_a("白泽技能", false);
            }
        }
    }
}
