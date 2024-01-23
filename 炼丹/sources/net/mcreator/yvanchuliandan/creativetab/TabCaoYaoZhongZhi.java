package net.mcreator.yvanchuliandan.creativetab;

import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemZhongZi11;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/creativetab/TabCaoYaoZhongZhi.class */
public class TabCaoYaoZhongZhi extends ElementsYvanchuliandanMod.ModElement {
    public static CreativeTabs tab;

    public TabCaoYaoZhongZhi(ElementsYvanchuliandanMod instance) {
        super(instance, 554);
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    public void initElements() {
        tab = new CreativeTabs("tabcao_yao_zhong_zhi") { // from class: net.mcreator.yvanchuliandan.creativetab.TabCaoYaoZhongZhi.1
            @SideOnly(Side.CLIENT)
            public ItemStack func_78016_d() {
                return new ItemStack(ItemZhongZi11.block, 1);
            }

            @SideOnly(Side.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
