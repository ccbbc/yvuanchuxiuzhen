package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu02;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureFangkuai107UpdateTick.class */
public class ProcedureFangkuai107UpdateTick extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFangkuai107UpdateTick(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntitySanXiu02.ENTITYID_RANGED);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (Math.random() < 0.25d) {
            world.func_72942_c(new EntityLightningBolt(world, (int) (x + (Math.random() * 10.0d)), y, (int) (z + (Math.random() * 10.0d)), true));
        } else if (Math.random() < 0.333d) {
            world.func_72942_c(new EntityLightningBolt(world, (int) (x + (Math.random() * 10.0d)), y, (int) (z - (Math.random() * 10.0d)), true));
        } else if (Math.random() < 0.5d) {
            world.func_72942_c(new EntityLightningBolt(world, (int) (x - (Math.random() * 10.0d)), y, (int) (z - (Math.random() * 10.0d)), true));
        } else {
            world.func_72942_c(new EntityLightningBolt(world, (int) (x - (Math.random() * 10.0d)), y, (int) (z + (Math.random() * 10.0d)), true));
        }
    }
}
