package net.mcreator.fabaokuozhan.item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.creativetab.TabLianqi;
import net.mcreator.fabaokuozhan.procedure.ProcedureHandCaiLiao14;
import net.mcreator.fabaokuozhan.procedure.ProcedureJDCaiLiao16;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
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

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemCailiao16.class */
public class ItemCailiao16 extends ElementsFabaokuozhanMod.ModElement {
    @GameRegistry.ObjectHolder("fabaokuozhan:cailiao16")
    public static final Item block = null;

    public ItemCailiao16(ElementsFabaokuozhanMod instance) {
        super(instance, 43);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemCustom();
        });
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("fabaokuozhan:cailiao16", "inventory"));
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemCailiao16$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(0);
            this.field_77777_bU = 16;
            func_77655_b("cailiao16");
            setRegistryName("cailiao16");
            func_77637_a(TabLianqi.tab);
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
            list.add("四级，还不够重！（堆叠数量为16）");
        }

        public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
            ActionResult<ItemStack> ar = super.func_77659_a(world, entity, hand);
            Object itemstack = (ItemStack) ar.func_188398_b();
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("itemstack", itemstack);
            return ar;
        }

        public void func_77663_a(ItemStack itemstack, World world, Entity entity, int slot, boolean par5) {
            super.func_77663_a(itemstack, world, entity, slot, par5);
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            if ((entity instanceof EntityLivingBase) && ((EntityLivingBase) entity).func_184614_ca().equals(itemstack)) {
                Map<String, Object> $_dependencies = new HashMap<>();
                $_dependencies.put("entity", entity);
                ProcedureHandCaiLiao14.executeProcedure($_dependencies);
            }
            Map<String, Object> $_dependencies2 = new HashMap<>();
            $_dependencies2.put("itemstack", itemstack);
            ProcedureJDCaiLiao16.executeProcedure($_dependencies2);
        }
    }
}
