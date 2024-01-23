package net.mcreator.yuanchuzhushou.procedure;

import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureTuPoGaiLv2.class */
public class ProcedureTuPoGaiLv2 extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureTuPoGaiLv2(ElementsYuanchuzhushouMod instance) {
        super(instance, 80);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        entity.getEntityData().func_74780_a("TuPoGaiLv", entity.getEntityData().func_74769_h("TuPoGaiLv") + 0.5d);
        entity.getEntityData().func_74757_a("境界概率更新", true);
        itemstack.func_190918_g(1);
    }
}
