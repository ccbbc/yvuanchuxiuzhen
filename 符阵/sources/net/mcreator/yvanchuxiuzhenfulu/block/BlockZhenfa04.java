package net.mcreator.yvanchuxiuzhenfulu.block;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.YvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.creativetab.TabFuzhen;
import net.mcreator.yvanchuxiuzhenfulu.gui.GuiZhenFaTai;
import net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfa04BlockAdded;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
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
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/block/BlockZhenfa04.class */
public class BlockZhenfa04 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhenfulu:zhenfa04")
    public static final Block block = null;

    public BlockZhenfa04(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 51);
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    public void initElements() {
        this.elements.blocks.add(() -> {
            return new BlockCustom().setRegistryName("zhenfa04");
        });
        this.elements.items.add(() -> {
            return new ItemBlock(block).setRegistryName(block.getRegistryName());
        });
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerTileEntity(TileEntityCustom.class, "yvanchuxiuzhenfulu:tileentityzhenfa04");
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation("yvanchuxiuzhenfulu:zhenfa04", "inventory"));
    }

    /* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/block/BlockZhenfa04$BlockCustom.class */
    public static class BlockCustom extends Block implements ITileEntityProvider {
        public BlockCustom() {
            super(Material.field_151576_e);
            func_149663_c("zhenfa04");
            func_149672_a(SoundType.field_185851_d);
            setHarvestLevel("pickaxe", 0);
            func_149711_c(2.0f);
            func_149752_b(30.0f);
            func_149715_a(0.0f);
            func_149713_g(0);
            func_149647_a(TabFuzhen.tab);
        }

        public int func_149738_a(World world) {
            return 20;
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
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureZhenfa04BlockAdded.executeProcedure($_dependencies);
        }

        public void func_189540_a(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
            super.func_189540_a(state, world, pos, neighborBlock, fromPos);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            if (world.func_175687_A(new BlockPos(x, y, z)) > 0) {
            }
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureZhenfa04BlockAdded.executeProcedure($_dependencies);
        }

        public boolean func_180639_a(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
            super.func_180639_a(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            if (entity instanceof EntityPlayer) {
                entity.openGui(YvanchuxiuzhenfuluMod.instance, GuiZhenFaTai.GUIID, world, x, y, z);
                return true;
            }
            return true;
        }
    }

    /* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/block/BlockZhenfa04$TileEntityCustom.class */
    public static class TileEntityCustom extends TileEntityLockableLoot {
        private NonNullList<ItemStack> stacks = NonNullList.func_191197_a(7, ItemStack.field_190927_a);

        public int func_70302_i_() {
            return 7;
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
            return "container.zhenfa04";
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
            return "yvanchuxiuzhenfulu:zhenfa04";
        }

        public Container func_174876_a(InventoryPlayer playerInventory, EntityPlayer playerIn) {
            return new GuiZhenFaTai.GuiContainerMod(func_145831_w(), func_174877_v().func_177958_n(), func_174877_v().func_177956_o(), func_174877_v().func_177952_p(), playerIn);
        }

        protected NonNullList<ItemStack> func_190576_q() {
            return this.stacks;
        }
    }
}
