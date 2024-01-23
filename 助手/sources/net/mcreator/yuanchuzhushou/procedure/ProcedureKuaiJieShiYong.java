package net.mcreator.yuanchuzhushou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.minecraft.entity.Entity;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureKuaiJieShiYong.class */
public class ProcedureKuaiJieShiYong extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureKuaiJieShiYong(ElementsYuanchuzhushouMod instance) {
        super(instance, 56);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("快捷使用编号") == 1.0d) {
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("entity", entity);
            ProcedureHuiManXue.executeProcedure($_dependencies);
        } else if (entity.getEntityData().func_74769_h("快捷使用编号") == 2.0d) {
            Map<String, Object> $_dependencies2 = new HashMap<>();
            $_dependencies2.put("entity", entity);
            ProcedureHuiManYuan.executeProcedure($_dependencies2);
        } else if (entity.getEntityData().func_74769_h("快捷使用编号") == 3.0d) {
            Map<String, Object> $_dependencies3 = new HashMap<>();
            $_dependencies3.put("entity", entity);
            ProcedureHuiManLing.executeProcedure($_dependencies3);
        }
    }
}
