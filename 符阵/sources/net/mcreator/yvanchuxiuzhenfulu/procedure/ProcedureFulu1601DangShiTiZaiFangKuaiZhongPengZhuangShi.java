package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu1601DangShiTiZaiFangKuaiZhongPengZhuangShi.class */
public class ProcedureFulu1601DangShiTiZaiFangKuaiZhongPengZhuangShi extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu1601DangShiTiZaiFangKuaiZhongPengZhuangShi(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 247);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (!entityLivingBase.getEntityData().func_74767_n("usejinglao") && (entityLivingBase instanceof EntityLivingBase)) {
            entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 1200, 3, false, true));
        }
    }
}
