package net.mcreator.yvanchuyaoshou.entity;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureLeiYuanJuEDie;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureLeiYuanJuEUpdate;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureShouJiNbt;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.projectile.EntityPotion;
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
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityLeiYuanJuE05.class */
public class EntityLeiYuanJuE05 extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 92;
    public static final int ENTITYID_RANGED = 93;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityLeiYuanJuE05(ElementsYvanchuyaoshouMod instance) {
        super(instance, 56);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "lei_yuan_ju_e_05"), 92).name("lei_yuan_ju_e_05").tracker(64, 3, true).egg(-10796760, -1398695).build();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modele_yu_ren(), 1.0f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityLeiYuanJuE05.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/e_yu_ren.png");
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityLeiYuanJuE05$EntityCustom.class */
    public static class EntityCustom extends EntityMob {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(2.0f, 5.0f);
            this.field_70728_aV = 50;
            this.field_70178_ae = true;
            func_94061_f(false);
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70715_bh.func_75776_a(1, new EntityAIHurtByTarget(this, true, new Class[0]));
            this.field_70715_bh.func_75776_a(2, new EntityAINearestAttackableTarget(this, EntityLiving.class, true, true));
            this.field_70714_bg.func_75776_a(3, new EntityAIAttackMelee(this, 1.2d, true));
            this.field_70714_bg.func_75776_a(4, new EntityAILookIdle(this));
            this.field_70714_bg.func_75776_a(5, new EntityAISwimming(this));
            this.field_70714_bg.func_75776_a(6, new EntityAIWander(this, 1.0d));
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
            EntityLeiYuanJuE05.$_dependencies.put("entity", this);
            ProcedureShouJiNbt.executeProcedure(EntityLeiYuanJuE05.$_dependencies);
            if ((source.func_76364_f() instanceof EntityPotion) || source == DamageSource.field_180137_b) {
                return false;
            }
            return super.func_70097_a(source, amount);
        }

        public void func_70645_a(DamageSource source) {
            super.func_70645_a(source);
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            EntityLeiYuanJuE05.$_dependencies.put("entity", this);
            EntityLeiYuanJuE05.$_dependencies.put("x", Integer.valueOf(x));
            EntityLeiYuanJuE05.$_dependencies.put("y", Integer.valueOf(y));
            EntityLeiYuanJuE05.$_dependencies.put("z", Integer.valueOf(z));
            EntityLeiYuanJuE05.$_dependencies.put("world", this.field_70170_p);
            ProcedureLeiYuanJuEDie.executeProcedure(EntityLeiYuanJuE05.$_dependencies);
        }

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityLeiYuanJuE05.$_dependencies.put("entity", this);
            EntityLeiYuanJuE05.$_dependencies.put("world", this.field_70170_p);
            ProcedureLeiYuanJuEUpdate.executeProcedure(EntityLeiYuanJuE05.$_dependencies);
        }

        protected void func_110147_ax() {
            super.func_110147_ax();
            if (func_110148_a(SharedMonsterAttributes.field_188791_g) != null) {
                func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(20.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111263_d) != null) {
                func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.2d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111267_a) != null) {
                func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(20.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111264_e) != null) {
                func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(1.0d);
            }
        }

        public boolean func_70648_aU() {
            return true;
        }

        public boolean func_70601_bi() {
            return true;
        }

        public boolean func_70058_J() {
            return this.field_70170_p.func_72917_a(func_174813_aQ(), this);
        }

        public boolean func_96092_aw() {
            return false;
        }
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityLeiYuanJuE05$Modele_yu_ren.class */
    public static class Modele_yu_ren extends ModelBase {
        private final ModelRenderer Body;
        private final ModelRenderer cube_r20_r1;
        private final ModelRenderer cube_r22_r1;
        private final ModelRenderer cube_r26_r1;
        private final ModelRenderer cube_r23_r1;
        private final ModelRenderer cube_r24_r1;
        private final ModelRenderer cube_r25_r1;
        private final ModelRenderer cube_r3_r1;
        private final ModelRenderer cube_r3_r2;
        private final ModelRenderer cube_r4_r1;
        private final ModelRenderer cube_r5_r1;
        private final ModelRenderer cube_r4_r2;
        private final ModelRenderer cube_r5_r2;
        private final ModelRenderer cube_r8_r1;
        private final ModelRenderer cube_r7_r1;
        private final ModelRenderer cube_r9_r1;
        private final ModelRenderer cube_r10_r1;
        private final ModelRenderer LeftLeg;
        private final ModelRenderer cube_r32_r1;
        private final ModelRenderer cube_r29_r1;
        private final ModelRenderer cube_r31_r1;
        private final ModelRenderer cube_r27_r1;
        private final ModelRenderer cube_r34_r1;
        private final ModelRenderer cube_r35_r1;
        private final ModelRenderer cube_r36_r1;
        private final ModelRenderer cube_r37_r1;
        private final ModelRenderer cube_r30_r1;
        private final ModelRenderer cube_r33_r1;
        private final ModelRenderer cube_r28_r1;
        private final ModelRenderer cube_r28_r2;
        private final ModelRenderer cube_r20;
        private final ModelRenderer RightLeg;
        private final ModelRenderer cube_r32_r2;
        private final ModelRenderer cube_r29_r2;
        private final ModelRenderer cube_r31_r2;
        private final ModelRenderer cube_r27_r2;
        private final ModelRenderer cube_r34_r2;
        private final ModelRenderer cube_r35_r2;
        private final ModelRenderer cube_r36_r2;
        private final ModelRenderer cube_r37_r2;
        private final ModelRenderer cube_r30_r2;
        private final ModelRenderer cube_r33_r2;
        private final ModelRenderer cube_r28_r3;
        private final ModelRenderer cube_r28_r4;
        private final ModelRenderer cube_r31;
        private final ModelRenderer Head;
        private final ModelRenderer cube_r6_r1;
        private final ModelRenderer RightArm;
        private final ModelRenderer cube_r11_r1;
        private final ModelRenderer cube_r12_r1;
        private final ModelRenderer cube_r13_r1;
        private final ModelRenderer cube_r14_r1;
        private final ModelRenderer cube_r15_r1;
        private final ModelRenderer cube_r16_r1;
        private final ModelRenderer cube_r17_r1;
        private final ModelRenderer cube_r18_r1;
        private final ModelRenderer cube_r19_r1;
        private final ModelRenderer LefttArm;
        private final ModelRenderer cube_r11_r2;
        private final ModelRenderer cube_r12_r2;
        private final ModelRenderer cube_r13_r2;
        private final ModelRenderer cube_r14_r2;
        private final ModelRenderer cube_r15_r2;
        private final ModelRenderer cube_r16_r2;
        private final ModelRenderer cube_r17_r2;
        private final ModelRenderer cube_r18_r2;
        private final ModelRenderer cube_r19_r2;

        public Modele_yu_ren() {
            this.field_78090_t = 256;
            this.field_78089_u = 256;
            this.Body = new ModelRenderer(this);
            this.Body.func_78793_a(0.0f, -30.8f, 41.2f);
            setRotationAngle(this.Body, 1.5708f, 0.0f, 0.0f);
            this.cube_r20_r1 = new ModelRenderer(this);
            this.cube_r20_r1.func_78793_a(0.0f, -38.1706f, 3.2491f);
            this.Body.func_78792_a(this.cube_r20_r1);
            setRotationAngle(this.cube_r20_r1, -2.3823f, 0.0f, 0.0f);
            this.cube_r20_r1.field_78804_l.add(new ModelBox(this.cube_r20_r1, 96, 59, -5.3f, 12.7978f, 20.4695f, 11, 1, 10, 0.0f, false));
            this.cube_r20_r1.field_78804_l.add(new ModelBox(this.cube_r20_r1, (int) EntitySanXiu0502.ENTITYID, (int) EntitySanXiu0302.ENTITYID_RANGED, -0.6f, 11.6978f, 19.4695f, 1, 1, 11, 0.0f, false));
            this.cube_r20_r1.field_78804_l.add(new ModelBox(this.cube_r20_r1, 44, 78, -5.3f, 17.0386f, 19.3455f, 11, 3, 11, 0.0f, false));
            this.cube_r20_r1.field_78804_l.add(new ModelBox(this.cube_r20_r1, 0, 62, -7.3f, 14.3815f, 20.4506f, 15, 5, 10, 0.0f, false));
            this.cube_r20_r1.field_78804_l.add(new ModelBox(this.cube_r20_r1, 77, 78, -6.3f, 13.3815f, 20.4506f, 13, 1, 10, 0.0f, false));
            this.cube_r22_r1 = new ModelRenderer(this);
            this.cube_r22_r1.func_78793_a(0.0f, -31.2579f, 2.6958f);
            this.Body.func_78792_a(this.cube_r22_r1);
            setRotationAngle(this.cube_r22_r1, -2.6965f, 0.0f, 0.0f);
            this.cube_r22_r1.field_78804_l.add(new ModelBox(this.cube_r22_r1, (int) EntityMoXiu05.ENTITYID_RANGED, 0, -5.3f, 10.2842f, 30.0531f, 11, 5, 6, 0.0f, false));
            this.cube_r22_r1.field_78804_l.add(new ModelBox(this.cube_r22_r1, 105, 0, -3.8f, 9.1842f, 29.0531f, 8, 1, 7, 0.0f, false));
            this.cube_r22_r1.field_78804_l.add(new ModelBox(this.cube_r22_r1, (int) EntityGuLang0201.ENTITYID, 11, -4.3f, 9.2842f, 29.0531f, 9, 1, 7, 0.0f, false));
            this.cube_r22_r1.field_78804_l.add(new ModelBox(this.cube_r22_r1, 40, 62, -0.6f, 8.0842f, 29.3531f, 1, 1, 7, 0.0f, false));
            this.cube_r26_r1 = new ModelRenderer(this);
            this.cube_r26_r1.func_78793_a(0.0f, -38.5062f, 2.9145f);
            this.Body.func_78792_a(this.cube_r26_r1);
            setRotationAngle(this.cube_r26_r1, -2.3824f, 0.0f, 0.0f);
            this.cube_r26_r1.field_78804_l.add(new ModelBox(this.cube_r26_r1, (int) EntityMoXiu02.ENTITYID, 0, -0.6f, 13.9322f, 37.1254f, 1, 1, 5, 0.0f, false));
            this.cube_r26_r1.field_78804_l.add(new ModelBox(this.cube_r26_r1, (int) EntitySanXiu05.ENTITYID_RANGED, 127, -4.3f, 14.9322f, 34.1254f, 9, 5, 8, 0.0f, false));
            this.cube_r23_r1 = new ModelRenderer(this);
            this.cube_r23_r1.func_78793_a(0.0f, -48.4577f, -0.81f);
            this.Body.func_78792_a(this.cube_r23_r1);
            setRotationAngle(this.cube_r23_r1, -1.9199f, 0.0f, 0.0f);
            this.cube_r23_r1.field_78804_l.add(new ModelBox(this.cube_r23_r1, (int) EntitySanXiu05.ENTITYID, 93, -3.3f, 25.1303f, 36.0496f, 7, 4, 10, 0.0f, false));
            this.cube_r23_r1.field_78804_l.add(new ModelBox(this.cube_r23_r1, 110, (int) EntityMoXiu01.ENTITYID_RANGED, -0.6f, 24.1303f, 39.0496f, 1, 1, 7, 0.0f, false));
            this.cube_r24_r1 = new ModelRenderer(this);
            this.cube_r24_r1.func_78793_a(0.0f, -51.7543f, -3.4813f);
            this.Body.func_78792_a(this.cube_r24_r1);
            setRotationAngle(this.cube_r24_r1, -1.7367f, 0.0f, 0.0f);
            this.cube_r24_r1.field_78804_l.add(new ModelBox(this.cube_r24_r1, 30, 140, -0.5f, 28.9049f, 43.7764f, 1, 1, 6, 0.0f, false));
            this.cube_r24_r1.field_78804_l.add(new ModelBox(this.cube_r24_r1, (int) EntityMoXiu0302.ENTITYID, 85, -1.3f, 29.7049f, 43.0764f, 3, 4, 7, 0.0f, false));
            this.cube_r25_r1 = new ModelRenderer(this);
            this.cube_r25_r1.func_78793_a(0.0f, -56.7945f, -10.7524f);
            this.Body.func_78792_a(this.cube_r25_r1);
            setRotationAngle(this.cube_r25_r1, -1.3526f, 0.0f, 0.0f);
            this.cube_r25_r1.field_78804_l.add(new ModelBox(this.cube_r25_r1, 62, 92, -1.3f, 40.1449f, 40.0284f, 3, 4, 6, 0.0f, false));
            this.cube_r3_r1 = new ModelRenderer(this);
            this.cube_r3_r1.func_78793_a(0.3f, -41.5858f, 11.9167f);
            this.Body.func_78792_a(this.cube_r3_r1);
            setRotationAngle(this.cube_r3_r1, -2.5656f, 0.0f, 0.0f);
            this.cube_r3_r1.field_78804_l.add(new ModelBox(this.cube_r3_r1, 86, 103, -0.5f, 2.0339f, -1.984f, 1, 1, 9, 0.0f, false));
            this.cube_r3_r2 = new ModelRenderer(this);
            this.cube_r3_r2.func_78793_a(0.4f, -46.3655f, 9.9449f);
            this.Body.func_78792_a(this.cube_r3_r2);
            setRotationAngle(this.cube_r3_r2, -2.5482f, 0.0f, 0.0f);
            this.cube_r3_r2.field_78804_l.add(new ModelBox(this.cube_r3_r2, 100, 42, -5.0f, -2.4224f, -2.0129f, 10, 8, 9, 0.0f, false));
            this.cube_r4_r1 = new ModelRenderer(this);
            this.cube_r4_r1.func_78793_a(0.3f, -49.2275f, 23.3122f);
            this.Body.func_78792_a(this.cube_r4_r1);
            setRotationAngle(this.cube_r4_r1, -2.4784f, 0.0f, 0.0f);
            this.cube_r4_r1.field_78804_l.add(new ModelBox(this.cube_r4_r1, (int) EntityMoXiu02.ENTITYID, 61, -0.5f, 3.147f, 4.364f, 1, 1, 7, 0.0f, false));
            this.cube_r5_r1 = new ModelRenderer(this);
            this.cube_r5_r1.func_78793_a(0.3f, -52.9408f, 21.0271f);
            this.Body.func_78792_a(this.cube_r5_r1);
            setRotationAngle(this.cube_r5_r1, -2.234f, 0.0f, 0.0f);
            this.cube_r5_r1.field_78804_l.add(new ModelBox(this.cube_r5_r1, 69, (int) EntityYuWa2.ENTITYID, -0.5f, 1.664f, 0.447f, 1, 1, 7, 0.0f, false));
            this.cube_r4_r2 = new ModelRenderer(this);
            this.cube_r4_r2.func_78793_a(0.4f, -49.5761f, 19.3274f);
            this.Body.func_78792_a(this.cube_r4_r2);
            setRotationAngle(this.cube_r4_r2, -2.426f, 0.0f, 0.0f);
            this.cube_r4_r2.field_78804_l.add(new ModelBox(this.cube_r4_r2, 140, 21, -4.0f, 1.3682f, 1.3641f, 8, 7, 7, 0.0f, false));
            this.cube_r5_r2 = new ModelRenderer(this);
            this.cube_r5_r2.func_78793_a(0.4f, -53.2371f, 17.6401f);
            this.Body.func_78792_a(this.cube_r5_r2);
            setRotationAngle(this.cube_r5_r2, -2.0944f, 0.0f, 0.0f);
            this.cube_r5_r2.field_78804_l.add(new ModelBox(this.cube_r5_r2, (int) EntitySanXiu0102.ENTITYID_RANGED, (int) EntityMoXiu04.ENTITYID_RANGED, -3.0f, -0.4019f, -2.0f, 6, 6, 7, 0.0f, false));
            this.cube_r8_r1 = new ModelRenderer(this);
            this.cube_r8_r1.func_78793_a(0.0f, -25.7141f, -20.8337f);
            this.Body.func_78792_a(this.cube_r8_r1);
            setRotationAngle(this.cube_r8_r1, -2.1293f, 0.0f, 0.0f);
            this.cube_r8_r1.field_78804_l.add(new ModelBox(this.cube_r8_r1, (int) EntitySanXiu01.ENTITYID, 28, -4.6f, 9.1034f, -10.9145f, 9, 3, 10, 0.0f, false));
            this.cube_r7_r1 = new ModelRenderer(this);
            this.cube_r7_r1.func_78793_a(0.0f, -55.006f, -3.1944f);
            this.Body.func_78792_a(this.cube_r7_r1);
            setRotationAngle(this.cube_r7_r1, -1.4486f, 0.0f, 0.0f);
            this.cube_r7_r1.field_78804_l.add(new ModelBox(this.cube_r7_r1, 102, 70, -10.4f, 5.8836f, 6.2069f, 10, 4, 1, 0.0f, false));
            this.cube_r7_r1.field_78804_l.add(new ModelBox(this.cube_r7_r1, (int) EntitySanXiu05.ENTITYID, 107, -8.3f, 10.7836f, 6.2069f, 8, 4, 1, 0.0f, false));
            this.cube_r7_r1.field_78804_l.add(new ModelBox(this.cube_r7_r1, (int) EntityGuLang0401.ENTITYID_RANGED, 52, -6.3f, 15.5836f, 6.2069f, 6, 4, 1, 0.0f, false));
            this.cube_r7_r1.field_78804_l.add(new ModelBox(this.cube_r7_r1, 74, 92, 0.1f, 15.5836f, 6.2069f, 6, 4, 1, 0.0f, false));
            this.cube_r7_r1.field_78804_l.add(new ModelBox(this.cube_r7_r1, (int) EntityMoXiu02.ENTITYID_RANGED, 41, 0.1f, 10.7836f, 6.2069f, 8, 4, 1, 0.0f, false));
            this.cube_r7_r1.field_78804_l.add(new ModelBox(this.cube_r7_r1, 44, 127, 0.1f, 5.8836f, 6.2069f, 10, 4, 1, 0.0f, false));
            this.cube_r7_r1.field_78804_l.add(new ModelBox(this.cube_r7_r1, 140, 107, 0.5f, -5.1164f, 5.2069f, 13, 10, 2, 0.0f, false));
            this.cube_r7_r1.field_78804_l.add(new ModelBox(this.cube_r7_r1, 0, 143, -13.8f, -5.1164f, 5.2069f, 13, 10, 2, 0.0f, false));
            this.cube_r7_r1.field_78804_l.add(new ModelBox(this.cube_r7_r1, (int) EntityMoXiu0402.ENTITYID, 96, 6.4f, 13.8836f, 14.1069f, 2, 6, 6, 0.0f, false));
            this.cube_r7_r1.field_78804_l.add(new ModelBox(this.cube_r7_r1, (int) EntityMoXiu0402.ENTITYID_RANGED, 0, -8.6f, 13.8836f, 14.1069f, 2, 6, 6, 0.0f, false));
            this.cube_r7_r1.field_78804_l.add(new ModelBox(this.cube_r7_r1, 80, 89, -6.6f, 14.1836f, 12.3069f, 13, 6, 8, 0.0f, false));
            this.cube_r7_r1.field_78804_l.add(new ModelBox(this.cube_r7_r1, 0, 77, -5.6f, 22.8836f, 8.2069f, 11, 3, 11, 0.0f, false));
            this.cube_r7_r1.field_78804_l.add(new ModelBox(this.cube_r7_r1, 52, 50, -7.6f, 19.8836f, 7.2069f, 15, 3, 12, 0.0f, false));
            this.cube_r7_r1.field_78804_l.add(new ModelBox(this.cube_r7_r1, 50, 65, -9.6f, 13.8836f, 7.2069f, 19, 6, 7, 0.0f, false));
            this.cube_r7_r1.field_78804_l.add(new ModelBox(this.cube_r7_r1, 0, 46, -12.6f, 4.8836f, 7.2069f, 25, 9, 7, 0.0f, false));
            this.cube_r7_r1.field_78804_l.add(new ModelBox(this.cube_r7_r1, 0, 0, -14.6f, -8.1164f, 7.2069f, 29, 13, 7, 0.0f, false));
            this.cube_r7_r1.field_78804_l.add(new ModelBox(this.cube_r7_r1, 58, 20, -7.95f, -2.8164f, 16.4069f, 15, 17, 4, 0.0f, false));
            this.cube_r7_r1.field_78804_l.add(new ModelBox(this.cube_r7_r1, 0, 20, -12.6f, -8.1164f, 14.2069f, 25, 22, 4, 0.0f, false));
            this.cube_r9_r1 = new ModelRenderer(this);
            this.cube_r9_r1.func_78793_a(0.0893f, -43.7241f, 14.4291f);
            this.Body.func_78792_a(this.cube_r9_r1);
            setRotationAngle(this.cube_r9_r1, -1.435f, -0.4502f, -0.0594f);
            this.cube_r9_r1.field_78804_l.add(new ModelBox(this.cube_r9_r1, (int) EntitySanXiu0202.ENTITYID_RANGED, 77, -15.247f, 2.0674f, -5.515f, 10, 3, 5, 0.0f, false));
            this.cube_r10_r1 = new ModelRenderer(this);
            this.cube_r10_r1.func_78793_a(2.488f, -43.4876f, 12.5035f);
            this.Body.func_78792_a(this.cube_r10_r1);
            setRotationAngle(this.cube_r10_r1, -1.435f, 0.4502f, 0.0594f);
            this.cube_r10_r1.field_78804_l.add(new ModelBox(this.cube_r10_r1, (int) EntitySanXiu05.ENTITYID, (int) EntitySanXiu0302.ENTITYID_RANGED, 2.8218f, 1.1674f, -5.515f, 10, 3, 5, 0.0f, false));
            this.LeftLeg = new ModelRenderer(this);
            this.LeftLeg.func_78793_a(9.35f, -8.45f, -0.05f);
            setRotationAngle(this.LeftLeg, -0.1023f, -0.147f, -0.1329f);
            this.LeftLeg.field_78804_l.add(new ModelBox(this.LeftLeg, (int) EntitySanXiu01.ENTITYID, 8, -3.3554f, -0.6539f, -5.2834f, 7, 11, 9, 0.0f, false));
            this.LeftLeg.field_78804_l.add(new ModelBox(this.LeftLeg, 151, (int) EntityMoXiu0402.ENTITYID_RANGED, -3.3554f, 0.3461f, -6.2834f, 6, 10, 1, 0.0f, false));
            this.LeftLeg.field_78804_l.add(new ModelBox(this.LeftLeg, (int) EntitySanXiu01.ENTITYID_RANGED, (int) EntityMoXiu0202.ENTITYID_RANGED, 3.6446f, 0.4461f, -4.2834f, 1, 10, 7, 0.0f, false));
            this.cube_r32_r1 = new ModelRenderer(this);
            this.cube_r32_r1.func_78793_a(0.7592f, 12.9322f, 1.6635f);
            this.LeftLeg.func_78792_a(this.cube_r32_r1);
            setRotationAngle(this.cube_r32_r1, -1.5185f, 0.0f, 0.0f);
            this.cube_r32_r1.field_78804_l.add(new ModelBox(this.cube_r32_r1, 89, (int) EntityMoXiu01.ENTITYID_RANGED, -3.1146f, -1.8653f, -1.7265f, 5, 4, 11, 0.0f, false));
            this.cube_r29_r1 = new ModelRenderer(this);
            this.cube_r29_r1.func_78793_a(0.9592f, 21.7089f, 0.3548f);
            this.LeftLeg.func_78792_a(this.cube_r29_r1);
            setRotationAngle(this.cube_r29_r1, -2.1293f, 0.0f, 0.0f);
            this.cube_r29_r1.field_78804_l.add(new ModelBox(this.cube_r29_r1, 78, (int) EntityMoXiu01.ENTITYID_RANGED, -1.8146f, -2.9968f, -1.6505f, 3, 3, 8, 0.0f, false));
            this.cube_r31_r1 = new ModelRenderer(this);
            this.cube_r31_r1.func_78793_a(0.9592f, 23.2882f, 5.7198f);
            this.LeftLeg.func_78792_a(this.cube_r31_r1);
            setRotationAngle(this.cube_r31_r1, -1.7628f, 0.0f, 0.0f);
            this.cube_r31_r1.field_78804_l.add(new ModelBox(this.cube_r31_r1, 77, (int) EntityHeiZhu2.ENTITYID, -2.9146f, 5.4654f, -4.137f, 4, 3, 11, 0.0f, false));
            this.cube_r27_r1 = new ModelRenderer(this);
            this.cube_r27_r1.func_78793_a(-8.2539f, -7.0086f, 26.3111f);
            this.LeftLeg.func_78792_a(this.cube_r27_r1);
            setRotationAngle(this.cube_r27_r1, -1.1345f, 0.0f, 0.0f);
            this.cube_r27_r1.field_78804_l.add(new ModelBox(this.cube_r27_r1, (int) EntityMoXiu0102.ENTITYID_RANGED, (int) EntityGuLang0501.ENTITYID, 5.7985f, 32.9032f, 4.3527f, 5, 3, 8, 0.0f, false));
            this.cube_r34_r1 = new ModelRenderer(this);
            this.cube_r34_r1.func_78793_a(-16.7458f, 22.1184f, 35.8919f);
            this.LeftLeg.func_78792_a(this.cube_r34_r1);
            setRotationAngle(this.cube_r34_r1, -1.4605f, -0.1904f, 0.1073f);
            this.cube_r34_r1.field_78804_l.add(new ModelBox(this.cube_r34_r1, 97, 103, 11.2367f, 43.4183f, 2.6311f, 2, 7, 2, 0.0f, false));
            this.cube_r34_r1.field_78804_l.add(new ModelBox(this.cube_r34_r1, 96, (int) EntityMoXiu01.ENTITYID_RANGED, 11.7486f, 44.251f, 1.8903f, 1, 5, 1, 0.0f, false));
            this.cube_r35_r1 = new ModelRenderer(this);
            this.cube_r35_r1.func_78793_a(-6.8293f, 23.1438f, 38.1901f);
            this.LeftLeg.func_78792_a(this.cube_r35_r1);
            setRotationAngle(this.cube_r35_r1, -1.4624f, 0.0265f, 0.1312f);
            this.cube_r35_r1.field_78804_l.add(new ModelBox(this.cube_r35_r1, 86, 103, 4.9921f, 43.3527f, 2.5903f, 2, 7, 2, 0.0f, false));
            this.cube_r35_r1.field_78804_l.add(new ModelBox(this.cube_r35_r1, 92, (int) EntityMoXiu01.ENTITYID_RANGED, 5.4921f, 44.2527f, 1.7903f, 1, 5, 1, 0.0f, false));
            this.cube_r36_r1 = new ModelRenderer(this);
            this.cube_r36_r1.func_78793_a(-10.852f, 22.696f, 37.5302f);
            this.LeftLeg.func_78792_a(this.cube_r36_r1);
            setRotationAngle(this.cube_r36_r1, -1.4622f, -0.0603f, 0.1217f);
            this.cube_r36_r1.field_78804_l.add(new ModelBox(this.cube_r36_r1, 77, 78, 6.9946f, 43.052f, 2.5903f, 2, 8, 2, 0.0f, false));
            this.cube_r36_r1.field_78804_l.add(new ModelBox(this.cube_r36_r1, 40, 62, 7.6946f, 43.652f, 1.7903f, 1, 6, 1, 0.0f, false));
            this.cube_r36_r1.field_78804_l.add(new ModelBox(this.cube_r36_r1, 94, (int) EntitySanXiu0302.ENTITYID_RANGED, 5.0946f, 37.252f, -0.4097f, 8, 7, 5, 0.0f, false));
            this.cube_r37_r1 = new ModelRenderer(this);
            this.cube_r37_r1.func_78793_a(-11.6475f, 22.6111f, 37.3564f);
            this.LeftLeg.func_78792_a(this.cube_r37_r1);
            setRotationAngle(this.cube_r37_r1, -1.462f, -0.0776f, 0.1198f);
            this.cube_r37_r1.field_78804_l.add(new ModelBox(this.cube_r37_r1, 33, 77, 9.8951f, 43.6519f, 1.6403f, 1, 6, 1, 0.0f, false));
            this.cube_r37_r1.field_78804_l.add(new ModelBox(this.cube_r37_r1, 0, 91, 9.1951f, 42.7519f, 2.5403f, 2, 8, 2, 0.0f, false));
            this.cube_r30_r1 = new ModelRenderer(this);
            this.cube_r30_r1.func_78793_a(4.8296f, 25.3031f, 9.742f);
            this.LeftLeg.func_78792_a(this.cube_r30_r1);
            setRotationAngle(this.cube_r30_r1, 1.2149f, -0.0665f, 0.1399f);
            this.cube_r30_r1.field_78804_l.add(new ModelBox(this.cube_r30_r1, (int) EntityHunTieShou01.ENTITYID, (int) EntityMoXiu02.ENTITYID_RANGED, -7.6631f, -6.6006f, -8.2331f, 5, 6, 2, 0.0f, false));
            this.cube_r33_r1 = new ModelRenderer(this);
            this.cube_r33_r1.func_78793_a(0.5592f, 8.5862f, 9.4126f);
            this.LeftLeg.func_78792_a(this.cube_r33_r1);
            setRotationAngle(this.cube_r33_r1, -1.0123f, 0.0f, 0.0f);
            this.cube_r33_r1.field_78804_l.add(new ModelBox(this.cube_r33_r1, 21, 127, -3.3146f, 5.2062f, -7.344f, 6, 2, 11, 0.0f, false));
            this.cube_r28_r1 = new ModelRenderer(this);
            this.cube_r28_r1.func_78793_a(0.5592f, 10.0319f, 1.0693f);
            this.LeftLeg.func_78792_a(this.cube_r28_r1);
            setRotationAngle(this.cube_r28_r1, -0.7069f, 0.0f, 0.0f);
            this.cube_r28_r1.field_78804_l.add(new ModelBox(this.cube_r28_r1, (int) EntitySanXiu01.ENTITYID_RANGED, 70, -3.3146f, -0.392f, -3.7463f, 6, 4, 11, 0.0f, false));
            this.cube_r28_r2 = new ModelRenderer(this);
            this.cube_r28_r2.func_78793_a(-8.2539f, -18.5207f, -13.6762f);
            this.LeftLeg.func_78792_a(this.cube_r28_r2);
            setRotationAngle(this.cube_r28_r2, -0.8727f, 0.0f, 0.0f);
            this.cube_r28_r2.field_78804_l.add(new ModelBox(this.cube_r28_r2, 0, (int) EntityMoXiu03.ENTITYID, 5.7985f, 10.0016f, 26.2987f, 5, 2, 11, 0.0f, false));
            this.cube_r20 = new ModelRenderer(this);
            this.cube_r20.func_78793_a(-1.0797f, 15.6249f, -6.1317f);
            this.LeftLeg.func_78792_a(this.cube_r20);
            setRotationAngle(this.cube_r20, -1.4383f, 0.1515f, -0.0283f);
            this.RightLeg = new ModelRenderer(this);
            this.RightLeg.func_78793_a(-9.65f, -8.35f, 2.55f);
            setRotationAngle(this.RightLeg, -0.1095f, 0.0933f, 0.1142f);
            this.RightLeg.field_78804_l.add(new ModelBox(this.RightLeg, (int) EntitySanXiu01.ENTITYID, 8, -3.3919f, -0.69f, -5.2524f, 7, 11, 9, 0.0f, true));
            this.RightLeg.field_78804_l.add(new ModelBox(this.RightLeg, 151, (int) EntityMoXiu0402.ENTITYID_RANGED, -2.3919f, 0.31f, -6.2524f, 6, 10, 1, 0.0f, true));
            this.RightLeg.field_78804_l.add(new ModelBox(this.RightLeg, (int) EntitySanXiu01.ENTITYID_RANGED, (int) EntityMoXiu0202.ENTITYID_RANGED, -4.3919f, 0.41f, -4.2524f, 1, 10, 7, 0.0f, true));
            this.cube_r32_r2 = new ModelRenderer(this);
            this.cube_r32_r2.func_78793_a(-0.4642f, 12.8905f, 1.6977f);
            this.RightLeg.func_78792_a(this.cube_r32_r2);
            setRotationAngle(this.cube_r32_r2, -1.5185f, 0.0f, 0.0f);
            this.cube_r32_r2.field_78804_l.add(new ModelBox(this.cube_r32_r2, 89, (int) EntityMoXiu01.ENTITYID_RANGED, -1.9277f, -1.8618f, -1.721f, 5, 4, 11, 0.0f, true));
            this.cube_r29_r2 = new ModelRenderer(this);
            this.cube_r29_r2.func_78793_a(-0.6642f, 21.6673f, 0.389f);
            this.RightLeg.func_78792_a(this.cube_r29_r2);
            setRotationAngle(this.cube_r29_r2, -2.1293f, 0.0f, 0.0f);
            this.cube_r29_r2.field_78804_l.add(new ModelBox(this.cube_r29_r2, 78, (int) EntityMoXiu01.ENTITYID_RANGED, -1.2277f, -2.9971f, -1.644f, 3, 3, 8, 0.0f, true));
            this.cube_r31_r2 = new ModelRenderer(this);
            this.cube_r31_r2.func_78793_a(-0.6642f, 23.2465f, 5.754f);
            this.RightLeg.func_78792_a(this.cube_r31_r2);
            setRotationAngle(this.cube_r31_r2, -1.7628f, 0.0f, 0.0f);
            this.cube_r31_r2.field_78804_l.add(new ModelBox(this.cube_r31_r2, 77, (int) EntityHeiZhu2.ENTITYID, -1.1277f, 5.4675f, -4.1308f, 4, 3, 11, 0.0f, true));
            this.cube_r27_r2 = new ModelRenderer(this);
            this.cube_r27_r2.func_78793_a(8.5489f, -7.0502f, 26.3452f);
            this.RightLeg.func_78792_a(this.cube_r27_r2);
            setRotationAngle(this.cube_r27_r2, -1.1345f, 0.0f, 0.0f);
            this.cube_r27_r2.field_78804_l.add(new ModelBox(this.cube_r27_r2, (int) EntityMoXiu0102.ENTITYID_RANGED, (int) EntityGuLang0501.ENTITYID, -10.8408f, 32.9085f, 4.3565f, 5, 3, 8, 0.0f, true));
            this.cube_r34_r2 = new ModelRenderer(this);
            this.cube_r34_r2.func_78793_a(17.0408f, 22.0767f, 35.926f);
            this.RightLeg.func_78792_a(this.cube_r34_r2);
            setRotationAngle(this.cube_r34_r2, -1.4605f, 0.1904f, -0.1073f);
            this.cube_r34_r2.field_78804_l.add(new ModelBox(this.cube_r34_r2, 97, 103, -13.278f, 43.4296f, 2.6309f, 2, 7, 2, 0.0f, true));
            this.cube_r34_r2.field_78804_l.add(new ModelBox(this.cube_r34_r2, 96, (int) EntityMoXiu01.ENTITYID_RANGED, -12.7899f, 44.2623f, 1.8901f, 1, 5, 1, 0.0f, true));
            this.cube_r35_r2 = new ModelRenderer(this);
            this.cube_r35_r2.func_78793_a(7.1243f, 23.1021f, 38.2243f);
            this.RightLeg.func_78792_a(this.cube_r35_r2);
            setRotationAngle(this.cube_r35_r2, -1.4624f, -0.0265f, -0.1312f);
            this.cube_r35_r2.field_78804_l.add(new ModelBox(this.cube_r35_r2, 86, 103, -7.0348f, 43.3548f, 2.5901f, 2, 7, 2, 0.0f, true));
            this.cube_r35_r2.field_78804_l.add(new ModelBox(this.cube_r35_r2, 92, (int) EntityMoXiu01.ENTITYID_RANGED, -6.5348f, 44.2548f, 1.7901f, 1, 5, 1, 0.0f, true));
            this.cube_r36_r2 = new ModelRenderer(this);
            this.cube_r36_r2.func_78793_a(11.147f, 22.6543f, 37.5643f);
            this.RightLeg.func_78792_a(this.cube_r36_r2);
            setRotationAngle(this.cube_r36_r2, -1.4622f, 0.0603f, -0.1217f);
            this.cube_r36_r2.field_78804_l.add(new ModelBox(this.cube_r36_r2, 77, 78, -9.037f, 43.0578f, 2.5901f, 2, 8, 2, 0.0f, true));
            this.cube_r36_r2.field_78804_l.add(new ModelBox(this.cube_r36_r2, 40, 62, -8.737f, 43.6578f, 1.7901f, 1, 6, 1, 0.0f, true));
            this.cube_r36_r2.field_78804_l.add(new ModelBox(this.cube_r36_r2, 94, (int) EntitySanXiu0302.ENTITYID_RANGED, -13.137f, 37.2578f, -0.4099f, 8, 7, 5, 0.0f, true));
            this.cube_r37_r2 = new ModelRenderer(this);
            this.cube_r37_r2.func_78793_a(11.9425f, 22.5694f, 37.3905f);
            this.RightLeg.func_78792_a(this.cube_r37_r2);
            setRotationAngle(this.cube_r37_r2, -1.462f, 0.0776f, -0.1198f);
            this.cube_r37_r2.field_78804_l.add(new ModelBox(this.cube_r37_r2, 33, 77, -10.9374f, 43.6585f, 1.6401f, 1, 6, 1, 0.0f, true));
            this.cube_r37_r2.field_78804_l.add(new ModelBox(this.cube_r37_r2, 0, 91, -11.2374f, 42.7585f, 2.5401f, 2, 8, 2, 0.0f, true));
            this.cube_r30_r2 = new ModelRenderer(this);
            this.cube_r30_r2.func_78793_a(-4.5346f, 25.2615f, 9.7761f);
            this.RightLeg.func_78792_a(this.cube_r30_r2);
            setRotationAngle(this.cube_r30_r2, 1.2149f, 0.0665f, -0.1399f);
            this.cube_r30_r2.field_78804_l.add(new ModelBox(this.cube_r30_r2, (int) EntityHunTieShou01.ENTITYID, (int) EntityMoXiu02.ENTITYID_RANGED, 2.6208f, -6.6064f, -8.2349f, 5, 6, 2, 0.0f, true));
            this.cube_r33_r2 = new ModelRenderer(this);
            this.cube_r33_r2.func_78793_a(-0.2642f, 8.5445f, 9.4467f);
            this.RightLeg.func_78792_a(this.cube_r33_r2);
            setRotationAngle(this.cube_r33_r2, -1.0123f, 0.0f, 0.0f);
            this.cube_r33_r2.field_78804_l.add(new ModelBox(this.cube_r33_r2, 21, 127, -2.7277f, 5.2119f, -7.3409f, 6, 2, 11, 0.0f, true));
            this.cube_r28_r3 = new ModelRenderer(this);
            this.cube_r28_r3.func_78793_a(-0.2642f, 9.9902f, 1.1034f);
            this.RightLeg.func_78792_a(this.cube_r28_r3);
            setRotationAngle(this.cube_r28_r3, -0.7069f, 0.0f, 0.0f);
            this.cube_r28_r3.field_78804_l.add(new ModelBox(this.cube_r28_r3, (int) EntitySanXiu01.ENTITYID_RANGED, 70, -2.7277f, -0.3856f, -3.7451f, 6, 4, 11, 0.0f, true));
            this.cube_r28_r4 = new ModelRenderer(this);
            this.cube_r28_r4.func_78793_a(8.5489f, -18.5623f, -13.642f);
            this.RightLeg.func_78792_a(this.cube_r28_r4);
            setRotationAngle(this.cube_r28_r4, -0.8727f, 0.0f, 0.0f);
            this.cube_r28_r4.field_78804_l.add(new ModelBox(this.cube_r28_r4, 0, (int) EntityMoXiu03.ENTITYID, -10.8408f, 10.0077f, 26.301f, 5, 2, 11, 0.0f, true));
            this.cube_r31 = new ModelRenderer(this);
            this.cube_r31.func_78793_a(1.3747f, 15.5832f, -6.0975f);
            this.RightLeg.func_78792_a(this.cube_r31);
            setRotationAngle(this.cube_r31, -1.4383f, -0.1515f, 0.0283f);
            this.Head = new ModelRenderer(this);
            this.Head.func_78793_a(0.0f, -50.4299f, -11.8479f);
            setRotationAngle(this.Head, 0.3927f, 0.0f, 0.0f);
            this.Head.field_78804_l.add(new ModelBox(this.Head, 65, 0, -2.6f, 1.9971f, -16.531f, 6, 4, 2, 0.0f, false));
            this.Head.field_78804_l.add(new ModelBox(this.Head, 23, 111, -1.7f, 3.4971f, -17.231f, 4, 2, 2, 0.0f, false));
            this.Head.field_78804_l.add(new ModelBox(this.Head, 57, 49, 1.2f, -0.4029f, -8.631f, 2, 2, 1, 0.0f, false));
            this.Head.field_78804_l.add(new ModelBox(this.Head, 54, 20, -2.3f, -0.4029f, -8.631f, 2, 2, 1, 0.0f, false));
            this.Head.field_78804_l.add(new ModelBox(this.Head, (int) EntitySanXiu0402.ENTITYID, 54, -2.6f, 1.5971f, -14.531f, 6, 5, 7, 0.0f, false));
            this.Head.field_78804_l.add(new ModelBox(this.Head, 22, (int) EntityGuLang0501.ENTITYID_RANGED, -2.6f, 1.4971f, -7.531f, 6, 6, 8, 0.0f, false));
            this.Head.field_78804_l.add(new ModelBox(this.Head, (int) EntityMoXiu0202.ENTITYID_RANGED, 28, -2.6f, -0.5029f, -6.531f, 6, 2, 7, 0.0f, false));
            this.Head.field_78804_l.add(new ModelBox(this.Head, (int) EntityMoXiu05.ENTITYID_RANGED, 11, -2.6f, -0.7029f, -7.631f, 6, 3, 2, 0.0f, false));
            this.Head.field_78804_l.add(new ModelBox(this.Head, (int) EntitySanXiu03.ENTITYID, 85, -2.6f, -1.5029f, -6.531f, 6, 1, 7, 0.0f, false));
            this.Head.field_78804_l.add(new ModelBox(this.Head, 53, (int) EntityMoXiu0402.ENTITYID, 3.4f, -1.3029f, -6.231f, 1, 8, 7, 0.0f, false));
            this.Head.field_78804_l.add(new ModelBox(this.Head, 0, (int) EntityMoXiu0402.ENTITYID, -3.6f, -1.3029f, -6.331f, 1, 8, 7, 0.0f, false));
            this.cube_r6_r1 = new ModelRenderer(this);
            this.cube_r6_r1.func_78793_a(0.0f, 23.296f, 9.0471f);
            this.Head.func_78792_a(this.cube_r6_r1);
            setRotationAngle(this.cube_r6_r1, 0.2618f, 0.0f, 0.0f);
            this.cube_r6_r1.field_78804_l.add(new ModelBox(this.cube_r6_r1, (int) EntityMoXiu0102.ENTITYID_RANGED, 19, -2.6f, -20.4389f, -19.1022f, 6, 1, 8, 0.0f, false));
            this.cube_r6_r1.field_78804_l.add(new ModelBox(this.cube_r6_r1, (int) EntityMoXiu0302.ENTITYID, 45, -2.1f, -19.8389f, -18.1022f, 5, 1, 7, 0.0f, false));
            this.RightArm = new ModelRenderer(this);
            this.RightArm.func_78793_a(-13.3f, -33.6f, -6.3f);
            setRotationAngle(this.RightArm, 0.0f, 0.0f, 0.3665f);
            this.RightArm.field_78804_l.add(new ModelBox(this.RightArm, 50, 151, -7.775f, -2.8724f, -1.9783f, 4, 9, 8, 0.0f, true));
            this.RightArm.field_78804_l.add(new ModelBox(this.RightArm, (int) EntityGuLang0501.ENTITYID_RANGED, (int) EntitySanXiu04.ENTITYID_RANGED, -5.875f, 7.2276f, -1.9783f, 7, 2, 8, 0.0f, true));
            this.RightArm.field_78804_l.add(new ModelBox(this.RightArm, 96, 103, -6.73f, 7.1511f, -3.0457f, 7, 10, 10, 0.0f, true));
            this.RightArm.field_78804_l.add(new ModelBox(this.RightArm, 74, (int) EntitySanXiu0102.ENTITYID, -7.875f, 6.1276f, -1.9783f, 2, 11, 8, 0.0f, true));
            this.RightArm.field_78804_l.add(new ModelBox(this.RightArm, 36, 92, -5.875f, -1.7724f, -2.9783f, 8, 9, 10, 0.0f, true));
            this.RightArm.field_78804_l.add(new ModelBox(this.RightArm, (int) EntityYuWa2.ENTITYID, 62, -3.875f, -3.7724f, -1.9783f, 7, 7, 8, 0.0f, true));
            this.cube_r11_r1 = new ModelRenderer(this);
            this.cube_r11_r1.func_78793_a(6.0976f, -6.829f, 5.6305f);
            this.RightArm.func_78792_a(this.cube_r11_r1);
            setRotationAngle(this.cube_r11_r1, -0.7065f, -0.1255f, -0.1457f);
            this.cube_r11_r1.field_78804_l.add(new ModelBox(this.cube_r11_r1, (int) EntityMoXiu0302.ENTITYID, 66, -15.3739f, 27.4501f, 9.2635f, 5, 5, 6, 0.0f, true));
            this.cube_r11_r1.field_78804_l.add(new ModelBox(this.cube_r11_r1, (int) EntityMoXiu04.ENTITYID_RANGED, 140, -16.2739f, 16.4501f, 9.2635f, 7, 11, 6, 0.0f, true));
            this.cube_r12_r1 = new ModelRenderer(this);
            this.cube_r12_r1.func_78793_a(7.8302f, -4.1689f, 3.3179f);
            this.RightArm.func_78792_a(this.cube_r12_r1);
            setRotationAngle(this.cube_r12_r1, -0.7081f, -0.1142f, -0.1323f);
            this.cube_r12_r1.field_78804_l.add(new ModelBox(this.cube_r12_r1, (int) EntityMoXiu0502.ENTITYID, 108, -17.7255f, 13.1247f, 10.2635f, 2, 9, 4, 0.0f, true));
            this.cube_r13_r1 = new ModelRenderer(this);
            this.cube_r13_r1.func_78793_a(7.7611f, -0.6509f, 12.3284f);
            this.RightArm.func_78792_a(this.cube_r13_r1);
            setRotationAngle(this.cube_r13_r1, -0.7962f, -0.7452f, 0.4773f);
            this.cube_r13_r1.field_78804_l.add(new ModelBox(this.cube_r13_r1, (int) EntitySanXiu01.ENTITYID, 32, -11.3271f, 33.3171f, 0.5011f, 2, 1, 3, 0.0f, true));
            this.cube_r14_r1 = new ModelRenderer(this);
            this.cube_r14_r1.func_78793_a(4.9225f, -4.3168f, 10.0685f);
            this.RightArm.func_78792_a(this.cube_r14_r1);
            setRotationAngle(this.cube_r14_r1, -0.7266f, -0.5388f, 0.091f);
            this.cube_r14_r1.field_78804_l.add(new ModelBox(this.cube_r14_r1, (int) EntitySanXiu01.ENTITYID_RANGED, 75, -11.5116f, 34.0121f, 5.8553f, 2, 1, 3, 0.0f, true));
            this.cube_r15_r1 = new ModelRenderer(this);
            this.cube_r15_r1.func_78793_a(2.0691f, -7.4834f, 6.1994f);
            this.RightArm.func_78792_a(this.cube_r15_r1);
            setRotationAngle(this.cube_r15_r1, -0.6909f, -0.2042f, -0.2405f);
            this.cube_r15_r1.field_78804_l.add(new ModelBox(this.cube_r15_r1, 16, (int) EntityHunTieShou01.ENTITYID, -13.4232f, 32.6032f, 10.2635f, 2, 5, 5, 0.0f, true));
            this.cube_r16_r1 = new ModelRenderer(this);
            this.cube_r16_r1.func_78793_a(-19.75f, -4.5692f, -3.7893f);
            this.RightArm.func_78792_a(this.cube_r16_r1);
            setRotationAngle(this.cube_r16_r1, -0.3525f, -0.5266f, -0.7325f);
            this.cube_r16_r1.field_78804_l.add(new ModelBox(this.cube_r16_r1, 32, (int) EntitySanXiu04.ENTITYID, -10.4921f, 38.1857f, 13.2285f, 2, 4, 1, 0.0f, true));
            this.cube_r17_r1 = new ModelRenderer(this);
            this.cube_r17_r1.func_78793_a(-20.8315f, -1.5627f, 1.0521f);
            this.RightArm.func_78792_a(this.cube_r17_r1);
            setRotationAngle(this.cube_r17_r1, -0.5096f, -0.5266f, -0.7325f);
            this.cube_r17_r1.field_78804_l.add(new ModelBox(this.cube_r17_r1, (int) EntityMoXiu01.ENTITYID, 93, -10.4921f, 37.5022f, 11.9635f, 2, 4, 1, 0.0f, true));
            this.cube_r18_r1 = new ModelRenderer(this);
            this.cube_r18_r1.func_78793_a(-36.5023f, 16.2607f, -14.4428f);
            this.RightArm.func_78792_a(this.cube_r18_r1);
            setRotationAngle(this.cube_r18_r1, 0.0605f, -0.7135f, -1.6631f);
            this.cube_r18_r1.field_78804_l.add(new ModelBox(this.cube_r18_r1, 55, 111, -13.5358f, 39.3995f, 14.1635f, 2, 4, 1, 0.0f, true));
            this.cube_r18_r1.field_78804_l.add(new ModelBox(this.cube_r18_r1, (int) EntitySanXiu02.ENTITYID, 8, -13.5358f, 39.9995f, 11.9635f, 2, 4, 1, 0.0f, true));
            this.cube_r18_r1.field_78804_l.add(new ModelBox(this.cube_r18_r1, 55, (int) EntitySanXiu03.ENTITYID, -13.5358f, 39.6995f, 9.9635f, 2, 4, 1, 0.0f, true));
            this.cube_r19_r1 = new ModelRenderer(this);
            this.cube_r19_r1.func_78793_a(-21.226f, 2.4002f, 6.1151f);
            this.RightArm.func_78792_a(this.cube_r19_r1);
            setRotationAngle(this.cube_r19_r1, -0.6841f, -0.5266f, -0.7325f);
            this.cube_r19_r1.field_78804_l.add(new ModelBox(this.cube_r19_r1, (int) EntityMoXiu01.ENTITYID, 98, -10.4921f, 36.6556f, 10.7242f, 2, 4, 1, 0.0f, true));
            this.LefttArm = new ModelRenderer(this);
            this.LefttArm.func_78793_a(13.3f, -33.6f, -6.5f);
            setRotationAngle(this.LefttArm, 0.0f, 0.0f, -0.3665f);
            this.LefttArm.field_78804_l.add(new ModelBox(this.LefttArm, 50, 151, 3.9542f, -3.3392f, -1.9783f, 4, 9, 8, 0.0f, false));
            this.LefttArm.field_78804_l.add(new ModelBox(this.LefttArm, (int) EntityGuLang0501.ENTITYID_RANGED, (int) EntitySanXiu04.ENTITYID_RANGED, -0.9458f, 6.7608f, -1.9783f, 7, 2, 8, 0.0f, false));
            this.LefttArm.field_78804_l.add(new ModelBox(this.LefttArm, 96, 103, -0.0908f, 6.6843f, -3.1457f, 7, 10, 10, 0.0f, false));
            this.LefttArm.field_78804_l.add(new ModelBox(this.LefttArm, 74, (int) EntitySanXiu0102.ENTITYID, 6.0542f, 5.6608f, -1.9783f, 2, 11, 8, 0.0f, false));
            this.LefttArm.field_78804_l.add(new ModelBox(this.LefttArm, 36, 92, -1.9458f, -2.2392f, -2.9783f, 8, 9, 10, 0.0f, false));
            this.LefttArm.field_78804_l.add(new ModelBox(this.LefttArm, (int) EntityYuWa2.ENTITYID, 62, -2.9458f, -4.2392f, -1.9783f, 7, 7, 8, 0.0f, false));
            this.cube_r11_r2 = new ModelRenderer(this);
            this.cube_r11_r2.func_78793_a(-5.9185f, -6.9958f, 5.2305f);
            this.LefttArm.func_78792_a(this.cube_r11_r2);
            setRotationAngle(this.cube_r11_r2, -0.7065f, 0.1255f, 0.1457f);
            this.cube_r11_r2.field_78804_l.add(new ModelBox(this.cube_r11_r2, (int) EntityMoXiu0302.ENTITYID, 66, 9.9739f, 27.4501f, 9.2635f, 5, 5, 6, 0.0f, false));
            this.cube_r11_r2.field_78804_l.add(new ModelBox(this.cube_r11_r2, (int) EntityMoXiu04.ENTITYID_RANGED, 140, 8.9739f, 16.4501f, 9.2635f, 7, 11, 6, 0.0f, false));
            this.cube_r12_r2 = new ModelRenderer(this);
            this.cube_r12_r2.func_78793_a(-7.6511f, -4.3357f, 2.9179f);
            this.LefttArm.func_78792_a(this.cube_r12_r2);
            setRotationAngle(this.cube_r12_r2, -0.7081f, 0.1142f, 0.1323f);
            this.cube_r12_r2.field_78804_l.add(new ModelBox(this.cube_r12_r2, (int) EntityMoXiu0502.ENTITYID, 108, 15.1255f, 13.1247f, 10.2635f, 2, 9, 4, 0.0f, false));
            this.cube_r13_r2 = new ModelRenderer(this);
            this.cube_r13_r2.func_78793_a(-7.5819f, -0.8177f, 11.9284f);
            this.LefttArm.func_78792_a(this.cube_r13_r2);
            setRotationAngle(this.cube_r13_r2, -0.7962f, 0.7452f, -0.4773f);
            this.cube_r13_r2.field_78804_l.add(new ModelBox(this.cube_r13_r2, (int) EntitySanXiu01.ENTITYID, 32, 9.3271f, 33.3171f, 0.5011f, 2, 1, 3, 0.0f, false));
            this.cube_r14_r2 = new ModelRenderer(this);
            this.cube_r14_r2.func_78793_a(-4.7434f, -4.4836f, 9.6685f);
            this.LefttArm.func_78792_a(this.cube_r14_r2);
            setRotationAngle(this.cube_r14_r2, -0.7266f, 0.5388f, -0.091f);
            this.cube_r14_r2.field_78804_l.add(new ModelBox(this.cube_r14_r2, (int) EntitySanXiu01.ENTITYID_RANGED, 75, 9.5116f, 34.0121f, 5.8553f, 2, 1, 3, 0.0f, false));
            this.cube_r15_r2 = new ModelRenderer(this);
            this.cube_r15_r2.func_78793_a(-1.8899f, -7.6502f, 5.7994f);
            this.LefttArm.func_78792_a(this.cube_r15_r2);
            setRotationAngle(this.cube_r15_r2, -0.6909f, 0.2042f, 0.2405f);
            this.cube_r15_r2.field_78804_l.add(new ModelBox(this.cube_r15_r2, 16, (int) EntityHunTieShou01.ENTITYID, 11.4232f, 32.6032f, 10.2635f, 2, 5, 5, 0.0f, false));
            this.cube_r16_r2 = new ModelRenderer(this);
            this.cube_r16_r2.func_78793_a(19.9292f, -4.736f, -4.1893f);
            this.LefttArm.func_78792_a(this.cube_r16_r2);
            setRotationAngle(this.cube_r16_r2, -0.3525f, 0.5266f, 0.7325f);
            this.cube_r16_r2.field_78804_l.add(new ModelBox(this.cube_r16_r2, 32, (int) EntitySanXiu04.ENTITYID, 8.4921f, 38.1857f, 13.2285f, 2, 4, 1, 0.0f, false));
            this.cube_r17_r2 = new ModelRenderer(this);
            this.cube_r17_r2.func_78793_a(21.0106f, -1.7294f, 0.6521f);
            this.LefttArm.func_78792_a(this.cube_r17_r2);
            setRotationAngle(this.cube_r17_r2, -0.5096f, 0.5266f, 0.7325f);
            this.cube_r17_r2.field_78804_l.add(new ModelBox(this.cube_r17_r2, (int) EntityMoXiu01.ENTITYID, 93, 8.4921f, 37.5022f, 11.9635f, 2, 4, 1, 0.0f, false));
            this.cube_r18_r2 = new ModelRenderer(this);
            this.cube_r18_r2.func_78793_a(36.6814f, 16.0939f, -14.8428f);
            this.LefttArm.func_78792_a(this.cube_r18_r2);
            setRotationAngle(this.cube_r18_r2, 0.0605f, 0.7135f, 1.6631f);
            this.cube_r18_r2.field_78804_l.add(new ModelBox(this.cube_r18_r2, 55, 111, 11.5358f, 39.3995f, 14.1635f, 2, 4, 1, 0.0f, false));
            this.cube_r18_r2.field_78804_l.add(new ModelBox(this.cube_r18_r2, (int) EntitySanXiu02.ENTITYID, 8, 11.5358f, 39.9995f, 11.9635f, 2, 4, 1, 0.0f, false));
            this.cube_r18_r2.field_78804_l.add(new ModelBox(this.cube_r18_r2, 55, (int) EntitySanXiu03.ENTITYID, 11.5358f, 39.6995f, 9.9635f, 2, 4, 1, 0.0f, false));
            this.cube_r19_r2 = new ModelRenderer(this);
            this.cube_r19_r2.func_78793_a(21.4052f, 2.2334f, 5.7151f);
            this.LefttArm.func_78792_a(this.cube_r19_r2);
            setRotationAngle(this.cube_r19_r2, -0.6841f, 0.5266f, 0.7325f);
            this.cube_r19_r2.field_78804_l.add(new ModelBox(this.cube_r19_r2, (int) EntityMoXiu01.ENTITYID, 98, 8.4921f, 36.6556f, 10.7242f, 2, 4, 1, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.Body.func_78785_a(f5);
            this.LeftLeg.func_78785_a(f5);
            this.RightLeg.func_78785_a(f5);
            this.Head.func_78785_a(f5);
            this.RightArm.func_78785_a(f5);
            this.LefttArm.func_78785_a(f5);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.field_78795_f = x;
            modelRenderer.field_78796_g = y;
            modelRenderer.field_78808_h = z;
        }

        public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
            super.func_78087_a(f, f1, f2, f3, f4, f5, e);
            this.RightArm.field_78795_f = MathHelper.func_76134_b((f * 0.6662f) + 3.1415927f) * f1;
            this.Head.field_78796_g = f3 / 57.295776f;
            this.Head.field_78795_f = f4 / 57.295776f;
            this.RightLeg.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
            this.LefttArm.field_78795_f = MathHelper.func_76134_b(f * 0.6662f) * f1;
            this.LeftLeg.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
        }
    }
}
