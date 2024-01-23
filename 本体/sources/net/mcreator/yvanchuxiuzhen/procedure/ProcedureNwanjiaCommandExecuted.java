package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureNwanjiaCommandExecuted.class */
public class ProcedureNwanjiaCommandExecuted extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureNwanjiaCommandExecuted(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 207);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (Math.random() < 0.14d) {
            entity.field_70159_w = 1.5d;
            entity.field_70181_x = 0.0d;
            entity.field_70179_y = -1.5d;
        } else if (Math.random() < 0.16d) {
            entity.field_70159_w = -1.5d;
            entity.field_70181_x = 0.0d;
            entity.field_70179_y = -1.5d;
        } else if (Math.random() < 0.18d) {
            entity.field_70159_w = -1.5d;
            entity.field_70181_x = 0.0d;
            entity.field_70179_y = 1.5d;
        } else if (Math.random() < 0.2d) {
            entity.field_70159_w = 1.5d;
            entity.field_70181_x = 0.0d;
            entity.field_70179_y = 1.5d;
        } else if (Math.random() < 0.25d) {
            entity.field_70159_w = 0.0d;
            entity.field_70181_x = 0.0d;
            entity.field_70179_y = -2.0d;
        } else if (Math.random() < 0.333d) {
            entity.field_70159_w = 0.0d;
            entity.field_70181_x = 0.0d;
            entity.field_70179_y = 2.0d;
        } else if (Math.random() < 0.5d) {
            entity.field_70159_w = 2.0d;
            entity.field_70181_x = 0.0d;
            entity.field_70179_y = 0.0d;
        } else {
            entity.field_70159_w = -2.0d;
            entity.field_70181_x = 0.0d;
            entity.field_70179_y = 0.0d;
        }
    }
}
