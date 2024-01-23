package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityJiHunXie02;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureBaiZeXinXi.class */
public class ProcedureBaiZeXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureBaiZeXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityJiHunXie02.ENTITYID_RANGED);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("攻击", 1.0d);
        if (entity.func_145748_c_().func_150260_c().contains("五阶")) {
            entity.getEntityData().func_74780_a("法攻", 738.0d);
            entity.getEntityData().func_74780_a("defense", 598.0d);
            entity.getEntityData().func_74780_a("法防", 732.0d);
            entity.getEntityData().func_74780_a("生命", 7323.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 237.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 1290.0d);
        }
    }
}
