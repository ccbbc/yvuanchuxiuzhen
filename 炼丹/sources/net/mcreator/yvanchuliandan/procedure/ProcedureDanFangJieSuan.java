package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemDanYao1;
import net.mcreator.yvanchuliandan.item.ItemDanYao10;
import net.mcreator.yvanchuliandan.item.ItemDanYao11;
import net.mcreator.yvanchuliandan.item.ItemDanYao12;
import net.mcreator.yvanchuliandan.item.ItemDanYao13;
import net.mcreator.yvanchuliandan.item.ItemDanYao14;
import net.mcreator.yvanchuliandan.item.ItemDanYao15;
import net.mcreator.yvanchuliandan.item.ItemDanYao16;
import net.mcreator.yvanchuliandan.item.ItemDanYao17;
import net.mcreator.yvanchuliandan.item.ItemDanYao18;
import net.mcreator.yvanchuliandan.item.ItemDanYao19;
import net.mcreator.yvanchuliandan.item.ItemDanYao2;
import net.mcreator.yvanchuliandan.item.ItemDanYao3;
import net.mcreator.yvanchuliandan.item.ItemDanYao4;
import net.mcreator.yvanchuliandan.item.ItemDanYao5;
import net.mcreator.yvanchuliandan.item.ItemDanYao6;
import net.mcreator.yvanchuliandan.item.ItemDanYao67;
import net.mcreator.yvanchuliandan.item.ItemDanYao68;
import net.mcreator.yvanchuliandan.item.ItemDanYao69;
import net.mcreator.yvanchuliandan.item.ItemDanYao7;
import net.mcreator.yvanchuliandan.item.ItemDanYao70;
import net.mcreator.yvanchuliandan.item.ItemDanYao71;
import net.mcreator.yvanchuliandan.item.ItemDanYao8;
import net.mcreator.yvanchuliandan.item.ItemDanYao9a;
import net.mcreator.yvanchuliandan.item.ItemDanYao9b;
import net.mcreator.yvanchuliandan.item.ItemDanYao9c;
import net.mcreator.yvanchuliandan.item.ItemDanYaoSpoils04;
import net.mcreator.yvanchuliandan.item.ItemDanYaoSpoils06;
import net.mcreator.yvanchuliandan.item.ItemDanYaoSpoils07;
import net.mcreator.yvanchuliandan.item.ItemDanYaoSpoils08;
import net.mcreator.yvanchuliandan.item.ItemDanYaoSpoils09;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanFangJieSuan.class */
public class ProcedureDanFangJieSuan extends ElementsYvanchuliandanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureDanFangJieSuan(ElementsYvanchuliandanMod instance) {
        super(instance, 337);
    }

    /* JADX WARN: Type inference failed for: r0v101, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$30] */
    /* JADX WARN: Type inference failed for: r0v104, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$31] */
    /* JADX WARN: Type inference failed for: r0v107, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$32] */
    /* JADX WARN: Type inference failed for: r0v110, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$33] */
    /* JADX WARN: Type inference failed for: r0v113, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$34] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$1] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$2] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$3] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$4] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$5] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$6] */
    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$7] */
    /* JADX WARN: Type inference failed for: r0v44, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$8] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$9] */
    /* JADX WARN: Type inference failed for: r0v50, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$12] */
    /* JADX WARN: Type inference failed for: r0v53, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$14] */
    /* JADX WARN: Type inference failed for: r0v56, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$15] */
    /* JADX WARN: Type inference failed for: r0v59, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$16] */
    /* JADX WARN: Type inference failed for: r0v62, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$17] */
    /* JADX WARN: Type inference failed for: r0v65, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$18] */
    /* JADX WARN: Type inference failed for: r0v68, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$19] */
    /* JADX WARN: Type inference failed for: r0v71, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$20] */
    /* JADX WARN: Type inference failed for: r0v74, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$21] */
    /* JADX WARN: Type inference failed for: r0v77, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$22] */
    /* JADX WARN: Type inference failed for: r0v80, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$23] */
    /* JADX WARN: Type inference failed for: r0v83, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$24] */
    /* JADX WARN: Type inference failed for: r0v86, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$25] */
    /* JADX WARN: Type inference failed for: r0v89, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$26] */
    /* JADX WARN: Type inference failed for: r0v92, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$27] */
    /* JADX WARN: Type inference failed for: r0v95, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$28] */
    /* JADX WARN: Type inference failed for: r0v98, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$29] */
    /* JADX WARN: Type inference failed for: r1v186, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$13] */
    /* JADX WARN: Type inference failed for: r1v198, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$10] */
    /* JADX WARN: Type inference failed for: r1v202, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan$11] */
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
        TileEntityLockableLoot func_175625_s15;
        TileEntityLockableLoot func_175625_s16;
        TileEntityLockableLoot func_175625_s17;
        TileEntityLockableLoot func_175625_s18;
        TileEntityLockableLoot func_175625_s19;
        TileEntityLockableLoot func_175625_s20;
        TileEntityLockableLoot func_175625_s21;
        TileEntityLockableLoot func_175625_s22;
        TileEntityLockableLoot func_175625_s23;
        TileEntityLockableLoot func_175625_s24;
        TileEntityLockableLoot func_175625_s25;
        TileEntityLockableLoot func_175625_s26;
        TileEntityLockableLoot func_175625_s27;
        TileEntityLockableLoot func_175625_s28;
        TileEntityLockableLoot func_175625_s29;
        TileEntityLockableLoot func_175625_s30;
        TileEntityLockableLoot func_175625_s31;
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 1.0d && (func_175625_s31 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s31 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack = new ItemStack(ItemDanYao1.block, 1);
            _setstack.func_190920_e(1);
            func_175625_s31.func_70299_a(4, _setstack);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 2.0d && (func_175625_s30 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s30 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack2 = new ItemStack(ItemDanYao2.block, 1);
            _setstack2.func_190920_e(1);
            func_175625_s30.func_70299_a(4, _setstack2);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.3
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 3.0d && (func_175625_s29 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s29 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack3 = new ItemStack(ItemDanYao3.block, 1);
            _setstack3.func_190920_e(1);
            func_175625_s29.func_70299_a(4, _setstack3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.4
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 4.0d && (func_175625_s28 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s28 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack4 = new ItemStack(ItemDanYao4.block, 1);
            _setstack4.func_190920_e(1);
            func_175625_s28.func_70299_a(4, _setstack4);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.5
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 5.0d && (func_175625_s27 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s27 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack5 = new ItemStack(ItemDanYao5.block, 1);
            _setstack5.func_190920_e(1);
            func_175625_s27.func_70299_a(4, _setstack5);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.6
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 6.0d && (func_175625_s26 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s26 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack6 = new ItemStack(ItemDanYao6.block, 1);
            _setstack6.func_190920_e(1);
            func_175625_s26.func_70299_a(4, _setstack6);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.7
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 7.0d && (func_175625_s25 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s25 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack7 = new ItemStack(ItemDanYao7.block, 1);
            _setstack7.func_190920_e(1);
            func_175625_s25.func_70299_a(4, _setstack7);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.8
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 8.0d && (func_175625_s24 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s24 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack8 = new ItemStack(ItemDanYao8.block, 1);
            _setstack8.func_190920_e(1);
            func_175625_s24.func_70299_a(4, _setstack8);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.9
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 901.0d) {
            TileEntityLockableLoot func_175625_s32 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s32 != null && (func_175625_s32 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack9 = new ItemStack(ItemDanYao9a.block, 1);
                _setstack9.func_190920_e(1);
                func_175625_s32.func_70299_a(4, _setstack9);
            }
            if (Math.random() <= (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.10
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "liandan") + 1.0d) * 0.01d) {
                TileEntityLockableLoot func_175625_s33 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s33 != null && (func_175625_s33 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack10 = new ItemStack(ItemDanYao9c.block, 1);
                    _setstack10.func_190920_e(1);
                    func_175625_s33.func_70299_a(4, _setstack10);
                }
            } else if (Math.random() <= (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.11
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "liandan") + 1.0d) * 0.02d && (func_175625_s23 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s23 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack11 = new ItemStack(ItemDanYao9b.block, 1);
                _setstack11.func_190920_e(1);
                func_175625_s23.func_70299_a(4, _setstack11);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.12
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 902.0d) {
            TileEntityLockableLoot func_175625_s34 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s34 != null && (func_175625_s34 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack12 = new ItemStack(ItemDanYao9b.block, 1);
                _setstack12.func_190920_e(1);
                func_175625_s34.func_70299_a(4, _setstack12);
            }
            if (Math.random() <= (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.13
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "liandan") + 1.0d) * 0.02d && (func_175625_s22 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s22 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack13 = new ItemStack(ItemDanYao9c.block, 1);
                _setstack13.func_190920_e(1);
                func_175625_s22.func_70299_a(4, _setstack13);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.14
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 903.0d && (func_175625_s21 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s21 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack14 = new ItemStack(ItemDanYao9c.block, 1);
            _setstack14.func_190920_e(1);
            func_175625_s21.func_70299_a(4, _setstack14);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.15
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 10.0d && (func_175625_s20 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s20 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack15 = new ItemStack(ItemDanYao10.block, 1);
            _setstack15.func_190920_e(1);
            func_175625_s20.func_70299_a(4, _setstack15);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.16
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 11.0d && (func_175625_s19 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s19 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack16 = new ItemStack(ItemDanYao11.block, 1);
            _setstack16.func_190920_e(1);
            func_175625_s19.func_70299_a(4, _setstack16);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.17
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 12.0d && (func_175625_s18 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s18 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack17 = new ItemStack(ItemDanYao12.block, 1);
            _setstack17.func_190920_e(1);
            func_175625_s18.func_70299_a(4, _setstack17);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.18
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 13.0d && (func_175625_s17 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s17 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack18 = new ItemStack(ItemDanYao13.block, 1);
            _setstack18.func_190920_e(1);
            func_175625_s17.func_70299_a(4, _setstack18);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.19
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 14.0d && (func_175625_s16 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s16 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack19 = new ItemStack(ItemDanYao14.block, 1);
            _setstack19.func_190920_e(1);
            func_175625_s16.func_70299_a(4, _setstack19);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.20
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 15.0d && (func_175625_s15 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s15 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack20 = new ItemStack(ItemDanYao15.block, 1);
            _setstack20.func_190920_e(1);
            func_175625_s15.func_70299_a(4, _setstack20);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.21
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 16.0d && (func_175625_s14 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s14 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack21 = new ItemStack(ItemDanYao16.block, 1);
            _setstack21.func_190920_e(1);
            func_175625_s14.func_70299_a(4, _setstack21);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.22
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 17.0d && (func_175625_s13 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s13 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack22 = new ItemStack(ItemDanYao17.block, 1);
            _setstack22.func_190920_e(1);
            func_175625_s13.func_70299_a(4, _setstack22);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.23
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 18.0d && (func_175625_s12 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s12 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack23 = new ItemStack(ItemDanYao18.block, 1);
            _setstack23.func_190920_e(1);
            func_175625_s12.func_70299_a(4, _setstack23);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.24
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 19.0d && (func_175625_s11 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s11 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack24 = new ItemStack(ItemDanYao19.block, 1);
            _setstack24.func_190920_e(1);
            func_175625_s11.func_70299_a(4, _setstack24);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.25
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 100001.0d && (func_175625_s10 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s10 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack25 = new ItemStack(ItemDanYaoSpoils06.block, 1);
            _setstack25.func_190920_e(1);
            func_175625_s10.func_70299_a(4, _setstack25);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.26
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 100002.0d && (func_175625_s9 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s9 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack26 = new ItemStack(ItemDanYaoSpoils09.block, 1);
            _setstack26.func_190920_e(1);
            func_175625_s9.func_70299_a(4, _setstack26);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.27
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 100003.0d && (func_175625_s8 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s8 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack27 = new ItemStack(ItemDanYaoSpoils07.block, 1);
            _setstack27.func_190920_e(1);
            func_175625_s8.func_70299_a(4, _setstack27);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.28
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 100004.0d && (func_175625_s7 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s7 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack28 = new ItemStack(ItemDanYaoSpoils04.block, 1);
            _setstack28.func_190920_e(1);
            func_175625_s7.func_70299_a(4, _setstack28);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.29
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 100005.0d && (func_175625_s6 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s6 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack29 = new ItemStack(ItemDanYaoSpoils08.block, 1);
            _setstack29.func_190920_e(1);
            func_175625_s6.func_70299_a(4, _setstack29);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.30
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 201.0d && (func_175625_s5 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s5 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack30 = new ItemStack(ItemDanYao67.block, 1);
            _setstack30.func_190920_e(1);
            func_175625_s5.func_70299_a(4, _setstack30);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.31
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 202.0d && (func_175625_s4 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s4 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack31 = new ItemStack(ItemDanYao68.block, 1);
            _setstack31.func_190920_e(1);
            func_175625_s4.func_70299_a(4, _setstack31);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.32
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 203.0d && (func_175625_s3 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s3 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack32 = new ItemStack(ItemDanYao69.block, 1);
            _setstack32.func_190920_e(1);
            func_175625_s3.func_70299_a(4, _setstack32);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.33
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 204.0d && (func_175625_s2 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s2 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack33 = new ItemStack(ItemDanYao70.block, 1);
            _setstack33.func_190920_e(1);
            func_175625_s2.func_70299_a(4, _setstack33);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanFangJieSuan.34
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 205.0d && (func_175625_s = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s instanceof TileEntityLockableLoot)) {
            ItemStack _setstack34 = new ItemStack(ItemDanYao71.block, 1);
            _setstack34.func_190920_e(1);
            func_175625_s.func_70299_a(4, _setstack34);
        }
    }
}
