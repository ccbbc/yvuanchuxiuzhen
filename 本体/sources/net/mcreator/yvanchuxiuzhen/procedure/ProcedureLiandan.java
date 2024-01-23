package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureLiandan.class */
public class ProcedureLiandan extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLiandan(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 164);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("LianDan") == 0.0d && entity.getEntityData().func_74769_h("LianDanXp") >= 1950.0d) {
            entity.getEntityData().func_74780_a("LianDanXp", entity.getEntityData().func_74769_h("LianDanXp") - 1950.0d);
            entity.getEntityData().func_74780_a("LianDan", entity.getEntityData().func_74769_h("LianDan") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("LianDan") == 1.0d && entity.getEntityData().func_74769_h("LianDanXp") >= 7650.0d) {
            entity.getEntityData().func_74780_a("LianDanXp", entity.getEntityData().func_74769_h("LianDanXp") - 7650.0d);
            entity.getEntityData().func_74780_a("LianDan", entity.getEntityData().func_74769_h("LianDan") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("LianDan") == 2.0d && entity.getEntityData().func_74769_h("LianDanXp") >= 38880.0d) {
            entity.getEntityData().func_74780_a("LianDanXp", entity.getEntityData().func_74769_h("LianDanXp") - 38880.0d);
            entity.getEntityData().func_74780_a("LianDan", entity.getEntityData().func_74769_h("LianDan") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("LianDan") == 3.0d && entity.getEntityData().func_74769_h("LianDanXp") >= 127980.0d) {
            entity.getEntityData().func_74780_a("LianDanXp", entity.getEntityData().func_74769_h("LianDanXp") - 127980.0d);
            entity.getEntityData().func_74780_a("LianDan", entity.getEntityData().func_74769_h("LianDan") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("LianDan") == 4.0d && entity.getEntityData().func_74769_h("LianDanXp") >= 9999999.0d) {
            entity.getEntityData().func_74780_a("LianDanXp", entity.getEntityData().func_74769_h("LianDanXp") - 9999999.0d);
            entity.getEntityData().func_74780_a("LianDan", entity.getEntityData().func_74769_h("LianDan") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("LianDan") == 5.0d && entity.getEntityData().func_74769_h("LianDanXp") >= 9999999.0d) {
            entity.getEntityData().func_74780_a("LianDanXp", 9999999.0d);
        } else if (entity.getEntityData().func_74769_h("LianDan") == 6.0d && entity.getEntityData().func_74769_h("LianDanXp") >= 9999999.0d) {
            entity.getEntityData().func_74780_a("LianDanXp", entity.getEntityData().func_74769_h("LianDanXp") - 9999999.0d);
            entity.getEntityData().func_74780_a("LianDan", entity.getEntityData().func_74769_h("LianDan") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("LianDan") == 7.0d && entity.getEntityData().func_74769_h("LianDanXp") >= 9999999.0d) {
            entity.getEntityData().func_74780_a("LianDanXp", entity.getEntityData().func_74769_h("LianDanXp") - 9999999.0d);
            entity.getEntityData().func_74780_a("LianDan", entity.getEntityData().func_74769_h("LianDan") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("LianDan") == 8.0d && entity.getEntityData().func_74769_h("LianDanXp") >= 9999999.0d) {
            entity.getEntityData().func_74780_a("LianDanXp", entity.getEntityData().func_74769_h("LianDanXp") - 9999999.0d);
            entity.getEntityData().func_74780_a("LianDan", entity.getEntityData().func_74769_h("LianDan") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("LianDan") == 9.0d && entity.getEntityData().func_74769_h("LianDanXp") >= 9999999.0d) {
            entity.getEntityData().func_74780_a("LianDanXp", entity.getEntityData().func_74769_h("LianDanXp") - 9999999.0d);
            entity.getEntityData().func_74780_a("LianDan", entity.getEntityData().func_74769_h("LianDan") + 1.0d);
        }
        if (entity.getEntityData().func_74769_h("LianQi") == 0.0d && entity.getEntityData().func_74769_h("LianQiXp") >= 36.0d) {
            entity.getEntityData().func_74780_a("LianQiXp", entity.getEntityData().func_74769_h("LianQiXp") - 36.0d);
            entity.getEntityData().func_74780_a("LianQi", entity.getEntityData().func_74769_h("LianQi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("LianQi") == 1.0d && entity.getEntityData().func_74769_h("LianQiXp") >= 180.0d) {
            entity.getEntityData().func_74780_a("LianQiXp", entity.getEntityData().func_74769_h("LianQiXp") - 180.0d);
            entity.getEntityData().func_74780_a("LianQi", entity.getEntityData().func_74769_h("LianQi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("LianQi") == 2.0d && entity.getEntityData().func_74769_h("LianQiXp") >= 900.0d) {
            entity.getEntityData().func_74780_a("LianQiXp", entity.getEntityData().func_74769_h("LianQiXp") - 900.0d);
            entity.getEntityData().func_74780_a("LianQi", entity.getEntityData().func_74769_h("LianQi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("LianQi") == 3.0d && entity.getEntityData().func_74769_h("LianQiXp") >= 4500.0d) {
            entity.getEntityData().func_74780_a("LianQiXp", entity.getEntityData().func_74769_h("LianQiXp") - 4500.0d);
            entity.getEntityData().func_74780_a("LianQi", entity.getEntityData().func_74769_h("LianQi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("LianQi") == 4.0d && entity.getEntityData().func_74769_h("LianQiXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("LianQiXp", entity.getEntityData().func_74769_h("LianQiXp") - 999999.0d);
            entity.getEntityData().func_74780_a("LianQi", entity.getEntityData().func_74769_h("LianQi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("LianQi") == 5.0d && entity.getEntityData().func_74769_h("LianQiXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("LianQiXp", 999999.0d);
        } else if (entity.getEntityData().func_74769_h("LianQi") == 6.0d && entity.getEntityData().func_74769_h("LianQiXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("LianQiXp", entity.getEntityData().func_74769_h("LianQiXp") - 999999.0d);
            entity.getEntityData().func_74780_a("LianQi", entity.getEntityData().func_74769_h("LianQi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("LianQi") == 7.0d && entity.getEntityData().func_74769_h("LianQiXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("LianQiXp", entity.getEntityData().func_74769_h("LianQiXp") - 999999.0d);
            entity.getEntityData().func_74780_a("LianQi", entity.getEntityData().func_74769_h("LianQi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("LianQi") == 8.0d && entity.getEntityData().func_74769_h("LianQiXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("LianQiXp", entity.getEntityData().func_74769_h("LianQiXp") - 999999.0d);
            entity.getEntityData().func_74780_a("LianQi", entity.getEntityData().func_74769_h("LianQi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("LianQi") == 9.0d && entity.getEntityData().func_74769_h("LianQiXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("LianQiXp", entity.getEntityData().func_74769_h("LianQiXp") - 999999.0d);
            entity.getEntityData().func_74780_a("LianQi", entity.getEntityData().func_74769_h("LianQi") + 1.0d);
        }
        if (entity.getEntityData().func_74769_h("ZhongZhi") == 0.0d && entity.getEntityData().func_74769_h("ZhongZhiXp") >= 200.0d) {
            entity.getEntityData().func_74780_a("ZhongZhiXp", entity.getEntityData().func_74769_h("ZhongZhiXp") - 200.0d);
            entity.getEntityData().func_74780_a("ZhongZhi", entity.getEntityData().func_74769_h("ZhongZhi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhongZhi") == 1.0d && entity.getEntityData().func_74769_h("ZhongZhiXp") >= 500.0d) {
            entity.getEntityData().func_74780_a("ZhongZhiXp", entity.getEntityData().func_74769_h("ZhongZhiXp") - 500.0d);
            entity.getEntityData().func_74780_a("ZhongZhi", entity.getEntityData().func_74769_h("ZhongZhi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhongZhi") == 2.0d && entity.getEntityData().func_74769_h("ZhongZhiXp") >= 1000.0d) {
            entity.getEntityData().func_74780_a("ZhongZhiXp", entity.getEntityData().func_74769_h("ZhongZhiXp") - 1000.0d);
            entity.getEntityData().func_74780_a("ZhongZhi", entity.getEntityData().func_74769_h("ZhongZhi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhongZhi") == 3.0d && entity.getEntityData().func_74769_h("ZhongZhiXp") >= 2000.0d) {
            entity.getEntityData().func_74780_a("ZhongZhiXp", entity.getEntityData().func_74769_h("ZhongZhiXp") - 2000.0d);
            entity.getEntityData().func_74780_a("ZhongZhi", entity.getEntityData().func_74769_h("ZhongZhi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhongZhi") == 4.0d && entity.getEntityData().func_74769_h("ZhongZhiXp") >= 99999.0d) {
            entity.getEntityData().func_74780_a("ZhongZhiXp", entity.getEntityData().func_74769_h("ZhongZhiXp") - 99999.0d);
            entity.getEntityData().func_74780_a("ZhongZhi", entity.getEntityData().func_74769_h("ZhongZhi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhongZhi") == 5.0d && entity.getEntityData().func_74769_h("ZhongZhiXp") >= 9999999.0d) {
            entity.getEntityData().func_74780_a("ZhongZhiXp", 9999999.0d);
        } else if (entity.getEntityData().func_74769_h("ZhongZhi") == 6.0d && entity.getEntityData().func_74769_h("ZhongZhiXp") >= 9999999.0d) {
            entity.getEntityData().func_74780_a("ZhongZhiXp", entity.getEntityData().func_74769_h("ZhongZhiXp") - 9999999.0d);
            entity.getEntityData().func_74780_a("ZhongZhi", entity.getEntityData().func_74769_h("ZhongZhi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhongZhi") == 7.0d && entity.getEntityData().func_74769_h("LianDanXp") >= 9999999.0d) {
            entity.getEntityData().func_74780_a("ZhongZhiXp", entity.getEntityData().func_74769_h("ZhongZhiXp") - 9999999.0d);
            entity.getEntityData().func_74780_a("ZhongZhi", entity.getEntityData().func_74769_h("ZhongZhi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhongZhi") == 8.0d && entity.getEntityData().func_74769_h("ZhongZhiXp") >= 9999999.0d) {
            entity.getEntityData().func_74780_a("ZhongZhiXp", entity.getEntityData().func_74769_h("ZhongZhiXp") - 9999999.0d);
            entity.getEntityData().func_74780_a("ZhongZhi", entity.getEntityData().func_74769_h("ZhongZhi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhongZhi") == 9.0d && entity.getEntityData().func_74769_h("ZhongZhiXp") >= 9999999.0d) {
            entity.getEntityData().func_74780_a("ZhongZhiXp", entity.getEntityData().func_74769_h("ZhongZhiXp") - 9999999.0d);
            entity.getEntityData().func_74780_a("ZhongZhi", entity.getEntityData().func_74769_h("ZhongZhi") + 1.0d);
        }
    }
}
