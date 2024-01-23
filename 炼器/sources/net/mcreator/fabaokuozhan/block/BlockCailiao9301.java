package net.mcreator.fabaokuozhan.block;

import com.google.common.base.Predicate;
import java.util.Random;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.creativetab.TabLianqi;
import net.mcreator.fabaokuozhan.item.ItemCailiao93;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/block/BlockCailiao9301.class */
public class BlockCailiao9301 extends ElementsFabaokuozhanMod.ModElement {
    @GameRegistry.ObjectHolder("fabaokuozhan:cailiao9301")
    public static final Block block = null;

    public BlockCailiao9301(ElementsFabaokuozhanMod instance) {
        super(instance, 59);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustom().setRegistryName("cailiao9301");
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("fabaokuozhan:cailiao9301", "inventory"));
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
        boolean dimensionCriteria = false;
        if (dimID == 0) {
            dimensionCriteria = true;
        }
        if (!dimensionCriteria) {
            return;
        }
        for (int i = 0; i < 1; i++) {
            int x = chunkX + random.nextInt(16);
            int y = random.nextInt(30) + 30;
            int z = chunkZ + random.nextInt(16);
            new WorldGenMinable(block.func_176223_P(), 3, new Predicate<IBlockState>() { // from class: net.mcreator.fabaokuozhan.block.BlockCailiao9301.1
                public boolean apply(IBlockState blockAt) {
                    boolean blockCriteria = false;
                    if (blockAt.func_177230_c() == Blocks.field_150348_b.func_176223_P().func_177230_c()) {
                        blockCriteria = true;
                    }
                    return blockCriteria;
                }
            }).func_180709_b(world, random, new BlockPos(x, y, z));
        }
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/block/BlockCailiao9301$BlockCustom.class */
    public static class BlockCustom extends Block {
        public BlockCustom() {
            super(Material.field_151576_e);
            func_149663_c("cailiao9301");
            func_149672_a(SoundType.field_185851_d);
            setHarvestLevel("pickaxe", 5);
            func_149711_c(5.0f);
            func_149752_b(40.0f);
            func_149715_a(0.0f);
            func_149713_g(255);
            func_149647_a(TabLianqi.tab);
        }

        public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
            drops.add(new ItemStack(ItemCailiao93.block, 1));
        }
    }
}
