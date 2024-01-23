package net.mcreator.fabaokuozhan.block;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.procedure.ProcedureFabao1301UpdateTick;
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
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/block/BlockFabao1302.class */
public class BlockFabao1302 extends ElementsFabaokuozhanMod.ModElement {
    @GameRegistry.ObjectHolder("fabaokuozhan:fabao1302")
    public static final Block block = null;

    public BlockFabao1302(ElementsFabaokuozhanMod instance) {
        super(instance, 139);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustom().setRegistryName("fabao1302");
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerTileEntity(TileEntityCustom.class, "fabaokuozhan:tileentityfabao1302");
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("fabaokuozhan:fabao1302", "inventory"));
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/block/BlockFabao1302$BlockCustom.class */
    public static class BlockCustom extends Block implements ITileEntityProvider {
        public BlockCustom() {
            super(Material.field_151576_e);
            func_149663_c("fabao1302");
            func_149672_a(SoundType.field_185851_d);
            func_149711_c(1.0f);
            func_149752_b(20.0f);
            func_149715_a(0.0f);
            func_149713_g(0);
            func_149647_a(null);
            func_149722_s();
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
            return new AxisAlignedBB(0.0d, 0.0d, 0.0d, 1.0d, 0.3d, 1.0d);
        }

        public int func_149738_a(World world) {
            return 5;
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

        public void func_180663_b(World world, BlockPos pos, IBlockState state) {
            TileEntityCustom func_175625_s = world.func_175625_s(pos);
            if (func_175625_s instanceof TileEntityCustom) {
                InventoryHelper.func_180175_a(world, pos, func_175625_s);
            }
            world.func_175713_t(pos);
            super.func_180663_b(world, pos, state);
        }

        public boolean func_149740_M(IBlockState state) {
            return true;
        }

        public int func_180641_l(IBlockState blockState, World worldIn, BlockPos pos) {
            TileEntityCustom func_175625_s = worldIn.func_175625_s(pos);
            if (func_175625_s instanceof TileEntityCustom) {
                return Container.func_94526_b(func_175625_s);
            }
            return 0;
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
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureFabao1301UpdateTick.executeProcedure($_dependencies);
            world.func_175684_a(new BlockPos(x, y, z), this, func_149738_a(world));
        }
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/block/BlockFabao1302$TileEntityCustom.class */
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
            return "container.fabao1302";
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
            return "fabaokuozhan:fabao1302";
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
