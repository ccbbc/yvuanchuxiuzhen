package net.mcreator.yvanchuliandan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureLianXuLianZhiLingLiCut.class */
public class ProcedureLianXuLianZhiLingLiCut extends ElementsYvanchuliandanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLianXuLianZhiLingLiCut(ElementsYvanchuliandanMod instance) {
        super(instance, 449);
    }

    /* JADX WARN: Type inference failed for: r0v140, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$10] */
    /* JADX WARN: Type inference failed for: r0v144, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$8] */
    /* JADX WARN: Type inference failed for: r0v151, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$6] */
    /* JADX WARN: Type inference failed for: r0v158, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$4] */
    /* JADX WARN: Type inference failed for: r0v165, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$2] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$1] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$3] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$5] */
    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$7] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$9] */
    /* JADX WARN: Type inference failed for: r0v64, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$21] */
    /* JADX WARN: Type inference failed for: r0v82, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$15] */
    /* JADX WARN: Type inference failed for: r0v85, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$16] */
    /* JADX WARN: Type inference failed for: r0v88, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$18] */
    /* JADX WARN: Type inference failed for: r1v40, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$17] */
    /* JADX WARN: Type inference failed for: r1v45, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$19] */
    /* JADX WARN: Type inference failed for: r2v42, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$20] */
    /* JADX WARN: Type inference failed for: r2v53, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$14] */
    /* JADX WARN: Type inference failed for: r4v28, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$11] */
    /* JADX WARN: Type inference failed for: r5v18, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$12] */
    /* JADX WARN: Type inference failed for: r5v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut$13] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi03")) {
            ItemStack _stack = new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.2
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
            _stack.func_77978_p().func_74780_a("PowerNum", 10.0d);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.3
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi05")) {
            ItemStack _stack2 = new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.4
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
            _stack2.func_77978_p().func_74780_a("PowerNum", 1000.0d);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.5
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:ling_shi_kuai_1")) {
            ItemStack _stack3 = new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.6
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
            _stack3.func_77978_p().func_74780_a("PowerNum", 90.0d);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.7
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:ling_shi_kuai_2")) {
            ItemStack _stack4 = new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.8
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
            _stack4.func_77978_p().func_74780_a("PowerNum", 9000.0d);
        }
        if ((new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.9
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.10
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77978_p().func_74769_h("PowerNum") : -1.0d) > 0.0d) {
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74780_a("powerTemp", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.14
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.11
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "扣除灵力") / (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.12
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 0).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.13
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 0).func_77978_p().func_74769_h("PowerNum") : -1.0d))));
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.15
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "powerTemp") <= 0.0d && !world.field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74780_a("powerTemp", 1.0d);
                }
                world.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.16
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "powerTemp") > new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.17
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0)) {
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74757_a("开始炼制", false);
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.18
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "powerTemp") <= new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.19
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 0)) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    func_175625_s.func_70298_a(0, (int) new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.20
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "powerTemp"));
                }
                if (!world.field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z);
                    TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                    IBlockState _bs4 = world.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74757_a("开始炼制", true);
                    }
                    world.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
            }
        } else if (!world.field_72995_K) {
            BlockPos _bp5 = new BlockPos(x, y, z);
            TileEntity _tileEntity5 = world.func_175625_s(_bp5);
            IBlockState _bs5 = world.func_180495_p(_bp5);
            if (_tileEntity5 != null) {
                _tileEntity5.getTileData().func_74757_a("开始炼制", false);
            }
            world.func_184138_a(_bp5, _bs5, _bs5, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureLianXuLianZhiLingLiCut.21
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "开始炼制")) {
            TileEntityLockableLoot func_175625_s2 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s2 instanceof TileEntityLockableLoot) {
                func_175625_s2.func_70298_a(1, 1);
            }
            TileEntityLockableLoot func_175625_s3 = world.func_175625_s(new BlockPos(x, y, z));
            if (func_175625_s3 instanceof TileEntityLockableLoot) {
                func_175625_s3.func_70298_a(2, 1);
            }
        }
    }
}
