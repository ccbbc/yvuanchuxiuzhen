package net.mcreator.yvanchuxiuzhenfulu.item.crafting;

import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockZhushakuang;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemZhuSha;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/item/crafting/RecipeZhushalianzhi.class */
public class RecipeZhushalianzhi extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public RecipeZhushalianzhi(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 300);
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    public void init(FMLInitializationEvent event) {
        GameRegistry.addSmelting(new ItemStack(BlockZhushakuang.block, 1), new ItemStack(ItemZhuSha.block, 1), 5.0f);
    }
}
