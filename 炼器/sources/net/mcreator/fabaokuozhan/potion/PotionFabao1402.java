package net.mcreator.fabaokuozhan.potion;

import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/potion/PotionFabao1402.class */
public class PotionFabao1402 extends ElementsFabaokuozhanMod.ModElement {
    @GameRegistry.ObjectHolder("fabaokuozhan:fabao1402")
    public static final Potion potion = null;
    @GameRegistry.ObjectHolder("fabaokuozhan:fabao1402")
    public static final PotionType potionType = null;

    public PotionFabao1402(ElementsFabaokuozhanMod instance) {
        super(instance, 141);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void initElements() {
        this.elements.potions.add(() -> {
            return new PotionCustom();
        });
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void init(FMLInitializationEvent event) {
        ForgeRegistries.POTION_TYPES.register(new PotionTypeCustom());
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/potion/PotionFabao1402$PotionTypeCustom.class */
    public static class PotionTypeCustom extends PotionType {
        public PotionTypeCustom() {
            super(new PotionEffect[]{new PotionEffect(PotionFabao1402.potion, 3600)});
            setRegistryName("fabao1402");
        }
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/potion/PotionFabao1402$PotionCustom.class */
    public static class PotionCustom extends Potion {
        private final ResourceLocation potionIcon;

        public PotionCustom() {
            super(true, -6750208);
            setRegistryName("fabao1402");
            func_76390_b("effect.fabao1402");
            this.potionIcon = new ResourceLocation("fabaokuozhan:textures/mob_effect/fabao1402.png");
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

        public boolean func_76397_a(int duration, int amplifier) {
            return true;
        }
    }
}
