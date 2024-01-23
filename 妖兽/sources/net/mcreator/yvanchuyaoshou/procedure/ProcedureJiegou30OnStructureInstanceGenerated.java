package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu05;
import net.mcreator.yvanchuyaoshou.entity.EntityYingXiao02;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureJiegou30OnStructureInstanceGenerated.class */
public class ProcedureJiegou30OnStructureInstanceGenerated extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureJiegou30OnStructureInstanceGenerated(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityMoXiu05.ENTITYID_RANGED);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        EntityYingXiao02.EntityCustom entityCustom;
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (!world.field_72995_K && (entityCustom = new EntityYingXiao02.EntityCustom(world)) != null) {
            entityCustom.func_70012_b(x, y + 5, z, world.field_73012_v.nextFloat() * 360.0f, 0.0f);
            world.func_72838_d(entityCustom);
        }
    }
}
