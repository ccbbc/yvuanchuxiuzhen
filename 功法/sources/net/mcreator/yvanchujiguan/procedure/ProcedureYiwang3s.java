package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureYiwang3s.class */
public class ProcedureYiwang3s extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureYiwang3s(ElementsYvanchujiguanMod instance) {
        super(instance, 95);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [net.mcreator.yvanchujiguan.procedure.ProcedureYiwang3s$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer.getEntityData().func_74769_h("Yiwang3s") > 0.0d) {
            entityPlayer.getEntityData().func_74780_a("Yiwang3s", entityPlayer.getEntityData().func_74769_h("Yiwang3s") - 1.0d);
        }
        if (entityPlayer.getEntityData().func_74769_h("Yiwang3s") == 0.0d && entityPlayer.getEntityData().func_74769_h("GongFaCut") == 1.0d) {
            entityPlayer.getEntityData().func_74780_a("GongFaCut", 0.0d);
        }
        if (entityPlayer.getEntityData().func_74769_h("功法被动1循环") > 0.0d) {
            entityPlayer.getEntityData().func_74780_a("功法被动1循环", entityPlayer.getEntityData().func_74769_h("功法被动1循环") - 1.0d);
        }
        if (entityPlayer.getEntityData().func_74767_n("功法被动1激活") && entityPlayer.getEntityData().func_74767_n("LeiJie")) {
            entityPlayer.getEntityData().func_74757_a("功法被动1激活", false);
            entityPlayer.getEntityData().func_74780_a("LeiJieTime3", entityPlayer.getEntityData().func_74769_h("LeiJieTime3") + 7.0d);
        }
        if (entityPlayer.getEntityData().func_74769_h("功法被动1循环") == 0.0d && entityPlayer.getEntityData().func_74767_n("功法被动1激活")) {
            entityPlayer.getEntityData().func_74757_a("功法被动1激活", false);
        }
        if (entityPlayer.getEntityData().func_74769_h("功法被动3循环") > 0.0d) {
            entityPlayer.getEntityData().func_74780_a("功法被动3循环", entityPlayer.getEntityData().func_74769_h("功法被动3循环") - 1.0d);
        }
        if (entityPlayer.getEntityData().func_74769_h("功法被动3延长") > 0.0d) {
            entityPlayer.getEntityData().func_74780_a("功法被动3延长", entityPlayer.getEntityData().func_74769_h("功法被动3延长") - 1.0d);
        }
        if (entityPlayer.getEntityData().func_74769_h("功法被动3延长") == 0.0d && entityPlayer.getEntityData().func_74769_h("功法被动3") == 2.0d) {
            entityPlayer.getEntityData().func_74780_a("功法被动3", 1.0d);
            if ((entityPlayer instanceof EntityPlayer) && !((Entity) entityPlayer).field_70170_p.field_72995_K) {
                entityPlayer.func_146105_b(new TextComponentString("你的毒气攻击已关闭。"), false);
            }
        }
        if (entityPlayer.getEntityData().func_74769_h("功法主动1冷却3分") > 0.0d) {
            entityPlayer.getEntityData().func_74780_a("功法主动1冷却3分", entityPlayer.getEntityData().func_74769_h("功法主动1冷却3分") - 1.0d);
        }
        if (entityPlayer.getEntityData().func_74769_h("功法主动2冷却一分") > 0.0d) {
            entityPlayer.getEntityData().func_74780_a("功法主动2冷却一分", entityPlayer.getEntityData().func_74769_h("功法主动2冷却一分") - 1.0d);
        }
        if (entityPlayer.getEntityData().func_74769_h("功法主动2持续12s") > 0.0d) {
            entityPlayer.getEntityData().func_74780_a("功法主动2持续12s", entityPlayer.getEntityData().func_74769_h("功法主动2持续12s") - 1.0d);
        }
        if (entityPlayer.getEntityData().func_74769_h("功法主动2持续12s") == 0.0d) {
            entityPlayer.getEntityData().func_74780_a("MagicAttack", entityPlayer.getEntityData().func_74769_h("MagicAttack") - new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureYiwang3s.1
                public int getScore(String score) {
                    Scoreboard _sc;
                    ScoreObjective _so;
                    if ((entityPlayer instanceof EntityPlayer) && (_so = (_sc = entityPlayer.func_96123_co()).func_96518_b(score)) != null) {
                        Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                        return _scr.func_96652_c();
                    }
                    return 0;
                }
            }.getScore("法攻暂计"));
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc = entityPlayer.func_96123_co();
                ScoreObjective _so = _sc.func_96518_b("法攻暂计");
                if (_so == null) {
                    _so = _sc.func_96535_a("法攻暂计", ScoreCriteria.field_96641_b);
                }
                Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                _scr.func_96647_c(0);
            }
            entityPlayer.getEntityData().func_74780_a("功法主动2持续12s", -1.0d);
        }
        if (entityPlayer.getEntityData().func_74769_h("GongFaXiuLian") == 1.0d && !entityPlayer.func_184218_aH()) {
            entityPlayer.getEntityData().func_74780_a("GongFaXiuLian", 0.0d);
        }
        if (entityPlayer.getEntityData().func_74769_h("功法进阶缓却") > 0.0d) {
            entityPlayer.getEntityData().func_74780_a("功法进阶缓却", entityPlayer.getEntityData().func_74769_h("功法进阶缓却") - 1.0d);
        }
        if (((entityPlayer.getEntityData().func_74769_h("JingJieNum") == 1.0d && entityPlayer.getEntityData().func_74769_h("LayerNum") == 3.0d) || (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 2.0d && entityPlayer.getEntityData().func_74769_h("LayerNum") < 4.0d)) && entityPlayer.getEntityData().func_74769_h("功法概率增加") != 0.15d) {
            if (entityPlayer.getEntityData().func_74769_h("GongFa11") >= 1.0d) {
                entityPlayer.getEntityData().func_74780_a("功法概率增加", 0.15d);
            } else {
                entityPlayer.getEntityData().func_74780_a("功法概率增加", 0.0d);
            }
        }
        if (((entityPlayer.getEntityData().func_74769_h("JingJieNum") == 2.0d && entityPlayer.getEntityData().func_74769_h("LayerNum") == 4.0d) || (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 3.0d && entityPlayer.getEntityData().func_74769_h("LayerNum") < 4.0d)) && entityPlayer.getEntityData().func_74769_h("功法概率增加") != 0.1d) {
            if (entityPlayer.getEntityData().func_74769_h("GongFa7") >= 2.0d) {
                entityPlayer.getEntityData().func_74780_a("功法概率增加", 0.1d);
            } else {
                entityPlayer.getEntityData().func_74780_a("功法概率增加", 0.0d);
            }
        }
        if (((entityPlayer.getEntityData().func_74769_h("JingJieNum") == 3.0d && entityPlayer.getEntityData().func_74769_h("LayerNum") == 4.0d) || (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 4.0d && entityPlayer.getEntityData().func_74769_h("LayerNum") < 4.0d)) && entityPlayer.getEntityData().func_74769_h("功法概率增加") != 0.05d) {
            if (entityPlayer.getEntityData().func_74769_h("GongFa9") >= 3.0d) {
                entityPlayer.getEntityData().func_74780_a("功法概率增加", 0.05d);
            } else {
                entityPlayer.getEntityData().func_74780_a("功法概率增加", 0.0d);
            }
        }
        if (((entityPlayer.getEntityData().func_74769_h("JingJieNum") == 4.0d && entityPlayer.getEntityData().func_74769_h("LayerNum") == 4.0d) || (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 5.0d && entityPlayer.getEntityData().func_74769_h("LayerNum") < 4.0d)) && entityPlayer.getEntityData().func_74769_h("功法概率增加") != 0.03d) {
            if (entityPlayer.getEntityData().func_74769_h("GongFa10") >= 4.0d) {
                entityPlayer.getEntityData().func_74780_a("功法概率增加", 0.03d);
            } else {
                entityPlayer.getEntityData().func_74780_a("功法概率增加", 0.0d);
            }
        }
        if (entityPlayer.getEntityData().func_74769_h("JingJieNum") == 4.0d && entityPlayer.getEntityData().func_74769_h("LayerNum") == 4.0d && entityPlayer.getEntityData().func_74769_h("功法概率增加") != 0.03d && entityPlayer.getEntityData().func_74769_h("GongFa28") >= 13.0d) {
            entityPlayer.getEntityData().func_74780_a("功法概率增加", entityPlayer.getEntityData().func_74769_h("功法概率增加") + 0.1d);
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
