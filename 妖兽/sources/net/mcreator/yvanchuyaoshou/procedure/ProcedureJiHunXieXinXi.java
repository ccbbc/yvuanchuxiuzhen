package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu0402;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureJiHunXieXinXi.class */
public class ProcedureJiHunXieXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureJiHunXieXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityMoXiu0402.ENTITYID_RANGED);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.func_145748_c_().func_150260_c().contains("一阶")) {
            entity.getEntityData().func_74780_a("攻击", 3.0d);
            entity.getEntityData().func_74780_a("法防", 1.0d);
            entity.getEntityData().func_74780_a("defense", 2.0d);
            entity.getEntityData().func_74780_a("毒防", 3.0d);
            entity.getEntityData().func_74780_a("生命", 18.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 1.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 1.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("二阶")) {
            entity.getEntityData().func_74780_a("攻击", 13.0d);
            entity.getEntityData().func_74780_a("defense", 10.0d);
            entity.getEntityData().func_74780_a("法防", 7.0d);
            entity.getEntityData().func_74780_a("毒防", 6.0d);
            entity.getEntityData().func_74780_a("生命", 105.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 6.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 10.0d);
        }
    }
}
