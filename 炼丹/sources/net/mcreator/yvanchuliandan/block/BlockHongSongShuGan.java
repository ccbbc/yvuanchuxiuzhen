package net.mcreator.yvanchuliandan.block;

import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/block/BlockHongSongShuGan.class */
public class BlockHongSongShuGan extends ElementsYvanchuliandanMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuliandan:hong_song_shu_gan")
    public static final Block block = null;

    public BlockHongSongShuGan(ElementsYvanchuliandanMod instance) {
        super(instance, 726);
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustom().setRegistryName("hong_song_shu_gan");
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("yvanchuliandan:hong_song_shu_gan", "inventory"));
    }

    /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/block/BlockHongSongShuGan$BlockCustom.class */
    public static class BlockCustom extends Block {
        public BlockCustom() {
            super(Material.field_151575_d);
            func_149663_c("hong_song_shu_gan");
            func_149672_a(SoundType.field_185848_a);
            func_149711_c(1.0f);
            func_149752_b(10.0f);
            func_149715_a(0.0f);
            func_149713_g(0);
            func_149647_a(CreativeTabs.field_78031_c);
        }

        public boolean func_149662_c(IBlockState state) {
            return false;
        }
    }
}
