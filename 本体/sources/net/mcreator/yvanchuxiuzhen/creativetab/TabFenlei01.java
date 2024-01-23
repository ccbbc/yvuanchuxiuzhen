package net.mcreator.yvanchuxiuzhen.creativetab;

import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.item.ItemLingshi09;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/creativetab/TabFenlei01.class */
public class TabFenlei01 extends ElementsYvanchuxiuzhenMod.ModElement {
    public static CreativeTabs tab;

    public TabFenlei01(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 109);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        tab = new CreativeTabs("tabfenlei01") { // from class: net.mcreator.yvanchuxiuzhen.creativetab.TabFenlei01.1
            @SideOnly(Side.CLIENT)
            public ItemStack func_78016_d() {
                return new ItemStack(ItemLingshi09.block, 1);
            }

            @SideOnly(Side.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
