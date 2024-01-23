package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureShengHuoZhiYe.class */
public class ProcedureShengHuoZhiYe extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShengHuoZhiYe(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 478);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("CaiShi") == 0.0d && entity.getEntityData().func_74769_h("CaiShiXp") >= 200.0d) {
            entity.getEntityData().func_74780_a("CaiShi", entity.getEntityData().func_74769_h("CaiShi") + 1.0d);
            entity.getEntityData().func_74780_a("CaiShiXp", entity.getEntityData().func_74769_h("CaiShiXp") - 200.0d);
        } else if (entity.getEntityData().func_74769_h("CaiShi") == 1.0d && entity.getEntityData().func_74769_h("CaiShiXp") >= 500.0d) {
            entity.getEntityData().func_74780_a("CaiShi", entity.getEntityData().func_74769_h("CaiShi") + 1.0d);
            entity.getEntityData().func_74780_a("CaiShiXp", entity.getEntityData().func_74769_h("CaiShiXp") - 500.0d);
        } else if (entity.getEntityData().func_74769_h("CaiShi") == 2.0d && entity.getEntityData().func_74769_h("CaiShiXp") >= 1000.0d) {
            entity.getEntityData().func_74780_a("CaiShi", entity.getEntityData().func_74769_h("CaiShi") + 1.0d);
            entity.getEntityData().func_74780_a("CaiShiXp", entity.getEntityData().func_74769_h("CaiShiXp") - 1000.0d);
        } else if (entity.getEntityData().func_74769_h("CaiShi") == 3.0d && entity.getEntityData().func_74769_h("CaiShiXp") >= 2000.0d) {
            entity.getEntityData().func_74780_a("CaiShi", entity.getEntityData().func_74769_h("CaiShi") + 1.0d);
            entity.getEntityData().func_74780_a("CaiShiXp", entity.getEntityData().func_74769_h("CaiShiXp") - 2000.0d);
        } else if (entity.getEntityData().func_74769_h("CaiShi") == 4.0d && entity.getEntityData().func_74769_h("CaiShiXp") >= 9999999.0d) {
            entity.getEntityData().func_74780_a("CaiShi", entity.getEntityData().func_74769_h("CaiShi") + 1.0d);
            entity.getEntityData().func_74780_a("CaiShiXp", entity.getEntityData().func_74769_h("CaiShiXp") - 999999.0d);
        }
        if (entity.getEntityData().func_74769_h("NiangJiu") == 0.0d && entity.getEntityData().func_74769_h("NiangJiuXp") >= 36.0d) {
            entity.getEntityData().func_74780_a("NiangJiuXp", entity.getEntityData().func_74769_h("NiangJiuXp") - 36.0d);
            entity.getEntityData().func_74780_a("NiangJiu", entity.getEntityData().func_74769_h("NiangJiu") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("NiangJiu") == 1.0d && entity.getEntityData().func_74769_h("NiangJiuXp") >= 180.0d) {
            entity.getEntityData().func_74780_a("NiangJiuXp", entity.getEntityData().func_74769_h("NiangJiuXp") - 180.0d);
            entity.getEntityData().func_74780_a("NiangJiu", entity.getEntityData().func_74769_h("NiangJiu") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("NiangJiu") == 2.0d && entity.getEntityData().func_74769_h("NiangJiuXp") >= 900.0d) {
            entity.getEntityData().func_74780_a("NiangJiuXp", entity.getEntityData().func_74769_h("NiangJiuXp") - 900.0d);
            entity.getEntityData().func_74780_a("NiangJiu", entity.getEntityData().func_74769_h("NiangJiu") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("NiangJiu") == 3.0d && entity.getEntityData().func_74769_h("NiangJiuXp") >= 4500.0d) {
            entity.getEntityData().func_74780_a("NiangJiuXp", entity.getEntityData().func_74769_h("NiangJiuXp") - 4500.0d);
            entity.getEntityData().func_74780_a("NiangJiu", entity.getEntityData().func_74769_h("NiangJiu") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("NiangJiu") == 4.0d && entity.getEntityData().func_74769_h("NiangJiuXp") >= 9999999.0d) {
            entity.getEntityData().func_74780_a("NiangJiuXp", entity.getEntityData().func_74769_h("NiangJiuXp") - 9999999.0d);
            entity.getEntityData().func_74780_a("NiangJiu", entity.getEntityData().func_74769_h("NiangJiu") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("NiangJiu") == 5.0d && entity.getEntityData().func_74769_h("NiangJiuXp") >= 9999999.0d) {
            entity.getEntityData().func_74780_a("NiangJiuXp", 9999999.0d);
        } else if (entity.getEntityData().func_74769_h("NiangJiu") == 6.0d && entity.getEntityData().func_74769_h("NiangJiuXp") >= 9999999.0d) {
            entity.getEntityData().func_74780_a("NiangJiuXp", entity.getEntityData().func_74769_h("NiangJiuXp") - 9999999.0d);
            entity.getEntityData().func_74780_a("NiangJiu", entity.getEntityData().func_74769_h("NiangJiu") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("NiangJiu") == 7.0d && entity.getEntityData().func_74769_h("NiangJiuXp") >= 9999999.0d) {
            entity.getEntityData().func_74780_a("NiangJiuXp", entity.getEntityData().func_74769_h("NiangJiuXp") - 9999999.0d);
            entity.getEntityData().func_74780_a("NiangJiu", entity.getEntityData().func_74769_h("NiangJiu") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("NiangJiu") == 8.0d && entity.getEntityData().func_74769_h("NiangJiuXp") >= 9999999.0d) {
            entity.getEntityData().func_74780_a("NiangJiuXp", entity.getEntityData().func_74769_h("NiangJiuXp") - 9999999.0d);
            entity.getEntityData().func_74780_a("NiangJiu", entity.getEntityData().func_74769_h("NiangJiu") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("NiangJiu") == 9.0d && entity.getEntityData().func_74769_h("NiangJiuXp") >= 9999999.0d) {
            entity.getEntityData().func_74780_a("NiangJiuXp", entity.getEntityData().func_74769_h("NiangJiuXp") - 9999999.0d);
            entity.getEntityData().func_74780_a("NiangJiu", entity.getEntityData().func_74769_h("NiangJiu") + 1.0d);
        }
    }
}
