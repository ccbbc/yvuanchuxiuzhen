package net.mcreator.yvanchuyaoshou.block;

import com.google.common.base.Predicate;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.creativetab.TabYaoshou;
import net.mcreator.yvanchuyaoshou.entity.EntityJiHunXie01;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu02;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureFangkuai107UpdateTick;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/block/BlockFangkuai107.class */
public class BlockFangkuai107 extends ElementsYvanchuyaoshouMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuyaoshou:fangkuai107")
    public static final Block block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public BlockFangkuai107(ElementsYvanchuyaoshouMod instance) {
        super(instance, 12);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustom().setRegistryName("fangkuai107");
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("yvanchuyaoshou:fangkuai107", "inventory"));
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
        boolean dimensionCriteria = false;
        if (dimID == 0) {
            dimensionCriteria = true;
        }
        if (!dimensionCriteria) {
            return;
        }
        boolean biomeCriteria = false;
        Biome biome = world.func_180494_b(new BlockPos(chunkX, (int) EntityMoXiu02.ENTITYID, chunkZ));
        if (((ResourceLocation) Biome.field_185377_q.func_177774_c(biome)).equals(new ResourceLocation("yvanchuyaoshou:shengtai15"))) {
            biomeCriteria = true;
        }
        if (!biomeCriteria) {
            return;
        }
        for (int i = 0; i < 1; i++) {
            int x = chunkX + random.nextInt(16);
            int y = random.nextInt(15) + 55;
            int z = chunkZ + random.nextInt(16);
            new WorldGenMinable(block.func_176223_P(), 2, new Predicate<IBlockState>() { // from class: net.mcreator.yvanchuyaoshou.block.BlockFangkuai107.1
                public boolean apply(IBlockState blockAt) {
                    boolean blockCriteria = false;
                    if (blockAt.func_177230_c() == Blocks.field_150348_b.func_176223_P().func_177230_c()) {
                        blockCriteria = true;
                    }
                    if (blockAt.func_177230_c() == Blocks.field_150349_c.func_176223_P().func_177230_c()) {
                        blockCriteria = true;
                    }
                    IBlockState require = Blocks.field_150346_d.func_176203_a(0);
                    try {
                        if (blockAt.func_177230_c() == require.func_177230_c()) {
                            if (blockAt.func_177230_c().func_176201_c(blockAt) == require.func_177230_c().func_176201_c(require)) {
                                blockCriteria = true;
                            }
                        }
                    } catch (Exception e) {
                        if (blockAt.func_177230_c() == require.func_177230_c()) {
                            blockCriteria = true;
                        }
                    }
                    IBlockState require2 = Blocks.field_150346_d.func_176203_a(1);
                    try {
                        if (blockAt.func_177230_c() == require2.func_177230_c()) {
                            if (blockAt.func_177230_c().func_176201_c(blockAt) == require2.func_177230_c().func_176201_c(require2)) {
                                blockCriteria = true;
                            }
                        }
                    } catch (Exception e2) {
                        if (blockAt.func_177230_c() == require2.func_177230_c()) {
                            blockCriteria = true;
                        }
                    }
                    return blockCriteria;
                }
            }).func_180709_b(world, random, new BlockPos(x, y, z));
        }
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/block/BlockFangkuai107$BlockCustom.class */
    public static class BlockCustom extends Block {
        public BlockCustom() {
            super(Material.field_151576_e);
            func_149663_c("fangkuai107");
            func_149672_a(SoundType.field_185851_d);
            setHarvestLevel("pickaxe", 1);
            func_149711_c(10.0f);
            func_149752_b(1000.0f);
            func_149715_a(0.0f);
            func_149713_g(255);
            func_149647_a(TabYaoshou.tab);
        }

        public int func_149738_a(World world) {
            return EntityJiHunXie01.ENTITYID;
        }

        public void func_176213_c(World world, BlockPos pos, IBlockState state) {
            super.func_176213_c(world, pos, state);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            world.func_175684_a(new BlockPos(x, y, z), this, func_149738_a(world));
        }

        public void func_180650_b(World world, BlockPos pos, IBlockState state, Random random) {
            super.func_180650_b(world, pos, state, random);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            BlockFangkuai107.$_dependencies.put("x", Integer.valueOf(x));
            BlockFangkuai107.$_dependencies.put("y", Integer.valueOf(y));
            BlockFangkuai107.$_dependencies.put("z", Integer.valueOf(z));
            BlockFangkuai107.$_dependencies.put("world", world);
            ProcedureFangkuai107UpdateTick.executeProcedure(BlockFangkuai107.$_dependencies);
            world.func_175684_a(new BlockPos(x, y, z), this, func_149738_a(world));
        }
    }
}
