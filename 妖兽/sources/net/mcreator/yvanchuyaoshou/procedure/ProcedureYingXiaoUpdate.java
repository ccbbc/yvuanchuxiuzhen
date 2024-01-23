package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu0502;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureYingXiaoUpdate.class */
public class ProcedureYingXiaoUpdate extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureYingXiaoUpdate(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntitySanXiu0502.ENTITYID);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("world") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        World world = (World) dependencies.get("world");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) > 0.0f && !entityLivingBase.getEntityData().func_74767_n("初始化")) {
            if (!entityLivingBase.getEntityData().func_74767_n("信息设置")) {
                $_dependencies.put("entity", entityLivingBase);
                ProcedureYingXiaoXinXi.executeProcedure($_dependencies);
                $_dependencies.put("entity", entityLivingBase);
                ProcedureMobsShuXingSet.executeProcedure($_dependencies);
                entityLivingBase.getEntityData().func_74757_a("信息设置", true);
            }
            entityLivingBase.getEntityData().func_74780_a("初始化计时", entityLivingBase.getEntityData().func_74769_h("初始化计时") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("初始化计时") >= 3.0d) {
                entityLivingBase.getEntityData().func_74780_a("初始化计时", 0.0d);
                if (entityLivingBase instanceof EntityLivingBase) {
                    entityLivingBase.func_70691_i(entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f);
                }
                entityLivingBase.func_96094_a(entityLivingBase.getEntityData().func_74779_i("名称"));
                entityLivingBase.getEntityData().func_74757_a("初始化", true);
            }
        } else if (entityLivingBase.getEntityData().func_74767_n("初始化")) {
            entityLivingBase.getEntityData().func_74780_a("主计时", entityLivingBase.getEntityData().func_74769_h("主计时") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("主计时") >= 20.0d) {
                $_dependencies.put("entity", entityLivingBase);
                ProcedureShouJiAndTuoZhan.executeProcedure($_dependencies);
                entityLivingBase.getEntityData().func_74780_a("主计时", 0.0d);
                if ((entityLivingBase instanceof EntityLiving) && ((EntityLiving) entityLivingBase).func_70638_az() != null) {
                    ((Entity) entityLivingBase).field_70159_w = ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 2.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 2.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 2.0d), false, false, true).func_178782_a().func_177958_n() - ((Entity) entityLivingBase).field_70165_t;
                    ((Entity) entityLivingBase).field_70181_x = ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 2.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 2.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 2.0d), false, false, true).func_178782_a().func_177956_o() - ((Entity) entityLivingBase).field_70163_u;
                    ((Entity) entityLivingBase).field_70179_y = ((Entity) entityLivingBase).field_70170_p.func_147447_a(entityLivingBase.func_174824_e(1.0f), entityLivingBase.func_174824_e(1.0f).func_72441_c(entityLivingBase.func_70676_i(1.0f).field_72450_a * 2.0d, entityLivingBase.func_70676_i(1.0f).field_72448_b * 2.0d, entityLivingBase.func_70676_i(1.0f).field_72449_c * 2.0d), false, false, true).func_178782_a().func_177952_p() - ((Entity) entityLivingBase).field_70161_v;
                }
            }
        }
        if (entityLivingBase.getEntityData().func_74767_n("初始化")) {
            entityLivingBase.func_96094_a(entityLivingBase.getEntityData().func_74779_i("名称"));
        }
        $_dependencies.put("entity", entityLivingBase);
        $_dependencies.put("world", world);
        ProcedureAllMobsUpdate.executeProcedure($_dependencies);
    }
}
