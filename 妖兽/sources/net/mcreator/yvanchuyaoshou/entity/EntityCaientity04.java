package net.mcreator.yvanchuyaoshou.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureCaientity04EntityIsHurt;
import net.mcreator.yvanchuyaoshou.procedure.ProcedurePuNiaoDie;
import net.mcreator.yvanchuyaoshou.procedure.ProcedurePuNiaoUpdate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityFlyHelper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.pathfinding.PathNavigateFlying;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity04.class */
public class EntityCaientity04 extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 5;
    public static final int ENTITYID_RANGED = 6;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityCaientity04(ElementsYvanchuyaoshouMod instance) {
        super(instance, 47);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "caientity04"), 5).name("caientity04").tracker(64, 3, true).egg(-6684673, -16751002).build();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modelcaientity04(), 0.5f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityCaientity04.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/caientity04.png");
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity04$EntityCustom.class */
    public static class EntityCustom extends EntityMob {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(0.5f, 0.5f);
            this.field_70728_aV = 5;
            this.field_70178_ae = false;
            func_94061_f(false);
            this.field_70699_by = new PathNavigateFlying(this, this.field_70170_p);
            this.field_70765_h = new EntityFlyHelper(this);
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70715_bh.func_75776_a(1, new EntityAIHurtByTarget(this, true, new Class[0]));
            this.field_70714_bg.func_75776_a(2, new EntityAIAttackMelee(this, 1.2d, true));
            this.field_70714_bg.func_75776_a(3, new EntityAILookIdle(this));
            this.field_70714_bg.func_75776_a(4, new EntityAISwimming(this));
            this.field_70714_bg.func_75776_a(5, new EntityAIWander(this, 1.0d, 20) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityCaientity04.EntityCustom.1
                protected Vec3d func_190864_f() {
                    Random random = EntityCustom.this.func_70681_au();
                    double dir_x = EntityCustom.this.field_70165_t + (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f);
                    double dir_y = EntityCustom.this.field_70163_u + (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f);
                    double dir_z = EntityCustom.this.field_70161_v + (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f);
                    return new Vec3d(dir_x, dir_y, dir_z);
                }
            });
        }

        public EnumCreatureAttribute func_70668_bt() {
            return EnumCreatureAttribute.UNDEFINED;
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

        public boolean func_70097_a(DamageSource source, float amount) {
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            source.func_76346_g();
            EntityCaientity04.$_dependencies.put("entity", this);
            ProcedureCaientity04EntityIsHurt.executeProcedure(EntityCaientity04.$_dependencies);
            if (source == DamageSource.field_76379_h) {
                return false;
            }
            return super.func_70097_a(source, amount);
        }

        public void func_70645_a(DamageSource source) {
            super.func_70645_a(source);
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            EntityCaientity04.$_dependencies.put("entity", this);
            EntityCaientity04.$_dependencies.put("x", Integer.valueOf(x));
            EntityCaientity04.$_dependencies.put("y", Integer.valueOf(y));
            EntityCaientity04.$_dependencies.put("z", Integer.valueOf(z));
            EntityCaientity04.$_dependencies.put("world", this.field_70170_p);
            ProcedurePuNiaoDie.executeProcedure(EntityCaientity04.$_dependencies);
        }

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityCaientity04.$_dependencies.put("entity", this);
            EntityCaientity04.$_dependencies.put("world", this.field_70170_p);
            ProcedurePuNiaoUpdate.executeProcedure(EntityCaientity04.$_dependencies);
        }

        protected void func_110147_ax() {
            super.func_110147_ax();
            if (func_110148_a(SharedMonsterAttributes.field_188791_g) != null) {
                func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(6.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111263_d) != null) {
                func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.4d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111267_a) != null) {
                func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(20.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111264_e) != null) {
                func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(1.0d);
            }
            func_110140_aT().func_111150_b(SharedMonsterAttributes.field_193334_e);
            func_110148_a(SharedMonsterAttributes.field_193334_e).func_111128_a(0.4d);
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

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity04$Modelcaientity04.class */
    public static class Modelcaientity04 extends ModelBase {
        private final ModelRenderer leftarm;
        private final ModelRenderer rightarm;
        private final ModelRenderer body;
        private final ModelRenderer head;

        public Modelcaientity04() {
            this.field_78090_t = 36;
            this.field_78089_u = 52;
            this.leftarm = new ModelRenderer(this);
            this.leftarm.func_78793_a(4.0f, 14.0f, 0.0f);
            this.leftarm.field_78804_l.add(new ModelBox(this.leftarm, 0, 47, -1.0f, 0.0f, -2.0f, 8, 1, 4, 0.0f, false));
            this.rightarm = new ModelRenderer(this);
            this.rightarm.func_78793_a(-4.0f, 14.0f, 0.0f);
            this.rightarm.field_78804_l.add(new ModelBox(this.rightarm, 0, 47, -7.0f, 0.0f, -2.0f, 8, 1, 4, 0.0f, false));
            this.body = new ModelRenderer(this);
            this.body.func_78793_a(0.0f, 24.0f, 0.0f);
            this.body.field_78804_l.add(new ModelBox(this.body, 0, 0, -4.0f, -12.0f, -4.0f, 8, 8, 8, 0.0f, false));
            this.body.field_78804_l.add(new ModelBox(this.body, 0, 28, -1.5f, -5.0f, -2.0f, 3, 3, 4, 0.0f, false));
            this.body.field_78804_l.add(new ModelBox(this.body, 24, 16, -0.1f, -9.0f, 3.0f, 0, 4, 6, 0.0f, false));
            this.body.field_78804_l.add(new ModelBox(this.body, 0, 16, -3.0f, -11.0f, -3.0f, 6, 6, 6, 0.0f, false));
            this.head = new ModelRenderer(this);
            this.head.func_78793_a(0.0f, 24.0f, 0.0f);
            this.head.field_78804_l.add(new ModelBox(this.head, 0, 35, -3.0f, -17.0f, -8.0f, 6, 6, 6, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.leftarm.func_78785_a(f5);
            this.rightarm.func_78785_a(f5);
            this.body.func_78785_a(f5);
            this.head.func_78785_a(f5);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.field_78795_f = x;
            modelRenderer.field_78796_g = y;
            modelRenderer.field_78808_h = z;
        }

        public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
            super.func_78087_a(f, f1, f2, f3, f4, f5, e);
            this.head.field_78796_g = f3 / 57.295776f;
            this.head.field_78795_f = f4 / 57.295776f;
            this.rightarm.field_78795_f = MathHelper.func_76134_b((f * 0.6662f) + 3.1415927f) * f1;
            this.leftarm.field_78796_g = MathHelper.func_76134_b(f * 0.6662f) * f1;
        }
    }
}
