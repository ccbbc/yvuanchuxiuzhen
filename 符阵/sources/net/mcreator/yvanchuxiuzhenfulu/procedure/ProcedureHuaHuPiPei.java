package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemCloudMapCharm;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemCloudMapCharm2;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemCloudMapCharm3;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemCloudMapCharm4;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuBi1;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuBi2;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuBi3;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuBi4;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuBi5;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuZhi1;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuZhi2;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuZhi3;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuZhi4;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuZhi5;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureHuaHuPiPei.class */
public class ProcedureHuaHuPiPei extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHuaHuPiPei(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 296);
    }

    /* JADX WARN: Type inference failed for: r0v101, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$103] */
    /* JADX WARN: Type inference failed for: r0v1048, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$45] */
    /* JADX WARN: Type inference failed for: r0v1096, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$43] */
    /* JADX WARN: Type inference failed for: r0v111, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$104] */
    /* JADX WARN: Type inference failed for: r0v114, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$105] */
    /* JADX WARN: Type inference failed for: r0v1144, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$41] */
    /* JADX WARN: Type inference failed for: r0v1192, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$39] */
    /* JADX WARN: Type inference failed for: r0v1240, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$37] */
    /* JADX WARN: Type inference failed for: r0v1244, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$35] */
    /* JADX WARN: Type inference failed for: r0v1254, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$20] */
    /* JADX WARN: Type inference failed for: r0v1268, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$22] */
    /* JADX WARN: Type inference failed for: r0v1274, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$24] */
    /* JADX WARN: Type inference failed for: r0v1280, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$26] */
    /* JADX WARN: Type inference failed for: r0v1286, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$28] */
    /* JADX WARN: Type inference failed for: r0v1292, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$30] */
    /* JADX WARN: Type inference failed for: r0v1302, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$31] */
    /* JADX WARN: Type inference failed for: r0v1305, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$32] */
    /* JADX WARN: Type inference failed for: r0v1396, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$29] */
    /* JADX WARN: Type inference failed for: r0v1444, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$27] */
    /* JADX WARN: Type inference failed for: r0v1492, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$25] */
    /* JADX WARN: Type inference failed for: r0v1540, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$23] */
    /* JADX WARN: Type inference failed for: r0v1544, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$21] */
    /* JADX WARN: Type inference failed for: r0v1554, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$3] */
    /* JADX WARN: Type inference failed for: r0v1575, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$4] */
    /* JADX WARN: Type inference failed for: r0v1581, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$6] */
    /* JADX WARN: Type inference failed for: r0v1587, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$8] */
    /* JADX WARN: Type inference failed for: r0v1593, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$10] */
    /* JADX WARN: Type inference failed for: r0v1599, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$12] */
    /* JADX WARN: Type inference failed for: r0v1605, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$14] */
    /* JADX WARN: Type inference failed for: r0v161, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$99] */
    /* JADX WARN: Type inference failed for: r0v1611, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$16] */
    /* JADX WARN: Type inference failed for: r0v1617, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$17] */
    /* JADX WARN: Type inference failed for: r0v1627, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$18] */
    /* JADX WARN: Type inference failed for: r0v167, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$101] */
    /* JADX WARN: Type inference failed for: r0v1762, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$15] */
    /* JADX WARN: Type inference failed for: r0v1810, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$13] */
    /* JADX WARN: Type inference failed for: r0v1858, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$11] */
    /* JADX WARN: Type inference failed for: r0v1906, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$9] */
    /* JADX WARN: Type inference failed for: r0v1954, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$7] */
    /* JADX WARN: Type inference failed for: r0v2002, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$5] */
    /* JADX WARN: Type inference failed for: r0v226, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$100] */
    /* JADX WARN: Type inference failed for: r0v230, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$94] */
    /* JADX WARN: Type inference failed for: r0v236, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$96] */
    /* JADX WARN: Type inference failed for: r0v295, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$95] */
    /* JADX WARN: Type inference failed for: r0v299, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$89] */
    /* JADX WARN: Type inference failed for: r0v305, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$91] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$1] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$2] */
    /* JADX WARN: Type inference failed for: r0v364, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$90] */
    /* JADX WARN: Type inference failed for: r0v368, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$84] */
    /* JADX WARN: Type inference failed for: r0v374, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$86] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$19] */
    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$33] */
    /* JADX WARN: Type inference failed for: r0v433, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$85] */
    /* JADX WARN: Type inference failed for: r0v437, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$79] */
    /* JADX WARN: Type inference failed for: r0v44, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$57] */
    /* JADX WARN: Type inference failed for: r0v441, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$81] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$75] */
    /* JADX WARN: Type inference failed for: r0v502, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$82] */
    /* JADX WARN: Type inference failed for: r0v506, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$77] */
    /* JADX WARN: Type inference failed for: r0v516, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$58] */
    /* JADX WARN: Type inference failed for: r0v530, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$60] */
    /* JADX WARN: Type inference failed for: r0v536, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$62] */
    /* JADX WARN: Type inference failed for: r0v542, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$67] */
    /* JADX WARN: Type inference failed for: r0v548, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$72] */
    /* JADX WARN: Type inference failed for: r0v558, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$73] */
    /* JADX WARN: Type inference failed for: r0v561, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$74] */
    /* JADX WARN: Type inference failed for: r0v57, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$76] */
    /* JADX WARN: Type inference failed for: r0v608, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$68] */
    /* JADX WARN: Type inference failed for: r0v612, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$70] */
    /* JADX WARN: Type inference failed for: r0v673, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$71] */
    /* JADX WARN: Type inference failed for: r0v677, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$63] */
    /* JADX WARN: Type inference failed for: r0v681, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$65] */
    /* JADX WARN: Type inference failed for: r0v71, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$78] */
    /* JADX WARN: Type inference failed for: r0v742, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$66] */
    /* JADX WARN: Type inference failed for: r0v77, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$83] */
    /* JADX WARN: Type inference failed for: r0v790, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$61] */
    /* JADX WARN: Type inference failed for: r0v794, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$59] */
    /* JADX WARN: Type inference failed for: r0v804, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$34] */
    /* JADX WARN: Type inference failed for: r0v818, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$36] */
    /* JADX WARN: Type inference failed for: r0v824, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$38] */
    /* JADX WARN: Type inference failed for: r0v83, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$88] */
    /* JADX WARN: Type inference failed for: r0v830, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$40] */
    /* JADX WARN: Type inference failed for: r0v836, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$42] */
    /* JADX WARN: Type inference failed for: r0v842, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$44] */
    /* JADX WARN: Type inference failed for: r0v848, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$49] */
    /* JADX WARN: Type inference failed for: r0v854, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$54] */
    /* JADX WARN: Type inference failed for: r0v864, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$55] */
    /* JADX WARN: Type inference failed for: r0v867, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$56] */
    /* JADX WARN: Type inference failed for: r0v89, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$93] */
    /* JADX WARN: Type inference failed for: r0v914, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$50] */
    /* JADX WARN: Type inference failed for: r0v918, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$52] */
    /* JADX WARN: Type inference failed for: r0v95, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$98] */
    /* JADX WARN: Type inference failed for: r0v979, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$53] */
    /* JADX WARN: Type inference failed for: r0v983, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$46] */
    /* JADX WARN: Type inference failed for: r0v989, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$47] */
    /* JADX WARN: Type inference failed for: r1v132, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$97] */
    /* JADX WARN: Type inference failed for: r1v169, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$92] */
    /* JADX WARN: Type inference failed for: r1v206, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$87] */
    /* JADX WARN: Type inference failed for: r1v240, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$80] */
    /* JADX WARN: Type inference failed for: r1v331, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$69] */
    /* JADX WARN: Type inference failed for: r1v368, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$64] */
    /* JADX WARN: Type inference failed for: r1v491, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$51] */
    /* JADX WARN: Type inference failed for: r1v531, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$48] */
    /* JADX WARN: Type inference failed for: r1v95, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei$102] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!world.field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = world.func_175625_s(_bp);
            IBlockState _bs = world.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("概率", entityPlayer.getEntityData().func_74769_h("Fulu") * 7.0d);
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (!world.field_72995_K) {
            BlockPos _bp2 = new BlockPos(x, y, z);
            TileEntity _tileEntity2 = world.func_175625_s(_bp2);
            IBlockState _bs2 = world.func_180495_p(_bp2);
            if (_tileEntity2 != null) {
                _tileEntity2.getTileData().func_74778_a("炼制者", entityPlayer.func_145748_c_().func_150260_c());
            }
            world.func_184138_a(_bp2, _bs2, _bs2, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() != new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureLianxupipei.executeProcedure($_dependencies);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.2
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemFuBi1.block, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.3
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemFuZhi1.block, 1).func_77973_b()) {
                if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 1.0d) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("当前欲制作一阶符箓,存在问题:未到达练气期"), false);
                        return;
                    }
                    return;
                }
                if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.4
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.5
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp3 = new BlockPos(x, y, z);
                        TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                        IBlockState _bs3 = world.func_180495_p(_bp3);
                        if (_tileEntity3 != null) {
                            _tileEntity3.getTileData().func_74780_a("leixing", 11.0d);
                        }
                        world.func_184138_a(_bp3, _bs3, _bs3, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp4 = new BlockPos(x, y, z);
                        TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                        IBlockState _bs4 = world.func_180495_p(_bp4);
                        if (_tileEntity4 != null) {
                            _tileEntity4.getTileData().func_74780_a("扣除灵力", 5.0d);
                        }
                        world.func_184138_a(_bp4, _bs4, _bs4, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp5 = new BlockPos(x, y, z);
                        TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                        IBlockState _bs5 = world.func_180495_p(_bp5);
                        if (_tileEntity5 != null) {
                            _tileEntity5.getTileData().func_74780_a("fulujingyan", 1.0d);
                        }
                        world.func_184138_a(_bp5, _bs5, _bs5, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                    return;
                }
                if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.6
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.7
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp6 = new BlockPos(x, y, z);
                        TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                        IBlockState _bs6 = world.func_180495_p(_bp6);
                        if (_tileEntity6 != null) {
                            _tileEntity6.getTileData().func_74780_a("leixing", 12.0d);
                        }
                        world.func_184138_a(_bp6, _bs6, _bs6, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp7 = new BlockPos(x, y, z);
                        TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                        IBlockState _bs7 = world.func_180495_p(_bp7);
                        if (_tileEntity7 != null) {
                            _tileEntity7.getTileData().func_74780_a("扣除灵力", 5.0d);
                        }
                        world.func_184138_a(_bp7, _bs7, _bs7, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp8 = new BlockPos(x, y, z);
                        TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                        IBlockState _bs8 = world.func_180495_p(_bp8);
                        if (_tileEntity8 != null) {
                            _tileEntity8.getTileData().func_74780_a("fulujingyan", 1.0d);
                        }
                        world.func_184138_a(_bp8, _bs8, _bs8, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                    return;
                }
                if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.8
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.9
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 3.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp9 = new BlockPos(x, y, z);
                        TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                        IBlockState _bs9 = world.func_180495_p(_bp9);
                        if (_tileEntity9 != null) {
                            _tileEntity9.getTileData().func_74780_a("leixing", 13.0d);
                        }
                        world.func_184138_a(_bp9, _bs9, _bs9, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp10 = new BlockPos(x, y, z);
                        TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                        IBlockState _bs10 = world.func_180495_p(_bp10);
                        if (_tileEntity10 != null) {
                            _tileEntity10.getTileData().func_74780_a("扣除灵力", 5.0d);
                        }
                        world.func_184138_a(_bp10, _bs10, _bs10, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp11 = new BlockPos(x, y, z);
                        TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                        IBlockState _bs11 = world.func_180495_p(_bp11);
                        if (_tileEntity11 != null) {
                            _tileEntity11.getTileData().func_74780_a("fulujingyan", 1.0d);
                        }
                        world.func_184138_a(_bp11, _bs11, _bs11, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                    return;
                }
                if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.10
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.11
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 4.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp12 = new BlockPos(x, y, z);
                        TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                        IBlockState _bs12 = world.func_180495_p(_bp12);
                        if (_tileEntity12 != null) {
                            _tileEntity12.getTileData().func_74780_a("leixing", 14.0d);
                        }
                        world.func_184138_a(_bp12, _bs12, _bs12, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp13 = new BlockPos(x, y, z);
                        TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                        IBlockState _bs13 = world.func_180495_p(_bp13);
                        if (_tileEntity13 != null) {
                            _tileEntity13.getTileData().func_74780_a("扣除灵力", 5.0d);
                        }
                        world.func_184138_a(_bp13, _bs13, _bs13, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp14 = new BlockPos(x, y, z);
                        TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                        IBlockState _bs14 = world.func_180495_p(_bp14);
                        if (_tileEntity14 != null) {
                            _tileEntity14.getTileData().func_74780_a("fulujingyan", 1.0d);
                        }
                        world.func_184138_a(_bp14, _bs14, _bs14, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                    return;
                }
                if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.12
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.13
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 5.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp15 = new BlockPos(x, y, z);
                        TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                        IBlockState _bs15 = world.func_180495_p(_bp15);
                        if (_tileEntity15 != null) {
                            _tileEntity15.getTileData().func_74780_a("leixing", 15.0d);
                        }
                        world.func_184138_a(_bp15, _bs15, _bs15, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp16 = new BlockPos(x, y, z);
                        TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                        IBlockState _bs16 = world.func_180495_p(_bp16);
                        if (_tileEntity16 != null) {
                            _tileEntity16.getTileData().func_74780_a("扣除灵力", 5.0d);
                        }
                        world.func_184138_a(_bp16, _bs16, _bs16, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp17 = new BlockPos(x, y, z);
                        TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                        IBlockState _bs17 = world.func_180495_p(_bp17);
                        if (_tileEntity17 != null) {
                            _tileEntity17.getTileData().func_74780_a("fulujingyan", 1.0d);
                        }
                        world.func_184138_a(_bp17, _bs17, _bs17, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                    return;
                }
                if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.14
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.15
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 6.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp18 = new BlockPos(x, y, z);
                        TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                        IBlockState _bs18 = world.func_180495_p(_bp18);
                        if (_tileEntity18 != null) {
                            _tileEntity18.getTileData().func_74780_a("leixing", 16.0d);
                        }
                        world.func_184138_a(_bp18, _bs18, _bs18, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp19 = new BlockPos(x, y, z);
                        TileEntity _tileEntity19 = world.func_175625_s(_bp19);
                        IBlockState _bs19 = world.func_180495_p(_bp19);
                        if (_tileEntity19 != null) {
                            _tileEntity19.getTileData().func_74780_a("扣除灵力", 5.0d);
                        }
                        world.func_184138_a(_bp19, _bs19, _bs19, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp20 = new BlockPos(x, y, z);
                        TileEntity _tileEntity20 = world.func_175625_s(_bp20);
                        IBlockState _bs20 = world.func_180495_p(_bp20);
                        if (_tileEntity20 != null) {
                            _tileEntity20.getTileData().func_74780_a("fulujingyan", 1.0d);
                        }
                        world.func_184138_a(_bp20, _bs20, _bs20, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.16
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:caiitem04")) {
                    if (!world.field_72995_K) {
                        BlockPos _bp21 = new BlockPos(x, y, z);
                        TileEntity _tileEntity21 = world.func_175625_s(_bp21);
                        IBlockState _bs21 = world.func_180495_p(_bp21);
                        if (_tileEntity21 != null) {
                            _tileEntity21.getTileData().func_74780_a("leixing", 17.0d);
                        }
                        world.func_184138_a(_bp21, _bs21, _bs21, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp22 = new BlockPos(x, y, z);
                        TileEntity _tileEntity22 = world.func_175625_s(_bp22);
                        IBlockState _bs22 = world.func_180495_p(_bp22);
                        if (_tileEntity22 != null) {
                            _tileEntity22.getTileData().func_74780_a("扣除灵力", 5.0d);
                        }
                        world.func_184138_a(_bp22, _bs22, _bs22, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp23 = new BlockPos(x, y, z);
                        TileEntity _tileEntity23 = world.func_175625_s(_bp23);
                        IBlockState _bs23 = world.func_180495_p(_bp23);
                        if (_tileEntity23 != null) {
                            _tileEntity23.getTileData().func_74780_a("fulujingyan", 1.0d);
                        }
                        world.func_184138_a(_bp23, _bs23, _bs23, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.17
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.18
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                    if (!world.field_72995_K) {
                        BlockPos _bp24 = new BlockPos(x, y, z);
                        TileEntity _tileEntity24 = world.func_175625_s(_bp24);
                        IBlockState _bs24 = world.func_180495_p(_bp24);
                        if (_tileEntity24 != null) {
                            _tileEntity24.getTileData().func_74780_a("leixing", 101.0d);
                        }
                        world.func_184138_a(_bp24, _bs24, _bs24, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp25 = new BlockPos(x, y, z);
                        TileEntity _tileEntity25 = world.func_175625_s(_bp25);
                        IBlockState _bs25 = world.func_180495_p(_bp25);
                        if (_tileEntity25 != null) {
                            _tileEntity25.getTileData().func_74780_a("扣除灵力", 5.0d);
                        }
                        world.func_184138_a(_bp25, _bs25, _bs25, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp26 = new BlockPos(x, y, z);
                        TileEntity _tileEntity26 = world.func_175625_s(_bp26);
                        IBlockState _bs26 = world.func_180495_p(_bp26);
                        if (_tileEntity26 != null) {
                            _tileEntity26.getTileData().func_74780_a("fulujingyan", 1.0d);
                        }
                        world.func_184138_a(_bp26, _bs26, _bs26, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("当前欲制作一阶符箓,存在问题:附录或符纸不匹配"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("当前欲制作一阶符箓,存在问题:没有一阶符箓"), false);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.19
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemFuBi2.block, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.20
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemFuZhi2.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.21
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCloudMapCharm.block, 1).func_77973_b()) {
                if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 2.0d) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("当前欲制作二阶符箓,存在问题:未达到筑基期或画符等级未到达一级"), false);
                        return;
                    }
                    return;
                }
                if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.22
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.23
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp27 = new BlockPos(x, y, z);
                        TileEntity _tileEntity27 = world.func_175625_s(_bp27);
                        IBlockState _bs27 = world.func_180495_p(_bp27);
                        if (_tileEntity27 != null) {
                            _tileEntity27.getTileData().func_74780_a("leixing", 21.0d);
                        }
                        world.func_184138_a(_bp27, _bs27, _bs27, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp28 = new BlockPos(x, y, z);
                        TileEntity _tileEntity28 = world.func_175625_s(_bp28);
                        IBlockState _bs28 = world.func_180495_p(_bp28);
                        if (_tileEntity28 != null) {
                            _tileEntity28.getTileData().func_74780_a("扣除灵力", 15.0d);
                        }
                        world.func_184138_a(_bp28, _bs28, _bs28, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp29 = new BlockPos(x, y, z);
                        TileEntity _tileEntity29 = world.func_175625_s(_bp29);
                        IBlockState _bs29 = world.func_180495_p(_bp29);
                        if (_tileEntity29 != null) {
                            _tileEntity29.getTileData().func_74780_a("fulujingyan", 5.0d);
                        }
                        world.func_184138_a(_bp29, _bs29, _bs29, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                    return;
                }
                if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.24
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.25
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp30 = new BlockPos(x, y, z);
                        TileEntity _tileEntity30 = world.func_175625_s(_bp30);
                        IBlockState _bs30 = world.func_180495_p(_bp30);
                        if (_tileEntity30 != null) {
                            _tileEntity30.getTileData().func_74780_a("leixing", 22.0d);
                        }
                        world.func_184138_a(_bp30, _bs30, _bs30, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp31 = new BlockPos(x, y, z);
                        TileEntity _tileEntity31 = world.func_175625_s(_bp31);
                        IBlockState _bs31 = world.func_180495_p(_bp31);
                        if (_tileEntity31 != null) {
                            _tileEntity31.getTileData().func_74780_a("扣除灵力", 15.0d);
                        }
                        world.func_184138_a(_bp31, _bs31, _bs31, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp32 = new BlockPos(x, y, z);
                        TileEntity _tileEntity32 = world.func_175625_s(_bp32);
                        IBlockState _bs32 = world.func_180495_p(_bp32);
                        if (_tileEntity32 != null) {
                            _tileEntity32.getTileData().func_74780_a("fulujingyan", 5.0d);
                        }
                        world.func_184138_a(_bp32, _bs32, _bs32, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                    return;
                }
                if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.26
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.27
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 3.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp33 = new BlockPos(x, y, z);
                        TileEntity _tileEntity33 = world.func_175625_s(_bp33);
                        IBlockState _bs33 = world.func_180495_p(_bp33);
                        if (_tileEntity33 != null) {
                            _tileEntity33.getTileData().func_74780_a("leixing", 23.0d);
                        }
                        world.func_184138_a(_bp33, _bs33, _bs33, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp34 = new BlockPos(x, y, z);
                        TileEntity _tileEntity34 = world.func_175625_s(_bp34);
                        IBlockState _bs34 = world.func_180495_p(_bp34);
                        if (_tileEntity34 != null) {
                            _tileEntity34.getTileData().func_74780_a("扣除灵力", 15.0d);
                        }
                        world.func_184138_a(_bp34, _bs34, _bs34, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp35 = new BlockPos(x, y, z);
                        TileEntity _tileEntity35 = world.func_175625_s(_bp35);
                        IBlockState _bs35 = world.func_180495_p(_bp35);
                        if (_tileEntity35 != null) {
                            _tileEntity35.getTileData().func_74780_a("fulujingyan", 5.0d);
                        }
                        world.func_184138_a(_bp35, _bs35, _bs35, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                    return;
                }
                if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.28
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.29
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 4.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp36 = new BlockPos(x, y, z);
                        TileEntity _tileEntity36 = world.func_175625_s(_bp36);
                        IBlockState _bs36 = world.func_180495_p(_bp36);
                        if (_tileEntity36 != null) {
                            _tileEntity36.getTileData().func_74780_a("leixing", 24.0d);
                        }
                        world.func_184138_a(_bp36, _bs36, _bs36, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp37 = new BlockPos(x, y, z);
                        TileEntity _tileEntity37 = world.func_175625_s(_bp37);
                        IBlockState _bs37 = world.func_180495_p(_bp37);
                        if (_tileEntity37 != null) {
                            _tileEntity37.getTileData().func_74780_a("扣除灵力", 15.0d);
                        }
                        world.func_184138_a(_bp37, _bs37, _bs37, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp38 = new BlockPos(x, y, z);
                        TileEntity _tileEntity38 = world.func_175625_s(_bp38);
                        IBlockState _bs38 = world.func_180495_p(_bp38);
                        if (_tileEntity38 != null) {
                            _tileEntity38.getTileData().func_74780_a("fulujingyan", 5.0d);
                        }
                        world.func_184138_a(_bp38, _bs38, _bs38, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.30
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCloudMapCharm.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.31
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.32
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                    if (!world.field_72995_K) {
                        BlockPos _bp39 = new BlockPos(x, y, z);
                        TileEntity _tileEntity39 = world.func_175625_s(_bp39);
                        IBlockState _bs39 = world.func_180495_p(_bp39);
                        if (_tileEntity39 != null) {
                            _tileEntity39.getTileData().func_74780_a("leixing", 102.0d);
                        }
                        world.func_184138_a(_bp39, _bs39, _bs39, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp40 = new BlockPos(x, y, z);
                        TileEntity _tileEntity40 = world.func_175625_s(_bp40);
                        IBlockState _bs40 = world.func_180495_p(_bp40);
                        if (_tileEntity40 != null) {
                            _tileEntity40.getTileData().func_74780_a("扣除灵力", 15.0d);
                        }
                        world.func_184138_a(_bp40, _bs40, _bs40, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp41 = new BlockPos(x, y, z);
                        TileEntity _tileEntity41 = world.func_175625_s(_bp41);
                        IBlockState _bs41 = world.func_180495_p(_bp41);
                        if (_tileEntity41 != null) {
                            _tileEntity41.getTileData().func_74780_a("fulujingyan", 5.0d);
                        }
                        world.func_184138_a(_bp41, _bs41, _bs41, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("当前欲制作二阶符箓,存在问题:附录或符纸不匹配"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("当前欲制作二阶符箓,存在问题:没有二阶符箓"), false);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.33
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemFuBi3.block, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.34
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemFuZhi3.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.35
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCloudMapCharm2.block, 1).func_77973_b()) {
                if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 3.0d) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("当前欲制作三阶符箓,存在问题:未达到结丹期或画符等级未达到二级"), false);
                        return;
                    }
                    return;
                }
                if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.36
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.37
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp42 = new BlockPos(x, y, z);
                        TileEntity _tileEntity42 = world.func_175625_s(_bp42);
                        IBlockState _bs42 = world.func_180495_p(_bp42);
                        if (_tileEntity42 != null) {
                            _tileEntity42.getTileData().func_74780_a("leixing", 31.0d);
                        }
                        world.func_184138_a(_bp42, _bs42, _bs42, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp43 = new BlockPos(x, y, z);
                        TileEntity _tileEntity43 = world.func_175625_s(_bp43);
                        IBlockState _bs43 = world.func_180495_p(_bp43);
                        if (_tileEntity43 != null) {
                            _tileEntity43.getTileData().func_74780_a("扣除灵力", 30.0d);
                        }
                        world.func_184138_a(_bp43, _bs43, _bs43, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp44 = new BlockPos(x, y, z);
                        TileEntity _tileEntity44 = world.func_175625_s(_bp44);
                        IBlockState _bs44 = world.func_180495_p(_bp44);
                        if (_tileEntity44 != null) {
                            _tileEntity44.getTileData().func_74780_a("fulujingyan", 25.0d);
                        }
                        world.func_184138_a(_bp44, _bs44, _bs44, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                    return;
                }
                if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.38
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.39
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp45 = new BlockPos(x, y, z);
                        TileEntity _tileEntity45 = world.func_175625_s(_bp45);
                        IBlockState _bs45 = world.func_180495_p(_bp45);
                        if (_tileEntity45 != null) {
                            _tileEntity45.getTileData().func_74780_a("leixing", 32.0d);
                        }
                        world.func_184138_a(_bp45, _bs45, _bs45, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp46 = new BlockPos(x, y, z);
                        TileEntity _tileEntity46 = world.func_175625_s(_bp46);
                        IBlockState _bs46 = world.func_180495_p(_bp46);
                        if (_tileEntity46 != null) {
                            _tileEntity46.getTileData().func_74780_a("扣除灵力", 30.0d);
                        }
                        world.func_184138_a(_bp46, _bs46, _bs46, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp47 = new BlockPos(x, y, z);
                        TileEntity _tileEntity47 = world.func_175625_s(_bp47);
                        IBlockState _bs47 = world.func_180495_p(_bp47);
                        if (_tileEntity47 != null) {
                            _tileEntity47.getTileData().func_74780_a("fulujingyan", 25.0d);
                        }
                        world.func_184138_a(_bp47, _bs47, _bs47, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                    return;
                }
                if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.40
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.41
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 3.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp48 = new BlockPos(x, y, z);
                        TileEntity _tileEntity48 = world.func_175625_s(_bp48);
                        IBlockState _bs48 = world.func_180495_p(_bp48);
                        if (_tileEntity48 != null) {
                            _tileEntity48.getTileData().func_74780_a("leixing", 33.0d);
                        }
                        world.func_184138_a(_bp48, _bs48, _bs48, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp49 = new BlockPos(x, y, z);
                        TileEntity _tileEntity49 = world.func_175625_s(_bp49);
                        IBlockState _bs49 = world.func_180495_p(_bp49);
                        if (_tileEntity49 != null) {
                            _tileEntity49.getTileData().func_74780_a("扣除灵力", 30.0d);
                        }
                        world.func_184138_a(_bp49, _bs49, _bs49, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp50 = new BlockPos(x, y, z);
                        TileEntity _tileEntity50 = world.func_175625_s(_bp50);
                        IBlockState _bs50 = world.func_180495_p(_bp50);
                        if (_tileEntity50 != null) {
                            _tileEntity50.getTileData().func_74780_a("fulujingyan", 25.0d);
                        }
                        world.func_184138_a(_bp50, _bs50, _bs50, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                    return;
                }
                if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.42
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.43
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 4.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp51 = new BlockPos(x, y, z);
                        TileEntity _tileEntity51 = world.func_175625_s(_bp51);
                        IBlockState _bs51 = world.func_180495_p(_bp51);
                        if (_tileEntity51 != null) {
                            _tileEntity51.getTileData().func_74780_a("leixing", 36.0d);
                        }
                        world.func_184138_a(_bp51, _bs51, _bs51, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp52 = new BlockPos(x, y, z);
                        TileEntity _tileEntity52 = world.func_175625_s(_bp52);
                        IBlockState _bs52 = world.func_180495_p(_bp52);
                        if (_tileEntity52 != null) {
                            _tileEntity52.getTileData().func_74780_a("扣除灵力", 30.0d);
                        }
                        world.func_184138_a(_bp52, _bs52, _bs52, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp53 = new BlockPos(x, y, z);
                        TileEntity _tileEntity53 = world.func_175625_s(_bp53);
                        IBlockState _bs53 = world.func_180495_p(_bp53);
                        if (_tileEntity53 != null) {
                            _tileEntity53.getTileData().func_74780_a("fulujingyan", 25.0d);
                        }
                        world.func_184138_a(_bp53, _bs53, _bs53, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                    return;
                }
                if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.44
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.45
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 5.0d && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.46
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao22") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.47
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77958_k() - new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.48
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77952_i() >= 150) {
                    if (!world.field_72995_K) {
                        BlockPos _bp54 = new BlockPos(x, y, z);
                        TileEntity _tileEntity54 = world.func_175625_s(_bp54);
                        IBlockState _bs54 = world.func_180495_p(_bp54);
                        if (_tileEntity54 != null) {
                            _tileEntity54.getTileData().func_74780_a("扣除耐久", 150.0d);
                        }
                        world.func_184138_a(_bp54, _bs54, _bs54, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp55 = new BlockPos(x, y, z);
                        TileEntity _tileEntity55 = world.func_175625_s(_bp55);
                        IBlockState _bs55 = world.func_180495_p(_bp55);
                        if (_tileEntity55 != null) {
                            _tileEntity55.getTileData().func_74780_a("leixing", 34.0d);
                        }
                        world.func_184138_a(_bp55, _bs55, _bs55, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp56 = new BlockPos(x, y, z);
                        TileEntity _tileEntity56 = world.func_175625_s(_bp56);
                        IBlockState _bs56 = world.func_180495_p(_bp56);
                        if (_tileEntity56 != null) {
                            _tileEntity56.getTileData().func_74780_a("扣除灵力", 30.0d);
                        }
                        world.func_184138_a(_bp56, _bs56, _bs56, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp57 = new BlockPos(x, y, z);
                        TileEntity _tileEntity57 = world.func_175625_s(_bp57);
                        IBlockState _bs57 = world.func_180495_p(_bp57);
                        if (_tileEntity57 != null) {
                            _tileEntity57.getTileData().func_74780_a("fulujingyan", 6.0d);
                        }
                        world.func_184138_a(_bp57, _bs57, _bs57, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                    return;
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.49
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao0101") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.50
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77958_k() - new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.51
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77952_i() >= 150) {
                    if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.52
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.53
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 5.0d) {
                        if (!world.field_72995_K) {
                            BlockPos _bp58 = new BlockPos(x, y, z);
                            TileEntity _tileEntity58 = world.func_175625_s(_bp58);
                            IBlockState _bs58 = world.func_180495_p(_bp58);
                            if (_tileEntity58 != null) {
                                _tileEntity58.getTileData().func_74780_a("扣除耐久", 150.0d);
                            }
                            world.func_184138_a(_bp58, _bs58, _bs58, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp59 = new BlockPos(x, y, z);
                            TileEntity _tileEntity59 = world.func_175625_s(_bp59);
                            IBlockState _bs59 = world.func_180495_p(_bp59);
                            if (_tileEntity59 != null) {
                                _tileEntity59.getTileData().func_74780_a("leixing", 35.0d);
                            }
                            world.func_184138_a(_bp59, _bs59, _bs59, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp60 = new BlockPos(x, y, z);
                            TileEntity _tileEntity60 = world.func_175625_s(_bp60);
                            IBlockState _bs60 = world.func_180495_p(_bp60);
                            if (_tileEntity60 != null) {
                                _tileEntity60.getTileData().func_74780_a("扣除灵力", 30.0d);
                            }
                            world.func_184138_a(_bp60, _bs60, _bs60, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp61 = new BlockPos(x, y, z);
                            TileEntity _tileEntity61 = world.func_175625_s(_bp61);
                            IBlockState _bs61 = world.func_180495_p(_bp61);
                            if (_tileEntity61 != null) {
                                _tileEntity61.getTileData().func_74780_a("fulujingyan", 12.0d);
                            }
                            world.func_184138_a(_bp61, _bs61, _bs61, 3);
                        }
                        $_dependencies.put("entity", entityPlayer);
                        $_dependencies.put("x", Integer.valueOf(x));
                        $_dependencies.put("y", Integer.valueOf(y));
                        $_dependencies.put("z", Integer.valueOf(z));
                        $_dependencies.put("world", world);
                        ProcedureLingLiCut.executeProcedure($_dependencies);
                        return;
                    }
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.54
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCloudMapCharm2.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.55
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.56
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                    if (!world.field_72995_K) {
                        BlockPos _bp62 = new BlockPos(x, y, z);
                        TileEntity _tileEntity62 = world.func_175625_s(_bp62);
                        IBlockState _bs62 = world.func_180495_p(_bp62);
                        if (_tileEntity62 != null) {
                            _tileEntity62.getTileData().func_74780_a("leixing", 103.0d);
                        }
                        world.func_184138_a(_bp62, _bs62, _bs62, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp63 = new BlockPos(x, y, z);
                        TileEntity _tileEntity63 = world.func_175625_s(_bp63);
                        IBlockState _bs63 = world.func_180495_p(_bp63);
                        if (_tileEntity63 != null) {
                            _tileEntity63.getTileData().func_74780_a("扣除灵力", 30.0d);
                        }
                        world.func_184138_a(_bp63, _bs63, _bs63, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp64 = new BlockPos(x, y, z);
                        TileEntity _tileEntity64 = world.func_175625_s(_bp64);
                        IBlockState _bs64 = world.func_180495_p(_bp64);
                        if (_tileEntity64 != null) {
                            _tileEntity64.getTileData().func_74780_a("fulujingyan", 10.0d);
                        }
                        world.func_184138_a(_bp64, _bs64, _bs64, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("当前欲制作三阶符箓,存在问题:附录或符纸或法宝不匹配或法宝耐久不足以炼制"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("当前欲制作三阶符箓,存在问题:没有三阶符纸"), false);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.57
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemFuBi4.block, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.58
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemFuZhi4.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.59
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCloudMapCharm3.block, 1).func_77973_b()) {
                if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 4.0d) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("当前欲制作四阶符箓,存在问题:未达到元婴期或画符等级未达到三级"), false);
                        return;
                    }
                    return;
                }
                if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.60
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.61
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp65 = new BlockPos(x, y, z);
                        TileEntity _tileEntity65 = world.func_175625_s(_bp65);
                        IBlockState _bs65 = world.func_180495_p(_bp65);
                        if (_tileEntity65 != null) {
                            _tileEntity65.getTileData().func_74780_a("leixing", 41.0d);
                        }
                        world.func_184138_a(_bp65, _bs65, _bs65, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp66 = new BlockPos(x, y, z);
                        TileEntity _tileEntity66 = world.func_175625_s(_bp66);
                        IBlockState _bs66 = world.func_180495_p(_bp66);
                        if (_tileEntity66 != null) {
                            _tileEntity66.getTileData().func_74780_a("扣除灵力", 90.0d);
                        }
                        world.func_184138_a(_bp66, _bs66, _bs66, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp67 = new BlockPos(x, y, z);
                        TileEntity _tileEntity67 = world.func_175625_s(_bp67);
                        IBlockState _bs67 = world.func_180495_p(_bp67);
                        if (_tileEntity67 != null) {
                            _tileEntity67.getTileData().func_74780_a("fulujingyan", 125.0d);
                        }
                        world.func_184138_a(_bp67, _bs67, _bs67, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                    return;
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.62
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao33") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.63
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77958_k() - new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.64
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77952_i() >= 200) {
                    if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.65
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.66
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d) {
                        if (!world.field_72995_K) {
                            BlockPos _bp68 = new BlockPos(x, y, z);
                            TileEntity _tileEntity68 = world.func_175625_s(_bp68);
                            IBlockState _bs68 = world.func_180495_p(_bp68);
                            if (_tileEntity68 != null) {
                                _tileEntity68.getTileData().func_74780_a("扣除耐久", 200.0d);
                            }
                            world.func_184138_a(_bp68, _bs68, _bs68, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp69 = new BlockPos(x, y, z);
                            TileEntity _tileEntity69 = world.func_175625_s(_bp69);
                            IBlockState _bs69 = world.func_180495_p(_bp69);
                            if (_tileEntity69 != null) {
                                _tileEntity69.getTileData().func_74780_a("leixing", 42.0d);
                            }
                            world.func_184138_a(_bp69, _bs69, _bs69, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp70 = new BlockPos(x, y, z);
                            TileEntity _tileEntity70 = world.func_175625_s(_bp70);
                            IBlockState _bs70 = world.func_180495_p(_bp70);
                            if (_tileEntity70 != null) {
                                _tileEntity70.getTileData().func_74780_a("扣除灵力", 90.0d);
                            }
                            world.func_184138_a(_bp70, _bs70, _bs70, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp71 = new BlockPos(x, y, z);
                            TileEntity _tileEntity71 = world.func_175625_s(_bp71);
                            IBlockState _bs71 = world.func_180495_p(_bp71);
                            if (_tileEntity71 != null) {
                                _tileEntity71.getTileData().func_74780_a("fulujingyan", 75.0d);
                            }
                            world.func_184138_a(_bp71, _bs71, _bs71, 3);
                        }
                        $_dependencies.put("entity", entityPlayer);
                        $_dependencies.put("x", Integer.valueOf(x));
                        $_dependencies.put("y", Integer.valueOf(y));
                        $_dependencies.put("z", Integer.valueOf(z));
                        $_dependencies.put("world", world);
                        ProcedureLingLiCut.executeProcedure($_dependencies);
                        return;
                    }
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.67
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao0701") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.68
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77958_k() - new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.69
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77952_i() >= 200) {
                    if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.70
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.71
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d) {
                        if (!world.field_72995_K) {
                            BlockPos _bp72 = new BlockPos(x, y, z);
                            TileEntity _tileEntity72 = world.func_175625_s(_bp72);
                            IBlockState _bs72 = world.func_180495_p(_bp72);
                            if (_tileEntity72 != null) {
                                _tileEntity72.getTileData().func_74780_a("扣除耐久", 200.0d);
                            }
                            world.func_184138_a(_bp72, _bs72, _bs72, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp73 = new BlockPos(x, y, z);
                            TileEntity _tileEntity73 = world.func_175625_s(_bp73);
                            IBlockState _bs73 = world.func_180495_p(_bp73);
                            if (_tileEntity73 != null) {
                                _tileEntity73.getTileData().func_74780_a("leixing", 43.0d);
                            }
                            world.func_184138_a(_bp73, _bs73, _bs73, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp74 = new BlockPos(x, y, z);
                            TileEntity _tileEntity74 = world.func_175625_s(_bp74);
                            IBlockState _bs74 = world.func_180495_p(_bp74);
                            if (_tileEntity74 != null) {
                                _tileEntity74.getTileData().func_74780_a("扣除灵力", 90.0d);
                            }
                            world.func_184138_a(_bp74, _bs74, _bs74, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp75 = new BlockPos(x, y, z);
                            TileEntity _tileEntity75 = world.func_175625_s(_bp75);
                            IBlockState _bs75 = world.func_180495_p(_bp75);
                            if (_tileEntity75 != null) {
                                _tileEntity75.getTileData().func_74780_a("fulujingyan", 75.0d);
                            }
                            world.func_184138_a(_bp75, _bs75, _bs75, 3);
                        }
                        $_dependencies.put("entity", entityPlayer);
                        $_dependencies.put("x", Integer.valueOf(x));
                        $_dependencies.put("y", Integer.valueOf(y));
                        $_dependencies.put("z", Integer.valueOf(z));
                        $_dependencies.put("world", world);
                        ProcedureLingLiCut.executeProcedure($_dependencies);
                        return;
                    }
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.72
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCloudMapCharm3.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.73
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.74
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                    if (!world.field_72995_K) {
                        BlockPos _bp76 = new BlockPos(x, y, z);
                        TileEntity _tileEntity76 = world.func_175625_s(_bp76);
                        IBlockState _bs76 = world.func_180495_p(_bp76);
                        if (_tileEntity76 != null) {
                            _tileEntity76.getTileData().func_74780_a("leixing", 104.0d);
                        }
                        world.func_184138_a(_bp76, _bs76, _bs76, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp77 = new BlockPos(x, y, z);
                        TileEntity _tileEntity77 = world.func_175625_s(_bp77);
                        IBlockState _bs77 = world.func_180495_p(_bp77);
                        if (_tileEntity77 != null) {
                            _tileEntity77.getTileData().func_74780_a("扣除灵力", 90.0d);
                        }
                        world.func_184138_a(_bp77, _bs77, _bs77, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp78 = new BlockPos(x, y, z);
                        TileEntity _tileEntity78 = world.func_175625_s(_bp78);
                        IBlockState _bs78 = world.func_180495_p(_bp78);
                        if (_tileEntity78 != null) {
                            _tileEntity78.getTileData().func_74780_a("fulujingyan", 75.0d);
                        }
                        world.func_184138_a(_bp78, _bs78, _bs78, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("当前欲制作四阶符箓,存在问题:附录或符纸或法宝不匹配或法宝耐久不足以炼制"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("当前欲制作四阶符箓,存在问题:没有四阶符纸"), false);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.75
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemFuBi5.block, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.76
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemFuZhi5.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.77
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCloudMapCharm4.block, 1).func_77973_b()) {
                if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 5.0d) {
                    if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.78
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao0501") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.79
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77958_k() - new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.80
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77952_i() >= 350) {
                        if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.81
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.82
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d) {
                            if (!world.field_72995_K) {
                                BlockPos _bp79 = new BlockPos(x, y, z);
                                TileEntity _tileEntity79 = world.func_175625_s(_bp79);
                                IBlockState _bs79 = world.func_180495_p(_bp79);
                                if (_tileEntity79 != null) {
                                    _tileEntity79.getTileData().func_74780_a("扣除耐久", 350.0d);
                                }
                                world.func_184138_a(_bp79, _bs79, _bs79, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp80 = new BlockPos(x, y, z);
                                TileEntity _tileEntity80 = world.func_175625_s(_bp80);
                                IBlockState _bs80 = world.func_180495_p(_bp80);
                                if (_tileEntity80 != null) {
                                    _tileEntity80.getTileData().func_74780_a("leixing", 51.0d);
                                }
                                world.func_184138_a(_bp80, _bs80, _bs80, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp81 = new BlockPos(x, y, z);
                                TileEntity _tileEntity81 = world.func_175625_s(_bp81);
                                IBlockState _bs81 = world.func_180495_p(_bp81);
                                if (_tileEntity81 != null) {
                                    _tileEntity81.getTileData().func_74780_a("扣除灵力", 220.0d);
                                }
                                world.func_184138_a(_bp81, _bs81, _bs81, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp82 = new BlockPos(x, y, z);
                                TileEntity _tileEntity82 = world.func_175625_s(_bp82);
                                IBlockState _bs82 = world.func_180495_p(_bp82);
                                if (_tileEntity82 != null) {
                                    _tileEntity82.getTileData().func_74780_a("fulujingyan", 625.0d);
                                }
                                world.func_184138_a(_bp82, _bs82, _bs82, 3);
                            }
                            $_dependencies.put("entity", entityPlayer);
                            $_dependencies.put("x", Integer.valueOf(x));
                            $_dependencies.put("y", Integer.valueOf(y));
                            $_dependencies.put("z", Integer.valueOf(z));
                            $_dependencies.put("world", world);
                            ProcedureLingLiCut.executeProcedure($_dependencies);
                            return;
                        }
                    }
                    if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.83
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:lei_ji_mu_jian")) {
                        if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.84
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.85
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.86
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77958_k() - new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.87
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77952_i() >= 250) {
                            if (!world.field_72995_K) {
                                BlockPos _bp83 = new BlockPos(x, y, z);
                                TileEntity _tileEntity83 = world.func_175625_s(_bp83);
                                IBlockState _bs83 = world.func_180495_p(_bp83);
                                if (_tileEntity83 != null) {
                                    _tileEntity83.getTileData().func_74780_a("扣除耐久", 250.0d);
                                }
                                world.func_184138_a(_bp83, _bs83, _bs83, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp84 = new BlockPos(x, y, z);
                                TileEntity _tileEntity84 = world.func_175625_s(_bp84);
                                IBlockState _bs84 = world.func_180495_p(_bp84);
                                if (_tileEntity84 != null) {
                                    _tileEntity84.getTileData().func_74780_a("leixing", 52.0d);
                                }
                                world.func_184138_a(_bp84, _bs84, _bs84, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp85 = new BlockPos(x, y, z);
                                TileEntity _tileEntity85 = world.func_175625_s(_bp85);
                                IBlockState _bs85 = world.func_180495_p(_bp85);
                                if (_tileEntity85 != null) {
                                    _tileEntity85.getTileData().func_74780_a("扣除灵力", 220.0d);
                                }
                                world.func_184138_a(_bp85, _bs85, _bs85, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp86 = new BlockPos(x, y, z);
                                TileEntity _tileEntity86 = world.func_175625_s(_bp86);
                                IBlockState _bs86 = world.func_180495_p(_bp86);
                                if (_tileEntity86 != null) {
                                    _tileEntity86.getTileData().func_74780_a("fulujingyan", 312.0d);
                                }
                                world.func_184138_a(_bp86, _bs86, _bs86, 3);
                            }
                            $_dependencies.put("entity", entityPlayer);
                            $_dependencies.put("x", Integer.valueOf(x));
                            $_dependencies.put("y", Integer.valueOf(y));
                            $_dependencies.put("z", Integer.valueOf(z));
                            $_dependencies.put("world", world);
                            ProcedureLingLiCut.executeProcedure($_dependencies);
                            return;
                        }
                    }
                    if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.88
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao32")) {
                        if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.89
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.90
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.91
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77958_k() - new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.92
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77952_i() >= 250) {
                            if (!world.field_72995_K) {
                                BlockPos _bp87 = new BlockPos(x, y, z);
                                TileEntity _tileEntity87 = world.func_175625_s(_bp87);
                                IBlockState _bs87 = world.func_180495_p(_bp87);
                                if (_tileEntity87 != null) {
                                    _tileEntity87.getTileData().func_74780_a("扣除耐久", 250.0d);
                                }
                                world.func_184138_a(_bp87, _bs87, _bs87, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp88 = new BlockPos(x, y, z);
                                TileEntity _tileEntity88 = world.func_175625_s(_bp88);
                                IBlockState _bs88 = world.func_180495_p(_bp88);
                                if (_tileEntity88 != null) {
                                    _tileEntity88.getTileData().func_74780_a("leixing", 53.0d);
                                }
                                world.func_184138_a(_bp88, _bs88, _bs88, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp89 = new BlockPos(x, y, z);
                                TileEntity _tileEntity89 = world.func_175625_s(_bp89);
                                IBlockState _bs89 = world.func_180495_p(_bp89);
                                if (_tileEntity89 != null) {
                                    _tileEntity89.getTileData().func_74780_a("扣除灵力", 220.0d);
                                }
                                world.func_184138_a(_bp89, _bs89, _bs89, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp90 = new BlockPos(x, y, z);
                                TileEntity _tileEntity90 = world.func_175625_s(_bp90);
                                IBlockState _bs90 = world.func_180495_p(_bp90);
                                if (_tileEntity90 != null) {
                                    _tileEntity90.getTileData().func_74780_a("fulujingyan", 312.0d);
                                }
                                world.func_184138_a(_bp90, _bs90, _bs90, 3);
                            }
                            $_dependencies.put("entity", entityPlayer);
                            $_dependencies.put("x", Integer.valueOf(x));
                            $_dependencies.put("y", Integer.valueOf(y));
                            $_dependencies.put("z", Integer.valueOf(z));
                            $_dependencies.put("world", world);
                            ProcedureLingLiCut.executeProcedure($_dependencies);
                            return;
                        }
                    }
                    if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.93
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao0501")) {
                        if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.94
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.95
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 1.0d && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.96
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77958_k() - new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.97
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77952_i() >= 250) {
                            if (!world.field_72995_K) {
                                BlockPos _bp91 = new BlockPos(x, y, z);
                                TileEntity _tileEntity91 = world.func_175625_s(_bp91);
                                IBlockState _bs91 = world.func_180495_p(_bp91);
                                if (_tileEntity91 != null) {
                                    _tileEntity91.getTileData().func_74780_a("扣除耐久", 250.0d);
                                }
                                world.func_184138_a(_bp91, _bs91, _bs91, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp92 = new BlockPos(x, y, z);
                                TileEntity _tileEntity92 = world.func_175625_s(_bp92);
                                IBlockState _bs92 = world.func_180495_p(_bp92);
                                if (_tileEntity92 != null) {
                                    _tileEntity92.getTileData().func_74780_a("leixing", 54.0d);
                                }
                                world.func_184138_a(_bp92, _bs92, _bs92, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp93 = new BlockPos(x, y, z);
                                TileEntity _tileEntity93 = world.func_175625_s(_bp93);
                                IBlockState _bs93 = world.func_180495_p(_bp93);
                                if (_tileEntity93 != null) {
                                    _tileEntity93.getTileData().func_74780_a("扣除灵力", 220.0d);
                                }
                                world.func_184138_a(_bp93, _bs93, _bs93, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp94 = new BlockPos(x, y, z);
                                TileEntity _tileEntity94 = world.func_175625_s(_bp94);
                                IBlockState _bs94 = world.func_180495_p(_bp94);
                                if (_tileEntity94 != null) {
                                    _tileEntity94.getTileData().func_74780_a("fulujingyan", 312.0d);
                                }
                                world.func_184138_a(_bp94, _bs94, _bs94, 3);
                            }
                            $_dependencies.put("entity", entityPlayer);
                            $_dependencies.put("x", Integer.valueOf(x));
                            $_dependencies.put("y", Integer.valueOf(y));
                            $_dependencies.put("z", Integer.valueOf(z));
                            $_dependencies.put("world", world);
                            ProcedureLingLiCut.executeProcedure($_dependencies);
                            return;
                        }
                    }
                    if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.98
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:fabao1401")) {
                        if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.99
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.100
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("类型") : -1.0d) == 2.0d && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.101
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77958_k() - new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.102
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 4).func_77952_i() >= 350) {
                            if (!world.field_72995_K) {
                                BlockPos _bp95 = new BlockPos(x, y, z);
                                TileEntity _tileEntity95 = world.func_175625_s(_bp95);
                                IBlockState _bs95 = world.func_180495_p(_bp95);
                                if (_tileEntity95 != null) {
                                    _tileEntity95.getTileData().func_74780_a("扣除耐久", 350.0d);
                                }
                                world.func_184138_a(_bp95, _bs95, _bs95, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp96 = new BlockPos(x, y, z);
                                TileEntity _tileEntity96 = world.func_175625_s(_bp96);
                                IBlockState _bs96 = world.func_180495_p(_bp96);
                                if (_tileEntity96 != null) {
                                    _tileEntity96.getTileData().func_74780_a("leixing", 55.0d);
                                }
                                world.func_184138_a(_bp96, _bs96, _bs96, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp97 = new BlockPos(x, y, z);
                                TileEntity _tileEntity97 = world.func_175625_s(_bp97);
                                IBlockState _bs97 = world.func_180495_p(_bp97);
                                if (_tileEntity97 != null) {
                                    _tileEntity97.getTileData().func_74780_a("扣除灵力", 220.0d);
                                }
                                world.func_184138_a(_bp97, _bs97, _bs97, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp98 = new BlockPos(x, y, z);
                                TileEntity _tileEntity98 = world.func_175625_s(_bp98);
                                IBlockState _bs98 = world.func_180495_p(_bp98);
                                if (_tileEntity98 != null) {
                                    _tileEntity98.getTileData().func_74780_a("fulujingyan", 625.0d);
                                }
                                world.func_184138_a(_bp98, _bs98, _bs98, 3);
                            }
                            $_dependencies.put("entity", entityPlayer);
                            $_dependencies.put("x", Integer.valueOf(x));
                            $_dependencies.put("y", Integer.valueOf(y));
                            $_dependencies.put("z", Integer.valueOf(z));
                            $_dependencies.put("world", world);
                            ProcedureLingLiCut.executeProcedure($_dependencies);
                            return;
                        }
                    }
                    if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.103
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCloudMapCharm4.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.104
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureHuaHuPiPei.105
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                        if (!world.field_72995_K) {
                            BlockPos _bp99 = new BlockPos(x, y, z);
                            TileEntity _tileEntity99 = world.func_175625_s(_bp99);
                            IBlockState _bs99 = world.func_180495_p(_bp99);
                            if (_tileEntity99 != null) {
                                _tileEntity99.getTileData().func_74780_a("leixing", 105.0d);
                            }
                            world.func_184138_a(_bp99, _bs99, _bs99, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp100 = new BlockPos(x, y, z);
                            TileEntity _tileEntity100 = world.func_175625_s(_bp100);
                            IBlockState _bs100 = world.func_180495_p(_bp100);
                            if (_tileEntity100 != null) {
                                _tileEntity100.getTileData().func_74780_a("扣除灵力", 220.0d);
                            }
                            world.func_184138_a(_bp100, _bs100, _bs100, 3);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp101 = new BlockPos(x, y, z);
                            TileEntity _tileEntity101 = world.func_175625_s(_bp101);
                            IBlockState _bs101 = world.func_180495_p(_bp101);
                            if (_tileEntity101 != null) {
                                _tileEntity101.getTileData().func_74780_a("fulujingyan", 313.0d);
                            }
                            world.func_184138_a(_bp101, _bs101, _bs101, 3);
                        }
                        $_dependencies.put("entity", entityPlayer);
                        $_dependencies.put("x", Integer.valueOf(x));
                        $_dependencies.put("y", Integer.valueOf(y));
                        $_dependencies.put("z", Integer.valueOf(z));
                        $_dependencies.put("world", world);
                        ProcedureLingLiCut.executeProcedure($_dependencies);
                    } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("当前欲制作五阶符箓,存在问题:法宝不匹配或法宝耐久不足以炼制"), false);
                    }
                } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("当前欲制作五阶符箓,存在问题:未达到化神期或画符等级未达到四级"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("当前欲制作五阶符箓,存在问题:没有五级符纸"), false);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("存在问题:没有符笔"), false);
        }
    }
}
