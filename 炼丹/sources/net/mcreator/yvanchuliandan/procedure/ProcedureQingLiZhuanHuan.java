package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.block.BlockQingLiShuYe2;
import net.mcreator.yvanchuliandan.block.BlockQingLiShuYe3;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureQingLiZhuanHuan.class */
public class ProcedureQingLiZhuanHuan extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureQingLiZhuanHuan(ElementsYvanchuliandanMod instance) {
        super(instance, 721);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (Math.random() <= 0.15d) {
            world.func_180501_a(new BlockPos(x, y, z), BlockQingLiShuYe2.block.func_176223_P(), 3);
        } else {
            world.func_180501_a(new BlockPos(x, y, z), BlockQingLiShuYe3.block.func_176223_P(), 3);
        }
    }
}
