package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao17MobIsHitWithTool.class */
public class ProcedureFabao17MobIsHitWithTool extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao17MobIsHitWithTool(ElementsFabaokuozhanMod instance) {
        super(instance, 149);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("sourceentity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        Entity sourceentity = (Entity) dependencies.get("sourceentity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        sourceentity.getEntityData().func_74780_a("Power", sourceentity.getEntityData().func_74769_h("Power") - 123.0d);
        if (entityLivingBase instanceof EntityLivingBase) {
            entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 100, 1, false, false));
        }
        if (itemstack.func_77942_o() && itemstack.func_77978_p().func_74767_n("威能")) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) <= 0.35d * (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f)) {
                if (itemstack.func_96631_a(539, new Random(), (EntityPlayerMP) null)) {
                    itemstack.func_190918_g(1);
                    itemstack.func_77964_b(0);
                }
                if (!itemstack.func_77942_o()) {
                    itemstack.func_77982_d(new NBTTagCompound());
                }
                itemstack.func_77978_p().func_74757_a("威能", false);
                entityLivingBase.getEntityData().func_74780_a("BeMagicAttack", entityLivingBase.getEntityData().func_74769_h("BeMagicAttack") + entityLivingBase.getEntityData().func_74769_h("MagicDefense") + (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f));
            }
        }
    }
}
