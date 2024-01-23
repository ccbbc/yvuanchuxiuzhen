package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureYiChuKaiGuan.class */
public class ProcedureYiChuKaiGuan extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureYiChuKaiGuan(ElementsYvanchuliandanMod instance) {
        super(instance, 800);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("JiuLinShi01") == 0.0d && entity.getEntityData().func_74769_h("JiuLinShi02") == 0.0d && entity.getEntityData().func_74769_h("JiuLinShi03") == 0.0d && entity.getEntityData().func_74769_h("JiuLinShi04") == 0.0d && entity.getEntityData().func_74769_h("JiuLinShi05") == 0.0d && entity.getEntityData().func_74769_h("JiuLinShi06") == 0.0d && entity.getEntityData().func_74769_h("JiuLinShi07") == 0.0d) {
            entity.getEntityData().func_74757_a("JiuLinShi", false);
        }
    }
}
