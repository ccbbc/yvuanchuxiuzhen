package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedurePlayerJoinWorld.class */
public class ProcedurePlayerJoinWorld extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedurePlayerJoinWorld(ElementsYvanchuyaoshouMod instance) {
        super(instance, 352);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc = entityPlayer.func_96123_co();
            ScoreObjective _so = _sc.func_96518_b("SumLimit");
            if (_so == null) {
                _so = _sc.func_96535_a("SumLimit", ScoreCriteria.field_96641_b);
            }
            Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
            _scr.func_96647_c(0);
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc2 = entityPlayer.func_96123_co();
            ScoreObjective _so2 = _sc2.func_96518_b("SumLimit2");
            if (_so2 == null) {
                _so2 = _sc2.func_96535_a("SumLimit2", ScoreCriteria.field_96641_b);
            }
            Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
            _scr2.func_96647_c(0);
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc3 = entityPlayer.func_96123_co();
            ScoreObjective _so3 = _sc3.func_96518_b("SumLimit3");
            if (_so3 == null) {
                _so3 = _sc3.func_96535_a("SumLimit3", ScoreCriteria.field_96641_b);
            }
            Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
            _scr3.func_96647_c(0);
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc4 = entityPlayer.func_96123_co();
            ScoreObjective _so4 = _sc4.func_96518_b("SumLimit4");
            if (_so4 == null) {
                _so4 = _sc4.func_96535_a("SumLimit4", ScoreCriteria.field_96641_b);
            }
            Score _scr4 = _sc4.func_96529_a(entityPlayer.func_146103_bH().getName(), _so4);
            _scr4.func_96647_c(0);
        }
        if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc5 = entityPlayer.func_96123_co();
            ScoreObjective _so5 = _sc5.func_96518_b("SumLimit5");
            if (_so5 == null) {
                _so5 = _sc5.func_96535_a("SumLimit5", ScoreCriteria.field_96641_b);
            }
            Score _scr5 = _sc5.func_96529_a(entityPlayer.func_146103_bH().getName(), _so5);
            _scr5.func_96647_c(0);
        }
    }

    @SubscribeEvent
    public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        EntityPlayer entityPlayer = event.player;
        HashMap<String, Object> dependencies = new HashMap<>();
        dependencies.put("x", Integer.valueOf((int) ((Entity) entityPlayer).field_70165_t));
        dependencies.put("y", Integer.valueOf((int) ((Entity) entityPlayer).field_70163_u));
        dependencies.put("z", Integer.valueOf((int) ((Entity) entityPlayer).field_70161_v));
        dependencies.put("world", ((Entity) entityPlayer).field_70170_p);
        dependencies.put("entity", entityPlayer);
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
