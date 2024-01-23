package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemCloudMapCharm;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemCloudMapCharm2;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemCloudMapCharm3;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemCloudMapCharm4;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemCloudMapCharm5;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFeiJianFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFeiXingFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu02;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu03;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu04;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu05;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu08;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu11;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu13;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu2401;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu25;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFulu26;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemHanDiFuBao;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemHanDiZhenBao;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemHuDunFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemHunDunJianShiFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemHuoDanFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemJuFengFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemKongTiFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemLeiJiFuBao;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemLiuHuoFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemRanShanFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemTieJiaFu;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemWuLiangDunFuBao;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemZhaoMingFu;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureHuaFuJieSuan.class */
public class ProcedureHuaFuJieSuan extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHuaFuJieSuan(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 298);
    }

    /* JADX WARN: Type inference failed for: r0v100, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$60] */
    /* JADX WARN: Type inference failed for: r0v103, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$61] */
    /* JADX WARN: Type inference failed for: r0v106, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$62] */
    /* JADX WARN: Type inference failed for: r0v109, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$63] */
    /* JADX WARN: Type inference failed for: r0v112, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$64] */
    /* JADX WARN: Type inference failed for: r0v115, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$65] */
    /* JADX WARN: Type inference failed for: r0v275, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$52] */
    /* JADX WARN: Type inference failed for: r0v278, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$53] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$1] */
    /* JADX WARN: Type inference failed for: r0v289, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$46] */
    /* JADX WARN: Type inference failed for: r0v292, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$50] */
    /* JADX WARN: Type inference failed for: r0v297, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$47] */
    /* JADX WARN: Type inference failed for: r0v303, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$48] */
    /* JADX WARN: Type inference failed for: r0v309, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$49] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$4] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$7] */
    /* JADX WARN: Type inference failed for: r0v342, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$41] */
    /* JADX WARN: Type inference failed for: r0v345, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$42] */
    /* JADX WARN: Type inference failed for: r0v356, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$38] */
    /* JADX WARN: Type inference failed for: r0v359, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$39] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$10] */
    /* JADX WARN: Type inference failed for: r0v370, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$35] */
    /* JADX WARN: Type inference failed for: r0v373, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$36] */
    /* JADX WARN: Type inference failed for: r0v384, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$32] */
    /* JADX WARN: Type inference failed for: r0v387, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$33] */
    /* JADX WARN: Type inference failed for: r0v398, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$29] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$13] */
    /* JADX WARN: Type inference failed for: r0v401, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$30] */
    /* JADX WARN: Type inference failed for: r0v412, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$26] */
    /* JADX WARN: Type inference failed for: r0v415, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$27] */
    /* JADX WARN: Type inference failed for: r0v426, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$23] */
    /* JADX WARN: Type inference failed for: r0v429, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$24] */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$16] */
    /* JADX WARN: Type inference failed for: r0v440, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$20] */
    /* JADX WARN: Type inference failed for: r0v443, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$21] */
    /* JADX WARN: Type inference failed for: r0v454, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$17] */
    /* JADX WARN: Type inference failed for: r0v457, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$18] */
    /* JADX WARN: Type inference failed for: r0v46, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$19] */
    /* JADX WARN: Type inference failed for: r0v468, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$14] */
    /* JADX WARN: Type inference failed for: r0v471, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$15] */
    /* JADX WARN: Type inference failed for: r0v482, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$11] */
    /* JADX WARN: Type inference failed for: r0v485, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$12] */
    /* JADX WARN: Type inference failed for: r0v49, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$22] */
    /* JADX WARN: Type inference failed for: r0v496, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$8] */
    /* JADX WARN: Type inference failed for: r0v499, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$9] */
    /* JADX WARN: Type inference failed for: r0v510, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$5] */
    /* JADX WARN: Type inference failed for: r0v513, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$6] */
    /* JADX WARN: Type inference failed for: r0v52, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$25] */
    /* JADX WARN: Type inference failed for: r0v524, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$2] */
    /* JADX WARN: Type inference failed for: r0v527, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$3] */
    /* JADX WARN: Type inference failed for: r0v55, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$28] */
    /* JADX WARN: Type inference failed for: r0v58, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$31] */
    /* JADX WARN: Type inference failed for: r0v61, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$34] */
    /* JADX WARN: Type inference failed for: r0v64, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$37] */
    /* JADX WARN: Type inference failed for: r0v67, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$40] */
    /* JADX WARN: Type inference failed for: r0v70, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$43] */
    /* JADX WARN: Type inference failed for: r0v73, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$44] */
    /* JADX WARN: Type inference failed for: r0v76, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$45] */
    /* JADX WARN: Type inference failed for: r0v79, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$51] */
    /* JADX WARN: Type inference failed for: r0v82, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$54] */
    /* JADX WARN: Type inference failed for: r0v85, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$55] */
    /* JADX WARN: Type inference failed for: r0v88, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$56] */
    /* JADX WARN: Type inference failed for: r0v91, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$57] */
    /* JADX WARN: Type inference failed for: r0v94, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$58] */
    /* JADX WARN: Type inference failed for: r0v97, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$59] */
    /* JADX WARN: Type inference failed for: r3v33, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$69] */
    /* JADX WARN: Type inference failed for: r3v45, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$67] */
    /* JADX WARN: Type inference failed for: r4v34, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan$70] */
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
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 11.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.2
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s15 = world.func_175625_s(pos);
                    if (func_175625_s15 instanceof TileEntityLockableLoot) {
                        return func_175625_s15.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s15 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s15 != null && (func_175625_s15 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack = new ItemStack(ItemFulu02.block, 1);
                    _setstack.func_190920_e(1);
                    func_175625_s15.func_70299_a(6, _setstack);
                }
            } else {
                new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.3
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
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.4
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 12.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.5
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s16 = world.func_175625_s(pos);
                    if (func_175625_s16 instanceof TileEntityLockableLoot) {
                        return func_175625_s16.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s16 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s16 != null && (func_175625_s16 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack2 = new ItemStack(ItemFulu03.block, 1);
                    _setstack2.func_190920_e(1);
                    func_175625_s16.func_70299_a(6, _setstack2);
                }
            } else {
                new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.6
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s17 = world.func_175625_s(pos);
                        if (func_175625_s17 instanceof TileEntityLockableLoot) {
                            return func_175625_s17.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.7
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 13.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.8
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s17 = world.func_175625_s(pos);
                    if (func_175625_s17 instanceof TileEntityLockableLoot) {
                        return func_175625_s17.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s17 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s17 != null && (func_175625_s17 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack3 = new ItemStack(ItemFulu04.block, 1);
                    _setstack3.func_190920_e(1);
                    func_175625_s17.func_70299_a(6, _setstack3);
                }
            } else {
                new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.9
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s18 = world.func_175625_s(pos);
                        if (func_175625_s18 instanceof TileEntityLockableLoot) {
                            return func_175625_s18.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.10
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 14.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.11
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s18 = world.func_175625_s(pos);
                    if (func_175625_s18 instanceof TileEntityLockableLoot) {
                        return func_175625_s18.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s18 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s18 != null && (func_175625_s18 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack4 = new ItemStack(ItemFulu2401.block, 1);
                    _setstack4.func_190920_e(1);
                    func_175625_s18.func_70299_a(6, _setstack4);
                }
            } else {
                new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.12
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
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.13
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 15.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.14
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s19 = world.func_175625_s(pos);
                    if (func_175625_s19 instanceof TileEntityLockableLoot) {
                        return func_175625_s19.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s19 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s19 != null && (func_175625_s19 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack5 = new ItemStack(ItemZhaoMingFu.block, 1);
                    _setstack5.func_190920_e(1);
                    func_175625_s19.func_70299_a(6, _setstack5);
                }
            } else {
                new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.15
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s20 = world.func_175625_s(pos);
                        if (func_175625_s20 instanceof TileEntityLockableLoot) {
                            return func_175625_s20.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.16
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 16.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.17
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s20 = world.func_175625_s(pos);
                    if (func_175625_s20 instanceof TileEntityLockableLoot) {
                        return func_175625_s20.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s20 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s20 != null && (func_175625_s20 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack6 = new ItemStack(ItemHuoDanFu.block, 1);
                    _setstack6.func_190920_e(1);
                    func_175625_s20.func_70299_a(6, _setstack6);
                }
            } else {
                new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.18
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s21 = world.func_175625_s(pos);
                        if (func_175625_s21 instanceof TileEntityLockableLoot) {
                            return func_175625_s21.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.19
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 17.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.20
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s21 = world.func_175625_s(pos);
                    if (func_175625_s21 instanceof TileEntityLockableLoot) {
                        return func_175625_s21.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s21 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s21 != null && (func_175625_s21 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack7 = new ItemStack(ItemKongTiFu.block, 1);
                    _setstack7.func_190920_e(1);
                    func_175625_s21.func_70299_a(6, _setstack7);
                }
            } else {
                new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.21
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s22 = world.func_175625_s(pos);
                        if (func_175625_s22 instanceof TileEntityLockableLoot) {
                            return func_175625_s22.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.22
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 21.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.23
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s22 = world.func_175625_s(pos);
                    if (func_175625_s22 instanceof TileEntityLockableLoot) {
                        return func_175625_s22.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s22 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s22 != null && (func_175625_s22 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack8 = new ItemStack(ItemFulu26.block, 1);
                    _setstack8.func_190920_e(1);
                    func_175625_s22.func_70299_a(6, _setstack8);
                }
            } else {
                new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.24
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s23 = world.func_175625_s(pos);
                        if (func_175625_s23 instanceof TileEntityLockableLoot) {
                            return func_175625_s23.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.25
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 22.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.26
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s23 = world.func_175625_s(pos);
                    if (func_175625_s23 instanceof TileEntityLockableLoot) {
                        return func_175625_s23.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s23 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s23 != null && (func_175625_s23 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack9 = new ItemStack(ItemHuDunFu.block, 1);
                    _setstack9.func_190920_e(1);
                    func_175625_s23.func_70299_a(6, _setstack9);
                }
            } else {
                new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.27
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s24 = world.func_175625_s(pos);
                        if (func_175625_s24 instanceof TileEntityLockableLoot) {
                            return func_175625_s24.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.28
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 23.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.29
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s24 = world.func_175625_s(pos);
                    if (func_175625_s24 instanceof TileEntityLockableLoot) {
                        return func_175625_s24.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s24 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s24 != null && (func_175625_s24 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack10 = new ItemStack(ItemFulu05.block, 1);
                    _setstack10.func_190920_e(1);
                    func_175625_s24.func_70299_a(6, _setstack10);
                }
            } else {
                new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.30
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s25 = world.func_175625_s(pos);
                        if (func_175625_s25 instanceof TileEntityLockableLoot) {
                            return func_175625_s25.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.31
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 24.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.32
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s25 = world.func_175625_s(pos);
                    if (func_175625_s25 instanceof TileEntityLockableLoot) {
                        return func_175625_s25.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s25 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s25 != null && (func_175625_s25 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack11 = new ItemStack(ItemFulu11.block, 1);
                    _setstack11.func_190920_e(1);
                    func_175625_s25.func_70299_a(6, _setstack11);
                }
            } else {
                new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.33
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s26 = world.func_175625_s(pos);
                        if (func_175625_s26 instanceof TileEntityLockableLoot) {
                            return func_175625_s26.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.34
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 31.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.35
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s26 = world.func_175625_s(pos);
                    if (func_175625_s26 instanceof TileEntityLockableLoot) {
                        return func_175625_s26.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s26 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s26 != null && (func_175625_s26 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack12 = new ItemStack(ItemFulu25.block, 1);
                    _setstack12.func_190920_e(1);
                    func_175625_s26.func_70299_a(6, _setstack12);
                }
            } else {
                new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.36
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s27 = world.func_175625_s(pos);
                        if (func_175625_s27 instanceof TileEntityLockableLoot) {
                            return func_175625_s27.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.37
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 32.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.38
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s27 = world.func_175625_s(pos);
                    if (func_175625_s27 instanceof TileEntityLockableLoot) {
                        return func_175625_s27.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s27 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s27 != null && (func_175625_s27 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack13 = new ItemStack(ItemFulu08.block, 1);
                    _setstack13.func_190920_e(1);
                    func_175625_s27.func_70299_a(6, _setstack13);
                }
            } else {
                new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.39
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s28 = world.func_175625_s(pos);
                        if (func_175625_s28 instanceof TileEntityLockableLoot) {
                            return func_175625_s28.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.40
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 33.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.41
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s28 = world.func_175625_s(pos);
                    if (func_175625_s28 instanceof TileEntityLockableLoot) {
                        return func_175625_s28.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s28 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s28 != null && (func_175625_s28 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack14 = new ItemStack(ItemFeiXingFu.block, 1);
                    _setstack14.func_190920_e(1);
                    func_175625_s28.func_70299_a(6, _setstack14);
                }
            } else {
                new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.42
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s29 = world.func_175625_s(pos);
                        if (func_175625_s29 instanceof TileEntityLockableLoot) {
                            return func_175625_s29.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.43
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 34.0d && (func_175625_s14 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s14 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack15 = new ItemStack(ItemFeiJianFu.block, 1);
            _setstack15.func_190920_e(1);
            func_175625_s14.func_70299_a(6, _setstack15);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.44
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 35.0d && (func_175625_s13 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s13 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack16 = new ItemStack(ItemJuFengFu.block, 1);
            _setstack16.func_190920_e(1);
            func_175625_s13.func_70299_a(6, _setstack16);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.45
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 36.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.46
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s29 = world.func_175625_s(pos);
                    if (func_175625_s29 instanceof TileEntityLockableLoot) {
                        return func_175625_s29.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s29 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s29 != null && (func_175625_s29 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack17 = new ItemStack(ItemTieJiaFu.block, 1);
                    _setstack17.func_190920_e(1);
                    func_175625_s29.func_70299_a(6, _setstack17);
                }
                ItemStack _stack = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.47
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s30 = world.func_175625_s(pos);
                        if (func_175625_s30 instanceof TileEntityLockableLoot) {
                            return func_175625_s30.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6);
                if (!_stack.func_77942_o()) {
                    _stack.func_77982_d(new NBTTagCompound());
                }
                _stack.func_77978_p().func_74780_a("Attack", entityLivingBase.getEntityData().func_74769_h("Attack"));
                ItemStack _stack2 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.48
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s30 = world.func_175625_s(pos);
                        if (func_175625_s30 instanceof TileEntityLockableLoot) {
                            return func_175625_s30.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6);
                if (!_stack2.func_77942_o()) {
                    _stack2.func_77982_d(new NBTTagCompound());
                }
                _stack2.func_77978_p().func_74780_a("defense", entityLivingBase.getEntityData().func_74769_h("Defense"));
                ItemStack _stack3 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.49
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s30 = world.func_175625_s(pos);
                        if (func_175625_s30 instanceof TileEntityLockableLoot) {
                            return func_175625_s30.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6);
                if (!_stack3.func_77942_o()) {
                    _stack3.func_77982_d(new NBTTagCompound());
                }
                _stack3.func_77978_p().func_74780_a("生命值", entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f);
            } else {
                new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.50
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s30 = world.func_175625_s(pos);
                        if (func_175625_s30 instanceof TileEntityLockableLoot) {
                            return func_175625_s30.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.51
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 41.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.52
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s30 = world.func_175625_s(pos);
                    if (func_175625_s30 instanceof TileEntityLockableLoot) {
                        return func_175625_s30.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s30 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s30 != null && (func_175625_s30 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack18 = new ItemStack(ItemFulu13.block, 1);
                    _setstack18.func_190920_e(1);
                    func_175625_s30.func_70299_a(6, _setstack18);
                }
            } else {
                new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.53
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s31 = world.func_175625_s(pos);
                        if (func_175625_s31 instanceof TileEntityLockableLoot) {
                            return func_175625_s31.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.54
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 42.0d && (func_175625_s12 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s12 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack19 = new ItemStack(ItemRanShanFu.block, 1);
            _setstack19.func_190920_e(1);
            func_175625_s12.func_70299_a(6, _setstack19);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.55
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 43.0d && (func_175625_s11 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s11 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack20 = new ItemStack(ItemLiuHuoFu.block, 1);
            _setstack20.func_190920_e(1);
            func_175625_s11.func_70299_a(6, _setstack20);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.56
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 51.0d && (func_175625_s10 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s10 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack21 = new ItemStack(ItemHanDiZhenBao.block, 1);
            _setstack21.func_190920_e(1);
            func_175625_s10.func_70299_a(6, _setstack21);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.57
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 52.0d && (func_175625_s9 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s9 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack22 = new ItemStack(ItemLeiJiFuBao.block, 1);
            _setstack22.func_190920_e(1);
            func_175625_s9.func_70299_a(6, _setstack22);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.58
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 53.0d && (func_175625_s8 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s8 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack23 = new ItemStack(ItemWuLiangDunFuBao.block, 1);
            _setstack23.func_190920_e(1);
            func_175625_s8.func_70299_a(6, _setstack23);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.59
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 54.0d && (func_175625_s7 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s7 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack24 = new ItemStack(ItemHanDiFuBao.block, 1);
            _setstack24.func_190920_e(1);
            func_175625_s7.func_70299_a(6, _setstack24);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.60
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 55.0d && (func_175625_s6 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s6 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack25 = new ItemStack(ItemHunDunJianShiFu.block, 1);
            _setstack25.func_190920_e(1);
            func_175625_s6.func_70299_a(6, _setstack25);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.61
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 101.0d && (func_175625_s5 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s5 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack26 = new ItemStack(ItemCloudMapCharm.block, 1);
            _setstack26.func_190920_e(1);
            func_175625_s5.func_70299_a(6, _setstack26);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.62
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 102.0d && (func_175625_s4 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s4 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack27 = new ItemStack(ItemCloudMapCharm2.block, 1);
            _setstack27.func_190920_e(1);
            func_175625_s4.func_70299_a(6, _setstack27);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.63
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 103.0d && (func_175625_s3 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s3 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack28 = new ItemStack(ItemCloudMapCharm3.block, 1);
            _setstack28.func_190920_e(1);
            func_175625_s3.func_70299_a(6, _setstack28);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.64
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 104.0d && (func_175625_s2 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s2 instanceof TileEntityLockableLoot)) {
            ItemStack _setstack29 = new ItemStack(ItemCloudMapCharm4.block, 1);
            _setstack29.func_190920_e(1);
            func_175625_s2.func_70299_a(6, _setstack29);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.65
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 105.0d && (func_175625_s = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s instanceof TileEntityLockableLoot)) {
            ItemStack _setstack30 = new ItemStack(ItemCloudMapCharm5.block, 1);
            _setstack30.func_190920_e(1);
            func_175625_s.func_70299_a(6, _setstack30);
        }
        if (!world.field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = world.func_175625_s(_bp);
            IBlockState _bs = world.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74757_a("kaishi", false);
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (!world.field_72995_K) {
            BlockPos _bp2 = new BlockPos(x, y, z);
            TileEntity _tileEntity2 = world.func_175625_s(_bp2);
            IBlockState _bs2 = world.func_180495_p(_bp2);
            if (_tileEntity2 != null) {
                _tileEntity2.getTileData().func_74780_a("leixing", 0.0d);
            }
            world.func_184138_a(_bp2, _bs2, _bs2, 3);
        }
        if (!world.field_72995_K) {
            BlockPos _bp3 = new BlockPos(x, y, z);
            TileEntity _tileEntity3 = world.func_175625_s(_bp3);
            IBlockState _bs3 = world.func_180495_p(_bp3);
            if (_tileEntity3 != null) {
                _tileEntity3.getTileData().func_74757_a("法宝", false);
            }
            world.func_184138_a(_bp3, _bs3, _bs3, 3);
        }
        if (!world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.66
                public String func_70005_c_() {
                    return "";
                }

                public boolean func_70003_b(int permission, String command) {
                    return true;
                }

                public World func_130014_f_() {
                    return world;
                }

                public MinecraftServer func_184102_h() {
                    return world.func_73046_m();
                }

                public boolean func_174792_t_() {
                    return false;
                }

                public BlockPos func_180425_c() {
                    return new BlockPos(x, y, z);
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(x, y, z);
                }
            }, "scoreboard players set " + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.67
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者") + " 经验开关 1");
        }
        if (!world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.68
                public String func_70005_c_() {
                    return "";
                }

                public boolean func_70003_b(int permission, String command) {
                    return true;
                }

                public World func_130014_f_() {
                    return world;
                }

                public MinecraftServer func_184102_h() {
                    return world.func_73046_m();
                }

                public boolean func_174792_t_() {
                    return false;
                }

                public BlockPos func_180425_c() {
                    return new BlockPos(x, y, z);
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(x, y, z);
                }
            }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.69
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "炼制者") + "] ~ ~ ~ yuanchuxp fulu " + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaFuJieSuan.70
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "fulujingyan") * 3.0d) + "\",CustomNameVisible:0b}");
        }
    }
}
