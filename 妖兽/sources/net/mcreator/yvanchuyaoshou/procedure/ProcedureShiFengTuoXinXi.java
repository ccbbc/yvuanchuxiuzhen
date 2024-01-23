package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityShouGuanYinBing04;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureShiFengTuoXinXi.class */
public class ProcedureShiFengTuoXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShiFengTuoXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityShouGuanYinBing04.ENTITYID_RANGED);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.func_145748_c_().func_150260_c().contains("四阶")) {
            entity.getEntityData().func_74780_a("攻击", 277.0d);
            entity.getEntityData().func_74780_a("defense", 256.0d);
            entity.getEntityData().func_74780_a("法防", 198.0d);
            entity.getEntityData().func_74780_a("生命", 2561.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 61.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 369.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("五阶")) {
            entity.getEntityData().func_74780_a("攻击", 592.0d);
            entity.getEntityData().func_74780_a("defense", 601.0d);
            entity.getEntityData().func_74780_a("法防", 450.0d);
            entity.getEntityData().func_74780_a("生命", 6006.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 161.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 966.0d);
        }
    }
}
