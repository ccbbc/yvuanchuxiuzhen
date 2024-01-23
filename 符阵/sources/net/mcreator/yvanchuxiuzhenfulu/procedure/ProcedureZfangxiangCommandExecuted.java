package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZfangxiangCommandExecuted.class */
public class ProcedureZfangxiangCommandExecuted extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZfangxiangCommandExecuted(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 142);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity instanceof EntityMob) {
            if (Math.random() < 0.25d) {
                entity.field_70159_w = 1.0d;
                entity.field_70181_x = 0.0d;
                entity.field_70179_y = 0.0d;
            } else if (Math.random() < 0.333d) {
                entity.field_70159_w = -1.0d;
                entity.field_70181_x = 0.0d;
                entity.field_70179_y = 0.0d;
            } else if (Math.random() < 0.5d) {
                entity.field_70159_w = 0.0d;
                entity.field_70181_x = 0.0d;
                entity.field_70179_y = 1.0d;
            } else {
                entity.field_70159_w = 0.0d;
                entity.field_70181_x = 0.0d;
                entity.field_70179_y = -1.0d;
            }
        }
    }
}
