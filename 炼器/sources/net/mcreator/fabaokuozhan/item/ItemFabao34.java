package net.mcreator.fabaokuozhan.item;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.creativetab.TabLianqi;
import net.mcreator.fabaokuozhan.procedure.ProcedureFabao34taozhuang;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemFabao34.class */
public class ItemFabao34 extends ElementsFabaokuozhanMod.ModElement {
    @GameRegistry.ObjectHolder("fabaokuozhan:fabao34helmet")
    public static final Item helmet = null;
    @GameRegistry.ObjectHolder("fabaokuozhan:fabao34body")
    public static final Item body = null;
    @GameRegistry.ObjectHolder("fabaokuozhan:fabao34legs")
    public static final Item legs = null;
    @GameRegistry.ObjectHolder("fabaokuozhan:fabao34boots")
    public static final Item boots = null;

    public ItemFabao34(ElementsFabaokuozhanMod instance) {
        super(instance, 33);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void initElements() {
        ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("FABAO34", "fabaokuozhan:fabao3402", 13363, new int[]{3, 6, 8, 3}, 0, (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("")), 0.0f);
        this.elements.items.add(() -> {
            return new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) { // from class: net.mcreator.fabaokuozhan.item.ItemFabao34.1
                @SideOnly(Side.CLIENT)
                public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
                    ModelBiped armorModel = new ModelBiped();
                    armorModel.field_78116_c = new Modelfabao2601().head;
                    armorModel.field_78117_n = living.func_70093_af();
                    armorModel.field_78093_q = living.func_184218_aH();
                    armorModel.field_78091_s = living.func_70631_g_();
                    return armorModel;
                }

                public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
                    return "fabaokuozhan:textures/fabao3401.png";
                }

                public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
                    super.onArmorTick(world, entity, itemstack);
                    int i = (int) entity.field_70165_t;
                    int i2 = (int) entity.field_70163_u;
                    int i3 = (int) entity.field_70161_v;
                    Map $_dependencies = new HashMap();
                    $_dependencies.put("entity", entity);
                    ProcedureFabao34taozhuang.executeProcedure($_dependencies);
                }
            }.func_77655_b("fabao34helmet").setRegistryName("fabao34helmet").func_77637_a(TabLianqi.tab);
        });
        this.elements.items.add(() -> {
            return new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) { // from class: net.mcreator.fabaokuozhan.item.ItemFabao34.2
                public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
                    int i = (int) entity.field_70165_t;
                    int i2 = (int) entity.field_70163_u;
                    int i3 = (int) entity.field_70161_v;
                    Map $_dependencies = new HashMap();
                    $_dependencies.put("entity", entity);
                    ProcedureFabao34taozhuang.executeProcedure($_dependencies);
                }
            }.func_77655_b("fabao34body").setRegistryName("fabao34body").func_77637_a(TabLianqi.tab);
        });
        this.elements.items.add(() -> {
            return new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) { // from class: net.mcreator.fabaokuozhan.item.ItemFabao34.3
                public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
                    int i = (int) entity.field_70165_t;
                    int i2 = (int) entity.field_70163_u;
                    int i3 = (int) entity.field_70161_v;
                    Map $_dependencies = new HashMap();
                    $_dependencies.put("entity", entity);
                    ProcedureFabao34taozhuang.executeProcedure($_dependencies);
                }
            }.func_77655_b("fabao34legs").setRegistryName("fabao34legs").func_77637_a(TabLianqi.tab);
        });
        this.elements.items.add(() -> {
            return new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) { // from class: net.mcreator.fabaokuozhan.item.ItemFabao34.4
                public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
                    int i = (int) entity.field_70165_t;
                    int i2 = (int) entity.field_70163_u;
                    int i3 = (int) entity.field_70161_v;
                    Map $_dependencies = new HashMap();
                    $_dependencies.put("entity", entity);
                    ProcedureFabao34taozhuang.executeProcedure($_dependencies);
                }
            }.func_77655_b("fabao34boots").setRegistryName("fabao34boots").func_77637_a(TabLianqi.tab);
        });
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("fabaokuozhan:fabao34helmet", "inventory"));
        ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("fabaokuozhan:fabao34body", "inventory"));
        ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("fabaokuozhan:fabao34legs", "inventory"));
        ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("fabaokuozhan:fabao34boots", "inventory"));
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemFabao34$Modelfabao2601.class */
    public static class Modelfabao2601 extends ModelBase {
        private final ModelRenderer head;
        private final ModelRenderer bone2;
        private final ModelRenderer bone;
        private final ModelRenderer bone3;

        public Modelfabao2601() {
            this.field_78090_t = 72;
            this.field_78089_u = 56;
            this.head = new ModelRenderer(this);
            this.head.func_78793_a(0.0f, 24.0f, 0.0f);
            this.bone2 = new ModelRenderer(this);
            this.bone2.func_78793_a(0.0f, -15.0f, -1.0f);
            setRotationAngle(this.bone2, 0.7854f, 0.0f, 0.0f);
            this.head.func_78792_a(this.bone2);
            this.bone2.field_78804_l.add(new ModelBox(this.bone2, 28, 32, -4.0f, -0.75f, -8.75f, 8, 0, 8, 0.0f, false));
            this.bone = new ModelRenderer(this);
            this.bone.func_78793_a(0.0f, 0.0f, 0.0f);
            this.head.func_78792_a(this.bone);
            this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 32, -4.5f, -10.0f, -4.5f, 9, 4, 9, 0.0f, false));
            this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 45, -4.0f, -15.0f, -2.0f, 8, 5, 6, 0.0f, false));
            this.bone3 = new ModelRenderer(this);
            this.bone3.func_78793_a(0.0f, -6.0f, 5.0f);
            setRotationAngle(this.bone3, 0.1745f, 0.0f, 0.0f);
            this.head.func_78792_a(this.bone3);
            this.bone3.field_78804_l.add(new ModelBox(this.bone3, 52, 32, -5.0f, -1.0f, -0.5f, 10, 20, 0, 0.0f, false));
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
