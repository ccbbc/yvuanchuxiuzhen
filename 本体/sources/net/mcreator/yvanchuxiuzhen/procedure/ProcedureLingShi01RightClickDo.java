package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.item.ItemLingshi03;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureLingShi01RightClickDo.class */
public class ProcedureLingShi01RightClickDo extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLingShi01RightClickDo(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 285);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("itemstack") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        for (int index0 = 0; index0 < 10; index0++) {
            if (!world.field_72995_K) {
                EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemLingshi03.block, 1));
                entityToSpawn.func_174867_a(10);
                world.func_72838_d(entityToSpawn);
            }
        }
        itemstack.func_190918_g(1);
    }
}
