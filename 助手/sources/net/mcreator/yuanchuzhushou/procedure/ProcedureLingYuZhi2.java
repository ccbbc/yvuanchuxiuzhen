package net.mcreator.yuanchuzhushou.procedure;

import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureLingYuZhi2.class */
public class ProcedureLingYuZhi2 extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureLingYuZhi2(ElementsYuanchuzhushouMod instance) {
        super(instance, 79);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        entity.getEntityData().func_74780_a("LingYuZhi", entity.getEntityData().func_74769_h("LingYuZhi") + 100.0d);
        itemstack.func_190918_g(1);
    }
}
