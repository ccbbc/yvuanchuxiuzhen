package net.mcreator.yvanchuxiuzhenfulu.item;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.YvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.creativetab.TabFuzhen;
import net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu18BulletHitsLivingEntity;
import net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulushiyongyvyan;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.init.Enchantments;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
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

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/item/ItemFulu18.class */
public class ItemFulu18 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    @GameRegistry.ObjectHolder("yvanchuxiuzhenfulu:fulu18")
    public static final Item block = null;
    public static final int ENTITYID = 13;

    public ItemFulu18(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 17);
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    public void initElements() {
        this.elements.items.add(() -> {
            return new RangedItem();
        });
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityArrowCustom.class).id(new ResourceLocation(YvanchuxiuzhenfuluMod.MODID, "entitybulletfulu18"), 13).name("entitybulletfulu18").tracker(64, 1, true).build();
        });
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("yvanchuxiuzhenfulu:fulu18", "inventory"));
    }

    @Override // net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityArrowCustom.class, renderManager -> {
            return new RenderSnowball(renderManager, new ItemStack(block, 1).func_77973_b(), Minecraft.func_71410_x().func_175599_af());
        });
    }

    /* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/item/ItemFulu18$RangedItem.class */
    public static class RangedItem extends Item {
        public RangedItem() {
            func_77656_e(0);
            func_77664_n();
            func_77655_b("fulu18");
            setRegistryName("fulu18");
            this.field_77777_bU = 16;
            func_77637_a(TabFuzhen.tab);
        }

        public void func_77615_a(ItemStack itemstack, World world, EntityLivingBase entityLivingBase, int timeLeft) {
            if (!world.field_72995_K && (entityLivingBase instanceof EntityPlayerMP)) {
                EntityPlayerMP entity = (EntityPlayerMP) entityLivingBase;
                int slotID = -1;
                int i = 0;
                while (true) {
                    if (i < entity.field_71071_by.field_70462_a.size()) {
                        ItemStack stack = (ItemStack) entity.field_71071_by.field_70462_a.get(i);
                        if (stack == null || stack.func_77973_b() != new ItemStack(ItemFulu18.block, 1).func_77973_b() || stack.func_77960_j() != new ItemStack(ItemFulu18.block, 1).func_77960_j()) {
                            i++;
                        } else {
                            slotID = i;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (entity.field_71075_bZ.field_75098_d || EnchantmentHelper.func_77506_a(Enchantments.field_185312_x, itemstack) > 0 || slotID != -1) {
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
                    if (entity.field_71075_bZ.field_75098_d) {
                        entityarrow.field_70251_a = EntityArrow.PickupStatus.CREATIVE_ONLY;
                    } else if (new ItemStack(ItemFulu18.block, 1).func_77984_f()) {
                        ItemStack stack2 = entity.field_71071_by.func_70301_a(slotID);
                        if (stack2.func_96631_a(1, field_77697_d, entity)) {
                            stack2.func_190918_g(1);
                            stack2.func_77964_b(0);
                        }
                    } else {
                        entity.field_71071_by.func_174925_a(new ItemStack(ItemFulu18.block, 1).func_77973_b(), -1, 1, (NBTTagCompound) null);
                    }
                    if (!world.field_72995_K) {
                        world.func_72838_d(entityarrow);
                    }
                    Map<String, Object> $_dependencies = new HashMap<>();
                    $_dependencies.put("entity", entity);
                    $_dependencies.put("itemstack", itemstack);
                    $_dependencies.put("x", Integer.valueOf(x));
                    $_dependencies.put("y", Integer.valueOf(y));
                    $_dependencies.put("z", Integer.valueOf(z));
                    $_dependencies.put("world", world);
                    ProcedureFulushiyongyvyan.executeProcedure($_dependencies);
                }
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

    /* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/item/ItemFulu18$EntityArrowCustom.class */
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
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            Object world = this.field_70170_p;
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureFulu18BulletHitsLivingEntity.executeProcedure($_dependencies);
        }

        public void func_70071_h_() {
            super.func_70071_h_();
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            Object world = this.field_70170_p;
            Entity entity = this.field_70250_c;
            if (this.field_70254_i) {
                Map<String, Object> $_dependencies = new HashMap<>();
                $_dependencies.put("x", Integer.valueOf(x));
                $_dependencies.put("y", Integer.valueOf(y));
                $_dependencies.put("z", Integer.valueOf(z));
                $_dependencies.put("world", world);
                ProcedureFulu18BulletHitsLivingEntity.executeProcedure($_dependencies);
                this.field_70170_p.func_72900_e(this);
            }
        }
    }
}
