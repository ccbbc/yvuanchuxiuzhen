package net.mcreator.fabaokuozhan.item;

import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemCaiitem06.class */
public class ItemCaiitem06 extends ElementsFabaokuozhanMod.ModElement {
    @GameRegistry.ObjectHolder("fabaokuozhan:caiitem06")
    public static final Item block = null;

    public ItemCaiitem06(ElementsFabaokuozhanMod instance) {
        super(instance, 213);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemFoodCustom();
        });
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("fabaokuozhan:caiitem06", "inventory"));
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemCaiitem06$ItemFoodCustom.class */
    public static class ItemFoodCustom extends ItemFood {
        public ItemFoodCustom() {
            super(0, 0.0f, true);
            func_77655_b("caiitem06");
            setRegistryName("caiitem06");
            func_77848_i();
            func_77637_a(null);
            func_77625_d(64);
        }

        @SideOnly(Side.CLIENT)
        public boolean func_77636_d(ItemStack itemstack) {
            return true;
        }

        public EnumAction func_77661_b(ItemStack par1ItemStack) {
            return EnumAction.EAT;
        }
    }
}
