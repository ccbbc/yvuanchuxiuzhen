package net.mcreator.yvanchuyaoshou.block;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.creativetab.TabYaoshou;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureCaientity1503OnBlockRightClicked;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/block/BlockCaientity1503.class */
public class BlockCaientity1503 extends ElementsYvanchuyaoshouMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuyaoshou:caientity1503")
    public static final Block block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public BlockCaientity1503(ElementsYvanchuyaoshouMod instance) {
        super(instance, 14);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustom().setRegistryName("caientity1503");
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("yvanchuyaoshou:caientity1503", "inventory"));
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/block/BlockCaientity1503$BlockCustom.class */
    public static class BlockCustom extends Block {
        public BlockCustom() {
            super(Material.field_151575_d);
            func_149663_c("caientity1503");
            func_149672_a(SoundType.field_185848_a);
            func_149711_c(1.0f);
            func_149752_b(100.0f);
            func_149715_a(0.0f);
            func_149713_g(0);
            func_149647_a(TabYaoshou.tab);
        }

        @SideOnly(Side.CLIENT)
        public BlockRenderLayer func_180664_k() {
            return BlockRenderLayer.CUTOUT;
        }

        @Nullable
        public AxisAlignedBB func_180646_a(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
            return field_185506_k;
        }

        public boolean func_176205_b(IBlockAccess worldIn, BlockPos pos) {
            return true;
        }

        public boolean func_149686_d(IBlockState state) {
            return false;
        }

        public AxisAlignedBB func_185496_a(IBlockState state, IBlockAccess source, BlockPos pos) {
            return new AxisAlignedBB(0.0d, 0.0d, 0.0d, 1.0d, 0.2d, 1.0d);
        }

        public boolean func_149662_c(IBlockState state) {
            return false;
        }

        public boolean func_180639_a(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
            super.func_180639_a(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            BlockCaientity1503.$_dependencies.put("entity", entity);
            BlockCaientity1503.$_dependencies.put("x", Integer.valueOf(x));
            BlockCaientity1503.$_dependencies.put("y", Integer.valueOf(y));
            BlockCaientity1503.$_dependencies.put("z", Integer.valueOf(z));
            BlockCaientity1503.$_dependencies.put("world", world);
            ProcedureCaientity1503OnBlockRightClicked.executeProcedure(BlockCaientity1503.$_dependencies);
            return true;
        }
    }
}
