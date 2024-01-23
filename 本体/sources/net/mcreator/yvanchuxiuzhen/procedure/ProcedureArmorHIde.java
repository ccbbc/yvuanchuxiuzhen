package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureArmorHIde.class */
public class ProcedureArmorHIde extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureArmorHIde(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 338);
    }

    public static boolean executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return false;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_70658_aO() : 0) > 0) {
            return true;
        }
        return false;
    }
}
