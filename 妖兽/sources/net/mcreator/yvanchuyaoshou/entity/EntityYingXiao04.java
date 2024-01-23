package net.mcreator.yvanchuyaoshou.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityCaientity02;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureYingXiaoDie;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureYingXiaoShouJi;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureYingXiaoUpdate;
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
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
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
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityYingXiao04.class */
public class EntityYingXiao04 extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 64;
    public static final int ENTITYID_RANGED = 65;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityYingXiao04(ElementsYvanchuyaoshouMod instance) {
        super(instance, 35);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "ying_xiao_04"), 64).name("ying_xiao_04").tracker((int) EntityMoXiu02.ENTITYID, 3, true).egg(-10040320, -13159).build();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modelniao_ren(), 1.0f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityYingXiao04.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/niao_ren.png");
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityYingXiao04$EntityCustom.class */
    public static class EntityCustom extends EntityMob {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(2.5f, 5.0f);
            this.field_70728_aV = 50;
            this.field_70178_ae = false;
            func_94061_f(false);
            this.field_70699_by = new PathNavigateFlying(this, this.field_70170_p);
            this.field_70765_h = new EntityFlyHelper(this);
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70715_bh.func_75776_a(1, new EntityAINearestAttackableTarget(this, EntityCaientity02.EntityCustom.class, true, true));
            this.field_70715_bh.func_75776_a(2, new EntityAIHurtByTarget(this, true, new Class[0]));
            this.field_70714_bg.func_75776_a(3, new EntityAIAttackMelee(this, 1.5d, true));
            this.field_70714_bg.func_75776_a(4, new EntityAILookIdle(this));
            this.field_70714_bg.func_75776_a(5, new EntityAISwimming(this));
            this.field_70714_bg.func_75776_a(6, new EntityAIWander(this, 1.5d, 20) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityYingXiao04.EntityCustom.1
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
            EntityYingXiao04.$_dependencies.put("entity", this);
            ProcedureYingXiaoShouJi.executeProcedure(EntityYingXiao04.$_dependencies);
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
            EntityYingXiao04.$_dependencies.put("entity", this);
            EntityYingXiao04.$_dependencies.put("x", Integer.valueOf(x));
            EntityYingXiao04.$_dependencies.put("y", Integer.valueOf(y));
            EntityYingXiao04.$_dependencies.put("z", Integer.valueOf(z));
            EntityYingXiao04.$_dependencies.put("world", this.field_70170_p);
            ProcedureYingXiaoDie.executeProcedure(EntityYingXiao04.$_dependencies);
        }

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityYingXiao04.$_dependencies.put("entity", this);
            EntityYingXiao04.$_dependencies.put("world", this.field_70170_p);
            ProcedureYingXiaoUpdate.executeProcedure(EntityYingXiao04.$_dependencies);
        }

        protected void func_110147_ax() {
            super.func_110147_ax();
            if (func_110148_a(SharedMonsterAttributes.field_188791_g) != null) {
                func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(6.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111263_d) != null) {
                func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.6d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111267_a) != null) {
                func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(20.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111264_e) != null) {
                func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(1.0d);
            }
            func_110140_aT().func_111150_b(SharedMonsterAttributes.field_193334_e);
            func_110148_a(SharedMonsterAttributes.field_193334_e).func_111128_a(0.6d);
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

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityYingXiao04$Modelniao_ren.class */
    public static class Modelniao_ren extends ModelBase {
        private final ModelRenderer RightLeg;
        private final ModelRenderer cube_r1;
        private final ModelRenderer cube_r2;
        private final ModelRenderer xiaotui;
        private final ModelRenderer cube_r3;
        private final ModelRenderer jiao;
        private final ModelRenderer cube_r4;
        private final ModelRenderer cube_r5;
        private final ModelRenderer cube_r6;
        private final ModelRenderer cube_r7;
        private final ModelRenderer cube_r8;
        private final ModelRenderer cube_r9;
        private final ModelRenderer LeftArm;
        private final ModelRenderer cube_r10;
        private final ModelRenderer qiangzhi2;
        private final ModelRenderer cube_r11;
        private final ModelRenderer shoubi2;
        private final ModelRenderer cube_r12;
        private final ModelRenderer cube_r13;
        private final ModelRenderer cube_r14;
        private final ModelRenderer cube_r15;
        private final ModelRenderer cube_r16;
        private final ModelRenderer cube_r17;
        private final ModelRenderer cube_r18;
        private final ModelRenderer cube_r19;
        private final ModelRenderer cube_r20;
        private final ModelRenderer RightArm;
        private final ModelRenderer cube_r21;
        private final ModelRenderer qiangzhi;
        private final ModelRenderer cube_r22;
        private final ModelRenderer shoubi;
        private final ModelRenderer cube_r23;
        private final ModelRenderer cube_r24;
        private final ModelRenderer cube_r25;
        private final ModelRenderer cube_r26;
        private final ModelRenderer cube_r27;
        private final ModelRenderer cube_r28;
        private final ModelRenderer cube_r29;
        private final ModelRenderer cube_r30;
        private final ModelRenderer cube_r31;
        private final ModelRenderer Head;
        private final ModelRenderer cube_r32;
        private final ModelRenderer cube_r33;
        private final ModelRenderer cube_r34;
        private final ModelRenderer cube_r35;
        private final ModelRenderer cube_r36;
        private final ModelRenderer cube_r37;
        private final ModelRenderer cube_r38;
        private final ModelRenderer cube_r39;
        private final ModelRenderer cube_r40;
        private final ModelRenderer cube_r41;
        private final ModelRenderer cube_r42;
        private final ModelRenderer cube_r43;
        private final ModelRenderer cube_r44;
        private final ModelRenderer cube_r45;
        private final ModelRenderer cube_r46;
        private final ModelRenderer cube_r47;
        private final ModelRenderer cube_r48;
        private final ModelRenderer cube_r49;
        private final ModelRenderer Body;
        private final ModelRenderer cube_r50;
        private final ModelRenderer cube_r51;
        private final ModelRenderer cube_r52;
        private final ModelRenderer cube_r53;
        private final ModelRenderer cube_r54;
        private final ModelRenderer cube_r55;
        private final ModelRenderer cube_r56;
        private final ModelRenderer cube_r57;
        private final ModelRenderer cube_r58;
        private final ModelRenderer cube_r59;
        private final ModelRenderer cube_r60;
        private final ModelRenderer cube_r61;
        private final ModelRenderer cube_r62;
        private final ModelRenderer cube_r63;
        private final ModelRenderer cube_r64;
        private final ModelRenderer cube_r65;
        private final ModelRenderer cube_r66;
        private final ModelRenderer chibang;
        private final ModelRenderer cube_r67;
        private final ModelRenderer cube_r68;
        private final ModelRenderer cube_r69;
        private final ModelRenderer yi2;
        private final ModelRenderer cube_r70;
        private final ModelRenderer cube_r71;
        private final ModelRenderer cube_r72;
        private final ModelRenderer cube_r73;
        private final ModelRenderer cube_r74;
        private final ModelRenderer cube_r75;
        private final ModelRenderer bone5;
        private final ModelRenderer cube_r76;
        private final ModelRenderer bone6;
        private final ModelRenderer cube_r77;
        private final ModelRenderer bone7;
        private final ModelRenderer cube_r78;
        private final ModelRenderer chibang2;
        private final ModelRenderer cube_r79;
        private final ModelRenderer cube_r80;
        private final ModelRenderer cube_r81;
        private final ModelRenderer yi3;
        private final ModelRenderer cube_r82;
        private final ModelRenderer cube_r83;
        private final ModelRenderer cube_r84;
        private final ModelRenderer cube_r85;
        private final ModelRenderer cube_r86;
        private final ModelRenderer cube_r87;
        private final ModelRenderer bone2;
        private final ModelRenderer cube_r88;
        private final ModelRenderer bone3;
        private final ModelRenderer cube_r89;
        private final ModelRenderer bone4;
        private final ModelRenderer cube_r90;
        private final ModelRenderer LeftLeg;
        private final ModelRenderer cube_r91;
        private final ModelRenderer cube_r92;
        private final ModelRenderer xiaotui2;
        private final ModelRenderer cube_r93;
        private final ModelRenderer jiao2;
        private final ModelRenderer cube_r94;
        private final ModelRenderer cube_r95;
        private final ModelRenderer cube_r96;
        private final ModelRenderer cube_r97;
        private final ModelRenderer cube_r98;
        private final ModelRenderer cube_r99;

        public Modelniao_ren() {
            this.field_78090_t = 256;
            this.field_78089_u = 256;
            this.RightLeg = new ModelRenderer(this);
            this.RightLeg.func_78793_a(-3.7814f, -31.3f, -2.6063f);
            setRotationAngle(this.RightLeg, 0.0437f, 0.187f, 0.231f);
            this.cube_r1 = new ModelRenderer(this);
            this.cube_r1.func_78793_a(-1.9459f, 17.5593f, -1.6987f);
            this.RightLeg.func_78792_a(this.cube_r1);
            setRotationAngle(this.cube_r1, -0.2007f, 0.0f, 0.0698f);
            this.cube_r1.field_78804_l.add(new ModelBox(this.cube_r1, (int) EntityMoXiu04.ENTITYID, 70, 2.3474f, 11.2421f, -1.1869f, 7, 13, 8, 0.0f, false));
            this.cube_r2 = new ModelRenderer(this);
            this.cube_r2.func_78793_a(-1.5936f, 5.3541f, -1.7987f);
            this.RightLeg.func_78792_a(this.cube_r2);
            setRotationAngle(this.cube_r2, 0.0f, 0.0f, 0.2443f);
            this.cube_r2.field_78804_l.add(new ModelBox(this.cube_r2, 0, (int) EntitySanXiu03.ENTITYID_RANGED, 6.0798f, 10.3201f, -4.5f, 9, 14, 9, 0.0f, false));
            this.xiaotui = new ModelRenderer(this);
            this.xiaotui.func_78793_a(-3.0453f, 19.9506f, -3.323f);
            this.RightLeg.func_78792_a(this.xiaotui);
            setRotationAngle(this.xiaotui, 0.3491f, 0.0f, 0.0f);
            this.cube_r3 = new ModelRenderer(this);
            this.cube_r3.func_78793_a(-0.2713f, 10.0434f, 1.4243f);
            this.xiaotui.func_78792_a(this.cube_r3);
            setRotationAngle(this.cube_r3, 0.1745f, 0.0f, 0.0698f);
            this.cube_r3.field_78804_l.add(new ModelBox(this.cube_r3, 72, (int) EntitySanXiu0202.ENTITYID_RANGED, 3.7655f, 7.5236f, -12.1815f, 4, 15, 5, 0.0f, false));
            this.jiao = new ModelRenderer(this);
            this.jiao.func_78793_a(-0.2713f, 10.0434f, 8.2f);
            this.xiaotui.func_78792_a(this.jiao);
            this.jiao.field_78804_l.add(new ModelBox(this.jiao, 59, 0, 1.5389f, 23.8688f, -19.3408f, 5, 3, 9, 0.0f, false));
            this.cube_r4 = new ModelRenderer(this);
            this.cube_r4.func_78793_a(-8.5601f, 8.5566f, -13.7757f);
            this.jiao.func_78792_a(this.cube_r4);
            setRotationAngle(this.cube_r4, 0.456f, -0.0415f, 0.0171f);
            this.cube_r4.field_78804_l.add(new ModelBox(this.cube_r4, (int) EntityMoXiu0502.ENTITYID, (int) EntityGuLang0401.ENTITYID, 12.1311f, 10.1488f, -19.4872f, 1, 2, 6, 0.0f, false));
            this.cube_r5 = new ModelRenderer(this);
            this.cube_r5.func_78793_a(-8.5601f, 8.5566f, -13.7757f);
            this.jiao.func_78792_a(this.cube_r5);
            setRotationAngle(this.cube_r5, 0.4538f, 0.1222f, 0.0f);
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 127, 70, 10.5778f, 11.3992f, -16.5806f, 1, 2, 5, 0.0f, false));
            this.cube_r6 = new ModelRenderer(this);
            this.cube_r6.func_78793_a(1.8956f, 8.7824f, -16.5418f);
            this.jiao.func_78792_a(this.cube_r6);
            setRotationAngle(this.cube_r6, 0.4344f, -0.3005f, 0.0513f);
            this.cube_r6.field_78804_l.add(new ModelBox(this.cube_r6, 85, 46, 3.1155f, 12.0237f, -15.2339f, 1, 2, 5, 0.0f, false));
            this.cube_r7 = new ModelRenderer(this);
            this.cube_r7.func_78793_a(-8.5601f, 8.5566f, -17.5757f);
            this.jiao.func_78792_a(this.cube_r7);
            setRotationAngle(this.cube_r7, -0.456f, 0.0415f, 0.0171f);
            this.cube_r7.field_78804_l.add(new ModelBox(this.cube_r7, 28, (int) EntityMoXiu0402.ENTITYID_RANGED, 12.0847f, 10.4139f, 13.1295f, 1, 2, 6, 0.0f, false));
            this.cube_r8 = new ModelRenderer(this);
            this.cube_r8.func_78793_a(-8.5601f, 8.5566f, -13.7757f);
            this.jiao.func_78792_a(this.cube_r8);
            setRotationAngle(this.cube_r8, -0.1222f, 0.1222f, 0.0f);
            this.cube_r8.field_78804_l.add(new ModelBox(this.cube_r8, (int) EntityMoXiu0502.ENTITYID, 140, 10.5778f, 16.1151f, -3.2902f, 1, 2, 6, 0.0f, false));
            this.cube_r9 = new ModelRenderer(this);
            this.cube_r9.func_78793_a(-8.5601f, 8.5566f, -13.7757f);
            this.jiao.func_78792_a(this.cube_r9);
            setRotationAngle(this.cube_r9, -0.261f, -0.0511f, 0.0212f);
            this.cube_r9.field_78804_l.add(new ModelBox(this.cube_r9, 28, 70, 12.1394f, 16.578f, -3.6714f, 1, 2, 4, 0.0f, false));
            this.LeftArm = new ModelRenderer(this);
            this.LeftArm.func_78793_a(10.7402f, -53.7876f, -5.0521f);
            this.cube_r10 = new ModelRenderer(this);
            this.cube_r10.func_78793_a(2.4844f, 17.1935f, 18.2913f);
            this.LeftArm.func_78792_a(this.cube_r10);
            setRotationAngle(this.cube_r10, 0.0f, 0.0f, -0.6283f);
            this.cube_r10.field_78804_l.add(new ModelBox(this.cube_r10, (int) EntityMoXiu01.ENTITYID, 140, -4.8f, -2.0f, -21.0f, 6, 14, 6, 0.0f, true));
            this.cube_r10.field_78804_l.add(new ModelBox(this.cube_r10, 62, (int) EntityHeiZhu2.ENTITYID_RANGED, -4.8f, 2.0f, -22.0f, 7, 8, 8, 0.0f, true));
            this.cube_r10.field_78804_l.add(new ModelBox(this.cube_r10, 27, (int) EntitySanXiu03.ENTITYID_RANGED, -8.8f, -1.0f, -20.0f, 9, 4, 4, 0.0f, true));
            this.qiangzhi2 = new ModelRenderer(this);
            this.qiangzhi2.func_78793_a(7.5873f, 7.2156f, -0.933f);
            this.LeftArm.func_78792_a(this.qiangzhi2);
            setRotationAngle(this.qiangzhi2, 0.4113f, 0.2349f, -0.284f);
            this.cube_r11 = new ModelRenderer(this);
            this.cube_r11.func_78793_a(0.0449f, 3.8f, -0.4757f);
            this.qiangzhi2.func_78792_a(this.cube_r11);
            setRotationAngle(this.cube_r11, -0.4189f, 0.0f, -0.1745f);
            this.cube_r11.field_78804_l.add(new ModelBox(this.cube_r11, (int) EntitySanXiu0302.ENTITYID, 85, -11.3325f, 13.6066f, -4.6497f, 6, 9, 6, 0.0f, true));
            this.cube_r11.field_78804_l.add(new ModelBox(this.cube_r11, (int) EntityMoXiu0302.ENTITYID, 52, -10.3325f, 19.6066f, -3.6497f, 6, 9, 4, 0.0f, true));
            this.shoubi2 = new ModelRenderer(this);
            this.shoubi2.func_78793_a(2.1f, 13.0f, -7.7f);
            this.qiangzhi2.func_78792_a(this.shoubi2);
            this.cube_r12 = new ModelRenderer(this);
            this.cube_r12.func_78793_a(1.9086f, 2.9132f, -1.4854f);
            this.shoubi2.func_78792_a(this.cube_r12);
            setRotationAngle(this.cube_r12, -0.9231f, 0.1162f, -0.5785f);
            this.cube_r12.field_78804_l.add(new ModelBox(this.cube_r12, 59, 0, -13.7772f, 12.1412f, 2.236f, 2, 6, 1, 0.0f, true));
            this.cube_r13 = new ModelRenderer(this);
            this.cube_r13.func_78793_a(1.7308f, 5.5574f, -4.0924f);
            this.shoubi2.func_78792_a(this.cube_r13);
            setRotationAngle(this.cube_r13, -0.4872f, 0.78f, 0.2631f);
            this.cube_r13.field_78804_l.add(new ModelBox(this.cube_r13, 61, 89, 4.5553f, 17.0454f, 1.8f, 2, 4, 1, 0.0f, true));
            this.cube_r14 = new ModelRenderer(this);
            this.cube_r14.func_78793_a(-2.2501f, 3.93f, -3.8387f);
            this.shoubi2.func_78792_a(this.cube_r14);
            setRotationAngle(this.cube_r14, -0.5754f, 0.501f, -0.2748f);
            this.cube_r14.field_78804_l.add(new ModelBox(this.cube_r14, 82, 4, -4.9039f, 17.8645f, -2.4714f, 1, 3, 2, 0.0f, true));
            this.cube_r15 = new ModelRenderer(this);
            this.cube_r15.func_78793_a(1.9086f, 2.9132f, -1.4854f);
            this.shoubi2.func_78792_a(this.cube_r15);
            setRotationAngle(this.cube_r15, -0.4344f, 0.1162f, -0.5785f);
            this.cube_r15.field_78804_l.add(new ModelBox(this.cube_r15, 78, 0, -13.7772f, 12.6534f, -1.9926f, 2, 5, 1, 0.0f, true));
            this.cube_r16 = new ModelRenderer(this);
            this.cube_r16.func_78793_a(-0.9187f, 2.1665f, -0.625f);
            this.shoubi2.func_78792_a(this.cube_r16);
            setRotationAngle(this.cube_r16, -1.2212f, 0.501f, -0.2748f);
            this.cube_r16.field_78804_l.add(new ModelBox(this.cube_r16, 43, 41, -4.9039f, 13.8923f, 8.76f, 1, 6, 2, 0.0f, true));
            this.cube_r17 = new ModelRenderer(this);
            this.cube_r17.func_78793_a(1.9086f, 2.9132f, -1.4854f);
            this.shoubi2.func_78792_a(this.cube_r17);
            setRotationAngle(this.cube_r17, -0.2217f, 0.5824f, 0.4386f);
            this.cube_r17.field_78804_l.add(new ModelBox(this.cube_r17, 92, 46, 7.7145f, 19.5882f, -0.8768f, 2, 4, 1, 0.0f, true));
            this.cube_r18 = new ModelRenderer(this);
            this.cube_r18.func_78793_a(1.9086f, 2.9132f, -1.4854f);
            this.shoubi2.func_78792_a(this.cube_r18);
            setRotationAngle(this.cube_r18, -0.0875f, 0.4407f, 0.5446f);
            this.cube_r18.field_78804_l.add(new ModelBox(this.cube_r18, 98, 46, 8.3692f, 18.8077f, -1.9926f, 2, 4, 1, 0.0f, true));
            this.cube_r19 = new ModelRenderer(this);
            this.cube_r19.func_78793_a(1.9086f, 2.9132f, -1.4854f);
            this.shoubi2.func_78792_a(this.cube_r19);
            setRotationAngle(this.cube_r19, -0.6089f, 0.1162f, -0.5785f);
            this.cube_r19.field_78804_l.add(new ModelBox(this.cube_r19, 0, 102, -13.7772f, 13.2456f, -0.8768f, 2, 5, 1, 0.0f, true));
            this.cube_r20 = new ModelRenderer(this);
            this.cube_r20.func_78793_a(-0.1662f, -0.2154f, 3.2483f);
            this.shoubi2.func_78792_a(this.cube_r20);
            setRotationAngle(this.cube_r20, -0.5934f, 0.0f, -0.1745f);
            this.cube_r20.field_78804_l.add(new ModelBox(this.cube_r20, 43, 102, -10.8325f, 16.6179f, -0.9804f, 5, 6, 4, 0.0f, true));
            this.RightArm = new ModelRenderer(this);
            this.RightArm.func_78793_a(-10.1598f, -52.8876f, -4.2521f);
            setRotationAngle(this.RightArm, -0.6021f, 0.0f, 0.0f);
            this.cube_r21 = new ModelRenderer(this);
            this.cube_r21.func_78793_a(-3.2648f, -1.2882f, 17.7443f);
            this.RightArm.func_78792_a(this.cube_r21);
            setRotationAngle(this.cube_r21, 0.0f, 0.0f, 0.6283f);
            this.cube_r21.field_78804_l.add(new ModelBox(this.cube_r21, (int) EntityMoXiu01.ENTITYID, 140, 8.4882f, 11.3346f, -9.6719f, 6, 14, 6, 0.0f, false));
            this.cube_r21.field_78804_l.add(new ModelBox(this.cube_r21, 62, (int) EntityHeiZhu2.ENTITYID_RANGED, 7.4882f, 15.3346f, -10.6719f, 7, 8, 8, 0.0f, false));
            this.cube_r21.field_78804_l.add(new ModelBox(this.cube_r21, 27, (int) EntitySanXiu03.ENTITYID_RANGED, 9.4882f, 12.3346f, -8.6719f, 9, 4, 4, 0.0f, false));
            this.qiangzhi = new ModelRenderer(this);
            this.qiangzhi.func_78793_a(-6.3127f, 10.2339f, 6.32f);
            this.RightArm.func_78792_a(this.qiangzhi);
            setRotationAngle(this.qiangzhi, 0.0f, 0.0f, -0.7505f);
            this.cube_r22 = new ModelRenderer(this);
            this.cube_r22.func_78793_a(0.0f, 0.0f, -6.7757f);
            this.qiangzhi.func_78792_a(this.cube_r22);
            setRotationAngle(this.cube_r22, -0.4189f, 0.0f, 0.1745f);
            this.cube_r22.field_78804_l.add(new ModelBox(this.cube_r22, (int) EntitySanXiu0302.ENTITYID, 85, -11.977f, 3.5207f, 12.9712f, 6, 9, 6, 0.0f, false));
            this.cube_r22.field_78804_l.add(new ModelBox(this.cube_r22, (int) EntityMoXiu0302.ENTITYID, 52, -12.977f, 9.5207f, 13.9712f, 6, 9, 4, 0.0f, false));
            this.shoubi = new ModelRenderer(this);
            this.shoubi.func_78793_a(-1.0f, 9.0f, -11.0f);
            this.qiangzhi.func_78792_a(this.shoubi);
            this.cube_r23 = new ModelRenderer(this);
            this.cube_r23.func_78793_a(-2.9637f, 3.1132f, -4.4854f);
            this.shoubi.func_78792_a(this.cube_r23);
            setRotationAngle(this.cube_r23, -0.9231f, -0.1162f, 0.5785f);
            this.cube_r23.field_78804_l.add(new ModelBox(this.cube_r23, 59, 0, -2.4879f, -2.4357f, 19.4366f, 2, 6, 1, 0.0f, false));
            this.cube_r24 = new ModelRenderer(this);
            this.cube_r24.func_78793_a(-2.7859f, 5.7574f, -7.0924f);
            this.shoubi.func_78792_a(this.cube_r24);
            setRotationAngle(this.cube_r24, -0.4872f, -0.78f, -0.2631f);
            this.cube_r24.field_78804_l.add(new ModelBox(this.cube_r24, 61, 89, -2.8794f, -2.6754f, 19.3903f, 2, 4, 1, 0.0f, false));
            this.cube_r25 = new ModelRenderer(this);
            this.cube_r25.func_78793_a(1.1951f, 4.13f, -6.8387f);
            this.shoubi.func_78792_a(this.cube_r25);
            setRotationAngle(this.cube_r25, -0.5754f, -0.501f, 0.2748f);
            this.cube_r25.field_78804_l.add(new ModelBox(this.cube_r25, 82, 4, -1.6785f, 3.4141f, 19.2511f, 1, 3, 2, 0.0f, false));
            this.cube_r26 = new ModelRenderer(this);
            this.cube_r26.func_78793_a(-2.9637f, 3.1132f, -4.4854f);
            this.shoubi.func_78792_a(this.cube_r26);
            setRotationAngle(this.cube_r26, -0.4344f, -0.1162f, 0.5785f);
            this.cube_r26.field_78804_l.add(new ModelBox(this.cube_r26, 78, 0, -2.4879f, 7.8579f, 20.0381f, 2, 5, 1, 0.0f, false));
            this.cube_r27 = new ModelRenderer(this);
            this.cube_r27.func_78793_a(-0.1363f, 2.3665f, -3.625f);
            this.shoubi.func_78792_a(this.cube_r27);
            setRotationAngle(this.cube_r27, -1.2212f, -0.501f, 0.2748f);
            this.cube_r27.field_78804_l.add(new ModelBox(this.cube_r27, 43, 41, -1.6785f, -10.7212f, 17.4118f, 1, 6, 2, 0.0f, false));
            this.cube_r28 = new ModelRenderer(this);
            this.cube_r28.func_78793_a(-2.9637f, 3.1132f, -4.4854f);
            this.shoubi.func_78792_a(this.cube_r28);
            setRotationAngle(this.cube_r28, -0.2217f, -0.5824f, -0.4386f);
            this.cube_r28.field_78804_l.add(new ModelBox(this.cube_r28, 92, 46, -9.4441f, 2.9601f, 19.9865f, 2, 4, 1, 0.0f, false));
            this.cube_r29 = new ModelRenderer(this);
            this.cube_r29.func_78793_a(-2.9637f, 3.1132f, -4.4854f);
            this.shoubi.func_78792_a(this.cube_r29);
            setRotationAngle(this.cube_r29, -0.0875f, -0.4407f, -0.5446f);
            this.cube_r29.field_78804_l.add(new ModelBox(this.cube_r29, 98, 46, -12.3125f, 3.8841f, 20.0381f, 2, 4, 1, 0.0f, false));
            this.cube_r30 = new ModelRenderer(this);
            this.cube_r30.func_78793_a(-2.9637f, 3.1132f, -4.4854f);
            this.shoubi.func_78792_a(this.cube_r30);
            setRotationAngle(this.cube_r30, -0.6089f, -0.1162f, 0.5785f);
            this.cube_r30.field_78804_l.add(new ModelBox(this.cube_r30, 0, 102, -2.4879f, 4.6974f, 19.9865f, 2, 5, 1, 0.0f, false));
            this.cube_r31 = new ModelRenderer(this);
            this.cube_r31.func_78793_a(-0.8889f, -0.0154f, 0.2483f);
            this.shoubi.func_78792_a(this.cube_r31);
            setRotationAngle(this.cube_r31, -0.5934f, 0.0f, 0.1745f);
            this.cube_r31.field_78804_l.add(new ModelBox(this.cube_r31, 43, 102, -11.477f, 3.6255f, 14.6214f, 5, 6, 4, 0.0f, false));
            this.Head = new ModelRenderer(this);
            this.Head.func_78793_a(-0.0608f, -57.7006f, -3.9316f);
            setRotationAngle(this.Head, 0.3403f, 0.0f, 0.0f);
            this.Head.field_78804_l.add(new ModelBox(this.Head, 0, (int) EntityMoXiu0202.ENTITYID, -2.4721f, 7.594f, -12.1811f, 5, 13, 4, 1.5f, false));
            this.Head.field_78804_l.add(new ModelBox(this.Head, 0, 12, -2.4721f, 10.194f, -15.9811f, 5, 1, 1, 1.5f, false));
            this.Head.field_78804_l.add(new ModelBox(this.Head, 71, 47, -2.0721f, 10.994f, -17.4811f, 4, 3, 6, 1.5f, false));
            this.Head.field_78804_l.add(new ModelBox(this.Head, 0, 41, -2.4721f, 11.494f, -5.2811f, 5, 9, 3, 1.5f, false));
            this.cube_r32 = new ModelRenderer(this);
            this.cube_r32.func_78793_a(-0.4392f, -13.4725f, 10.9672f);
            this.Head.func_78792_a(this.cube_r32);
            setRotationAngle(this.cube_r32, -0.2618f, 0.0f, 0.0f);
            this.cube_r32.field_78804_l.add(new ModelBox(this.cube_r32, 238, 64, -1.5f, 21.9383f, -8.1692f, 4, 2, 5, 0.0f, false));
            this.cube_r33 = new ModelRenderer(this);
            this.cube_r33.func_78793_a(0.0608f, -15.452f, 5.3805f);
            this.Head.func_78792_a(this.cube_r33);
            setRotationAngle(this.cube_r33, 0.1396f, 0.0f, 0.0f);
            this.cube_r33.field_78804_l.add(new ModelBox(this.cube_r33, 236, 51, -2.5f, 19.7402f, -15.835f, 5, 3, 5, 0.0f, false));
            this.cube_r34 = new ModelRenderer(this);
            this.cube_r34.func_78793_a(0.0279f, -7.1589f, 3.095f);
            this.Head.func_78792_a(this.cube_r34);
            setRotationAngle(this.cube_r34, 0.9948f, 0.0f, 0.0f);
            this.cube_r34.field_78804_l.add(new ModelBox(this.cube_r34, (int) EntityMoXiu0102.ENTITYID, 77, -2.5f, 0.5689f, -20.9474f, 5, 4, 3, 1.5f, false));
            this.cube_r35 = new ModelRenderer(this);
            this.cube_r35.func_78793_a(6.3279f, -6.4589f, -2.705f);
            this.Head.func_78792_a(this.cube_r35);
            setRotationAngle(this.cube_r35, 0.5061f, 0.0f, 0.0f);
            this.cube_r35.field_78804_l.add(new ModelBox(this.cube_r35, 0, 0, -3.7f, 9.2524f, -16.9791f, 1, 8, 4, 1.5f, false));
            this.cube_r35.field_78804_l.add(new ModelBox(this.cube_r35, (int) EntityMoXiu0302.ENTITYID_RANGED, (int) EntitySanXiu01.ENTITYID_RANGED, -9.7f, 9.2524f, -16.9791f, 1, 8, 4, 1.5f, false));
            this.cube_r36 = new ModelRenderer(this);
            this.cube_r36.func_78793_a(-0.4721f, 3.1411f, 2.595f);
            this.Head.func_78792_a(this.cube_r36);
            setRotationAngle(this.cube_r36, 0.4712f, 0.0f, 0.0f);
            this.cube_r36.field_78804_l.add(new ModelBox(this.cube_r36, 52, (int) EntityYuWa2.ENTITYID_RANGED, -2.0f, 2.8671f, -20.3075f, 5, 6, 3, 1.5f, false));
            this.cube_r37 = new ModelRenderer(this);
            this.cube_r37.func_78793_a(-0.4392f, -4.7589f, -6.905f);
            this.Head.func_78792_a(this.cube_r37);
            setRotationAngle(this.cube_r37, 0.7679f, 0.0f, 0.0f);
            this.cube_r37.field_78804_l.add(new ModelBox(this.cube_r37, 59, 12, 0.0f, 3.824f, -23.6987f, 1, 1, 1, 1.0f, false));
            this.cube_r38 = new ModelRenderer(this);
            this.cube_r38.func_78793_a(7.1279f, -13.1589f, -6.105f);
            this.Head.func_78792_a(this.cube_r38);
            setRotationAngle(this.cube_r38, -0.7976f, -0.9084f, -0.2314f);
            this.cube_r38.field_78804_l.add(new ModelBox(this.cube_r38, 0, 53, -7.7049f, 11.3242f, 12.7267f, 7, 1, 1, 0.0f, false));
            this.cube_r39 = new ModelRenderer(this);
            this.cube_r39.func_78793_a(-5.0721f, -13.1589f, -6.105f);
            this.Head.func_78792_a(this.cube_r39);
            setRotationAngle(this.cube_r39, -0.7976f, 0.9084f, 0.2314f);
            this.cube_r39.field_78804_l.add(new ModelBox(this.cube_r39, 0, 55, -0.1951f, 12.9242f, 12.0267f, 7, 1, 1, 0.0f, false));
            this.cube_r40 = new ModelRenderer(this);
            this.cube_r40.func_78793_a(3.5279f, -8.1589f, -2.805f);
            this.Head.func_78792_a(this.cube_r40);
            setRotationAngle(this.cube_r40, 0.5307f, -0.5586f, -1.2726f);
            this.cube_r40.field_78804_l.add(new ModelBox(this.cube_r40, 6, 0, -22.1198f, 0.0462f, -4.7488f, 2, 1, 1, 0.0f, false));
            this.cube_r41 = new ModelRenderer(this);
            this.cube_r41.func_78793_a(-1.4721f, -8.1589f, -2.805f);
            this.Head.func_78792_a(this.cube_r41);
            setRotationAngle(this.cube_r41, 0.5307f, 0.5586f, 1.2726f);
            this.cube_r41.field_78804_l.add(new ModelBox(this.cube_r41, 6, 2, 19.5198f, 1.8462f, -6.1488f, 2, 1, 1, 0.0f, false));
            this.cube_r42 = new ModelRenderer(this);
            this.cube_r42.func_78793_a(3.5279f, -8.1589f, -2.805f);
            this.Head.func_78792_a(this.cube_r42);
            setRotationAngle(this.cube_r42, 0.0f, -0.7505f, -0.4363f);
            this.cube_r42.field_78804_l.add(new ModelBox(this.cube_r42, 43, 53, -15.4802f, 12.6865f, -4.6488f, 7, 1, 1, 0.0f, false));
            this.cube_r43 = new ModelRenderer(this);
            this.cube_r43.func_78793_a(-1.4721f, -8.1589f, -2.805f);
            this.Head.func_78792_a(this.cube_r43);
            setRotationAngle(this.cube_r43, 0.0f, 0.7505f, 0.4363f);
            this.cube_r43.field_78804_l.add(new ModelBox(this.cube_r43, 43, 55, 7.0802f, 13.6865f, -6.1488f, 7, 1, 1, 0.0f, false));
            this.cube_r43.field_78804_l.add(new ModelBox(this.cube_r43, 236, 12, 7.3802f, 14.9865f, -5.2488f, 6, 4, 4, 0.0f, false));
            this.cube_r44 = new ModelRenderer(this);
            this.cube_r44.func_78793_a(3.6892f, -11.0459f, -1.6815f);
            this.Head.func_78792_a(this.cube_r44);
            setRotationAngle(this.cube_r44, -0.5432f, -1.1807f, 0.1421f);
            this.cube_r44.field_78804_l.add(new ModelBox(this.cube_r44, 236, 25, -1.7593f, 17.4648f, -0.4401f, 6, 2, 3, 0.0f, true));
            this.cube_r45 = new ModelRenderer(this);
            this.cube_r45.func_78793_a(0.6919f, -8.8418f, -4.2257f);
            this.Head.func_78792_a(this.cube_r45);
            setRotationAngle(this.cube_r45, 0.0f, -0.925f, -0.4363f);
            this.cube_r45.field_78804_l.add(new ModelBox(this.cube_r45, 236, 25, -6.7268f, 15.9865f, -3.4546f, 6, 3, 3, 0.0f, true));
            this.cube_r46 = new ModelRenderer(this);
            this.cube_r46.func_78793_a(-3.5677f, -11.0459f, -1.6815f);
            this.Head.func_78792_a(this.cube_r46);
            setRotationAngle(this.cube_r46, -0.5432f, 1.1807f, -0.1421f);
            this.cube_r46.field_78804_l.add(new ModelBox(this.cube_r46, 236, 25, -4.2407f, 17.4648f, -0.4401f, 6, 2, 3, 0.0f, false));
            this.cube_r47 = new ModelRenderer(this);
            this.cube_r47.func_78793_a(-0.5704f, -8.8418f, -4.2257f);
            this.Head.func_78792_a(this.cube_r47);
            setRotationAngle(this.cube_r47, 0.0f, 0.925f, 0.4363f);
            this.cube_r47.field_78804_l.add(new ModelBox(this.cube_r47, 236, 25, 0.7268f, 15.9865f, -3.4546f, 6, 3, 3, 0.0f, false));
            this.cube_r48 = new ModelRenderer(this);
            this.cube_r48.func_78793_a(1.5936f, -8.1589f, -2.805f);
            this.Head.func_78792_a(this.cube_r48);
            setRotationAngle(this.cube_r48, 0.0f, -0.7505f, -0.4363f);
            this.cube_r48.field_78804_l.add(new ModelBox(this.cube_r48, 236, 12, -13.3802f, 14.9865f, -5.2488f, 6, 4, 4, 0.0f, true));
            this.cube_r49 = new ModelRenderer(this);
            this.cube_r49.func_78793_a(0.0608f, -8.1589f, -11.305f);
            this.Head.func_78792_a(this.cube_r49);
            setRotationAngle(this.cube_r49, 0.2967f, 0.0f, 0.0f);
            this.cube_r49.field_78804_l.add(new ModelBox(this.cube_r49, 34, 70, -0.5f, 16.4771f, -16.6965f, 1, 1, 3, 1.0f, false));
            this.cube_r49.field_78804_l.add(new ModelBox(this.cube_r49, 74, 23, -1.0329f, 15.5771f, -14.7965f, 2, 1, 3, 1.0f, false));
            this.Body = new ModelRenderer(this);
            this.Body.func_78793_a(-0.2543f, -34.1f, -7.1063f);
            this.Body.field_78804_l.add(new ModelBox(this.Body, 46, 56, -10.0f, 10.0f, -3.7757f, 20, 6, 14, 0.0f, false));
            this.Body.field_78804_l.add(new ModelBox(this.Body, 0, 0, -11.0f, -2.0f, -4.7757f, 22, 12, 15, 0.0f, false));
            this.Body.field_78804_l.add(new ModelBox(this.Body, 48, (int) EntitySanXiu0202.ENTITYID_RANGED, 1.0f, -1.0f, 10.2243f, 11, 15, 1, 0.0f, false));
            this.Body.field_78804_l.add(new ModelBox(this.Body, 14, 70, 1.0f, 14.0f, 10.2243f, 6, 5, 1, 0.0f, false));
            this.Body.field_78804_l.add(new ModelBox(this.Body, 0, 70, -7.0f, 14.0f, 10.2243f, 6, 5, 1, 0.0f, false));
            this.Body.field_78804_l.add(new ModelBox(this.Body, (int) EntityMoXiu0402.ENTITYID, 0, -9.0f, -1.0f, 10.2243f, 8, 15, 1, 0.0f, false));
            this.cube_r50 = new ModelRenderer(this);
            this.cube_r50.func_78793_a(2.2628f, 23.0f, 2.2243f);
            this.Body.func_78792_a(this.cube_r50);
            setRotationAngle(this.cube_r50, 0.3643f, -0.1501f, 0.3737f);
            this.cube_r50.field_78804_l.add(new ModelBox(this.cube_r50, 92, (int) EntityGuLang0501.ENTITYID_RANGED, -9.8f, 0.5f, 5.6f, 8, 16, 4, 0.0f, false));
            this.cube_r51 = new ModelRenderer(this);
            this.cube_r51.func_78793_a(-8.1789f, 33.3602f, 14.7418f);
            this.Body.func_78792_a(this.cube_r51);
            setRotationAngle(this.cube_r51, 0.5563f, -0.1501f, 0.3737f);
            this.cube_r51.field_78804_l.add(new ModelBox(this.cube_r51, 70, (int) EntitySanXiu01.ENTITYID_RANGED, -5.2f, -3.5f, -1.3f, 7, 9, 4, 0.0f, false));
            this.cube_r52 = new ModelRenderer(this);
            this.cube_r52.func_78793_a(10.4417f, 33.3602f, 14.7418f);
            this.Body.func_78792_a(this.cube_r52);
            setRotationAngle(this.cube_r52, 0.5563f, 0.1501f, -0.3737f);
            this.cube_r52.field_78804_l.add(new ModelBox(this.cube_r52, (int) EntitySanXiu0402.ENTITYID, 100, -3.5f, -4.5f, -1.3f, 7, 9, 4, 0.0f, false));
            this.cube_r53 = new ModelRenderer(this);
            this.cube_r53.func_78793_a(0.0f, 23.0f, 2.2243f);
            this.Body.func_78792_a(this.cube_r53);
            setRotationAngle(this.cube_r53, 0.3643f, 0.1501f, -0.3737f);
            this.cube_r53.field_78804_l.add(new ModelBox(this.cube_r53, 24, 150, 0.0f, -0.2f, 5.6f, 8, 15, 4, 0.0f, false));
            this.cube_r54 = new ModelRenderer(this);
            this.cube_r54.func_78793_a(0.0f, 23.0f, 2.2243f);
            this.Body.func_78792_a(this.cube_r54);
            setRotationAngle(this.cube_r54, 0.6894f, 0.0f, 0.0f);
            this.cube_r54.field_78804_l.add(new ModelBox(this.cube_r54, (int) EntityGuLang0501.ENTITYID, 140, -3.5f, 16.0f, 1.1f, 7, 16, 4, 0.0f, false));
            this.cube_r55 = new ModelRenderer(this);
            this.cube_r55.func_78793_a(0.0f, 23.0f, 2.2243f);
            this.Body.func_78792_a(this.cube_r55);
            setRotationAngle(this.cube_r55, 0.3927f, 0.0f, 0.0f);
            this.cube_r55.field_78804_l.add(new ModelBox(this.cube_r55, 0, 140, -4.0f, -4.5f, 5.6f, 8, 20, 4, 0.0f, false));
            this.cube_r55.field_78804_l.add(new ModelBox(this.cube_r55, 0, 102, -8.0f, -0.6f, -2.4f, 16, 4, 11, 0.0f, false));
            this.cube_r55.field_78804_l.add(new ModelBox(this.cube_r55, 74, 0, -9.0f, -4.5f, -4.4f, 18, 4, 14, 0.0f, false));
            this.cube_r56 = new ModelRenderer(this);
            this.cube_r56.func_78793_a(7.9798f, 28.9035f, 2.2243f);
            this.Body.func_78792_a(this.cube_r56);
            setRotationAngle(this.cube_r56, 0.7721f, -1.3302f, -1.4052f);
            this.cube_r56.field_78804_l.add(new ModelBox(this.cube_r56, (int) EntitySanXiu03.ENTITYID, (int) EntitySanXiu0502.ENTITYID, -1.3f, -7.6f, -6.4f, 9, 15, 1, 0.0f, false));
            this.cube_r57 = new ModelRenderer(this);
            this.cube_r57.func_78793_a(7.9798f, 28.9035f, 2.2243f);
            this.Body.func_78792_a(this.cube_r57);
            setRotationAngle(this.cube_r57, -1.1577f, -1.1315f, 0.5747f);
            this.cube_r57.field_78804_l.add(new ModelBox(this.cube_r57, (int) EntityYuWa2.ENTITYID, (int) EntitySanXiu0502.ENTITYID, -5.2f, -7.6f, -7.2f, 9, 15, 1, 0.0f, false));
            this.cube_r58 = new ModelRenderer(this);
            this.cube_r58.func_78793_a(7.9798f, 28.9035f, 2.2243f);
            this.Body.func_78792_a(this.cube_r58);
            setRotationAngle(this.cube_r58, -0.351f, -0.6101f, -0.0473f);
            this.cube_r58.field_78804_l.add(new ModelBox(this.cube_r58, (int) EntitySanXiu0302.ENTITYID, (int) EntitySanXiu0502.ENTITYID, -6.0f, -7.5f, -6.2f, 9, 15, 1, 0.0f, false));
            this.cube_r59 = new ModelRenderer(this);
            this.cube_r59.func_78793_a(0.1667f, 26.8052f, -4.6352f);
            this.Body.func_78792_a(this.cube_r59);
            setRotationAngle(this.cube_r59, -0.3105f, 0.0324f, 0.0082f);
            this.cube_r59.field_78804_l.add(new ModelBox(this.cube_r59, (int) EntityMoXiu0302.ENTITYID, 37, -4.5f, -7.0f, -0.9f, 9, 14, 1, 0.0f, false));
            this.cube_r60 = new ModelRenderer(this);
            this.cube_r60.func_78793_a(7.9798f, 28.9035f, 2.2243f);
            this.Body.func_78792_a(this.cube_r60);
            setRotationAngle(this.cube_r60, 1.5978f, -1.1019f, -1.0489f);
            this.cube_r60.field_78804_l.add(new ModelBox(this.cube_r60, (int) EntityMoXiu0202.ENTITYID, 22, -3.3f, 0.4f, 18.0f, 9, 14, 1, 0.0f, false));
            this.cube_r61 = new ModelRenderer(this);
            this.cube_r61.func_78793_a(7.9798f, 28.9035f, 2.2243f);
            this.Body.func_78792_a(this.cube_r61);
            setRotationAngle(this.cube_r61, -1.6288f, -1.3585f, 2.1735f);
            this.cube_r61.field_78804_l.add(new ModelBox(this.cube_r61, (int) EntityMoXiu0202.ENTITYID, 125, -4.0f, 0.4f, 18.3f, 9, 14, 1, 0.0f, false));
            this.cube_r62 = new ModelRenderer(this);
            this.cube_r62.func_78793_a(7.9798f, 28.9035f, 2.2243f);
            this.Body.func_78792_a(this.cube_r62);
            setRotationAngle(this.cube_r62, -3.0738f, -0.958f, -2.6969f);
            this.cube_r62.field_78804_l.add(new ModelBox(this.cube_r62, 18, (int) EntityMoXiu0402.ENTITYID_RANGED, 5.0f, -0.5f, 18.3f, 4, 16, 1, 0.0f, false));
            this.cube_r63 = new ModelRenderer(this);
            this.cube_r63.func_78793_a(-8.4426f, 25.789f, -4.3761f);
            this.Body.func_78792_a(this.cube_r63);
            setRotationAngle(this.cube_r63, -0.2225f, 0.3411f, 0.3608f);
            this.cube_r63.field_78804_l.add(new ModelBox(this.cube_r63, 90, (int) EntityMoXiu0302.ENTITYID_RANGED, -4.5f, -7.0f, -0.4f, 9, 14, 1, 0.0f, false));
            this.cube_r64 = new ModelRenderer(this);
            this.cube_r64.func_78793_a(0.0f, 18.5f, 1.7243f);
            this.Body.func_78792_a(this.cube_r64);
            setRotationAngle(this.cube_r64, 0.3491f, 0.0f, 0.0f);
            this.cube_r64.field_78804_l.add(new ModelBox(this.cube_r64, 68, 27, -9.0f, -5.0f, -4.4f, 18, 5, 14, 0.0f, false));
            this.cube_r65 = new ModelRenderer(this);
            this.cube_r65.func_78793_a(-11.5f, 0.0f, 1.7243f);
            this.Body.func_78792_a(this.cube_r65);
            setRotationAngle(this.cube_r65, 0.0f, 0.0f, -0.5236f);
            this.cube_r65.field_78804_l.add(new ModelBox(this.cube_r65, 26, (int) EntityYuWa2.ENTITYID_RANGED, 1.5f, -1.0f, -3.5f, 8, 3, 10, 0.0f, false));
            this.cube_r66 = new ModelRenderer(this);
            this.cube_r66.func_78793_a(11.5f, 0.0f, 1.7243f);
            this.Body.func_78792_a(this.cube_r66);
            setRotationAngle(this.cube_r66, 0.0f, 0.0f, 0.5411f);
            this.cube_r66.field_78804_l.add(new ModelBox(this.cube_r66, (int) EntityMoXiu01.ENTITYID, 91, -9.5f, -0.6f, -3.5f, 7, 3, 10, 0.0f, false));
            this.chibang = new ModelRenderer(this);
            this.chibang.func_78793_a(-0.8211f, -17.6021f, 21.9209f);
            this.Body.func_78792_a(this.chibang);
            setRotationAngle(this.chibang, 0.1155f, -0.0754f, -0.4107f);
            this.cube_r67 = new ModelRenderer(this);
            this.cube_r67.func_78793_a(-10.6468f, 67.3437f, -26.3947f);
            this.chibang.func_78792_a(this.cube_r67);
            setRotationAngle(this.cube_r67, 0.0f, -0.3316f, 0.0f);
            this.cube_r67.field_78804_l.add(new ModelBox(this.cube_r67, 84, (int) EntitySanXiu01.ENTITYID_RANGED, 3.7518f, -55.3871f, 0.7957f, 13, 2, 13, 0.0f, false));
            this.cube_r67.field_78804_l.add(new ModelBox(this.cube_r67, (int) EntityMoXiu01.ENTITYID_RANGED, 104, 3.7518f, -48.0871f, 4.7957f, 13, 12, 9, 0.0f, false));
            this.cube_r67.field_78804_l.add(new ModelBox(this.cube_r67, 0, 41, 3.7518f, -53.3871f, -1.2043f, 13, 12, 17, 0.0f, false));
            this.cube_r67.field_78804_l.add(new ModelBox(this.cube_r67, 40, (int) EntitySanXiu01.ENTITYID_RANGED, 16.7518f, -53.3871f, 0.7957f, 8, 10, 14, 0.0f, false));
            this.cube_r68 = new ModelRenderer(this);
            this.cube_r68.func_78793_a(20.1532f, 9.6437f, -6.6947f);
            this.chibang.func_78792_a(this.cube_r68);
            setRotationAngle(this.cube_r68, 0.2969f, -0.4379f, -0.625f);
            this.cube_r68.field_78804_l.add(new ModelBox(this.cube_r68, (int) EntityMoXiu04.ENTITYID, 35, -27.0042f, 3.7521f, 2.2216f, 11, 5, 5, 0.0f, false));
            this.cube_r69 = new ModelRenderer(this);
            this.cube_r69.func_78793_a(17.6675f, 5.1437f, -14.6358f);
            this.chibang.func_78792_a(this.cube_r69);
            setRotationAngle(this.cube_r69, 0.106f, -0.3148f, -0.331f);
            this.cube_r69.field_78804_l.add(new ModelBox(this.cube_r69, 43, 41, -19.8162f, 12.7223f, -1.6043f, 8, 3, 9, 0.0f, false));
            this.yi2 = new ModelRenderer(this);
            this.yi2.func_78793_a(12.0455f, 3.5761f, -10.7378f);
            this.chibang.func_78792_a(this.yi2);
            setRotationAngle(this.yi2, 0.1408f, -0.1296f, -0.2976f);
            this.yi2.field_78804_l.add(new ModelBox(this.yi2, 84, (int) EntityMoXiu02.ENTITYID, -8.744f, 8.4124f, -2.5923f, 14, 14, 5, 0.0f, false));
            this.yi2.field_78804_l.add(new ModelBox(this.yi2, (int) EntityHeiZhu2.ENTITYID, 12, -8.844f, 20.6124f, -2.5923f, 9, 5, 5, 0.0f, false));
            this.yi2.field_78804_l.add(new ModelBox(this.yi2, 0, 89, 0.656f, 11.9124f, 0.1077f, 28, 8, 5, 0.0f, false));
            this.cube_r70 = new ModelRenderer(this);
            this.cube_r70.func_78793_a(0.6016f, 72.3546f, -2.1938f);
            this.yi2.func_78792_a(this.cube_r70);
            setRotationAngle(this.cube_r70, 0.0f, 0.1396f, 0.0f);
            this.cube_r70.field_78804_l.add(new ModelBox(this.cube_r70, 66, 89, 18.3098f, -59.7423f, 4.9474f, 28, 7, 5, 0.0f, false));
            this.cube_r71 = new ModelRenderer(this);
            this.cube_r71.func_78793_a(22.9016f, 2.6546f, 3.3062f);
            this.yi2.func_78792_a(this.cube_r71);
            setRotationAngle(this.cube_r71, 0.0f, -0.6632f, 0.0f);
            this.cube_r71.field_78804_l.add(new ModelBox(this.cube_r71, (int) EntitySanXiu0502.ENTITYID_RANGED, 65, -18.447f, 9.6161f, 6.182f, 7, 7, 5, 0.0f, false));
            this.cube_r72 = new ModelRenderer(this);
            this.cube_r72.func_78793_a(58.5016f, -10.3454f, -0.3938f);
            this.yi2.func_78792_a(this.cube_r72);
            setRotationAngle(this.cube_r72, 0.0f, 0.0f, -0.1222f);
            this.cube_r72.field_78804_l.add(new ModelBox(this.cube_r72, (int) EntitySanXiu04.ENTITYID, 23, -26.7401f, 7.6791f, -3.1985f, 18, 7, 5, 0.0f, false));
            this.cube_r73 = new ModelRenderer(this);
            this.cube_r73.func_78793_a(0.6016f, 72.3546f, -2.1938f);
            this.yi2.func_78792_a(this.cube_r73);
            setRotationAngle(this.cube_r73, 0.0f, 0.0873f, 0.0f);
            this.cube_r73.field_78804_l.add(new ModelBox(this.cube_r73, 74, 18, 6.7772f, -74.7423f, 2.1883f, 29, 1, 4, 0.0f, false));
            this.cube_r74 = new ModelRenderer(this);
            this.cube_r74.func_78793_a(39.5016f, -10.1454f, 0.6062f);
            this.yi2.func_78792_a(this.cube_r74);
            setRotationAngle(this.cube_r74, 0.0f, 0.1047f, 0.0f);
            this.cube_r74.field_78804_l.add(new ModelBox(this.cube_r74, 0, 27, -34.0835f, 8.7577f, -4.8928f, 36, 9, 5, 0.0f, false));
            this.cube_r75 = new ModelRenderer(this);
            this.cube_r75.func_78793_a(14.5016f, -7.3454f, 0.6062f);
            this.yi2.func_78792_a(this.cube_r75);
            setRotationAngle(this.cube_r75, 0.0f, 0.0f, -0.5585f);
            this.cube_r75.field_78804_l.add(new ModelBox(this.cube_r75, 124, 0, -27.6054f, 3.0508f, -3.3526f, 18, 8, 4, 0.0f, false));
            this.bone5 = new ModelRenderer(this);
            this.bone5.func_78793_a(33.6016f, 13.1546f, 7.4819f);
            this.yi2.func_78792_a(this.bone5);
            setRotationAngle(this.bone5, 0.0f, 0.0f, 0.2443f);
            this.bone5.field_78804_l.add(new ModelBox(this.bone5, 66, 76, -35.5556f, 12.6941f, -9.4742f, 28, 8, 5, 0.0f, false));
            this.cube_r76 = new ModelRenderer(this);
            this.cube_r76.func_78793_a(-39.3f, 53.5f, -11.7757f);
            this.bone5.func_78792_a(this.cube_r76);
            setRotationAngle(this.cube_r76, 0.0f, 0.1396f, 0.0f);
            this.cube_r76.field_78804_l.add(new ModelBox(this.cube_r76, 61, 101, 21.9638f, -40.1059f, 5.8609f, 28, 7, 5, 0.0f, false));
            this.bone6 = new ModelRenderer(this);
            this.bone6.func_78793_a(0.0f, 0.0f, 0.0f);
            this.bone5.func_78792_a(this.bone6);
            setRotationAngle(this.bone6, 0.0f, 0.0f, 0.2443f);
            this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 76, -40.3198f, 26.1327f, -9.4742f, 28, 8, 5, 0.0f, false));
            this.cube_r77 = new ModelRenderer(this);
            this.cube_r77.func_78793_a(-48.5f, 64.4f, -11.7757f);
            this.bone6.func_78792_a(this.cube_r77);
            setRotationAngle(this.cube_r77, 0.0f, 0.1396f, 0.0f);
            this.cube_r77.field_78804_l.add(new ModelBox(this.cube_r77, 100, 58, 26.3564f, -37.5673f, 6.4782f, 28, 7, 5, 0.0f, false));
            this.bone7 = new ModelRenderer(this);
            this.bone7.func_78793_a(0.0f, 0.0f, 0.0f);
            this.bone6.func_78792_a(this.bone7);
            setRotationAngle(this.bone7, 0.0f, 0.0f, 0.2443f);
            this.bone7.field_78804_l.add(new ModelBox(this.bone7, (int) EntityMoXiu01.ENTITYID, (int) EntityMoXiu02.ENTITYID, -30.6016f, 36.5228f, -10.4742f, 16, 7, 5, 0.0f, false));
            this.cube_r78 = new ModelRenderer(this);
            this.cube_r78.func_78793_a(-55.7f, 73.4f, -11.7757f);
            this.bone7.func_78792_a(this.cube_r78);
            setRotationAngle(this.cube_r78, 0.0f, 0.1396f, 0.0f);
            this.cube_r78.field_78804_l.add(new ModelBox(this.cube_r78, 100, 46, 31.2268f, -36.1772f, 7.1627f, 28, 7, 5, 0.0f, false));
            this.chibang2 = new ModelRenderer(this);
            this.chibang2.func_78793_a(1.3297f, -17.6021f, 21.9209f);
            this.Body.func_78792_a(this.chibang2);
            setRotationAngle(this.chibang2, 0.1155f, 0.0754f, 0.4107f);
            this.cube_r79 = new ModelRenderer(this);
            this.cube_r79.func_78793_a(10.6468f, 67.3437f, -26.3947f);
            this.chibang2.func_78792_a(this.cube_r79);
            setRotationAngle(this.cube_r79, 0.0f, 0.3316f, 0.0f);
            this.cube_r79.field_78804_l.add(new ModelBox(this.cube_r79, 84, (int) EntitySanXiu01.ENTITYID_RANGED, -16.7518f, -55.3871f, 0.7957f, 13, 2, 13, 0.0f, true));
            this.cube_r79.field_78804_l.add(new ModelBox(this.cube_r79, (int) EntityMoXiu01.ENTITYID_RANGED, 104, -16.7518f, -48.0871f, 4.7957f, 13, 12, 9, 0.0f, true));
            this.cube_r79.field_78804_l.add(new ModelBox(this.cube_r79, 0, 41, -16.7518f, -53.3871f, -1.2043f, 13, 12, 17, 0.0f, true));
            this.cube_r79.field_78804_l.add(new ModelBox(this.cube_r79, 40, (int) EntitySanXiu01.ENTITYID_RANGED, -24.7518f, -53.3871f, 0.7957f, 8, 10, 14, 0.0f, true));
            this.cube_r80 = new ModelRenderer(this);
            this.cube_r80.func_78793_a(-20.1532f, 9.6437f, -6.6947f);
            this.chibang2.func_78792_a(this.cube_r80);
            setRotationAngle(this.cube_r80, 0.2969f, 0.4379f, 0.625f);
            this.cube_r80.field_78804_l.add(new ModelBox(this.cube_r80, (int) EntityMoXiu04.ENTITYID, 35, 16.0042f, 3.7521f, 2.2216f, 11, 5, 5, 0.0f, true));
            this.cube_r81 = new ModelRenderer(this);
            this.cube_r81.func_78793_a(-17.6675f, 5.1437f, -14.6358f);
            this.chibang2.func_78792_a(this.cube_r81);
            setRotationAngle(this.cube_r81, 0.106f, 0.3148f, 0.331f);
            this.cube_r81.field_78804_l.add(new ModelBox(this.cube_r81, 43, 41, 11.8162f, 12.7223f, -1.6043f, 8, 3, 9, 0.0f, true));
            this.yi3 = new ModelRenderer(this);
            this.yi3.func_78793_a(-12.0455f, 3.5761f, -10.7378f);
            this.chibang2.func_78792_a(this.yi3);
            setRotationAngle(this.yi3, 0.1408f, 0.1296f, 0.2976f);
            this.yi3.field_78804_l.add(new ModelBox(this.yi3, 84, (int) EntityMoXiu02.ENTITYID, -5.256f, 8.4124f, -2.5923f, 14, 14, 5, 0.0f, true));
            this.yi3.field_78804_l.add(new ModelBox(this.yi3, (int) EntityHeiZhu2.ENTITYID, 12, -0.156f, 20.6124f, -2.5923f, 9, 5, 5, 0.0f, true));
            this.yi3.field_78804_l.add(new ModelBox(this.yi3, 0, 89, -28.656f, 11.9124f, 0.1077f, 28, 8, 5, 0.0f, true));
            this.cube_r82 = new ModelRenderer(this);
            this.cube_r82.func_78793_a(-0.6016f, 72.3546f, -2.1938f);
            this.yi3.func_78792_a(this.cube_r82);
            setRotationAngle(this.cube_r82, 0.0f, -0.1396f, 0.0f);
            this.cube_r82.field_78804_l.add(new ModelBox(this.cube_r82, 66, 89, -46.3098f, -59.7423f, 4.9474f, 28, 7, 5, 0.0f, true));
            this.cube_r83 = new ModelRenderer(this);
            this.cube_r83.func_78793_a(-22.9016f, 2.6546f, 3.3062f);
            this.yi3.func_78792_a(this.cube_r83);
            setRotationAngle(this.cube_r83, 0.0f, 0.6632f, 0.0f);
            this.cube_r83.field_78804_l.add(new ModelBox(this.cube_r83, (int) EntitySanXiu0502.ENTITYID_RANGED, 65, 11.447f, 9.6161f, 6.182f, 7, 7, 5, 0.0f, true));
            this.cube_r84 = new ModelRenderer(this);
            this.cube_r84.func_78793_a(-58.5016f, -10.3454f, -0.3938f);
            this.yi3.func_78792_a(this.cube_r84);
            setRotationAngle(this.cube_r84, 0.0f, 0.0f, 0.1222f);
            this.cube_r84.field_78804_l.add(new ModelBox(this.cube_r84, (int) EntitySanXiu04.ENTITYID, 23, 8.7401f, 7.6791f, -3.1985f, 18, 7, 5, 0.0f, true));
            this.cube_r85 = new ModelRenderer(this);
            this.cube_r85.func_78793_a(-0.6016f, 72.3546f, -2.1938f);
            this.yi3.func_78792_a(this.cube_r85);
            setRotationAngle(this.cube_r85, 0.0f, -0.0873f, 0.0f);
            this.cube_r85.field_78804_l.add(new ModelBox(this.cube_r85, 74, 18, -35.7772f, -74.7423f, 2.1883f, 29, 1, 4, 0.0f, true));
            this.cube_r86 = new ModelRenderer(this);
            this.cube_r86.func_78793_a(-39.5016f, -10.1454f, 0.6062f);
            this.yi3.func_78792_a(this.cube_r86);
            setRotationAngle(this.cube_r86, 0.0f, -0.1047f, 0.0f);
            this.cube_r86.field_78804_l.add(new ModelBox(this.cube_r86, 0, 27, -1.9165f, 8.7577f, -4.8928f, 36, 9, 5, 0.0f, true));
            this.cube_r87 = new ModelRenderer(this);
            this.cube_r87.func_78793_a(-14.5016f, -7.3454f, 0.6062f);
            this.yi3.func_78792_a(this.cube_r87);
            setRotationAngle(this.cube_r87, 0.0f, 0.0f, 0.5585f);
            this.cube_r87.field_78804_l.add(new ModelBox(this.cube_r87, 124, 0, 9.6054f, 3.0508f, -3.3526f, 18, 8, 4, 0.0f, true));
            this.bone2 = new ModelRenderer(this);
            this.bone2.func_78793_a(-33.6016f, 13.1546f, 7.4819f);
            this.yi3.func_78792_a(this.bone2);
            setRotationAngle(this.bone2, 0.0f, 0.0f, -0.2443f);
            this.bone2.field_78804_l.add(new ModelBox(this.bone2, 66, 76, 7.5556f, 12.6941f, -9.4742f, 28, 8, 5, 0.0f, true));
            this.cube_r88 = new ModelRenderer(this);
            this.cube_r88.func_78793_a(39.3f, 53.5f, -11.7757f);
            this.bone2.func_78792_a(this.cube_r88);
            setRotationAngle(this.cube_r88, 0.0f, -0.1396f, 0.0f);
            this.cube_r88.field_78804_l.add(new ModelBox(this.cube_r88, 61, 101, -49.9638f, -40.1059f, 5.8609f, 28, 7, 5, 0.0f, true));
            this.bone3 = new ModelRenderer(this);
            this.bone3.func_78793_a(0.0f, 0.0f, 0.0f);
            this.bone2.func_78792_a(this.bone3);
            setRotationAngle(this.bone3, 0.0f, 0.0f, -0.2443f);
            this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, 76, 12.3198f, 26.1327f, -9.4742f, 28, 8, 5, 0.0f, true));
            this.cube_r89 = new ModelRenderer(this);
            this.cube_r89.func_78793_a(48.5f, 64.4f, -11.7757f);
            this.bone3.func_78792_a(this.cube_r89);
            setRotationAngle(this.cube_r89, 0.0f, -0.1396f, 0.0f);
            this.cube_r89.field_78804_l.add(new ModelBox(this.cube_r89, 100, 58, -54.3564f, -37.5673f, 6.4782f, 28, 7, 5, 0.0f, true));
            this.bone4 = new ModelRenderer(this);
            this.bone4.func_78793_a(0.0f, 0.0f, 0.0f);
            this.bone3.func_78792_a(this.bone4);
            setRotationAngle(this.bone4, 0.0f, 0.0f, -0.2443f);
            this.bone4.field_78804_l.add(new ModelBox(this.bone4, (int) EntityMoXiu01.ENTITYID, (int) EntityMoXiu02.ENTITYID, 14.6016f, 36.5228f, -10.4742f, 16, 7, 5, 0.0f, true));
            this.cube_r90 = new ModelRenderer(this);
            this.cube_r90.func_78793_a(55.7f, 73.4f, -11.7757f);
            this.bone4.func_78792_a(this.cube_r90);
            setRotationAngle(this.cube_r90, 0.0f, -0.1396f, 0.0f);
            this.cube_r90.field_78804_l.add(new ModelBox(this.cube_r90, 100, 46, -59.2268f, -36.1772f, 7.1627f, 28, 7, 5, 0.0f, true));
            this.LeftLeg = new ModelRenderer(this);
            this.LeftLeg.func_78793_a(3.0814f, -30.1f, -2.6063f);
            setRotationAngle(this.LeftLeg, -0.6528f, -0.3693f, -0.225f);
            this.cube_r91 = new ModelRenderer(this);
            this.cube_r91.func_78793_a(3.0806f, 14.6206f, 2.3479f);
            this.LeftLeg.func_78792_a(this.cube_r91);
            setRotationAngle(this.cube_r91, -0.2182f, 0.0f, -0.0698f);
            this.cube_r91.field_78804_l.add(new ModelBox(this.cube_r91, (int) EntityMoXiu04.ENTITYID, 70, -8.6625f, 3.5077f, 10.8801f, 7, 13, 8, 0.0f, true));
            this.cube_r92 = new ModelRenderer(this);
            this.cube_r92.func_78793_a(2.7284f, 2.4155f, 2.2479f);
            this.LeftLeg.func_78792_a(this.cube_r92);
            setRotationAngle(this.cube_r92, 0.0f, 0.0f, -0.2443f);
            this.cube_r92.field_78804_l.add(new ModelBox(this.cube_r92, 0, (int) EntitySanXiu03.ENTITYID_RANGED, -13.5471f, 7.172f, 8.6212f, 9, 12, 9, 0.0f, true));
            this.xiaotui2 = new ModelRenderer(this);
            this.xiaotui2.func_78793_a(4.18f, 17.0119f, 0.7236f);
            this.LeftLeg.func_78792_a(this.xiaotui2);
            setRotationAngle(this.xiaotui2, 1.2566f, 0.0f, 0.0f);
            this.cube_r93 = new ModelRenderer(this);
            this.cube_r93.func_78793_a(0.2713f, 10.0434f, 1.4243f);
            this.xiaotui2.func_78792_a(this.cube_r93);
            setRotationAngle(this.cube_r93, 0.1745f, 0.0f, -0.0698f);
            this.cube_r93.field_78804_l.add(new ModelBox(this.cube_r93, 72, (int) EntitySanXiu0202.ENTITYID_RANGED, -7.3336f, 5.6863f, -14.9846f, 4, 15, 5, 0.0f, true));
            this.jiao2 = new ModelRenderer(this);
            this.jiao2.func_78793_a(0.2713f, 10.0434f, 8.2f);
            this.xiaotui2.func_78792_a(this.jiao2);
            this.jiao2.field_78804_l.add(new ModelBox(this.jiao2, 59, 0, -6.2004f, 22.5193f, -22.4204f, 5, 3, 9, 0.0f, true));
            this.cube_r94 = new ModelRenderer(this);
            this.cube_r94.func_78793_a(8.5601f, 8.5566f, -13.7757f);
            this.jiao2.func_78792_a(this.cube_r94);
            setRotationAngle(this.cube_r94, 0.456f, 0.0415f, -0.0171f);
            this.cube_r94.field_78804_l.add(new ModelBox(this.cube_r94, (int) EntityMoXiu0502.ENTITYID, (int) EntityGuLang0401.ENTITYID, -12.6419f, 7.5943f, -21.6446f, 1, 2, 6, 0.0f, true));
            this.cube_r95 = new ModelRenderer(this);
            this.cube_r95.func_78793_a(8.5601f, 8.5566f, -13.7757f);
            this.jiao2.func_78792_a(this.cube_r95);
            setRotationAngle(this.cube_r95, 0.4538f, -0.1222f, 0.0f);
            this.cube_r95.field_78804_l.add(new ModelBox(this.cube_r95, 127, 70, -11.6171f, 8.8283f, -18.7734f, 1, 2, 5, 0.0f, true));
            this.cube_r96 = new ModelRenderer(this);
            this.cube_r96.func_78793_a(-1.8956f, 8.7824f, -16.5418f);
            this.jiao2.func_78792_a(this.cube_r96);
            setRotationAngle(this.cube_r96, 0.4344f, 0.3005f, -0.0513f);
            this.cube_r96.field_78804_l.add(new ModelBox(this.cube_r96, 85, 46, -2.8148f, 9.6296f, -17.2329f, 1, 2, 5, 0.0f, true));
            this.cube_r97 = new ModelRenderer(this);
            this.cube_r97.func_78793_a(8.5601f, 8.5566f, -17.5757f);
            this.jiao2.func_78792_a(this.cube_r97);
            setRotationAngle(this.cube_r97, -0.456f, -0.0415f, -0.0171f);
            this.cube_r97.field_78804_l.add(new ModelBox(this.cube_r97, 28, (int) EntityMoXiu0402.ENTITYID_RANGED, -12.8514f, 10.5693f, 9.7619f, 1, 2, 6, 0.0f, true));
            this.cube_r98 = new ModelRenderer(this);
            this.cube_r98.func_78793_a(8.5601f, 8.5566f, -13.7757f);
            this.jiao2.func_78792_a(this.cube_r98);
            setRotationAngle(this.cube_r98, -0.1222f, -0.1222f, 0.0f);
            this.cube_r98.field_78804_l.add(new ModelBox(this.cube_r98, (int) EntityMoXiu0502.ENTITYID, 140, -11.6171f, 15.1531f, -6.5294f, 1, 2, 6, 0.0f, true));
            this.cube_r99 = new ModelRenderer(this);
            this.cube_r99.func_78793_a(8.5601f, 8.5566f, -13.7757f);
            this.jiao2.func_78792_a(this.cube_r99);
            setRotationAngle(this.cube_r99, -0.261f, 0.0511f, -0.0212f);
            this.cube_r99.field_78804_l.add(new ModelBox(this.cube_r99, 28, 70, -12.6157f, 16.0704f, -6.971f, 1, 2, 4, 0.0f, true));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.RightLeg.func_78785_a(f5);
            this.LeftArm.func_78785_a(f5);
            this.RightArm.func_78785_a(f5);
            this.Head.func_78785_a(f5);
            this.Body.func_78785_a(f5);
            this.LeftLeg.func_78785_a(f5);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.field_78795_f = x;
            modelRenderer.field_78796_g = y;
            modelRenderer.field_78808_h = z;
        }

        public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
            super.func_78087_a(f, f1, f2, f3, f4, f5, e);
            this.Head.field_78796_g = f3 / 57.295776f;
            this.Head.field_78795_f = f4 / 57.295776f;
        }
    }
}
