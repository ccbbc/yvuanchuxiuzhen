package net.mcreator.yvanchuxiuzhen.block;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyanblock01BlockAdded;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyanblock01GengXinYouXiKe;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyanblock01OnBlockRightClicked;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedurePlayerInHuoYanBlock08;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
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

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockHuoyanblock08.class */
public class BlockHuoyanblock08 extends ElementsYvanchuxiuzhenMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:huoyanblock08")
    public static final Block block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public BlockHuoyanblock08(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 120);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustom().setRegistryName("huoyanblock08");
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("yvanchuxiuzhen:huoyanblock08", "inventory"));
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockHuoyanblock08$BlockCustom.class */
    public static class BlockCustom extends Block {
        public BlockCustom() {
            super(Material.field_151581_o);
            func_149663_c("huoyanblock08");
            func_149672_a(SoundType.field_185853_f);
            func_149711_c(0.0f);
            func_149752_b(50.0f);
            func_149715_a(1.0f);
            func_149713_g(0);
            func_149647_a(null);
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
            return 30;
        }

        public boolean func_149662_c(IBlockState state) {
            return false;
        }

        public int func_149745_a(Random random) {
            return 0;
        }

        public void func_176213_c(World world, BlockPos pos, IBlockState state) {
            super.func_176213_c(world, pos, state);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            world.func_175684_a(new BlockPos(x, y, z), this, func_149738_a(world));
            BlockHuoyanblock08.$_dependencies.put("x", Integer.valueOf(x));
            BlockHuoyanblock08.$_dependencies.put("y", Integer.valueOf(y));
            BlockHuoyanblock08.$_dependencies.put("z", Integer.valueOf(z));
            BlockHuoyanblock08.$_dependencies.put("world", world);
            ProcedureHuoyanblock01BlockAdded.executeProcedure(BlockHuoyanblock08.$_dependencies);
        }

        public void func_189540_a(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
            super.func_189540_a(state, world, pos, neighborBlock, fromPos);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            if (world.func_175687_A(new BlockPos(x, y, z)) > 0) {
            }
            BlockHuoyanblock08.$_dependencies.put("x", Integer.valueOf(x));
            BlockHuoyanblock08.$_dependencies.put("y", Integer.valueOf(y));
            BlockHuoyanblock08.$_dependencies.put("z", Integer.valueOf(z));
            BlockHuoyanblock08.$_dependencies.put("world", world);
            ProcedureHuoyanblock01BlockAdded.executeProcedure(BlockHuoyanblock08.$_dependencies);
        }

        public void func_180650_b(World world, BlockPos pos, IBlockState state, Random random) {
            super.func_180650_b(world, pos, state, random);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            BlockHuoyanblock08.$_dependencies.put("x", Integer.valueOf(x));
            BlockHuoyanblock08.$_dependencies.put("y", Integer.valueOf(y));
            BlockHuoyanblock08.$_dependencies.put("z", Integer.valueOf(z));
            BlockHuoyanblock08.$_dependencies.put("world", world);
            ProcedureHuoyanblock01GengXinYouXiKe.executeProcedure(BlockHuoyanblock08.$_dependencies);
            world.func_175684_a(new BlockPos(x, y, z), this, func_149738_a(world));
        }

        public void func_180634_a(World world, BlockPos pos, IBlockState state, Entity entity) {
            super.func_180634_a(world, pos, state, entity);
            pos.func_177958_n();
            pos.func_177956_o();
            pos.func_177952_p();
            BlockHuoyanblock08.$_dependencies.put("entity", entity);
            ProcedurePlayerInHuoYanBlock08.executeProcedure(BlockHuoyanblock08.$_dependencies);
        }

        public boolean func_180639_a(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
            super.func_180639_a(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            BlockHuoyanblock08.$_dependencies.put("entity", entity);
            BlockHuoyanblock08.$_dependencies.put("x", Integer.valueOf(x));
            BlockHuoyanblock08.$_dependencies.put("y", Integer.valueOf(y));
            BlockHuoyanblock08.$_dependencies.put("z", Integer.valueOf(z));
            BlockHuoyanblock08.$_dependencies.put("world", world);
            ProcedureHuoyanblock01OnBlockRightClicked.executeProcedure(BlockHuoyanblock08.$_dependencies);
            return true;
        }
    }
}
