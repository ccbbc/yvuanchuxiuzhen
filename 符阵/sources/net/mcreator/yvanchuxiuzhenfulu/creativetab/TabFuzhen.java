package net.mcreator.yvanchuxiuzhenfulu.creativetab;

import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemFuzhi;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/creativetab/TabFuzhen.class */
public class TabFuzhen extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public static CreativeTabs tab;

    public TabFuzhen(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 130);
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    public void initElements() {
        tab = new CreativeTabs("tabfuzhen") { // from class: net.mcreator.yvanchuxiuzhenfulu.creativetab.TabFuzhen.1
            @SideOnly(Side.CLIENT)
            public ItemStack func_78016_d() {
                return new ItemStack(ItemFuzhi.block, 1);
            }

            @SideOnly(Side.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
