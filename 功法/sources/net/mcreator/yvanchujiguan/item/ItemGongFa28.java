package net.mcreator.yvanchujiguan.item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.mcreator.yvanchujiguan.creativetab.TabGongfakuozhan;
import net.mcreator.yvanchujiguan.procedure.ProcedureGongFa28RightClickDo;
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
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/item/ItemGongFa28.class */
public class ItemGongFa28 extends ElementsYvanchujiguanMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchujiguan:gong_fa_28")
    public static final Item block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public ItemGongFa28(ElementsYvanchujiguanMod instance) {
        super(instance, 21);
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
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchujiguan:gong_fa_28", "inventory"));
    }

    /* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/item/ItemGongFa28$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(0);
            this.field_77777_bU = 1;
            func_77655_b("gong_fa_28");
            setRegistryName("gong_fa_28");
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
            list.add(new TextComponentTranslation("§f上古修士所创,修炼大成者克尽天下五行", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("§7五灵根修仙者可修炼", new Object[0]).func_150261_e());
        }

        public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
            ActionResult<ItemStack> ar = super.func_77659_a(world, entity, hand);
            ItemStack itemstack = (ItemStack) ar.func_188398_b();
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            ItemGongFa28.$_dependencies.put("entity", entity);
            ItemGongFa28.$_dependencies.put("itemstack", itemstack);
            ProcedureGongFa28RightClickDo.executeProcedure(ItemGongFa28.$_dependencies);
            return ar;
        }
    }
}
