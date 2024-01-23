package net.mcreator.yvanchuyaoshou.item;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityGuLang0401;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/item/ItemAirArmor.class */
public class ItemAirArmor extends ElementsYvanchuyaoshouMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuyaoshou:air_armorhelmet")
    public static final Item helmet = null;
    @GameRegistry.ObjectHolder("yvanchuyaoshou:air_armorbody")
    public static final Item body = null;
    @GameRegistry.ObjectHolder("yvanchuyaoshou:air_armorlegs")
    public static final Item legs = null;
    @GameRegistry.ObjectHolder("yvanchuyaoshou:air_armorboots")
    public static final Item boots = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public ItemAirArmor(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityGuLang0401.ENTITYID);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("AIR_ARMOR", "yvanchuyaoshou:air_", 0, new int[]{4, 0, 0, 0}, 9, (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("")), 0.0f);
        this.elements.items.add(() -> {
            return new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).func_77655_b("air_armorboots").setRegistryName("air_armorboots").func_77637_a((CreativeTabs) null);
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("yvanchuyaoshou:air_armorboots", "inventory"));
    }
}
