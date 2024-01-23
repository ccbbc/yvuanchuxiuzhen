package net.mcreator.yvanchuxiuzhen.potion;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureDuoSheBuffDo;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureDuoSheBuffUpdate;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.attributes.AbstractAttributeMap;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/potion/PotionDuoSheBuff.class */
public class PotionDuoSheBuff extends ElementsYvanchuxiuzhenMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:duo_she_buff")
    public static final Potion potion = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public PotionDuoSheBuff(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 399);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        this.elements.potions.add(() -> {
            return new PotionCustom();
        });
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/potion/PotionDuoSheBuff$PotionCustom.class */
    public static class PotionCustom extends Potion {
        private final ResourceLocation potionIcon;

        public PotionCustom() {
            super(false, -1);
            setRegistryName("duo_she_buff");
            func_76390_b("effect.duo_she_buff");
            this.potionIcon = new ResourceLocation("yvanchuxiuzhen:textures/mob_effect/duo_she_buff.png");
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
            PotionDuoSheBuff.$_dependencies.put("entity", entity);
            ProcedureDuoSheBuffUpdate.executeProcedure(PotionDuoSheBuff.$_dependencies);
        }

        public void func_111187_a(EntityLivingBase entity, AbstractAttributeMap attributeMapIn, int amplifier) {
            super.func_111187_a(entity, attributeMapIn, amplifier);
            World world = entity.field_70170_p;
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            PotionDuoSheBuff.$_dependencies.put("entity", entity);
            ProcedureDuoSheBuffDo.executeProcedure(PotionDuoSheBuff.$_dependencies);
        }

        public boolean func_76397_a(int duration, int amplifier) {
            return true;
        }
    }
}
