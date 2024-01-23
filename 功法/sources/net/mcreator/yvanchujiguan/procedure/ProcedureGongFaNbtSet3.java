package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureGongFaNbtSet3.class */
public class ProcedureGongFaNbtSet3 extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFaNbtSet3(ElementsYvanchujiguanMod instance) {
        super(instance, 243);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity.getEntityData().func_74779_i("GongFa名暂存").equals("3")) {
            entity.getEntityData().func_74778_a("GongFaGui3", " §6第一层:加5气血");
            entity.getEntityData().func_74778_a("GongFaGui4", " §6第二层:加5气血");
            entity.getEntityData().func_74778_a("GongFaGui5", " §6第三层:加1回灵");
            entity.getEntityData().func_74778_a("GongFaGui6", " §6第三层突破后提升至练气期");
            entity.getEntityData().func_74778_a("GongFaGui7", "");
            entity.getEntityData().func_74778_a("GongFaGui8", "");
            entity.getEntityData().func_74778_a("GongFaGui9", "");
            entity.getEntityData().func_74778_a("GongFaGui10", "");
            entity.getEntityData().func_74778_a("GongFaGui11", "");
            entity.getEntityData().func_74778_a("GongFaGui12", "");
            entity.getEntityData().func_74778_a("GongFaGui13", "");
            entity.getEntityData().func_74778_a("GongFaGui14", "");
            entity.getEntityData().func_74778_a("GongFaGui15", "");
            entity.getEntityData().func_74778_a("GongFaGui16", "");
            entity.getEntityData().func_74778_a("GongFaGui17", "");
            entity.getEntityData().func_74778_a("GongFaGui18", "");
            entity.getEntityData().func_74778_a("GongFaGui19", "");
            entity.getEntityData().func_74778_a("GongFaGui20", "");
        }
    }
}
