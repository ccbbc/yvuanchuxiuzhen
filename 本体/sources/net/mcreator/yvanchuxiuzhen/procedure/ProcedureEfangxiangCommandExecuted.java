package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureEfangxiangCommandExecuted.class */
public class ProcedureEfangxiangCommandExecuted extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureEfangxiangCommandExecuted(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 156);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity instanceof EntityMob) {
            entity.field_70159_w = 1.0d;
            entity.field_70181_x = 0.5d;
            entity.field_70179_y = 0.0d;
        }
    }
}
