package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemDanYao43;
import net.mcreator.yvanchuliandan.item.ItemDanYao44;
import net.mcreator.yvanchuliandan.item.ItemDanYao45a;
import net.mcreator.yvanchuliandan.item.ItemDanYao45b;
import net.mcreator.yvanchuliandan.item.ItemDanYao45c;
import net.mcreator.yvanchuliandan.item.ItemDanYao46;
import net.mcreator.yvanchuliandan.item.ItemDanYao47;
import net.mcreator.yvanchuliandan.item.ItemDanYao48;
import net.mcreator.yvanchuliandan.item.ItemDanYao49;
import net.mcreator.yvanchuliandan.item.ItemDanYao50;
import net.mcreator.yvanchuliandan.item.ItemDanYao51;
import net.mcreator.yvanchuliandan.item.ItemDanYao52;
import net.mcreator.yvanchuliandan.item.ItemDanYao53;
import net.mcreator.yvanchuliandan.item.ItemDanYao54;
import net.mcreator.yvanchuliandan.item.ItemDanYaoSect1;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanFangJieSuan4.class */
public class ProcedureDanFangJieSuan4 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanFangJieSuan4(ElementsYvanchuliandanMod instance) {
        super(instance, 439);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$1] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$2] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$3] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$6] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$8] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$9] */
    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$10] */
    /* JADX WARN: Type inference failed for: r0v44, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$11] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$12] */
    /* JADX WARN: Type inference failed for: r0v50, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$13] */
    /* JADX WARN: Type inference failed for: r0v53, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$14] */
    /* JADX WARN: Type inference failed for: r0v56, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$15] */
    /* JADX WARN: Type inference failed for: r0v59, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$16] */
    /* JADX WARN: Type inference failed for: r0v62, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$17] */
    /* JADX WARN: Type inference failed for: r0v65, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$18] */
    /* JADX WARN: Type inference failed for: r0v71, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$19] */
    /* JADX WARN: Type inference failed for: r0v77, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$20] */
    /* JADX WARN: Type inference failed for: r0v83, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$21] */
    /* JADX WARN: Type inference failed for: r0v89, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$22] */
    /* JADX WARN: Type inference failed for: r1v113, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$7] */
    /* JADX WARN: Type inference failed for: r1v125, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$4] */
    /* JADX WARN: Type inference failed for: r1v129, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4$5] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        TileEntityLockableLoot func_175625_s;
        TileEntityLockableLoot func_175625_s2;
        TileEntityLockableLoot func_175625_s3;
        TileEntityLockableLoot func_175625_s4;
        TileEntityLockableLoot func_175625_s5;
        TileEntityLockableLoot func_175625_s6;
        TileEntityLockableLoot func_175625_s7;
        TileEntityLockableLoot func_175625_s8;
        TileEntityLockableLoot func_175625_s9;
        TileEntityLockableLoot func_175625_s10;
        TileEntityLockableLoot func_175625_s11;
        TileEntityLockableLoot func_175625_s12;
        TileEntityLockableLoot func_175625_s13;
        TileEntityLockableLoot func_175625_s14;
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 43.0d && (func_175625_s14 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s14 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack = new ItemStack(ItemDanYao43.block, 1);
            _setstack.func_190920_e(1);
            func_175625_s14.func_70299_a(4, _setstack);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 44.0d && (func_175625_s13 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s13 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack2 = new ItemStack(ItemDanYao44.block, 1);
            _setstack2.func_190920_e(1);
            func_175625_s13.func_70299_a(4, _setstack2);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.3
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 4501.0d) {
            TileEntityLockableLoot func_175625_s15 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s15 != null && (func_175625_s15 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack3 = new ItemStack(ItemDanYao45a.block, 1);
                _setstack3.func_190920_e(1);
                func_175625_s15.func_70299_a(4, _setstack3);
            }
            if (Math.random() <= (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.4
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "liandan") + 1.0d) * 0.01d) {
                TileEntityLockableLoot func_175625_s16 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s16 != null && (func_175625_s16 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack4 = new ItemStack(ItemDanYao45c.block, 1);
                    _setstack4.func_190920_e(1);
                    func_175625_s16.func_70299_a(4, _setstack4);
                }
            } else if (Math.random() <= (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.5
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "liandan") + 1.0d) * 0.02d && (func_175625_s12 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s12 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack5 = new ItemStack(ItemDanYao45b.block, 1);
                _setstack5.func_190920_e(1);
                func_175625_s12.func_70299_a(4, _setstack5);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.6
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 4502.0d) {
            TileEntityLockableLoot func_175625_s17 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s17 != null && (func_175625_s17 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack6 = new ItemStack(ItemDanYao45b.block, 1);
                _setstack6.func_190920_e(1);
                func_175625_s17.func_70299_a(4, _setstack6);
            }
            if (Math.random() <= (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.7
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "liandan") + 1.0d) * 0.02d && (func_175625_s11 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s11 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack7 = new ItemStack(ItemDanYao45c.block, 1);
                _setstack7.func_190920_e(1);
                func_175625_s11.func_70299_a(4, _setstack7);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.8
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 4503.0d && (func_175625_s10 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s10 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack8 = new ItemStack(ItemDanYao45c.block, 1);
            _setstack8.func_190920_e(1);
            func_175625_s10.func_70299_a(4, _setstack8);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.9
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 46.0d && (func_175625_s9 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s9 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack9 = new ItemStack(ItemDanYao46.block, 1);
            _setstack9.func_190920_e(1);
            func_175625_s9.func_70299_a(4, _setstack9);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.10
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 47.0d && (func_175625_s8 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s8 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack10 = new ItemStack(ItemDanYao47.block, 1);
            _setstack10.func_190920_e(1);
            func_175625_s8.func_70299_a(4, _setstack10);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.11
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 48.0d && (func_175625_s7 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s7 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack11 = new ItemStack(ItemDanYao48.block, 1);
            _setstack11.func_190920_e(1);
            func_175625_s7.func_70299_a(4, _setstack11);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.12
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 49.0d && (func_175625_s6 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s6 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack12 = new ItemStack(ItemDanYao49.block, 1);
            _setstack12.func_190920_e(1);
            func_175625_s6.func_70299_a(4, _setstack12);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.13
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 50.0d && (func_175625_s5 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s5 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack13 = new ItemStack(ItemDanYao50.block, 1);
            _setstack13.func_190920_e(1);
            func_175625_s5.func_70299_a(4, _setstack13);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.14
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 51.0d && (func_175625_s4 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s4 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack14 = new ItemStack(ItemDanYao51.block, 1);
            _setstack14.func_190920_e(1);
            func_175625_s4.func_70299_a(4, _setstack14);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.15
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 52.0d && (func_175625_s3 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s3 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack15 = new ItemStack(ItemDanYao52.block, 1);
            _setstack15.func_190920_e(1);
            func_175625_s3.func_70299_a(4, _setstack15);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.16
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 53.0d && (func_175625_s2 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s2 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack16 = new ItemStack(ItemDanYao53.block, 1);
            _setstack16.func_190920_e(1);
            func_175625_s2.func_70299_a(4, _setstack16);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.17
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 54.0d && (func_175625_s = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s instanceof TileEntityLockableLoot)) {
            ItemStack _setstack17 = new ItemStack(ItemDanYao54.block, 1);
            _setstack17.func_190920_e(1);
            func_175625_s.func_70299_a(4, _setstack17);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.18
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 88883.0d) {
            TileEntityLockableLoot func_175625_s18 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s18 != null && (func_175625_s18 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack18 = new ItemStack(ItemDanYaoSect1.block, 1);
                _setstack18.func_190920_e(1);
                func_175625_s18.func_70299_a(4, _setstack18);
            }
            ItemStack _stack = new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.19
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s19 = world.func_175625_s(pos);
                    if (func_175625_s19 instanceof TileEntityLockableLoot) {
                        return func_175625_s19.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4);
            if (!_stack.func_77942_o()) {
                _stack.func_77982_d(new NBTTagCompound());
            }
            _stack.func_77978_p().func_74780_a("级别", 4.0d);
            ItemStack _stack2 = new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.20
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s19 = world.func_175625_s(pos);
                    if (func_175625_s19 instanceof TileEntityLockableLoot) {
                        return func_175625_s19.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4);
            if (!_stack2.func_77942_o()) {
                _stack2.func_77982_d(new NBTTagCompound());
            }
            _stack2.func_77978_p().func_74780_a("数值", 12.0d);
            ItemStack _stack3 = new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.21
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s19 = world.func_175625_s(pos);
                    if (func_175625_s19 instanceof TileEntityLockableLoot) {
                        return func_175625_s19.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4);
            if (!_stack3.func_77942_o()) {
                _stack3.func_77982_d(new NBTTagCompound());
            }
            _stack3.func_77978_p().func_74778_a("数值类型", "MagicAttack");
            new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan4.22
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s19 = world.func_175625_s(pos);
                    if (func_175625_s19 instanceof TileEntityLockableLoot) {
                        return func_175625_s19.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_151001_c("§6§l紫霞丹");
        }
    }
}
