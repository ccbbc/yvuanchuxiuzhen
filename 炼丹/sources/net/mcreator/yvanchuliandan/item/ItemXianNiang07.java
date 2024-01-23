package net.mcreator.yvanchuliandan.item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.creativetab.TabNiangJiu;
import net.mcreator.yvanchuliandan.procedure.ProcedureXianNiangDrink07;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/item/ItemXianNiang07.class */
public class ItemXianNiang07 extends ElementsYvanchuliandanMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuliandan:xian_niang_07")
    public static final Item block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public ItemXianNiang07(ElementsYvanchuliandanMod instance) {
        super(instance, 247);
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemFoodCustom();
        });
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchuliandan:xian_niang_07", "inventory"));
    }

    /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/item/ItemXianNiang07$ItemFoodCustom.class */
    public static class ItemFoodCustom extends ItemFood {
        public ItemFoodCustom() {
            super(0, 0.1f, false);
            func_77655_b("xian_niang_07");
            setRegistryName("xian_niang_07");
            func_77848_i();
            func_77637_a(TabNiangJiu.tab);
            func_77625_d(64);
        }

        public void func_77624_a(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
            super.func_77624_a(itemstack, world, list, flag);
            list.add(new TextComponentTranslation("松子之香与酒香相融，木灵气浓厚，据说饮用此酒可洗练灵根", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("饮用后 回复550气血 临时加300物防/3分钟", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("第一次饮用额外属性:饮用后增加50寿元，无木灵根者有百分之二十五概率增加木灵根，有木灵根者增加3000真元", new Object[0]).func_150261_e());
        }

        public EnumAction func_77661_b(ItemStack par1ItemStack) {
            return EnumAction.DRINK;
        }

        protected void func_77849_c(ItemStack itemStack, World world, EntityPlayer entity) {
            super.func_77849_c(itemStack, world, entity);
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            ItemXianNiang07.$_dependencies.put("entity", entity);
            ProcedureXianNiangDrink07.executeProcedure(ItemXianNiang07.$_dependencies);
        }
    }
}
