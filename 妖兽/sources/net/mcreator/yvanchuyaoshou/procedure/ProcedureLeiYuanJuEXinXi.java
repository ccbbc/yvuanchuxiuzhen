package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureLeiYuanJuEXinXi.class */
public class ProcedureLeiYuanJuEXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLeiYuanJuEXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, 202);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("攻击", 1.0d);
        if (entity.func_145748_c_().func_150260_c().contains("四阶")) {
            entity.getEntityData().func_74780_a("法攻", 228.0d);
            entity.getEntityData().func_74780_a("defense", 211.0d);
            entity.getEntityData().func_74780_a("法防", 165.0d);
            entity.getEntityData().func_74780_a("雷防", 86.0d);
            entity.getEntityData().func_74780_a("生命", 2113.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 46.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 276.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("五阶")) {
            entity.getEntityData().func_74780_a("法攻", 596.0d);
            entity.getEntityData().func_74780_a("defense", 596.0d);
            entity.getEntityData().func_74780_a("法防", 446.0d);
            entity.getEntityData().func_74780_a("雷防", 106.0d);
            entity.getEntityData().func_74780_a("生命", 5961.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 161.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 966.0d);
        }
    }
}
