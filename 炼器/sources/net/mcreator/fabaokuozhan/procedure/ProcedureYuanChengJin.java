package net.mcreator.fabaokuozhan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.item.ItemZhuQueHuan;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureYuanChengJin.class */
public class ProcedureYuanChengJin extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureYuanChengJin(ElementsFabaokuozhanMod instance) {
        super(instance, 514);
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [net.mcreator.fabaokuozhan.procedure.ProcedureYuanChengJin$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        double d;
        String str;
        double d2;
        double d3;
        String str2;
        double d4;
        String str3;
        double d5;
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77942_o()) {
            d = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
        } else {
            d = -1.0d;
        }
        if (d > 0.0d) {
            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("副手无法使用"), true);
            }
            if (dependencies.get("event") != null) {
                Object _obj = dependencies.get("event");
                if (_obj instanceof Event) {
                    Event _evt = (Event) _obj;
                    if (_evt.isCancelable()) {
                        _evt.setCanceled(true);
                    }
                }
            }
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77973_b() == new ItemStack(ItemZhuQueHuan.block, 1).func_77973_b()) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d4 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
            } else {
                d4 = -1.0d;
            }
            if (d4 == 0.0d) {
                if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") < 3.0d) {
                    if (dependencies.get("event") != null) {
                        Object _obj2 = dependencies.get("event");
                        if (_obj2 instanceof Event) {
                            Event _evt2 = (Event) _obj2;
                            if (_evt2.isCancelable()) {
                                _evt2.setCanceled(true);
                            }
                        }
                    }
                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("结丹期以下无法使用"), true);
                    }
                }
            } else {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                    str3 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74779_i("绑定者");
                } else {
                    str3 = "";
                }
                if (!str3.equals(entityLivingBase.func_145748_c_().func_150260_c())) {
                    if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("本命法宝的所有者不是你,你无法使用"), true);
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
            }
            double func_74769_h = entityLivingBase.getEntityData().func_74769_h("Power");
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77942_o()) {
                d5 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184614_ca() : ItemStack.field_190927_a).func_77978_p().func_74769_h("灵力消耗");
            } else {
                d5 = -1.0d;
            }
            if (func_74769_h < d5) {
                if (dependencies.get("event") != null) {
                    Object _obj4 = dependencies.get("event");
                    if (_obj4 instanceof Event) {
                        Event _evt4 = (Event) _obj4;
                        if (_evt4.isCancelable()) {
                            _evt4.setCanceled(true);
                        }
                    }
                }
                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("灵力不足无法释放"), true);
                }
            }
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77942_o()) {
            str = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77978_p().func_74779_i("绑定者");
        } else {
            str = "";
        }
        if (str.equals("")) {
            if (entityLivingBase.func_70093_af()) {
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77942_o()) {
                    d2 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
                } else {
                    d2 = -1.0d;
                }
                if (d2 > 0.0d) {
                    if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureYuanChengJin.1
                        public int getScore(String score) {
                            Scoreboard _sc;
                            ScoreObjective _so;
                            if ((entityLivingBase instanceof EntityPlayer) && (_so = (_sc = entityLivingBase.func_96123_co()).func_96518_b(score)) != null) {
                                Score _scr = _sc.func_96529_a(entityLivingBase.func_146103_bH().getName(), _so);
                                return _scr.func_96652_c();
                            }
                            return 0;
                        }
                    }.getScore("本命法宝数") == 0) {
                        ItemStack _stack = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a;
                        if (!_stack.func_77942_o()) {
                            _stack.func_77982_d(new NBTTagCompound());
                        }
                        _stack.func_77978_p().func_74778_a("绑定者", entityLivingBase.func_145748_c_().func_150260_c());
                        if (entityLivingBase instanceof EntityPlayer) {
                            Scoreboard _sc = ((EntityPlayer) entityLivingBase).func_96123_co();
                            ScoreObjective _so = _sc.func_96518_b("本命法宝数");
                            if (_so == null) {
                                _so = _sc.func_96535_a("本命法宝数", ScoreCriteria.field_96641_b);
                            }
                            Score _scr = _sc.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so);
                            _scr.func_96647_c(1);
                        }
                        if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                            ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("已绑定该本命法宝"), false);
                            return;
                        }
                        return;
                    } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("你已拥有本命法宝无法绑定"), false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77942_o()) {
            d3 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77978_p().func_74769_h("本命阶段");
        } else {
            d3 = -1.0d;
        }
        if (d3 > 0.0d) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77942_o()) {
                str2 = (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a).func_77978_p().func_74779_i("绑定者");
            } else {
                str2 = "";
            }
            if (str2.equals(entityLivingBase.func_145748_c_().func_150260_c())) {
                if (entityLivingBase.func_70093_af()) {
                    if (entityLivingBase.getEntityData().func_74769_h("Base") >= entityLivingBase.getEntityData().func_74769_h("NiangJiu29") * 0.15d) {
                        if (entityLivingBase.getEntityData().func_74769_h("本命解绑次数") < 5.0d) {
                            entityLivingBase.getEntityData().func_74780_a("本命解绑次数", entityLivingBase.getEntityData().func_74769_h("本命解绑次数") + 1.0d);
                            if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("你正在解绑本命法宝," + new DecimalFormat("0").format((200.0d - entityLivingBase.getEntityData().func_74769_h("本命解绑时间")) / 20.0d) + "秒内再次重复操作" + new DecimalFormat("0").format(5.0d - entityLivingBase.getEntityData().func_74769_h("本命解绑次数")) + "次将会解绑"), false);
                            }
                            if (entityLivingBase.getEntityData().func_74769_h("本命解绑次数") >= 5.0d) {
                                entityLivingBase.getEntityData().func_74780_a("本命解绑次数", 0.0d);
                                entityLivingBase.getEntityData().func_74780_a("本命解绑时间", 0.0d);
                                entityLivingBase.getEntityData().func_74780_a("Base", entityLivingBase.getEntityData().func_74769_h("Base") - (entityLivingBase.getEntityData().func_74769_h("NiangJiu29") * 0.15d));
                                ItemStack _stack2 = entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_184592_cb() : ItemStack.field_190927_a;
                                if (!_stack2.func_77942_o()) {
                                    _stack2.func_77982_d(new NBTTagCompound());
                                }
                                _stack2.func_77978_p().func_74778_a("绑定者", "");
                                if (entityLivingBase instanceof EntityPlayer) {
                                    Scoreboard _sc2 = ((EntityPlayer) entityLivingBase).func_96123_co();
                                    ScoreObjective _so2 = _sc2.func_96518_b("本命法宝数");
                                    if (_so2 == null) {
                                        _so2 = _sc2.func_96535_a("本命法宝数", ScoreCriteria.field_96641_b);
                                    }
                                    Score _scr2 = _sc2.func_96529_a(((EntityPlayer) entityLivingBase).func_146103_bH().getName(), _so2);
                                    _scr2.func_96647_c(0);
                                }
                                if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("你的本命法宝已变为无主之物,副手持有该法宝蹲下右键可绑定"), false);
                                }
                            }
                        }
                    } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                        ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("真元不足以解绑本命法宝"), false);
                    }
                } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                    ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("请注意副手,无法使用法宝的功能,蹲下右键会解绑法宝,请慎重！！！"), false);
                }
            } else if ((entityLivingBase instanceof EntityPlayer) && !((Entity) entityLivingBase).field_70170_p.field_72995_K) {
                ((EntityPlayer) entityLivingBase).func_146105_b(new TextComponentString("你不是本命法宝的所有者无法使用"), false);
            }
        }
    }

    @SubscribeEvent
    public void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        Object entity = event.getEntityPlayer();
        int i = event.getPos().func_177958_n();
        int j = event.getPos().func_177956_o();
        int k = event.getPos().func_177952_p();
        Object world = event.getWorld();
        HashMap<String, Object> dependencies = new HashMap<>();
        dependencies.put("x", Integer.valueOf(i));
        dependencies.put("y", Integer.valueOf(j));
        dependencies.put("z", Integer.valueOf(k));
        dependencies.put("world", world);
        dependencies.put("entity", entity);
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
