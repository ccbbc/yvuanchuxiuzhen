package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemBlackIron;
import net.mcreator.fabaokuozhan.item.ItemCailiao11;
import net.mcreator.fabaokuozhan.item.ItemCailiao14;
import net.mcreator.fabaokuozhan.item.ItemCailiao16;
import net.mcreator.fabaokuozhan.item.ItemGengGold;
import net.mcreator.fabaokuozhan.item.ItemGoldRefined;
import net.mcreator.fabaokuozhan.item.ItemIronMother;
import net.mcreator.fabaokuozhan.item.ItemJuLingChen;
import net.mcreator.fabaokuozhan.item.ItemShouHuangZhenXue;
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

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureLianqijiesuan01.class */
public class ProcedureLianqijiesuan01 extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLianqijiesuan01(ElementsFabaokuozhanMod instance) {
        super(instance, 165);
    }

    /* JADX WARN: Type inference failed for: r0v110, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$20] */
    /* JADX WARN: Type inference failed for: r0v113, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$21] */
    /* JADX WARN: Type inference failed for: r0v133, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$17] */
    /* JADX WARN: Type inference failed for: r0v136, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$18] */
    /* JADX WARN: Type inference failed for: r0v147, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$14] */
    /* JADX WARN: Type inference failed for: r0v150, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$15] */
    /* JADX WARN: Type inference failed for: r0v161, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$11] */
    /* JADX WARN: Type inference failed for: r0v164, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$12] */
    /* JADX WARN: Type inference failed for: r0v175, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$8] */
    /* JADX WARN: Type inference failed for: r0v178, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$9] */
    /* JADX WARN: Type inference failed for: r0v189, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$5] */
    /* JADX WARN: Type inference failed for: r0v192, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$6] */
    /* JADX WARN: Type inference failed for: r0v225, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$2] */
    /* JADX WARN: Type inference failed for: r0v228, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$3] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$1] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$4] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$7] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$10] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$13] */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$16] */
    /* JADX WARN: Type inference failed for: r0v46, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$19] */
    /* JADX WARN: Type inference failed for: r0v49, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$22] */
    /* JADX WARN: Type inference failed for: r0v52, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$25] */
    /* JADX WARN: Type inference failed for: r0v64, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$26] */
    /* JADX WARN: Type inference failed for: r0v67, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$27] */
    /* JADX WARN: Type inference failed for: r0v87, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$23] */
    /* JADX WARN: Type inference failed for: r0v90, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01$24] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "cailiaoleixing") == 1.0d) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.2
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s != null && (func_175625_s instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack = new ItemStack(ItemCailiao11.block, 1);
                    _setstack.func_190920_e(1);
                    func_175625_s.func_70299_a(6, _setstack);
                }
            } else {
                new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.3
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                        if (func_175625_s2 instanceof TileEntityLockableLoot) {
                            return func_175625_s2.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.4
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "cailiaoleixing") == 2.0d) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.5
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                    if (func_175625_s2 instanceof TileEntityLockableLoot) {
                        return func_175625_s2.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s2 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s2 != null && (func_175625_s2 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack2 = new ItemStack(ItemCailiao14.block, 1);
                    _setstack2.func_190920_e(1);
                    func_175625_s2.func_70299_a(6, _setstack2);
                }
            } else {
                new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.6
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                        if (func_175625_s3 instanceof TileEntityLockableLoot) {
                            return func_175625_s3.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.7
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "cailiaoleixing") == 3.0d) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.8
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                    if (func_175625_s3 instanceof TileEntityLockableLoot) {
                        return func_175625_s3.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s3 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s3 != null && (func_175625_s3 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack3 = new ItemStack(ItemCailiao16.block, 1);
                    _setstack3.func_190920_e(1);
                    func_175625_s3.func_70299_a(6, _setstack3);
                }
            } else {
                new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.9
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s4 = world.func_175625_s(pos);
                        if (func_175625_s4 instanceof TileEntityLockableLoot) {
                            return func_175625_s4.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.10
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "cailiaoleixing") == 4.0d) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.11
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s4 = world.func_175625_s(pos);
                    if (func_175625_s4 instanceof TileEntityLockableLoot) {
                        return func_175625_s4.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s4 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s4 != null && (func_175625_s4 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack4 = new ItemStack(ItemJuLingChen.block, 1);
                    _setstack4.func_190920_e(1);
                    func_175625_s4.func_70299_a(6, _setstack4);
                }
            } else {
                new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.12
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s5 = world.func_175625_s(pos);
                        if (func_175625_s5 instanceof TileEntityLockableLoot) {
                            return func_175625_s5.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.13
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "cailiaoleixing") == 5.0d) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.14
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s5 = world.func_175625_s(pos);
                    if (func_175625_s5 instanceof TileEntityLockableLoot) {
                        return func_175625_s5.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                TileEntityLockableLoot func_175625_s5 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s5 != null && (func_175625_s5 instanceof TileEntityLockableLoot)) {
                    ItemStack _setstack5 = new ItemStack(ItemShouHuangZhenXue.block, 1);
                    _setstack5.func_190920_e(1);
                    func_175625_s5.func_70299_a(6, _setstack5);
                }
            } else {
                new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.15
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s6 = world.func_175625_s(pos);
                        if (func_175625_s6 instanceof TileEntityLockableLoot) {
                            return func_175625_s6.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
            }
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.16
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "cailiaoleixing") == 6.0d) {
            if (Math.random() <= 0.15d) {
                if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.17
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s6 = world.func_175625_s(pos);
                        if (func_175625_s6 instanceof TileEntityLockableLoot) {
                            return func_175625_s6.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                    TileEntityLockableLoot func_175625_s6 = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s6 != null && (func_175625_s6 instanceof TileEntityLockableLoot)) {
                        ItemStack _setstack6 = new ItemStack(ItemIronMother.block, 1);
                        _setstack6.func_190920_e(1);
                        func_175625_s6.func_70299_a(6, _setstack6);
                    }
                } else {
                    new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.18
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s7 = world.func_175625_s(pos);
                            if (func_175625_s7 instanceof TileEntityLockableLoot) {
                                return func_175625_s7.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("§c炼制失败"), false);
            }
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.19
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "cailiaoleixing") == 7.0d) {
            if (Math.random() <= 0.15d) {
                if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.20
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s7 = world.func_175625_s(pos);
                        if (func_175625_s7 instanceof TileEntityLockableLoot) {
                            return func_175625_s7.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                    TileEntityLockableLoot func_175625_s7 = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s7 != null && (func_175625_s7 instanceof TileEntityLockableLoot)) {
                        ItemStack _setstack7 = new ItemStack(ItemBlackIron.block, 1);
                        _setstack7.func_190920_e(1);
                        func_175625_s7.func_70299_a(6, _setstack7);
                    }
                } else {
                    new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.21
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s8 = world.func_175625_s(pos);
                            if (func_175625_s8 instanceof TileEntityLockableLoot) {
                                return func_175625_s8.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("§c炼制失败"), false);
            }
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.22
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "cailiaoleixing") == 8.0d) {
            if (Math.random() <= 0.15d) {
                if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.23
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s8 = world.func_175625_s(pos);
                        if (func_175625_s8 instanceof TileEntityLockableLoot) {
                            return func_175625_s8.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                    TileEntityLockableLoot func_175625_s8 = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s8 != null && (func_175625_s8 instanceof TileEntityLockableLoot)) {
                        ItemStack _setstack8 = new ItemStack(ItemGoldRefined.block, 1);
                        _setstack8.func_190920_e(1);
                        func_175625_s8.func_70299_a(6, _setstack8);
                    }
                } else {
                    new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.24
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s9 = world.func_175625_s(pos);
                            if (func_175625_s9 instanceof TileEntityLockableLoot) {
                                return func_175625_s9.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("§c炼制失败"), false);
            }
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.25
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "cailiaoleixing") == 9.0d) {
            if (Math.random() <= 0.15d) {
                if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.26
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s9 = world.func_175625_s(pos);
                        if (func_175625_s9 instanceof TileEntityLockableLoot) {
                            return func_175625_s9.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                    TileEntityLockableLoot func_175625_s9 = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s9 != null && (func_175625_s9 instanceof TileEntityLockableLoot)) {
                        ItemStack _setstack9 = new ItemStack(ItemGengGold.block, 1);
                        _setstack9.func_190920_e(1);
                        func_175625_s9.func_70299_a(6, _setstack9);
                    }
                } else {
                    new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqijiesuan01.27
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s10 = world.func_175625_s(pos);
                            if (func_175625_s10 instanceof TileEntityLockableLoot) {
                                return func_175625_s10.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 6).func_190917_f(1);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("§c炼制失败"), false);
            }
        }
        if (!world.field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = world.func_175625_s(_bp);
            IBlockState _bs = world.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74757_a("kaishi2", false);
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (!world.field_72995_K) {
            BlockPos _bp2 = new BlockPos(x, y, z);
            TileEntity _tileEntity2 = world.func_175625_s(_bp2);
            IBlockState _bs2 = world.func_180495_p(_bp2);
            if (_tileEntity2 != null) {
                _tileEntity2.getTileData().func_74780_a("cailiaoleixing", 0.0d);
            }
            world.func_184138_a(_bp2, _bs2, _bs2, 3);
        }
    }
}
