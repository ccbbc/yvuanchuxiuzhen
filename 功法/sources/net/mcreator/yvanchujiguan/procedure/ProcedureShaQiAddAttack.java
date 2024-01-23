package net.mcreator.yvanchujiguan.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureShaQiAddAttack.class */
public class ProcedureShaQiAddAttack extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShaQiAddAttack(ElementsYvanchujiguanMod instance) {
        super(instance, 150);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [net.mcreator.yvanchujiguan.procedure.ProcedureShaQiAddAttack$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("ShaQiAddMax") > 0.0d && entity.getEntityData().func_74769_h("ShaQi") > 0.0d) {
            entity.getEntityData().func_74780_a("ShaQiAdd", new Object() { // from class: net.mcreator.yvanchujiguan.procedure.ProcedureShaQiAddAttack.1
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new DecimalFormat("0").format(entity.getEntityData().func_74769_h("ShaQi") / 10.0d)));
            if (entity.getEntityData().func_74769_h("ShaQiAdd") > entity.getEntityData().func_74769_h("ShaQiAddMax")) {
                entity.getEntityData().func_74780_a("ShaQiAdd", entity.getEntityData().func_74769_h("ShaQiAddMax"));
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
