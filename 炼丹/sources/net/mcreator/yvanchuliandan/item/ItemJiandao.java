package net.mcreator.yvanchuliandan.item;

import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.mcreator.yvanchuliandan.creativetab.TabLiandan;
import net.mcreator.yvanchuliandan.procedure.ProcedureJiandaoDangFangKuaiBeiGongJuPoPi;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/item/ItemJiandao.class */
public class ItemJiandao extends ElementsYvanchuliandanMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuliandan:yaochu")
    public static final Item block = null;

    public ItemJiandao(ElementsYvanchuliandanMod instance) {
        super(instance, 195);
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemToolCustom() { // from class: net.mcreator.yvanchuliandan.item.ItemJiandao.1
                @Override // net.mcreator.yvanchuliandan.item.ItemJiandao.ItemToolCustom
                public boolean func_179218_a(ItemStack itemstack, World world, IBlockState bl, BlockPos pos, EntityLivingBase entity) {
                    boolean retval = super.func_179218_a(itemstack, world, bl, pos, entity);
                    int x = pos.func_177958_n();
                    int y = pos.func_177956_o();
                    int z = pos.func_177952_p();
                    Map $_dependencies = new HashMap();
                    $_dependencies.put("entity", entity);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureJiandaoDangFangKuaiBeiGongJuPoPi.executeProcedure($_dependencies);
                    return retval;
                }
            }.func_77655_b("yaochu").setRegistryName("yaochu").func_77637_a(TabLiandan.tab);
        });
    }

    @Override // net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchuliandan:yaochu", "inventory"));
    }

    /* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/item/ItemJiandao$ItemToolCustom.class */
    private static class ItemToolCustom extends Item {
        protected ItemToolCustom() {
            func_77656_e(500);
            func_77625_d(1);
        }

        public Multimap<String, AttributeModifier> func_111205_h(EntityEquipmentSlot equipmentSlot) {
            Multimap<String, AttributeModifier> multimap = super.func_111205_h(equipmentSlot);
            if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
                multimap.put(SharedMonsterAttributes.field_111264_e.func_111108_a(), new AttributeModifier(field_111210_e, "Tool modifier", 0.0d, 0));
                multimap.put(SharedMonsterAttributes.field_188790_f.func_111108_a(), new AttributeModifier(field_185050_h, "Tool modifier", -3.0d, 0));
            }
            return multimap;
        }

        public boolean func_150897_b(IBlockState blockIn) {
            return true;
        }

        public float func_150893_a(ItemStack par1ItemStack, IBlockState par2Block) {
            return 1.0f;
        }

        public boolean func_77644_a(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
            stack.func_77972_a(1, attacker);
            return true;
        }

        public boolean func_179218_a(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
            stack.func_77972_a(1, entityLiving);
            return true;
        }

        public boolean func_77662_d() {
            return true;
        }

        public int func_77619_b() {
            return 15;
        }
    }
}
