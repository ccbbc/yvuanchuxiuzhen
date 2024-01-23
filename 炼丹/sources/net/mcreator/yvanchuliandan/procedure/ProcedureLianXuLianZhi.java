package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureLianXuLianZhi.class */
public class ProcedureLianXuLianZhi extends ElementsYvanchuliandanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLianXuLianZhi(ElementsYvanchuliandanMod instance) {
        super(instance, 447);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhi$1] */
    /* JADX WARN: Type inference failed for: r0v48, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhi$2] */
    /* JADX WARN: Type inference failed for: r0v51, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhi$3] */
    /* JADX WARN: Type inference failed for: r0v57, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhi$5] */
    /* JADX WARN: Type inference failed for: r0v60, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhi$6] */
    /* JADX WARN: Type inference failed for: r0v63, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhi$7] */
    /* JADX WARN: Type inference failed for: r0v66, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhi$8] */
    /* JADX WARN: Type inference failed for: r0v69, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhi$9] */
    /* JADX WARN: Type inference failed for: r1v26, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhi$4] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhi.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "danluLEVEL") > 0.0d && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhi.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "huoyan") > 0.0d && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhi.3
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b().getRegistryName().toString().equals(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhi.4
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "连续炼制丹药名")) && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhi.5
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() != ItemStack.field_190927_a.func_77973_b()) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhi.6
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "danluLEVEL") >= 4.0d) {
                $_dependencies.put("world", world);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                ProcedureLianXuLianZhi5.executeProcedure($_dependencies);
            }
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhi.7
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "danluLEVEL") >= 3.0d) {
                $_dependencies.put("world", world);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                ProcedureLianXuLianZhi4.executeProcedure($_dependencies);
            }
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhi.8
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "danluLEVEL") >= 2.0d) {
                $_dependencies.put("world", world);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                ProcedureLianXuLianZhi3.executeProcedure($_dependencies);
            }
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhi.9
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "danluLEVEL") >= 1.0d) {
                $_dependencies.put("world", world);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                ProcedureLianXuLianZhi2.executeProcedure($_dependencies);
            }
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureLianXuLianZhi1.executeProcedure($_dependencies);
            return;
        }
        if (!world.field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = world.func_175625_s(_bp);
            IBlockState _bs = world.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("DanFang", 0.0d);
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (!world.field_72995_K) {
            BlockPos _bp2 = new BlockPos(x, y, z);
            TileEntity _tileEntity2 = world.func_175625_s(_bp2);
            IBlockState _bs2 = world.func_180495_p(_bp2);
            if (_tileEntity2 != null) {
                _tileEntity2.getTileData().func_74757_a("连续炼制", false);
            }
            world.func_184138_a(_bp2, _bs2, _bs2, 3);
        }
    }
}
