package net.mcreator.yvanchuyaoshou.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureShiJuRenUpdate;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureShouJiNbt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.RegistryNamespaced;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity1301.class */
public class EntityCaientity1301 extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 21;
    public static final int ENTITYID_RANGED = 22;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityCaientity1301(ElementsYvanchuyaoshouMod instance) {
        super(instance, 44);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "caientity1301"), 21).name("caientity1301").tracker(64, 3, true).build();
        });
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityArrowCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "entitybulletcaientity1301"), 22).name("entitybulletcaientity1301").tracker(64, 1, true).build();
        });
    }

    private Biome[] allbiomes(RegistryNamespaced<ResourceLocation, Biome> in) {
        Iterator<Biome> itr = in.iterator();
        ArrayList<Biome> ls = new ArrayList<>();
        while (itr.hasNext()) {
            ls.add(itr.next());
        }
        return (Biome[]) ls.toArray(new Biome[ls.size()]);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modelcaientity1301(), 0.7f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityCaientity1301.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/caientity1301.png");
                }
            };
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityArrowCustom.class, renderManager2 -> {
            return new RenderSnowball<EntityArrowCustom>(renderManager2, null, Minecraft.func_71410_x().func_175599_af()) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityCaientity1301.2
                /* renamed from: getStackToRender */
                public ItemStack func_177082_d(EntityArrowCustom entity) {
                    return new ItemStack(Blocks.field_150347_e, 1);
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity1301$EntityCustom.class */
    public static class EntityCustom extends EntityMob implements IRangedAttackMob {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(0.7f, 0.7f);
            this.field_70728_aV = 20;
            this.field_70178_ae = false;
            func_94061_f(false);
            func_110163_bv();
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70714_bg.func_75776_a(1, new EntityAILookIdle(this));
            this.field_70714_bg.func_75776_a(2, new EntityAIAttackMelee(this, 1.2d, false));
            this.field_70715_bh.func_75776_a(3, new EntityAIHurtByTarget(this, true, new Class[0]));
            this.field_70715_bh.func_75776_a(4, new EntityAINearestAttackableTarget(this, EntityPlayer.class, false, false));
            this.field_70714_bg.func_75776_a(1, new EntityAIAttackRanged(this, 1.25d, 20, 10.0f));
        }

        public EnumCreatureAttribute func_70668_bt() {
            return EnumCreatureAttribute.UNDEFINED;
        }

        protected boolean func_70692_ba() {
            return false;
        }

        protected Item func_146068_u() {
            return null;
        }

        public SoundEvent func_184639_G() {
            return (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation(""));
        }

        public SoundEvent func_184601_bQ(DamageSource ds) {
            return (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("entity.generic.hurt"));
        }

        public SoundEvent func_184615_bR() {
            return (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("entity.generic.death"));
        }

        protected float func_70599_aP() {
            return 1.0f;
        }

        public boolean func_70097_a(DamageSource source, float amount) {
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            source.func_76346_g();
            EntityCaientity1301.$_dependencies.put("entity", this);
            ProcedureShouJiNbt.executeProcedure(EntityCaientity1301.$_dependencies);
            if ((source.func_76364_f() instanceof EntityPotion) || source == DamageSource.field_76379_h) {
                return false;
            }
            return super.func_70097_a(source, amount);
        }

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityCaientity1301.$_dependencies.put("entity", this);
            EntityCaientity1301.$_dependencies.put("world", this.field_70170_p);
            ProcedureShiJuRenUpdate.executeProcedure(EntityCaientity1301.$_dependencies);
        }

        protected void func_110147_ax() {
            super.func_110147_ax();
            if (func_110148_a(SharedMonsterAttributes.field_188791_g) != null) {
                func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(8.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111263_d) != null) {
                func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111267_a) != null) {
                func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(20.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111264_e) != null) {
                func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(1.0d);
            }
        }

        public void func_184724_a(boolean swingingArms) {
        }

        public void func_82196_d(EntityLivingBase target, float flval) {
            EntityArrowCustom entityarrow = new EntityArrowCustom(this.field_70170_p, this);
            double d0 = (target.field_70163_u + target.func_70047_e()) - 1.1d;
            double d1 = target.field_70165_t - this.field_70165_t;
            double d3 = target.field_70161_v - this.field_70161_v;
            entityarrow.func_70186_c(d1, (d0 - entityarrow.field_70163_u) + (MathHelper.func_76133_a((d1 * d1) + (d3 * d3)) * 0.20000000298023224d), d3, 1.6f, 12.0f);
            this.field_70170_p.func_72838_d(entityarrow);
        }
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity1301$EntityArrowCustom.class */
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
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity1301$Modelcaientity1301.class */
    public static class Modelcaientity1301 extends ModelBase {
        private final ModelRenderer bone;

        public Modelcaientity1301() {
            this.field_78090_t = 40;
            this.field_78089_u = 26;
            this.bone = new ModelRenderer(this);
            this.bone.func_78793_a(0.0f, 24.0f, 0.0f);
            this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 0, -5.0f, -5.0f, -5.0f, 10, 5, 10, 0.0f, false));
            this.bone.field_78804_l.add(new ModelBox(this.bone, 0, 15, -4.0f, -8.0f, -4.0f, 8, 3, 8, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.bone.func_78785_a(f5);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.field_78795_f = x;
            modelRenderer.field_78796_g = y;
            modelRenderer.field_78808_h = z;
        }

        public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
            super.func_78087_a(f, f1, f2, f3, f4, f5, e);
            this.bone.field_78796_g = f3 / 57.295776f;
            this.bone.field_78795_f = f4 / 57.295776f;
        }
    }
}
