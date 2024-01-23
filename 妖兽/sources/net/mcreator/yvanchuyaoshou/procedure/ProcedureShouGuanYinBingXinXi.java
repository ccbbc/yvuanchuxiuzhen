package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureShouGuanYinBingXinXi.class */
public class ProcedureShouGuanYinBingXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShouGuanYinBingXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, 297);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.func_145748_c_().func_150260_c().contains("二阶")) {
            entity.getEntityData().func_74780_a("攻击", 17.0d);
            entity.getEntityData().func_74780_a("defense", 14.0d);
            entity.getEntityData().func_74780_a("法防", 11.0d);
            entity.getEntityData().func_74780_a("生命", 168.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 6.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 14.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("四阶")) {
            entity.getEntityData().func_74780_a("攻击", 276.0d);
            entity.getEntityData().func_74780_a("defense", 257.0d);
            entity.getEntityData().func_74780_a("法防", 196.0d);
            entity.getEntityData().func_74780_a("生命", 2568.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 61.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 369.0d);
        }
        if (entity.func_145748_c_().func_150260_c().contains("一阶")) {
            entity.getEntityData().func_74780_a("攻击", 5.0d);
            entity.getEntityData().func_74780_a("defense", 4.0d);
            entity.getEntityData().func_74780_a("法防", 5.0d);
            entity.getEntityData().func_74780_a("生命", 45.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 1.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 2.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("三阶")) {
            entity.getEntityData().func_74780_a("攻击", 256.0d);
            entity.getEntityData().func_74780_a("defense", 188.0d);
            entity.getEntityData().func_74780_a("法防", 96.0d);
            entity.getEntityData().func_74780_a("生命", 2345.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 11.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 68.0d);
        }
    }
}
