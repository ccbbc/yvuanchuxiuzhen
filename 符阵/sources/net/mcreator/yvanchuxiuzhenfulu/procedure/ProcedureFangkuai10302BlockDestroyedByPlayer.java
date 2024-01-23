package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockTaoShuMiao;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFangkuai10302BlockDestroyedByPlayer.class */
public class ProcedureFangkuai10302BlockDestroyedByPlayer extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFangkuai10302BlockDestroyedByPlayer(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 162);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (Math.random() < 0.1d && !world.field_72995_K) {
            EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(BlockTaoShuMiao.block, 1));
            entityToSpawn.func_174867_a(10);
            world.func_72838_d(entityToSpawn);
        }
    }
}
