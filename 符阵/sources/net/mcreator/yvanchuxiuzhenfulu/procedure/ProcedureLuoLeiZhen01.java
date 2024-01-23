package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureLuoLeiZhen01.class */
public class ProcedureLuoLeiZhen01 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLuoLeiZhen01(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 345);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (Math.random() < 0.5d) {
            if (Math.random() < 0.5d) {
                world.func_72942_c(new EntityLightningBolt(world, x + new Random().nextInt(8), y, z + new Random().nextInt(8), true));
            } else {
                world.func_72942_c(new EntityLightningBolt(world, x + new Random().nextInt(8), y, z - new Random().nextInt(8), true));
            }
        } else if (Math.random() < 0.5d) {
            world.func_72942_c(new EntityLightningBolt(world, x - new Random().nextInt(8), y, z + new Random().nextInt(8), true));
        } else {
            world.func_72942_c(new EntityLightningBolt(world, x - new Random().nextInt(8), y, z - new Random().nextInt(8), true));
        }
    }
}
