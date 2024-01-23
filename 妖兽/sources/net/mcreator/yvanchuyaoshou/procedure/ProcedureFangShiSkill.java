package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureFangShiSkill.class */
public class ProcedureFangShiSkill extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFangShiSkill(ElementsYvanchuyaoshouMod instance) {
        super(instance, 387);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("坊市计数", entity.getEntityData().func_74769_h("坊市计数") + 1.0d);
        if (entity.getEntityData().func_74769_h("坊市计数") >= 100.0d) {
            entity.getEntityData().func_74780_a("ShangHaiLeiJi", entity.getEntityData().func_74769_h("ShangHaiLeiJi") + 1.0d);
            entity.getEntityData().func_74780_a("攻击", 72.0d);
            if (entity.getEntityData().func_74769_h("ShangHaiLeiJi") >= 20.0d) {
                entity.getEntityData().func_74780_a("攻击", 24.0d);
                entity.getEntityData().func_74780_a("ShangHaiLeiJi", 0.0d);
                entity.getEntityData().func_74780_a("坊市计数", 0.0d);
            }
        }
    }
}
