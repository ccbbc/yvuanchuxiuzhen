package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemFabao31;
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
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureLianqipipei.class */
public class ProcedureLianqipipei extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLianqipipei(ElementsFabaokuozhanMod instance) {
        super(instance, 162);
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipipei$1] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipipei$3] */
    /* JADX WARN: Type inference failed for: r0v51, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipipei$4] */
    /* JADX WARN: Type inference failed for: r0v54, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipipei$5] */
    /* JADX WARN: Type inference failed for: r0v57, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipipei$6] */
    /* JADX WARN: Type inference failed for: r0v60, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipipei$7] */
    /* JADX WARN: Type inference failed for: r0v74, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipipei$8] */
    /* JADX WARN: Type inference failed for: r1v12, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqipipei$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipipei.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "dingluLEVEL") == new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipipei.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "huoyan")) {
            if (!new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipipei.3
                public boolean getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74767_n(tag);
                    }
                    return false;
                }
            }.getValue(new BlockPos(x, y, z), "kaishi")) {
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("lianqi", entityPlayer.getEntityData().func_74769_h("LianQi"));
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                    IBlockState _bs2 = world.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74778_a("炼制者", entityPlayer.func_145748_c_().func_150260_c());
                    }
                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
                if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipipei.4
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("歪 主材都不放你想炼什么？"), false);
                    }
                } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipipei.5
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "炼器模式").equals("炼材")) {
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("world", world);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    ProcedureLianqipeifang01.executeProcedure($_dependencies);
                } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipipei.6
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "炼器模式").equals("炼器")) {
                    if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipipei.7
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqipipei.8
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(ItemFabao31.block, 1).func_77973_b()) {
                        $_dependencies.put("entity", entityPlayer);
                        $_dependencies.put("world", world);
                        $_dependencies.put("x", Integer.valueOf(x));
                        $_dependencies.put("y", Integer.valueOf(y));
                        $_dependencies.put("z", Integer.valueOf(z));
                        ProcedureLianQiPeiFang.executeProcedure($_dependencies);
                    } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("请拿走已经完成炼制的法宝后在进行炼制"), false);
                    }
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("炼制中请等待当前炼制物品完成炼制再进行下一次的炼制"), false);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("缺少与炼器鼎炉相同的火焰"), false);
        }
    }
}
