package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureDuoSheBuffUpdate.class */
public class ProcedureDuoSheBuffUpdate extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureDuoSheBuffUpdate(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 401);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase.func_70089_S()) {
            entityLivingBase.getEntityData().func_74780_a("夺舍冲刺", entityLivingBase.getEntityData().func_74769_h("夺舍冲刺") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("夺舍冲刺") == 25.0d) {
                if (entityLivingBase instanceof EntityLivingBase) {
                    entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76424_c, 200, 1, false, false));
                }
            } else if (entityLivingBase.getEntityData().func_74769_h("夺舍冲刺") == 50.0d) {
                if (entityLivingBase instanceof EntityLivingBase) {
                    entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76424_c, 200, 2, false, false));
                }
            } else if (entityLivingBase.getEntityData().func_74769_h("夺舍冲刺") == 75.0d) {
                if (entityLivingBase instanceof EntityLivingBase) {
                    entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76424_c, 200, 3, false, false));
                }
            } else if (entityLivingBase.getEntityData().func_74769_h("夺舍冲刺") == 100.0d && (entityLivingBase instanceof EntityLivingBase)) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76424_c, 200, 4, false, false));
            }
            if (entityLivingBase.getEntityData().func_74769_h("夺舍冲刺") >= 120.0d) {
                entityLivingBase.getEntityData().func_74780_a("夺舍冲刺", 0.0d);
            }
        }
    }
}
