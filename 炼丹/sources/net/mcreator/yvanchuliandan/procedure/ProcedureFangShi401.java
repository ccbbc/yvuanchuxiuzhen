package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureFangShi401.class */
public class ProcedureFangShi401 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureFangShi401(ElementsYvanchuliandanMod instance) {
        super(instance, 841);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi401$1] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi401$6] */
    /* JADX WARN: Type inference failed for: r2v48, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi401$4] */
    /* JADX WARN: Type inference failed for: r2v52, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi401$2] */
    /* JADX WARN: Type inference failed for: r3v12, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi401$5] */
    /* JADX WARN: Type inference failed for: r3v24, types: [net.mcreator.yvanchuliandan.procedure.ProcedureFangShi401$3] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi401.1
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
                    _tileEntity.getTileData().func_74780_a("Time", 0.0d);
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74780_a("ShuaXinTime", 10800.0d);
                }
                world.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp3 = new BlockPos(x, y, z);
                TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                IBlockState _bs3 = world.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74780_a("序列", new Random().nextInt(105) + 1);
                }
                world.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                IBlockState _bs4 = world.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74780_a("JingPaiCiShu", 1.0d);
                }
                world.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp5 = new BlockPos(x, y, z);
                TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                IBlockState _bs5 = world.func_180495_p(_bp5);
                if (_tileEntity5 != null) {
                    _tileEntity5.getTileData().func_74780_a("JingPaiChangCi", 1.0d);
                }
                world.func_184138_a(_bp5, _bs5, _bs5, 3);
            }
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureFangShi402.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp6 = new BlockPos(x, y, z);
                TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                IBlockState _bs6 = world.func_180495_p(_bp6);
                if (_tileEntity6 != null) {
                    _tileEntity6.getTileData().func_74780_a("JingPaiDiJia", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi401.2
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "JiaGe") * new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi401.3
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
                world.func_184138_a(_bp6, _bs6, _bs6, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp7 = new BlockPos(x, y, z);
                TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                IBlockState _bs7 = world.func_180495_p(_bp7);
                if (_tileEntity7 != null) {
                    _tileEntity7.getTileData().func_74780_a("JingPaiJia", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi401.4
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "JingPaiDiJia"));
                }
                world.func_184138_a(_bp7, _bs7, _bs7, 3);
            }
            Map<String, Object> $_dependencies2 = new HashMap<>();
            $_dependencies2.put("x", Integer.valueOf(x));
            $_dependencies2.put("y", Integer.valueOf(y));
            $_dependencies2.put("z", Integer.valueOf(z));
            $_dependencies2.put("world", world);
            ProcedureTimeAcquisition.executeProcedure($_dependencies2);
            if (!world.field_72995_K) {
                BlockPos _bp8 = new BlockPos(x, y, z);
                TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                IBlockState _bs8 = world.func_180495_p(_bp8);
                if (_tileEntity8 != null) {
                    _tileEntity8.getTileData().func_74757_a("初始化", true);
                }
                world.func_184138_a(_bp8, _bs8, _bs8, 3);
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
            BlockPos _bp9 = new BlockPos(x, y, z);
            TileEntity _tileEntity9 = world.func_175625_s(_bp9);
            IBlockState _bs9 = world.func_180495_p(_bp9);
            if (_tileEntity9 != null) {
                _tileEntity9.getTileData().func_74780_a("ShuaXinTime", 10800.0d - new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi401.5
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "TimeDifference"));
            }
            world.func_184138_a(_bp9, _bs9, _bs9, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureFangShi401.6
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "TimeDifference") >= 10800.0d) {
            if (!world.field_72995_K) {
                BlockPos _bp10 = new BlockPos(x, y, z);
                TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                IBlockState _bs10 = world.func_180495_p(_bp10);
                if (_tileEntity10 != null) {
                    _tileEntity10.getTileData().func_74780_a("TimeDifference", 0.0d);
                }
                world.func_184138_a(_bp10, _bs10, _bs10, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp11 = new BlockPos(x, y, z);
                TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                IBlockState _bs11 = world.func_180495_p(_bp11);
                if (_tileEntity11 != null) {
                    _tileEntity11.getTileData().func_74780_a("ShuaXinTime", 10800.0d);
                }
                world.func_184138_a(_bp11, _bs11, _bs11, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp12 = new BlockPos(x, y, z);
                TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                IBlockState _bs12 = world.func_180495_p(_bp12);
                if (_tileEntity12 != null) {
                    _tileEntity12.getTileData().func_74757_a("初始化", false);
                }
                world.func_184138_a(_bp12, _bs12, _bs12, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp13 = new BlockPos(x, y, z);
                TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                IBlockState _bs13 = world.func_180495_p(_bp13);
                if (_tileEntity13 != null) {
                    _tileEntity13.getTileData().func_74757_a("待刷新", false);
                }
                world.func_184138_a(_bp13, _bs13, _bs13, 3);
            }
        }
    }
}
