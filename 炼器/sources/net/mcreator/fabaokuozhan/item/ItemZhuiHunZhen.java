package net.mcreator.fabaokuozhan.item;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.FabaokuozhanMod;
import net.mcreator.fabaokuozhan.creativetab.TabLianqi;
import net.mcreator.fabaokuozhan.procedure.ProcedureZhuiHunZhenDangYuanChengWuPinShiYongShi;
import net.mcreator.fabaokuozhan.procedure.ProcedureZhuiHunZhenDangZiDanJiZhongShengCunShiTiShi;
import net.mcreator.fabaokuozhan.procedure.ProcedureZhuiHunZhenZiDanFeiXingGanShi;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemZhuiHunZhen.class */
public class ItemZhuiHunZhen extends ElementsFabaokuozhanMod.ModElement {
    @GameRegistry.ObjectHolder("fabaokuozhan:zhui_hun_zhen")
    public static final Item block = null;
    public static final int ENTITYID = 25;

    public ItemZhuiHunZhen(ElementsFabaokuozhanMod instance) {
        super(instance, 398);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new RangedItem();
        });
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityArrowCustom.class).id(new ResourceLocation(FabaokuozhanMod.MODID, "entitybulletzhui_hun_zhen"), 25).name("entitybulletzhui_hun_zhen").tracker(64, 1, true).build();
        });
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("fabaokuozhan:zhui_hun_zhen", "inventory"));
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityArrowCustom.class, renderManager -> {
            return new RenderSnowball(renderManager, new ItemStack(block, 1).func_77973_b(), Minecraft.func_71410_x().func_175599_af());
        });
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemZhuiHunZhen$RangedItem.class */
    public static class RangedItem extends Item {
        public RangedItem() {
            func_77656_e(1200);
            func_77664_n();
            func_77655_b("zhui_hun_zhen");
            setRegistryName("zhui_hun_zhen");
            this.field_77777_bU = 1;
            func_77637_a(TabLianqi.tab);
        }

        public void func_77615_a(ItemStack itemstack, World world, EntityLivingBase entityLivingBase, int timeLeft) {
            if (!world.field_72995_K && (entityLivingBase instanceof EntityPlayerMP)) {
                EntityPlayerMP entity = (EntityPlayerMP) entityLivingBase;
                EntityArrowCustom entityarrow = new EntityArrowCustom(world, entity);
                entityarrow.func_70186_c(entity.func_70040_Z().field_72450_a, entity.func_70040_Z().field_72448_b, entity.func_70040_Z().field_72449_c, 1.0f * 2.0f, 0.0f);
                entityarrow.func_174810_b(true);
                entityarrow.func_70243_d(false);
                entityarrow.func_70239_b(0.0d);
                entityarrow.func_70240_a(0);
                itemstack.func_77972_a(1, entity);
                int x = (int) entity.field_70165_t;
                int y = (int) entity.field_70163_u;
                int z = (int) entity.field_70161_v;
                world.func_184148_a((EntityPlayer) null, x, y, z, (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("")), SoundCategory.NEUTRAL, 1.0f, (1.0f / ((field_77697_d.nextFloat() * 0.5f) + 1.0f)) + (1.0f / 2.0f));
                entityarrow.field_70251_a = EntityArrow.PickupStatus.DISALLOWED;
                if (!world.field_72995_K) {
                    world.func_72838_d(entityarrow);
                }
                Map<String, Object> $_dependencies = new HashMap<>();
                $_dependencies.put("entity", entity);
                $_dependencies.put("itemstack", itemstack);
                ProcedureZhuiHunZhenDangYuanChengWuPinShiYongShi.executeProcedure($_dependencies);
            }
        }

        public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer entity, EnumHand hand) {
            entity.func_184598_c(hand);
            return new ActionResult<>(EnumActionResult.SUCCESS, entity.func_184586_b(hand));
        }

        public EnumAction func_77661_b(ItemStack itemstack) {
            return EnumAction.BOW;
        }

        public int func_77626_a(ItemStack itemstack) {
            return 72000;
        }
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/item/ItemZhuiHunZhen$EntityArrowCustom.class */
    public static class EntityArrowCustom extends EntityTippedArrow {
        public EntityArrowCustom(World a) {
            super(a);
        }

        public EntityArrowCustom(World worldIn, double x, double y, double z) {
            super(worldIn, x, y, z);
        }

        public EntityArrowCustom(World worldIn, EntityLivingBase shooter) {
            super(worldIn, shooter);
        }

        protected void func_184548_a(EntityLivingBase entity) {
            super.func_184548_a(entity);
            entity.func_85034_r(entity.func_85035_bI() - 1);
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            World world = this.field_70170_p;
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("entity", entity);
            ProcedureZhuiHunZhenDangZiDanJiZhongShengCunShiTiShi.executeProcedure($_dependencies);
        }

        public void func_70071_h_() {
            super.func_70071_h_();
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            Object world = this.field_70170_p;
            Entity entity = this.field_70250_c;
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureZhuiHunZhenZiDanFeiXingGanShi.executeProcedure($_dependencies);
            if (this.field_70254_i) {
                this.field_70170_p.func_72900_e(this);
            }
        }
    }
}
