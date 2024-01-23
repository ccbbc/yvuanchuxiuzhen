package net.mcreator.yvanchuyaoshou.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu0102;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu0202;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu0302;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu0402;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu0502;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu0102;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu0202;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu0302;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu0402;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu0502;
import net.minecraft.entity.Entity;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureXingShiSet.class */
public class ProcedureXingShiSet extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureXingShiSet(ElementsYvanchuyaoshouMod instance) {
        super(instance, 259);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [net.mcreator.yvanchuyaoshou.procedure.ProcedureXingShiSet$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if ((entity instanceof EntitySanXiu0102.EntityCustom) || (entity instanceof EntitySanXiu0202.EntityCustom) || (entity instanceof EntitySanXiu0302.EntityCustom) || (entity instanceof EntitySanXiu0402.EntityCustom) || (entity instanceof EntitySanXiu0502.EntityCustom) || (entity instanceof EntityMoXiu0102.EntityCustom) || (entity instanceof EntityMoXiu0202.EntityCustom) || (entity instanceof EntityMoXiu0302.EntityCustom) || (entity instanceof EntityMoXiu0402.EntityCustom) || (entity instanceof EntityMoXiu0502.EntityCustom)) {
            entity.getEntityData().func_74780_a("Sex", 0.0d);
        } else {
            entity.getEntityData().func_74780_a("Sex", 1.0d);
        }
        entity.getEntityData().func_74780_a("母随机数", new Object() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureXingShiSet.1
            int convert(String s) {
                try {
                    return Integer.parseInt(s.trim());
                } catch (Exception e) {
                    return 0;
                }
            }
        }.convert(new DecimalFormat("0").format((Math.random() * 100.0d) / 5.0d)));
        if (entity.getEntityData().func_74769_h("母随机数") == 0.0d) {
            entity.getEntityData().func_74780_a("母随机数", 1.0d);
        }
        entity.getEntityData().func_74778_a("姓氏暂存", "王韩赵元陈董黄慕菡历李颜萧湛白金墨傅");
        if (entity.getEntityData().func_74769_h("母随机数") <= 18.0d) {
            entity.getEntityData().func_74778_a("姓", entity.getEntityData().func_74779_i("姓氏暂存").substring((int) (entity.getEntityData().func_74769_h("母随机数") - 1.0d), (int) entity.getEntityData().func_74769_h("母随机数")));
        } else if (entity.getEntityData().func_74769_h("母随机数") == 19.0d) {
            entity.getEntityData().func_74778_a("姓", "南宫");
        } else if (entity.getEntityData().func_74769_h("母随机数") == 20.0d) {
            entity.getEntityData().func_74778_a("姓", "百里");
        }
    }
}
