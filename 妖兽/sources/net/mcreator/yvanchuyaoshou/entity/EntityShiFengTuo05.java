package net.mcreator.yvanchuyaoshou.entity;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureShiFengTuoDie;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureShiFengTuoUpdate;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureShouJiNbt;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIEatGrass;
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
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityShiFengTuo05.class */
public class EntityShiFengTuo05 extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 84;
    public static final int ENTITYID_RANGED = 85;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityShiFengTuo05(ElementsYvanchuyaoshouMod instance) {
        super(instance, 52);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "shi_feng_tuo_05"), 84).name("shi_feng_tuo_05").tracker(64, 3, true).egg(-3381760, -10079488).build();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modelshi_tuo_seng(), 0.5f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityShiFengTuo05.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/shi_feng_tuo.png");
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityShiFengTuo05$EntityCustom.class */
    public static class EntityCustom extends EntityMob {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(1.2f, 3.4f);
            this.field_70728_aV = 20;
            this.field_70178_ae = false;
            func_94061_f(false);
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70715_bh.func_75776_a(1, new EntityAIHurtByTarget(this, true, new Class[0]));
            this.field_70714_bg.func_75776_a(2, new EntityAIAttackMelee(this, 1.2d, true));
            this.field_70714_bg.func_75776_a(3, new EntityAILookIdle(this));
            this.field_70714_bg.func_75776_a(4, new EntityAISwimming(this));
            this.field_70714_bg.func_75776_a(5, new EntityAIWander(this, 1.0d));
            this.field_70714_bg.func_75776_a(6, new EntityAIEatGrass(this));
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
            EntityShiFengTuo05.$_dependencies.put("entity", this);
            ProcedureShouJiNbt.executeProcedure(EntityShiFengTuo05.$_dependencies);
            return super.func_70097_a(source, amount);
        }

        public void func_70645_a(DamageSource source) {
            super.func_70645_a(source);
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            EntityShiFengTuo05.$_dependencies.put("entity", this);
            EntityShiFengTuo05.$_dependencies.put("x", Integer.valueOf(x));
            EntityShiFengTuo05.$_dependencies.put("y", Integer.valueOf(y));
            EntityShiFengTuo05.$_dependencies.put("z", Integer.valueOf(z));
            EntityShiFengTuo05.$_dependencies.put("world", this.field_70170_p);
            ProcedureShiFengTuoDie.executeProcedure(EntityShiFengTuo05.$_dependencies);
        }

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityShiFengTuo05.$_dependencies.put("entity", this);
            EntityShiFengTuo05.$_dependencies.put("world", this.field_70170_p);
            ProcedureShiFengTuoUpdate.executeProcedure(EntityShiFengTuo05.$_dependencies);
        }

        protected void func_110147_ax() {
            super.func_110147_ax();
            if (func_110148_a(SharedMonsterAttributes.field_188791_g) != null) {
                func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(2.0d);
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

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityShiFengTuo05$Modelshi_tuo_seng.class */
    public static class Modelshi_tuo_seng extends ModelBase {
        private final ModelRenderer tou;
        private final ModelRenderer cube_r1;
        private final ModelRenderer yanjing;
        private final ModelRenderer cube_r2;
        private final ModelRenderer cube_r3;
        private final ModelRenderer douli;
        private final ModelRenderer cube_r4;
        private final ModelRenderer huzi;
        private final ModelRenderer cube_r5;
        private final ModelRenderer eduo;
        private final ModelRenderer cube_r6;
        private final ModelRenderer cube_r7;
        private final ModelRenderer quti;
        private final ModelRenderer cube_r8;
        private final ModelRenderer cube_r9;
        private final ModelRenderer cube_r10;
        private final ModelRenderer cube_r11;
        private final ModelRenderer youbi;
        private final ModelRenderer cube_r12;
        private final ModelRenderer youshou;
        private final ModelRenderer cube_r13;
        private final ModelRenderer zuobi;
        private final ModelRenderer cube_r14;
        private final ModelRenderer zuoshou;
        private final ModelRenderer cube_r15;
        private final ModelRenderer youdatui;
        private final ModelRenderer cube_r16;
        private final ModelRenderer cube_r17;
        private final ModelRenderer youxiaotui;
        private final ModelRenderer cube_r18;
        private final ModelRenderer cube_r19;
        private final ModelRenderer youjiao;
        private final ModelRenderer cube_r20;
        private final ModelRenderer zuodatui;
        private final ModelRenderer cube_r21;
        private final ModelRenderer cube_r22;
        private final ModelRenderer zuoxiaotui;
        private final ModelRenderer cube_r23;
        private final ModelRenderer cube_r24;
        private final ModelRenderer zuojiao;
        private final ModelRenderer cube_r25;
        private final ModelRenderer daizi;
        private final ModelRenderer cube_r26;
        private final ModelRenderer cube_r27;
        private final ModelRenderer xingnang;
        private final ModelRenderer cube_r28;
        private final ModelRenderer cube_r29;

        public Modelshi_tuo_seng() {
            this.field_78090_t = EntityMoXiu02.ENTITYID;
            this.field_78089_u = EntityMoXiu02.ENTITYID;
            this.tou = new ModelRenderer(this);
            this.tou.func_78793_a(-12.0f, -34.0f, -1.5f);
            this.cube_r1 = new ModelRenderer(this);
            this.cube_r1.func_78793_a(11.8939f, 31.8853f, -0.023f);
            this.tou.func_78792_a(this.cube_r1);
            setRotationAngle(this.cube_r1, -1.5708f, -1.5533f, 1.5708f);
            this.cube_r1.field_78804_l.add(new ModelBox(this.cube_r1, 0, 0, -9.7485f, -21.0671f, -5.977f, 11, 12, 12, 0.1f, false));
            this.yanjing = new ModelRenderer(this);
            this.yanjing.func_78793_a(-5.8f, 1.4849f, 0.0f);
            this.tou.func_78792_a(this.yanjing);
            this.cube_r2 = new ModelRenderer(this);
            this.cube_r2.func_78793_a(17.6939f, 30.4004f, -0.023f);
            this.yanjing.func_78792_a(this.cube_r2);
            setRotationAngle(this.cube_r2, -1.9199f, -1.5533f, 1.5708f);
            this.cube_r2.field_78804_l.add(new ModelBox(this.cube_r2, 0, 4, -10.0485f, -14.6437f, -3.5218f, 1, 1, 3, 0.1f, false));
            this.cube_r3 = new ModelRenderer(this);
            this.cube_r3.func_78793_a(17.6939f, 30.4004f, -0.023f);
            this.yanjing.func_78792_a(this.cube_r3);
            setRotationAngle(this.cube_r3, -1.2217f, -1.5533f, 1.5708f);
            this.cube_r3.field_78804_l.add(new ModelBox(this.cube_r3, 0, 0, -10.0485f, -14.6279f, 0.5651f, 1, 1, 3, 0.1f, false));
            this.douli = new ModelRenderer(this);
            this.douli.func_78793_a(12.0f, 58.0f, 1.5f);
            this.tou.func_78792_a(this.douli);
            this.cube_r4 = new ModelRenderer(this);
            this.cube_r4.func_78793_a(-0.1061f, -26.1147f, -1.523f);
            this.douli.func_78792_a(this.cube_r4);
            setRotationAngle(this.cube_r4, 0.0f, -1.5708f, 0.0f);
            this.cube_r4.field_78804_l.add(new ModelBox(this.cube_r4, 24, 24, -4.8939f, -26.2853f, -1.477f, 2, 1, 3, 0.1f, false));
            this.cube_r4.field_78804_l.add(new ModelBox(this.cube_r4, 58, 83, -5.8939f, -25.2853f, -2.477f, 4, 1, 5, 0.1f, false));
            this.cube_r4.field_78804_l.add(new ModelBox(this.cube_r4, 40, 68, -6.8939f, -24.2853f, -3.477f, 6, 1, 7, 0.1f, false));
            this.cube_r4.field_78804_l.add(new ModelBox(this.cube_r4, 64, 20, -7.8939f, -23.2853f, -4.477f, 8, 1, 9, 0.1f, false));
            this.cube_r4.field_78804_l.add(new ModelBox(this.cube_r4, 63, 32, -8.8939f, -22.2853f, -5.477f, 10, 2, 11, 0.1f, false));
            this.cube_r4.field_78804_l.add(new ModelBox(this.cube_r4, 56, 0, -9.8939f, -21.2853f, -6.477f, 12, 3, 13, 0.1f, false));
            this.cube_r4.field_78804_l.add(new ModelBox(this.cube_r4, 46, 48, -12.8939f, -18.2853f, -9.477f, 18, 1, 19, 0.1f, false));
            this.huzi = new ModelRenderer(this);
            this.huzi.func_78793_a(3.4f, 23.125f, -0.025f);
            this.tou.func_78792_a(this.huzi);
            setRotationAngle(this.huzi, 0.0f, 0.0f, -0.0524f);
            this.cube_r5 = new ModelRenderer(this);
            this.cube_r5.func_78793_a(8.0238f, 9.1928f, 0.002f);
            this.huzi.func_78792_a(this.cube_r5);
            setRotationAngle(this.cube_r5, 1.5708f, -1.5184f, -1.5184f);
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 46, 29, -9.5238f, -11.3178f, -0.977f, 1, 9, 1, 0.1f, false));
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 24, 28, -9.5238f, -12.3178f, 0.023f, 3, 1, 2, 0.1f, false));
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 4, 46, -7.5238f, -11.3178f, -1.977f, 1, 4, 1, 0.1f, false));
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 7, 34, -7.5238f, -11.3178f, -2.977f, 1, 1, 1, 0.1f, false));
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 23, 24, -7.5238f, -11.3178f, 2.023f, 1, 1, 1, 0.1f, false));
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 19, 46, -7.5238f, -11.3178f, 1.023f, 1, 3, 1, 0.1f, false));
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 0, 46, -7.5238f, -11.3178f, 0.023f, 1, 5, 1, 0.1f, false));
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 8, 27, -7.5238f, -11.3178f, -0.977f, 1, 6, 1, 0.1f, false));
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 8, 27, -8.5238f, -11.3178f, -1.977f, 1, 6, 1, 0.1f, false));
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 19, 46, -8.5238f, -11.3178f, -2.977f, 1, 3, 1, 0.1f, false));
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 31, 33, -8.5238f, -11.3178f, 2.023f, 1, 2, 1, 0.1f, false));
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 0, 46, -8.5238f, -11.3178f, 1.023f, 1, 5, 1, 0.1f, false));
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 4, 27, -8.5238f, -11.3178f, 0.023f, 1, 7, 1, 0.1f, false));
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 0, 27, -8.5238f, -11.3178f, -0.977f, 1, 8, 1, 0.1f, false));
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 4, 46, -9.5238f, -11.3178f, -2.977f, 1, 4, 1, 0.1f, false));
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 19, 46, -9.5238f, -11.3178f, 2.023f, 1, 3, 1, 0.1f, false));
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 8, 27, -9.5238f, -11.3178f, 1.023f, 1, 6, 1, 0.1f, false));
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 4, 27, -9.5238f, -11.3178f, -1.977f, 1, 7, 1, 0.1f, false));
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 0, 27, -9.5238f, -11.3178f, 0.023f, 1, 8, 1, 0.1f, false));
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 30, 31, -9.5238f, -12.3178f, -1.977f, 3, 1, 1, 0.1f, false));
            this.eduo = new ModelRenderer(this);
            this.eduo.func_78793_a(7.2f, 16.4849f, 9.5f);
            this.tou.func_78792_a(this.eduo);
            this.cube_r6 = new ModelRenderer(this);
            this.cube_r6.func_78793_a(4.6939f, 15.4004f, -9.523f);
            this.eduo.func_78792_a(this.cube_r6);
            setRotationAngle(this.cube_r6, 0.0f, -1.5708f, 0.3927f);
            this.cube_r6.field_78804_l.add(new ModelBox(this.cube_r6, 37, 29, -5.5939f, -13.4838f, 11.5916f, 2, 2, 1, 0.0f, false));
            this.cube_r7 = new ModelRenderer(this);
            this.cube_r7.func_78793_a(4.6939f, 15.4004f, -9.523f);
            this.eduo.func_78792_a(this.cube_r7);
            setRotationAngle(this.cube_r7, 0.0f, -1.5708f, -0.3927f);
            this.cube_r7.field_78804_l.add(new ModelBox(this.cube_r7, 37, 29, -5.5939f, -13.6495f, -12.3774f, 2, 2, 1, 0.0f, false));
            this.quti = new ModelRenderer(this);
            this.quti.func_78793_a(5.1564f, -11.4812f, -1.5f);
            this.cube_r8 = new ModelRenderer(this);
            this.cube_r8.func_78793_a(-5.2625f, 9.3665f, -0.023f);
            this.quti.func_78792_a(this.cube_r8);
            setRotationAngle(this.cube_r8, -1.5708f, -0.9076f, 1.5708f);
            this.cube_r8.field_78804_l.add(new ModelBox(this.cube_r8, 24, 34, 4.9755f, 4.0428f, -5.977f, 5, 2, 12, 0.1f, false));
            this.cube_r9 = new ModelRenderer(this);
            this.cube_r9.func_78793_a(-5.2625f, 9.3665f, -0.023f);
            this.quti.func_78792_a(this.cube_r9);
            setRotationAngle(this.cube_r9, -1.5708f, -1.1868f, 1.5708f);
            this.cube_r9.field_78804_l.add(new ModelBox(this.cube_r9, 34, 12, 3.5768f, 1.6631f, -5.977f, 5, 5, 12, 0.1f, false));
            this.cube_r10 = new ModelRenderer(this);
            this.cube_r10.func_78793_a(-5.2625f, 9.3665f, -0.023f);
            this.quti.func_78792_a(this.cube_r10);
            setRotationAngle(this.cube_r10, 1.5708f, -0.8203f, -1.5708f);
            this.cube_r10.field_78804_l.add(new ModelBox(this.cube_r10, 0, 24, 3.459f, -9.4287f, -5.977f, 6, 10, 12, 0.1f, false));
            this.cube_r11 = new ModelRenderer(this);
            this.cube_r11.func_78793_a(-5.2625f, 9.3665f, -0.023f);
            this.quti.func_78792_a(this.cube_r11);
            setRotationAngle(this.cube_r11, 0.0f, -1.5708f, 0.0f);
            this.cube_r11.field_78804_l.add(new ModelBox(this.cube_r11, 0, 46, 2.2604f, -6.1163f, -4.477f, 5, 11, 9, 0.1f, false));
            this.youbi = new ModelRenderer(this);
            this.youbi.func_78793_a(5.6308f, -22.5169f, 6.5961f);
            this.cube_r12 = new ModelRenderer(this);
            this.cube_r12.func_78793_a(-5.7368f, 20.4022f, -8.1192f);
            this.youbi.func_78792_a(this.cube_r12);
            setRotationAngle(this.cube_r12, 1.5791f, -0.8573f, -1.5648f);
            this.cube_r12.field_78804_l.add(new ModelBox(this.cube_r12, 46, 48, 4.1965f, -9.01f, 5.8938f, 4, 15, 4, 0.1f, false));
            this.youshou = new ModelRenderer(this);
            this.youshou.func_78793_a(-6.3692f, -9.0169f, 6.5961f);
            this.cube_r13 = new ModelRenderer(this);
            this.cube_r13.func_78793_a(6.2632f, 6.9022f, -8.1192f);
            this.youshou.func_78792_a(this.cube_r13);
            setRotationAngle(this.cube_r13, -1.5634f, 0.9097f, 1.564f);
            this.cube_r13.field_78804_l.add(new ModelBox(this.cube_r13, 46, 29, -8.5482f, -9.0592f, -0.0247f, 4, 4, 10, 0.1f, false));
            this.zuobi = new ModelRenderer(this);
            this.zuobi.func_78793_a(5.6308f, -22.5169f, 6.5961f);
            this.cube_r14 = new ModelRenderer(this);
            this.cube_r14.func_78793_a(-5.7368f, 20.4022f, -8.1192f);
            this.zuobi.func_78792_a(this.cube_r14);
            setRotationAngle(this.cube_r14, 1.5789f, -0.8399f, -1.5646f);
            this.cube_r14.field_78804_l.add(new ModelBox(this.cube_r14, 28, 48, 4.2219f, -8.9016f, -10.3062f, 4, 15, 5, 0.1f, false));
            this.zuoshou = new ModelRenderer(this);
            this.zuoshou.func_78793_a(-1.1905f, -15.4459f, -6.8101f);
            this.cube_r15 = new ModelRenderer(this);
            this.cube_r15.func_78793_a(1.0844f, 13.3312f, 5.287f);
            this.zuoshou.func_78792_a(this.cube_r15);
            setRotationAngle(this.cube_r15, -1.5634f, 0.9097f, 1.564f);
            this.cube_r15.field_78804_l.add(new ModelBox(this.cube_r15, 46, 29, -8.5482f, -9.0592f, -10.2247f, 4, 4, 10, 0.1f, false));
            this.youdatui = new ModelRenderer(this);
            this.youdatui.func_78793_a(-7.6294f, -9.1566f, 3.3885f);
            this.cube_r16 = new ModelRenderer(this);
            this.cube_r16.func_78793_a(7.5233f, 7.0419f, -4.9116f);
            this.youdatui.func_78792_a(this.cube_r16);
            setRotationAngle(this.cube_r16, -1.1694f, -0.8378f, 1.5708f);
            this.cube_r16.field_78804_l.add(new ModelBox(this.cube_r16, 0, 24, 5.3053f, 4.9641f, 3.4442f, 5, 2, 1, 0.1f, false));
            this.cube_r17 = new ModelRenderer(this);
            this.cube_r17.func_78793_a(7.5233f, 7.0419f, -4.9116f);
            this.youdatui.func_78792_a(this.cube_r17);
            setRotationAngle(this.cube_r17, -1.5708f, -0.6981f, 1.5708f);
            this.cube_r17.field_78804_l.add(new ModelBox(this.cube_r17, 0, 66, 5.904f, 3.2127f, 0.823f, 5, 8, 6, 0.1f, false));
            this.youxiaotui = new ModelRenderer(this);
            this.youxiaotui.func_78793_a(-4.2703f, 14.2561f, -1.0885f);
            this.youdatui.func_78792_a(this.youxiaotui);
            this.cube_r18 = new ModelRenderer(this);
            this.cube_r18.func_78793_a(11.7937f, -7.2141f, -3.823f);
            this.youxiaotui.func_78792_a(this.cube_r18);
            setRotationAngle(this.cube_r18, -1.5708f, -1.501f, 1.5708f);
            this.cube_r18.field_78804_l.add(new ModelBox(this.cube_r18, 0, 80, -2.3566f, 23.1616f, 0.823f, 4, 2, 5, 0.1f, false));
            this.cube_r19 = new ModelRenderer(this);
            this.cube_r19.func_78793_a(11.7937f, -7.2141f, -3.823f);
            this.youxiaotui.func_78792_a(this.cube_r19);
            setRotationAngle(this.cube_r19, 1.5708f, -1.501f, -1.5708f);
            this.cube_r19.field_78804_l.add(new ModelBox(this.cube_r19, 22, 68, -5.6001f, 11.3969f, 0.823f, 4, 12, 5, 0.1f, false));
            this.youjiao = new ModelRenderer(this);
            this.youjiao.func_78793_a(-5.5527f, 17.2185f, -1.5885f);
            this.youdatui.func_78792_a(this.youjiao);
            this.cube_r20 = new ModelRenderer(this);
            this.cube_r20.func_78793_a(13.0761f, -10.1766f, -3.323f);
            this.youjiao.func_78792_a(this.cube_r20);
            setRotationAngle(this.cube_r20, -1.5708f, -1.5621f, 1.5708f);
            this.cube_r20.field_78804_l.add(new ModelBox(this.cube_r20, 24, 31, -4.8615f, 25.2938f, 0.823f, 2, 1, 2, 0.1f, false));
            this.cube_r20.field_78804_l.add(new ModelBox(this.cube_r20, 24, 31, -4.8615f, 25.2938f, 3.823f, 2, 1, 2, 0.1f, false));
            this.cube_r20.field_78804_l.add(new ModelBox(this.cube_r20, 79, 78, -3.8615f, 24.2938f, 0.823f, 5, 1, 5, 0.1f, false));
            this.cube_r20.field_78804_l.add(new ModelBox(this.cube_r20, 78, 68, -3.8615f, 25.2938f, 0.823f, 6, 1, 5, 0.1f, false));
            this.zuodatui = new ModelRenderer(this);
            this.zuodatui.func_78793_a(-7.6044f, -11.6327f, -7.5023f);
            this.cube_r21 = new ModelRenderer(this);
            this.cube_r21.func_78793_a(7.4984f, 9.518f, 5.9792f);
            this.zuodatui.func_78792_a(this.cube_r21);
            setRotationAngle(this.cube_r21, -1.9722f, -0.8378f, 1.5708f);
            this.cube_r21.field_78804_l.add(new ModelBox(this.cube_r21, 0, 24, 5.3053f, 4.8461f, -4.4018f, 5, 2, 1, 0.1f, false));
            this.cube_r22 = new ModelRenderer(this);
            this.cube_r22.func_78793_a(7.4984f, 9.518f, 5.9792f);
            this.zuodatui.func_78792_a(this.cube_r22);
            setRotationAngle(this.cube_r22, -1.5708f, -0.6981f, 1.5708f);
            this.cube_r22.field_78804_l.add(new ModelBox(this.cube_r22, 0, 66, 5.904f, 3.2127f, -6.777f, 5, 8, 6, 0.1f, false));
            this.zuoxiaotui = new ModelRenderer(this);
            this.zuoxiaotui.func_78793_a(-4.2953f, 16.7322f, 3.2023f);
            this.zuodatui.func_78792_a(this.zuoxiaotui);
            this.cube_r23 = new ModelRenderer(this);
            this.cube_r23.func_78793_a(11.7937f, -7.2141f, 2.777f);
            this.zuoxiaotui.func_78792_a(this.cube_r23);
            setRotationAngle(this.cube_r23, -1.5708f, -1.501f, 1.5708f);
            this.cube_r23.field_78804_l.add(new ModelBox(this.cube_r23, 0, 80, -2.3566f, 23.1616f, -5.777f, 4, 2, 5, 0.1f, false));
            this.cube_r24 = new ModelRenderer(this);
            this.cube_r24.func_78793_a(11.7937f, -7.2141f, 2.777f);
            this.zuoxiaotui.func_78792_a(this.cube_r24);
            setRotationAngle(this.cube_r24, 1.5708f, -1.501f, -1.5708f);
            this.cube_r24.field_78804_l.add(new ModelBox(this.cube_r24, 22, 68, -5.6001f, 11.3969f, -5.777f, 4, 12, 5, 0.1f, false));
            this.zuojiao = new ModelRenderer(this);
            this.zuojiao.func_78793_a(-5.5777f, 19.6946f, 2.7023f);
            this.zuodatui.func_78792_a(this.zuojiao);
            this.cube_r25 = new ModelRenderer(this);
            this.cube_r25.func_78793_a(13.0761f, -10.1766f, 3.277f);
            this.zuojiao.func_78792_a(this.cube_r25);
            setRotationAngle(this.cube_r25, -1.5708f, -1.5621f, 1.5708f);
            this.cube_r25.field_78804_l.add(new ModelBox(this.cube_r25, 24, 31, -4.8615f, 25.2938f, -5.777f, 2, 1, 2, 0.1f, false));
            this.cube_r25.field_78804_l.add(new ModelBox(this.cube_r25, 24, 31, -4.8615f, 25.2938f, -2.777f, 2, 1, 2, 0.1f, false));
            this.cube_r25.field_78804_l.add(new ModelBox(this.cube_r25, 79, 78, -3.8615f, 24.2938f, -5.777f, 5, 1, 5, 0.1f, false));
            this.cube_r25.field_78804_l.add(new ModelBox(this.cube_r25, 78, 68, -3.8615f, 25.2938f, -5.777f, 6, 1, 5, 0.1f, false));
            this.daizi = new ModelRenderer(this);
            this.daizi.func_78793_a(1.9616f, -9.2473f, -2.3429f);
            this.cube_r26 = new ModelRenderer(this);
            this.cube_r26.func_78793_a(-2.0677f, 7.1326f, 0.8199f);
            this.daizi.func_78792_a(this.cube_r26);
            setRotationAngle(this.cube_r26, 2.3989f, -0.8898f, -1.4675f);
            this.cube_r26.field_78804_l.add(new ModelBox(this.cube_r26, 18, 80, 8.3261f, -10.451f, 2.5958f, 1, 16, 1, 0.1f, false));
            this.cube_r26.field_78804_l.add(new ModelBox(this.cube_r26, 18, 80, 2.8261f, -10.451f, 2.5958f, 1, 16, 1, 0.1f, false));
            this.cube_r27 = new ModelRenderer(this);
            this.cube_r27.func_78793_a(-2.0677f, 7.1326f, 0.8199f);
            this.daizi.func_78792_a(this.cube_r27);
            setRotationAngle(this.cube_r27, 2.1089f, 0.4398f, -0.5163f);
            this.cube_r27.field_78804_l.add(new ModelBox(this.cube_r27, 8, 27, 9.451f, 3.1261f, 2.5958f, 1, 6, 1, 0.1f, false));
            this.cube_r27.field_78804_l.add(new ModelBox(this.cube_r27, 8, 27, -5.549f, 3.1261f, 2.5958f, 1, 6, 1, 0.1f, false));
            this.xingnang = new ModelRenderer(this);
            this.xingnang.func_78793_a(5.0f, -10.0f, 0.0f);
            this.cube_r28 = new ModelRenderer(this);
            this.cube_r28.func_78793_a(-5.1061f, 7.8853f, -1.523f);
            this.xingnang.func_78792_a(this.cube_r28);
            setRotationAngle(this.cube_r28, 1.5708f, -0.9425f, -1.5708f);
            this.cube_r28.field_78804_l.add(new ModelBox(this.cube_r28, 40, 76, 8.5658f, -7.8781f, -6.177f, 3, 8, 6, 0.1f, false));
            this.cube_r29 = new ModelRenderer(this);
            this.cube_r29.func_78793_a(-5.1061f, 7.8853f, -1.523f);
            this.xingnang.func_78792_a(this.cube_r29);
            setRotationAngle(this.cube_r29, 2.3923f, -0.9124f, -1.5358f);
            this.cube_r29.field_78804_l.add(new ModelBox(this.cube_r29, 66, 68, 9.4626f, -6.688f, -0.4044f, 3, 9, 6, 0.1f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.tou.func_78785_a(f5);
            this.quti.func_78785_a(f5);
            this.youbi.func_78785_a(f5);
            this.youshou.func_78785_a(f5);
            this.zuobi.func_78785_a(f5);
            this.zuoshou.func_78785_a(f5);
            this.youdatui.func_78785_a(f5);
            this.zuodatui.func_78785_a(f5);
            this.daizi.func_78785_a(f5);
            this.xingnang.func_78785_a(f5);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.field_78795_f = x;
            modelRenderer.field_78796_g = y;
            modelRenderer.field_78808_h = z;
        }

        public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
            super.func_78087_a(f, f1, f2, f3, f4, f5, e);
            this.tou.field_78796_g = f3 / 57.295776f;
            this.tou.field_78795_f = f4 / 57.295776f;
            this.zuodatui.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
            this.youdatui.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
        }
    }
}
