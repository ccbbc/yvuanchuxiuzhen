package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureZhiZhuShouJi.class */
public class ProcedureZhiZhuShouJi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZhiZhuShouJi(ElementsYvanchuyaoshouMod instance) {
        super(instance, 378);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74757_a("受击", true);
        entity.getEntityData().func_74780_a("受击计数", 0.0d);
        entity.getEntityData().func_74757_a("脱战", false);
        entity.getEntityData().func_74757_a("远攻", true);
        entity.getEntityData().func_74780_a("远攻计数", 0.0d);
        entity.getEntityData().func_74780_a("清除计时", 0.0d);
    }
}
