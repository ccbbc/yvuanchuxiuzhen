package net.mcreator.yvanchuliandan.procedure;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.block.BlockZhongZi12102;
import net.mcreator.yvanchuliandan.block.BlockZhongZi12103;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureZhongZhi121.class */
public class ProcedureZhongZhi121 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureZhongZhi121(ElementsYvanchuliandanMod instance) {
        super(instance, 620);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121$1] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121$2] */
    /* JADX WARN: Type inference failed for: r0v30, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121$4] */
    /* JADX WARN: Type inference failed for: r0v33, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121$8] */
    /* JADX WARN: Type inference failed for: r0v36, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121$9] */
    /* JADX WARN: Type inference failed for: r0v86, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121$5] */
    /* JADX WARN: Type inference failed for: r1v21, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121$10] */
    /* JADX WARN: Type inference failed for: r1v39, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121$6] */
    /* JADX WARN: Type inference failed for: r2v21, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121$11] */
    /* JADX WARN: Type inference failed for: r2v46, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121$7] */
    /* JADX WARN: Type inference failed for: r2v55, types: [net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121$3] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        TileEntity _te;
        TileEntity _te2;
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "阶段") <= 2.0d) {
            if (!new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121.2
                public boolean getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74767_n(tag);
                    }
                    return false;
                }
            }.getValue(new BlockPos(x, y, z), "初始化")) {
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("CaoYao", 12.0d);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                    IBlockState _bs2 = world.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74780_a("阶段", 1.0d);
                    }
                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74780_a("随机值", new Random().nextInt(226) + 225);
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z);
                    TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                    IBlockState _bs4 = world.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74757_a("初始化", true);
                    }
                    world.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp5 = new BlockPos(x, y, z);
                TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                IBlockState _bs5 = world.func_180495_p(_bp5);
                if (_tileEntity5 != null) {
                    _tileEntity5.getTileData().func_74780_a("Time", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121.3
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Time") + 1.0d);
                }
                world.func_184138_a(_bp5, _bs5, _bs5, 3);
            }
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121.4
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 1.0d) {
                if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121.5
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "Time") >= new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121.6
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "随机值")) {
                    BlockPos _bp6 = new BlockPos(x, y, z);
                    IBlockState _bs6 = BlockZhongZi12102.block.func_176223_P();
                    IBlockState _bso = world.func_180495_p(_bp6);
                    UnmodifiableIterator it = _bso.func_177228_b().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<IProperty<?>, Comparable<?>> entry = (Map.Entry) it.next();
                        IProperty _property = entry.getKey();
                        if (_bs6.func_177227_a().contains(_property)) {
                            _bs6 = _bs6.func_177226_a(_property, entry.getValue());
                        }
                    }
                    TileEntity _te3 = world.func_175625_s(_bp6);
                    NBTTagCompound _bnbt = null;
                    if (_te3 != null) {
                        _bnbt = _te3.func_189515_b(new NBTTagCompound());
                        _te3.func_145843_s();
                    }
                    world.func_180501_a(_bp6, _bs6, 3);
                    if (_bnbt != null && (_te2 = world.func_175625_s(_bp6)) != null) {
                        try {
                            _te2.func_145839_a(_bnbt);
                        } catch (Exception e) {
                        }
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp7 = new BlockPos(x, y, z);
                        TileEntity _tileEntity6 = world.func_175625_s(_bp7);
                        IBlockState _bs7 = world.func_180495_p(_bp7);
                        if (_tileEntity6 != null) {
                            _tileEntity6.getTileData().func_74780_a("阶段", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121.7
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "阶段") + 1.0d);
                        }
                        world.func_184138_a(_bp7, _bs7, _bs7, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp8 = new BlockPos(x, y, z);
                        TileEntity _tileEntity7 = world.func_175625_s(_bp8);
                        IBlockState _bs8 = world.func_180495_p(_bp8);
                        if (_tileEntity7 != null) {
                            _tileEntity7.getTileData().func_74780_a("随机值", new Random().nextInt(576) + 575);
                        }
                        world.func_184138_a(_bp8, _bs8, _bs8, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp9 = new BlockPos(x, y, z);
                        TileEntity _tileEntity8 = world.func_175625_s(_bp9);
                        IBlockState _bs9 = world.func_180495_p(_bp9);
                        if (_tileEntity8 != null) {
                            _tileEntity8.getTileData().func_74780_a("Time", 0.0d);
                        }
                        world.func_184138_a(_bp9, _bs9, _bs9, 3);
                    }
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121.8
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阶段") == 2.0d && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121.9
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "Time") >= new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121.10
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "随机值")) {
                BlockPos _bp10 = new BlockPos(x, y, z);
                IBlockState _bs10 = BlockZhongZi12103.block.func_176223_P();
                IBlockState _bso2 = world.func_180495_p(_bp10);
                UnmodifiableIterator it2 = _bso2.func_177228_b().entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<IProperty<?>, Comparable<?>> entry2 = (Map.Entry) it2.next();
                    IProperty _property2 = entry2.getKey();
                    if (_bs10.func_177227_a().contains(_property2)) {
                        _bs10 = _bs10.func_177226_a(_property2, entry2.getValue());
                    }
                }
                TileEntity _te4 = world.func_175625_s(_bp10);
                NBTTagCompound _bnbt2 = null;
                if (_te4 != null) {
                    _bnbt2 = _te4.func_189515_b(new NBTTagCompound());
                    _te4.func_145843_s();
                }
                world.func_180501_a(_bp10, _bs10, 3);
                if (_bnbt2 != null && (_te = world.func_175625_s(_bp10)) != null) {
                    try {
                        _te.func_145839_a(_bnbt2);
                    } catch (Exception e2) {
                    }
                }
                if (!world.field_72995_K) {
                    BlockPos _bp11 = new BlockPos(x, y, z);
                    TileEntity _tileEntity9 = world.func_175625_s(_bp11);
                    IBlockState _bs11 = world.func_180495_p(_bp11);
                    if (_tileEntity9 != null) {
                        _tileEntity9.getTileData().func_74780_a("阶段", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureZhongZhi121.11
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阶段") + 1.0d);
                    }
                    world.func_184138_a(_bp11, _bs11, _bs11, 3);
                }
            }
        }
    }
}
