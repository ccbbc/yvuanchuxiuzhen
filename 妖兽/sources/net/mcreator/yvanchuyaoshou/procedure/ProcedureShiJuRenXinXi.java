package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureShiJuRenXinXi.class */
public class ProcedureShiJuRenXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShiJuRenXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, 179);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.func_145748_c_().func_150260_c().contains("三阶")) {
            entity.getEntityData().func_74780_a("攻击", 94.0d);
            entity.getEntityData().func_74780_a("defense", 88.0d);
            entity.getEntityData().func_74780_a("法防", 56.0d);
            entity.getEntityData().func_74780_a("生命", 878.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 14.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 86.0d);
        }
    }
}
