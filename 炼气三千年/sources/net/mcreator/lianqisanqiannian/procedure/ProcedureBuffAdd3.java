package net.mcreator.lianqisanqiannian.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/procedure/ProcedureBuffAdd3.class */
public class ProcedureBuffAdd3 extends ElementsLianqisanqiannianMod.ModElement {
    public ProcedureBuffAdd3(ElementsLianqisanqiannianMod instance) {
        super(instance, 29);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase.getEntityData().func_74767_n("残血保护")) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) <= (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) * 0.1d) {
                if (entityLivingBase.getEntityData().func_74769_h("BuffAdd6") > 0.0d) {
                    if (entityLivingBase.getEntityData().func_74769_h("BuffAdd6") > 9.0d) {
                        entityLivingBase.getEntityData().func_74780_a("BuffAdd6", 9.0d);
                    }
                    if (entityLivingBase instanceof EntityLivingBase) {
                        entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76444_x, 20, (int) (entityLivingBase.getEntityData().func_74769_h("BuffAdd6") - 1.0d), false, false));
                    }
                }
                if (entityLivingBase.getEntityData().func_74769_h("BuffAdd7") > 0.0d) {
                    if (entityLivingBase.getEntityData().func_74769_h("BuffAdd7") > 4.0d) {
                        entityLivingBase.getEntityData().func_74780_a("BuffAdd7", 4.0d);
                    }
                    if (entityLivingBase instanceof EntityLivingBase) {
                        entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76429_m, 20, (int) (entityLivingBase.getEntityData().func_74769_h("BuffAdd7") - 1.0d), false, false));
                    }
                }
                entityLivingBase.getEntityData().func_74757_a("残血保护", true);
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

    @Override // net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
