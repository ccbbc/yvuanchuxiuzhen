package by.ts.fanrenxiuxian.eventhandler;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
/* loaded from: 前置-mc1.12.2-1.2.5.jar:by/ts/fanrenxiuxian/eventhandler/LivingDamageEventHandler.class */
public class LivingDamageEventHandler {
    @SubscribeEvent
    public static void onLivingDamage(LivingDamageEvent event) {
        if (!event.getEntityLiving().field_70170_p.field_72995_K) {
            event.getEntity();
            EntityLivingBase living = event.getEntityLiving();
            NBTTagCompound entityData = living.getEntityData();
            float rest = Math.max((float) (event.getAmount() - entityData.func_74769_h("Defense")), 0.0f);
            Math.max(event.getAmount(), 0.0f);
            if (entityData.func_74767_n("BeNewAttack") || entityData.func_74767_n("BeAttackB")) {
                if (entityData.func_74769_h("BeMagicAttack") > 0.0d) {
                    entityData.func_74780_a("BeMagicAttack", entityData.func_74769_h("BeMagicAttack") - entityData.func_74769_h("MagicDefense"));
                    if (entityData.func_74769_h("BeMagicAttack") <= 0.0d) {
                        entityData.func_74780_a("BeMagicAttack", 0.0d);
                    } else {
                        entityData.func_74757_a("MagicDie", true);
                    }
                }
                if (entityData.func_74769_h("BeThunderAttack") > 0.0d) {
                    entityData.func_74780_a("BeThunderAttack", entityData.func_74769_h("BeThunderAttack") - entityData.func_74769_h("ThunderDefense"));
                    if (entityData.func_74769_h("BeThunderAttack") <= 0.0d) {
                        entityData.func_74780_a("BeThunderAttack", 0.0d);
                    } else {
                        entityData.func_74757_a("ThunderDie", true);
                    }
                }
                if (entityData.func_74769_h("BeFireAttack") > 0.0d) {
                    entityData.func_74780_a("BeFireAttack", entityData.func_74769_h("BeFireAttack") - entityData.func_74769_h("FireDefense"));
                    if (entityData.func_74769_h("BeFireAttack") <= 0.0d) {
                        entityData.func_74780_a("BeFireAttack", 0.0d);
                    } else {
                        entityData.func_74757_a("FireDie", true);
                    }
                }
                if (entityData.func_74769_h("BePoisonAttack") > 0.0d) {
                    entityData.func_74780_a("BePoisonAttack", entityData.func_74769_h("BePoisonAttack") - entityData.func_74769_h("PoisonDefense"));
                    if (entityData.func_74769_h("BePoisonAttack") <= 0.0d) {
                        entityData.func_74780_a("BePoisonAttack", 0.0d);
                    } else {
                        entityData.func_74757_a("PoisonDie", true);
                    }
                }
                entityData.func_74780_a("BeAllAttack", entityData.func_74769_h("BeMagicAttack") + entityData.func_74769_h("BeThunderAttack") + entityData.func_74769_h("BeFireAttack") + entityData.func_74769_h("BePoisonAttack"));
            }
            if (entityData.func_74767_n("BeNewAttack")) {
                entityData.func_74757_a("BeNewAttack", false);
                rest = Math.max((float) ((event.getAmount() * 0.0f) + entityData.func_74769_h("BeAllAttack")), 0.0f);
                entityData.func_74780_a("NewAttackTime", 0.0d);
                entityData.func_74780_a("BeAttack", 0.0d);
                entityData.func_74780_a("BeAttackAdd", 0.0d);
                entityData.func_74780_a("BeAllAttack", 0.0d);
                entityData.func_74780_a("BeMagicAttack", 0.0d);
                entityData.func_74780_a("BeThunderAttack", 0.0d);
                entityData.func_74780_a("BeFireAttack", 0.0d);
                entityData.func_74780_a("BePoisonAttack", 0.0d);
                entityData.func_74780_a("BeAttackTemp", 0.0d);
            } else if (entityData.func_74767_n("BeAttackA")) {
                entityData.func_74757_a("BeAttackA", false);
                rest = Math.max((float) (((event.getAmount() + entityData.func_74769_h("BeAttack")) * 0.8d) - entityData.func_74769_h("Defense")), 0.0f);
                entityData.func_74780_a("BeAttack", 0.0d);
                entityData.func_74780_a("BeAttackAdd", 0.0d);
                entityData.func_74780_a("BeAttackTemp", 0.0d);
            } else if (entityData.func_74767_n("BeAttackB")) {
                entityData.func_74757_a("BeAttackB", false);
                float rest2 = Math.max((float) ((event.getAmount() + entityData.func_74769_h("BeAttack")) - entityData.func_74769_h("Defense")), 0.0f);
                if (entityData.func_74769_h("BeAttackAdd") > 0.0d) {
                    rest2 = Math.max((float) (((event.getAmount() + entityData.func_74769_h("BeAttack")) + ((event.getAmount() + entityData.func_74769_h("BeAttack")) * entityData.func_74769_h("BeAttackAdd"))) - entityData.func_74769_h("Defense")), 0.0f);
                }
                if (rest2 <= 0.0f) {
                    rest = Math.max((float) ((event.getAmount() * 0.0f) + entityData.func_74769_h("BeAllAttack")), 0.0f);
                } else {
                    rest = Math.max((float) (rest2 + entityData.func_74769_h("BeAllAttack")), 0.0f);
                }
                entityData.func_74780_a("NewAttackTime", 0.0d);
                entityData.func_74780_a("BeAttack", 0.0d);
                entityData.func_74780_a("BeAllAttack", 0.0d);
                entityData.func_74780_a("BeMagicAttack", 0.0d);
                entityData.func_74780_a("BeThunderAttack", 0.0d);
                entityData.func_74780_a("BeFireAttack", 0.0d);
                entityData.func_74780_a("BePoisonAttack", 0.0d);
                entityData.func_74780_a("BeAttackAdd", 0.0d);
                entityData.func_74780_a("BeAttackTemp", 0.0d);
            }
            event.setAmount(rest);
        }
    }
}
