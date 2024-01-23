package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityBaiYuZhiZhu;
import net.mcreator.yvanchuyaoshou.entity.EntityYingXiao02;
import net.mcreator.yvanchuyaoshou.entity.EntityYingXiao03;
import net.mcreator.yvanchuyaoshou.entity.EntityYingXiao04;
import net.mcreator.yvanchuyaoshou.entity.EntityYingXiao05;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureYingXiaoBuffDo03.class */
public class ProcedureYingXiaoBuffDo03 extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureYingXiaoBuffDo03(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityBaiYuZhiZhu.ENTITYID);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (!(entity instanceof EntityYingXiao02.EntityCustom) && !(entity instanceof EntityYingXiao03.EntityCustom) && !(entity instanceof EntityYingXiao04.EntityCustom) && !(entity instanceof EntityYingXiao05.EntityCustom) && !entity.getEntityData().func_74767_n("鹰枭攻击")) {
            entity.getEntityData().func_74780_a("BeMagicAttack", 540.0d);
            entity.getEntityData().func_74757_a("鹰枭攻击", true);
        }
    }
}
