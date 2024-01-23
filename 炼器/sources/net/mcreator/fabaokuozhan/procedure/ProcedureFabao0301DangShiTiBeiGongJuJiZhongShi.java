package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao0301DangShiTiBeiGongJuJiZhongShi.class */
public class ProcedureFabao0301DangShiTiBeiGongJuJiZhongShi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao0301DangShiTiBeiGongJuJiZhongShi(ElementsFabaokuozhanMod instance) {
        super(instance, 294);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("sourceentity") == null) {
            return;
        }
        Entity sourceentity = (Entity) dependencies.get("sourceentity");
        sourceentity.getEntityData().func_74780_a("Power", sourceentity.getEntityData().func_74769_h("Power") - 134.0d);
    }
}
