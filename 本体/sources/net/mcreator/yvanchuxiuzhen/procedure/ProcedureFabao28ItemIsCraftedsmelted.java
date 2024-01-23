package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureFabao28ItemIsCraftedsmelted.class */
public class ProcedureFabao28ItemIsCraftedsmelted extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao28ItemIsCraftedsmelted(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 200);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("itemstack") == null) {
            return;
        }
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        itemstack.func_77966_a(Enchantments.field_185305_q, 3);
    }
}
