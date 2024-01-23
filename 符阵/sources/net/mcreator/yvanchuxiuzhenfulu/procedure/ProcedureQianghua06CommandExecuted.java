package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureQianghua06CommandExecuted.class */
public class ProcedureQianghua06CommandExecuted extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureQianghua06CommandExecuted(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 193);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("qianghua", 6.0d);
    }
}
