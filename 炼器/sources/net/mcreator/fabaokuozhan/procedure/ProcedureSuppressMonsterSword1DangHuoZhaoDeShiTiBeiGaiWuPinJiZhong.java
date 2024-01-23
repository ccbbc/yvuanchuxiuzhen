package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureSuppressMonsterSword1DangHuoZhaoDeShiTiBeiGaiWuPinJiZhong.class */
public class ProcedureSuppressMonsterSword1DangHuoZhaoDeShiTiBeiGaiWuPinJiZhong extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSuppressMonsterSword1DangHuoZhaoDeShiTiBeiGaiWuPinJiZhong(ElementsFabaokuozhanMod instance) {
        super(instance, 471);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase instanceof EntityLivingBase) {
            entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76437_t, 40, 1));
        }
        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 3.0d);
        entityLivingBase.func_70097_a(DamageSource.field_76380_i, 8.0f);
    }
}
