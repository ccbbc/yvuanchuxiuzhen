package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao31KeYiShiYongYuanChengWuPinDeTiaoJian.class */
public class ProcedureFabao31KeYiShiYongYuanChengWuPinDeTiaoJian extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao31KeYiShiYongYuanChengWuPinDeTiaoJian(ElementsFabaokuozhanMod instance) {
        super(instance, 287);
    }

    public static boolean executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return false;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("power") > 44.0d) {
            return true;
        }
        return false;
    }
}
