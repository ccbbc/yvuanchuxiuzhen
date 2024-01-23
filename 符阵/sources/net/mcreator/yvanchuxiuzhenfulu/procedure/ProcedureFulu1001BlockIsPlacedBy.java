package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockFulu1001;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu1001BlockIsPlacedBy.class */
public class ProcedureFulu1001BlockIsPlacedBy extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu1001BlockIsPlacedBy(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 86);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy$1] */
    /* JADX WARN: Type inference failed for: r2v20, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy$14] */
    /* JADX WARN: Type inference failed for: r2v7, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy$15] */
    /* JADX WARN: Type inference failed for: r3v21, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy$12] */
    /* JADX WARN: Type inference failed for: r4v11, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy$8] */
    /* JADX WARN: Type inference failed for: r4v14, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy$10] */
    /* JADX WARN: Type inference failed for: r4v27, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy$4] */
    /* JADX WARN: Type inference failed for: r4v30, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy$6] */
    /* JADX WARN: Type inference failed for: r4v8, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy$2] */
    /* JADX WARN: Type inference failed for: r5v25, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy$13] */
    /* JADX WARN: Type inference failed for: r6v14, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy$11] */
    /* JADX WARN: Type inference failed for: r6v24, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy$5] */
    /* JADX WARN: Type inference failed for: r6v29, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy$7] */
    /* JADX WARN: Type inference failed for: r6v4, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy$3] */
    /* JADX WARN: Type inference failed for: r6v9, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy$9] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "jineng") == 1.0d) {
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = worldServer.func_175625_s(_bp);
                IBlockState _bs = worldServer.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74780_a("weizhiX", -6.0d);
                }
                worldServer.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = worldServer.func_175625_s(_bp2);
                IBlockState _bs2 = worldServer.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74780_a("weizhiZ", -6.0d);
                }
                worldServer.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
            for (int index0 = 0; index0 < 13; index0++) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = worldServer.func_175625_s(_bp3);
                    IBlockState _bs3 = worldServer.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74780_a("weizhiX", -6.0d);
                    }
                    worldServer.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                for (int index1 = 0; index1 < 13; index1++) {
                    if ((worldServer.func_180495_p(new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy.2
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiX")), y, (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy.3
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiZ")))).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c() || worldServer.func_180495_p(new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy.4
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiX")), y, (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy.5
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiZ")))).func_185904_a() == Material.field_151585_k || worldServer.func_180495_p(new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy.6
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiX")), y, (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy.7
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiZ")))).func_185904_a() == Material.field_151582_l) && worldServer.func_180495_p(new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy.8
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiX")), y, (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy.9
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "weizhiZ")))).func_177230_c() != BlockFulu1001.block.func_176223_P().func_177230_c()) {
                        worldServer.func_180501_a(new BlockPos((int) (x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy.10
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiX")), y, (int) (z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy.11
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiZ"))), BlockFulu1001.block.func_176223_P(), 3);
                        if (worldServer instanceof WorldServer) {
                            worldServer.func_175739_a(EnumParticleTypes.CLOUD, x + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy.12
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "weizhiX"), y, z + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy.13
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "weizhiZ"), 5, 0.5d, 0.5d, 0.5d, 0.1d, new int[0]);
                        }
                    }
                    if (!((World) worldServer).field_72995_K) {
                        BlockPos _bp4 = new BlockPos(x, y, z);
                        TileEntity _tileEntity4 = worldServer.func_175625_s(_bp4);
                        IBlockState _bs4 = worldServer.func_180495_p(_bp4);
                        if (_tileEntity4 != null) {
                            _tileEntity4.getTileData().func_74780_a("weizhiX", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy.14
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "weizhiX") + 1.0d);
                        }
                        worldServer.func_184138_a(_bp4, _bs4, _bs4, 3);
                    }
                }
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y, z);
                    TileEntity _tileEntity5 = worldServer.func_175625_s(_bp5);
                    IBlockState _bs5 = worldServer.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74780_a("weizhiZ", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1001BlockIsPlacedBy.15
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = worldServer.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "weizhiZ") + 1.0d);
                    }
                    worldServer.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
            }
            worldServer.func_175698_g(new BlockPos(x, y, z));
            return;
        }
        worldServer.func_175698_g(new BlockPos(x, y, z));
    }
}
