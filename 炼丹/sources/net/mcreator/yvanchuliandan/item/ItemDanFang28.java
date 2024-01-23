package net.mcreator.yvanchuliandan.item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.procedure.ProcedureDanFangYou28;
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

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/item/ItemDanFang28.class */
public class ItemDanFang28 extends ElementsYvanchuliandanMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuliandan:dan_fang_28")
    public static final Item block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public ItemDanFang28(ElementsYvanchuliandanMod instance) {
        super(instance, 957);
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemCustom();
        });
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchuliandan:dan_fang_28", "inventory"));
    }

    /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/item/ItemDanFang28$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(0);
            this.field_77777_bU = 64;
            func_77655_b("dan_fang_28");
            setRegistryName("dan_fang_28");
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
            list.add(new TextComponentTranslation("化神境界方可炼制 消耗450灵力值", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("效果:服用后增加36法攻", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("配方:[主]千年芷芳花*1 [辅]九色狐魄(黄/紫都可以)*1", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("丹器:[五]级炼丹炉|五]级异火", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("§e右键提示炼材获取方式", new Object[0]).func_150261_e());
        }

        public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
            ActionResult<ItemStack> ar = super.func_77659_a(world, entity, hand);
            ItemStack itemstack = (ItemStack) ar.func_188398_b();
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            ItemDanFang28.$_dependencies.put("entity", entity);
            ItemDanFang28.$_dependencies.put("itemstack", itemstack);
            ProcedureDanFangYou28.executeProcedure(ItemDanFang28.$_dependencies);
            return ar;
        }
    }
}
