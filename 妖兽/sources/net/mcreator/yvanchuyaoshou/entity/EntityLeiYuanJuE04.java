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
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityLeiYuanJuE04.class */
public class EntityLeiYuanJuE04 extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 90;
    public static final int ENTITYID_RANGED = 91;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityLeiYuanJuE04(ElementsYvanchuyaoshouMod instance) {
        super(instance, 55);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "lei_yuan_ju_e_04"), 90).name("lei_yuan_ju_e_04").tracker(64, 3, true).egg(-10796760, -1398695).build();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modelcaientity17(), 1.0f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityLeiYuanJuE04.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/caientity17.png");
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityLeiYuanJuE04$EntityCustom.class */
    public static class EntityCustom extends EntityMob {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(2.0f, 1.0f);
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
            EntityLeiYuanJuE04.$_dependencies.put("entity", this);
            ProcedureShouJiNbt.executeProcedure(EntityLeiYuanJuE04.$_dependencies);
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
            EntityLeiYuanJuE04.$_dependencies.put("entity", this);
            EntityLeiYuanJuE04.$_dependencies.put("x", Integer.valueOf(x));
            EntityLeiYuanJuE04.$_dependencies.put("y", Integer.valueOf(y));
            EntityLeiYuanJuE04.$_dependencies.put("z", Integer.valueOf(z));
            EntityLeiYuanJuE04.$_dependencies.put("world", this.field_70170_p);
            ProcedureLeiYuanJuEDie.executeProcedure(EntityLeiYuanJuE04.$_dependencies);
        }

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityLeiYuanJuE04.$_dependencies.put("entity", this);
            EntityLeiYuanJuE04.$_dependencies.put("world", this.field_70170_p);
            ProcedureLeiYuanJuEUpdate.executeProcedure(EntityLeiYuanJuE04.$_dependencies);
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

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityLeiYuanJuE04$Modelcaientity17.class */
    public static class Modelcaientity17 extends ModelBase {
        private final ModelRenderer body;
        private final ModelRenderer head;
        private final ModelRenderer rightarm;
        private final ModelRenderer rightarm2;
        private final ModelRenderer leftarm;
        private final ModelRenderer leftarm2;
        private final ModelRenderer rightleg;
        private final ModelRenderer rightleg2;
        private final ModelRenderer leftleg;
        private final ModelRenderer leftleg2;

        public Modelcaientity17() {
            this.field_78090_t = EntityMoXiu02.ENTITYID;
            this.field_78089_u = EntityMoXiu02.ENTITYID;
            this.body = new ModelRenderer(this);
            this.body.func_78793_a(0.0f, 24.0f, 0.0f);
            this.body.field_78804_l.add(new ModelBox(this.body, 32, 44, -10.0f, -17.0f, -8.0f, 20, 14, 16, 0.0f, false));
            this.body.field_78804_l.add(new ModelBox(this.body, 0, 74, -9.0f, -15.0f, 8.0f, 18, 12, 12, 0.0f, false));
            this.body.field_78804_l.add(new ModelBox(this.body, 0, 98, -7.0f, -14.0f, 20.0f, 14, 11, 11, 0.0f, false));
            this.body.field_78804_l.add(new ModelBox(this.body, 60, 74, -5.0f, -13.0f, 31.0f, 10, 9, 11, 0.0f, false));
            this.body.field_78804_l.add(new ModelBox(this.body, 50, 94, -4.0f, -12.0f, 42.0f, 8, 7, 11, 0.0f, false));
            this.body.field_78804_l.add(new ModelBox(this.body, 50, (int) EntitySanXiu01.ENTITYID, -3.0f, -11.0f, 53.0f, 6, 5, 8, 0.0f, false));
            this.body.field_78804_l.add(new ModelBox(this.body, 51, 74, -2.0f, -10.0f, 61.0f, 4, 3, 6, 0.0f, false));
            this.body.field_78804_l.add(new ModelBox(this.body, 44, 20, -9.0f, -16.0f, -20.0f, 18, 12, 12, 0.0f, false));
            this.body.field_78804_l.add(new ModelBox(this.body, 56, 0, -7.0f, -15.0f, -30.0f, 14, 10, 10, 0.0f, false));
            this.head = new ModelRenderer(this);
            this.head.func_78793_a(0.1f, 15.5f, -30.0f);
            this.head.field_78804_l.add(new ModelBox(this.head, 88, 44, -7.1f, -7.5f, -4.0f, 14, 12, 4, 0.0f, false));
            this.head.field_78804_l.add(new ModelBox(this.head, 0, 0, -8.1f, -8.5f, -16.0f, 16, 13, 12, 0.0f, false));
            this.head.field_78804_l.add(new ModelBox(this.head, 0, 25, -6.1f, -5.5f, -20.0f, 12, 10, 4, 0.0f, false));
            this.head.field_78804_l.add(new ModelBox(this.head, 0, 39, -5.1f, -4.5f, -26.0f, 10, 8, 6, 0.0f, false));
            this.head.field_78804_l.add(new ModelBox(this.head, 0, 53, -3.6f, -3.5f, -34.0f, 7, 6, 8, 0.0f, false));
            this.rightarm = new ModelRenderer(this);
            this.rightarm.func_78793_a(-7.0f, 16.0f, -18.0f);
            setRotationAngle(this.rightarm, 0.0f, 0.0f, 0.5236f);
            this.rightarm.field_78804_l.add(new ModelBox(this.rightarm, 94, 64, -5.0f, -2.0f, -5.0f, 5, 10, 10, 0.0f, false));
            this.rightarm2 = new ModelRenderer(this);
            this.rightarm2.func_78793_a(0.0f, 8.0f, 0.0f);
            setRotationAngle(this.rightarm2, 0.0f, 0.3491f, -0.5236f);
            this.rightarm.func_78792_a(this.rightarm2);
            this.rightarm2.field_78804_l.add(new ModelBox(this.rightarm2, 88, 94, -8.0f, -3.0f, -12.0f, 8, 4, 12, 0.0f, false));
            this.leftarm = new ModelRenderer(this);
            this.leftarm.func_78793_a(7.0f, 16.0f, -18.0f);
            setRotationAngle(this.leftarm, 0.0f, 0.0f, -0.5236f);
            this.leftarm.field_78804_l.add(new ModelBox(this.leftarm, 94, 64, 0.0f, -2.0f, -5.0f, 5, 10, 10, 0.0f, false));
            this.leftarm2 = new ModelRenderer(this);
            this.leftarm2.func_78793_a(0.0f, 8.0f, 0.0f);
            setRotationAngle(this.leftarm2, 0.0f, -0.3491f, 0.5236f);
            this.leftarm.func_78792_a(this.leftarm2);
            this.leftarm2.field_78804_l.add(new ModelBox(this.leftarm2, 88, 94, 0.0f, -3.0f, -12.0f, 8, 4, 12, 0.0f, false));
            this.rightleg = new ModelRenderer(this);
            this.rightleg.func_78793_a(-7.0f, 16.0f, 20.0f);
            setRotationAngle(this.rightleg, 0.0f, 0.0f, 0.5236f);
            this.rightleg.field_78804_l.add(new ModelBox(this.rightleg, 94, 64, -5.0f, -2.0f, -5.0f, 5, 10, 10, 0.0f, false));
            this.rightleg2 = new ModelRenderer(this);
            this.rightleg2.func_78793_a(0.0f, 8.0f, 0.0f);
            setRotationAngle(this.rightleg2, 0.0f, 0.5236f, -0.5236f);
            this.rightleg.func_78792_a(this.rightleg2);
            this.rightleg2.field_78804_l.add(new ModelBox(this.rightleg2, 88, 94, -8.0f, -3.0f, -12.0f, 8, 4, 12, 0.0f, false));
            this.leftleg = new ModelRenderer(this);
            this.leftleg.func_78793_a(7.0f, 16.0f, 20.0f);
            setRotationAngle(this.leftleg, 0.0f, 0.0f, -0.5236f);
            this.leftleg.field_78804_l.add(new ModelBox(this.leftleg, 94, 64, 0.0f, -2.0f, -5.0f, 5, 10, 10, 0.0f, false));
            this.leftleg2 = new ModelRenderer(this);
            this.leftleg2.func_78793_a(0.0f, 8.0f, 0.0f);
            setRotationAngle(this.leftleg2, 0.0f, -0.5236f, 0.5236f);
            this.leftleg.func_78792_a(this.leftleg2);
            this.leftleg2.field_78804_l.add(new ModelBox(this.leftleg2, 88, 94, 0.0f, -3.0f, -12.0f, 8, 4, 12, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.body.func_78785_a(f5);
            this.head.func_78785_a(f5);
            this.rightarm.func_78785_a(f5);
            this.leftarm.func_78785_a(f5);
            this.rightleg.func_78785_a(f5);
            this.leftleg.func_78785_a(f5);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.field_78795_f = x;
            modelRenderer.field_78796_g = y;
            modelRenderer.field_78808_h = z;
        }

        public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
            super.func_78087_a(f, f1, f2, f3, f4, f5, e);
            this.head.field_78796_g = f3 / 57.295776f;
            this.head.field_78795_f = f4 / 57.295776f;
            this.rightleg.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
            this.rightarm.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
            this.leftleg.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
            this.leftarm.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
        }
    }
}
