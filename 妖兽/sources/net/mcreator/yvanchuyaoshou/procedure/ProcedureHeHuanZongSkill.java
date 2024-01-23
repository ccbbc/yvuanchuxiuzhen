package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureHeHuanZongSkill.class */
public class ProcedureHeHuanZongSkill extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHeHuanZongSkill(ElementsYvanchuyaoshouMod instance) {
        super(instance, 306);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        WorldServer worldServer = (World) dependencies.get("world");
        if (entityLivingBase.getEntityData().func_74767_n("受击")) {
            if (entityLivingBase.func_145748_c_().func_150260_c().contains("后期")) {
                entityLivingBase.getEntityData().func_74780_a("冲刺", entityLivingBase.getEntityData().func_74769_h("冲刺") + 1.0d);
            } else if (Math.random() <= 0.5d) {
                entityLivingBase.getEntityData().func_74780_a("冲刺", entityLivingBase.getEntityData().func_74769_h("冲刺") + 1.0d);
            }
            if (entityLivingBase.func_145748_c_().func_150260_c().contains("后期") && entityLivingBase.getEntityData().func_74769_h("冲刺") >= 3.0d) {
                if (entityLivingBase instanceof EntityLivingBase) {
                    entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76441_p, 20, 1, false, false));
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.EXPLOSION_NORMAL, x, y, z, 30, 1.0d, 1.0d, 1.0d, 0.0d, new int[0]);
                }
                ((Entity) entityLivingBase).field_70159_w = ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 3.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 3.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 3.0d), false, false, true).func_178782_a().func_177958_n() - ((Entity) entityLivingBase).field_70165_t;
                ((Entity) entityLivingBase).field_70181_x = 0.0d;
                ((Entity) entityLivingBase).field_70179_y = ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 3.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 3.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 3.0d), false, false, true).func_178782_a().func_177952_p() - ((Entity) entityLivingBase).field_70161_v;
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.EXPLOSION_NORMAL, ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 3.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 3.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 3.0d), false, false, true).func_178782_a().func_177958_n(), y, ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 3.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 3.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 3.0d), false, false, true).func_178782_a().func_177952_p(), 30, 1.0d, 1.0d, 1.0d, 0.0d, new int[0]);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.EXPLOSION_NORMAL, ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 6.0d), false, false, true).func_178782_a().func_177958_n(), y, ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 6.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 6.0d), false, false, true).func_178782_a().func_177952_p(), 30, 1.0d, 1.0d, 1.0d, 0.0d, new int[0]);
                }
                if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) < (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) * 0.05d) {
                    if (entityLivingBase instanceof EntityLivingBase) {
                        entityLivingBase.func_70691_i((float) ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) * 0.25d));
                    }
                } else if (entityLivingBase instanceof EntityLivingBase) {
                    entityLivingBase.func_70691_i((float) entityLivingBase.getEntityData().func_74769_h("攻击"));
                }
                entityLivingBase.getEntityData().func_74780_a("冲刺", 0.0d);
                entityLivingBase.getEntityData().func_74757_a("冲刺伤害", true);
            }
            if (entityLivingBase.getEntityData().func_74769_h("冲刺") >= 5.0d) {
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.EXPLOSION_NORMAL, x, y, z, 30, 1.0d, 1.0d, 1.0d, 0.0d, new int[0]);
                }
                ((Entity) entityLivingBase).field_70159_w = ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 4.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 4.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 4.0d), false, false, true).func_178782_a().func_177958_n() - ((Entity) entityLivingBase).field_70165_t;
                ((Entity) entityLivingBase).field_70181_x = 0.0d;
                ((Entity) entityLivingBase).field_70179_y = ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 4.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 4.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 4.0d), false, false, true).func_178782_a().func_177952_p() - ((Entity) entityLivingBase).field_70161_v;
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.EXPLOSION_NORMAL, ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 4.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 4.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 4.0d), false, false, true).func_178782_a().func_177958_n(), y, ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 4.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 4.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 4.0d), false, false, true).func_178782_a().func_177952_p(), 30, 1.0d, 1.0d, 1.0d, 0.0d, new int[0]);
                }
                if (worldServer instanceof WorldServer) {
                    worldServer.func_175739_a(EnumParticleTypes.EXPLOSION_NORMAL, ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 8.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 8.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 8.0d), false, false, true).func_178782_a().func_177958_n(), y, ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 8.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 8.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 8.0d), false, false, true).func_178782_a().func_177952_p(), 30, 1.0d, 1.0d, 1.0d, 0.0d, new int[0]);
                }
                entityLivingBase.getEntityData().func_74780_a("冲刺", 0.0d);
                entityLivingBase.getEntityData().func_74757_a("冲刺伤害", true);
            }
        }
    }
}
