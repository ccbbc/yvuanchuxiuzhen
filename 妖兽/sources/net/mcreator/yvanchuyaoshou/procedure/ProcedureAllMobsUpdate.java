package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureAllMobsUpdate.class */
public class ProcedureAllMobsUpdate extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureAllMobsUpdate(ElementsYvanchuyaoshouMod instance) {
        super(instance, 351);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        World world = (World) dependencies.get("world");
        if (world.func_72820_D() % 4 == 0) {
            if (!entity.func_70089_S()) {
                entity.field_70170_p.func_72900_e(entity);
            }
            entity.func_184210_p();
        }
    }
}
