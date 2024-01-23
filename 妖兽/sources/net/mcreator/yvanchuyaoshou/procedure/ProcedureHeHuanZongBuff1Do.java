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
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureHeHuanZongBuff1Do.class */
public class ProcedureHeHuanZongBuff1Do extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHeHuanZongBuff1Do(ElementsYvanchuyaoshouMod instance) {
        super(instance, 311);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (!entityLivingBase.func_145748_c_().func_150260_c().contains("合欢宗")) {
            if (!entityLivingBase.getEntityData().func_74767_n("合欢宗1")) {
                if (entityLivingBase instanceof EntityLivingBase) {
                    entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 40, 1));
                }
                entityLivingBase.func_70097_a(DamageSource.field_76380_i, 792.0f);
                entityLivingBase.getEntityData().func_74757_a("合欢宗1", true);
                entityLivingBase.getEntityData().func_74757_a("魔修撞击", true);
            }
            entityLivingBase.getEntityData().func_74780_a("合欢宗1计时", entityLivingBase.getEntityData().func_74769_h("合欢宗1计时") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("合欢宗1计时") >= 20.0d) {
                entityLivingBase.getEntityData().func_74757_a("合欢宗1", false);
                entityLivingBase.getEntityData().func_74757_a("魔修撞击", false);
                entityLivingBase.getEntityData().func_74780_a("合欢宗1计时", 0.0d);
            }
        }
    }
}
