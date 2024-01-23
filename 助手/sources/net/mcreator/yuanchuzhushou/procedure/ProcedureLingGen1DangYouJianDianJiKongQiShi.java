package net.mcreator.yuanchuzhushou.procedure;

import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.mcreator.yuanchuzhushou.item.ItemLingGen1;
import net.mcreator.yuanchuzhushou.item.ItemLingGen2;
import net.mcreator.yuanchuzhushou.item.ItemLingGen3;
import net.mcreator.yuanchuzhushou.item.ItemLingGen4;
import net.mcreator.yuanchuzhushou.item.ItemLingGen5;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureLingGen1DangYouJianDianJiKongQiShi.class */
public class ProcedureLingGen1DangYouJianDianJiKongQiShi extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureLingGen1DangYouJianDianJiKongQiShi(ElementsYuanchuzhushouMod instance) {
        super(instance, 69);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemLingGen1.block, 1).func_77973_b()) {
            if (!entityLivingBase.getEntityData().func_74767_n("ShuiLingGen")) {
                entityLivingBase.getEntityData().func_74757_a("ShuiLingGen", true);
                entityLivingBase.getEntityData().func_74780_a("LingGenNum", entityLivingBase.getEntityData().func_74769_h("LingGenNum") + 1.0d);
                entityLivingBase.getEntityData().func_74778_a("LingGen", entityLivingBase.getEntityData().func_74779_i("LingGen") + "水");
            } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("你已经有水灵根了但是我还是减掉你一个物品"), false);
            }
        } else {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemLingGen2.block, 1).func_77973_b()) {
                if (!entityLivingBase.getEntityData().func_74767_n("HuoLingGen")) {
                    entityLivingBase.getEntityData().func_74757_a("HuoLingGen", true);
                    entityLivingBase.getEntityData().func_74780_a("LingGenNum", entityLivingBase.getEntityData().func_74769_h("LingGenNum") + 1.0d);
                    entityLivingBase.getEntityData().func_74778_a("LingGen", entityLivingBase.getEntityData().func_74779_i("LingGen") + "火");
                } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("你已经有火灵根了但是我还是减掉你一个物品"), false);
                }
            } else {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemLingGen3.block, 1).func_77973_b()) {
                    if (!entityLivingBase.getEntityData().func_74767_n("MuLingGen")) {
                        entityLivingBase.getEntityData().func_74757_a("MuLingGen", true);
                        entityLivingBase.getEntityData().func_74780_a("LingGenNum", entityLivingBase.getEntityData().func_74769_h("LingGenNum") + 1.0d);
                        entityLivingBase.getEntityData().func_74778_a("LingGen", entityLivingBase.getEntityData().func_74779_i("LingGen") + "木");
                    } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("你已经有木灵根了但是我还是减掉你一个物品"), false);
                    }
                } else {
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemLingGen4.block, 1).func_77973_b()) {
                        if (!entityLivingBase.getEntityData().func_74767_n("TuLingGen")) {
                            entityLivingBase.getEntityData().func_74757_a("TuLingGen", true);
                            entityLivingBase.getEntityData().func_74780_a("LingGenNum", entityLivingBase.getEntityData().func_74769_h("LingGenNum") + 1.0d);
                            entityLivingBase.getEntityData().func_74778_a("LingGen", entityLivingBase.getEntityData().func_74779_i("LingGen") + "土");
                        } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("你已经有土灵根了但是我还是减掉你一个物品"), false);
                        }
                    } else {
                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemLingGen5.block, 1).func_77973_b()) {
                            if (!entityLivingBase.getEntityData().func_74767_n("JinLingGen")) {
                                entityLivingBase.getEntityData().func_74757_a("JinLingGen", true);
                                entityLivingBase.getEntityData().func_74780_a("LingGenNum", entityLivingBase.getEntityData().func_74769_h("LingGenNum") + 1.0d);
                                entityLivingBase.getEntityData().func_74778_a("LingGen", entityLivingBase.getEntityData().func_74779_i("LingGen") + "金");
                            } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("你已经有金灵根了但是我还是减掉你一个物品"), false);
                            }
                        }
                    }
                }
            }
        }
        itemstack.func_190918_g(1);
    }
}
