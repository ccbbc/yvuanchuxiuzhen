package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityJunEYi02;
import net.mcreator.yvanchuyaoshou.entity.EntityJunEYi03;
import net.mcreator.yvanchuyaoshou.entity.EntityJunEYi04;
import net.mcreator.yvanchuyaoshou.entity.EntityJunEYi05;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureFangxiangdownCommandExecuted.class */
public class ProcedureFangxiangdownCommandExecuted extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFangxiangdownCommandExecuted(ElementsYvanchuyaoshouMod instance) {
        super(instance, 106);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        if (!entity.getEntityData().func_74767_n("mianyifangxiangdown") && !(entity instanceof EntityJunEYi02.EntityCustom) && !(entity instanceof EntityJunEYi03.EntityCustom) && !(entity instanceof EntityJunEYi04.EntityCustom) && !(entity instanceof EntityJunEYi05.EntityCustom)) {
            entity.func_70634_a(x, y - 1, z);
        } else if (entity.getEntityData().func_74767_n("mianyifangxiangdown")) {
            entity.getEntityData().func_74757_a("mianyifangxiangdown", false);
        }
    }
}
