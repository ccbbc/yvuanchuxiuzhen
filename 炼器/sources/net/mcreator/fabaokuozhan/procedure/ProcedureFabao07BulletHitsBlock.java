package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.block.BlockFabao0702;
import net.minecraft.block.material.Material;
import net.minecraft.command.ICommandSender;
import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao07BulletHitsBlock.class */
public class ProcedureFabao07BulletHitsBlock extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao07BulletHitsBlock(ElementsFabaokuozhanMod instance) {
        super(instance, 122);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao07BulletHitsBlock.1
                public String func_70005_c_() {
                    return "";
                }

                public boolean func_70003_b(int permission, String command) {
                    return true;
                }

                public World func_130014_f_() {
                    return world;
                }

                public MinecraftServer func_184102_h() {
                    return world.func_73046_m();
                }

                public boolean func_174792_t_() {
                    return false;
                }

                public BlockPos func_180425_c() {
                    return new BlockPos(x, y, z);
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(x, y, z);
                }
            }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[rm=0,r=7] ~ ~ ~ shanghaiya 503\",CustomNameVisible:0b}");
        }
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x, y, z)).func_185904_a() == Material.field_151585_k || world.func_180495_p(new BlockPos(x, y, z)).func_185904_a() == Material.field_151582_l) {
            world.func_180501_a(new BlockPos(x, y, z), BlockFabao0702.block.func_176223_P(), 3);
        } else if (world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x, y + 1, z)).func_185904_a() == Material.field_151585_k || world.func_180495_p(new BlockPos(x, y + 1, z)).func_185904_a() == Material.field_151582_l) {
            world.func_180501_a(new BlockPos(x, y + 1, z), BlockFabao0702.block.func_176223_P(), 3);
        } else if (world.func_180495_p(new BlockPos(x, y, z + 1)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x, y, z + 1)).func_185904_a() == Material.field_151585_k || world.func_180495_p(new BlockPos(x, y, z + 1)).func_185904_a() == Material.field_151582_l) {
            world.func_180501_a(new BlockPos(x, y, z + 1), BlockFabao0702.block.func_176223_P(), 3);
        } else if (world.func_180495_p(new BlockPos(x, y, z - 1)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x, y, z - 1)).func_185904_a() == Material.field_151585_k || world.func_180495_p(new BlockPos(x, y, z - 1)).func_185904_a() == Material.field_151582_l) {
            world.func_180501_a(new BlockPos(x, y, z - 1), BlockFabao0702.block.func_176223_P(), 3);
        } else if (world.func_180495_p(new BlockPos(x - 1, y, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x - 1, y, z)).func_185904_a() == Material.field_151585_k || world.func_180495_p(new BlockPos(x - 1, y, z)).func_185904_a() == Material.field_151582_l) {
            world.func_180501_a(new BlockPos(x - 1, y, z), BlockFabao0702.block.func_176223_P(), 3);
        } else if (world.func_180495_p(new BlockPos(x + 1, y, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos(x + 1, y, z)).func_185904_a() == Material.field_151585_k || world.func_180495_p(new BlockPos(x + 1, y, z)).func_185904_a() == Material.field_151582_l) {
            world.func_180501_a(new BlockPos(x + 1, y, z), BlockFabao0702.block.func_176223_P(), 3);
        }
    }
}
