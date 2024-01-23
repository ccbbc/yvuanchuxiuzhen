package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemCailiao12;
import net.mcreator.fabaokuozhan.item.ItemCailiao13;
import net.mcreator.fabaokuozhan.item.ItemCailiao16;
import net.mcreator.fabaokuozhan.item.ItemCailiao17;
import net.mcreator.fabaokuozhan.item.ItemCailiao18;
import net.mcreator.fabaokuozhan.item.ItemCailiao19;
import net.mcreator.fabaokuozhan.item.ItemCailiao93;
import net.mcreator.fabaokuozhan.item.ItemDianGuangZhiXin;
import net.mcreator.fabaokuozhan.item.ItemFabao21;
import net.mcreator.fabaokuozhan.item.ItemFabao22;
import net.mcreator.fabaokuozhan.item.ItemJuDuHeiYe;
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
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFaBaoLianZhiTiShi.class */
public class ProcedureFaBaoLianZhiTiShi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFaBaoLianZhiTiShi(ElementsFabaokuozhanMod instance) {
        super(instance, 355);
    }

    /* JADX WARN: Type inference failed for: r0v100, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$50] */
    /* JADX WARN: Type inference failed for: r0v106, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$51] */
    /* JADX WARN: Type inference failed for: r0v112, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$52] */
    /* JADX WARN: Type inference failed for: r0v115, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$53] */
    /* JADX WARN: Type inference failed for: r0v249, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$47] */
    /* JADX WARN: Type inference failed for: r0v252, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$48] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$1] */
    /* JADX WARN: Type inference failed for: r0v294, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$44] */
    /* JADX WARN: Type inference failed for: r0v297, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$45] */
    /* JADX WARN: Type inference failed for: r0v339, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$41] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$4] */
    /* JADX WARN: Type inference failed for: r0v342, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$42] */
    /* JADX WARN: Type inference failed for: r0v384, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$38] */
    /* JADX WARN: Type inference failed for: r0v387, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$39] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$7] */
    /* JADX WARN: Type inference failed for: r0v429, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$35] */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$10] */
    /* JADX WARN: Type inference failed for: r0v432, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$36] */
    /* JADX WARN: Type inference failed for: r0v46, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$13] */
    /* JADX WARN: Type inference failed for: r0v474, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$32] */
    /* JADX WARN: Type inference failed for: r0v477, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$33] */
    /* JADX WARN: Type inference failed for: r0v519, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$29] */
    /* JADX WARN: Type inference failed for: r0v52, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$16] */
    /* JADX WARN: Type inference failed for: r0v522, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$30] */
    /* JADX WARN: Type inference failed for: r0v55, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$19] */
    /* JADX WARN: Type inference failed for: r0v564, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$26] */
    /* JADX WARN: Type inference failed for: r0v567, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$27] */
    /* JADX WARN: Type inference failed for: r0v58, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$22] */
    /* JADX WARN: Type inference failed for: r0v609, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$23] */
    /* JADX WARN: Type inference failed for: r0v612, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$24] */
    /* JADX WARN: Type inference failed for: r0v64, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$25] */
    /* JADX WARN: Type inference failed for: r0v654, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$20] */
    /* JADX WARN: Type inference failed for: r0v657, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$21] */
    /* JADX WARN: Type inference failed for: r0v67, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$28] */
    /* JADX WARN: Type inference failed for: r0v699, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$17] */
    /* JADX WARN: Type inference failed for: r0v70, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$31] */
    /* JADX WARN: Type inference failed for: r0v702, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$18] */
    /* JADX WARN: Type inference failed for: r0v73, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$34] */
    /* JADX WARN: Type inference failed for: r0v744, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$14] */
    /* JADX WARN: Type inference failed for: r0v747, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$15] */
    /* JADX WARN: Type inference failed for: r0v76, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$37] */
    /* JADX WARN: Type inference failed for: r0v789, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$11] */
    /* JADX WARN: Type inference failed for: r0v792, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$12] */
    /* JADX WARN: Type inference failed for: r0v82, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$40] */
    /* JADX WARN: Type inference failed for: r0v834, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$8] */
    /* JADX WARN: Type inference failed for: r0v837, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$9] */
    /* JADX WARN: Type inference failed for: r0v85, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$43] */
    /* JADX WARN: Type inference failed for: r0v879, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$5] */
    /* JADX WARN: Type inference failed for: r0v88, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$46] */
    /* JADX WARN: Type inference failed for: r0v882, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$6] */
    /* JADX WARN: Type inference failed for: r0v924, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$2] */
    /* JADX WARN: Type inference failed for: r0v927, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$3] */
    /* JADX WARN: Type inference failed for: r0v94, types: [net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi$49] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:caiitem01")) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲炼制[飓风扇]  炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 3.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到结丹"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.2
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
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.3
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
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.4
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuyaoshou:caientity0101")) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲炼制[石峰拳套]  炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 4.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到元婴"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.5
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
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.6
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
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.7
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCailiao13.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲炼制[青虹剑]  炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 2.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到筑基"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.8
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "dingluLEVEL") < 2.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("炼器鼎未达到二级"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.9
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "huoyan") < 2.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("火焰未达到二级"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.10
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCailiao19.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲炼制[撼地锤]或[裂虎爪]  炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 5.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到化神"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.11
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
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.12
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
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.13
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cailiao31")) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲炼制[覆火葫芦]  炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 1.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到练气"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.14
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
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.15
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
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.16
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCailiao93.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲炼制[天行棋]  炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 3.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到结丹"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.17
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
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.18
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
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.19
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCailiao16.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲炼制[混沌战弓]  炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 5.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到化神"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.20
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
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.21
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
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.22
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:huoyan01")) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲炼制[燃焰珠]  炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 1.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到练气"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.23
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
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.24
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
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.25
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemFabao21.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲炼制[血木剑]  炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 3.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到结丹"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.26
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
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.27
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
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.28
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemFabao22.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲炼制[雷击木剑]  炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 5.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到化神"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.29
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
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.30
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
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.31
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCailiao18.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲炼制[碧海无量盾]  炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 5.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到化神"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.32
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
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.33
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
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.34
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCailiao17.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲炼制[燃山剑]  炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 4.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到元婴"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.35
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
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.36
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
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.37
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhenfulu:cailiao35")) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲炼制[桃木剑]  炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 1.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到练气"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.38
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
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.39
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
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.40
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(Items.field_151016_H, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲炼制[霹雳弹]  炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 2.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到筑基"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.41
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "dingluLEVEL") < 2.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("炼器鼎未达到二级"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.42
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "huoyan") < 2.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("火焰未达到二级"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.43
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCailiao12.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲炼制[解牛刀]或[腥毒短刀]  炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 2.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到筑基"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.44
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "dingluLEVEL") < 2.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("炼器鼎未达到二级"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.45
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "huoyan") < 2.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("火焰未达到二级"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.46
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:huoyan04")) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲炼制[流火幡]  炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 4.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到元婴"), false);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.47
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
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.48
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
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.49
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:caiitem07")) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString(" 炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 1.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到练气"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.50
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:caiitem08")) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 3.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到结丹"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.51
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:su_jin_bu")) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 5.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到化神"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.52
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemJuDuHeiYe.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲制作[追魂针]  炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 4.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到元婴"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureFaBaoLianZhiTiShi.53
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemDianGuangZhiXin.block, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("欲制作[锁子黄金甲]  炼器失败原因如下"), false);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") < 5.0d) {
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("修为未达到化神"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("材料不符或数量不足"), false);
            }
        }
    }
}
