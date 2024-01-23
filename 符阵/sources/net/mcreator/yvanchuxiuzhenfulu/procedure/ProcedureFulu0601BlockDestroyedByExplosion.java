package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu0601BlockDestroyedByExplosion.class */
public class ProcedureFulu0601BlockDestroyedByExplosion extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu0601BlockDestroyedByExplosion(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 80);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (!world.field_72995_K) {
            world.func_72876_a((Entity) null, x, y, z, 8.0f, true);
        }
    }
}
