package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureJingJieGaiLv.class */
public class ProcedureJingJieGaiLv extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureJingJieGaiLv(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 322);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("JingJieNum") == 1.0d) {
            entity.getEntityData().func_74780_a("TuPoGaiLv", 0.5d - (0.05d * (entity.getEntityData().func_74769_h("LingGenNum") - 1.0d)));
            if (entity.getEntityData().func_74769_h("LayerNum") == 3.0d) {
                entity.getEntityData().func_74780_a("TuPoGaiLv", 0.33d - (0.05d * (entity.getEntityData().func_74769_h("LingGenNum") - 1.0d)));
            }
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 2.0d) {
            entity.getEntityData().func_74780_a("TuPoGaiLv", 0.33d - (0.05d * (entity.getEntityData().func_74769_h("LingGenNum") - 1.0d)));
            if (entity.getEntityData().func_74769_h("LayerNum") == 4.0d) {
                entity.getEntityData().func_74780_a("TuPoGaiLv", 0.33d - (0.05d * (entity.getEntityData().func_74769_h("LingGenNum") - 1.0d)));
            }
        }
        if (entity.getEntityData().func_74769_h("JingJieNum") == 3.0d) {
            entity.getEntityData().func_74780_a("TuPoGaiLv", 0.16d);
            if (entity.getEntityData().func_74769_h("LayerNum") == 4.0d) {
                entity.getEntityData().func_74780_a("TuPoGaiLv", 0.1d);
            }
        }
        if (entity.getEntityData().func_74769_h("JingJieNum") == 4.0d) {
            entity.getEntityData().func_74780_a("TuPoGaiLv", 0.1d);
            if (entity.getEntityData().func_74769_h("LayerNum") == 4.0d) {
                entity.getEntityData().func_74780_a("TuPoGaiLv", 0.05d);
            }
        }
        if (entity.getEntityData().func_74769_h("JingJieNum") == 5.0d) {
            entity.getEntityData().func_74780_a("TuPoGaiLv", 0.05d);
            if (entity.getEntityData().func_74769_h("LayerNum") == 4.0d) {
                entity.getEntityData().func_74780_a("TuPoGaiLv", 0.028d);
            }
        }
        if (entity.getEntityData().func_74769_h("JingJieNum") == 6.0d) {
            entity.getEntityData().func_74780_a("TuPoGaiLv", 0.028d);
            if (entity.getEntityData().func_74769_h("LayerNum") == 4.0d) {
                entity.getEntityData().func_74780_a("TuPoGaiLv", 0.018d);
            }
        }
        if (entity.getEntityData().func_74769_h("JingJieNum") == 7.0d) {
            entity.getEntityData().func_74780_a("TuPoGaiLv", 0.018d);
            if (entity.getEntityData().func_74769_h("LayerNum") == 4.0d) {
                entity.getEntityData().func_74780_a("TuPoGaiLv", 0.011d);
            }
        }
        if (entity.getEntityData().func_74769_h("JingJieNum") == 8.0d) {
            entity.getEntityData().func_74780_a("TuPoGaiLv", 0.011d);
            if (entity.getEntityData().func_74769_h("LayerNum") == 27.0d) {
                entity.getEntityData().func_74780_a("TuPoGaiLv", 0.007d);
            }
        }
        if (entity.getEntityData().func_74769_h("JingJieNum") == 9.0d) {
            entity.getEntityData().func_74780_a("TuPoGaiLv", 0.007d);
            if (entity.getEntityData().func_74769_h("LayerNum") == 29.0d) {
                entity.getEntityData().func_74780_a("TuPoGaiLv", 0.005d);
            }
        }
        if (entity.getEntityData().func_74769_h("JingJieNum") == 10.0d) {
            entity.getEntityData().func_74780_a("TuPoGaiLv", 0.005d);
            if (entity.getEntityData().func_74769_h("LayerNum") == 31.0d) {
                entity.getEntityData().func_74780_a("TuPoGaiLv", 0.003d);
            }
        }
        if (entity.getEntityData().func_74769_h("JingJieNum") == 0.0d) {
            entity.getEntityData().func_74780_a("TuPoGaiLv", 1.0d);
        }
    }
}
