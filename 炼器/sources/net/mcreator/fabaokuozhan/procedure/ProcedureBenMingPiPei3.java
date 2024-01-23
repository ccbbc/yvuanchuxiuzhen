package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemCailiao17;
import net.mcreator.fabaokuozhan.item.ItemCailiao19;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureBenMingPiPei3.class */
public class ProcedureBenMingPiPei3 extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureBenMingPiPei3(ElementsFabaokuozhanMod instance) {
        super(instance, 500);
    }

    /* JADX WARN: Type inference failed for: r0v143, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$13] */
    /* JADX WARN: Type inference failed for: r0v160, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$4] */
    /* JADX WARN: Type inference failed for: r0v170, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$6] */
    /* JADX WARN: Type inference failed for: r0v180, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$7] */
    /* JADX WARN: Type inference failed for: r0v250, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$2] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$1] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$12] */
    /* JADX WARN: Type inference failed for: r0v53, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$15] */
    /* JADX WARN: Type inference failed for: r0v63, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$17] */
    /* JADX WARN: Type inference failed for: r0v73, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$18] */
    /* JADX WARN: Type inference failed for: r1v17, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$14] */
    /* JADX WARN: Type inference failed for: r1v22, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$16] */
    /* JADX WARN: Type inference failed for: r1v67, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$3] */
    /* JADX WARN: Type inference failed for: r1v72, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$5] */
    /* JADX WARN: Type inference failed for: r4v11, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$21] */
    /* JADX WARN: Type inference failed for: r4v18, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$20] */
    /* JADX WARN: Type inference failed for: r4v24, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$19] */
    /* JADX WARN: Type inference failed for: r4v4, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$22] */
    /* JADX WARN: Type inference failed for: r4v41, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$11] */
    /* JADX WARN: Type inference failed for: r4v48, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$10] */
    /* JADX WARN: Type inference failed for: r4v55, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$9] */
    /* JADX WARN: Type inference failed for: r4v61, types: [net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3$8] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.2
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77978_p().func_74769_h("本命阶段") : -1.0d) == 0.0d) {
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74780_a("炼制需求", 4.0d);
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.3
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "炉子需求")) {
                if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.4
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "dingluLEVEL") >= new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.5
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "炼制需求")) {
                    if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.6
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCailiao17.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.7
                        public int getAmount(BlockPos pos, int sltid) {
                            ItemStack stack;
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                return stack.func_190916_E();
                            }
                            return 0;
                        }
                    }.getAmount(new BlockPos(x, y, z), 1) >= 5) {
                        if (entityPlayer.getEntityData().func_74769_h("Base") >= 1280.0d && entityPlayer.getEntityData().func_74769_h("Power") >= 8000.0d) {
                            if (!world.field_72995_K) {
                                BlockPos _bp2 = new BlockPos(x, y, z);
                                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                                IBlockState _bs2 = world.func_180495_p(_bp2);
                                if (_tileEntity2 != null) {
                                    _tileEntity2.getTileData().func_74780_a("本命材料", 5.0d);
                                }
                                world.func_184138_a(_bp2, _bs2, _bs2, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp3 = new BlockPos(x, y, z);
                                TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                                IBlockState _bs3 = world.func_180495_p(_bp3);
                                if (_tileEntity3 != null) {
                                    _tileEntity3.getTileData().func_74780_a("本命真元", 1280.0d);
                                }
                                world.func_184138_a(_bp3, _bs3, _bs3, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp4 = new BlockPos(x, y, z);
                                TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                                IBlockState _bs4 = world.func_180495_p(_bp4);
                                if (_tileEntity4 != null) {
                                    _tileEntity4.getTileData().func_74780_a("本命灵力", 8000.0d);
                                }
                                world.func_184138_a(_bp4, _bs4, _bs4, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp5 = new BlockPos(x, y, z);
                                TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                                IBlockState _bs5 = world.func_180495_p(_bp5);
                                if (_tileEntity5 != null) {
                                    _tileEntity5.getTileData().func_74757_a("本命炼制", true);
                                }
                                world.func_184138_a(_bp5, _bs5, _bs5, 3);
                                return;
                            }
                            return;
                        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.8
                                public String getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74779_i(tag);
                                    }
                                    return "";
                                }
                            }.getValue(new BlockPos(x, y, z), "颜色") + "灵力或者真元不足以提升这个法宝"), false);
                            return;
                        } else {
                            return;
                        }
                    } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.9
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "颜色") + "你似乎还不满足该法宝的提升材料需求"), false);
                        return;
                    } else {
                        return;
                    }
                } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.10
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "颜色") + "你所使用的炼器鼎等级过低,无法提升该法宝"), false);
                    return;
                } else {
                    return;
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.11
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "颜色") + "你的境界还无法提升该法宝"), false);
                return;
            } else {
                return;
            }
        }
        if ((new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.12
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77942_o() ? new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.13
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 0).func_77978_p().func_74769_h("本命阶段") : -1.0d) == 1.0d) {
            if (!world.field_72995_K) {
                BlockPos _bp6 = new BlockPos(x, y, z);
                TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                IBlockState _bs6 = world.func_180495_p(_bp6);
                if (_tileEntity6 != null) {
                    _tileEntity6.getTileData().func_74780_a("炼制需求", 5.0d);
                }
                world.func_184138_a(_bp6, _bs6, _bs6, 3);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.14
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "炉子需求")) {
                if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.15
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "dingluLEVEL") >= new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.16
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "炼制需求")) {
                    if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.17
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCailiao19.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.18
                        public int getAmount(BlockPos pos, int sltid) {
                            ItemStack stack;
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                return stack.func_190916_E();
                            }
                            return 0;
                        }
                    }.getAmount(new BlockPos(x, y, z), 1) >= 9) {
                        if (entityPlayer.getEntityData().func_74769_h("Base") >= 5120.0d && entityPlayer.getEntityData().func_74769_h("Power") >= 26000.0d) {
                            if (!world.field_72995_K) {
                                BlockPos _bp7 = new BlockPos(x, y, z);
                                TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                                IBlockState _bs7 = world.func_180495_p(_bp7);
                                if (_tileEntity7 != null) {
                                    _tileEntity7.getTileData().func_74780_a("本命材料", 9.0d);
                                }
                                world.func_184138_a(_bp7, _bs7, _bs7, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp8 = new BlockPos(x, y, z);
                                TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                                IBlockState _bs8 = world.func_180495_p(_bp8);
                                if (_tileEntity8 != null) {
                                    _tileEntity8.getTileData().func_74780_a("本命真元", 5120.0d);
                                }
                                world.func_184138_a(_bp8, _bs8, _bs8, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp9 = new BlockPos(x, y, z);
                                TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                                IBlockState _bs9 = world.func_180495_p(_bp9);
                                if (_tileEntity9 != null) {
                                    _tileEntity9.getTileData().func_74780_a("本命灵力", 26000.0d);
                                }
                                world.func_184138_a(_bp9, _bs9, _bs9, 3);
                            }
                            if (!world.field_72995_K) {
                                BlockPos _bp10 = new BlockPos(x, y, z);
                                TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                                IBlockState _bs10 = world.func_180495_p(_bp10);
                                if (_tileEntity10 != null) {
                                    _tileEntity10.getTileData().func_74757_a("本命炼制", true);
                                }
                                world.func_184138_a(_bp10, _bs10, _bs10, 3);
                            }
                        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.19
                                public String getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74779_i(tag);
                                    }
                                    return "";
                                }
                            }.getValue(new BlockPos(x, y, z), "颜色") + "灵力或者真元不足以提升这个法宝"), false);
                        }
                    } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.20
                            public String getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74779_i(tag);
                                }
                                return "";
                            }
                        }.getValue(new BlockPos(x, y, z), "颜色") + "你似乎还不满足该法宝的提升材料需求"), false);
                    }
                } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.21
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "颜色") + "你所使用的炼器鼎等级过低,无法提升该法宝"), false);
                }
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString(new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureBenMingPiPei3.22
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "颜色") + "你的境界还无法提升该法宝"), false);
            }
        }
    }
}
