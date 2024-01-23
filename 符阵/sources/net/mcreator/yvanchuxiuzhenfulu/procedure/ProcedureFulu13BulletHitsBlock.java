package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu13BulletHitsBlock.class */
public class ProcedureFulu13BulletHitsBlock extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu13BulletHitsBlock(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 95);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        for (int index0 = 0; index0 < 60; index0++) {
            if (Math.random() <= 0.5d) {
                world.func_72942_c(new EntityLightningBolt(world, x + new Random().nextInt(7), y, z + new Random().nextInt(7), true));
            } else {
                world.func_72942_c(new EntityLightningBolt(world, x - new Random().nextInt(7), y, z - new Random().nextInt(7), true));
            }
            if (Math.random() <= 0.5d) {
                world.func_72942_c(new EntityLightningBolt(world, x - new Random().nextInt(7), y, z + new Random().nextInt(7), true));
            } else {
                world.func_72942_c(new EntityLightningBolt(world, x + new Random().nextInt(7), y, z - new Random().nextInt(7), true));
            }
        }
        if (!world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu13BulletHitsBlock.1
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
            }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[r=7] ~ ~ ~ shanghaimb 417\",CustomNameVisible:0b}");
        }
    }
}
