package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu0502;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureYuWaXinXi.class */
public class ProcedureYuWaXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureYuWaXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityMoXiu0502.ENTITYID);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("攻击", 1.0d);
        if (entity.func_145748_c_().func_150260_c().contains("一阶")) {
            entity.getEntityData().func_74780_a("法攻", 5.0d);
            entity.getEntityData().func_74780_a("defense", 2.0d);
            entity.getEntityData().func_74780_a("法防", 4.0d);
            entity.getEntityData().func_74780_a("火防", 5.0d);
            entity.getEntityData().func_74780_a("生命", 40.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 1.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 2.0d);
            entity.getEntityData().func_74778_a("雨蛙技能", "一阶雨蛙");
        } else if (entity.func_145748_c_().func_150260_c().contains("二阶")) {
            entity.getEntityData().func_74780_a("法攻", 18.0d);
            entity.getEntityData().func_74780_a("defense", 9.0d);
            entity.getEntityData().func_74780_a("法防", 14.0d);
            entity.getEntityData().func_74780_a("生命", 140.0d);
            entity.getEntityData().func_74780_a("火防", 8.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 6.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 14.0d);
            entity.getEntityData().func_74778_a("雨蛙技能", "二阶雨蛙");
        }
    }
}
