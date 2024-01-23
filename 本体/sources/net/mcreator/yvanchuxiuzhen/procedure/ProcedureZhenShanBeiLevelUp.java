package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureZhenShanBeiLevelUp.class */
public class ProcedureZhenShanBeiLevelUp extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZhenShanBeiLevelUp(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 556);
    }

    /* JADX WARN: Type inference failed for: r0v214, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$16] */
    /* JADX WARN: Type inference failed for: r0v343, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$8] */
    /* JADX WARN: Type inference failed for: r0v472, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$1] */
    /* JADX WARN: Type inference failed for: r0v63, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$32] */
    /* JADX WARN: Type inference failed for: r0v74, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$24] */
    /* JADX WARN: Type inference failed for: r2v122, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$10] */
    /* JADX WARN: Type inference failed for: r2v139, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$9] */
    /* JADX WARN: Type inference failed for: r2v168, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$3] */
    /* JADX WARN: Type inference failed for: r2v182, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$2] */
    /* JADX WARN: Type inference failed for: r2v27, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$26] */
    /* JADX WARN: Type inference failed for: r2v3, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$34] */
    /* JADX WARN: Type inference failed for: r2v47, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$25] */
    /* JADX WARN: Type inference failed for: r2v76, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$18] */
    /* JADX WARN: Type inference failed for: r2v93, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$17] */
    /* JADX WARN: Type inference failed for: r3v135, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$4] */
    /* JADX WARN: Type inference failed for: r3v16, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$27] */
    /* JADX WARN: Type inference failed for: r3v57, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$19] */
    /* JADX WARN: Type inference failed for: r3v96, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$11] */
    /* JADX WARN: Type inference failed for: r4v101, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$14] */
    /* JADX WARN: Type inference failed for: r4v136, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$5] */
    /* JADX WARN: Type inference failed for: r4v20, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$28] */
    /* JADX WARN: Type inference failed for: r4v23, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$30] */
    /* JADX WARN: Type inference failed for: r4v60, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$20] */
    /* JADX WARN: Type inference failed for: r4v63, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$22] */
    /* JADX WARN: Type inference failed for: r4v98, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$12] */
    /* JADX WARN: Type inference failed for: r5v13, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$29] */
    /* JADX WARN: Type inference failed for: r5v17, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$31] */
    /* JADX WARN: Type inference failed for: r5v27, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$21] */
    /* JADX WARN: Type inference failed for: r5v31, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$23] */
    /* JADX WARN: Type inference failed for: r5v41, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$13] */
    /* JADX WARN: Type inference failed for: r5v45, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$15] */
    /* JADX WARN: Type inference failed for: r5v55, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$6] */
    /* JADX WARN: Type inference failed for: r5v57, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$7] */
    /* JADX WARN: Type inference failed for: r6v2, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp$33] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (entityPlayer.getEntityData().func_74769_h("SectJobLevel") >= 5.0d) {
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74780_a("SectLimit6", 1.0d);
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 2.0d && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.1
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "SectLevel") == 1.0d && (entityPlayer instanceof EntityPlayer) && entityPlayer.field_71071_by.func_70431_c(new ItemStack(Item.func_111206_d("yvanchuxiuzhenfulu:protect_sect_front_02"), 1)) && (entityPlayer instanceof EntityPlayer) && entityPlayer.field_71071_by.func_70431_c(new ItemStack(Item.func_111206_d("fabaokuozhan:suppress_monster_sword_2"), 1)) && (entityPlayer instanceof EntityPlayer) && entityPlayer.field_71071_by.func_70431_c(new ItemStack(Item.func_111206_d("yvanchuxiuzhenfulu:cloud_map_charm_2"), 1))) {
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(Item.func_111206_d("yvanchuxiuzhenfulu:protect_sect_front_02"), 1).func_77973_b(), -1, 1, (NBTTagCompound) null);
                }
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(Item.func_111206_d("fabaokuozhan:suppress_monster_sword_2"), 1).func_77973_b(), -1, 1, (NBTTagCompound) null);
                }
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(Item.func_111206_d("yvanchuxiuzhenfulu:cloud_map_charm_2"), 1).func_77973_b(), -1, 1, (NBTTagCompound) null);
                }
                entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§2§l升级成功");
                $_dependencies.put("entity", entityPlayer);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureZhenShanBeiLeveGive.executeProcedure($_dependencies);
                if (!world.field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                    IBlockState _bs2 = world.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74780_a("SectLimit", 10.0d);
                    }
                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74780_a("SectLevel", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.2
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLevel") + 1.0d);
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z);
                    TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                    IBlockState _bs4 = world.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74780_a("SectLimit4", 1.0d);
                    }
                    world.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y, z);
                    TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                    IBlockState _bs5 = world.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74780_a("SectLimit3", 1.0d);
                    }
                    world.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp6 = new BlockPos(x, y, z);
                    TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                    IBlockState _bs6 = world.func_180495_p(_bp6);
                    if (_tileEntity6 != null) {
                        _tileEntity6.getTileData().func_74780_a("SectLimit2", 2.0d);
                    }
                    world.func_184138_a(_bp6, _bs6, _bs6, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp7 = new BlockPos(x, y, z);
                    TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                    IBlockState _bs7 = world.func_180495_p(_bp7);
                    if (_tileEntity7 != null) {
                        _tileEntity7.getTileData().func_74780_a("SectLimit1", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.3
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit") - (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.4
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit4") - ((new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.5
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit3") - new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.6
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit2")) - new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.7
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit6"))));
                    }
                    world.func_184138_a(_bp7, _bs7, _bs7, 3);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 3.0d && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.8
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "SectLevel") == 2.0d && (entityPlayer instanceof EntityPlayer) && entityPlayer.field_71071_by.func_70431_c(new ItemStack(Item.func_111206_d("yvanchuxiuzhenfulu:protect_sect_front_03"), 1)) && (entityPlayer instanceof EntityPlayer) && entityPlayer.field_71071_by.func_70431_c(new ItemStack(Item.func_111206_d("fabaokuozhan:suppress_monster_sword_3"), 1)) && (entityPlayer instanceof EntityPlayer) && entityPlayer.field_71071_by.func_70431_c(new ItemStack(Item.func_111206_d("yvanchuxiuzhenfulu:cloud_map_charm_3"), 1))) {
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(Item.func_111206_d("yvanchuxiuzhenfulu:protect_sect_front_03"), 1).func_77973_b(), -1, 1, (NBTTagCompound) null);
                }
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(Item.func_111206_d("fabaokuozhan:suppress_monster_sword_3"), 1).func_77973_b(), -1, 1, (NBTTagCompound) null);
                }
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(Item.func_111206_d("yvanchuxiuzhenfulu:cloud_map_charm_3"), 1).func_77973_b(), -1, 1, (NBTTagCompound) null);
                }
                $_dependencies.put("entity", entityPlayer);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureZhenShanBeiLeveGive.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§2§l升级成功");
                if (!world.field_72995_K) {
                    BlockPos _bp8 = new BlockPos(x, y, z);
                    TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                    IBlockState _bs8 = world.func_180495_p(_bp8);
                    if (_tileEntity8 != null) {
                        _tileEntity8.getTileData().func_74780_a("SectLimit", 15.0d);
                    }
                    world.func_184138_a(_bp8, _bs8, _bs8, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp9 = new BlockPos(x, y, z);
                    TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                    IBlockState _bs9 = world.func_180495_p(_bp9);
                    if (_tileEntity9 != null) {
                        _tileEntity9.getTileData().func_74780_a("SectLevel", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.9
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLevel") + 1.0d);
                    }
                    world.func_184138_a(_bp9, _bs9, _bs9, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp10 = new BlockPos(x, y, z);
                    TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                    IBlockState _bs10 = world.func_180495_p(_bp10);
                    if (_tileEntity10 != null) {
                        _tileEntity10.getTileData().func_74780_a("SectLimit5", 1.0d);
                    }
                    world.func_184138_a(_bp10, _bs10, _bs10, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp11 = new BlockPos(x, y, z);
                    TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                    IBlockState _bs11 = world.func_180495_p(_bp11);
                    if (_tileEntity11 != null) {
                        _tileEntity11.getTileData().func_74780_a("SectLimit4", 2.0d);
                    }
                    world.func_184138_a(_bp11, _bs11, _bs11, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp12 = new BlockPos(x, y, z);
                    TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                    IBlockState _bs12 = world.func_180495_p(_bp12);
                    if (_tileEntity12 != null) {
                        _tileEntity12.getTileData().func_74780_a("SectLimit3", 1.0d);
                    }
                    world.func_184138_a(_bp12, _bs12, _bs12, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp13 = new BlockPos(x, y, z);
                    TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                    IBlockState _bs13 = world.func_180495_p(_bp13);
                    if (_tileEntity13 != null) {
                        _tileEntity13.getTileData().func_74780_a("SectLimit2", 3.0d);
                    }
                    world.func_184138_a(_bp13, _bs13, _bs13, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp14 = new BlockPos(x, y, z);
                    TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                    IBlockState _bs14 = world.func_180495_p(_bp14);
                    if (_tileEntity14 != null) {
                        _tileEntity14.getTileData().func_74780_a("SectLimit1", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.10
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit") - ((new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.11
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit4") - (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.12
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit3") - new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.13
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit2"))) - (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.14
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit5") - new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.15
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit6"))));
                    }
                    world.func_184138_a(_bp14, _bs14, _bs14, 3);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 4.0d && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.16
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "SectLevel") == 3.0d && (entityPlayer instanceof EntityPlayer) && entityPlayer.field_71071_by.func_70431_c(new ItemStack(Item.func_111206_d("yvanchuxiuzhenfulu:protect_sect_front_04"), 1)) && (entityPlayer instanceof EntityPlayer) && entityPlayer.field_71071_by.func_70431_c(new ItemStack(Item.func_111206_d("fabaokuozhan:suppress_monster_sword_4"), 1)) && (entityPlayer instanceof EntityPlayer) && entityPlayer.field_71071_by.func_70431_c(new ItemStack(Item.func_111206_d("yvanchuxiuzhenfulu:cloud_map_charm_4"), 1))) {
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(Item.func_111206_d("yvanchuxiuzhenfulu:protect_sect_front_04"), 1).func_77973_b(), -1, 1, (NBTTagCompound) null);
                }
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(Item.func_111206_d("fabaokuozhan:suppress_monster_sword_4"), 1).func_77973_b(), -1, 1, (NBTTagCompound) null);
                }
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(Item.func_111206_d("yvanchuxiuzhenfulu:cloud_map_charm_4"), 1).func_77973_b(), -1, 1, (NBTTagCompound) null);
                }
                $_dependencies.put("entity", entityPlayer);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureZhenShanBeiLeveGive.executeProcedure($_dependencies);
                entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§2§l升级成功");
                if (!world.field_72995_K) {
                    BlockPos _bp15 = new BlockPos(x, y, z);
                    TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                    IBlockState _bs15 = world.func_180495_p(_bp15);
                    if (_tileEntity15 != null) {
                        _tileEntity15.getTileData().func_74780_a("SectLimit", 20.0d);
                    }
                    world.func_184138_a(_bp15, _bs15, _bs15, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp16 = new BlockPos(x, y, z);
                    TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                    IBlockState _bs16 = world.func_180495_p(_bp16);
                    if (_tileEntity16 != null) {
                        _tileEntity16.getTileData().func_74780_a("SectLevel", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.17
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLevel") + 1.0d);
                    }
                    world.func_184138_a(_bp16, _bs16, _bs16, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp17 = new BlockPos(x, y, z);
                    TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                    IBlockState _bs17 = world.func_180495_p(_bp17);
                    if (_tileEntity17 != null) {
                        _tileEntity17.getTileData().func_74780_a("SectLimit5", 1.0d);
                    }
                    world.func_184138_a(_bp17, _bs17, _bs17, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp18 = new BlockPos(x, y, z);
                    TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                    IBlockState _bs18 = world.func_180495_p(_bp18);
                    if (_tileEntity18 != null) {
                        _tileEntity18.getTileData().func_74780_a("SectLimit4", 3.0d);
                    }
                    world.func_184138_a(_bp18, _bs18, _bs18, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp19 = new BlockPos(x, y, z);
                    TileEntity _tileEntity19 = world.func_175625_s(_bp19);
                    IBlockState _bs19 = world.func_180495_p(_bp19);
                    if (_tileEntity19 != null) {
                        _tileEntity19.getTileData().func_74780_a("SectLimit3", 2.0d);
                    }
                    world.func_184138_a(_bp19, _bs19, _bs19, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp20 = new BlockPos(x, y, z);
                    TileEntity _tileEntity20 = world.func_175625_s(_bp20);
                    IBlockState _bs20 = world.func_180495_p(_bp20);
                    if (_tileEntity20 != null) {
                        _tileEntity20.getTileData().func_74780_a("SectLimit2", 4.0d);
                    }
                    world.func_184138_a(_bp20, _bs20, _bs20, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp21 = new BlockPos(x, y, z);
                    TileEntity _tileEntity21 = world.func_175625_s(_bp21);
                    IBlockState _bs21 = world.func_180495_p(_bp21);
                    if (_tileEntity21 != null) {
                        _tileEntity21.getTileData().func_74780_a("SectLimit1", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.18
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit") - ((new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.19
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit4") - (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.20
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit3") - new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.21
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit2"))) - (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.22
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit5") - new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.23
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit6"))));
                    }
                    world.func_184138_a(_bp21, _bs21, _bs21, 3);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 5.0d && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.24
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "SectLevel") == 4.0d && (entityPlayer instanceof EntityPlayer) && entityPlayer.field_71071_by.func_70431_c(new ItemStack(Item.func_111206_d("yvanchuxiuzhenfulu:protect_sect_front_05"), 1)) && (entityPlayer instanceof EntityPlayer) && entityPlayer.field_71071_by.func_70431_c(new ItemStack(Item.func_111206_d("fabaokuozhan:suppress_monster_sword_5"), 1)) && (entityPlayer instanceof EntityPlayer) && entityPlayer.field_71071_by.func_70431_c(new ItemStack(Item.func_111206_d("yvanchuxiuzhenfulu:cloud_map_charm_5"), 1))) {
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(Item.func_111206_d("yvanchuxiuzhenfulu:protect_sect_front_05"), 1).func_77973_b(), -1, 1, (NBTTagCompound) null);
                }
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(Item.func_111206_d("fabaokuozhan:suppress_monster_sword_5"), 1).func_77973_b(), -1, 1, (NBTTagCompound) null);
                }
                if (entityPlayer instanceof EntityPlayer) {
                    entityPlayer.field_71071_by.func_174925_a(new ItemStack(Item.func_111206_d("yvanchuxiuzhenfulu:cloud_map_charm_5"), 1).func_77973_b(), -1, 1, (NBTTagCompound) null);
                }
                entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§2§l升级成功");
                $_dependencies.put("entity", entityPlayer);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureZhenShanBeiLeveGive.executeProcedure($_dependencies);
                if (!world.field_72995_K) {
                    BlockPos _bp22 = new BlockPos(x, y, z);
                    TileEntity _tileEntity22 = world.func_175625_s(_bp22);
                    IBlockState _bs22 = world.func_180495_p(_bp22);
                    if (_tileEntity22 != null) {
                        _tileEntity22.getTileData().func_74780_a("SectLimit", 30.0d);
                    }
                    world.func_184138_a(_bp22, _bs22, _bs22, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp23 = new BlockPos(x, y, z);
                    TileEntity _tileEntity23 = world.func_175625_s(_bp23);
                    IBlockState _bs23 = world.func_180495_p(_bp23);
                    if (_tileEntity23 != null) {
                        _tileEntity23.getTileData().func_74780_a("SectLevel", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.25
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLevel") + 1.0d);
                    }
                    world.func_184138_a(_bp23, _bs23, _bs23, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp24 = new BlockPos(x, y, z);
                    TileEntity _tileEntity24 = world.func_175625_s(_bp24);
                    IBlockState _bs24 = world.func_180495_p(_bp24);
                    if (_tileEntity24 != null) {
                        _tileEntity24.getTileData().func_74780_a("SectLimit5", 1.0d);
                    }
                    world.func_184138_a(_bp24, _bs24, _bs24, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp25 = new BlockPos(x, y, z);
                    TileEntity _tileEntity25 = world.func_175625_s(_bp25);
                    IBlockState _bs25 = world.func_180495_p(_bp25);
                    if (_tileEntity25 != null) {
                        _tileEntity25.getTileData().func_74780_a("SectLimit4", 4.0d);
                    }
                    world.func_184138_a(_bp25, _bs25, _bs25, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp26 = new BlockPos(x, y, z);
                    TileEntity _tileEntity26 = world.func_175625_s(_bp26);
                    IBlockState _bs26 = world.func_180495_p(_bp26);
                    if (_tileEntity26 != null) {
                        _tileEntity26.getTileData().func_74780_a("SectLimit3", 3.0d);
                    }
                    world.func_184138_a(_bp26, _bs26, _bs26, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp27 = new BlockPos(x, y, z);
                    TileEntity _tileEntity27 = world.func_175625_s(_bp27);
                    IBlockState _bs27 = world.func_180495_p(_bp27);
                    if (_tileEntity27 != null) {
                        _tileEntity27.getTileData().func_74780_a("SectLimit2", 5.0d);
                    }
                    world.func_184138_a(_bp27, _bs27, _bs27, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp28 = new BlockPos(x, y, z);
                    TileEntity _tileEntity28 = world.func_175625_s(_bp28);
                    IBlockState _bs28 = world.func_180495_p(_bp28);
                    if (_tileEntity28 != null) {
                        _tileEntity28.getTileData().func_74780_a("SectLimit2", 5.0d);
                    }
                    world.func_184138_a(_bp28, _bs28, _bs28, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp29 = new BlockPos(x, y, z);
                    TileEntity _tileEntity29 = world.func_175625_s(_bp29);
                    IBlockState _bs29 = world.func_180495_p(_bp29);
                    if (_tileEntity29 != null) {
                        _tileEntity29.getTileData().func_74780_a("SectLimit1", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.26
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit") - ((new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.27
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit4") - (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.28
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit3") - new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.29
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit2"))) - (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.30
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit5") - new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.31
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "SectLimit6"))));
                    }
                    world.func_184138_a(_bp29, _bs29, _bs29, 3);
                }
            } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.32
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "SectLevel") == 5.0d) {
                entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§4§l已达上限");
            } else if (!entityPlayer.getEntityData().func_74779_i("SxlGuiTip").equals("§2§l升级成功")) {
                entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§4§l升级失败");
            }
        } else {
            entityPlayer.getEntityData().func_74778_a("SxlGuiTip", "§4§l权限不足");
        }
        if (!world.field_72995_K) {
            BlockPos _bp30 = new BlockPos(x, y, z);
            TileEntity _tileEntity30 = world.func_175625_s(_bp30);
            IBlockState _bs30 = world.func_180495_p(_bp30);
            if (_tileEntity30 != null) {
                _tileEntity30.getTileData().func_74778_a("SectLevelName", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.34
                    public String getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74779_i(tag);
                        }
                        return "";
                    }
                }.getValue(new BlockPos(x, y, z), "SectLevelName" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureZhenShanBeiLevelUp.33
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "SectLevel"))));
            }
            world.func_184138_a(_bp30, _bs30, _bs30, 3);
        }
    }
}
