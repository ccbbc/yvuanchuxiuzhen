package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.block.BlockFangkuai066;
import net.mcreator.yvanchuxiuzhen.block.BlockFangkuai069;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureFangkuai066EntityCollidesInTheBlock.class */
public class ProcedureFangkuai066EntityCollidesInTheBlock extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFangkuai066EntityCollidesInTheBlock(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 187);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockFangkuai066.block.func_176223_P().func_177230_c()) {
            entity.func_70097_a(DamageSource.field_76371_c, 10.0f);
        } else if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockFangkuai069.block.func_176223_P().func_177230_c()) {
            entity.func_70097_a(DamageSource.field_76377_j, 4.0f);
            entity.field_70159_w = 0.0d;
            entity.field_70181_x = -0.5d;
            entity.field_70179_y = 0.0d;
        }
    }
}
