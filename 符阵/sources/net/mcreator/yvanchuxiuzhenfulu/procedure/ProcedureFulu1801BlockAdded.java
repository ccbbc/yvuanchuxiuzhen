package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockFulu1801;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu1801BlockAdded.class */
public class ProcedureFulu1801BlockAdded extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu1801BlockAdded(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 105);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$28] */
    /* JADX WARN: Type inference failed for: r2v3, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$30] */
    /* JADX WARN: Type inference failed for: r2v8, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$29] */
    /* JADX WARN: Type inference failed for: r4v11, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$1] */
    /* JADX WARN: Type inference failed for: r4v22, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$4] */
    /* JADX WARN: Type inference failed for: r4v28, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$7] */
    /* JADX WARN: Type inference failed for: r4v34, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$10] */
    /* JADX WARN: Type inference failed for: r4v42, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$19] */
    /* JADX WARN: Type inference failed for: r4v49, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$25] */
    /* JADX WARN: Type inference failed for: r5v14, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$5] */
    /* JADX WARN: Type inference failed for: r5v22, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$8] */
    /* JADX WARN: Type inference failed for: r5v30, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$11] */
    /* JADX WARN: Type inference failed for: r5v47, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$20] */
    /* JADX WARN: Type inference failed for: r5v5, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$2] */
    /* JADX WARN: Type inference failed for: r5v60, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$26] */
    /* JADX WARN: Type inference failed for: r6v15, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$6] */
    /* JADX WARN: Type inference failed for: r6v22, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$9] */
    /* JADX WARN: Type inference failed for: r6v30, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$12] */
    /* JADX WARN: Type inference failed for: r6v32, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$13] */
    /* JADX WARN: Type inference failed for: r6v38, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$16] */
    /* JADX WARN: Type inference failed for: r6v50, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$21] */
    /* JADX WARN: Type inference failed for: r6v52, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$22] */
    /* JADX WARN: Type inference failed for: r6v63, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$27] */
    /* JADX WARN: Type inference failed for: r6v7, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$3] */
    /* JADX WARN: Type inference failed for: r7v29, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$14] */
    /* JADX WARN: Type inference failed for: r7v38, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$17] */
    /* JADX WARN: Type inference failed for: r7v52, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$23] */
    /* JADX WARN: Type inference failed for: r8v26, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$15] */
    /* JADX WARN: Type inference failed for: r8v33, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$18] */
    /* JADX WARN: Type inference failed for: r8v45, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded$24] */
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
                _tileEntity.getTileData().func_74780_a("weizhiX", -10.0d);
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (!world.field_72995_K) {
            BlockPos _bp2 = new BlockPos(x, y, z);
            TileEntity _tileEntity2 = world.func_175625_s(_bp2);
            IBlockState _bs2 = world.func_180495_p(_bp2);
            if (_tileEntity2 != null) {
                _tileEntity2.getTileData().func_74780_a("weizhiY", -10.0d);
            }
            world.func_184138_a(_bp2, _bs2, _bs2, 3);
        }
        if (!world.field_72995_K) {
            BlockPos _bp3 = new BlockPos(x, y, z);
            TileEntity _tileEntity3 = world.func_175625_s(_bp3);
            IBlockState _bs3 = world.func_180495_p(_bp3);
            if (_tileEntity3 != null) {
                _tileEntity3.getTileData().func_74780_a("weizhiZ", -10.0d);
            }
            world.func_184138_a(_bp3, _bs3, _bs3, 3);
        }
        for (int index0 = 0; index0 < 20; index0++) {
            if (!world.field_72995_K) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                IBlockState _bs4 = world.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74780_a("weizhiY", -10.0d);
                }
                world.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
            for (int index1 = 0; index1 < 20; index1++) {
                if (!world.field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y, z);
                    TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                    IBlockState _bs5 = world.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74780_a("weizhiX", -10.0d);
                    }
                    world.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
                for (int index2 = 0; index2 < 20; index2++) {
                    if (world.func_180495_p(new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.1
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.2
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiY")), (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.3
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiZ")))).func_177230_c() != Blocks.field_150350_a.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.4
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.5
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiY")), (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.6
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiZ")))).func_177230_c() != BlockFulu1801.block.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.7
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.8
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiY")), (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.9
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiZ")))).func_177230_c() != Blocks.field_150357_h.func_176223_P().func_177230_c() && world.func_180495_p(new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.10
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.11
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiY") - 1.0d)), (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.12
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiZ")))).func_177230_c() != Blocks.field_150357_h.func_176223_P().func_177230_c() && !new ItemStack(world.func_180495_p(new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.13
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.14
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiY") - 1.0d)), (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.15
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiZ")))).func_177230_c()).func_77973_b().getRegistryName().toString().contains("yuanchujianzhu:") && !new ItemStack(world.func_180495_p(new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.16
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.17
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiY")), (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.18
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiZ")))).func_177230_c()).func_77973_b().getRegistryName().toString().contains("yuanchujianzhu:")) {
                        world.func_180501_a(new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.19
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.20
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiY") - 1.0d)), (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.21
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiZ"))), world.func_180495_p(new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.22
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.23
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiY")), (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.24
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiZ")))), 3);
                        world.func_175698_g(new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.25
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.26
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiY")), (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.27
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiZ"))));
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp6 = new BlockPos(x, y, z);
                        TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                        IBlockState _bs6 = world.func_180495_p(_bp6);
                        if (_tileEntity6 != null) {
                            _tileEntity6.getTileData().func_74780_a("weizhiX", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.28
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
                        _tileEntity7.getTileData().func_74780_a("weizhiY", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.29
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
                    _tileEntity8.getTileData().func_74780_a("weizhiZ", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1801BlockAdded.30
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
        world.func_175698_g(new BlockPos(x, y, z));
    }
}
