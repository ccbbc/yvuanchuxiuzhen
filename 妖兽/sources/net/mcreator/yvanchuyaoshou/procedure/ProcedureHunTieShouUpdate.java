package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureHunTieShouUpdate.class */
public class ProcedureHunTieShouUpdate extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHunTieShouUpdate(ElementsYvanchuyaoshouMod instance) {
        super(instance, 295);
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
                ProcedureHunTieShouXinXi.executeProcedure($_dependencies);
                $_dependencies.put("entity", entityLivingBase);
                ProcedureMobsShuXingSet.executeProcedure($_dependencies);
                entityLivingBase.getEntityData().func_74757_a("信息设置", true);
            }
            entityLivingBase.getEntityData().func_74780_a("初始化计时", entityLivingBase.getEntityData().func_74769_h("初始化计时") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("初始化计时") >= 3.0d) {
                entityLivingBase.func_96094_a(entityLivingBase.getEntityData().func_74779_i("名称"));
                entityLivingBase.getEntityData().func_74780_a("初始化计时", 0.0d);
                if (entityLivingBase instanceof EntityLivingBase) {
                    entityLivingBase.func_70691_i(entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f);
                }
                entityLivingBase.getEntityData().func_74757_a("初始化", true);
            }
        } else if (entityLivingBase.getEntityData().func_74767_n("初始化")) {
            entityLivingBase.getEntityData().func_74780_a("主计时", entityLivingBase.getEntityData().func_74769_h("主计时") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("主计时") >= 20.0d) {
                $_dependencies.put("entity", entityLivingBase);
                ProcedureShouJiAndTuoZhan.executeProcedure($_dependencies);
                $_dependencies.put("entity", entityLivingBase);
                ProcedureGongJiUpSkill.executeProcedure($_dependencies);
                entityLivingBase.getEntityData().func_74780_a("主计时", 0.0d);
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
