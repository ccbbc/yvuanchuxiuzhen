package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemCaiLiao09;
import net.mcreator.yvanchuliandan.item.ItemCaiLiao0901;
import net.mcreator.yvanchuliandan.item.ItemCaiLiao11;
import net.mcreator.yvanchuliandan.item.ItemCaoYao1101;
import net.mcreator.yvanchuliandan.item.ItemCaoYao1201;
import net.mcreator.yvanchuliandan.item.ItemCaoYao1301;
import net.mcreator.yvanchuliandan.item.ItemCaoYao701;
import net.mcreator.yvanchuliandan.item.ItemCaoYao801;
import net.mcreator.yvanchuliandan.item.ItemCaoYao901;
import net.mcreator.yvanchuliandan.item.ItemCaoyao1001;
import net.mcreator.yvanchuliandan.item.ItemDanFang16;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanFangDengJi401.class */
public class ProcedureDanFangDengJi401 extends ElementsYvanchuliandanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureDanFangDengJi401(ElementsYvanchuliandanMod instance) {
        super(instance, 438);
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401$1] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401$2] */
    /* JADX WARN: Type inference failed for: r0v325, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401$4] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401$3] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401$5] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401$6] */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401$7] */
    /* JADX WARN: Type inference failed for: r0v46, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401$8] */
    /* JADX WARN: Type inference failed for: r0v49, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401$9] */
    /* JADX WARN: Type inference failed for: r0v52, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401$10] */
    /* JADX WARN: Type inference failed for: r0v55, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401$11] */
    /* JADX WARN: Type inference failed for: r0v58, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401$12] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoYao701.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74780_a("增加经验", 1.0d);
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74780_a("DanFang", 43.0d);
                }
                world.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401.2
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoYao801.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp3 = new BlockPos(x, y, z);
                TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                IBlockState _bs3 = world.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74780_a("增加经验", 1.0d);
                }
                world.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                IBlockState _bs4 = world.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74780_a("DanFang", 44.0d);
                }
                world.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401.3
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(ItemDanFang16.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401.4
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp5 = new BlockPos(x, y, z);
                TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                IBlockState _bs5 = world.func_180495_p(_bp5);
                if (_tileEntity5 != null) {
                    _tileEntity5.getTileData().func_74780_a("增加经验", 1.0d);
                }
                world.func_184138_a(_bp5, _bs5, _bs5, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp6 = new BlockPos(x, y, z);
                TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                IBlockState _bs6 = world.func_180495_p(_bp6);
                if (_tileEntity6 != null) {
                    _tileEntity6.getTileData().func_74780_a("DanFang", 4501.0d);
                }
                world.func_184138_a(_bp6, _bs6, _bs6, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401.5
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaiLiao09.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp7 = new BlockPos(x, y, z);
                TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                IBlockState _bs7 = world.func_180495_p(_bp7);
                if (_tileEntity7 != null) {
                    _tileEntity7.getTileData().func_74780_a("增加经验", 1.0d);
                }
                world.func_184138_a(_bp7, _bs7, _bs7, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp8 = new BlockPos(x, y, z);
                TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                IBlockState _bs8 = world.func_180495_p(_bp8);
                if (_tileEntity8 != null) {
                    _tileEntity8.getTileData().func_74780_a("DanFang", 4502.0d);
                }
                world.func_184138_a(_bp8, _bs8, _bs8, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401.6
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaiLiao0901.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp9 = new BlockPos(x, y, z);
                TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                IBlockState _bs9 = world.func_180495_p(_bp9);
                if (_tileEntity9 != null) {
                    _tileEntity9.getTileData().func_74780_a("增加经验", 1.0d);
                }
                world.func_184138_a(_bp9, _bs9, _bs9, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp10 = new BlockPos(x, y, z);
                TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                IBlockState _bs10 = world.func_180495_p(_bp10);
                if (_tileEntity10 != null) {
                    _tileEntity10.getTileData().func_74780_a("DanFang", 4503.0d);
                }
                world.func_184138_a(_bp10, _bs10, _bs10, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401.7
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoYao901.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp11 = new BlockPos(x, y, z);
                TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                IBlockState _bs11 = world.func_180495_p(_bp11);
                if (_tileEntity11 != null) {
                    _tileEntity11.getTileData().func_74780_a("增加经验", 3.0d);
                }
                world.func_184138_a(_bp11, _bs11, _bs11, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp12 = new BlockPos(x, y, z);
                TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                IBlockState _bs12 = world.func_180495_p(_bp12);
                if (_tileEntity12 != null) {
                    _tileEntity12.getTileData().func_74780_a("DanFang", 46.0d);
                }
                world.func_184138_a(_bp12, _bs12, _bs12, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401.8
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoyao1001.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp13 = new BlockPos(x, y, z);
                TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                IBlockState _bs13 = world.func_180495_p(_bp13);
                if (_tileEntity13 != null) {
                    _tileEntity13.getTileData().func_74780_a("增加经验", 3.0d);
                }
                world.func_184138_a(_bp13, _bs13, _bs13, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp14 = new BlockPos(x, y, z);
                TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                IBlockState _bs14 = world.func_180495_p(_bp14);
                if (_tileEntity14 != null) {
                    _tileEntity14.getTileData().func_74780_a("DanFang", 47.0d);
                }
                world.func_184138_a(_bp14, _bs14, _bs14, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401.9
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoYao1101.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp15 = new BlockPos(x, y, z);
                TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                IBlockState _bs15 = world.func_180495_p(_bp15);
                if (_tileEntity15 != null) {
                    _tileEntity15.getTileData().func_74780_a("增加经验", 3.0d);
                }
                world.func_184138_a(_bp15, _bs15, _bs15, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp16 = new BlockPos(x, y, z);
                TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                IBlockState _bs16 = world.func_180495_p(_bp16);
                if (_tileEntity16 != null) {
                    _tileEntity16.getTileData().func_74780_a("DanFang", 48.0d);
                }
                world.func_184138_a(_bp16, _bs16, _bs16, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401.10
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoYao1201.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp17 = new BlockPos(x, y, z);
                TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                IBlockState _bs17 = world.func_180495_p(_bp17);
                if (_tileEntity17 != null) {
                    _tileEntity17.getTileData().func_74780_a("增加经验", 3.0d);
                }
                world.func_184138_a(_bp17, _bs17, _bs17, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp18 = new BlockPos(x, y, z);
                TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                IBlockState _bs18 = world.func_180495_p(_bp18);
                if (_tileEntity18 != null) {
                    _tileEntity18.getTileData().func_74780_a("DanFang", 49.0d);
                }
                world.func_184138_a(_bp18, _bs18, _bs18, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401.11
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaoYao1301.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp19 = new BlockPos(x, y, z);
                TileEntity _tileEntity19 = world.func_175625_s(_bp19);
                IBlockState _bs19 = world.func_180495_p(_bp19);
                if (_tileEntity19 != null) {
                    _tileEntity19.getTileData().func_74780_a("增加经验", 3.0d);
                }
                world.func_184138_a(_bp19, _bs19, _bs19, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp20 = new BlockPos(x, y, z);
                TileEntity _tileEntity20 = world.func_175625_s(_bp20);
                IBlockState _bs20 = world.func_180495_p(_bp20);
                if (_tileEntity20 != null) {
                    _tileEntity20.getTileData().func_74780_a("DanFang", 50.0d);
                }
                world.func_184138_a(_bp20, _bs20, _bs20, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangDengJi401.12
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCaiLiao11.block, 1).func_77973_b()) {
            if (!world.field_72995_K) {
                BlockPos _bp21 = new BlockPos(x, y, z);
                TileEntity _tileEntity21 = world.func_175625_s(_bp21);
                IBlockState _bs21 = world.func_180495_p(_bp21);
                if (_tileEntity21 != null) {
                    _tileEntity21.getTileData().func_74780_a("增加经验", 1.0d);
                }
                world.func_184138_a(_bp21, _bs21, _bs21, 3);
            }
            $_dependencies.put("entity", entity);
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLingLiCut.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp22 = new BlockPos(x, y, z);
                TileEntity _tileEntity22 = world.func_175625_s(_bp22);
                IBlockState _bs22 = world.func_180495_p(_bp22);
                if (_tileEntity22 != null) {
                    _tileEntity22.getTileData().func_74780_a("DanFang", 54.0d);
                }
                world.func_184138_a(_bp22, _bs22, _bs22, 3);
            }
        }
    }
}
