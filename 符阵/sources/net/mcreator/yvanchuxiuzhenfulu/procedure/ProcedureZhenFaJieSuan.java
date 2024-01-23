package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemChenHuizhen;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemChiHunLianYuZhen;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemDaXiuLianZhen;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemDianDaoWuXing;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemHuiLingZhen;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemJinJueZhen;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemLieKongZhen;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemLuoLeiZhen;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemMiZongZhen;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemProtectSectFront01;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemProtectSectFront02;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemProtectSectFront03;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemProtectSectFront04;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemProtectSectFront05;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemTianHuZhen;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemWanXiangZhen;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemWeiHuoZhen;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemXinDingZhen;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemXiuLianZhen;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemYiYiShuiJianZhen;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemYuanShuiZhen;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemZhenQi01;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemZhenQi02;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemZhenQi03;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemZhenQi04;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemZhenQi05;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemZhenYuan;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenFaJieSuan.class */
public class ProcedureZhenFaJieSuan extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhenFaJieSuan(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 396);
    }

    /* JADX WARN: Type inference failed for: r0v120, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$7] */
    /* JADX WARN: Type inference failed for: r0v123, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$10] */
    /* JADX WARN: Type inference failed for: r0v126, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$13] */
    /* JADX WARN: Type inference failed for: r0v129, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$16] */
    /* JADX WARN: Type inference failed for: r0v132, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$19] */
    /* JADX WARN: Type inference failed for: r0v135, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$22] */
    /* JADX WARN: Type inference failed for: r0v138, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$27] */
    /* JADX WARN: Type inference failed for: r0v141, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$28] */
    /* JADX WARN: Type inference failed for: r0v144, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$29] */
    /* JADX WARN: Type inference failed for: r0v147, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$30] */
    /* JADX WARN: Type inference failed for: r0v150, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$31] */
    /* JADX WARN: Type inference failed for: r0v153, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$32] */
    /* JADX WARN: Type inference failed for: r0v156, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$33] */
    /* JADX WARN: Type inference failed for: r0v159, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$34] */
    /* JADX WARN: Type inference failed for: r0v162, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$35] */
    /* JADX WARN: Type inference failed for: r0v165, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$36] */
    /* JADX WARN: Type inference failed for: r0v168, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$37] */
    /* JADX WARN: Type inference failed for: r0v171, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$38] */
    /* JADX WARN: Type inference failed for: r0v174, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$39] */
    /* JADX WARN: Type inference failed for: r0v177, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$40] */
    /* JADX WARN: Type inference failed for: r0v180, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$41] */
    /* JADX WARN: Type inference failed for: r0v183, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$42] */
    /* JADX WARN: Type inference failed for: r0v186, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$43] */
    /* JADX WARN: Type inference failed for: r0v189, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$44] */
    /* JADX WARN: Type inference failed for: r0v192, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$45] */
    /* JADX WARN: Type inference failed for: r0v195, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$46] */
    /* JADX WARN: Type inference failed for: r0v198, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$47] */
    /* JADX WARN: Type inference failed for: r0v201, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$48] */
    /* JADX WARN: Type inference failed for: r0v220, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$76] */
    /* JADX WARN: Type inference failed for: r0v261, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$77] */
    /* JADX WARN: Type inference failed for: r0v264, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$78] */
    /* JADX WARN: Type inference failed for: r0v267, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$79] */
    /* JADX WARN: Type inference failed for: r0v270, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$80] */
    /* JADX WARN: Type inference failed for: r0v273, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$83] */
    /* JADX WARN: Type inference failed for: r0v276, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$86] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$1] */
    /* JADX WARN: Type inference failed for: r0v295, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$87] */
    /* JADX WARN: Type inference failed for: r0v298, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$90] */
    /* JADX WARN: Type inference failed for: r0v301, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$93] */
    /* JADX WARN: Type inference failed for: r0v304, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$96] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$2] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$3] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$4] */
    /* JADX WARN: Type inference failed for: r0v371, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$49] */
    /* JADX WARN: Type inference failed for: r0v374, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$50] */
    /* JADX WARN: Type inference failed for: r0v377, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$51] */
    /* JADX WARN: Type inference failed for: r0v380, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$52] */
    /* JADX WARN: Type inference failed for: r0v383, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$53] */
    /* JADX WARN: Type inference failed for: r0v386, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$56] */
    /* JADX WARN: Type inference failed for: r0v389, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$59] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$5] */
    /* JADX WARN: Type inference failed for: r0v408, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$60] */
    /* JADX WARN: Type inference failed for: r0v411, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$61] */
    /* JADX WARN: Type inference failed for: r0v414, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$62] */
    /* JADX WARN: Type inference failed for: r0v417, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$63] */
    /* JADX WARN: Type inference failed for: r0v420, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$64] */
    /* JADX WARN: Type inference failed for: r0v423, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$67] */
    /* JADX WARN: Type inference failed for: r0v426, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$70] */
    /* JADX WARN: Type inference failed for: r0v429, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$73] */
    /* JADX WARN: Type inference failed for: r0v711, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$23] */
    /* JADX WARN: Type inference failed for: r0v714, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$26] */
    /* JADX WARN: Type inference failed for: r0v719, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$24] */
    /* JADX WARN: Type inference failed for: r0v725, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$25] */
    /* JADX WARN: Type inference failed for: r0v735, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$20] */
    /* JADX WARN: Type inference failed for: r0v738, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$21] */
    /* JADX WARN: Type inference failed for: r0v749, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$17] */
    /* JADX WARN: Type inference failed for: r0v752, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$18] */
    /* JADX WARN: Type inference failed for: r0v763, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$14] */
    /* JADX WARN: Type inference failed for: r0v766, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$15] */
    /* JADX WARN: Type inference failed for: r0v777, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$11] */
    /* JADX WARN: Type inference failed for: r0v780, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$12] */
    /* JADX WARN: Type inference failed for: r0v791, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$8] */
    /* JADX WARN: Type inference failed for: r0v794, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$9] */
    /* JADX WARN: Type inference failed for: r1v52, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan$6] */
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
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "类型") == 101.0d) {
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74780_a("ZhenFa", 35.0d + (entityPlayer.getEntityData().func_74769_h("ZhenFa") * 6.0d));
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "类型") == 102.0d) {
            if (!world.field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74780_a("ZhenFa", 29.0d + (entityPlayer.getEntityData().func_74769_h("ZhenFa") * 6.0d));
                }
                world.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.3
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "类型") == 103.0d) {
            if (!world.field_72995_K) {
                BlockPos _bp3 = new BlockPos(x, y, z);
                TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                IBlockState _bs3 = world.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74780_a("ZhenFa", 23.0d + (entityPlayer.getEntityData().func_74769_h("ZhenFa") * 6.0d));
                }
                world.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.4
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "类型") == 104.0d) {
            if (!world.field_72995_K) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                IBlockState _bs4 = world.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74780_a("ZhenFa", 17.0d + (entityPlayer.getEntityData().func_74769_h("ZhenFa") * 6.0d));
                }
                world.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.5
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "类型") == 105.0d) {
            if (!world.field_72995_K) {
                BlockPos _bp5 = new BlockPos(x, y, z);
                TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                IBlockState _bs5 = world.func_180495_p(_bp5);
                if (_tileEntity5 != null) {
                    _tileEntity5.getTileData().func_74780_a("ZhenFa", 11.0d + (entityPlayer.getEntityData().func_74769_h("ZhenFa") * 6.0d));
                }
                world.func_184138_a(_bp5, _bs5, _bs5, 3);
            }
        } else if (!world.field_72995_K) {
            BlockPos _bp6 = new BlockPos(x, y, z);
            TileEntity _tileEntity6 = world.func_175625_s(_bp6);
            IBlockState _bs6 = world.func_180495_p(_bp6);
            if (_tileEntity6 != null) {
                _tileEntity6.getTileData().func_74780_a("ZhenFa", 40.0d + (entityPlayer.getEntityData().func_74769_h("ZhenFa") * 6.0d));
            }
            world.func_184138_a(_bp6, _bs6, _bs6, 3);
        }
        if (new Random().nextInt(100) <= new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.6
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "ZhenFa")) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.7
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 1.0d) {
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.8
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s20 = world.func_175625_s(pos);
                        if (func_175625_s20 instanceof TileEntityLockableLoot) {
                            return func_175625_s20.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                    TileEntityLockableLoot func_175625_s20 = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s20 != null && (func_175625_s20 instanceof TileEntityLockableLoot)) {
                        ItemStack _setstack = new ItemStack(ItemZhenQi04.block, 1);
                        _setstack.func_190920_e(1);
                        func_175625_s20.func_70299_a(5, _setstack);
                    }
                } else {
                    new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.9
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s21 = world.func_175625_s(pos);
                            if (func_175625_s21 instanceof TileEntityLockableLoot) {
                                return func_175625_s21.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_190917_f(1);
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.10
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 2.0d) {
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.11
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s21 = world.func_175625_s(pos);
                        if (func_175625_s21 instanceof TileEntityLockableLoot) {
                            return func_175625_s21.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                    TileEntityLockableLoot func_175625_s21 = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s21 != null && (func_175625_s21 instanceof TileEntityLockableLoot)) {
                        ItemStack _setstack2 = new ItemStack(ItemZhenQi03.block, 1);
                        _setstack2.func_190920_e(1);
                        func_175625_s21.func_70299_a(5, _setstack2);
                    }
                } else {
                    new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.12
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s22 = world.func_175625_s(pos);
                            if (func_175625_s22 instanceof TileEntityLockableLoot) {
                                return func_175625_s22.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_190917_f(1);
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.13
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 3.0d) {
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.14
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s22 = world.func_175625_s(pos);
                        if (func_175625_s22 instanceof TileEntityLockableLoot) {
                            return func_175625_s22.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                    TileEntityLockableLoot func_175625_s22 = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s22 != null && (func_175625_s22 instanceof TileEntityLockableLoot)) {
                        ItemStack _setstack3 = new ItemStack(ItemZhenQi02.block, 1);
                        _setstack3.func_190920_e(1);
                        func_175625_s22.func_70299_a(5, _setstack3);
                    }
                } else {
                    new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.15
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s23 = world.func_175625_s(pos);
                            if (func_175625_s23 instanceof TileEntityLockableLoot) {
                                return func_175625_s23.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_190917_f(1);
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.16
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 4.0d) {
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.17
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s23 = world.func_175625_s(pos);
                        if (func_175625_s23 instanceof TileEntityLockableLoot) {
                            return func_175625_s23.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                    TileEntityLockableLoot func_175625_s23 = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s23 != null && (func_175625_s23 instanceof TileEntityLockableLoot)) {
                        ItemStack _setstack4 = new ItemStack(ItemZhenQi01.block, 1);
                        _setstack4.func_190920_e(1);
                        func_175625_s23.func_70299_a(5, _setstack4);
                    }
                } else {
                    new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.18
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s24 = world.func_175625_s(pos);
                            if (func_175625_s24 instanceof TileEntityLockableLoot) {
                                return func_175625_s24.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_190917_f(1);
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.19
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 5.0d) {
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.20
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s24 = world.func_175625_s(pos);
                        if (func_175625_s24 instanceof TileEntityLockableLoot) {
                            return func_175625_s24.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                    TileEntityLockableLoot func_175625_s24 = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s24 != null && (func_175625_s24 instanceof TileEntityLockableLoot)) {
                        ItemStack _setstack5 = new ItemStack(ItemZhenQi05.block, 1);
                        _setstack5.func_190920_e(1);
                        func_175625_s24.func_70299_a(5, _setstack5);
                    }
                } else {
                    new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.21
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s25 = world.func_175625_s(pos);
                            if (func_175625_s25 instanceof TileEntityLockableLoot) {
                                return func_175625_s25.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_190917_f(1);
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.22
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 6.0d) {
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.23
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s25 = world.func_175625_s(pos);
                        if (func_175625_s25 instanceof TileEntityLockableLoot) {
                            return func_175625_s25.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                    TileEntityLockableLoot func_175625_s25 = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s25 != null && (func_175625_s25 instanceof TileEntityLockableLoot)) {
                        ItemStack _setstack6 = new ItemStack(ItemZhenYuan.block, 1);
                        _setstack6.func_190920_e(1);
                        func_175625_s25.func_70299_a(5, _setstack6);
                    }
                    ItemStack _stack = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.24
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s26 = world.func_175625_s(pos);
                            if (func_175625_s26 instanceof TileEntityLockableLoot) {
                                return func_175625_s26.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5);
                    if (!_stack.func_77942_o()) {
                        _stack.func_77982_d(new NBTTagCompound());
                    }
                    _stack.func_77978_p().func_74778_a("所有者", entityPlayer.func_145748_c_().func_150260_c());
                    new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.25
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s26 = world.func_175625_s(pos);
                            if (func_175625_s26 instanceof TileEntityLockableLoot) {
                                return func_175625_s26.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_151001_c(entityPlayer.func_145748_c_().func_150260_c() + "的阵元");
                } else {
                    new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.26
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s26 = world.func_175625_s(pos);
                            if (func_175625_s26 instanceof TileEntityLockableLoot) {
                                return func_175625_s26.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 5).func_190917_f(1);
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.27
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 11.0d) {
                TileEntityLockableLoot func_175625_s26 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s26 != null && (func_175625_s26 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack7 = new ItemStack(ItemXiuLianZhen.block, 1);
                    _setstack7.func_190920_e(1);
                    func_175625_s26.func_70299_a(5, _setstack7);
                }
                if (entityPlayer instanceof EntityPlayer) {
                    Scoreboard _sc = entityPlayer.func_96123_co();
                    ScoreObjective _so = _sc.func_96518_b("xiulianzhen");
                    if (_so == null) {
                        _so = _sc.func_96535_a("xiulianzhen", ScoreCriteria.field_96641_b);
                    }
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    _scr.func_96647_c(1);
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.28
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 12.0d && (func_175625_s19 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s19 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack8 = new ItemStack(ItemTianHuZhen.block, 1);
                _setstack8.func_190920_e(1);
                func_175625_s19.func_70299_a(5, _setstack8);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.29
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 13.0d && (func_175625_s18 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s18 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack9 = new ItemStack(ItemChenHuizhen.block, 1);
                _setstack9.func_190920_e(1);
                func_175625_s18.func_70299_a(5, _setstack9);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.30
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 14.0d && (func_175625_s17 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s17 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack10 = new ItemStack(ItemHuiLingZhen.block, 1);
                _setstack10.func_190920_e(1);
                func_175625_s17.func_70299_a(5, _setstack10);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.31
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 15.0d && (func_175625_s16 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s16 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack11 = new ItemStack(ItemLieKongZhen.block, 1);
                _setstack11.func_190920_e(1);
                func_175625_s16.func_70299_a(5, _setstack11);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.32
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 16.0d && (func_175625_s15 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s15 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack12 = new ItemStack(ItemMiZongZhen.block, 1);
                _setstack12.func_190920_e(1);
                func_175625_s15.func_70299_a(5, _setstack12);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.33
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 17.0d && (func_175625_s14 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s14 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack13 = new ItemStack(ItemJinJueZhen.block, 1);
                _setstack13.func_190920_e(1);
                func_175625_s14.func_70299_a(5, _setstack13);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.34
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 18.0d && (func_175625_s13 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s13 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack14 = new ItemStack(ItemLuoLeiZhen.block, 1);
                _setstack14.func_190920_e(1);
                func_175625_s13.func_70299_a(5, _setstack14);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.35
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 19.0d) {
                TileEntityLockableLoot func_175625_s27 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s27 != null && (func_175625_s27 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack15 = new ItemStack(ItemDaXiuLianZhen.block, 1);
                    _setstack15.func_190920_e(1);
                    func_175625_s27.func_70299_a(5, _setstack15);
                }
                if (entityPlayer instanceof EntityPlayer) {
                    Scoreboard _sc2 = entityPlayer.func_96123_co();
                    ScoreObjective _so2 = _sc2.func_96518_b("daxiulianzhen");
                    if (_so2 == null) {
                        _so2 = _sc2.func_96535_a("daxiulianzhen", ScoreCriteria.field_96641_b);
                    }
                    Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                    _scr2.func_96647_c(1);
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.36
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 20.0d && (func_175625_s12 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s12 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack16 = new ItemStack(ItemYuanShuiZhen.block, 1);
                _setstack16.func_190920_e(1);
                func_175625_s12.func_70299_a(5, _setstack16);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.37
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 21.0d && (func_175625_s11 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s11 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack17 = new ItemStack(ItemWeiHuoZhen.block, 1);
                _setstack17.func_190920_e(1);
                func_175625_s11.func_70299_a(5, _setstack17);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.38
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 22.0d && (func_175625_s10 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s10 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack18 = new ItemStack(ItemXinDingZhen.block, 1);
                _setstack18.func_190920_e(1);
                func_175625_s10.func_70299_a(5, _setstack18);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.39
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 23.0d && (func_175625_s9 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s9 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack19 = new ItemStack(ItemWanXiangZhen.block, 1);
                _setstack19.func_190920_e(1);
                func_175625_s9.func_70299_a(5, _setstack19);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.40
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 24.0d && (func_175625_s8 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s8 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack20 = new ItemStack(ItemYiYiShuiJianZhen.block, 1);
                _setstack20.func_190920_e(1);
                func_175625_s8.func_70299_a(5, _setstack20);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.41
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 25.0d && (func_175625_s7 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s7 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack21 = new ItemStack(ItemChiHunLianYuZhen.block, 1);
                _setstack21.func_190920_e(1);
                func_175625_s7.func_70299_a(5, _setstack21);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.42
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 26.0d && (func_175625_s6 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s6 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack22 = new ItemStack(ItemDianDaoWuXing.block, 1);
                _setstack22.func_190920_e(1);
                func_175625_s6.func_70299_a(5, _setstack22);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.43
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 101.0d && (func_175625_s5 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s5 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack23 = new ItemStack(ItemProtectSectFront01.block, 1);
                _setstack23.func_190920_e(1);
                func_175625_s5.func_70299_a(5, _setstack23);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.44
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 102.0d && (func_175625_s4 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s4 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack24 = new ItemStack(ItemProtectSectFront02.block, 1);
                _setstack24.func_190920_e(1);
                func_175625_s4.func_70299_a(5, _setstack24);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.45
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 103.0d && (func_175625_s3 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s3 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack25 = new ItemStack(ItemProtectSectFront03.block, 1);
                _setstack25.func_190920_e(1);
                func_175625_s3.func_70299_a(5, _setstack25);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.46
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 104.0d && (func_175625_s2 = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s2 instanceof TileEntityLockableLoot)) {
                ItemStack _setstack26 = new ItemStack(ItemProtectSectFront04.block, 1);
                _setstack26.func_190920_e(1);
                func_175625_s2.func_70299_a(5, _setstack26);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.47
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 105.0d && (func_175625_s = world.func_175625_s(new BlockPos(x, y, z))) != null && (func_175625_s instanceof TileEntityLockableLoot)) {
                ItemStack _setstack27 = new ItemStack(ItemProtectSectFront05.block, 1);
                _setstack27.func_190920_e(1);
                func_175625_s.func_70299_a(5, _setstack27);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.48
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 1.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.49
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 2.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.50
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 3.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.51
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 4.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.52
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 5.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.53
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 6.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.54
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
                    }, "scoreboard players set " + entityPlayer.func_145748_c_().func_150260_c() + " 经验开关 1");
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.55
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + entityPlayer.func_145748_c_().func_150260_c() + "] ~ ~ ~ yuanchuxp zhenfa 3\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.56
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 11.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.57
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
                    }, "scoreboard players set " + entityPlayer.func_145748_c_().func_150260_c() + " 经验开关 1");
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.58
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + entityPlayer.func_145748_c_().func_150260_c() + "] ~ ~ ~ yuanchuxp zhenfa 20\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.59
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 12.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.60
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 13.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.61
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 14.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.62
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 26.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.63
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 15.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.64
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 16.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.65
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
                    }, "scoreboard players set " + entityPlayer.func_145748_c_().func_150260_c() + " 经验开关 1");
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.66
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + entityPlayer.func_145748_c_().func_150260_c() + "] ~ ~ ~ yuanchuxp zhenfa 15\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.67
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 17.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.68
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
                    }, "scoreboard players set " + entityPlayer.func_145748_c_().func_150260_c() + " 经验开关 1");
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.69
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + entityPlayer.func_145748_c_().func_150260_c() + "] ~ ~ ~ yuanchuxp zhenfa 75\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.70
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 18.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.71
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
                    }, "scoreboard players set " + entityPlayer.func_145748_c_().func_150260_c() + " 经验开关 1");
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.72
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + entityPlayer.func_145748_c_().func_150260_c() + "] ~ ~ ~ yuanchuxp zhenfa 375\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.73
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 19.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.74
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
                    }, "scoreboard players set " + entityPlayer.func_145748_c_().func_150260_c() + " 经验开关 1");
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.75
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + entityPlayer.func_145748_c_().func_150260_c() + "] ~ ~ ~ yuanchuxp zhenfa 488\",CustomNameVisible:0b}");
                }
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.76
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 20.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.77
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 21.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.78
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 22.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.79
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 23.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.80
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 25.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.81
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
                    }, "scoreboard players set " + entityPlayer.func_145748_c_().func_150260_c() + " 经验开关 1");
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.82
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + entityPlayer.func_145748_c_().func_150260_c() + "] ~ ~ ~ yuanchuxp zhenfa 375\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.83
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 24.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.84
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
                    }, "scoreboard players set " + entityPlayer.func_145748_c_().func_150260_c() + " 经验开关 1");
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.85
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + entityPlayer.func_145748_c_().func_150260_c() + "] ~ ~ ~ yuanchuxp zhenfa 576\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.86
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 101.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.87
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 102.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.88
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
                    }, "scoreboard players set " + entityPlayer.func_145748_c_().func_150260_c() + " 经验开关 1");
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.89
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + entityPlayer.func_145748_c_().func_150260_c() + "] ~ ~ ~ yuanchuxp zhenfa 15\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.90
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 103.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.91
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
                    }, "scoreboard players set " + entityPlayer.func_145748_c_().func_150260_c() + " 经验开关 1");
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.92
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + entityPlayer.func_145748_c_().func_150260_c() + "] ~ ~ ~ yuanchuxp zhenfa 75\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.93
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 104.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.94
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
                    }, "scoreboard players set " + entityPlayer.func_145748_c_().func_150260_c() + " 经验开关 1");
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.95
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + entityPlayer.func_145748_c_().func_150260_c() + "] ~ ~ ~ yuanchuxp zhenfa 375\",CustomNameVisible:0b}");
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.96
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "类型") == 105.0d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.97
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
                    }, "scoreboard players set " + entityPlayer.func_145748_c_().func_150260_c() + " 经验开关 1");
                }
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaJieSuan.98
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
                    }, "summon fabaokuozhan:injury_executor ~ ~1 ~ {CustomName:\"execute @e[name=" + entityPlayer.func_145748_c_().func_150260_c() + "] ~ ~ ~ yuanchuxp zhenfa 576\",CustomNameVisible:0b}");
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp7 = new BlockPos(x, y, z);
                TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                IBlockState _bs7 = world.func_180495_p(_bp7);
                if (_tileEntity7 != null) {
                    _tileEntity7.getTileData().func_74757_a("kaishi", false);
                }
                world.func_184138_a(_bp7, _bs7, _bs7, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp8 = new BlockPos(x, y, z);
                TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                IBlockState _bs8 = world.func_180495_p(_bp8);
                if (_tileEntity8 != null) {
                    _tileEntity8.getTileData().func_74780_a("类型", 0.0d);
                }
                world.func_184138_a(_bp8, _bs8, _bs8, 3);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("阵法制作失败了~"), false);
        }
        if (!world.field_72995_K) {
            BlockPos _bp9 = new BlockPos(x, y, z);
            TileEntity _tileEntity9 = world.func_175625_s(_bp9);
            IBlockState _bs9 = world.func_180495_p(_bp9);
            if (_tileEntity9 != null) {
                _tileEntity9.getTileData().func_74780_a("ZhenFa", 0.0d);
            }
            world.func_184138_a(_bp9, _bs9, _bs9, 3);
        }
    }
}
