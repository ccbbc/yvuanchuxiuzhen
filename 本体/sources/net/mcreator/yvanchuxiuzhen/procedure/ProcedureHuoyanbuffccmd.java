package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureHuoyanbuffccmd.class */
public class ProcedureHuoyanbuffccmd extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHuoyanbuffccmd(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 235);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (!(entity instanceof EntityItem) && !entity.getEntityData().func_74767_n("三异火伤害")) {
            entity.func_70015_d(3);
            entity.getEntityData().func_74780_a("BeFireAttack", 48.0d);
            entity.getEntityData().func_74757_a("三异火伤害", true);
        }
        entity.getEntityData().func_74780_a("三阶异火伤害计时", entity.getEntityData().func_74769_h("三阶异火伤害计时") + 1.0d);
        if (entity.getEntityData().func_74769_h("三阶异火伤害计时") >= 20.0d) {
            entity.getEntityData().func_74780_a("三阶异火伤害计时", 0.0d);
            entity.getEntityData().func_74757_a("三异火伤害", false);
        }
    }
}
