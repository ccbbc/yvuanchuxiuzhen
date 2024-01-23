package net.mcreator.yvanchuxiuzhen.item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan01RightClickedOnBlock;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan01ToolInInventoryTick;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan08RightClickedInAir;
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
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/item/ItemHuoyan08.class */
public class ItemHuoyan08 extends ElementsYvanchuxiuzhenMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:huoyan08")
    public static final Item block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public ItemHuoyan08(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 137);
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
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchuxiuzhen:huoyan08", "inventory"));
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/item/ItemHuoyan08$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(240);
            this.field_77777_bU = 1;
            func_77655_b("huoyan08");
            setRegistryName("huoyan08");
            func_77637_a(null);
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
            list.add(new TextComponentTranslation("八级异火", new Object[0]).func_150261_e());
        }

        public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
            ActionResult<ItemStack> ar = super.func_77659_a(world, entity, hand);
            ItemStack itemstack = (ItemStack) ar.func_188398_b();
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            ItemHuoyan08.$_dependencies.put("entity", entity);
            ItemHuoyan08.$_dependencies.put("itemstack", itemstack);
            ItemHuoyan08.$_dependencies.put("world", world);
            ProcedureHuoyan08RightClickedInAir.executeProcedure(ItemHuoyan08.$_dependencies);
            return ar;
        }

        public EnumActionResult onItemUseFirst(EntityPlayer entity, World world, BlockPos pos, EnumFacing direction, float hitX, float hitY, float hitZ, EnumHand hand) {
            EnumActionResult retval = super.onItemUseFirst(entity, world, pos, direction, hitX, hitY, hitZ, hand);
            ItemStack itemstack = entity.func_184586_b(hand);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            ItemHuoyan08.$_dependencies.put("direction", direction);
            ItemHuoyan08.$_dependencies.put("entity", entity);
            ItemHuoyan08.$_dependencies.put("itemstack", itemstack);
            ItemHuoyan08.$_dependencies.put("x", Integer.valueOf(x));
            ItemHuoyan08.$_dependencies.put("y", Integer.valueOf(y));
            ItemHuoyan08.$_dependencies.put("z", Integer.valueOf(z));
            ItemHuoyan08.$_dependencies.put("world", world);
            ProcedureHuoyan01RightClickedOnBlock.executeProcedure(ItemHuoyan08.$_dependencies);
            return retval;
        }

        public void func_77663_a(ItemStack itemstack, World world, Entity entity, int slot, boolean par5) {
            super.func_77663_a(itemstack, world, entity, slot, par5);
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            ItemHuoyan08.$_dependencies.put("itemstack", itemstack);
            ProcedureHuoyan01ToolInInventoryTick.executeProcedure(ItemHuoyan08.$_dependencies);
        }
    }
}
