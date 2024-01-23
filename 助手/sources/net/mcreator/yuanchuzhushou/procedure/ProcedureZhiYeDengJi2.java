package net.mcreator.yuanchuzhushou.procedure;

import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/procedure/ProcedureZhiYeDengJi2.class */
public class ProcedureZhiYeDengJi2 extends ElementsYuanchuzhushouMod.ModElement {
    public ProcedureZhiYeDengJi2(ElementsYuanchuzhushouMod instance) {
        super(instance, 81);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("itemstack") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
        entity.getEntityData().func_74780_a("LianQi", entity.getEntityData().func_74769_h("LianQi") + 1.0d);
        entity.getEntityData().func_74780_a("LianDan", entity.getEntityData().func_74769_h("LianDan") + 1.0d);
        entity.getEntityData().func_74780_a("FuLu", entity.getEntityData().func_74769_h("FuLu") + 1.0d);
        entity.getEntityData().func_74780_a("ZhenFa", entity.getEntityData().func_74769_h("ZhenFa") + 1.0d);
        entity.getEntityData().func_74780_a("ZhiLi", entity.getEntityData().func_74769_h("ZhiLi") + 1.0d);
        entity.getEntityData().func_74780_a("SouXun", entity.getEntityData().func_74769_h("SouXun") + 1.0d);
        entity.getEntityData().func_74780_a("ZhongZhi", entity.getEntityData().func_74769_h("ZhongZhi") + 1.0d);
        entity.getEntityData().func_74780_a("NiangJiu", entity.getEntityData().func_74769_h("NiangJiu") + 1.0d);
        entity.getEntityData().func_74780_a("CaiShi", entity.getEntityData().func_74769_h("CaiShi") + 1.0d);
        entity.getEntityData().func_74780_a("XingShang", entity.getEntityData().func_74769_h("XingShang") + 1.0d);
        itemstack.func_190918_g(1);
    }
}
