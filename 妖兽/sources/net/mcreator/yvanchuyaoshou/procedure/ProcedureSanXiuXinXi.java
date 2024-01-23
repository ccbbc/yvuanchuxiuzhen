package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureSanXiuXinXi.class */
public class ProcedureSanXiuXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSanXiuXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, 245);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("攻击", 1.0d);
        if (entity.func_145748_c_().func_150260_c().contains("炼气")) {
            entity.getEntityData().func_74780_a("defense", 1.0d);
            entity.getEntityData().func_74780_a("法攻", 5.0d);
            entity.getEntityData().func_74780_a("法防", 2.0d);
            entity.getEntityData().func_74780_a("雷防", 3.0d);
            entity.getEntityData().func_74780_a("生命", 20.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 1.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 1.0d);
            entity.getEntityData().func_74778_a("散修境界", "1");
            entity.getEntityData().func_74778_a("散修远攻技能", "1");
        } else if (entity.func_145748_c_().func_150260_c().contains("筑基")) {
            entity.getEntityData().func_74778_a("散修境界", "2");
            entity.getEntityData().func_74780_a("defense", 10.0d);
            entity.getEntityData().func_74780_a("法攻", 17.0d);
            entity.getEntityData().func_74780_a("法防", 14.0d);
            entity.getEntityData().func_74780_a("雷防", 8.0d);
            entity.getEntityData().func_74780_a("生命", 145.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 6.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 14.0d);
            entity.getEntityData().func_74778_a("散修远攻技能", "2");
        } else if (entity.func_145748_c_().func_150260_c().contains("结丹")) {
            entity.getEntityData().func_74778_a("散修境界", "3");
            entity.getEntityData().func_74780_a("defense", 43.0d);
            entity.getEntityData().func_74780_a("法攻", 66.0d);
            entity.getEntityData().func_74780_a("法防", 74.0d);
            entity.getEntityData().func_74780_a("雷防", 25.0d);
            entity.getEntityData().func_74780_a("生命", 738.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 10.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 64.0d);
            entity.getEntityData().func_74778_a("散修远攻技能", "3");
        } else if (entity.func_145748_c_().func_150260_c().contains("元婴")) {
            entity.getEntityData().func_74778_a("散修境界", "4");
            entity.getEntityData().func_74780_a("defense", 197.0d);
            entity.getEntityData().func_74780_a("法攻", 280.0d);
            entity.getEntityData().func_74780_a("法防", 258.0d);
            entity.getEntityData().func_74780_a("雷防", 94.0d);
            entity.getEntityData().func_74780_a("生命", 2584.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 46.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 276.0d);
            entity.getEntityData().func_74778_a("散修远攻技能", "4");
        } else if (entity.func_145748_c_().func_150260_c().contains("化神")) {
            entity.getEntityData().func_74778_a("散修境界", "5");
            entity.getEntityData().func_74780_a("defense", 456.0d);
            entity.getEntityData().func_74780_a("法攻", 603.0d);
            entity.getEntityData().func_74780_a("法防", 605.0d);
            entity.getEntityData().func_74780_a("雷防", 106.0d);
            entity.getEntityData().func_74780_a("生命", 6045.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 161.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 966.0d);
            entity.getEntityData().func_74778_a("散修远攻技能", "5");
        }
    }
}
