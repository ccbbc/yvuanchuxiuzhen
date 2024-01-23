package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityShouGuanYinBing03;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureLeiBanLuXinXi.class */
public class ProcedureLeiBanLuXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLeiBanLuXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityShouGuanYinBing03.ENTITYID);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("攻击", 1.0d);
        if (entity.func_145748_c_().func_150260_c().contains("三阶")) {
            entity.getEntityData().func_74780_a("法攻", 68.0d);
            entity.getEntityData().func_74780_a("defense", 43.0d);
            entity.getEntityData().func_74780_a("法防", 73.0d);
            entity.getEntityData().func_74780_a("雷防", 25.0d);
            entity.getEntityData().func_74780_a("生命", 734.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 10.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 64.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("四阶")) {
            entity.getEntityData().func_74780_a("法攻", 225.0d);
            entity.getEntityData().func_74780_a("defense", 163.0d);
            entity.getEntityData().func_74780_a("法防", 207.0d);
            entity.getEntityData().func_74780_a("雷防", 86.0d);
            entity.getEntityData().func_74780_a("生命", 2067.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 46.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 276.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("五阶")) {
            entity.getEntityData().func_74780_a("法攻", 582.0d);
            entity.getEntityData().func_74780_a("defense", 454.0d);
            entity.getEntityData().func_74780_a("法防", 601.0d);
            entity.getEntityData().func_74780_a("雷防", 106.0d);
            entity.getEntityData().func_74780_a("生命", 6009.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 161.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 966.0d);
        }
    }
}
