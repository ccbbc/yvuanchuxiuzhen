package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockZhenfaqizhi01;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockZhenfaqizhi02;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenfaxiaoguoZONG.class */
public class ProcedureZhenfaxiaoguoZONG extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhenfaxiaoguoZONG(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 180);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$1] */
    /* JADX WARN: Type inference failed for: r0v238, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$8] */
    /* JADX WARN: Type inference failed for: r0v25, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$2] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$7] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$14] */
    /* JADX WARN: Type inference failed for: r0v64, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$15] */
    /* JADX WARN: Type inference failed for: r0v69, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$19] */
    /* JADX WARN: Type inference failed for: r0v72, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$21] */
    /* JADX WARN: Type inference failed for: r0v75, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$23] */
    /* JADX WARN: Type inference failed for: r0v78, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$25] */
    /* JADX WARN: Type inference failed for: r0v81, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$27] */
    /* JADX WARN: Type inference failed for: r0v84, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$29] */
    /* JADX WARN: Type inference failed for: r0v87, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$31] */
    /* JADX WARN: Type inference failed for: r0v90, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$33] */
    /* JADX WARN: Type inference failed for: r0v93, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$35] */
    /* JADX WARN: Type inference failed for: r1v127, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$9] */
    /* JADX WARN: Type inference failed for: r1v36, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$16] */
    /* JADX WARN: Type inference failed for: r2v110, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$17] */
    /* JADX WARN: Type inference failed for: r2v134, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$12] */
    /* JADX WARN: Type inference failed for: r2v139, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$10] */
    /* JADX WARN: Type inference failed for: r2v178, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$6] */
    /* JADX WARN: Type inference failed for: r2v183, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$5] */
    /* JADX WARN: Type inference failed for: r2v189, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$4] */
    /* JADX WARN: Type inference failed for: r2v195, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$3] */
    /* JADX WARN: Type inference failed for: r3v61, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$18] */
    /* JADX WARN: Type inference failed for: r3v89, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$13] */
    /* JADX WARN: Type inference failed for: r3v96, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$11] */
    /* JADX WARN: Type inference failed for: r5v61, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$38] */
    /* JADX WARN: Type inference failed for: r6v49, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$39] */
    /* JADX WARN: Type inference failed for: r6v51, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$40] */
    /* JADX WARN: Type inference failed for: r8v12, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG$41] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (!new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.1
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "阵法控制")) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.2
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "zhenfamingcheng").equals("聚灵阵")) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp = new BlockPos(x + 2, y, z);
                    TileEntity _tileEntity = worldServer.func_175625_s(_bp);
                    IBlockState _bs = worldServer.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.3
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x + 2, y, z), "power") + 15.0d);
                    }
                    worldServer.func_184138_a(_bp, _bs, _bs, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x - 2, y, z);
                    TileEntity _tileEntity2 = worldServer.func_175625_s(_bp2);
                    IBlockState _bs2 = worldServer.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.4
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x - 2, y, z), "power") + 15.0d);
                    }
                    worldServer.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z + 2);
                    TileEntity _tileEntity3 = worldServer.func_175625_s(_bp3);
                    IBlockState _bs3 = worldServer.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.5
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z + 2), "power") + 15.0d);
                    }
                    worldServer.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z - 2);
                    TileEntity _tileEntity4 = worldServer.func_175625_s(_bp4);
                    IBlockState _bs4 = worldServer.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.6
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z - 2), "power") + 15.0d);
                    }
                    worldServer.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x + 1.5d, y + 0.5d, z + 0.5d, 5, 1.0d, 0.1d, 0.1d, 0.0d, new int[0]);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x + 2.5d, y + 0.5d, z + 0.5d, 5, 1.0d, 0.1d, 0.1d, 0.0d, new int[0]);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x - 1.5d, y + 0.5d, z + 0.5d, 5, 1.0d, 0.1d, 0.1d, 0.0d, new int[0]);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x - 2.5d, y + 0.5d, z + 0.5d, 5, 1.0d, 0.1d, 0.1d, 0.0d, new int[0]);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x + 0.5d, y + 0.5d, z + 1.5d, 5, 0.1d, 0.1d, 1.0d, 0.0d, new int[0]);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x + 0.5d, y + 0.5d, z + 2.5d, 5, 0.1d, 0.1d, 1.0d, 0.0d, new int[0]);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x + 0.5d, y + 0.5d, z - 1.5d, 5, 0.1d, 0.1d, 1.0d, 0.0d, new int[0]);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x + 0.5d, y + 0.5d, z - 2.5d, 5, 0.1d, 0.1d, 1.0d, 0.0d, new int[0]);
                }
                if (worldServer.func_180495_p(new BlockPos(x + 2, y, z)).func_177230_c() != BlockZhenfaqizhi02.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 2, y, z)).func_177230_c() != BlockZhenfaqizhi02.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y, z + 2)).func_177230_c() != BlockZhenfaqizhi02.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x, y, z - 2)).func_177230_c() != BlockZhenfaqizhi02.block.func_176223_P().func_177230_c()) {
                    if (!((World) worldServer).field_72995_K) {
                        BlockPos _bp5 = new BlockPos(x, y, z);
                        TileEntity _tileEntity5 = worldServer.func_175625_s(_bp5);
                        IBlockState _bs5 = worldServer.func_180495_p(_bp5);
                        if (_tileEntity5 != null) {
                            _tileEntity5.getTileData().func_74778_a("zhenfamingcheng", "");
                        }
                        worldServer.func_184138_a(_bp5, _bs5, _bs5, 3);
                    }
                    if (worldServer instanceof WorldServer) {
                        worldServer.func_175739_a(EnumParticleTypes.VILLAGER_ANGRY, x + 0.5d, y, z + 0.5d, 10, 3.0d, 1.0d, 3.0d, 0.0d, new int[0]);
                    }
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.7
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "zhenfamingcheng").equals("补元阵") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.8
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "power") >= new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.9
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") * 5.0d) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp6 = new BlockPos(x, y, z);
                    TileEntity _tileEntity6 = worldServer.func_175625_s(_bp6);
                    IBlockState _bs6 = worldServer.func_180495_p(_bp6);
                    if (_tileEntity6 != null) {
                        _tileEntity6.getTileData().func_74780_a("base", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.10
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "base") + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.11
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "qianghua"));
                    }
                    worldServer.func_184138_a(_bp6, _bs6, _bs6, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp7 = new BlockPos(x, y, z);
                    TileEntity _tileEntity7 = worldServer.func_175625_s(_bp7);
                    IBlockState _bs7 = worldServer.func_180495_p(_bp7);
                    if (_tileEntity7 != null) {
                        _tileEntity7.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.12
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "power") - (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.13
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "qianghua") * 5.0d));
                    }
                    worldServer.func_184138_a(_bp7, _bs7, _bs7, 3);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.CRIT_MAGIC, x + 0.5d, y + 0.5d, z + 0.5d, 10, 2.0d, 2.0d, 2.0d, 0.0d, new int[0]);
                }
                if (worldServer.func_180495_p(new BlockPos(x + 1, y, z + 1)).func_177230_c() != BlockZhenfaqizhi02.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 1, y, z + 1)).func_177230_c() != BlockZhenfaqizhi02.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 1, y, z - 1)).func_177230_c() != BlockZhenfaqizhi02.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 1, y, z - 1)).func_177230_c() != BlockZhenfaqizhi02.block.func_176223_P().func_177230_c()) {
                    if (!((World) worldServer).field_72995_K) {
                        BlockPos _bp8 = new BlockPos(x, y, z);
                        TileEntity _tileEntity8 = worldServer.func_175625_s(_bp8);
                        IBlockState _bs8 = worldServer.func_180495_p(_bp8);
                        if (_tileEntity8 != null) {
                            _tileEntity8.getTileData().func_74778_a("zhenfamingcheng", "");
                        }
                        worldServer.func_184138_a(_bp8, _bs8, _bs8, 3);
                    }
                    if (worldServer instanceof WorldServer) {
                        worldServer.func_175739_a(EnumParticleTypes.VILLAGER_ANGRY, x + 0.5d, y, z + 0.5d, 10, 3.0d, 1.0d, 3.0d, 0.0d, new int[0]);
                    }
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.14
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "zhenfamingcheng").equals("落雷阵") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.15
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "power") >= new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.16
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "qianghua") * 5.0d) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp9 = new BlockPos(x, y, z);
                    TileEntity _tileEntity9 = worldServer.func_175625_s(_bp9);
                    IBlockState _bs9 = worldServer.func_180495_p(_bp9);
                    if (_tileEntity9 != null) {
                        _tileEntity9.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.17
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "power") - (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.18
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "qianghua") * 5.0d));
                    }
                    worldServer.func_184138_a(_bp9, _bs9, _bs9, 3);
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.19
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghua") == 1.0d) {
                    if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                        worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.20
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
                                return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                            }

                            public Vec3d func_174791_d() {
                                return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                            }
                        }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua01");
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.21
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghua") == 2.0d) {
                    if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                        worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.22
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
                                return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                            }

                            public Vec3d func_174791_d() {
                                return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                            }
                        }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua02");
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.23
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghua") == 3.0d) {
                    if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                        worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.24
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
                                return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                            }

                            public Vec3d func_174791_d() {
                                return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                            }
                        }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua03");
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.25
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghua") == 4.0d) {
                    if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                        worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.26
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
                                return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                            }

                            public Vec3d func_174791_d() {
                                return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                            }
                        }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua04");
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.27
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghua") == 5.0d) {
                    if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                        worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.28
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
                                return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                            }

                            public Vec3d func_174791_d() {
                                return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                            }
                        }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua05");
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.29
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghua") == 6.0d) {
                    if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                        worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.30
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
                                return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                            }

                            public Vec3d func_174791_d() {
                                return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                            }
                        }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua06");
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.31
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghua") == 7.0d) {
                    if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                        worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.32
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
                                return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                            }

                            public Vec3d func_174791_d() {
                                return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                            }
                        }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua07");
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.33
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghua") == 8.0d) {
                    if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                        worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.34
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
                                return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                            }

                            public Vec3d func_174791_d() {
                                return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                            }
                        }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua08");
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.35
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = worldServer.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghua") >= 9.0d && !((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.36
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
                            return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                        }
                    }, "execute @e[rm=0,r=15] ~ ~ ~ qianghua09");
                }
                if (!((World) worldServer).field_72995_K && worldServer.func_73046_m() != null) {
                    worldServer.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.37
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
                            return new BlockPos((int) (x + 0.5d), (int) (y + 0.5d), (int) (z + 0.5d));
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x + 0.5d, y + 0.5d, z + 0.5d);
                        }
                    }, "execute @e[rm=0,r=15] ~ ~ ~ yaoji01");
                }
                worldServer.func_72942_c(new EntityLightningBolt(worldServer, (int) (x + (Math.random() * 10.0d)), y, (int) (z + (Math.random() * 10.0d)), false));
                worldServer.func_72942_c(new EntityLightningBolt(worldServer, (int) (x - (Math.random() * 10.0d)), y, (int) (z + (Math.random() * 10.0d)), false));
                worldServer.func_72942_c(new EntityLightningBolt(worldServer, (int) (x + (Math.random() * 10.0d)), y, (int) (z - (Math.random() * 10.0d)), false));
                worldServer.func_72942_c(new EntityLightningBolt(worldServer, (int) (x - (Math.random() * 10.0d)), y, (int) (z - (Math.random() * 10.0d)), false));
                worldServer.func_72942_c(new EntityLightningBolt(worldServer, (int) (x + 0.5d), y, (int) (z + 0.5d), false));
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.CLOUD, x + 0.5d, y + 0.5d, z + 0.5d, (int) (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.38
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "qianghua") * new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.39
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "qianghua")), new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.40
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "qianghua") * 3.0d, 0.0d, new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaxiaoguoZONG.41
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "qianghua") * 3.0d, 0.0d, new int[0]);
                }
                if (worldServer.func_180495_p(new BlockPos(x + 2, y, z + 2)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 2, y, z + 2)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 2, y, z - 2)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 2, y, z - 2)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 1, y, z - 2)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 2, y, z - 1)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x + 1, y, z + 2)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos(x - 2, y, z + 1)).func_177230_c() != BlockZhenfaqizhi01.block.func_176223_P().func_177230_c()) {
                    if (!((World) worldServer).field_72995_K) {
                        BlockPos _bp10 = new BlockPos(x, y, z);
                        TileEntity _tileEntity10 = worldServer.func_175625_s(_bp10);
                        IBlockState _bs10 = worldServer.func_180495_p(_bp10);
                        if (_tileEntity10 != null) {
                            _tileEntity10.getTileData().func_74778_a("zhenfamingcheng", "");
                        }
                        worldServer.func_184138_a(_bp10, _bs10, _bs10, 3);
                    }
                    if (worldServer instanceof WorldServer) {
                        worldServer.func_175739_a(EnumParticleTypes.VILLAGER_ANGRY, x + 0.5d, y, z + 0.5d, 10, 3.0d, 1.0d, 3.0d, 0.0d, new int[0]);
                    }
                }
            }
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("world", worldServer);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureZhenfaxiaoguo01.executeProcedure($_dependencies);
            Map<String, Object> $_dependencies2 = new HashMap<>();
            $_dependencies2.put("world", worldServer);
            $_dependencies2.put("x", Integer.valueOf(x));
            $_dependencies2.put("y", Integer.valueOf(y));
            $_dependencies2.put("z", Integer.valueOf(z));
            ProcedureZhenfaxiaoguo02.executeProcedure($_dependencies2);
            Map<String, Object> $_dependencies3 = new HashMap<>();
            $_dependencies3.put("world", worldServer);
            $_dependencies3.put("x", Integer.valueOf(x));
            $_dependencies3.put("y", Integer.valueOf(y));
            $_dependencies3.put("z", Integer.valueOf(z));
            ProcedureZhenfaxiaoguo03.executeProcedure($_dependencies3);
        }
    }
}
