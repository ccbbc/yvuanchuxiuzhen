package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.entity.EntityYiZiMobs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureYiZIRightClickDo.class */
public class ProcedureYiZIRightClickDo extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureYiZIRightClickDo(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 455);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("sourceentity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        Entity sourceentity = (Entity) dependencies.get("sourceentity");
        if (entity instanceof EntityYiZiMobs.EntityCustom) {
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                if (sourceentity.getEntityData().func_74779_i("椅子方向").equals("北")) {
                    entity.field_70177_z = -360.0f;
                    entity.field_70125_A = 0.0f;
                } else if (sourceentity.getEntityData().func_74779_i("椅子方向").equals("南")) {
                    entity.field_70177_z = -180.0f;
                    entity.field_70125_A = 0.0f;
                } else if (sourceentity.getEntityData().func_74779_i("椅子方向").equals("西")) {
                    entity.field_70177_z = -90.0f;
                    entity.field_70125_A = 0.0f;
                } else if (sourceentity.getEntityData().func_74779_i("椅子方向").equals("东")) {
                    entity.field_70177_z = -270.0f;
                    entity.field_70125_A = 0.0f;
                }
            }, 50L, TimeUnit.MILLISECONDS);
        }
    }

    @SubscribeEvent
    public void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
        Entity entity = event.getTarget();
        EntityPlayer sourceentity = event.getEntityPlayer();
        if (event.getHand() != sourceentity.func_184600_cs()) {
            return;
        }
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
        dependencies.put("sourceentity", sourceentity);
        dependencies.put("event", event);
        executeProcedure(dependencies);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
