package net.mcreator.yvanchuliandan.item;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.creativetab.TabLiandan;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/item/ItemCaoYao52.class */
public class ItemCaoYao52 extends ElementsYvanchuliandanMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuliandan:cao_yao_52")
    public static final Item block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public ItemCaoYao52(ElementsYvanchuliandanMod instance) {
        super(instance, 970);
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
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchuliandan:cao_yao_52", "inventory"));
    }

    /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/item/ItemCaoYao52$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(0);
            this.field_77777_bU = 64;
            func_77655_b("cao_yao_52");
            setRegistryName("cao_yao_52");
            func_77637_a(TabLiandan.tab);
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
    }
}
