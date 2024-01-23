package net.mcreator.lianqisanqiannian.procedure;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.Random;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.minecraft.entity.Entity;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/procedure/ProcedureGongFaAdd.class */
public class ProcedureGongFaAdd extends ElementsLianqisanqiannianMod.ModElement {
    public ProcedureGongFaAdd(ElementsLianqisanqiannianMod instance) {
        super(instance, 9);
    }

    /* JADX WARN: Type inference failed for: r0v59, types: [net.mcreator.lianqisanqiannian.procedure.ProcedureGongFaAdd$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("GongFa3000") == 0.0d) {
            entity.getEntityData().func_74780_a("真元增加数", entity.getEntityData().func_74769_h("真元增加数") + (10.0d * entity.getEntityData().func_74769_h("LayerNum")));
            entity.getEntityData().func_74780_a("Base", entity.getEntityData().func_74769_h("Base") + entity.getEntityData().func_74769_h("真元增加数"));
            entity.getEntityData().func_74780_a("GongFa3000", entity.getEntityData().func_74769_h("GongFa3000") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("GongFa3000") == 1.0d) {
            entity.getEntityData().func_74780_a("法攻增加数", entity.getEntityData().func_74769_h("法攻增加数") + 8.0d);
            entity.getEntityData().func_74780_a("MagicAttack", entity.getEntityData().func_74769_h("MagicAttack") + entity.getEntityData().func_74769_h("法攻增加数"));
            entity.getEntityData().func_74780_a("GongFa3000", entity.getEntityData().func_74769_h("GongFa3000") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("GongFa3000") == 2.0d) {
            entity.getEntityData().func_74780_a("血量增加数", entity.getEntityData().func_74769_h("血量增加数") + 80.0d);
            entity.getEntityData().func_74780_a("HealthMax", entity.getEntityData().func_74769_h("HealthMax") + entity.getEntityData().func_74769_h("血量增加数"));
            entity.getEntityData().func_74780_a("GongFa3000", entity.getEntityData().func_74769_h("GongFa3000") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("GongFa3000") == 3.0d) {
            entity.getEntityData().func_74780_a("灵气最大值增加数", entity.getEntityData().func_74769_h("灵气最大值增加数") + 400.0d);
            entity.getEntityData().func_74780_a("PowerMax", entity.getEntityData().func_74769_h("PowerMax") + entity.getEntityData().func_74769_h("灵气最大值增加数"));
            entity.getEntityData().func_74780_a("GongFa3000", entity.getEntityData().func_74769_h("GongFa3000") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("GongFa3000") == 4.0d) {
            entity.getEntityData().func_74780_a("灵气恢复速度增加数", entity.getEntityData().func_74769_h("灵气恢复速度增加数") + 4.0d);
            entity.getEntityData().func_74780_a("PowerReply", entity.getEntityData().func_74769_h("PowerReply") + entity.getEntityData().func_74769_h("灵气恢复速度增加数"));
            entity.getEntityData().func_74780_a("GongFa3000", entity.getEntityData().func_74769_h("GongFa3000") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("GongFa3000") == 5.0d) {
            entity.getEntityData().func_74780_a("法防增加数", entity.getEntityData().func_74769_h("法防增加数") + 8.0d);
            entity.getEntityData().func_74780_a("MagicDefense", entity.getEntityData().func_74769_h("MagicDefense") + entity.getEntityData().func_74769_h("法防增加数"));
            entity.getEntityData().func_74780_a("GongFa3000", entity.getEntityData().func_74769_h("GongFa3000") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("GongFa3000") == 6.0d) {
            entity.getEntityData().func_74780_a("物防增加数", entity.getEntityData().func_74769_h("物防增加数") + 8.0d);
            entity.getEntityData().func_74780_a("Defense", entity.getEntityData().func_74769_h("Defense") + entity.getEntityData().func_74769_h("物防增加数"));
            entity.getEntityData().func_74780_a("GongFa3000", entity.getEntityData().func_74769_h("GongFa3000") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("GongFa3000") == 7.0d) {
            double NumTemp = new Object() { // from class: net.mcreator.lianqisanqiannian.procedure.ProcedureGongFaAdd.1
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new DecimalFormat("0").format(new Random().nextInt(140) / 13.0d));
            entity.getEntityData().func_74780_a("BuffAdd", entity.getEntityData().func_74769_h("BuffAdd") + 1.0d);
            if (NumTemp <= 0.0d) {
                NumTemp = 1.0d;
            } else if (NumTemp >= 13.0d) {
                NumTemp = 13.0d;
            }
            entity.getEntityData().func_74780_a("BuffAdd" + new DecimalFormat("0").format(NumTemp), entity.getEntityData().func_74769_h("BuffAdd" + new DecimalFormat("0").format(NumTemp)) + 1.0d);
            entity.getEntityData().func_74780_a("GongFa3000", entity.getEntityData().func_74769_h("GongFa3000") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("GongFa3000") == 8.0d) {
            if (entity.getEntityData().func_74769_h("LayerNum") == 9.0d) {
                entity.getEntityData().func_74780_a("寿元增加数", entity.getEntityData().func_74769_h("寿元增加数") + 9.0d);
                entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") + entity.getEntityData().func_74769_h("寿元增加数"));
            } else {
                entity.getEntityData().func_74780_a("真元增加数", entity.getEntityData().func_74769_h("真元增加数") + (10.0d * entity.getEntityData().func_74769_h("LayerNum")));
                entity.getEntityData().func_74780_a("Base", entity.getEntityData().func_74769_h("Base") + entity.getEntityData().func_74769_h("真元增加数"));
            }
            entity.getEntityData().func_74780_a("GongFa3000", 0.0d);
        }
    }
}
