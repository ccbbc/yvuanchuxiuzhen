package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureZhifu.class */
public class ProcedureZhifu extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZhifu(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 165);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("ZhiLi") == 0.0d && entity.getEntityData().func_74769_h("ZhiLiXp") >= 500.0d) {
            entity.getEntityData().func_74780_a("ZhiLiXp", entity.getEntityData().func_74769_h("ZhiLiXp") - 500.0d);
            entity.getEntityData().func_74780_a("ZhiLi", entity.getEntityData().func_74769_h("ZhiLi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhiLi") == 1.0d && entity.getEntityData().func_74769_h("ZhiLiXp") >= 1500.0d) {
            entity.getEntityData().func_74780_a("ZhiLiXp", entity.getEntityData().func_74769_h("ZhiLiXp") - 1500.0d);
            entity.getEntityData().func_74780_a("ZhiLi", entity.getEntityData().func_74769_h("ZhiLi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhiLi") == 2.0d && entity.getEntityData().func_74769_h("ZhiLiXp") >= 4500.0d) {
            entity.getEntityData().func_74780_a("ZhiLiXp", entity.getEntityData().func_74769_h("ZhiLiXp") - 4500.0d);
            entity.getEntityData().func_74780_a("ZhiLi", entity.getEntityData().func_74769_h("ZhiLi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhiLi") == 3.0d && entity.getEntityData().func_74769_h("ZhiLiXp") >= 13500.0d) {
            entity.getEntityData().func_74780_a("ZhiLiXp", entity.getEntityData().func_74769_h("ZhiLiXp") - 13500.0d);
            entity.getEntityData().func_74780_a("ZhiLi", entity.getEntityData().func_74769_h("ZhiLi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhiLi") == 4.0d && entity.getEntityData().func_74769_h("ZhiLiXp") >= 1919810.0d) {
            entity.getEntityData().func_74780_a("ZhiLiXp", entity.getEntityData().func_74769_h("ZhiLiXp") - 1919810.0d);
            entity.getEntityData().func_74780_a("ZhiLi", entity.getEntityData().func_74769_h("ZhiLi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhiLi") == 5.0d && entity.getEntityData().func_74769_h("ZhiLiXp") >= 1919810.0d) {
            entity.getEntityData().func_74780_a("ZhiLiXp", entity.getEntityData().func_74769_h("ZhiLiXp") - 1919810.0d);
            entity.getEntityData().func_74780_a("ZhiLi", entity.getEntityData().func_74769_h("ZhiLi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhiLi") == 6.0d && entity.getEntityData().func_74769_h("ZhiLiXp") >= 1919810.0d) {
            entity.getEntityData().func_74780_a("ZhiLiXp", entity.getEntityData().func_74769_h("ZhiLiXp") - 1919810.0d);
            entity.getEntityData().func_74780_a("ZhiLi", entity.getEntityData().func_74769_h("ZhiLi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhiLi") == 7.0d && entity.getEntityData().func_74769_h("ZhiLiXp") >= 1919810.0d) {
            entity.getEntityData().func_74780_a("ZhiLiXp", entity.getEntityData().func_74769_h("ZhiLiXp") - 1919810.0d);
            entity.getEntityData().func_74780_a("ZhiLi", entity.getEntityData().func_74769_h("ZhiLi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhiLi") == 8.0d && entity.getEntityData().func_74769_h("ZhiLiXp") >= 1919810.0d) {
            entity.getEntityData().func_74780_a("ZhiLiXp", entity.getEntityData().func_74769_h("ZhiLiXp") - 1919810.0d);
            entity.getEntityData().func_74780_a("ZhiLi", entity.getEntityData().func_74769_h("ZhiLi") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhiLi") == 9.0d && entity.getEntityData().func_74769_h("ZhiLiXp") >= 1919810.0d) {
            entity.getEntityData().func_74780_a("ZhiLiXp", entity.getEntityData().func_74769_h("ZhiLiXp") - 1919810.0d);
            entity.getEntityData().func_74780_a("ZhiLi", entity.getEntityData().func_74769_h("ZhiLi") + 1.0d);
        }
        if (entity.getEntityData().func_74769_h("FuLu") == 0.0d && entity.getEntityData().func_74769_h("FuLuXp") >= 36.0d) {
            entity.getEntityData().func_74780_a("FuLuXp", entity.getEntityData().func_74769_h("FuLuXp") - 36.0d);
            entity.getEntityData().func_74780_a("FuLu", entity.getEntityData().func_74769_h("FuLu") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("FuLu") == 1.0d && entity.getEntityData().func_74769_h("FuLuXp") >= 180.0d) {
            entity.getEntityData().func_74780_a("FuLuXp", entity.getEntityData().func_74769_h("FuLuXp") - 180.0d);
            entity.getEntityData().func_74780_a("FuLu", entity.getEntityData().func_74769_h("FuLu") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("FuLu") == 2.0d && entity.getEntityData().func_74769_h("FuLuXp") >= 900.0d) {
            entity.getEntityData().func_74780_a("FuLuXp", entity.getEntityData().func_74769_h("FuLuXp") - 900.0d);
            entity.getEntityData().func_74780_a("FuLu", entity.getEntityData().func_74769_h("FuLu") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("FuLu") == 3.0d && entity.getEntityData().func_74769_h("FuLuXp") >= 4500.0d) {
            entity.getEntityData().func_74780_a("FuLuXp", entity.getEntityData().func_74769_h("FuLuXp") - 4500.0d);
            entity.getEntityData().func_74780_a("FuLu", entity.getEntityData().func_74769_h("FuLu") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("FuLu") == 4.0d && entity.getEntityData().func_74769_h("FuLuXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("FuLuXp", entity.getEntityData().func_74769_h("FuLuXp") - 999999.0d);
            entity.getEntityData().func_74780_a("FuLu", entity.getEntityData().func_74769_h("FuLu") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("FuLu") == 5.0d && entity.getEntityData().func_74769_h("FuLuXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("FuLuXp", entity.getEntityData().func_74769_h("FuLuXp") - 999999.0d);
            entity.getEntityData().func_74780_a("FuLu", entity.getEntityData().func_74769_h("FuLu") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("FuLu") == 6.0d && entity.getEntityData().func_74769_h("FuLuXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("FuLuXp", entity.getEntityData().func_74769_h("FuLuXp") - 999999.0d);
            entity.getEntityData().func_74780_a("FuLu", entity.getEntityData().func_74769_h("FuLu") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("FuLu") == 7.0d && entity.getEntityData().func_74769_h("FuLuXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("FuLuXp", entity.getEntityData().func_74769_h("FuLuXp") - 999999.0d);
            entity.getEntityData().func_74780_a("FuLu", entity.getEntityData().func_74769_h("FuLu") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("FuLu") == 8.0d && entity.getEntityData().func_74769_h("FuLuXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("FuLuXp", entity.getEntityData().func_74769_h("FuLuXp") - 999999.0d);
            entity.getEntityData().func_74780_a("FuLu", entity.getEntityData().func_74769_h("FuLu") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("FuLu") == 9.0d && entity.getEntityData().func_74769_h("FuLuXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("FuLuXp", entity.getEntityData().func_74769_h("FuLuXp") - 999999.0d);
            entity.getEntityData().func_74780_a("FuLu", entity.getEntityData().func_74769_h("FuLu") + 1.0d);
        }
        if (entity.getEntityData().func_74769_h("ZhenFa") == 0.0d && entity.getEntityData().func_74769_h("ZhenFaXp") >= 36.0d) {
            entity.getEntityData().func_74780_a("ZhenFaXp", entity.getEntityData().func_74769_h("ZhenFaXp") - 36.0d);
            entity.getEntityData().func_74780_a("ZhenFa", entity.getEntityData().func_74769_h("ZhenFa") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhenFa") == 1.0d && entity.getEntityData().func_74769_h("ZhenFaXp") >= 180.0d) {
            entity.getEntityData().func_74780_a("ZhenFaXp", entity.getEntityData().func_74769_h("ZhenFaXp") - 180.0d);
            entity.getEntityData().func_74780_a("ZhenFa", entity.getEntityData().func_74769_h("ZhenFa") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhenFa") == 2.0d && entity.getEntityData().func_74769_h("ZhenFaXp") >= 900.0d) {
            entity.getEntityData().func_74780_a("ZhenFaXp", entity.getEntityData().func_74769_h("ZhenFaXp") - 900.0d);
            entity.getEntityData().func_74780_a("ZhenFa", entity.getEntityData().func_74769_h("ZhenFa") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhenFa") == 3.0d && entity.getEntityData().func_74769_h("ZhenFaXp") >= 4500.0d) {
            entity.getEntityData().func_74780_a("ZhenFaXp", entity.getEntityData().func_74769_h("ZhenFaXp") - 4500.0d);
            entity.getEntityData().func_74780_a("ZhenFa", entity.getEntityData().func_74769_h("ZhenFa") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhenFa") == 4.0d && entity.getEntityData().func_74769_h("ZhenFaXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("ZhenFaXp", entity.getEntityData().func_74769_h("ZhenFaXp") - 999999.0d);
            entity.getEntityData().func_74780_a("ZhenFa", entity.getEntityData().func_74769_h("ZhenFa") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhenFa") == 5.0d && entity.getEntityData().func_74769_h("ZhenFaXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("ZhenFaXp", entity.getEntityData().func_74769_h("ZhenFaXp") - 999999.0d);
            entity.getEntityData().func_74780_a("ZhenFa", entity.getEntityData().func_74769_h("ZhenFa") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhenFa") == 6.0d && entity.getEntityData().func_74769_h("ZhenFaXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("ZhenFaXp", entity.getEntityData().func_74769_h("ZhenFaXp") - 999999.0d);
            entity.getEntityData().func_74780_a("ZhenFa", entity.getEntityData().func_74769_h("ZhenFa") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhenFa") == 7.0d && entity.getEntityData().func_74769_h("ZhenFaXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("ZhenFaXp", entity.getEntityData().func_74769_h("ZhenFaXp") - 999999.0d);
            entity.getEntityData().func_74780_a("ZhenFa", entity.getEntityData().func_74769_h("ZhenFa") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhenFa") == 8.0d && entity.getEntityData().func_74769_h("ZhenFaXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("ZhenFaXp", entity.getEntityData().func_74769_h("ZhenFaXp") - 999999.0d);
            entity.getEntityData().func_74780_a("ZhenFa", entity.getEntityData().func_74769_h("ZhenFa") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ZhenFa") == 9.0d && entity.getEntityData().func_74769_h("ZhenFaXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("ZhenFaXp", entity.getEntityData().func_74769_h("ZhenFaXp") - 999999.0d);
            entity.getEntityData().func_74780_a("ZhenFa", entity.getEntityData().func_74769_h("ZhenFa") + 1.0d);
        }
        if (entity.getEntityData().func_74769_h("SouXun") == 0.0d && entity.getEntityData().func_74769_h("SouXunXp") >= 500.0d) {
            entity.getEntityData().func_74780_a("SouXunXp", entity.getEntityData().func_74769_h("SouXunXp") - 500.0d);
            entity.getEntityData().func_74780_a("SouXun", entity.getEntityData().func_74769_h("SouXun") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("SouXun") == 1.0d && entity.getEntityData().func_74769_h("SouXunXp") >= 1500.0d) {
            entity.getEntityData().func_74780_a("SouXunXp", entity.getEntityData().func_74769_h("SouXunXp") - 1500.0d);
            entity.getEntityData().func_74780_a("SouXun", entity.getEntityData().func_74769_h("SouXun") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("SouXun") == 2.0d && entity.getEntityData().func_74769_h("SouXunXp") >= 4500.0d) {
            entity.getEntityData().func_74780_a("SouXunXp", entity.getEntityData().func_74769_h("SouXunXp") - 4500.0d);
            entity.getEntityData().func_74780_a("SouXun", entity.getEntityData().func_74769_h("SouXun") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("SouXun") == 3.0d && entity.getEntityData().func_74769_h("SouXunXp") >= 13500.0d) {
            entity.getEntityData().func_74780_a("SouXunXp", entity.getEntityData().func_74769_h("SouXunXp") - 13500.0d);
            entity.getEntityData().func_74780_a("SouXun", entity.getEntityData().func_74769_h("SouXun") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("SouXun") == 4.0d && entity.getEntityData().func_74769_h("SouXunXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("SouXunXp", entity.getEntityData().func_74769_h("SouXunXp") - 999999.0d);
            entity.getEntityData().func_74780_a("SouXun", entity.getEntityData().func_74769_h("SouXun") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("SouXun") == 5.0d && entity.getEntityData().func_74769_h("SouXunXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("SouXunXp", entity.getEntityData().func_74769_h("SouXunXp") - 999999.0d);
            entity.getEntityData().func_74780_a("SouXun", entity.getEntityData().func_74769_h("SouXun") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ShouXun") == 6.0d && entity.getEntityData().func_74769_h("ShouXunXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("ShouXunXp", entity.getEntityData().func_74769_h("ShouXunXp") - 999999.0d);
            entity.getEntityData().func_74780_a("ShouXun", entity.getEntityData().func_74769_h("ShouXun") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ShouXun") == 7.0d && entity.getEntityData().func_74769_h("ShouXunXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("ShouXunXp", entity.getEntityData().func_74769_h("ShouXunXp") - 999999.0d);
            entity.getEntityData().func_74780_a("ShouXun", entity.getEntityData().func_74769_h("ShouXun") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ShouXun") == 8.0d && entity.getEntityData().func_74769_h("ShouXunXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("ShouXunXp", entity.getEntityData().func_74769_h("ShouXunXp") - 999999.0d);
            entity.getEntityData().func_74780_a("ShouXun", entity.getEntityData().func_74769_h("ShouXun") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("ShouXun") == 9.0d && entity.getEntityData().func_74769_h("ShouXunXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("ShouXunXp", entity.getEntityData().func_74769_h("ShouXunXp") - 999999.0d);
            entity.getEntityData().func_74780_a("ShouXun", entity.getEntityData().func_74769_h("ShouXun") + 1.0d);
        }
        if (entity.getEntityData().func_74769_h("XingShang") == 0.0d && entity.getEntityData().func_74769_h("XingShangXp") >= 999.0d) {
            entity.getEntityData().func_74780_a("XingShangXp", entity.getEntityData().func_74769_h("XingShangXp") - 999.0d);
            entity.getEntityData().func_74780_a("XingShang", entity.getEntityData().func_74769_h("XingShang") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("XingShang") == 1.0d && entity.getEntityData().func_74769_h("XingShangXp") >= 3999.0d) {
            entity.getEntityData().func_74780_a("XingShangXp", entity.getEntityData().func_74769_h("XingShangXp") - 3999.0d);
            entity.getEntityData().func_74780_a("XingShang", entity.getEntityData().func_74769_h("XingShang") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("XingShang") == 2.0d && entity.getEntityData().func_74769_h("XingShangXp") >= 39999.0d) {
            entity.getEntityData().func_74780_a("XingShangXp", entity.getEntityData().func_74769_h("XingShangXp") - 39999.0d);
            entity.getEntityData().func_74780_a("XingShang", entity.getEntityData().func_74769_h("XingShang") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("XingShang") == 3.0d && entity.getEntityData().func_74769_h("XingShangXp") >= 1999999.0d) {
            entity.getEntityData().func_74780_a("XingShangXp", entity.getEntityData().func_74769_h("XingShangXp") - 1999999.0d);
            entity.getEntityData().func_74780_a("XingShang", entity.getEntityData().func_74769_h("XingShang") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("XingShang") == 4.0d && entity.getEntityData().func_74769_h("XingShangXp") >= 1.1451452E8d) {
            entity.getEntityData().func_74780_a("XingShangXp", entity.getEntityData().func_74769_h("XingShangXp") - 1.1451452E8d);
            entity.getEntityData().func_74780_a("XingShang", entity.getEntityData().func_74769_h("XingShang") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("XingShang") == 5.0d && entity.getEntityData().func_74769_h("XingShangXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("XingShangXp", entity.getEntityData().func_74769_h("XingShangXp") - 999999.0d);
            entity.getEntityData().func_74780_a("XingShang", entity.getEntityData().func_74769_h("XingShang") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("XingShang") == 6.0d && entity.getEntityData().func_74769_h("XingShangXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("XingShangXp", entity.getEntityData().func_74769_h("XingShangXp") - 999999.0d);
            entity.getEntityData().func_74780_a("XingShang", entity.getEntityData().func_74769_h("XingShang") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("XingShang") == 7.0d && entity.getEntityData().func_74769_h("XingShangXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("XingShangXp", entity.getEntityData().func_74769_h("XingShangXp") - 999999.0d);
            entity.getEntityData().func_74780_a("XingShang", entity.getEntityData().func_74769_h("XingShang") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("XingShang") == 8.0d && entity.getEntityData().func_74769_h("XingShangXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("XingShangXp", entity.getEntityData().func_74769_h("XingShangXp") - 999999.0d);
            entity.getEntityData().func_74780_a("XingShang", entity.getEntityData().func_74769_h("XingShang") + 1.0d);
        } else if (entity.getEntityData().func_74769_h("XingShang") == 9.0d && entity.getEntityData().func_74769_h("XingShangXp") >= 999999.0d) {
            entity.getEntityData().func_74780_a("XingShangXp", entity.getEntityData().func_74769_h("XingShangXp") - 999999.0d);
            entity.getEntityData().func_74780_a("XingShang", entity.getEntityData().func_74769_h("XingShang") + 1.0d);
        }
    }
}
