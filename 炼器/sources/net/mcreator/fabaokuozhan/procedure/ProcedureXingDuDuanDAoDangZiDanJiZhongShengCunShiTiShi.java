package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureXingDuDuanDAoDangZiDanJiZhongShengCunShiTiShi.class */
public class ProcedureXingDuDuanDAoDangZiDanJiZhongShengCunShiTiShi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureXingDuDuanDAoDangZiDanJiZhongShengCunShiTiShi(ElementsFabaokuozhanMod instance) {
        super(instance, 321);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("sourceentity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        Entity sourceentity = (Entity) dependencies.get("sourceentity");
        entity.getEntityData().func_74780_a("BePoisonAttack", (sourceentity.getEntityData().func_74769_h("PoisonAttack") * 1.5d) + 33.0d);
    }
}
