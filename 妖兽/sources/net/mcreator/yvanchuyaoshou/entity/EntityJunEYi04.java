package net.mcreator.yvanchuyaoshou.entity;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityCaientity02;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureJunEYiDie;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureJunEYiUpdate;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureShouJiNbt;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
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
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityJunEYi04.class */
public class EntityJunEYi04 extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 72;
    public static final int ENTITYID_RANGED = 73;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityJunEYi04(ElementsYvanchuyaoshouMod instance) {
        super(instance, 41);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "jun_e_yi_04"), 72).name("jun_e_yi_04").tracker(64, 3, true).egg(-10079488, -6710887).build();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modeljun_e_yi_(), 0.5f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityJunEYi04.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/jun_e_yi_.png");
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityJunEYi04$EntityCustom.class */
    public static class EntityCustom extends EntityMob {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(0.6f, 2.0f);
            this.field_70728_aV = 50;
            this.field_70178_ae = false;
            func_94061_f(false);
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70715_bh.func_75776_a(1, new EntityAINearestAttackableTarget(this, EntityCaientity02.EntityCustom.class, true, true));
            this.field_70715_bh.func_75776_a(2, new EntityAIHurtByTarget(this, true, new Class[0]));
            this.field_70714_bg.func_75776_a(3, new EntityAIAttackMelee(this, 1.2d, true));
            this.field_70714_bg.func_75776_a(4, new EntityAILeapAtTarget(this, 0.8f));
            this.field_70714_bg.func_75776_a(5, new EntityAILookIdle(this));
            this.field_70714_bg.func_75776_a(6, new EntityAISwimming(this));
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
            EntityJunEYi04.$_dependencies.put("entity", this);
            ProcedureShouJiNbt.executeProcedure(EntityJunEYi04.$_dependencies);
            if (source == DamageSource.field_76379_h || source == DamageSource.field_76367_g) {
                return false;
            }
            return super.func_70097_a(source, amount);
        }

        public void func_70645_a(DamageSource source) {
            super.func_70645_a(source);
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            EntityJunEYi04.$_dependencies.put("entity", this);
            EntityJunEYi04.$_dependencies.put("x", Integer.valueOf(x));
            EntityJunEYi04.$_dependencies.put("y", Integer.valueOf(y));
            EntityJunEYi04.$_dependencies.put("z", Integer.valueOf(z));
            EntityJunEYi04.$_dependencies.put("world", this.field_70170_p);
            ProcedureJunEYiDie.executeProcedure(EntityJunEYi04.$_dependencies);
        }

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityJunEYi04.$_dependencies.put("entity", this);
            EntityJunEYi04.$_dependencies.put("world", this.field_70170_p);
            ProcedureJunEYiUpdate.executeProcedure(EntityJunEYi04.$_dependencies);
        }

        protected void func_110147_ax() {
            super.func_110147_ax();
            if (func_110148_a(SharedMonsterAttributes.field_188791_g) != null) {
                func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(6.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111263_d) != null) {
                func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.3d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111267_a) != null) {
                func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(20.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111264_e) != null) {
                func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(1.0d);
            }
        }
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityJunEYi04$Modeljun_e_yi_.class */
    public static class Modeljun_e_yi_ extends ModelBase {
        private final ModelRenderer Head;
        private final ModelRenderer Head_r1;
        private final ModelRenderer Head_r2;
        private final ModelRenderer Head_r3;
        private final ModelRenderer Head_r4;
        private final ModelRenderer Head_r5;
        private final ModelRenderer Head_r6;
        private final ModelRenderer Head_r7;
        private final ModelRenderer Head_r8;
        private final ModelRenderer Head_r9;
        private final ModelRenderer Head_r10;
        private final ModelRenderer Body;
        private final ModelRenderer Body_r1;
        private final ModelRenderer Body_r2;
        private final ModelRenderer Body_r3;
        private final ModelRenderer Body_r4;
        private final ModelRenderer Body_r5;
        private final ModelRenderer Body_r6;
        private final ModelRenderer Body_r7;
        private final ModelRenderer Body_r8;
        private final ModelRenderer RightArm;
        private final ModelRenderer LeftArm;
        private final ModelRenderer RightLeg;
        private final ModelRenderer LeftLeg;

        public Modeljun_e_yi_() {
            this.field_78090_t = EntityMoXiu02.ENTITYID;
            this.field_78089_u = EntityMoXiu02.ENTITYID;
            this.Head = new ModelRenderer(this);
            this.Head.func_78793_a(0.0f, 0.0f, 0.0f);
            this.Head.field_78804_l.add(new ModelBox(this.Head, 24, 24, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f, false));
            this.Head.field_78804_l.add(new ModelBox(this.Head, 96, 1, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.5f, false));
            this.Head_r1 = new ModelRenderer(this);
            this.Head_r1.func_78793_a(1.8257f, -10.3841f, -3.3409f);
            this.Head.func_78792_a(this.Head_r1);
            setRotationAngle(this.Head_r1, 0.7782f, -0.0658f, 0.2173f);
            this.Head_r1.field_78804_l.add(new ModelBox(this.Head_r1, 28, 52, -0.5f, -1.2f, -1.2f, 1, 2, 1, 0.0f, false));
            this.Head_r2 = new ModelRenderer(this);
            this.Head_r2.func_78793_a(1.8f, -6.5f, -3.5f);
            this.Head.func_78792_a(this.Head_r2);
            setRotationAngle(this.Head_r2, 0.2895f, -0.0658f, 0.2173f);
            this.Head_r2.field_78804_l.add(new ModelBox(this.Head_r2, 16, 52, -1.3f, -2.9f, 0.4f, 1, 2, 1, 0.0f, false));
            this.Head_r3 = new ModelRenderer(this);
            this.Head_r3.func_78793_a(3.4679f, -13.2226f, 0.1f);
            this.Head.func_78792_a(this.Head_r3);
            setRotationAngle(this.Head_r3, 0.0f, 0.0f, -1.501f);
            this.Head_r3.field_78804_l.add(new ModelBox(this.Head_r3, 0, 14, -1.2f, -2.5f, -4.0f, 0, 5, 2, 0.0f, false));
            this.Head_r3.field_78804_l.add(new ModelBox(this.Head_r3, 4, 0, -1.2f, -2.5f, -1.0f, 0, 5, 2, 0.0f, false));
            this.Head_r3.field_78804_l.add(new ModelBox(this.Head_r3, 0, 0, -1.2f, -2.5f, 2.0f, 0, 5, 2, 0.0f, false));
            this.Head_r4 = new ModelRenderer(this);
            this.Head_r4.func_78793_a(4.0331f, -4.0446f, -0.9f);
            this.Head.func_78792_a(this.Head_r4);
            setRotationAngle(this.Head_r4, 0.0f, 0.0f, 0.1571f);
            this.Head_r4.field_78804_l.add(new ModelBox(this.Head_r4, 24, 32, 0.6f, -8.0f, -3.0f, 0, 12, 8, 0.0f, false));
            this.Head_r5 = new ModelRenderer(this);
            this.Head_r5.func_78793_a(-4.1647f, -5.343f, 4.7f);
            this.Head.func_78792_a(this.Head_r5);
            setRotationAngle(this.Head_r5, 0.0f, 1.5708f, 0.1571f);
            this.Head_r5.field_78804_l.add(new ModelBox(this.Head_r5, 40, 32, 0.6f, -7.0f, 0.9f, 0, 11, 8, 0.0f, false));
            this.Head_r6 = new ModelRenderer(this);
            this.Head_r6.func_78793_a(-1.8257f, -10.3841f, -3.3409f);
            this.Head.func_78792_a(this.Head_r6);
            setRotationAngle(this.Head_r6, 0.7782f, 0.0658f, -0.2173f);
            this.Head_r6.field_78804_l.add(new ModelBox(this.Head_r6, 36, 52, -0.5f, -1.2f, -1.2f, 1, 2, 1, 0.0f, false));
            this.Head_r7 = new ModelRenderer(this);
            this.Head_r7.func_78793_a(-1.8f, -6.5f, -3.5f);
            this.Head.func_78792_a(this.Head_r7);
            setRotationAngle(this.Head_r7, 0.2895f, 0.0658f, -0.2173f);
            this.Head_r7.field_78804_l.add(new ModelBox(this.Head_r7, 32, 52, 0.3f, -2.9f, 0.4f, 1, 2, 1, 0.0f, false));
            this.Head_r8 = new ModelRenderer(this);
            this.Head_r8.func_78793_a(-3.4679f, -13.2226f, 0.1f);
            this.Head.func_78792_a(this.Head_r8);
            setRotationAngle(this.Head_r8, 0.0f, 0.0f, 1.501f);
            this.Head_r8.field_78804_l.add(new ModelBox(this.Head_r8, 29, 0, 1.2f, -2.5f, -4.0f, 0, 5, 2, 0.0f, false));
            this.Head_r8.field_78804_l.add(new ModelBox(this.Head_r8, 25, 0, 1.2f, -2.5f, -1.0f, 0, 5, 2, 0.0f, false));
            this.Head_r8.field_78804_l.add(new ModelBox(this.Head_r8, 4, 14, 1.2f, -2.5f, 2.0f, 0, 5, 2, 0.0f, false));
            this.Head_r9 = new ModelRenderer(this);
            this.Head_r9.func_78793_a(4.1647f, -5.343f, 4.7f);
            this.Head.func_78792_a(this.Head_r9);
            setRotationAngle(this.Head_r9, 0.0f, -1.5708f, -0.1571f);
            this.Head_r9.field_78804_l.add(new ModelBox(this.Head_r9, 40, 43, -0.6f, -7.0f, 0.9f, 0, 11, 8, 0.0f, false));
            this.Head_r10 = new ModelRenderer(this);
            this.Head_r10.func_78793_a(-4.0331f, -4.0446f, -0.9f);
            this.Head.func_78792_a(this.Head_r10);
            setRotationAngle(this.Head_r10, 0.0f, 0.0f, -0.1571f);
            this.Head_r10.field_78804_l.add(new ModelBox(this.Head_r10, 0, 40, -0.6f, -8.0f, -3.0f, 0, 12, 8, 0.0f, false));
            this.Body = new ModelRenderer(this);
            this.Body.func_78793_a(0.0f, 0.0f, 0.0f);
            this.Body.field_78804_l.add(new ModelBox(this.Body, 34, 0, -4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f, false));
            this.Body.field_78804_l.add(new ModelBox(this.Body, 0, (int) EntitySanXiu01.ENTITYID, -4.0f, 0.0f, -2.0f, 8, 12, 4, 0.25f, false));
            this.Body.field_78804_l.add(new ModelBox(this.Body, 0, 0, -4.0f, 6.0f, 2.6f, 8, 7, 9, 0.0f, false));
            this.Body.field_78804_l.add(new ModelBox(this.Body, 64, 16, -2.0f, 7.6f, 1.2f, 4, 4, 2, 0.0f, false));
            this.Body_r1 = new ModelRenderer(this);
            this.Body_r1.func_78793_a(7.089f, 14.2402f, 1.8627f);
            this.Body.func_78792_a(this.Body_r1);
            setRotationAngle(this.Body_r1, -0.5452f, 0.0561f, -0.618f);
            this.Body_r1.field_78804_l.add(new ModelBox(this.Body_r1, 0, 21, -0.5f, 2.0f, -0.5f, 1, 1, 2, 0.0f, false));
            this.Body_r2 = new ModelRenderer(this);
            this.Body_r2.func_78793_a(7.5607f, 14.9539f, 1.3449f);
            this.Body.func_78792_a(this.Body_r2);
            setRotationAngle(this.Body_r2, -0.5452f, 0.0561f, -0.618f);
            this.Body_r2.field_78804_l.add(new ModelBox(this.Body_r2, 20, 32, -0.5f, -2.0f, -0.5f, 1, 3, 1, 0.0f, false));
            this.Body_r3 = new ModelRenderer(this);
            this.Body_r3.func_78793_a(3.3411f, 11.3972f, 1.772f);
            this.Body.func_78792_a(this.Body_r3);
            setRotationAngle(this.Body_r3, -0.0739f, 0.0561f, -0.618f);
            this.Body_r3.field_78804_l.add(new ModelBox(this.Body_r3, 0, 32, 0.9f, 0.8f, 0.4f, 1, 3, 1, 0.0f, false));
            this.Body_r4 = new ModelRenderer(this);
            this.Body_r4.func_78793_a(4.1521f, 12.5353f, 1.8f);
            this.Body.func_78792_a(this.Body_r4);
            setRotationAngle(this.Body_r4, 0.3624f, 0.0561f, -0.618f);
            this.Body_r4.field_78804_l.add(new ModelBox(this.Body_r4, 24, 16, 0.9f, -3.0f, 0.4f, 1, 3, 1, 0.0f, false));
            this.Body_r5 = new ModelRenderer(this);
            this.Body_r5.func_78793_a(-7.089f, 14.2402f, 1.8627f);
            this.Body.func_78792_a(this.Body_r5);
            setRotationAngle(this.Body_r5, -0.5452f, -0.0561f, 0.618f);
            this.Body_r5.field_78804_l.add(new ModelBox(this.Body_r5, 44, 16, -0.5f, 2.0f, -0.5f, 1, 1, 2, 0.0f, false));
            this.Body_r6 = new ModelRenderer(this);
            this.Body_r6.func_78793_a(-7.5607f, 14.9539f, 1.3449f);
            this.Body.func_78792_a(this.Body_r6);
            setRotationAngle(this.Body_r6, -0.5452f, -0.0561f, 0.618f);
            this.Body_r6.field_78804_l.add(new ModelBox(this.Body_r6, 33, 0, -0.5f, -2.0f, -0.5f, 1, 3, 1, 0.0f, false));
            this.Body_r7 = new ModelRenderer(this);
            this.Body_r7.func_78793_a(-3.3411f, 11.3972f, 1.772f);
            this.Body.func_78792_a(this.Body_r7);
            setRotationAngle(this.Body_r7, -0.0739f, -0.0561f, 0.618f);
            this.Body_r7.field_78804_l.add(new ModelBox(this.Body_r7, 16, 48, -1.9f, 0.8f, 0.4f, 1, 3, 1, 0.0f, false));
            this.Body_r8 = new ModelRenderer(this);
            this.Body_r8.func_78793_a(-4.1521f, 12.5353f, 1.8f);
            this.Body.func_78792_a(this.Body_r8);
            setRotationAngle(this.Body_r8, 0.3624f, -0.0561f, 0.618f);
            this.Body_r8.field_78804_l.add(new ModelBox(this.Body_r8, 20, 48, -1.9f, -3.0f, 0.4f, 1, 3, 1, 0.0f, false));
            this.RightArm = new ModelRenderer(this);
            this.RightArm.func_78793_a(-5.0f, 2.0f, 0.0f);
            this.RightArm.field_78804_l.add(new ModelBox(this.RightArm, 0, 60, -2.0f, -2.0f, -2.0f, 3, 12, 4, 0.0f, false));
            this.RightArm.field_78804_l.add(new ModelBox(this.RightArm, (int) EntitySanXiu02.ENTITYID, 36, -2.0f, -2.0f, -2.0f, 3, 12, 4, 0.25f, false));
            this.LeftArm = new ModelRenderer(this);
            this.LeftArm.func_78793_a(5.0f, 2.0f, 0.0f);
            this.LeftArm.field_78804_l.add(new ModelBox(this.LeftArm, 58, 0, -1.0f, -2.0f, -2.0f, 3, 12, 4, 0.0f, false));
            this.LeftArm.field_78804_l.add(new ModelBox(this.LeftArm, (int) EntitySanXiu02.ENTITYID, 36, -1.0f, -2.0f, -2.0f, 3, 12, 4, 0.25f, false));
            this.RightLeg = new ModelRenderer(this);
            this.RightLeg.func_78793_a(-1.9f, 12.0f, 0.0f);
            this.RightLeg.field_78804_l.add(new ModelBox(this.RightLeg, 56, 32, 1.8f, 0.0f, -2.0f, 4, 12, 4, 0.0f, false));
            this.RightLeg.field_78804_l.add(new ModelBox(this.RightLeg, (int) EntitySanXiu01.ENTITYID, (int) EntitySanXiu01.ENTITYID, 1.8f, 0.0f, -2.0f, 4, 12, 4, 0.25f, true));
            this.LeftLeg = new ModelRenderer(this);
            this.LeftLeg.func_78793_a(1.9f, 12.0f, 0.0f);
            this.LeftLeg.field_78804_l.add(new ModelBox(this.LeftLeg, (int) EntitySanXiu01.ENTITYID, (int) EntitySanXiu01.ENTITYID, -5.8f, 0.0f, -2.0f, 4, 12, 4, 0.25f, false));
            this.LeftLeg.field_78804_l.add(new ModelBox(this.LeftLeg, 56, 48, -5.8f, 0.0f, -2.0f, 4, 12, 4, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.Head.func_78785_a(f5);
            this.Body.func_78785_a(f5);
            this.RightArm.func_78785_a(f5);
            this.LeftArm.func_78785_a(f5);
            this.RightLeg.func_78785_a(f5);
            this.LeftLeg.func_78785_a(f5);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.field_78795_f = x;
            modelRenderer.field_78796_g = y;
            modelRenderer.field_78808_h = z;
        }

        public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
            super.func_78087_a(f, f1, f2, f3, f4, f5, e);
            this.RightArm.field_78795_f = MathHelper.func_76134_b((f * 0.6662f) + 3.1415927f) * f1;
            this.LeftLeg.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
            this.Head.field_78796_g = f3 / 57.295776f;
            this.Head.field_78795_f = f4 / 57.295776f;
            this.LeftArm.field_78795_f = MathHelper.func_76134_b(f * 0.6662f) * f1;
            this.RightLeg.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
        }
    }
}
