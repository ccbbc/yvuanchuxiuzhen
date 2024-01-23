package net.mcreator.yvanchuxiuzhen.potion;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectBuffUpdate;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/potion/PotionSectBuff.class */
public class PotionSectBuff extends ElementsYvanchuxiuzhenMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:sect_buff")
    public static final Potion potion = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public PotionSectBuff(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 564);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        this.elements.potions.add(() -> {
            return new PotionCustom();
        });
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/potion/PotionSectBuff$PotionCustom.class */
    public static class PotionCustom extends Potion {
        private final ResourceLocation potionIcon;

        public PotionCustom() {
            super(false, -1);
            setRegistryName("sect_buff");
            func_76390_b("effect.sect_buff");
            this.potionIcon = new ResourceLocation("yvanchuxiuzhen:textures/mob_effect/sect_buff.png");
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

        public void func_76394_a(EntityLivingBase entity, int amplifier) {
            World world = entity.field_70170_p;
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            PotionSectBuff.$_dependencies.put("entity", entity);
            ProcedureSectBuffUpdate.executeProcedure(PotionSectBuff.$_dependencies);
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
