package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemCaiitem04;
import net.mcreator.fabaokuozhan.item.ItemCailiao14;
import net.mcreator.fabaokuozhan.item.ItemCailiao16;
import net.mcreator.fabaokuozhan.item.ItemCailiao17;
import net.mcreator.fabaokuozhan.item.ItemJuDuHeiYe;
import net.mcreator.fabaokuozhan.item.ItemShouHuangJingXue;
import net.mcreator.fabaokuozhan.item.ItemSuppressMonsterSword3;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureLianQiPeiFang4.class */
public class ProcedureLianQiPeiFang4 extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLianQiPeiFang4(ElementsFabaokuozhanMod instance) {
        super(instance, 570);
    }

    /* JADX WARN: Type inference failed for: r0v160, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$34] */
    /* JADX WARN: Type inference failed for: r0v166, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$35] */
    /* JADX WARN: Type inference failed for: r0v169, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$36] */
    /* JADX WARN: Type inference failed for: r0v172, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$37] */
    /* JADX WARN: Type inference failed for: r0v174, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$38] */
    /* JADX WARN: Type inference failed for: r0v176, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$39] */
    /* JADX WARN: Type inference failed for: r0v178, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$40] */
    /* JADX WARN: Type inference failed for: r0v268, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$26] */
    /* JADX WARN: Type inference failed for: r0v271, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$27] */
    /* JADX WARN: Type inference failed for: r0v274, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$28] */
    /* JADX WARN: Type inference failed for: r0v277, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$29] */
    /* JADX WARN: Type inference failed for: r0v279, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$30] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$1] */
    /* JADX WARN: Type inference failed for: r0v281, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$31] */
    /* JADX WARN: Type inference failed for: r0v283, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$32] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$9] */
    /* JADX WARN: Type inference failed for: r0v373, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$18] */
    /* JADX WARN: Type inference failed for: r0v376, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$19] */
    /* JADX WARN: Type inference failed for: r0v382, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$20] */
    /* JADX WARN: Type inference failed for: r0v385, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$21] */
    /* JADX WARN: Type inference failed for: r0v387, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$22] */
    /* JADX WARN: Type inference failed for: r0v389, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$23] */
    /* JADX WARN: Type inference failed for: r0v391, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$24] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$17] */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$25] */
    /* JADX WARN: Type inference failed for: r0v46, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$33] */
    /* JADX WARN: Type inference failed for: r0v481, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$10] */
    /* JADX WARN: Type inference failed for: r0v487, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$11] */
    /* JADX WARN: Type inference failed for: r0v49, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$41] */
    /* JADX WARN: Type inference failed for: r0v490, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$12] */
    /* JADX WARN: Type inference failed for: r0v493, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$13] */
    /* JADX WARN: Type inference failed for: r0v495, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$14] */
    /* JADX WARN: Type inference failed for: r0v497, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$15] */
    /* JADX WARN: Type inference failed for: r0v499, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$16] */
    /* JADX WARN: Type inference failed for: r0v55, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$42] */
    /* JADX WARN: Type inference failed for: r0v58, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$43] */
    /* JADX WARN: Type inference failed for: r0v589, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$2] */
    /* JADX WARN: Type inference failed for: r0v592, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$3] */
    /* JADX WARN: Type inference failed for: r0v598, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$4] */
    /* JADX WARN: Type inference failed for: r0v601, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$5] */
    /* JADX WARN: Type inference failed for: r0v603, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$6] */
    /* JADX WARN: Type inference failed for: r0v605, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$7] */
    /* JADX WARN: Type inference failed for: r0v607, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$8] */
    /* JADX WARN: Type inference failed for: r0v61, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$44] */
    /* JADX WARN: Type inference failed for: r0v64, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$45] */
    /* JADX WARN: Type inference failed for: r0v66, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$46] */
    /* JADX WARN: Type inference failed for: r0v68, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$47] */
    /* JADX WARN: Type inference failed for: r0v70, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4$48] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuyaoshou:caientity0101") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.2
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCailiao14.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.3
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cai_liao_10") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.4
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(ItemCaiitem04.block, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.5
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 4 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.6
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 2 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.7
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 4 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.8
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 3) >= 1) {
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("leixing", 3.0d);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                    IBlockState _bs2 = world.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74780_a("lianqijingyan", 125.0d);
                    }
                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74780_a("扣除灵力", 1300.0d);
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z);
                    TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                    IBlockState _bs4 = world.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74780_a("shuliang0", 4.0d);
                    }
                    world.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y, z);
                    TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                    IBlockState _bs5 = world.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74780_a("shuliang1", 2.0d);
                    }
                    world.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp6 = new BlockPos(x, y, z);
                    TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                    IBlockState _bs6 = world.func_180495_p(_bp6);
                    if (_tileEntity6 != null) {
                        _tileEntity6.getTileData().func_74780_a("shuliang2", 4.0d);
                    }
                    world.func_184138_a(_bp6, _bs6, _bs6, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp7 = new BlockPos(x, y, z);
                    TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                    IBlockState _bs7 = world.func_180495_p(_bp7);
                    if (_tileEntity7 != null) {
                        _tileEntity7.getTileData().func_74780_a("shuliang3", 2.0d);
                    }
                    world.func_184138_a(_bp7, _bs7, _bs7, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.9
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:huoyan04") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.10
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuyaoshou:caientity0201") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.11
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCailiao17.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.12
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(ItemCaiitem04.block, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.13
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.14
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 4 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.15
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.16
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 3) >= 1) {
                if (!world.field_72995_K) {
                    BlockPos _bp8 = new BlockPos(x, y, z);
                    TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                    IBlockState _bs8 = world.func_180495_p(_bp8);
                    if (_tileEntity8 != null) {
                        _tileEntity8.getTileData().func_74780_a("leixing", 26.0d);
                    }
                    world.func_184138_a(_bp8, _bs8, _bs8, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp9 = new BlockPos(x, y, z);
                    TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                    IBlockState _bs9 = world.func_180495_p(_bp9);
                    if (_tileEntity9 != null) {
                        _tileEntity9.getTileData().func_74780_a("lianqijingyan", 125.0d);
                    }
                    world.func_184138_a(_bp9, _bs9, _bs9, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp10 = new BlockPos(x, y, z);
                    TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                    IBlockState _bs10 = world.func_180495_p(_bp10);
                    if (_tileEntity10 != null) {
                        _tileEntity10.getTileData().func_74780_a("扣除灵力", 1300.0d);
                    }
                    world.func_184138_a(_bp10, _bs10, _bs10, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp11 = new BlockPos(x, y, z);
                    TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                    IBlockState _bs11 = world.func_180495_p(_bp11);
                    if (_tileEntity11 != null) {
                        _tileEntity11.getTileData().func_74780_a("shuliang0", 1.0d);
                    }
                    world.func_184138_a(_bp11, _bs11, _bs11, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp12 = new BlockPos(x, y, z);
                    TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                    IBlockState _bs12 = world.func_180495_p(_bp12);
                    if (_tileEntity12 != null) {
                        _tileEntity12.getTileData().func_74780_a("shuliang1", 4.0d);
                    }
                    world.func_184138_a(_bp12, _bs12, _bs12, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp13 = new BlockPos(x, y, z);
                    TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                    IBlockState _bs13 = world.func_180495_p(_bp13);
                    if (_tileEntity13 != null) {
                        _tileEntity13.getTileData().func_74780_a("shuliang2", 3.0d);
                    }
                    world.func_184138_a(_bp13, _bs13, _bs13, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp14 = new BlockPos(x, y, z);
                    TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                    IBlockState _bs14 = world.func_180495_p(_bp14);
                    if (_tileEntity14 != null) {
                        _tileEntity14.getTileData().func_74780_a("shuliang3", 1.0d);
                    }
                    world.func_184138_a(_bp14, _bs14, _bs14, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.17
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemSuppressMonsterSword3.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.18
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemShouHuangJingXue.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.19
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cai_liao_10") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.20
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.21
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.22
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 5 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.23
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.24
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 3) >= 0) {
                if (!world.field_72995_K) {
                    BlockPos _bp15 = new BlockPos(x, y, z);
                    TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                    IBlockState _bs15 = world.func_180495_p(_bp15);
                    if (_tileEntity15 != null) {
                        _tileEntity15.getTileData().func_74780_a("leixing", 35.0d);
                    }
                    world.func_184138_a(_bp15, _bs15, _bs15, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp16 = new BlockPos(x, y, z);
                    TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                    IBlockState _bs16 = world.func_180495_p(_bp16);
                    if (_tileEntity16 != null) {
                        _tileEntity16.getTileData().func_74780_a("lianqijingyan", 125.0d);
                    }
                    world.func_184138_a(_bp16, _bs16, _bs16, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp17 = new BlockPos(x, y, z);
                    TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                    IBlockState _bs17 = world.func_180495_p(_bp17);
                    if (_tileEntity17 != null) {
                        _tileEntity17.getTileData().func_74780_a("扣除灵力", 1300.0d);
                    }
                    world.func_184138_a(_bp17, _bs17, _bs17, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp18 = new BlockPos(x, y, z);
                    TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                    IBlockState _bs18 = world.func_180495_p(_bp18);
                    if (_tileEntity18 != null) {
                        _tileEntity18.getTileData().func_74780_a("shuliang0", 1.0d);
                    }
                    world.func_184138_a(_bp18, _bs18, _bs18, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp19 = new BlockPos(x, y, z);
                    TileEntity _tileEntity19 = world.func_175625_s(_bp19);
                    IBlockState _bs19 = world.func_180495_p(_bp19);
                    if (_tileEntity19 != null) {
                        _tileEntity19.getTileData().func_74780_a("shuliang1", 5.0d);
                    }
                    world.func_184138_a(_bp19, _bs19, _bs19, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp20 = new BlockPos(x, y, z);
                    TileEntity _tileEntity20 = world.func_175625_s(_bp20);
                    IBlockState _bs20 = world.func_180495_p(_bp20);
                    if (_tileEntity20 != null) {
                        _tileEntity20.getTileData().func_74780_a("shuliang2", 3.0d);
                    }
                    world.func_184138_a(_bp20, _bs20, _bs20, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp21 = new BlockPos(x, y, z);
                    TileEntity _tileEntity21 = world.func_175625_s(_bp21);
                    IBlockState _bs21 = world.func_180495_p(_bp21);
                    if (_tileEntity21 != null) {
                        _tileEntity21.getTileData().func_74780_a("shuliang3", 0.0d);
                    }
                    world.func_184138_a(_bp21, _bs21, _bs21, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.25
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemJuDuHeiYe.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.26
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCailiao16.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.27
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaiitem04.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.28
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.29
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 9 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.30
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 5 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.31
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.32
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 3) >= 0) {
                if (!world.field_72995_K) {
                    BlockPos _bp22 = new BlockPos(x, y, z);
                    TileEntity _tileEntity22 = world.func_175625_s(_bp22);
                    IBlockState _bs22 = world.func_180495_p(_bp22);
                    if (_tileEntity22 != null) {
                        _tileEntity22.getTileData().func_74780_a("leixing", 27.0d);
                    }
                    world.func_184138_a(_bp22, _bs22, _bs22, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp23 = new BlockPos(x, y, z);
                    TileEntity _tileEntity23 = world.func_175625_s(_bp23);
                    IBlockState _bs23 = world.func_180495_p(_bp23);
                    if (_tileEntity23 != null) {
                        _tileEntity23.getTileData().func_74780_a("lianqijingyan", 125.0d);
                    }
                    world.func_184138_a(_bp23, _bs23, _bs23, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp24 = new BlockPos(x, y, z);
                    TileEntity _tileEntity24 = world.func_175625_s(_bp24);
                    IBlockState _bs24 = world.func_180495_p(_bp24);
                    if (_tileEntity24 != null) {
                        _tileEntity24.getTileData().func_74780_a("扣除灵力", 1300.0d);
                    }
                    world.func_184138_a(_bp24, _bs24, _bs24, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp25 = new BlockPos(x, y, z);
                    TileEntity _tileEntity25 = world.func_175625_s(_bp25);
                    IBlockState _bs25 = world.func_180495_p(_bp25);
                    if (_tileEntity25 != null) {
                        _tileEntity25.getTileData().func_74780_a("shuliang0", 9.0d);
                    }
                    world.func_184138_a(_bp25, _bs25, _bs25, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp26 = new BlockPos(x, y, z);
                    TileEntity _tileEntity26 = world.func_175625_s(_bp26);
                    IBlockState _bs26 = world.func_180495_p(_bp26);
                    if (_tileEntity26 != null) {
                        _tileEntity26.getTileData().func_74780_a("shuliang1", 5.0d);
                    }
                    world.func_184138_a(_bp26, _bs26, _bs26, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp27 = new BlockPos(x, y, z);
                    TileEntity _tileEntity27 = world.func_175625_s(_bp27);
                    IBlockState _bs27 = world.func_180495_p(_bp27);
                    if (_tileEntity27 != null) {
                        _tileEntity27.getTileData().func_74780_a("shuliang2", 1.0d);
                    }
                    world.func_184138_a(_bp27, _bs27, _bs27, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp28 = new BlockPos(x, y, z);
                    TileEntity _tileEntity28 = world.func_175625_s(_bp28);
                    IBlockState _bs28 = world.func_180495_p(_bp28);
                    if (_tileEntity28 != null) {
                        _tileEntity28.getTileData().func_74780_a("shuliang3", 0.0d);
                    }
                    world.func_184138_a(_bp28, _bs28, _bs28, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.33
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCailiao17.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.34
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:huoyan04") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.35
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemShouHuangJingXue.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.36
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(ItemCaiitem04.block, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.37
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 5 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.38
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.39
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 4 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.40
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 3) >= 1) {
                if (!world.field_72995_K) {
                    BlockPos _bp29 = new BlockPos(x, y, z);
                    TileEntity _tileEntity29 = world.func_175625_s(_bp29);
                    IBlockState _bs29 = world.func_180495_p(_bp29);
                    if (_tileEntity29 != null) {
                        _tileEntity29.getTileData().func_74780_a("leixing", 21.0d);
                    }
                    world.func_184138_a(_bp29, _bs29, _bs29, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp30 = new BlockPos(x, y, z);
                    TileEntity _tileEntity30 = world.func_175625_s(_bp30);
                    IBlockState _bs30 = world.func_180495_p(_bp30);
                    if (_tileEntity30 != null) {
                        _tileEntity30.getTileData().func_74780_a("lianqijingyan", 125.0d);
                    }
                    world.func_184138_a(_bp30, _bs30, _bs30, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp31 = new BlockPos(x, y, z);
                    TileEntity _tileEntity31 = world.func_175625_s(_bp31);
                    IBlockState _bs31 = world.func_180495_p(_bp31);
                    if (_tileEntity31 != null) {
                        _tileEntity31.getTileData().func_74780_a("扣除灵力", 1300.0d);
                    }
                    world.func_184138_a(_bp31, _bs31, _bs31, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp32 = new BlockPos(x, y, z);
                    TileEntity _tileEntity32 = world.func_175625_s(_bp32);
                    IBlockState _bs32 = world.func_180495_p(_bp32);
                    if (_tileEntity32 != null) {
                        _tileEntity32.getTileData().func_74780_a("shuliang0", 5.0d);
                    }
                    world.func_184138_a(_bp32, _bs32, _bs32, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp33 = new BlockPos(x, y, z);
                    TileEntity _tileEntity33 = world.func_175625_s(_bp33);
                    IBlockState _bs33 = world.func_180495_p(_bp33);
                    if (_tileEntity33 != null) {
                        _tileEntity33.getTileData().func_74780_a("shuliang1", 1.0d);
                    }
                    world.func_184138_a(_bp33, _bs33, _bs33, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp34 = new BlockPos(x, y, z);
                    TileEntity _tileEntity34 = world.func_175625_s(_bp34);
                    IBlockState _bs34 = world.func_180495_p(_bp34);
                    if (_tileEntity34 != null) {
                        _tileEntity34.getTileData().func_74780_a("shuliang2", 4.0d);
                    }
                    world.func_184138_a(_bp34, _bs34, _bs34, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp35 = new BlockPos(x, y, z);
                    TileEntity _tileEntity35 = world.func_175625_s(_bp35);
                    IBlockState _bs35 = world.func_180495_p(_bp35);
                    if (_tileEntity35 != null) {
                        _tileEntity35.getTileData().func_74780_a("shuliang3", 1.0d);
                    }
                    world.func_184138_a(_bp35, _bs35, _bs35, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.41
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchujiguan:yuan_ci_shi") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.42
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCaiitem04.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.43
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.44
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.45
            public int getAmount(BlockPos pos, int sltid) {
                ItemStack stack;
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                    return stack.func_190916_E();
                }
                return 0;
            }
        }.getAmount(new BlockPos(x, y, z), 0) >= 9 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.46
            public int getAmount(BlockPos pos, int sltid) {
                ItemStack stack;
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                    return stack.func_190916_E();
                }
                return 0;
            }
        }.getAmount(new BlockPos(x, y, z), 1) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.47
            public int getAmount(BlockPos pos, int sltid) {
                ItemStack stack;
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                    return stack.func_190916_E();
                }
                return 0;
            }
        }.getAmount(new BlockPos(x, y, z), 2) >= 0 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang4.48
            public int getAmount(BlockPos pos, int sltid) {
                ItemStack stack;
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                    return stack.func_190916_E();
                }
                return 0;
            }
        }.getAmount(new BlockPos(x, y, z), 3) >= 0) {
            if (!world.field_72995_K) {
                BlockPos _bp36 = new BlockPos(x, y, z);
                TileEntity _tileEntity36 = world.func_175625_s(_bp36);
                IBlockState _bs36 = world.func_180495_p(_bp36);
                if (_tileEntity36 != null) {
                    _tileEntity36.getTileData().func_74780_a("leixing", 40.0d);
                }
                world.func_184138_a(_bp36, _bs36, _bs36, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp37 = new BlockPos(x, y, z);
                TileEntity _tileEntity37 = world.func_175625_s(_bp37);
                IBlockState _bs37 = world.func_180495_p(_bp37);
                if (_tileEntity37 != null) {
                    _tileEntity37.getTileData().func_74780_a("lianqijingyan", 125.0d);
                }
                world.func_184138_a(_bp37, _bs37, _bs37, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp38 = new BlockPos(x, y, z);
                TileEntity _tileEntity38 = world.func_175625_s(_bp38);
                IBlockState _bs38 = world.func_180495_p(_bp38);
                if (_tileEntity38 != null) {
                    _tileEntity38.getTileData().func_74780_a("扣除灵力", 1300.0d);
                }
                world.func_184138_a(_bp38, _bs38, _bs38, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp39 = new BlockPos(x, y, z);
                TileEntity _tileEntity39 = world.func_175625_s(_bp39);
                IBlockState _bs39 = world.func_180495_p(_bp39);
                if (_tileEntity39 != null) {
                    _tileEntity39.getTileData().func_74780_a("shuliang0", 9.0d);
                }
                world.func_184138_a(_bp39, _bs39, _bs39, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp40 = new BlockPos(x, y, z);
                TileEntity _tileEntity40 = world.func_175625_s(_bp40);
                IBlockState _bs40 = world.func_180495_p(_bp40);
                if (_tileEntity40 != null) {
                    _tileEntity40.getTileData().func_74780_a("shuliang1", 1.0d);
                }
                world.func_184138_a(_bp40, _bs40, _bs40, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp41 = new BlockPos(x, y, z);
                TileEntity _tileEntity41 = world.func_175625_s(_bp41);
                IBlockState _bs41 = world.func_180495_p(_bp41);
                if (_tileEntity41 != null) {
                    _tileEntity41.getTileData().func_74780_a("shuliang2", 0.0d);
                }
                world.func_184138_a(_bp41, _bs41, _bs41, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp42 = new BlockPos(x, y, z);
                TileEntity _tileEntity42 = world.func_175625_s(_bp42);
                IBlockState _bs42 = world.func_180495_p(_bp42);
                if (_tileEntity42 != null) {
                    _tileEntity42.getTileData().func_74780_a("shuliang3", 0.0d);
                }
                world.func_184138_a(_bp42, _bs42, _bs42, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureLingLiCut.executeProcedure($_dependencies);
        }
    }
}
