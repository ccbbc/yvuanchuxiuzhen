package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.block.BlockFangkuai106;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu02;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureFangkuai106NeighbourBlockChanges.class */
public class ProcedureFangkuai106NeighbourBlockChanges extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFangkuai106NeighbourBlockChanges(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntitySanXiu02.ENTITYID);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (world.func_180495_p(new BlockPos(x, y - 1, z)).func_177230_c() == Blocks.field_150350_a.func_176223_P().func_177230_c()) {
            world.func_180501_a(new BlockPos(x, y - 1, z), BlockFangkuai106.block.func_176223_P(), 3);
        }
    }
}
