package net.mcreator.yvanchuyaoshou.entity;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureJiHunXieDie;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureJiHunXieUpdate;
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
import net.minecraft.entity.ai.EntityAILookIdle;
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
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityJiHunXie02.class */
public class EntityJiHunXie02 extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 204;
    public static final int ENTITYID_RANGED = 205;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityJiHunXie02(ElementsYvanchuyaoshouMod instance) {
        super(instance, 30);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "ji_hun_xie_02"), (int) ENTITYID).name("ji_hun_xie_02").tracker(64, 3, true).egg(-16750951, -16777114).build();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modelji_hun_xie(), 0.4f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityJiHunXie02.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/ji_hun_xie.png");
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityJiHunXie02$EntityCustom.class */
    public static class EntityCustom extends EntityMob {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(1.0f, 1.0f);
            this.field_70728_aV = 20;
            this.field_70178_ae = false;
            func_94061_f(false);
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70715_bh.func_75776_a(1, new EntityAIHurtByTarget(this, true, new Class[0]));
            this.field_70714_bg.func_75776_a(2, new EntityAIAttackMelee(this, 1.2d, true));
            this.field_70714_bg.func_75776_a(3, new EntityAIWander(this, 1.0d));
            this.field_70714_bg.func_75776_a(4, new EntityAILookIdle(this));
            this.field_70714_bg.func_75776_a(5, new EntityAISwimming(this));
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
            EntityJiHunXie02.$_dependencies.put("entity", this);
            ProcedureShouJiNbt.executeProcedure(EntityJiHunXie02.$_dependencies);
            return super.func_70097_a(source, amount);
        }

        public void func_70645_a(DamageSource source) {
            super.func_70645_a(source);
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            EntityJiHunXie02.$_dependencies.put("entity", this);
            EntityJiHunXie02.$_dependencies.put("x", Integer.valueOf(x));
            EntityJiHunXie02.$_dependencies.put("y", Integer.valueOf(y));
            EntityJiHunXie02.$_dependencies.put("z", Integer.valueOf(z));
            EntityJiHunXie02.$_dependencies.put("world", this.field_70170_p);
            ProcedureJiHunXieDie.executeProcedure(EntityJiHunXie02.$_dependencies);
        }

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityJiHunXie02.$_dependencies.put("entity", this);
            EntityJiHunXie02.$_dependencies.put("world", this.field_70170_p);
            ProcedureJiHunXieUpdate.executeProcedure(EntityJiHunXie02.$_dependencies);
        }

        protected void func_110147_ax() {
            super.func_110147_ax();
            if (func_110148_a(SharedMonsterAttributes.field_188791_g) != null) {
                func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(2.0d);
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
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityJiHunXie02$Modelji_hun_xie.class */
    public static class Modelji_hun_xie extends ModelBase {
        private final ModelRenderer all;
        private final ModelRenderer crabshell;
        private final ModelRenderer cube_r1;
        private final ModelRenderer cube_r2;
        private final ModelRenderer cube_r3;
        private final ModelRenderer body;
        private final ModelRenderer head;
        private final ModelRenderer cube_r4;
        private final ModelRenderer cube_r5;
        private final ModelRenderer trunk;
        private final ModelRenderer cube_r6;
        private final ModelRenderer leg_all;
        private final ModelRenderer leg_Right;
        private final ModelRenderer leg1_R;
        private final ModelRenderer cube_r7;
        private final ModelRenderer cube_r8;
        private final ModelRenderer leg2_R;
        private final ModelRenderer cube_r9;
        private final ModelRenderer cube_r10;
        private final ModelRenderer leg3_R;
        private final ModelRenderer cube_r11;
        private final ModelRenderer cube_r12;
        private final ModelRenderer leg4_R;
        private final ModelRenderer cube_r13;
        private final ModelRenderer cube_r14;
        private final ModelRenderer cube_r15;
        private final ModelRenderer leg_Left;
        private final ModelRenderer leg1_L;
        private final ModelRenderer cube_r16;
        private final ModelRenderer cube_r17;
        private final ModelRenderer leg2_L;
        private final ModelRenderer cube_r18;
        private final ModelRenderer cube_r19;
        private final ModelRenderer leg3_L;
        private final ModelRenderer cube_r20;
        private final ModelRenderer cube_r21;
        private final ModelRenderer leg4_L;
        private final ModelRenderer cube_r22;
        private final ModelRenderer cube_r23;
        private final ModelRenderer cube_r24;
        private final ModelRenderer arm_all;
        private final ModelRenderer cube_r25;
        private final ModelRenderer arm_L;
        private final ModelRenderer cube_r26;
        private final ModelRenderer arm2_L;
        private final ModelRenderer cube_r27;
        private final ModelRenderer pincres_L;
        private final ModelRenderer cube_r28;
        private final ModelRenderer cube_r29;
        private final ModelRenderer cube_r30;
        private final ModelRenderer arm_R;
        private final ModelRenderer cube_r31;
        private final ModelRenderer arm2_R;
        private final ModelRenderer cube_r32;
        private final ModelRenderer pincres_R;
        private final ModelRenderer cube_r33;
        private final ModelRenderer cube_r34;
        private final ModelRenderer cube_r35;

        public Modelji_hun_xie() {
            this.field_78090_t = 64;
            this.field_78089_u = 64;
            this.all = new ModelRenderer(this);
            this.all.func_78793_a(0.0f, 20.75f, 0.0f);
            setRotationAngle(this.all, 0.0f, 3.1416f, 0.0f);
            this.crabshell = new ModelRenderer(this);
            this.crabshell.func_78793_a(0.0f, -2.0f, -1.25f);
            this.all.func_78792_a(this.crabshell);
            setRotationAngle(this.crabshell, 0.2182f, 0.0f, 0.0f);
            this.cube_r1 = new ModelRenderer(this);
            this.cube_r1.func_78793_a(0.0f, 1.6457f, 1.409f);
            this.crabshell.func_78792_a(this.cube_r1);
            setRotationAngle(this.cube_r1, 0.1309f, 0.0f, 0.0f);
            this.cube_r1.field_78804_l.add(new ModelBox(this.cube_r1, 26, 23, -2.0f, -8.0228f, -7.5229f, 4, 8, 8, 0.0f, false));
            this.cube_r2 = new ModelRenderer(this);
            this.cube_r2.func_78793_a(0.0f, 7.6457f, 1.409f);
            this.crabshell.func_78792_a(this.cube_r2);
            setRotationAngle(this.cube_r2, 0.1309f, 0.0f, 0.0f);
            this.cube_r2.field_78804_l.add(new ModelBox(this.cube_r2, 0, 16, -4.0f, -13.0f, -6.0f, 8, 6, 9, 0.0f, false));
            this.cube_r3 = new ModelRenderer(this);
            this.cube_r3.func_78793_a(0.0f, 7.6457f, 1.409f);
            this.crabshell.func_78792_a(this.cube_r3);
            setRotationAngle(this.cube_r3, 0.1309f, 0.0f, 0.0f);
            this.cube_r3.field_78804_l.add(new ModelBox(this.cube_r3, 0, 0, -5.0f, -12.0f, -5.0f, 10, 6, 10, 0.0f, false));
            this.body = new ModelRenderer(this);
            this.body.func_78793_a(0.0f, 1.8266f, -0.565f);
            this.all.func_78792_a(this.body);
            this.head = new ModelRenderer(this);
            this.head.func_78793_a(-2.0f, -0.7317f, -1.1594f);
            this.body.func_78792_a(this.head);
            this.cube_r4 = new ModelRenderer(this);
            this.cube_r4.func_78793_a(3.5f, -2.5f, 5.0f);
            this.head.func_78792_a(this.cube_r4);
            setRotationAngle(this.cube_r4, 1.7017f, 0.0f, 0.0f);
            this.cube_r4.field_78804_l.add(new ModelBox(this.cube_r4, 28, 45, -1.0f, -1.0f, -1.0f, 1, 1, 2, 0.0f, false));
            this.cube_r4.field_78804_l.add(new ModelBox(this.cube_r4, 34, 45, -3.0f, -1.0f, -1.0f, 1, 1, 2, 0.0f, false));
            this.cube_r5 = new ModelRenderer(this);
            this.cube_r5.func_78793_a(2.0f, -1.0f, 4.0f);
            this.head.func_78792_a(this.cube_r5);
            setRotationAngle(this.cube_r5, 0.1309f, 0.0f, 0.0f);
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 0, 16, -1.0f, -2.0f, -1.0f, 2, 3, 2, 0.0f, false));
            this.trunk = new ModelRenderer(this);
            this.trunk.func_78793_a(0.0f, 0.0f, 0.0f);
            this.body.func_78792_a(this.trunk);
            this.cube_r6 = new ModelRenderer(this);
            this.cube_r6.func_78793_a(0.0f, -3.1959f, -1.1405f);
            this.trunk.func_78792_a(this.cube_r6);
            setRotationAngle(this.cube_r6, 0.1745f, 0.0f, 0.0f);
            this.cube_r6.field_78804_l.add(new ModelBox(this.cube_r6, 25, 16, -1.0f, 3.0f, -2.0f, 2, 1, 5, 0.0f, false));
            this.cube_r6.field_78804_l.add(new ModelBox(this.cube_r6, 30, 0, -2.0f, 1.0f, -3.0f, 4, 2, 7, 0.0f, false));
            this.leg_all = new ModelRenderer(this);
            this.leg_all.func_78793_a(0.0f, -0.3266f, 2.065f);
            this.trunk.func_78792_a(this.leg_all);
            this.leg_Right = new ModelRenderer(this);
            this.leg_Right.func_78793_a(0.0f, 0.0f, 0.0f);
            this.leg_all.func_78792_a(this.leg_Right);
            this.leg1_R = new ModelRenderer(this);
            this.leg1_R.func_78793_a(4.5598f, -0.4248f, 1.8821f);
            this.leg_Right.func_78792_a(this.leg1_R);
            this.cube_r7 = new ModelRenderer(this);
            this.cube_r7.func_78793_a(0.0f, 0.1443f, -0.1778f);
            this.leg1_R.func_78792_a(this.cube_r7);
            setRotationAngle(this.cube_r7, -1.0472f, 1.1781f, -0.2182f);
            this.cube_r7.field_78804_l.add(new ModelBox(this.cube_r7, 7, 31, -0.5f, -2.078f, -0.3002f, 1, 1, 4, 0.0f, false));
            this.cube_r8 = new ModelRenderer(this);
            this.cube_r8.func_78793_a(0.0f, 0.1443f, -0.1778f);
            this.leg1_R.func_78792_a(this.cube_r8);
            setRotationAngle(this.cube_r8, 0.0f, 1.1781f, -0.2182f);
            this.cube_r8.field_78804_l.add(new ModelBox(this.cube_r8, 52, 0, -0.5f, -1.683f, -0.4665f, 1, 2, 2, 0.0f, false));
            this.cube_r8.field_78804_l.add(new ModelBox(this.cube_r8, 52, 4, -0.5f, -0.933f, -4.7165f, 1, 1, 5, 0.0f, false));
            this.leg2_R = new ModelRenderer(this);
            this.leg2_R.func_78793_a(4.9545f, -0.3354f, 0.2144f);
            this.leg_Right.func_78792_a(this.leg2_R);
            this.cube_r9 = new ModelRenderer(this);
            this.cube_r9.func_78793_a(0.0f, 0.2232f, -0.1658f);
            this.leg2_R.func_78792_a(this.cube_r9);
            setRotationAngle(this.cube_r9, -0.9163f, 1.5184f, -0.1571f);
            this.cube_r9.field_78804_l.add(new ModelBox(this.cube_r9, 7, 31, -0.5f, -1.9101f, -0.1372f, 1, 1, 4, 0.0f, false));
            this.cube_r10 = new ModelRenderer(this);
            this.cube_r10.func_78793_a(0.0f, 0.2232f, -0.1658f);
            this.leg2_R.func_78792_a(this.cube_r10);
            setRotationAngle(this.cube_r10, 0.0f, 1.5184f, -0.1571f);
            this.cube_r10.field_78804_l.add(new ModelBox(this.cube_r10, 52, 0, -0.5f, -1.6195f, -0.5027f, 1, 2, 2, 0.0f, false));
            this.cube_r10.field_78804_l.add(new ModelBox(this.cube_r10, 52, 4, -0.5f, -0.8695f, -4.7527f, 1, 1, 5, 0.0f, false));
            this.leg3_R = new ModelRenderer(this);
            this.leg3_R.func_78793_a(4.7627f, -0.1512f, -1.4817f);
            this.leg_Right.func_78792_a(this.leg3_R);
            this.cube_r11 = new ModelRenderer(this);
            this.cube_r11.func_78793_a(0.0f, 0.285f, -0.1521f);
            this.leg3_R.func_78792_a(this.cube_r11);
            setRotationAngle(this.cube_r11, 2.4435f, 1.2566f, 3.0369f);
            this.cube_r11.field_78804_l.add(new ModelBox(this.cube_r11, 7, 31, -0.5f, -1.5876f, 0.0816f, 1, 1, 4, 0.0f, false));
            this.cube_r12 = new ModelRenderer(this);
            this.cube_r12.func_78793_a(0.0f, 0.285f, -0.1521f);
            this.leg3_R.func_78792_a(this.cube_r12);
            setRotationAngle(this.cube_r12, -3.1416f, 1.2566f, 3.0369f);
            this.cube_r12.field_78804_l.add(new ModelBox(this.cube_r12, 52, 0, -0.5f, -1.5049f, -0.5437f, 1, 2, 2, 0.0f, false));
            this.cube_r12.field_78804_l.add(new ModelBox(this.cube_r12, 52, 4, -0.5f, -0.7549f, -4.7937f, 1, 1, 5, 0.0f, false));
            this.leg4_R = new ModelRenderer(this);
            this.leg4_R.func_78793_a(4.0277f, 0.2854f, -2.7101f);
            this.leg_Right.func_78792_a(this.leg4_R);
            this.cube_r13 = new ModelRenderer(this);
            this.cube_r13.func_78793_a(0.0f, 0.1194f, -0.0022f);
            this.leg4_R.func_78792_a(this.cube_r13);
            setRotationAngle(this.cube_r13, 2.7053f, 1.0472f, 3.0718f);
            this.cube_r13.field_78804_l.add(new ModelBox(this.cube_r13, 7, 31, -0.5f, -1.1497f, 0.2445f, 1, 1, 4, 0.0f, false));
            this.cube_r14 = new ModelRenderer(this);
            this.cube_r14.func_78793_a(0.0f, 0.1194f, -0.0022f);
            this.leg4_R.func_78792_a(this.cube_r14);
            setRotationAngle(this.cube_r14, 3.098f, 1.0472f, 3.0718f);
            this.cube_r14.field_78804_l.add(new ModelBox(this.cube_r14, 52, 0, -0.5f, -0.8583f, -1.009f, 1, 1, 2, 0.0f, false));
            this.cube_r15 = new ModelRenderer(this);
            this.cube_r15.func_78793_a(0.0f, 0.1194f, -0.0022f);
            this.leg4_R.func_78792_a(this.cube_r15);
            setRotationAngle(this.cube_r15, -3.1416f, 1.0472f, 3.0718f);
            this.cube_r15.field_78804_l.add(new ModelBox(this.cube_r15, 52, 4, -0.5f, -0.8597f, -4.8088f, 1, 1, 5, 0.0f, false));
            this.leg_Left = new ModelRenderer(this);
            this.leg_Left.func_78793_a(0.0f, 0.0f, 0.0f);
            this.leg_all.func_78792_a(this.leg_Left);
            this.leg1_L = new ModelRenderer(this);
            this.leg1_L.func_78793_a(-4.5598f, -0.4248f, 1.8821f);
            this.leg_Left.func_78792_a(this.leg1_L);
            this.cube_r16 = new ModelRenderer(this);
            this.cube_r16.func_78793_a(0.0f, 0.1443f, -0.1778f);
            this.leg1_L.func_78792_a(this.cube_r16);
            setRotationAngle(this.cube_r16, -1.0472f, -1.1781f, 0.2182f);
            this.cube_r16.field_78804_l.add(new ModelBox(this.cube_r16, 7, 31, -0.5f, -2.078f, -0.3002f, 1, 1, 4, 0.0f, true));
            this.cube_r17 = new ModelRenderer(this);
            this.cube_r17.func_78793_a(0.0f, 0.1443f, -0.1778f);
            this.leg1_L.func_78792_a(this.cube_r17);
            setRotationAngle(this.cube_r17, 0.0f, -1.1781f, 0.2182f);
            this.cube_r17.field_78804_l.add(new ModelBox(this.cube_r17, 52, 0, -0.5f, -1.683f, -0.4665f, 1, 2, 2, 0.0f, true));
            this.cube_r17.field_78804_l.add(new ModelBox(this.cube_r17, 52, 4, -0.5f, -0.933f, -4.7165f, 1, 1, 5, 0.0f, true));
            this.leg2_L = new ModelRenderer(this);
            this.leg2_L.func_78793_a(-4.9545f, -0.3354f, 0.2144f);
            this.leg_Left.func_78792_a(this.leg2_L);
            this.cube_r18 = new ModelRenderer(this);
            this.cube_r18.func_78793_a(0.0f, 0.2232f, -0.1658f);
            this.leg2_L.func_78792_a(this.cube_r18);
            setRotationAngle(this.cube_r18, -0.9163f, -1.5184f, 0.1571f);
            this.cube_r18.field_78804_l.add(new ModelBox(this.cube_r18, 7, 31, -0.5f, -1.9101f, -0.1372f, 1, 1, 4, 0.0f, true));
            this.cube_r19 = new ModelRenderer(this);
            this.cube_r19.func_78793_a(0.0f, 0.2232f, -0.1658f);
            this.leg2_L.func_78792_a(this.cube_r19);
            setRotationAngle(this.cube_r19, 0.0f, -1.5184f, 0.1571f);
            this.cube_r19.field_78804_l.add(new ModelBox(this.cube_r19, 52, 0, -0.5f, -1.6195f, -0.5027f, 1, 2, 2, 0.0f, true));
            this.cube_r19.field_78804_l.add(new ModelBox(this.cube_r19, 52, 4, -0.5f, -0.8695f, -4.7527f, 1, 1, 5, 0.0f, true));
            this.leg3_L = new ModelRenderer(this);
            this.leg3_L.func_78793_a(-4.7627f, -0.1512f, -1.4817f);
            this.leg_Left.func_78792_a(this.leg3_L);
            this.cube_r20 = new ModelRenderer(this);
            this.cube_r20.func_78793_a(0.0f, 0.285f, -0.1521f);
            this.leg3_L.func_78792_a(this.cube_r20);
            setRotationAngle(this.cube_r20, 2.4435f, -1.2566f, -3.0369f);
            this.cube_r20.field_78804_l.add(new ModelBox(this.cube_r20, 7, 31, -0.5f, -1.5876f, 0.0816f, 1, 1, 4, 0.0f, true));
            this.cube_r21 = new ModelRenderer(this);
            this.cube_r21.func_78793_a(0.0f, 0.285f, -0.1521f);
            this.leg3_L.func_78792_a(this.cube_r21);
            setRotationAngle(this.cube_r21, -3.1416f, -1.2566f, -3.0369f);
            this.cube_r21.field_78804_l.add(new ModelBox(this.cube_r21, 52, 0, -0.5f, -1.5049f, -0.5437f, 1, 2, 2, 0.0f, true));
            this.cube_r21.field_78804_l.add(new ModelBox(this.cube_r21, 52, 4, -0.5f, -0.7549f, -4.7937f, 1, 1, 5, 0.0f, true));
            this.leg4_L = new ModelRenderer(this);
            this.leg4_L.func_78793_a(-4.0277f, 0.2854f, -2.7101f);
            this.leg_Left.func_78792_a(this.leg4_L);
            this.cube_r22 = new ModelRenderer(this);
            this.cube_r22.func_78793_a(0.0f, 0.1194f, -0.0022f);
            this.leg4_L.func_78792_a(this.cube_r22);
            setRotationAngle(this.cube_r22, 2.7053f, -1.0472f, -3.0718f);
            this.cube_r22.field_78804_l.add(new ModelBox(this.cube_r22, 7, 31, -0.5f, -1.1497f, 0.2445f, 1, 1, 4, 0.0f, true));
            this.cube_r23 = new ModelRenderer(this);
            this.cube_r23.func_78793_a(0.0f, 0.1194f, -0.0022f);
            this.leg4_L.func_78792_a(this.cube_r23);
            setRotationAngle(this.cube_r23, 3.098f, -1.0472f, -3.0718f);
            this.cube_r23.field_78804_l.add(new ModelBox(this.cube_r23, 52, 0, -0.5f, -0.8583f, -1.009f, 1, 1, 2, 0.0f, true));
            this.cube_r24 = new ModelRenderer(this);
            this.cube_r24.func_78793_a(0.0f, 0.1194f, -0.0022f);
            this.leg4_L.func_78792_a(this.cube_r24);
            setRotationAngle(this.cube_r24, -3.1416f, -1.0472f, -3.0718f);
            this.cube_r24.field_78804_l.add(new ModelBox(this.cube_r24, 52, 4, -0.5f, -0.8597f, -4.8088f, 1, 1, 5, 0.0f, true));
            this.arm_all = new ModelRenderer(this);
            this.arm_all.func_78793_a(0.0f, -1.9817f, 1.8406f);
            this.trunk.func_78792_a(this.arm_all);
            setRotationAngle(this.arm_all, -0.2618f, 0.0f, 0.0f);
            this.cube_r25 = new ModelRenderer(this);
            this.cube_r25.func_78793_a(-2.0f, 0.0f, 0.0f);
            this.arm_all.func_78792_a(this.cube_r25);
            setRotationAngle(this.cube_r25, 0.1745f, 0.0f, 0.0f);
            this.cube_r25.field_78804_l.add(new ModelBox(this.cube_r25, 20, 6, 0.0f, -1.0152f, -0.1736f, 4, 1, 1, 0.0f, false));
            this.arm_L = new ModelRenderer(this);
            this.arm_L.func_78793_a(-1.5f, -1.2052f, -0.598f);
            this.arm_all.func_78792_a(this.arm_L);
            setRotationAngle(this.arm_L, -0.3491f, 0.0f, 0.3491f);
            this.arm_L.field_78804_l.add(new ModelBox(this.arm_L, 6, 2, -1.0f, -0.25f, 2.25f, 1, 1, 1, 0.0f, false));
            this.cube_r26 = new ModelRenderer(this);
            this.cube_r26.func_78793_a(0.6294f, -0.1355f, 1.2802f);
            this.arm_L.func_78792_a(this.cube_r26);
            setRotationAngle(this.cube_r26, -0.1207f, -0.4732f, 0.0941f);
            this.cube_r26.field_78804_l.add(new ModelBox(this.cube_r26, 40, 45, -0.8794f, -0.1989f, -0.3153f, 1, 1, 2, 0.0f, false));
            this.arm2_L = new ModelRenderer(this);
            this.arm2_L.func_78793_a(-0.25f, -0.5844f, 3.7149f);
            this.arm_L.func_78792_a(this.arm2_L);
            setRotationAngle(this.arm2_L, -0.093f, -0.3918f, 0.0204f);
            this.cube_r27 = new ModelRenderer(this);
            this.cube_r27.func_78793_a(0.0f, -0.25f, 0.25f);
            this.arm2_L.func_78792_a(this.cube_r27);
            setRotationAngle(this.cube_r27, 0.5672f, 0.0f, 0.0f);
            this.cube_r27.field_78804_l.add(new ModelBox(this.cube_r27, 0, 21, -1.0f, 0.0f, -1.0f, 1, 1, 3, 0.0f, false));
            this.pincres_L = new ModelRenderer(this);
            this.pincres_L.func_78793_a(0.0f, -0.3053f, 1.9432f);
            this.arm2_L.func_78792_a(this.pincres_L);
            setRotationAngle(this.pincres_L, 0.829f, 0.0f, 0.0f);
            this.pincres_L.field_78804_l.add(new ModelBox(this.pincres_L, 6, 7, -1.0f, -0.7087f, 0.394f, 1, 1, 1, 0.0f, false));
            this.cube_r28 = new ModelRenderer(this);
            this.cube_r28.func_78793_a(0.25f, 0.0413f, 0.894f);
            this.pincres_L.func_78792_a(this.cube_r28);
            setRotationAngle(this.cube_r28, 0.0f, 0.2182f, 0.2618f);
            this.cube_r28.field_78804_l.add(new ModelBox(this.cube_r28, 45, 39, -0.75f, -1.0f, 0.0f, 1, 1, 2, 0.0f, false));
            this.cube_r29 = new ModelRenderer(this);
            this.cube_r29.func_78793_a(0.5f, 0.0413f, 0.894f);
            this.pincres_L.func_78792_a(this.cube_r29);
            setRotationAngle(this.cube_r29, 0.0f, 0.0f, 0.2618f);
            this.cube_r29.field_78804_l.add(new ModelBox(this.cube_r29, 0, 7, -1.0f, -0.75f, -0.25f, 1, 1, 1, 0.0f, false));
            this.cube_r30 = new ModelRenderer(this);
            this.cube_r30.func_78793_a(-0.75f, 0.5413f, 0.894f);
            this.pincres_L.func_78792_a(this.cube_r30);
            setRotationAngle(this.cube_r30, 0.0f, 0.0f, 0.2618f);
            this.cube_r30.field_78804_l.add(new ModelBox(this.cube_r30, 6, 5, -1.25f, -1.5f, 0.5f, 1, 1, 1, 0.0f, false));
            this.cube_r30.field_78804_l.add(new ModelBox(this.cube_r30, 16, 45, -1.0f, -2.0f, 0.0f, 1, 2, 2, 0.0f, false));
            this.arm_R = new ModelRenderer(this);
            this.arm_R.func_78793_a(1.5f, -1.2052f, -0.598f);
            this.arm_all.func_78792_a(this.arm_R);
            setRotationAngle(this.arm_R, -0.3491f, 0.0f, -0.3491f);
            this.arm_R.field_78804_l.add(new ModelBox(this.arm_R, 6, 2, 0.0f, -0.25f, 2.25f, 1, 1, 1, 0.0f, true));
            this.cube_r31 = new ModelRenderer(this);
            this.cube_r31.func_78793_a(-0.6294f, -0.1355f, 1.2802f);
            this.arm_R.func_78792_a(this.cube_r31);
            setRotationAngle(this.cube_r31, -0.1207f, 0.4732f, -0.0941f);
            this.cube_r31.field_78804_l.add(new ModelBox(this.cube_r31, 40, 45, -0.1206f, -0.1989f, -0.3153f, 1, 1, 2, 0.0f, true));
            this.arm2_R = new ModelRenderer(this);
            this.arm2_R.func_78793_a(0.25f, -0.5844f, 3.7149f);
            this.arm_R.func_78792_a(this.arm2_R);
            setRotationAngle(this.arm2_R, -0.093f, 0.3918f, -0.0204f);
            this.cube_r32 = new ModelRenderer(this);
            this.cube_r32.func_78793_a(0.0f, -0.25f, 0.25f);
            this.arm2_R.func_78792_a(this.cube_r32);
            setRotationAngle(this.cube_r32, 0.5672f, 0.0f, 0.0f);
            this.cube_r32.field_78804_l.add(new ModelBox(this.cube_r32, 0, 21, 0.0f, 0.0f, -1.0f, 1, 1, 3, 0.0f, true));
            this.pincres_R = new ModelRenderer(this);
            this.pincres_R.func_78793_a(0.0f, -0.3053f, 1.9432f);
            this.arm2_R.func_78792_a(this.pincres_R);
            setRotationAngle(this.pincres_R, 0.829f, 0.0f, 0.0f);
            this.pincres_R.field_78804_l.add(new ModelBox(this.pincres_R, 6, 7, 0.0f, -0.7087f, 0.394f, 1, 1, 1, 0.0f, true));
            this.cube_r33 = new ModelRenderer(this);
            this.cube_r33.func_78793_a(-0.25f, 0.0413f, 0.894f);
            this.pincres_R.func_78792_a(this.cube_r33);
            setRotationAngle(this.cube_r33, 0.0f, -0.2182f, -0.2618f);
            this.cube_r33.field_78804_l.add(new ModelBox(this.cube_r33, 45, 39, -0.25f, -1.0f, 0.0f, 1, 1, 2, 0.0f, true));
            this.cube_r34 = new ModelRenderer(this);
            this.cube_r34.func_78793_a(-0.5f, 0.0413f, 0.894f);
            this.pincres_R.func_78792_a(this.cube_r34);
            setRotationAngle(this.cube_r34, 0.0f, 0.0f, -0.2618f);
            this.cube_r34.field_78804_l.add(new ModelBox(this.cube_r34, 0, 7, 0.0f, -0.75f, -0.25f, 1, 1, 1, 0.0f, true));
            this.cube_r35 = new ModelRenderer(this);
            this.cube_r35.func_78793_a(0.75f, 0.5413f, 0.894f);
            this.pincres_R.func_78792_a(this.cube_r35);
            setRotationAngle(this.cube_r35, 0.0f, 0.0f, -0.2618f);
            this.cube_r35.field_78804_l.add(new ModelBox(this.cube_r35, 6, 5, 0.25f, -1.5f, 0.5f, 1, 1, 1, 0.0f, true));
            this.cube_r35.field_78804_l.add(new ModelBox(this.cube_r35, 16, 45, 0.0f, -2.0f, 0.0f, 1, 2, 2, 0.0f, true));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.all.func_78785_a(f5);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.field_78795_f = x;
            modelRenderer.field_78796_g = y;
            modelRenderer.field_78808_h = z;
        }

        public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
            super.func_78087_a(f, f1, f2, f3, f4, f5, e);
            this.leg4_R.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
            this.leg4_L.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
            this.leg2_L.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
            this.leg2_R.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
            this.leg3_R.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
            this.leg3_L.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
            this.leg1_L.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
            this.leg1_R.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
        }
    }
}
