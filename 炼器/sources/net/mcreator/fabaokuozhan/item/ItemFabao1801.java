package net.mcreator.fabaokuozhan.item;

import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
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
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemFabao1801.class */
public class ItemFabao1801 extends ElementsFabaokuozhanMod.ModElement {
    @GameRegistry.ObjectHolder("fabaokuozhan:fabao1801helmet")
    public static final Item helmet = null;
    @GameRegistry.ObjectHolder("fabaokuozhan:fabao1801body")
    public static final Item body = null;
    @GameRegistry.ObjectHolder("fabaokuozhan:fabao1801legs")
    public static final Item legs = null;
    @GameRegistry.ObjectHolder("fabaokuozhan:fabao1801boots")
    public static final Item boots = null;

    public ItemFabao1801(ElementsFabaokuozhanMod instance) {
        super(instance, 154);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void initElements() {
        ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("FABAO1801", "fabaokuozhan:11", 0, new int[]{10, 20, 20, 10}, 0, (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("")), 2.0f);
        this.elements.items.add(() -> {
            return new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) { // from class: net.mcreator.fabaokuozhan.item.ItemFabao1801.1
                @SideOnly(Side.CLIENT)
                public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
                    ModelBiped armorModel = new ModelBiped();
                    armorModel.field_78116_c = new Modelcustom_model().Helmets;
                    armorModel.field_78117_n = living.func_70093_af();
                    armorModel.field_78093_q = living.func_184218_aH();
                    armorModel.field_78091_s = living.func_70631_g_();
                    return armorModel;
                }

                public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
                    return "fabaokuozhan:textures/taozhuang1001.png";
                }
            }.func_77655_b("fabao1801helmet").setRegistryName("fabao1801helmet").func_77637_a((CreativeTabs) null);
        });
        this.elements.items.add(() -> {
            return new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) { // from class: net.mcreator.fabaokuozhan.item.ItemFabao1801.2
                @SideOnly(Side.CLIENT)
                public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
                    ModelBiped armorModel = new ModelBiped();
                    armorModel.field_78115_e = new Modelcustom_model().BreastPlate;
                    armorModel.field_178724_i = new Modelcustom_model().LeftArm;
                    armorModel.field_178723_h = new Modelcustom_model().RightArm;
                    armorModel.field_78117_n = living.func_70093_af();
                    armorModel.field_78093_q = living.func_184218_aH();
                    armorModel.field_78091_s = living.func_70631_g_();
                    return armorModel;
                }

                public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
                    return "fabaokuozhan:textures/taozhuang1001.png";
                }
            }.func_77655_b("fabao1801body").setRegistryName("fabao1801body").func_77637_a((CreativeTabs) null);
        });
        this.elements.items.add(() -> {
            return new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) { // from class: net.mcreator.fabaokuozhan.item.ItemFabao1801.3
                @SideOnly(Side.CLIENT)
                public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
                    ModelBiped armorModel = new ModelBiped();
                    armorModel.field_178722_k = new Modelcustom_model().LeftLeg;
                    armorModel.field_178721_j = new Modelcustom_model().RightLeg;
                    armorModel.field_78117_n = living.func_70093_af();
                    armorModel.field_78093_q = living.func_184218_aH();
                    armorModel.field_78091_s = living.func_70631_g_();
                    return armorModel;
                }

                public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
                    return "fabaokuozhan:textures/taozhuang1001.png";
                }
            }.func_77655_b("fabao1801legs").setRegistryName("fabao1801legs").func_77637_a((CreativeTabs) null);
        });
        this.elements.items.add(() -> {
            return new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) { // from class: net.mcreator.fabaokuozhan.item.ItemFabao1801.4
                @SideOnly(Side.CLIENT)
                public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
                    ModelBiped armorModel = new ModelBiped();
                    armorModel.field_178722_k = new Modelcustom_model().LeftBoots;
                    armorModel.field_178721_j = new Modelcustom_model().RightBoots;
                    armorModel.field_78117_n = living.func_70093_af();
                    armorModel.field_78093_q = living.func_184218_aH();
                    armorModel.field_78091_s = living.func_70631_g_();
                    return armorModel;
                }

                public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
                    return "fabaokuozhan:textures/taozhuang1001.png";
                }
            }.func_77655_b("fabao1801boots").setRegistryName("fabao1801boots").func_77637_a((CreativeTabs) null);
        });
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("fabaokuozhan:fabao1801helmet", "inventory"));
        ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("fabaokuozhan:fabao1801body", "inventory"));
        ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("fabaokuozhan:fabao1801legs", "inventory"));
        ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("fabaokuozhan:fabao1801boots", "inventory"));
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemFabao1801$Modelcustom_model.class */
    public static class Modelcustom_model extends ModelBase {
        private final ModelRenderer LeftBoots;
        private final ModelRenderer RightBoots;
        private final ModelRenderer LeftLeg;
        private final ModelRenderer RightLegArmor_r1;
        private final ModelRenderer RightLeg;
        private final ModelRenderer RightLegArmor_r2;
        private final ModelRenderer LeftArm;
        private final ModelRenderer RightArm;
        private final ModelRenderer BreastPlate;
        private final ModelRenderer cube_r1;
        private final ModelRenderer cube_r2;
        private final ModelRenderer cube_r3;
        private final ModelRenderer cube_r4;
        private final ModelRenderer cube_r5;
        private final ModelRenderer cube_r6;
        private final ModelRenderer cube_r7;
        private final ModelRenderer Helmets;
        private final ModelRenderer cube_r8;
        private final ModelRenderer cube_r9;
        private final ModelRenderer cube_r10;

        public Modelcustom_model() {
            this.field_78090_t = 128;
            this.field_78089_u = 128;
            this.LeftBoots = new ModelRenderer(this);
            this.LeftBoots.func_78793_a(1.9f, 12.0f, 0.0f);
            this.LeftBoots.field_78804_l.add(new ModelBox(this.LeftBoots, 20, 112, -2.0f, 0.0f, -2.0f, 4, 12, 4, 1.0f, false));
            this.RightBoots = new ModelRenderer(this);
            this.RightBoots.func_78793_a(-1.9f, 12.0f, 0.0f);
            this.RightBoots.field_78804_l.add(new ModelBox(this.RightBoots, 20, 112, -2.0f, 0.0f, -2.0f, 4, 12, 4, 1.0f, true));
            this.LeftLeg = new ModelRenderer(this);
            this.LeftLeg.func_78793_a(1.9f, 12.0f, 0.0f);
            this.LeftLeg.field_78804_l.add(new ModelBox(this.LeftLeg, 0, 97, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.5f, false));
            this.RightLegArmor_r1 = new ModelRenderer(this);
            this.RightLegArmor_r1.func_78793_a(1.4113f, 1.4847f, 0.21f);
            this.LeftLeg.func_78792_a(this.RightLegArmor_r1);
            setRotationAngle(this.RightLegArmor_r1, 0.0f, 0.0f, -0.1396f);
            this.RightLegArmor_r1.field_78804_l.add(new ModelBox(this.RightLegArmor_r1, 0, 116, -3.1f, -2.7f, -2.4f, 4, 7, 4, 0.51f, true));
            this.RightLeg = new ModelRenderer(this);
            this.RightLeg.func_78793_a(-1.9f, 12.0f, 0.0f);
            this.RightLeg.field_78804_l.add(new ModelBox(this.RightLeg, 0, 97, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.5f, false));
            this.RightLegArmor_r2 = new ModelRenderer(this);
            this.RightLegArmor_r2.func_78793_a(-1.4113f, 1.4847f, 0.21f);
            this.RightLeg.func_78792_a(this.RightLegArmor_r2);
            setRotationAngle(this.RightLegArmor_r2, 0.0f, 0.0f, 0.1396f);
            this.RightLegArmor_r2.field_78804_l.add(new ModelBox(this.RightLegArmor_r2, 0, 116, -0.9f, -2.7f, -2.4f, 4, 7, 4, 0.51f, false));
            this.LeftArm = new ModelRenderer(this);
            this.LeftArm.func_78793_a(5.0f, 2.0f, 0.0f);
            this.LeftArm.field_78804_l.add(new ModelBox(this.LeftArm, 79, 26, -1.0f, -2.0f, -2.0f, 4, 12, 4, 0.5f, false));
            this.LeftArm.field_78804_l.add(new ModelBox(this.LeftArm, 91, 38, -0.8f, -2.3f, -2.0f, 4, 5, 4, 0.55f, false));
            this.LeftArm.field_78804_l.add(new ModelBox(this.LeftArm, 79, 42, 1.1f, 5.3f, -2.0f, 2, 4, 4, 0.55f, false));
            this.RightArm = new ModelRenderer(this);
            this.RightArm.func_78793_a(-5.0f, 2.0f, 0.0f);
            this.RightArm.field_78804_l.add(new ModelBox(this.RightArm, 79, 26, -3.0f, -2.0f, -2.0f, 4, 12, 4, 0.5f, true));
            this.RightArm.field_78804_l.add(new ModelBox(this.RightArm, 91, 38, -3.2f, -2.3f, -2.0f, 4, 5, 4, 0.55f, true));
            this.RightArm.field_78804_l.add(new ModelBox(this.RightArm, 79, 42, -3.1f, 5.3f, -2.0f, 2, 4, 4, 0.55f, true));
            this.BreastPlate = new ModelRenderer(this);
            this.BreastPlate.func_78793_a(0.0f, 13.7f, 0.0f);
            this.BreastPlate.field_78804_l.add(new ModelBox(this.BreastPlate, 53, 24, -4.0f, -12.0f, -2.0f, 8, 12, 4, 0.5f, false));
            this.BreastPlate.field_78804_l.add(new ModelBox(this.BreastPlate, 53, 47, -4.0f, -13.3f, -2.0f, 8, 1, 4, 0.75f, false));
            this.BreastPlate.field_78804_l.add(new ModelBox(this.BreastPlate, 54, 41, -4.5f, -12.1f, -2.8f, 9, 4, 1, 0.1f, false));
            this.BreastPlate.field_78804_l.add(new ModelBox(this.BreastPlate, 53, 52, -5.0f, -4.3f, -3.0f, 10, 1, 6, 0.1f, false));
            this.BreastPlate.field_78804_l.add(new ModelBox(this.BreastPlate, 74, 46, -1.0f, -5.0f, -3.2f, 2, 2, 1, 0.0f, false));
            this.BreastPlate.field_78804_l.add(new ModelBox(this.BreastPlate, 80, 54, -5.0f, -6.6f, 1.7f, 10, 1, 1, -0.15f, false));
            this.cube_r1 = new ModelRenderer(this);
            this.cube_r1.func_78793_a(-3.0911f, -2.1313f, 0.1f);
            this.BreastPlate.func_78792_a(this.cube_r1);
            setRotationAngle(this.cube_r1, 0.0f, 0.0f, 0.4363f);
            this.cube_r1.field_78804_l.add(new ModelBox(this.cube_r1, 71, 65, -1.7f, -2.0f, -2.55f, 3, 4, 5, 0.4f, false));
            this.cube_r2 = new ModelRenderer(this);
            this.cube_r2.func_78793_a(-5.9f, -2.5f, 0.2f);
            this.BreastPlate.func_78792_a(this.cube_r2);
            setRotationAngle(this.cube_r2, 0.0f, 0.0f, -0.3142f);
            this.cube_r2.field_78804_l.add(new ModelBox(this.cube_r2, 55, 65, 1.9f, -3.3f, -2.6f, 3, 4, 5, 0.4f, false));
            this.cube_r3 = new ModelRenderer(this);
            this.cube_r3.func_78793_a(3.0911f, -2.1313f, 0.1f);
            this.BreastPlate.func_78792_a(this.cube_r3);
            setRotationAngle(this.cube_r3, 0.0f, 0.0f, -0.4363f);
            this.cube_r3.field_78804_l.add(new ModelBox(this.cube_r3, 71, 65, -1.2f, -2.0f, -2.55f, 3, 4, 5, 0.4f, true));
            this.cube_r4 = new ModelRenderer(this);
            this.cube_r4.func_78793_a(5.9f, -2.5f, 0.2f);
            this.BreastPlate.func_78792_a(this.cube_r4);
            setRotationAngle(this.cube_r4, 0.0f, 0.0f, 0.3142f);
            this.cube_r4.field_78804_l.add(new ModelBox(this.cube_r4, 55, 65, -4.9f, -3.3f, -2.6f, 3, 4, 5, 0.4f, true));
            this.cube_r5 = new ModelRenderer(this);
            this.cube_r5.func_78793_a(-4.8f, -6.4f, -0.9f);
            this.BreastPlate.func_78792_a(this.cube_r5);
            setRotationAngle(this.cube_r5, 0.0f, 0.0f, -0.4363f);
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 53, 59, -0.4f, -0.1f, -2.0f, 6, 1, 5, -0.15f, false));
            this.cube_r6 = new ModelRenderer(this);
            this.cube_r6.func_78793_a(4.8f, -6.4f, -0.9f);
            this.BreastPlate.func_78792_a(this.cube_r6);
            setRotationAngle(this.cube_r6, 0.0f, 0.0f, 0.4363f);
            this.cube_r6.field_78804_l.add(new ModelBox(this.cube_r6, 53, 59, -5.7f, -0.1f, -2.0f, 6, 1, 5, -0.15f, false));
            this.cube_r7 = new ModelRenderer(this);
            this.cube_r7.func_78793_a(0.1f, 0.0f, -1.0f);
            this.BreastPlate.func_78792_a(this.cube_r7);
            setRotationAngle(this.cube_r7, -0.0175f, 0.0f, 0.0f);
            this.cube_r7.field_78804_l.add(new ModelBox(this.cube_r7, 89, 63, -2.1f, -7.8f, -1.79f, 4, 12, 0, 0.0f, false));
            this.Helmets = new ModelRenderer(this);
            this.Helmets.func_78793_a(0.0f, 0.0f, 0.0f);
            this.Helmets.field_78804_l.add(new ModelBox(this.Helmets, 0, 24, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.7f, false));
            this.Helmets.field_78804_l.add(new ModelBox(this.Helmets, 0, 40, -4.0f, -9.6f, -3.9f, 8, 1, 8, 0.0f, false));
            this.Helmets.field_78804_l.add(new ModelBox(this.Helmets, 24, 24, -3.5f, -10.5f, -3.5f, 7, 1, 7, 0.0f, false));
            this.Helmets.field_78804_l.add(new ModelBox(this.Helmets, 32, 32, -1.5f, -13.0f, 4.1f, 3, 3, 3, 0.0f, false));
            this.Helmets.field_78804_l.add(new ModelBox(this.Helmets, 0, 24, -1.1f, -11.1f, 5.9f, 2, 4, 2, 0.0f, false));
            this.Helmets.field_78804_l.add(new ModelBox(this.Helmets, 0, 40, -1.1f, -7.6f, 7.0f, 2, 2, 2, -0.18f, false));
            this.Helmets.field_78804_l.add(new ModelBox(this.Helmets, 0, 61, -4.5f, -12.5f, -4.8f, 9, 13, 0, 0.0f, false));
            this.cube_r8 = new ModelRenderer(this);
            this.cube_r8.func_78793_a(9.2133f, -8.2f, 10.2154f);
            this.Helmets.func_78792_a(this.cube_r8);
            setRotationAngle(this.cube_r8, 0.0f, 1.0647f, 0.0f);
            this.cube_r8.field_78804_l.add(new ModelBox(this.cube_r8, 0, 49, -1.7f, -1.1f, -19.4f, 8, 10, 0, 0.0f, true));
            this.cube_r9 = new ModelRenderer(this);
            this.cube_r9.func_78793_a(-9.2133f, -8.2f, 10.2154f);
            this.Helmets.func_78792_a(this.cube_r9);
            setRotationAngle(this.cube_r9, 0.0f, -1.0647f, 0.0f);
            this.cube_r9.field_78804_l.add(new ModelBox(this.cube_r9, 0, 49, -6.3f, -1.1f, -19.4f, 8, 10, 0, 0.0f, false));
            this.cube_r10 = new ModelRenderer(this);
            this.cube_r10.func_78793_a(0.0f, -10.6f, 4.0f);
            this.Helmets.func_78792_a(this.cube_r10);
            setRotationAngle(this.cube_r10, -0.3665f, 0.0f, 0.0f);
            this.cube_r10.field_78804_l.add(new ModelBox(this.cube_r10, 0, 44, -0.5f, -1.0f, -0.3f, 1, 3, 1, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.LeftBoots.func_78785_a(f5);
            this.RightBoots.func_78785_a(f5);
            this.LeftLeg.func_78785_a(f5);
            this.RightLeg.func_78785_a(f5);
            this.LeftArm.func_78785_a(f5);
            this.RightArm.func_78785_a(f5);
            this.BreastPlate.func_78785_a(f5);
            this.Helmets.func_78785_a(f5);
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
