package net.mcreator.yvanchuxiuzhen.block;

import com.google.common.base.Predicate;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.creativetab.TabFenlei01;
import net.mcreator.yvanchuxiuzhen.entity.EntityYouhun;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureFangkuai066EntityCollidesInTheBlock;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureFangkuai066UpdateTick;
import net.mcreator.yvanchuxiuzhen.world.WorldWeimian01;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
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

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockFangkuai066.class */
public class BlockFangkuai066 extends ElementsYvanchuxiuzhenMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:fangkuai066")
    public static final Block block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public BlockFangkuai066(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 20);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustom().setRegistryName("fangkuai066");
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("yvanchuxiuzhen:fangkuai066", "inventory"));
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
        boolean dimensionCriteria = false;
        if (dimID == WorldWeimian01.DIMID) {
            dimensionCriteria = true;
        }
        if (!dimensionCriteria) {
            return;
        }
        boolean biomeCriteria = false;
        Biome biome = world.func_180494_b(new BlockPos(chunkX, 128, chunkZ));
        if (((ResourceLocation) Biome.field_185377_q.func_177774_c(biome)).equals(new ResourceLocation("yvanchuxiuzhen:weimian0102"))) {
            biomeCriteria = true;
        }
        if (!biomeCriteria) {
            return;
        }
        for (int i = 0; i < 1; i++) {
            int x = chunkX + random.nextInt(16);
            int y = random.nextInt(15) + 55;
            int z = chunkZ + random.nextInt(16);
            new WorldGenMinable(block.func_176223_P(), 10, new Predicate<IBlockState>() { // from class: net.mcreator.yvanchuxiuzhen.block.BlockFangkuai066.1
                public boolean apply(IBlockState blockAt) {
                    boolean blockCriteria = false;
                    if (blockAt.func_177230_c() == BlockFangkuai062.block.func_176223_P().func_177230_c()) {
                        blockCriteria = true;
                    }
                    return blockCriteria;
                }
            }).func_180709_b(world, random, new BlockPos(x, y, z));
        }
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockFangkuai066$BlockCustom.class */
    public static class BlockCustom extends Block {
        public static final PropertyDirection FACING = BlockHorizontal.field_185512_D;

        public BlockCustom() {
            super(Material.field_151576_e);
            func_149663_c("fangkuai066");
            func_149672_a(SoundType.field_185851_d);
            setHarvestLevel("pickaxe", 1);
            func_149711_c(5.0f);
            func_149752_b(20.0f);
            func_149715_a(1.0f);
            func_149713_g(0);
            func_149647_a(TabFenlei01.tab);
            func_180632_j(this.field_176227_L.func_177621_b().func_177226_a(FACING, EnumFacing.NORTH));
        }

        public boolean func_149686_d(IBlockState state) {
            return false;
        }

        public AxisAlignedBB func_185496_a(IBlockState state, IBlockAccess source, BlockPos pos) {
            switch (AnonymousClass2.$SwitchMap$net$minecraft$util$EnumFacing[state.func_177229_b(BlockHorizontal.field_185512_D).ordinal()]) {
                case EntityYouhun.ENTITYID /* 1 */:
                default:
                    return new AxisAlignedBB(0.0d, 0.0d, 0.0d, 1.0d, 1.2d, 1.0d);
                case EntityYouhun.ENTITYID_RANGED /* 2 */:
                    return new AxisAlignedBB(0.0d, 0.0d, 0.0d, 1.0d, 1.2d, 1.0d);
                case 3:
                    return new AxisAlignedBB(0.0d, 0.0d, 0.0d, 1.0d, 1.2d, 1.0d);
                case 4:
                    return new AxisAlignedBB(0.0d, 0.0d, 0.0d, 1.0d, 1.2d, 1.0d);
            }
        }

        public int func_149738_a(World world) {
            return 5;
        }

        protected BlockStateContainer func_180661_e() {
            return new BlockStateContainer(this, new IProperty[]{FACING});
        }

        public IBlockState func_185499_a(IBlockState state, Rotation rot) {
            return state.func_177226_a(FACING, rot.func_185831_a(state.func_177229_b(FACING)));
        }

        public IBlockState func_185471_a(IBlockState state, Mirror mirrorIn) {
            return state.func_185907_a(mirrorIn.func_185800_a(state.func_177229_b(FACING)));
        }

        public IBlockState func_176203_a(int meta) {
            return func_176223_P().func_177226_a(FACING, EnumFacing.func_82600_a(meta));
        }

        public int func_176201_c(IBlockState state) {
            return state.func_177229_b(FACING).func_176745_a();
        }

        public IBlockState func_180642_a(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
            return func_176223_P().func_177226_a(FACING, placer.func_174811_aO().func_176734_d());
        }

        public boolean func_149662_c(IBlockState state) {
            return false;
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
            BlockFangkuai066.$_dependencies.put("x", Integer.valueOf(x));
            BlockFangkuai066.$_dependencies.put("y", Integer.valueOf(y));
            BlockFangkuai066.$_dependencies.put("z", Integer.valueOf(z));
            BlockFangkuai066.$_dependencies.put("world", world);
            ProcedureFangkuai066UpdateTick.executeProcedure(BlockFangkuai066.$_dependencies);
            world.func_175684_a(new BlockPos(x, y, z), this, func_149738_a(world));
        }

        public void func_180634_a(World world, BlockPos pos, IBlockState state, Entity entity) {
            super.func_180634_a(world, pos, state, entity);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            BlockFangkuai066.$_dependencies.put("entity", entity);
            BlockFangkuai066.$_dependencies.put("x", Integer.valueOf(x));
            BlockFangkuai066.$_dependencies.put("y", Integer.valueOf(y));
            BlockFangkuai066.$_dependencies.put("z", Integer.valueOf(z));
            BlockFangkuai066.$_dependencies.put("world", world);
            ProcedureFangkuai066EntityCollidesInTheBlock.executeProcedure(BlockFangkuai066.$_dependencies);
        }

        public void func_176199_a(World world, BlockPos pos, Entity entity) {
            super.func_176199_a(world, pos, entity);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            BlockFangkuai066.$_dependencies.put("entity", entity);
            BlockFangkuai066.$_dependencies.put("x", Integer.valueOf(x));
            BlockFangkuai066.$_dependencies.put("y", Integer.valueOf(y));
            BlockFangkuai066.$_dependencies.put("z", Integer.valueOf(z));
            BlockFangkuai066.$_dependencies.put("world", world);
            ProcedureFangkuai066EntityCollidesInTheBlock.executeProcedure(BlockFangkuai066.$_dependencies);
        }
    }

    /* renamed from: net.mcreator.yvanchuxiuzhen.block.BlockFangkuai066$2  reason: invalid class name */
    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockFangkuai066$2.class */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$net$minecraft$util$EnumFacing = new int[EnumFacing.values().length];

        static {
            try {
                $SwitchMap$net$minecraft$util$EnumFacing[EnumFacing.SOUTH.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$net$minecraft$util$EnumFacing[EnumFacing.NORTH.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$net$minecraft$util$EnumFacing[EnumFacing.EAST.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$net$minecraft$util$EnumFacing[EnumFacing.WEST.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }
}
