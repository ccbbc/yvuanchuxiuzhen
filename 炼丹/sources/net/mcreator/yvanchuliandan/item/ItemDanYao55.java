package net.mcreator.yvanchuliandan.item;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.creativetab.TabLiandan;
import net.mcreator.yvanchuliandan.procedure.ProcedureDanYaoEat55;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
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

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/item/ItemDanYao55.class */
public class ItemDanYao55 extends ElementsYvanchuliandanMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuliandan:dan_yao_55")
    public static final Item block = null;

    public ItemDanYao55(ElementsYvanchuliandanMod instance) {
        super(instance, 176);
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
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchuliandan:dan_yao_55", "inventory"));
    }

    /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/item/ItemDanYao55$ItemFoodCustom.class */
    public static class ItemFoodCustom extends ItemFood {
        public ItemFoodCustom() {
            super(1, 0.1f, false);
            func_77655_b("dan_yao_55");
            setRegistryName("dan_yao_55");
            func_77848_i();
            func_77637_a(TabLiandan.tab);
            func_77625_d(64);
        }

        public EnumAction func_77661_b(ItemStack par1ItemStack) {
            return EnumAction.EAT;
        }

        protected void func_77849_c(ItemStack itemStack, World world, EntityPlayer entity) {
            super.func_77849_c(itemStack, world, entity);
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("entity", entity);
            ProcedureDanYaoEat55.executeProcedure($_dependencies);
        }
    }
}
