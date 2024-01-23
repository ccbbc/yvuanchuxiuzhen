package net.mcreator.yvanchuxiuzhen.potion;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyanbufffcmd;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/potion/PotionHuoyanbufff.class */
public class PotionHuoyanbufff extends ElementsYvanchuxiuzhenMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:huoyanbufff")
    public static final Potion potion = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public PotionHuoyanbufff(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 242);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        this.elements.potions.add(() -> {
            return new PotionCustom();
        });
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/potion/PotionHuoyanbufff$PotionCustom.class */
    public static class PotionCustom extends Potion {
        private final ResourceLocation potionIcon;

        public PotionCustom() {
            super(false, -52429);
            setRegistryName("huoyanbufff");
            func_76390_b("effect.huoyanbufff");
            this.potionIcon = new ResourceLocation("yvanchuxiuzhen:textures/mob_effect/huoyanbufff.png");
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
            PotionHuoyanbufff.$_dependencies.put("entity", entity);
            ProcedureHuoyanbufffcmd.executeProcedure(PotionHuoyanbufff.$_dependencies);
        }

        public boolean func_76397_a(int duration, int amplifier) {
            return true;
        }
    }
}
