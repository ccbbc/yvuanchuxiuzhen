package net.mcreator.yvanchuxiuzhenfulu.block;

import java.util.List;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.creativetab.TabFuzhen;
import net.mcreator.yvanchuxiuzhenfulu.item.ItemCailiao37;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.NonNullList;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/block/BlockFangkuai10501.class */
public class BlockFangkuai10501 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhenfulu:fangkuai10501")
    public static final Block block = null;

    public BlockFangkuai10501(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 39);
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustom().setRegistryName("fangkuai10501");
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("yvanchuxiuzhenfulu:fangkuai10501", "inventory"));
    }

    /* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/block/BlockFangkuai10501$BlockCustom.class */
    public static class BlockCustom extends Block {
        public static final PropertyDirection FACING = BlockHorizontal.field_185512_D;

        public BlockCustom() {
            super(Material.field_151575_d);
            func_149663_c("fangkuai10501");
            func_149672_a(SoundType.field_185848_a);
            setHarvestLevel("axe", 0);
            func_149711_c(5.0f);
            func_149752_b(30.0f);
            func_149715_a(0.0f);
            func_149713_g(255);
            func_149647_a(TabFuzhen.tab);
            func_180632_j(this.field_176227_L.func_177621_b().func_177226_a(FACING, EnumFacing.NORTH));
        }

        public void func_190948_a(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
            super.func_190948_a(itemstack, world, list, flag);
            list.add("被落雷符击中血桃木获得");
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

        public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
            drops.add(new ItemStack(ItemCailiao37.block, 1));
        }
    }
}
