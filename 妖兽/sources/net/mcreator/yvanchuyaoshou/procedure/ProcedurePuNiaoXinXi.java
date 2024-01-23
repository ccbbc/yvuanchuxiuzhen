package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityShouGuanYinBing;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedurePuNiaoXinXi.class */
public class ProcedurePuNiaoXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedurePuNiaoXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityShouGuanYinBing.ENTITYID_RANGED);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.func_145748_c_().func_150260_c().contains("三阶")) {
            entity.getEntityData().func_74780_a("攻击", 1.0d);
            entity.getEntityData().func_74780_a("法攻", 93.0d);
            entity.getEntityData().func_74780_a("defense", 59.0d);
            entity.getEntityData().func_74780_a("法防", 89.0d);
            entity.getEntityData().func_74780_a("生命", 894.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 14.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 86.0d);
        }
    }
}
