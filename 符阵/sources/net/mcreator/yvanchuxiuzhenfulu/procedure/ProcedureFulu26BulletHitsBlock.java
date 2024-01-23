package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu26BulletHitsBlock.class */
public class ProcedureFulu26BulletHitsBlock extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu26BulletHitsBlock(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 123);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
            worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu26BulletHitsBlock.1
                public String func_70005_c_() {
                    return "";
                }

                public boolean func_70003_b(int permission, String command) {
                    return true;
                }

                public World func_130014_f_() {
                    return worldServer;
                }

                public MinecraftServer func_184102_h() {
                    return worldServer.func_73046_m();
                }

                public boolean func_174792_t_() {
                    return false;
                }

                public BlockPos func_180425_c() {
                    return new BlockPos((int) (x + 0.5d), y, (int) (z + 0.5d));
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(x + 0.5d, y, z + 0.5d);
                }
            }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[r=7] ~ ~ ~ shanghaim 46\",CustomNameVisible:0b}");
        }
        if (worldServer instanceof WorldServer) {
            worldServer.func_175739_a(EnumParticleTypes.SWEEP_ATTACK, x + 0.5d, y, z + 0.5d, 20, 2.0d, 1.0d, 2.0d, 0.0d, new int[0]);
        }
    }
}
