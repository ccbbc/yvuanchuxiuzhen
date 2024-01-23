package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureShiJuRenSkill.class */
public class ProcedureShiJuRenSkill extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureShiJuRenSkill(ElementsYvanchuyaoshouMod instance) {
        super(instance, 180);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (!entityLivingBase.getEntityData().func_74767_n("无头") && !entityLivingBase.func_184207_aI()) {
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70606_j(1.0f);
            }
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76424_c, 114514, 4, false, true));
            }
            entityLivingBase.getEntityData().func_74757_a("无头", true);
        }
    }
}
