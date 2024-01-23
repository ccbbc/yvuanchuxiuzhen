package net.mcreator.yvanchuyaoshou.creativetab;

import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.item.ItemYaodan0209;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/creativetab/TabYaoshou.class */
public class TabYaoshou extends ElementsYvanchuyaoshouMod.ModElement {
    public static CreativeTabs tab;

    public TabYaoshou(ElementsYvanchuyaoshouMod instance) {
        super(instance, 99);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        tab = new CreativeTabs("tabyaoshou") { // from class: net.mcreator.yvanchuyaoshou.creativetab.TabYaoshou.1
            @SideOnly(Side.CLIENT)
            public ItemStack func_78016_d() {
                return new ItemStack(ItemYaodan0209.block, 1);
            }

            @SideOnly(Side.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
