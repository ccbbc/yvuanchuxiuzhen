package net.mcreator.yvanchuyaoshou.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureMingSet.class */
public class ProcedureMingSet extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureMingSet(ElementsYvanchuyaoshouMod instance) {
        super(instance, 260);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureMingSet$3] */
    /* JADX WARN: Type inference failed for: r2v18, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureMingSet$1] */
    /* JADX WARN: Type inference failed for: r2v23, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureMingSet$2] */
    /* JADX WARN: Type inference failed for: r2v5, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureMingSet$4] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("Sex") == 0.0d) {
            entity.getEntityData().func_74780_a("母随机数", new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureMingSet.1
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new DecimalFormat("0").format((Math.random() * 100.0d) / 8.0d)));
            if (entity.getEntityData().func_74769_h("母随机数") <= 0.0d) {
                entity.getEntityData().func_74780_a("母随机数", 1.0d);
            }
            entity.getEntityData().func_74778_a("名字暂存", "婉瑶月素凝琪");
            if (entity.getEntityData().func_74769_h("母随机数") <= 6.0d) {
                entity.getEntityData().func_74778_a("名", entity.getEntityData().func_74779_i("名字暂存").substring((int) (entity.getEntityData().func_74769_h("母随机数") - 1.0d), (int) entity.getEntityData().func_74769_h("母随机数")));
            }
            if (entity.getEntityData().func_74779_i("名").equals("")) {
                entity.getEntityData().func_74778_a("名字暂存", "巧倩萱儿云芝翠儿沛灵彩环如音静梅如婷思月玉灵银屏瑶怡琴儿");
                entity.getEntityData().func_74780_a("母随机数", new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureMingSet.2
                    int convert(String s) {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }.convert(new DecimalFormat("0").format((Math.random() * 100.0d) / 7.0d)));
                if (entity.getEntityData().func_74769_h("母随机数") == 0.0d) {
                    entity.getEntityData().func_74780_a("母随机数", 1.0d);
                }
                entity.getEntityData().func_74778_a("名", entity.getEntityData().func_74779_i("名字暂存").substring((int) ((entity.getEntityData().func_74769_h("母随机数") * 2.0d) - 2.0d), (int) (entity.getEntityData().func_74769_h("母随机数") * 2.0d)));
                return;
            }
            return;
        }
        entity.getEntityData().func_74780_a("母随机数", new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureMingSet.3
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new DecimalFormat("0").format((Math.random() * 100.0d) / 5.0d)));
        if (entity.getEntityData().func_74769_h("母随机数") <= 0.0d) {
            entity.getEntityData().func_74780_a("母随机数", 1.0d);
        }
        entity.getEntityData().func_74778_a("名字暂存", "立铁平信业风陌焰玉洛");
        if (entity.getEntityData().func_74769_h("母随机数") <= 10.0d) {
            entity.getEntityData().func_74778_a("名", entity.getEntityData().func_74779_i("名字暂存").substring((int) (entity.getEntityData().func_74769_h("母随机数") - 1.0d), (int) entity.getEntityData().func_74769_h("母随机数")));
        }
        if (entity.getEntityData().func_74779_i("名").equals("")) {
            entity.getEntityData().func_74778_a("名字暂存", "飞羽化元居仁万鹤君羡道元无涯天古天仁天明");
            entity.getEntityData().func_74780_a("母随机数", new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureMingSet.4
                int convert(String s) {
                    try {
                        return Integer.parseInt(s.trim());
                    } catch (Exception e) {
                        return 0;
                    }
                }
            }.convert(new DecimalFormat("0").format((Math.random() * 100.0d) / 10.0d)));
            if (entity.getEntityData().func_74769_h("母随机数") == 0.0d) {
                entity.getEntityData().func_74780_a("母随机数", 1.0d);
            }
            entity.getEntityData().func_74778_a("名", entity.getEntityData().func_74779_i("名字暂存").substring((int) ((entity.getEntityData().func_74769_h("母随机数") * 2.0d) - 2.0d), (int) (entity.getEntityData().func_74769_h("母随机数") * 2.0d)));
        }
    }
}
