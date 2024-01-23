package net.mcreator.yvanchuxiuzhenfulu.procedure;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenfaqizhi02UpdateTick.class */
public class ProcedureZhenfaqizhi02UpdateTick extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhenfaqizhi02UpdateTick(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 171);
    }

    /* JADX WARN: Type inference failed for: r0v157, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$28] */
    /* JADX WARN: Type inference failed for: r0v171, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$2] */
    /* JADX WARN: Type inference failed for: r0v174, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$3] */
    /* JADX WARN: Type inference failed for: r0v176, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$6] */
    /* JADX WARN: Type inference failed for: r0v178, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$9] */
    /* JADX WARN: Type inference failed for: r0v180, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$12] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$1] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$15] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$16] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$19] */
    /* JADX WARN: Type inference failed for: r0v33, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$22] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$25] */
    /* JADX WARN: Type inference failed for: r2v105, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$14] */
    /* JADX WARN: Type inference failed for: r2v111, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$13] */
    /* JADX WARN: Type inference failed for: r2v122, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$11] */
    /* JADX WARN: Type inference failed for: r2v128, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$10] */
    /* JADX WARN: Type inference failed for: r2v139, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$8] */
    /* JADX WARN: Type inference failed for: r2v144, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$7] */
    /* JADX WARN: Type inference failed for: r2v155, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$5] */
    /* JADX WARN: Type inference failed for: r2v160, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$4] */
    /* JADX WARN: Type inference failed for: r2v22, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$27] */
    /* JADX WARN: Type inference failed for: r2v28, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$26] */
    /* JADX WARN: Type inference failed for: r2v39, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$24] */
    /* JADX WARN: Type inference failed for: r2v45, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$23] */
    /* JADX WARN: Type inference failed for: r2v56, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$21] */
    /* JADX WARN: Type inference failed for: r2v61, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$20] */
    /* JADX WARN: Type inference failed for: r2v72, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$18] */
    /* JADX WARN: Type inference failed for: r2v77, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick$17] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "power") >= 10.0d && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "power") < 20.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.3
                public EnumFacing getEnumFacing(BlockPos pos) {
                    try {
                        IBlockState _bs = worldServer.func_180495_p(pos);
                        UnmodifiableIterator it = _bs.func_177228_b().keySet().iterator();
                        while (it.hasNext()) {
                            PropertyDirection propertyDirection = (IProperty) it.next();
                            if (propertyDirection.func_177701_a().equals("facing")) {
                                return _bs.func_177229_b(propertyDirection);
                            }
                        }
                        return EnumFacing.NORTH;
                    } catch (Exception e) {
                        return EnumFacing.NORTH;
                    }
                }
            }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.NORTH) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z - 3);
                    TileEntity _tileEntity = worldServer.func_175625_s(_bp);
                    IBlockState _bs = worldServer.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.4
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z - 3), "power") + 10.0d);
                    }
                    worldServer.func_184138_a(_bp, _bs, _bs, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = worldServer.func_175625_s(_bp2);
                    IBlockState _bs2 = worldServer.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.5
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "power") - 10.0d);
                    }
                    worldServer.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x + 0.5d, y + 0.5d, z - 1.5d, 5, 0.2d, 0.1d, 1.0d, 0.0d, new int[0]);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x + 0.5d, y + 0.5d, z - 2.5d, 5, 0.2d, 0.1d, 1.0d, 0.0d, new int[0]);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.6
                public EnumFacing getEnumFacing(BlockPos pos) {
                    try {
                        IBlockState _bs3 = worldServer.func_180495_p(pos);
                        UnmodifiableIterator it = _bs3.func_177228_b().keySet().iterator();
                        while (it.hasNext()) {
                            PropertyDirection propertyDirection = (IProperty) it.next();
                            if (propertyDirection.func_177701_a().equals("facing")) {
                                return _bs3.func_177229_b(propertyDirection);
                            }
                        }
                        return EnumFacing.NORTH;
                    } catch (Exception e) {
                        return EnumFacing.NORTH;
                    }
                }
            }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.SOUTH) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z + 3);
                    TileEntity _tileEntity3 = worldServer.func_175625_s(_bp3);
                    IBlockState _bs3 = worldServer.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.7
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z + 3), "power") + 10.0d);
                    }
                    worldServer.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z);
                    TileEntity _tileEntity4 = worldServer.func_175625_s(_bp4);
                    IBlockState _bs4 = worldServer.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.8
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "power") - 10.0d);
                    }
                    worldServer.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x + 0.5d, y + 0.5d, z + 1.5d, 5, 0.2d, 0.1d, 1.0d, 0.0d, new int[0]);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x + 0.5d, y + 0.5d, z + 2.5d, 5, 0.2d, 0.1d, 1.0d, 0.0d, new int[0]);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.9
                public EnumFacing getEnumFacing(BlockPos pos) {
                    try {
                        IBlockState _bs5 = worldServer.func_180495_p(pos);
                        UnmodifiableIterator it = _bs5.func_177228_b().keySet().iterator();
                        while (it.hasNext()) {
                            PropertyDirection propertyDirection = (IProperty) it.next();
                            if (propertyDirection.func_177701_a().equals("facing")) {
                                return _bs5.func_177229_b(propertyDirection);
                            }
                        }
                        return EnumFacing.NORTH;
                    } catch (Exception e) {
                        return EnumFacing.NORTH;
                    }
                }
            }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.WEST) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x + 3, y, z);
                    TileEntity _tileEntity5 = worldServer.func_175625_s(_bp5);
                    IBlockState _bs5 = worldServer.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.10
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x + 3, y, z), "power") + 10.0d);
                    }
                    worldServer.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp6 = new BlockPos(x, y, z);
                    TileEntity _tileEntity6 = worldServer.func_175625_s(_bp6);
                    IBlockState _bs6 = worldServer.func_180495_p(_bp6);
                    if (_tileEntity6 != null) {
                        _tileEntity6.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.11
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "power") - 10.0d);
                    }
                    worldServer.func_184138_a(_bp6, _bs6, _bs6, 3);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x - 1.5d, y + 0.5d, z + 0.5d, 5, 1.0d, 0.1d, 0.2d, 0.0d, new int[0]);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x - 2.5d, y + 0.5d, z + 0.5d, 5, 1.0d, 0.1d, 0.2d, 0.0d, new int[0]);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.12
                public EnumFacing getEnumFacing(BlockPos pos) {
                    try {
                        IBlockState _bs7 = worldServer.func_180495_p(pos);
                        UnmodifiableIterator it = _bs7.func_177228_b().keySet().iterator();
                        while (it.hasNext()) {
                            PropertyDirection propertyDirection = (IProperty) it.next();
                            if (propertyDirection.func_177701_a().equals("facing")) {
                                return _bs7.func_177229_b(propertyDirection);
                            }
                        }
                        return EnumFacing.NORTH;
                    } catch (Exception e) {
                        return EnumFacing.NORTH;
                    }
                }
            }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.EAST) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp7 = new BlockPos(x - 3, y, z);
                    TileEntity _tileEntity7 = worldServer.func_175625_s(_bp7);
                    IBlockState _bs7 = worldServer.func_180495_p(_bp7);
                    if (_tileEntity7 != null) {
                        _tileEntity7.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.13
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x - 3, y, z), "power") + 10.0d);
                    }
                    worldServer.func_184138_a(_bp7, _bs7, _bs7, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp8 = new BlockPos(x, y, z);
                    TileEntity _tileEntity8 = worldServer.func_175625_s(_bp8);
                    IBlockState _bs8 = worldServer.func_180495_p(_bp8);
                    if (_tileEntity8 != null) {
                        _tileEntity8.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.14
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "power") - 10.0d);
                    }
                    worldServer.func_184138_a(_bp8, _bs8, _bs8, 3);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x + 1.5d, y + 0.5d, z + 0.5d, 5, 1.0d, 0.1d, 0.2d, 0.0d, new int[0]);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x + 2.5d, y + 0.5d, z + 0.5d, 5, 1.0d, 0.1d, 0.2d, 0.0d, new int[0]);
                }
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.15
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "power") >= 20.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.16
                public EnumFacing getEnumFacing(BlockPos pos) {
                    try {
                        IBlockState _bs9 = worldServer.func_180495_p(pos);
                        UnmodifiableIterator it = _bs9.func_177228_b().keySet().iterator();
                        while (it.hasNext()) {
                            PropertyDirection propertyDirection = (IProperty) it.next();
                            if (propertyDirection.func_177701_a().equals("facing")) {
                                return _bs9.func_177229_b(propertyDirection);
                            }
                        }
                        return EnumFacing.NORTH;
                    } catch (Exception e) {
                        return EnumFacing.NORTH;
                    }
                }
            }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.NORTH) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp9 = new BlockPos(x, y, z + 3);
                    TileEntity _tileEntity9 = worldServer.func_175625_s(_bp9);
                    IBlockState _bs9 = worldServer.func_180495_p(_bp9);
                    if (_tileEntity9 != null) {
                        _tileEntity9.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.17
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z + 3), "power") + 20.0d);
                    }
                    worldServer.func_184138_a(_bp9, _bs9, _bs9, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp10 = new BlockPos(x, y, z);
                    TileEntity _tileEntity10 = worldServer.func_175625_s(_bp10);
                    IBlockState _bs10 = worldServer.func_180495_p(_bp10);
                    if (_tileEntity10 != null) {
                        _tileEntity10.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.18
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "power") - 20.0d);
                    }
                    worldServer.func_184138_a(_bp10, _bs10, _bs10, 3);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x + 0.5d, y + 0.5d, z - 1.5d, 5, 0.2d, 0.1d, 1.0d, 0.0d, new int[0]);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x + 0.5d, y + 0.5d, z - 2.5d, 5, 0.2d, 0.1d, 1.0d, 0.0d, new int[0]);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.19
                public EnumFacing getEnumFacing(BlockPos pos) {
                    try {
                        IBlockState _bs11 = worldServer.func_180495_p(pos);
                        UnmodifiableIterator it = _bs11.func_177228_b().keySet().iterator();
                        while (it.hasNext()) {
                            PropertyDirection propertyDirection = (IProperty) it.next();
                            if (propertyDirection.func_177701_a().equals("facing")) {
                                return _bs11.func_177229_b(propertyDirection);
                            }
                        }
                        return EnumFacing.NORTH;
                    } catch (Exception e) {
                        return EnumFacing.NORTH;
                    }
                }
            }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.SOUTH) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp11 = new BlockPos(x, y, z - 3);
                    TileEntity _tileEntity11 = worldServer.func_175625_s(_bp11);
                    IBlockState _bs11 = worldServer.func_180495_p(_bp11);
                    if (_tileEntity11 != null) {
                        _tileEntity11.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.20
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z - 3), "power") + 20.0d);
                    }
                    worldServer.func_184138_a(_bp11, _bs11, _bs11, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp12 = new BlockPos(x, y, z);
                    TileEntity _tileEntity12 = worldServer.func_175625_s(_bp12);
                    IBlockState _bs12 = worldServer.func_180495_p(_bp12);
                    if (_tileEntity12 != null) {
                        _tileEntity12.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.21
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "power") - 20.0d);
                    }
                    worldServer.func_184138_a(_bp12, _bs12, _bs12, 3);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x + 0.5d, y + 0.5d, z + 1.5d, 5, 0.2d, 0.1d, 1.0d, 0.0d, new int[0]);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x + 0.5d, y + 0.5d, z + 2.5d, 5, 0.2d, 0.1d, 1.0d, 0.0d, new int[0]);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.22
                public EnumFacing getEnumFacing(BlockPos pos) {
                    try {
                        IBlockState _bs13 = worldServer.func_180495_p(pos);
                        UnmodifiableIterator it = _bs13.func_177228_b().keySet().iterator();
                        while (it.hasNext()) {
                            PropertyDirection propertyDirection = (IProperty) it.next();
                            if (propertyDirection.func_177701_a().equals("facing")) {
                                return _bs13.func_177229_b(propertyDirection);
                            }
                        }
                        return EnumFacing.NORTH;
                    } catch (Exception e) {
                        return EnumFacing.NORTH;
                    }
                }
            }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.WEST) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp13 = new BlockPos(x - 3, y, z);
                    TileEntity _tileEntity13 = worldServer.func_175625_s(_bp13);
                    IBlockState _bs13 = worldServer.func_180495_p(_bp13);
                    if (_tileEntity13 != null) {
                        _tileEntity13.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.23
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x - 3, y, z), "power") + 20.0d);
                    }
                    worldServer.func_184138_a(_bp13, _bs13, _bs13, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp14 = new BlockPos(x, y, z);
                    TileEntity _tileEntity14 = worldServer.func_175625_s(_bp14);
                    IBlockState _bs14 = worldServer.func_180495_p(_bp14);
                    if (_tileEntity14 != null) {
                        _tileEntity14.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.24
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "power") - 20.0d);
                    }
                    worldServer.func_184138_a(_bp14, _bs14, _bs14, 3);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x - 1.5d, y + 0.5d, z + 0.5d, 5, 1.0d, 0.1d, 0.2d, 0.0d, new int[0]);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x - 2.5d, y + 0.5d, z + 0.5d, 5, 1.0d, 0.1d, 0.2d, 0.0d, new int[0]);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.25
                public EnumFacing getEnumFacing(BlockPos pos) {
                    try {
                        IBlockState _bs15 = worldServer.func_180495_p(pos);
                        UnmodifiableIterator it = _bs15.func_177228_b().keySet().iterator();
                        while (it.hasNext()) {
                            PropertyDirection propertyDirection = (IProperty) it.next();
                            if (propertyDirection.func_177701_a().equals("facing")) {
                                return _bs15.func_177229_b(propertyDirection);
                            }
                        }
                        return EnumFacing.NORTH;
                    } catch (Exception e) {
                        return EnumFacing.NORTH;
                    }
                }
            }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.EAST) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp15 = new BlockPos(x + 3, y, z);
                    TileEntity _tileEntity15 = worldServer.func_175625_s(_bp15);
                    IBlockState _bs15 = worldServer.func_180495_p(_bp15);
                    if (_tileEntity15 != null) {
                        _tileEntity15.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.26
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x + 3, y, z), "power") + 20.0d);
                    }
                    worldServer.func_184138_a(_bp15, _bs15, _bs15, 3);
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp16 = new BlockPos(x, y, z);
                    TileEntity _tileEntity16 = worldServer.func_175625_s(_bp16);
                    IBlockState _bs16 = worldServer.func_180495_p(_bp16);
                    if (_tileEntity16 != null) {
                        _tileEntity16.getTileData().func_74780_a("power", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.27
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "power") - 20.0d);
                    }
                    worldServer.func_184138_a(_bp16, _bs16, _bs16, 3);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x + 1.5d, y + 0.5d, z + 0.5d, 5, 1.0d, 0.1d, 0.2d, 0.0d, new int[0]);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.PORTAL, x + 2.5d, y + 0.5d, z + 0.5d, 5, 1.0d, 0.1d, 0.2d, 0.0d, new int[0]);
                }
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi02UpdateTick.28
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "power") > 100.0d && !((World) worldServer).field_72995_K) {
            BlockPos _bp17 = new BlockPos(x, y, z);
            TileEntity _tileEntity17 = worldServer.func_175625_s(_bp17);
            IBlockState _bs17 = worldServer.func_180495_p(_bp17);
            if (_tileEntity17 != null) {
                _tileEntity17.getTileData().func_74780_a("power", 100.0d);
            }
            worldServer.func_184138_a(_bp17, _bs17, _bs17, 3);
        }
    }
}
