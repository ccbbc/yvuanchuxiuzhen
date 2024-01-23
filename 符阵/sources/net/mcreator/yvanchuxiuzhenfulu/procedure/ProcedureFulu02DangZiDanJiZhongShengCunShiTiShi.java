package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu02DangZiDanJiZhongShengCunShiTiShi.class */
public class ProcedureFulu02DangZiDanJiZhongShengCunShiTiShi extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu02DangZiDanJiZhongShengCunShiTiShi(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 280);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase instanceof EntityLivingBase) {
            entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 600, 2, false, false));
        }
    }
}
