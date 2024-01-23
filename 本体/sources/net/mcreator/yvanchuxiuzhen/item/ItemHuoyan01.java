package net.mcreator.yvanchuxiuzhen.item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.creativetab.TabFenlei01;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan01RightClickedInAir;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan01RightClickedOnBlock;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan01ToolInInventoryTick;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/item/ItemHuoyan01.class */
public class ItemHuoyan01 extends ElementsYvanchuxiuzhenMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:huoyan01")
    public static final Item block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public ItemHuoyan01(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 5);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemCustom();
        });
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchuxiuzhen:huoyan01", "inventory"));
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/item/ItemHuoyan01$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(20);
            this.field_77777_bU = 1;
            func_77655_b("huoyan01");
            setRegistryName("huoyan01");
            func_77637_a(TabFenlei01.tab);
        }

        public int func_77619_b() {
            return 0;
        }

        public int func_77626_a(ItemStack itemstack) {
            return 0;
        }

        public float func_150893_a(ItemStack par1ItemStack, IBlockState par2Block) {
            return 1.0f;
        }

        public void func_77624_a(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
            super.func_77624_a(itemstack, world, list, flag);
            list.add(new TextComponentTranslation("一级异火", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("§c右键释放异火造成5火伤，消耗20灵力值", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("§bSHIFT+右键放置异火，消耗32灵力值", new Object[0]).func_150261_e());
        }

        public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
            ActionResult<ItemStack> ar = super.func_77659_a(world, entity, hand);
            ItemStack itemstack = (ItemStack) ar.func_188398_b();
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            ItemHuoyan01.$_dependencies.put("entity", entity);
            ItemHuoyan01.$_dependencies.put("itemstack", itemstack);
            ItemHuoyan01.$_dependencies.put("world", world);
            ProcedureHuoyan01RightClickedInAir.executeProcedure(ItemHuoyan01.$_dependencies);
            return ar;
        }

        public EnumActionResult onItemUseFirst(EntityPlayer entity, World world, BlockPos pos, EnumFacing direction, float hitX, float hitY, float hitZ, EnumHand hand) {
            EnumActionResult retval = super.onItemUseFirst(entity, world, pos, direction, hitX, hitY, hitZ, hand);
            ItemStack itemstack = entity.func_184586_b(hand);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            ItemHuoyan01.$_dependencies.put("direction", direction);
            ItemHuoyan01.$_dependencies.put("entity", entity);
            ItemHuoyan01.$_dependencies.put("itemstack", itemstack);
            ItemHuoyan01.$_dependencies.put("x", Integer.valueOf(x));
            ItemHuoyan01.$_dependencies.put("y", Integer.valueOf(y));
            ItemHuoyan01.$_dependencies.put("z", Integer.valueOf(z));
            ItemHuoyan01.$_dependencies.put("world", world);
            ProcedureHuoyan01RightClickedOnBlock.executeProcedure(ItemHuoyan01.$_dependencies);
            return retval;
        }

        public void func_77663_a(ItemStack itemstack, World world, Entity entity, int slot, boolean par5) {
            super.func_77663_a(itemstack, world, entity, slot, par5);
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            ItemHuoyan01.$_dependencies.put("itemstack", itemstack);
            ProcedureHuoyan01ToolInInventoryTick.executeProcedure(ItemHuoyan01.$_dependencies);
        }
    }
}
