package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureLingLiCut.class */
public class ProcedureLingLiCut extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureLingLiCut(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 295);
    }

    /* JADX WARN: Type inference failed for: r0v101, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$52] */
    /* JADX WARN: Type inference failed for: r0v118, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$53] */
    /* JADX WARN: Type inference failed for: r0v133, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$51] */
    /* JADX WARN: Type inference failed for: r0v149, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$28] */
    /* JADX WARN: Type inference failed for: r0v152, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$29] */
    /* JADX WARN: Type inference failed for: r0v155, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$42] */
    /* JADX WARN: Type inference failed for: r0v242, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$23] */
    /* JADX WARN: Type inference failed for: r0v246, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$21] */
    /* JADX WARN: Type inference failed for: r0v253, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$19] */
    /* JADX WARN: Type inference failed for: r0v260, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$17] */
    /* JADX WARN: Type inference failed for: r0v267, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$15] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$1] */
    /* JADX WARN: Type inference failed for: r0v281, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$5] */
    /* JADX WARN: Type inference failed for: r0v291, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$6] */
    /* JADX WARN: Type inference failed for: r0v294, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$7] */
    /* JADX WARN: Type inference failed for: r0v297, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$8] */
    /* JADX WARN: Type inference failed for: r0v300, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$9] */
    /* JADX WARN: Type inference failed for: r0v303, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$10] */
    /* JADX WARN: Type inference failed for: r0v306, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$11] */
    /* JADX WARN: Type inference failed for: r0v309, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$12] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$4] */
    /* JADX WARN: Type inference failed for: r0v312, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$3] */
    /* JADX WARN: Type inference failed for: r0v34, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$13] */
    /* JADX WARN: Type inference failed for: r0v36, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$14] */
    /* JADX WARN: Type inference failed for: r0v42, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$16] */
    /* JADX WARN: Type inference failed for: r0v48, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$18] */
    /* JADX WARN: Type inference failed for: r0v54, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$20] */
    /* JADX WARN: Type inference failed for: r0v60, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$22] */
    /* JADX WARN: Type inference failed for: r0v83, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$47] */
    /* JADX WARN: Type inference failed for: r0v85, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$48] */
    /* JADX WARN: Type inference failed for: r0v87, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$49] */
    /* JADX WARN: Type inference failed for: r0v95, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$50] */
    /* JADX WARN: Type inference failed for: r1v106, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$33] */
    /* JADX WARN: Type inference failed for: r1v12, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$2] */
    /* JADX WARN: Type inference failed for: r1v37, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$45] */
    /* JADX WARN: Type inference failed for: r1v68, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$54] */
    /* JADX WARN: Type inference failed for: r1v90, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$30] */
    /* JADX WARN: Type inference failed for: r1v95, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$43] */
    /* JADX WARN: Type inference failed for: r2v111, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$41] */
    /* JADX WARN: Type inference failed for: r2v116, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$39] */
    /* JADX WARN: Type inference failed for: r2v119, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$35] */
    /* JADX WARN: Type inference failed for: r2v125, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$31] */
    /* JADX WARN: Type inference failed for: r2v133, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$27] */
    /* JADX WARN: Type inference failed for: r2v93, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$44] */
    /* JADX WARN: Type inference failed for: r2v98, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$34] */
    /* JADX WARN: Type inference failed for: r3v16, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$46] */
    /* JADX WARN: Type inference failed for: r3v58, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$36] */
    /* JADX WARN: Type inference failed for: r3v70, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$40] */
    /* JADX WARN: Type inference failed for: r3v79, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$32] */
    /* JADX WARN: Type inference failed for: r4v43, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$37] */
    /* JADX WARN: Type inference failed for: r4v61, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$38] */
    /* JADX WARN: Type inference failed for: r4v80, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$24] */
    /* JADX WARN: Type inference failed for: r5v53, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$25] */
    /* JADX WARN: Type inference failed for: r5v58, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut$26] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") != new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing2") && new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.3
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() != new ItemStack(Blocks.field_150350_a, 1).func_77973_b()) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("§c无法进行画符,存在以下问题:欲画符箓与以成型符箓不同,请先拿下以成型符箓后再进行画符"), false);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.4
            public ItemStack getItemStack(BlockPos pos, int sltid) {
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if (func_175625_s instanceof TileEntityLockableLoot) {
                    return func_175625_s.func_70301_a(sltid);
                }
                return ItemStack.field_190927_a;
            }
        }.getItemStack(new BlockPos(x, y, z), 6).func_77973_b() != new ItemStack(Blocks.field_150350_a, 1).func_77973_b() && (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.5
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 34.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.6
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 35.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.7
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 42.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.8
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 43.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.9
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 52.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.10
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 53.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.11
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 54.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.12
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "leixing") == 55.0d)) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("§c无法进行画符,存在以下问题:欲画符箓为每组单个符箓,请先拿走已成型符箓后再进行画符"), false);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.13
            public int getAmount(BlockPos pos, int sltid) {
                ItemStack stack;
                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                    return stack.func_190916_E();
                }
                return 0;
            }
        }.getAmount(new BlockPos(x, y, z), 6) > 15) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("§c无法进行画符,存在以下问题:欲画符箓为每组16个符箓,请先拿走成型符箓后再进行画符"), false);
            }
        } else {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.14
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi03")) {
                ItemStack _stack = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.15
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3);
                if (!_stack.func_77942_o()) {
                    _stack.func_77982_d(new NBTTagCompound());
                }
                _stack.func_77978_p().func_74780_a("PowerNum", 10.0d);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.16
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:cailiaolingshi05")) {
                ItemStack _stack2 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.17
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3);
                if (!_stack2.func_77942_o()) {
                    _stack2.func_77982_d(new NBTTagCompound());
                }
                _stack2.func_77978_p().func_74780_a("PowerNum", 1000.0d);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.18
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:ling_shi_kuai_1")) {
                ItemStack _stack3 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.19
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3);
                if (!_stack3.func_77942_o()) {
                    _stack3.func_77982_d(new NBTTagCompound());
                }
                _stack3.func_77978_p().func_74780_a("PowerNum", 90.0d);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.20
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 3).func_77973_b().getRegistryName().toString().equals("yvanchuxiuzhen:ling_shi_kuai_2")) {
                ItemStack _stack4 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.21
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            return func_175625_s.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 3);
                if (!_stack4.func_77942_o()) {
                    _stack4.func_77982_d(new NBTTagCompound());
                }
                _stack4.func_77978_p().func_74780_a("PowerNum", 9000.0d);
            }
            if ((new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.22
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.23
                public ItemStack getItemStack(BlockPos pos, int sltid) {
                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                    if (func_175625_s instanceof TileEntityLockableLoot) {
                        return func_175625_s.func_70301_a(sltid);
                    }
                    return ItemStack.field_190927_a;
                }
            }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74769_h("PowerNum") : -1.0d) > 0.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("powerTemp", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.27
                            int convert(String s) {
                                try {
                                    return Integer.parseInt(s.trim());
                                } catch (Exception e) {
                                    return 0;
                                }
                            }
                        }.convert(new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.24
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "扣除灵力") / (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.25
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.26
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74769_h("PowerNum") : -1.0d))));
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.28
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "powerTemp") <= 0.0d && !world.field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                    IBlockState _bs2 = world.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74780_a("powerTemp", 1.0d);
                    }
                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.29
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "powerTemp") > new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.30
                    public int getAmount(BlockPos pos, int sltid) {
                        ItemStack stack;
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                        if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                            return stack.func_190916_E();
                        }
                        return 0;
                    }
                }.getAmount(new BlockPos(x, y, z), 3)) {
                    if (!world.field_72995_K) {
                        BlockPos _bp3 = new BlockPos(x, y, z);
                        TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                        IBlockState _bs3 = world.func_180495_p(_bp3);
                        if (_tileEntity3 != null) {
                            _tileEntity3.getTileData().func_74780_a("powerTemp2", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.31
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "powerTemp") - new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.32
                                public int getAmount(BlockPos pos, int sltid) {
                                    ItemStack stack;
                                    TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                    if ((func_175625_s instanceof TileEntityLockableLoot) && (stack = func_175625_s.func_70301_a(sltid)) != null) {
                                        return stack.func_190916_E();
                                    }
                                    return 0;
                                }
                            }.getAmount(new BlockPos(x, y, z), 3));
                        }
                        world.func_184138_a(_bp3, _bs3, _bs3, 3);
                    }
                    if (entityPlayer.getEntityData().func_74769_h("Power") >= new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.33
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "powerTemp2") * (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.34
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.35
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                            if (func_175625_s instanceof TileEntityLockableLoot) {
                                return func_175625_s.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74769_h("PowerNum") : -1.0d)) {
                        entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.36
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "powerTemp2") * (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.37
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77942_o() ? new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.38
                            public ItemStack getItemStack(BlockPos pos, int sltid) {
                                TileEntityLockableLoot func_175625_s = world.func_175625_s(pos);
                                if (func_175625_s instanceof TileEntityLockableLoot) {
                                    return func_175625_s.func_70301_a(sltid);
                                }
                                return ItemStack.field_190927_a;
                            }
                        }.getItemStack(new BlockPos(x, y, z), 3).func_77978_p().func_74769_h("PowerNum") : -1.0d)));
                        if (!world.field_72995_K) {
                            BlockPos _bp4 = new BlockPos(x, y, z);
                            TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                            IBlockState _bs4 = world.func_180495_p(_bp4);
                            if (_tileEntity4 != null) {
                                _tileEntity4.getTileData().func_74780_a("powerTemp", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.39
                                    public double getValue(BlockPos pos, String tag) {
                                        TileEntity tileEntity = world.func_175625_s(pos);
                                        if (tileEntity != null) {
                                            return tileEntity.getTileData().func_74769_h(tag);
                                        }
                                        return -1.0d;
                                    }
                                }.getValue(new BlockPos(x, y, z), "powerTemp") - new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.40
                                    public double getValue(BlockPos pos, String tag) {
                                        TileEntity tileEntity = world.func_175625_s(pos);
                                        if (tileEntity != null) {
                                            return tileEntity.getTileData().func_74769_h(tag);
                                        }
                                        return -1.0d;
                                    }
                                }.getValue(new BlockPos(x, y, z), "powerTemp2"));
                            }
                            world.func_184138_a(_bp4, _bs4, _bs4, 3);
                        }
                        TileEntityLockableLoot func_175625_s = world.func_175625_s(new BlockPos(x, y, z));
                        if (func_175625_s instanceof TileEntityLockableLoot) {
                            func_175625_s.func_70298_a(3, (int) new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.41
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), "powerTemp"));
                        }
                        if (!world.field_72995_K) {
                            BlockPos _bp5 = new BlockPos(x, y, z);
                            TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                            IBlockState _bs5 = world.func_180495_p(_bp5);
                            if (_tileEntity5 != null) {
                                _tileEntity5.getTileData().func_74757_a("kaishi", true);
                            }
                            world.func_184138_a(_bp5, _bs5, _bs5, 3);
                        }
                    }
                } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.42
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "powerTemp") <= new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.43
                    public int getAmount(BlockPos pos, int sltid) {
                        ItemStack stack;
                        TileEntityLockableLoot func_175625_s2 = world.func_175625_s(pos);
                        if ((func_175625_s2 instanceof TileEntityLockableLoot) && (stack = func_175625_s2.func_70301_a(sltid)) != null) {
                            return stack.func_190916_E();
                        }
                        return 0;
                    }
                }.getAmount(new BlockPos(x, y, z), 3)) {
                    TileEntityLockableLoot func_175625_s2 = world.func_175625_s(new BlockPos(x, y, z));
                    if (func_175625_s2 instanceof TileEntityLockableLoot) {
                        func_175625_s2.func_70298_a(3, (int) new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.44
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "powerTemp"));
                    }
                    if (!world.field_72995_K) {
                        BlockPos _bp6 = new BlockPos(x, y, z);
                        TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                        IBlockState _bs6 = world.func_180495_p(_bp6);
                        if (_tileEntity6 != null) {
                            _tileEntity6.getTileData().func_74757_a("kaishi", true);
                        }
                        world.func_184138_a(_bp6, _bs6, _bs6, 3);
                    }
                }
            } else if (entityPlayer.getEntityData().func_74769_h("Power") >= new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.45
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "扣除灵力")) {
                entityPlayer.getEntityData().func_74780_a("Power", entityPlayer.getEntityData().func_74769_h("Power") - new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.46
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "扣除灵力"));
                if (!world.field_72995_K) {
                    BlockPos _bp7 = new BlockPos(x, y, z);
                    TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                    IBlockState _bs7 = world.func_180495_p(_bp7);
                    if (_tileEntity7 != null) {
                        _tileEntity7.getTileData().func_74757_a("kaishi", true);
                    }
                    world.func_184138_a(_bp7, _bs7, _bs7, 3);
                }
            }
            if (!new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.47
                public boolean getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74767_n(tag);
                    }
                    return false;
                }
            }.getValue(new BlockPos(x, y, z), "kaishi") && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("§c无法进行画符,存在以下问题:灵石或灵力不足"), false);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.48
                public boolean getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74767_n(tag);
                    }
                    return false;
                }
            }.getValue(new BlockPos(x, y, z), "kaishi")) {
                ItemStack _ist = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.49
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s3 = world.func_175625_s(pos);
                        if (func_175625_s3 instanceof TileEntityLockableLoot) {
                            return func_175625_s3.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 0);
                if (_ist.func_96631_a(1, new Random(), (EntityPlayerMP) null)) {
                    _ist.func_190918_g(1);
                    _ist.func_77964_b(0);
                }
                TileEntityLockableLoot func_175625_s3 = world.func_175625_s(new BlockPos(x, y, z));
                if (func_175625_s3 instanceof TileEntityLockableLoot) {
                    func_175625_s3.func_70298_a(1, 1);
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.50
                    public ItemStack getItemStack(BlockPos pos, int sltid) {
                        TileEntityLockableLoot func_175625_s4 = world.func_175625_s(pos);
                        if (func_175625_s4 instanceof TileEntityLockableLoot) {
                            return func_175625_s4.func_70301_a(sltid);
                        }
                        return ItemStack.field_190927_a;
                    }
                }.getItemStack(new BlockPos(x, y, z), 4).func_77973_b().getRegistryName().toString().equals("fabaokuozhan:caiitem04")) {
                    new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.51
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s4 = world.func_175625_s(pos);
                            if (func_175625_s4 instanceof TileEntityLockableLoot) {
                                return func_175625_s4.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4).func_190918_g(1);
                }
                if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.52
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "扣除耐久") > 0.0d) {
                    if (!world.field_72995_K) {
                        BlockPos _bp8 = new BlockPos(x, y, z);
                        TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                        IBlockState _bs8 = world.func_180495_p(_bp8);
                        if (_tileEntity8 != null) {
                            _tileEntity8.getTileData().func_74757_a("法宝", true);
                        }
                        world.func_184138_a(_bp8, _bs8, _bs8, 3);
                    }
                    ItemStack _ist2 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.53
                        public ItemStack getItemStack(BlockPos pos, int sltid) {
                            TileEntityLockableLoot func_175625_s4 = world.func_175625_s(pos);
                            if (func_175625_s4 instanceof TileEntityLockableLoot) {
                                return func_175625_s4.func_70301_a(sltid);
                            }
                            return ItemStack.field_190927_a;
                        }
                    }.getItemStack(new BlockPos(x, y, z), 4);
                    if (_ist2.func_96631_a((int) new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureLingLiCut.54
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "扣除耐久"), new Random(), (EntityPlayerMP) null)) {
                        _ist2.func_190918_g(1);
                        _ist2.func_77964_b(0);
                    }
                }
                Map<String, Object> $_dependencies = new HashMap<>();
                $_dependencies.put("entity", entityPlayer);
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureZhifutaiGengXinYouXiKe.executeProcedure($_dependencies);
            }
        }
    }
}
