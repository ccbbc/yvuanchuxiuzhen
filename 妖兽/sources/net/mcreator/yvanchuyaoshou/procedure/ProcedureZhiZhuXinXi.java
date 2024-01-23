package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityBaiYuZhiZhu;
import net.mcreator.yvanchuyaoshou.entity.EntityXueYuZhiZhu;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureZhiZhuXinXi.class */
public class ProcedureZhiZhuXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZhiZhuXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, 371);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity instanceof EntityBaiYuZhiZhu.EntityCustom) {
            entity.getEntityData().func_74780_a("攻击", 5.0d);
            entity.getEntityData().func_74780_a("法攻", 0.0d);
            entity.getEntityData().func_74780_a("defense", 6.0d);
            entity.getEntityData().func_74780_a("法防", 4.0d);
            entity.getEntityData().func_74780_a("生命", 160.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 1.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 3.0d);
        }
        if (entity instanceof EntityXueYuZhiZhu.EntityCustom) {
            entity.getEntityData().func_74780_a("攻击", 26.0d);
            entity.getEntityData().func_74780_a("法攻", 0.0d);
            entity.getEntityData().func_74780_a("defense", 14.0d);
            entity.getEntityData().func_74780_a("法防", 21.0d);
            entity.getEntityData().func_74780_a("毒防", 8.0d);
            entity.getEntityData().func_74780_a("生命", 210.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 6.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 20.0d);
        }
    }
}
