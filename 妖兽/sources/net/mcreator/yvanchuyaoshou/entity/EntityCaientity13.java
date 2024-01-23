package net.mcreator.yvanchuyaoshou.entity;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureShiJuRenDie;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureShiJuRenUpdate;
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
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.projectile.EntityArrow;
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
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity13.class */
public class EntityCaientity13 extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 19;
    public static final int ENTITYID_RANGED = 20;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityCaientity13(ElementsYvanchuyaoshouMod instance) {
        super(instance, 43);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "caientity13"), 19).name("caientity13").tracker((int) EntityMoXiu02.ENTITYID, 3, true).egg(-10066330, -13108).build();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modelcaientity13(), 1.5f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityCaientity13.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/caientity13.png");
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity13$EntityCustom.class */
    public static class EntityCustom extends EntityMob {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(1.5f, 3.3f);
            this.field_70728_aV = 20;
            this.field_70178_ae = true;
            func_94061_f(false);
            func_110163_bv();
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70714_bg.func_75776_a(1, new EntityAIWander(this, 0.8d));
            this.field_70715_bh.func_75776_a(2, new EntityAIHurtByTarget(this, false, new Class[0]));
            this.field_70714_bg.func_75776_a(3, new EntityAIAttackMelee(this, 0.8d, false));
        }

        public EnumCreatureAttribute func_70668_bt() {
            return EnumCreatureAttribute.UNDEFINED;
        }

        protected boolean func_70692_ba() {
            return false;
        }

        protected Item func_146068_u() {
            return null;
        }

        public SoundEvent func_184639_G() {
            return (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("yvanchuyaoshou:caientity13"));
        }

        public SoundEvent func_184601_bQ(DamageSource ds) {
            return (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("entity.generic.hurt"));
        }

        public SoundEvent func_184615_bR() {
            return (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation("yvanchuyaoshou:caientity13"));
        }

        protected float func_70599_aP() {
            return 1.0f;
        }

        public boolean func_70097_a(DamageSource source, float amount) {
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            source.func_76346_g();
            EntityCaientity13.$_dependencies.put("entity", this);
            ProcedureShouJiNbt.executeProcedure(EntityCaientity13.$_dependencies);
            if ((source.func_76364_f() instanceof EntityArrow) || (source.func_76364_f() instanceof EntityPotion) || source == DamageSource.field_76379_h) {
                return false;
            }
            return super.func_70097_a(source, amount);
        }

        public void func_70645_a(DamageSource source) {
            super.func_70645_a(source);
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            EntityCaientity13.$_dependencies.put("entity", this);
            EntityCaientity13.$_dependencies.put("x", Integer.valueOf(x));
            EntityCaientity13.$_dependencies.put("y", Integer.valueOf(y));
            EntityCaientity13.$_dependencies.put("z", Integer.valueOf(z));
            EntityCaientity13.$_dependencies.put("world", this.field_70170_p);
            ProcedureShiJuRenDie.executeProcedure(EntityCaientity13.$_dependencies);
        }

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityCaientity13.$_dependencies.put("entity", this);
            EntityCaientity13.$_dependencies.put("world", this.field_70170_p);
            ProcedureShiJuRenUpdate.executeProcedure(EntityCaientity13.$_dependencies);
        }

        protected void func_110147_ax() {
            super.func_110147_ax();
            if (func_110148_a(SharedMonsterAttributes.field_188791_g) != null) {
                func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(8.0d);
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

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity13$Modelcaientity13.class */
    public static class Modelcaientity13 extends ModelBase {
        private final ModelRenderer rightleg;
        private final ModelRenderer leftleg;
        private final ModelRenderer body;
        private final ModelRenderer rightarm;
        private final ModelRenderer rightarm2;
        private final ModelRenderer rightarm3;
        private final ModelRenderer rightarm4;

        public Modelcaientity13() {
            this.field_78090_t = EntityGuLang0401.ENTITYID;
            this.field_78089_u = 66;
            this.rightleg = new ModelRenderer(this);
            this.rightleg.func_78793_a(-2.0f, 4.0f, 0.0f);
            this.rightleg.field_78804_l.add(new ModelBox(this.rightleg, 62, 40, -11.0f, 6.0f, -6.0f, 12, 14, 12, 0.0f, false));
            this.rightleg.field_78804_l.add(new ModelBox(this.rightleg, (int) EntitySanXiu03.ENTITYID, 28, -8.0f, -2.0f, -4.0f, 8, 8, 8, 0.0f, false));
            this.leftleg = new ModelRenderer(this);
            this.leftleg.func_78793_a(2.0f, 4.0f, 0.0f);
            this.leftleg.field_78804_l.add(new ModelBox(this.leftleg, 62, 40, -1.0f, 6.0f, -6.0f, 12, 14, 12, 0.0f, false));
            this.leftleg.field_78804_l.add(new ModelBox(this.leftleg, (int) EntitySanXiu03.ENTITYID, 28, 0.0f, -2.0f, -4.0f, 8, 8, 8, 0.0f, false));
            this.body = new ModelRenderer(this);
            this.body.func_78793_a(0.0f, 24.0f, 0.0f);
            this.body.field_78804_l.add(new ModelBox(this.body, 0, 48, -6.0f, -24.0f, -6.0f, 12, 6, 12, 0.0f, false));
            this.body.field_78804_l.add(new ModelBox(this.body, 0, 28, -8.0f, -30.0f, -7.0f, 16, 6, 14, 0.0f, false));
            this.body.field_78804_l.add(new ModelBox(this.body, 0, 0, -10.0f, -40.0f, -9.0f, 20, 10, 18, 0.0f, false));
            this.rightarm = new ModelRenderer(this);
            this.rightarm.func_78793_a(-10.0f, -16.0f, 0.5f);
            setRotationAngle(this.rightarm, 0.0f, 0.0f, 0.0873f);
            this.rightarm.field_78804_l.add(new ModelBox(this.rightarm, (int) EntitySanXiu03.ENTITYID, 0, -8.0f, 0.0f, -3.5f, 8, 20, 8, 0.0f, false));
            this.rightarm2 = new ModelRenderer(this);
            this.rightarm2.func_78793_a(0.0f, 0.0f, 0.5f);
            setRotationAngle(this.rightarm2, 0.0f, 0.0f, 0.1745f);
            this.rightarm.func_78792_a(this.rightarm2);
            this.rightarm2.field_78804_l.add(new ModelBox(this.rightarm2, 76, 0, -10.0f, -2.0f, -5.0f, 10, 10, 10, 0.0f, false));
            this.rightarm3 = new ModelRenderer(this);
            this.rightarm3.func_78793_a(10.0f, -16.0f, 0.5f);
            setRotationAngle(this.rightarm3, 0.0f, 0.0f, -0.0873f);
            this.rightarm3.field_78804_l.add(new ModelBox(this.rightarm3, (int) EntitySanXiu03.ENTITYID_RANGED, 0, 0.0f, 0.0f, -3.5f, 8, 20, 8, 0.0f, false));
            this.rightarm4 = new ModelRenderer(this);
            this.rightarm4.func_78793_a(0.0f, 0.0f, 0.5f);
            setRotationAngle(this.rightarm4, 0.0f, 0.0f, -0.1745f);
            this.rightarm3.func_78792_a(this.rightarm4);
            this.rightarm4.field_78804_l.add(new ModelBox(this.rightarm4, 76, 20, 0.0f, -2.0f, -5.0f, 10, 10, 10, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.rightleg.func_78785_a(f5);
            this.leftleg.func_78785_a(f5);
            this.body.func_78785_a(f5);
            this.rightarm.func_78785_a(f5);
            this.rightarm3.func_78785_a(f5);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.field_78795_f = x;
            modelRenderer.field_78796_g = y;
            modelRenderer.field_78808_h = z;
        }

        public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
            super.func_78087_a(f, f1, f2, f3, f4, f5, e);
            this.rightleg.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
            this.rightarm.field_78795_f = MathHelper.func_76134_b((f * 0.6662f) + 3.1415927f) * f1;
            this.leftleg.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
            this.rightarm3.field_78795_f = MathHelper.func_76134_b(f * 0.6662f) * f1;
        }
    }
}
