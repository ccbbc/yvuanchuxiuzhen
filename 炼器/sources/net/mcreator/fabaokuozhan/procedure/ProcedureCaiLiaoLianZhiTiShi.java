package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemCailiao12;
import net.mcreator.fabaokuozhan.item.ItemCailiao13;
import net.mcreator.fabaokuozhan.item.ItemShouHuangJingXue;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureCaiLiaoLianZhiTiShi.class */
public class ProcedureCaiLiaoLianZhiTiShi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCaiLiaoLianZhiTiShi(ElementsFabaokuozhanMod instance) {
        super(instance, 354);
    }

    /* JADX WARN: Type inference failed for: r0v101, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi$10] */
    /* JADX WARN: Type inference failed for: r0v104, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi$11] */
    /* JADX WARN: Type inference failed for: r0v107, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi$12] */
    /* JADX WARN: Type inference failed for: r0v156, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi$6] */
    /* JADX WARN: Type inference failed for: r0v159, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi$7] */
    /* JADX WARN: Type inference failed for: r0v162, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi$8] */
    /* JADX WARN: Type inference failed for: r0v211, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi$2] */
    /* JADX WARN: Type inference failed for: r0v214, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi$3] */
    /* JADX WARN: Type inference failed for: r0v217, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi$4] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi$1] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi$5] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi$9] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi$13] */
    /* JADX WARN: Type inference failed for: r0v46, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi$14] */
    /* JADX WARN: Type inference failed for: r0v49, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi$15] */
    /* JADX WARN: Type inference failed for: r0v52, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi$16] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(Items.field_151042_j, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲炼制[精铁]  炼材失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 1.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到练气"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi.2
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "dingluLEVEL") < 1.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("炼器鼎未达到一级"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi.3
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "huoyan") < 1.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("火焰未达到一级"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi.4
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "lianqi") < 0.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("炼器未达到零级"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi.5
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCailiao12.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲炼制[陨钢]  炼材失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 3.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到结丹"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi.6
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "dingluLEVEL") < 3.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("炼器鼎未达到三级"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi.7
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "huoyan") < 3.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("火焰未达到三级"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi.8
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "lianqi") < 2.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("炼器未达到二级"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi.9
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCailiao13.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲炼制[陨钢]  炼材失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 4.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到元婴"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi.10
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "dingluLEVEL") < 4.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("炼器鼎未达到四级"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi.11
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "huoyan") < 4.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("火焰未达到四级"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi.12
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "lianqi") < 3.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("炼器未达到三级"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi.13
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemShouHuangJingXue.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲炼制[兽皇真血]  炼材失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 5.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到化神"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi.14
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "dingluLEVEL") < 5.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("炼器鼎未达到五级"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi.15
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "huoyan") < 5.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("火焰未达到五级"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCaiLiaoLianZhiTiShi.16
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "lianqi") < 4.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("炼器未达到四级"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
    }
}
