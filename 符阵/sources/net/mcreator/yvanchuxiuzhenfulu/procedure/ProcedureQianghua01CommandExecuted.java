package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureQianghua01CommandExecuted.class */
public class ProcedureQianghua01CommandExecuted extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureQianghua01CommandExecuted(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 183);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("qianghua", 1.0d);
    }
}
