package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenFaYanXu.class */
public class ProcedureZhenFaYanXu extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhenFaYanXu(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 382);
    }

    /* JADX WARN: Type inference failed for: r0v117, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$40] */
    /* JADX WARN: Type inference failed for: r0v120, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$43] */
    /* JADX WARN: Type inference failed for: r0v152, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$44] */
    /* JADX WARN: Type inference failed for: r0v155, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$25] */
    /* JADX WARN: Type inference failed for: r0v158, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$28] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$1] */
    /* JADX WARN: Type inference failed for: r0v248, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$11] */
    /* JADX WARN: Type inference failed for: r0v280, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$12] */
    /* JADX WARN: Type inference failed for: r0v283, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$13] */
    /* JADX WARN: Type inference failed for: r0v286, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$16] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$10] */
    /* JADX WARN: Type inference failed for: r0v318, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$17] */
    /* JADX WARN: Type inference failed for: r0v321, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$20] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$24] */
    /* JADX WARN: Type inference failed for: r0v353, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$21] */
    /* JADX WARN: Type inference failed for: r0v356, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$47] */
    /* JADX WARN: Type inference failed for: r0v369, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$2] */
    /* JADX WARN: Type inference failed for: r0v372, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$5] */
    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$33] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$34] */
    /* JADX WARN: Type inference failed for: r0v79, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$35] */
    /* JADX WARN: Type inference failed for: r0v82, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$36] */
    /* JADX WARN: Type inference failed for: r0v85, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$39] */
    /* JADX WARN: Type inference failed for: r2v103, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$27] */
    /* JADX WARN: Type inference failed for: r2v108, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$26] */
    /* JADX WARN: Type inference failed for: r2v118, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$15] */
    /* JADX WARN: Type inference failed for: r2v123, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$14] */
    /* JADX WARN: Type inference failed for: r2v139, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$19] */
    /* JADX WARN: Type inference failed for: r2v144, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$18] */
    /* JADX WARN: Type inference failed for: r2v157, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$23] */
    /* JADX WARN: Type inference failed for: r2v162, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$22] */
    /* JADX WARN: Type inference failed for: r2v188, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$9] */
    /* JADX WARN: Type inference failed for: r2v19, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$38] */
    /* JADX WARN: Type inference failed for: r2v193, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$8] */
    /* JADX WARN: Type inference failed for: r2v200, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$7] */
    /* JADX WARN: Type inference failed for: r2v205, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$6] */
    /* JADX WARN: Type inference failed for: r2v212, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$4] */
    /* JADX WARN: Type inference failed for: r2v217, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$3] */
    /* JADX WARN: Type inference failed for: r2v24, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$37] */
    /* JADX WARN: Type inference failed for: r2v40, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$42] */
    /* JADX WARN: Type inference failed for: r2v45, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$41] */
    /* JADX WARN: Type inference failed for: r2v58, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$46] */
    /* JADX WARN: Type inference failed for: r2v63, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$45] */
    /* JADX WARN: Type inference failed for: r2v79, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$32] */
    /* JADX WARN: Type inference failed for: r2v84, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$31] */
    /* JADX WARN: Type inference failed for: r2v91, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$30] */
    /* JADX WARN: Type inference failed for: r2v96, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu$29] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi03")) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.2
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 7.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.3
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间") + 40.0d);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                    IBlockState _bs2 = world.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.4
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间1") + 2.0d);
                    }
                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
                TileEntityLockableLoot func_175625_s = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    func_175625_s.func_70298_a(0, 1);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.5
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 4.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.6
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间") + 60.0d);
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z);
                    TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                    IBlockState _bs4 = world.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.7
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间1") + 3.0d);
                    }
                    world.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s2 instanceof TileEntityLockableLoot) {
                    func_175625_s2.func_70298_a(0, 1);
                }
            } else {
                if (!world.field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y, z);
                    TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                    IBlockState _bs5 = world.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.8
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间") + 180.0d);
                    }
                    world.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp6 = new BlockPos(x, y, z);
                    TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                    IBlockState _bs6 = world.func_180495_p(_bp6);
                    if (_tileEntity6 != null) {
                        _tileEntity6.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.9
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间1") + 9.0d);
                    }
                    world.func_184138_a(_bp6, _bs6, _bs6, 3);
                }
                TileEntityLockableLoot func_175625_s3 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s3 instanceof TileEntityLockableLoot) {
                    func_175625_s3.func_70298_a(0, 1);
                }
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.10
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s4 = world.func_175625_s(pos);
                if (func_175625_s4 instanceof TileEntityLockableLoot) {
                    return func_175625_s4.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi05")) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.11
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 1.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.12
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 15.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.13
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 16.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp7 = new BlockPos(x, y, z);
                    TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                    IBlockState _bs7 = world.func_180495_p(_bp7);
                    if (_tileEntity7 != null) {
                        _tileEntity7.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.14
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间") + 40.0d);
                    }
                    world.func_184138_a(_bp7, _bs7, _bs7, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp8 = new BlockPos(x, y, z);
                    TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                    IBlockState _bs8 = world.func_180495_p(_bp8);
                    if (_tileEntity8 != null) {
                        _tileEntity8.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.15
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间1") + 2.0d);
                    }
                    world.func_184138_a(_bp8, _bs8, _bs8, 3);
                }
                TileEntityLockableLoot func_175625_s4 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s4 instanceof TileEntityLockableLoot) {
                    func_175625_s4.func_70298_a(0, 1);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.16
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 11.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.17
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 14.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp9 = new BlockPos(x, y, z);
                    TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                    IBlockState _bs9 = world.func_180495_p(_bp9);
                    if (_tileEntity9 != null) {
                        _tileEntity9.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.18
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间") + 60.0d);
                    }
                    world.func_184138_a(_bp9, _bs9, _bs9, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp10 = new BlockPos(x, y, z);
                    TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                    IBlockState _bs10 = world.func_180495_p(_bp10);
                    if (_tileEntity10 != null) {
                        _tileEntity10.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.19
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间1") + 3.0d);
                    }
                    world.func_184138_a(_bp10, _bs10, _bs10, 3);
                }
                TileEntityLockableLoot func_175625_s5 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s5 instanceof TileEntityLockableLoot) {
                    func_175625_s5.func_70298_a(0, 1);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.20
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 12.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.21
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 13.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp11 = new BlockPos(x, y, z);
                    TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                    IBlockState _bs11 = world.func_180495_p(_bp11);
                    if (_tileEntity11 != null) {
                        _tileEntity11.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.22
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间") + 180.0d);
                    }
                    world.func_184138_a(_bp11, _bs11, _bs11, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp12 = new BlockPos(x, y, z);
                    TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                    IBlockState _bs12 = world.func_180495_p(_bp12);
                    if (_tileEntity12 != null) {
                        _tileEntity12.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.23
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间1") + 9.0d);
                    }
                    world.func_184138_a(_bp12, _bs12, _bs12, 3);
                }
                TileEntityLockableLoot func_175625_s6 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s6 instanceof TileEntityLockableLoot) {
                    func_175625_s6.func_70298_a(0, 1);
                }
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.24
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s7 = world.func_175625_s(pos);
                if (func_175625_s7 instanceof TileEntityLockableLoot) {
                    return func_175625_s7.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:ling_shi_kuai_1")) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.25
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 7.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp13 = new BlockPos(x, y, z);
                    TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                    IBlockState _bs13 = world.func_180495_p(_bp13);
                    if (_tileEntity13 != null) {
                        _tileEntity13.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.26
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间") + 360.0d);
                    }
                    world.func_184138_a(_bp13, _bs13, _bs13, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp14 = new BlockPos(x, y, z);
                    TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                    IBlockState _bs14 = world.func_180495_p(_bp14);
                    if (_tileEntity14 != null) {
                        _tileEntity14.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.27
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间1") + 18.0d);
                    }
                    world.func_184138_a(_bp14, _bs14, _bs14, 3);
                }
                TileEntityLockableLoot func_175625_s7 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s7 instanceof TileEntityLockableLoot) {
                    func_175625_s7.func_70298_a(0, 1);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.28
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 4.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp15 = new BlockPos(x, y, z);
                    TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                    IBlockState _bs15 = world.func_180495_p(_bp15);
                    if (_tileEntity15 != null) {
                        _tileEntity15.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.29
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间") + 540.0d);
                    }
                    world.func_184138_a(_bp15, _bs15, _bs15, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp16 = new BlockPos(x, y, z);
                    TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                    IBlockState _bs16 = world.func_180495_p(_bp16);
                    if (_tileEntity16 != null) {
                        _tileEntity16.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.30
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间1") + 27.0d);
                    }
                    world.func_184138_a(_bp16, _bs16, _bs16, 3);
                }
                TileEntityLockableLoot func_175625_s8 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s8 instanceof TileEntityLockableLoot) {
                    func_175625_s8.func_70298_a(0, 1);
                }
            } else {
                if (!world.field_72995_K) {
                    BlockPos _bp17 = new BlockPos(x, y, z);
                    TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                    IBlockState _bs17 = world.func_180495_p(_bp17);
                    if (_tileEntity17 != null) {
                        _tileEntity17.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.31
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间") + 1620.0d);
                    }
                    world.func_184138_a(_bp17, _bs17, _bs17, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp18 = new BlockPos(x, y, z);
                    TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                    IBlockState _bs18 = world.func_180495_p(_bp18);
                    if (_tileEntity18 != null) {
                        _tileEntity18.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.32
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间1") + 81.0d);
                    }
                    world.func_184138_a(_bp18, _bs18, _bs18, 3);
                }
                TileEntityLockableLoot func_175625_s9 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s9 instanceof TileEntityLockableLoot) {
                    func_175625_s9.func_70298_a(0, 1);
                }
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.33
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s10 = world.func_175625_s(pos);
                if (func_175625_s10 instanceof TileEntityLockableLoot) {
                    return func_175625_s10.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:ling_shi_kuai_2")) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.34
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 1.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.35
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 15.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.36
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 16.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp19 = new BlockPos(x, y, z);
                    TileEntity _tileEntity19 = world.func_175625_s(_bp19);
                    IBlockState _bs19 = world.func_180495_p(_bp19);
                    if (_tileEntity19 != null) {
                        _tileEntity19.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.37
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间") + 360.0d);
                    }
                    world.func_184138_a(_bp19, _bs19, _bs19, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp20 = new BlockPos(x, y, z);
                    TileEntity _tileEntity20 = world.func_175625_s(_bp20);
                    IBlockState _bs20 = world.func_180495_p(_bp20);
                    if (_tileEntity20 != null) {
                        _tileEntity20.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.38
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间1") + 18.0d);
                    }
                    world.func_184138_a(_bp20, _bs20, _bs20, 3);
                }
                TileEntityLockableLoot func_175625_s10 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s10 instanceof TileEntityLockableLoot) {
                    func_175625_s10.func_70298_a(0, 1);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.39
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 11.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.40
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 14.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp21 = new BlockPos(x, y, z);
                    TileEntity _tileEntity21 = world.func_175625_s(_bp21);
                    IBlockState _bs21 = world.func_180495_p(_bp21);
                    if (_tileEntity21 != null) {
                        _tileEntity21.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.41
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间") + 540.0d);
                    }
                    world.func_184138_a(_bp21, _bs21, _bs21, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp22 = new BlockPos(x, y, z);
                    TileEntity _tileEntity22 = world.func_175625_s(_bp22);
                    IBlockState _bs22 = world.func_180495_p(_bp22);
                    if (_tileEntity22 != null) {
                        _tileEntity22.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.42
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间1") + 27.0d);
                    }
                    world.func_184138_a(_bp22, _bs22, _bs22, 3);
                }
                TileEntityLockableLoot func_175625_s11 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s11 instanceof TileEntityLockableLoot) {
                    func_175625_s11.func_70298_a(0, 1);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.43
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 12.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.44
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "阵法") == 13.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp23 = new BlockPos(x, y, z);
                    TileEntity _tileEntity23 = world.func_175625_s(_bp23);
                    IBlockState _bs23 = world.func_180495_p(_bp23);
                    if (_tileEntity23 != null) {
                        _tileEntity23.getTileData().func_74780_a("阵法时间", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.45
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间") + 1620.0d);
                    }
                    world.func_184138_a(_bp23, _bs23, _bs23, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp24 = new BlockPos(x, y, z);
                    TileEntity _tileEntity24 = world.func_175625_s(_bp24);
                    IBlockState _bs24 = world.func_180495_p(_bp24);
                    if (_tileEntity24 != null) {
                        _tileEntity24.getTileData().func_74780_a("阵法时间1", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.46
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "阵法时间1") + 81.0d);
                    }
                    world.func_184138_a(_bp24, _bs24, _bs24, 3);
                }
                TileEntityLockableLoot func_175625_s12 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s12 instanceof TileEntityLockableLoot) {
                    func_175625_s12.func_70298_a(0, 1);
                }
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYanXu.47
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "阵法时间1") <= 1.0d) {
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureZhenFaYiChu.executeProcedure($_dependencies);
        }
    }
}
