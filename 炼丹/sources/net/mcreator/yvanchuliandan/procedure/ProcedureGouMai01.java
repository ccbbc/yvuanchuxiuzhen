package net.mcreator.yvanchuliandan.procedure;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureGouMai01.class */
public class ProcedureGouMai01 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureGouMai01(ElementsYvanchuliandanMod instance) {
        super(instance, 806);
    }

    /* JADX WARN: Type inference failed for: r0v103, types: [net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01$5] */
    /* JADX WARN: Type inference failed for: r0v106, types: [net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01$4] */
    /* JADX WARN: Type inference failed for: r0v109, types: [net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01$3] */
    /* JADX WARN: Type inference failed for: r0v112, types: [net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01$2] */
    /* JADX WARN: Type inference failed for: r0v122, types: [net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01$1] */
    /* JADX WARN: Type inference failed for: r0v59, types: [net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01$7] */
    /* JADX WARN: Type inference failed for: r0v77, types: [net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01$14] */
    /* JADX WARN: Type inference failed for: r1v21, types: [net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01$6] */
    /* JADX WARN: Type inference failed for: r2v37, types: [net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01$8] */
    /* JADX WARN: Type inference failed for: r3v10, types: [net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01$10] */
    /* JADX WARN: Type inference failed for: r3v28, types: [net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01$13] */
    /* JADX WARN: Type inference failed for: r3v7, types: [net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01$9] */
    /* JADX WARN: Type inference failed for: r4v6, types: [net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01$11] */
    /* JADX WARN: Type inference failed for: r5v16, types: [net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01$15] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if ((entityPlayer.getEntityData().func_74769_h("JingJieNum") == 5.0d && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "JiaGe1") > 100000.0d * ((entityPlayer.getEntityData().func_74769_h("XingShang") * 0.2d) + 1.0d)) || ((entityPlayer.getEntityData().func_74769_h("JingJieNum") == 4.0d && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "JiaGe1") > 10000.0d * ((entityPlayer.getEntityData().func_74769_h("XingShang") * 0.2d) + 1.0d)) || ((entityPlayer.getEntityData().func_74769_h("JingJieNum") == 3.0d && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01.3
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "JiaGe1") > 2000.0d * ((entityPlayer.getEntityData().func_74769_h("XingShang") * 0.2d) + 1.0d)) || ((entityPlayer.getEntityData().func_74769_h("JingJieNum") == 2.0d && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01.4
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "JiaGe1") > 600.0d * ((entityPlayer.getEntityData().func_74769_h("XingShang") * 0.2d) + 1.0d)) || (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 1.0d && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01.5
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "JiaGe1") > 300.0d * ((entityPlayer.getEntityData().func_74769_h("XingShang") * 0.2d) + 1.0d)))))) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("坊市不愿将此物品出售于你，可通过提升境界或行商等级让坊市商人破例出售"), false);
            }
        } else if (entityPlayer.getEntityData().func_74769_h("LingYuanNum") >= new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01.6
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "JiaGe1")) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01.7
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "XianLiang1") >= 1.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("XianLiang1", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01.8
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "XianLiang1") - 1.0d);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
                entityPlayer.getEntityData().func_74780_a("XingShangXp", entityPlayer.getEntityData().func_74769_h("XingShangXp") + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01.9
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "JiaGe1"));
                entityPlayer.getEntityData().func_74780_a("LingYuanNum", entityPlayer.getEntityData().func_74769_h("LingYuanNum") - (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01.10
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "JiaGe1") - (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01.11
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "JiaGe1") * (entityPlayer.getEntityData().func_74769_h("XingShang") * 0.03d))));
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01.12
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return new BlockPos(x, y, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y, z);
                        }
                    }, "give " + entityPlayer.func_189512_bd() + " " + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01.13
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
                    }.getItemStack(0).func_77973_b().getRegistryName().toString() + " 1");
                }
                if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01.14
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "JiaGe1") * entityPlayer.getEntityData().func_74769_h("XingShang") * 0.03d >= 1.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("本次购买优惠" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureGouMai01.15
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "JiaGe1") * entityPlayer.getEntityData().func_74769_h("XingShang") * 0.03d) + "灵石"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("货源不足需等待刷新"), false);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("余额不足以购买该物品~"), false);
        }
    }
}
