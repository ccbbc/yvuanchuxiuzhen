package net.mcreator.yvanchuyaoshou.item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.creativetab.TabYaoshou;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/item/ItemYaodan0203.class */
public class ItemYaodan0203 extends ElementsYvanchuyaoshouMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuyaoshou:yaodan0203")
    public static final Item block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public ItemYaodan0203(ElementsYvanchuyaoshouMod instance) {
        super(instance, 3);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemCustom();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchuyaoshou:yaodan0203", "inventory"));
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/item/ItemYaodan0203$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(0);
            this.field_77777_bU = 64;
            func_77655_b("yaodan0203");
            setRegistryName("yaodan0203");
            func_77637_a(TabYaoshou.tab);
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
            list.add(new TextComponentTranslation("三阶的妖兽内丹，富有灵气", new Object[0]).func_150261_e());
        }
    }
}
