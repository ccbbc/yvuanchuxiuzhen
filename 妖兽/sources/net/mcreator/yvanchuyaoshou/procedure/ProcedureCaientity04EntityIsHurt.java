package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureCaientity04EntityIsHurt.class */
public class ProcedureCaientity04EntityIsHurt extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCaientity04EntityIsHurt(ElementsYvanchuyaoshouMod instance) {
        super(instance, 104);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        $_dependencies.put("entity", entity);
        ProcedureShouJiNbt.executeProcedure($_dependencies);
    }
}
