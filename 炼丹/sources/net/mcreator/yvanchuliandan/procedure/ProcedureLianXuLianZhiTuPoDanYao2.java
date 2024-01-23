package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemDanYao22a;
import net.mcreator.yvanchuliandan.item.ItemDanYao22b;
import net.mcreator.yvanchuliandan.item.ItemDanYao22c;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureLianXuLianZhiTuPoDanYao2.class */
public class ProcedureLianXuLianZhiTuPoDanYao2 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureLianXuLianZhiTuPoDanYao2(ElementsYvanchuliandanMod instance) {
        super(instance, 461);
    }

    /* JADX WARN: Type inference failed for: r0v100, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$49] */
    /* JADX WARN: Type inference failed for: r0v103, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$50] */
    /* JADX WARN: Type inference failed for: r0v114, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$47] */
    /* JADX WARN: Type inference failed for: r0v125, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$44] */
    /* JADX WARN: Type inference failed for: r0v136, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$33] */
    /* JADX WARN: Type inference failed for: r0v139, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$34] */
    /* JADX WARN: Type inference failed for: r0v142, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$36] */
    /* JADX WARN: Type inference failed for: r0v145, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$37] */
    /* JADX WARN: Type inference failed for: r0v148, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$39] */
    /* JADX WARN: Type inference failed for: r0v151, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$40] */
    /* JADX WARN: Type inference failed for: r0v154, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$41] */
    /* JADX WARN: Type inference failed for: r0v165, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$38] */
    /* JADX WARN: Type inference failed for: r0v176, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$35] */
    /* JADX WARN: Type inference failed for: r0v191, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$22] */
    /* JADX WARN: Type inference failed for: r0v194, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$23] */
    /* JADX WARN: Type inference failed for: r0v197, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$25] */
    /* JADX WARN: Type inference failed for: r0v200, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$26] */
    /* JADX WARN: Type inference failed for: r0v203, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$28] */
    /* JADX WARN: Type inference failed for: r0v206, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$29] */
    /* JADX WARN: Type inference failed for: r0v209, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$30] */
    /* JADX WARN: Type inference failed for: r0v220, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$27] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$1] */
    /* JADX WARN: Type inference failed for: r0v231, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$24] */
    /* JADX WARN: Type inference failed for: r0v242, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$13] */
    /* JADX WARN: Type inference failed for: r0v245, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$14] */
    /* JADX WARN: Type inference failed for: r0v248, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$16] */
    /* JADX WARN: Type inference failed for: r0v251, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$17] */
    /* JADX WARN: Type inference failed for: r0v254, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$19] */
    /* JADX WARN: Type inference failed for: r0v257, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$20] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$31] */
    /* JADX WARN: Type inference failed for: r0v260, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$21] */
    /* JADX WARN: Type inference failed for: r0v271, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$18] */
    /* JADX WARN: Type inference failed for: r0v282, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$15] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$51] */
    /* JADX WARN: Type inference failed for: r0v293, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$3] */
    /* JADX WARN: Type inference failed for: r0v296, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$4] */
    /* JADX WARN: Type inference failed for: r0v299, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$6] */
    /* JADX WARN: Type inference failed for: r0v302, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$7] */
    /* JADX WARN: Type inference failed for: r0v305, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$9] */
    /* JADX WARN: Type inference failed for: r0v308, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$10] */
    /* JADX WARN: Type inference failed for: r0v311, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$11] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$52] */
    /* JADX WARN: Type inference failed for: r0v322, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$8] */
    /* JADX WARN: Type inference failed for: r0v333, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$5] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$53] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$55] */
    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$56] */
    /* JADX WARN: Type inference failed for: r0v44, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$58] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$59] */
    /* JADX WARN: Type inference failed for: r0v50, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$60] */
    /* JADX WARN: Type inference failed for: r0v61, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$57] */
    /* JADX WARN: Type inference failed for: r0v72, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$54] */
    /* JADX WARN: Type inference failed for: r0v85, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$42] */
    /* JADX WARN: Type inference failed for: r0v88, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$43] */
    /* JADX WARN: Type inference failed for: r0v91, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$45] */
    /* JADX WARN: Type inference failed for: r0v94, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$46] */
    /* JADX WARN: Type inference failed for: r0v97, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$48] */
    /* JADX WARN: Type inference failed for: r1v156, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$2] */
    /* JADX WARN: Type inference failed for: r1v160, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$12] */
    /* JADX WARN: Type inference failed for: r1v62, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2$32] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 2201.0d) {
            if (Math.random() <= (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.2
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "liandan") + 1.0d) * 0.01d) {
                if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.3
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == ItemStack.field_190927_a.func_77973_b()) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s != null && (func_175625_s instanceof TileEntityLockableLoot)) {
                        ItemStack _setstack = new ItemStack(ItemDanYao22c.block, 1);
                        _setstack.func_190920_e(1);
                        func_175625_s.func_70299_a(4, _setstack);
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.4
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                        if (func_175625_s2 instanceof TileEntityLockableLoot) {
                            return func_175625_s2.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao22c.block, 1).func_77973_b()) {
                    new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.5
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                            if (func_175625_s2 instanceof TileEntityLockableLoot) {
                                return func_175625_s2.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_190917_f(1);
                } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.6
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                        if (func_175625_s2 instanceof TileEntityLockableLoot) {
                            return func_175625_s2.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == ItemStack.field_190927_a.func_77973_b()) {
                    TileEntityLockableLoot func_175625_s2 = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s2 != null && (func_175625_s2 instanceof TileEntityLockableLoot)) {
                        ItemStack _setstack2 = new ItemStack(ItemDanYao22c.block, 1);
                        _setstack2.func_190920_e(1);
                        func_175625_s2.func_70299_a(5, _setstack2);
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.7
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                        if (func_175625_s3 instanceof TileEntityLockableLoot) {
                            return func_175625_s3.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemDanYao22c.block, 1).func_77973_b()) {
                    new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.8
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                            if (func_175625_s3 instanceof TileEntityLockableLoot) {
                                return func_175625_s3.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_190917_f(1);
                } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.9
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                        if (func_175625_s3 instanceof TileEntityLockableLoot) {
                            return func_175625_s3.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == ItemStack.field_190927_a.func_77973_b()) {
                    TileEntityLockableLoot func_175625_s3 = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s3 != null && (func_175625_s3 instanceof TileEntityLockableLoot)) {
                        ItemStack _setstack3 = new ItemStack(ItemDanYao22c.block, 1);
                        _setstack3.func_190920_e(1);
                        func_175625_s3.func_70299_a(6, _setstack3);
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.10
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s4 = world.func_175625_s(pos);
                        if (func_175625_s4 instanceof TileEntityLockableLoot) {
                            return func_175625_s4.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemDanYao22c.block, 1).func_77973_b()) {
                    new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.11
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s4 = world.func_175625_s(pos);
                            if (func_175625_s4 instanceof TileEntityLockableLoot) {
                                return func_175625_s4.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
                }
            } else if (Math.random() <= (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.12
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "liandan") + 1.0d) * 0.02d) {
                if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.13
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s4 = world.func_175625_s(pos);
                        if (func_175625_s4 instanceof TileEntityLockableLoot) {
                            return func_175625_s4.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == ItemStack.field_190927_a.func_77973_b()) {
                    TileEntityLockableLoot func_175625_s4 = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s4 != null && (func_175625_s4 instanceof TileEntityLockableLoot)) {
                        ItemStack _setstack4 = new ItemStack(ItemDanYao22b.block, 1);
                        _setstack4.func_190920_e(1);
                        func_175625_s4.func_70299_a(4, _setstack4);
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.14
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s5 = world.func_175625_s(pos);
                        if (func_175625_s5 instanceof TileEntityLockableLoot) {
                            return func_175625_s5.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao22b.block, 1).func_77973_b()) {
                    new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.15
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s5 = world.func_175625_s(pos);
                            if (func_175625_s5 instanceof TileEntityLockableLoot) {
                                return func_175625_s5.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_190917_f(1);
                } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.16
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s5 = world.func_175625_s(pos);
                        if (func_175625_s5 instanceof TileEntityLockableLoot) {
                            return func_175625_s5.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == ItemStack.field_190927_a.func_77973_b()) {
                    TileEntityLockableLoot func_175625_s5 = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s5 != null && (func_175625_s5 instanceof TileEntityLockableLoot)) {
                        ItemStack _setstack5 = new ItemStack(ItemDanYao22b.block, 1);
                        _setstack5.func_190920_e(1);
                        func_175625_s5.func_70299_a(5, _setstack5);
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.17
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s6 = world.func_175625_s(pos);
                        if (func_175625_s6 instanceof TileEntityLockableLoot) {
                            return func_175625_s6.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemDanYao22b.block, 1).func_77973_b()) {
                    new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.18
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s6 = world.func_175625_s(pos);
                            if (func_175625_s6 instanceof TileEntityLockableLoot) {
                                return func_175625_s6.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_190917_f(1);
                } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.19
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s6 = world.func_175625_s(pos);
                        if (func_175625_s6 instanceof TileEntityLockableLoot) {
                            return func_175625_s6.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == ItemStack.field_190927_a.func_77973_b()) {
                    TileEntityLockableLoot func_175625_s6 = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s6 != null && (func_175625_s6 instanceof TileEntityLockableLoot)) {
                        ItemStack _setstack6 = new ItemStack(ItemDanYao22b.block, 1);
                        _setstack6.func_190920_e(1);
                        func_175625_s6.func_70299_a(6, _setstack6);
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.20
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s7 = world.func_175625_s(pos);
                        if (func_175625_s7 instanceof TileEntityLockableLoot) {
                            return func_175625_s7.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemDanYao22b.block, 1).func_77973_b()) {
                    new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.21
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s7 = world.func_175625_s(pos);
                            if (func_175625_s7 instanceof TileEntityLockableLoot) {
                                return func_175625_s7.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.22
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s7 = world.func_175625_s(pos);
                    if (func_175625_s7 instanceof TileEntityLockableLoot) {
                        return func_175625_s7.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == ItemStack.field_190927_a.func_77973_b()) {
                TileEntityLockableLoot func_175625_s7 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s7 != null && (func_175625_s7 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack7 = new ItemStack(ItemDanYao22a.block, 1);
                    _setstack7.func_190920_e(1);
                    func_175625_s7.func_70299_a(4, _setstack7);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.23
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s8 = world.func_175625_s(pos);
                    if (func_175625_s8 instanceof TileEntityLockableLoot) {
                        return func_175625_s8.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao22a.block, 1).func_77973_b()) {
                new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.24
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s8 = world.func_175625_s(pos);
                        if (func_175625_s8 instanceof TileEntityLockableLoot) {
                            return func_175625_s8.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_190917_f(1);
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.25
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s8 = world.func_175625_s(pos);
                    if (func_175625_s8 instanceof TileEntityLockableLoot) {
                        return func_175625_s8.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == ItemStack.field_190927_a.func_77973_b()) {
                TileEntityLockableLoot func_175625_s8 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s8 != null && (func_175625_s8 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack8 = new ItemStack(ItemDanYao22a.block, 1);
                    _setstack8.func_190920_e(1);
                    func_175625_s8.func_70299_a(5, _setstack8);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.26
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s9 = world.func_175625_s(pos);
                    if (func_175625_s9 instanceof TileEntityLockableLoot) {
                        return func_175625_s9.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemDanYao22a.block, 1).func_77973_b()) {
                new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.27
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s9 = world.func_175625_s(pos);
                        if (func_175625_s9 instanceof TileEntityLockableLoot) {
                            return func_175625_s9.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_190917_f(1);
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.28
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s9 = world.func_175625_s(pos);
                    if (func_175625_s9 instanceof TileEntityLockableLoot) {
                        return func_175625_s9.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == ItemStack.field_190927_a.func_77973_b()) {
                TileEntityLockableLoot func_175625_s9 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s9 != null && (func_175625_s9 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack9 = new ItemStack(ItemDanYao22a.block, 1);
                    _setstack9.func_190920_e(1);
                    func_175625_s9.func_70299_a(6, _setstack9);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.29
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s10 = world.func_175625_s(pos);
                    if (func_175625_s10 instanceof TileEntityLockableLoot) {
                        return func_175625_s10.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemDanYao22a.block, 1).func_77973_b()) {
                new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.30
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s10 = world.func_175625_s(pos);
                        if (func_175625_s10 instanceof TileEntityLockableLoot) {
                            return func_175625_s10.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.31
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 2202.0d) {
            if (Math.random() <= (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.32
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "liandan") + 1.0d) * 0.02d) {
                if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.33
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s10 = world.func_175625_s(pos);
                        if (func_175625_s10 instanceof TileEntityLockableLoot) {
                            return func_175625_s10.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == ItemStack.field_190927_a.func_77973_b()) {
                    TileEntityLockableLoot func_175625_s10 = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s10 != null && (func_175625_s10 instanceof TileEntityLockableLoot)) {
                        ItemStack _setstack10 = new ItemStack(ItemDanYao22c.block, 1);
                        _setstack10.func_190920_e(1);
                        func_175625_s10.func_70299_a(4, _setstack10);
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.34
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s11 = world.func_175625_s(pos);
                        if (func_175625_s11 instanceof TileEntityLockableLoot) {
                            return func_175625_s11.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao22c.block, 1).func_77973_b()) {
                    new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.35
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s11 = world.func_175625_s(pos);
                            if (func_175625_s11 instanceof TileEntityLockableLoot) {
                                return func_175625_s11.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_190917_f(1);
                } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.36
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s11 = world.func_175625_s(pos);
                        if (func_175625_s11 instanceof TileEntityLockableLoot) {
                            return func_175625_s11.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == ItemStack.field_190927_a.func_77973_b()) {
                    TileEntityLockableLoot func_175625_s11 = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s11 != null && (func_175625_s11 instanceof TileEntityLockableLoot)) {
                        ItemStack _setstack11 = new ItemStack(ItemDanYao22c.block, 1);
                        _setstack11.func_190920_e(1);
                        func_175625_s11.func_70299_a(5, _setstack11);
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.37
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s12 = world.func_175625_s(pos);
                        if (func_175625_s12 instanceof TileEntityLockableLoot) {
                            return func_175625_s12.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemDanYao22c.block, 1).func_77973_b()) {
                    new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.38
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s12 = world.func_175625_s(pos);
                            if (func_175625_s12 instanceof TileEntityLockableLoot) {
                                return func_175625_s12.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_190917_f(1);
                } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.39
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s12 = world.func_175625_s(pos);
                        if (func_175625_s12 instanceof TileEntityLockableLoot) {
                            return func_175625_s12.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == ItemStack.field_190927_a.func_77973_b()) {
                    TileEntityLockableLoot func_175625_s12 = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s12 != null && (func_175625_s12 instanceof TileEntityLockableLoot)) {
                        ItemStack _setstack12 = new ItemStack(ItemDanYao22c.block, 1);
                        _setstack12.func_190920_e(1);
                        func_175625_s12.func_70299_a(6, _setstack12);
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.40
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s13 = world.func_175625_s(pos);
                        if (func_175625_s13 instanceof TileEntityLockableLoot) {
                            return func_175625_s13.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemDanYao22c.block, 1).func_77973_b()) {
                    new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.41
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s13 = world.func_175625_s(pos);
                            if (func_175625_s13 instanceof TileEntityLockableLoot) {
                                return func_175625_s13.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.42
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s13 = world.func_175625_s(pos);
                    if (func_175625_s13 instanceof TileEntityLockableLoot) {
                        return func_175625_s13.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == ItemStack.field_190927_a.func_77973_b()) {
                TileEntityLockableLoot func_175625_s13 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s13 != null && (func_175625_s13 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack13 = new ItemStack(ItemDanYao22b.block, 1);
                    _setstack13.func_190920_e(1);
                    func_175625_s13.func_70299_a(4, _setstack13);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.43
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s14 = world.func_175625_s(pos);
                    if (func_175625_s14 instanceof TileEntityLockableLoot) {
                        return func_175625_s14.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao22b.block, 1).func_77973_b()) {
                new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.44
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s14 = world.func_175625_s(pos);
                        if (func_175625_s14 instanceof TileEntityLockableLoot) {
                            return func_175625_s14.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_190917_f(1);
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.45
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s14 = world.func_175625_s(pos);
                    if (func_175625_s14 instanceof TileEntityLockableLoot) {
                        return func_175625_s14.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == ItemStack.field_190927_a.func_77973_b()) {
                TileEntityLockableLoot func_175625_s14 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s14 != null && (func_175625_s14 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack14 = new ItemStack(ItemDanYao22b.block, 1);
                    _setstack14.func_190920_e(1);
                    func_175625_s14.func_70299_a(5, _setstack14);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.46
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s15 = world.func_175625_s(pos);
                    if (func_175625_s15 instanceof TileEntityLockableLoot) {
                        return func_175625_s15.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemDanYao22b.block, 1).func_77973_b()) {
                new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.47
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s15 = world.func_175625_s(pos);
                        if (func_175625_s15 instanceof TileEntityLockableLoot) {
                            return func_175625_s15.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_190917_f(1);
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.48
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s15 = world.func_175625_s(pos);
                    if (func_175625_s15 instanceof TileEntityLockableLoot) {
                        return func_175625_s15.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == ItemStack.field_190927_a.func_77973_b()) {
                TileEntityLockableLoot func_175625_s15 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s15 != null && (func_175625_s15 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack15 = new ItemStack(ItemDanYao22b.block, 1);
                    _setstack15.func_190920_e(1);
                    func_175625_s15.func_70299_a(6, _setstack15);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.49
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s16 = world.func_175625_s(pos);
                    if (func_175625_s16 instanceof TileEntityLockableLoot) {
                        return func_175625_s16.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemDanYao22b.block, 1).func_77973_b()) {
                new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.50
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s16 = world.func_175625_s(pos);
                        if (func_175625_s16 instanceof TileEntityLockableLoot) {
                            return func_175625_s16.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.51
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "DanFang") == 2203.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.52
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s16 = world.func_175625_s(pos);
                    if (func_175625_s16 instanceof TileEntityLockableLoot) {
                        return func_175625_s16.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == ItemStack.field_190927_a.func_77973_b()) {
                TileEntityLockableLoot func_175625_s16 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s16 != null && (func_175625_s16 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack16 = new ItemStack(ItemDanYao22c.block, 1);
                    _setstack16.func_190920_e(1);
                    func_175625_s16.func_70299_a(4, _setstack16);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.53
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s17 = world.func_175625_s(pos);
                    if (func_175625_s17 instanceof TileEntityLockableLoot) {
                        return func_175625_s17.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemDanYao22c.block, 1).func_77973_b()) {
                new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.54
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s17 = world.func_175625_s(pos);
                        if (func_175625_s17 instanceof TileEntityLockableLoot) {
                            return func_175625_s17.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_190917_f(1);
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.55
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s17 = world.func_175625_s(pos);
                    if (func_175625_s17 instanceof TileEntityLockableLoot) {
                        return func_175625_s17.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == ItemStack.field_190927_a.func_77973_b()) {
                TileEntityLockableLoot func_175625_s17 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s17 != null && (func_175625_s17 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack17 = new ItemStack(ItemDanYao22c.block, 1);
                    _setstack17.func_190920_e(1);
                    func_175625_s17.func_70299_a(5, _setstack17);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.56
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s18 = world.func_175625_s(pos);
                    if (func_175625_s18 instanceof TileEntityLockableLoot) {
                        return func_175625_s18.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemDanYao22c.block, 1).func_77973_b()) {
                new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.57
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s18 = world.func_175625_s(pos);
                        if (func_175625_s18 instanceof TileEntityLockableLoot) {
                            return func_175625_s18.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_190917_f(1);
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.58
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s18 = world.func_175625_s(pos);
                    if (func_175625_s18 instanceof TileEntityLockableLoot) {
                        return func_175625_s18.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == ItemStack.field_190927_a.func_77973_b()) {
                TileEntityLockableLoot func_175625_s18 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s18 != null && (func_175625_s18 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack18 = new ItemStack(ItemDanYao22c.block, 1);
                    _setstack18.func_190920_e(1);
                    func_175625_s18.func_70299_a(6, _setstack18);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.59
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s19 = world.func_175625_s(pos);
                    if (func_175625_s19 instanceof TileEntityLockableLoot) {
                        return func_175625_s19.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemDanYao22c.block, 1).func_77973_b()) {
                new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiTuPoDanYao2.60
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s19 = world.func_175625_s(pos);
                        if (func_175625_s19 instanceof TileEntityLockableLoot) {
                            return func_175625_s19.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        }
    }
}
