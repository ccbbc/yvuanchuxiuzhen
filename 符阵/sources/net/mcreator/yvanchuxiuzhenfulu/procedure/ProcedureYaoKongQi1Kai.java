package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureYaoKongQi1Kai.class */
public class ProcedureYaoKongQi1Kai extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureYaoKongQi1Kai(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 335);
    }

    /* JADX WARN: Type inference failed for: r0v117, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai$1] */
    /* JADX WARN: Type inference failed for: r0v120, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai$2] */
    /* JADX WARN: Type inference failed for: r0v123, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai$3] */
    /* JADX WARN: Type inference failed for: r0v126, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai$4] */
    /* JADX WARN: Type inference failed for: r0v129, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai$5] */
    /* JADX WARN: Type inference failed for: r0v132, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai$6] */
    /* JADX WARN: Type inference failed for: r0v135, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai$7] */
    /* JADX WARN: Type inference failed for: r0v138, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai$8] */
    /* JADX WARN: Type inference failed for: r0v141, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai$9] */
    /* JADX WARN: Type inference failed for: r0v144, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai$10] */
    /* JADX WARN: Type inference failed for: r0v147, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai$11] */
    /* JADX WARN: Type inference failed for: r0v150, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai$12] */
    /* JADX WARN: Type inference failed for: r0v153, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai$13] */
    /* JADX WARN: Type inference failed for: r0v156, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai$14] */
    /* JADX WARN: Type inference failed for: r0v159, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai$15] */
    /* JADX WARN: Type inference failed for: r0v162, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai$16] */
    /* JADX WARN: Type inference failed for: r0v165, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai$17] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        double d19;
        double d20;
        double d21;
        double d22;
        double d23;
        double d24;
        double d25;
        double d26;
        double d27;
        double d28;
        double d29;
        double d30;
        double d31;
        double d32;
        double d33;
        double d34;
        double d35;
        double d36;
        double d37;
        double d38;
        double d39;
        double d40;
        double d41;
        double d42;
        double d43;
        double d44;
        double d45;
        double d46;
        double d47;
        double d48;
        double d49;
        double d50;
        double d51;
        double d52;
        double d53;
        double d54;
        double d55;
        double d56;
        double d57;
        double d58;
        double d59;
        double d60;
        double d61;
        double d62;
        double d63;
        double d64;
        double d65;
        double d66;
        double d67;
        double d68;
        double d69;
        double d70;
        double d71;
        double d72;
        if (dependencies.get("entity") == null || dependencies.get("world") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        final World world = (World) dependencies.get("world");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74767_n("遥控绑定")) {
                ?? r0 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai.1
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                };
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d22 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d22 = -1.0d;
                }
                int i = (int) d22;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d23 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d23 = -1.0d;
                }
                int i2 = (int) d23;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d24 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d24 = -1.0d;
                }
                if (r0.getValue(new BlockPos(i, i2, (int) d24), "阵法") == 1.0d) {
                    if (entityLivingBase.getEntityData().func_74769_h("Power") >= 72.0d) {
                        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 72.0d);
                        entityLivingBase.getEntityData().func_74757_a("阵法启动", true);
                    } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法启动阵法"), false);
                    }
                }
                ?? r02 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai.2
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                };
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d25 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d25 = -1.0d;
                }
                int i3 = (int) d25;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d26 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d26 = -1.0d;
                }
                int i4 = (int) d26;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d27 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d27 = -1.0d;
                }
                if (r02.getValue(new BlockPos(i3, i4, (int) d27), "阵法") == 2.0d) {
                    if (entityLivingBase.getEntityData().func_74769_h("Power") >= 8.0d) {
                        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 8.0d);
                        entityLivingBase.getEntityData().func_74757_a("阵法启动", true);
                    } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法启动阵法"), false);
                    }
                }
                ?? r03 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai.3
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                };
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d28 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d28 = -1.0d;
                }
                int i5 = (int) d28;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d29 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d29 = -1.0d;
                }
                int i6 = (int) d29;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d30 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d30 = -1.0d;
                }
                if (r03.getValue(new BlockPos(i5, i6, (int) d30), "阵法") == 3.0d) {
                    if (entityLivingBase.getEntityData().func_74769_h("Power") >= 8.0d) {
                        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 8.0d);
                        entityLivingBase.getEntityData().func_74757_a("阵法启动", true);
                    } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法启动阵法"), false);
                    }
                }
                ?? r04 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai.4
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                };
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d31 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d31 = -1.0d;
                }
                int i7 = (int) d31;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d32 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d32 = -1.0d;
                }
                int i8 = (int) d32;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d33 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d33 = -1.0d;
                }
                if (r04.getValue(new BlockPos(i7, i8, (int) d33), "阵法") == 4.0d) {
                    if (entityLivingBase.getEntityData().func_74769_h("Power") >= 8.0d) {
                        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 8.0d);
                        entityLivingBase.getEntityData().func_74757_a("阵法启动", true);
                    } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法启动阵法"), false);
                    }
                }
                ?? r05 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai.5
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                };
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d34 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d34 = -1.0d;
                }
                int i9 = (int) d34;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d35 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d35 = -1.0d;
                }
                int i10 = (int) d35;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d36 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d36 = -1.0d;
                }
                if (r05.getValue(new BlockPos(i9, i10, (int) d36), "阵法") == 5.0d) {
                    if (entityLivingBase.getEntityData().func_74769_h("Power") >= 8.0d) {
                        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 8.0d);
                        entityLivingBase.getEntityData().func_74757_a("阵法启动", true);
                    } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法启动阵法"), false);
                    }
                }
                ?? r06 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai.6
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                };
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d37 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d37 = -1.0d;
                }
                int i11 = (int) d37;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d38 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d38 = -1.0d;
                }
                int i12 = (int) d38;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d39 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d39 = -1.0d;
                }
                if (r06.getValue(new BlockPos(i11, i12, (int) d39), "阵法") == 6.0d) {
                    if (entityLivingBase.getEntityData().func_74769_h("Power") >= 8.0d) {
                        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 8.0d);
                        entityLivingBase.getEntityData().func_74757_a("阵法启动", true);
                    } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法启动阵法"), false);
                    }
                }
                ?? r07 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai.7
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                };
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d40 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d40 = -1.0d;
                }
                int i13 = (int) d40;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d41 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d41 = -1.0d;
                }
                int i14 = (int) d41;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d42 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d42 = -1.0d;
                }
                if (r07.getValue(new BlockPos(i13, i14, (int) d42), "阵法") == 7.0d) {
                    if (entityLivingBase.getEntityData().func_74769_h("Power") >= 16.0d) {
                        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 16.0d);
                        entityLivingBase.getEntityData().func_74757_a("阵法启动", true);
                    } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法启动阵法"), false);
                    }
                }
                ?? r08 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai.8
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                };
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d43 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d43 = -1.0d;
                }
                int i15 = (int) d43;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d44 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d44 = -1.0d;
                }
                int i16 = (int) d44;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d45 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d45 = -1.0d;
                }
                if (r08.getValue(new BlockPos(i15, i16, (int) d45), "阵法") == 8.0d) {
                    if (entityLivingBase.getEntityData().func_74769_h("Power") >= 8.0d) {
                        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 8.0d);
                        entityLivingBase.getEntityData().func_74757_a("阵法启动", true);
                    } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法启动阵法"), false);
                    }
                }
                ?? r09 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai.9
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                };
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d46 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d46 = -1.0d;
                }
                int i17 = (int) d46;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d47 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d47 = -1.0d;
                }
                int i18 = (int) d47;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d48 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d48 = -1.0d;
                }
                if (r09.getValue(new BlockPos(i17, i18, (int) d48), "阵法") == 9.0d) {
                    if (entityLivingBase.getEntityData().func_74769_h("Power") >= 72.0d) {
                        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 72.0d);
                        entityLivingBase.getEntityData().func_74757_a("阵法启动", true);
                    } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法启动阵法"), false);
                    }
                }
                ?? r010 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai.10
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                };
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d49 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d49 = -1.0d;
                }
                int i19 = (int) d49;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d50 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d50 = -1.0d;
                }
                int i20 = (int) d50;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d51 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d51 = -1.0d;
                }
                if (r010.getValue(new BlockPos(i19, i20, (int) d51), "阵法") == 10.0d) {
                    entityLivingBase.getEntityData().func_74757_a("阵法启动", true);
                }
                ?? r011 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai.11
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                };
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d52 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d52 = -1.0d;
                }
                int i21 = (int) d52;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d53 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d53 = -1.0d;
                }
                int i22 = (int) d53;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d54 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d54 = -1.0d;
                }
                if (r011.getValue(new BlockPos(i21, i22, (int) d54), "阵法") == 11.0d) {
                    if (entityLivingBase.getEntityData().func_74769_h("Power") >= 72.0d) {
                        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 72.0d);
                        entityLivingBase.getEntityData().func_74757_a("阵法启动", true);
                    } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法启动阵法"), false);
                    }
                }
                ?? r012 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai.12
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                };
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d55 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d55 = -1.0d;
                }
                int i23 = (int) d55;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d56 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d56 = -1.0d;
                }
                int i24 = (int) d56;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d57 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d57 = -1.0d;
                }
                if (r012.getValue(new BlockPos(i23, i24, (int) d57), "阵法") == 12.0d) {
                    if (entityLivingBase.getEntityData().func_74769_h("Power") >= 72.0d) {
                        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 72.0d);
                        entityLivingBase.getEntityData().func_74757_a("阵法启动", true);
                    } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法启动阵法"), false);
                    }
                }
                ?? r013 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai.13
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                };
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d58 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d58 = -1.0d;
                }
                int i25 = (int) d58;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d59 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d59 = -1.0d;
                }
                int i26 = (int) d59;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d60 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d60 = -1.0d;
                }
                if (r013.getValue(new BlockPos(i25, i26, (int) d60), "阵法") == 13.0d) {
                    if (entityLivingBase.getEntityData().func_74769_h("Power") >= 72.0d) {
                        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 72.0d);
                        entityLivingBase.getEntityData().func_74757_a("阵法启动", true);
                    } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法启动阵法"), false);
                    }
                }
                ?? r014 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai.14
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                };
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d61 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d61 = -1.0d;
                }
                int i27 = (int) d61;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d62 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d62 = -1.0d;
                }
                int i28 = (int) d62;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d63 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d63 = -1.0d;
                }
                if (r014.getValue(new BlockPos(i27, i28, (int) d63), "阵法") == 14.0d) {
                    if (entityLivingBase.getEntityData().func_74769_h("Power") >= 72.0d) {
                        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 72.0d);
                        entityLivingBase.getEntityData().func_74757_a("阵法启动", true);
                    } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法启动阵法"), false);
                    }
                }
                ?? r015 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai.15
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                };
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d64 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d64 = -1.0d;
                }
                int i29 = (int) d64;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d65 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d65 = -1.0d;
                }
                int i30 = (int) d65;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d66 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d66 = -1.0d;
                }
                if (r015.getValue(new BlockPos(i29, i30, (int) d66), "阵法") == 15.0d) {
                    if (entityLivingBase.getEntityData().func_74769_h("Power") >= 144.0d) {
                        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 144.0d);
                        entityLivingBase.getEntityData().func_74757_a("阵法启动", true);
                    } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法启动阵法"), false);
                    }
                }
                ?? r016 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai.16
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                };
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d67 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d67 = -1.0d;
                }
                int i31 = (int) d67;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d68 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d68 = -1.0d;
                }
                int i32 = (int) d68;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d69 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d69 = -1.0d;
                }
                if (r016.getValue(new BlockPos(i31, i32, (int) d69), "阵法") == 16.0d) {
                    if (entityLivingBase.getEntityData().func_74769_h("Power") >= 72.0d) {
                        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 72.0d);
                        entityLivingBase.getEntityData().func_74757_a("阵法启动", true);
                    } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法启动阵法"), false);
                    }
                }
                ?? r017 = new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureYaoKongQi1Kai.17
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                };
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d70 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d70 = -1.0d;
                }
                int i33 = (int) d70;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d71 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d71 = -1.0d;
                }
                int i34 = (int) d71;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d72 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d72 = -1.0d;
                }
                if (r017.getValue(new BlockPos(i33, i34, (int) d72), "阵法") == 17.0d) {
                    if (entityLivingBase.getEntityData().func_74769_h("Power") >= 8.0d) {
                        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 8.0d);
                        entityLivingBase.getEntityData().func_74757_a("阵法启动", true);
                    } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法启动阵法"), false);
                    }
                }
            }
        }
        if (entityLivingBase.getEntityData().func_74767_n("阵法启动")) {
            entityLivingBase.getEntityData().func_74757_a("阵法启动", false);
            if (!world.field_72995_K) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d19 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d19 = -1.0d;
                }
                int i35 = (int) d19;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d20 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d20 = -1.0d;
                }
                int i36 = (int) d20;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d21 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d21 = -1.0d;
                }
                BlockPos _bp = new BlockPos(i35, i36, (int) d21);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74757_a("阵法开关", true);
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (!world.field_72995_K) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d16 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d16 = -1.0d;
                }
                int i37 = (int) d16;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d17 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d17 = -1.0d;
                }
                int i38 = (int) d17;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d18 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d18 = -1.0d;
                }
                BlockPos _bp2 = new BlockPos(i37, i38, (int) d18);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74780_a("PoisonAttack", (entityLivingBase.getEntityData().func_74769_h("PoisonAttack") * 1.8d) + 10.0d);
                }
                world.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
            if (!world.field_72995_K) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d13 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d13 = -1.0d;
                }
                int i39 = (int) d13;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d14 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d14 = -1.0d;
                }
                int i40 = (int) d14;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d15 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d15 = -1.0d;
                }
                BlockPos _bp3 = new BlockPos(i39, i40, (int) d15);
                TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                IBlockState _bs3 = world.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74780_a("ThunderAttack", (entityLivingBase.getEntityData().func_74769_h("ThunderAttack") * 1.6d) + 140.0d);
                }
                world.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
            if (!world.field_72995_K) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d10 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d10 = -1.0d;
                }
                int i41 = (int) d10;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d11 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d11 = -1.0d;
                }
                int i42 = (int) d11;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d12 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d12 = -1.0d;
                }
                BlockPos _bp4 = new BlockPos(i41, i42, (int) d12);
                TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                IBlockState _bs4 = world.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74780_a("FireAttack", (entityLivingBase.getEntityData().func_74769_h("FireAttack") * 1.5d) + 150.0d);
                }
                world.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
            if (!world.field_72995_K) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d7 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d7 = -1.0d;
                }
                int i43 = (int) d7;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d8 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d8 = -1.0d;
                }
                int i44 = (int) d8;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d9 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d9 = -1.0d;
                }
                BlockPos _bp5 = new BlockPos(i43, i44, (int) d9);
                TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                IBlockState _bs5 = world.func_180495_p(_bp5);
                if (_tileEntity5 != null) {
                    _tileEntity5.getTileData().func_74780_a("Attack", entityLivingBase.getEntityData().func_74769_h("Attack") * 1.3d);
                }
                world.func_184138_a(_bp5, _bs5, _bs5, 3);
            }
            if (!world.field_72995_K) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d4 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d4 = -1.0d;
                }
                int i45 = (int) d4;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d5 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d5 = -1.0d;
                }
                int i46 = (int) d5;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d6 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d6 = -1.0d;
                }
                BlockPos _bp6 = new BlockPos(i45, i46, (int) d6);
                TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                IBlockState _bs6 = world.func_180495_p(_bp6);
                if (_tileEntity6 != null) {
                    _tileEntity6.getTileData().func_74780_a("MagicAttack", (entityLivingBase.getEntityData().func_74769_h("MagicAttack") * 1.2d) + 450.0d);
                }
                world.func_184138_a(_bp6, _bs6, _bs6, 3);
            }
            if (!world.field_72995_K) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("X");
                } else {
                    d = -1.0d;
                }
                int i47 = (int) d;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d2 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Y");
                } else {
                    d2 = -1.0d;
                }
                int i48 = (int) d2;
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d3 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("Z");
                } else {
                    d3 = -1.0d;
                }
                BlockPos _bp7 = new BlockPos(i47, i48, (int) d3);
                TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                IBlockState _bs7 = world.func_180495_p(_bp7);
                if (_tileEntity7 != null) {
                    _tileEntity7.getTileData().func_74780_a("ZhenFa", entityLivingBase.getEntityData().func_74769_h("ZhenFa"));
                }
                world.func_184138_a(_bp7, _bs7, _bs7, 3);
            }
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("已启动阵法"), false);
            }
            (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_190918_g(1);
        }
    }
}
