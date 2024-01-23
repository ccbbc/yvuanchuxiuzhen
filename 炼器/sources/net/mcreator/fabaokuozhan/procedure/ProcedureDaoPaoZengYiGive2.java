package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureDaoPaoZengYiGive2.class */
public class ProcedureDaoPaoZengYiGive2 extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureDaoPaoZengYiGive2(ElementsFabaokuozhanMod instance) {
        super(instance, 407);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer instanceof EntityPlayer) {
            if (entityPlayer.getEntityData().func_74767_n("DaoPaoOn4")) {
                if (entityPlayer instanceof EntityPlayer) {
                    Scoreboard _sc = entityPlayer.func_96123_co();
                    ScoreObjective _so = _sc.func_96518_b("DaoPaoOn4");
                    if (_so == null) {
                        _so = _sc.func_96535_a("DaoPaoOn4", ScoreCriteria.field_96641_b);
                    }
                    Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                    _scr.func_96647_c(1);
                }
            } else if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc2 = entityPlayer.func_96123_co();
                ScoreObjective _so2 = _sc2.func_96518_b("DaoPaoOn4");
                if (_so2 == null) {
                    _so2 = _sc2.func_96535_a("DaoPaoOn4", ScoreCriteria.field_96641_b);
                }
                Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
                _scr2.func_96647_c(0);
            }
            if (entityPlayer.getEntityData().func_74767_n("DaoPaoOn1")) {
                if (entityPlayer instanceof EntityPlayer) {
                    Scoreboard _sc3 = entityPlayer.func_96123_co();
                    ScoreObjective _so3 = _sc3.func_96518_b("DaoPaoOn1");
                    if (_so3 == null) {
                        _so3 = _sc3.func_96535_a("DaoPaoOn1", ScoreCriteria.field_96641_b);
                    }
                    Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
                    _scr3.func_96647_c(1);
                }
            } else if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc4 = entityPlayer.func_96123_co();
                ScoreObjective _so4 = _sc4.func_96518_b("DaoPaoOn1");
                if (_so4 == null) {
                    _so4 = _sc4.func_96535_a("DaoPaoOn1", ScoreCriteria.field_96641_b);
                }
                Score _scr4 = _sc4.func_96529_a(entityPlayer.func_146103_bH().getName(), _so4);
                _scr4.func_96647_c(0);
            }
            if (entityPlayer.getEntityData().func_74767_n("DaoPaoOn2")) {
                if (entityPlayer instanceof EntityPlayer) {
                    Scoreboard _sc5 = entityPlayer.func_96123_co();
                    ScoreObjective _so5 = _sc5.func_96518_b("DaoPaoOn2");
                    if (_so5 == null) {
                        _so5 = _sc5.func_96535_a("DaoPaoOn2", ScoreCriteria.field_96641_b);
                    }
                    Score _scr5 = _sc5.func_96529_a(entityPlayer.func_146103_bH().getName(), _so5);
                    _scr5.func_96647_c(1);
                }
            } else if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc6 = entityPlayer.func_96123_co();
                ScoreObjective _so6 = _sc6.func_96518_b("DaoPaoOn2");
                if (_so6 == null) {
                    _so6 = _sc6.func_96535_a("DaoPaoOn2", ScoreCriteria.field_96641_b);
                }
                Score _scr6 = _sc6.func_96529_a(entityPlayer.func_146103_bH().getName(), _so6);
                _scr6.func_96647_c(0);
            }
            if (entityPlayer.getEntityData().func_74767_n("DaoPaoOn3")) {
                if (entityPlayer instanceof EntityPlayer) {
                    Scoreboard _sc7 = entityPlayer.func_96123_co();
                    ScoreObjective _so7 = _sc7.func_96518_b("DaoPaoOn3");
                    if (_so7 == null) {
                        _so7 = _sc7.func_96535_a("DaoPaoOn3", ScoreCriteria.field_96641_b);
                    }
                    Score _scr7 = _sc7.func_96529_a(entityPlayer.func_146103_bH().getName(), _so7);
                    _scr7.func_96647_c(1);
                }
            } else if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc8 = entityPlayer.func_96123_co();
                ScoreObjective _so8 = _sc8.func_96518_b("DaoPaoOn3");
                if (_so8 == null) {
                    _so8 = _sc8.func_96535_a("DaoPaoOn3", ScoreCriteria.field_96641_b);
                }
                Score _scr8 = _sc8.func_96529_a(entityPlayer.func_146103_bH().getName(), _so8);
                _scr8.func_96647_c(0);
            }
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc9 = entityPlayer.func_96123_co();
                ScoreObjective _so9 = _sc9.func_96518_b("DaoPao1");
                if (_so9 == null) {
                    _so9 = _sc9.func_96535_a("DaoPao1", ScoreCriteria.field_96641_b);
                }
                Score _scr9 = _sc9.func_96529_a(entityPlayer.func_146103_bH().getName(), _so9);
                _scr9.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("DaoPao1"));
            }
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc10 = entityPlayer.func_96123_co();
                ScoreObjective _so10 = _sc10.func_96518_b("DaoPao2");
                if (_so10 == null) {
                    _so10 = _sc10.func_96535_a("DaoPao2", ScoreCriteria.field_96641_b);
                }
                Score _scr10 = _sc10.func_96529_a(entityPlayer.func_146103_bH().getName(), _so10);
                _scr10.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("DaoPao2"));
            }
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc11 = entityPlayer.func_96123_co();
                ScoreObjective _so11 = _sc11.func_96518_b("DaoPao3");
                if (_so11 == null) {
                    _so11 = _sc11.func_96535_a("DaoPao3", ScoreCriteria.field_96641_b);
                }
                Score _scr11 = _sc11.func_96529_a(entityPlayer.func_146103_bH().getName(), _so11);
                _scr11.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("DaoPao3"));
            }
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc12 = entityPlayer.func_96123_co();
                ScoreObjective _so12 = _sc12.func_96518_b("DaoPao4");
                if (_so12 == null) {
                    _so12 = _sc12.func_96535_a("DaoPao4", ScoreCriteria.field_96641_b);
                }
                Score _scr12 = _sc12.func_96529_a(entityPlayer.func_146103_bH().getName(), _so12);
                _scr12.func_96647_c((int) entityPlayer.getEntityData().func_74769_h("DaoPao4"));
            }
        }
    }

    @SubscribeEvent
    public void onEntityDeath(LivingDeathEvent event) {
        if (event != null && event.getEntity() != null) {
            Entity entity = event.getEntity();
            int i = (int) entity.field_70165_t;
            int j = (int) entity.field_70163_u;
            int k = (int) entity.field_70161_v;
            Object world = entity.field_70170_p;
            HashMap<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Integer.valueOf(i));
            dependencies.put("y", Integer.valueOf(j));
            dependencies.put("z", Integer.valueOf(k));
            dependencies.put("world", world);
            dependencies.put("entity", entity);
            dependencies.put("event", event);
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
