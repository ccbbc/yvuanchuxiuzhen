package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.block.BlockDaMuZhuo;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureGongFaAddUpdate.class */
public class ProcedureGongFaAddUpdate extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFaAddUpdate(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 488);
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
        if (world.func_180495_p(new BlockPos(x, y - 1, z)).func_177230_c() == BlockDaMuZhuo.block.func_176223_P().func_177230_c() && entity.getEntityData().func_74769_h(entity.getEntityData().func_74779_i("功法熟练度")) >= entity.getEntityData().func_74769_h("单层进度最大值") * (0.95d - entity.getEntityData().func_74769_h("功法修炼加成增加"))) {
            entity.getEntityData().func_74780_a(entity.getEntityData().func_74779_i("功法熟练度"), entity.getEntityData().func_74769_h("单层进度最大值"));
        }
    }
}
