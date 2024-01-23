package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityJunEYi02;
import net.mcreator.yvanchuyaoshou.entity.EntityJunEYi03;
import net.mcreator.yvanchuyaoshou.entity.EntityJunEYi04;
import net.mcreator.yvanchuyaoshou.entity.EntityJunEYi05;
import net.mcreator.yvanchuyaoshou.potion.PotionJunEYiBuff2;
import net.mcreator.yvanchuyaoshou.potion.PotionJunEYiBuff3;
import net.mcreator.yvanchuyaoshou.potion.PotionJunEYiBuff4;
import net.mcreator.yvanchuyaoshou.potion.PotionJunEYiSkillBuff1;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureJunEYiSkill2.class */
public class ProcedureJunEYiSkill2 extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureJunEYiSkill2(ElementsYvanchuyaoshouMod instance) {
        super(instance, 330);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("sourceentity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        Entity sourceentity = (Entity) dependencies.get("sourceentity");
        if (!entityLivingBase.getEntityData().func_74767_n("已中毒1")) {
            if ((sourceentity instanceof EntityJunEYi02.EntityCustom) && (entityLivingBase instanceof EntityLivingBase)) {
                entityLivingBase.func_70690_d(new PotionEffect(PotionJunEYiSkillBuff1.potion, 60, 0, false, false));
            }
            if ((sourceentity instanceof EntityJunEYi03.EntityCustom) && (entityLivingBase instanceof EntityLivingBase)) {
                entityLivingBase.func_70690_d(new PotionEffect(PotionJunEYiBuff2.potion, 60, 1, false, false));
            }
            if ((sourceentity instanceof EntityJunEYi04.EntityCustom) && (entityLivingBase instanceof EntityLivingBase)) {
                entityLivingBase.func_70690_d(new PotionEffect(PotionJunEYiBuff3.potion, 60, 2, false, false));
            }
            if ((sourceentity instanceof EntityJunEYi05.EntityCustom) && (entityLivingBase instanceof EntityLivingBase)) {
                entityLivingBase.func_70690_d(new PotionEffect(PotionJunEYiBuff4.potion, 60, 3, false, false));
            }
            entityLivingBase.getEntityData().func_74757_a("已中毒1", true);
        } else if (entityLivingBase.getEntityData().func_74767_n("已中毒1")) {
            entityLivingBase.getEntityData().func_74780_a("中毒清除计时1", 0.0d);
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
