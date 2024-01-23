package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityHunTieShou03;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureGuLangXinXi.class */
public class ProcedureGuLangXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGuLangXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityHunTieShou03.ENTITYID);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.func_145748_c_().func_150260_c().contains("三阶")) {
            entity.getEntityData().func_74780_a("攻击", 96.0d);
            entity.getEntityData().func_74780_a("defense", 58.0d);
            entity.getEntityData().func_74780_a("法防", 89.0d);
            entity.getEntityData().func_74780_a("毒防", 30.0d);
            entity.getEntityData().func_74780_a("生命", 891.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 14.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 86.0d);
        }
        if (entity.func_145748_c_().func_150260_c().contains("二阶")) {
            entity.getEntityData().func_74780_a("攻击", 66.0d);
            entity.getEntityData().func_74780_a("defense", 52.0d);
            entity.getEntityData().func_74780_a("法防", 52.0d);
            entity.getEntityData().func_74780_a("生命", 600.0d);
            entity.getEntityData().func_74780_a("毒防", 12.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 6.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 36.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("四阶")) {
            entity.getEntityData().func_74780_a("攻击", 842.0d);
            entity.getEntityData().func_74780_a("defense", 745.0d);
            entity.getEntityData().func_74780_a("毒防", 48.0d);
            entity.getEntityData().func_74780_a("生命", 7450.0d);
            entity.getEntityData().func_74780_a("法防", 745.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 47.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 284.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("五阶")) {
            entity.getEntityData().func_74780_a("攻击", 1769.0d);
            entity.getEntityData().func_74780_a("defense", 1620.0d);
            entity.getEntityData().func_74780_a("法防", 1620.0d);
            entity.getEntityData().func_74780_a("毒防", 96.0d);
            entity.getEntityData().func_74780_a("生命", 19202.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 107.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 644.0d);
        }
    }
}
