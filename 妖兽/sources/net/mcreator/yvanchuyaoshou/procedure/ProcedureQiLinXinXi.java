package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityTianGong1;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureQiLinXinXi.class */
public class ProcedureQiLinXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureQiLinXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityTianGong1.ENTITYID);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.func_145748_c_().func_150260_c().contains("五阶")) {
            entity.getEntityData().func_74780_a("攻击", 605.0d);
            entity.getEntityData().func_74780_a("defense", 606.0d);
            entity.getEntityData().func_74780_a("法防", 453.0d);
            entity.getEntityData().func_74780_a("生命", 6057.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 237.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 1290.0d);
            entity.getEntityData().func_74780_a("技能护甲", 6.0d);
        }
    }
}
