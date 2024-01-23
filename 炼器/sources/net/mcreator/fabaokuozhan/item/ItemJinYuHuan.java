package net.mcreator.fabaokuozhan.item;

import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.creativetab.TabLianqi;
import net.mcreator.fabaokuozhan.procedure.ProcedureJinYuHuanDangGongJuChuXianZaiShouZhongShi;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
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

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemJinYuHuan.class */
public class ItemJinYuHuan extends ElementsFabaokuozhanMod.ModElement {
    @GameRegistry.ObjectHolder("fabaokuozhan:jin_yu_huan")
    public static final Item block = null;

    public ItemJinYuHuan(ElementsFabaokuozhanMod instance) {
        super(instance, 12);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new ItemToolCustom() { // from class: net.mcreator.fabaokuozhan.item.ItemJinYuHuan.1
                public void func_77663_a(ItemStack itemstack, World world, Entity entity, int slot, boolean par5) {
                    super.func_77663_a(itemstack, world, entity, slot, par5);
                    int i = (int) entity.field_70165_t;
                    int i2 = (int) entity.field_70163_u;
                    int i3 = (int) entity.field_70161_v;
                    if ((entity instanceof EntityLivingBase) && ((EntityLivingBase) entity).func_184614_ca().equals(itemstack)) {
                        Map $_dependencies = new HashMap();
                        ProcedureJinYuHuanDangGongJuChuXianZaiShouZhongShi.executeProcedure($_dependencies);
                    }
                }
            }.func_77655_b("jin_yu_huan").setRegistryName("jin_yu_huan").func_77637_a(TabLianqi.tab);
        });
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("fabaokuozhan:jin_yu_huan", "inventory"));
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemJinYuHuan$ItemToolCustom.class */
    private static class ItemToolCustom extends Item {
        protected ItemToolCustom() {
            func_77656_e(0);
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
