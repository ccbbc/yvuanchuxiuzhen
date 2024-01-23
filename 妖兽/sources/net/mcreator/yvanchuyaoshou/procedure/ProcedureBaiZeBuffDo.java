package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityCaientity10;
import net.mcreator.yvanchuyaoshou.entity.EntityTianGong2;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureBaiZeBuffDo.class */
public class ProcedureBaiZeBuffDo extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureBaiZeBuffDo(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityTianGong2.ENTITYID);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (!(entity instanceof EntityCaientity10.EntityCustom) && !entity.getEntityData().func_74767_n("白泽攻击")) {
            entity.getEntityData().func_74780_a("BeMagicAttack", 2460.0d);
            entity.getEntityData().func_74757_a("白泽攻击", true);
        }
    }
}
