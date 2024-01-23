package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureSanXianLingItemUpdate.class */
public class ProcedureSanXianLingItemUpdate extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSanXianLingItemUpdate(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 507);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74779_i("Master") : "").equals(entity.func_145748_c_().func_150260_c())) {
            entity.getEntityData().func_74780_a("SanXianLingLevel", itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("SanXianLingLevel") : -1.0d);
        }
    }
}
