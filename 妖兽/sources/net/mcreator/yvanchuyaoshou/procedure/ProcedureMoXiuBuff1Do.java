package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureMoXiuBuff1Do.class */
public class ProcedureMoXiuBuff1Do extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureMoXiuBuff1Do(ElementsYvanchuyaoshouMod instance) {
        super(instance, 315);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (!entity.func_145748_c_().func_150260_c().contains("魔修")) {
            if (!entity.getEntityData().func_74767_n("魔修1")) {
                entity.func_70097_a(DamageSource.field_76380_i, 42.0f);
                entity.getEntityData().func_74757_a("魔修1", true);
                entity.getEntityData().func_74757_a("魔修撞击", true);
            }
            entity.getEntityData().func_74780_a("魔修1计时", entity.getEntityData().func_74769_h("魔修1计时") + 1.0d);
            if (entity.getEntityData().func_74769_h("魔修1计时") >= 19.0d) {
                entity.getEntityData().func_74757_a("魔修1", false);
                entity.getEntityData().func_74757_a("魔修撞击", false);
                entity.getEntityData().func_74780_a("魔修1计时", 0.0d);
            }
        }
    }
}
