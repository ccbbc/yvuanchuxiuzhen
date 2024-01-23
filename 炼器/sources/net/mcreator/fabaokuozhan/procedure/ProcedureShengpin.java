package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureShengpin.class */
public class ProcedureShengpin extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShengpin(ElementsFabaokuozhanMod instance) {
        super(instance, 221);
    }

    /* JADX WARN: Type inference failed for: r0v200, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$2] */
    /* JADX WARN: Type inference failed for: r0v203, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$3] */
    /* JADX WARN: Type inference failed for: r0v206, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$4] */
    /* JADX WARN: Type inference failed for: r0v212, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$8] */
    /* JADX WARN: Type inference failed for: r0v218, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$12] */
    /* JADX WARN: Type inference failed for: r0v224, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$16] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$1] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$20] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$21] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$22] */
    /* JADX WARN: Type inference failed for: r0v57, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$23] */
    /* JADX WARN: Type inference failed for: r0v60, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$24] */
    /* JADX WARN: Type inference failed for: r0v63, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$25] */
    /* JADX WARN: Type inference failed for: r0v66, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$26] */
    /* JADX WARN: Type inference failed for: r0v69, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$27] */
    /* JADX WARN: Type inference failed for: r0v72, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$28] */
    /* JADX WARN: Type inference failed for: r0v75, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$29] */
    /* JADX WARN: Type inference failed for: r0v78, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$30] */
    /* JADX WARN: Type inference failed for: r0v81, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$31] */
    /* JADX WARN: Type inference failed for: r0v84, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$32] */
    /* JADX WARN: Type inference failed for: r0v90, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$34] */
    /* JADX WARN: Type inference failed for: r0v93, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$35] */
    /* JADX WARN: Type inference failed for: r2v109, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$5] */
    /* JADX WARN: Type inference failed for: r2v118, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$9] */
    /* JADX WARN: Type inference failed for: r2v127, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$13] */
    /* JADX WARN: Type inference failed for: r2v136, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$17] */
    /* JADX WARN: Type inference failed for: r2v145, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$18] */
    /* JADX WARN: Type inference failed for: r2v150, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$14] */
    /* JADX WARN: Type inference failed for: r2v155, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$10] */
    /* JADX WARN: Type inference failed for: r2v160, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$6] */
    /* JADX WARN: Type inference failed for: r3v23, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$33] */
    /* JADX WARN: Type inference failed for: r3v32, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$36] */
    /* JADX WARN: Type inference failed for: r3v60, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$7] */
    /* JADX WARN: Type inference failed for: r3v65, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$11] */
    /* JADX WARN: Type inference failed for: r3v70, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$15] */
    /* JADX WARN: Type inference failed for: r3v75, types: [net.mcreator.fabaokuozhan.procedure.ProcedureShengpin$19] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 8).func_77973_b() != new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.2
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 9).func_77973_b() != new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.3
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "lianqi") > 0.0d) {
                ItemStack _stack = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.4
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6);
                if (!_stack.func_77942_o()) {
                    _stack.func_77982_d(new NBTTagCompound());
                }
                _stack.func_77978_p().func_74780_a("defense", (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.5
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.6
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_77978_p().func_74769_h("defense") : -1.0d) + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.7
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "lianqi"));
                ItemStack _stack2 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.8
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 7);
                if (!_stack2.func_77942_o()) {
                    _stack2.func_77982_d(new NBTTagCompound());
                }
                _stack2.func_77978_p().func_74780_a("defense", (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.9
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 7).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.10
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 7).func_77978_p().func_74769_h("defense") : -1.0d) + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.11
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "lianqi"));
                ItemStack _stack3 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.12
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 8);
                if (!_stack3.func_77942_o()) {
                    _stack3.func_77982_d(new NBTTagCompound());
                }
                _stack3.func_77978_p().func_74780_a("defense", (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.13
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 8).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.14
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 8).func_77978_p().func_74769_h("defense") : -1.0d) + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.15
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "lianqi"));
                ItemStack _stack4 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.16
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 9);
                if (!_stack4.func_77942_o()) {
                    _stack4.func_77982_d(new NBTTagCompound());
                }
                _stack4.func_77978_p().func_74780_a("defense", (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.17
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 9).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.18
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 9).func_77978_p().func_74769_h("defense") : -1.0d) + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.19
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "lianqi"));
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("lianqi", 0.0d);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
            }
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.20
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 8).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.21
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 9).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.22
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "lianqi") > 0.0d) {
                if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.23
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "lianqi") == 1.0d && !world.field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                    IBlockState _bs2 = world.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74778_a("增加攻击", "1");
                    }
                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
                if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.24
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "lianqi") == 2.0d && !world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74778_a("增加攻击", "2");
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.25
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "lianqi") == 3.0d && !world.field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z);
                    TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                    IBlockState _bs4 = world.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74778_a("增加攻击", "3");
                    }
                    world.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
                if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.26
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "lianqi") == 4.0d && !world.field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y, z);
                    TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                    IBlockState _bs5 = world.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74778_a("增加攻击", "4");
                    }
                    world.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
                if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.27
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "lianqi") == 5.0d && !world.field_72995_K) {
                    BlockPos _bp6 = new BlockPos(x, y, z);
                    TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                    IBlockState _bs6 = world.func_180495_p(_bp6);
                    if (_tileEntity6 != null) {
                        _tileEntity6.getTileData().func_74778_a("增加攻击", "5");
                    }
                    world.func_184138_a(_bp6, _bs6, _bs6, 3);
                }
                if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.28
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "lianqi") == 6.0d && !world.field_72995_K) {
                    BlockPos _bp7 = new BlockPos(x, y, z);
                    TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                    IBlockState _bs7 = world.func_180495_p(_bp7);
                    if (_tileEntity7 != null) {
                        _tileEntity7.getTileData().func_74778_a("增加攻击", "6");
                    }
                    world.func_184138_a(_bp7, _bs7, _bs7, 3);
                }
                if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.29
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "lianqi") == 7.0d && !world.field_72995_K) {
                    BlockPos _bp8 = new BlockPos(x, y, z);
                    TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                    IBlockState _bs8 = world.func_180495_p(_bp8);
                    if (_tileEntity8 != null) {
                        _tileEntity8.getTileData().func_74778_a("增加攻击", "7");
                    }
                    world.func_184138_a(_bp8, _bs8, _bs8, 3);
                }
                if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.30
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "lianqi") == 8.0d && !world.field_72995_K) {
                    BlockPos _bp9 = new BlockPos(x, y, z);
                    TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                    IBlockState _bs9 = world.func_180495_p(_bp9);
                    if (_tileEntity9 != null) {
                        _tileEntity9.getTileData().func_74778_a("增加攻击", "8");
                    }
                    world.func_184138_a(_bp9, _bs9, _bs9, 3);
                }
                if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.31
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "lianqi") == 9.0d && !world.field_72995_K) {
                    BlockPos _bp10 = new BlockPos(x, y, z);
                    TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                    IBlockState _bs10 = world.func_180495_p(_bp10);
                    if (_tileEntity10 != null) {
                        _tileEntity10.getTileData().func_74778_a("增加攻击", "9");
                    }
                    world.func_184138_a(_bp10, _bs10, _bs10, 3);
                }
                ItemStack _stack5 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.32
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6);
                if (!_stack5.func_77942_o()) {
                    _stack5.func_77982_d(new NBTTagCompound());
                }
                _stack5.func_77978_p().func_74778_a("ItemAttribute", "attackDamage-" + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.33
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "增加攻击") + "-true-0-0");
                if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.34
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 7).func_77973_b() != new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                    ItemStack _stack6 = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.35
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 7);
                    if (!_stack6.func_77942_o()) {
                        _stack6.func_77982_d(new NBTTagCompound());
                    }
                    _stack6.func_77978_p().func_74778_a("ItemAttribute", "attackDamage-" + new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureShengpin.36
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "增加攻击") + "-true-0-0");
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp11 = new BlockPos(x, y, z);
                TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                IBlockState _bs11 = world.func_180495_p(_bp11);
                if (_tileEntity11 != null) {
                    _tileEntity11.getTileData().func_74778_a("增加攻击", "");
                }
                world.func_184138_a(_bp11, _bs11, _bs11, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp12 = new BlockPos(x, y, z);
                TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                IBlockState _bs12 = world.func_180495_p(_bp12);
                if (_tileEntity12 != null) {
                    _tileEntity12.getTileData().func_74780_a("lianqi", 0.0d);
                }
                world.func_184138_a(_bp12, _bs12, _bs12, 3);
            }
        }
    }
}
