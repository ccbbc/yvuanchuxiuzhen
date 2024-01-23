package net.mcreator.yvanchujiguan.item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.mcreator.yvanchujiguan.creativetab.TabGongfakuozhan;
import net.mcreator.yvanchujiguan.procedure.ProcedureGongFa17RightClickDo;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/item/ItemGongFa17.class */
public class ItemGongFa17 extends ElementsYvanchujiguanMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchujiguan:gong_fa_17")
    public static final Item block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public ItemGongFa17(ElementsYvanchujiguanMod instance) {
        super(instance, 23);
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
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchujiguan:gong_fa_17", "inventory"));
    }

    /* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/item/ItemGongFa17$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(0);
            this.field_77777_bU = 1;
            func_77655_b("gong_fa_17");
            setRegistryName("gong_fa_17");
            func_77637_a(TabGongfakuozhan.tab);
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
            list.add(new TextComponentTranslation("§e乱星海顶级功法,修炼者可运用辟邪雷电为己所用", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("§7煞气低于50可修炼", new Object[0]).func_150261_e());
        }

        public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
            ActionResult<ItemStack> ar = super.func_77659_a(world, entity, hand);
            ItemStack itemstack = (ItemStack) ar.func_188398_b();
            int x = (int) entity.field_70165_t;
            int y = (int) entity.field_70163_u;
            int z = (int) entity.field_70161_v;
            ItemGongFa17.$_dependencies.put("entity", entity);
            ItemGongFa17.$_dependencies.put("itemstack", itemstack);
            ItemGongFa17.$_dependencies.put("x", Integer.valueOf(x));
            ItemGongFa17.$_dependencies.put("y", Integer.valueOf(y));
            ItemGongFa17.$_dependencies.put("z", Integer.valueOf(z));
            ItemGongFa17.$_dependencies.put("world", world);
            ProcedureGongFa17RightClickDo.executeProcedure(ItemGongFa17.$_dependencies);
            return ar;
        }
    }
}
