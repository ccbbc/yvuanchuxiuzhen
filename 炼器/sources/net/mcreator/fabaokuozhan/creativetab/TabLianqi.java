package net.mcreator.fabaokuozhan.creativetab;

import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.block.BlockLianqi09;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/creativetab/TabLianqi.class */
public class TabLianqi extends ElementsFabaokuozhanMod.ModElement {
    public static CreativeTabs tab;

    public TabLianqi(ElementsFabaokuozhanMod instance) {
        super(instance, 114);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void initElements() {
        tab = new CreativeTabs("tablianqi") { // from class: net.mcreator.fabaokuozhan.creativetab.TabLianqi.1
            @SideOnly(Side.CLIENT)
            public ItemStack func_78016_d() {
                return new ItemStack(BlockLianqi09.block, 1);
            }

            @SideOnly(Side.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
