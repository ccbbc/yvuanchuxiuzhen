package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityLeiBanLu03;
import net.mcreator.yvanchuyaoshou.entity.EntityLeiYuanJuE04;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureJiegou2801OnStructureInstanceGenerated.class */
public class ProcedureJiegou2801OnStructureInstanceGenerated extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureJiegou2801OnStructureInstanceGenerated(ElementsYvanchuyaoshouMod instance) {
        super(instance, 125);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        EntityLeiYuanJuE04.EntityCustom entityCustom;
        EntityLeiBanLu03.EntityCustom entityCustom2;
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (Math.random() < 0.7d) {
            if (!world.field_72995_K && (entityCustom2 = new EntityLeiBanLu03.EntityCustom(world)) != null) {
                entityCustom2.func_70012_b(x + 5, y + 2, z, world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                world.func_72838_d(entityCustom2);
            }
        } else if (!world.field_72995_K && (entityCustom = new EntityLeiYuanJuE04.EntityCustom(world)) != null) {
            entityCustom.func_70012_b(x + 5, y + 2, z, world.field_73012_v.nextFloat() * 360.0f, 0.0f);
            world.func_72838_d(entityCustom);
        }
    }
}
