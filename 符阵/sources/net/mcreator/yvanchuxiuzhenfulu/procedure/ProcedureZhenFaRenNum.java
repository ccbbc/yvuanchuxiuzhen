package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemZhenYuan;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenFaRenNum.class */
public class ProcedureZhenFaRenNum extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhenFaRenNum(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 565);
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaRenNum$1] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaRenNum$3] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaRenNum$5] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaRenNum$7] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaRenNum$9] */
    /* JADX WARN: Type inference failed for: r2v22, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaRenNum$10] */
    /* JADX WARN: Type inference failed for: r2v27, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaRenNum$8] */
    /* JADX WARN: Type inference failed for: r2v32, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaRenNum$6] */
    /* JADX WARN: Type inference failed for: r2v37, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaRenNum$4] */
    /* JADX WARN: Type inference failed for: r2v42, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaRenNum$2] */
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
                _tileEntity.getTileData().func_74780_a("阵法人数", 0.0d);
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaRenNum.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemZhenYuan.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp2 = new BlockPos(x, y, z);
            TileEntity _tileEntity2 = world.func_175625_s(_bp2);
            IBlockState _bs2 = world.func_180495_p(_bp2);
            if (_tileEntity2 != null) {
                _tileEntity2.getTileData().func_74780_a("阵法人数", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaRenNum.2
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法人数") + 1.0d);
            }
            world.func_184138_a(_bp2, _bs2, _bs2, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaRenNum.3
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemZhenYuan.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp3 = new BlockPos(x, y, z);
            TileEntity _tileEntity3 = world.func_175625_s(_bp3);
            IBlockState _bs3 = world.func_180495_p(_bp3);
            if (_tileEntity3 != null) {
                _tileEntity3.getTileData().func_74780_a("阵法人数", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaRenNum.4
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法人数") + 1.0d);
            }
            world.func_184138_a(_bp3, _bs3, _bs3, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaRenNum.5
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(ItemZhenYuan.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp4 = new BlockPos(x, y, z);
            TileEntity _tileEntity4 = world.func_175625_s(_bp4);
            IBlockState _bs4 = world.func_180495_p(_bp4);
            if (_tileEntity4 != null) {
                _tileEntity4.getTileData().func_74780_a("阵法人数", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaRenNum.6
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法人数") + 1.0d);
            }
            world.func_184138_a(_bp4, _bs4, _bs4, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaRenNum.7
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemZhenYuan.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp5 = new BlockPos(x, y, z);
            TileEntity _tileEntity5 = world.func_175625_s(_bp5);
            IBlockState _bs5 = world.func_180495_p(_bp5);
            if (_tileEntity5 != null) {
                _tileEntity5.getTileData().func_74780_a("阵法人数", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaRenNum.8
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法人数") + 1.0d);
            }
            world.func_184138_a(_bp5, _bs5, _bs5, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaRenNum.9
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemZhenYuan.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp6 = new BlockPos(x, y, z);
            TileEntity _tileEntity6 = world.func_175625_s(_bp6);
            IBlockState _bs6 = world.func_180495_p(_bp6);
            if (_tileEntity6 != null) {
                _tileEntity6.getTileData().func_74780_a("阵法人数", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaRenNum.10
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "阵法人数") + 1.0d);
            }
            world.func_184138_a(_bp6, _bs6, _bs6, 3);
        }
    }
}
