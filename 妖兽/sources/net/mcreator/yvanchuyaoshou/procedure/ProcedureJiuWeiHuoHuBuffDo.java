package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityCaientity11;
import net.mcreator.yvanchuyaoshou.entity.EntityTianGong3;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureJiuWeiHuoHuBuffDo.class */
public class ProcedureJiuWeiHuoHuBuffDo extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureJiuWeiHuoHuBuffDo(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityTianGong3.ENTITYID_RANGED);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (!(entity instanceof EntityCaientity11.EntityCustom) && !entity.getEntityData().func_74767_n("九尾火狐攻击")) {
            entity.getEntityData().func_74780_a("BeMagicAttack", 2011.0d);
            entity.getEntityData().func_74757_a("九尾火狐攻击", true);
        }
    }
}
