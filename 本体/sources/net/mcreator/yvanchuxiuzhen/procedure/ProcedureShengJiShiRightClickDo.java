package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.potion.PotionYuanShenChuTiBuff;
import net.mcreator.yvanchuxiuzhen.potion.PotionYuanYingChuQiaoBuff;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureShengJiShiRightClickDo.class */
public class ProcedureShengJiShiRightClickDo extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShengJiShiRightClickDo(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 394);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if ((!((EntityLivingBase) entityPlayer).func_70644_a(PotionYuanShenChuTiBuff.potion) || !entityPlayer.getEntityData().func_74767_n("YuanShenUp")) && (!((EntityLivingBase) entityPlayer).func_70644_a(PotionYuanYingChuQiaoBuff.potion) || !entityPlayer.getEntityData().func_74767_n("YuanYingUp"))) {
            if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("主人") : "").equals("")) {
                if (!(itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("主人") : "").equals(entityPlayer.func_145748_c_().func_150260_c())) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("非此物主人，无法使用"), false);
                        return;
                    }
                    return;
                }
            }
            if (!(entityPlayer instanceof EntityPlayer ? (ItemStack) entityPlayer.field_71071_by.field_70460_b.get(0) : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().contains("fabaokuozhan:")) {
                if (!itemstack.func_77942_o()) {
                    itemstack.func_77982_d(new NBTTagCompound());
                }
                itemstack.func_77978_p().func_74778_a("主人", entityPlayer.func_145748_c_().func_150260_c());
                if (itemstack.func_77942_o() && itemstack.func_77978_p().func_74767_n("记录")) {
                    if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("JingJieNum") : -1.0d) >= entityPlayer.getEntityData().func_74769_h("JingJieNum")) {
                        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("XiaoJingJieNum") : -1.0d) >= entityPlayer.getEntityData().func_74769_h("XiaoJingJieNum")) {
                            $_dependencies.put("entity", entityPlayer);
                            $_dependencies.put("itemstack", itemstack);
                            ProcedureShengJIShiBack.executeProcedure($_dependencies);
                            entityPlayer.getEntityData().func_74757_a("血量回复", true);
                            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("已通过天道之力助你恢复境界"), false);
                            }
                            itemstack.func_190918_g(1);
                            return;
                        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("保存的层数过低无法回复该属性"), false);
                            return;
                        } else {
                            return;
                        }
                    } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("保存的境界过低无法回复该属性"), false);
                        return;
                    } else {
                        return;
                    }
                }
                $_dependencies.put("entity", entityPlayer);
                $_dependencies.put("itemstack", itemstack);
                ProcedureShengJiShiSave.executeProcedure($_dependencies);
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("已将信息刻录进此石"), false);
                }
                if (!itemstack.func_77942_o()) {
                    itemstack.func_77982_d(new NBTTagCompound());
                }
                itemstack.func_77978_p().func_74757_a("记录", true);
                itemstack.func_151001_c("§f§l" + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("主人") : "") + "" + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("JingJie") : "") + "" + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("XiaoJingJie") : "") + "" + (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("Layer") : "") + "的生机石");
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 40);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("保存属性前请卸下你的护甲"), false);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("重伤时，不可使用此物"), false);
        }
    }
}
