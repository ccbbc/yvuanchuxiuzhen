package net.mcreator.lianqisanqiannian.procedure;

import java.text.DecimalFormat;
import java.util.Map;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/procedure/ProcedureXiuLianTiShi.class */
public class ProcedureXiuLianTiShi extends ElementsLianqisanqiannianMod.ModElement {
    public ProcedureXiuLianTiShi(ElementsLianqisanqiannianMod instance) {
        super(instance, 14);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        entityLivingBase.getEntityData().func_74778_a("修炼提示", "吐纳修炼有所领悟");
        if (entityLivingBase.getEntityData().func_74769_h("真元增加数") > 0.0d) {
            entityLivingBase.getEntityData().func_74778_a("修炼提示", entityLivingBase.getEntityData().func_74779_i("修炼提示") + "，增加" + new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("真元增加数")) + "真元");
        }
        if (entityLivingBase.getEntityData().func_74769_h("血量增加数") > 0.0d) {
            entityLivingBase.getEntityData().func_74778_a("修炼提示", entityLivingBase.getEntityData().func_74779_i("修炼提示") + "，增加" + new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("血量增加数")) + "气血最大值");
        }
        if (entityLivingBase.getEntityData().func_74769_h("灵气最大值增加数") > 0.0d) {
            entityLivingBase.getEntityData().func_74778_a("修炼提示", entityLivingBase.getEntityData().func_74779_i("修炼提示") + "，增加" + new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("灵气最大值增加数")) + "灵气最大值");
        }
        if (entityLivingBase.getEntityData().func_74769_h("灵气恢复速度增加数") > 0.0d) {
            entityLivingBase.getEntityData().func_74778_a("修炼提示", entityLivingBase.getEntityData().func_74779_i("修炼提示") + "，增加" + new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("灵气恢复速度增加数")) + "灵气恢复速度");
        }
        if (entityLivingBase.getEntityData().func_74769_h("物防增加数") > 0.0d) {
            entityLivingBase.getEntityData().func_74778_a("修炼提示", entityLivingBase.getEntityData().func_74779_i("修炼提示") + "，增加" + new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("物防增加数")) + "物防");
        }
        if (entityLivingBase.getEntityData().func_74769_h("法攻增加数") > 0.0d) {
            entityLivingBase.getEntityData().func_74778_a("修炼提示", entityLivingBase.getEntityData().func_74779_i("修炼提示") + "，增加" + new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("法攻增加数")) + "法攻");
        }
        if (entityLivingBase.getEntityData().func_74769_h("法防增加数") > 0.0d) {
            entityLivingBase.getEntityData().func_74778_a("修炼提示", entityLivingBase.getEntityData().func_74779_i("修炼提示") + "，增加" + new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("法防增加数")) + "法防");
        }
        if (entityLivingBase.getEntityData().func_74769_h("寿元增加数") > 0.0d) {
            entityLivingBase.getEntityData().func_74778_a("修炼提示", entityLivingBase.getEntityData().func_74779_i("修炼提示") + "，增加" + new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("寿元增加数")) + "寿元");
        }
        if (entityLivingBase.getEntityData().func_74769_h("BuffAdd") > 0.0d) {
            entityLivingBase.getEntityData().func_74778_a("修炼提示", entityLivingBase.getEntityData().func_74779_i("修炼提示") + "，增加了一种buff");
        }
        if (entityLivingBase.getEntityData().func_74769_h("入门计时") > 0.0d) {
            if (entityLivingBase.getEntityData().func_74769_h("入门计时") > 3.0d) {
                entityLivingBase.getEntityData().func_74780_a("入门计时", 3.0d);
            }
            entityLivingBase.getEntityData().func_74778_a("修炼提示", entityLivingBase.getEntityData().func_74779_i("修炼提示") + "，" + entityLivingBase.getEntityData().func_74779_i("GongFaShow") + "第" + new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("LayerNum")) + "层，该层已修炼" + new DecimalFormat("0").format((entityLivingBase.getEntityData().func_74769_h("入门计时") / 3.0d) * 100.0d) + "%");
        } else if (entityLivingBase.getEntityData().func_74769_h("Base") >= entityLivingBase.getEntityData().func_74769_h("BaseMax")) {
            entityLivingBase.getEntityData().func_74778_a("修炼提示", entityLivingBase.getEntityData().func_74779_i("修炼提示") + "，灵气恢复" + new DecimalFormat("0.##").format(entityLivingBase.getEntityData().func_74769_h("Power") * 0.01d) + "，气血恢复" + new DecimalFormat("0.##").format((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) * 0.01d) + "，皆为最大值的1%");
        } else {
            entityLivingBase.getEntityData().func_74778_a("修炼提示", entityLivingBase.getEntityData().func_74779_i("修炼提示") + "，" + entityLivingBase.getEntityData().func_74779_i("GongFaShow") + "第" + new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("LayerNum")) + "层，该层已修炼" + new DecimalFormat("0").format((entityLivingBase.getEntityData().func_74769_h("Base") / entityLivingBase.getEntityData().func_74769_h("BaseMax")) * 100.0d) + "%");
        }
    }
}
