package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextComponentString;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureBenMingPuGong.class */
public class ProcedureBenMingPuGong extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureBenMingPuGong(ElementsFabaokuozhanMod instance) {
        super(instance, 505);
    }

    public static boolean executeProcedure(Map<String, Object> dependencies) {
        String str;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        if (dependencies.get("sourceentity") == null) {
            return false;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("sourceentity");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
            str = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74779_i("绑定者");
        } else {
            str = "";
        }
        if (!str.equals(entityLivingBase.getEntityData().func_74779_i("ChaTan1"))) {
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("本命法宝的所有者不是你,你无法使用"), true);
                return false;
            }
            return false;
        }
        double func_74769_h = entityLivingBase.getEntityData().func_74769_h("Power");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
            d = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("普攻灵力");
        } else {
            d = -1.0d;
        }
        if (func_74769_h >= d) {
            NBTTagCompound entityData = entityLivingBase.getEntityData();
            double func_74769_h2 = entityLivingBase.getEntityData().func_74769_h("Power");
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d6 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("普攻灵力");
            } else {
                d6 = -1.0d;
            }
            entityData.func_74780_a("Power", func_74769_h2 - d6);
            return true;
        }
        double func_74769_h3 = entityLivingBase.getEntityData().func_74769_h("Base");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
            d2 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("普攻真元");
        } else {
            d2 = -1.0d;
        }
        if (func_74769_h3 >= d2) {
            NBTTagCompound entityData2 = entityLivingBase.getEntityData();
            double func_74769_h4 = entityLivingBase.getEntityData().func_74769_h("Base");
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d5 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("普攻真元");
            } else {
                d5 = -1.0d;
            }
            entityData2.func_74780_a("Base", func_74769_h4 - d5);
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足,你的攻击正在消耗真元！"), true);
                return true;
            }
            return true;
        }
        double func_74769_h5 = entityLivingBase.getEntityData().func_74769_h("Power");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
            d3 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("普攻灵力");
        } else {
            d3 = -1.0d;
        }
        if (func_74769_h5 < d3) {
            double func_74769_h6 = entityLivingBase.getEntityData().func_74769_h("Base");
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d4 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("普攻真元");
            } else {
                d4 = -1.0d;
            }
            if (func_74769_h6 < d4) {
                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力和真元都不足以催动本命法宝"), true);
                    return false;
                }
                return false;
            }
            return true;
        }
        return true;
    }
}
