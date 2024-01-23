package net.mcreator.yvanchuyaoshou.entity;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureHeiZhuDie;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureHeiZhuUpdate;
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
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityHeiZhu2.class */
public class EntityHeiZhu2 extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 138;
    public static final int ENTITYID_RANGED = 139;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityHeiZhu2(ElementsYvanchuyaoshouMod instance) {
        super(instance, 38);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "hei_zhu_2"), (int) ENTITYID).name("hei_zhu_2").tracker(64, 3, true).egg(-6750055, -16777216).build();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modelhei_zhu_d(), 0.5f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityHeiZhu2.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/hei_zhu_d.png");
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityHeiZhu2$EntityCustom.class */
    public static class EntityCustom extends EntityMob {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(0.6f, 2.0f);
            this.field_70728_aV = 40;
            this.field_70178_ae = false;
            func_94061_f(false);
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70715_bh.func_75776_a(1, new EntityAINearestAttackableTarget(this, EntityLiving.class, true, true));
            this.field_70715_bh.func_75776_a(2, new EntityAIHurtByTarget(this, true, new Class[0]));
            this.field_70714_bg.func_75776_a(3, new EntityAIAttackMelee(this, 1.2d, true));
            this.field_70714_bg.func_75776_a(4, new EntityAILeapAtTarget(this, 1.0f));
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
            EntityHeiZhu2.$_dependencies.put("entity", this);
            ProcedureShouJiNbt.executeProcedure(EntityHeiZhu2.$_dependencies);
            return super.func_70097_a(source, amount);
        }

        public void func_70645_a(DamageSource source) {
            super.func_70645_a(source);
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            EntityHeiZhu2.$_dependencies.put("entity", this);
            EntityHeiZhu2.$_dependencies.put("x", Integer.valueOf(x));
            EntityHeiZhu2.$_dependencies.put("y", Integer.valueOf(y));
            EntityHeiZhu2.$_dependencies.put("z", Integer.valueOf(z));
            EntityHeiZhu2.$_dependencies.put("world", this.field_70170_p);
            ProcedureHeiZhuDie.executeProcedure(EntityHeiZhu2.$_dependencies);
        }

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityHeiZhu2.$_dependencies.put("entity", this);
            EntityHeiZhu2.$_dependencies.put("world", this.field_70170_p);
            ProcedureHeiZhuUpdate.executeProcedure(EntityHeiZhu2.$_dependencies);
        }

        protected void func_110147_ax() {
            super.func_110147_ax();
            if (func_110148_a(SharedMonsterAttributes.field_188791_g) != null) {
                func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(8.0d);
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
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityHeiZhu2$Modelhei_zhu_d.class */
    public static class Modelhei_zhu_d extends ModelBase {
        private final ModelRenderer Head;
        private final ModelRenderer Body;
        private final ModelRenderer RightArm;
        private final ModelRenderer LeftArm;
        private final ModelRenderer RightLeg;
        private final ModelRenderer LeftLeg;
        private final ModelRenderer zhizhutui;
        private final ModelRenderer bone2;
        private final ModelRenderer Body_r1;
        private final ModelRenderer Body_r2;
        private final ModelRenderer Body_r3;
        private final ModelRenderer bone3;
        private final ModelRenderer Body_r4;
        private final ModelRenderer Body_r5;
        private final ModelRenderer Body_r6;
        private final ModelRenderer bone6;
        private final ModelRenderer Body_r7;
        private final ModelRenderer Body_r8;
        private final ModelRenderer Body_r9;
        private final ModelRenderer bone4;
        private final ModelRenderer Body_r10;
        private final ModelRenderer Body_r11;
        private final ModelRenderer Body_r12;
        private final ModelRenderer xiong;

        public Modelhei_zhu_d() {
            this.field_78090_t = 64;
            this.field_78089_u = 64;
            this.Head = new ModelRenderer(this);
            this.Head.func_78793_a(0.0f, 0.0f, 0.0f);
            this.Head.field_78804_l.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -5.0f, 8, 8, 8, 0.0f, false));
            this.Head.field_78804_l.add(new ModelBox(this.Head, 5, 48, -4.0f, -8.0f, -4.7f, 8, 8, 8, 0.5f, false));
            this.Body = new ModelRenderer(this);
            this.Body.func_78793_a(0.0f, 0.0f, 0.0f);
            this.Body.field_78804_l.add(new ModelBox(this.Body, 0, 16, -4.0f, 0.0f, -3.0f, 8, 12, 4, 0.0f, false));
            this.Body.field_78804_l.add(new ModelBox(this.Body, 0, 16, -4.0f, 0.0f, -3.0f, 8, 12, 4, 0.0f, false));
            this.RightArm = new ModelRenderer(this);
            this.RightArm.func_78793_a(-5.0f, 2.0f, 0.0f);
            this.RightArm.field_78804_l.add(new ModelBox(this.RightArm, 16, 32, -2.0f, -2.0f, -3.0f, 3, 12, 4, 0.0f, false));
            this.RightArm.field_78804_l.add(new ModelBox(this.RightArm, 50, 33, -2.0f, -2.0f, -3.0f, 3, 12, 4, 0.25f, false));
            this.LeftArm = new ModelRenderer(this);
            this.LeftArm.func_78793_a(5.0f, 2.0f, 0.0f);
            this.LeftArm.field_78804_l.add(new ModelBox(this.LeftArm, 32, 0, -1.0f, -2.0f, -3.0f, 3, 12, 4, 0.0f, false));
            this.LeftArm.field_78804_l.add(new ModelBox(this.LeftArm, 50, 33, -1.0f, -2.0f, -3.0f, 3, 12, 4, 0.25f, false));
            this.RightLeg = new ModelRenderer(this);
            this.RightLeg.func_78793_a(-1.9f, 12.0f, 0.0f);
            this.RightLeg.field_78804_l.add(new ModelBox(this.RightLeg, 0, 32, -2.0f, 0.0f, -3.0f, 4, 12, 4, 0.0f, false));
            this.RightLeg.field_78804_l.add(new ModelBox(this.RightLeg, 48, 0, -2.0f, 0.0f, -3.0f, 4, 12, 4, 0.25f, false));
            this.LeftLeg = new ModelRenderer(this);
            this.LeftLeg.func_78793_a(1.9f, 12.0f, 0.0f);
            this.LeftLeg.field_78804_l.add(new ModelBox(this.LeftLeg, 24, 16, -2.0f, 0.0f, -3.0f, 4, 12, 4, 0.0f, false));
            this.LeftLeg.field_78804_l.add(new ModelBox(this.LeftLeg, 48, 0, -2.0f, 0.0f, -3.0f, 4, 12, 4, 0.25f, false));
            this.zhizhutui = new ModelRenderer(this);
            this.zhizhutui.func_78793_a(-6.4703f, 10.683f, 2.2553f);
            this.bone2 = new ModelRenderer(this);
            this.bone2.func_78793_a(0.0f, 0.0f, 0.0f);
            this.zhizhutui.func_78792_a(this.bone2);
            setRotationAngle(this.bone2, 0.0f, 0.0f, -1.5708f);
            this.bone2.field_78804_l.add(new ModelBox(this.bone2, 20, 16, 3.1703f, 2.417f, -1.5553f, 2, 2, 1, 0.0f, false));
            this.Body_r1 = new ModelRenderer(this);
            this.Body_r1.func_78793_a(-7.7382f, -2.4612f, 16.0061f);
            this.bone2.func_78792_a(this.Body_r1);
            setRotationAngle(this.Body_r1, 1.0231f, -0.6552f, 0.1247f);
            this.Body_r1.field_78804_l.add(new ModelBox(this.Body_r1, 40, 26, -14.3213f, -10.9999f, -5.968f, 6, 1, 1, 0.3f, false));
            this.Body_r2 = new ModelRenderer(this);
            this.Body_r2.func_78793_a(-6.0494f, -0.2682f, 14.0463f);
            this.bone2.func_78792_a(this.Body_r2);
            setRotationAngle(this.Body_r2, 0.7999f, -0.2503f, 0.5461f);
            this.Body_r2.field_78804_l.add(new ModelBox(this.Body_r2, 27, 6, -5.4718f, -10.134f, -7.1087f, 1, 1, 1, 0.4f, false));
            this.Body_r2.field_78804_l.add(new ModelBox(this.Body_r2, 30, 38, -5.4718f, -10.034f, -7.2087f, 7, 1, 1, 0.3f, false));
            this.Body_r3 = new ModelRenderer(this);
            this.Body_r3.func_78793_a(1.9752f, 2.7294f, 12.8055f);
            this.bone2.func_78792_a(this.Body_r3);
            setRotationAngle(this.Body_r3, 0.9399f, 0.62f, 0.5241f);
            this.Body_r3.field_78804_l.add(new ModelBox(this.Body_r3, 27, 4, 1.753f, -8.7438f, -6.0413f, 1, 1, 1, 0.4f, false));
            this.Body_r3.field_78804_l.add(new ModelBox(this.Body_r3, 36, 16, 1.753f, -8.7438f, -6.0413f, 8, 1, 1, 0.3f, false));
            this.bone3 = new ModelRenderer(this);
            this.bone3.func_78793_a(12.9406f, 0.0f, 0.0f);
            this.zhizhutui.func_78792_a(this.bone3);
            setRotationAngle(this.bone3, 0.0f, 0.0f, 1.5708f);
            this.bone3.field_78804_l.add(new ModelBox(this.bone3, 20, 16, -5.1703f, 2.417f, -1.5553f, 2, 2, 1, 0.0f, true));
            this.Body_r4 = new ModelRenderer(this);
            this.Body_r4.func_78793_a(7.7382f, -2.4612f, 16.0061f);
            this.bone3.func_78792_a(this.Body_r4);
            setRotationAngle(this.Body_r4, 1.0231f, 0.6552f, -0.1247f);
            this.Body_r4.field_78804_l.add(new ModelBox(this.Body_r4, 40, 26, 8.3213f, -10.9999f, -5.968f, 6, 1, 1, 0.3f, true));
            this.Body_r5 = new ModelRenderer(this);
            this.Body_r5.func_78793_a(6.0494f, -0.2682f, 14.0463f);
            this.bone3.func_78792_a(this.Body_r5);
            setRotationAngle(this.Body_r5, 0.7999f, 0.2503f, -0.5461f);
            this.Body_r5.field_78804_l.add(new ModelBox(this.Body_r5, 27, 6, 4.4718f, -10.134f, -7.1087f, 1, 1, 1, 0.4f, true));
            this.Body_r5.field_78804_l.add(new ModelBox(this.Body_r5, 30, 38, -1.5282f, -10.034f, -7.2087f, 7, 1, 1, 0.3f, true));
            this.Body_r6 = new ModelRenderer(this);
            this.Body_r6.func_78793_a(-1.9752f, 2.7294f, 12.8055f);
            this.bone3.func_78792_a(this.Body_r6);
            setRotationAngle(this.Body_r6, 0.9399f, -0.62f, -0.5241f);
            this.Body_r6.field_78804_l.add(new ModelBox(this.Body_r6, 27, 4, -2.753f, -8.7438f, -6.0413f, 1, 1, 1, 0.4f, true));
            this.Body_r6.field_78804_l.add(new ModelBox(this.Body_r6, 36, 16, -9.753f, -8.7438f, -6.0413f, 8, 1, 1, 0.3f, true));
            this.bone6 = new ModelRenderer(this);
            this.bone6.func_78793_a(-1.9936f, -11.1608f, 0.4112f);
            this.zhizhutui.func_78792_a(this.bone6);
            this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 0, 4.4639f, 3.4778f, -1.9665f, 2, 2, 1, 0.0f, false));
            this.Body_r7 = new ModelRenderer(this);
            this.Body_r7.func_78793_a(0.0f, 0.0f, -1.0f);
            this.bone6.func_78792_a(this.Body_r7);
            setRotationAngle(this.Body_r7, 2.6464f, -0.7293f, -1.7798f);
            this.Body_r7.field_78804_l.add(new ModelBox(this.Body_r7, 40, 20, -4.9f, 0.8f, 2.8f, 6, 1, 1, 0.3f, false));
            this.Body_r8 = new ModelRenderer(this);
            this.Body_r8.func_78793_a(0.0f, 0.0f, -1.0f);
            this.bone6.func_78792_a(this.Body_r8);
            setRotationAngle(this.Body_r8, 0.0f, -0.7505f, 0.6807f);
            this.Body_r8.field_78804_l.add(new ModelBox(this.Body_r8, 0, 6, -3.9f, 0.0f, 1.3f, 1, 1, 1, 0.4f, false));
            this.Body_r8.field_78804_l.add(new ModelBox(this.Body_r8, 40, 22, -3.9f, 0.0f, 1.3f, 6, 1, 1, 0.3f, false));
            this.Body_r9 = new ModelRenderer(this);
            this.Body_r9.func_78793_a(3.4639f, 4.4778f, -0.4665f);
            this.bone6.func_78792_a(this.Body_r9);
            setRotationAngle(this.Body_r9, 0.0f, 0.4014f, 0.6807f);
            this.Body_r9.field_78804_l.add(new ModelBox(this.Body_r9, 4, 6, -6.3f, -1.3f, -0.7f, 1, 1, 1, 0.4f, false));
            this.Body_r9.field_78804_l.add(new ModelBox(this.Body_r9, 26, 32, -6.1f, -1.3f, -0.7f, 8, 1, 1, 0.3f, false));
            this.bone4 = new ModelRenderer(this);
            this.bone4.func_78793_a(14.9342f, -11.1608f, 0.4112f);
            this.zhizhutui.func_78792_a(this.bone4);
            this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 0, -6.4639f, 3.4778f, -1.9665f, 2, 2, 1, 0.0f, true));
            this.Body_r10 = new ModelRenderer(this);
            this.Body_r10.func_78793_a(0.0f, 0.0f, -1.0f);
            this.bone4.func_78792_a(this.Body_r10);
            setRotationAngle(this.Body_r10, 2.6464f, 0.7293f, 1.7798f);
            this.Body_r10.field_78804_l.add(new ModelBox(this.Body_r10, 40, 20, -1.1f, 0.8f, 2.8f, 6, 1, 1, 0.3f, true));
            this.Body_r11 = new ModelRenderer(this);
            this.Body_r11.func_78793_a(0.0f, 0.0f, -1.0f);
            this.bone4.func_78792_a(this.Body_r11);
            setRotationAngle(this.Body_r11, 0.0f, 0.7505f, -0.6807f);
            this.Body_r11.field_78804_l.add(new ModelBox(this.Body_r11, 0, 6, 2.9f, 0.0f, 1.3f, 1, 1, 1, 0.4f, true));
            this.Body_r11.field_78804_l.add(new ModelBox(this.Body_r11, 40, 22, -2.1f, 0.0f, 1.3f, 6, 1, 1, 0.3f, true));
            this.Body_r12 = new ModelRenderer(this);
            this.Body_r12.func_78793_a(-3.4639f, 4.4778f, -0.4665f);
            this.bone4.func_78792_a(this.Body_r12);
            setRotationAngle(this.Body_r12, 0.0f, -0.4014f, -0.6807f);
            this.Body_r12.field_78804_l.add(new ModelBox(this.Body_r12, 4, 6, 5.3f, -1.3f, -0.7f, 1, 1, 1, 0.4f, true));
            this.Body_r12.field_78804_l.add(new ModelBox(this.Body_r12, 26, 32, -1.9f, -1.3f, -0.7f, 8, 1, 1, 0.3f, true));
            this.xiong = new ModelRenderer(this);
            this.xiong.func_78793_a(0.0f, 24.0f, 0.0f);
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.Head.func_78785_a(f5);
            this.Body.func_78785_a(f5);
            this.RightArm.func_78785_a(f5);
            this.LeftArm.func_78785_a(f5);
            this.RightLeg.func_78785_a(f5);
            this.LeftLeg.func_78785_a(f5);
            this.zhizhutui.func_78785_a(f5);
            this.xiong.func_78785_a(f5);
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
