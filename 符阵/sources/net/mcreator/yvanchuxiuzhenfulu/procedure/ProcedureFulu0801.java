package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu0801.class */
public class ProcedureFulu0801 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu0801(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 85);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (world.func_180495_p(new BlockPos(x + 3, y, z + 2)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x + 3, y, z + 2)).func_185904_a() == Material.field_151582_l || world.func_180495_p(new BlockPos(x + 3, y, z + 2)).func_185904_a() == Material.field_151585_k) {
            world.func_180501_a(new BlockPos(x + 3, y, z + 2), Blocks.field_150480_ab.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x + 3, y, z + 1)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x + 3, y, z + 1)).func_185904_a() == Material.field_151582_l || world.func_180495_p(new BlockPos(x + 3, y, z + 1)).func_185904_a() == Material.field_151585_k) {
            world.func_180501_a(new BlockPos(x + 3, y, z + 1), Blocks.field_150480_ab.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x + 3, y, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x + 3, y, z)).func_185904_a() == Material.field_151582_l || world.func_180495_p(new BlockPos(x + 3, y, z)).func_185904_a() == Material.field_151585_k) {
            world.func_180501_a(new BlockPos(x + 3, y, z), Blocks.field_150480_ab.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x + 3, y, z - 1)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x + 3, y, z - 1)).func_185904_a() == Material.field_151582_l || world.func_180495_p(new BlockPos(x + 3, y, z - 1)).func_185904_a() == Material.field_151585_k) {
            world.func_180501_a(new BlockPos(x + 3, y, z - 1), Blocks.field_150480_ab.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x + 3, y, z - 2)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x + 3, y, z - 2)).func_185904_a() == Material.field_151582_l || world.func_180495_p(new BlockPos(x + 3, y, z - 2)).func_185904_a() == Material.field_151585_k) {
            world.func_180501_a(new BlockPos(x + 3, y, z - 2), Blocks.field_150480_ab.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x - 3, y, z + 2)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x - 3, y, z + 2)).func_185904_a() == Material.field_151582_l || world.func_180495_p(new BlockPos(x - 3, y, z + 2)).func_185904_a() == Material.field_151585_k) {
            world.func_180501_a(new BlockPos(x - 3, y, z + 2), Blocks.field_150480_ab.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x - 3, y, z + 1)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x - 3, y, z + 1)).func_185904_a() == Material.field_151582_l || world.func_180495_p(new BlockPos(x - 3, y, z + 1)).func_185904_a() == Material.field_151585_k) {
            world.func_180501_a(new BlockPos(x - 3, y, z + 1), Blocks.field_150480_ab.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x - 3, y, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x - 3, y, z)).func_185904_a() == Material.field_151582_l || world.func_180495_p(new BlockPos(x - 3, y, z)).func_185904_a() == Material.field_151585_k) {
            world.func_180501_a(new BlockPos(x - 3, y, z), Blocks.field_150480_ab.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x - 3, y, z - 1)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x - 3, y, z - 1)).func_185904_a() == Material.field_151582_l || world.func_180495_p(new BlockPos(x - 3, y, z - 1)).func_185904_a() == Material.field_151585_k) {
            world.func_180501_a(new BlockPos(x - 3, y, z - 1), Blocks.field_150480_ab.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x - 3, y, z - 2)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x - 3, y, z - 2)).func_185904_a() == Material.field_151582_l || world.func_180495_p(new BlockPos(x - 3, y, z - 2)).func_185904_a() == Material.field_151585_k) {
            world.func_180501_a(new BlockPos(x - 3, y, z - 2), Blocks.field_150480_ab.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x - 2, y, z - 3)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x - 2, y, z - 3)).func_185904_a() == Material.field_151582_l || world.func_180495_p(new BlockPos(x - 2, y, z - 3)).func_185904_a() == Material.field_151585_k) {
            world.func_180501_a(new BlockPos(x - 2, y, z - 3), Blocks.field_150480_ab.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x - 1, y, z - 3)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x - 1, y, z - 3)).func_185904_a() == Material.field_151582_l || world.func_180495_p(new BlockPos(x - 1, y, z - 3)).func_185904_a() == Material.field_151585_k) {
            world.func_180501_a(new BlockPos(x - 1, y, z - 3), Blocks.field_150480_ab.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x, y, z - 3)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x, y, z - 3)).func_185904_a() == Material.field_151582_l || world.func_180495_p(new BlockPos(x, y, z - 3)).func_185904_a() == Material.field_151585_k) {
            world.func_180501_a(new BlockPos(x, y, z - 3), Blocks.field_150480_ab.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x + 1, y, z - 3)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x + 1, y, z - 3)).func_185904_a() == Material.field_151582_l || world.func_180495_p(new BlockPos(x + 1, y, z - 3)).func_185904_a() == Material.field_151585_k) {
            world.func_180501_a(new BlockPos(x + 1, y, z - 3), Blocks.field_150480_ab.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x + 2, y, z - 3)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x + 2, y, z - 3)).func_185904_a() == Material.field_151582_l || world.func_180495_p(new BlockPos(x + 2, y, z - 3)).func_185904_a() == Material.field_151585_k) {
            world.func_180501_a(new BlockPos(x + 2, y, z - 3), Blocks.field_150480_ab.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x + 2, y, z + 3)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x + 2, y, z + 3)).func_185904_a() == Material.field_151582_l || world.func_180495_p(new BlockPos(x + 2, y, z + 3)).func_185904_a() == Material.field_151585_k) {
            world.func_180501_a(new BlockPos(x + 2, y, z + 3), Blocks.field_150480_ab.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x + 1, y, z + 3)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x + 1, y, z + 3)).func_185904_a() == Material.field_151582_l || world.func_180495_p(new BlockPos(x + 1, y, z + 3)).func_185904_a() == Material.field_151585_k) {
            world.func_180501_a(new BlockPos(x + 1, y, z + 3), Blocks.field_150480_ab.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x, y, z + 3)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x, y, z + 3)).func_185904_a() == Material.field_151582_l || world.func_180495_p(new BlockPos(x, y, z + 3)).func_185904_a() == Material.field_151585_k) {
            world.func_180501_a(new BlockPos(x, y, z + 3), Blocks.field_150480_ab.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x - 1, y, z + 3)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x - 1, y, z + 3)).func_185904_a() == Material.field_151582_l || world.func_180495_p(new BlockPos(x - 1, y, z + 3)).func_185904_a() == Material.field_151585_k) {
            world.func_180501_a(new BlockPos(x - 1, y, z + 3), Blocks.field_150480_ab.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x - 2, y, z + 3)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x - 2, y, z + 3)).func_185904_a() == Material.field_151582_l || world.func_180495_p(new BlockPos(x - 2, y, z + 3)).func_185904_a() == Material.field_151585_k) {
            world.func_180501_a(new BlockPos(x - 2, y, z + 3), Blocks.field_150480_ab.func_176223_P(), 3);
        }
    }
}
