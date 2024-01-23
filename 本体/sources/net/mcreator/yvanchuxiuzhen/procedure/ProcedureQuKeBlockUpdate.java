package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureQuKeBlockUpdate.class */
public class ProcedureQuKeBlockUpdate extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureQuKeBlockUpdate(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 409);
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBlockUpdate$1] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBlockUpdate$2] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBlockUpdate$9] */
    /* JADX WARN: Type inference failed for: r0v56, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBlockUpdate$4] */
    /* JADX WARN: Type inference failed for: r2v20, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBlockUpdate$8] */
    /* JADX WARN: Type inference failed for: r2v61, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBlockUpdate$3] */
    /* JADX WARN: Type inference failed for: r3v14, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBlockUpdate$6] */
    /* JADX WARN: Type inference failed for: r3v31, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBlockUpdate$7] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        $_dependencies.put("world", worldServer);
        $_dependencies.put("x", Integer.valueOf(x));
        $_dependencies.put("y", Integer.valueOf(y));
        $_dependencies.put("z", Integer.valueOf(z));
        ProcedureQuKeReset.executeProcedure($_dependencies);
        if (!new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBlockUpdate.1
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "防腐")) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBlockUpdate.2
                public boolean getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74767_n(tag);
                    }
                    return false;
                }
            }.getValue(new BlockPos(x, y, z), "夺舍进行")) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = worldServer.func_175625_s(_bp);
                    IBlockState _bs = worldServer.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("夺舍进行计时", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBlockUpdate.3
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "夺舍进行计时") + 1.0d);
                    }
                    worldServer.func_184138_a(_bp, _bs, _bs, 3);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.SMOKE_LARGE, x, y, z, 30, 3.0d, 3.0d, 3.0d, 0.1d, new int[0]);
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBlockUpdate.4
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "夺舍进行计时") >= 12.0d) {
                    if (!((World) worldServer).field_72995_K) {
                        BlockPos _bp2 = new BlockPos(x, y, z);
                        TileEntity _tileEntity2 = worldServer.func_175625_s(_bp2);
                        IBlockState _bs2 = worldServer.func_180495_p(_bp2);
                        if (_tileEntity2 != null) {
                            _tileEntity2.getTileData().func_74780_a("夺舍进行计时", 0.0d);
                        }
                        worldServer.func_184138_a(_bp2, _bs2, _bs2, 3);
                    }
                    if (!((World) worldServer).field_72995_K) {
                        BlockPos _bp3 = new BlockPos(x, y, z);
                        TileEntity _tileEntity3 = worldServer.func_175625_s(_bp3);
                        IBlockState _bs3 = worldServer.func_180495_p(_bp3);
                        if (_tileEntity3 != null) {
                            _tileEntity3.getTileData().func_74757_a("夺舍进行", false);
                        }
                        worldServer.func_184138_a(_bp3, _bs3, _bs3, 3);
                    }
                    if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                        worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBlockUpdate.5
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
                        }, "tp " + new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBlockUpdate.6
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "夺舍人") + " " + x + " " + y + " " + z + " " + new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBlockUpdate.7
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "方向") + " 0");
                    }
                    worldServer.func_175655_b(new BlockPos(x, y, z), false);
                    return;
                }
                return;
            }
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                TileEntity _tileEntity4 = worldServer.func_175625_s(_bp4);
                IBlockState _bs4 = worldServer.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74780_a("躯壳清除计时", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBlockUpdate.8
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "躯壳清除计时") + 1.0d);
                }
                worldServer.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureQuKeBlockUpdate.9
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "躯壳清除计时") >= 120.0d) {
                worldServer.func_175655_b(new BlockPos(x, y, z), false);
            }
        }
    }
}
