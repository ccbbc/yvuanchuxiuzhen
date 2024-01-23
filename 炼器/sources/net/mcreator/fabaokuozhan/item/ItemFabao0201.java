package net.mcreator.fabaokuozhan.item;

import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.creativetab.TabLianqi;
import net.mcreator.fabaokuozhan.procedure.ProcedureFaBao0201LianJi;
import net.mcreator.fabaokuozhan.procedure.ProcedureFabao0201DangGongJuChuXianZaiShouZhongShi;
import net.mcreator.fabaokuozhan.procedure.ProcedureFabao0201RightClickedInAir;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemFabao0201.class */
public class ItemFabao0201 extends ElementsFabaokuozhanMod.ModElement {
    @GameRegistry.ObjectHolder("fabaokuozhan:fabao0201")
    public static final Item block = null;

    public ItemFabao0201(ElementsFabaokuozhanMod instance) {
        super(instance, 20);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemToolCustom() { // from class: net.mcreator.fabaokuozhan.item.ItemFabao0201.1
                public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
                    ActionResult retval = super.func_77659_a(world, entity, hand);
                    ItemStack itemstack = (ItemStack) retval.func_188398_b();
                    int x = (int) entity.field_70165_t;
                    int y = (int) entity.field_70163_u;
                    int z = (int) entity.field_70161_v;
                    Map $_dependencies = new HashMap();
                    $_dependencies.put("entity", entity);
                    $_dependencies.put("itemstack", itemstack);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureFabao0201RightClickedInAir.executeProcedure($_dependencies);
                    return retval;
                }

                @Override // net.mcreator.fabaokuozhan.item.ItemFabao0201.ItemToolCustom
                public boolean func_77644_a(ItemStack itemstack, EntityLivingBase entity, EntityLivingBase sourceentity) {
                    super.func_77644_a(itemstack, entity, sourceentity);
                    int i = (int) entity.field_70165_t;
                    int i2 = (int) entity.field_70163_u;
                    int i3 = (int) entity.field_70161_v;
                    World world = entity.field_70170_p;
                    Map $_dependencies = new HashMap();
                    $_dependencies.put("entity", entity);
                    ProcedureFaBao0201LianJi.executeProcedure($_dependencies);
                    return true;
                }

                public void func_77663_a(ItemStack itemstack, World world, Entity entity, int slot, boolean par5) {
                    super.func_77663_a(itemstack, world, entity, slot, par5);
                    int i = (int) entity.field_70165_t;
                    int i2 = (int) entity.field_70163_u;
                    int i3 = (int) entity.field_70161_v;
                    if ((entity instanceof EntityLivingBase) && ((EntityLivingBase) entity).func_184614_ca().equals(itemstack)) {
                        Map $_dependencies = new HashMap();
                        $_dependencies.put("itemstack", itemstack);
                        ProcedureFabao0201DangGongJuChuXianZaiShouZhongShi.executeProcedure($_dependencies);
                    }
                }
            }.func_77655_b("fabao0201").setRegistryName("fabao0201").func_77637_a(TabLianqi.tab);
        });
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("fabaokuozhan:fabao0201", "inventory"));
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemFabao0201$ItemToolCustom.class */
    private static class ItemToolCustom extends Item {
        protected ItemToolCustom() {
            func_77656_e(1200);
            func_77625_d(1);
        }

        public Multimap<String, AttributeModifier> func_111205_h(EntityEquipmentSlot equipmentSlot) {
            Multimap<String, AttributeModifier> multimap = super.func_111205_h(equipmentSlot);
            if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
                multimap.put(SharedMonsterAttributes.field_111264_e.func_111108_a(), new AttributeModifier(field_111210_e, "Tool modifier", 0.0d, 0));
                multimap.put(SharedMonsterAttributes.field_188790_f.func_111108_a(), new AttributeModifier(field_185050_h, "Tool modifier", -2.5d, 0));
            }
            return multimap;
        }

        public float func_150893_a(ItemStack par1ItemStack, IBlockState par2Block) {
            return 0.0f;
        }

        public boolean func_179218_a(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
            stack.func_77972_a(1, entityLiving);
            return true;
        }

        public boolean func_77644_a(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
            stack.func_77972_a(2, attacker);
            return true;
        }

        public boolean func_77662_d() {
            return true;
        }

        public int func_77619_b() {
            return 0;
        }
    }
}
