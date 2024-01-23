package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityHeHuanZong2;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureJiuWeiHuoHuXinXi.class */
public class ProcedureJiuWeiHuoHuXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureJiuWeiHuoHuXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityHeHuanZong2.ENTITYID_RANGED);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("攻击", 1.0d);
        if (entity.func_145748_c_().func_150260_c().contains("五阶")) {
            entity.getEntityData().func_74780_a("法攻", 603.0d);
            entity.getEntityData().func_74780_a("defense", 464.0d);
            entity.getEntityData().func_74780_a("法防", 607.0d);
            entity.getEntityData().func_74780_a("火防", 118.0d);
            entity.getEntityData().func_74780_a("生命", 6066.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 161.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 966.0d);
        }
    }
}
