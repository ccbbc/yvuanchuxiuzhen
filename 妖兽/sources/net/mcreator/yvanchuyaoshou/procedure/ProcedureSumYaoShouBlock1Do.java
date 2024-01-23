package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityGuLang0201;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureSumYaoShouBlock1Do.class */
public class ProcedureSumYaoShouBlock1Do extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSumYaoShouBlock1Do(ElementsYvanchuyaoshouMod instance) {
        super(instance, 283);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        EntityGuLang0201.EntityCustom entityCustom;
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (world.func_175659_aa() != EnumDifficulty.PEACEFUL) {
            for (int index0 = 0; index0 < 3; index0++) {
                if (!world.field_72995_K && (entityCustom = new EntityGuLang0201.EntityCustom(world)) != null) {
                    entityCustom.func_70012_b(x, y, z, world.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    world.func_72838_d(entityCustom);
                }
            }
            world.func_175698_g(new BlockPos(x, y, z));
        }
    }
}
