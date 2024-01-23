package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureHuoyanbufficmd.class */
public class ProcedureHuoyanbufficmd extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHuoyanbufficmd(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 247);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        entityLivingBase.func_70015_d(9);
        if (entityLivingBase instanceof EntityLivingBase) {
            entityLivingBase.func_70606_j((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) - 45.0f);
        }
        if (entityLivingBase instanceof EntityLivingBase) {
            entityLivingBase.func_70674_bp();
        }
    }
}
