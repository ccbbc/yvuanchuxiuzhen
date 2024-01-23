package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureZsbGuiReplaceItem.class */
public class ProcedureZsbGuiReplaceItem extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZsbGuiReplaceItem(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 557);
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$2] */
    /* JADX WARN: Type inference failed for: r0v33, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$5] */
    /* JADX WARN: Type inference failed for: r0v39, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$8] */
    /* JADX WARN: Type inference failed for: r0v45, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$11] */
    /* JADX WARN: Type inference failed for: r0v54, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$15] */
    /* JADX WARN: Type inference failed for: r0v60, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$16] */
    /* JADX WARN: Type inference failed for: r0v66, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$21] */
    /* JADX WARN: Type inference failed for: r0v82, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$14] */
    /* JADX WARN: Type inference failed for: r2v12, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$6] */
    /* JADX WARN: Type inference failed for: r2v20, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$9] */
    /* JADX WARN: Type inference failed for: r2v28, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$12] */
    /* JADX WARN: Type inference failed for: r2v4, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$3] */
    /* JADX WARN: Type inference failed for: r2v48, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$17] */
    /* JADX WARN: Type inference failed for: r2v56, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$20] */
    /* JADX WARN: Type inference failed for: r2v63, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$18] */
    /* JADX WARN: Type inference failed for: r2v73, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$13] */
    /* JADX WARN: Type inference failed for: r2v78, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$10] */
    /* JADX WARN: Type inference failed for: r2v83, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$7] */
    /* JADX WARN: Type inference failed for: r2v88, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$4] */
    /* JADX WARN: Type inference failed for: r4v48, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$1] */
    /* JADX WARN: Type inference failed for: r6v7, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem$19] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        Calendar cal = Calendar.getInstance();
        TileEntityLockableLoot func_175625_s = world.func_175625_s(new BlockPos(x, y, z));
        if (func_175625_s != null && (func_175625_s instanceof TileEntityLockableLoot)) {
            ItemStack _setstack = new ItemStack(Item.func_111206_d("yvanchuxiuzhen:sect_token_" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.1
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "SectJobLevel"))), 1);
            _setstack.func_190920_e(1);
            func_175625_s.func_70299_a(2, _setstack);
        }
        ItemStack _stack = new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.2
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                if (func_175625_s2 instanceof TileEntityLockableLoot) {
                    return func_175625_s2.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2);
        if (!_stack.func_77942_o()) {
            _stack.func_77982_d(new NBTTagCompound());
        }
        _stack.func_77978_p().func_74778_a("Master", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.3
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                if (func_175625_s2 instanceof TileEntityLockableLoot) {
                    return func_175625_s2.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.4
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                if (func_175625_s2 instanceof TileEntityLockableLoot) {
                    return func_175625_s2.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("Master") : "");
        ItemStack _stack2 = new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.5
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                if (func_175625_s2 instanceof TileEntityLockableLoot) {
                    return func_175625_s2.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2);
        if (!_stack2.func_77942_o()) {
            _stack2.func_77982_d(new NBTTagCompound());
        }
        _stack2.func_77978_p().func_74778_a("SectMaster", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.6
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                if (func_175625_s2 instanceof TileEntityLockableLoot) {
                    return func_175625_s2.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.7
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                if (func_175625_s2 instanceof TileEntityLockableLoot) {
                    return func_175625_s2.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("SectMaster") : "");
        ItemStack _stack3 = new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.8
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                if (func_175625_s2 instanceof TileEntityLockableLoot) {
                    return func_175625_s2.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2);
        if (!_stack3.func_77942_o()) {
            _stack3.func_77982_d(new NBTTagCompound());
        }
        _stack3.func_77978_p().func_74780_a("SectLevel", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.9
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                if (func_175625_s2 instanceof TileEntityLockableLoot) {
                    return func_175625_s2.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.10
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                if (func_175625_s2 instanceof TileEntityLockableLoot) {
                    return func_175625_s2.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("SectLevel") : -1.0d);
        ItemStack _stack4 = new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.11
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                if (func_175625_s2 instanceof TileEntityLockableLoot) {
                    return func_175625_s2.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 2);
        if (!_stack4.func_77942_o()) {
            _stack4.func_77982_d(new NBTTagCompound());
        }
        _stack4.func_77978_p().func_74780_a("SectJobLevel", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.12
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                if (func_175625_s2 instanceof TileEntityLockableLoot) {
                    return func_175625_s2.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.13
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                if (func_175625_s2 instanceof TileEntityLockableLoot) {
                    return func_175625_s2.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("SectJobLevel") : -1.0d);
        TileEntityLockableLoot func_175625_s2 = world.func_175625_s(new BlockPos(x, y, z));
        if (func_175625_s2 != null && (func_175625_s2 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack2 = new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.14
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                    if (func_175625_s3 instanceof TileEntityLockableLoot) {
                        return func_175625_s3.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 2).func_77946_l();
            _setstack2.func_190920_e(1);
            func_175625_s2.func_70299_a(1, _setstack2);
        }
        ItemStack _stack5 = new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.15
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                if (func_175625_s3 instanceof TileEntityLockableLoot) {
                    return func_175625_s3.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1);
        if (!_stack5.func_77942_o()) {
            _stack5.func_77982_d(new NBTTagCompound());
        }
        _stack5.func_77978_p().func_74757_a("SectJobGetCool", true);
        ItemStack _stack6 = new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.16
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                if (func_175625_s3 instanceof TileEntityLockableLoot) {
                    return func_175625_s3.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1);
        if (!_stack6.func_77942_o()) {
            _stack6.func_77982_d(new NBTTagCompound());
        }
        _stack6.func_77978_p().func_74780_a("SectJobGetCoolTime", cal.get(5));
        new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.21
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                if (func_175625_s3 instanceof TileEntityLockableLoot) {
                    return func_175625_s3.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_151001_c((new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.17
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                if (func_175625_s3 instanceof TileEntityLockableLoot) {
                    return func_175625_s3.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.18
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                if (func_175625_s3 instanceof TileEntityLockableLoot) {
                    return func_175625_s3.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("Master") : "") + "的" + new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.20
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "SectJobName" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZsbGuiReplaceItem.19
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "SectJobLevel"))) + "令牌");
        TileEntityLockableLoot func_175625_s3 = world.func_175625_s(new BlockPos(x, y, z));
        if (func_175625_s3 != null && (func_175625_s3 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack3 = new ItemStack(Blocks.field_150350_a, 1);
            _setstack3.func_190920_e(1);
            func_175625_s3.func_70299_a(2, _setstack3);
        }
    }
}
