package net.mcreator.fabaokuozhan.block;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.procedure.ProcedureOnCaiLiao1801;
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

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/block/BlockCailiao52.class */
public class BlockCailiao52 extends ElementsFabaokuozhanMod.ModElement {
    @GameRegistry.ObjectHolder("fabaokuozhan:cailiao52")
    public static final Block block = null;
    @GameRegistry.ObjectHolder("fabaokuozhan:cailiao52")
    public static final Item item = null;
    private Fluid fluid;

    public BlockCailiao52(ElementsFabaokuozhanMod instance) {
        super(instance, 61);
        this.fluid = new Fluid("cailiao52", new ResourceLocation("fabaokuozhan:blocks/cailiao52"), new ResourceLocation("fabaokuozhan:blocks/cailiao5202")).setLuminosity(4).setDensity(1000).setViscosity(1000).setGaseous(false);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockFluidClassic(this.fluid, Material.field_151586_h) { // from class: net.mcreator.fabaokuozhan.block.BlockCailiao52.1
                public void func_180634_a(World world, BlockPos pos, IBlockState state, Entity entity) {
                    super.func_180634_a(world, pos, state, entity);
                    pos.func_177958_n();
                    pos.func_177956_o();
                    pos.func_177952_p();
                    Map $_dependencies = new HashMap();
                    $_dependencies.put("entity", entity);
                    ProcedureOnCaiLiao1801.executeProcedure($_dependencies);
                }
            }.func_149663_c("cailiao52").setRegistryName("cailiao52");
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName("cailiao52");
        });
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void preInit(FMLPreInitializationEvent event) {
        FluidRegistry.registerFluid(this.fluid);
        FluidRegistry.addBucketForFluid(this.fluid);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelBakery.registerItemVariants(item, new ResourceLocation[0]);
        ModelLoader.setCustomMeshDefinition(item, new ItemMeshDefinition() { // from class: net.mcreator.fabaokuozhan.block.BlockCailiao52.2
            public ModelResourceLocation func_178113_a(ItemStack stack) {
                return new ModelResourceLocation("fabaokuozhan:cailiao52", "cailiao52");
            }
        });
        ModelLoader.setCustomStateMapper(block, new StateMapperBase() { // from class: net.mcreator.fabaokuozhan.block.BlockCailiao52.3
            protected ModelResourceLocation func_178132_a(IBlockState state) {
                return new ModelResourceLocation("fabaokuozhan:cailiao52", "cailiao52");
            }
        });
    }
}
