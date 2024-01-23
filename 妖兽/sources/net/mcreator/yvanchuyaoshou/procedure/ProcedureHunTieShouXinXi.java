package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureHunTieShouXinXi.class */
public class ProcedureHunTieShouXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHunTieShouXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, 294);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.func_145748_c_().func_150260_c().contains("一阶")) {
            entity.getEntityData().func_74780_a("攻击", 5.0d);
            entity.getEntityData().func_74780_a("defense", 4.0d);
            entity.getEntityData().func_74780_a("法防", 2.0d);
            entity.getEntityData().func_74780_a("生命", 50.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 1.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 2.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("二阶")) {
            entity.getEntityData().func_74780_a("攻击", 14.0d);
            entity.getEntityData().func_74780_a("defense", 11.0d);
            entity.getEntityData().func_74780_a("法防", 5.0d);
            entity.getEntityData().func_74780_a("生命", 120.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 6.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 10.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("三阶")) {
            entity.getEntityData().func_74780_a("攻击", 62.0d);
            entity.getEntityData().func_74780_a("defense", 69.0d);
            entity.getEntityData().func_74780_a("法防", 43.0d);
            entity.getEntityData().func_74780_a("生命", 697.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 10.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 64.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("四阶")) {
            entity.getEntityData().func_74780_a("攻击", 221.0d);
            entity.getEntityData().func_74780_a("defense", 210.0d);
            entity.getEntityData().func_74780_a("法防", 163.0d);
            entity.getEntityData().func_74780_a("生命", 2069.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 46.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 276.0d);
        }
    }
}
