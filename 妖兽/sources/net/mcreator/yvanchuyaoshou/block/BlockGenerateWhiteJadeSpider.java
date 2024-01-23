package net.mcreator.yvanchuyaoshou.block;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureGenerateWhiteJadeSpider1;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/block/BlockGenerateWhiteJadeSpider.class */
public class BlockGenerateWhiteJadeSpider extends ElementsYvanchuyaoshouMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuyaoshou:generate_white_jade_spider")
    public static final Block block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public BlockGenerateWhiteJadeSpider(ElementsYvanchuyaoshouMod instance) {
        super(instance, 379);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustom().setRegistryName("generate_white_jade_spider");
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("yvanchuyaoshou:generate_white_jade_spider", "inventory"));
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/block/BlockGenerateWhiteJadeSpider$BlockCustom.class */
    public static class BlockCustom extends Block {
        public BlockCustom() {
            super(Material.field_151592_s);
            func_149663_c("generate_white_jade_spider");
            func_149672_a(SoundType.field_185853_f);
            func_149711_c(1.0f);
            func_149752_b(10.0f);
            func_149715_a(0.0f);
            func_149713_g(255);
            func_149647_a(null);
        }

        @SideOnly(Side.CLIENT)
        public BlockRenderLayer func_180664_k() {
            return BlockRenderLayer.CUTOUT;
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
            BlockGenerateWhiteJadeSpider.$_dependencies.put("x", Integer.valueOf(x));
            BlockGenerateWhiteJadeSpider.$_dependencies.put("y", Integer.valueOf(y));
            BlockGenerateWhiteJadeSpider.$_dependencies.put("z", Integer.valueOf(z));
            BlockGenerateWhiteJadeSpider.$_dependencies.put("world", world);
            ProcedureGenerateWhiteJadeSpider1.executeProcedure(BlockGenerateWhiteJadeSpider.$_dependencies);
            world.func_175684_a(new BlockPos(x, y, z), this, func_149738_a(world));
        }
    }
}
