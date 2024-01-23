package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu02;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureCaientity1303UpdateTick.class */
public class ProcedureCaientity1303UpdateTick extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCaientity1303UpdateTick(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityMoXiu02.ENTITYID_RANGED);
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureCaientity1303UpdateTick$2] */
    /* JADX WARN: Type inference failed for: r2v10, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureCaientity1303UpdateTick$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (worldServer instanceof WorldServer) {
            worldServer.func_175739_a(EnumParticleTypes.TOTEM, x + 0.5d, y + 0.5d, z + 0.5d, 5, 0.2d, 1.0d, 0.2d, 1.0d, new int[0]);
        }
        if (!((World) worldServer).field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = worldServer.func_175625_s(_bp);
            IBlockState _bs = worldServer.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("shijian", new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureCaientity1303UpdateTick.1
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "shijian") + 1.0d);
            }
            worldServer.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureCaientity1303UpdateTick.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "shijian") >= 40.0d) {
            if (!((World) worldServer).field_72995_K) {
                worldServer.func_72876_a((Entity) null, x, y, z, 2.0f, true);
            }
            if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureCaientity1303UpdateTick.3
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
                        return new BlockPos((int) (x + 0.5d), y + 2, (int) (z + 0.5d));
                    }

                    public Vec3d func_174791_d() {
                        return new Vec3d(x + 0.5d, y + 2, z + 0.5d);
                    }
                }, "summon yvanchuyaoshou:caientity13 ~ ~1 ~ {Passengers:[{id:\"yvanchuyaoshou:caientity1301\"}]}");
            }
            worldServer.func_175698_g(new BlockPos(x, y, z));
        }
    }
}
