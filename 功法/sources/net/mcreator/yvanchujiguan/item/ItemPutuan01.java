package net.mcreator.yvanchujiguan.item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.mcreator.yvanchujiguan.procedure.ProcedurePutuan01RightClickedOnBlock;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/item/ItemPutuan01.class */
public class ItemPutuan01 extends ElementsYvanchujiguanMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchujiguan:putuan01")
    public static final Item block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public ItemPutuan01(ElementsYvanchujiguanMod instance) {
        super(instance, 2);
    }

    @Override // net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemCustom();
        });
    }

    @Override // net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchujiguan:putuan01", "inventory"));
    }

    /* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/item/ItemPutuan01$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(0);
            this.field_77777_bU = 64;
            func_77655_b("putuan01");
            setRegistryName("putuan01");
            func_77637_a(CreativeTabs.field_78026_f);
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
            list.add(new TextComponentTranslation("可以坐在上面打坐", new Object[0]).func_150261_e());
        }

        public EnumActionResult onItemUseFirst(EntityPlayer entity, World world, BlockPos pos, EnumFacing direction, float hitX, float hitY, float hitZ, EnumHand hand) {
            EnumActionResult retval = super.onItemUseFirst(entity, world, pos, direction, hitX, hitY, hitZ, hand);
            ItemStack itemstack = entity.func_184586_b(hand);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            ItemPutuan01.$_dependencies.put("direction", direction);
            ItemPutuan01.$_dependencies.put("entity", entity);
            ItemPutuan01.$_dependencies.put("itemstack", itemstack);
            ItemPutuan01.$_dependencies.put("x", Integer.valueOf(x));
            ItemPutuan01.$_dependencies.put("y", Integer.valueOf(y));
            ItemPutuan01.$_dependencies.put("z", Integer.valueOf(z));
            ItemPutuan01.$_dependencies.put("world", world);
            ProcedurePutuan01RightClickedOnBlock.executeProcedure(ItemPutuan01.$_dependencies);
            return retval;
        }
    }
}
