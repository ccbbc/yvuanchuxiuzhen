package net.mcreator.yvanchuliandan.item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
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

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/item/ItemSectFormula5.class */
public class ItemSectFormula5 extends ElementsYvanchuliandanMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuliandan:sect_formula_5")
    public static final Item block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public ItemSectFormula5(ElementsYvanchuliandanMod instance) {
        super(instance, 938);
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
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchuliandan:sect_formula_5", "inventory"));
    }

    /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/item/ItemSectFormula5$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(0);
            this.field_77777_bU = 64;
            func_77655_b("sect_formula_5");
            setRegistryName("sect_formula_5");
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
            list.add(new TextComponentTranslation("(境界需求:化神)五阶镇妖剑:于[炼器鼎]中,主材[四阶镇妖剑] 辅材[白魄*4] 辅材[辟邪假丹*4] (境界需求:化神)太极云图符:于[制符台]中,笔框里放入[四阶符笔]，纸框里放入[七星云图符]", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("(境界需求:化神)太极护山阵:于[阵法制作台]中,主材[土阵旗] 辅材1[混沌假丹*5] 辅材2[幻源*3] 辅材3[中级灵石*18]", new Object[0]).func_150261_e());
        }
    }
}
