package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureZhiYeXpAdd.class */
public class ProcedureZhiYeXpAdd extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZhiYeXpAdd(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 567);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.func_70089_S()) {
            if (entity.getEntityData().func_74769_h("LianDanXp") < 0.0d) {
                entity.getEntityData().func_74780_a("LianDanXp", 0.0d);
            }
            if (entity.getEntityData().func_74769_h("LianQiXp") < 0.0d) {
                entity.getEntityData().func_74780_a("LianQiXp", 0.0d);
            }
            if (entity.getEntityData().func_74769_h("ZhongZhiXp") < 0.0d) {
                entity.getEntityData().func_74780_a("ZhongZhiXp", 0.0d);
            }
            if (entity.getEntityData().func_74769_h("ZhiLiXp") < 0.0d) {
                entity.getEntityData().func_74780_a("ZhiLiXp", 0.0d);
            }
            if (entity.getEntityData().func_74769_h("FuLuXp") < 0.0d) {
                entity.getEntityData().func_74780_a("FuLuXp", 0.0d);
            }
            if (entity.getEntityData().func_74769_h("ZhenFaXp") < 0.0d) {
                entity.getEntityData().func_74780_a("ZhenFaXp", 0.0d);
            }
            if (entity.getEntityData().func_74769_h("SouXunXp") < 0.0d) {
                entity.getEntityData().func_74780_a("SouXunXp", 0.0d);
            }
            if (entity.getEntityData().func_74769_h("XingShangXp") < 0.0d) {
                entity.getEntityData().func_74780_a("XingShangXp", 0.0d);
            }
            if (entity.getEntityData().func_74769_h("CaiShiXp") < 0.0d) {
                entity.getEntityData().func_74780_a("CaiShiXp", 0.0d);
            }
            if (entity.getEntityData().func_74769_h("NiangJiuXp") < 0.0d) {
                entity.getEntityData().func_74780_a("NiangJiuXp", 0.0d);
            }
        }
    }
}
