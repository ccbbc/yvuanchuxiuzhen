package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemJingChunLingYe;
import net.mcreator.yvanchuliandan.item.ItemLingYe;
import net.mcreator.yvanchuliandan.item.ItemXiaoLvPing;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureLingYe1.class */
public class ProcedureLingYe1 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureLingYe1(ElementsYvanchuliandanMod instance) {
        super(instance, 561);
    }

    /* JADX WARN: Type inference failed for: r0v111, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLingYe1$2] */
    /* JADX WARN: Type inference failed for: r0v61, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLingYe1$1] */
    /* JADX WARN: Type inference failed for: r2v5, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLingYe1$3] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("itemstack") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if ((itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("TotalTimes") : -1.0d) >= 1.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLingYe1.1
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "年份") == 2.0d || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLingYe1.2
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = worldServer.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "年份") == 1.0d) {
                if (!((World) worldServer).field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = worldServer.func_175625_s(_bp);
                    IBlockState _bs = worldServer.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("Time", 0.0d);
                    }
                    worldServer.func_184138_a(_bp, _bs, _bs, 3);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.VILLAGER_HAPPY, x, y, z, 10, 0.2d, 0.2d, 0.2d, 0.1d, new int[0]);
                }
                if (!itemstack.func_77942_o()) {
                    itemstack.func_77982_d(new NBTTagCompound());
                }
                itemstack.func_77978_p().func_74780_a("TotalTimes", (itemstack.func_77942_o() ? itemstack.func_77978_p().func_74769_h("TotalTimes") : -1.0d) - 1.0d);
                if (itemstack.func_77973_b() == new ItemStack(ItemLingYe.block, 1).func_77973_b() && !((World) worldServer).field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = worldServer.func_175625_s(_bp2);
                    IBlockState _bs2 = worldServer.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74780_a("年份", 2.0d);
                    }
                    worldServer.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
                if (itemstack.func_77973_b() == new ItemStack(ItemJingChunLingYe.block, 1).func_77973_b() && !((World) worldServer).field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = worldServer.func_175625_s(_bp3);
                    IBlockState _bs3 = worldServer.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74780_a("年份", 3.0d);
                    }
                    worldServer.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
            }
        } else if (itemstack.func_77973_b() == new ItemStack(ItemXiaoLvPing.block, 1).func_77973_b()) {
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                TileEntity _tileEntity4 = worldServer.func_175625_s(_bp4);
                IBlockState _bs4 = worldServer.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74780_a("Time", 0.0d);
                }
                worldServer.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
            if (!((World) worldServer).field_72995_K) {
                BlockPos _bp5 = new BlockPos(x, y, z);
                TileEntity _tileEntity5 = worldServer.func_175625_s(_bp5);
                IBlockState _bs5 = worldServer.func_180495_p(_bp5);
                if (_tileEntity5 != null) {
                    _tileEntity5.getTileData().func_74780_a("年份", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLingYe1.3
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = worldServer.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "年份") + 1.0d);
                }
                worldServer.func_184138_a(_bp5, _bs5, _bs5, 3);
            }
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.VILLAGER_HAPPY, x, y, z, 10, 0.2d, 0.2d, 0.2d, 0.1d, new int[0]);
            }
        }
    }
}
