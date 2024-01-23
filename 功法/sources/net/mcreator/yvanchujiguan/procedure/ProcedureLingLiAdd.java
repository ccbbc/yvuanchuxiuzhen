package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureLingLiAdd.class */
public class ProcedureLingLiAdd extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLingLiAdd(ElementsYvanchujiguanMod instance) {
        super(instance, 76);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("JingJieNum") == 1.0d) {
            entity.getEntityData().func_74780_a("灵力增加数", 1.0d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 2.0d) {
            entity.getEntityData().func_74780_a("灵力增加数", 2.0d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 3.0d) {
            entity.getEntityData().func_74780_a("灵力增加数", 6.0d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 4.0d) {
            entity.getEntityData().func_74780_a("灵力增加数", 18.0d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 5.0d) {
            entity.getEntityData().func_74780_a("灵力增加数", 54.0d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 6.0d) {
            entity.getEntityData().func_74780_a("灵力增加数", 216.0d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 7.0d) {
            entity.getEntityData().func_74780_a("灵力增加数", 864.0d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 8.0d) {
            entity.getEntityData().func_74780_a("灵力增加数", 3456.0d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 9.0d) {
            entity.getEntityData().func_74780_a("灵力增加数", 17280.0d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 10.0d) {
            entity.getEntityData().func_74780_a("灵力增加数", 86400.0d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 11.0d) {
            entity.getEntityData().func_74780_a("灵力增加数", 432000.0d);
        }
        if (entity.getEntityData().func_74769_h("MeditationTime") > 1.0d) {
            entity.getEntityData().func_74780_a("灵力增加数", entity.getEntityData().func_74769_h("灵力增加数") * 10.0d);
        }
        entity.getEntityData().func_74780_a("Power", entity.getEntityData().func_74769_h("Power") + entity.getEntityData().func_74769_h("灵力增加数"));
    }
}
