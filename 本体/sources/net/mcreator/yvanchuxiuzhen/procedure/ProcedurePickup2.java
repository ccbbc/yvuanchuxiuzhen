package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.item.ItemLingshi03;
import net.mcreator.yvanchuxiuzhen.item.ItemLingshi05;
import net.mcreator.yvanchuxiuzhen.item.ItemLingshi08;
import net.mcreator.yvanchuxiuzhen.item.ItemLingshi09;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedurePickup2.class */
public class ProcedurePickup2 extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedurePickup2(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 166);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("itemstack") == null) {
            return;
        }
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if (itemstack.func_77973_b() == new ItemStack(ItemLingshi03.block, 1).func_77973_b()) {
            if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("power") : -1.0d) != 20.0d) {
                if (!itemstack.func_77942_o()) {
                    itemstack.func_77982_d(new NBTTagCompound());
                }
                itemstack.func_77978_p().func_74780_a("power", 20.0d);
                if (!itemstack.func_77942_o()) {
                    itemstack.func_77982_d(new NBTTagCompound());
                }
                itemstack.func_77978_p().func_74780_a("base", 8.0d);
            }
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemLingshi05.block, 1).func_77973_b()) {
            if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("power") : -1.0d) != 80.0d) {
                if (!itemstack.func_77942_o()) {
                    itemstack.func_77982_d(new NBTTagCompound());
                }
                itemstack.func_77978_p().func_74780_a("power", 80.0d);
                if (!itemstack.func_77942_o()) {
                    itemstack.func_77982_d(new NBTTagCompound());
                }
                itemstack.func_77978_p().func_74780_a("base", 32.0d);
            }
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemLingshi08.block, 1).func_77973_b()) {
            if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("power") : -1.0d) != 640.0d) {
                if (!itemstack.func_77942_o()) {
                    itemstack.func_77982_d(new NBTTagCompound());
                }
                itemstack.func_77978_p().func_74780_a("power", 640.0d);
                if (!itemstack.func_77942_o()) {
                    itemstack.func_77982_d(new NBTTagCompound());
                }
                itemstack.func_77978_p().func_74780_a("base", 256.0d);
            }
        }
        if (itemstack.func_77973_b() == new ItemStack(ItemLingshi09.block, 1).func_77973_b()) {
            if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("power") : -1.0d) != 1280.0d) {
                if (!itemstack.func_77942_o()) {
                    itemstack.func_77982_d(new NBTTagCompound());
                }
                itemstack.func_77978_p().func_74780_a("power", 1280.0d);
                if (!itemstack.func_77942_o()) {
                    itemstack.func_77982_d(new NBTTagCompound());
                }
                itemstack.func_77978_p().func_74780_a("base", 512.0d);
            }
        }
    }
}
