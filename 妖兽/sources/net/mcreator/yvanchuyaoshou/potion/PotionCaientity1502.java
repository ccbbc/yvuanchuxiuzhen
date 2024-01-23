package net.mcreator.yvanchuyaoshou.potion;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu04;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureCaientity15OnEntityTickUpdate;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/potion/PotionCaientity1502.class */
public class PotionCaientity1502 extends ElementsYvanchuyaoshouMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuyaoshou:caientity1502")
    public static final Potion potion = null;
    static Map<String, Object> $_dependencies = new HashMap();
    @GameRegistry.ObjectHolder("yvanchuyaoshou:caientity1502")
    public static final PotionType potionType = null;

    public PotionCaientity1502(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntitySanXiu04.ENTITYID_RANGED);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.potions.add(() -> {
            return new PotionCustom();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void init(FMLInitializationEvent event) {
        ForgeRegistries.POTION_TYPES.register(new PotionTypeCustom());
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/potion/PotionCaientity1502$PotionTypeCustom.class */
    public static class PotionTypeCustom extends PotionType {
        public PotionTypeCustom() {
            super(new PotionEffect[]{new PotionEffect(PotionCaientity1502.potion, 3600)});
            setRegistryName("caientity1502");
        }
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/potion/PotionCaientity1502$PotionCustom.class */
    public static class PotionCustom extends Potion {
        private final ResourceLocation potionIcon;

        public PotionCustom() {
            super(false, -1);
            func_188413_j();
            setRegistryName("caientity1502");
            func_76390_b("effect.caientity1502");
            this.potionIcon = new ResourceLocation("yvanchuyaoshou:textures/mob_effect/caientity1502.png");
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
            int x = (int) entity.field_70165_t;
            int y = (int) entity.field_70163_u;
            int z = (int) entity.field_70161_v;
            PotionCaientity1502.$_dependencies.put("entity", entity);
            PotionCaientity1502.$_dependencies.put("x", Integer.valueOf(x));
            PotionCaientity1502.$_dependencies.put("y", Integer.valueOf(y));
            PotionCaientity1502.$_dependencies.put("z", Integer.valueOf(z));
            PotionCaientity1502.$_dependencies.put("world", world);
            ProcedureCaientity15OnEntityTickUpdate.executeProcedure(PotionCaientity1502.$_dependencies);
        }

        public boolean func_76397_a(int duration, int amplifier) {
            return true;
        }
    }
}
