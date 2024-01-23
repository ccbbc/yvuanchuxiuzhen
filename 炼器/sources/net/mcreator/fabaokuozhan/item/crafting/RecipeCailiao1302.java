package net.mcreator.fabaokuozhan.item.crafting;

import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.block.BlockCailiao1301;
import net.mcreator.fabaokuozhan.item.ItemCailiao13;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/crafting/RecipeCailiao1302.class */
public class RecipeCailiao1302 extends ElementsFabaokuozhanMod.ModElement {
    public RecipeCailiao1302(ElementsFabaokuozhanMod instance) {
        super(instance, 182);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void init(FMLInitializationEvent event) {
        GameRegistry.addSmelting(new ItemStack(BlockCailiao1301.block, 1), new ItemStack(ItemCailiao13.block, 1), 1.0f);
    }
}
