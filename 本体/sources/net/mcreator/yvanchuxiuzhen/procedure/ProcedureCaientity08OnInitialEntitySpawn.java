package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.entity.EntityYouhun;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureCaientity08OnInitialEntitySpawn.class */
public class ProcedureCaientity08OnInitialEntitySpawn extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCaientity08OnInitialEntitySpawn(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 202);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity instanceof EntityYouhun.EntityCustom) {
            entity.getEntityData().func_74780_a("defense", 2.0d);
            entity.getEntityData().func_74780_a("yaoshouLEVEL", 3.0d);
            entity.getEntityData().func_74780_a("jingjie", 12.0d);
        }
    }
}
