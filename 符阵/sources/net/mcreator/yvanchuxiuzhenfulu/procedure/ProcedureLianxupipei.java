package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemCloudMapCharm;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemCloudMapCharm2;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemCloudMapCharm3;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemCloudMapCharm4;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemCloudMapCharm5;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFeiJianFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFeiXingFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu02;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu03;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu04;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu05;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu08;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu11;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu13;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu2401;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu25;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu26;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemHanDiFuBao;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemHanDiZhenBao;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemHuDunFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemHunDunJianShiFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemHuoDanFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemJuFengFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemKongTiFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemLeiJiFuBao;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemLiuHuoFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemRanShanFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemTieJiaFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemWuLiangDunFuBao;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemZhaoMingFu;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureLianxupipei.class */
public class ProcedureLianxupipei extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureLianxupipei(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 301);
    }

    /* JADX WARN: Type inference failed for: r0v101, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$27] */
    /* JADX WARN: Type inference failed for: r0v104, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$28] */
    /* JADX WARN: Type inference failed for: r0v107, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$29] */
    /* JADX WARN: Type inference failed for: r0v110, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$30] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$1] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$2] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$3] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$4] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$5] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$6] */
    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$7] */
    /* JADX WARN: Type inference failed for: r0v44, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$8] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$9] */
    /* JADX WARN: Type inference failed for: r0v50, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$10] */
    /* JADX WARN: Type inference failed for: r0v53, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$11] */
    /* JADX WARN: Type inference failed for: r0v56, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$12] */
    /* JADX WARN: Type inference failed for: r0v59, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$13] */
    /* JADX WARN: Type inference failed for: r0v62, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$14] */
    /* JADX WARN: Type inference failed for: r0v65, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$15] */
    /* JADX WARN: Type inference failed for: r0v68, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$16] */
    /* JADX WARN: Type inference failed for: r0v71, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$17] */
    /* JADX WARN: Type inference failed for: r0v74, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$18] */
    /* JADX WARN: Type inference failed for: r0v77, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$19] */
    /* JADX WARN: Type inference failed for: r0v80, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$20] */
    /* JADX WARN: Type inference failed for: r0v83, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$21] */
    /* JADX WARN: Type inference failed for: r0v86, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$22] */
    /* JADX WARN: Type inference failed for: r0v89, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$23] */
    /* JADX WARN: Type inference failed for: r0v92, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$24] */
    /* JADX WARN: Type inference failed for: r0v95, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$25] */
    /* JADX WARN: Type inference failed for: r0v98, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei$26] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemFulu02.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = world.func_175625_s(_bp);
            IBlockState _bs = world.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("leixing2", 11.0d);
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.2
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemFulu03.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp2 = new BlockPos(x, y, z);
            TileEntity _tileEntity2 = world.func_175625_s(_bp2);
            IBlockState _bs2 = world.func_180495_p(_bp2);
            if (_tileEntity2 != null) {
                _tileEntity2.getTileData().func_74780_a("leixing2", 12.0d);
            }
            world.func_184138_a(_bp2, _bs2, _bs2, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.3
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemFulu04.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp3 = new BlockPos(x, y, z);
            TileEntity _tileEntity3 = world.func_175625_s(_bp3);
            IBlockState _bs3 = world.func_180495_p(_bp3);
            if (_tileEntity3 != null) {
                _tileEntity3.getTileData().func_74780_a("leixing2", 13.0d);
            }
            world.func_184138_a(_bp3, _bs3, _bs3, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.4
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemFulu2401.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp4 = new BlockPos(x, y, z);
            TileEntity _tileEntity4 = world.func_175625_s(_bp4);
            IBlockState _bs4 = world.func_180495_p(_bp4);
            if (_tileEntity4 != null) {
                _tileEntity4.getTileData().func_74780_a("leixing2", 14.0d);
            }
            world.func_184138_a(_bp4, _bs4, _bs4, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.5
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemZhaoMingFu.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp5 = new BlockPos(x, y, z);
            TileEntity _tileEntity5 = world.func_175625_s(_bp5);
            IBlockState _bs5 = world.func_180495_p(_bp5);
            if (_tileEntity5 != null) {
                _tileEntity5.getTileData().func_74780_a("leixing2", 15.0d);
            }
            world.func_184138_a(_bp5, _bs5, _bs5, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.6
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemHuoDanFu.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp6 = new BlockPos(x, y, z);
            TileEntity _tileEntity6 = world.func_175625_s(_bp6);
            IBlockState _bs6 = world.func_180495_p(_bp6);
            if (_tileEntity6 != null) {
                _tileEntity6.getTileData().func_74780_a("leixing2", 16.0d);
            }
            world.func_184138_a(_bp6, _bs6, _bs6, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.7
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemKongTiFu.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp7 = new BlockPos(x, y, z);
            TileEntity _tileEntity7 = world.func_175625_s(_bp7);
            IBlockState _bs7 = world.func_180495_p(_bp7);
            if (_tileEntity7 != null) {
                _tileEntity7.getTileData().func_74780_a("leixing2", 17.0d);
            }
            world.func_184138_a(_bp7, _bs7, _bs7, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.8
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemFulu26.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp8 = new BlockPos(x, y, z);
            TileEntity _tileEntity8 = world.func_175625_s(_bp8);
            IBlockState _bs8 = world.func_180495_p(_bp8);
            if (_tileEntity8 != null) {
                _tileEntity8.getTileData().func_74780_a("leixing2", 21.0d);
            }
            world.func_184138_a(_bp8, _bs8, _bs8, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.9
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemHuDunFu.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp9 = new BlockPos(x, y, z);
            TileEntity _tileEntity9 = world.func_175625_s(_bp9);
            IBlockState _bs9 = world.func_180495_p(_bp9);
            if (_tileEntity9 != null) {
                _tileEntity9.getTileData().func_74780_a("leixing2", 22.0d);
            }
            world.func_184138_a(_bp9, _bs9, _bs9, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.10
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemFulu05.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp10 = new BlockPos(x, y, z);
            TileEntity _tileEntity10 = world.func_175625_s(_bp10);
            IBlockState _bs10 = world.func_180495_p(_bp10);
            if (_tileEntity10 != null) {
                _tileEntity10.getTileData().func_74780_a("leixing2", 23.0d);
            }
            world.func_184138_a(_bp10, _bs10, _bs10, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.11
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemFulu11.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp11 = new BlockPos(x, y, z);
            TileEntity _tileEntity11 = world.func_175625_s(_bp11);
            IBlockState _bs11 = world.func_180495_p(_bp11);
            if (_tileEntity11 != null) {
                _tileEntity11.getTileData().func_74780_a("leixing2", 24.0d);
            }
            world.func_184138_a(_bp11, _bs11, _bs11, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.12
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemFulu25.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp12 = new BlockPos(x, y, z);
            TileEntity _tileEntity12 = world.func_175625_s(_bp12);
            IBlockState _bs12 = world.func_180495_p(_bp12);
            if (_tileEntity12 != null) {
                _tileEntity12.getTileData().func_74780_a("leixing2", 31.0d);
            }
            world.func_184138_a(_bp12, _bs12, _bs12, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.13
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemFulu08.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp13 = new BlockPos(x, y, z);
            TileEntity _tileEntity13 = world.func_175625_s(_bp13);
            IBlockState _bs13 = world.func_180495_p(_bp13);
            if (_tileEntity13 != null) {
                _tileEntity13.getTileData().func_74780_a("leixing2", 32.0d);
            }
            world.func_184138_a(_bp13, _bs13, _bs13, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.14
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemFeiXingFu.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp14 = new BlockPos(x, y, z);
            TileEntity _tileEntity14 = world.func_175625_s(_bp14);
            IBlockState _bs14 = world.func_180495_p(_bp14);
            if (_tileEntity14 != null) {
                _tileEntity14.getTileData().func_74780_a("leixing2", 33.0d);
            }
            world.func_184138_a(_bp14, _bs14, _bs14, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.15
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemFeiJianFu.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp15 = new BlockPos(x, y, z);
            TileEntity _tileEntity15 = world.func_175625_s(_bp15);
            IBlockState _bs15 = world.func_180495_p(_bp15);
            if (_tileEntity15 != null) {
                _tileEntity15.getTileData().func_74780_a("leixing2", 34.0d);
            }
            world.func_184138_a(_bp15, _bs15, _bs15, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.16
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemJuFengFu.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp16 = new BlockPos(x, y, z);
            TileEntity _tileEntity16 = world.func_175625_s(_bp16);
            IBlockState _bs16 = world.func_180495_p(_bp16);
            if (_tileEntity16 != null) {
                _tileEntity16.getTileData().func_74780_a("leixing2", 35.0d);
            }
            world.func_184138_a(_bp16, _bs16, _bs16, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.17
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemTieJiaFu.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp17 = new BlockPos(x, y, z);
            TileEntity _tileEntity17 = world.func_175625_s(_bp17);
            IBlockState _bs17 = world.func_180495_p(_bp17);
            if (_tileEntity17 != null) {
                _tileEntity17.getTileData().func_74780_a("leixing2", 36.0d);
            }
            world.func_184138_a(_bp17, _bs17, _bs17, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.18
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemFulu13.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp18 = new BlockPos(x, y, z);
            TileEntity _tileEntity18 = world.func_175625_s(_bp18);
            IBlockState _bs18 = world.func_180495_p(_bp18);
            if (_tileEntity18 != null) {
                _tileEntity18.getTileData().func_74780_a("leixing2", 41.0d);
            }
            world.func_184138_a(_bp18, _bs18, _bs18, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.19
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemRanShanFu.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp19 = new BlockPos(x, y, z);
            TileEntity _tileEntity19 = world.func_175625_s(_bp19);
            IBlockState _bs19 = world.func_180495_p(_bp19);
            if (_tileEntity19 != null) {
                _tileEntity19.getTileData().func_74780_a("leixing2", 42.0d);
            }
            world.func_184138_a(_bp19, _bs19, _bs19, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.20
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemLiuHuoFu.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp20 = new BlockPos(x, y, z);
            TileEntity _tileEntity20 = world.func_175625_s(_bp20);
            IBlockState _bs20 = world.func_180495_p(_bp20);
            if (_tileEntity20 != null) {
                _tileEntity20.getTileData().func_74780_a("leixing2", 43.0d);
            }
            world.func_184138_a(_bp20, _bs20, _bs20, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.21
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemHanDiZhenBao.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp21 = new BlockPos(x, y, z);
            TileEntity _tileEntity21 = world.func_175625_s(_bp21);
            IBlockState _bs21 = world.func_180495_p(_bp21);
            if (_tileEntity21 != null) {
                _tileEntity21.getTileData().func_74780_a("leixing2", 51.0d);
            }
            world.func_184138_a(_bp21, _bs21, _bs21, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.22
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemLeiJiFuBao.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp22 = new BlockPos(x, y, z);
            TileEntity _tileEntity22 = world.func_175625_s(_bp22);
            IBlockState _bs22 = world.func_180495_p(_bp22);
            if (_tileEntity22 != null) {
                _tileEntity22.getTileData().func_74780_a("leixing2", 52.0d);
            }
            world.func_184138_a(_bp22, _bs22, _bs22, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.23
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemWuLiangDunFuBao.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp23 = new BlockPos(x, y, z);
            TileEntity _tileEntity23 = world.func_175625_s(_bp23);
            IBlockState _bs23 = world.func_180495_p(_bp23);
            if (_tileEntity23 != null) {
                _tileEntity23.getTileData().func_74780_a("leixing2", 53.0d);
            }
            world.func_184138_a(_bp23, _bs23, _bs23, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.24
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemHanDiFuBao.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp24 = new BlockPos(x, y, z);
            TileEntity _tileEntity24 = world.func_175625_s(_bp24);
            IBlockState _bs24 = world.func_180495_p(_bp24);
            if (_tileEntity24 != null) {
                _tileEntity24.getTileData().func_74780_a("leixing2", 54.0d);
            }
            world.func_184138_a(_bp24, _bs24, _bs24, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.25
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemHunDunJianShiFu.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp25 = new BlockPos(x, y, z);
            TileEntity _tileEntity25 = world.func_175625_s(_bp25);
            IBlockState _bs25 = world.func_180495_p(_bp25);
            if (_tileEntity25 != null) {
                _tileEntity25.getTileData().func_74780_a("leixing2", 55.0d);
            }
            world.func_184138_a(_bp25, _bs25, _bs25, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.26
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemCloudMapCharm.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp26 = new BlockPos(x, y, z);
            TileEntity _tileEntity26 = world.func_175625_s(_bp26);
            IBlockState _bs26 = world.func_180495_p(_bp26);
            if (_tileEntity26 != null) {
                _tileEntity26.getTileData().func_74780_a("leixing2", 101.0d);
            }
            world.func_184138_a(_bp26, _bs26, _bs26, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.27
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemCloudMapCharm2.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp27 = new BlockPos(x, y, z);
            TileEntity _tileEntity27 = world.func_175625_s(_bp27);
            IBlockState _bs27 = world.func_180495_p(_bp27);
            if (_tileEntity27 != null) {
                _tileEntity27.getTileData().func_74780_a("leixing2", 102.0d);
            }
            world.func_184138_a(_bp27, _bs27, _bs27, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.28
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemCloudMapCharm3.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp28 = new BlockPos(x, y, z);
            TileEntity _tileEntity28 = world.func_175625_s(_bp28);
            IBlockState _bs28 = world.func_180495_p(_bp28);
            if (_tileEntity28 != null) {
                _tileEntity28.getTileData().func_74780_a("leixing2", 103.0d);
            }
            world.func_184138_a(_bp28, _bs28, _bs28, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.29
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemCloudMapCharm4.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp29 = new BlockPos(x, y, z);
            TileEntity _tileEntity29 = world.func_175625_s(_bp29);
            IBlockState _bs29 = world.func_180495_p(_bp29);
            if (_tileEntity29 != null) {
                _tileEntity29.getTileData().func_74780_a("leixing2", 104.0d);
            }
            world.func_184138_a(_bp29, _bs29, _bs29, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLianxupipei.30
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemCloudMapCharm5.block, 1).func_77973_b() && !world.field_72995_K) {
            BlockPos _bp30 = new BlockPos(x, y, z);
            TileEntity _tileEntity30 = world.func_175625_s(_bp30);
            IBlockState _bs30 = world.func_180495_p(_bp30);
            if (_tileEntity30 != null) {
                _tileEntity30.getTileData().func_74780_a("leixing2", 105.0d);
            }
            world.func_184138_a(_bp30, _bs30, _bs30, 3);
        }
    }
}
