package net.mcreator.yvanchuxiuzhenfulu.potion;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu2001PotionExpires;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.attributes.AbstractAttributeMap;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/potion/PotionFulu2001.class */
public class PotionFulu2001 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhenfulu:fulu2001")
    public static final Potion potion = null;

    public PotionFulu2001(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 151);
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    public void initElements() {
        this.elements.potions.add(() -> {
            return new PotionCustom();
        });
    }

    /* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/potion/PotionFulu2001$PotionCustom.class */
    public static class PotionCustom extends Potion {
        private final ResourceLocation potionIcon;

        public PotionCustom() {
            super(false, -16777216);
            func_188413_j();
            setRegistryName("fulu2001");
            func_76390_b("effect.fulu2001");
            this.potionIcon = new ResourceLocation("yvanchuxiuzhenfulu:textures/mob_effect/fulu2001.png");
        }

        public boolean func_76403_b() {
            return false;
        }

        public boolean shouldRenderInvText(PotionEffect effect) {
            return true;
        }

        public boolean shouldRenderHUD(PotionEffect effect) {
            return true;
        }

        public void func_111187_a(EntityLivingBase entity, AbstractAttributeMap attributeMapIn, int amplifier) {
            super.func_111187_a(entity, attributeMapIn, amplifier);
            World world = entity.field_70170_p;
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("entity", entity);
            ProcedureFulu2001PotionExpires.executeProcedure($_dependencies);
        }

        @SideOnly(Side.CLIENT)
        public void renderInventoryEffect(int x, int y, PotionEffect effect, Minecraft mc) {
            if (mc.field_71462_r != null) {
                mc.func_110434_K().func_110577_a(this.potionIcon);
                Gui.func_146110_a(x + 6, y + 7, 0.0f, 0.0f, 18, 18, 18.0f, 18.0f);
            }
        }

        @SideOnly(Side.CLIENT)
        public void renderHUDEffect(int x, int y, PotionEffect effect, Minecraft mc, float alpha) {
            mc.func_110434_K().func_110577_a(this.potionIcon);
            Gui.func_146110_a(x + 3, y + 3, 0.0f, 0.0f, 18, 18, 18.0f, 18.0f);
        }

        public boolean func_76397_a(int duration, int amplifier) {
            return true;
        }
    }
}
