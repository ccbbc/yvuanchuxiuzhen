package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityHeiZhu;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureHeiZhuBuff2Do.class */
public class ProcedureHeiZhuBuff2Do extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHeiZhuBuff2Do(ElementsYvanchuyaoshouMod instance) {
        super(instance, 280);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (!(entity instanceof EntityHeiZhu.EntityCustom) && !entity.getEntityData().func_74767_n("黑蛛攻击")) {
            entity.getEntityData().func_74780_a("最终伤害", 2400.0d);
            entity.getEntityData().func_74757_a("黑蛛攻击", true);
        }
    }
}
