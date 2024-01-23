package net.mcreator.yuanchuzhushou.procedure;

import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.minecraft.entity.Entity;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureShuZhi1.class */
public class ProcedureShuZhi1 extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureShuZhi1(ElementsYuanchuzhushouMod instance) {
        super(instance, 5);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("工具数值") > 0.0d) {
            entity.getEntityData().func_74780_a("工具数值", entity.getEntityData().func_74769_h("工具数值") - 1.0d);
        }
    }
}
