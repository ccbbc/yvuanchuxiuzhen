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
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemDaoPao04.class */
public class ItemDaoPao04 extends ElementsFabaokuozhanMod.ModElement {
    @GameRegistry.ObjectHolder("fabaokuozhan:dao_pao_04helmet")
    public static final Item helmet = null;
    @GameRegistry.ObjectHolder("fabaokuozhan:dao_pao_04body")
    public static final Item body = null;
    @GameRegistry.ObjectHolder("fabaokuozhan:dao_pao_04legs")
    public static final Item legs = null;
    @GameRegistry.ObjectHolder("fabaokuozhan:dao_pao_04boots")
    public static final Item boots = null;

    public ItemDaoPao04(ElementsFabaokuozhanMod instance) {
        super(instance, 406);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void initElements() {
        ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("DAO_PAO_04", "fabaokuozhan:11", 25818, new int[]{3, 6, 8, 3}, 0, (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("")), 0.0f);
        this.elements.items.add(() -> {
            return new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) { // from class: net.mcreator.fabaokuozhan.item.ItemDaoPao04.1
                @SideOnly(Side.CLIENT)
                public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
                    ModelBiped armorModel = new ModelBiped();
                    armorModel.field_78116_c = new Modelfabao1801().bone;
                    armorModel.field_78117_n = living.func_70093_af();
                    armorModel.field_78093_q = living.func_184218_aH();
                    armorModel.field_78091_s = living.func_70631_g_();
                    return armorModel;
                }

                public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
                    return "fabaokuozhan:textures/fabao1801.png";
                }
            }.func_77655_b("dao_pao_04helmet").setRegistryName("dao_pao_04helmet").func_77637_a(TabLianqi.tab);
        });
        this.elements.items.add(() -> {
            return new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) { // from class: net.mcreator.fabaokuozhan.item.ItemDaoPao04.2
                @SideOnly(Side.CLIENT)
                public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
                    ModelBiped armorModel = new ModelBiped();
                    armorModel.field_78115_e = new Modelfabao1802().bone;
                    armorModel.field_78117_n = living.func_70093_af();
                    armorModel.field_78093_q = living.func_184218_aH();
                    armorModel.field_78091_s = living.func_70631_g_();
                    return armorModel;
                }

                public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
                    return "fabaokuozhan:textures/fabao1802.png";
                }
            }.func_77655_b("dao_pao_04body").setRegistryName("dao_pao_04body").func_77637_a(TabLianqi.tab);
        });
        this.elements.items.add(() -> {
            return new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) { // from class: net.mcreator.fabaokuozhan.item.ItemDaoPao04.3
                @SideOnly(Side.CLIENT)
                public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
                    ModelBiped armorModel = new ModelBiped();
                    armorModel.field_178722_k = new Modelfabao1803().left;
                    armorModel.field_178721_j = new Modelfabao1803().right;
                    armorModel.field_78117_n = living.func_70093_af();
                    armorModel.field_78093_q = living.func_184218_aH();
                    armorModel.field_78091_s = living.func_70631_g_();
                    return armorModel;
                }

                public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
                    return "fabaokuozhan:textures/fabao1803.png";
                }
            }.func_77655_b("dao_pao_04legs").setRegistryName("dao_pao_04legs").func_77637_a(TabLianqi.tab);
        });
        this.elements.items.add(() -> {
            return new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) { // from class: net.mcreator.fabaokuozhan.item.ItemDaoPao04.4
                @SideOnly(Side.CLIENT)
                public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
                    ModelBiped armorModel = new ModelBiped();
                    armorModel.field_178722_k = new Modelfabao1804().left;
                    armorModel.field_178721_j = new Modelfabao1804().right;
                    armorModel.field_78117_n = living.func_70093_af();
                    armorModel.field_78093_q = living.func_184218_aH();
                    armorModel.field_78091_s = living.func_70631_g_();
                    return armorModel;
                }

                public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
                    return "fabaokuozhan:textures/fabao1804.png";
                }
            }.func_77655_b("dao_pao_04boots").setRegistryName("dao_pao_04boots").func_77637_a(TabLianqi.tab);
        });
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("fabaokuozhan:dao_pao_04helmet", "inventory"));
        ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("fabaokuozhan:dao_pao_04body", "inventory"));
        ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("fabaokuozhan:dao_pao_04legs", "inventory"));
        ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("fabaokuozhan:dao_pao_04boots", "inventory"));
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemDaoPao04$Modelfabao1802.class */
    public static class Modelfabao1802 extends ModelBase {
        private final ModelRenderer bone;

        public Modelfabao1802() {
            this.field_78090_t = 205;
            this.field_78089_u = 98;
            this.bone = new ModelRenderer(this);
            this.bone.func_78793_a(0.0f, 0.0f, 0.0f);
            this.bone.field_78804_l.add(new ModelBox(this.bone, 153, 0, -5.0f, -0.2f, -3.0f, 10, 6, 6, 0.0f, false));
            this.bone.field_78804_l.add(new ModelBox(this.bone, 153, 12, -4.5f, 5.1f, -2.5f, 9, 7, 5, 0.0f, false));
            this.bone.field_78804_l.add(new ModelBox(this.bone, 179, 1, -2.0f, 3.0f, -3.5f, 4, 4, 1, 0.0f, false));
            this.bone.field_78804_l.add(new ModelBox(this.bone, 153, 24, -10.0f, -2.0f, -3.5f, 6, 6, 7, 0.0f, false));
            this.bone.field_78804_l.add(new ModelBox(this.bone, 185, 14, -9.5f, 0.0f, -2.5f, 5, 5, 5, 0.0f, false));
            this.bone.field_78804_l.add(new ModelBox(this.bone, 179, 24, 4.0f, -2.0f, -3.5f, 6, 6, 7, 0.0f, false));
            this.bone.field_78804_l.add(new ModelBox(this.bone, 185, 4, 4.5f, 0.0f, -2.5f, 5, 5, 5, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.bone.func_78785_a(f5);
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

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemDaoPao04$Modelfabao1804.class */
    public static class Modelfabao1804 extends ModelBase {
        private final ModelRenderer right;
        private final ModelRenderer left;

        public Modelfabao1804() {
            this.field_78090_t = 26;
            this.field_78089_u = 19;
            this.right = new ModelRenderer(this);
            this.right.func_78793_a(0.0f, 24.0f, 0.0f);
            this.right.field_78804_l.add(new ModelBox(this.right, 0, 0, -5.0f, 6.0f, -2.5f, 5, 4, 5, 0.0f, false));
            this.right.field_78804_l.add(new ModelBox(this.right, 0, 9, -5.0f, 10.0f, -5.0f, 5, 2, 8, 0.0f, false));
            this.right.field_78804_l.add(new ModelBox(this.right, 15, 1, -4.0f, 9.0f, -5.5f, 3, 2, 2, 0.0f, false));
            this.left = new ModelRenderer(this);
            this.left.func_78793_a(0.0f, 24.0f, 0.0f);
            this.left.field_78804_l.add(new ModelBox(this.left, 15, 1, 1.0f, 9.0f, -5.5f, 3, 2, 2, 0.0f, false));
            this.left.field_78804_l.add(new ModelBox(this.left, 0, 9, 0.0f, 10.0f, -5.0f, 5, 2, 8, 0.0f, false));
            this.left.field_78804_l.add(new ModelBox(this.left, 0, 0, 0.0f, 6.0f, -2.5f, 5, 4, 5, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.right.func_78785_a(f5);
            this.left.func_78785_a(f5);
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

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemDaoPao04$Modelfabao1803.class */
    public static class Modelfabao1803 extends ModelBase {
        private final ModelRenderer left;
        private final ModelRenderer right;

        public Modelfabao1803() {
            this.field_78090_t = 114;
            this.field_78089_u = 71;
            this.left = new ModelRenderer(this);
            this.left.func_78793_a(0.0f, 24.0f, 0.0f);
            this.left.field_78804_l.add(new ModelBox(this.left, 70, 59, 0.0f, -1.0f, -3.0f, 6, 6, 6, 0.0f, false));
            this.left.field_78804_l.add(new ModelBox(this.left, 70, 38, -5.0f, -4.0f, -3.0f, 5, 3, 6, 0.0f, false));
            this.right = new ModelRenderer(this);
            this.right.func_78793_a(0.0f, 24.0f, 0.0f);
            this.right.field_78804_l.add(new ModelBox(this.right, 70, 47, -6.0f, -1.0f, -3.0f, 6, 6, 6, 0.0f, false));
            this.right.field_78804_l.add(new ModelBox(this.right, 92, 38, 0.0f, -4.0f, -3.0f, 5, 3, 6, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.left.func_78785_a(f5);
            this.right.func_78785_a(f5);
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

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemDaoPao04$Modelfabao1801.class */
    public static class Modelfabao1801 extends ModelBase {
        private final ModelRenderer bone;
        private final ModelRenderer bone2;
        private final ModelRenderer bone3;

        public Modelfabao1801() {
            this.field_78090_t = 48;
            this.field_78089_u = 36;
            this.bone = new ModelRenderer(this);
            this.bone.func_78793_a(0.0f, 24.0f, 0.0f);
            this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 15, -2.0f, -9.0f, 0.0f, 4, 1, 2, 0.0f, false));
            this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 18, -1.0f, -9.0f, 2.0f, 2, 1, 1, 0.0f, false));
            this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 18, -1.0f, -9.0f, -1.0f, 2, 1, 1, 0.0f, false));
            this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 12, -1.0f, -10.0f, 0.0f, 2, 1, 2, 0.0f, false));
            this.bone.field_78804_l.add(new ModelBox(this.bone, 12, 14, -1.0f, -12.0f, -2.0f, 2, 2, 2, 0.0f, false));
            this.bone2 = new ModelRenderer(this);
            this.bone2.func_78793_a(-1.0f, -2.0f, 2.0f);
            setRotationAngle(this.bone2, 0.0f, 1.0472f, 0.0f);
            this.bone.func_78792_a(this.bone2);
            this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 20, -10.0f, -19.0f, 0.0f, 10, 16, 0, 0.0f, false));
            this.bone3 = new ModelRenderer(this);
            this.bone3.func_78793_a(1.0f, -2.0f, 2.0f);
            setRotationAngle(this.bone3, 0.0f, 2.0944f, 0.0f);
            this.bone.func_78792_a(this.bone3);
            this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 20, -10.0f, -19.0f, 0.0f, 10, 16, 0, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.bone.func_78785_a(f5);
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
