package net.mcreator.yvanchuxiuzhen.item;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureMilkBukkitDangShiWuBeiChiShi;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/item/ItemMilkBukkit.class */
public class ItemMilkBukkit extends ElementsYvanchuxiuzhenMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:milk_bukkit")
    public static final Item block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public ItemMilkBukkit(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 79);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemFoodCustom();
        });
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchuxiuzhen:milk_bukkit", "inventory"));
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/item/ItemMilkBukkit$ItemFoodCustom.class */
    public static class ItemFoodCustom extends ItemFood {
        public ItemFoodCustom() {
            super(2, 0.2f, false);
            func_77655_b("milk_bukkit");
            setRegistryName("milk_bukkit");
            func_77848_i();
            func_77637_a(CreativeTabs.field_78039_h);
            func_77625_d(1);
        }

        public EnumAction func_77661_b(ItemStack par1ItemStack) {
            return EnumAction.DRINK;
        }

        protected void func_77849_c(ItemStack itemStack, World world, EntityPlayer entity) {
            super.func_77849_c(itemStack, world, entity);
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            ItemMilkBukkit.$_dependencies.put("entity", entity);
            ProcedureMilkBukkitDangShiWuBeiChiShi.executeProcedure(ItemMilkBukkit.$_dependencies);
        }
    }
}
