package net.mcreator.yvanchuyaoshou.entity;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureBaiZeDie;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureBaiZeUpdate;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureShouJiNbt;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIEatGrass;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity10.class */
public class EntityCaientity10 extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 15;
    public static final int ENTITYID_RANGED = 16;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityCaientity10(ElementsYvanchuyaoshouMod instance) {
        super(instance, 57);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "caientity10"), 15).name("caientity10").tracker(64, 3, true).egg(-1, -16711783).build();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modelcaientity10(), 1.0f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityCaientity10.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/caientity10.png");
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity10$EntityCustom.class */
    public static class EntityCustom extends EntityMob {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(1.0f, 1.2f);
            this.field_70728_aV = EntityJiHunXie01.ENTITYID;
            this.field_70178_ae = false;
            func_94061_f(false);
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70715_bh.func_75776_a(1, new EntityAIHurtByTarget(this, true, new Class[0]));
            this.field_70714_bg.func_75776_a(2, new EntityAIAttackMelee(this, 1.2d, true));
            this.field_70714_bg.func_75776_a(3, new EntityAILookIdle(this));
            this.field_70714_bg.func_75776_a(4, new EntityAISwimming(this));
            this.field_70714_bg.func_75776_a(5, new EntityAILeapAtTarget(this, 0.5f));
            this.field_70714_bg.func_75776_a(6, new EntityAIEatGrass(this));
            this.field_70714_bg.func_75776_a(7, new EntityAIWander(this, 1.0d));
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

        public boolean func_70097_a(DamageSource source, float amount) {
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            source.func_76346_g();
            EntityCaientity10.$_dependencies.put("entity", this);
            ProcedureShouJiNbt.executeProcedure(EntityCaientity10.$_dependencies);
            return super.func_70097_a(source, amount);
        }

        public void func_70645_a(DamageSource source) {
            super.func_70645_a(source);
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            EntityCaientity10.$_dependencies.put("entity", this);
            EntityCaientity10.$_dependencies.put("x", Integer.valueOf(x));
            EntityCaientity10.$_dependencies.put("y", Integer.valueOf(y));
            EntityCaientity10.$_dependencies.put("z", Integer.valueOf(z));
            EntityCaientity10.$_dependencies.put("world", this.field_70170_p);
            ProcedureBaiZeDie.executeProcedure(EntityCaientity10.$_dependencies);
        }

        public boolean func_184645_a(EntityPlayer entity, EnumHand hand) {
            super.func_184645_a(entity, hand);
            if (!entity.func_70093_af()) {
                entity.func_184220_m(this);
            }
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            entity.func_184586_b(hand);
            return true;
        }

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityCaientity10.$_dependencies.put("entity", this);
            EntityCaientity10.$_dependencies.put("world", this.field_70170_p);
            ProcedureBaiZeUpdate.executeProcedure(EntityCaientity10.$_dependencies);
        }

        protected void func_110147_ax() {
            super.func_110147_ax();
            if (func_110148_a(SharedMonsterAttributes.field_188791_g) != null) {
                func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(10.0d);
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
        }

        public void func_191986_a(float ti, float tj, float tk) {
            Entity entity = func_184188_bt().isEmpty() ? null : (Entity) func_184188_bt().get(0);
            if (func_184207_aI()) {
                this.field_70177_z = entity.field_70177_z;
                this.field_70126_B = this.field_70177_z;
                this.field_70125_A = entity.field_70125_A * 0.5f;
                func_70101_b(this.field_70177_z, this.field_70125_A);
                this.field_70747_aH = func_70689_ay() * 0.15f;
                this.field_70761_aq = entity.field_70177_z;
                this.field_70759_as = entity.field_70177_z;
                this.field_70138_W = 1.0f;
                if (entity instanceof EntityLivingBase) {
                    func_70659_e((float) func_110148_a(SharedMonsterAttributes.field_111263_d).func_111126_e());
                    float forward = ((EntityLivingBase) entity).field_191988_bg;
                    float strafe = ((EntityLivingBase) entity).field_70702_br;
                    super.func_191986_a(strafe, 0.0f, forward);
                }
                this.field_184618_aE = this.field_70721_aZ;
                double d1 = this.field_70165_t - this.field_70169_q;
                double d0 = this.field_70161_v - this.field_70166_s;
                float f1 = MathHelper.func_76133_a((d1 * d1) + (d0 * d0)) * 4.0f;
                if (f1 > 1.0f) {
                    f1 = 1.0f;
                }
                this.field_70721_aZ += (f1 - this.field_70721_aZ) * 0.4f;
                this.field_184619_aG += this.field_70721_aZ;
                return;
            }
            this.field_70138_W = 0.5f;
            this.field_70747_aH = 0.02f;
            super.func_191986_a(ti, tj, tk);
        }
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity10$Modelcaientity10.class */
    public static class Modelcaientity10 extends ModelBase {
        private final ModelRenderer Baize;
        private final ModelRenderer body;
        private final ModelRenderer tail;
        private final ModelRenderer Beard;
        private final ModelRenderer head;
        private final ModelRenderer horn;
        private final ModelRenderer bone;
        private final ModelRenderer horn2;
        private final ModelRenderer bone2;
        private final ModelRenderer Ears1;
        private final ModelRenderer Ears2;
        private final ModelRenderer rightleg;
        private final ModelRenderer leftleg;
        private final ModelRenderer leftarm;
        private final ModelRenderer rightarm;

        public Modelcaientity10() {
            this.field_78090_t = 64;
            this.field_78089_u = 64;
            this.Baize = new ModelRenderer(this);
            this.Baize.func_78793_a(3.0f, 24.0f, 0.0f);
            setRotationAngle(this.Baize, 0.0f, -1.5708f, 0.0f);
            this.body = new ModelRenderer(this);
            this.body.func_78793_a(0.0f, 0.0f, 0.0f);
            this.Baize.func_78792_a(this.body);
            this.body.field_78804_l.add(new ModelBox(this.body, 0, 0, -6.0f, -13.0f, 0.0f, 12, 5, 6, 0.0f, false));
            this.tail = new ModelRenderer(this);
            this.tail.func_78793_a(6.9829f, -12.1294f, 3.0f);
            setRotationAngle(this.tail, 0.0f, 0.0f, 0.2618f);
            this.body.func_78792_a(this.tail);
            this.tail.field_78804_l.add(new ModelBox(this.tail, 26, 19, -0.9829f, 0.1294f, -0.5f, 4, 1, 1, 0.0f, false));
            this.tail.field_78804_l.add(new ModelBox(this.tail, 30, 11, 3.0171f, -0.3706f, -1.0f, 2, 2, 2, 0.0f, false));
            this.Beard = new ModelRenderer(this);
            this.Beard.func_78793_a(-5.0f, -4.0f, 0.0f);
            this.body.func_78792_a(this.Beard);
            this.Beard.field_78804_l.add(new ModelBox(this.Beard, 18, 18, -3.0f, -7.0f, 1.0f, 2, 3, 4, 0.0f, false));
            this.Beard.field_78804_l.add(new ModelBox(this.Beard, 26, 15, -2.0f, -3.0f, 2.0f, 1, 1, 3, 0.0f, false));
            this.Beard.field_78804_l.add(new ModelBox(this.Beard, 22, 11, -3.0f, -4.0f, 2.0f, 1, 1, 3, 0.0f, false));
            this.Beard.field_78804_l.add(new ModelBox(this.Beard, 16, 11, -2.0f, -4.0f, 1.0f, 1, 1, 4, 0.0f, false));
            this.Beard.field_78804_l.add(new ModelBox(this.Beard, 10, 31, -2.0f, -7.0f, 5.0f, 1, 4, 1, 0.0f, false));
            this.Beard.field_78804_l.add(new ModelBox(this.Beard, 25, 15, -3.0f, -7.0f, 5.0f, 1, 2, 1, 0.0f, false));
            this.Beard.field_78804_l.add(new ModelBox(this.Beard, 0, 0, -4.0f, -7.0f, 2.0f, 1, 3, 2, 0.0f, false));
            this.Beard.field_78804_l.add(new ModelBox(this.Beard, 16, 11, -3.0f, -7.0f, 0.0f, 1, 2, 1, 0.0f, false));
            this.Beard.field_78804_l.add(new ModelBox(this.Beard, 6, 31, -2.0f, -7.0f, 0.0f, 1, 4, 1, 0.0f, false));
            this.Beard.field_78804_l.add(new ModelBox(this.Beard, 0, 31, -2.0f, -2.0f, 2.0f, 1, 1, 2, 0.0f, false));
            this.head = new ModelRenderer(this);
            this.head.func_78793_a(-8.0f, -12.0f, 0.0f);
            this.Baize.func_78792_a(this.head);
            this.head.field_78804_l.add(new ModelBox(this.head, 0, 11, -2.0f, -4.0f, 0.0f, 5, 5, 6, 0.0f, false));
            this.horn = new ModelRenderer(this);
            this.horn.func_78793_a(-1.0f, -4.0f, 4.0f);
            setRotationAngle(this.horn, -0.3491f, 0.0f, 0.3491f);
            this.head.func_78792_a(this.horn);
            this.horn.field_78804_l.add(new ModelBox(this.horn, 32, 0, 0.0f, -4.0f, 0.0f, 1, 4, 1, 0.0f, false));
            this.bone = new ModelRenderer(this);
            this.bone.func_78793_a(0.5f, -1.0f, 0.5f);
            setRotationAngle(this.bone, -0.3491f, 0.0f, 0.6981f);
            this.horn.func_78792_a(this.bone);
            this.bone.field_78804_l.add(new ModelBox(this.bone, 32, 25, -0.5f, -2.0f, -0.5f, 1, 2, 1, 0.0f, false));
            this.horn2 = new ModelRenderer(this);
            this.horn2.func_78793_a(-1.0f, -4.0f, 2.0f);
            setRotationAngle(this.horn2, 0.3491f, 0.0f, 0.3491f);
            this.head.func_78792_a(this.horn2);
            this.horn2.field_78804_l.add(new ModelBox(this.horn2, 32, 32, 0.0f, -4.0f, -1.0f, 1, 4, 1, 0.0f, false));
            this.bone2 = new ModelRenderer(this);
            this.bone2.func_78793_a(0.5f, -1.0f, -0.5f);
            setRotationAngle(this.bone2, 0.3491f, 0.0f, 0.6981f);
            this.horn2.func_78792_a(this.bone2);
            this.bone2.field_78804_l.add(new ModelBox(this.bone2, 31, 15, -0.5f, -2.0f, -0.5f, 1, 2, 1, 0.0f, false));
            this.Ears1 = new ModelRenderer(this);
            this.Ears1.func_78793_a(0.0f, -3.0f, 0.0f);
            setRotationAngle(this.Ears1, -0.3491f, 0.0f, 0.0f);
            this.head.func_78792_a(this.Ears1);
            this.Ears1.field_78804_l.add(new ModelBox(this.Ears1, 30, 21, -1.0f, 0.0f, -1.0f, 2, 3, 1, 0.0f, false));
            this.Ears2 = new ModelRenderer(this);
            this.Ears2.func_78793_a(0.0f, -3.0f, 6.0f);
            setRotationAngle(this.Ears2, 0.3491f, 0.0f, 0.0f);
            this.head.func_78792_a(this.Ears2);
            this.Ears2.field_78804_l.add(new ModelBox(this.Ears2, 0, 11, -1.0f, 0.0f, 0.0f, 2, 3, 1, 0.0f, false));
            this.rightleg = new ModelRenderer(this);
            this.rightleg.func_78793_a(2.0f, 16.0f, 4.0f);
            this.rightleg.field_78804_l.add(new ModelBox(this.rightleg, 0, 37, -1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f, false));
            this.leftleg = new ModelRenderer(this);
            this.leftleg.func_78793_a(-2.0f, 16.0f, 4.0f);
            this.leftleg.field_78804_l.add(new ModelBox(this.leftleg, 8, 37, -1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f, false));
            this.leftarm = new ModelRenderer(this);
            this.leftarm.func_78793_a(2.0f, 16.0f, -5.0f);
            this.leftarm.field_78804_l.add(new ModelBox(this.leftarm, 16, 25, -1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f, false));
            this.rightarm = new ModelRenderer(this);
            this.rightarm.func_78793_a(-2.0f, 16.0f, -5.0f);
            this.rightarm.field_78804_l.add(new ModelBox(this.rightarm, 24, 25, -1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.Baize.func_78785_a(f5);
            this.rightleg.func_78785_a(f5);
            this.leftleg.func_78785_a(f5);
            this.leftarm.func_78785_a(f5);
            this.rightarm.func_78785_a(f5);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.field_78795_f = x;
            modelRenderer.field_78796_g = y;
            modelRenderer.field_78808_h = z;
        }

        public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
            super.func_78087_a(f, f1, f2, f3, f4, f5, e);
            this.rightarm.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
            this.leftleg.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
            this.head.field_78796_g = f3 / 57.295776f;
            this.head.field_78795_f = f4 / 57.295776f;
            this.rightleg.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
            this.leftarm.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
        }
    }
}
