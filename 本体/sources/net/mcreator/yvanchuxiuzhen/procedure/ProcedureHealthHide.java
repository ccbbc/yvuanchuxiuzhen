package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureHealthHide.class */
public class ProcedureHealthHide extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHealthHide(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 588);
    }

    public static boolean executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return false;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74769_h("XiuLian") >= 1.0d) {
            return true;
        }
        return true;
    }
}
