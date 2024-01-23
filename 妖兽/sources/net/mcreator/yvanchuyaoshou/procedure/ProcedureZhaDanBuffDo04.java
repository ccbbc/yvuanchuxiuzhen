package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityYingXiao02;
import net.mcreator.yvanchuyaoshou.entity.EntityYingXiao03;
import net.mcreator.yvanchuyaoshou.entity.EntityYingXiao04;
import net.mcreator.yvanchuyaoshou.entity.EntityYingXiao05;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureZhaDanBuffDo04.class */
public class ProcedureZhaDanBuffDo04 extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZhaDanBuffDo04(ElementsYvanchuyaoshouMod instance) {
        super(instance, 232);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (!(entity instanceof EntityYingXiao02.EntityCustom) && !(entity instanceof EntityYingXiao03.EntityCustom) && !(entity instanceof EntityYingXiao04.EntityCustom) && !(entity instanceof EntityYingXiao05.EntityCustom) && !entity.getEntityData().func_74767_n("炸蛋攻击")) {
            entity.getEntityData().func_74780_a("BeMagicAttack", 672.0d);
            entity.getEntityData().func_74757_a("炸蛋攻击", true);
        }
    }
}
