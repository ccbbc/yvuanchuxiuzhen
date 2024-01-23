package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureYuanShenChuTi.class */
public class ProcedureYuanShenChuTi extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureYuanShenChuTi(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 301);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase instanceof EntityLivingBase) {
            entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76424_c, 20, 1, false, false));
        }
        entityLivingBase.getEntityData().func_74757_a("TuPoLimit", true);
    }
}
