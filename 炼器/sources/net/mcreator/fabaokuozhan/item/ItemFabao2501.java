package net.mcreator.fabaokuozhan.item;

import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.creativetab.TabLianqi;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemFabao2501.class */
public class ItemFabao2501 extends ElementsFabaokuozhanMod.ModElement {
    @GameRegistry.ObjectHolder("fabaokuozhan:fabao2501helmet")
    public static final Item helmet = null;
    @GameRegistry.ObjectHolder("fabaokuozhan:fabao2501body")
    public static final Item body = null;
    @GameRegistry.ObjectHolder("fabaokuozhan:fabao2501legs")
    public static final Item legs = null;
    @GameRegistry.ObjectHolder("fabaokuozhan:fabao2501boots")
    public static final Item boots = null;

    public ItemFabao2501(ElementsFabaokuozhanMod instance) {
        super(instance, 7);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void initElements() {
        ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("FABAO2501", "fabaokuozhan:fabao2502", 780, new int[]{3, 6, 8, 3}, 0, (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("")), 0.0f);
        this.elements.items.add(() -> {
            return new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) { // from class: net.mcreator.fabaokuozhan.item.ItemFabao2501.1
                @SideOnly(Side.CLIENT)
                public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
                    ModelBiped armorModel = new ModelBiped();
                    armorModel.field_78116_c = new Modelfabao2501().head;
                    armorModel.field_78117_n = living.func_70093_af();
                    armorModel.field_78093_q = living.func_184218_aH();
                    armorModel.field_78091_s = living.func_70631_g_();
                    return armorModel;
                }

                public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
                    return "fabaokuozhan:textures/fabao2501.png";
                }
            }.func_77655_b("fabao2501helmet").setRegistryName("fabao2501helmet").func_77637_a(TabLianqi.tab);
        });
        this.elements.items.add(() -> {
            return new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).func_77655_b("fabao2501body").setRegistryName("fabao2501body").func_77637_a(TabLianqi.tab);
        });
        this.elements.items.add(() -> {
            return new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).func_77655_b("fabao2501legs").setRegistryName("fabao2501legs").func_77637_a(TabLianqi.tab);
        });
        this.elements.items.add(() -> {
            return new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).func_77655_b("fabao2501boots").setRegistryName("fabao2501boots").func_77637_a(TabLianqi.tab);
        });
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("fabaokuozhan:fabao2501helmet", "inventory"));
        ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("fabaokuozhan:fabao2501body", "inventory"));
        ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("fabaokuozhan:fabao2501legs", "inventory"));
        ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("fabaokuozhan:fabao2501boots", "inventory"));
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemFabao2501$Modelfabao2501.class */
    public static class Modelfabao2501 extends ModelBase {
        private final ModelRenderer head;

        public Modelfabao2501() {
            this.field_78090_t = 64;
            this.field_78089_u = 44;
            this.head = new ModelRenderer(this);
            this.head.func_78793_a(0.0f, 24.0f, 0.0f);
            this.head.field_78804_l.add(new ModelBox(this.head, 0, 31, -4.5f, -10.0f, -4.5f, 9, 4, 9, 0.0f, false));
            this.head.field_78804_l.add(new ModelBox(this.head, 36, 38, -1.5f, -12.0f, 0.0f, 3, 3, 3, 0.0f, false));
            this.head.field_78804_l.add(new ModelBox(this.head, 48, 42, -3.0f, -11.0f, 1.0f, 6, 1, 1, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.head.func_78785_a(f5);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.field_78795_f = x;
            modelRenderer.field_78796_g = y;
            modelRenderer.field_78808_h = z;
        }

        public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
            super.func_78087_a(f, f1, f2, f3, f4, f5, e);
        }
    }
}
