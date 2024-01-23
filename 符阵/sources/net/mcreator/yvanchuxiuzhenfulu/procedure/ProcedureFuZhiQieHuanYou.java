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
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFuZhiQieHuanYou.class */
public class ProcedureFuZhiQieHuanYou extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFuZhiQieHuanYou(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 292);
    }

    /* JADX WARN: Type inference failed for: r0v101, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$58] */
    /* JADX WARN: Type inference failed for: r0v108, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$57] */
    /* JADX WARN: Type inference failed for: r0v112, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$55] */
    /* JADX WARN: Type inference failed for: r0v119, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$54] */
    /* JADX WARN: Type inference failed for: r0v123, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$34] */
    /* JADX WARN: Type inference failed for: r0v129, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$37] */
    /* JADX WARN: Type inference failed for: r0v135, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$40] */
    /* JADX WARN: Type inference failed for: r0v141, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$43] */
    /* JADX WARN: Type inference failed for: r0v147, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$46] */
    /* JADX WARN: Type inference failed for: r0v153, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$49] */
    /* JADX WARN: Type inference failed for: r0v159, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$51] */
    /* JADX WARN: Type inference failed for: r0v166, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$50] */
    /* JADX WARN: Type inference failed for: r0v170, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$48] */
    /* JADX WARN: Type inference failed for: r0v177, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$47] */
    /* JADX WARN: Type inference failed for: r0v181, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$45] */
    /* JADX WARN: Type inference failed for: r0v188, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$44] */
    /* JADX WARN: Type inference failed for: r0v192, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$42] */
    /* JADX WARN: Type inference failed for: r0v199, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$41] */
    /* JADX WARN: Type inference failed for: r0v203, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$39] */
    /* JADX WARN: Type inference failed for: r0v210, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$38] */
    /* JADX WARN: Type inference failed for: r0v214, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$36] */
    /* JADX WARN: Type inference failed for: r0v221, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$35] */
    /* JADX WARN: Type inference failed for: r0v225, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$21] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$1] */
    /* JADX WARN: Type inference failed for: r0v231, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$24] */
    /* JADX WARN: Type inference failed for: r0v237, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$27] */
    /* JADX WARN: Type inference failed for: r0v243, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$30] */
    /* JADX WARN: Type inference failed for: r0v249, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$32] */
    /* JADX WARN: Type inference failed for: r0v256, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$31] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$20] */
    /* JADX WARN: Type inference failed for: r0v260, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$29] */
    /* JADX WARN: Type inference failed for: r0v267, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$28] */
    /* JADX WARN: Type inference failed for: r0v271, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$26] */
    /* JADX WARN: Type inference failed for: r0v278, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$25] */
    /* JADX WARN: Type inference failed for: r0v282, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$23] */
    /* JADX WARN: Type inference failed for: r0v289, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$22] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$33] */
    /* JADX WARN: Type inference failed for: r0v293, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$2] */
    /* JADX WARN: Type inference failed for: r0v299, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$5] */
    /* JADX WARN: Type inference failed for: r0v305, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$8] */
    /* JADX WARN: Type inference failed for: r0v311, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$11] */
    /* JADX WARN: Type inference failed for: r0v317, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$14] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$52] */
    /* JADX WARN: Type inference failed for: r0v323, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$17] */
    /* JADX WARN: Type inference failed for: r0v329, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$19] */
    /* JADX WARN: Type inference failed for: r0v336, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$18] */
    /* JADX WARN: Type inference failed for: r0v340, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$16] */
    /* JADX WARN: Type inference failed for: r0v347, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$15] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$62] */
    /* JADX WARN: Type inference failed for: r0v351, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$13] */
    /* JADX WARN: Type inference failed for: r0v358, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$12] */
    /* JADX WARN: Type inference failed for: r0v362, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$10] */
    /* JADX WARN: Type inference failed for: r0v369, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$9] */
    /* JADX WARN: Type inference failed for: r0v373, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$7] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$63] */
    /* JADX WARN: Type inference failed for: r0v380, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$6] */
    /* JADX WARN: Type inference failed for: r0v384, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$4] */
    /* JADX WARN: Type inference failed for: r0v391, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$3] */
    /* JADX WARN: Type inference failed for: r0v44, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$66] */
    /* JADX WARN: Type inference failed for: r0v50, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$68] */
    /* JADX WARN: Type inference failed for: r0v57, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$67] */
    /* JADX WARN: Type inference failed for: r0v61, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$65] */
    /* JADX WARN: Type inference failed for: r0v68, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$64] */
    /* JADX WARN: Type inference failed for: r0v72, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$53] */
    /* JADX WARN: Type inference failed for: r0v78, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$56] */
    /* JADX WARN: Type inference failed for: r0v84, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$59] */
    /* JADX WARN: Type inference failed for: r0v90, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$61] */
    /* JADX WARN: Type inference failed for: r0v97, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou$60] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemFuZhi1.block, 1).func_77973_b()) {
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.2
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.3
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d) {
                ItemStack _stack = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.4
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
                _stack.func_77978_p().func_74780_a("类型", 0.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.5
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.6
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d) {
                ItemStack _stack2 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.7
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
                _stack2.func_77978_p().func_74780_a("类型", 1.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.8
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.9
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 3.0d) {
                ItemStack _stack3 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.10
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
                _stack3.func_77978_p().func_74780_a("类型", 2.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.11
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.12
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 4.0d) {
                ItemStack _stack4 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.13
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
                _stack4.func_77978_p().func_74780_a("类型", 3.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.14
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.15
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 5.0d) {
                ItemStack _stack5 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.16
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
                _stack5.func_77978_p().func_74780_a("类型", 4.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.17
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.18
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 6.0d) {
                ItemStack _stack6 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.19
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
                _stack6.func_77978_p().func_74780_a("类型", 5.0d);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.20
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemFuZhi2.block, 1).func_77973_b()) {
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.21
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.22
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d) {
                ItemStack _stack7 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.23
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
                _stack7.func_77978_p().func_74780_a("类型", 0.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.24
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.25
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d) {
                ItemStack _stack8 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.26
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
                _stack8.func_77978_p().func_74780_a("类型", 1.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.27
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.28
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 3.0d) {
                ItemStack _stack9 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.29
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
                _stack9.func_77978_p().func_74780_a("类型", 2.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.30
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.31
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 4.0d) {
                ItemStack _stack10 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.32
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
                _stack10.func_77978_p().func_74780_a("类型", 3.0d);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.33
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemFuZhi3.block, 1).func_77973_b()) {
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.34
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.35
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d) {
                ItemStack _stack11 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.36
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
                _stack11.func_77978_p().func_74780_a("类型", 0.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.37
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.38
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d) {
                ItemStack _stack12 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.39
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
                _stack12.func_77978_p().func_74780_a("类型", 1.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.40
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.41
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 3.0d) {
                ItemStack _stack13 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.42
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
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.43
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.44
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 4.0d) {
                ItemStack _stack14 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.45
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
                _stack14.func_77978_p().func_74780_a("类型", 3.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.46
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.47
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 5.0d) {
                ItemStack _stack15 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.48
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
                _stack15.func_77978_p().func_74780_a("类型", 4.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.49
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.50
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 6.0d) {
                ItemStack _stack16 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.51
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5);
                if (!_stack16.func_77942_o()) {
                    _stack16.func_77982_d(new NBTTagCompound());
                }
                _stack16.func_77978_p().func_74780_a("类型", 5.0d);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.52
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemFuZhi4.block, 1).func_77973_b()) {
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.53
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.54
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d) {
                ItemStack _stack17 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.55
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5);
                if (!_stack17.func_77942_o()) {
                    _stack17.func_77982_d(new NBTTagCompound());
                }
                _stack17.func_77978_p().func_74780_a("类型", 0.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.56
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.57
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d) {
                ItemStack _stack18 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.58
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5);
                if (!_stack18.func_77942_o()) {
                    _stack18.func_77982_d(new NBTTagCompound());
                }
                _stack18.func_77978_p().func_74780_a("类型", 1.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.59
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.60
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 3.0d) {
                ItemStack _stack19 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.61
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5);
                if (!_stack19.func_77942_o()) {
                    _stack19.func_77982_d(new NBTTagCompound());
                }
                _stack19.func_77978_p().func_74780_a("类型", 2.0d);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.62
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(ItemFuZhi5.block, 1).func_77973_b()) {
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.63
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.64
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d) {
                ItemStack _stack20 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.65
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5);
                if (!_stack20.func_77942_o()) {
                    _stack20.func_77982_d(new NBTTagCompound());
                }
                _stack20.func_77978_p().func_74780_a("类型", 0.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.66
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.67
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 5).func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d) {
                ItemStack _stack21 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFuZhiQieHuanYou.68
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5);
                if (!_stack21.func_77942_o()) {
                    _stack21.func_77982_d(new NBTTagCompound());
                }
                _stack21.func_77978_p().func_74780_a("类型", 1.0d);
            }
        }
    }
}
