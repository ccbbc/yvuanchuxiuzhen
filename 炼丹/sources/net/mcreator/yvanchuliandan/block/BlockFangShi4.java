package net.mcreator.yvanchuliandan.block;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.YvanchuliandanMod;
import net.mcreator.yvanchuliandan.gui.GuiFangShiGui4;
import net.mcreator.yvanchuliandan.procedure.ProcedureFangShi401;
import net.mcreator.yvanchuliandan.procedure.ProcedureShouWeiShengCheng;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
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
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Mirror;
import net.minecraft.util.NonNullList;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/block/BlockFangShi4.class */
public class BlockFangShi4 extends ElementsYvanchuliandanMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuliandan:fang_shi_4")
    public static final Block block = null;

    public BlockFangShi4(ElementsYvanchuliandanMod instance) {
        super(instance, 839);
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustom().setRegistryName("fang_shi_4");
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerTileEntity(TileEntityCustom.class, "yvanchuliandan:tileentityfang_shi_4");
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("yvanchuliandan:fang_shi_4", "inventory"));
    }

    /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/block/BlockFangShi4$BlockCustom.class */
    public static class BlockCustom extends Block implements ITileEntityProvider {
        public static final PropertyDirection FACING = BlockHorizontal.field_185512_D;

        public BlockCustom() {
            super(Material.field_151573_f);
            func_149663_c("fang_shi_4");
            func_149672_a(SoundType.field_185852_e);
            func_149711_c(1.0f);
            func_149752_b(99.0f);
            func_149715_a(0.0f);
            func_149713_g(0);
            func_149647_a(CreativeTabs.field_78026_f);
            func_180632_j(this.field_176227_L.func_177621_b().func_177226_a(FACING, EnumFacing.NORTH));
        }

        @SideOnly(Side.CLIENT)
        public BlockRenderLayer func_180664_k() {
            return BlockRenderLayer.CUTOUT;
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

        public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
            drops.add(new ItemStack(Blocks.field_150350_a, 1));
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
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureFangShi401.executeProcedure($_dependencies);
            world.func_175684_a(new BlockPos(x, y, z), this, func_149738_a(world));
        }

        public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer entity, boolean willHarvest) {
            boolean retval = super.removedByPlayer(state, world, pos, entity, willHarvest);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureShouWeiShengCheng.executeProcedure($_dependencies);
            return retval;
        }

        public void func_180652_a(World world, BlockPos pos, Explosion e) {
            super.func_180652_a(world, pos, e);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureShouWeiShengCheng.executeProcedure($_dependencies);
        }

        public boolean func_180639_a(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
            super.func_180639_a(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            if (entity instanceof EntityPlayer) {
                entity.openGui(YvanchuliandanMod.instance, GuiFangShiGui4.GUIID, world, x, y, z);
                return true;
            }
            return true;
        }
    }

    /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/block/BlockFangShi4$TileEntityCustom.class */
    public static class TileEntityCustom extends TileEntityLockableLoot {
        private NonNullList<ItemStack> stacks = NonNullList.func_191197_a(2, ItemStack.field_190927_a);

        public int func_70302_i_() {
            return 2;
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
            return "container.fang_shi_4";
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
            return "yvanchuliandan:fang_shi_4";
        }

        public Container func_174876_a(InventoryPlayer playerInventory, EntityPlayer playerIn) {
            return new GuiFangShiGui4.GuiContainerMod(func_145831_w(), func_174877_v().func_177958_n(), func_174877_v().func_177956_o(), func_174877_v().func_177952_p(), playerIn);
        }

        protected NonNullList<ItemStack> func_190576_q() {
            return this.stacks;
        }
    }
}
