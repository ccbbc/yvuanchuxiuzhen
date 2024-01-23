package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.block.BlockCailiao1601;
import net.mcreator.fabaokuozhan.block.BlockCailiao2401;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureCailiao1601BlockAdded.class */
public class ProcedureCailiao1601BlockAdded extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCailiao1601BlockAdded(ElementsFabaokuozhanMod instance) {
        super(instance, 194);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c() == BlockCailiao1601.block.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos(x + 1, y, z + 1)).func_177230_c() == BlockCailiao1601.block.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos(x - 1, y, z + 1)).func_177230_c() == BlockCailiao1601.block.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos(x - 1, y, z - 1)).func_177230_c() == BlockCailiao1601.block.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos(x + 1, y, z - 1)).func_177230_c() == BlockCailiao1601.block.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos(x + 1, y, z)).func_177230_c() == BlockCailiao1601.block.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos(x - 1, y, z)).func_177230_c() == BlockCailiao1601.block.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos(x, y, z + 1)).func_177230_c() == BlockCailiao1601.block.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos(x + 1, y, z)).func_177230_c() == BlockCailiao1601.block.func_176223_P().func_177230_c()) {
            world.func_72942_c(new EntityLightningBolt(world, x + 1, y, z + 1, true));
            world.func_175698_g(new BlockPos(x + 1, y, z + 1));
            world.func_175698_g(new BlockPos(x - 1, y, z + 1));
            world.func_175698_g(new BlockPos(x + 1, y, z - 1));
            world.func_175698_g(new BlockPos(x - 1, y, z - 1));
            world.func_175698_g(new BlockPos(x - 1, y, z));
            world.func_175698_g(new BlockPos(x + 1, y, z));
            world.func_175698_g(new BlockPos(x, y, z + 1));
            world.func_175698_g(new BlockPos(x, y, z - 1));
            world.func_175698_g(new BlockPos(x, y + 1, z));
            world.func_180501_a(new BlockPos(x, y, z), BlockCailiao2401.block.func_176223_P(), 3);
        }
    }
}
