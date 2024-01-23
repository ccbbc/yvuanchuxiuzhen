package net.mcreator.yvanchuyaoshou.entity;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureLvNiDie;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureLvNiUpdate;
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
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
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
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityLvNi.class */
public class EntityLvNi extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 196;
    public static final int ENTITYID_RANGED = 197;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityLvNi(ElementsYvanchuyaoshouMod instance) {
        super(instance, 28);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "lv_ni"), (int) ENTITYID).name("lv_ni").tracker(64, 3, true).egg(-6697984, -10040320).build();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new ModelLvNi(), 0.5f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityLvNi.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/lv_ni.png");
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityLvNi$EntityCustom.class */
    public static class EntityCustom extends EntityMob {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(1.0f, 1.0f);
            this.field_70728_aV = 8;
            this.field_70178_ae = false;
            func_94061_f(false);
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70715_bh.func_75776_a(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true, true));
            this.field_70715_bh.func_75776_a(2, new EntityAIHurtByTarget(this, true, new Class[0]));
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
            EntityLvNi.$_dependencies.put("entity", this);
            ProcedureShouJiNbt.executeProcedure(EntityLvNi.$_dependencies);
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
            EntityLvNi.$_dependencies.put("entity", this);
            EntityLvNi.$_dependencies.put("x", Integer.valueOf(x));
            EntityLvNi.$_dependencies.put("y", Integer.valueOf(y));
            EntityLvNi.$_dependencies.put("z", Integer.valueOf(z));
            EntityLvNi.$_dependencies.put("world", this.field_70170_p);
            ProcedureLvNiDie.executeProcedure(EntityLvNi.$_dependencies);
        }

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityLvNi.$_dependencies.put("entity", this);
            EntityLvNi.$_dependencies.put("world", this.field_70170_p);
            ProcedureLvNiUpdate.executeProcedure(EntityLvNi.$_dependencies);
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
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityLvNi$ModelLvNi.class */
    public static class ModelLvNi extends ModelBase {
        private final ModelRenderer Body;
        private final ModelRenderer BodyRight_r1;
        private final ModelRenderer HornLeft;
        private final ModelRenderer Horn_r1;
        private final ModelRenderer Horn_r2;
        private final ModelRenderer Horn_r3;
        private final ModelRenderer HornRight;
        private final ModelRenderer Horn_r4;
        private final ModelRenderer Horn_r5;
        private final ModelRenderer Horn_r6;
        private final ModelRenderer bb_main;
        private final ModelRenderer LvNiCore_r1;

        public ModelLvNi() {
            this.field_78090_t = 64;
            this.field_78089_u = 64;
            this.Body = new ModelRenderer(this);
            this.Body.func_78793_a(4.05f, 7.549f, -5.0581f);
            this.BodyRight_r1 = new ModelRenderer(this);
            this.BodyRight_r1.func_78793_a(-6.0f, 9.051f, 4.8581f);
            this.Body.func_78792_a(this.BodyRight_r1);
            setRotationAngle(this.BodyRight_r1, 0.0f, -1.5708f, 0.0f);
            this.BodyRight_r1.field_78804_l.add(new ModelBox(this.BodyRight_r1, 14, 15, -7.35f, -7.6f, 5.0f, 15, 15, 2, 0.0f, true));
            this.BodyRight_r1.field_78804_l.add(new ModelBox(this.BodyRight_r1, 14, 15, -7.35f, -7.6f, -11.0f, 15, 15, 2, 0.0f, false));
            this.BodyRight_r1.field_78804_l.add(new ModelBox(this.BodyRight_r1, 15, 1, 8.25f, -7.6f, -9.5f, 1, 15, 15, 0.0f, false));
            this.BodyRight_r1.field_78804_l.add(new ModelBox(this.BodyRight_r1, 0, 0, -7.75f, -8.6f, -10.0f, 16, 16, 16, 0.0f, false));
            this.HornLeft = new ModelRenderer(this);
            this.HornLeft.func_78793_a(4.05f, 8.449f, -4.3581f);
            this.Horn_r1 = new ModelRenderer(this);
            this.Horn_r1.func_78793_a(1.7728f, -2.6328f, 9.8891f);
            this.HornLeft.func_78792_a(this.Horn_r1);
            setRotationAngle(this.Horn_r1, 1.2821f, -1.0747f, -1.3478f);
            this.Horn_r1.field_78804_l.add(new ModelBox(this.Horn_r1, 19, 4, -2.3f, -2.9f, 0.0f, 5, 1, 1, 0.0f, false));
            this.Horn_r1.field_78804_l.add(new ModelBox(this.Horn_r1, 19, 4, -2.3f, -3.0f, -0.5f, 3, 2, 2, 0.0f, false));
            this.Horn_r2 = new ModelRenderer(this);
            this.Horn_r2.func_78793_a(0.2882f, -1.0115f, 2.346f);
            this.HornLeft.func_78792_a(this.Horn_r2);
            setRotationAngle(this.Horn_r2, 1.1423f, -1.2386f, -1.1956f);
            this.Horn_r2.field_78804_l.add(new ModelBox(this.Horn_r2, 19, 4, 2.9f, -2.2f, -1.4f, 3, 3, 3, 0.0f, false));
            this.Horn_r2.field_78804_l.add(new ModelBox(this.Horn_r2, 19, 4, -1.1f, -2.2f, -1.9f, 4, 4, 4, 0.0f, false));
            this.Horn_r3 = new ModelRenderer(this);
            this.Horn_r3.func_78793_a(0.0f, 0.0f, 0.0f);
            this.HornLeft.func_78792_a(this.Horn_r3);
            setRotationAngle(this.Horn_r3, 1.3444f, -0.9227f, -1.4216f);
            this.Horn_r3.field_78804_l.add(new ModelBox(this.Horn_r3, 19, 4, -2.0f, -1.9f, -2.0f, 4, 4, 5, 0.0f, false));
            this.HornRight = new ModelRenderer(this);
            this.HornRight.func_78793_a(-4.05f, 8.449f, -4.3581f);
            this.Horn_r4 = new ModelRenderer(this);
            this.Horn_r4.func_78793_a(-1.7728f, -2.6328f, 9.8891f);
            this.HornRight.func_78792_a(this.Horn_r4);
            setRotationAngle(this.Horn_r4, 1.2821f, 1.0747f, 1.3478f);
            this.Horn_r4.field_78804_l.add(new ModelBox(this.Horn_r4, 19, 4, -2.7f, -2.9f, 0.0f, 5, 1, 1, 0.0f, true));
            this.Horn_r4.field_78804_l.add(new ModelBox(this.Horn_r4, 19, 4, -0.7f, -3.0f, -0.5f, 3, 2, 2, 0.0f, true));
            this.Horn_r5 = new ModelRenderer(this);
            this.Horn_r5.func_78793_a(-0.2882f, -1.0115f, 2.346f);
            this.HornRight.func_78792_a(this.Horn_r5);
            setRotationAngle(this.Horn_r5, 1.1423f, 1.2386f, 1.1956f);
            this.Horn_r5.field_78804_l.add(new ModelBox(this.Horn_r5, 19, 4, -5.9f, -2.2f, -1.4f, 3, 3, 3, 0.0f, true));
            this.Horn_r5.field_78804_l.add(new ModelBox(this.Horn_r5, 19, 4, -2.9f, -2.2f, -1.9f, 4, 4, 4, 0.0f, true));
            this.Horn_r6 = new ModelRenderer(this);
            this.Horn_r6.func_78793_a(0.0f, 0.0f, 0.0f);
            this.HornRight.func_78792_a(this.Horn_r6);
            setRotationAngle(this.Horn_r6, 1.3444f, 0.9227f, 1.4216f);
            this.Horn_r6.field_78804_l.add(new ModelBox(this.Horn_r6, 19, 4, -2.0f, -1.9f, -2.0f, 4, 4, 5, 0.0f, true));
            this.bb_main = new ModelRenderer(this);
            this.bb_main.func_78793_a(0.0f, 24.0f, 0.0f);
            this.LvNiCore_r1 = new ModelRenderer(this);
            this.LvNiCore_r1.func_78793_a(-1.95f, -7.4f, -0.2f);
            this.bb_main.func_78792_a(this.LvNiCore_r1);
            setRotationAngle(this.LvNiCore_r1, 0.0f, -1.5708f, 0.0f);
            this.LvNiCore_r1.field_78804_l.add(new ModelBox(this.LvNiCore_r1, 8, 35, -2.45f, -3.0f, -4.9f, 6, 6, 6, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.Body.func_78785_a(f5);
            this.HornLeft.func_78785_a(f5);
            this.HornRight.func_78785_a(f5);
            this.bb_main.func_78785_a(f5);
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
