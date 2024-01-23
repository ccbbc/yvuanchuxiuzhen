package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.block.BlockFabao0702;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao0702UpdateTick.class */
public class ProcedureFabao0702UpdateTick extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao0702UpdateTick(ElementsFabaokuozhanMod instance) {
        super(instance, 124);
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick$17] */
    /* JADX WARN: Type inference failed for: r2v20, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick$16] */
    /* JADX WARN: Type inference failed for: r2v5, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick$18] */
    /* JADX WARN: Type inference failed for: r4v11, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick$1] */
    /* JADX WARN: Type inference failed for: r4v17, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick$10] */
    /* JADX WARN: Type inference failed for: r4v23, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick$13] */
    /* JADX WARN: Type inference failed for: r4v34, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick$4] */
    /* JADX WARN: Type inference failed for: r4v40, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick$7] */
    /* JADX WARN: Type inference failed for: r5v13, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick$11] */
    /* JADX WARN: Type inference failed for: r5v21, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick$14] */
    /* JADX WARN: Type inference failed for: r5v30, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick$5] */
    /* JADX WARN: Type inference failed for: r5v38, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick$8] */
    /* JADX WARN: Type inference failed for: r5v5, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick$2] */
    /* JADX WARN: Type inference failed for: r6v14, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick$12] */
    /* JADX WARN: Type inference failed for: r6v21, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick$15] */
    /* JADX WARN: Type inference failed for: r6v29, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick$6] */
    /* JADX WARN: Type inference failed for: r6v36, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick$9] */
    /* JADX WARN: Type inference failed for: r6v7, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick$3] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!world.field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = world.func_175625_s(_bp);
            IBlockState _bs = world.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("weizhiX", -5.0d);
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (!world.field_72995_K) {
            BlockPos _bp2 = new BlockPos(x, y, z);
            TileEntity _tileEntity2 = world.func_175625_s(_bp2);
            IBlockState _bs2 = world.func_180495_p(_bp2);
            if (_tileEntity2 != null) {
                _tileEntity2.getTileData().func_74780_a("weizhiY", -5.0d);
            }
            world.func_184138_a(_bp2, _bs2, _bs2, 3);
        }
        if (!world.field_72995_K) {
            BlockPos _bp3 = new BlockPos(x, y, z);
            TileEntity _tileEntity3 = world.func_175625_s(_bp3);
            IBlockState _bs3 = world.func_180495_p(_bp3);
            if (_tileEntity3 != null) {
                _tileEntity3.getTileData().func_74780_a("weizhiZ", -5.0d);
            }
            world.func_184138_a(_bp3, _bs3, _bs3, 3);
        }
        for (int index0 = 0; index0 < 10; index0++) {
            if (!world.field_72995_K) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                IBlockState _bs4 = world.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74780_a("weizhiY", -5.0d);
                }
                world.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
            for (int index1 = 0; index1 < 10; index1++) {
                if (!world.field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y, z);
                    TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                    IBlockState _bs5 = world.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74780_a("weizhiX", -5.0d);
                    }
                    world.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
                for (int index2 = 0; index2 < 10; index2++) {
                    if ((world.func_180495_p(new BlockPos((int) (x + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick.1
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick.2
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiY")), (int) (z + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick.3
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiZ")))).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || world.func_180495_p(new BlockPos((int) (x + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick.4
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick.5
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiY")), (int) (z + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick.6
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiZ")))).func_185904_a() == Material.field_151585_k || world.func_180495_p(new BlockPos((int) (x + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick.7
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick.8
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiY")), (int) (z + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick.9
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiZ")))).func_185904_a() == Material.field_151582_l) && world.func_180495_p(new BlockPos((int) (x + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick.10
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick.11
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiY")), (int) (z + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick.12
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiZ")))).func_177230_c() != BlockFabao0702.block.func_176223_P().func_177230_c()) {
                        world.func_180501_a(new BlockPos((int) (x + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick.13
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick.14
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiY")), (int) (z + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick.15
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiZ"))), Blocks.field_150480_ab.func_176223_P(), 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp6 = new BlockPos(x, y, z);
                        TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                        IBlockState _bs6 = world.func_180495_p(_bp6);
                        if (_tileEntity6 != null) {
                            _tileEntity6.getTileData().func_74780_a("weizhiX", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick.16
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "weizhiX") + 1.0d);
                        }
                        world.func_184138_a(_bp6, _bs6, _bs6, 3);
                    }
                }
                if (!world.field_72995_K) {
                    BlockPos _bp7 = new BlockPos(x, y, z);
                    TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                    IBlockState _bs7 = world.func_180495_p(_bp7);
                    if (_tileEntity7 != null) {
                        _tileEntity7.getTileData().func_74780_a("weizhiY", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick.17
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiY") + 1.0d);
                    }
                    world.func_184138_a(_bp7, _bs7, _bs7, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp8 = new BlockPos(x, y, z);
                TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                IBlockState _bs8 = world.func_180495_p(_bp8);
                if (_tileEntity8 != null) {
                    _tileEntity8.getTileData().func_74780_a("weizhiZ", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFabao0702UpdateTick.18
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiZ") + 1.0d);
                }
                world.func_184138_a(_bp8, _bs8, _bs8, 3);
            }
        }
        world.func_180501_a(new BlockPos(x, y, z), Blocks.field_150480_ab.func_176223_P(), 3);
    }
}
