package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureRanYanZhuLengQue.class */
public class ProcedureRanYanZhuLengQue extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureRanYanZhuLengQue(ElementsFabaokuozhanMod instance) {
        super(instance, 588);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("1501LengQue", entity.getEntityData().func_74769_h("1501LengQue") + 1.0d);
        if (entity.getEntityData().func_74769_h("1501LengQue") >= 20.0d) {
            entity.getEntityData().func_74780_a("1501LengQueMiao", entity.getEntityData().func_74769_h("1501LengQueMiao") + 1.0d);
            entity.getEntityData().func_74780_a("1501LengQue", 0.0d);
        }
    }
}
