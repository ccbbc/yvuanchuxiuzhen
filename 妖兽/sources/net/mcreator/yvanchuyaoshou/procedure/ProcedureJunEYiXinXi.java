package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureJunEYiXinXi.class */
public class ProcedureJunEYiXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureJunEYiXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, 176);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.func_145748_c_().func_150260_c().contains("二阶")) {
            entity.getEntityData().func_74780_a("攻击", 15.0d);
            entity.getEntityData().func_74780_a("defense", 10.0d);
            entity.getEntityData().func_74780_a("法防", 8.0d);
            entity.getEntityData().func_74780_a("生命", 100.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 6.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 10.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("三阶")) {
            entity.getEntityData().func_74780_a("攻击", 66.0d);
            entity.getEntityData().func_74780_a("defense", 72.0d);
            entity.getEntityData().func_74780_a("法防", 44.0d);
            entity.getEntityData().func_74780_a("生命", 719.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 10.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 64.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("四阶")) {
            entity.getEntityData().func_74780_a("攻击", 223.0d);
            entity.getEntityData().func_74780_a("defense", 205.0d);
            entity.getEntityData().func_74780_a("法防", 162.0d);
            entity.getEntityData().func_74780_a("生命", 2048.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 46.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 276.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("五阶")) {
            entity.getEntityData().func_74780_a("攻击", 600.0d);
            entity.getEntityData().func_74780_a("defense", 594.0d);
            entity.getEntityData().func_74780_a("法防", 435.0d);
            entity.getEntityData().func_74780_a("生命", 5940.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 161.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 966.0d);
        }
    }
}
