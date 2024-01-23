package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureBreakLingShiClearTime.class */
public class ProcedureBreakLingShiClearTime extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureBreakLingShiClearTime(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 280);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("挖掘速度") > 0.0d) {
            entity.getEntityData().func_74780_a("清除挖掘计数", entity.getEntityData().func_74769_h("清除挖掘计数") + 1.0d);
            if (entity.getEntityData().func_74769_h("清除挖掘计数") >= 100.0d) {
                entity.getEntityData().func_74780_a("挖掘速度", entity.getEntityData().func_74769_h("挖掘速度") - 1.0d);
                entity.getEntityData().func_74780_a("清除挖掘计数", 0.0d);
            }
            if (entity.getEntityData().func_74769_h("挖掘速度") < 5.0d) {
                entity.getEntityData().func_74780_a("挖掘概率", 0.0d);
            }
        }
    }
}
