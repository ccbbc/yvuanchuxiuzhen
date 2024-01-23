package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureMoXiuXinXi.class */
public class ProcedureMoXiuXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureMoXiuXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, 262);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.func_145748_c_().func_150260_c().contains("炼气")) {
            entity.getEntityData().func_74780_a("攻击", 3.0d);
            entity.getEntityData().func_74780_a("defense", 4.0d);
            entity.getEntityData().func_74780_a("生命", 40.0d);
            entity.getEntityData().func_74780_a("法防", 0.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 1.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 2.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("筑基")) {
            entity.getEntityData().func_74780_a("攻击", 14.0d);
            entity.getEntityData().func_74780_a("defense", 10.0d);
            entity.getEntityData().func_74780_a("法防", 7.0d);
            entity.getEntityData().func_74780_a("生命", 100.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 6.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 10.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("结丹")) {
            entity.getEntityData().func_74780_a("攻击", 97.0d);
            entity.getEntityData().func_74780_a("defense", 91.0d);
            entity.getEntityData().func_74780_a("法防", 56.0d);
            entity.getEntityData().func_74780_a("生命", 906.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 14.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 86.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("元婴")) {
            entity.getEntityData().func_74780_a("攻击", 231.0d);
            entity.getEntityData().func_74780_a("defense", 208.0d);
            entity.getEntityData().func_74780_a("法防", 165.0d);
            entity.getEntityData().func_74780_a("生命", 2077.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 46.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 276.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("化神")) {
            entity.getEntityData().func_74780_a("攻击", 774.0d);
            entity.getEntityData().func_74780_a("defense", 738.0d);
            entity.getEntityData().func_74780_a("法防", 595.0d);
            entity.getEntityData().func_74780_a("生命", 7377.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 161.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 966.0d);
        }
    }
}
