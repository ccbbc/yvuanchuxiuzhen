package net.mcreator.yvanchuyaoshou.potion;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureHeiZhuBuff2Do;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureHeiZhuBuffClear;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.attributes.AbstractAttributeMap;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/potion/PotionHeiZhuBuff2.class */
public class PotionHeiZhuBuff2 extends ElementsYvanchuyaoshouMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuyaoshou:hei_zhu_buff_2")
    public static final Potion potion = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public PotionHeiZhuBuff2(ElementsYvanchuyaoshouMod instance) {
        super(instance, 279);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.potions.add(() -> {
            return new PotionCustom();
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/potion/PotionHeiZhuBuff2$PotionCustom.class */
    public static class PotionCustom extends Potion {
        private final ResourceLocation potionIcon;

        public PotionCustom() {
            super(false, -10092340);
            setRegistryName("hei_zhu_buff_2");
            func_76390_b("effect.hei_zhu_buff_2");
            this.potionIcon = new ResourceLocation("yvanchuyaoshou:textures/mob_effect/hei_zhu_buff_2.png");
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
            PotionHeiZhuBuff2.$_dependencies.put("entity", entity);
            ProcedureHeiZhuBuff2Do.executeProcedure(PotionHeiZhuBuff2.$_dependencies);
        }

        public void func_111187_a(EntityLivingBase entity, AbstractAttributeMap attributeMapIn, int amplifier) {
            super.func_111187_a(entity, attributeMapIn, amplifier);
            World world = entity.field_70170_p;
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            PotionHeiZhuBuff2.$_dependencies.put("entity", entity);
            ProcedureHeiZhuBuffClear.executeProcedure(PotionHeiZhuBuff2.$_dependencies);
        }

        public boolean func_76397_a(int duration, int amplifier) {
            return true;
        }
    }
}
