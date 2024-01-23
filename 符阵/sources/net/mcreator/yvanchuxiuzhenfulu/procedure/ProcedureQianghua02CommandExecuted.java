package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureQianghua02CommandExecuted.class */
public class ProcedureQianghua02CommandExecuted extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureQianghua02CommandExecuted(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 185);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("qianghua", 2.0d);
    }
}
