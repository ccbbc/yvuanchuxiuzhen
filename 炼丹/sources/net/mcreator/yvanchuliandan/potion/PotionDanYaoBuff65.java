package net.mcreator.yvanchuliandan.potion;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoBuff65Off;
import net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoBuff65On;
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

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/potion/PotionDanYaoBuff65.class */
public class PotionDanYaoBuff65 extends ElementsYvanchuliandanMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuliandan:dan_yao_buff_65")
    public static final Potion potion = null;

    public PotionDanYaoBuff65(ElementsYvanchuliandanMod instance) {
        super(instance, 428);
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    public void initElements() {
        this.elements.potions.add(() -> {
            return new PotionCustom();
        });
    }

    /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/potion/PotionDanYaoBuff65$PotionCustom.class */
    public static class PotionCustom extends Potion {
        private final ResourceLocation potionIcon;

        public PotionCustom() {
            super(false, -3407872);
            setRegistryName("dan_yao_buff_65");
            func_76390_b("effect.dan_yao_buff_65");
            this.potionIcon = new ResourceLocation("yvanchuliandan:textures/mob_effect/dan_yao_buff_65.png");
        }

        public boolean func_76403_b() {
            return false;
        }

        public boolean shouldRenderInvText(PotionEffect effect) {
            return true;
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
            ProcedureDanYaoBuff65On.executeProcedure($_dependencies);
        }

        public void func_111187_a(EntityLivingBase entity, AbstractAttributeMap attributeMapIn, int amplifier) {
            super.func_111187_a(entity, attributeMapIn, amplifier);
            World world = entity.field_70170_p;
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("entity", entity);
            ProcedureDanYaoBuff65Off.executeProcedure($_dependencies);
        }

        @SideOnly(Side.CLIENT)
        public void renderInventoryEffect(int x, int y, PotionEffect effect, Minecraft mc) {
            if (mc.field_71462_r != null) {
                mc.func_110434_K().func_110577_a(this.potionIcon);
                Gui.func_146110_a(x + 6, y + 7, 0.0f, 0.0f, 18, 18, 18.0f, 18.0f);
            }
        }

        public boolean func_76397_a(int duration, int amplifier) {
            return true;
        }
    }
}
