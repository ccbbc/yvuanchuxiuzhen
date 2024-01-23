package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.Config;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
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

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedurePlayJoinWorld.class */
public class ProcedurePlayJoinWorld extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedurePlayJoinWorld(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 572);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityPlayer entityPlayer = (Entity) dependencies.get("entity");
        entityPlayer.getEntityData().func_74780_a("NiangJiu29", Config.Magnification);
        if (Config.ActiveCapability) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc = entityPlayer.func_96123_co();
                ScoreObjective _so = _sc.func_96518_b("ActiveCapability");
                if (_so == null) {
                    _so = _sc.func_96535_a("ActiveCapability", ScoreCriteria.field_96641_b);
                }
                Score _scr = _sc.func_96529_a(entityPlayer.func_146103_bH().getName(), _so);
                _scr.func_96647_c(1);
            }
        } else if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc2 = entityPlayer.func_96123_co();
            ScoreObjective _so2 = _sc2.func_96518_b("ActiveCapability");
            if (_so2 == null) {
                _so2 = _sc2.func_96535_a("ActiveCapability", ScoreCriteria.field_96641_b);
            }
            Score _scr2 = _sc2.func_96529_a(entityPlayer.func_146103_bH().getName(), _so2);
            _scr2.func_96647_c(0);
        }
        if (Config.RiskFunction) {
            if (entityPlayer instanceof EntityPlayer) {
                Scoreboard _sc3 = entityPlayer.func_96123_co();
                ScoreObjective _so3 = _sc3.func_96518_b("RiskFunction");
                if (_so3 == null) {
                    _so3 = _sc3.func_96535_a("RiskFunction", ScoreCriteria.field_96641_b);
                }
                Score _scr3 = _sc3.func_96529_a(entityPlayer.func_146103_bH().getName(), _so3);
                _scr3.func_96647_c(1);
            }
        } else if (entityPlayer instanceof EntityPlayer) {
            Scoreboard _sc4 = entityPlayer.func_96123_co();
            ScoreObjective _so4 = _sc4.func_96518_b("RiskFunction");
            if (_so4 == null) {
                _so4 = _sc4.func_96535_a("RiskFunction", ScoreCriteria.field_96641_b);
            }
            Score _scr4 = _sc4.func_96529_a(entityPlayer.func_146103_bH().getName(), _so4);
            _scr4.func_96647_c(0);
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

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
