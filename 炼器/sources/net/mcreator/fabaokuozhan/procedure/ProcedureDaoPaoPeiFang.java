package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemBaiPo;
import net.mcreator.fabaokuozhan.item.ItemCaiitem04;
import net.mcreator.fabaokuozhan.item.ItemCaiitem07;
import net.mcreator.fabaokuozhan.item.ItemCaiitem08;
import net.mcreator.fabaokuozhan.item.ItemCailiao11;
import net.mcreator.fabaokuozhan.item.ItemCailiao15;
import net.mcreator.fabaokuozhan.item.ItemCailiao18;
import net.mcreator.fabaokuozhan.item.ItemCailiao19;
import net.mcreator.fabaokuozhan.item.ItemDianGuangZhiXin;
import net.mcreator.fabaokuozhan.item.ItemHuXinShi;
import net.mcreator.fabaokuozhan.item.ItemSuJinBu;
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
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureDaoPaoPeiFang.class */
public class ProcedureDaoPaoPeiFang extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureDaoPaoPeiFang(ElementsFabaokuozhanMod instance) {
        super(instance, 315);
    }

    /* JADX WARN: Type inference failed for: r0v100, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$20] */
    /* JADX WARN: Type inference failed for: r0v215, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$14] */
    /* JADX WARN: Type inference failed for: r0v218, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$15] */
    /* JADX WARN: Type inference failed for: r0v221, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$16] */
    /* JADX WARN: Type inference failed for: r0v30, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$1] */
    /* JADX WARN: Type inference failed for: r0v336, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$10] */
    /* JADX WARN: Type inference failed for: r0v339, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$11] */
    /* JADX WARN: Type inference failed for: r0v342, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$12] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$2] */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$3] */
    /* JADX WARN: Type inference failed for: r0v457, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$6] */
    /* JADX WARN: Type inference failed for: r0v46, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$4] */
    /* JADX WARN: Type inference failed for: r0v460, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$7] */
    /* JADX WARN: Type inference failed for: r0v463, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$8] */
    /* JADX WARN: Type inference failed for: r0v49, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$5] */
    /* JADX WARN: Type inference failed for: r0v55, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$9] */
    /* JADX WARN: Type inference failed for: r0v58, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$13] */
    /* JADX WARN: Type inference failed for: r0v61, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$17] */
    /* JADX WARN: Type inference failed for: r0v64, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$21] */
    /* JADX WARN: Type inference failed for: r0v78, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$22] */
    /* JADX WARN: Type inference failed for: r0v81, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$23] */
    /* JADX WARN: Type inference failed for: r0v84, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$24] */
    /* JADX WARN: Type inference failed for: r0v94, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$18] */
    /* JADX WARN: Type inference failed for: r0v97, types: [net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang$19] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!world.field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = world.func_175625_s(_bp);
            IBlockState _bs = world.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74778_a("炼制者", entityPlayer.func_145748_c_().func_150260_c());
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.1
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.2
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 7).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.3
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 8).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.4
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 9).func_77973_b() == new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.5
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b().getRegistryName().toString().equals("yvanchuliandan:cai_liao_02") && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.6
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCailiao11.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.7
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCaiitem07.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.8
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b() == new ItemStack(ItemCaiitem04.block, 1).func_77973_b() && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 1.0d) {
                if (world.func_175625_s(new BlockPos(x, y, z)).func_70301_a(4).func_190916_E() >= 1 && world.func_175625_s(new BlockPos(x, y, z)).func_70301_a(0).func_190916_E() >= 3 && world.func_175625_s(new BlockPos(x, y, z)).func_70301_a(1).func_190916_E() >= 1 && world.func_175625_s(new BlockPos(x, y, z)).func_70301_a(2).func_190916_E() >= 5) {
                    if (!world.field_72995_K) {
                        BlockPos _bp2 = new BlockPos(x, y, z);
                        TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                        IBlockState _bs2 = world.func_180495_p(_bp2);
                        if (_tileEntity2 != null) {
                            _tileEntity2.getTileData().func_74780_a("shuliang0", 3.0d);
                        }
                        world.func_184138_a(_bp2, _bs2, _bs2, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp3 = new BlockPos(x, y, z);
                        TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                        IBlockState _bs3 = world.func_180495_p(_bp3);
                        if (_tileEntity3 != null) {
                            _tileEntity3.getTileData().func_74780_a("shuliang1", 1.0d);
                        }
                        world.func_184138_a(_bp3, _bs3, _bs3, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp4 = new BlockPos(x, y, z);
                        TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                        IBlockState _bs4 = world.func_180495_p(_bp4);
                        if (_tileEntity4 != null) {
                            _tileEntity4.getTileData().func_74780_a("shuliang2", 5.0d);
                        }
                        world.func_184138_a(_bp4, _bs4, _bs4, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp5 = new BlockPos(x, y, z);
                        TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                        IBlockState _bs5 = world.func_180495_p(_bp5);
                        if (_tileEntity5 != null) {
                            _tileEntity5.getTileData().func_74780_a("shuliang3", 1.0d);
                        }
                        world.func_184138_a(_bp5, _bs5, _bs5, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp6 = new BlockPos(x, y, z);
                        TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                        IBlockState _bs6 = world.func_180495_p(_bp6);
                        if (_tileEntity6 != null) {
                            _tileEntity6.getTileData().func_74780_a("leixing", 17.0d);
                        }
                        world.func_184138_a(_bp6, _bs6, _bs6, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp7 = new BlockPos(x, y, z);
                        TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                        IBlockState _bs7 = world.func_180495_p(_bp7);
                        if (_tileEntity7 != null) {
                            _tileEntity7.getTileData().func_74780_a("扣除灵力", 70.0d);
                        }
                        world.func_184138_a(_bp7, _bs7, _bs7, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp8 = new BlockPos(x, y, z);
                        TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                        IBlockState _bs8 = world.func_180495_p(_bp8);
                        if (_tileEntity8 != null) {
                            _tileEntity8.getTileData().func_74780_a("lianqijingyan", 1.0d);
                        }
                        world.func_184138_a(_bp8, _bs8, _bs8, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.9
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemHuXinShi.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.10
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCailiao15.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.11
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCaiitem08.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.12
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(ItemCaiitem04.block, 1).func_77973_b() && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 3.0d) {
                if (world.func_175625_s(new BlockPos(x, y, z)).func_70301_a(3).func_190916_E() >= 1 && world.func_175625_s(new BlockPos(x, y, z)).func_70301_a(0).func_190916_E() >= 3 && world.func_175625_s(new BlockPos(x, y, z)).func_70301_a(1).func_190916_E() >= 1 && world.func_175625_s(new BlockPos(x, y, z)).func_70301_a(2).func_190916_E() >= 3) {
                    if (!world.field_72995_K) {
                        BlockPos _bp9 = new BlockPos(x, y, z);
                        TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                        IBlockState _bs9 = world.func_180495_p(_bp9);
                        if (_tileEntity9 != null) {
                            _tileEntity9.getTileData().func_74780_a("shuliang0", 3.0d);
                        }
                        world.func_184138_a(_bp9, _bs9, _bs9, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp10 = new BlockPos(x, y, z);
                        TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                        IBlockState _bs10 = world.func_180495_p(_bp10);
                        if (_tileEntity10 != null) {
                            _tileEntity10.getTileData().func_74780_a("shuliang1", 1.0d);
                        }
                        world.func_184138_a(_bp10, _bs10, _bs10, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp11 = new BlockPos(x, y, z);
                        TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                        IBlockState _bs11 = world.func_180495_p(_bp11);
                        if (_tileEntity11 != null) {
                            _tileEntity11.getTileData().func_74780_a("shuliang2", 3.0d);
                        }
                        world.func_184138_a(_bp11, _bs11, _bs11, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp12 = new BlockPos(x, y, z);
                        TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                        IBlockState _bs12 = world.func_180495_p(_bp12);
                        if (_tileEntity12 != null) {
                            _tileEntity12.getTileData().func_74780_a("shuliang3", 1.0d);
                        }
                        world.func_184138_a(_bp12, _bs12, _bs12, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp13 = new BlockPos(x, y, z);
                        TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                        IBlockState _bs13 = world.func_180495_p(_bp13);
                        if (_tileEntity13 != null) {
                            _tileEntity13.getTileData().func_74780_a("leixing", 18.0d);
                        }
                        world.func_184138_a(_bp13, _bs13, _bs13, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp14 = new BlockPos(x, y, z);
                        TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                        IBlockState _bs14 = world.func_180495_p(_bp14);
                        if (_tileEntity14 != null) {
                            _tileEntity14.getTileData().func_74780_a("扣除灵力", 400.0d);
                        }
                        world.func_184138_a(_bp14, _bs14, _bs14, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp15 = new BlockPos(x, y, z);
                        TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                        IBlockState _bs15 = world.func_180495_p(_bp15);
                        if (_tileEntity15 != null) {
                            _tileEntity15.getTileData().func_74780_a("lianqijingyan", 25.0d);
                        }
                        world.func_184138_a(_bp15, _bs15, _bs15, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.13
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemBaiPo.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.14
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCailiao18.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.15
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemSuJinBu.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.16
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(ItemCaiitem04.block, 1).func_77973_b() && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 5.0d) {
                if (world.func_175625_s(new BlockPos(x, y, z)).func_70301_a(3).func_190916_E() >= 1 && world.func_175625_s(new BlockPos(x, y, z)).func_70301_a(0).func_190916_E() >= 3 && world.func_175625_s(new BlockPos(x, y, z)).func_70301_a(1).func_190916_E() >= 6 && world.func_175625_s(new BlockPos(x, y, z)).func_70301_a(2).func_190916_E() >= 1) {
                    if (!world.field_72995_K) {
                        BlockPos _bp16 = new BlockPos(x, y, z);
                        TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                        IBlockState _bs16 = world.func_180495_p(_bp16);
                        if (_tileEntity16 != null) {
                            _tileEntity16.getTileData().func_74780_a("shuliang0", 3.0d);
                        }
                        world.func_184138_a(_bp16, _bs16, _bs16, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp17 = new BlockPos(x, y, z);
                        TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                        IBlockState _bs17 = world.func_180495_p(_bp17);
                        if (_tileEntity17 != null) {
                            _tileEntity17.getTileData().func_74780_a("shuliang1", 6.0d);
                        }
                        world.func_184138_a(_bp17, _bs17, _bs17, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp18 = new BlockPos(x, y, z);
                        TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                        IBlockState _bs18 = world.func_180495_p(_bp18);
                        if (_tileEntity18 != null) {
                            _tileEntity18.getTileData().func_74780_a("shuliang2", 1.0d);
                        }
                        world.func_184138_a(_bp18, _bs18, _bs18, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp19 = new BlockPos(x, y, z);
                        TileEntity _tileEntity19 = world.func_175625_s(_bp19);
                        IBlockState _bs19 = world.func_180495_p(_bp19);
                        if (_tileEntity19 != null) {
                            _tileEntity19.getTileData().func_74780_a("shuliang3", 1.0d);
                        }
                        world.func_184138_a(_bp19, _bs19, _bs19, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp20 = new BlockPos(x, y, z);
                        TileEntity _tileEntity20 = world.func_175625_s(_bp20);
                        IBlockState _bs20 = world.func_180495_p(_bp20);
                        if (_tileEntity20 != null) {
                            _tileEntity20.getTileData().func_74780_a("leixing", 19.0d);
                        }
                        world.func_184138_a(_bp20, _bs20, _bs20, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp21 = new BlockPos(x, y, z);
                        TileEntity _tileEntity21 = world.func_175625_s(_bp21);
                        IBlockState _bs21 = world.func_180495_p(_bp21);
                        if (_tileEntity21 != null) {
                            _tileEntity21.getTileData().func_74780_a("扣除灵力", 3500.0d);
                        }
                        world.func_184138_a(_bp21, _bs21, _bs21, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp22 = new BlockPos(x, y, z);
                        TileEntity _tileEntity22 = world.func_175625_s(_bp22);
                        IBlockState _bs22 = world.func_180495_p(_bp22);
                        if (_tileEntity22 != null) {
                            _tileEntity22.getTileData().func_74780_a("lianqijingyan", 625.0d);
                        }
                        world.func_184138_a(_bp22, _bs22, _bs22, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.17
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 2).func_77973_b() == new ItemStack(ItemCailiao18.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.18
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 1).func_77973_b() == new ItemStack(ItemCailiao19.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.19
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemDianGuangZhiXin.block, 1).func_77973_b() && new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.20
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b() == new ItemStack(ItemCaiitem04.block, 1).func_77973_b() && entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 5.0d) {
                if (world.func_175625_s(new BlockPos(x, y, z)).func_70301_a(3).func_190916_E() >= 1 && world.func_175625_s(new BlockPos(x, y, z)).func_70301_a(0).func_190916_E() >= 4 && world.func_175625_s(new BlockPos(x, y, z)).func_70301_a(1).func_190916_E() >= 4 && world.func_175625_s(new BlockPos(x, y, z)).func_70301_a(2).func_190916_E() >= 5) {
                    if (!world.field_72995_K) {
                        BlockPos _bp23 = new BlockPos(x, y, z);
                        TileEntity _tileEntity23 = world.func_175625_s(_bp23);
                        IBlockState _bs23 = world.func_180495_p(_bp23);
                        if (_tileEntity23 != null) {
                            _tileEntity23.getTileData().func_74780_a("shuliang0", 4.0d);
                        }
                        world.func_184138_a(_bp23, _bs23, _bs23, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp24 = new BlockPos(x, y, z);
                        TileEntity _tileEntity24 = world.func_175625_s(_bp24);
                        IBlockState _bs24 = world.func_180495_p(_bp24);
                        if (_tileEntity24 != null) {
                            _tileEntity24.getTileData().func_74780_a("shuliang1", 4.0d);
                        }
                        world.func_184138_a(_bp24, _bs24, _bs24, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp25 = new BlockPos(x, y, z);
                        TileEntity _tileEntity25 = world.func_175625_s(_bp25);
                        IBlockState _bs25 = world.func_180495_p(_bp25);
                        if (_tileEntity25 != null) {
                            _tileEntity25.getTileData().func_74780_a("shuliang2", 5.0d);
                        }
                        world.func_184138_a(_bp25, _bs25, _bs25, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp26 = new BlockPos(x, y, z);
                        TileEntity _tileEntity26 = world.func_175625_s(_bp26);
                        IBlockState _bs26 = world.func_180495_p(_bp26);
                        if (_tileEntity26 != null) {
                            _tileEntity26.getTileData().func_74780_a("shuliang3", 1.0d);
                        }
                        world.func_184138_a(_bp26, _bs26, _bs26, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp27 = new BlockPos(x, y, z);
                        TileEntity _tileEntity27 = world.func_175625_s(_bp27);
                        IBlockState _bs27 = world.func_180495_p(_bp27);
                        if (_tileEntity27 != null) {
                            _tileEntity27.getTileData().func_74780_a("leixing", 28.0d);
                        }
                        world.func_184138_a(_bp27, _bs27, _bs27, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp28 = new BlockPos(x, y, z);
                        TileEntity _tileEntity28 = world.func_175625_s(_bp28);
                        IBlockState _bs28 = world.func_180495_p(_bp28);
                        if (_tileEntity28 != null) {
                            _tileEntity28.getTileData().func_74780_a("扣除灵力", 3500.0d);
                        }
                        world.func_184138_a(_bp28, _bs28, _bs28, 3);
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp29 = new BlockPos(x, y, z);
                        TileEntity _tileEntity29 = world.func_175625_s(_bp29);
                        IBlockState _bs29 = world.func_180495_p(_bp29);
                        if (_tileEntity29 != null) {
                            _tileEntity29.getTileData().func_74780_a("lianqijingyan", 625.0d);
                        }
                        world.func_184138_a(_bp29, _bs29, _bs29, 3);
                    }
                    $_dependencies.put("entity", entityPlayer);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureLingLiCut.executeProcedure($_dependencies);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.21
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCaiitem07.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.22
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemCaiitem08.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.23
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemSuJinBu.block, 1).func_77973_b() || new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureDaoPaoPeiFang.24
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 0).func_77973_b() == new ItemStack(ItemDianGuangZhiXin.block, 1).func_77973_b()) {
                $_dependencies.put("entity", entityPlayer);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureFaBaoLianZhiTiShi.executeProcedure($_dependencies);
            } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("未确认你需制作的物品请查看玉简or器录材料是否正确"), false);
            }
        } else if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
            entityPlayer.func_146105_b(new TextComponentString("赋灵台内还有未取走的物品,请先取走后再进行制作"), false);
        }
    }
}
