package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu0601NeighbourBlockChanges.class */
public class ProcedureFulu0601NeighbourBlockChanges extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu0601NeighbourBlockChanges(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 91);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if ((world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == Blocks.field_150480_ab.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x, y - 1, z)).func_177230_c() == Blocks.field_150480_ab.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x - 1, y, z)).func_177230_c() == Blocks.field_150480_ab.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x + 1, y, z)).func_177230_c() == Blocks.field_150480_ab.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x, y, z + 1)).func_177230_c() == Blocks.field_150480_ab.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x, y, z - 1)).func_177230_c() == Blocks.field_150480_ab.func_176223_P().func_177230_c()) && !world.field_72995_K) {
            world.func_72876_a((Entity) null, x, y, z, 8.0f, true);
        }
    }
}
