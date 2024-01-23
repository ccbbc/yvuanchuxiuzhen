package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityYuWa;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureYuWaBuff2Do.class */
public class ProcedureYuWaBuff2Do extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureYuWaBuff2Do(ElementsYvanchuyaoshouMod instance) {
        super(instance, 278);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (!(entityLivingBase instanceof EntityYuWa.EntityCustom) && !entityLivingBase.getEntityData().func_74767_n("雨蛙攻击")) {
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 40, 1));
            }
            entityLivingBase.getEntityData().func_74757_a("雨蛙攻击", true);
        }
    }
}
