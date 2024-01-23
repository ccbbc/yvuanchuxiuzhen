package net.mcreator.fabaokuozhan.item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.procedure.ProcedureYuJian5YouJian;
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
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemYuJian5.class */
public class ItemYuJian5 extends ElementsFabaokuozhanMod.ModElement {
    @GameRegistry.ObjectHolder("fabaokuozhan:yu_jian_5")
    public static final Item block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public ItemYuJian5(ElementsFabaokuozhanMod instance) {
        super(instance, 95);
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
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("fabaokuozhan:yu_jian_5", "inventory"));
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemYuJian5$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(0);
            this.field_77777_bU = 64;
            func_77655_b("yu_jian_5");
            setRegistryName("yu_jian_5");
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
            list.add(new TextComponentTranslation("化神境界方可炼制 消耗3500灵力值", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("化神期法宝 [威能]挥击破坏地面对敌人造成伤害", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("炼材:[主]折骨钢*4 [辅]文玉木*5 [辅]兽皇真血*4", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("炼器:[五]级炼器鼎|[五]级异火", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("§b右键提示炼材获取方式", new Object[0]).func_150261_e());
        }

        public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
            ActionResult<ItemStack> ar = super.func_77659_a(world, entity, hand);
            ItemStack itemstack = (ItemStack) ar.func_188398_b();
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            ItemYuJian5.$_dependencies.put("entity", entity);
            ItemYuJian5.$_dependencies.put("itemstack", itemstack);
            ProcedureYuJian5YouJian.executeProcedure(ItemYuJian5.$_dependencies);
            return ar;
        }
    }
}
