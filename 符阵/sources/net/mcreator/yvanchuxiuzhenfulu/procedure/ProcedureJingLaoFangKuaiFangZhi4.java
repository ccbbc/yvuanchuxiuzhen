package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockFulu1601;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureJingLaoFangKuaiFangZhi4.class */
public class ProcedureJingLaoFangKuaiFangZhi4 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureJingLaoFangKuaiFangZhi4(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 260);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        world.func_180501_a(new BlockPos(x, y + 3, z), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x, y + 3, z + 1), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x, y + 3, z - 1), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 1, y + 3, z), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 1, y + 3, z), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 1, y + 3, z + 1), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 1, y + 3, z - 1), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 1, y + 3, z + 1), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 1, y + 3, z - 1), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 2, y + 3, z + 1), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 2, y + 3, z - 1), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 2, y + 3, z + 1), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 2, y + 3, z - 1), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 1, y + 3, z + 2), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 1, y + 3, z - 2), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 1, y + 3, z + 2), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 1, y + 3, z - 2), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 2, y + 3, z + 2), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 2, y + 3, z - 2), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 2, y + 3, z + 2), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 2, y + 3, z - 2), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 2, y + 3, z + 2), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 2, y + 3, z - 2), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 2, y + 3, z + 2), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 2, y + 3, z - 2), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x, y + 3, z + 2), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x, y + 3, z - 2), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 2, y + 3, z), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 2, y + 3, z), BlockFulu1601.block.func_176223_P(), 3);
    }
}
