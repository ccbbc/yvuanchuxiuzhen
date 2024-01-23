package net.mcreator.yvanchuliandan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureFangShi403.class */
public class ProcedureFangShi403 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureFangShi403(ElementsYvanchuliandanMod instance) {
        super(instance, 887);
    }

    /* JADX WARN: Type inference failed for: r0v149, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$3] */
    /* JADX WARN: Type inference failed for: r0v152, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$8] */
    /* JADX WARN: Type inference failed for: r0v155, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$15] */
    /* JADX WARN: Type inference failed for: r0v166, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$20] */
    /* JADX WARN: Type inference failed for: r0v252, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$18] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$1] */
    /* JADX WARN: Type inference failed for: r0v49, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$28] */
    /* JADX WARN: Type inference failed for: r1v115, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$19] */
    /* JADX WARN: Type inference failed for: r1v14, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$2] */
    /* JADX WARN: Type inference failed for: r2v101, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$21] */
    /* JADX WARN: Type inference failed for: r2v127, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$10] */
    /* JADX WARN: Type inference failed for: r2v132, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$9] */
    /* JADX WARN: Type inference failed for: r2v143, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$5] */
    /* JADX WARN: Type inference failed for: r2v148, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$4] */
    /* JADX WARN: Type inference failed for: r2v28, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$32] */
    /* JADX WARN: Type inference failed for: r2v32, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$30] */
    /* JADX WARN: Type inference failed for: r2v46, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$29] */
    /* JADX WARN: Type inference failed for: r2v83, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$24] */
    /* JADX WARN: Type inference failed for: r2v87, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$22] */
    /* JADX WARN: Type inference failed for: r3v112, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$13] */
    /* JADX WARN: Type inference failed for: r3v117, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$14] */
    /* JADX WARN: Type inference failed for: r3v123, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$11] */
    /* JADX WARN: Type inference failed for: r3v128, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$12] */
    /* JADX WARN: Type inference failed for: r3v144, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$6] */
    /* JADX WARN: Type inference failed for: r3v149, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$7] */
    /* JADX WARN: Type inference failed for: r3v21, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$31] */
    /* JADX WARN: Type inference failed for: r3v74, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$23] */
    /* JADX WARN: Type inference failed for: r4v35, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$25] */
    /* JADX WARN: Type inference failed for: r4v90, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$16] */
    /* JADX WARN: Type inference failed for: r5v17, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$26] */
    /* JADX WARN: Type inference failed for: r5v21, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$27] */
    /* JADX WARN: Type inference failed for: r5v44, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403$17] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.1
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "待刷新")) {
            if (entityPlayer.getEntityData().func_74769_h("JingPaiYuan") >= new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.2
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "JingPaiJia")) {
                if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.3
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "JingPaiCiShu") == 1.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp = new BlockPos(x, y, z);
                        TileEntity _tileEntity = world.func_175625_s(_bp);
                        IBlockState _bs = world.func_180495_p(_bp);
                        if (_tileEntity != null) {
                            _tileEntity.getTileData().func_74780_a("JingPaiCiShu", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.4
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "JingPaiCiShu") + 1.0d);
                        }
                        world.func_184138_a(_bp, _bs, _bs, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp2 = new BlockPos(x, y, z);
                        TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                        IBlockState _bs2 = world.func_180495_p(_bp2);
                        if (_tileEntity2 != null) {
                            _tileEntity2.getTileData().func_74780_a("JingPaiDiJia", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.5
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "JingPaiJia") * 1.2d);
                        }
                        world.func_184138_a(_bp2, _bs2, _bs2, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp3 = new BlockPos(x, y, z);
                        TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                        IBlockState _bs3 = world.func_180495_p(_bp3);
                        if (_tileEntity3 != null) {
                            _tileEntity3.getTileData().func_74780_a("JingPaiJia", new Random().nextInt(((int) (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.6
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "JingPaiJia") * 0.8d)) + 1) + (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.7
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "JingPaiJia") * 1.2d));
                        }
                        world.func_184138_a(_bp3, _bs3, _bs3, 3);
                        return;
                    }
                    return;
                } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.8
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "JingPaiCiShu") == 2.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp4 = new BlockPos(x, y, z);
                        TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                        IBlockState _bs4 = world.func_180495_p(_bp4);
                        if (_tileEntity4 != null) {
                            _tileEntity4.getTileData().func_74780_a("JingPaiCiShu", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.9
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "JingPaiCiShu") + 1.0d);
                        }
                        world.func_184138_a(_bp4, _bs4, _bs4, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp5 = new BlockPos(x, y, z);
                        TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                        IBlockState _bs5 = world.func_180495_p(_bp5);
                        if (_tileEntity5 != null) {
                            _tileEntity5.getTileData().func_74780_a("JingPaiDiJia", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.10
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "JingPaiJia") * 1.2d);
                        }
                        world.func_184138_a(_bp5, _bs5, _bs5, 3);
                    }
                    if (new Random().nextInt(100) < entityPlayer.getEntityData().func_74769_h("XingShang") * 10.0d) {
                        if (!world.field_72995_K) {
                            BlockPos _bp6 = new BlockPos(x, y, z);
                            TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                            IBlockState _bs6 = world.func_180495_p(_bp6);
                            if (_tileEntity6 != null) {
                                _tileEntity6.getTileData().func_74780_a("JingPaiJia", new Random().nextInt(((int) (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.11
                                    public double getValue(BlockPos pos, String tag) {
                                        TileEntity tileEntity = world.func_175625_s(pos);
                                        if (tileEntity != null) {
                                            return tileEntity.getTileData().func_74769_h(tag);
                                        }
                                        return -1.0d;
                                    }
                                }.getValue(new BlockPos(x, y, z), "JingPaiJia") * 0.8d)) + 1) + (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.12
                                    public double getValue(BlockPos pos, String tag) {
                                        TileEntity tileEntity = world.func_175625_s(pos);
                                        if (tileEntity != null) {
                                            return tileEntity.getTileData().func_74769_h(tag);
                                        }
                                        return -1.0d;
                                    }
                                }.getValue(new BlockPos(x, y, z), "JingPaiJia") * 1.2d));
                            }
                            world.func_184138_a(_bp6, _bs6, _bs6, 3);
                            return;
                        }
                        return;
                    } else if (!world.field_72995_K) {
                        BlockPos _bp7 = new BlockPos(x, y, z);
                        TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                        IBlockState _bs7 = world.func_180495_p(_bp7);
                        if (_tileEntity7 != null) {
                            _tileEntity7.getTileData().func_74780_a("JingPaiJia", new Random().nextInt(((int) (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.13
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "JingPaiJia") * 1.8d)) + 1) + (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.14
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "JingPaiJia") * 1.2d));
                        }
                        world.func_184138_a(_bp7, _bs7, _bs7, 3);
                        return;
                    } else {
                        return;
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.15
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "JingPaiCiShu") == 3.0d) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("成功以" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("JingPaiYuan")) + "灵石拍下了[" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.16
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 0).func_82833_r() + "§f*" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.17
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 0)) + "]"), false);
                    }
                    if (entityPlayer instanceof EntityPlayer) {
                        ItemStack _setstack = new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.18
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 0);
                        _setstack.func_190920_e(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.19
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 0));
                        ItemHandlerHelper.giveItemToPlayer(entityPlayer, _setstack);
                    }
                    entityPlayer.getEntityData().func_74780_a("XingShangXp", entityPlayer.getEntityData().func_74769_h("XingShangXp") + entityPlayer.getEntityData().func_74769_h("JingPaiYuan"));
                    entityPlayer.getEntityData().func_74780_a("JingPaiYuan", 0.0d);
                    if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.20
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "JingPaiChangCi") < 3.0d) {
                        if (!world.field_72995_K) {
                            BlockPos _bp8 = new BlockPos(x, y, z);
                            TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                            IBlockState _bs8 = world.func_180495_p(_bp8);
                            if (_tileEntity8 != null) {
                                _tileEntity8.getTileData().func_74780_a("JingPaiChangCi", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.21
                                    public double getValue(BlockPos pos, String tag) {
                                        TileEntity tileEntity = world.func_175625_s(pos);
                                        if (tileEntity != null) {
                                            return tileEntity.getTileData().func_74769_h(tag);
                                        }
                                        return -1.0d;
                                    }
                                }.getValue(new BlockPos(x, y, z), "JingPaiChangCi") + 1.0d);
                            }
                            world.func_184138_a(_bp8, _bs8, _bs8, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp9 = new BlockPos(x, y, z);
                            TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                            IBlockState _bs9 = world.func_180495_p(_bp9);
                            if (_tileEntity9 != null) {
                                _tileEntity9.getTileData().func_74780_a("JingPaiCiShu", 1.0d);
                            }
                            world.func_184138_a(_bp9, _bs9, _bs9, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp10 = new BlockPos(x, y, z);
                            TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                            IBlockState _bs10 = world.func_180495_p(_bp10);
                            if (_tileEntity10 != null) {
                                _tileEntity10.getTileData().func_74780_a("序列", new Random().nextInt(105) + 1);
                            }
                            world.func_184138_a(_bp10, _bs10, _bs10, 3);
                        }
                        Map<String, Object> $_dependencies = new HashMap<>();
                        $_dependencies.put("x", Integer.valueOf(x));
                        $_dependencies.put("y", Integer.valueOf(y));
                        $_dependencies.put("z", Integer.valueOf(z));
                        $_dependencies.put("world", world);
                        ProcedureFangShi402.executeProcedure($_dependencies);
                        if (!world.field_72995_K) {
                            BlockPos _bp11 = new BlockPos(x, y, z);
                            TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                            IBlockState _bs11 = world.func_180495_p(_bp11);
                            if (_tileEntity11 != null) {
                                _tileEntity11.getTileData().func_74780_a("JingPaiDiJia", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.22
                                    public double getValue(BlockPos pos, String tag) {
                                        TileEntity tileEntity = world.func_175625_s(pos);
                                        if (tileEntity != null) {
                                            return tileEntity.getTileData().func_74769_h(tag);
                                        }
                                        return -1.0d;
                                    }
                                }.getValue(new BlockPos(x, y, z), "JiaGe") * new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.23
                                    public int getAmount(BlockPos pos, int sltid) {
                                        ItemStack stack;
                                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                        if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                            return stack.func_190916_E();
                                        }
                                        return 0;
                                    }
                                }.getAmount(new BlockPos(x, y, z), 0));
                            }
                            world.func_184138_a(_bp11, _bs11, _bs11, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp12 = new BlockPos(x, y, z);
                            TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                            IBlockState _bs12 = world.func_180495_p(_bp12);
                            if (_tileEntity12 != null) {
                                _tileEntity12.getTileData().func_74780_a("JingPaiJia", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.24
                                    public double getValue(BlockPos pos, String tag) {
                                        TileEntity tileEntity = world.func_175625_s(pos);
                                        if (tileEntity != null) {
                                            return tileEntity.getTileData().func_74769_h(tag);
                                        }
                                        return -1.0d;
                                    }
                                }.getValue(new BlockPos(x, y, z), "JingPaiDiJia"));
                            }
                            world.func_184138_a(_bp12, _bs12, _bs12, 3);
                            return;
                        }
                        return;
                    }
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        func_175625_s.func_70304_b(0);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp13 = new BlockPos(x, y, z);
                        TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                        IBlockState _bs13 = world.func_180495_p(_bp13);
                        if (_tileEntity13 != null) {
                            _tileEntity13.getTileData().func_74757_a("待刷新", true);
                        }
                        world.func_184138_a(_bp13, _bs13, _bs13, 3);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("[" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.25
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                        if (func_175625_s2 instanceof TileEntityLockableLoot) {
                            return func_175625_s2.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0).func_82833_r() + "§f*" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.26
                    public int getAmount(BlockPos pos, int sltid) {
                        ItemStack stack;
                        TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                        if ((func_175625_s2 instanceof TileEntityLockableLoot) && (stack = func_175625_s2.func_70301_a(sltid)) != null) {
                            return stack.func_190916_E();
                        }
                        return 0;
                    }
                }.getAmount(new BlockPos(x, y, z), 0)) + "]被其他人以" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.27
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "JingPaiJia") + 1.0d) + "灵石拍走了~~~"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingPaiYuan") > 0.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString(new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("JingPaiYuan")) + "灵石已退回至你的账户"), false);
            }
            entityPlayer.getEntityData().func_74780_a("LingYuanNum", entityPlayer.getEntityData().func_74769_h("LingYuanNum") + entityPlayer.getEntityData().func_74769_h("JingPaiYuan"));
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.28
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "JingPaiChangCi") < 3.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp14 = new BlockPos(x, y, z);
                    TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                    IBlockState _bs14 = world.func_180495_p(_bp14);
                    if (_tileEntity14 != null) {
                        _tileEntity14.getTileData().func_74780_a("JingPaiChangCi", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.29
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "JingPaiChangCi") + 1.0d);
                    }
                    world.func_184138_a(_bp14, _bs14, _bs14, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp15 = new BlockPos(x, y, z);
                    TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                    IBlockState _bs15 = world.func_180495_p(_bp15);
                    if (_tileEntity15 != null) {
                        _tileEntity15.getTileData().func_74780_a("JingPaiCiShu", 1.0d);
                    }
                    world.func_184138_a(_bp15, _bs15, _bs15, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp16 = new BlockPos(x, y, z);
                    TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                    IBlockState _bs16 = world.func_180495_p(_bp16);
                    if (_tileEntity16 != null) {
                        _tileEntity16.getTileData().func_74780_a("序列", new Random().nextInt(105) + 1);
                    }
                    world.func_184138_a(_bp16, _bs16, _bs16, 3);
                }
                Map<String, Object> $_dependencies2 = new HashMap<>();
                $_dependencies2.put("x", Integer.valueOf(x));
                $_dependencies2.put("y", Integer.valueOf(y));
                $_dependencies2.put("z", Integer.valueOf(z));
                $_dependencies2.put("world", world);
                ProcedureFangShi402.executeProcedure($_dependencies2);
                if (!world.field_72995_K) {
                    BlockPos _bp17 = new BlockPos(x, y, z);
                    TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                    IBlockState _bs17 = world.func_180495_p(_bp17);
                    if (_tileEntity17 != null) {
                        _tileEntity17.getTileData().func_74780_a("JingPaiDiJia", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.30
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "JiaGe") * new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.31
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                                if ((func_175625_s2 instanceof TileEntityLockableLoot) && (stack = func_175625_s2.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 0));
                    }
                    world.func_184138_a(_bp17, _bs17, _bs17, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp18 = new BlockPos(x, y, z);
                    TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                    IBlockState _bs18 = world.func_180495_p(_bp18);
                    if (_tileEntity18 != null) {
                        _tileEntity18.getTileData().func_74780_a("JingPaiJia", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi403.32
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "JingPaiDiJia"));
                    }
                    world.func_184138_a(_bp18, _bs18, _bs18, 3);
                }
            } else {
                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s2 instanceof TileEntityLockableLoot) {
                    func_175625_s2.func_70304_b(0);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp19 = new BlockPos(x, y, z);
                    TileEntity _tileEntity19 = world.func_175625_s(_bp19);
                    IBlockState _bs19 = world.func_180495_p(_bp19);
                    if (_tileEntity19 != null) {
                        _tileEntity19.getTileData().func_74757_a("待刷新", true);
                    }
                    world.func_184138_a(_bp19, _bs19, _bs19, 3);
                }
            }
            entityPlayer.getEntityData().func_74780_a("JingPaiYuan", 0.0d);
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("客官需等待下一轮拍卖物品上架后才可继续拍卖哦~"), false);
        }
    }
}
