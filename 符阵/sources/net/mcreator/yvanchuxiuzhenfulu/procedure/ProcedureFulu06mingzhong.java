package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu06mingzhong.class */
public class ProcedureFulu06mingzhong extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu06mingzhong(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 265);
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
            world.func_72876_a((Entity) null, x, y, z, 3.0f, true);
        }
        if (Math.random() < 0.5d) {
            if (!world.field_72995_K) {
                world.func_72876_a((Entity) null, x + 5, y, z, 4.0f, true);
            }
            if (!world.field_72995_K) {
                world.func_72876_a((Entity) null, x - 5, y, z, 4.0f, true);
            }
        }
        if (Math.random() < 0.5d) {
            if (!world.field_72995_K) {
                world.func_72876_a((Entity) null, x, y, z + 5, 4.0f, true);
            }
            if (!world.field_72995_K) {
                world.func_72876_a((Entity) null, x, y, z - 5, 4.0f, true);
            }
        }
    }
}
