package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.entity.EntityInjuryExecutor;
import net.mcreator.fabaokuozhan.item.ItemChiYanDao;
import net.mcreator.fabaokuozhan.item.ItemFabao0301;
import net.mcreator.fabaokuozhan.item.ItemFabao0302;
import net.mcreator.fabaokuozhan.item.ItemFabao04;
import net.mcreator.fabaokuozhan.item.ItemFabao0501;
import net.mcreator.fabaokuozhan.item.ItemFabao0801;
import net.mcreator.fabaokuozhan.item.ItemFabao1401;
import net.mcreator.fabaokuozhan.item.ItemFabao17;
import net.mcreator.fabaokuozhan.item.ItemFabao21;
import net.mcreator.fabaokuozhan.item.ItemFabao22;
import net.mcreator.fabaokuozhan.item.ItemJinGuBang;
import net.mcreator.fabaokuozhan.item.ItemLeiJiMuJian;
import net.mcreator.fabaokuozhan.item.ItemMingHaiSanJianQiang;
import net.mcreator.fabaokuozhan.item.ItemPoShan;
import net.mcreator.fabaokuozhan.item.ItemSuppressMonsterSword1;
import net.mcreator.fabaokuozhan.item.ItemZhuGun;
import net.mcreator.fabaokuozhan.potion.PotionFabao1402;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureGongJiWuXiao.class */
public class ProcedureGongJiWuXiao extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongJiWuXiao(ElementsFabaokuozhanMod instance) {
        super(instance, 286);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("sourceentity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("sourceentity");
        $_dependencies.put("entity", entity);
        $_dependencies.put("sourceentity", entityLivingBase);
        ProcedureBenMingGongJi.executeProcedure($_dependencies);
        if (entity.getEntityData().func_74767_n("攻击拦截")) {
            if (dependencies.get("event") != null) {
                Object _obj = dependencies.get("event");
                if (_obj instanceof Event) {
                    Event _evt = (Event) _obj;
                    if (_evt.isCancelable()) {
                        _evt.setCanceled(true);
                    }
                }
            }
            entity.getEntityData().func_74757_a("攻击拦截", false);
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao21.block, 1).func_77973_b()) {
            if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 1.0d) {
                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("练气期以下修士无法使用"), true);
                }
                if (dependencies.get("event") != null) {
                    Object _obj2 = dependencies.get("event");
                    if (_obj2 instanceof Event) {
                        Event _evt2 = (Event) _obj2;
                        if (_evt2.isCancelable()) {
                            _evt2.setCanceled(true);
                        }
                    }
                }
            } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 1.0d) {
                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法使用"), true);
                }
                if (dependencies.get("event") != null) {
                    Object _obj3 = dependencies.get("event");
                    if (_obj3 instanceof Event) {
                        Event _evt3 = (Event) _obj3;
                        if (_evt3.isCancelable()) {
                            _evt3.setCanceled(true);
                        }
                    }
                }
            }
        } else {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao04.block, 1).func_77973_b()) {
                if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 2.0d) {
                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("筑基期以下修士无法使用"), true);
                    }
                    if (dependencies.get("event") != null) {
                        Object _obj4 = dependencies.get("event");
                        if (_obj4 instanceof Event) {
                            Event _evt4 = (Event) _obj4;
                            if (_evt4.isCancelable()) {
                                _evt4.setCanceled(true);
                            }
                        }
                    }
                } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 3.0d) {
                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法使用"), true);
                    }
                    if (dependencies.get("event") != null) {
                        Object _obj5 = dependencies.get("event");
                        if (_obj5 instanceof Event) {
                            Event _evt5 = (Event) _obj5;
                            if (_evt5.isCancelable()) {
                                _evt5.setCanceled(true);
                            }
                        }
                    }
                }
            } else {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemSuppressMonsterSword1.block, 1).func_77973_b()) {
                    if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 1.0d) {
                        if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("练气期以下修士无法使用"), true);
                        }
                        if (dependencies.get("event") != null) {
                            Object _obj6 = dependencies.get("event");
                            if (_obj6 instanceof Event) {
                                Event _evt6 = (Event) _obj6;
                                if (_evt6.isCancelable()) {
                                    _evt6.setCanceled(true);
                                }
                            }
                        }
                    } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 3.0d) {
                        if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足3点无法使用"), true);
                        }
                        if (dependencies.get("event") != null) {
                            Object _obj7 = dependencies.get("event");
                            if (_obj7 instanceof Event) {
                                Event _evt7 = (Event) _obj7;
                                if (_evt7.isCancelable()) {
                                    _evt7.setCanceled(true);
                                }
                            }
                        }
                    }
                } else {
                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao22.block, 1).func_77973_b()) {
                        if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 3.0d) {
                            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("结丹期以下修士无法使用"), true);
                            }
                            if (dependencies.get("event") != null) {
                                Object _obj8 = dependencies.get("event");
                                if (_obj8 instanceof Event) {
                                    Event _evt8 = (Event) _obj8;
                                    if (_evt8.isCancelable()) {
                                        _evt8.setCanceled(true);
                                    }
                                }
                            }
                        } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 5.0d) {
                            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法使用"), true);
                            }
                            if (dependencies.get("event") != null) {
                                Object _obj9 = dependencies.get("event");
                                if (_obj9 instanceof Event) {
                                    Event _evt9 = (Event) _obj9;
                                    if (_evt9.isCancelable()) {
                                        _evt9.setCanceled(true);
                                    }
                                }
                            }
                        }
                    } else {
                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao0801.block, 1).func_77973_b()) {
                            if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 2.0d) {
                                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("筑基以下修士无法使用"), true);
                                }
                                if (dependencies.get("event") != null) {
                                    Object _obj10 = dependencies.get("event");
                                    if (_obj10 instanceof Event) {
                                        Event _evt10 = (Event) _obj10;
                                        if (_evt10.isCancelable()) {
                                            _evt10.setCanceled(true);
                                        }
                                    }
                                }
                            } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 3.0d) {
                                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足点无法使用"), true);
                                }
                                if (dependencies.get("event") != null) {
                                    Object _obj11 = dependencies.get("event");
                                    if (_obj11 instanceof Event) {
                                        Event _evt11 = (Event) _obj11;
                                        if (_evt11.isCancelable()) {
                                            _evt11.setCanceled(true);
                                        }
                                    }
                                }
                            }
                        } else {
                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao0301.block, 1).func_77973_b()) {
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao0302.block, 1).func_77973_b()) {
                                    if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 4.0d) {
                                        if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("元婴期以下修士无法使用"), true);
                                        }
                                        if (dependencies.get("event") != null) {
                                            Object _obj12 = dependencies.get("event");
                                            if (_obj12 instanceof Event) {
                                                Event _evt12 = (Event) _obj12;
                                                if (_evt12.isCancelable()) {
                                                    _evt12.setCanceled(true);
                                                }
                                            }
                                        }
                                    } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 134.0d) {
                                        if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法使用"), true);
                                        }
                                        if (dependencies.get("event") != null) {
                                            Object _obj13 = dependencies.get("event");
                                            if (_obj13 instanceof Event) {
                                                Event _evt13 = (Event) _obj13;
                                                if (_evt13.isCancelable()) {
                                                    _evt13.setCanceled(true);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao0302.block, 1).func_77973_b()) {
                                if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 4.0d) {
                                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("元婴期以下修士无法使用"), true);
                                    }
                                    if (dependencies.get("event") != null) {
                                        Object _obj14 = dependencies.get("event");
                                        if (_obj14 instanceof Event) {
                                            Event _evt14 = (Event) _obj14;
                                            if (_evt14.isCancelable()) {
                                                _evt14.setCanceled(true);
                                            }
                                        }
                                    }
                                } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 134.0d) {
                                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法使用"), true);
                                    }
                                    if (dependencies.get("event") != null) {
                                        Object _obj15 = dependencies.get("event");
                                        if (_obj15 instanceof Event) {
                                            Event _evt15 = (Event) _obj15;
                                            if (_evt15.isCancelable()) {
                                                _evt15.setCanceled(true);
                                            }
                                        }
                                    }
                                }
                            } else {
                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao0301.block, 1).func_77973_b()) {
                                    if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 4.0d) {
                                        if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("元婴期以下修士无法使用"), true);
                                        }
                                        if (dependencies.get("event") != null) {
                                            Object _obj16 = dependencies.get("event");
                                            if (_obj16 instanceof Event) {
                                                Event _evt16 = (Event) _obj16;
                                                if (_evt16.isCancelable()) {
                                                    _evt16.setCanceled(true);
                                                }
                                            }
                                        }
                                    } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 134.0d) {
                                        if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足134点无法使用"), true);
                                        }
                                        if (dependencies.get("event") != null) {
                                            Object _obj17 = dependencies.get("event");
                                            if (_obj17 instanceof Event) {
                                                Event _evt17 = (Event) _obj17;
                                                if (_evt17.isCancelable()) {
                                                    _evt17.setCanceled(true);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao0501.block, 1).func_77973_b()) {
                                        if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 4.0d) {
                                            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("元婴期以下修士无法使用"), true);
                                            }
                                            if (dependencies.get("event") != null) {
                                                Object _obj18 = dependencies.get("event");
                                                if (_obj18 instanceof Event) {
                                                    Event _evt18 = (Event) _obj18;
                                                    if (_evt18.isCancelable()) {
                                                        _evt18.setCanceled(true);
                                                    }
                                                }
                                            }
                                        } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 86.0d) {
                                            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法使用"), true);
                                            }
                                            if (dependencies.get("event") != null) {
                                                Object _obj19 = dependencies.get("event");
                                                if (_obj19 instanceof Event) {
                                                    Event _evt19 = (Event) _obj19;
                                                    if (_evt19.isCancelable()) {
                                                        _evt19.setCanceled(true);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao17.block, 1).func_77973_b()) {
                                            if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 5.0d) {
                                                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("化神期以下修士无法使用"), true);
                                                }
                                                if (dependencies.get("event") != null) {
                                                    Object _obj20 = dependencies.get("event");
                                                    if (_obj20 instanceof Event) {
                                                        Event _evt20 = (Event) _obj20;
                                                        if (_evt20.isCancelable()) {
                                                            _evt20.setCanceled(true);
                                                        }
                                                    }
                                                }
                                            } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 123.0d) {
                                                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法使用"), true);
                                                }
                                                if (dependencies.get("event") != null) {
                                                    Object _obj21 = dependencies.get("event");
                                                    if (_obj21 instanceof Event) {
                                                        Event _evt21 = (Event) _obj21;
                                                        if (_evt21.isCancelable()) {
                                                            _evt21.setCanceled(true);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemJinGuBang.block, 1).func_77973_b()) {
                                                if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 5.0d) {
                                                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("化神期以下修士无法使用"), true);
                                                    }
                                                    if (dependencies.get("event") != null) {
                                                        Object _obj22 = dependencies.get("event");
                                                        if (_obj22 instanceof Event) {
                                                            Event _evt22 = (Event) _obj22;
                                                            if (_evt22.isCancelable()) {
                                                                _evt22.setCanceled(true);
                                                            }
                                                        }
                                                    }
                                                } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 125.0d && entityLivingBase.getEntityData().func_74769_h("金箍棒威能") <= 0.0d) {
                                                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法使用"), true);
                                                    }
                                                    if (dependencies.get("event") != null) {
                                                        Object _obj23 = dependencies.get("event");
                                                        if (_obj23 instanceof Event) {
                                                            Event _evt23 = (Event) _obj23;
                                                            if (_evt23.isCancelable()) {
                                                                _evt23.setCanceled(true);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemLeiJiMuJian.block, 1).func_77973_b()) {
                                                    if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 5.0d) {
                                                        if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                                            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("化神期以下修士无法使用"), true);
                                                        }
                                                        if (dependencies.get("event") != null) {
                                                            Object _obj24 = dependencies.get("event");
                                                            if (_obj24 instanceof Event) {
                                                                Event _evt24 = (Event) _obj24;
                                                                if (_evt24.isCancelable()) {
                                                                    _evt24.setCanceled(true);
                                                                }
                                                            }
                                                        }
                                                    } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 43.0d) {
                                                        if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                                            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法使用"), true);
                                                        }
                                                        if (dependencies.get("event") != null) {
                                                            Object _obj25 = dependencies.get("event");
                                                            if (_obj25 instanceof Event) {
                                                                Event _evt25 = (Event) _obj25;
                                                                if (_evt25.isCancelable()) {
                                                                    _evt25.setCanceled(true);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemFabao1401.block, 1).func_77973_b()) {
                                                        Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                                                            if (entity.getEntityData().func_74767_n("远程攻击")) {
                                                                if (((EntityLivingBase) entity).func_70644_a(PotionFabao1402.potion)) {
                                                                    entity.getEntityData().func_74780_a("BeMagicAttack", entity.getEntityData().func_74769_h("BeMagicAttack") + 643.0d);
                                                                } else {
                                                                    entity.getEntityData().func_74780_a("BeMagicAttack", entity.getEntityData().func_74769_h("BeMagicAttack") + 214.0d);
                                                                }
                                                                if ((entityLivingBase instanceof EntityLivingBase ? ((EntityLivingBase) entityLivingBase).func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                                                                    if ((entityLivingBase instanceof EntityLivingBase ? ((EntityLivingBase) entityLivingBase).func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74767_n("威能")) {
                                                                        if (entityLivingBase instanceof EntityLivingBase) {
                                                                            ((EntityLivingBase) entityLivingBase).func_70691_i(54.0f);
                                                                        }
                                                                        entity.getEntityData().func_74780_a("Power", entity.getEntityData().func_74769_h("Power") - 420.0d);
                                                                    }
                                                                }
                                                                entity.getEntityData().func_74757_a("远程攻击", true);
                                                            }
                                                        }, 50L, TimeUnit.MILLISECONDS);
                                                    } else {
                                                        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemChiYanDao.block, 1).func_77973_b()) {
                                                            if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 3.0d) {
                                                                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                                                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("结丹以下修士无法使用"), true);
                                                                }
                                                                if (dependencies.get("event") != null) {
                                                                    Object _obj26 = dependencies.get("event");
                                                                    if (_obj26 instanceof Event) {
                                                                        Event _evt26 = (Event) _obj26;
                                                                        if (_evt26.isCancelable()) {
                                                                            _evt26.setCanceled(true);
                                                                        }
                                                                    }
                                                                }
                                                            } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 9.0d) {
                                                                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                                                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足点无法使用"), true);
                                                                }
                                                                if (dependencies.get("event") != null) {
                                                                    Object _obj27 = dependencies.get("event");
                                                                    if (_obj27 instanceof Event) {
                                                                        Event _evt27 = (Event) _obj27;
                                                                        if (_evt27.isCancelable()) {
                                                                            _evt27.setCanceled(true);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemPoShan.block, 1).func_77973_b()) {
                                                                if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 1.0d) {
                                                                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                                                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("练气以下修士无法使用"), true);
                                                                    }
                                                                    if (dependencies.get("event") != null) {
                                                                        Object _obj28 = dependencies.get("event");
                                                                        if (_obj28 instanceof Event) {
                                                                            Event _evt28 = (Event) _obj28;
                                                                            if (_evt28.isCancelable()) {
                                                                                _evt28.setCanceled(true);
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 2.0d) {
                                                                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                                                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足点无法使用"), true);
                                                                    }
                                                                    if (dependencies.get("event") != null) {
                                                                        Object _obj29 = dependencies.get("event");
                                                                        if (_obj29 instanceof Event) {
                                                                            Event _evt29 = (Event) _obj29;
                                                                            if (_evt29.isCancelable()) {
                                                                                _evt29.setCanceled(true);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemMingHaiSanJianQiang.block, 1).func_77973_b()) {
                                                                    if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 4.0d) {
                                                                        if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                                                            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("元婴以下修士无法使用"), true);
                                                                        }
                                                                        if (dependencies.get("event") != null) {
                                                                            Object _obj30 = dependencies.get("event");
                                                                            if (_obj30 instanceof Event) {
                                                                                Event _evt30 = (Event) _obj30;
                                                                                if (_evt30.isCancelable()) {
                                                                                    _evt30.setCanceled(true);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 37.0d) {
                                                                        if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                                                            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法使用"), true);
                                                                        }
                                                                        if (dependencies.get("event") != null) {
                                                                            Object _obj31 = dependencies.get("event");
                                                                            if (_obj31 instanceof Event) {
                                                                                Event _evt31 = (Event) _obj31;
                                                                                if (_evt31.isCancelable()) {
                                                                                    _evt31.setCanceled(true);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemZhuGun.block, 1).func_77973_b()) {
                                                                        if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 2.0d) {
                                                                            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                                                                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("筑基以下修士无法使用"), true);
                                                                            }
                                                                            if (dependencies.get("event") != null) {
                                                                                Object _obj32 = dependencies.get("event");
                                                                                if (_obj32 instanceof Event) {
                                                                                    Event _evt32 = (Event) _obj32;
                                                                                    if (_evt32.isCancelable()) {
                                                                                        _evt32.setCanceled(true);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else if (entityLivingBase.getEntityData().func_74769_h("Power") < 3.0d) {
                                                                            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                                                                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足点无法使用"), true);
                                                                            }
                                                                            if (dependencies.get("event") != null) {
                                                                                Object _obj33 = dependencies.get("event");
                                                                                if (_obj33 instanceof Event) {
                                                                                    Event _evt33 = (Event) _obj33;
                                                                                    if (_evt33.isCancelable()) {
                                                                                        _evt33.setCanceled(true);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if ((entity instanceof EntityInjuryExecutor.EntityCustom) && dependencies.get("event") != null) {
            Object _obj34 = dependencies.get("event");
            if (_obj34 instanceof Event) {
                Event _evt34 = (Event) _obj34;
                if (_evt34.isCancelable()) {
                    _evt34.setCanceled(true);
                }
            }
        }
        if (entityLivingBase instanceof EntityPlayer) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b().getRegistryName().toString().contains("fabaokuozhan:")) {
                if (entityLivingBase.getEntityData().func_74769_h("法器攻击间隔") <= 0.0d) {
                    entityLivingBase.getEntityData().func_74780_a("法器攻击间隔", 10.0d);
                    return;
                }
                if (dependencies.get("event") != null) {
                    Object _obj35 = dependencies.get("event");
                    if (_obj35 instanceof Event) {
                        Event _evt35 = (Event) _obj35;
                        if (_evt35.isCancelable()) {
                            _evt35.setCanceled(true);
                        }
                    }
                }
                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("攻速过快无法造成伤害"), true);
                }
            }
        }
    }

    @SubscribeEvent
    public void onEntityAttacked(LivingAttackEvent event) {
        if (event != null && event.getEntity() != null) {
            Entity entity = event.getEntity();
            int i = (int) entity.field_70165_t;
            int j = (int) entity.field_70163_u;
            int k = (int) entity.field_70161_v;
            float amount = event.getAmount();
            Object world = entity.field_70170_p;
            HashMap<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Integer.valueOf(i));
            dependencies.put("y", Integer.valueOf(j));
            dependencies.put("z", Integer.valueOf(k));
            dependencies.put("amount", Float.valueOf(amount));
            dependencies.put("world", world);
            dependencies.put("entity", entity);
            dependencies.put("event", event);
            dependencies.put("sourceentity", event.getSource().func_76346_g());
            dependencies.put("imediatesourceentity", event.getSource().func_76364_f());
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
