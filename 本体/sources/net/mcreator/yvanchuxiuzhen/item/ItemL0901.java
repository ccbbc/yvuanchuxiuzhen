package net.mcreator.yvanchuxiuzhen.item;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureL0101ItemInInventoryTick;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/item/ItemL0901.class */
public class ItemL0901 extends ElementsYvanchuxiuzhenMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhen:l0901")
    public static final Item block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public ItemL0901(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 89);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemCustom();
        });
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchuxiuzhen:l0901", "inventory"));
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/item/ItemL0901$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(0);
            this.field_77777_bU = 1;
            func_77655_b("l0901");
            setRegistryName("l0901");
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

        public void func_77663_a(ItemStack itemstack, World world, Entity entity, int slot, boolean par5) {
            super.func_77663_a(itemstack, world, entity, slot, par5);
            int x = (int) entity.field_70165_t;
            int y = (int) entity.field_70163_u;
            int z = (int) entity.field_70161_v;
            if ((entity instanceof EntityLivingBase) && ((EntityLivingBase) entity).func_184614_ca().equals(itemstack)) {
                ItemL0901.$_dependencies.put("entity", entity);
                ItemL0901.$_dependencies.put("itemstack", itemstack);
                ItemL0901.$_dependencies.put("x", Integer.valueOf(x));
                ItemL0901.$_dependencies.put("y", Integer.valueOf(y));
                ItemL0901.$_dependencies.put("z", Integer.valueOf(z));
                ItemL0901.$_dependencies.put("world", world);
                ProcedureL0101ItemInInventoryTick.executeProcedure(ItemL0901.$_dependencies);
            }
            ItemL0901.$_dependencies.put("entity", entity);
            ItemL0901.$_dependencies.put("itemstack", itemstack);
            ItemL0901.$_dependencies.put("x", Integer.valueOf(x));
            ItemL0901.$_dependencies.put("y", Integer.valueOf(y));
            ItemL0901.$_dependencies.put("z", Integer.valueOf(z));
            ItemL0901.$_dependencies.put("world", world);
            ProcedureL0101ItemInInventoryTick.executeProcedure(ItemL0901.$_dependencies);
        }
    }
}
