package net.mcreator.yuanchujianzhu.potion;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.mcreator.yuanchujianzhu.procedure.ProcedureDongFuTiShi22;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

@ElementsYuanchujianzhuMod.ModElement.Tag
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/potion/PotionDongFuTiShi2.class */
public class PotionDongFuTiShi2 extends ElementsYuanchujianzhuMod.ModElement {
    @GameRegistry.ObjectHolder("yuanchujianzhu:dong_fu_ti_shi_2")
    public static final Potion potion = null;

    public PotionDongFuTiShi2(ElementsYuanchujianzhuMod instance) {
        super(instance, 172);
    }

    @Override // net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod.ModElement
    public void initElements() {
        this.elements.potions.add(() -> {
            return new PotionCustom();
        });
    }

    /* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/potion/PotionDongFuTiShi2$PotionCustom.class */
    public static class PotionCustom extends Potion {
        private final ResourceLocation potionIcon;

        public PotionCustom() {
            super(false, -16777216);
            setRegistryName("dong_fu_ti_shi_2");
            func_76390_b("effect.dong_fu_ti_shi_2");
            this.potionIcon = new ResourceLocation("yuanchujianzhu:textures/mob_effect/dong_fu_ti_shi_2.png");
        }

        public boolean func_76403_b() {
            return false;
        }

        public boolean shouldRenderInvText(PotionEffect effect) {
            return false;
        }

        public boolean shouldRenderHUD(PotionEffect effect) {
            return false;
        }

        public void func_76394_a(EntityLivingBase entity, int amplifier) {
            World world = entity.field_70170_p;
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("entity", entity);
            ProcedureDongFuTiShi22.executeProcedure($_dependencies);
        }

        public boolean func_76397_a(int duration, int amplifier) {
            return true;
        }
    }
}
