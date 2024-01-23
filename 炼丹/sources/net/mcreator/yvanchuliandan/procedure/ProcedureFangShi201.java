package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureFangShi201.class */
public class ProcedureFangShi201 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureFangShi201(ElementsYvanchuliandanMod instance) {
        super(instance, 803);
    }

    /* JADX WARN: Type inference failed for: r0v152, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201$5] */
    /* JADX WARN: Type inference failed for: r0v155, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201$7] */
    /* JADX WARN: Type inference failed for: r0v174, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201$14] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201$1] */
    /* JADX WARN: Type inference failed for: r0v25, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201$2] */
    /* JADX WARN: Type inference failed for: r0v39, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201$16] */
    /* JADX WARN: Type inference failed for: r2v101, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201$9] */
    /* JADX WARN: Type inference failed for: r2v105, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201$3] */
    /* JADX WARN: Type inference failed for: r2v27, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201$18] */
    /* JADX WARN: Type inference failed for: r2v34, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201$17] */
    /* JADX WARN: Type inference failed for: r2v65, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201$6] */
    /* JADX WARN: Type inference failed for: r2v81, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201$13] */
    /* JADX WARN: Type inference failed for: r2v99, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201$8] */
    /* JADX WARN: Type inference failed for: r3v22, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201$15] */
    /* JADX WARN: Type inference failed for: r3v29, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201$4] */
    /* JADX WARN: Type inference failed for: r3v43, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201$10] */
    /* JADX WARN: Type inference failed for: r3v48, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201$12] */
    /* JADX WARN: Type inference failed for: r6v10, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201$11] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201.1
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "服务器")) {
            if (!new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201.2
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
                        _tileEntity.getTileData().func_74780_a("序列", 1.0d);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                    IBlockState _bs2 = world.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74780_a("随机次数", 0.0d);
                    }
                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74778_a("已生成序列", "");
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                for (int index0 = 0; index0 < 210; index0++) {
                    if (!world.field_72995_K) {
                        BlockPos _bp4 = new BlockPos(x, y, z);
                        TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                        IBlockState _bs4 = world.func_180495_p(_bp4);
                        if (_tileEntity4 != null) {
                            _tileEntity4.getTileData().func_74780_a("随机", new Random().nextInt(180) + 1);
                        }
                        world.func_184138_a(_bp4, _bs4, _bs4, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp5 = new BlockPos(x, y, z);
                        TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                        IBlockState _bs5 = world.func_180495_p(_bp5);
                        if (_tileEntity5 != null) {
                            _tileEntity5.getTileData().func_74780_a("随机次数", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201.3
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "随机次数") + 1.0d);
                        }
                        world.func_184138_a(_bp5, _bs5, _bs5, 3);
                    }
                    if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201.5
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201.4
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")) == 0.0d && !new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201.7
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "已生成序列").contains("[" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201.6
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "随机") + "]")) {
                        if (!world.field_72995_K) {
                            BlockPos _bp6 = new BlockPos(x, y, z);
                            TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                            IBlockState _bs6 = world.func_180495_p(_bp6);
                            if (_tileEntity6 != null) {
                                _tileEntity6.getTileData().func_74780_a("初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201.8
                                    public double getValue(BlockPos pos, String tag) {
                                        TileEntity tileEntity = world.func_175625_s(pos);
                                        if (tileEntity != null) {
                                            return tileEntity.getTileData().func_74769_h(tag);
                                        }
                                        return -1.0d;
                                    }
                                }.getValue(new BlockPos(x, y, z), "序列"), new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201.9
                                    public double getValue(BlockPos pos, String tag) {
                                        TileEntity tileEntity = world.func_175625_s(pos);
                                        if (tileEntity != null) {
                                            return tileEntity.getTileData().func_74769_h(tag);
                                        }
                                        return -1.0d;
                                    }
                                }.getValue(new BlockPos(x, y, z), "随机"));
                            }
                            world.func_184138_a(_bp6, _bs6, _bs6, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp7 = new BlockPos(x, y, z);
                            TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                            IBlockState _bs7 = world.func_180495_p(_bp7);
                            if (_tileEntity7 != null) {
                                _tileEntity7.getTileData().func_74778_a("已生成序列", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201.10
                                    public String getValue(BlockPos pos, String tag) {
                                        TileEntity tileEntity = world.func_175625_s(pos);
                                        if (tileEntity != null) {
                                            return tileEntity.getTileData().func_74779_i(tag);
                                        }
                                        return "";
                                    }
                                }.getValue(new BlockPos(x, y, z), "已生成序列") + "[" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201.12
                                    public double getValue(BlockPos pos, String tag) {
                                        TileEntity tileEntity = world.func_175625_s(pos);
                                        if (tileEntity != null) {
                                            return tileEntity.getTileData().func_74769_h(tag);
                                        }
                                        return -1.0d;
                                    }
                                }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201.11
                                    public double getValue(BlockPos pos, String tag) {
                                        TileEntity tileEntity = world.func_175625_s(pos);
                                        if (tileEntity != null) {
                                            return tileEntity.getTileData().func_74769_h(tag);
                                        }
                                        return -1.0d;
                                    }
                                }.getValue(new BlockPos(x, y, z), "序列")) + "]");
                            }
                            world.func_184138_a(_bp7, _bs7, _bs7, 3);
                        }
                        Map<String, Object> $_dependencies = new HashMap<>();
                        $_dependencies.put("x", Integer.valueOf(x));
                        $_dependencies.put("y", Integer.valueOf(y));
                        $_dependencies.put("z", Integer.valueOf(z));
                        $_dependencies.put("world", world);
                        ProcedureFangShi202.executeProcedure($_dependencies);
                        if (!world.field_72995_K) {
                            BlockPos _bp8 = new BlockPos(x, y, z);
                            TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                            IBlockState _bs8 = world.func_180495_p(_bp8);
                            if (_tileEntity8 != null) {
                                _tileEntity8.getTileData().func_74780_a("序列", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201.13
                                    public double getValue(BlockPos pos, String tag) {
                                        TileEntity tileEntity = world.func_175625_s(pos);
                                        if (tileEntity != null) {
                                            return tileEntity.getTileData().func_74769_h(tag);
                                        }
                                        return -1.0d;
                                    }
                                }.getValue(new BlockPos(x, y, z), "序列") + 1.0d);
                            }
                            world.func_184138_a(_bp8, _bs8, _bs8, 3);
                        }
                        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201.14
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "序列") >= 11.0d) {
                            break;
                        }
                    }
                }
                Map<String, Object> $_dependencies2 = new HashMap<>();
                $_dependencies2.put("x", Integer.valueOf(x));
                $_dependencies2.put("y", Integer.valueOf(y));
                $_dependencies2.put("z", Integer.valueOf(z));
                $_dependencies2.put("world", world);
                ProcedureTimeAcquisition.executeProcedure($_dependencies2);
                if (!world.field_72995_K) {
                    BlockPos _bp9 = new BlockPos(x, y, z);
                    TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                    IBlockState _bs9 = world.func_180495_p(_bp9);
                    if (_tileEntity9 != null) {
                        _tileEntity9.getTileData().func_74757_a("初始化", true);
                    }
                    world.func_184138_a(_bp9, _bs9, _bs9, 3);
                    return;
                }
                return;
            }
            Map<String, Object> $_dependencies3 = new HashMap<>();
            $_dependencies3.put("x", Integer.valueOf(x));
            $_dependencies3.put("y", Integer.valueOf(y));
            $_dependencies3.put("z", Integer.valueOf(z));
            $_dependencies3.put("world", world);
            ProcedureTimeJudgment.executeProcedure($_dependencies3);
            if (!world.field_72995_K) {
                BlockPos _bp10 = new BlockPos(x, y, z);
                TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                IBlockState _bs10 = world.func_180495_p(_bp10);
                if (_tileEntity10 != null) {
                    _tileEntity10.getTileData().func_74780_a("ShuaXinTime", 10800.0d - new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201.15
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "TimeDifference"));
                }
                world.func_184138_a(_bp10, _bs10, _bs10, 3);
            }
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201.16
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "TimeDifference") >= 10800.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp11 = new BlockPos(x, y, z);
                    TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                    IBlockState _bs11 = world.func_180495_p(_bp11);
                    if (_tileEntity11 != null) {
                        _tileEntity11.getTileData().func_74780_a("序列", 1.0d);
                    }
                    world.func_184138_a(_bp11, _bs11, _bs11, 3);
                }
                for (int index1 = 0; index1 < 10; index1++) {
                    if (!world.field_72995_K) {
                        BlockPos _bp12 = new BlockPos(x, y, z);
                        TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                        IBlockState _bs12 = world.func_180495_p(_bp12);
                        if (_tileEntity12 != null) {
                            _tileEntity12.getTileData().func_74780_a("初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201.17
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "序列"), 0.0d);
                        }
                        world.func_184138_a(_bp12, _bs12, _bs12, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp13 = new BlockPos(x, y, z);
                        TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                        IBlockState _bs13 = world.func_180495_p(_bp13);
                        if (_tileEntity13 != null) {
                            _tileEntity13.getTileData().func_74780_a("序列", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi201.18
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "序列") + 1.0d);
                        }
                        world.func_184138_a(_bp13, _bs13, _bs13, 3);
                    }
                }
                if (!world.field_72995_K) {
                    BlockPos _bp14 = new BlockPos(x, y, z);
                    TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                    IBlockState _bs14 = world.func_180495_p(_bp14);
                    if (_tileEntity14 != null) {
                        _tileEntity14.getTileData().func_74780_a("TimeDifference", 0.0d);
                    }
                    world.func_184138_a(_bp14, _bs14, _bs14, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp15 = new BlockPos(x, y, z);
                    TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                    IBlockState _bs15 = world.func_180495_p(_bp15);
                    if (_tileEntity15 != null) {
                        _tileEntity15.getTileData().func_74780_a("ShuaXinTime", 10800.0d);
                    }
                    world.func_184138_a(_bp15, _bs15, _bs15, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp16 = new BlockPos(x, y, z);
                    TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                    IBlockState _bs16 = world.func_180495_p(_bp16);
                    if (_tileEntity16 != null) {
                        _tileEntity16.getTileData().func_74757_a("初始化", false);
                    }
                    world.func_184138_a(_bp16, _bs16, _bs16, 3);
                }
            }
        }
    }
}
