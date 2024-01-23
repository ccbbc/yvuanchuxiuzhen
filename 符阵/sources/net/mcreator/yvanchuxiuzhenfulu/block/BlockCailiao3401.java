package net.mcreator.yvanchuxiuzhenfulu.block;

import java.util.Random;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemCailiao34;
import net.minecraft.block.Block;
import net.minecraft.block.BlockReed;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenReed;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/block/BlockCailiao3401.class */
public class BlockCailiao3401 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhenfulu:cailiao3401")
    public static final Block block = null;

    public BlockCailiao3401(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 159);
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustomFlower();
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("yvanchuxiuzhenfulu:cailiao3401", "inventory"));
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [net.mcreator.yvanchuxiuzhenfulu.block.BlockCailiao3401$1] */
    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
        boolean dimensionCriteria = false;
        if (dimID == 0) {
            dimensionCriteria = true;
        }
        if (!dimensionCriteria) {
            return;
        }
        boolean biomeCriteria = false;
        Biome biome = world.func_180494_b(new BlockPos(chunkX, 128, chunkZ));
        if (((ResourceLocation) Biome.field_185377_q.func_177774_c(biome)).equals(new ResourceLocation("plains"))) {
            biomeCriteria = true;
        }
        if (((ResourceLocation) Biome.field_185377_q.func_177774_c(biome)).equals(new ResourceLocation("forest"))) {
            biomeCriteria = true;
        }
        if (!biomeCriteria) {
            return;
        }
        for (int i = 0; i < 5; i++) {
            int l6 = chunkX + random.nextInt(16) + 8;
            int i11 = random.nextInt(128);
            int l14 = chunkZ + random.nextInt(16) + 8;
            new WorldGenReed() { // from class: net.mcreator.yvanchuxiuzhenfulu.block.BlockCailiao3401.1
                public boolean func_180709_b(World world2, Random random2, BlockPos pos) {
                    for (int i2 = 0; i2 < 20; i2++) {
                        BlockPos blockpos1 = pos.func_177982_a(random2.nextInt(4) - random2.nextInt(4), 0, random2.nextInt(4) - random2.nextInt(4));
                        if (world2.func_175623_d(blockpos1)) {
                            blockpos1.func_177977_b();
                            int j = 1 + random2.nextInt(random2.nextInt(6) + 1);
                            int j2 = Math.min(6, j);
                            for (int k = 0; k < j2; k++) {
                                if (BlockCailiao3401.block.func_176354_d(world2, blockpos1)) {
                                    world2.func_180501_a(blockpos1.func_177981_b(k), BlockCailiao3401.block.func_176223_P(), 2);
                                }
                            }
                        }
                    }
                    return true;
                }
            }.func_180709_b(world, random, new BlockPos(l6, i11, l14));
        }
    }

    /* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/block/BlockCailiao3401$BlockCustomFlower.class */
    public static class BlockCustomFlower extends BlockReed {
        public BlockCustomFlower() {
            func_149672_a(SoundType.field_185850_c);
            func_149647_a(null);
            func_149711_c(0.0f);
            func_149752_b(0.0f);
            func_149715_a(0.0f);
            func_149663_c("cailiao3401");
            setRegistryName("cailiao3401");
        }

        public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
            drops.add(new ItemStack(ItemCailiao34.block, 1));
        }

        public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
            return new ItemStack(Item.func_150898_a(this), 1, func_180651_a(state));
        }

        public MapColor func_180659_g(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
            return MapColor.field_151661_c;
        }

        public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
            return EnumPlantType.Plains;
        }

        public boolean func_176196_c(World world, BlockPos pos) {
            Block block2 = world.func_180495_p(pos.func_177977_b()).func_177230_c();
            return block2.canSustainPlant(world.func_180495_p(pos.func_177977_b()), world, pos.func_177977_b(), EnumFacing.UP, this) || block2 == BlockCailiao3401.block;
        }

        @SideOnly(Side.CLIENT)
        public int colorMultiplier(IBlockAccess p_149720_1_, BlockPos pos, int pass) {
            return 16777215;
        }

        public void func_180650_b(World world, BlockPos pos, IBlockState state, Random random) {
            if ((world.func_180495_p(pos.func_177977_b()).func_177230_c() == BlockCailiao3401.block || func_176353_e(world, pos, state)) && world.func_175623_d(pos.func_177984_a())) {
                int l = 1;
                while (world.func_180495_p(pos.func_177979_c(l)).func_177230_c() == this) {
                    l++;
                }
                if (l < 6) {
                    int i1 = ((Integer) state.func_177229_b(field_176355_a)).intValue();
                    if (i1 == 15) {
                        world.func_175656_a(pos.func_177984_a(), func_176223_P());
                        world.func_180501_a(pos, state.func_177226_a(field_176355_a, 0), 4);
                        return;
                    }
                    world.func_180501_a(pos, state.func_177226_a(field_176355_a, Integer.valueOf(i1 + 1)), 4);
                }
            }
        }
    }
}
