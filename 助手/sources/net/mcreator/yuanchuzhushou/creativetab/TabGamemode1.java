package net.mcreator.yuanchuzhushou.creativetab;

import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.mcreator.yuanchuzhushou.item.ItemZhuShou;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/creativetab/TabGamemode1.class */
public class TabGamemode1 extends ElementsYuanchuzhushouMod.ModElement {
    public static CreativeTabs tab;

    public TabGamemode1(ElementsYuanchuzhushouMod instance) {
        super(instance, 68);
    }

    @Override // net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod.ModElement
    public void initElements() {
        tab = new CreativeTabs("tabgamemode_1") { // from class: net.mcreator.yuanchuzhushou.creativetab.TabGamemode1.1
            @SideOnly(Side.CLIENT)
            public ItemStack func_78016_d() {
                return new ItemStack(ItemZhuShou.block, 1);
            }

            @SideOnly(Side.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
