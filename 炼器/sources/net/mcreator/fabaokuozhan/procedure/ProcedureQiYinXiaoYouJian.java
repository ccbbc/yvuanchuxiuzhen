package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.potion.PotionImmobilityBuff;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureQiYinXiaoYouJian.class */
public class ProcedureQiYinXiaoYouJian extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureQiYinXiaoYouJian(ElementsFabaokuozhanMod instance) {
        super(instance, 524);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (!(entityLivingBase instanceof EntityPlayer) && (entityLivingBase instanceof EntityLivingBase)) {
            entityLivingBase.func_70690_d(new PotionEffect(PotionImmobilityBuff.potion, 40, 1, false, false));
        }
    }
}
