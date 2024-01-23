package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.YvanchuxiuzhenModVariables;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureTianGongSumLimit.class */
public class ProcedureTianGongSumLimit extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureTianGongSumLimit(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 372);
    }

    public static boolean executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("world") == null) {
            return false;
        }
        World world = (World) dependencies.get("world");
        if (!YvanchuxiuzhenModVariables.MapVariables.get(world).TianGongSum) {
            YvanchuxiuzhenModVariables.MapVariables.get(world).TianGongSum = true;
            YvanchuxiuzhenModVariables.MapVariables.get(world).syncData(world);
            return true;
        }
        return false;
    }
}
