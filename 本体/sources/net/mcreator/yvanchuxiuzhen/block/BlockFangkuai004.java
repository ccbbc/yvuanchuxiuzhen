package net.mcreator.yvanchuxiuzhen.block;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.creativetab.TabFenlei01;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockFangkuai004.class */
public class BlockFangkuai004 extends ElementsYvanchuxiuzhenMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:fangkuai004")
    public static final Block block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public BlockFangkuai004(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 29);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustom().setRegistryName("fangkuai004");
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("yvanchuxiuzhen:fangkuai004", "inventory"));
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockFangkuai004$BlockCustom.class */
    public static class BlockCustom extends BlockStairs {
        public BlockCustom() {
            super(new Block(Material.field_151576_e).func_176223_P());
            func_149663_c("fangkuai004");
            func_149672_a(SoundType.field_185851_d);
            setHarvestLevel("pickaxe", 1);
            func_149711_c(10.0f);
            func_149752_b(1000.0f);
            func_149715_a(0.26666668f);
            func_149713_g(0);
            func_149647_a(TabFenlei01.tab);
        }

        public boolean func_149662_c(IBlockState state) {
            return false;
        }
    }
}
