package net.mcreator.yuanchuzhushou.item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod;
import net.mcreator.yuanchuzhushou.creativetab.TabGamemode1;
import net.mcreator.yuanchuzhushou.procedure.ProcedureTiZhi;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYuanchuzhushouMod.ModElement.Tag
/* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/item/ItemTiZhi1.class */
public class ItemTiZhi1 extends ElementsYuanchuzhushouMod.ModElement {
    @GameRegistry.ObjectHolder("yuanchuzhushou:ti_zhi_1")
    public static final Item block = null;

    public ItemTiZhi1(ElementsYuanchuzhushouMod instance) {
        super(instance, 82);
    }

    @Override // net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemCustom();
        });
    }

    @Override // net.mcreator.yuanchuzhushou.ElementsYuanchuzhushouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yuanchuzhushou:ti_zhi_1", "inventory"));
    }

    /* loaded from: 助手-mc1.12.2-1.9.7.jar:net/mcreator/yuanchuzhushou/item/ItemTiZhi1$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(0);
            this.field_77777_bU = 64;
            func_77655_b("ti_zhi_1");
            setRegistryName("ti_zhi_1");
            func_77637_a(TabGamemode1.tab);
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
            list.add("右键消耗物品并获得平庸之体");
        }

        public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
            ActionResult<ItemStack> ar = super.func_77659_a(world, entity, hand);
            Object itemstack = (ItemStack) ar.func_188398_b();
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("entity", entity);
            $_dependencies.put("itemstack", itemstack);
            ProcedureTiZhi.executeProcedure($_dependencies);
            return ar;
        }
    }
}
