package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemCaiLiao02;
import net.mcreator.yvanchuliandan.item.ItemCaoYao01;
import net.mcreator.yvanchuliandan.item.ItemCaoYao0102;
import net.mcreator.yvanchuliandan.item.ItemCaoYao02;
import net.mcreator.yvanchuliandan.item.ItemCaoyao1;
import net.mcreator.yvanchuliandan.item.ItemCaoyao12;
import net.mcreator.yvanchuliandan.item.ItemCaoyao22;
import net.mcreator.yvanchuliandan.item.ItemCaoyao23;
import net.mcreator.yvanchuliandan.item.ItemCaoyao24;
import net.mcreator.yvanchuliandan.item.ItemCaoyao25;
import net.mcreator.yvanchuliandan.item.ItemCaoyao3;
import net.mcreator.yvanchuliandan.item.ItemCaoyao5;
import net.mcreator.yvanchuliandan.item.ItemCaoyao6;
import net.mcreator.yvanchuliandan.item.ItemCaoyao7;
import net.mcreator.yvanchuliandan.item.ItemCaoyao8;
import net.mcreator.yvanchuliandan.item.ItemCaoyao9;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanFangDengJi102.class */
public class ProcedureDanFangDengJi102 extends ElementsYvanchuliandanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureDanFangDengJi102(ElementsYvanchuliandanMod instance) {
        super(instance, 335);
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102$1] */
    /* JADX WARN: Type inference failed for: r0v33, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102$2] */
    /* JADX WARN: Type inference failed for: r0v36, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102$3] */
    /* JADX WARN: Type inference failed for: r0v39, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102$4] */
    /* JADX WARN: Type inference failed for: r0v42, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102$5] */
    /* JADX WARN: Type inference failed for: r0v45, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102$6] */
    /* JADX WARN: Type inference failed for: r0v48, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102$7] */
    /* JADX WARN: Type inference failed for: r0v51, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102$8] */
    /* JADX WARN: Type inference failed for: r0v54, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102$9] */
    /* JADX WARN: Type inference failed for: r0v57, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102$10] */
    /* JADX WARN: Type inference failed for: r0v60, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102$11] */
    /* JADX WARN: Type inference failed for: r0v63, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102$12] */
    /* JADX WARN: Type inference failed for: r0v66, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102$13] */
    /* JADX WARN: Type inference failed for: r0v69, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102$14] */
    /* JADX WARN: Type inference failed for: r0v72, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102$15] */
    /* JADX WARN: Type inference failed for: r0v75, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102$16] */
    /* JADX WARN: Type inference failed for: r0v78, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102$17] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!world.field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = world.func_175625_s(_bp);
            IBlockState _bs = world.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("扣除灵力", 10.0d);
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74780_a("增加经验", 1.0d);
                }
                world.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp3 = new BlockPos(x, y, z);
                TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                IBlockState _bs3 = world.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74780_a("DanFang", 901.0d);
                }
                world.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102.2
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoYao01.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                IBlockState _bs4 = world.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74780_a("增加经验", 1.0d);
                }
                world.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp5 = new BlockPos(x, y, z);
                TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                IBlockState _bs5 = world.func_180495_p(_bp5);
                if (_tileEntity5 != null) {
                    _tileEntity5.getTileData().func_74780_a("DanFang", 902.0d);
                }
                world.func_184138_a(_bp5, _bs5, _bs5, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102.3
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoYao0102.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp6 = new BlockPos(x, y, z);
                TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                IBlockState _bs6 = world.func_180495_p(_bp6);
                if (_tileEntity6 != null) {
                    _tileEntity6.getTileData().func_74780_a("增加经验", 1.0d);
                }
                world.func_184138_a(_bp6, _bs6, _bs6, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp7 = new BlockPos(x, y, z);
                TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                IBlockState _bs7 = world.func_180495_p(_bp7);
                if (_tileEntity7 != null) {
                    _tileEntity7.getTileData().func_74780_a("DanFang", 903.0d);
                }
                world.func_184138_a(_bp7, _bs7, _bs7, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102.4
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoyao5.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp8 = new BlockPos(x, y, z);
                TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                IBlockState _bs8 = world.func_180495_p(_bp8);
                if (_tileEntity8 != null) {
                    _tileEntity8.getTileData().func_74780_a("增加经验", 2.0d);
                }
                world.func_184138_a(_bp8, _bs8, _bs8, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp9 = new BlockPos(x, y, z);
                TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                IBlockState _bs9 = world.func_180495_p(_bp9);
                if (_tileEntity9 != null) {
                    _tileEntity9.getTileData().func_74780_a("DanFang", 1.0d);
                }
                world.func_184138_a(_bp9, _bs9, _bs9, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102.5
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoyao7.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp10 = new BlockPos(x, y, z);
                TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                IBlockState _bs10 = world.func_180495_p(_bp10);
                if (_tileEntity10 != null) {
                    _tileEntity10.getTileData().func_74780_a("增加经验", 2.0d);
                }
                world.func_184138_a(_bp10, _bs10, _bs10, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp11 = new BlockPos(x, y, z);
                TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                IBlockState _bs11 = world.func_180495_p(_bp11);
                if (_tileEntity11 != null) {
                    _tileEntity11.getTileData().func_74780_a("DanFang", 2.0d);
                }
                world.func_184138_a(_bp11, _bs11, _bs11, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102.6
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoyao6.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp12 = new BlockPos(x, y, z);
                TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                IBlockState _bs12 = world.func_180495_p(_bp12);
                if (_tileEntity12 != null) {
                    _tileEntity12.getTileData().func_74780_a("增加经验", 2.0d);
                }
                world.func_184138_a(_bp12, _bs12, _bs12, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp13 = new BlockPos(x, y, z);
                TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                IBlockState _bs13 = world.func_180495_p(_bp13);
                if (_tileEntity13 != null) {
                    _tileEntity13.getTileData().func_74780_a("DanFang", 3.0d);
                }
                world.func_184138_a(_bp13, _bs13, _bs13, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102.7
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoyao8.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp14 = new BlockPos(x, y, z);
                TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                IBlockState _bs14 = world.func_180495_p(_bp14);
                if (_tileEntity14 != null) {
                    _tileEntity14.getTileData().func_74780_a("增加经验", 2.0d);
                }
                world.func_184138_a(_bp14, _bs14, _bs14, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp15 = new BlockPos(x, y, z);
                TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                IBlockState _bs15 = world.func_180495_p(_bp15);
                if (_tileEntity15 != null) {
                    _tileEntity15.getTileData().func_74780_a("DanFang", 4.0d);
                }
                world.func_184138_a(_bp15, _bs15, _bs15, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102.8
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoyao9.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp16 = new BlockPos(x, y, z);
                TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                IBlockState _bs16 = world.func_180495_p(_bp16);
                if (_tileEntity16 != null) {
                    _tileEntity16.getTileData().func_74780_a("增加经验", 2.0d);
                }
                world.func_184138_a(_bp16, _bs16, _bs16, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp17 = new BlockPos(x, y, z);
                TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                IBlockState _bs17 = world.func_180495_p(_bp17);
                if (_tileEntity17 != null) {
                    _tileEntity17.getTileData().func_74780_a("DanFang", 5.0d);
                }
                world.func_184138_a(_bp17, _bs17, _bs17, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102.9
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoyao12.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp18 = new BlockPos(x, y, z);
                TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                IBlockState _bs18 = world.func_180495_p(_bp18);
                if (_tileEntity18 != null) {
                    _tileEntity18.getTileData().func_74780_a("增加经验", 2.0d);
                }
                world.func_184138_a(_bp18, _bs18, _bs18, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp19 = new BlockPos(x, y, z);
                TileEntity _tileEntity19 = world.func_175625_s(_bp19);
                IBlockState _bs19 = world.func_180495_p(_bp19);
                if (_tileEntity19 != null) {
                    _tileEntity19.getTileData().func_74780_a("DanFang", 6.0d);
                }
                world.func_184138_a(_bp19, _bs19, _bs19, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102.10
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoyao1.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp20 = new BlockPos(x, y, z);
                TileEntity _tileEntity20 = world.func_175625_s(_bp20);
                IBlockState _bs20 = world.func_180495_p(_bp20);
                if (_tileEntity20 != null) {
                    _tileEntity20.getTileData().func_74780_a("增加经验", 1.0d);
                }
                world.func_184138_a(_bp20, _bs20, _bs20, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp21 = new BlockPos(x, y, z);
                TileEntity _tileEntity21 = world.func_175625_s(_bp21);
                IBlockState _bs21 = world.func_180495_p(_bp21);
                if (_tileEntity21 != null) {
                    _tileEntity21.getTileData().func_74780_a("DanFang", 7.0d);
                }
                world.func_184138_a(_bp21, _bs21, _bs21, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102.11
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoyao3.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp22 = new BlockPos(x, y, z);
                TileEntity _tileEntity22 = world.func_175625_s(_bp22);
                IBlockState _bs22 = world.func_180495_p(_bp22);
                if (_tileEntity22 != null) {
                    _tileEntity22.getTileData().func_74780_a("增加经验", 1.0d);
                }
                world.func_184138_a(_bp22, _bs22, _bs22, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp23 = new BlockPos(x, y, z);
                TileEntity _tileEntity23 = world.func_175625_s(_bp23);
                IBlockState _bs23 = world.func_180495_p(_bp23);
                if (_tileEntity23 != null) {
                    _tileEntity23.getTileData().func_74780_a("DanFang", 8.0d);
                }
                world.func_184138_a(_bp23, _bs23, _bs23, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102.12
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoyao23.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp24 = new BlockPos(x, y, z);
                TileEntity _tileEntity24 = world.func_175625_s(_bp24);
                IBlockState _bs24 = world.func_180495_p(_bp24);
                if (_tileEntity24 != null) {
                    _tileEntity24.getTileData().func_74780_a("增加经验", 3.0d);
                }
                world.func_184138_a(_bp24, _bs24, _bs24, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp25 = new BlockPos(x, y, z);
                TileEntity _tileEntity25 = world.func_175625_s(_bp25);
                IBlockState _bs25 = world.func_180495_p(_bp25);
                if (_tileEntity25 != null) {
                    _tileEntity25.getTileData().func_74780_a("DanFang", 10.0d);
                }
                world.func_184138_a(_bp25, _bs25, _bs25, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102.13
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoyao22.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp26 = new BlockPos(x, y, z);
                TileEntity _tileEntity26 = world.func_175625_s(_bp26);
                IBlockState _bs26 = world.func_180495_p(_bp26);
                if (_tileEntity26 != null) {
                    _tileEntity26.getTileData().func_74780_a("增加经验", 3.0d);
                }
                world.func_184138_a(_bp26, _bs26, _bs26, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp27 = new BlockPos(x, y, z);
                TileEntity _tileEntity27 = world.func_175625_s(_bp27);
                IBlockState _bs27 = world.func_180495_p(_bp27);
                if (_tileEntity27 != null) {
                    _tileEntity27.getTileData().func_74780_a("DanFang", 11.0d);
                }
                world.func_184138_a(_bp27, _bs27, _bs27, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102.14
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoyao24.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp28 = new BlockPos(x, y, z);
                TileEntity _tileEntity28 = world.func_175625_s(_bp28);
                IBlockState _bs28 = world.func_180495_p(_bp28);
                if (_tileEntity28 != null) {
                    _tileEntity28.getTileData().func_74780_a("增加经验", 3.0d);
                }
                world.func_184138_a(_bp28, _bs28, _bs28, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp29 = new BlockPos(x, y, z);
                TileEntity _tileEntity29 = world.func_175625_s(_bp29);
                IBlockState _bs29 = world.func_180495_p(_bp29);
                if (_tileEntity29 != null) {
                    _tileEntity29.getTileData().func_74780_a("DanFang", 12.0d);
                }
                world.func_184138_a(_bp29, _bs29, _bs29, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102.15
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoyao25.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp30 = new BlockPos(x, y, z);
                TileEntity _tileEntity30 = world.func_175625_s(_bp30);
                IBlockState _bs30 = world.func_180495_p(_bp30);
                if (_tileEntity30 != null) {
                    _tileEntity30.getTileData().func_74780_a("增加经验", 3.0d);
                }
                world.func_184138_a(_bp30, _bs30, _bs30, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp31 = new BlockPos(x, y, z);
                TileEntity _tileEntity31 = world.func_175625_s(_bp31);
                IBlockState _bs31 = world.func_180495_p(_bp31);
                if (_tileEntity31 != null) {
                    _tileEntity31.getTileData().func_74780_a("DanFang", 13.0d);
                }
                world.func_184138_a(_bp31, _bs31, _bs31, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102.16
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaiLiao02.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp32 = new BlockPos(x, y, z);
                TileEntity _tileEntity32 = world.func_175625_s(_bp32);
                IBlockState _bs32 = world.func_180495_p(_bp32);
                if (_tileEntity32 != null) {
                    _tileEntity32.getTileData().func_74780_a("增加经验", 1.0d);
                }
                world.func_184138_a(_bp32, _bs32, _bs32, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp33 = new BlockPos(x, y, z);
                TileEntity _tileEntity33 = world.func_175625_s(_bp33);
                IBlockState _bs33 = world.func_180495_p(_bp33);
                if (_tileEntity33 != null) {
                    _tileEntity33.getTileData().func_74780_a("DanFang", 17.0d);
                }
                world.func_184138_a(_bp33, _bs33, _bs33, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi102.17
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoYao02.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp34 = new BlockPos(x, y, z);
                TileEntity _tileEntity34 = world.func_175625_s(_bp34);
                IBlockState _bs34 = world.func_180495_p(_bp34);
                if (_tileEntity34 != null) {
                    _tileEntity34.getTileData().func_74780_a("增加经验", 10.0d);
                }
                world.func_184138_a(_bp34, _bs34, _bs34, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp35 = new BlockPos(x, y, z);
                TileEntity _tileEntity35 = world.func_175625_s(_bp35);
                IBlockState _bs35 = world.func_180495_p(_bp35);
                if (_tileEntity35 != null) {
                    _tileEntity35.getTileData().func_74780_a("DanFang", 18.0d);
                }
                world.func_184138_a(_bp35, _bs35, _bs35, 3);
            }
        }
    }
}
