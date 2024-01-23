package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureBenMingJinJie1.class */
public class ProcedureBenMingJinJie1 extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureBenMingJinJie1(ElementsFabaokuozhanMod instance) {
        super(instance, 496);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1$1] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1$3] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1$4] */
    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1$5] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1$6] */
    /* JADX WARN: Type inference failed for: r0v53, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1$7] */
    /* JADX WARN: Type inference failed for: r0v59, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1$8] */
    /* JADX WARN: Type inference failed for: r0v65, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1$9] */
    /* JADX WARN: Type inference failed for: r0v71, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1$10] */
    /* JADX WARN: Type inference failed for: r0v77, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1$11] */
    /* JADX WARN: Type inference failed for: r0v92, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1.2
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77978_p().func_74769_h("本命阶段") : -1.0d) == 1.0d) {
            ItemStack _stack = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1.3
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0);
            if (!_stack.func_77942_o()) {
                _stack.func_77982_d(new NBTTagCompound());
            }
            _stack.func_77978_p().func_74780_a("随机攻击小", 2268.0d);
            ItemStack _stack2 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1.4
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0);
            if (!_stack2.func_77942_o()) {
                _stack2.func_77982_d(new NBTTagCompound());
            }
            _stack2.func_77978_p().func_74780_a("随机攻击大", 3000.0d);
            ItemStack _stack3 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1.5
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0);
            if (!_stack3.func_77942_o()) {
                _stack3.func_77982_d(new NBTTagCompound());
            }
            _stack3.func_77978_p().func_74780_a("真元消耗", 224.0d);
            ItemStack _stack4 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1.6
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0);
            if (!_stack4.func_77942_o()) {
                _stack4.func_77982_d(new NBTTagCompound());
            }
            _stack4.func_77978_p().func_74780_a("灵力消耗", 5600.0d);
            ItemStack _stack5 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1.7
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0);
            if (!_stack5.func_77942_o()) {
                _stack5.func_77982_d(new NBTTagCompound());
            }
            _stack5.func_77978_p().func_74780_a("威能伤害", 14875.0d);
            ItemStack _stack6 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1.8
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0);
            if (!_stack6.func_77942_o()) {
                _stack6.func_77982_d(new NBTTagCompound());
            }
            _stack6.func_77978_p().func_74780_a("物攻增幅", 0.2d);
            ItemStack _stack7 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1.9
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0);
            if (!_stack7.func_77942_o()) {
                _stack7.func_77982_d(new NBTTagCompound());
            }
            _stack7.func_77978_p().func_74780_a("普攻灵力", 516.0d);
            ItemStack _stack8 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1.10
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0);
            if (!_stack8.func_77942_o()) {
                _stack8.func_77982_d(new NBTTagCompound());
            }
            _stack8.func_77978_p().func_74780_a("普攻真元", 102.0d);
            ItemStack _stack9 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingJinJie1.11
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0);
            if (!_stack9.func_77942_o()) {
                _stack9.func_77982_d(new NBTTagCompound());
            }
            _stack9.func_77978_p().func_74778_a("境界", "§d化神期本命法宝");
        }
    }
}
