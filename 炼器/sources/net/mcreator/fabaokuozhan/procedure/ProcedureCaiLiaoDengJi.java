package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemBlackIron;
import net.mcreator.fabaokuozhan.item.ItemGengGold;
import net.mcreator.fabaokuozhan.item.ItemGoldRefined;
import net.mcreator.fabaokuozhan.item.ItemIronMother;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureCaiLiaoDengJi.class */
public class ProcedureCaiLiaoDengJi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCaiLiaoDengJi(ElementsFabaokuozhanMod instance) {
        super(instance, 554);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoDengJi$1] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoDengJi$3] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoDengJi$5] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoDengJi$7] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoDengJi$8] */
    /* JADX WARN: Type inference failed for: r0v42, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoDengJi$6] */
    /* JADX WARN: Type inference failed for: r0v49, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoDengJi$4] */
    /* JADX WARN: Type inference failed for: r0v56, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoDengJi$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoDengJi.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemIronMother.block, 1).func_77973_b()) {
            ItemStack _stack = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoDengJi.2
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1);
            if (!_stack.func_77942_o()) {
                _stack.func_77982_d(new NBTTagCompound());
            }
            _stack.func_77978_p().func_74780_a("材料等级", 2.0d);
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoDengJi.3
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemBlackIron.block, 1).func_77973_b()) {
            ItemStack _stack2 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoDengJi.4
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1);
            if (!_stack2.func_77942_o()) {
                _stack2.func_77982_d(new NBTTagCompound());
            }
            _stack2.func_77978_p().func_74780_a("材料等级", 3.0d);
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoDengJi.5
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemGoldRefined.block, 1).func_77973_b()) {
            ItemStack _stack3 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoDengJi.6
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1);
            if (!_stack3.func_77942_o()) {
                _stack3.func_77982_d(new NBTTagCompound());
            }
            _stack3.func_77978_p().func_74780_a("材料等级", 4.0d);
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoDengJi.7
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemGengGold.block, 1).func_77973_b()) {
            ItemStack _stack4 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoDengJi.8
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1);
            if (!_stack4.func_77942_o()) {
                _stack4.func_77982_d(new NBTTagCompound());
            }
            _stack4.func_77978_p().func_74780_a("材料等级", 5.0d);
        }
    }
}
