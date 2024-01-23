package net.mcreator.fabaokuozhan.item;

import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.creativetab.TabLianqi;
import net.mcreator.fabaokuozhan.procedure.ProcedureFabao29ItemIsCraftedsmelted;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemFabao29.class */
public class ItemFabao29 extends ElementsFabaokuozhanMod.ModElement {
    @GameRegistry.ObjectHolder("fabaokuozhan:fabao29")
    public static final Item block = null;

    public ItemFabao29(ElementsFabaokuozhanMod instance) {
        super(instance, 1);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemSword(EnumHelper.addToolMaterial("FABAO29", 1, 300, 4.0f, 3.0f, 0)) { // from class: net.mcreator.fabaokuozhan.item.ItemFabao29.1
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

                public void func_77622_d(ItemStack itemstack, World world, EntityPlayer entity) {
                    super.func_77622_d(itemstack, world, entity);
                    int i = (int) entity.field_70165_t;
                    int i2 = (int) entity.field_70163_u;
                    int i3 = (int) entity.field_70161_v;
                    Map $_dependencies = new HashMap();
                    ProcedureFabao29ItemIsCraftedsmelted.executeProcedure($_dependencies);
                }
            }.func_77655_b("fabao29").setRegistryName("fabao29").func_77637_a(TabLianqi.tab);
        });
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("fabaokuozhan:fabao29", "inventory"));
    }
}
