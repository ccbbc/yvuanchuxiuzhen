package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu2801UpdateTick.class */
public class ProcedureFulu2801UpdateTick extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu2801UpdateTick(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 135);
    }

    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2801UpdateTick$3] */
    /* JADX WARN: Type inference failed for: r2v6, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2801UpdateTick$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
            worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2801UpdateTick.1
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
                    return new BlockPos(x, y, z);
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(x, y, z);
                }
            }, "execute @e[rm=0,r=10] ~ ~ ~ shanghai");
        }
        if (worldServer instanceof WorldServer) {
            worldServer.func_175739_a(EnumParticleTypes.SWEEP_ATTACK, x + 0.5d, y, z + 0.5d, 30, 5.0d, 1.0d, 5.0d, 0.0d, new int[0]);
        }
        if (worldServer instanceof WorldServer) {
            worldServer.func_175739_a(EnumParticleTypes.SWEEP_ATTACK, x + 0.5d, y + 0.5d, z + 0.5d, 21, 4.0d, 1.0d, 4.0d, 0.0d, new int[0]);
        }
        if (worldServer instanceof WorldServer) {
            worldServer.func_175739_a(EnumParticleTypes.SWEEP_ATTACK, x + 0.5d, y + 1, z + 0.5d, 16, 3.5d, 1.0d, 3.5d, 0.0d, new int[0]);
        }
        if (worldServer instanceof WorldServer) {
            worldServer.func_175739_a(EnumParticleTypes.SWEEP_ATTACK, x + 0.5d, y + 1.5d, z + 0.5d, 12, 3.3d, 1.0d, 3.3d, 0.0d, new int[0]);
        }
        if (worldServer instanceof WorldServer) {
            worldServer.func_175739_a(EnumParticleTypes.SWEEP_ATTACK, x + 0.5d, y + 2, z + 0.5d, 10, 3.2d, 1.0d, 3.2d, 0.0d, new int[0]);
        }
        if (worldServer instanceof WorldServer) {
            worldServer.func_175739_a(EnumParticleTypes.SWEEP_ATTACK, x + 0.5d, y + 2.5d, z + 0.5d, 10, 3.2d, 1.0d, 3.2d, 0.0d, new int[0]);
        }
        if (worldServer instanceof WorldServer) {
            worldServer.func_175739_a(EnumParticleTypes.SWEEP_ATTACK, x + 0.5d, y + 3, z + 0.5d, 10, 3.2d, 1.0d, 3.2d, 0.0d, new int[0]);
        }
        if (!((World) worldServer).field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = worldServer.func_175625_s(_bp);
            IBlockState _bs = worldServer.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("cishu", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2801UpdateTick.2
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "cishu") + 1.0d);
            }
            worldServer.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2801UpdateTick.3
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "cishu") >= 20.0d) {
            worldServer.func_175698_g(new BlockPos(x, y, z));
        }
    }
}
