package net.mcreator.fabaokuozhan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureLingLiCut3.class */
public class ProcedureLingLiCut3 extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLingLiCut3(ElementsFabaokuozhanMod instance) {
        super(instance, 375);
    }

    /* JADX WARN: Type inference failed for: r0v129, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$15] */
    /* JADX WARN: Type inference failed for: r0v132, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$16] */
    /* JADX WARN: Type inference failed for: r0v135, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$29] */
    /* JADX WARN: Type inference failed for: r0v222, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$10] */
    /* JADX WARN: Type inference failed for: r0v226, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$8] */
    /* JADX WARN: Type inference failed for: r0v233, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$6] */
    /* JADX WARN: Type inference failed for: r0v240, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$4] */
    /* JADX WARN: Type inference failed for: r0v247, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$2] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$1] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$3] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$5] */
    /* JADX WARN: Type inference failed for: r0v46, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$7] */
    /* JADX WARN: Type inference failed for: r0v52, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$9] */
    /* JADX WARN: Type inference failed for: r0v75, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$34] */
    /* JADX WARN: Type inference failed for: r0v77, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$35] */
    /* JADX WARN: Type inference failed for: r0v90, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$36] */
    /* JADX WARN: Type inference failed for: r0v93, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$38] */
    /* JADX WARN: Type inference failed for: r0v96, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$40] */
    /* JADX WARN: Type inference failed for: r1v26, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$32] */
    /* JADX WARN: Type inference failed for: r1v65, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$17] */
    /* JADX WARN: Type inference failed for: r1v70, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$30] */
    /* JADX WARN: Type inference failed for: r1v81, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$20] */
    /* JADX WARN: Type inference failed for: r2v101, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$26] */
    /* JADX WARN: Type inference failed for: r2v104, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$22] */
    /* JADX WARN: Type inference failed for: r2v110, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$18] */
    /* JADX WARN: Type inference failed for: r2v118, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$14] */
    /* JADX WARN: Type inference failed for: r2v48, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$41] */
    /* JADX WARN: Type inference failed for: r2v52, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$39] */
    /* JADX WARN: Type inference failed for: r2v56, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$37] */
    /* JADX WARN: Type inference failed for: r2v78, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$31] */
    /* JADX WARN: Type inference failed for: r2v83, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$21] */
    /* JADX WARN: Type inference failed for: r2v96, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$28] */
    /* JADX WARN: Type inference failed for: r3v48, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$23] */
    /* JADX WARN: Type inference failed for: r3v60, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$27] */
    /* JADX WARN: Type inference failed for: r3v69, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$19] */
    /* JADX WARN: Type inference failed for: r3v9, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$33] */
    /* JADX WARN: Type inference failed for: r4v44, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$24] */
    /* JADX WARN: Type inference failed for: r4v62, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$25] */
    /* JADX WARN: Type inference failed for: r4v81, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$11] */
    /* JADX WARN: Type inference failed for: r5v51, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$12] */
    /* JADX WARN: Type inference failed for: r5v56, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3$13] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi03")) {
            ItemStack _stack = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.2
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 3);
            if (!_stack.func_77942_o()) {
                _stack.func_77982_d(new NBTTagCompound());
            }
            _stack.func_77978_p().func_74780_a("PowerNum", 10.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.3
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi05")) {
            ItemStack _stack2 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.4
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 3);
            if (!_stack2.func_77942_o()) {
                _stack2.func_77982_d(new NBTTagCompound());
            }
            _stack2.func_77978_p().func_74780_a("PowerNum", 1000.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.5
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:ling_shi_kuai_1")) {
            ItemStack _stack3 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.6
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 3);
            if (!_stack3.func_77942_o()) {
                _stack3.func_77982_d(new NBTTagCompound());
            }
            _stack3.func_77978_p().func_74780_a("PowerNum", 90.0d);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.7
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:ling_shi_kuai_2")) {
            ItemStack _stack4 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.8
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 3);
            if (!_stack4.func_77942_o()) {
                _stack4.func_77982_d(new NBTTagCompound());
            }
            _stack4.func_77978_p().func_74780_a("PowerNum", 9000.0d);
        }
        if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.9
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.10
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74769_h("PowerNum") : -1.0d) > 0.0d) {
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74780_a("powerTemp", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.14
                        int convert(String s) {
                            try {
                                return Integer.parseInt(s.trim());
                            } catch (Exception e) {
                                return 0;
                            }
                        }
                    }.convert(new DecimalFormat("0").format(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.11
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "扣除灵力") / (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.12
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.13
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74769_h("PowerNum") : -1.0d))));
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.15
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
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.16
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "powerTemp") > new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.17
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 3)) {
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74780_a("powerTemp2", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.18
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "powerTemp") - new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.19
                            public int getAmount(BlockPos pos, int sltid) {
                                ItemStack stack;
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                    return stack.func_190916_E();
                                }
                                return 0;
                            }
                        }.getAmount(new BlockPos(x, y, z), 3));
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                if (entityPlayer.getEntityData().func_74769_h("Power") >= new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.20
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "powerTemp2") * (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.21
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.22
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74769_h("PowerNum") : -1.0d)) {
                    entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.23
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "powerTemp2") * (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.24
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.25
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74769_h("PowerNum") : -1.0d)));
                    if (!world.field_72995_K) {
                        BlockPos _bp4 = new BlockPos(x, y, z);
                        TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                        IBlockState _bs4 = world.func_180495_p(_bp4);
                        if (_tileEntity4 != null) {
                            _tileEntity4.getTileData().func_74780_a("powerTemp", new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.26
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "powerTemp") - new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.27
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "powerTemp2"));
                        }
                        world.func_184138_a(_bp4, _bs4, _bs4, 3);
                    }
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        func_175625_s.func_70298_a(3, (int) new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.28
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
                        BlockPos _bp5 = new BlockPos(x, y, z);
                        TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                        IBlockState _bs5 = world.func_180495_p(_bp5);
                        if (_tileEntity5 != null) {
                            _tileEntity5.getTileData().func_74757_a("kaishi2", true);
                        }
                        world.func_184138_a(_bp5, _bs5, _bs5, 3);
                    }
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.29
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "powerTemp") <= new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.30
                public int getAmount(BlockPos pos, int sltid) {
                    ItemStack stack;
                    TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                    if ((func_175625_s2 instanceof TileEntityLockableLoot) && (stack = func_175625_s2.func_70301_a(sltid)) != null) {
                        return stack.func_190916_E();
                    }
                    return 0;
                }
            }.getAmount(new BlockPos(x, y, z), 3)) {
                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s2 instanceof TileEntityLockableLoot) {
                    func_175625_s2.func_70298_a(3, (int) new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.31
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
                    BlockPos _bp6 = new BlockPos(x, y, z);
                    TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                    IBlockState _bs6 = world.func_180495_p(_bp6);
                    if (_tileEntity6 != null) {
                        _tileEntity6.getTileData().func_74757_a("kaishi2", true);
                    }
                    world.func_184138_a(_bp6, _bs6, _bs6, 3);
                }
            }
        } else if (entityPlayer.getEntityData().func_74769_h("Power") >= new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.32
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "扣除灵力")) {
            entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.33
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "扣除灵力"));
            if (!world.field_72995_K) {
                BlockPos _bp7 = new BlockPos(x, y, z);
                TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                IBlockState _bs7 = world.func_180495_p(_bp7);
                if (_tileEntity7 != null) {
                    _tileEntity7.getTileData().func_74757_a("kaishi2", true);
                }
                world.func_184138_a(_bp7, _bs7, _bs7, 3);
            }
        }
        if (!new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.34
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "kaishi2") && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("§c无法进行炼材,存在以下问题:灵石或灵力不足"), false);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.35
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "kaishi2")) {
            $_dependencies.put("entity", entityPlayer);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureLianqijiesuan01.executeProcedure($_dependencies);
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.36
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "shuliang0") > 0.0d) {
                TileEntityLockableLoot func_175625_s3 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s3 instanceof TileEntityLockableLoot) {
                    func_175625_s3.func_70298_a(0, (int) new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.37
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "shuliang0"));
                }
            }
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.38
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "shuliang1") > 0.0d) {
                TileEntityLockableLoot func_175625_s4 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s4 instanceof TileEntityLockableLoot) {
                    func_175625_s4.func_70298_a(1, (int) new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.39
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "shuliang1"));
                }
            }
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.40
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "shuliang2") > 0.0d) {
                TileEntityLockableLoot func_175625_s5 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s5 instanceof TileEntityLockableLoot) {
                    func_175625_s5.func_70298_a(2, (int) new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLingLiCut3.41
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "shuliang2"));
                }
            }
        }
    }
}
