package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityCaientity10;
import net.mcreator.yvanchuyaoshou.entity.EntityHeiZhu;
import net.mcreator.yvanchuyaoshou.entity.EntityHeiZhu2;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureHeiZhuSkill2.class */
public class ProcedureHeiZhuSkill2 extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHeiZhuSkill2(ElementsYvanchuyaoshouMod instance) {
        super(instance, 300);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("sourceentity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("sourceentity");
        if ((entityLivingBase instanceof EntityHeiZhu.EntityCustom) || (entityLivingBase instanceof EntityHeiZhu2.EntityCustom)) {
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70691_i(3.0f);
            }
        } else if ((entityLivingBase instanceof EntityCaientity10.EntityCustom) && (entityLivingBase instanceof EntityLivingBase)) {
            entityLivingBase.func_70691_i(12.0f);
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
