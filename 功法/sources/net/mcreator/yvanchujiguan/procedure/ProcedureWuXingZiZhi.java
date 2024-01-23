package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureWuXingZiZhi.class */
public class ProcedureWuXingZiZhi extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureWuXingZiZhi(ElementsYvanchujiguanMod instance) {
        super(instance, 257);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("SCJRSJDWX") != 2.0d) {
            entity.getEntityData().func_74780_a("SCJRSJDWX", 1.0d);
        }
        if (entity.getEntityData().func_74769_h("SCJRSJDZZ") != 2.0d) {
            entity.getEntityData().func_74780_a("SCJRSJDZZ", 1.0d);
        }
        if (entity.getEntityData().func_74769_h("SCJRSJDYX") != 1.0d) {
            entity.getEntityData().func_74780_a("GHuanCun", 0.0d);
            entity.getEntityData().func_74780_a("YaoXingZanCun", 0.0d);
            entity.getEntityData().func_74780_a("SCJRSJDYX", 1.0d);
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

    @Override // net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
