package net.mcreator.yvanchuxiuzhen.block;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.creativetab.TabFenlei01;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockLingShiKuaiTaiJie1.class */
public class BlockLingShiKuaiTaiJie1 extends ElementsYvanchuxiuzhenMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:ling_shi_kuai_tai_jie_1")
    public static final Block block = null;
    static Map<String, Object> $_dependencies = new HashMap();
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:ling_shi_kuai_tai_jie_1_double")
    public static final Block block_slab_double = null;

    public BlockLingShiKuaiTaiJie1(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 46);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustom().setRegistryName("ling_shi_kuai_tai_jie_1");
        });
        this.elements.blocks.add(() -> {
            return new BlockCustom.Double().setRegistryName("ling_shi_kuai_tai_jie_1_double");
        });
        this.elements.items.add(() -> {
            return new ItemSlab(block, block, block_slab_double).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("yvanchuxiuzhen:ling_shi_kuai_tai_jie_1", "inventory"));
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockLingShiKuaiTaiJie1$BlockCustom.class */
    public static class BlockCustom extends BlockSlab {
        public static final PropertyEnum<Variant> VARIANT = PropertyEnum.func_177709_a("variant", Variant.class);

        public BlockCustom() {
            super(Material.field_151576_e);
            func_149663_c("ling_shi_kuai_tai_jie_1");
            func_149672_a(SoundType.field_185851_d);
            setHarvestLevel("pickaxe", 3);
            func_149711_c(5.0f);
            func_149752_b(50.0f);
            func_149715_a(0.0f);
            func_149713_g(255);
            func_149647_a(TabFenlei01.tab);
            IBlockState state = this.field_176227_L.func_177621_b().func_177226_a(VARIANT, Variant.DEFAULT);
            func_180632_j(func_176552_j() ? state : state.func_177226_a(BlockSlab.field_176554_a, BlockSlab.EnumBlockHalf.BOTTOM));
            this.field_149783_u = !func_176552_j();
        }

        public Item func_180660_a(IBlockState state, Random rand, int fortune) {
            return Item.func_150898_a(BlockLingShiKuaiTaiJie1.block);
        }

        public ItemStack func_185473_a(World worldIn, BlockPos pos, IBlockState state) {
            return new ItemStack(BlockLingShiKuaiTaiJie1.block);
        }

        protected BlockStateContainer func_180661_e() {
            return func_176552_j() ? new BlockStateContainer(this, new IProperty[]{VARIANT}) : new BlockStateContainer(this, new IProperty[]{field_176554_a, VARIANT});
        }

        public IBlockState func_176203_a(int meta) {
            if (func_176552_j()) {
                return func_176223_P();
            }
            return func_176223_P().func_177226_a(field_176554_a, BlockSlab.EnumBlockHalf.values()[meta % 2]);
        }

        public int func_176201_c(IBlockState state) {
            if (func_176552_j()) {
                return 0;
            }
            return state.func_177229_b(field_176554_a).ordinal();
        }

        public String func_150002_b(int meta) {
            return super.func_149739_a();
        }

        public IProperty<?> func_176551_l() {
            return VARIANT;
        }

        public Comparable<?> func_185674_a(ItemStack stack) {
            return Variant.DEFAULT;
        }

        public boolean func_176552_j() {
            return false;
        }

        public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
            if (func_176552_j()) {
                return true;
            }
            return super.doesSideBlockRendering(state, world, pos, face);
        }

        /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockLingShiKuaiTaiJie1$BlockCustom$Variant.class */
        public enum Variant implements IStringSerializable {
            DEFAULT;

            public String func_176610_l() {
                return "default";
            }
        }

        /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockLingShiKuaiTaiJie1$BlockCustom$Double.class */
        public static class Double extends BlockCustom {
            @Override // net.mcreator.yvanchuxiuzhen.block.BlockLingShiKuaiTaiJie1.BlockCustom
            public boolean func_176552_j() {
                return true;
            }
        }
    }
}
