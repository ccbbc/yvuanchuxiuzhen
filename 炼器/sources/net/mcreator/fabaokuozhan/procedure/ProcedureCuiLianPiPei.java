package net.mcreator.fabaokuozhan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureCuiLianPiPei.class */
public class ProcedureCuiLianPiPei extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCuiLianPiPei(ElementsFabaokuozhanMod instance) {
        super(instance, 560);
    }

    /* JADX WARN: Type inference failed for: r0v109, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$10] */
    /* JADX WARN: Type inference failed for: r0v116, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$14] */
    /* JADX WARN: Type inference failed for: r0v136, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$15] */
    /* JADX WARN: Type inference failed for: r0v151, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$11] */
    /* JADX WARN: Type inference failed for: r0v155, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$9] */
    /* JADX WARN: Type inference failed for: r0v159, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$7] */
    /* JADX WARN: Type inference failed for: r0v163, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$5] */
    /* JADX WARN: Type inference failed for: r0v167, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$3] */
    /* JADX WARN: Type inference failed for: r0v174, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$2] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$1] */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$4] */
    /* JADX WARN: Type inference failed for: r0v51, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$25] */
    /* JADX WARN: Type inference failed for: r0v69, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$6] */
    /* JADX WARN: Type inference failed for: r0v75, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$24] */
    /* JADX WARN: Type inference failed for: r0v96, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$8] */
    /* JADX WARN: Type inference failed for: r1v46, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$12] */
    /* JADX WARN: Type inference failed for: r1v54, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$16] */
    /* JADX WARN: Type inference failed for: r1v61, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$17] */
    /* JADX WARN: Type inference failed for: r1v73, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$13] */
    /* JADX WARN: Type inference failed for: r5v12, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$23] */
    /* JADX WARN: Type inference failed for: r5v21, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$20] */
    /* JADX WARN: Type inference failed for: r5v26, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$21] */
    /* JADX WARN: Type inference failed for: r5v31, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$18] */
    /* JADX WARN: Type inference failed for: r5v36, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$19] */
    /* JADX WARN: Type inference failed for: r5v7, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei$22] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        $_dependencies.put("x", Integer.valueOf(x));
        $_dependencies.put("y", Integer.valueOf(y));
        $_dependencies.put("z", Integer.valueOf(z));
        $_dependencies.put("world", world);
        ProcedureCaiLiaoDengJi.executeProcedure($_dependencies);
        if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.2
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77978_p().func_74769_h("淬炼级别") : -1.0d) < 1.0d) {
            ItemStack _stack = new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.3
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
            _stack.func_77978_p().func_74780_a("淬炼级别", 1.0d);
        }
        if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.4
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.5
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77978_p().func_74769_h("境界需求") : -1.0d) <= 0.0d) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("该物品无法淬炼"), false);
            }
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.25
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().contains("fabaokuozhan:") && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("法宝需要放置于主手初始化部分数据后才可进行淬炼"), false);
                return;
            }
            return;
        }
        if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.6
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.7
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("材料等级") : -1.0d) > 1.0d) {
            if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.8
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.9
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("材料等级") : -1.0d) > entityPlayer.getEntityData().func_74769_h("JingJieNum")) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("你当前的境界小于淬炼材料级别,无法使用[" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.22
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.23
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("材料等级") : -1.0d) + "]级淬炼材料进行法宝淬炼"), false);
                    return;
                }
                return;
            }
            if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.10
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.11
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("材料等级") : -1.0d) - (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.12
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.13
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0).func_77978_p().func_74769_h("淬炼级别") : -1.0d) == 1.0d) {
                $_dependencies.put("entity", entityPlayer);
                $_dependencies.put("world", world);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                ProcedureCuiLian.executeProcedure($_dependencies);
                return;
            }
            if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.14
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.15
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("材料等级") : -1.0d) == (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.16
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.17
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0).func_77978_p().func_74769_h("淬炼级别") : -1.0d)) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("该法宝已经使用过" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.18
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.19
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("材料等级") : -1.0d) + "]级淬炼材料淬炼,同一个境界法宝只可淬炼一次,请使用更高级别的材料进行淬炼"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("该法宝无法使用" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.20
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.21
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 1).func_77978_p().func_74769_h("材料等级") : -1.0d) + "]级淬炼材料淬炼,请尝试使用小一级的材料进行淬炼"), false);
            }
        } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianPiPei.24
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
            $_dependencies.put("entity", entityPlayer);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureCuiLianCaiLiaoTips.executeProcedure($_dependencies);
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("该材料无法用于淬炼"), false);
        }
    }
}
