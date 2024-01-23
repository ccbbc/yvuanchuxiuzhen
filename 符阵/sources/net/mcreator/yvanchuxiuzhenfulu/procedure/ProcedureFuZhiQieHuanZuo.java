package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuZhi1;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuZhi2;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuZhi3;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuZhi4;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuZhi5;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFuZhiQieHuanZuo.class */
public class ProcedureFuZhiQieHuanZuo extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFuZhiQieHuanZuo(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 291);
    }

    /* JADX WARN: Type inference failed for: r0v100, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$63] */
    /* JADX WARN: Type inference failed for: r0v104, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$61] */
    /* JADX WARN: Type inference failed for: r0v111, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$60] */
    /* JADX WARN: Type inference failed for: r0v115, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$58] */
    /* JADX WARN: Type inference failed for: r0v122, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$57] */
    /* JADX WARN: Type inference failed for: r0v126, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$27] */
    /* JADX WARN: Type inference failed for: r0v132, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$30] */
    /* JADX WARN: Type inference failed for: r0v138, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$33] */
    /* JADX WARN: Type inference failed for: r0v144, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$36] */
    /* JADX WARN: Type inference failed for: r0v150, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$39] */
    /* JADX WARN: Type inference failed for: r0v156, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$42] */
    /* JADX WARN: Type inference failed for: r0v162, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$44] */
    /* JADX WARN: Type inference failed for: r0v168, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$46] */
    /* JADX WARN: Type inference failed for: r0v174, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$48] */
    /* JADX WARN: Type inference failed for: r0v180, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$50] */
    /* JADX WARN: Type inference failed for: r0v186, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$52] */
    /* JADX WARN: Type inference failed for: r0v192, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$54] */
    /* JADX WARN: Type inference failed for: r0v199, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$53] */
    /* JADX WARN: Type inference failed for: r0v203, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$51] */
    /* JADX WARN: Type inference failed for: r0v207, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$49] */
    /* JADX WARN: Type inference failed for: r0v211, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$47] */
    /* JADX WARN: Type inference failed for: r0v215, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$45] */
    /* JADX WARN: Type inference failed for: r0v219, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$43] */
    /* JADX WARN: Type inference failed for: r0v223, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$41] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$1] */
    /* JADX WARN: Type inference failed for: r0v230, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$40] */
    /* JADX WARN: Type inference failed for: r0v234, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$38] */
    /* JADX WARN: Type inference failed for: r0v241, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$37] */
    /* JADX WARN: Type inference failed for: r0v245, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$35] */
    /* JADX WARN: Type inference failed for: r0v252, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$34] */
    /* JADX WARN: Type inference failed for: r0v256, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$32] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$7] */
    /* JADX WARN: Type inference failed for: r0v263, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$31] */
    /* JADX WARN: Type inference failed for: r0v267, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$29] */
    /* JADX WARN: Type inference failed for: r0v274, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$28] */
    /* JADX WARN: Type inference failed for: r0v278, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$8] */
    /* JADX WARN: Type inference failed for: r0v284, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$11] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$26] */
    /* JADX WARN: Type inference failed for: r0v290, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$14] */
    /* JADX WARN: Type inference failed for: r0v296, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$17] */
    /* JADX WARN: Type inference failed for: r0v302, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$19] */
    /* JADX WARN: Type inference failed for: r0v308, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$21] */
    /* JADX WARN: Type inference failed for: r0v314, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$23] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$55] */
    /* JADX WARN: Type inference failed for: r0v320, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$25] */
    /* JADX WARN: Type inference failed for: r0v327, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$24] */
    /* JADX WARN: Type inference failed for: r0v331, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$22] */
    /* JADX WARN: Type inference failed for: r0v335, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$20] */
    /* JADX WARN: Type inference failed for: r0v339, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$18] */
    /* JADX WARN: Type inference failed for: r0v343, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$16] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$69] */
    /* JADX WARN: Type inference failed for: r0v350, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$15] */
    /* JADX WARN: Type inference failed for: r0v354, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$13] */
    /* JADX WARN: Type inference failed for: r0v361, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$12] */
    /* JADX WARN: Type inference failed for: r0v365, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$10] */
    /* JADX WARN: Type inference failed for: r0v372, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$9] */
    /* JADX WARN: Type inference failed for: r0v376, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$2] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$70] */
    /* JADX WARN: Type inference failed for: r0v382, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$4] */
    /* JADX WARN: Type inference failed for: r0v389, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$3] */
    /* JADX WARN: Type inference failed for: r0v44, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$72] */
    /* JADX WARN: Type inference failed for: r0v51, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$71] */
    /* JADX WARN: Type inference failed for: r0v55, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$56] */
    /* JADX WARN: Type inference failed for: r0v61, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$59] */
    /* JADX WARN: Type inference failed for: r0v67, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$62] */
    /* JADX WARN: Type inference failed for: r0v73, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$64] */
    /* JADX WARN: Type inference failed for: r0v79, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$66] */
    /* JADX WARN: Type inference failed for: r0v85, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$68] */
    /* JADX WARN: Type inference failed for: r0v92, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$67] */
    /* JADX WARN: Type inference failed for: r0v96, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$65] */
    /* JADX WARN: Type inference failed for: r2v249, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$5] */
    /* JADX WARN: Type inference failed for: r2v255, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$6] */
    /* JADX WARN: Type inference failed for: r2v26, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$73] */
    /* JADX WARN: Type inference failed for: r2v32, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo$74] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemFuZhi1.block, 1).func_77973_b()) {
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.2
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.3
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) < 6.0d) {
                ItemStack _stack = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.4
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5);
                if (!_stack.func_77942_o()) {
                    _stack.func_77982_d(new NBTTagCompound());
                }
                _stack.func_77978_p().func_74780_a("类型", (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.5
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.6
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) + 1.0d);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.7
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemFuZhi2.block, 1).func_77973_b()) {
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.8
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.9
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 3.0d) {
                ItemStack _stack2 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.10
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5);
                if (!_stack2.func_77942_o()) {
                    _stack2.func_77982_d(new NBTTagCompound());
                }
                _stack2.func_77978_p().func_74780_a("类型", 4.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.11
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.12
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d) {
                ItemStack _stack3 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.13
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5);
                if (!_stack3.func_77942_o()) {
                    _stack3.func_77982_d(new NBTTagCompound());
                }
                _stack3.func_77978_p().func_74780_a("类型", 3.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.14
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.15
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d) {
                ItemStack _stack4 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.16
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5);
                if (!_stack4.func_77942_o()) {
                    _stack4.func_77982_d(new NBTTagCompound());
                }
                _stack4.func_77978_p().func_74780_a("类型", 2.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.17
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.18
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) != 1.0d) {
                if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.19
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.20
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) != 2.0d) {
                    if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.21
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.22
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) != 3.0d) {
                        if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.23
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.24
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) != 4.0d) {
                            ItemStack _stack5 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.25
                                public ItemStack getItemStack(BlockPos pos, int sltid) {
                                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                    if (func_175625_s instanceof TileEntityLockableLoot) {
                                        return func_175625_s.func_70301_a(sltid);
                                    }
                                    return ItemStack.field_190927_a;
                                }
                            }.getItemStack(new BlockPos(x, y, z), 5);
                            if (!_stack5.func_77942_o()) {
                                _stack5.func_77982_d(new NBTTagCompound());
                            }
                            _stack5.func_77978_p().func_74780_a("类型", 1.0d);
                        }
                    }
                }
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.26
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemFuZhi3.block, 1).func_77973_b()) {
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.27
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.28
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 5.0d) {
                ItemStack _stack6 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.29
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5);
                if (!_stack6.func_77942_o()) {
                    _stack6.func_77982_d(new NBTTagCompound());
                }
                _stack6.func_77978_p().func_74780_a("类型", 6.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.30
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.31
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 4.0d) {
                ItemStack _stack7 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.32
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5);
                if (!_stack7.func_77942_o()) {
                    _stack7.func_77982_d(new NBTTagCompound());
                }
                _stack7.func_77978_p().func_74780_a("类型", 5.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.33
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.34
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 3.0d) {
                ItemStack _stack8 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.35
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5);
                if (!_stack8.func_77942_o()) {
                    _stack8.func_77982_d(new NBTTagCompound());
                }
                _stack8.func_77978_p().func_74780_a("类型", 4.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.36
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.37
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d) {
                ItemStack _stack9 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.38
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5);
                if (!_stack9.func_77942_o()) {
                    _stack9.func_77982_d(new NBTTagCompound());
                }
                _stack9.func_77978_p().func_74780_a("类型", 3.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.39
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.40
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d) {
                ItemStack _stack10 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.41
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5);
                if (!_stack10.func_77942_o()) {
                    _stack10.func_77982_d(new NBTTagCompound());
                }
                _stack10.func_77978_p().func_74780_a("类型", 2.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.42
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.43
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) != 1.0d) {
                if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.44
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.45
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) != 2.0d) {
                    if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.46
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.47
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) != 3.0d) {
                        if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.48
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.49
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) != 4.0d) {
                            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.50
                                public ItemStack getItemStack(BlockPos pos, int sltid) {
                                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                    if (func_175625_s instanceof TileEntityLockableLoot) {
                                        return func_175625_s.func_70301_a(sltid);
                                    }
                                    return ItemStack.field_190927_a;
                                }
                            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.51
                                public ItemStack getItemStack(BlockPos pos, int sltid) {
                                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                    if (func_175625_s instanceof TileEntityLockableLoot) {
                                        return func_175625_s.func_70301_a(sltid);
                                    }
                                    return ItemStack.field_190927_a;
                                }
                            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) != 5.0d) {
                                if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.52
                                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                        if (func_175625_s instanceof TileEntityLockableLoot) {
                                            return func_175625_s.func_70301_a(sltid);
                                        }
                                        return ItemStack.field_190927_a;
                                    }
                                }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.53
                                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                        if (func_175625_s instanceof TileEntityLockableLoot) {
                                            return func_175625_s.func_70301_a(sltid);
                                        }
                                        return ItemStack.field_190927_a;
                                    }
                                }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) != 6.0d) {
                                    ItemStack _stack11 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.54
                                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                                return func_175625_s.func_70301_a(sltid);
                                            }
                                            return ItemStack.field_190927_a;
                                        }
                                    }.getItemStack(new BlockPos(x, y, z), 5);
                                    if (!_stack11.func_77942_o()) {
                                        _stack11.func_77982_d(new NBTTagCompound());
                                    }
                                    _stack11.func_77978_p().func_74780_a("类型", 1.0d);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.55
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemFuZhi4.block, 1).func_77973_b()) {
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.56
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.57
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d) {
                ItemStack _stack12 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.58
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5);
                if (!_stack12.func_77942_o()) {
                    _stack12.func_77982_d(new NBTTagCompound());
                }
                _stack12.func_77978_p().func_74780_a("类型", 3.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.59
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.60
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d) {
                ItemStack _stack13 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.61
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5);
                if (!_stack13.func_77942_o()) {
                    _stack13.func_77982_d(new NBTTagCompound());
                }
                _stack13.func_77978_p().func_74780_a("类型", 2.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.62
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.63
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) != 1.0d) {
                if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.64
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.65
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) != 2.0d) {
                    if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.66
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.67
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) != 3.0d) {
                        ItemStack _stack14 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.68
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 5);
                        if (!_stack14.func_77942_o()) {
                            _stack14.func_77982_d(new NBTTagCompound());
                        }
                        _stack14.func_77978_p().func_74780_a("类型", 1.0d);
                    }
                }
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.69
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemFuZhi5.block, 1).func_77973_b()) {
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.70
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.71
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) < 2.0d) {
                ItemStack _stack15 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.72
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5);
                if (!_stack15.func_77942_o()) {
                    _stack15.func_77982_d(new NBTTagCompound());
                }
                _stack15.func_77978_p().func_74780_a("类型", (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.73
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanZuo.74
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) + 1.0d);
            }
        }
    }
}
