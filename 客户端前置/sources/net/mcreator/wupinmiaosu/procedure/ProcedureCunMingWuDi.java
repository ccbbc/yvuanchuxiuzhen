package net.mcreator.wupinmiaosu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsWupinmiaosuMod.ModElement.Tag
/* loaded from: 客户端前置-mc1.12.2-2.0.12.jar:net/mcreator/wupinmiaosu/procedure/ProcedureCunMingWuDi.class */
public class ProcedureCunMingWuDi extends ElementsWupinmiaosuMod.ModElement {
    public ProcedureCunMingWuDi(ElementsWupinmiaosuMod instance) {
        super(instance, 90);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            System.err.println("Failed to load dependency entity for procedure CunMingWuDi!");
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase instanceof EntityVillager) {
            if (!entityLivingBase.getEntityData().func_74767_n("加载2") && (entityLivingBase instanceof EntityLivingBase)) {
                entityLivingBase.func_70691_i(1721.0f);
            }
            if (!entityLivingBase.getEntityData().func_74767_n("加载3") && (entityLivingBase instanceof EntityLivingBase)) {
                entityLivingBase.func_70691_i(1721.0f);
            }
        }
    }

    @SubscribeEvent
    public void onEntityAttacked(LivingAttackEvent event) {
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
            dependencies.put("sourceentity", event.getSource().func_76364_f());
            executeProcedure(dependencies);
        }
    }

    @Override // net.mcreator.wupinmiaosu.ElementsWupinmiaosuMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
