package net.mcreator.yvanchuxiuzhen.block;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.creativetab.TabFenlei01;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureFangkuai00801BlockAdded;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockFangkuai00801.class */
public class BlockFangkuai00801 extends ElementsYvanchuxiuzhenMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:fangkuai00801")
    public static final Block block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public BlockFangkuai00801(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 36);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustom().setRegistryName("fangkuai00801");
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("yvanchuxiuzhen:fangkuai00801", "inventory"));
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockFangkuai00801$BlockCustom.class */
    public static class BlockCustom extends Block {
        public static final PropertyDirection FACING = BlockDirectional.field_176387_N;

        public BlockCustom() {
            super(Material.field_151576_e);
            func_149663_c("fangkuai00801");
            func_149672_a(SoundType.field_185851_d);
            setHarvestLevel("pickaxe", 1);
            func_149711_c(10.0f);
            func_149752_b(1000.0f);
            func_149715_a(0.26666668f);
            func_149713_g(255);
            func_149647_a(TabFenlei01.tab);
            func_180632_j(this.field_176227_L.func_177621_b().func_177226_a(FACING, EnumFacing.SOUTH));
        }

        protected BlockStateContainer func_180661_e() {
            return new BlockStateContainer(this, new IProperty[]{FACING});
        }

        public IBlockState func_185499_a(IBlockState state, Rotation rot) {
            if (rot == Rotation.CLOCKWISE_90 || rot == Rotation.COUNTERCLOCKWISE_90) {
                if (state.func_177229_b(FACING) == EnumFacing.WEST || state.func_177229_b(FACING) == EnumFacing.EAST) {
                    return state.func_177226_a(FACING, EnumFacing.UP);
                }
                if (state.func_177229_b(FACING) == EnumFacing.UP || state.func_177229_b(FACING) == EnumFacing.DOWN) {
                    return state.func_177226_a(FACING, EnumFacing.WEST);
                }
            }
            return state;
        }

        public IBlockState func_176203_a(int meta) {
            return func_176223_P().func_177226_a(FACING, EnumFacing.func_82600_a(meta));
        }

        public int func_176201_c(IBlockState state) {
            return state.func_177229_b(FACING).func_176745_a();
        }

        public IBlockState func_180642_a(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
            EnumFacing facing2;
            if (facing == EnumFacing.WEST || facing == EnumFacing.EAST) {
                facing2 = EnumFacing.UP;
            } else if (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH) {
                facing2 = EnumFacing.EAST;
            } else {
                facing2 = EnumFacing.SOUTH;
            }
            return func_176223_P().func_177226_a(FACING, facing2);
        }

        public void func_176213_c(World world, BlockPos pos, IBlockState state) {
            super.func_176213_c(world, pos, state);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            BlockFangkuai00801.$_dependencies.put("x", Integer.valueOf(x));
            BlockFangkuai00801.$_dependencies.put("y", Integer.valueOf(y));
            BlockFangkuai00801.$_dependencies.put("z", Integer.valueOf(z));
            BlockFangkuai00801.$_dependencies.put("world", world);
            ProcedureFangkuai00801BlockAdded.executeProcedure(BlockFangkuai00801.$_dependencies);
        }

        public void func_189540_a(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
            super.func_189540_a(state, world, pos, neighborBlock, fromPos);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            if (world.func_175687_A(new BlockPos(x, y, z)) > 0) {
            }
            BlockFangkuai00801.$_dependencies.put("x", Integer.valueOf(x));
            BlockFangkuai00801.$_dependencies.put("y", Integer.valueOf(y));
            BlockFangkuai00801.$_dependencies.put("z", Integer.valueOf(z));
            BlockFangkuai00801.$_dependencies.put("world", world);
            ProcedureFangkuai00801BlockAdded.executeProcedure(BlockFangkuai00801.$_dependencies);
        }
    }
}
