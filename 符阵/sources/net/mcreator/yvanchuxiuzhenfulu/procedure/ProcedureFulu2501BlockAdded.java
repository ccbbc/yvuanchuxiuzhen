package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockFulu2501;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu2501BlockAdded.class */
public class ProcedureFulu2501BlockAdded extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu2501BlockAdded(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 121);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$25] */
    /* JADX WARN: Type inference failed for: r2v3, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$27] */
    /* JADX WARN: Type inference failed for: r2v8, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$26] */
    /* JADX WARN: Type inference failed for: r3v39, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$10] */
    /* JADX WARN: Type inference failed for: r4v11, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$1] */
    /* JADX WARN: Type inference failed for: r4v22, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$4] */
    /* JADX WARN: Type inference failed for: r4v28, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$7] */
    /* JADX WARN: Type inference failed for: r4v34, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$19] */
    /* JADX WARN: Type inference failed for: r4v46, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$22] */
    /* JADX WARN: Type inference failed for: r4v54, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$11] */
    /* JADX WARN: Type inference failed for: r5v14, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$5] */
    /* JADX WARN: Type inference failed for: r5v22, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$8] */
    /* JADX WARN: Type inference failed for: r5v30, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$20] */
    /* JADX WARN: Type inference failed for: r5v36, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$13] */
    /* JADX WARN: Type inference failed for: r5v45, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$23] */
    /* JADX WARN: Type inference failed for: r5v5, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$2] */
    /* JADX WARN: Type inference failed for: r5v56, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$12] */
    /* JADX WARN: Type inference failed for: r6v15, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$6] */
    /* JADX WARN: Type inference failed for: r6v22, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$9] */
    /* JADX WARN: Type inference failed for: r6v29, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$21] */
    /* JADX WARN: Type inference failed for: r6v33, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$14] */
    /* JADX WARN: Type inference failed for: r6v48, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$24] */
    /* JADX WARN: Type inference failed for: r6v7, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$3] */
    /* JADX WARN: Type inference failed for: r7v32, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$15] */
    /* JADX WARN: Type inference failed for: r7v34, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$16] */
    /* JADX WARN: Type inference failed for: r8v28, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$17] */
    /* JADX WARN: Type inference failed for: r9v22, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded$18] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (!((World) worldServer).field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = worldServer.func_175625_s(_bp);
            IBlockState _bs = worldServer.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("weizhiX", -5.0d);
            }
            worldServer.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (!((World) worldServer).field_72995_K) {
            BlockPos _bp2 = new BlockPos(x, y, z);
            TileEntity _tileEntity2 = worldServer.func_175625_s(_bp2);
            IBlockState _bs2 = worldServer.func_180495_p(_bp2);
            if (_tileEntity2 != null) {
                _tileEntity2.getTileData().func_74780_a("weizhiY", -5.0d);
            }
            worldServer.func_184138_a(_bp2, _bs2, _bs2, 3);
        }
        if (!((World) worldServer).field_72995_K) {
            BlockPos _bp3 = new BlockPos(x, y, z);
            TileEntity _tileEntity3 = worldServer.func_175625_s(_bp3);
            IBlockState _bs3 = worldServer.func_180495_p(_bp3);
            if (_tileEntity3 != null) {
                _tileEntity3.getTileData().func_74780_a("weizhiZ", -5.0d);
            }
            worldServer.func_184138_a(_bp3, _bs3, _bs3, 3);
        }
        for (int index0 = 0; index0 < 9; index0++) {
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                TileEntity _tileEntity4 = worldServer.func_175625_s(_bp4);
                IBlockState _bs4 = worldServer.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74780_a("weizhiY", -5.0d);
                }
                worldServer.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
            for (int index1 = 0; index1 < 9; index1++) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y, z);
                    TileEntity _tileEntity5 = worldServer.func_175625_s(_bp5);
                    IBlockState _bs5 = worldServer.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74780_a("weizhiX", -5.0d);
                    }
                    worldServer.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
                for (int index2 = 0; index2 < 9; index2++) {
                    if (worldServer.func_180495_p(new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.1
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.2
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiY")), (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.3
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiZ")))).func_177230_c() != Blocks.field_150350_a.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.4
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.5
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiY")), (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.6
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiZ")))).func_177230_c() != BlockFulu2501.block.func_176223_P().func_177230_c() && worldServer.func_180495_p(new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.7
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.8
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiY")), (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.9
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiZ")))).func_177230_c() != Blocks.field_150357_h.func_176223_P().func_177230_c()) {
                        if (worldServer instanceof WorldServer) {
                            worldServer.func_175739_a(EnumParticleTypes.SMOKE_LARGE, x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.10
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "weizhiX"), y + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.11
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "weizhiY"), z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.12
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "weizhiZ"), 1, 0.3d, 0.3d, 0.3d, 0.0d, new int[0]);
                        }
                        worldServer.func_180495_p(new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.19
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.20
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiY")), (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.21
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiZ")))).func_177230_c().func_176226_b(worldServer, new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.13
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.14
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiY")), (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.15
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiZ"))), worldServer.func_180495_p(new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.16
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.17
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiY")), (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.18
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiZ")))), 1);
                        worldServer.func_175698_g(new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.22
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiX")), (int) (y + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.23
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiY")), (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.24
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiZ"))));
                    }
                    if (!((World) worldServer).field_72995_K) {
                        BlockPos _bp6 = new BlockPos(x, y, z);
                        TileEntity _tileEntity6 = worldServer.func_175625_s(_bp6);
                        IBlockState _bs6 = worldServer.func_180495_p(_bp6);
                        if (_tileEntity6 != null) {
                            _tileEntity6.getTileData().func_74780_a("weizhiX", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.25
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "weizhiX") + 1.0d);
                        }
                        worldServer.func_184138_a(_bp6, _bs6, _bs6, 3);
                    }
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp7 = new BlockPos(x, y, z);
                    TileEntity _tileEntity7 = worldServer.func_175625_s(_bp7);
                    IBlockState _bs7 = worldServer.func_180495_p(_bp7);
                    if (_tileEntity7 != null) {
                        _tileEntity7.getTileData().func_74780_a("weizhiY", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.26
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiY") + 1.0d);
                    }
                    worldServer.func_184138_a(_bp7, _bs7, _bs7, 3);
                }
            }
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp8 = new BlockPos(x, y, z);
                TileEntity _tileEntity8 = worldServer.func_175625_s(_bp8);
                IBlockState _bs8 = worldServer.func_180495_p(_bp8);
                if (_tileEntity8 != null) {
                    _tileEntity8.getTileData().func_74780_a("weizhiZ", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2501BlockAdded.27
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiZ") + 1.0d);
                }
                worldServer.func_184138_a(_bp8, _bs8, _bs8, 3);
            }
        }
        worldServer.func_175698_g(new BlockPos(x, y, z));
    }
}
