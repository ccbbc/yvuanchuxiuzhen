package net.mcreator.yvanchujiguan.creativetab;

import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.mcreator.yvanchujiguan.item.ItemGongFa2;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/creativetab/TabGongfakuozhan.class */
public class TabGongfakuozhan extends ElementsYvanchujiguanMod.ModElement {
    public static CreativeTabs tab;

    public TabGongfakuozhan(ElementsYvanchujiguanMod instance) {
        super(instance, 34);
    }

    @Override // net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod.ModElement
    public void initElements() {
        tab = new CreativeTabs("tabgongfakuozhan") { // from class: net.mcreator.yvanchujiguan.creativetab.TabGongfakuozhan.1
            @SideOnly(Side.CLIENT)
            public ItemStack func_78016_d() {
                return new ItemStack(ItemGongFa2.block, 1);
            }

            @SideOnly(Side.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
