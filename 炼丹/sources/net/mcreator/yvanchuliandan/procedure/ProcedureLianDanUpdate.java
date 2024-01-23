package net.mcreator.yvanchuliandan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemLiandanzhong;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureLianDanUpdate.class */
public class ProcedureLianDanUpdate extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureLianDanUpdate(ElementsYvanchuliandanMod instance) {
        super(instance, 300);
    }

    /* JADX WARN: Type inference failed for: r0v100, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$9] */
    /* JADX WARN: Type inference failed for: r0v110, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$14] */
    /* JADX WARN: Type inference failed for: r0v113, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$15] */
    /* JADX WARN: Type inference failed for: r0v192, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$29] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$1] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$5] */
    /* JADX WARN: Type inference failed for: r0v276, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$32] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$38] */
    /* JADX WARN: Type inference failed for: r0v30, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$39] */
    /* JADX WARN: Type inference failed for: r0v312, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$33] */
    /* JADX WARN: Type inference failed for: r0v315, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$34] */
    /* JADX WARN: Type inference failed for: r0v318, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$35] */
    /* JADX WARN: Type inference failed for: r0v321, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$36] */
    /* JADX WARN: Type inference failed for: r0v379, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$16] */
    /* JADX WARN: Type inference failed for: r0v399, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$27] */
    /* JADX WARN: Type inference failed for: r0v411, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$18] */
    /* JADX WARN: Type inference failed for: r0v443, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$25] */
    /* JADX WARN: Type inference failed for: r0v529, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$8] */
    /* JADX WARN: Type inference failed for: r0v534, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$4] */
    /* JADX WARN: Type inference failed for: r0v94, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$41] */
    /* JADX WARN: Type inference failed for: r0v97, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$6] */
    /* JADX WARN: Type inference failed for: r1v10, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$2] */
    /* JADX WARN: Type inference failed for: r1v20, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$40] */
    /* JADX WARN: Type inference failed for: r1v231, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$17] */
    /* JADX WARN: Type inference failed for: r1v264, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$20] */
    /* JADX WARN: Type inference failed for: r1v268, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$21] */
    /* JADX WARN: Type inference failed for: r1v272, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$22] */
    /* JADX WARN: Type inference failed for: r1v276, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$23] */
    /* JADX WARN: Type inference failed for: r1v280, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$24] */
    /* JADX WARN: Type inference failed for: r1v52, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$42] */
    /* JADX WARN: Type inference failed for: r1v59, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$7] */
    /* JADX WARN: Type inference failed for: r1v66, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$10] */
    /* JADX WARN: Type inference failed for: r1v79, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$28] */
    /* JADX WARN: Type inference failed for: r2v118, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$30] */
    /* JADX WARN: Type inference failed for: r2v204, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$37] */
    /* JADX WARN: Type inference failed for: r2v226, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$26] */
    /* JADX WARN: Type inference failed for: r2v249, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$19] */
    /* JADX WARN: Type inference failed for: r2v326, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$11] */
    /* JADX WARN: Type inference failed for: r2v345, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$3] */
    /* JADX WARN: Type inference failed for: r2v63, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$31] */
    /* JADX WARN: Type inference failed for: r3v105, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$13] */
    /* JADX WARN: Type inference failed for: r3v14, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$44] */
    /* JADX WARN: Type inference failed for: r5v44, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate$12] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "huoyan") > new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "danluLEVEL")) {
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74780_a("要来力", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.3
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "要来力") + 1.0d);
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.4
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "要来力") >= 10.0d) {
                if (!world.field_72995_K) {
                    world.func_72876_a((Entity) null, x, y, z, 1.0f, true);
                }
                if (Math.random() < 0.1d) {
                    world.func_175698_g(new BlockPos(x, y, z));
                } else {
                    world.func_180495_p(new BlockPos(x, y, z)).func_177230_c().func_176226_b(world, new BlockPos(x, y, z), world.func_180495_p(new BlockPos(x, y, z)), 1);
                    world.func_175698_g(new BlockPos(x, y, z));
                }
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.5
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "开始炼制") && ((new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.6
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "辅材记录").equals(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.7
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString()) || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.8
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == ItemStack.field_190927_a.func_77973_b()) && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.9
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "丹方记录").equals(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.10
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString()))) {
            TileEntityLockableLoot func_175625_s = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s != null && (func_175625_s instanceof TileEntityLockableLoot)) {
                ItemStack _setstack = new ItemStack(ItemLiandanzhong.block, 1);
                _setstack.func_190920_e(1);
                func_175625_s.func_70299_a(7, _setstack);
            }
            if (!world.field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74780_a("炼制计时", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.11
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制计时") + 1.0d);
                }
                world.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp3 = new BlockPos(x, y, z);
                TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                IBlockState _bs3 = world.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74780_a("炼制剩余时间显示", 3 - new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.13
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.12
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制计时") / 2.0d)));
                }
                world.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.14
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "炼制计时") >= 6.0d) {
                if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.15
                    public boolean getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74767_n(tag);
                        }
                        return false;
                    }
                }.getValue(new BlockPos(x, y, z), "连续炼制") && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.16
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                        if (func_175625_s2 instanceof TileEntityLockableLoot) {
                            return func_175625_s2.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() != ItemStack.field_190927_a.func_77973_b()) {
                    if (!new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.17
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "DanFang")).contains("10000") && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.18
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "DanFang") != 18.0d) {
                        if (new Random().nextInt(100) < 49.0d + (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.19
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "liandan") * 5.0d)) {
                            if (new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.20
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "DanFang")).contains("90")) {
                                Map<String, Object> $_dependencies = new HashMap<>();
                                $_dependencies.put("world", world);
                                $_dependencies.put("x", Integer.valueOf(x));
                                $_dependencies.put("y", Integer.valueOf(y));
                                $_dependencies.put("z", Integer.valueOf(z));
                                ProcedureLianXuLianZhiTuPoDanYao.executeProcedure($_dependencies);
                            } else if (new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.21
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "DanFang")).contains("22")) {
                                Map<String, Object> $_dependencies2 = new HashMap<>();
                                $_dependencies2.put("world", world);
                                $_dependencies2.put("x", Integer.valueOf(x));
                                $_dependencies2.put("y", Integer.valueOf(y));
                                $_dependencies2.put("z", Integer.valueOf(z));
                                ProcedureLianXuLianZhiTuPoDanYao2.executeProcedure($_dependencies2);
                            } else if (new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.22
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "DanFang")).contains("33")) {
                                Map<String, Object> $_dependencies3 = new HashMap<>();
                                $_dependencies3.put("world", world);
                                $_dependencies3.put("x", Integer.valueOf(x));
                                $_dependencies3.put("y", Integer.valueOf(y));
                                $_dependencies3.put("z", Integer.valueOf(z));
                                ProcedureLianXuLianZhiTuPoDanYao3.executeProcedure($_dependencies3);
                            } else if (new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.23
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "DanFang")).contains("45")) {
                                Map<String, Object> $_dependencies4 = new HashMap<>();
                                $_dependencies4.put("world", world);
                                $_dependencies4.put("x", Integer.valueOf(x));
                                $_dependencies4.put("y", Integer.valueOf(y));
                                $_dependencies4.put("z", Integer.valueOf(z));
                                ProcedureLianXuLianZhiTuPoDanYao4.executeProcedure($_dependencies4);
                            } else if (new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.24
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "DanFang")).contains("57")) {
                                Map<String, Object> $_dependencies5 = new HashMap<>();
                                $_dependencies5.put("world", world);
                                $_dependencies5.put("x", Integer.valueOf(x));
                                $_dependencies5.put("y", Integer.valueOf(y));
                                $_dependencies5.put("z", Integer.valueOf(z));
                                ProcedureLianXuLianZhiTuPoDanYao5.executeProcedure($_dependencies5);
                            } else {
                                new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.25
                                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                                        TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                                        if (func_175625_s2 instanceof TileEntityLockableLoot) {
                                            return func_175625_s2.func_70301_a(sltid);
                                        }
                                        return ItemStack.field_190927_a;
                                    }
                                }.getItemStack(new BlockPos(x, y, z), 4).func_190917_f(1);
                            }
                            Map<String, Object> $_dependencies6 = new HashMap<>();
                            $_dependencies6.put("world", world);
                            $_dependencies6.put("x", Integer.valueOf(x));
                            $_dependencies6.put("y", Integer.valueOf(y));
                            $_dependencies6.put("z", Integer.valueOf(z));
                            ProcedureLianDanJingYan.executeProcedure($_dependencies6);
                        } else {
                            Map<String, Object> $_dependencies7 = new HashMap<>();
                            $_dependencies7.put("world", world);
                            $_dependencies7.put("x", Integer.valueOf(x));
                            $_dependencies7.put("y", Integer.valueOf(y));
                            $_dependencies7.put("z", Integer.valueOf(z));
                            ProcedureLianDanShiBai.executeProcedure($_dependencies7);
                        }
                    } else if (new Random().nextInt(100) < 3.0d + (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.26
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "liandan") * 3.0d)) {
                        new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.27
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                                if (func_175625_s2 instanceof TileEntityLockableLoot) {
                                    return func_175625_s2.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_190917_f(1);
                        Map<String, Object> $_dependencies8 = new HashMap<>();
                        $_dependencies8.put("world", world);
                        $_dependencies8.put("x", Integer.valueOf(x));
                        $_dependencies8.put("y", Integer.valueOf(y));
                        $_dependencies8.put("z", Integer.valueOf(z));
                        ProcedureLianDanJingYan.executeProcedure($_dependencies8);
                    } else {
                        Map<String, Object> $_dependencies9 = new HashMap<>();
                        $_dependencies9.put("world", world);
                        $_dependencies9.put("x", Integer.valueOf(x));
                        $_dependencies9.put("y", Integer.valueOf(y));
                        $_dependencies9.put("z", Integer.valueOf(z));
                        ProcedureLianDanShiBai.executeProcedure($_dependencies9);
                    }
                } else if (!new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.28
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "DanFang")).contains("10000") && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.29
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "DanFang") != 18.0d) {
                    if (new Random().nextInt(100) < 49.0d + (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.30
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "liandan") * 5.0d)) {
                        Map<String, Object> $_dependencies10 = new HashMap<>();
                        $_dependencies10.put("world", world);
                        $_dependencies10.put("x", Integer.valueOf(x));
                        $_dependencies10.put("y", Integer.valueOf(y));
                        $_dependencies10.put("z", Integer.valueOf(z));
                        ProcedureDanFangJieSuan.executeProcedure($_dependencies10);
                        Map<String, Object> $_dependencies11 = new HashMap<>();
                        $_dependencies11.put("world", world);
                        $_dependencies11.put("x", Integer.valueOf(x));
                        $_dependencies11.put("y", Integer.valueOf(y));
                        $_dependencies11.put("z", Integer.valueOf(z));
                        ProcedureDanFangJieSuan2.executeProcedure($_dependencies11);
                        Map<String, Object> $_dependencies12 = new HashMap<>();
                        $_dependencies12.put("world", world);
                        $_dependencies12.put("x", Integer.valueOf(x));
                        $_dependencies12.put("y", Integer.valueOf(y));
                        $_dependencies12.put("z", Integer.valueOf(z));
                        ProcedureDanFangJieSuan3.executeProcedure($_dependencies12);
                        Map<String, Object> $_dependencies13 = new HashMap<>();
                        $_dependencies13.put("world", world);
                        $_dependencies13.put("x", Integer.valueOf(x));
                        $_dependencies13.put("y", Integer.valueOf(y));
                        $_dependencies13.put("z", Integer.valueOf(z));
                        ProcedureDanFangJieSuan4.executeProcedure($_dependencies13);
                        Map<String, Object> $_dependencies14 = new HashMap<>();
                        $_dependencies14.put("world", world);
                        $_dependencies14.put("x", Integer.valueOf(x));
                        $_dependencies14.put("y", Integer.valueOf(y));
                        $_dependencies14.put("z", Integer.valueOf(z));
                        ProcedureDanFangJieSuan5.executeProcedure($_dependencies14);
                        Map<String, Object> $_dependencies15 = new HashMap<>();
                        $_dependencies15.put("world", world);
                        $_dependencies15.put("x", Integer.valueOf(x));
                        $_dependencies15.put("y", Integer.valueOf(y));
                        $_dependencies15.put("z", Integer.valueOf(z));
                        ProcedureLianDanJingYan.executeProcedure($_dependencies15);
                    } else {
                        Map<String, Object> $_dependencies16 = new HashMap<>();
                        $_dependencies16.put("world", world);
                        $_dependencies16.put("x", Integer.valueOf(x));
                        $_dependencies16.put("y", Integer.valueOf(y));
                        $_dependencies16.put("z", Integer.valueOf(z));
                        ProcedureLianDanShiBai.executeProcedure($_dependencies16);
                    }
                } else if (new Random().nextInt(100) < 3.0d + (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.31
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "liandan") * 3.0d)) {
                    Map<String, Object> $_dependencies17 = new HashMap<>();
                    $_dependencies17.put("world", world);
                    $_dependencies17.put("x", Integer.valueOf(x));
                    $_dependencies17.put("y", Integer.valueOf(y));
                    $_dependencies17.put("z", Integer.valueOf(z));
                    ProcedureDanFangJieSuan.executeProcedure($_dependencies17);
                    Map<String, Object> $_dependencies18 = new HashMap<>();
                    $_dependencies18.put("world", world);
                    $_dependencies18.put("x", Integer.valueOf(x));
                    $_dependencies18.put("y", Integer.valueOf(y));
                    $_dependencies18.put("z", Integer.valueOf(z));
                    ProcedureDanFangJieSuan2.executeProcedure($_dependencies18);
                    Map<String, Object> $_dependencies19 = new HashMap<>();
                    $_dependencies19.put("world", world);
                    $_dependencies19.put("x", Integer.valueOf(x));
                    $_dependencies19.put("y", Integer.valueOf(y));
                    $_dependencies19.put("z", Integer.valueOf(z));
                    ProcedureDanFangJieSuan3.executeProcedure($_dependencies19);
                    Map<String, Object> $_dependencies20 = new HashMap<>();
                    $_dependencies20.put("world", world);
                    $_dependencies20.put("x", Integer.valueOf(x));
                    $_dependencies20.put("y", Integer.valueOf(y));
                    $_dependencies20.put("z", Integer.valueOf(z));
                    ProcedureDanFangJieSuan4.executeProcedure($_dependencies20);
                    Map<String, Object> $_dependencies21 = new HashMap<>();
                    $_dependencies21.put("world", world);
                    $_dependencies21.put("x", Integer.valueOf(x));
                    $_dependencies21.put("y", Integer.valueOf(y));
                    $_dependencies21.put("z", Integer.valueOf(z));
                    ProcedureDanFangJieSuan5.executeProcedure($_dependencies21);
                    Map<String, Object> $_dependencies22 = new HashMap<>();
                    $_dependencies22.put("world", world);
                    $_dependencies22.put("x", Integer.valueOf(x));
                    $_dependencies22.put("y", Integer.valueOf(y));
                    $_dependencies22.put("z", Integer.valueOf(z));
                    ProcedureLianDanJingYan.executeProcedure($_dependencies22);
                } else {
                    Map<String, Object> $_dependencies23 = new HashMap<>();
                    $_dependencies23.put("world", world);
                    $_dependencies23.put("x", Integer.valueOf(x));
                    $_dependencies23.put("y", Integer.valueOf(y));
                    $_dependencies23.put("z", Integer.valueOf(z));
                    ProcedureLianDanShiBai.executeProcedure($_dependencies23);
                }
                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s2 != null && (func_175625_s2 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack2 = new ItemStack(Blocks.field_150350_a, 1);
                    _setstack2.func_190920_e(1);
                    func_175625_s2.func_70299_a(7, _setstack2);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z);
                    TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                    IBlockState _bs4 = world.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74757_a("开始炼制", false);
                    }
                    world.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y, z);
                    TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                    IBlockState _bs5 = world.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74780_a("炼制计时", 0.0d);
                    }
                    world.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
                if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.32
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                        if (func_175625_s3 instanceof TileEntityLockableLoot) {
                            return func_175625_s3.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() != ItemStack.field_190927_a.func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.33
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                        if (func_175625_s3 instanceof TileEntityLockableLoot) {
                            return func_175625_s3.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() != ItemStack.field_190927_a.func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.34
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                        if (func_175625_s3 instanceof TileEntityLockableLoot) {
                            return func_175625_s3.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() != ItemStack.field_190927_a.func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.35
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                        if (func_175625_s3 instanceof TileEntityLockableLoot) {
                            return func_175625_s3.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() != ItemStack.field_190927_a.func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.36
                    public int getAmount(BlockPos pos, int sltid) {
                        ItemStack stack;
                        TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                        if ((func_175625_s3 instanceof TileEntityLockableLoot) && (stack = func_175625_s3.func_70301_a(sltid)) != null) {
                            return stack.func_190916_E();
                        }
                        return 0;
                    }
                }.getAmount(new BlockPos(x, y, z), 4) < 64) {
                    if (!world.field_72995_K) {
                        BlockPos _bp6 = new BlockPos(x, y, z);
                        TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                        IBlockState _bs6 = world.func_180495_p(_bp6);
                        if (_tileEntity6 != null) {
                            _tileEntity6.getTileData().func_74757_a("连续炼制", true);
                        }
                        world.func_184138_a(_bp6, _bs6, _bs6, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp7 = new BlockPos(x, y, z);
                        TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                        IBlockState _bs7 = world.func_180495_p(_bp7);
                        if (_tileEntity7 != null) {
                            _tileEntity7.getTileData().func_74778_a("连续炼制丹药名", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.37
                                public ItemStack getItemStack(BlockPos pos, int sltid) {
                                    TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                                    if (func_175625_s3 instanceof TileEntityLockableLoot) {
                                        return func_175625_s3.func_70301_a(sltid);
                                    }
                                    return ItemStack.field_190927_a;
                                }
                            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b().getRegistryName().toString());
                        }
                        world.func_184138_a(_bp7, _bs7, _bs7, 3);
                    }
                    Map<String, Object> $_dependencies24 = new HashMap<>();
                    $_dependencies24.put("world", world);
                    $_dependencies24.put("x", Integer.valueOf(x));
                    $_dependencies24.put("y", Integer.valueOf(y));
                    $_dependencies24.put("z", Integer.valueOf(z));
                    ProcedureLianXuLianZhi.executeProcedure($_dependencies24);
                } else {
                    if (!world.field_72995_K) {
                        BlockPos _bp8 = new BlockPos(x, y, z);
                        TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                        IBlockState _bs8 = world.func_180495_p(_bp8);
                        if (_tileEntity8 != null) {
                            _tileEntity8.getTileData().func_74780_a("DanFang", 0.0d);
                        }
                        world.func_184138_a(_bp8, _bs8, _bs8, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp9 = new BlockPos(x, y, z);
                        TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                        IBlockState _bs9 = world.func_180495_p(_bp9);
                        if (_tileEntity9 != null) {
                            _tileEntity9.getTileData().func_74757_a("连续炼制", false);
                        }
                        world.func_184138_a(_bp9, _bs9, _bs9, 3);
                    }
                }
                if (!world.field_72995_K) {
                    BlockPos _bp10 = new BlockPos(x, y, z);
                    TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                    IBlockState _bs10 = world.func_180495_p(_bp10);
                    if (_tileEntity10 != null) {
                        _tileEntity10.getTileData().func_74780_a("炼制剩余时间显示", 0.0d);
                    }
                    world.func_184138_a(_bp10, _bs10, _bs10, 3);
                }
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.38
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "开始炼制")) {
            if (!new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.39
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "辅材记录").equals(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.40
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                    if (func_175625_s3 instanceof TileEntityLockableLoot) {
                        return func_175625_s3.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString()) || !new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.41
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "丹方记录").equals(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.42
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                    if (func_175625_s3 instanceof TileEntityLockableLoot) {
                        return func_175625_s3.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString())) {
                if (!world.field_72995_K) {
                    BlockPos _bp11 = new BlockPos(x, y, z);
                    TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                    IBlockState _bs11 = world.func_180495_p(_bp11);
                    if (_tileEntity11 != null) {
                        _tileEntity11.getTileData().func_74780_a("炼制计时", 0.0d);
                    }
                    world.func_184138_a(_bp11, _bs11, _bs11, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp12 = new BlockPos(x, y, z);
                    TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                    IBlockState _bs12 = world.func_180495_p(_bp12);
                    if (_tileEntity12 != null) {
                        _tileEntity12.getTileData().func_74757_a("连续炼制", false);
                    }
                    world.func_184138_a(_bp12, _bs12, _bs12, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp13 = new BlockPos(x, y, z);
                    TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                    IBlockState _bs13 = world.func_180495_p(_bp13);
                    if (_tileEntity13 != null) {
                        _tileEntity13.getTileData().func_74780_a("炼制剩余时间显示", 0.0d);
                    }
                    world.func_184138_a(_bp13, _bs13, _bs13, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp14 = new BlockPos(x, y, z);
                    TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                    IBlockState _bs14 = world.func_180495_p(_bp14);
                    if (_tileEntity14 != null) {
                        _tileEntity14.getTileData().func_74757_a("开始炼制", false);
                    }
                    world.func_184138_a(_bp14, _bs14, _bs14, 3);
                }
                TileEntityLockableLoot func_175625_s3 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s3 != null && (func_175625_s3 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack3 = new ItemStack(Blocks.field_150350_a, 1);
                    _setstack3.func_190920_e(1);
                    func_175625_s3.func_70299_a(7, _setstack3);
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.43
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
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
                    }, "tellraw " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianDanUpdate.44
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "炼制者") + " [{\"text\":\"炼丹中途更改配方，炼制失败\",\"color\":\"red\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]");
                }
            }
        }
    }
}
