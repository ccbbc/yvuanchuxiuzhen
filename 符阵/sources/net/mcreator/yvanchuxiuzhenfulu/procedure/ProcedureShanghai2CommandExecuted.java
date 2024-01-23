package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureShanghai2CommandExecuted.class */
public class ProcedureShanghai2CommandExecuted extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureShanghai2CommandExecuted(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 126);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.func_70097_a(DamageSource.field_82729_p, 40.0f);
    }
}
