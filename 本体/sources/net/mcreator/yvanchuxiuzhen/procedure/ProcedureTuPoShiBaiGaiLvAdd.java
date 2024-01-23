package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureTuPoShiBaiGaiLvAdd.class */
public class ProcedureTuPoShiBaiGaiLvAdd extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureTuPoShiBaiGaiLvAdd(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 336);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("JingJieNum") == 1.0d) {
            entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 1.0d);
            entity.getEntityData().func_74780_a("DaoLing", entity.getEntityData().func_74769_h("DaoLing") + 1.0d);
            entity.getEntityData().func_74780_a("NiangJiu30", entity.getEntityData().func_74769_h("NiangJiu30") * 0.7d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 2.0d) {
            entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 2.0d);
            entity.getEntityData().func_74780_a("DaoLing", entity.getEntityData().func_74769_h("DaoLing") + 2.0d);
            entity.getEntityData().func_74780_a("NiangJiu30", entity.getEntityData().func_74769_h("NiangJiu30") * 0.7d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 3.0d) {
            entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 3.0d);
            entity.getEntityData().func_74780_a("DaoLing", entity.getEntityData().func_74769_h("DaoLing") + 3.0d);
            entity.getEntityData().func_74780_a("NiangJiu30", entity.getEntityData().func_74769_h("NiangJiu30") * 0.7d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 4.0d) {
            entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 4.0d);
            entity.getEntityData().func_74780_a("DaoLing", entity.getEntityData().func_74769_h("DaoLing") + 4.0d);
            entity.getEntityData().func_74780_a("NiangJiu30", entity.getEntityData().func_74769_h("NiangJiu30") * 0.7d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 5.0d) {
            entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 5.0d);
            entity.getEntityData().func_74780_a("DaoLing", entity.getEntityData().func_74769_h("DaoLing") + 5.0d);
            entity.getEntityData().func_74780_a("NiangJiu30", entity.getEntityData().func_74769_h("NiangJiu30") * 0.7d);
        }
    }
}
