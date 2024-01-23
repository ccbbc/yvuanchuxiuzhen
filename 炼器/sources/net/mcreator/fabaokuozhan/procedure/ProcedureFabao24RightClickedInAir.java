package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentString;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao24RightClickedInAir.class */
public class ProcedureFabao24RightClickedInAir extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao24RightClickedInAir(ElementsFabaokuozhanMod instance) {
        super(instance, 218);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if (entityLivingBase.getEntityData().func_74769_h("Ferocious") > 0.0d && entityLivingBase.getEntityData().func_74769_h("power") >= 10.0d + (entityLivingBase.getEntityData().func_74769_h("Ferocious") * 200.0d) && !entityLivingBase.func_70093_af()) {
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76420_g, 1200, (int) (entityLivingBase.getEntityData().func_74769_h("Ferocious") * 0.2d), true, true));
            }
            entityLivingBase.getEntityData().func_74780_a("power", entityLivingBase.getEntityData().func_74769_h("power") - (10.0d + (entityLivingBase.getEntityData().func_74769_h("Ferocious") * 200.0d)));
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("煞气护体"), false);
            }
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 2400);
            }
        } else if (entityLivingBase.getEntityData().func_74769_h("Ferocious") == 0.0d && !entityLivingBase.func_70093_af()) {
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("你还没有煞气，无法发动“煞气护体”技能"), false);
            }
        } else if (entityLivingBase.getEntityData().func_74769_h("power") >= 10.0d + (entityLivingBase.getEntityData().func_74769_h("Ferocious") * 200.0d) && !entityLivingBase.func_70093_af() && (entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("你的灵力不足" + (10.0d + (entityLivingBase.getEntityData().func_74769_h("Ferocious") * 3.0d)) + "点，无法发动“煞气护体”技能"), false);
        }
        if (entityLivingBase.getEntityData().func_74769_h("Ferocious") > 0.0d && entityLivingBase.getEntityData().func_74769_h("power") >= 10.0d + (entityLivingBase.getEntityData().func_74769_h("Ferocious") * 20.0d) && entityLivingBase.func_70093_af()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74757_a("wudaoyizhan", true);
            entityLivingBase.getEntityData().func_74780_a("power", entityLivingBase.getEntityData().func_74769_h("power") - (10.0d + (entityLivingBase.getEntityData().func_74769_h("Ferocious") * 20.0d)));
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("午刀一斩"), false);
            }
            if (entityLivingBase instanceof EntityPlayer) {
                ((EntityPlayer) entityLivingBase).func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 2400);
            }
        } else if (entityLivingBase.getEntityData().func_74769_h("Ferocious") == 0.0d && entityLivingBase.func_70093_af()) {
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("你还没有煞气，无法发动“午刀一斩”技能"), false);
            }
        } else if (entityLivingBase.getEntityData().func_74769_h("power") >= 10.0d + (entityLivingBase.getEntityData().func_74769_h("Ferocious") * 20.0d) && entityLivingBase.func_70093_af() && (entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("你的灵力不足" + (10.0d + (entityLivingBase.getEntityData().func_74769_h("Ferocious") * 3.0d)) + "点，无法发动“午刀一斩”技能"), false);
        }
    }
}
