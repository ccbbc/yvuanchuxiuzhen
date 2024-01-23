package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityHeiZhu;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu0302;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureHeiZhuBuffDo.class */
public class ProcedureHeiZhuBuffDo extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHeiZhuBuffDo(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntitySanXiu0302.ENTITYID_RANGED);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (!(entity instanceof EntityHeiZhu.EntityCustom) && !entity.getEntityData().func_74767_n("黑蛛攻击")) {
            entity.getEntityData().func_74780_a("BeMagicAttack", 70.0d);
            entity.getEntityData().func_74757_a("黑蛛攻击", true);
        }
    }
}
