package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureWeimian02DangWanJiaJinRuWeiDuShi.class */
public class ProcedureWeimian02DangWanJiaJinRuWeiDuShi extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureWeimian02DangWanJiaJinRuWeiDuShi(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 267);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74757_a("intianting", true);
    }
}
