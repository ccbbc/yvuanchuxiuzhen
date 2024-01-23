package net.mcreator.yvanchuyaoshou.block;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.creativetab.TabYaoshou;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureFangkuai106EntityCollidesInTheBlock;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureFangkuai106NeighbourBlockChanges;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
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
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/block/BlockFangkuai106.class */
public class BlockFangkuai106 extends ElementsYvanchuyaoshouMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuyaoshou:fangkuai106")
    public static final Block block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public BlockFangkuai106(ElementsYvanchuyaoshouMod instance) {
        super(instance, 11);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustom().setRegistryName("fangkuai106");
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("yvanchuyaoshou:fangkuai106", "inventory"));
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/block/BlockFangkuai106$BlockCustom.class */
    public static class BlockCustom extends Block {
        public BlockCustom() {
            super(Material.field_151592_s);
            func_149663_c("fangkuai106");
            func_149672_a(SoundType.field_185853_f);
            func_149711_c(1.0f);
            func_149752_b(10.0f);
            func_149715_a(0.46666667f);
            func_149713_g(0);
            func_149647_a(TabYaoshou.tab);
            func_149722_s();
        }

        @SideOnly(Side.CLIENT)
        public BlockRenderLayer func_180664_k() {
            return BlockRenderLayer.TRANSLUCENT;
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

        public int func_149738_a(World world) {
            return 100;
        }

        public boolean func_149662_c(IBlockState state) {
            return false;
        }

        public void func_189540_a(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
            super.func_189540_a(state, world, pos, neighborBlock, fromPos);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            if (world.func_175687_A(new BlockPos(x, y, z)) > 0) {
            }
            BlockFangkuai106.$_dependencies.put("x", Integer.valueOf(x));
            BlockFangkuai106.$_dependencies.put("y", Integer.valueOf(y));
            BlockFangkuai106.$_dependencies.put("z", Integer.valueOf(z));
            BlockFangkuai106.$_dependencies.put("world", world);
            ProcedureFangkuai106NeighbourBlockChanges.executeProcedure(BlockFangkuai106.$_dependencies);
        }

        public void func_180634_a(World world, BlockPos pos, IBlockState state, Entity entity) {
            super.func_180634_a(world, pos, state, entity);
            pos.func_177958_n();
            pos.func_177956_o();
            pos.func_177952_p();
            BlockFangkuai106.$_dependencies.put("entity", entity);
            ProcedureFangkuai106EntityCollidesInTheBlock.executeProcedure(BlockFangkuai106.$_dependencies);
        }
    }
}
