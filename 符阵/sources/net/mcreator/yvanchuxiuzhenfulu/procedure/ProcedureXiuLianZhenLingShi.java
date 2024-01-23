package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureXiuLianZhenLingShi.class */
public class ProcedureXiuLianZhenLingShi extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureXiuLianZhenLingShi(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 571);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("LingYuZhi") >= 1000.0d) {
            entity.getEntityData().func_74780_a("LingYuZhi", 1000.0d);
        }
        if (entity.getEntityData().func_74769_h("XiuLianXiao") == 1.0d) {
            entity.getEntityData().func_74780_a("XiuLianJiShi1", entity.getEntityData().func_74769_h("XiuLianJiShi1") + 1.0d);
            if (entity.getEntityData().func_74769_h("XiuLianJiShi1") >= 20.0d) {
                entity.getEntityData().func_74780_a("LingYuZhi", entity.getEntityData().func_74769_h("LingYuZhi") + 1.0d);
                entity.getEntityData().func_74780_a("XiuLianJiShi1", 0.0d);
            }
        }
        if (entity.getEntityData().func_74769_h("XiuLianXiao") == 2.0d) {
            entity.getEntityData().func_74780_a("XiuLianJiShi2", entity.getEntityData().func_74769_h("XiuLianJiShi2") + 1.0d);
            if (entity.getEntityData().func_74769_h("XiuLianJiShi2") >= 20.0d) {
                entity.getEntityData().func_74780_a("LingYuZhi", entity.getEntityData().func_74769_h("LingYuZhi") + 35.0d);
                entity.getEntityData().func_74780_a("XiuLianJiShi2", 0.0d);
            }
        }
        if (entity.getEntityData().func_74769_h("XiuLianDa") == 1.0d) {
            entity.getEntityData().func_74780_a("XiuLianJiShi3", entity.getEntityData().func_74769_h("XiuLianJiShi3") + 1.0d);
            if (entity.getEntityData().func_74769_h("XiuLianJiShi3") >= 20.0d) {
                entity.getEntityData().func_74780_a("LingYuZhi", entity.getEntityData().func_74769_h("LingYuZhi") + 1.0d);
                entity.getEntityData().func_74780_a("XiuLianJiShi3", 0.0d);
            }
        }
        if (entity.getEntityData().func_74769_h("XiuLianDa") == 2.0d) {
            entity.getEntityData().func_74780_a("XiuLianJiShi4", entity.getEntityData().func_74769_h("XiuLianJiShi4") + 1.0d);
            if (entity.getEntityData().func_74769_h("XiuLianJiShi4") >= 20.0d) {
                entity.getEntityData().func_74780_a("LingYuZhi", entity.getEntityData().func_74769_h("LingYuZhi") + 50.0d);
                entity.getEntityData().func_74780_a("XiuLianJiShi4", 0.0d);
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

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
