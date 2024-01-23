package net.mcreator.yvanchuyaoshou.item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.creativetab.TabYaoshou;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureBreakingconeUse;
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

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/item/ItemBreakingcone.class */
public class ItemBreakingcone extends ElementsYvanchuyaoshouMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuyaoshou:breaking_cone")
    public static final Item block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public ItemBreakingcone(ElementsYvanchuyaoshouMod instance) {
        super(instance, 386);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemCustom();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchuyaoshou:breaking_cone", "inventory"));
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/item/ItemBreakingcone$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(0);
            this.field_77777_bU = 1;
            func_77655_b("breaking_cone");
            setRegistryName("breaking_cone");
            func_77637_a(TabYaoshou.tab);
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
            list.add(new TextComponentTranslation("§b蹲下按V键查看法宝属性", new Object[0]).func_150261_e());
            list.add(new TextComponentTranslation("§d法宝置于背包中提供被动加成：百分之五物攻", new Object[0]).func_150261_e());
        }

        public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
            ActionResult<ItemStack> ar = super.func_77659_a(world, entity, hand);
            ItemStack itemstack = (ItemStack) ar.func_188398_b();
            int x = (int) entity.field_70165_t;
            int y = (int) entity.field_70163_u;
            int z = (int) entity.field_70161_v;
            ItemBreakingcone.$_dependencies.put("entity", entity);
            ItemBreakingcone.$_dependencies.put("itemstack", itemstack);
            ItemBreakingcone.$_dependencies.put("x", Integer.valueOf(x));
            ItemBreakingcone.$_dependencies.put("y", Integer.valueOf(y));
            ItemBreakingcone.$_dependencies.put("z", Integer.valueOf(z));
            ItemBreakingcone.$_dependencies.put("world", world);
            ProcedureBreakingconeUse.executeProcedure(ItemBreakingcone.$_dependencies);
            return ar;
        }
    }
}
