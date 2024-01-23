package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureHandCaiLiao19.class */
public class ProcedureHandCaiLiao19 extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHandCaiLiao19(ElementsFabaokuozhanMod instance) {
        super(instance, 273);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase.getEntityData().func_74769_h("jingjie") < 22.0d && (entityLivingBase instanceof EntityLivingBase)) {
            entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 20, 2, true, true));
        }
    }
}
