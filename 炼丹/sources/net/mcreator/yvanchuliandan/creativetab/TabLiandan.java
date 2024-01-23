package net.mcreator.yvanchuliandan.creativetab;

import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.item.ItemDanYao56;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/creativetab/TabLiandan.class */
public class TabLiandan extends ElementsYvanchuliandanMod.ModElement {
    public static CreativeTabs tab;

    public TabLiandan(ElementsYvanchuliandanMod instance) {
        super(instance, 268);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [net.mcreator.yvanchuliandan.creativetab.TabLiandan$1] */
    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    public void initElements() {
        tab = new CreativeTabs("tabliandan") { // from class: net.mcreator.yvanchuliandan.creativetab.TabLiandan.1
            @SideOnly(Side.CLIENT)
            public ItemStack func_78016_d() {
                return new ItemStack(ItemDanYao56.block, 1);
            }

            @SideOnly(Side.CLIENT)
            public boolean hasSearchBar() {
                return true;
            }
        }.func_78025_a("item_search.png");
    }
}
