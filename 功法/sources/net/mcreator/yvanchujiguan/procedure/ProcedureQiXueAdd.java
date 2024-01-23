package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureQiXueAdd.class */
public class ProcedureQiXueAdd extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureQiXueAdd(ElementsYvanchujiguanMod instance) {
        super(instance, 152);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") == 1.0d) {
            entityLivingBase.getEntityData().func_74780_a("气血增加计时", entityLivingBase.getEntityData().func_74769_h("气血增加计时") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("气血增加计时") >= 2.0d) {
                entityLivingBase.getEntityData().func_74780_a("气血增加计时", 0.0d);
                entityLivingBase.getEntityData().func_74780_a("气血增加数", 1.0d);
            }
        } else if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") == 2.0d) {
            entityLivingBase.getEntityData().func_74780_a("气血增加数", 1.0d);
        } else if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") == 3.0d) {
            entityLivingBase.getEntityData().func_74780_a("气血增加数", 3.0d);
        } else if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") == 4.0d) {
            entityLivingBase.getEntityData().func_74780_a("气血增加数", 9.0d);
        } else if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") == 5.0d) {
            entityLivingBase.getEntityData().func_74780_a("气血增加数", 27.0d);
        } else if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") == 6.0d) {
            entityLivingBase.getEntityData().func_74780_a("气血增加数", 108.0d);
        } else if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") == 7.0d) {
            entityLivingBase.getEntityData().func_74780_a("气血增加数", 432.0d);
        } else if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") == 8.0d) {
            entityLivingBase.getEntityData().func_74780_a("气血增加数", 1728.0d);
        } else if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") == 9.0d) {
            entityLivingBase.getEntityData().func_74780_a("气血增加数", 8640.0d);
        } else if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") == 10.0d) {
            entityLivingBase.getEntityData().func_74780_a("气血增加数", 43200.0d);
        } else if (entityLivingBase.getEntityData().func_74769_h("JingJieNum") == 11.0d) {
            entityLivingBase.getEntityData().func_74780_a("气血增加数", 216000.0d);
        }
        if (entityLivingBase instanceof EntityLivingBase) {
            entityLivingBase.func_70691_i((float) entityLivingBase.getEntityData().func_74769_h("气血增加数"));
        }
    }
}
