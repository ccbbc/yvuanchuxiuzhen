package net.mcreator.infinite_storage.item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mcreator.infinite_storage.ElementsInfiniteStorageMod;
import net.mcreator.infinite_storage.procedure.ProcedureBigBagGuiOpen;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
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

@ElementsInfiniteStorageMod.ModElement.Tag
/* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/item/ItemBigBag.class */
public class ItemBigBag extends ElementsInfiniteStorageMod.ModElement {
    @GameRegistry.ObjectHolder("infinite_storage:big_bag")
    public static final Item block = null;

    public ItemBigBag(ElementsInfiniteStorageMod instance) {
        super(instance, 3);
    }

    @Override // net.mcreator.infinite_storage.ElementsInfiniteStorageMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemCustom();
        });
    }

    @Override // net.mcreator.infinite_storage.ElementsInfiniteStorageMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("infinite_storage:big_bag", "inventory"));
    }

    /* loaded from: 储物袋-mc1.12.2-2.0.0.jar:net/mcreator/infinite_storage/item/ItemBigBag$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(0);
            this.field_77777_bU = 1;
            func_77655_b("big_bag");
            setRegistryName("big_bag");
            func_77637_a(CreativeTabs.field_78026_f);
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
            list.add(new TextComponentTranslation("bag.lore.c", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("§c打开此储物袋前提是神识力达到192，消耗10灵力", new Object[0]).func_150261_e());
        }

        public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
            ActionResult<ItemStack> ar = super.func_77659_a(world, entity, hand);
            ItemStack itemStack = (ItemStack) ar.func_188398_b();
            int x = (int) entity.field_70165_t;
            int y = (int) entity.field_70163_u;
            int z = (int) entity.field_70161_v;
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureBigBagGuiOpen.executeProcedure($_dependencies);
            return ar;
        }
    }
}
