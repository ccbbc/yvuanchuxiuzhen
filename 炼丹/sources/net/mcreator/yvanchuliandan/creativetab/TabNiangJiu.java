package net.mcreator.yvanchuliandan.creativetab;

import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemJiuJu01;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/creativetab/TabNiangJiu.class */
public class TabNiangJiu extends ElementsYvanchuliandanMod.ModElement {
    public static CreativeTabs tab;

    public TabNiangJiu(ElementsYvanchuliandanMod instance) {
        super(instance, 686);
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    public void initElements() {
        tab = new CreativeTabs("tabniang_jiu") { // from class: net.mcreator.yvanchuliandan.creativetab.TabNiangJiu.1
            @SideOnly(Side.CLIENT)
            public ItemStack func_78016_d() {
                return new ItemStack(ItemJiuJu01.block, 1);
            }

            @SideOnly(Side.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
