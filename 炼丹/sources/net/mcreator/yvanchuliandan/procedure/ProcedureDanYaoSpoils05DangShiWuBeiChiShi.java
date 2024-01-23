package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanYaoSpoils05DangShiWuBeiChiShi.class */
public class ProcedureDanYaoSpoils05DangShiWuBeiChiShi extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanYaoSpoils05DangShiWuBeiChiShi(ElementsYvanchuliandanMod instance) {
        super(instance, 477);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("Base", entity.getEntityData().func_74769_h("Base") + 36.0d);
        entity.getEntityData().func_74780_a("Power", entity.getEntityData().func_74769_h("Power") + 88.0d);
    }
}
