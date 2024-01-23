package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureHandCaiLiao18.class */
public class ProcedureHandCaiLiao18 extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHandCaiLiao18(ElementsFabaokuozhanMod instance) {
        super(instance, 272);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase.getEntityData().func_74769_h("jingjie") < 22.0d && (entityLivingBase instanceof EntityLivingBase)) {
            entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76437_t, 20, 1, true, true));
        }
    }
}
