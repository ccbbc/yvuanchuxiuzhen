package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureCaiLiao13DangWuPinZaiShouShangMeiKeFaSheng.class */
public class ProcedureCaiLiao13DangWuPinZaiShouShangMeiKeFaSheng extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureCaiLiao13DangWuPinZaiShouShangMeiKeFaSheng(ElementsYvanchuliandanMod instance) {
        super(instance, 467);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (entityLivingBase instanceof EntityLivingBase) {
            entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76437_t, 20, 0));
        }
    }
}
