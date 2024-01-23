package net.mcreator.yvanchujiguan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureXiuLianZhong.class */
public class ProcedureXiuLianZhong extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureXiuLianZhong(ElementsYvanchujiguanMod instance) {
        super(instance, 50);
    }

    /* JADX WARN: Type inference failed for: r0v400, types: [net.mcreator.yvanchujiguan.procedure.ProcedureXiuLianZhong$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        WorldServer worldServer = (World) dependencies.get("world");
        entityPlayer.getEntityData().func_74780_a("修炼计时", entityPlayer.getEntityData().func_74769_h("修炼计时") + 1.0d);
        if (entityPlayer.getEntityData().func_74769_h("修炼计时") >= 60.0d && entityPlayer.getEntityData().func_74769_h("GongFaXiuLian") == 1.0d) {
            if (entityPlayer.getEntityData().func_74769_h("GongFa") > 0.0d && ((entityPlayer.getEntityData().func_74769_h("GongFa") != 29.0d && entityPlayer.getEntityData().func_74769_h("GongFa") != 30.0d) || ((entityPlayer.getEntityData().func_74769_h("GongFa") == 29.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 30.0d) && entityPlayer.getEntityData().func_74769_h("ShuangXiu") == 1.0d))) {
                if (entityPlayer.getEntityData().func_74769_h("XiuLian") == 1.0d) {
                    if (entityPlayer.getEntityData().func_74769_h("LingYuZhi") > 0.0d) {
                        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") >= 1.0d) {
                            $_dependencies.put("entity", entityPlayer);
                            ProcedureZhenYuanAdd.executeProcedure($_dependencies);
                        }
                        if (!entityPlayer.getEntityData().func_74767_n("修炼阵Pro")) {
                            if (entityPlayer.getEntityData().func_74769_h("MeditationTime") > 0.0d) {
                                entityPlayer.getEntityData().func_74780_a("LingYuZhi", entityPlayer.getEntityData().func_74769_h("LingYuZhi") - 10.0d);
                            } else {
                                entityPlayer.getEntityData().func_74780_a("LingYuZhi", entityPlayer.getEntityData().func_74769_h("LingYuZhi") - 1.0d);
                            }
                        }
                        if (entityPlayer.getEntityData().func_74769_h("Power") < entityPlayer.getEntityData().func_74769_h("PowerMax")) {
                            $_dependencies.put("entity", entityPlayer);
                            ProcedureLingLiAdd.executeProcedure($_dependencies);
                            if (entityPlayer.getEntityData().func_74769_h("Power") >= entityPlayer.getEntityData().func_74769_h("PowerMax") && (entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                                entityPlayer.func_146105_b(new TextComponentString("灵力已恢复，吐纳不再增加灵力。"), false);
                            }
                        }
                        if ((entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_110143_aJ() : -1.0f) < (entityPlayer instanceof EntityLivingBase ? ((EntityLivingBase) entityPlayer).func_110138_aP() : -1.0f)) {
                            $_dependencies.put("entity", entityPlayer);
                            ProcedureQiXueAdd.executeProcedure($_dependencies);
                        }
                        entityPlayer.getEntityData().func_74780_a("灵力增加数", 0.0d);
                        entityPlayer.getEntityData().func_74780_a("真元增加数", 0.0d);
                        entityPlayer.getEntityData().func_74780_a("气血增加数", 0.0d);
                        entityPlayer.getEntityData().func_74780_a("修炼计时", 0.0d);
                    } else {
                        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("附近天地灵气已匮乏，已无法继续吐纳与修炼功法。需要等待天地灵气(灵裕值)的恢复才可继续修炼。"), false);
                        }
                        entityPlayer.getEntityData().func_74780_a("XiuLian", 0.0d);
                        entityPlayer.getEntityData().func_74780_a("修炼计时", 0.0d);
                        entityPlayer.getEntityData().func_74757_a("MeditationTimeOn", false);
                    }
                }
                entityPlayer.getEntityData().func_74778_a("功法熟练度", "GongFa" + new DecimalFormat("0").format(entityPlayer.getEntityData().func_74769_h("GongFa")) + "Num");
                entityPlayer.getEntityData().func_74780_a(entityPlayer.getEntityData().func_74779_i("功法熟练度"), entityPlayer.getEntityData().func_74769_h(entityPlayer.getEntityData().func_74779_i("功法熟练度")) + 10.0d);
                $_dependencies.put("entity", entityPlayer);
                ProcedureGongFaJinDu.executeProcedure($_dependencies);
                if (new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureXiuLianZhong.1
                    public int getScore(String score) {
                        Scoreboard _sc;
                        ScoreObjective _so;
                        if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                            return _scr.func_96652_c();
                        }
                        return 0;
                    }
                }.getScore("已重伤") == 0) {
                    $_dependencies.put("entity", entityPlayer);
                    ProcedureGongFaAdd.executeProcedure($_dependencies);
                }
            }
            entityPlayer.getEntityData().func_74780_a("修炼计时", 0.0d);
            if ((entityPlayer.getEntityData().func_74769_h("GongFa") == 29.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 30.0d) && entityPlayer.getEntityData().func_74769_h("ShuangXiu") == 1.0d) {
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.HEART, x, y + 1, z, 21, 0.5d, 0.5d, 0.5d, 0.0d, new int[0]);
                }
            } else if ((entityPlayer.getEntityData().func_74769_h("GongFa") == 2.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 13.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 6.0d) && entityPlayer.getEntityData().func_74769_h("GongFa") > 0.0d) {
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.TOTEM, x, y + 2, z, 100, 1.5d, 0.5d, 1.5d, 0.0d, new int[0]);
                }
            } else if ((entityPlayer.getEntityData().func_74769_h("GongFa") == 1.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 12.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 21.0d) && entityPlayer.getEntityData().func_74769_h("GongFa") > 0.0d) {
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.EXPLOSION_NORMAL, x, y + 2, z, 100, 1.5d, 0.5d, 1.5d, 0.0d, new int[0]);
                }
            } else if ((entityPlayer.getEntityData().func_74769_h("GongFa") == 3.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 14.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 8.0d) && entityPlayer.getEntityData().func_74769_h("GongFa") > 0.0d) {
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.WATER_SPLASH, x, y + 2, z, 100, 1.5d, 0.5d, 1.5d, 0.0d, new int[0]);
                }
            } else if ((entityPlayer.getEntityData().func_74769_h("GongFa") == 4.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 15.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 31.0d) && entityPlayer.getEntityData().func_74769_h("GongFa") > 0.0d) {
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.LAVA, x, y + 2, z, 100, 1.5d, 0.5d, 1.5d, 0.0d, new int[0]);
                }
            } else if ((entityPlayer.getEntityData().func_74769_h("GongFa") == 5.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 23.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 16.0d) && entityPlayer.getEntityData().func_74769_h("GongFa") > 0.0d) {
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.DRIP_LAVA, x, y + 2, z, 100, 1.5d, 0.5d, 1.5d, 0.0d, new int[0]);
                }
            } else if ((entityPlayer.getEntityData().func_74769_h("GongFa") == 24.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 9.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 11.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 19.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 33.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 26.0d) && entityPlayer.getEntityData().func_74769_h("GongFa") > 0.0d) {
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.SMOKE_NORMAL, x, y + 2, z, 100, 1.5d, 0.5d, 1.5d, 0.0d, new int[0]);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa") == 19.0d && entityPlayer.getEntityData().func_74769_h("GongFa") > 0.0d) {
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.SUSPENDED_DEPTH, x, y + 2, z, 100, 1.5d, 0.5d, 1.5d, 0.0d, new int[0]);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa") == 22.0d && entityPlayer.getEntityData().func_74769_h("GongFa") > 0.0d) {
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.FIREWORKS_SPARK, x, y + 2, z, 100, 1.5d, 0.5d, 1.5d, 0.0d, new int[0]);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa") == 17.0d && entityPlayer.getEntityData().func_74769_h("GongFa") > 0.0d) {
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.SMOKE_LARGE, x, y + 1, z, 100, 1.5d, 0.5d, 1.5d, 0.0d, new int[0]);
                }
            } else if (entityPlayer.getEntityData().func_74769_h("GongFa") == 32.0d && entityPlayer.getEntityData().func_74769_h("GongFa") > 0.0d) {
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.SPELL_INSTANT, x, y + 2, z, 100, 1.5d, 0.5d, 1.5d, 0.0d, new int[0]);
                }
            } else if ((entityPlayer.getEntityData().func_74769_h("GongFa") == 28.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 7.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 10.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 20.0d || entityPlayer.getEntityData().func_74769_h("GongFa") == 25.0d) && entityPlayer.getEntityData().func_74769_h("GongFa") > 0.0d && (worldServer instanceof WorldServer)) {
                worldServer.func_175739_a(EnumParticleTypes.CRIT_MAGIC, x, y + 2, z, 100, 1.5d, 0.5d, 1.5d, 0.0d, new int[0]);
            }
        }
        if (!entityPlayer.func_184218_aH() && (entityPlayer.getEntityData().func_74769_h("XiuLian") == 2.0d || entityPlayer.getEntityData().func_74769_h("GongFaXiuLian") == 1.0d || entityPlayer.getEntityData().func_74769_h("XiuLian") == 1.0d)) {
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("已脱离打坐，修炼与闭关被打断了"), false);
            }
            entityPlayer.getEntityData().func_74757_a("MeditationTimeOn", false);
            entityPlayer.getEntityData().func_74780_a("XiuLian", 0.0d);
            entityPlayer.getEntityData().func_74780_a("GHuanCun", 0.0d);
            entityPlayer.getEntityData().func_74780_a("修炼计时", 0.0d);
        }
        if (entityPlayer.getEntityData().func_74769_h("GongFaXiuLian") == 1.0d) {
            entityPlayer.getEntityData().func_74780_a("ShaQiJiShi", entityPlayer.getEntityData().func_74769_h("ShaQiJiShi") + 1.0d);
            if (entityPlayer.getEntityData().func_74769_h("ShaQiJiShi") >= 100.0d) {
                if (entityPlayer.getEntityData().func_74769_h("GongFa") == 22.0d) {
                    if (entityPlayer.getEntityData().func_74769_h("ShaQi") >= 2.0d) {
                        entityPlayer.getEntityData().func_74780_a("ShaQi", entityPlayer.getEntityData().func_74769_h("ShaQi") - 2.0d);
                        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("煞气减少2点"), false);
                        }
                    } else if (entityPlayer.getEntityData().func_74769_h("功法进阶缓却") == 0.0d) {
                        entityPlayer.getEntityData().func_74780_a("ShaQi", 0.0d);
                        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("你已经没有煞气了"), false);
                        }
                        entityPlayer.getEntityData().func_74780_a("功法进阶缓却", 200.0d);
                    }
                }
                if (entityPlayer.getEntityData().func_74769_h("GongFa") == 24.0d) {
                    if (entityPlayer.getEntityData().func_74769_h("ShaQi") >= 1.0d) {
                        entityPlayer.getEntityData().func_74780_a("ShaQi", entityPlayer.getEntityData().func_74769_h("ShaQi") - 1.0d);
                        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("煞气减少1点"), false);
                        }
                    } else if (entityPlayer.getEntityData().func_74769_h("功法进阶缓却") == 0.0d) {
                        entityPlayer.getEntityData().func_74780_a("ShaQi", 0.0d);
                        if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                            entityPlayer.func_146105_b(new TextComponentString("你已经没有煞气了"), false);
                        }
                        entityPlayer.getEntityData().func_74780_a("功法进阶缓却", 200.0d);
                    }
                }
                entityPlayer.getEntityData().func_74780_a("ShaQiJiShi", 0.0d);
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

    @Override // net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
