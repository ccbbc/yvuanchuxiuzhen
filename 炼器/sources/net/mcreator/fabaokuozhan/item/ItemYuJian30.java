package net.mcreator.fabaokuozhan.item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.procedure.ProcedureYuJianYouJian30;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
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

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemYuJian30.class */
public class ItemYuJian30 extends ElementsFabaokuozhanMod.ModElement {
    @GameRegistry.ObjectHolder("fabaokuozhan:yu_jian_30")
    public static final Item block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public ItemYuJian30(ElementsFabaokuozhanMod instance) {
        super(instance, 458);
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
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("fabaokuozhan:yu_jian_30", "inventory"));
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemYuJian30$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(0);
            this.field_77777_bU = 64;
            func_77655_b("yu_jian_30");
            setRegistryName("yu_jian_30");
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
            list.add(new TextComponentTranslation("练气境界且方可炼制 消耗70灵力值", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("储物袋 可为修士提供额外的存储空间", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("炼材:[主]云缕布*1  [辅]精铁*1  [辅]精血*1", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("炼器:赋灵台", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("§b右键提示炼材获取方式", new Object[0]).func_150261_e());
        }

        public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
            ActionResult<ItemStack> ar = super.func_77659_a(world, entity, hand);
            ItemStack itemstack = (ItemStack) ar.func_188398_b();
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            ItemYuJian30.$_dependencies.put("entity", entity);
            ItemYuJian30.$_dependencies.put("itemstack", itemstack);
            ProcedureYuJianYouJian30.executeProcedure(ItemYuJian30.$_dependencies);
            return ar;
        }
    }
}
