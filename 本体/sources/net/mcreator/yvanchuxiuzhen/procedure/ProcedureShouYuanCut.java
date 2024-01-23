package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureShouYuanCut.class */
public class ProcedureShouYuanCut extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShouYuanCut(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 299);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("JingJieNum") == 1.0d) {
            entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 3.0d);
            entity.getEntityData().func_74780_a("DaoLing", entity.getEntityData().func_74769_h("DaoLing") + 3.0d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 2.0d) {
            entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 4.0d);
            entity.getEntityData().func_74780_a("DaoLing", entity.getEntityData().func_74769_h("DaoLing") + 4.0d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 3.0d) {
            entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 6.0d);
            entity.getEntityData().func_74780_a("DaoLing", entity.getEntityData().func_74769_h("DaoLing") + 6.0d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 4.0d) {
            entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 8.0d);
            entity.getEntityData().func_74780_a("DaoLing", entity.getEntityData().func_74769_h("DaoLing") + 8.0d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 5.0d) {
            entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 16.0d);
            entity.getEntityData().func_74780_a("DaoLing", entity.getEntityData().func_74769_h("DaoLing") + 16.0d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 6.0d) {
            entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 32.0d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 7.0d) {
            entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 64.0d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 8.0d) {
            entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 128.0d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 9.0d) {
            entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 256.0d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 10.0d) {
            entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 512.0d);
        } else if (entity.getEntityData().func_74769_h("JingJieNum") == 11.0d) {
            entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 1024.0d);
        } else {
            entity.getEntityData().func_74780_a("ShouYuan", entity.getEntityData().func_74769_h("ShouYuan") - 2.0d);
            entity.getEntityData().func_74780_a("DaoLing", entity.getEntityData().func_74769_h("DaoLing") + 2.0d);
        }
    }
}
