package net.mcreator.fabaokuozhan.item;

import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.creativetab.TabLianqi;
import net.mcreator.fabaokuozhan.procedure.ProcedureChiYanDaoDangGongJuChuXianZaiShouZhongShi;
import net.mcreator.fabaokuozhan.procedure.ProcedureChiYanDaoDangShiTiBeiGongJuJiZhongShi;
import net.mcreator.fabaokuozhan.procedure.ProcedureChiYanDaoDangYouJianDianJiKongQiShi;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemChiYanDao.class */
public class ItemChiYanDao extends ElementsFabaokuozhanMod.ModElement {
    @GameRegistry.ObjectHolder("fabaokuozhan:chi_yan_dao")
    public static final Item block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public ItemChiYanDao(ElementsFabaokuozhanMod instance) {
        super(instance, 396);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemSword(EnumHelper.addToolMaterial("CHI_YAN_DAO", 1, 900, 4.0f, 20.0f, 0)) { // from class: net.mcreator.fabaokuozhan.item.ItemChiYanDao.1
                public Multimap<String, AttributeModifier> func_111205_h(EntityEquipmentSlot slot) {
                    Multimap multimap = super.func_111205_h(slot);
                    if (slot == EntityEquipmentSlot.MAINHAND) {
                        multimap.put(SharedMonsterAttributes.field_111264_e.func_111108_a(), new AttributeModifier(field_111210_e, "Weapon modifier", func_150931_i(), 0));
                        multimap.put(SharedMonsterAttributes.field_188790_f.func_111108_a(), new AttributeModifier(field_185050_h, "Weapon modifier", -3.0d, 0));
                    }
                    return multimap;
                }

                public Set<String> getToolClasses(ItemStack stack) {
                    HashMap ret = new HashMap();
                    ret.put("sword", 1);
                    return ret.keySet();
                }

                public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
                    ActionResult retval = super.func_77659_a(world, entity, hand);
                    ItemStack itemstack = (ItemStack) retval.func_188398_b();
                    int i = (int) entity.field_70165_t;
                    int i2 = (int) entity.field_70163_u;
                    int i3 = (int) entity.field_70161_v;
                    ItemChiYanDao.$_dependencies.put("entity", entity);
                    ItemChiYanDao.$_dependencies.put("itemstack", itemstack);
                    ProcedureChiYanDaoDangYouJianDianJiKongQiShi.executeProcedure(ItemChiYanDao.$_dependencies);
                    return retval;
                }

                public boolean func_77644_a(ItemStack itemstack, EntityLivingBase entity, EntityLivingBase sourceentity) {
                    super.func_77644_a(itemstack, entity, sourceentity);
                    int i = (int) entity.field_70165_t;
                    int i2 = (int) entity.field_70163_u;
                    int i3 = (int) entity.field_70161_v;
                    World world = entity.field_70170_p;
                    ItemChiYanDao.$_dependencies.put("sourceentity", sourceentity);
                    ProcedureChiYanDaoDangShiTiBeiGongJuJiZhongShi.executeProcedure(ItemChiYanDao.$_dependencies);
                    return true;
                }

                public void func_77663_a(ItemStack itemstack, World world, Entity entity, int slot, boolean par5) {
                    super.func_77663_a(itemstack, world, entity, slot, par5);
                    int i = (int) entity.field_70165_t;
                    int i2 = (int) entity.field_70163_u;
                    int i3 = (int) entity.field_70161_v;
                    if ((entity instanceof EntityLivingBase) && ((EntityLivingBase) entity).func_184614_ca().equals(itemstack)) {
                        ItemChiYanDao.$_dependencies.put("itemstack", itemstack);
                        ProcedureChiYanDaoDangGongJuChuXianZaiShouZhongShi.executeProcedure(ItemChiYanDao.$_dependencies);
                    }
                }
            }.func_77655_b("chi_yan_dao").setRegistryName("chi_yan_dao").func_77637_a(TabLianqi.tab);
        });
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("fabaokuozhan:chi_yan_dao", "inventory"));
    }
}
