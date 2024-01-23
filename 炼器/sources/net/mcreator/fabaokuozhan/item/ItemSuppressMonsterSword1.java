package net.mcreator.fabaokuozhan.item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.creativetab.TabLianqi;
import net.mcreator.fabaokuozhan.procedure.ProcedureSuppressMonsterSword1DangHuoZhaoDeShiTiBeiGaiWuPinJiZhong;
import net.mcreator.fabaokuozhan.procedure.ProcedureSuppressMonsterSword1DangWuPinZaiShouShangMeiKeFaSheng;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemSuppressMonsterSword1.class */
public class ItemSuppressMonsterSword1 extends ElementsFabaokuozhanMod.ModElement {
    @GameRegistry.ObjectHolder("fabaokuozhan:suppress_monster_sword_1")
    public static final Item block = null;

    public ItemSuppressMonsterSword1(ElementsFabaokuozhanMod instance) {
        super(instance, 465);
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
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("fabaokuozhan:suppress_monster_sword_1", "inventory"));
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemSuppressMonsterSword1$ItemCustom.class */
    public static class ItemCustom extends Item {
        public ItemCustom() {
            func_77656_e(500);
            this.field_77777_bU = 1;
            func_77655_b("suppress_monster_sword_1");
            setRegistryName("suppress_monster_sword_1");
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
            list.add(new TextComponentTranslation("制作一级镇山碑的材料", new Object[0]).func_150261_e());
        }

        public boolean func_77644_a(ItemStack itemstack, EntityLivingBase entity, EntityLivingBase sourceentity) {
            super.func_77644_a(itemstack, entity, sourceentity);
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            World world = entity.field_70170_p;
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("entity", entity);
            ProcedureSuppressMonsterSword1DangHuoZhaoDeShiTiBeiGaiWuPinJiZhong.executeProcedure($_dependencies);
            return true;
        }

        public void func_77663_a(ItemStack itemstack, World world, Entity entity, int slot, boolean par5) {
            super.func_77663_a(itemstack, world, entity, slot, par5);
            int i = (int) entity.field_70165_t;
            int i2 = (int) entity.field_70163_u;
            int i3 = (int) entity.field_70161_v;
            if ((entity instanceof EntityLivingBase) && ((EntityLivingBase) entity).func_184614_ca().equals(itemstack)) {
                Map<String, Object> $_dependencies = new HashMap<>();
                $_dependencies.put("itemstack", itemstack);
                ProcedureSuppressMonsterSword1DangWuPinZaiShouShangMeiKeFaSheng.executeProcedure($_dependencies);
            }
        }
    }
}
