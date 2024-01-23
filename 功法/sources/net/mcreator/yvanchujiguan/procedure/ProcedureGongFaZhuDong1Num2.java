package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureGongFaZhuDong1Num2.class */
public class ProcedureGongFaZhuDong1Num2 extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFaZhuDong1Num2(ElementsYvanchujiguanMod instance) {
        super(instance, 125);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("功法主动1冷却3分", 3600.0d);
        entity.getEntityData().func_74780_a("Power", entity.getEntityData().func_74769_h("Power") - 480.0d);
    }
}
