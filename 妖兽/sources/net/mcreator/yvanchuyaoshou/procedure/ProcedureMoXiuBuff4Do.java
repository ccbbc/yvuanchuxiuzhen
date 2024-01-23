package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureMoXiuBuff4Do.class */
public class ProcedureMoXiuBuff4Do extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureMoXiuBuff4Do(ElementsYvanchuyaoshouMod instance) {
        super(instance, 321);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (!entityLivingBase.func_145748_c_().func_150260_c().contains("魔修")) {
            if (!entityLivingBase.getEntityData().func_74767_n("魔修4")) {
                if (entityLivingBase instanceof EntityLivingBase) {
                    entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 40, 1));
                }
                entityLivingBase.func_70097_a(DamageSource.field_76380_i, 2322.0f);
                entityLivingBase.getEntityData().func_74757_a("魔修4", true);
                entityLivingBase.getEntityData().func_74757_a("魔修撞击", true);
            }
            entityLivingBase.getEntityData().func_74780_a("魔修4计时", entityLivingBase.getEntityData().func_74769_h("魔修4计时") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("魔修4计时") >= 19.0d) {
                entityLivingBase.getEntityData().func_74757_a("魔修4", false);
                entityLivingBase.getEntityData().func_74757_a("魔修撞击", false);
                entityLivingBase.getEntityData().func_74780_a("魔修4计时", 0.0d);
            }
        }
    }
}
