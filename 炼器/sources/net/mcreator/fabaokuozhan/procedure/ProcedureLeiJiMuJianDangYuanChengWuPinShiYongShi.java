package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureLeiJiMuJianDangYuanChengWuPinShiYongShi.class */
public class ProcedureLeiJiMuJianDangYuanChengWuPinShiYongShi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLeiJiMuJianDangYuanChengWuPinShiYongShi(ElementsFabaokuozhanMod instance) {
        super(instance, 305);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - 906.0d);
        if (entityPlayer instanceof EntityPlayer) {
            entityPlayer.func_184811_cZ().func_185145_a(itemstack.func_77973_b(), 30);
        }
        if (itemstack.func_96631_a(50, new Random(), (EntityPlayerMP) null)) {
            itemstack.func_190918_g(1);
            itemstack.func_77964_b(0);
        }
    }
}
