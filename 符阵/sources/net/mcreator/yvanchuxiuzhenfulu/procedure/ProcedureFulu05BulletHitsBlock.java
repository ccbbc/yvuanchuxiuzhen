package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockFangkuai10401;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockFangkuai10501;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu05BulletHitsBlock.class */
public class ProcedureFulu05BulletHitsBlock extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu05BulletHitsBlock(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 79);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockFangkuai10401.block.func_176223_P().func_177230_c()) {
            world.func_180501_a(new BlockPos(x, y, z), BlockFangkuai10501.block.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x + 1, y, z + 1)).func_177230_c() == BlockFangkuai10401.block.func_176223_P().func_177230_c()) {
            world.func_180501_a(new BlockPos(x + 1, y, z + 1), BlockFangkuai10501.block.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x + 1, y, z - 1)).func_177230_c() == BlockFangkuai10401.block.func_176223_P().func_177230_c()) {
            world.func_180501_a(new BlockPos(x + 1, y, z - 1), BlockFangkuai10501.block.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x - 1, y, z - 1)).func_177230_c() == BlockFangkuai10401.block.func_176223_P().func_177230_c()) {
            world.func_180501_a(new BlockPos(x - 1, y, z - 1), BlockFangkuai10501.block.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x - 1, y, z + 1)).func_177230_c() == BlockFangkuai10401.block.func_176223_P().func_177230_c()) {
            world.func_180501_a(new BlockPos(x - 1, y, z + 1), BlockFangkuai10501.block.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x, y, z + 1)).func_177230_c() == BlockFangkuai10401.block.func_176223_P().func_177230_c()) {
            world.func_180501_a(new BlockPos(x, y, z + 1), BlockFangkuai10501.block.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x, y, z - 1)).func_177230_c() == BlockFangkuai10401.block.func_176223_P().func_177230_c()) {
            world.func_180501_a(new BlockPos(x, y, z - 1), BlockFangkuai10501.block.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x - 1, y, z)).func_177230_c() == BlockFangkuai10401.block.func_176223_P().func_177230_c()) {
            world.func_180501_a(new BlockPos(x - 1, y, z), BlockFangkuai10501.block.func_176223_P(), 3);
        }
        if (world.func_180495_p(new BlockPos(x + 1, y, z)).func_177230_c() == BlockFangkuai10401.block.func_176223_P().func_177230_c()) {
            world.func_180501_a(new BlockPos(x + 1, y, z), BlockFangkuai10501.block.func_176223_P(), 3);
        }
        world.func_72942_c(new EntityLightningBolt(world, x, y, z, true));
        world.func_72942_c(new EntityLightningBolt(world, x + 2, y, z, true));
        world.func_72942_c(new EntityLightningBolt(world, x - 2, y, z, true));
        world.func_72942_c(new EntityLightningBolt(world, x, y, z - 2, true));
        world.func_72942_c(new EntityLightningBolt(world, x, y, z + 2, true));
        if (!world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu05BulletHitsBlock.1
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
            }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[r=7] ~ ~ ~ shanghaimb 183\",CustomNameVisible:0b}");
        }
    }
}
