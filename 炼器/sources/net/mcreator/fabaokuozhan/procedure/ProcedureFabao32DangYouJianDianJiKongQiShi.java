package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemFabao32;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentString;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao32DangYouJianDianJiKongQiShi.class */
public class ProcedureFabao32DangYouJianDianJiKongQiShi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao32DangYouJianDianJiKongQiShi(ElementsFabaokuozhanMod instance) {
        super(instance, 309);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao32.block, 1).func_77973_b()) {
            if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 5.0d) {
                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("化神期以下修士无法使用法宝"), true);
                }
            } else if (entityLivingBase.getEntityData().func_74769_h("fabao32cd") == 0.0d && entityLivingBase.getEntityData().func_74769_h("Base") >= 150.0d && entityLivingBase.getEntityData().func_74769_h("Power") >= 3600.0d) {
                if (entityLivingBase instanceof EntityLivingBase) {
                    entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76429_m, 40, 3));
                }
                if (entityLivingBase instanceof EntityPlayer) {
                    ((EntityPlayer) entityLivingBase).func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 160);
                }
                if (itemstack.func_96631_a(50, new Random(), (EntityPlayerMP) null)) {
                    itemstack.func_190918_g(1);
                    itemstack.func_77964_b(0);
                }
                entityLivingBase.getEntityData().func_74780_a("fabao32cd", 100.0d);
                entityLivingBase.getEntityData().func_74780_a("Base", entityLivingBase.getEntityData().func_74769_h("Base") - 150.0d);
                entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 3600.0d);
            } else if (entityLivingBase.getEntityData().func_74769_h("Base") < 150.0d) {
                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("真元不足无法使用"), true);
                }
            } else if (entityLivingBase.getEntityData().func_74769_h("fabao32cd") > 0.0d) {
                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("碧海无量盾cd中"), true);
                }
            } else if (entityLivingBase.getEntityData().func_74769_h("Power") >= 3600.0d && (entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法使用"), true);
            }
        }
    }
}
