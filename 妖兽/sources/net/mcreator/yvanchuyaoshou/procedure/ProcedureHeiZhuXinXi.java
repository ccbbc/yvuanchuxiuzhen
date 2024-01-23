package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureHeiZhuXinXi.class */
public class ProcedureHeiZhuXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHeiZhuXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, 174);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("攻击", 0.0d);
        if (entity.func_145748_c_().func_150260_c().contains("二阶")) {
            entity.getEntityData().func_74780_a("法攻", 18.0d);
            entity.getEntityData().func_74780_a("defense", 14.0d);
            entity.getEntityData().func_74780_a("法防", 10.0d);
            entity.getEntityData().func_74780_a("毒防", 8.0d);
            entity.getEntityData().func_74780_a("生命", 140.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 6.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 14.0d);
            entity.getEntityData().func_74778_a("黑蛛技能", "二阶黑蜘");
        } else if (entity.func_145748_c_().func_150260_c().contains("五阶")) {
            entity.getEntityData().func_74780_a("法攻", 720.0d);
            entity.getEntityData().func_74780_a("defense", 573.0d);
            entity.getEntityData().func_74780_a("法防", 722.0d);
            entity.getEntityData().func_74780_a("毒防", 118.0d);
            entity.getEntityData().func_74780_a("生命", 7218.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 237.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 1290.0d);
            entity.getEntityData().func_74778_a("黑蛛技能", "五阶黑蜘");
        }
    }
}
