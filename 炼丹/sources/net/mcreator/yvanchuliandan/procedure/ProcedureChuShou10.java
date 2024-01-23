package net.mcreator.yvanchuliandan.procedure;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureChuShou10.class */
public class ProcedureChuShou10 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureChuShou10(ElementsYvanchuliandanMod instance) {
        super(instance, 838);
    }

    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.yvanchuliandan.procedure.ProcedureChuShou10$2] */
    /* JADX WARN: Type inference failed for: r0v59, types: [net.mcreator.yvanchuliandan.procedure.ProcedureChuShou10$8] */
    /* JADX WARN: Type inference failed for: r1v11, types: [net.mcreator.yvanchuliandan.procedure.ProcedureChuShou10$1] */
    /* JADX WARN: Type inference failed for: r1v27, types: [net.mcreator.yvanchuliandan.procedure.ProcedureChuShou10$7] */
    /* JADX WARN: Type inference failed for: r2v29, types: [net.mcreator.yvanchuliandan.procedure.ProcedureChuShou10$3] */
    /* JADX WARN: Type inference failed for: r3v5, types: [net.mcreator.yvanchuliandan.procedure.ProcedureChuShou10$4] */
    /* JADX WARN: Type inference failed for: r3v8, types: [net.mcreator.yvanchuliandan.procedure.ProcedureChuShou10$5] */
    /* JADX WARN: Type inference failed for: r4v5, types: [net.mcreator.yvanchuliandan.procedure.ProcedureChuShou10$6] */
    /* JADX WARN: Type inference failed for: r5v15, types: [net.mcreator.yvanchuliandan.procedure.ProcedureChuShou10$9] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if ((entityPlayer instanceof EntityPlayer) && entityPlayer.field_71071_by.func_70431_c(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureChuShou10.1
            public ItemStack getItemStack(int sltid) {
                if (entityPlayer instanceof EntityPlayerMP) {
                    Supplier supplier = entityPlayer.field_71070_bA;
                    if (supplier instanceof Supplier) {
                        Object invobj = supplier.get();
                        if (invobj instanceof Map) {
                            return ((Slot) ((Map) invobj).get(Integer.valueOf(sltid))).func_75211_c();
                        }
                    }
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(9))) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureChuShou10.2
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "XianLiang10") >= 1.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("XianLiang10", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureChuShou10.3
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "XianLiang10") - 1.0d);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
                entityPlayer.getEntityData().func_74780_a("XingShangXp", entityPlayer.getEntityData().func_74769_h("XingShangXp") + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureChuShou10.4
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "JiaGe10"));
                entityPlayer.getEntityData().func_74780_a("LingYuanNum", entityPlayer.getEntityData().func_74769_h("LingYuanNum") + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureChuShou10.5
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "JiaGe10") + (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureChuShou10.6
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "JiaGe10") * entityPlayer.getEntityData().func_74769_h("XingShang") * 0.03d));
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureChuShou10.7
                        public ItemStack getItemStack(int sltid) {
                            if (entityPlayer instanceof EntityPlayerMP) {
                                Supplier supplier = entityPlayer.field_71070_bA;
                                if (supplier instanceof Supplier) {
                                    Object invobj = supplier.get();
                                    if (invobj instanceof Map) {
                                        return ((Slot) ((Map) invobj).get(Integer.valueOf(sltid))).func_75211_c();
                                    }
                                }
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(9).func_77973_b(), -1, 1, (NBTTagCompound) null);
                }
                if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureChuShou10.8
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "JiaGe10") * entityPlayer.getEntityData().func_74769_h("XingShang") * 0.03d >= 1.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("本次收购多给予你" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureChuShou10.9
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "JiaGe10") * entityPlayer.getEntityData().func_74769_h("XingShang") * 0.03d) + "灵石"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("该物品已经收的够多了"), false);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("你没有这个物品无法出售"), false);
        }
    }
}
