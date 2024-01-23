package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureLinggen.class */
public class ProcedureLinggen extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLinggen(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 203);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("LingGenNum") == 0.0d) {
            entity.getEntityData().func_74778_a("LingGen", "");
            if (Math.random() <= 0.55d) {
                entity.getEntityData().func_74757_a("JinLingGen", true);
                entity.getEntityData().func_74780_a("LingGenNum", entity.getEntityData().func_74769_h("LingGenNum") + 1.0d);
                entity.getEntityData().func_74778_a("LingGen", entity.getEntityData().func_74779_i("LingGen") + "金");
            }
            if (Math.random() <= 0.55d) {
                entity.getEntityData().func_74757_a("MuLingGen", true);
                entity.getEntityData().func_74780_a("LingGenNum", entity.getEntityData().func_74769_h("LingGenNum") + 1.0d);
                entity.getEntityData().func_74778_a("LingGen", entity.getEntityData().func_74779_i("LingGen") + "木");
            }
            if (Math.random() < 0.55d) {
                entity.getEntityData().func_74757_a("ShuiLingGen", true);
                entity.getEntityData().func_74780_a("LingGenNum", entity.getEntityData().func_74769_h("LingGenNum") + 1.0d);
                entity.getEntityData().func_74778_a("LingGen", entity.getEntityData().func_74779_i("LingGen") + "水");
            }
            if (Math.random() <= 0.55d) {
                entity.getEntityData().func_74757_a("HuoLingGen", true);
                entity.getEntityData().func_74780_a("LingGenNum", entity.getEntityData().func_74769_h("LingGenNum") + 1.0d);
                entity.getEntityData().func_74778_a("LingGen", entity.getEntityData().func_74779_i("LingGen") + "火");
            }
            if (Math.random() <= 0.55d) {
                entity.getEntityData().func_74757_a("TuLingGen", true);
                entity.getEntityData().func_74780_a("LingGenNum", entity.getEntityData().func_74769_h("LingGenNum") + 1.0d);
                entity.getEntityData().func_74778_a("LingGen", entity.getEntityData().func_74779_i("LingGen") + "土");
            }
            $_dependencies.put("entity", entity);
            ProcedureTiZhiReset.executeProcedure($_dependencies);
        }
    }
}
