package net.mcreator.yvanchuliandan.item;

import java.util.List;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.creativetab.TabNiangJiu;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/item/ItemJiuFang01.class */
public class ItemJiuFang01 extends ElementsYvanchuliandanMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuliandan:jiu_fang_01")
    public static final Item block = null;

    public ItemJiuFang01(ElementsYvanchuliandanMod instance) {
        super(instance, 227);
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
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchuliandan:jiu_fang_01", "inventory"));
    }

    /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/item/ItemJiuFang01$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(0);
            this.field_77777_bU = 64;
            func_77655_b("jiu_fang_01");
            setRegistryName("jiu_fang_01");
            func_77637_a(TabNiangJiu.tab);
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
            list.add("饮用后 临时加7法攻/2分钟");
            list.add("前三次饮用额外属性:饮用后增加30真元、3法攻");
            list.add("配方:[料]红阳精(紫)*2 [料]红榴果*1 [水]水瓶*1");
            list.add("在葫芦中进行合成");
            list.add("酒具:酒坛");
        }
    }
}
