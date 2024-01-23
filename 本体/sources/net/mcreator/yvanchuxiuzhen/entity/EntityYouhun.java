package net.mcreator.yvanchuxiuzhen.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.YvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureCaientity08OnInitialEntitySpawn;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityFlyHelper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.pathfinding.PathNavigateFlying;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/entity/EntityYouhun.class */
public class EntityYouhun extends ElementsYvanchuxiuzhenMod.ModElement {
    public static final int ENTITYID = 1;
    public static final int ENTITYID_RANGED = 2;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityYouhun(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 78);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuxiuzhenMod.MODID, "youhun"), 1).name("youhun").tracker(64, 3, true).egg(-13434778, -6710785).build();
        });
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void init(FMLInitializationEvent event) {
        Biome[] spawnBiomes = {(Biome) Biome.field_185377_q.func_82594_a(new ResourceLocation("yvanchuxiuzhen:weimian0101")), (Biome) Biome.field_185377_q.func_82594_a(new ResourceLocation("yvanchuxiuzhen:weimian0102"))};
        EntityRegistry.addSpawn(EntityCustom.class, 4, 1, 10, EnumCreatureType.CREATURE, spawnBiomes);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modelyouhun(), 0.5f) { // from class: net.mcreator.yvanchuxiuzhen.entity.EntityYouhun.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuxiuzhen:textures/youling.png");
                }
            };
        });
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/entity/EntityYouhun$EntityCustom.class */
    public static class EntityCustom extends EntityMob {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(0.5f, 0.5f);
            this.field_70728_aV = 15;
            this.field_70178_ae = false;
            func_94061_f(false);
            this.field_70699_by = new PathNavigateFlying(this, this.field_70170_p);
            this.field_70765_h = new EntityFlyHelper(this);
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70714_bg.func_75776_a(1, new EntityAIWander(this, 0.6d, 20) { // from class: net.mcreator.yvanchuxiuzhen.entity.EntityYouhun.EntityCustom.1
                protected Vec3d func_190864_f() {
                    Random random = EntityCustom.this.func_70681_au();
                    double dir_x = EntityCustom.this.field_70165_t + (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f);
                    double dir_y = EntityCustom.this.field_70163_u + (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f);
                    double dir_z = EntityCustom.this.field_70161_v + (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f);
                    return new Vec3d(dir_x, dir_y, dir_z);
                }
            });
            this.field_70714_bg.func_75776_a(2, new EntityAILookIdle(this));
            this.field_70715_bh.func_75776_a(3, new EntityAIHurtByTarget(this, true, new Class[0]));
            this.field_70715_bh.func_75776_a(4, new EntityAINearestAttackableTarget(this, EntityPlayer.class, false, false));
            this.field_70714_bg.func_75776_a(5, new EntityAIBase() { // from class: net.mcreator.yvanchuxiuzhen.entity.EntityYouhun.EntityCustom.2
                {
                    func_75248_a(1);
                }

                public boolean func_75250_a() {
                    if (EntityCustom.this.func_70638_az() != null && !EntityCustom.this.func_70605_aq().func_75640_a()) {
                        return true;
                    }
                    return false;
                }

                public boolean func_75253_b() {
                    return EntityCustom.this.func_70605_aq().func_75640_a() && EntityCustom.this.func_70638_az() != null && EntityCustom.this.func_70638_az().func_70089_S();
                }

                public void func_75249_e() {
                    EntityLivingBase livingentity = EntityCustom.this.func_70638_az();
                    Vec3d vec3d = livingentity.func_174824_e(1.0f);
                    EntityCustom.this.field_70765_h.func_75642_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, 1.0d);
                }

                public void func_75246_d() {
                    Entity func_70638_az = EntityCustom.this.func_70638_az();
                    double d0 = EntityCustom.this.func_70068_e(func_70638_az);
                    if (d0 <= getAttackReachSq(func_70638_az)) {
                        EntityCustom.this.func_70652_k(func_70638_az);
                    } else if (d0 < 16.0d) {
                        Vec3d vec3d = func_70638_az.func_174824_e(1.0f);
                        EntityCustom.this.field_70765_h.func_75642_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, 1.0d);
                    }
                }

                protected double getAttackReachSq(EntityLivingBase attackTarget) {
                    return (EntityCustom.this.field_70130_N * 1.5d * EntityCustom.this.field_70131_O * 1.5d) + attackTarget.field_70131_O;
                }
            });
            this.field_70714_bg.func_75776_a(6, new EntityAIAttackMelee(this, 1.2d, false));
            this.field_70714_bg.func_75776_a(7, new EntityAIAvoidEntity(this, EntityCustom.class, 2.0f, 1.6d, 1.6d));
        }

        public EnumCreatureAttribute func_70668_bt() {
            return EnumCreatureAttribute.UNDEAD;
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

        public void func_180430_e(float l, float d) {
        }

        public IEntityLivingData func_180482_a(DifficultyInstance difficulty, IEntityLivingData livingdata) {
            IEntityLivingData retval = super.func_180482_a(difficulty, livingdata);
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityYouhun.$_dependencies.put("entity", this);
            ProcedureCaientity08OnInitialEntitySpawn.executeProcedure(EntityYouhun.$_dependencies);
            return retval;
        }

        protected void func_110147_ax() {
            super.func_110147_ax();
            if (func_110148_a(SharedMonsterAttributes.field_188791_g) != null) {
                func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(10.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111263_d) != null) {
                func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.3d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111267_a) != null) {
                func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(20.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111264_e) != null) {
                func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(10.0d);
            }
            func_110140_aT().func_111150_b(SharedMonsterAttributes.field_193334_e);
            func_110148_a(SharedMonsterAttributes.field_193334_e).func_111128_a(0.3d);
        }

        public void func_70071_h_() {
            super.func_70071_h_();
            func_189654_d(true);
        }

        protected void func_184231_a(double y, boolean onGroundIn, IBlockState state, BlockPos pos) {
        }

        public void func_189654_d(boolean ignored) {
            super.func_189654_d(true);
        }
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/entity/EntityYouhun$Modelyouhun.class */
    public static class Modelyouhun extends ModelBase {
        private final ModelRenderer touone;
        private final ModelRenderer toutwo;
        private final ModelRenderer touthree;

        public Modelyouhun() {
            this.field_78090_t = 32;
            this.field_78089_u = 32;
            this.touone = new ModelRenderer(this);
            this.touone.func_78793_a(0.0f, 20.0f, -4.0f);
            this.touone.field_78804_l.add(new ModelBox(this.touone, 0, 0, -4.0f, -4.0f, -4.0f, 8, 8, 8, 0.0f, false));
            this.toutwo = new ModelRenderer(this);
            this.toutwo.func_78793_a(0.0f, 0.0f, 4.0f);
            this.touone.func_78792_a(this.toutwo);
            this.toutwo.field_78804_l.add(new ModelBox(this.toutwo, 0, 16, -2.5f, -2.5f, 0.0f, 5, 5, 6, 0.0f, false));
            this.touthree = new ModelRenderer(this);
            this.touthree.func_78793_a(0.0f, 0.0f, 6.0f);
            this.toutwo.func_78792_a(this.touthree);
            this.touthree.field_78804_l.add(new ModelBox(this.touthree, 18, 25, -1.0f, -1.0f, 0.0f, 2, 2, 5, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.touone.func_78785_a(f5);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.field_78795_f = x;
            modelRenderer.field_78796_g = y;
            modelRenderer.field_78808_h = z;
        }

        public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
            super.func_78087_a(f, f1, f2, f3, f4, f5, e);
            this.touthree.field_78796_g = f3 / 57.295776f;
            this.touthree.field_78795_f = f4 / 57.295776f;
            this.toutwo.field_78796_g = f3 / 57.295776f;
            this.toutwo.field_78795_f = f4 / 57.295776f;
            this.touone.field_78796_g = f3 / 57.295776f;
            this.touone.field_78795_f = f4 / 57.295776f;
        }
    }
}
