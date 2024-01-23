package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureTianGongXinXi.class */
public class ProcedureTianGongXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureTianGongXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, 324);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74778_a("散修远攻技能", "化神散修");
        entity.getEntityData().func_74780_a("攻击", 1.0d);
        if (entity.func_145748_c_().func_150260_c().contains("初期")) {
            entity.getEntityData().func_74780_a("法攻", 696.0d);
            entity.getEntityData().func_74780_a("defense", 516.0d);
            entity.getEntityData().func_74780_a("生命", 6615.0d);
            entity.getEntityData().func_74780_a("法防", 662.0d);
            entity.getEntityData().func_74780_a("雷防", 106.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 161.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 966.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("中期")) {
            entity.getEntityData().func_74780_a("攻击", 894.0d);
            entity.getEntityData().func_74780_a("defense", 795.0d);
            entity.getEntityData().func_74780_a("法防", 570.0d);
            entity.getEntityData().func_74780_a("毒防", 142.0d);
            entity.getEntityData().func_74780_a("生命", 7950.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 237.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 1290.0d);
        } else if (entity.func_145748_c_().func_150260_c().contains("后期")) {
            entity.getEntityData().func_74780_a("法攻", 1036.0d);
            entity.getEntityData().func_74780_a("defense", 735.0d);
            entity.getEntityData().func_74780_a("法防", 904.0d);
            entity.getEntityData().func_74780_a("雷防", 146.0d);
            entity.getEntityData().func_74780_a("生命", 9039.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 354.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 1580.0d);
        }
    }
}
