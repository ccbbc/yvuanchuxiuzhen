package net.mcreator.yuanchujianzhu.procedure;

import java.util.Map;
import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYuanchujianzhuMod.ModElement.Tag
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/procedure/ProcedureTreasureChestForcedOpen.class */
public class ProcedureTreasureChestForcedOpen extends ElementsYuanchujianzhuMod.ModElement {
    public ProcedureTreasureChestForcedOpen(ElementsYuanchujianzhuMod instance) {
        super(instance, 266);
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureTreasureChestForcedOpen$1] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureTreasureChestForcedOpen$2] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureTreasureChestForcedOpen$3] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureTreasureChestForcedOpen$4] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureTreasureChestForcedOpen$5] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureTreasureChestForcedOpen.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "TreasureChestLevel") == 1.0d) {
            if (entityPlayer.getEntityData().func_74769_h("ShenShi") >= 18.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74757_a("神识", true);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("ShenShi") >= 9.0d) {
                if (Math.random() <= 0.75d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp2 = new BlockPos(x, y, z);
                        TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                        IBlockState _bs2 = world.func_180495_p(_bp2);
                        if (_tileEntity2 != null) {
                            _tileEntity2.getTileData().func_74757_a("神识", true);
                        }
                        world.func_184138_a(_bp2, _bs2, _bs2, 3);
                        return;
                    }
                    return;
                }
                entityPlayer.getEntityData().func_74780_a("BeMagicAttack", 17.0d + entityPlayer.getEntityData().func_74769_h("MagicDefense"));
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("强行打开宝箱失败受到神识反噬造成17点伤害"), false);
                }
                if (!world.field_72995_K) {
                    world.func_72876_a((Entity) null, x, y, z, 1.0f, true);
                }
                world.func_175698_g(new BlockPos(x, y, z));
            } else {
                entityPlayer.getEntityData().func_74780_a("BeMagicAttack", 17.0d + entityPlayer.getEntityData().func_74769_h("MagicDefense"));
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("强行打开宝箱失败受到神识反噬造成17点伤害"), false);
                }
                if (!world.field_72995_K) {
                    world.func_72876_a((Entity) null, x, y, z, 1.0f, true);
                }
                world.func_175698_g(new BlockPos(x, y, z));
            }
        } else if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureTreasureChestForcedOpen.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "TreasureChestLevel") == 2.0d) {
            if (entityPlayer.getEntityData().func_74769_h("ShenShi") >= 81.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74757_a("神识", true);
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("ShenShi") >= 45.0d) {
                if (Math.random() <= 0.75d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp4 = new BlockPos(x, y, z);
                        TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                        IBlockState _bs4 = world.func_180495_p(_bp4);
                        if (_tileEntity4 != null) {
                            _tileEntity4.getTileData().func_74757_a("神识", true);
                        }
                        world.func_184138_a(_bp4, _bs4, _bs4, 3);
                        return;
                    }
                    return;
                }
                entityPlayer.getEntityData().func_74780_a("BeMagicAttack", 62.0d + entityPlayer.getEntityData().func_74769_h("MagicDefense"));
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("强行打开宝箱失败受到神识反噬造成62点伤害"), false);
                }
                if (!world.field_72995_K) {
                    world.func_72876_a((Entity) null, x, y, z, 1.0f, true);
                }
                world.func_175698_g(new BlockPos(x, y, z));
            } else {
                entityPlayer.getEntityData().func_74780_a("BeMagicAttack", 62.0d + entityPlayer.getEntityData().func_74769_h("MagicDefense"));
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("强行打开宝箱失败受到神识反噬造成62点伤害"), false);
                }
                if (!world.field_72995_K) {
                    world.func_72876_a((Entity) null, x, y, z, 1.0f, true);
                }
                world.func_175698_g(new BlockPos(x, y, z));
            }
        } else if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureTreasureChestForcedOpen.3
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "TreasureChestLevel") == 3.0d) {
            if (entityPlayer.getEntityData().func_74769_h("ShenShi") >= 231.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y, z);
                    TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                    IBlockState _bs5 = world.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74757_a("神识", true);
                    }
                    world.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("ShenShi") >= 131.0d) {
                if (Math.random() <= 0.75d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp6 = new BlockPos(x, y, z);
                        TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                        IBlockState _bs6 = world.func_180495_p(_bp6);
                        if (_tileEntity6 != null) {
                            _tileEntity6.getTileData().func_74757_a("神识", true);
                        }
                        world.func_184138_a(_bp6, _bs6, _bs6, 3);
                        return;
                    }
                    return;
                }
                entityPlayer.getEntityData().func_74780_a("BeMagicAttack", 130.0d + entityPlayer.getEntityData().func_74769_h("MagicDefense"));
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("强行打开宝箱失败受到神识反噬造成130点伤害"), false);
                }
                if (!world.field_72995_K) {
                    world.func_72876_a((Entity) null, x, y, z, 1.0f, true);
                }
                world.func_175698_g(new BlockPos(x, y, z));
            } else {
                entityPlayer.getEntityData().func_74780_a("BeMagicAttack", 130.0d + entityPlayer.getEntityData().func_74769_h("MagicDefense"));
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("强行打开宝箱失败受到神识反噬造成130点伤害"), false);
                }
                if (!world.field_72995_K) {
                    world.func_72876_a((Entity) null, x, y, z, 1.0f, true);
                }
                world.func_175698_g(new BlockPos(x, y, z));
            }
        } else if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureTreasureChestForcedOpen.4
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "TreasureChestLevel") == 4.0d) {
            if (entityPlayer.getEntityData().func_74769_h("ShenShi") >= 681.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp7 = new BlockPos(x, y, z);
                    TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                    IBlockState _bs7 = world.func_180495_p(_bp7);
                    if (_tileEntity7 != null) {
                        _tileEntity7.getTileData().func_74757_a("神识", true);
                    }
                    world.func_184138_a(_bp7, _bs7, _bs7, 3);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("ShenShi") >= 381.0d) {
                if (Math.random() <= 0.75d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp8 = new BlockPos(x, y, z);
                        TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                        IBlockState _bs8 = world.func_180495_p(_bp8);
                        if (_tileEntity8 != null) {
                            _tileEntity8.getTileData().func_74757_a("神识", true);
                        }
                        world.func_184138_a(_bp8, _bs8, _bs8, 3);
                        return;
                    }
                    return;
                }
                entityPlayer.getEntityData().func_74780_a("BeMagicAttack", 380.0d + entityPlayer.getEntityData().func_74769_h("MagicDefense"));
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("强行打开宝箱失败受到神识反噬造成380点伤害"), false);
                }
                if (!world.field_72995_K) {
                    world.func_72876_a((Entity) null, x, y, z, 1.0f, true);
                }
                world.func_175698_g(new BlockPos(x, y, z));
            } else {
                entityPlayer.getEntityData().func_74780_a("BeMagicAttack", 380.0d + entityPlayer.getEntityData().func_74769_h("MagicDefense"));
                if (!world.field_72995_K) {
                    world.func_72876_a((Entity) null, x, y, z, 1.0f, true);
                }
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("强行打开宝箱失败受到神识反噬造成380点伤害"), false);
                }
                world.func_175698_g(new BlockPos(x, y, z));
            }
        } else if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureTreasureChestForcedOpen.5
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "TreasureChestLevel") == 5.0d) {
            if (entityPlayer.getEntityData().func_74769_h("ShenShi") >= 2181.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp9 = new BlockPos(x, y, z);
                    TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                    IBlockState _bs9 = world.func_180495_p(_bp9);
                    if (_tileEntity9 != null) {
                        _tileEntity9.getTileData().func_74757_a("神识", true);
                    }
                    world.func_184138_a(_bp9, _bs9, _bs9, 3);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("ShenShi") >= 1181.0d) {
                if (Math.random() <= 0.75d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp10 = new BlockPos(x, y, z);
                        TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                        IBlockState _bs10 = world.func_180495_p(_bp10);
                        if (_tileEntity10 != null) {
                            _tileEntity10.getTileData().func_74757_a("神识", true);
                        }
                        world.func_184138_a(_bp10, _bs10, _bs10, 3);
                        return;
                    }
                    return;
                }
                entityPlayer.getEntityData().func_74780_a("BeMagicAttack", 1180.0d + entityPlayer.getEntityData().func_74769_h("MagicDefense"));
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("强行打开宝箱失败受到神识反噬造成1180点伤害"), false);
                }
                if (!world.field_72995_K) {
                    world.func_72876_a((Entity) null, x, y, z, 1.0f, true);
                }
                world.func_175698_g(new BlockPos(x, y, z));
            } else {
                entityPlayer.getEntityData().func_74780_a("BeMagicAttack", 1180.0d + entityPlayer.getEntityData().func_74769_h("MagicDefense"));
                if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                    entityPlayer.func_146105_b(new TextComponentString("强行打开宝箱失败受到神识反噬造成1180点伤害"), false);
                }
                if (!world.field_72995_K) {
                    world.func_72876_a((Entity) null, x, y, z, 1.0f, true);
                }
                world.func_175698_g(new BlockPos(x, y, z));
            }
        }
    }
}
