package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextComponentString;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFaBao33YouJianKongQi.class */
public class ProcedureFaBao33YouJianKongQi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFaBao33YouJianKongQi(ElementsFabaokuozhanMod instance) {
        super(instance, 541);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 4.0d) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("元婴期以下修士无法使用"), false);
                return;
            }
            return;
        }
        if (entityPlayer.getEntityData().func_74769_h("Power") >= (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("灵力消耗") : -1.0d)) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74757_a("威能", true);
            entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("灵力消耗") : -1.0d));
            if (entityPlayer instanceof EntityPlayer) {
                entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 30);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("灵力不足以使用威能"), false);
        }
    }
}
