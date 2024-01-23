package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureSectJobLevelSet.class */
public class ProcedureSectJobLevelSet extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSectJobLevelSet(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 529);
    }

    /* JADX WARN: Type inference failed for: r0v104, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$47] */
    /* JADX WARN: Type inference failed for: r0v110, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$49] */
    /* JADX WARN: Type inference failed for: r0v116, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$51] */
    /* JADX WARN: Type inference failed for: r0v185, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$28] */
    /* JADX WARN: Type inference failed for: r0v188, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$29] */
    /* JADX WARN: Type inference failed for: r0v193, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$32] */
    /* JADX WARN: Type inference failed for: r0v199, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$34] */
    /* JADX WARN: Type inference failed for: r0v205, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$36] */
    /* JADX WARN: Type inference failed for: r0v265, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$16] */
    /* JADX WARN: Type inference failed for: r0v270, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$19] */
    /* JADX WARN: Type inference failed for: r0v276, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$21] */
    /* JADX WARN: Type inference failed for: r0v282, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$23] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$1] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$3] */
    /* JADX WARN: Type inference failed for: r0v366, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$10] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$5] */
    /* JADX WARN: Type inference failed for: r0v403, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$4] */
    /* JADX WARN: Type inference failed for: r0v407, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$2] */
    /* JADX WARN: Type inference failed for: r0v63, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$8] */
    /* JADX WARN: Type inference failed for: r0v66, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$9] */
    /* JADX WARN: Type inference failed for: r0v69, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$11] */
    /* JADX WARN: Type inference failed for: r0v83, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$13] */
    /* JADX WARN: Type inference failed for: r0v86, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$15] */
    /* JADX WARN: Type inference failed for: r0v89, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$27] */
    /* JADX WARN: Type inference failed for: r0v99, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$41] */
    /* JADX WARN: Type inference failed for: r1v28, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$7] */
    /* JADX WARN: Type inference failed for: r1v38, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$12] */
    /* JADX WARN: Type inference failed for: r1v47, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$14] */
    /* JADX WARN: Type inference failed for: r2v102, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$42] */
    /* JADX WARN: Type inference failed for: r2v107, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$43] */
    /* JADX WARN: Type inference failed for: r2v116, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$40] */
    /* JADX WARN: Type inference failed for: r2v128, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$33] */
    /* JADX WARN: Type inference failed for: r2v13, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$6] */
    /* JADX WARN: Type inference failed for: r2v133, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$35] */
    /* JADX WARN: Type inference failed for: r2v138, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$37] */
    /* JADX WARN: Type inference failed for: r2v152, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$39] */
    /* JADX WARN: Type inference failed for: r2v160, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$38] */
    /* JADX WARN: Type inference failed for: r2v168, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$30] */
    /* JADX WARN: Type inference failed for: r2v173, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$31] */
    /* JADX WARN: Type inference failed for: r2v183, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$20] */
    /* JADX WARN: Type inference failed for: r2v188, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$22] */
    /* JADX WARN: Type inference failed for: r2v193, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$24] */
    /* JADX WARN: Type inference failed for: r2v217, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$26] */
    /* JADX WARN: Type inference failed for: r2v225, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$25] */
    /* JADX WARN: Type inference failed for: r2v233, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$17] */
    /* JADX WARN: Type inference failed for: r2v238, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$18] */
    /* JADX WARN: Type inference failed for: r2v58, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$48] */
    /* JADX WARN: Type inference failed for: r2v63, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$50] */
    /* JADX WARN: Type inference failed for: r2v68, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$52] */
    /* JADX WARN: Type inference failed for: r2v82, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$53] */
    /* JADX WARN: Type inference failed for: r3v57, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$44] */
    /* JADX WARN: Type inference failed for: r3v60, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$45] */
    /* JADX WARN: Type inference failed for: r3v67, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet$46] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.2
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74767_n("SectJobGetCool")) {
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74778_a("SectGuiTip", "§4§l今日已任职");
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
                return;
            }
            return;
        }
        if ((new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.3
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.4
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("Master") : "").equals("")) {
            if (!world.field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74778_a("SectGuiTip", "§4§l无效令牌");
                }
                world.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.5
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b().getRegistryName().toString().contains("sect_token")) {
            String SectJobX = "SectJob" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.6
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "SectJobLevel"));
            String SectJobLevel = new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.7
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "SectJobLevel"));
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.8
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "SectLimit" + SectJobLevel) <= 0.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74778_a("SectGuiTip", "§4§l尚未开启");
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
            } else if (!new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.9
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "SectJob6").equals("") && entity.getEntityData().func_74769_h("SectJobLevel") < 6.0d && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.10
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "SectJobLevel") + 1.0d > entity.getEntityData().func_74769_h("SectJobLevel")) {
                if (!world.field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z);
                    TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                    IBlockState _bs4 = world.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74778_a("SectGuiTip", "§4§l权限不足");
                    }
                    world.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.11
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "SectStaffNum") >= new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.12
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "SectLimit") || new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.13
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "SectStaffNum" + SectJobLevel) >= new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.14
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "SectLimit" + SectJobLevel)) {
                if (!world.field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y, z);
                    TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                    IBlockState _bs5 = world.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74778_a("SectGuiTip", "§4§l已达上限");
                    }
                    world.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.15
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "SectJobLevel") == 6.0d && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.16
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "SectJob6").equals("")) {
                if (!world.field_72995_K) {
                    BlockPos _bp6 = new BlockPos(x, y, z);
                    TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                    IBlockState _bs6 = world.func_180495_p(_bp6);
                    if (_tileEntity6 != null) {
                        _tileEntity6.getTileData().func_74778_a("SectJob6", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.17
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.18
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("Master") : "");
                    }
                    world.func_184138_a(_bp6, _bs6, _bs6, 3);
                }
                ItemStack _stack = new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.19
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
                _stack.func_77978_p().func_74780_a("SectJobLevel", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.20
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "SectJobLevel"));
                ItemStack _stack2 = new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.21
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
                _stack2.func_77978_p().func_74780_a("SectLevel", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.22
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "SectLevel"));
                ItemStack _stack3 = new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.23
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
                _stack3.func_77978_p().func_74778_a("SectMaster", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.24
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "SectJob6"));
                if (!world.field_72995_K) {
                    BlockPos _bp7 = new BlockPos(x, y, z);
                    TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                    IBlockState _bs7 = world.func_180495_p(_bp7);
                    if (_tileEntity7 != null) {
                        _tileEntity7.getTileData().func_74780_a("SectStaffNum" + SectJobLevel, new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.25
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectStaffNum" + SectJobLevel) + 1.0d);
                    }
                    world.func_184138_a(_bp7, _bs7, _bs7, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp8 = new BlockPos(x, y, z);
                    TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                    IBlockState _bs8 = world.func_180495_p(_bp8);
                    if (_tileEntity8 != null) {
                        _tileEntity8.getTileData().func_74780_a("SectStaffNum", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.26
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectStaffNum") + 1.0d);
                    }
                    world.func_184138_a(_bp8, _bs8, _bs8, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp9 = new BlockPos(x, y, z);
                    TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                    IBlockState _bs9 = world.func_180495_p(_bp9);
                    if (_tileEntity9 != null) {
                        _tileEntity9.getTileData().func_74778_a("SectGuiTip", "§2§l任命成功");
                    }
                    world.func_184138_a(_bp9, _bs9, _bs9, 3);
                }
                $_dependencies.put("world", world);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                ProcedureZsbGuiReplaceItem.executeProcedure($_dependencies);
                if (!world.field_72995_K) {
                    BlockPos _bp10 = new BlockPos(x, y, z);
                    TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                    IBlockState _bs10 = world.func_180495_p(_bp10);
                    if (_tileEntity10 != null) {
                        _tileEntity10.getTileData().func_74780_a("SectJobLevel", 1.0d);
                    }
                    world.func_184138_a(_bp10, _bs10, _bs10, 3);
                }
                $_dependencies.put("world", world);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                ProcedureSectJobUpdate.executeProcedure($_dependencies);
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.27
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "SectLevel") > 2.0d && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.28
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "SectJobLevel") == 5.0d && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.29
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "SectJob5").equals("")) {
                if (!world.field_72995_K) {
                    BlockPos _bp11 = new BlockPos(x, y, z);
                    TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                    IBlockState _bs11 = world.func_180495_p(_bp11);
                    if (_tileEntity11 != null) {
                        _tileEntity11.getTileData().func_74778_a("SectJob5", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.30
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.31
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("Master") : "");
                    }
                    world.func_184138_a(_bp11, _bs11, _bs11, 3);
                }
                ItemStack _stack4 = new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.32
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
                _stack4.func_77978_p().func_74780_a("SectJobLevel", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.33
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "SectJobLevel"));
                ItemStack _stack5 = new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.34
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1);
                if (!_stack5.func_77942_o()) {
                    _stack5.func_77982_d(new NBTTagCompound());
                }
                _stack5.func_77978_p().func_74780_a("SectLevel", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.35
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "SectLevel"));
                ItemStack _stack6 = new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.36
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1);
                if (!_stack6.func_77942_o()) {
                    _stack6.func_77982_d(new NBTTagCompound());
                }
                _stack6.func_77978_p().func_74778_a("SectMaster", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.37
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "SectJob6"));
                if (!world.field_72995_K) {
                    BlockPos _bp12 = new BlockPos(x, y, z);
                    TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                    IBlockState _bs12 = world.func_180495_p(_bp12);
                    if (_tileEntity12 != null) {
                        _tileEntity12.getTileData().func_74780_a("SectStaffNum" + SectJobLevel, new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.38
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectStaffNum" + SectJobLevel) + 1.0d);
                    }
                    world.func_184138_a(_bp12, _bs12, _bs12, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp13 = new BlockPos(x, y, z);
                    TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                    IBlockState _bs13 = world.func_180495_p(_bp13);
                    if (_tileEntity13 != null) {
                        _tileEntity13.getTileData().func_74780_a("SectStaffNum", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.39
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectStaffNum") + 1.0d);
                    }
                    world.func_184138_a(_bp13, _bs13, _bs13, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp14 = new BlockPos(x, y, z);
                    TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                    IBlockState _bs14 = world.func_180495_p(_bp14);
                    if (_tileEntity14 != null) {
                        _tileEntity14.getTileData().func_74778_a("SectGuiTip", "§2§l任命成功");
                    }
                    world.func_184138_a(_bp14, _bs14, _bs14, 3);
                }
                $_dependencies.put("world", world);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                ProcedureZsbGuiReplaceItem.executeProcedure($_dependencies);
            } else {
                if (!world.field_72995_K) {
                    BlockPos _bp15 = new BlockPos(x, y, z);
                    TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                    IBlockState _bs15 = world.func_180495_p(_bp15);
                    if (_tileEntity15 != null) {
                        _tileEntity15.getTileData().func_74780_a("SectStaffNum" + SectJobLevel, new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.40
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectStaffNum" + SectJobLevel) + 1.0d);
                    }
                    world.func_184138_a(_bp15, _bs15, _bs15, 3);
                }
                String SectJobX_X = SectJobX + "All";
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.41
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "SectStaffNum" + SectJobLevel) == 1.0d && !world.field_72995_K) {
                    BlockPos _bp16 = new BlockPos(x, y, z);
                    TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                    IBlockState _bs16 = world.func_180495_p(_bp16);
                    if (_tileEntity16 != null) {
                        _tileEntity16.getTileData().func_74778_a("SectJob" + SectJobLevel, new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.42
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.43
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("Master") : "");
                    }
                    world.func_184138_a(_bp16, _bs16, _bs16, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp17 = new BlockPos(x, y, z);
                    TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                    IBlockState _bs17 = world.func_180495_p(_bp17);
                    if (_tileEntity17 != null) {
                        _tileEntity17.getTileData().func_74778_a(SectJobX_X, new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.44
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), SectJobX_X) + "" + (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.45
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.46
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74779_i("Master") : "") + "   ");
                    }
                    world.func_184138_a(_bp17, _bs17, _bs17, 3);
                }
                ItemStack _stack7 = new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.47
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1);
                if (!_stack7.func_77942_o()) {
                    _stack7.func_77982_d(new NBTTagCompound());
                }
                _stack7.func_77978_p().func_74780_a("SectJobLevel", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.48
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "SectJobLevel"));
                ItemStack _stack8 = new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.49
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1);
                if (!_stack8.func_77942_o()) {
                    _stack8.func_77982_d(new NBTTagCompound());
                }
                _stack8.func_77978_p().func_74780_a("SectLevel", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.50
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "SectLevel"));
                ItemStack _stack9 = new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.51
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1);
                if (!_stack9.func_77942_o()) {
                    _stack9.func_77982_d(new NBTTagCompound());
                }
                _stack9.func_77978_p().func_74778_a("SectMaster", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.52
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "SectJob6"));
                if (!world.field_72995_K) {
                    BlockPos _bp18 = new BlockPos(x, y, z);
                    TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                    IBlockState _bs18 = world.func_180495_p(_bp18);
                    if (_tileEntity18 != null) {
                        _tileEntity18.getTileData().func_74780_a("SectStaffNum", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelSet.53
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectStaffNum") + 1.0d);
                    }
                    world.func_184138_a(_bp18, _bs18, _bs18, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp19 = new BlockPos(x, y, z);
                    TileEntity _tileEntity19 = world.func_175625_s(_bp19);
                    IBlockState _bs19 = world.func_180495_p(_bp19);
                    if (_tileEntity19 != null) {
                        _tileEntity19.getTileData().func_74778_a("SectGuiTip", "§2§l任命成功");
                    }
                    world.func_184138_a(_bp19, _bs19, _bs19, 3);
                }
                $_dependencies.put("world", world);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                ProcedureZsbGuiReplaceItem.executeProcedure($_dependencies);
            }
        } else if (!world.field_72995_K) {
            BlockPos _bp20 = new BlockPos(x, y, z);
            TileEntity _tileEntity20 = world.func_175625_s(_bp20);
            IBlockState _bs20 = world.func_180495_p(_bp20);
            if (_tileEntity20 != null) {
                _tileEntity20.getTileData().func_74778_a("SectGuiTip", "§4§l并非令牌");
            }
            world.func_184138_a(_bp20, _bs20, _bs20, 3);
        }
    }
}
