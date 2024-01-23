package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityBaiYuZhiZhu;
import net.mcreator.yvanchuyaoshou.entity.EntityXueYuZhiZhu;
import net.minecraft.entity.Entity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureZhiZhuSkill.class */
public class ProcedureZhiZhuSkill extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZhiZhuSkill(ElementsYvanchuyaoshouMod instance) {
        super(instance, 377);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("sourceentity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        Entity sourceentity = (Entity) dependencies.get("sourceentity");
        if (sourceentity instanceof EntityBaiYuZhiZhu.EntityCustom) {
            entity.getEntityData().func_74780_a("BePoisonAttack", 2.0d);
        } else if (sourceentity instanceof EntityXueYuZhiZhu.EntityCustom) {
            entity.getEntityData().func_74780_a("BePoisonAttack", 6.0d);
        }
    }

    @SubscribeEvent
    public void onEntityAttacked(LivingAttackEvent event) {
        if (event != null && event.getEntity() != null) {
            Entity entity = event.getEntity();
            int i = (int) entity.field_70165_t;
            int j = (int) entity.field_70163_u;
            int k = (int) entity.field_70161_v;
            float amount = event.getAmount();
            Object world = entity.field_70170_p;
            HashMap<String, Object> dependencies = new HashMap<>();
            dependencies.put("x", Integer.valueOf(i));
            dependencies.put("y", Integer.valueOf(j));
            dependencies.put("z", Integer.valueOf(k));
            dependencies.put("amount", Float.valueOf(amount));
            dependencies.put("world", world);
            dependencies.put("entity", entity);
            dependencies.put("event", event);
            dependencies.put("sourceentity", event.getSource().func_76346_g());
            dependencies.put("imediatesourceentity", event.getSource().func_76364_f());
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
