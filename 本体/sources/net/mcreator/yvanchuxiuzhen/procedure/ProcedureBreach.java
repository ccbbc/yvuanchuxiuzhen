package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureBreach.class */
public class ProcedureBreach extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureBreach(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 493);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("JingJieNum") == 1.0d) {
            entity.getEntityData().func_74780_a("TuPoGaiLv", 0.6d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 2.0d) {
            entity.getEntityData().func_74780_a("TuPoGaiLv", 0.5d);
        }
        if (entity.getEntityData().func_74769_h("JingJieNum") == 3.0d) {
            entity.getEntityData().func_74780_a("TuPoGaiLv", 0.4d);
        }
        if (entity.getEntityData().func_74769_h("JingJieNum") == 4.0d) {
            entity.getEntityData().func_74780_a("TuPoGaiLv", 0.3d);
        }
        if (entity.getEntityData().func_74769_h("JingJieNum") == 5.0d) {
            entity.getEntityData().func_74780_a("TuPoGaiLv", 0.2d);
        }
    }
}
