package net.mcreator.fabaokuozhan.item;

import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.creativetab.TabLianqi;
import net.mcreator.fabaokuozhan.procedure.ProcedureQingZuFengYunJianDangGongJuChuXianZaiWuPinLanShi;
import net.mcreator.fabaokuozhan.procedure.ProcedureQingZuFengYunJianDangShiTiBeiGongJuJiZhongShi;
import net.mcreator.fabaokuozhan.procedure.ProcedureQingZuFengYunJianDangYouJianDianJiKongQiShi;
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
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemQingZuFengYunJian.class */
public class ItemQingZuFengYunJian extends ElementsFabaokuozhanMod.ModElement {
    @GameRegistry.ObjectHolder("fabaokuozhan:qing_zu_feng_yun_jian")
    public static final Item block = null;

    public ItemQingZuFengYunJian(ElementsFabaokuozhanMod instance) {
        super(instance, 30);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemSword(EnumHelper.addToolMaterial("QING_ZU_FENG_YUN_JIAN", 1, 0, 4.0f, -3.0f, 0)) { // from class: net.mcreator.fabaokuozhan.item.ItemQingZuFengYunJian.1
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
                    Map $_dependencies = new HashMap();
                    $_dependencies.put("entity", entity);
                    $_dependencies.put("itemstack", itemstack);
                    ProcedureQingZuFengYunJianDangYouJianDianJiKongQiShi.executeProcedure($_dependencies);
                    return retval;
                }

                public boolean func_77644_a(ItemStack itemstack, EntityLivingBase entity, EntityLivingBase sourceentity) {
                    super.func_77644_a(itemstack, entity, sourceentity);
                    int i = (int) entity.field_70165_t;
                    int i2 = (int) entity.field_70163_u;
                    int i3 = (int) entity.field_70161_v;
                    World world = entity.field_70170_p;
                    Map $_dependencies = new HashMap();
                    ProcedureQingZuFengYunJianDangShiTiBeiGongJuJiZhongShi.executeProcedure($_dependencies);
                    return true;
                }

                public void func_77663_a(ItemStack itemstack, World world, Entity entity, int slot, boolean par5) {
                    super.func_77663_a(itemstack, world, entity, slot, par5);
                    int i = (int) entity.field_70165_t;
                    int i2 = (int) entity.field_70163_u;
                    int i3 = (int) entity.field_70161_v;
                    if ((entity instanceof EntityLivingBase) && ((EntityLivingBase) entity).func_184614_ca().equals(itemstack)) {
                        Map $_dependencies = new HashMap();
                        $_dependencies.put("itemstack", itemstack);
                        ProcedureQingZuFengYunJianDangGongJuChuXianZaiWuPinLanShi.executeProcedure($_dependencies);
                    }
                }
            }.func_77655_b("qing_zu_feng_yun_jian").setRegistryName("qing_zu_feng_yun_jian").func_77637_a(TabLianqi.tab);
        });
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("fabaokuozhan:qing_zu_feng_yun_jian", "inventory"));
    }
}
