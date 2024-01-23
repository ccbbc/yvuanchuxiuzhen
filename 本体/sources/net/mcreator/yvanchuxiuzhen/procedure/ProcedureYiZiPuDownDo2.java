package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.entity.EntityYiZiMobs;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureYiZiPuDownDo2.class */
public class ProcedureYiZiPuDownDo2 extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureYiZiPuDownDo2(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 463);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        EntityYiZiMobs.EntityCustom entityCustom;
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (!world.field_72995_K && (entityCustom = new EntityYiZiMobs.EntityCustom(world)) != null) {
            entityCustom.func_70012_b(x + 0.5d, y + 0.5d, z + 0.5d, world.field_73012_v.nextFloat() * 360.0f, 0.0f);
            world.func_72838_d(entityCustom);
        }
    }
}
