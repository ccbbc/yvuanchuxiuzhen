package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityCaientity02;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureYaoShouDies.class */
public class ProcedureYaoShouDies extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureYaoShouDies(ElementsYvanchuyaoshouMod instance) {
        super(instance, 242);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("sourceentity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        Entity sourceentity = (Entity) dependencies.get("sourceentity");
        if (entity.func_145748_c_().func_150260_c().contains("一阶")) {
            entity.getEntityData().func_74780_a("ZhiLi", sourceentity.getEntityData().func_74769_h("ZhiLi"));
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                if ((entity instanceof EntityLivingBase ? ((EntityLivingBase) entity).func_110143_aJ() : -1.0f) <= 0.0f) {
                    sourceentity.getEntityData().func_74780_a("ZhiLiXp", sourceentity.getEntityData().func_74769_h("ZhiLiXp") + 1.0d);
                }
            }, 25L, TimeUnit.MILLISECONDS);
        } else if (entity instanceof EntityVillager) {
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                if ((entity instanceof EntityLivingBase ? ((EntityLivingBase) entity).func_110143_aJ() : -1.0f) <= 0.0f) {
                    sourceentity.getEntityData().func_74780_a("ShaQi", sourceentity.getEntityData().func_74769_h("ShaQi") + 2.0d);
                }
            }, 25L, TimeUnit.MILLISECONDS);
        } else if (entity instanceof EntityAnimal) {
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                if ((entity instanceof EntityLivingBase ? ((EntityLivingBase) entity).func_110143_aJ() : -1.0f) <= 0.0f) {
                    sourceentity.getEntityData().func_74780_a("ShaQi", sourceentity.getEntityData().func_74769_h("ShaQi") + 1.0d);
                }
            }, 25L, TimeUnit.MILLISECONDS);
        } else if (entity.func_145748_c_().func_150260_c().contains("二阶")) {
            entity.getEntityData().func_74780_a("ZhiLi", sourceentity.getEntityData().func_74769_h("ZhiLi"));
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                if ((entity instanceof EntityLivingBase ? ((EntityLivingBase) entity).func_110143_aJ() : -1.0f) <= 0.0f) {
                    sourceentity.getEntityData().func_74780_a("ZhiLiXp", sourceentity.getEntityData().func_74769_h("ZhiLiXp") + 3.0d);
                }
            }, 25L, TimeUnit.MILLISECONDS);
        } else if (entity.func_145748_c_().func_150260_c().contains("三阶")) {
            entity.getEntityData().func_74780_a("ZhiLi", sourceentity.getEntityData().func_74769_h("ZhiLi"));
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                if ((entity instanceof EntityLivingBase ? ((EntityLivingBase) entity).func_110143_aJ() : -1.0f) <= 0.0f) {
                    sourceentity.getEntityData().func_74780_a("ZhiLiXp", sourceentity.getEntityData().func_74769_h("ZhiLiXp") + 6.0d);
                }
            }, 25L, TimeUnit.MILLISECONDS);
        } else if (entity.func_145748_c_().func_150260_c().contains("四阶")) {
            entity.getEntityData().func_74780_a("ZhiLi", sourceentity.getEntityData().func_74769_h("ZhiLi"));
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                if ((entity instanceof EntityLivingBase ? ((EntityLivingBase) entity).func_110143_aJ() : -1.0f) <= 0.0f) {
                    sourceentity.getEntityData().func_74780_a("ZhiLiXp", sourceentity.getEntityData().func_74769_h("ZhiLiXp") + 10.0d);
                }
            }, 25L, TimeUnit.MILLISECONDS);
        } else if (entity.func_145748_c_().func_150260_c().contains("五阶")) {
            entity.getEntityData().func_74780_a("ZhiLi", sourceentity.getEntityData().func_74769_h("ZhiLi"));
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                if ((entity instanceof EntityLivingBase ? ((EntityLivingBase) entity).func_110143_aJ() : -1.0f) <= 0.0f) {
                    sourceentity.getEntityData().func_74780_a("ZhiLiXp", sourceentity.getEntityData().func_74769_h("ZhiLiXp") + 15.0d);
                }
            }, 25L, TimeUnit.MILLISECONDS);
        } else if (entity.func_145748_c_().func_150260_c().contains("散修")) {
            entity.getEntityData().func_74780_a("SouXun", sourceentity.getEntityData().func_74769_h("SouXun"));
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                if ((entity instanceof EntityLivingBase ? ((EntityLivingBase) entity).func_110143_aJ() : -1.0f) <= 0.0f) {
                    sourceentity.getEntityData().func_74780_a("ShaQi", sourceentity.getEntityData().func_74769_h("ShaQi") + 3.0d);
                }
            }, 25L, TimeUnit.MILLISECONDS);
        } else if (entity.func_145748_c_().func_150260_c().contains("魔修")) {
            entity.getEntityData().func_74780_a("SouXun", sourceentity.getEntityData().func_74769_h("SouXun"));
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                if ((entity instanceof EntityLivingBase ? ((EntityLivingBase) entity).func_110143_aJ() : -1.0f) <= 0.0f) {
                    sourceentity.getEntityData().func_74780_a("ShaQi", sourceentity.getEntityData().func_74769_h("ShaQi") + 2.0d);
                }
            }, 25L, TimeUnit.MILLISECONDS);
        }
        if (entity.func_145748_c_().func_150260_c().contains("炼气")) {
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                if ((entity instanceof EntityLivingBase ? ((EntityLivingBase) entity).func_110143_aJ() : -1.0f) <= 0.0f) {
                    sourceentity.getEntityData().func_74780_a("SouXunXp", sourceentity.getEntityData().func_74769_h("SouXunXp") + 1.0d);
                }
            }, 25L, TimeUnit.MILLISECONDS);
        } else if (entity.func_145748_c_().func_150260_c().contains("筑基")) {
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                if ((entity instanceof EntityLivingBase ? ((EntityLivingBase) entity).func_110143_aJ() : -1.0f) <= 0.0f) {
                    sourceentity.getEntityData().func_74780_a("SouXunXp", sourceentity.getEntityData().func_74769_h("SouXunXp") + 3.0d);
                }
            }, 25L, TimeUnit.MILLISECONDS);
        } else if (entity.func_145748_c_().func_150260_c().contains("结丹")) {
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                if ((entity instanceof EntityLivingBase ? ((EntityLivingBase) entity).func_110143_aJ() : -1.0f) <= 0.0f) {
                    sourceentity.getEntityData().func_74780_a("SouXunXp", sourceentity.getEntityData().func_74769_h("SouXunXp") + 5.0d);
                }
            }, 25L, TimeUnit.MILLISECONDS);
        } else if (entity.func_145748_c_().func_150260_c().contains("元婴")) {
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                if ((entity instanceof EntityLivingBase ? ((EntityLivingBase) entity).func_110143_aJ() : -1.0f) <= 0.0f) {
                    sourceentity.getEntityData().func_74780_a("SouXunXp", sourceentity.getEntityData().func_74769_h("SouXunXp") + 9.0d);
                }
            }, 25L, TimeUnit.MILLISECONDS);
        } else if (entity.func_145748_c_().func_150260_c().contains("化神")) {
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                if ((entity instanceof EntityLivingBase ? ((EntityLivingBase) entity).func_110143_aJ() : -1.0f) <= 0.0f) {
                    sourceentity.getEntityData().func_74780_a("SouXunXp", sourceentity.getEntityData().func_74769_h("SouXunXp") + 18.0d);
                }
            }, 25L, TimeUnit.MILLISECONDS);
        }
        if (entity instanceof EntityCaientity02.EntityCustom) {
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                if ((entity instanceof EntityLivingBase ? ((EntityLivingBase) entity).func_110143_aJ() : -1.0f) <= 0.0f) {
                    sourceentity.getEntityData().func_74780_a("ShaQi", sourceentity.getEntityData().func_74769_h("ShaQi") + 10.0d);
                }
            }, 25L, TimeUnit.MILLISECONDS);
        } else if (entity.func_145748_c_().func_150260_c().contains("一阶") || entity.func_145748_c_().func_150260_c().contains("二阶") || entity.func_145748_c_().func_150260_c().contains("三阶") || entity.func_145748_c_().func_150260_c().contains("四阶") || entity.func_145748_c_().func_150260_c().contains("五阶")) {
            Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
                if ((entity instanceof EntityLivingBase ? ((EntityLivingBase) entity).func_110143_aJ() : -1.0f) <= 0.0f) {
                    sourceentity.getEntityData().func_74780_a("ShaQi", sourceentity.getEntityData().func_74769_h("ShaQi") + 1.0d);
                }
            }, 25L, TimeUnit.MILLISECONDS);
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
