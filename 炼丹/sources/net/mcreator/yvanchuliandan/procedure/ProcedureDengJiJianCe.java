package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDengJiJianCe.class */
public class ProcedureDengJiJianCe extends ElementsYvanchuliandanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureDengJiJianCe(ElementsYvanchuliandanMod instance) {
        super(instance, 301);
    }

    /* JADX WARN: Type inference failed for: r0v102, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe$5] */
    /* JADX WARN: Type inference failed for: r0v105, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe$6] */
    /* JADX WARN: Type inference failed for: r0v108, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe$7] */
    /* JADX WARN: Type inference failed for: r0v111, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe$8] */
    /* JADX WARN: Type inference failed for: r0v138, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe$15] */
    /* JADX WARN: Type inference failed for: r0v169, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe$14] */
    /* JADX WARN: Type inference failed for: r0v183, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe$13] */
    /* JADX WARN: Type inference failed for: r0v197, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe$12] */
    /* JADX WARN: Type inference failed for: r0v211, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe$11] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe$1] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe$2] */
    /* JADX WARN: Type inference failed for: r0v63, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe$4] */
    /* JADX WARN: Type inference failed for: r0v66, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe$16] */
    /* JADX WARN: Type inference failed for: r0v76, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe$17] */
    /* JADX WARN: Type inference failed for: r0v79, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe$18] */
    /* JADX WARN: Type inference failed for: r0v82, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe$19] */
    /* JADX WARN: Type inference failed for: r0v85, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe$20] */
    /* JADX WARN: Type inference failed for: r1v15, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe$3] */
    /* JADX WARN: Type inference failed for: r2v113, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe$10] */
    /* JADX WARN: Type inference failed for: r2v120, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe$9] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe.1
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "开始炼制")) {
            if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe.2
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "huoyan") >= new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe.3
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "danluLEVEL")) {
                if (!entityPlayer.getEntityData().func_74767_n("DefinitelySuccessful")) {
                    if (!world.field_72995_K) {
                        BlockPos _bp = new BlockPos(x, y, z);
                        TileEntity _tileEntity = world.func_175625_s(_bp);
                        IBlockState _bs = world.func_180495_p(_bp);
                        if (_tileEntity != null) {
                            _tileEntity.getTileData().func_74780_a("liandan", entityPlayer.getEntityData().func_74769_h("LianDan"));
                        }
                        world.func_184138_a(_bp, _bs, _bs, 3);
                    }
                } else if (!world.field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                    IBlockState _bs2 = world.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74780_a("liandan", 100.0d);
                    }
                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74778_a("炼制者", entityPlayer.func_145748_c_().func_150260_c());
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe.4
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "danluLEVEL") > 0.0d && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe.5
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "huoyan") > 0.0d && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe.6
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == ItemStack.field_190927_a.func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe.7
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() == ItemStack.field_190927_a.func_77973_b() && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe.8
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == ItemStack.field_190927_a.func_77973_b()) {
                    if (!world.field_72995_K) {
                        BlockPos _bp4 = new BlockPos(x, y, z);
                        TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                        IBlockState _bs4 = world.func_180495_p(_bp4);
                        if (_tileEntity4 != null) {
                            _tileEntity4.getTileData().func_74778_a("丹方记录", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe.9
                                public ItemStack getItemStack(BlockPos pos, int sltid) {
                                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                    if (func_175625_s instanceof TileEntityLockableLoot) {
                                        return func_175625_s.func_70301_a(sltid);
                                    }
                                    return ItemStack.field_190927_a;
                                }
                            }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString());
                        }
                        world.func_184138_a(_bp4, _bs4, _bs4, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp5 = new BlockPos(x, y, z);
                        TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                        IBlockState _bs5 = world.func_180495_p(_bp5);
                        if (_tileEntity5 != null) {
                            _tileEntity5.getTileData().func_74778_a("辅材记录", new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe.10
                                public ItemStack getItemStack(BlockPos pos, int sltid) {
                                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                    if (func_175625_s instanceof TileEntityLockableLoot) {
                                        return func_175625_s.func_70301_a(sltid);
                                    }
                                    return ItemStack.field_190927_a;
                                }
                            }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString());
                        }
                        world.func_184138_a(_bp5, _bs5, _bs5, 3);
                    }
                    if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 5.0d && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe.11
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "danluLEVEL") >= 5.0d) {
                        $_dependencies.put("entity", entityPlayer);
                        $_dependencies.put("world", world);
                        $_dependencies.put("x", Integer.valueOf(x));
                        $_dependencies.put("y", Integer.valueOf(y));
                        $_dependencies.put("z", Integer.valueOf(z));
                        ProcedureDanFangDengJi5.executeProcedure($_dependencies);
                    }
                    if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 4.0d && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe.12
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "danluLEVEL") >= 4.0d) {
                        $_dependencies.put("entity", entityPlayer);
                        $_dependencies.put("world", world);
                        $_dependencies.put("x", Integer.valueOf(x));
                        $_dependencies.put("y", Integer.valueOf(y));
                        $_dependencies.put("z", Integer.valueOf(z));
                        ProcedureDanFangDengJi4.executeProcedure($_dependencies);
                    }
                    if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 3.0d && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe.13
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "danluLEVEL") >= 3.0d) {
                        $_dependencies.put("entity", entityPlayer);
                        $_dependencies.put("world", world);
                        $_dependencies.put("x", Integer.valueOf(x));
                        $_dependencies.put("y", Integer.valueOf(y));
                        $_dependencies.put("z", Integer.valueOf(z));
                        ProcedureDanFangDengJi3.executeProcedure($_dependencies);
                    }
                    if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 2.0d && new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe.14
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "danluLEVEL") >= 2.0d) {
                        $_dependencies.put("entity", entityPlayer);
                        $_dependencies.put("world", world);
                        $_dependencies.put("x", Integer.valueOf(x));
                        $_dependencies.put("y", Integer.valueOf(y));
                        $_dependencies.put("z", Integer.valueOf(z));
                        ProcedureDanFangDengJi2.executeProcedure($_dependencies);
                    }
                    if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 1.0d) {
                        $_dependencies.put("entity", entityPlayer);
                        $_dependencies.put("world", world);
                        $_dependencies.put("x", Integer.valueOf(x));
                        $_dependencies.put("y", Integer.valueOf(y));
                        $_dependencies.put("z", Integer.valueOf(z));
                        ProcedureDanFangDengJi101.executeProcedure($_dependencies);
                    }
                    if (!new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe.15
                        public boolean getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74767_n(tag);
                            }
                            return false;
                        }
                    }.getValue(new BlockPos(x, y, z), "开始炼制")) {
                        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("§c境界或丹炉、单方不符"), false);
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp6 = new BlockPos(x, y, z);
                            TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                            IBlockState _bs6 = world.func_180495_p(_bp6);
                            if (_tileEntity6 != null) {
                                _tileEntity6.getTileData().func_74757_a("炼丹提示", false);
                            }
                            world.func_184138_a(_bp6, _bs6, _bs6, 3);
                        }
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe.16
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() != ItemStack.field_190927_a.func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe.17
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 5).func_77973_b() != ItemStack.field_190927_a.func_77973_b() || new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe.18
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() != ItemStack.field_190927_a.func_77973_b()) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("§c炼制前，成品框内不得有物品"), false);
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe.19
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "huoyan") == 0.0d) {
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("§c丹炉下未燃烧异火"), false);
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDengJiJianCe.20
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "danluLEVEL") == 0.0d && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("§c丹炉未搭建完成"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("§c该丹炉需要更强的异火才可进行丹药炼制"), false);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("§c正在炼制，请勿点击"), false);
        }
    }
}
