package net.mcreator.yvanchuxiuzhen.block;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureFangkuai066EntityCollidesInTheBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/block/BlockFangkuai069.class */
public class BlockFangkuai069 extends ElementsYvanchuxiuzhenMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:fangkuai069")
    public static final Block block = null;
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:fangkuai069")
    public static final Item item = null;
    static Map<String, Object> $_dependencies = new HashMap();
    private Fluid fluid;

    public BlockFangkuai069(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 23);
        this.fluid = new Fluid("fangkuai069", new ResourceLocation("yvanchuxiuzhen:blocks/fangkuai06901"), new ResourceLocation("yvanchuxiuzhen:blocks/fangkuai06902")).setLuminosity(4).setDensity(1000).setViscosity(1000).setGaseous(false);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockFluidClassic(this.fluid, Material.field_151586_h) { // from class: net.mcreator.yvanchuxiuzhen.block.BlockFangkuai069.1
                public void func_180634_a(World world, BlockPos pos, IBlockState state, Entity entity) {
                    super.func_180634_a(world, pos, state, entity);
                    int x = pos.func_177958_n();
                    int y = pos.func_177956_o();
                    int z = pos.func_177952_p();
                    BlockFangkuai069.$_dependencies.put("entity", entity);
                    BlockFangkuai069.$_dependencies.put("x", Integer.valueOf(x));
                    BlockFangkuai069.$_dependencies.put("y", Integer.valueOf(y));
                    BlockFangkuai069.$_dependencies.put("z", Integer.valueOf(z));
                    BlockFangkuai069.$_dependencies.put("world", world);
                    ProcedureFangkuai066EntityCollidesInTheBlock.executeProcedure(BlockFangkuai069.$_dependencies);
                }
            }.func_149663_c("fangkuai069").setRegistryName("fangkuai069");
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName("fangkuai069");
        });
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        FluidRegistry.registerFluid(this.fluid);
        FluidRegistry.addBucketForFluid(this.fluid);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelBakery.registerItemVariants(item, new ResourceLocation[0]);
        ModelLoader.setCustomMeshDefinition(item, new ItemMeshDefinition() { // from class: net.mcreator.yvanchuxiuzhen.block.BlockFangkuai069.2
            public ModelResourceLocation func_178113_a(ItemStack stack) {
                return new ModelResourceLocation("yvanchuxiuzhen:fangkuai069", "fangkuai069");
            }
        });
        ModelLoader.setCustomStateMapper(block, new StateMapperBase() { // from class: net.mcreator.yvanchuxiuzhen.block.BlockFangkuai069.3
            protected ModelResourceLocation func_178132_a(IBlockState state) {
                return new ModelResourceLocation("yvanchuxiuzhen:fangkuai069", "fangkuai069");
            }
        });
    }
}
