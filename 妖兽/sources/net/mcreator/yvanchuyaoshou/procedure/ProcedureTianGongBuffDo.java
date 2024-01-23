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
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureTianGongBuffDo.class */
public class ProcedureTianGongBuffDo extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureTianGongBuffDo(ElementsYvanchuyaoshouMod instance) {
        super(instance, 328);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (!entityLivingBase.func_145748_c_().func_150260_c().contains("古老魔")) {
            if (!entityLivingBase.getEntityData().func_74767_n("古老魔")) {
                if (entityLivingBase instanceof EntityLivingBase) {
                    entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76440_q, 40, 1));
                }
                entityLivingBase.func_70097_a(DamageSource.field_76380_i, 2682.0f);
                entityLivingBase.getEntityData().func_74757_a("古老魔", true);
                entityLivingBase.getEntityData().func_74757_a("古老魔撞击", true);
            }
            entityLivingBase.getEntityData().func_74780_a("古老魔计时", entityLivingBase.getEntityData().func_74769_h("古老魔计时") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("古老魔计时") >= 20.0d) {
                entityLivingBase.getEntityData().func_74757_a("古老魔", false);
                entityLivingBase.getEntityData().func_74757_a("古老魔撞击", false);
                entityLivingBase.getEntityData().func_74780_a("古老魔计时", 0.0d);
            }
        }
    }
}
