package net.mcreator.yvanchuxiuzhenfulu.item;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu21ItemInInventoryTick;
import net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu21RightClickedInAir;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
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

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/item/ItemFulu21.class */
public class ItemFulu21 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhenfulu:fulu21")
    public static final Item block = null;

    public ItemFulu21(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 113);
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemCustom();
        });
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchuxiuzhenfulu:fulu21", "inventory"));
    }

    /* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/item/ItemFulu21$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(400);
            this.field_77777_bU = 1;
            func_77655_b("fulu21");
            setRegistryName("fulu21");
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

        public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
            ActionResult<ItemStack> ar = super.func_77659_a(world, entity, hand);
            ItemStack itemStack = (ItemStack) ar.func_188398_b();
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            Map<String, Object> $_dependencies = new HashMap<>();
            ProcedureFulu21RightClickedInAir.executeProcedure($_dependencies);
            return ar;
        }

        public void func_77663_a(ItemStack itemstack, World world, Entity entity, int slot, boolean par5) {
            super.func_77663_a(itemstack, world, entity, slot, par5);
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            Map<String, Object> $_dependencies = new HashMap<>();
            ProcedureFulu21ItemInInventoryTick.executeProcedure($_dependencies);
        }
    }
}
