package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureHuoyan01ToolInInventoryTick.class */
public class ProcedureHuoyan01ToolInInventoryTick extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHuoyan01ToolInInventoryTick(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 134);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("itemstack") == null) {
            return;
        }
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        $_dependencies.put("itemstack", itemstack);
        ProcedurePickUp.executeProcedure($_dependencies);
        if (itemstack.func_77952_i() > 0) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("huifu", (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("huifu") : -1.0d) + 1.0d);
            if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("huifu") : -1.0d) >= 40.0d) {
                itemstack.func_77964_b(itemstack.func_77952_i() - 1);
                if (!itemstack.func_77942_o()) {
                    itemstack.func_77982_d(new NBTTagCompound());
                }
                itemstack.func_77978_p().func_74780_a("huifu", 0.0d);
            }
        }
    }
}
