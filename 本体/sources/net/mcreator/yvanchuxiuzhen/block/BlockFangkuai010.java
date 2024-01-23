package net.mcreator.yvanchuxiuzhen.block;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.creativetab.TabFenlei01;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockFangkuai010.class */
public class BlockFangkuai010 extends ElementsYvanchuxiuzhenMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:fangkuai010")
    public static final Block block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public BlockFangkuai010(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 38);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustom().setRegistryName("fangkuai010");
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("yvanchuxiuzhen:fangkuai010", "inventory"));
        ModelLoader.setCustomStateMapper(block, new StateMap.Builder().func_178442_a(new IProperty[]{BlockLeaves.field_176237_a, BlockLeaves.field_176236_b}).func_178441_a());
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockFangkuai010$BlockCustom.class */
    public static class BlockCustom extends BlockLeaves {
        public BlockCustom() {
            func_149663_c("fangkuai010");
            func_149672_a(SoundType.field_185850_c);
            func_149711_c(1.0f);
            func_149752_b(300.0f);
            func_149715_a(0.26666668f);
            func_149713_g(1);
            func_149647_a(TabFenlei01.tab);
            func_180632_j(this.field_176227_L.func_177621_b().func_177226_a(field_176236_b, true).func_177226_a(field_176237_a, true));
        }

        public BlockPlanks.EnumType func_176233_b(int meta) {
            return BlockPlanks.EnumType.OAK;
        }

        /* renamed from: onSheared */
        public NonNullList<ItemStack> m24onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
            return NonNullList.func_191197_a(1, new ItemStack(this, 1));
        }

        protected BlockStateContainer func_180661_e() {
            return new BlockStateContainer(this, new IProperty[]{field_176236_b, field_176237_a});
        }

        public IBlockState func_176203_a(int meta) {
            return func_176223_P().func_177226_a(field_176237_a, Boolean.valueOf((meta & 1) != 0)).func_177226_a(field_176236_b, Boolean.valueOf((meta & 2) != 0));
        }

        public int func_176201_c(IBlockState state) {
            int i = 0;
            if (!((Boolean) state.func_177229_b(field_176237_a)).booleanValue()) {
                i = 0 | 1;
            }
            if (((Boolean) state.func_177229_b(field_176236_b)).booleanValue()) {
                i |= 2;
            }
            return i;
        }

        @SideOnly(Side.CLIENT)
        public BlockRenderLayer func_180664_k() {
            return BlockRenderLayer.CUTOUT_MIPPED;
        }

        public boolean func_149662_c(IBlockState state) {
            return false;
        }

        public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
            drops.add(new ItemStack(Blocks.field_150350_a, 1));
        }
    }
}
