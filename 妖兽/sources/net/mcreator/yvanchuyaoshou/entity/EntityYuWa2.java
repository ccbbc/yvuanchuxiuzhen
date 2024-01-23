package net.mcreator.yvanchuyaoshou.entity;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureShouJiNbt;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureYuWaDie;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureYuWaUpdate;
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
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityYuWa2.class */
public class EntityYuWa2 extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 136;
    public static final int ENTITYID_RANGED = 137;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityYuWa2(ElementsYvanchuyaoshouMod instance) {
        super(instance, 32);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "yu_wa_2"), (int) ENTITYID).name("yu_wa_2").tracker(64, 3, true).egg(-6684673, -16737793).build();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new ModelYvwa(), 0.4f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityYuWa2.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/yuwa.png");
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityYuWa2$EntityCustom.class */
    public static class EntityCustom extends EntityMob {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(0.6f, 1.8f);
            this.field_70728_aV = 15;
            this.field_70178_ae = false;
            func_94061_f(false);
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70715_bh.func_75776_a(1, new EntityAIHurtByTarget(this, true, new Class[0]));
            this.field_70714_bg.func_75776_a(2, new EntityAIAttackMelee(this, 1.2d, true));
            this.field_70714_bg.func_75776_a(3, new EntityAILeapAtTarget(this, 1.0f));
            this.field_70714_bg.func_75776_a(4, new EntityAISwimming(this));
            this.field_70714_bg.func_75776_a(5, new EntityAIWander(this, 1.0d));
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
            EntityYuWa2.$_dependencies.put("entity", this);
            ProcedureShouJiNbt.executeProcedure(EntityYuWa2.$_dependencies);
            return super.func_70097_a(source, amount);
        }

        public void func_70645_a(DamageSource source) {
            super.func_70645_a(source);
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            EntityYuWa2.$_dependencies.put("entity", this);
            EntityYuWa2.$_dependencies.put("x", Integer.valueOf(x));
            EntityYuWa2.$_dependencies.put("y", Integer.valueOf(y));
            EntityYuWa2.$_dependencies.put("z", Integer.valueOf(z));
            EntityYuWa2.$_dependencies.put("world", this.field_70170_p);
            ProcedureYuWaDie.executeProcedure(EntityYuWa2.$_dependencies);
        }

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityYuWa2.$_dependencies.put("entity", this);
            EntityYuWa2.$_dependencies.put("world", this.field_70170_p);
            ProcedureYuWaUpdate.executeProcedure(EntityYuWa2.$_dependencies);
        }

        protected void func_110147_ax() {
            super.func_110147_ax();
            if (func_110148_a(SharedMonsterAttributes.field_188791_g) != null) {
                func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(2.0d);
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

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityYuWa2$ModelYvwa.class */
    public static class ModelYvwa extends ModelBase {
        private final ModelRenderer All;
        private final ModelRenderer shenti;
        private final ModelRenderer weiba;
        private final ModelRenderer weiba2_r1;
        private final ModelRenderer weiba4_r1;
        private final ModelRenderer weiba3_r1;
        private final ModelRenderer weiba2_r2;
        private final ModelRenderer weiba1_r1;
        private final ModelRenderer san;
        private final ModelRenderer sangu;
        private final ModelRenderer weiba7_r1;
        private final ModelRenderer weiba8_r1;
        private final ModelRenderer weiba8_r2;
        private final ModelRenderer weiba6_r1;
        private final ModelRenderer weiba6_r2;
        private final ModelRenderer weiba5_r1;
        private final ModelRenderer weiba6_r3;
        private final ModelRenderer weiba5_r2;
        private final ModelRenderer weiba4_r2;
        private final ModelRenderer weiba3_r2;
        private final ModelRenderer shuidi;
        private final ModelRenderer cube_r1;
        private final ModelRenderer cube_r2;
        private final ModelRenderer yusan;
        private final ModelRenderer yusan_r1;
        private final ModelRenderer qiantui_L;
        private final ModelRenderer qiantui_R;
        private final ModelRenderer houtui_L;
        private final ModelRenderer houtui_R;

        public ModelYvwa() {
            this.field_78090_t = 64;
            this.field_78089_u = 64;
            this.All = new ModelRenderer(this);
            this.All.func_78793_a(0.0f, 20.0f, 0.0f);
            this.shenti = new ModelRenderer(this);
            this.shenti.func_78793_a(0.0f, 0.0f, 0.0f);
            this.All.func_78792_a(this.shenti);
            this.shenti.field_78804_l.add(new ModelBox(this.shenti, 0, 0, -3.0f, -2.0f, -5.0f, 7, 5, 9, 0.0f, false));
            this.shenti.field_78804_l.add(new ModelBox(this.shenti, 1, 20, 1.0f, -4.0f, -4.0f, 3, 2, 3, 0.0f, false));
            this.shenti.field_78804_l.add(new ModelBox(this.shenti, 13, 20, -3.0f, -4.0f, -4.0f, 3, 2, 3, 0.0f, false));
            this.weiba = new ModelRenderer(this);
            this.weiba.func_78793_a(0.0f, 4.0f, 0.0f);
            this.shenti.func_78792_a(this.weiba);
            this.weiba.field_78804_l.add(new ModelBox(this.weiba, 0, 44, 0.0f, -13.3783f, 8.0658f, 1, 2, 1, 0.0f, false));
            this.weiba2_r1 = new ModelRenderer(this);
            this.weiba2_r1.func_78793_a(0.0f, -9.0f, 6.8f);
            this.weiba.func_78792_a(this.weiba2_r1);
            setRotationAngle(this.weiba2_r1, -0.48f, 0.0f, 0.0f);
            this.weiba2_r1.field_78804_l.add(new ModelBox(this.weiba2_r1, 0, 44, 0.0f, -3.3537f, -0.2007f, 1, 4, 1, 0.0f, false));
            this.weiba4_r1 = new ModelRenderer(this);
            this.weiba4_r1.func_78793_a(0.5f, -6.5f, 3.9f);
            this.weiba.func_78792_a(this.weiba4_r1);
            setRotationAngle(this.weiba4_r1, 0.0f, 0.0f, -0.6545f);
            this.weiba4_r1.field_78804_l.add(new ModelBox(this.weiba4_r1, 0, 44, -0.5f, -0.0518f, -0.6376f, 1, 5, 1, 0.0f, false));
            this.weiba3_r1 = new ModelRenderer(this);
            this.weiba3_r1.func_78793_a(0.5f, -6.5f, 3.9f);
            this.weiba.func_78792_a(this.weiba3_r1);
            setRotationAngle(this.weiba3_r1, 0.0f, 0.0f, 0.6109f);
            this.weiba3_r1.field_78804_l.add(new ModelBox(this.weiba3_r1, 0, 44, -0.5f, -0.0518f, -0.6376f, 1, 5, 1, 0.0f, false));
            this.weiba2_r2 = new ModelRenderer(this);
            this.weiba2_r2.func_78793_a(0.0f, -9.0f, 5.9f);
            this.weiba.func_78792_a(this.weiba2_r2);
            setRotationAngle(this.weiba2_r2, -1.5708f, 0.0f, 0.0f);
            this.weiba2_r2.field_78804_l.add(new ModelBox(this.weiba2_r2, 0, 44, 0.0f, 2.4482f, 2.4624f, 1, 7, 2, 0.0f, false));
            this.weiba1_r1 = new ModelRenderer(this);
            this.weiba1_r1.func_78793_a(0.0f, -6.0f, 3.9f);
            this.weiba.func_78792_a(this.weiba1_r1);
            setRotationAngle(this.weiba1_r1, -0.9948f, 0.0f, 0.0f);
            this.weiba1_r1.field_78804_l.add(new ModelBox(this.weiba1_r1, 0, 44, 0.0f, -4.1148f, -1.0898f, 1, 6, 1, 0.0f, false));
            this.san = new ModelRenderer(this);
            this.san.func_78793_a(0.5f, -12.4f, 7.0f);
            this.weiba.func_78792_a(this.san);
            setRotationAngle(this.san, 0.0873f, 0.0f, 0.0f);
            this.sangu = new ModelRenderer(this);
            this.sangu.func_78793_a(-0.75f, 12.4f, -7.0f);
            this.san.func_78792_a(this.sangu);
            this.weiba7_r1 = new ModelRenderer(this);
            this.weiba7_r1.func_78793_a(1.0f, -11.0f, -8.2f);
            this.sangu.func_78792_a(this.weiba7_r1);
            setRotationAngle(this.weiba7_r1, 1.7468f, 0.1289f, 0.0229f);
            this.weiba7_r1.field_78804_l.add(new ModelBox(this.weiba7_r1, 0, 44, -0.3234f, -4.2064f, -0.9976f, 1, 5, 1, 0.0f, false));
            this.weiba8_r1 = new ModelRenderer(this);
            this.weiba8_r1.func_78793_a(1.0f, -11.0f, -1.2f);
            this.sangu.func_78792_a(this.weiba8_r1);
            setRotationAngle(this.weiba8_r1, 1.8055f, 0.7279f, 0.1578f);
            this.weiba8_r1.field_78804_l.add(new ModelBox(this.weiba8_r1, 0, 44, 0.2757f, -6.2739f, 0.2179f, 1, 5, 1, 0.0f, false));
            this.weiba8_r2 = new ModelRenderer(this);
            this.weiba8_r2.func_78793_a(1.0f, -11.0f, -1.2f);
            this.sangu.func_78792_a(this.weiba8_r2);
            setRotationAngle(this.weiba8_r2, 1.7769f, -0.5576f, -0.1102f);
            this.weiba8_r2.field_78804_l.add(new ModelBox(this.weiba8_r2, 0, 44, -2.7243f, -6.8739f, 0.2179f, 1, 3, 1, 0.0f, false));
            this.weiba8_r2.field_78804_l.add(new ModelBox(this.weiba8_r2, 0, 44, 0.2757f, -3.5739f, 0.2179f, 1, 5, 1, 0.0f, false));
            this.weiba6_r1 = new ModelRenderer(this);
            this.weiba6_r1.func_78793_a(1.0f, -11.0f, -2.2f);
            this.sangu.func_78792_a(this.weiba6_r1);
            setRotationAngle(this.weiba6_r1, 1.746f, -0.0859f, -0.0152f);
            this.weiba6_r1.field_78804_l.add(new ModelBox(this.weiba6_r1, 0, 44, -0.6384f, -5.2928f, 0.0443f, 1, 6, 1, 0.0f, false));
            this.weiba6_r2 = new ModelRenderer(this);
            this.weiba6_r2.func_78793_a(1.0f, -13.0f, 1.8f);
            this.sangu.func_78792_a(this.weiba6_r2);
            setRotationAngle(this.weiba6_r2, 1.746f, 0.0859f, 0.0152f);
            this.weiba6_r2.field_78804_l.add(new ModelBox(this.weiba6_r2, 0, 44, -0.4086f, -3.6724f, -1.2307f, 1, 4, 1, 0.0f, false));
            this.weiba5_r1 = new ModelRenderer(this);
            this.weiba5_r1.func_78793_a(1.0f, -13.0f, 1.8f);
            this.sangu.func_78792_a(this.weiba5_r1);
            setRotationAngle(this.weiba5_r1, 2.0026f, 1.1429f, 0.397f);
            this.weiba5_r1.field_78804_l.add(new ModelBox(this.weiba5_r1, 0, 44, -0.4086f, -5.6724f, -1.2307f, 1, 6, 1, 0.0f, false));
            this.weiba6_r3 = new ModelRenderer(this);
            this.weiba6_r3.func_78793_a(0.7f, -14.0f, 7.1f);
            this.sangu.func_78792_a(this.weiba6_r3);
            setRotationAngle(this.weiba6_r3, 2.0026f, 1.1429f, 0.397f);
            this.weiba6_r3.field_78804_l.add(new ModelBox(this.weiba6_r3, 0, 44, -0.2613f, -4.9697f, -1.5209f, 1, 5, 1, 0.0f, true));
            this.weiba5_r2 = new ModelRenderer(this);
            this.weiba5_r2.func_78793_a(1.0f, -14.0f, 5.8f);
            this.sangu.func_78792_a(this.weiba5_r2);
            setRotationAngle(this.weiba5_r2, 1.869f, -0.9386f, -0.2431f);
            this.weiba5_r2.field_78804_l.add(new ModelBox(this.weiba5_r2, 0, 44, -0.7387f, -4.9697f, -1.5209f, 1, 5, 1, 0.0f, false));
            this.weiba4_r2 = new ModelRenderer(this);
            this.weiba4_r2.func_78793_a(0.0f, -14.0f, 8.8f);
            this.sangu.func_78792_a(this.weiba4_r2);
            setRotationAngle(this.weiba4_r2, 1.746f, -0.0859f, -0.0152f);
            this.weiba4_r2.field_78804_l.add(new ModelBox(this.weiba4_r2, 0, 44, 0.0f, -7.0f, -1.0f, 1, 4, 1, 0.0f, false));
            this.weiba3_r2 = new ModelRenderer(this);
            this.weiba3_r2.func_78793_a(0.0f, -14.0f, 8.8f);
            this.sangu.func_78792_a(this.weiba3_r2);
            setRotationAngle(this.weiba3_r2, 1.7454f, -0.0172f, -0.003f);
            this.weiba3_r2.field_78804_l.add(new ModelBox(this.weiba3_r2, 0, 44, 0.2f, -3.1f, -1.0f, 1, 7, 1, 0.0f, false));
            this.shuidi = new ModelRenderer(this);
            this.shuidi.func_78793_a(1.25f, 4.25f, -18.75f);
            this.san.func_78792_a(this.shuidi);
            setRotationAngle(this.shuidi, 0.1509f, 0.1325f, 0.0646f);
            this.cube_r1 = new ModelRenderer(this);
            this.cube_r1.func_78793_a(-0.5f, -2.0f, 1.5f);
            this.shuidi.func_78792_a(this.cube_r1);
            setRotationAngle(this.cube_r1, -1.5272f, 0.0f, 0.0f);
            this.cube_r1.field_78804_l.add(new ModelBox(this.cube_r1, 13, 46, -1.25f, 0.0f, -0.65f, 1, 1, 1, 0.0f, false));
            this.cube_r2 = new ModelRenderer(this);
            this.cube_r2.func_78793_a(-1.0f, 0.0f, 1.0f);
            this.shuidi.func_78792_a(this.cube_r2);
            setRotationAngle(this.cube_r2, -0.1731f, -0.0227f, -0.0853f);
            this.cube_r2.field_78804_l.add(new ModelBox(this.cube_r2, 13, 47, 0.2f, -2.25f, -1.4f, 1, 2, 1, 0.0f, false));
            this.yusan = new ModelRenderer(this);
            this.yusan.func_78793_a(0.0f, 0.0f, 0.0f);
            this.san.func_78792_a(this.yusan);
            this.yusan_r1 = new ModelRenderer(this);
            this.yusan_r1.func_78793_a(-0.5f, 0.0f, -4.0f);
            this.yusan.func_78792_a(this.yusan_r1);
            setRotationAngle(this.yusan_r1, 0.1745f, 0.0f, 0.0f);
            this.yusan_r1.field_78804_l.add(new ModelBox(this.yusan_r1, 44, 26, -1.0f, 0.0f, -15.0f, 3, 0, 2, 0.0f, false));
            this.yusan_r1.field_78804_l.add(new ModelBox(this.yusan_r1, 42, 28, -2.0f, 0.0f, -13.0f, 5, 0, 2, 0.0f, false));
            this.yusan_r1.field_78804_l.add(new ModelBox(this.yusan_r1, 40, 30, -3.0f, 0.0f, -11.0f, 7, 0, 2, 0.0f, false));
            this.yusan_r1.field_78804_l.add(new ModelBox(this.yusan_r1, 39, 48, -3.0f, 0.0f, 7.0f, 7, 0, 3, 0.0f, false));
            this.yusan_r1.field_78804_l.add(new ModelBox(this.yusan_r1, 37, 45, -4.0f, 0.0f, 4.0f, 9, 0, 3, 0.0f, false));
            this.yusan_r1.field_78804_l.add(new ModelBox(this.yusan_r1, 29, 36, -5.0f, 0.0f, -5.0f, 11, 0, 9, 0.0f, false));
            this.yusan_r1.field_78804_l.add(new ModelBox(this.yusan_r1, 36, 32, -4.0f, 0.0f, -9.0f, 9, 0, 4, 0.0f, false));
            this.qiantui_L = new ModelRenderer(this);
            this.qiantui_L.func_78793_a(5.0f, 4.0f, 2.0f);
            this.All.func_78792_a(this.qiantui_L);
            this.qiantui_L.field_78804_l.add(new ModelBox(this.qiantui_L, 7, 33, -1.5f, -3.0f, -6.5f, 2, 3, 3, 0.0f, false));
            this.qiantui_L.field_78804_l.add(new ModelBox(this.qiantui_L, -3, 4, -3.5f, 0.0f, -9.0f, 4, 0, 3, 0.0f, false));
            this.qiantui_R = new ModelRenderer(this);
            this.qiantui_R.func_78793_a(-4.0f, 4.0f, 2.0f);
            this.All.func_78792_a(this.qiantui_R);
            this.qiantui_R.field_78804_l.add(new ModelBox(this.qiantui_R, 7, 33, -0.5f, -3.0f, -6.5f, 2, 3, 3, 0.0f, false));
            this.qiantui_R.field_78804_l.add(new ModelBox(this.qiantui_R, -3, 0, -0.5f, 0.0f, -9.0f, 4, 0, 3, 0.0f, false));
            this.houtui_L = new ModelRenderer(this);
            this.houtui_L.func_78793_a(0.0f, 4.0f, 0.0f);
            this.All.func_78792_a(this.houtui_L);
            this.houtui_L.field_78804_l.add(new ModelBox(this.houtui_L, 35, 7, 2.0f, -3.0f, 1.0f, 4, 3, 4, 0.0f, false));
            this.houtui_L.field_78804_l.add(new ModelBox(this.houtui_L, 29, 2, 5.0f, 0.0f, 0.0f, 3, 0, 4, 0.0f, false));
            this.houtui_R = new ModelRenderer(this);
            this.houtui_R.func_78793_a(1.0f, 4.0f, 0.0f);
            this.All.func_78792_a(this.houtui_R);
            this.houtui_R.field_78804_l.add(new ModelBox(this.houtui_R, 35, 7, -6.0f, -3.0f, 1.0f, 4, 3, 4, 0.0f, false));
            this.houtui_R.field_78804_l.add(new ModelBox(this.houtui_R, 35, 2, -8.0f, 0.0f, 0.0f, 3, 0, 4, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.All.func_78785_a(f5);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.field_78795_f = x;
            modelRenderer.field_78796_g = y;
            modelRenderer.field_78808_h = z;
        }

        public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
            super.func_78087_a(f, f1, f2, f3, f4, f5, e);
        }
    }
}
