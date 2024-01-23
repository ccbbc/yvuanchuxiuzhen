package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.item.ItemLingshi05;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureLingShiNbtSet2.class */
public class ProcedureLingShiNbtSet2 extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLingShiNbtSet2(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 576);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        entity.getEntityData().func_74780_a("灵石灵力Tick2", entity.getEntityData().func_74769_h("灵石灵力Tick2") + 1.0d);
        if (entity.getEntityData().func_74769_h("灵石灵力Tick2") >= 10.0d && itemstack.func_77973_b() == new ItemStack(ItemLingshi05.block, 1).func_77973_b()) {
            if (!itemstack.func_77942_o()) {
                itemstack.func_77982_d(new NBTTagCompound());
            }
            itemstack.func_77978_p().func_74780_a("PowerNum", 1000.0d);
            entity.getEntityData().func_74780_a("灵石灵力Tick2", 0.0d);
        }
    }
}
