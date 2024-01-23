package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockFulu1601;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureJingLaoFangKuaiFangZhi.class */
public class ProcedureJingLaoFangKuaiFangZhi extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureJingLaoFangKuaiFangZhi(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 257);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        world.func_180501_a(new BlockPos(x + 3, y, z), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 3, y, z + 1), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 3, y, z + 2), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 3, y, z - 1), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 3, y, z - 2), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 3, y, z), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 3, y, z + 1), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 3, y, z + 2), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 3, y, z - 1), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 3, y, z - 2), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x, y, z + 3), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 1, y, z + 3), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 2, y, z + 3), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 1, y, z + 3), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 2, y, z + 3), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x, y, z - 3), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 1, y, z - 3), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 2, y, z - 3), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 1, y, z - 3), BlockFulu1601.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 2, y, z - 3), BlockFulu1601.block.func_176223_P(), 3);
        Map<String, Object> $_dependencies = new HashMap<>();
        $_dependencies.put("world", world);
        $_dependencies.put("x", Integer.valueOf(x));
        $_dependencies.put("y", Integer.valueOf(y));
        $_dependencies.put("z", Integer.valueOf(z));
        ProcedureJingLaoFangKuaiFangZhi2.executeProcedure($_dependencies);
        Map<String, Object> $_dependencies2 = new HashMap<>();
        $_dependencies2.put("world", world);
        $_dependencies2.put("x", Integer.valueOf(x));
        $_dependencies2.put("y", Integer.valueOf(y));
        $_dependencies2.put("z", Integer.valueOf(z));
        ProcedureJingLaoFangKuaiFangZhi3.executeProcedure($_dependencies2);
        Map<String, Object> $_dependencies3 = new HashMap<>();
        $_dependencies3.put("world", world);
        $_dependencies3.put("x", Integer.valueOf(x));
        $_dependencies3.put("y", Integer.valueOf(y));
        $_dependencies3.put("z", Integer.valueOf(z));
        ProcedureJingLaoFangKuaiFangZhi4.executeProcedure($_dependencies3);
        Map<String, Object> $_dependencies4 = new HashMap<>();
        $_dependencies4.put("world", world);
        $_dependencies4.put("x", Integer.valueOf(x));
        $_dependencies4.put("y", Integer.valueOf(y));
        $_dependencies4.put("z", Integer.valueOf(z));
        ProcedureJingLaoFangKuaiFangZhi5.executeProcedure($_dependencies4);
    }
}
