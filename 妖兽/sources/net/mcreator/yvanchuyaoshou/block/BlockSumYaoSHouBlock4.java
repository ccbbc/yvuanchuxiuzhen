package net.mcreator.yvanchuyaoshou.block;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureSumYaoSHouBlock4Do;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/block/BlockSumYaoSHouBlock4.class */
public class BlockSumYaoSHouBlock4 extends ElementsYvanchuyaoshouMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuyaoshou:sum_yao_s_hou_block_4")
    public static final Block block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public BlockSumYaoSHouBlock4(ElementsYvanchuyaoshouMod instance) {
        super(instance, 286);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustom().setRegistryName("sum_yao_s_hou_block_4");
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerTileEntity(TileEntityCustom.class, "yvanchuyaoshou:tileentitysum_yao_s_hou_block_4");
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("yvanchuyaoshou:sum_yao_s_hou_block_4", "inventory"));
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/block/BlockSumYaoSHouBlock4$BlockCustom.class */
    public static class BlockCustom extends Block implements ITileEntityProvider {
        public BlockCustom() {
            super(Material.field_151576_e);
            func_149663_c("sum_yao_s_hou_block_4");
            func_149672_a(SoundType.field_185849_b);
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

        public TileEntity func_149915_a(World worldIn, int meta) {
            return new TileEntityCustom();
        }

        public boolean func_189539_a(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
            super.func_189539_a(state, worldIn, pos, eventID, eventParam);
            TileEntity tileentity = worldIn.func_175625_s(pos);
            if (tileentity == null) {
                return false;
            }
            return tileentity.func_145842_c(eventID, eventParam);
        }

        public EnumBlockRenderType func_149645_b(IBlockState state) {
            return EnumBlockRenderType.MODEL;
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
            BlockSumYaoSHouBlock4.$_dependencies.put("x", Integer.valueOf(x));
            BlockSumYaoSHouBlock4.$_dependencies.put("y", Integer.valueOf(y));
            BlockSumYaoSHouBlock4.$_dependencies.put("z", Integer.valueOf(z));
            BlockSumYaoSHouBlock4.$_dependencies.put("world", world);
            ProcedureSumYaoSHouBlock4Do.executeProcedure(BlockSumYaoSHouBlock4.$_dependencies);
            world.func_175684_a(new BlockPos(x, y, z), this, func_149738_a(world));
        }
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/block/BlockSumYaoSHouBlock4$TileEntityCustom.class */
    public static class TileEntityCustom extends TileEntityLockableLoot {
        private NonNullList<ItemStack> stacks = NonNullList.func_191197_a(9, ItemStack.field_190927_a);

        public int func_70302_i_() {
            return 9;
        }

        public boolean func_191420_l() {
            Iterator it = this.stacks.iterator();
            while (it.hasNext()) {
                ItemStack itemstack = (ItemStack) it.next();
                if (!itemstack.func_190926_b()) {
                    return false;
                }
            }
            return true;
        }

        public boolean func_94041_b(int index, ItemStack stack) {
            return true;
        }

        public ItemStack func_70301_a(int slot) {
            return (ItemStack) this.stacks.get(slot);
        }

        public String func_70005_c_() {
            return "container.sum_yao_s_hou_block_4";
        }

        public void func_145839_a(NBTTagCompound compound) {
            super.func_145839_a(compound);
            this.stacks = NonNullList.func_191197_a(func_70302_i_(), ItemStack.field_190927_a);
            if (!func_184283_b(compound)) {
                ItemStackHelper.func_191283_b(compound, this.stacks);
            }
        }

        public NBTTagCompound func_189515_b(NBTTagCompound compound) {
            super.func_189515_b(compound);
            if (!func_184282_c(compound)) {
                ItemStackHelper.func_191282_a(compound, this.stacks);
            }
            return compound;
        }

        public SPacketUpdateTileEntity func_189518_D_() {
            return new SPacketUpdateTileEntity(this.field_174879_c, 0, func_189517_E_());
        }

        public NBTTagCompound func_189517_E_() {
            return func_189515_b(new NBTTagCompound());
        }

        public void onDataPacket(NetworkManager net2, SPacketUpdateTileEntity pkt) {
            func_145839_a(pkt.func_148857_g());
        }

        public void handleUpdateTag(NBTTagCompound tag) {
            func_145839_a(tag);
        }

        public int func_70297_j_() {
            return 64;
        }

        public String func_174875_k() {
            return "yvanchuyaoshou:sum_yao_s_hou_block_4";
        }

        public Container func_174876_a(InventoryPlayer playerInventory, EntityPlayer playerIn) {
            func_184281_d(playerIn);
            return new ContainerChest(playerInventory, this, playerIn);
        }

        protected NonNullList<ItemStack> func_190576_q() {
            return this.stacks;
        }
    }
}
