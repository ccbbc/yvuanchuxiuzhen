package net.mcreator.yvanchuliandan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureLinShiXiaoGuo.class */
public class ProcedureLinShiXiaoGuo extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureLinShiXiaoGuo(ElementsYvanchuliandanMod instance) {
        super(instance, 800);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74767_n("JiuLinShi")) {
            if (entityPlayer.getEntityData().func_74769_h("JiuLinShi01") > 0.0d) {
                entityPlayer.getEntityData().func_74780_a("JiuLinShi01", entityPlayer.getEntityData().func_74769_h("JiuLinShi01") - 1.0d);
                if (entityPlayer.getEntityData().func_74769_h("JiuLinShi01") == 0.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttackTemp", entityPlayer.getEntityData().func_74769_h("MagicAttackTemp") - 2.0d);
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 2.0d);
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("赤阳酒临时增益已结束"), false);
                    }
                    Map<String, Object> $_dependencies = new HashMap<>();
                    $_dependencies.put("entity", entityPlayer);
                    ProcedureYiChuKaiGuan.executeProcedure($_dependencies);
                }
            }
            if (entityPlayer.getEntityData().func_74769_h("JiuLinShi03") > 0.0d) {
                entityPlayer.getEntityData().func_74780_a("JiuLinShi03", entityPlayer.getEntityData().func_74769_h("JiuLinShi03") - 1.0d);
                if (entityPlayer.getEntityData().func_74769_h("JiuLinShi03") == 0.0d) {
                    entityPlayer.getEntityData().func_74780_a("AttackTemp", entityPlayer.getEntityData().func_74769_h("AttackTemp") - 10.0d);
                    entityPlayer.getEntityData().func_74780_a("Attack", entityPlayer.getEntityData().func_74769_h("Attack") - 10.0d);
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("碧焰酒临时增益已结束"), false);
                    }
                    Map<String, Object> $_dependencies2 = new HashMap<>();
                    $_dependencies2.put("entity", entityPlayer);
                    ProcedureYiChuKaiGuan.executeProcedure($_dependencies2);
                }
            }
            if (entityPlayer.getEntityData().func_74769_h("JiuLinShi04") > 0.0d) {
                entityPlayer.getEntityData().func_74780_a("JiuLinShi04", entityPlayer.getEntityData().func_74769_h("JiuLinShi04") - 1.0d);
                if (entityPlayer.getEntityData().func_74769_h("JiuLinShi04") == 0.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicDefense", entityPlayer.getEntityData().func_74769_h("MagicDefense") - 27.0d);
                    entityPlayer.getEntityData().func_74780_a("MagicDefenseTemp", entityPlayer.getEntityData().func_74769_h("MagicDefenseTemp") - 27.0d);
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("忘尘酒临时增益已结束"), false);
                    }
                    Map<String, Object> $_dependencies3 = new HashMap<>();
                    $_dependencies3.put("entity", entityPlayer);
                    ProcedureYiChuKaiGuan.executeProcedure($_dependencies3);
                }
            }
            if (entityPlayer.getEntityData().func_74769_h("JiuLinShi05") > 0.0d) {
                entityPlayer.getEntityData().func_74780_a("JiuLinShi05", entityPlayer.getEntityData().func_74769_h("JiuLinShi05") - 1.0d);
                if (entityPlayer.getEntityData().func_74769_h("JiuLinShi05") == 0.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - 25.0d);
                    entityPlayer.getEntityData().func_74780_a("MagicAttackTemp", entityPlayer.getEntityData().func_74769_h("MagicAttackTemp") - 25.0d);
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("青梨酒临时增益已结束"), false);
                    }
                    Map<String, Object> $_dependencies4 = new HashMap<>();
                    $_dependencies4.put("entity", entityPlayer);
                    ProcedureYiChuKaiGuan.executeProcedure($_dependencies4);
                }
            }
            if (entityPlayer.getEntityData().func_74769_h("JiuLinShi06") > 0.0d) {
                entityPlayer.getEntityData().func_74780_a("JiuLinShi06", entityPlayer.getEntityData().func_74769_h("JiuLinShi06") - 1.0d);
                if (entityPlayer.getEntityData().func_74769_h("JiuLinShi06") == 0.0d) {
                    entityPlayer.getEntityData().func_74780_a("MagicDefense", entityPlayer.getEntityData().func_74769_h("MagicDefense") - 75.0d);
                    entityPlayer.getEntityData().func_74780_a("MagicDefenseTemp", entityPlayer.getEntityData().func_74769_h("MagicDefenseTemp") - 75.0d);
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("清心饮临时增益已结束"), false);
                    }
                    Map<String, Object> $_dependencies5 = new HashMap<>();
                    $_dependencies5.put("entity", entityPlayer);
                    ProcedureYiChuKaiGuan.executeProcedure($_dependencies5);
                }
            }
            if (entityPlayer.getEntityData().func_74769_h("JiuLinShi07") > 0.0d) {
                entityPlayer.getEntityData().func_74780_a("JiuLinShi07", entityPlayer.getEntityData().func_74769_h("JiuLinShi07") - 1.0d);
                if (entityPlayer.getEntityData().func_74769_h("JiuLinShi07") == 0.0d) {
                    entityPlayer.getEntityData().func_74780_a("Defense", entityPlayer.getEntityData().func_74769_h("Defense") - 75.0d);
                    entityPlayer.getEntityData().func_74780_a("DefenseTemp", entityPlayer.getEntityData().func_74769_h("DefenseTemp") - 75.0d);
                    if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                        entityPlayer.func_146105_b(new TextComponentString("九仙酒临时增益已结束"), false);
                    }
                    Map<String, Object> $_dependencies6 = new HashMap<>();
                    $_dependencies6.put("entity", entityPlayer);
                    ProcedureYiChuKaiGuan.executeProcedure($_dependencies6);
                }
            }
        }
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            EntityPlayer entityPlayer = event.player;
            Object world = ((Entity) entityPlayer).field_70170_p;
            int i = (int) ((Entity) entityPlayer).field_70165_t;
            int j = (int) ((Entity) entityPlayer).field_70163_u;
            int k = (int) ((Entity) entityPlayer).field_70161_v;
            HashMap<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Integer.valueOf(i));
            dependencies.put("y", Integer.valueOf(j));
            dependencies.put("z", Integer.valueOf(k));
            dependencies.put("world", world);
            dependencies.put("entity", entityPlayer);
            dependencies.put("event", event);
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
