package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureQianghua09CommandExecuted.class */
public class ProcedureQianghua09CommandExecuted extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureQianghua09CommandExecuted(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 199);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("qianghua", 9.0d);
    }
}
