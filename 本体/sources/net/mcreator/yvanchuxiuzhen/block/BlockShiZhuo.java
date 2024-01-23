package net.mcreator.yvanchuxiuzhen.block;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.creativetab.TabFenlei01;
import net.mcreator.yvanchuxiuzhen.entity.EntityYouhun;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
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
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockShiZhuo.class */
public class BlockShiZhuo extends ElementsYvanchuxiuzhenMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:shi_zhuo")
    public static final Block block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public BlockShiZhuo(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 450);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustom().setRegistryName("shi_zhuo");
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("yvanchuxiuzhen:shi_zhuo", "inventory"));
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockShiZhuo$BlockCustom.class */
    public static class BlockCustom extends Block {
        public static final PropertyDirection FACING = BlockHorizontal.field_185512_D;

        public BlockCustom() {
            super(Material.field_151576_e);
            func_149663_c("shi_zhuo");
            func_149672_a(SoundType.field_185851_d);
            setHarvestLevel("pickaxe", 1);
            func_149711_c(8.0f);
            func_149752_b(30.0f);
            func_149715_a(0.0f);
            func_149713_g(0);
            func_149647_a(TabFenlei01.tab);
            func_180632_j(this.field_176227_L.func_177621_b().func_177226_a(FACING, EnumFacing.NORTH));
        }

        @SideOnly(Side.CLIENT)
        public BlockRenderLayer func_180664_k() {
            return BlockRenderLayer.CUTOUT;
        }

        public boolean func_149686_d(IBlockState state) {
            return false;
        }

        public AxisAlignedBB func_185496_a(IBlockState state, IBlockAccess source, BlockPos pos) {
            switch (AnonymousClass1.$SwitchMap$net$minecraft$util$EnumFacing[state.func_177229_b(BlockHorizontal.field_185512_D).ordinal()]) {
                case EntityYouhun.ENTITYID /* 1 */:
                default:
                    return new AxisAlignedBB(-0.3125d, 0.0d, -0.3125d, 1.3125d, 0.9375d, 1.3125d);
                case EntityYouhun.ENTITYID_RANGED /* 2 */:
                    return new AxisAlignedBB(-0.3125d, 0.0d, -0.3125d, 1.3125d, 0.9375d, 1.3125d);
                case 3:
                    return new AxisAlignedBB(-0.3125d, 0.0d, -0.3125d, 1.3125d, 0.9375d, 1.3125d);
                case 4:
                    return new AxisAlignedBB(-0.3125d, 0.0d, -0.3125d, 1.3125d, 0.9375d, 1.3125d);
            }
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
    }

    /* renamed from: net.mcreator.yvanchuxiuzhen.block.BlockShiZhuo$1  reason: invalid class name */
    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockShiZhuo$1.class */
    static /* synthetic */ class AnonymousClass1 {
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
