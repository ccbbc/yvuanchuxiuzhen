package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFeiXingFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu03;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu2401;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemHuDunFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemWuLiangDunFuBao;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemYinShenFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemZhaoMingFu;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu03RightClickedInAir.class */
public class ProcedureFulu03RightClickedInAir extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu03RightClickedInAir(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 76);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        world.func_184148_a((EntityPlayer) null, x, y, z, (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("yvanchuxiuzhenfulu:fulufashe")), SoundCategory.NEUTRAL, 1.0f, 1.0f);
        if (itemstack.func_77973_b() == new ItemStack(ItemFulu03.block, 1).func_77973_b()) {
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76424_c, 1200, 1, true, true));
            }
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("使用一张神行符"), false);
            }
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).field_71071_by.func_174925_a(itemstack.func_77973_b(), -1, 1, (NBTTagCompound) null);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemFulu2401.block, 1).func_77973_b()) {
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("使用一张龟息符"), false);
            }
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76427_o, 1200, 4, true, true));
            }
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).field_71071_by.func_174925_a(itemstack.func_77973_b(), -1, 1, (NBTTagCompound) null);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemZhaoMingFu.block, 1).func_77973_b()) {
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("使用一张夜明符"), false);
            }
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76439_r, 1200, 4, true, true));
            }
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).field_71071_by.func_174925_a(itemstack.func_77973_b(), -1, 1, (NBTTagCompound) null);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemHuDunFu.block, 1).func_77973_b()) {
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("使用一张护盾符"), false);
            }
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76429_m, 100, 0, true, true));
            }
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).field_71071_by.func_174925_a(itemstack.func_77973_b(), -1, 1, (NBTTagCompound) null);
            }
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemFeiXingFu.block, 1).func_77973_b()) {
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("使用一张飞行符"), false);
            }
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("剩余飞行时间:60秒"), false);
            }
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).field_71071_by.func_174925_a(itemstack.func_77973_b(), -1, 1, (NBTTagCompound) null);
            }
            entityLivingBase.getEntityData().func_74757_a("飞行符", true);
            entityLivingBase.getEntityData().func_74780_a("飞行符tick", 36000.0d);
        } else if (itemstack.func_77973_b() == new ItemStack(ItemWuLiangDunFuBao.block, 1).func_77973_b()) {
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("entity", entityLivingBase);
            ProcedureWuLiangDunFu.executeProcedure($_dependencies);
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 120);
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemYinShenFu.block, 1).func_77973_b()) {
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("使用一张隐身符"), false);
            }
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76441_p, 12000, 1));
            }
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).field_71071_by.func_174925_a(itemstack.func_77973_b(), -1, 1, (NBTTagCompound) null);
            }
        }
    }
}
