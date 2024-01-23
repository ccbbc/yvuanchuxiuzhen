package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureJunEYiBuffDo4.class */
public class ProcedureJunEYiBuffDo4 extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureJunEYiBuffDo4(ElementsYvanchuyaoshouMod instance) {
        super(instance, 338);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("毒伤4计时", entity.getEntityData().func_74769_h("毒伤4计时") + 1.0d);
        if (entity.getEntityData().func_74769_h("毒伤4计时") >= 20.0d) {
            entity.getEntityData().func_74780_a("毒伤4计时2", entity.getEntityData().func_74769_h("毒伤4计时2") + 1.0d);
            entity.getEntityData().func_74780_a("BePoisonAttack", 66.0d);
            entity.getEntityData().func_74780_a("毒伤4计时", 0.0d);
            if (entity.getEntityData().func_74769_h("毒伤4计时2") >= 3.0d) {
                entity.getEntityData().func_74780_a("毒伤4计时2", 0.0d);
            }
        }
        entity.getEntityData().func_74757_a("军颚蚁毒伤", true);
    }
}
