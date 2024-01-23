package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureHeHuanZongXinXi.class */
public class ProcedureHeHuanZongXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHeHuanZongXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, 304);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.func_145748_c_().func_150260_c().contains("初期")) {
            entity.getEntityData().func_74780_a("攻击", 264.0d);
            entity.getEntityData().func_74780_a("defense", 208.0d);
            entity.getEntityData().func_74780_a("生命", 2077.0d);
            entity.getEntityData().func_74780_a("法防", 165.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 46.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 276.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("中期")) {
            entity.getEntityData().func_74780_a("攻击", 308.0d);
            entity.getEntityData().func_74780_a("defense", 257.0d);
            entity.getEntityData().func_74780_a("法防", 196.0d);
            entity.getEntityData().func_74780_a("生命", 2568.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 61.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 369.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("后期")) {
            entity.getEntityData().func_74780_a("攻击", 401.0d);
            entity.getEntityData().func_74780_a("defense", 322.0d);
            entity.getEntityData().func_74780_a("法防", 246.0d);
            entity.getEntityData().func_74780_a("生命", 3247.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 103.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 623.0d);
        }
    }
}
