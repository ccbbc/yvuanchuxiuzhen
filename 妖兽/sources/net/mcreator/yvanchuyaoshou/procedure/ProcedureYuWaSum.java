package net.mcreator.yvanchuyaoshou.procedure;

import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureYuWaSum.class */
public class ProcedureYuWaSum extends ElementsYvanchuyaoshouMod.ModElement {
    public ProcedureYuWaSum(ElementsYvanchuyaoshouMod instance) {
        super(instance, 281);
    }

    public static boolean executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("world") == null) {
            return false;
        }
        World world = (World) dependencies.get("world");
        if (world.func_72896_J()) {
            return true;
        }
        return false;
    }
}
