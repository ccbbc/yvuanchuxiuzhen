package net.mcreator.yvanchuliandan.block;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.creativetab.TabLiandan;
import net.mcreator.yvanchuliandan.procedure.ProcedureCaoyaocong01PlantRightClicked;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/block/BlockCaoyaocong03.class */
public class BlockCaoyaocong03 extends ElementsYvanchuliandanMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuliandan:caoyaocong03")
    public static final Block block = null;

    public BlockCaoyaocong03(ElementsYvanchuliandanMod instance) {
        super(instance, 89);
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustomFlower();
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("yvanchuliandan:caoyaocong03", "inventory"));
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
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
        if (((ResourceLocation) Biome.field_185377_q.func_177774_c(biome)).equals(new ResourceLocation("extreme_hills"))) {
            biomeCriteria = true;
        }
        if (((ResourceLocation) Biome.field_185377_q.func_177774_c(biome)).equals(new ResourceLocation("river"))) {
            biomeCriteria = true;
        }
        if (!biomeCriteria) {
            return;
        }
        for (int i = 0; i < 1; i++) {
            int l6 = chunkX + random.nextInt(16) + 8;
            int i11 = random.nextInt(128);
            int l14 = chunkZ + random.nextInt(16) + 8;
            new WorldGenFlowers(block, BlockFlower.EnumFlowerType.DANDELION).func_180709_b(world, random, new BlockPos(l6, i11, l14));
        }
    }

    /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/block/BlockCaoyaocong03$BlockCustomFlower.class */
    public static class BlockCustomFlower extends BlockFlower {
        public BlockCustomFlower() {
            func_149672_a(SoundType.field_185850_c);
            func_149647_a(TabLiandan.tab);
            func_149711_c(0.0f);
            func_149752_b(15.0f);
            func_149715_a(0.0f);
            func_149663_c("caoyaocong03");
            setRegistryName("caoyaocong03");
        }

        public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
            drops.add(new ItemStack(Blocks.field_150350_a, 0));
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

        public BlockFlower.EnumFlowerColor func_176495_j() {
            return BlockFlower.EnumFlowerColor.YELLOW;
        }

        @SideOnly(Side.CLIENT)
        public void func_149666_a(CreativeTabs tab, NonNullList<ItemStack> list) {
            BlockFlower.EnumFlowerType[] func_176966_a;
            for (BlockFlower.EnumFlowerType blockflower$enumflowertype : BlockFlower.EnumFlowerType.func_176966_a(func_176495_j())) {
                list.add(new ItemStack(this, 1, blockflower$enumflowertype.func_176968_b()));
            }
        }

        public boolean func_180639_a(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureCaoyaocong01PlantRightClicked.executeProcedure($_dependencies);
            return true;
        }
    }
}
