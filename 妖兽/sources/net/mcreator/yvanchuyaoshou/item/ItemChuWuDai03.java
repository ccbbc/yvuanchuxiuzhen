package net.mcreator.yvanchuyaoshou.item;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.creativetab.TabYaoshou;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureChuWuDai03RightClickDo;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
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

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/item/ItemChuWuDai03.class */
public class ItemChuWuDai03 extends ElementsYvanchuyaoshouMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuyaoshou:chu_wu_dai_03")
    public static final Item block = null;
    static Map<String, Object> $_dependencies = new HashMap();

    public ItemChuWuDai03(ElementsYvanchuyaoshouMod instance) {
        super(instance, 18);
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
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchuyaoshou:chu_wu_dai_03", "inventory"));
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/item/ItemChuWuDai03$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(0);
            this.field_77777_bU = 64;
            func_77655_b("chu_wu_dai_03");
            setRegistryName("chu_wu_dai_03");
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

        public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
            ActionResult<ItemStack> ar = super.func_77659_a(world, entity, hand);
            ItemStack itemstack = (ItemStack) ar.func_188398_b();
            int x = (int) entity.field_70165_t;
            int y = (int) entity.field_70163_u;
            int z = (int) entity.field_70161_v;
            ItemChuWuDai03.$_dependencies.put("entity", entity);
            ItemChuWuDai03.$_dependencies.put("itemstack", itemstack);
            ItemChuWuDai03.$_dependencies.put("x", Integer.valueOf(x));
            ItemChuWuDai03.$_dependencies.put("y", Integer.valueOf(y));
            ItemChuWuDai03.$_dependencies.put("z", Integer.valueOf(z));
            ItemChuWuDai03.$_dependencies.put("world", world);
            ProcedureChuWuDai03RightClickDo.executeProcedure(ItemChuWuDai03.$_dependencies);
            return ar;
        }
    }
}
