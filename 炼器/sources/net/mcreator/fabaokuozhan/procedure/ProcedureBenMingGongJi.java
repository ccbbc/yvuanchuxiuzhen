package net.mcreator.fabaokuozhan.procedure;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemFaBao33;
import net.mcreator.fabaokuozhan.item.ItemFabao0201;
import net.mcreator.fabaokuozhan.item.ItemFabao1001;
import net.mcreator.fabaokuozhan.item.ItemQiYinXiao;
import net.mcreator.fabaokuozhan.item.ItemQingZuFengYunJian;
import net.mcreator.fabaokuozhan.item.ItemZhuQueHuan;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextComponentString;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureBenMingGongJi.class */
public class ProcedureBenMingGongJi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureBenMingGongJi(ElementsFabaokuozhanMod instance) {
        super(instance, 498);
    }

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
        if (dependencies.get("entity") == null || dependencies.get("sourceentity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("sourceentity");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemQingZuFengYunJian.block, 1).func_77973_b()) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d10 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
            } else {
                d10 = -1.0d;
            }
            if (d10 > 0.0d) {
                if (!ProcedureBenMingPuGong.executeProcedure(ImmutableMap.of("sourceentity", entityLivingBase))) {
                    entity.getEntityData().func_74757_a("攻击拦截", true);
                }
            } else if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 3.0d) {
                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("结丹期以下修士无法使用"), true);
                }
                entity.getEntityData().func_74757_a("攻击拦截", true);
            } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 9.0d) {
                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法使用"), true);
                }
                entity.getEntityData().func_74757_a("攻击拦截", true);
            } else {
                entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 9.0d);
            }
        } else {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemQiYinXiao.block, 1).func_77973_b()) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d5 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
                } else {
                    d5 = -1.0d;
                }
                if (d5 > 0.0d) {
                    if (!ProcedureBenMingPuGong.executeProcedure(ImmutableMap.of("sourceentity", entityLivingBase))) {
                        entity.getEntityData().func_74757_a("攻击拦截", true);
                    }
                } else if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 3.0d) {
                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("结丹期以下修士无法使用"), true);
                    }
                    entity.getEntityData().func_74757_a("攻击拦截", true);
                } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 4.0d) {
                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法使用"), true);
                    }
                    entity.getEntityData().func_74757_a("攻击拦截", true);
                } else {
                    entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 4.0d);
                }
            } else {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemZhuQueHuan.block, 1).func_77973_b()) {
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                        d4 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
                    } else {
                        d4 = -1.0d;
                    }
                    if (d4 > 0.0d) {
                        if (!ProcedureBenMingPuGong.executeProcedure(ImmutableMap.of("sourceentity", entityLivingBase))) {
                            entity.getEntityData().func_74757_a("攻击拦截", true);
                        }
                    } else if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 3.0d) {
                        if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("结丹期以下修士无法使用"), true);
                        }
                        entity.getEntityData().func_74757_a("攻击拦截", true);
                    } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 4.0d) {
                        if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足点无法使用"), true);
                        }
                        entity.getEntityData().func_74757_a("攻击拦截", true);
                    } else {
                        entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 4.0d);
                    }
                } else {
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFaBao33.block, 1).func_77973_b()) {
                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                            d3 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
                        } else {
                            d3 = -1.0d;
                        }
                        if (d3 > 0.0d) {
                            if (!ProcedureBenMingPuGong.executeProcedure(ImmutableMap.of("sourceentity", entityLivingBase))) {
                                entity.getEntityData().func_74757_a("攻击拦截", true);
                            }
                        } else if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 4.0d) {
                            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("元婴期以下修士无法使用"), true);
                            }
                            entity.getEntityData().func_74757_a("攻击拦截", true);
                        } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 34.0d) {
                            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法使用"), true);
                            }
                            entity.getEntityData().func_74757_a("攻击拦截", true);
                        } else {
                            entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 34.0d);
                        }
                    } else {
                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao1001.block, 1).func_77973_b()) {
                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                d2 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
                            } else {
                                d2 = -1.0d;
                            }
                            if (d2 > 0.0d) {
                                if (!ProcedureBenMingPuGong.executeProcedure(ImmutableMap.of("sourceentity", entityLivingBase))) {
                                    entity.getEntityData().func_74757_a("攻击拦截", true);
                                }
                            } else if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 4.0d) {
                                entity.getEntityData().func_74757_a("攻击拦截", true);
                                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("元婴期以下修士无法使用"), true);
                                }
                            } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 14.0d) {
                                entity.getEntityData().func_74757_a("攻击拦截", true);
                                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法使用"), true);
                                }
                            } else {
                                entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 14.0d);
                            }
                        } else {
                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao0201.block, 1).func_77973_b()) {
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                    d = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
                                } else {
                                    d = -1.0d;
                                }
                                if (d > 0.0d) {
                                    if (!ProcedureBenMingPuGong.executeProcedure(ImmutableMap.of("sourceentity", entityLivingBase))) {
                                        entity.getEntityData().func_74757_a("攻击拦截", true);
                                        entity.getEntityData().func_74780_a("BeMagicAttack", 0.0d);
                                    }
                                } else if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 4.0d) {
                                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("元婴以下修士无法使用"), true);
                                    }
                                    entity.getEntityData().func_74757_a("攻击拦截", true);
                                } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 112.0d) {
                                    entity.getEntityData().func_74757_a("攻击拦截", true);
                                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足112点无法使用"), true);
                                    }
                                } else {
                                    entityLivingBase.getEntityData().func_74780_a("Power", entityLivingBase.getEntityData().func_74769_h("Power") - 112.0d);
                                }
                            }
                        }
                    }
                }
            }
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao0201.block, 1).func_77973_b()) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d6 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
            } else {
                d6 = -1.0d;
            }
            if (d6 > 0.0d) {
                ItemStack _stack = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a;
                if (!_stack.func_77942_o()) {
                    _stack.func_77982_d(new NBTTagCompound());
                }
                NBTTagCompound func_77978_p = _stack.func_77978_p();
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d7 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("随机攻击小");
                } else {
                    d7 = -1.0d;
                }
                Random random = new Random();
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d8 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("随机攻击大");
                } else {
                    d8 = -1.0d;
                }
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    d9 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("随机攻击小");
                } else {
                    d9 = -1.0d;
                }
                func_77978_p.func_74780_a("附加物攻", d7 + random.nextInt(((int) (d8 - d9)) + 1));
            }
        }
    }
}
