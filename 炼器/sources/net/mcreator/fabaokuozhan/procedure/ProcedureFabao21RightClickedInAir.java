package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemFabao21;
import net.mcreator.fabaokuozhan.item.ItemFabao22;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao21RightClickedInAir.class */
public class ProcedureFabao21RightClickedInAir extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao21RightClickedInAir(ElementsFabaokuozhanMod instance) {
        super(instance, 216);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("itemstack") == null) {
            return;
        }
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if (!(itemstack.func_77942_o() && itemstack.func_77978_p().func_74767_n("fumo"))) {
            if (itemstack.func_77973_b() == new ItemStack(ItemFabao21.block, 1).func_77973_b()) {
                itemstack.func_77966_a(Enchantments.field_185303_l, 1);
            }
            if (itemstack.func_77973_b() == new ItemStack(ItemFabao22.block, 1).func_77973_b()) {
                itemstack.func_77966_a(Enchantments.field_185303_l, 3);
            }
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74757_a("fumo", true);
        }
    }
}
