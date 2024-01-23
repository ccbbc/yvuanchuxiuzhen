package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu01;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu02;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu03;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu04;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu05;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureSanXiuBuffDo04.class */
public class ProcedureSanXiuBuffDo04 extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSanXiuBuffDo04(ElementsYvanchuyaoshouMod instance) {
        super(instance, 256);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (!(entity instanceof EntitySanXiu01.EntityCustom) && !(entity instanceof EntitySanXiu02.EntityCustom) && !(entity instanceof EntitySanXiu03.EntityCustom) && !(entity instanceof EntitySanXiu04.EntityCustom) && !(entity instanceof EntitySanXiu05.EntityCustom) && !entity.getEntityData().func_74767_n("散修攻击")) {
            entity.getEntityData().func_74780_a("BeMagicAttack", 860.0d);
            entity.getEntityData().func_74757_a("散修攻击", true);
        }
    }
}
