package net.mcreator.yvanchujiguan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.minecraft.entity.Entity;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/procedure/ProcedureGongFaNbtSet.class */
public class ProcedureGongFaNbtSet extends ElementsYvanchujiguanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureGongFaNbtSet(ElementsYvanchujiguanMod instance) {
        super(instance, 241);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        $_dependencies.put("entity", entity);
        ProcedureGongFaNbtSet1.executeProcedure($_dependencies);
        $_dependencies.put("entity", entity);
        ProcedureGongFaNbtSet2.executeProcedure($_dependencies);
        $_dependencies.put("entity", entity);
        ProcedureGongFaNbtSet3.executeProcedure($_dependencies);
        $_dependencies.put("entity", entity);
        ProcedureGongFaNbtSet4.executeProcedure($_dependencies);
        $_dependencies.put("entity", entity);
        ProcedureGongFaNbtSet5.executeProcedure($_dependencies);
        $_dependencies.put("entity", entity);
        ProcedureGongFaNbtSet6.executeProcedure($_dependencies);
        $_dependencies.put("entity", entity);
        ProcedureGongFaNbtSet8.executeProcedure($_dependencies);
        $_dependencies.put("entity", entity);
        ProcedureGongFaNbtSet21.executeProcedure($_dependencies);
        $_dependencies.put("entity", entity);
        ProcedureGongFaNbtSet23.executeProcedure($_dependencies);
        $_dependencies.put("entity", entity);
        ProcedureGongFaNbtSet24.executeProcedure($_dependencies);
        $_dependencies.put("entity", entity);
        ProcedureGongFaNbtSet28.executeProcedure($_dependencies);
        $_dependencies.put("entity", entity);
        ProcedureGongFaNbtSet29.executeProcedure($_dependencies);
        $_dependencies.put("entity", entity);
        ProcedureGongFaNbtSet30.executeProcedure($_dependencies);
        $_dependencies.put("entity", entity);
        ProcedureGongFaNbtSet31.executeProcedure($_dependencies);
    }
}
