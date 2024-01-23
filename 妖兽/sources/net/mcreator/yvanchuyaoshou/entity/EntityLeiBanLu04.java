package net.mcreator.yvanchuyaoshou.entity;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureCaientity18ItIsStruckByLightning;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureLeiBanLuDie;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureLeiBanLuUpdate;
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
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.effect.EntityLightningBolt;
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
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityLeiBanLu04.class */
public class EntityLeiBanLu04 extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 78;
    public static final int ENTITYID_RANGED = 79;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityLeiBanLu04(ElementsYvanchuyaoshouMod instance) {
        super(instance, 49);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "lei_ban_lu_04"), 78).name("lei_ban_lu_04").tracker(64, 3, true).egg(-655488, -3828663).build();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modellei_ban_lu(), 1.0f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityLeiBanLu04.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/lei_ban_lu.png");
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityLeiBanLu04$EntityCustom.class */
    public static class EntityCustom extends EntityMob {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(1.2f, 4.0f);
            this.field_70728_aV = 20;
            this.field_70178_ae = true;
            func_94061_f(false);
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70714_bg.func_75776_a(1, new EntityAIPanic(this, 1.8d));
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

        public void func_70077_a(EntityLightningBolt entityLightningBolt) {
            super.func_70077_a(entityLightningBolt);
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityLeiBanLu04.$_dependencies.put("entity", this);
            ProcedureCaientity18ItIsStruckByLightning.executeProcedure(EntityLeiBanLu04.$_dependencies);
        }

        public boolean func_70097_a(DamageSource source, float amount) {
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            source.func_76346_g();
            EntityLeiBanLu04.$_dependencies.put("entity", this);
            ProcedureShouJiNbt.executeProcedure(EntityLeiBanLu04.$_dependencies);
            if (source == DamageSource.field_180137_b) {
                return false;
            }
            return super.func_70097_a(source, amount);
        }

        public void func_70645_a(DamageSource source) {
            super.func_70645_a(source);
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            EntityLeiBanLu04.$_dependencies.put("entity", this);
            EntityLeiBanLu04.$_dependencies.put("x", Integer.valueOf(x));
            EntityLeiBanLu04.$_dependencies.put("y", Integer.valueOf(y));
            EntityLeiBanLu04.$_dependencies.put("z", Integer.valueOf(z));
            EntityLeiBanLu04.$_dependencies.put("world", this.field_70170_p);
            ProcedureLeiBanLuDie.executeProcedure(EntityLeiBanLu04.$_dependencies);
        }

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityLeiBanLu04.$_dependencies.put("entity", this);
            EntityLeiBanLu04.$_dependencies.put("world", this.field_70170_p);
            ProcedureLeiBanLuUpdate.executeProcedure(EntityLeiBanLu04.$_dependencies);
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
        }
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityLeiBanLu04$Modellei_ban_lu.class */
    public static class Modellei_ban_lu extends ModelBase {
        private final ModelRenderer tou;
        private final ModelRenderer cube_r1;
        private final ModelRenderer cube_r2;
        private final ModelRenderer cube_r3;
        private final ModelRenderer cube_r4;
        private final ModelRenderer cube_r5;
        private final ModelRenderer cube_r6;
        private final ModelRenderer cube_r7;
        private final ModelRenderer cube_r8;
        private final ModelRenderer cube_r9;
        private final ModelRenderer cube_r10;
        private final ModelRenderer cube_r11;
        private final ModelRenderer cube_r12;
        private final ModelRenderer cube_r13;
        private final ModelRenderer shenti;
        private final ModelRenderer cube_r14;
        private final ModelRenderer zuobi;
        private final ModelRenderer cube_r15;
        private final ModelRenderer youbi;
        private final ModelRenderer cube_r16;
        private final ModelRenderer qunbai;
        private final ModelRenderer cube_r17;
        private final ModelRenderer cube_r18;
        private final ModelRenderer cube_r19;
        private final ModelRenderer cube_r20;
        private final ModelRenderer cube_r21;
        private final ModelRenderer cube_r22;
        private final ModelRenderer cube_r23;
        private final ModelRenderer cube_r24;
        private final ModelRenderer cube_r25;
        private final ModelRenderer cube_r26;
        private final ModelRenderer cube_r27;
        private final ModelRenderer cube_r28;
        private final ModelRenderer cube_r29;
        private final ModelRenderer cube_r30;
        private final ModelRenderer cube_r31;
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
        private final ModelRenderer zuodatui;
        private final ModelRenderer cube_r49;
        private final ModelRenderer zuodatui2;
        private final ModelRenderer cube_r50;

        public Modellei_ban_lu() {
            this.field_78090_t = EntityMoXiu02.ENTITYID;
            this.field_78089_u = EntityMoXiu02.ENTITYID;
            this.tou = new ModelRenderer(this);
            this.tou.func_78793_a(0.0f, 24.0f, 0.0f);
            this.cube_r1 = new ModelRenderer(this);
            this.cube_r1.func_78793_a(-0.0092f, -31.1919f, 0.0f);
            this.tou.func_78792_a(this.cube_r1);
            setRotationAngle(this.cube_r1, -0.6744f, -1.3374f, 0.6242f);
            this.cube_r1.field_78804_l.add(new ModelBox(this.cube_r1, 33, 0, -7.0739f, -26.597f, -8.0654f, 1, 4, 1, 0.1f, false));
            this.cube_r2 = new ModelRenderer(this);
            this.cube_r2.func_78793_a(-0.0092f, -31.1919f, 0.0f);
            this.tou.func_78792_a(this.cube_r2);
            setRotationAngle(this.cube_r2, -1.3202f, -1.3374f, 0.6242f);
            this.cube_r2.field_78804_l.add(new ModelBox(this.cube_r2, 31, 23, -7.0739f, -13.8274f, -20.2404f, 1, 4, 1, 0.1f, false));
            this.cube_r3 = new ModelRenderer(this);
            this.cube_r3.func_78793_a(-0.0092f, -31.1919f, 0.0f);
            this.tou.func_78792_a(this.cube_r3);
            setRotationAngle(this.cube_r3, 1.5713f, -1.301f, -1.0774f);
            this.cube_r3.field_78804_l.add(new ModelBox(this.cube_r3, 24, 78, -0.9066f, -29.8818f, 1.4765f, 2, 5, 2, 0.1f, false));
            this.cube_r4 = new ModelRenderer(this);
            this.cube_r4.func_78793_a(-0.0092f, -31.1919f, 0.0f);
            this.tou.func_78792_a(this.cube_r4);
            setRotationAngle(this.cube_r4, 2.0597f, -1.0392f, -1.0772f);
            this.cube_r4.field_78804_l.add(new ModelBox(this.cube_r4, 36, 104, 5.5786f, -20.695f, 12.6655f, 2, 7, 2, 0.1f, false));
            this.cube_r5 = new ModelRenderer(this);
            this.cube_r5.func_78793_a(-0.0092f, -31.1919f, 0.0f);
            this.tou.func_78792_a(this.cube_r5);
            setRotationAngle(this.cube_r5, -1.1386f, -1.2574f, 1.1605f);
            this.cube_r5.field_78804_l.add(new ModelBox(this.cube_r5, 56, 0, -14.443f, -27.8564f, -13.2482f, 2, 5, 2, 0.1f, false));
            this.cube_r6 = new ModelRenderer(this);
            this.cube_r6.func_78793_a(-0.0092f, -31.1919f, 0.0f);
            this.tou.func_78792_a(this.cube_r6);
            setRotationAngle(this.cube_r6, -2.4672f, -1.3374f, 2.5174f);
            this.cube_r6.field_78804_l.add(new ModelBox(this.cube_r6, 45, 10, -7.0739f, -26.597f, 7.0654f, 1, 4, 1, 0.1f, false));
            this.cube_r7 = new ModelRenderer(this);
            this.cube_r7.func_78793_a(-0.0092f, -31.1919f, 0.0f);
            this.tou.func_78792_a(this.cube_r7);
            setRotationAngle(this.cube_r7, -1.8214f, -1.3374f, 2.5174f);
            this.cube_r7.field_78804_l.add(new ModelBox(this.cube_r7, 66, 29, -7.0739f, -13.8274f, 19.2404f, 1, 4, 1, 0.1f, false));
            this.cube_r8 = new ModelRenderer(this);
            this.cube_r8.func_78793_a(-0.0092f, -31.1919f, 0.0f);
            this.tou.func_78792_a(this.cube_r8);
            setRotationAngle(this.cube_r8, 1.5703f, -1.301f, -2.0642f);
            this.cube_r8.field_78804_l.add(new ModelBox(this.cube_r8, 44, 106, -0.9066f, -29.8818f, -3.4765f, 2, 5, 2, 0.1f, false));
            this.cube_r9 = new ModelRenderer(this);
            this.cube_r9.func_78793_a(-0.0092f, -31.1919f, 0.0f);
            this.tou.func_78792_a(this.cube_r9);
            setRotationAngle(this.cube_r9, 1.0819f, -1.0392f, -2.0644f);
            this.cube_r9.field_78804_l.add(new ModelBox(this.cube_r9, 106, 37, 5.5786f, -20.695f, -14.6655f, 2, 7, 2, 0.1f, false));
            this.cube_r10 = new ModelRenderer(this);
            this.cube_r10.func_78793_a(-0.0092f, -31.1919f, 0.0f);
            this.tou.func_78792_a(this.cube_r10);
            setRotationAngle(this.cube_r10, -2.003f, -1.2574f, 1.9811f);
            this.cube_r10.field_78804_l.add(new ModelBox(this.cube_r10, 101, 0, -14.443f, -27.8564f, 11.2482f, 2, 5, 2, 0.1f, false));
            this.cube_r11 = new ModelRenderer(this);
            this.cube_r11.func_78793_a(-0.0092f, -31.1919f, 0.0f);
            this.tou.func_78792_a(this.cube_r11);
            setRotationAngle(this.cube_r11, -1.4835f, -1.117f, 1.789f);
            this.cube_r11.field_78804_l.add(new ModelBox(this.cube_r11, 70, 60, -6.8466f, -16.4093f, 10.5167f, 3, 5, 1, 0.1f, false));
            this.cube_r12 = new ModelRenderer(this);
            this.cube_r12.func_78793_a(-0.0092f, -31.1919f, 0.0f);
            this.tou.func_78792_a(this.cube_r12);
            setRotationAngle(this.cube_r12, -1.6581f, -1.117f, 1.3526f);
            this.cube_r12.field_78804_l.add(new ModelBox(this.cube_r12, 108, 6, -6.8466f, -16.4093f, -11.5167f, 3, 5, 1, 0.1f, false));
            this.cube_r13 = new ModelRenderer(this);
            this.cube_r13.func_78793_a(-0.0092f, -31.1919f, 0.0f);
            this.tou.func_78792_a(this.cube_r13);
            setRotationAngle(this.cube_r13, 0.0f, -1.5708f, 0.0f);
            this.cube_r13.field_78804_l.add(new ModelBox(this.cube_r13, 34, 33, -5.3908f, -20.8081f, -6.0f, 10, 12, 12, 0.1f, false));
            this.shenti = new ModelRenderer(this);
            this.shenti.func_78793_a(0.0f, 24.0f, 0.0f);
            setRotationAngle(this.shenti, 0.0f, -1.5708f, 0.0f);
            this.cube_r14 = new ModelRenderer(this);
            this.cube_r14.func_78793_a(-0.2092f, -31.1919f, 0.0f);
            this.shenti.func_78792_a(this.cube_r14);
            setRotationAngle(this.cube_r14, 0.0f, 0.0f, 0.0f);
            this.cube_r14.field_78804_l.add(new ModelBox(this.cube_r14, 66, 0, 4.6092f, -10.8081f, -6.5f, 1, 2, 13, 0.1f, false));
            this.cube_r14.field_78804_l.add(new ModelBox(this.cube_r14, 0, 14, -1.3908f, -10.8081f, -7.5f, 7, 2, 1, 0.1f, false));
            this.cube_r14.field_78804_l.add(new ModelBox(this.cube_r14, 31, 29, -1.3908f, -10.8081f, 6.5f, 7, 2, 1, 0.1f, false));
            this.cube_r14.field_78804_l.add(new ModelBox(this.cube_r14, 0, 62, -1.3908f, 7.1919f, -4.5f, 6, 6, 9, 0.1f, false));
            this.cube_r14.field_78804_l.add(new ModelBox(this.cube_r14, 0, 45, -2.3908f, 5.1919f, -6.5f, 8, 4, 13, 0.1f, false));
            this.cube_r14.field_78804_l.add(new ModelBox(this.cube_r14, 37, 10, -2.3908f, 0.1919f, -6.5f, 8, 6, 13, 0.1f, false));
            this.cube_r14.field_78804_l.add(new ModelBox(this.cube_r14, 0, 23, -2.3908f, -4.8081f, -7.5f, 8, 7, 15, 0.1f, false));
            this.cube_r14.field_78804_l.add(new ModelBox(this.cube_r14, 0, 0, -2.3908f, -8.8081f, -8.5f, 8, 6, 17, 0.1f, false));
            this.zuobi = new ModelRenderer(this);
            this.zuobi.func_78793_a(10.4f, -8.9f, 1.4f);
            this.cube_r15 = new ModelRenderer(this);
            this.cube_r15.func_78793_a(0.0f, 0.9f, 0.15f);
            this.zuobi.func_78792_a(this.cube_r15);
            setRotationAngle(this.cube_r15, 0.0f, -1.5708f, 0.0f);
            this.cube_r15.field_78804_l.add(new ModelBox(this.cube_r15, 0, 0, -2.0f, 2.0f, -2.25f, 4, 10, 4, 0.1f, false));
            this.cube_r15.field_78804_l.add(new ModelBox(this.cube_r15, 33, 0, -4.0f, 2.0f, -4.25f, 8, 3, 7, 0.1f, false));
            this.cube_r15.field_78804_l.add(new ModelBox(this.cube_r15, 81, 0, -3.0f, -8.0f, -2.25f, 6, 4, 4, 0.1f, false));
            this.cube_r15.field_78804_l.add(new ModelBox(this.cube_r15, 24, 86, -3.0f, -9.0f, -1.25f, 6, 4, 4, 0.1f, false));
            this.cube_r15.field_78804_l.add(new ModelBox(this.cube_r15, 66, 29, -3.0f, -7.0f, -3.25f, 6, 10, 6, 0.1f, false));
            this.youbi = new ModelRenderer(this);
            this.youbi.func_78793_a(-10.4f, -8.9f, 1.4f);
            this.cube_r16 = new ModelRenderer(this);
            this.cube_r16.func_78793_a(0.0f, 0.9f, 0.15f);
            this.youbi.func_78792_a(this.cube_r16);
            setRotationAngle(this.cube_r16, 0.0f, 1.5708f, 0.0f);
            this.cube_r16.field_78804_l.add(new ModelBox(this.cube_r16, 0, 0, -2.0f, 2.0f, -2.25f, 4, 10, 4, 0.1f, true));
            this.cube_r16.field_78804_l.add(new ModelBox(this.cube_r16, 33, 0, -4.0f, 2.0f, -4.25f, 8, 3, 7, 0.1f, true));
            this.cube_r16.field_78804_l.add(new ModelBox(this.cube_r16, 81, 0, -3.0f, -8.0f, -2.25f, 6, 4, 4, 0.1f, true));
            this.cube_r16.field_78804_l.add(new ModelBox(this.cube_r16, 24, 86, -3.0f, -9.0f, -1.25f, 6, 4, 4, 0.1f, true));
            this.cube_r16.field_78804_l.add(new ModelBox(this.cube_r16, 66, 29, -3.0f, -7.0f, -3.25f, 6, 10, 6, 0.1f, true));
            this.qunbai = new ModelRenderer(this);
            this.qunbai.func_78793_a(-8.6f, 6.4357f, 0.0678f);
            setRotationAngle(this.qunbai, 0.0f, -1.5708f, 0.0f);
            this.cube_r17 = new ModelRenderer(this);
            this.cube_r17.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r17);
            setRotationAngle(this.cube_r17, 1.312f, 1.4463f, 1.2636f);
            this.cube_r17.field_78804_l.add(new ModelBox(this.cube_r17, 70, 100, -5.811f, 22.3028f, 5.4364f, 6, 9, 1, 0.1f, false));
            this.cube_r18 = new ModelRenderer(this);
            this.cube_r18.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r18);
            setRotationAngle(this.cube_r18, 2.9186f, 0.53f, 3.0274f);
            this.cube_r18.field_78804_l.add(new ModelBox(this.cube_r18, 68, 110, -0.9131f, 9.276f, -6.3566f, 1, 9, 1, 0.1f, false));
            this.cube_r19 = new ModelRenderer(this);
            this.cube_r19.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r19);
            setRotationAngle(this.cube_r19, 1.4525f, -1.3618f, -1.4008f);
            this.cube_r19.field_78804_l.add(new ModelBox(this.cube_r19, 102, 69, -1.3941f, 9.1968f, 2.1383f, 6, 9, 1, 0.1f, false));
            this.cube_r20 = new ModelRenderer(this);
            this.cube_r20.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r20);
            setRotationAngle(this.cube_r20, 1.1334f, -1.4957f, -1.0841f);
            this.cube_r20.field_78804_l.add(new ModelBox(this.cube_r20, 102, 59, 0.9556f, 16.6545f, 2.2625f, 6, 9, 1, 0.1f, false));
            this.cube_r21 = new ModelRenderer(this);
            this.cube_r21.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r21);
            setRotationAngle(this.cube_r21, 3.0805f, 0.5402f, 3.1102f);
            this.cube_r21.field_78804_l.add(new ModelBox(this.cube_r21, 107, 109, -2.2046f, 16.6849f, -8.4893f, 1, 9, 1, 0.1f, false));
            this.cube_r22 = new ModelRenderer(this);
            this.cube_r22.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r22);
            setRotationAngle(this.cube_r22, 1.312f, -1.4463f, -1.2636f);
            this.cube_r22.field_78804_l.add(new ModelBox(this.cube_r22, 101, 49, -0.0681f, 22.1543f, 2.2238f, 6, 9, 1, 0.1f, false));
            this.cube_r23 = new ModelRenderer(this);
            this.cube_r23.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r23);
            setRotationAngle(this.cube_r23, 2.9758f, 0.5402f, 3.1102f);
            this.cube_r23.field_78804_l.add(new ModelBox(this.cube_r23, 103, 109, -2.2756f, 22.4552f, -6.3217f, 1, 9, 1, 0.1f, false));
            this.cube_r24 = new ModelRenderer(this);
            this.cube_r24.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r24);
            setRotationAngle(this.cube_r24, 1.4525f, 1.3618f, 1.4008f);
            this.cube_r24.field_78804_l.add(new ModelBox(this.cube_r24, 56, 99, -4.493f, 9.3514f, 5.3509f, 6, 9, 1, 0.1f, false));
            this.cube_r25 = new ModelRenderer(this);
            this.cube_r25.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r25);
            setRotationAngle(this.cube_r25, 2.9186f, -0.53f, -3.0274f);
            this.cube_r25.field_78804_l.add(new ModelBox(this.cube_r25, 64, 109, -2.8455f, 9.276f, -8.0142f, 1, 9, 1, 0.1f, false));
            this.cube_r26 = new ModelRenderer(this);
            this.cube_r26.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r26);
            setRotationAngle(this.cube_r26, 1.1334f, 1.4957f, 1.0841f);
            this.cube_r26.field_78804_l.add(new ModelBox(this.cube_r26, 96, 99, -6.8427f, 16.8091f, 5.4752f, 6, 9, 1, 0.1f, false));
            this.cube_r27 = new ModelRenderer(this);
            this.cube_r27.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r27);
            setRotationAngle(this.cube_r27, 3.0805f, -0.5402f, -3.1102f);
            this.cube_r27.field_78804_l.add(new ModelBox(this.cube_r27, 95, 109, -1.554f, 16.6849f, -10.1469f, 1, 9, 1, 0.1f, false));
            this.cube_r28 = new ModelRenderer(this);
            this.cube_r28.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r28);
            setRotationAngle(this.cube_r28, 2.9758f, -0.5402f, -3.1102f);
            this.cube_r28.field_78804_l.add(new ModelBox(this.cube_r28, 99, 109, -1.4831f, 22.6284f, -7.9702f, 1, 9, 1, 0.1f, false));
            this.cube_r29 = new ModelRenderer(this);
            this.cube_r29.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r29);
            setRotationAngle(this.cube_r29, 0.192f, 0.0f, 0.0f);
            this.cube_r29.field_78804_l.add(new ModelBox(this.cube_r29, 24, 104, 0.6092f, 8.476f, 4.8359f, 5, 9, 1, 0.1f, false));
            this.cube_r29.field_78804_l.add(new ModelBox(this.cube_r29, 12, 104, -2.3908f, 8.476f, 4.8359f, 5, 9, 1, 0.1f, false));
            this.cube_r30 = new ModelRenderer(this);
            this.cube_r30.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r30);
            setRotationAngle(this.cube_r30, 0.0873f, 0.0f, 0.0f);
            this.cube_r30.field_78804_l.add(new ModelBox(this.cube_r30, 62, 86, -2.3908f, 15.8198f, 6.6857f, 5, 12, 1, 0.1f, false));
            this.cube_r30.field_78804_l.add(new ModelBox(this.cube_r30, 66, 0, 0.6092f, 15.8198f, 6.6857f, 5, 12, 1, 0.1f, false));
            this.cube_r30.field_78804_l.add(new ModelBox(this.cube_r30, 66, 15, 0.6092f, 26.8198f, 6.6857f, 5, 4, 1, 0.1f, false));
            this.cube_r30.field_78804_l.add(new ModelBox(this.cube_r30, 52, 68, -2.3908f, 26.8198f, 6.6857f, 5, 4, 1, 0.1f, false));
            this.cube_r31 = new ModelRenderer(this);
            this.cube_r31.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r31);
            setRotationAngle(this.cube_r31, -1.312f, -1.4463f, 1.2636f);
            this.cube_r31.field_78804_l.add(new ModelBox(this.cube_r31, 14, 94, -5.811f, 22.3028f, -6.4364f, 6, 9, 1, 0.1f, false));
            this.cube_r32 = new ModelRenderer(this);
            this.cube_r32.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r32);
            setRotationAngle(this.cube_r32, -2.9186f, -0.53f, 3.0274f);
            this.cube_r32.field_78804_l.add(new ModelBox(this.cube_r32, 29, 45, -0.9131f, 9.276f, 5.3566f, 1, 9, 1, 0.1f, false));
            this.cube_r33 = new ModelRenderer(this);
            this.cube_r33.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r33);
            setRotationAngle(this.cube_r33, -1.4525f, 1.3618f, -1.4008f);
            this.cube_r33.field_78804_l.add(new ModelBox(this.cube_r33, 28, 94, -1.3941f, 9.1968f, -3.1383f, 6, 9, 1, 0.1f, false));
            this.cube_r34 = new ModelRenderer(this);
            this.cube_r34.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r34);
            setRotationAngle(this.cube_r34, -1.1334f, 1.4957f, -1.0841f);
            this.cube_r34.field_78804_l.add(new ModelBox(this.cube_r34, 95, 18, 0.9556f, 16.6545f, -3.2625f, 6, 9, 1, 0.1f, false));
            this.cube_r35 = new ModelRenderer(this);
            this.cube_r35.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r35);
            setRotationAngle(this.cube_r35, -3.0805f, -0.5402f, 3.1102f);
            this.cube_r35.field_78804_l.add(new ModelBox(this.cube_r35, 52, 106, -2.2046f, 16.6849f, 7.4893f, 1, 9, 1, 0.1f, false));
            this.cube_r36 = new ModelRenderer(this);
            this.cube_r36.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r36);
            setRotationAngle(this.cube_r36, -1.312f, 1.4463f, -1.2636f);
            this.cube_r36.field_78804_l.add(new ModelBox(this.cube_r36, 42, 96, -0.0681f, 22.1543f, -3.2238f, 6, 9, 1, 0.1f, false));
            this.cube_r37 = new ModelRenderer(this);
            this.cube_r37.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r37);
            setRotationAngle(this.cube_r37, -2.9758f, -0.5402f, 3.1102f);
            this.cube_r37.field_78804_l.add(new ModelBox(this.cube_r37, 109, 12, -2.2756f, 22.4552f, 5.3217f, 1, 9, 1, 0.1f, false));
            this.cube_r38 = new ModelRenderer(this);
            this.cube_r38.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r38);
            setRotationAngle(this.cube_r38, -1.4525f, -1.3618f, 1.4008f);
            this.cube_r38.field_78804_l.add(new ModelBox(this.cube_r38, 97, 79, -4.493f, 9.3514f, -6.3509f, 6, 9, 1, 0.1f, false));
            this.cube_r39 = new ModelRenderer(this);
            this.cube_r39.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r39);
            setRotationAngle(this.cube_r39, -2.9186f, 0.53f, -3.0274f);
            this.cube_r39.field_78804_l.add(new ModelBox(this.cube_r39, 109, 22, -2.8455f, 9.276f, 7.0142f, 1, 9, 1, 0.1f, false));
            this.cube_r40 = new ModelRenderer(this);
            this.cube_r40.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r40);
            setRotationAngle(this.cube_r40, -1.1334f, -1.4957f, 1.0841f);
            this.cube_r40.field_78804_l.add(new ModelBox(this.cube_r40, 97, 89, -6.8427f, 16.8091f, -6.4752f, 6, 9, 1, 0.1f, false));
            this.cube_r41 = new ModelRenderer(this);
            this.cube_r41.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r41);
            setRotationAngle(this.cube_r41, -3.0805f, 0.5402f, -3.1102f);
            this.cube_r41.field_78804_l.add(new ModelBox(this.cube_r41, 56, 109, -1.554f, 16.6849f, 9.1469f, 1, 9, 1, 0.1f, false));
            this.cube_r42 = new ModelRenderer(this);
            this.cube_r42.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r42);
            setRotationAngle(this.cube_r42, -2.9758f, 0.5402f, -3.1102f);
            this.cube_r42.field_78804_l.add(new ModelBox(this.cube_r42, 60, 109, -1.4831f, 22.6284f, 6.9702f, 1, 9, 1, 0.1f, false));
            this.cube_r43 = new ModelRenderer(this);
            this.cube_r43.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r43);
            setRotationAngle(this.cube_r43, -0.192f, 0.0f, 0.0f);
            this.cube_r43.field_78804_l.add(new ModelBox(this.cube_r43, 84, 100, 0.6092f, 8.476f, -5.8359f, 5, 9, 1, 0.1f, false));
            this.cube_r43.field_78804_l.add(new ModelBox(this.cube_r43, 0, 104, -2.3908f, 8.476f, -5.8359f, 5, 9, 1, 0.1f, false));
            this.cube_r44 = new ModelRenderer(this);
            this.cube_r44.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r44);
            setRotationAngle(this.cube_r44, -0.0873f, 0.0f, 0.0f);
            this.cube_r44.field_78804_l.add(new ModelBox(this.cube_r44, 0, 23, -2.3908f, 15.8198f, -7.6857f, 5, 12, 1, 0.1f, false));
            this.cube_r44.field_78804_l.add(new ModelBox(this.cube_r44, 0, 45, 0.6092f, 15.8198f, -7.6857f, 5, 12, 1, 0.1f, false));
            this.cube_r44.field_78804_l.add(new ModelBox(this.cube_r44, 31, 32, 0.6092f, 26.8198f, -7.6857f, 5, 4, 1, 0.1f, false));
            this.cube_r44.field_78804_l.add(new ModelBox(this.cube_r44, 33, 10, -2.3908f, 26.8198f, -7.6857f, 5, 4, 1, 0.1f, false));
            this.cube_r45 = new ModelRenderer(this);
            this.cube_r45.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r45);
            setRotationAngle(this.cube_r45, -1.5708f, -1.2217f, 1.62f);
            this.cube_r45.field_78804_l.add(new ModelBox(this.cube_r45, 0, 62, -0.4538f, 8.459f, 2.2605f, 4, 7, 1, 0.1f, false));
            this.cube_r46 = new ModelRenderer(this);
            this.cube_r46.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r46);
            setRotationAngle(this.cube_r46, 1.5708f, 1.2217f, 1.62f);
            this.cube_r46.field_78804_l.add(new ModelBox(this.cube_r46, 23, 62, -0.4538f, 8.459f, -3.2605f, 4, 7, 1, 0.1f, false));
            this.cube_r47 = new ModelRenderer(this);
            this.cube_r47.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r47);
            setRotationAngle(this.cube_r47, 0.0f, -1.5708f, -0.0493f);
            this.cube_r47.field_78804_l.add(new ModelBox(this.cube_r47, 94, 8, -3.4823f, 8.9809f, -6.4749f, 6, 9, 1, 0.1f, false));
            this.cube_r47.field_78804_l.add(new ModelBox(this.cube_r47, 0, 94, -3.4823f, 15.9809f, -6.4749f, 6, 9, 1, 0.1f, false));
            this.cube_r47.field_78804_l.add(new ModelBox(this.cube_r47, 44, 86, -4.4823f, 21.9809f, -6.4749f, 8, 9, 1, 0.1f, false));
            this.cube_r48 = new ModelRenderer(this);
            this.cube_r48.func_78793_a(-0.2092f, -13.6276f, -8.6678f);
            this.qunbai.func_78792_a(this.cube_r48);
            setRotationAngle(this.cube_r48, 0.0f, -1.5708f, 0.0f);
            this.cube_r48.field_78804_l.add(new ModelBox(this.cube_r48, 33, 57, -6.9823f, 7.1755f, -6.0105f, 14, 2, 9, 0.1f, false));
            this.zuodatui = new ModelRenderer(this);
            this.zuodatui.func_78793_a(2.85f, 12.0f, 1.65f);
            this.cube_r49 = new ModelRenderer(this);
            this.cube_r49.func_78793_a(0.0f, 0.0f, 0.0f);
            this.zuodatui.func_78792_a(this.cube_r49);
            setRotationAngle(this.cube_r49, 0.0f, -1.5708f, 0.0f);
            this.cube_r49.field_78804_l.add(new ModelBox(this.cube_r49, 79, 81, -2.75f, 0.0f, -2.25f, 4, 12, 5, 0.1f, false));
            this.cube_r49.field_78804_l.add(new ModelBox(this.cube_r49, 37, 73, -2.75f, -6.0f, -2.25f, 5, 6, 5, 0.1f, false));
            this.zuodatui2 = new ModelRenderer(this);
            this.zuodatui2.func_78793_a(-3.05f, 12.0f, 1.65f);
            this.cube_r50 = new ModelRenderer(this);
            this.cube_r50.func_78793_a(0.0f, 0.0f, 0.0f);
            this.zuodatui2.func_78792_a(this.cube_r50);
            setRotationAngle(this.cube_r50, 0.0f, 1.5708f, 0.0f);
            this.cube_r50.field_78804_l.add(new ModelBox(this.cube_r50, 79, 81, -1.25f, 0.0f, -2.25f, 4, 12, 5, 0.1f, true));
            this.cube_r50.field_78804_l.add(new ModelBox(this.cube_r50, 37, 73, -2.25f, -6.0f, -2.25f, 5, 6, 5, 0.1f, true));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.tou.func_78785_a(f5);
            this.shenti.func_78785_a(f5);
            this.zuobi.func_78785_a(f5);
            this.youbi.func_78785_a(f5);
            this.qunbai.func_78785_a(f5);
            this.zuodatui.func_78785_a(f5);
            this.zuodatui2.func_78785_a(f5);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.field_78795_f = x;
            modelRenderer.field_78796_g = y;
            modelRenderer.field_78808_h = z;
        }

        public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
            super.func_78087_a(f, f1, f2, f3, f4, f5, e);
            this.zuobi.field_78795_f = MathHelper.func_76134_b(f * 0.6662f) * f1;
            this.zuodatui2.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
            this.tou.field_78796_g = f3 / 57.295776f;
            this.tou.field_78795_f = f4 / 57.295776f;
            this.zuodatui.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
            this.youbi.field_78795_f = MathHelper.func_76134_b((f * 0.6662f) + 3.1415927f) * f1;
        }
    }
}
