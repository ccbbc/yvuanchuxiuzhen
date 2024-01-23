package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityHunTieShou01;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureYingXiaoXinXi.class */
public class ProcedureYingXiaoXinXi extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureYingXiaoXinXi(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityHunTieShou01.ENTITYID);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74780_a("攻击", 1.0d);
        if (entity.func_145748_c_().func_150260_c().contains("二阶")) {
            entity.getEntityData().func_74780_a("法攻", 18.0d);
            entity.getEntityData().func_74780_a("defense", 10.0d);
            entity.getEntityData().func_74780_a("法防", 15.0d);
            entity.getEntityData().func_74780_a("生命", 180.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 6.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 14.0d);
            entity.getEntityData().func_74778_a("鹰枭远程技能", "二阶鹰枭");
        } else if (entity.func_145748_c_().func_150260_c().contains("三阶")) {
            entity.getEntityData().func_74780_a("法攻", 65.0d);
            entity.getEntityData().func_74780_a("defense", 43.0d);
            entity.getEntityData().func_74780_a("法防", 73.0d);
            entity.getEntityData().func_74780_a("生命", 725.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 10.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 64.0d);
            entity.getEntityData().func_74778_a("鹰枭远程技能", "三阶鹰枭");
        } else if (entity.func_145748_c_().func_150260_c().contains("四阶")) {
            entity.getEntityData().func_74780_a("法攻", 224.0d);
            entity.getEntityData().func_74780_a("defense", 158.0d);
            entity.getEntityData().func_74780_a("法防", 208.0d);
            entity.getEntityData().func_74780_a("生命", 2080.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 46.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 276.0d);
            entity.getEntityData().func_74778_a("鹰枭远程技能", "四阶鹰枭");
        } else if (entity.func_145748_c_().func_150260_c().contains("五阶")) {
            entity.getEntityData().func_74780_a("法攻", 603.0d);
            entity.getEntityData().func_74780_a("defense", 426.0d);
            entity.getEntityData().func_74780_a("法防", 600.0d);
            entity.getEntityData().func_74780_a("生命", 6003.0d);
            entity.getEntityData().func_74780_a("战斗恢复", 161.0d);
            entity.getEntityData().func_74780_a("脱战恢复", 966.0d);
            entity.getEntityData().func_74778_a("鹰枭远程技能", "五阶鹰枭");
        }
    }
}
