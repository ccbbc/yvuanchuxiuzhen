package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemCailiao12;
import net.mcreator.fabaokuozhan.item.ItemCailiao13;
import net.mcreator.fabaokuozhan.item.ItemCailiao14;
import net.mcreator.fabaokuozhan.item.ItemCailiao16;
import net.mcreator.fabaokuozhan.item.ItemCailiao18;
import net.mcreator.fabaokuozhan.item.ItemCailiao19;
import net.mcreator.fabaokuozhan.item.ItemCailiao22;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureCailiao12ItemInHandTick.class */
public class ProcedureCailiao12ItemInHandTick extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCailiao12ItemInHandTick(ElementsFabaokuozhanMod instance) {
        super(instance, 168);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if (itemstack.func_77973_b() == new ItemStack(ItemCailiao12.block, 1).func_77973_b() && entityLivingBase.getEntityData().func_74769_h("jingjie") < 6.0d) {
            entityLivingBase.func_70097_a(DamageSource.field_76371_c, 0.1f);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemCailiao13.block, 1).func_77973_b() && entityLivingBase.getEntityData().func_74769_h("jingjie") < 10.0d && (entityLivingBase instanceof EntityLivingBase)) {
            entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 20, 1, true, true));
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemCailiao14.block, 1).func_77973_b() && entityLivingBase.getEntityData().func_74769_h("jingjie") < 14.0d) {
            entityLivingBase.func_70097_a(DamageSource.field_76371_c, 1.0f);
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemCailiao16.block, 1).func_77973_b() && entityLivingBase.getEntityData().func_74769_h("jingjie") < 18.0d && (entityLivingBase instanceof EntityLivingBase)) {
            entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 20, 1, true, true));
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemCailiao18.block, 1).func_77973_b() && entityLivingBase.getEntityData().func_74769_h("jingjie") < 22.0d && (entityLivingBase instanceof EntityLivingBase)) {
            entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76437_t, 20, 1, true, true));
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemCailiao19.block, 1).func_77973_b() && entityLivingBase.getEntityData().func_74769_h("jingjie") < 22.0d && (entityLivingBase instanceof EntityLivingBase)) {
            entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 20, 2, true, true));
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemCailiao22.block, 1).func_77973_b() && entityLivingBase.getEntityData().func_74769_h("jingjie") < 30.0d && (entityLivingBase instanceof EntityLivingBase)) {
            entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 20, 3, true, true));
        }
    }
}
