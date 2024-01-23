package net.mcreator.fabaokuozhan.item.crafting;

import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.block.BlockCailiao2501;
import net.mcreator.fabaokuozhan.item.ItemCailiao25;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/crafting/RecipeCailiao2502.class */
public class RecipeCailiao2502 extends ElementsFabaokuozhanMod.ModElement {
    public RecipeCailiao2502(ElementsFabaokuozhanMod instance) {
        super(instance, 187);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void init(FMLInitializationEvent event) {
        GameRegistry.addSmelting(new ItemStack(BlockCailiao2501.block, 1), new ItemStack(ItemCailiao25.block, 1), 1.0f);
    }
}
