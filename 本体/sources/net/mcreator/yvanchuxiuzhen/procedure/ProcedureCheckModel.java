package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureCheckModel.class */
public class ProcedureCheckModel extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCheckModel(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 347);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74767_n("MagicDie")) {
            entity.getEntityData().func_74780_a("AttackClearTime", entity.getEntityData().func_74769_h("AttackClearTime") + 1.0d);
            if (entity.getEntityData().func_74769_h("AttackClearTime") >= 3.0d) {
                entity.getEntityData().func_74780_a("AttackClearTime", 0.0d);
                entity.getEntityData().func_74757_a("MagicDie", false);
            }
        } else if (entity.getEntityData().func_74767_n("ThunderDie")) {
            entity.getEntityData().func_74780_a("AttackClearTime", entity.getEntityData().func_74769_h("AttackClearTime") + 1.0d);
            if (entity.getEntityData().func_74769_h("AttackClearTime") >= 3.0d) {
                entity.getEntityData().func_74780_a("AttackClearTime", 0.0d);
                entity.getEntityData().func_74757_a("ThunderDie", false);
            }
        } else if (entity.getEntityData().func_74767_n("FireDie")) {
            entity.getEntityData().func_74780_a("AttackClearTime", entity.getEntityData().func_74769_h("AttackClearTime") + 1.0d);
            if (entity.getEntityData().func_74769_h("AttackClearTime") >= 3.0d) {
                entity.getEntityData().func_74780_a("AttackClearTime", 0.0d);
                entity.getEntityData().func_74757_a("FireDie", false);
            }
        } else if (entity.getEntityData().func_74767_n("PoisonDie")) {
            if (entity.getEntityData().func_74769_h("AttackClearTime") >= 3.0d) {
                entity.getEntityData().func_74780_a("AttackClearTime", 0.0d);
                entity.getEntityData().func_74757_a("PoisonDie", false);
            }
            entity.getEntityData().func_74780_a("AttackClearTime", entity.getEntityData().func_74769_h("AttackClearTime") + 1.0d);
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

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
