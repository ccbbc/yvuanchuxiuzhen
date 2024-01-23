package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextComponentString;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureGongFa8RightClickDo.class */
public class ProcedureGongFa8RightClickDo extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFa8RightClickDo(ElementsYvanchujiguanMod instance) {
        super(instance, 67);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if (entityPlayer.getEntityData().func_74769_h("GongFa8") != 0.0d) {
            if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("主人") : "").equals(entityPlayer.func_145748_c_().func_150260_c()) && !entityPlayer.getEntityData().func_74779_i("GongFaShow").equals("")) {
                if (entityPlayer.getEntityData().func_74767_n("ShuiLingGen")) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("修炼功法已切换至 " + itemstack.func_82833_r()), false);
                    }
                    entityPlayer.getEntityData().func_74780_a("GongFa", 8.0d);
                    entityPlayer.getEntityData().func_74778_a("GongFaShow", "逆情断天大法");
                    entityPlayer.getEntityData().func_74778_a("FanRenXiuXian1", itemstack.func_82833_r());
                    return;
                } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("经转世轮回，已物是人非，前世痕迹已尽散除"), false);
                    return;
                } else {
                    return;
                }
            }
        }
        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("主人") : "").equals("")) {
            if (entityPlayer.getEntityData().func_74779_i("GongFaShow").equals("")) {
                if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 1.0d && entityPlayer.getEntityData().func_74769_h("GongFa8") == 0.0d && entityPlayer.getEntityData().func_74767_n("ShuiLingGen")) {
                    ProcedureGongFaMingXianShi.executeProcedure($_dependencies);
                    entityPlayer.getEntityData().func_74780_a("GongFa8", 1.0d);
                    entityPlayer.getEntityData().func_74780_a("GongFa", 8.0d);
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("已学习" + itemstack.func_82833_r() + "§f需要打坐研习才能掌握功法。"), false);
                    }
                    entityPlayer.getEntityData().func_74778_a("GongFaShow", "逆情断天大法");
                    if (!itemstack.func_77942_o()) {
                        itemstack.func_77982_d(new NBTTagCompound());
                    }
                    itemstack.func_77978_p().func_74778_a("主人", entityPlayer.func_145748_c_().func_150260_c());
                    entityPlayer.getEntityData().func_74778_a("FanRenXiuXian1", itemstack.func_82833_r());
                } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 1.0d) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("未达到练气期，你无法学习此法"), false);
                    }
                } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("非水灵根者无法修炼"), false);
                }
                if (entityPlayer.getEntityData().func_74769_h("GongFa8") > 0.0d) {
                    if (!itemstack.func_77942_o()) {
                        itemstack.func_77982_d(new NBTTagCompound());
                    }
                    itemstack.func_77978_p().func_74778_a("主人", entityPlayer.func_145748_c_().func_150260_c());
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("你已经有所学的主修功法了，请先散功后再学习"), false);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("非此物主人，勿要触之"), false);
        }
    }
}
