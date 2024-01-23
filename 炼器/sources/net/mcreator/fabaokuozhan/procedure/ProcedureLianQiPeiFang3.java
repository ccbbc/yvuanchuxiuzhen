package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemCaiitem04;
import net.mcreator.fabaokuozhan.item.ItemCaiitem08;
import net.mcreator.fabaokuozhan.item.ItemCailiao12;
import net.mcreator.fabaokuozhan.item.ItemCailiao14;
import net.mcreator.fabaokuozhan.item.ItemCailiao15;
import net.mcreator.fabaokuozhan.item.ItemCailiao93;
import net.mcreator.fabaokuozhan.item.ItemFabao21;
import net.mcreator.fabaokuozhan.item.ItemFuLingShiYuan;
import net.mcreator.fabaokuozhan.item.ItemHuXinShi;
import net.mcreator.fabaokuozhan.item.ItemPuyu;
import net.mcreator.fabaokuozhan.item.ItemSuppressMonsterSword2;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureLianQiPeiFang3.class */
public class ProcedureLianQiPeiFang3 extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLianQiPeiFang3(ElementsFabaokuozhanMod instance) {
        super(instance, 569);
    }

    /* JADX WARN: Type inference failed for: r0v163, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$50] */
    /* JADX WARN: Type inference failed for: r0v169, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$51] */
    /* JADX WARN: Type inference failed for: r0v175, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$52] */
    /* JADX WARN: Type inference failed for: r0v178, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$53] */
    /* JADX WARN: Type inference failed for: r0v180, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$54] */
    /* JADX WARN: Type inference failed for: r0v182, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$55] */
    /* JADX WARN: Type inference failed for: r0v184, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$56] */
    /* JADX WARN: Type inference failed for: r0v274, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$42] */
    /* JADX WARN: Type inference failed for: r0v277, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$43] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$1] */
    /* JADX WARN: Type inference failed for: r0v280, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$44] */
    /* JADX WARN: Type inference failed for: r0v283, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$45] */
    /* JADX WARN: Type inference failed for: r0v285, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$46] */
    /* JADX WARN: Type inference failed for: r0v287, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$47] */
    /* JADX WARN: Type inference failed for: r0v289, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$48] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$9] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$17] */
    /* JADX WARN: Type inference failed for: r0v379, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$34] */
    /* JADX WARN: Type inference failed for: r0v385, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$35] */
    /* JADX WARN: Type inference failed for: r0v391, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$36] */
    /* JADX WARN: Type inference failed for: r0v394, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$37] */
    /* JADX WARN: Type inference failed for: r0v396, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$38] */
    /* JADX WARN: Type inference failed for: r0v398, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$39] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$25] */
    /* JADX WARN: Type inference failed for: r0v400, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$40] */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$33] */
    /* JADX WARN: Type inference failed for: r0v46, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$41] */
    /* JADX WARN: Type inference failed for: r0v490, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$26] */
    /* JADX WARN: Type inference failed for: r0v493, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$27] */
    /* JADX WARN: Type inference failed for: r0v499, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$28] */
    /* JADX WARN: Type inference failed for: r0v502, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$29] */
    /* JADX WARN: Type inference failed for: r0v504, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$30] */
    /* JADX WARN: Type inference failed for: r0v506, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$31] */
    /* JADX WARN: Type inference failed for: r0v508, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$32] */
    /* JADX WARN: Type inference failed for: r0v52, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$49] */
    /* JADX WARN: Type inference failed for: r0v55, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$57] */
    /* JADX WARN: Type inference failed for: r0v58, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$58] */
    /* JADX WARN: Type inference failed for: r0v598, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$18] */
    /* JADX WARN: Type inference failed for: r0v604, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$19] */
    /* JADX WARN: Type inference failed for: r0v61, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$59] */
    /* JADX WARN: Type inference failed for: r0v610, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$20] */
    /* JADX WARN: Type inference failed for: r0v613, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$21] */
    /* JADX WARN: Type inference failed for: r0v615, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$22] */
    /* JADX WARN: Type inference failed for: r0v617, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$23] */
    /* JADX WARN: Type inference failed for: r0v619, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$24] */
    /* JADX WARN: Type inference failed for: r0v64, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$60] */
    /* JADX WARN: Type inference failed for: r0v67, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$61] */
    /* JADX WARN: Type inference failed for: r0v69, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$62] */
    /* JADX WARN: Type inference failed for: r0v709, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$10] */
    /* JADX WARN: Type inference failed for: r0v71, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$63] */
    /* JADX WARN: Type inference failed for: r0v712, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$11] */
    /* JADX WARN: Type inference failed for: r0v715, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$12] */
    /* JADX WARN: Type inference failed for: r0v718, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$13] */
    /* JADX WARN: Type inference failed for: r0v720, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$14] */
    /* JADX WARN: Type inference failed for: r0v722, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$15] */
    /* JADX WARN: Type inference failed for: r0v724, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$16] */
    /* JADX WARN: Type inference failed for: r0v73, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$64] */
    /* JADX WARN: Type inference failed for: r0v814, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$2] */
    /* JADX WARN: Type inference failed for: r0v817, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$3] */
    /* JADX WARN: Type inference failed for: r0v820, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$4] */
    /* JADX WARN: Type inference failed for: r0v823, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$5] */
    /* JADX WARN: Type inference failed for: r0v825, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$6] */
    /* JADX WARN: Type inference failed for: r0v827, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$7] */
    /* JADX WARN: Type inference failed for: r0v829, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3$8] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:caiitem01") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.2
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCailiao15.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.3
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemPuyu.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.4
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(ItemCaiitem04.block, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.5
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 2 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.6
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.7
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.8
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
                        _tileEntity.getTileData().func_74780_a("leixing", 1.0d);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                    IBlockState _bs2 = world.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74780_a("lianqijingyan", 25.0d);
                    }
                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74780_a("扣除灵力", 400.0d);
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z);
                    TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                    IBlockState _bs4 = world.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74780_a("shuliang0", 2.0d);
                    }
                    world.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y, z);
                    TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                    IBlockState _bs5 = world.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74780_a("shuliang1", 3.0d);
                    }
                    world.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp6 = new BlockPos(x, y, z);
                    TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                    IBlockState _bs6 = world.func_180495_p(_bp6);
                    if (_tileEntity6 != null) {
                        _tileEntity6.getTileData().func_74780_a("shuliang2", 3.0d);
                    }
                    world.func_184138_a(_bp6, _bs6, _bs6, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp7 = new BlockPos(x, y, z);
                    TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                    IBlockState _bs7 = world.func_180495_p(_bp7);
                    if (_tileEntity7 != null) {
                        _tileEntity7.getTileData().func_74780_a("shuliang3", 1.0d);
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
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.9
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCailiao93.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.10
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCailiao12.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.11
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemFuLingShiYuan.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.12
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(ItemCaiitem04.block, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.13
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 2 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.14
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.15
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 5 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.16
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
                        _tileEntity8.getTileData().func_74780_a("leixing", 10.0d);
                    }
                    world.func_184138_a(_bp8, _bs8, _bs8, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp9 = new BlockPos(x, y, z);
                    TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                    IBlockState _bs9 = world.func_180495_p(_bp9);
                    if (_tileEntity9 != null) {
                        _tileEntity9.getTileData().func_74780_a("lianqijingyan", 25.0d);
                    }
                    world.func_184138_a(_bp9, _bs9, _bs9, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp10 = new BlockPos(x, y, z);
                    TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                    IBlockState _bs10 = world.func_180495_p(_bp10);
                    if (_tileEntity10 != null) {
                        _tileEntity10.getTileData().func_74780_a("扣除灵力", 400.0d);
                    }
                    world.func_184138_a(_bp10, _bs10, _bs10, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp11 = new BlockPos(x, y, z);
                    TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                    IBlockState _bs11 = world.func_180495_p(_bp11);
                    if (_tileEntity11 != null) {
                        _tileEntity11.getTileData().func_74780_a("shuliang0", 2.0d);
                    }
                    world.func_184138_a(_bp11, _bs11, _bs11, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp12 = new BlockPos(x, y, z);
                    TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                    IBlockState _bs12 = world.func_180495_p(_bp12);
                    if (_tileEntity12 != null) {
                        _tileEntity12.getTileData().func_74780_a("shuliang1", 1.0d);
                    }
                    world.func_184138_a(_bp12, _bs12, _bs12, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp13 = new BlockPos(x, y, z);
                    TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                    IBlockState _bs13 = world.func_180495_p(_bp13);
                    if (_tileEntity13 != null) {
                        _tileEntity13.getTileData().func_74780_a("shuliang2", 5.0d);
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
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.17
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemSuppressMonsterSword2.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.18
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cai_liao_07") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.19
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:lei_ban_lu_m_ao") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.20
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.21
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.22
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.23
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 2 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.24
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
                        _tileEntity15.getTileData().func_74780_a("leixing", 34.0d);
                    }
                    world.func_184138_a(_bp15, _bs15, _bs15, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp16 = new BlockPos(x, y, z);
                    TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                    IBlockState _bs16 = world.func_180495_p(_bp16);
                    if (_tileEntity16 != null) {
                        _tileEntity16.getTileData().func_74780_a("lianqijingyan", 25.0d);
                    }
                    world.func_184138_a(_bp16, _bs16, _bs16, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp17 = new BlockPos(x, y, z);
                    TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                    IBlockState _bs17 = world.func_180495_p(_bp17);
                    if (_tileEntity17 != null) {
                        _tileEntity17.getTileData().func_74780_a("扣除灵力", 400.0d);
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
                        _tileEntity19.getTileData().func_74780_a("shuliang1", 6.0d);
                    }
                    world.func_184138_a(_bp19, _bs19, _bs19, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp20 = new BlockPos(x, y, z);
                    TileEntity _tileEntity20 = world.func_175625_s(_bp20);
                    IBlockState _bs20 = world.func_180495_p(_bp20);
                    if (_tileEntity20 != null) {
                        _tileEntity20.getTileData().func_74780_a("shuliang2", 2.0d);
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
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.25
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCailiao14.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.26
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCailiao93.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.27
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cai_liao_07") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.28
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(ItemCaiitem04.block, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.29
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.30
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.31
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.32
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
                    BlockPos _bp22 = new BlockPos(x, y, z);
                    TileEntity _tileEntity22 = world.func_175625_s(_bp22);
                    IBlockState _bs22 = world.func_180495_p(_bp22);
                    if (_tileEntity22 != null) {
                        _tileEntity22.getTileData().func_74780_a("leixing", 37.0d);
                    }
                    world.func_184138_a(_bp22, _bs22, _bs22, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp23 = new BlockPos(x, y, z);
                    TileEntity _tileEntity23 = world.func_175625_s(_bp23);
                    IBlockState _bs23 = world.func_180495_p(_bp23);
                    if (_tileEntity23 != null) {
                        _tileEntity23.getTileData().func_74780_a("lianqijingyan", 25.0d);
                    }
                    world.func_184138_a(_bp23, _bs23, _bs23, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp24 = new BlockPos(x, y, z);
                    TileEntity _tileEntity24 = world.func_175625_s(_bp24);
                    IBlockState _bs24 = world.func_180495_p(_bp24);
                    if (_tileEntity24 != null) {
                        _tileEntity24.getTileData().func_74780_a("扣除灵力", 400.0d);
                    }
                    world.func_184138_a(_bp24, _bs24, _bs24, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp25 = new BlockPos(x, y, z);
                    TileEntity _tileEntity25 = world.func_175625_s(_bp25);
                    IBlockState _bs25 = world.func_180495_p(_bp25);
                    if (_tileEntity25 != null) {
                        _tileEntity25.getTileData().func_74780_a("shuliang0", 3.0d);
                    }
                    world.func_184138_a(_bp25, _bs25, _bs25, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp26 = new BlockPos(x, y, z);
                    TileEntity _tileEntity26 = world.func_175625_s(_bp26);
                    IBlockState _bs26 = world.func_180495_p(_bp26);
                    if (_tileEntity26 != null) {
                        _tileEntity26.getTileData().func_74780_a("shuliang1", 1.0d);
                    }
                    world.func_184138_a(_bp26, _bs26, _bs26, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp27 = new BlockPos(x, y, z);
                    TileEntity _tileEntity27 = world.func_175625_s(_bp27);
                    IBlockState _bs27 = world.func_180495_p(_bp27);
                    if (_tileEntity27 != null) {
                        _tileEntity27.getTileData().func_74780_a("shuliang2", 3.0d);
                    }
                    world.func_184138_a(_bp27, _bs27, _bs27, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp28 = new BlockPos(x, y, z);
                    TileEntity _tileEntity28 = world.func_175625_s(_bp28);
                    IBlockState _bs28 = world.func_180495_p(_bp28);
                    if (_tileEntity28 != null) {
                        _tileEntity28.getTileData().func_74780_a("shuliang3", 1.0d);
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
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.33
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemFabao21.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.34
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cai_liao_08") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.35
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().contains("yvanchuliandan:cai_liao_06") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.36
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(ItemCaiitem04.block, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.37
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.38
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.39
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 2 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.40
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
                        _tileEntity29.getTileData().func_74780_a("leixing", 38.0d);
                    }
                    world.func_184138_a(_bp29, _bs29, _bs29, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp30 = new BlockPos(x, y, z);
                    TileEntity _tileEntity30 = world.func_175625_s(_bp30);
                    IBlockState _bs30 = world.func_180495_p(_bp30);
                    if (_tileEntity30 != null) {
                        _tileEntity30.getTileData().func_74780_a("lianqijingyan", 25.0d);
                    }
                    world.func_184138_a(_bp30, _bs30, _bs30, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp31 = new BlockPos(x, y, z);
                    TileEntity _tileEntity31 = world.func_175625_s(_bp31);
                    IBlockState _bs31 = world.func_180495_p(_bp31);
                    if (_tileEntity31 != null) {
                        _tileEntity31.getTileData().func_74780_a("扣除灵力", 400.0d);
                    }
                    world.func_184138_a(_bp31, _bs31, _bs31, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp32 = new BlockPos(x, y, z);
                    TileEntity _tileEntity32 = world.func_175625_s(_bp32);
                    IBlockState _bs32 = world.func_180495_p(_bp32);
                    if (_tileEntity32 != null) {
                        _tileEntity32.getTileData().func_74780_a("shuliang0", 1.0d);
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
                        _tileEntity34.getTileData().func_74780_a("shuliang2", 2.0d);
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
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.41
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:cailiao32") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.42
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemFuLingShiYuan.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.43
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemHuXinShi.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.44
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(ItemCaiitem04.block, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.45
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.46
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 4 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.47
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.48
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
                    BlockPos _bp36 = new BlockPos(x, y, z);
                    TileEntity _tileEntity36 = world.func_175625_s(_bp36);
                    IBlockState _bs36 = world.func_180495_p(_bp36);
                    if (_tileEntity36 != null) {
                        _tileEntity36.getTileData().func_74780_a("leixing", 39.0d);
                    }
                    world.func_184138_a(_bp36, _bs36, _bs36, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp37 = new BlockPos(x, y, z);
                    TileEntity _tileEntity37 = world.func_175625_s(_bp37);
                    IBlockState _bs37 = world.func_180495_p(_bp37);
                    if (_tileEntity37 != null) {
                        _tileEntity37.getTileData().func_74780_a("lianqijingyan", 25.0d);
                    }
                    world.func_184138_a(_bp37, _bs37, _bs37, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp38 = new BlockPos(x, y, z);
                    TileEntity _tileEntity38 = world.func_175625_s(_bp38);
                    IBlockState _bs38 = world.func_180495_p(_bp38);
                    if (_tileEntity38 != null) {
                        _tileEntity38.getTileData().func_74780_a("扣除灵力", 400.0d);
                    }
                    world.func_184138_a(_bp38, _bs38, _bs38, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp39 = new BlockPos(x, y, z);
                    TileEntity _tileEntity39 = world.func_175625_s(_bp39);
                    IBlockState _bs39 = world.func_180495_p(_bp39);
                    if (_tileEntity39 != null) {
                        _tileEntity39.getTileData().func_74780_a("shuliang0", 3.0d);
                    }
                    world.func_184138_a(_bp39, _bs39, _bs39, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp40 = new BlockPos(x, y, z);
                    TileEntity _tileEntity40 = world.func_175625_s(_bp40);
                    IBlockState _bs40 = world.func_180495_p(_bp40);
                    if (_tileEntity40 != null) {
                        _tileEntity40.getTileData().func_74780_a("shuliang1", 4.0d);
                    }
                    world.func_184138_a(_bp40, _bs40, _bs40, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp41 = new BlockPos(x, y, z);
                    TileEntity _tileEntity41 = world.func_175625_s(_bp41);
                    IBlockState _bs41 = world.func_180495_p(_bp41);
                    if (_tileEntity41 != null) {
                        _tileEntity41.getTileData().func_74780_a("shuliang2", 3.0d);
                    }
                    world.func_184138_a(_bp41, _bs41, _bs41, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp42 = new BlockPos(x, y, z);
                    TileEntity _tileEntity42 = world.func_175625_s(_bp42);
                    IBlockState _bs42 = world.func_180495_p(_bp42);
                    if (_tileEntity42 != null) {
                        _tileEntity42.getTileData().func_74780_a("shuliang3", 1.0d);
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
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.49
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemFabao21.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.50
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:cailiao36") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.51
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cai_liao_07") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.52
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(ItemCaiitem04.block, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.53
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.54
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 1) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.55
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 2) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.56
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
                    BlockPos _bp43 = new BlockPos(x, y, z);
                    TileEntity _tileEntity43 = world.func_175625_s(_bp43);
                    IBlockState _bs43 = world.func_180495_p(_bp43);
                    if (_tileEntity43 != null) {
                        _tileEntity43.getTileData().func_74780_a("leixing", 15.0d);
                    }
                    world.func_184138_a(_bp43, _bs43, _bs43, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp44 = new BlockPos(x, y, z);
                    TileEntity _tileEntity44 = world.func_175625_s(_bp44);
                    IBlockState _bs44 = world.func_180495_p(_bp44);
                    if (_tileEntity44 != null) {
                        _tileEntity44.getTileData().func_74780_a("lianqijingyan", 25.0d);
                    }
                    world.func_184138_a(_bp44, _bs44, _bs44, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp45 = new BlockPos(x, y, z);
                    TileEntity _tileEntity45 = world.func_175625_s(_bp45);
                    IBlockState _bs45 = world.func_180495_p(_bp45);
                    if (_tileEntity45 != null) {
                        _tileEntity45.getTileData().func_74780_a("扣除灵力", 400.0d);
                    }
                    world.func_184138_a(_bp45, _bs45, _bs45, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp46 = new BlockPos(x, y, z);
                    TileEntity _tileEntity46 = world.func_175625_s(_bp46);
                    IBlockState _bs46 = world.func_180495_p(_bp46);
                    if (_tileEntity46 != null) {
                        _tileEntity46.getTileData().func_74780_a("shuliang0", 1.0d);
                    }
                    world.func_184138_a(_bp46, _bs46, _bs46, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp47 = new BlockPos(x, y, z);
                    TileEntity _tileEntity47 = world.func_175625_s(_bp47);
                    IBlockState _bs47 = world.func_180495_p(_bp47);
                    if (_tileEntity47 != null) {
                        _tileEntity47.getTileData().func_74780_a("shuliang1", 3.0d);
                    }
                    world.func_184138_a(_bp47, _bs47, _bs47, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp48 = new BlockPos(x, y, z);
                    TileEntity _tileEntity48 = world.func_175625_s(_bp48);
                    IBlockState _bs48 = world.func_180495_p(_bp48);
                    if (_tileEntity48 != null) {
                        _tileEntity48.getTileData().func_74780_a("shuliang2", 3.0d);
                    }
                    world.func_184138_a(_bp48, _bs48, _bs48, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp49 = new BlockPos(x, y, z);
                    TileEntity _tileEntity49 = world.func_175625_s(_bp49);
                    IBlockState _bs49 = world.func_180495_p(_bp49);
                    if (_tileEntity49 != null) {
                        _tileEntity49.getTileData().func_74780_a("shuliang3", 1.0d);
                    }
                    world.func_184138_a(_bp49, _bs49, _bs49, 3);
                }
                $_dependencies.put("entity", entity);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureLingLiCut.executeProcedure($_dependencies);
            }
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.57
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCaiitem08.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.58
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCailiao15.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.59
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemHuXinShi.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.60
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(ItemCaiitem04.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.61
            public int getAmount(BlockPos pos, int sltid) {
                ItemStack stack;
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                    return stack.func_190916_E();
                }
                return 0;
            }
        }.getAmount(new BlockPos(x, y, z), 0) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.62
            public int getAmount(BlockPos pos, int sltid) {
                ItemStack stack;
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                    return stack.func_190916_E();
                }
                return 0;
            }
        }.getAmount(new BlockPos(x, y, z), 1) >= 1 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.63
            public int getAmount(BlockPos pos, int sltid) {
                ItemStack stack;
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                    return stack.func_190916_E();
                }
                return 0;
            }
        }.getAmount(new BlockPos(x, y, z), 2) >= 3 && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianQiPeiFang3.64
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
                BlockPos _bp50 = new BlockPos(x, y, z);
                TileEntity _tileEntity50 = world.func_175625_s(_bp50);
                IBlockState _bs50 = world.func_180495_p(_bp50);
                if (_tileEntity50 != null) {
                    _tileEntity50.getTileData().func_74780_a("leixing", 18.0d);
                }
                world.func_184138_a(_bp50, _bs50, _bs50, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp51 = new BlockPos(x, y, z);
                TileEntity _tileEntity51 = world.func_175625_s(_bp51);
                IBlockState _bs51 = world.func_180495_p(_bp51);
                if (_tileEntity51 != null) {
                    _tileEntity51.getTileData().func_74780_a("lianqijingyan", 25.0d);
                }
                world.func_184138_a(_bp51, _bs51, _bs51, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp52 = new BlockPos(x, y, z);
                TileEntity _tileEntity52 = world.func_175625_s(_bp52);
                IBlockState _bs52 = world.func_180495_p(_bp52);
                if (_tileEntity52 != null) {
                    _tileEntity52.getTileData().func_74780_a("扣除灵力", 400.0d);
                }
                world.func_184138_a(_bp52, _bs52, _bs52, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp53 = new BlockPos(x, y, z);
                TileEntity _tileEntity53 = world.func_175625_s(_bp53);
                IBlockState _bs53 = world.func_180495_p(_bp53);
                if (_tileEntity53 != null) {
                    _tileEntity53.getTileData().func_74780_a("shuliang0", 3.0d);
                }
                world.func_184138_a(_bp53, _bs53, _bs53, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp54 = new BlockPos(x, y, z);
                TileEntity _tileEntity54 = world.func_175625_s(_bp54);
                IBlockState _bs54 = world.func_180495_p(_bp54);
                if (_tileEntity54 != null) {
                    _tileEntity54.getTileData().func_74780_a("shuliang1", 1.0d);
                }
                world.func_184138_a(_bp54, _bs54, _bs54, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp55 = new BlockPos(x, y, z);
                TileEntity _tileEntity55 = world.func_175625_s(_bp55);
                IBlockState _bs55 = world.func_180495_p(_bp55);
                if (_tileEntity55 != null) {
                    _tileEntity55.getTileData().func_74780_a("shuliang2", 3.0d);
                }
                world.func_184138_a(_bp55, _bs55, _bs55, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp56 = new BlockPos(x, y, z);
                TileEntity _tileEntity56 = world.func_175625_s(_bp56);
                IBlockState _bs56 = world.func_180495_p(_bp56);
                if (_tileEntity56 != null) {
                    _tileEntity56.getTileData().func_74780_a("shuliang3", 1.0d);
                }
                world.func_184138_a(_bp56, _bs56, _bs56, 3);
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
