package net.mcreator.yvanchuxiuzhenfulu.item;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.creativetab.TabFuzhen;
import net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureTaoShuMiao1DangYouJianDianJiFangKuaiShi;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/item/ItemTaoShuMiao1.class */
public class ItemTaoShuMiao1 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhenfulu:tao_shu_miao_1")
    public static final Item block = null;

    public ItemTaoShuMiao1(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 486);
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
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchuxiuzhenfulu:tao_shu_miao_1", "inventory"));
    }

    /* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/item/ItemTaoShuMiao1$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(0);
            this.field_77777_bU = 64;
            func_77655_b("tao_shu_miao_1");
            setRegistryName("tao_shu_miao_1");
            func_77637_a(TabFuzhen.tab);
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

        public EnumActionResult onItemUseFirst(EntityPlayer entity, World world, BlockPos pos, EnumFacing direction, float hitX, float hitY, float hitZ, EnumHand hand) {
            EnumActionResult retval = super.onItemUseFirst(entity, world, pos, direction, hitX, hitY, hitZ, hand);
            Object itemstack = entity.func_184586_b(hand);
            int x = pos.func_177958_n();
            int y = pos.func_177956_o();
            int z = pos.func_177952_p();
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("itemstack", itemstack);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureTaoShuMiao1DangYouJianDianJiFangKuaiShi.executeProcedure($_dependencies);
            return retval;
        }
    }
}
