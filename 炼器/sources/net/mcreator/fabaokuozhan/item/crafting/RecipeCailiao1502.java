package net.mcreator.fabaokuozhan.item.crafting;

import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.block.BlockCailiao1501;
import net.mcreator.fabaokuozhan.item.ItemCailiao15;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/crafting/RecipeCailiao1502.class */
public class RecipeCailiao1502 extends ElementsFabaokuozhanMod.ModElement {
    public RecipeCailiao1502(ElementsFabaokuozhanMod instance) {
        super(instance, 183);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void init(FMLInitializationEvent event) {
        GameRegistry.addSmelting(new ItemStack(BlockCailiao1501.block, 1), new ItemStack(ItemCailiao15.block, 1), 1.0f);
    }
}
