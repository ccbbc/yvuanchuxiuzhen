package net.mcreator.yvanchuyaoshou.entity;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureHunTieShouDie;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureHunTieShouUpdate;
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
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
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
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityHunTieShou04.class */
public class EntityHunTieShou04 extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 186;
    public static final int ENTITYID_RANGED = 187;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityHunTieShou04(ElementsYvanchuyaoshouMod instance) {
        super(instance, 86);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "hun_tie_shou_04"), (int) ENTITYID).name("hun_tie_shou_04").tracker((int) EntityMoXiu02.ENTITYID, 3, true).egg(-13421773, -6750208).build();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modelhun_tie_shou(), 1.2f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityHunTieShou04.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/hun_tie_shou.png");
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityHunTieShou04$EntityCustom.class */
    public static class EntityCustom extends EntityMob {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(1.2f, 1.0f);
            this.field_70728_aV = 20;
            this.field_70178_ae = true;
            func_94061_f(false);
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70714_bg.func_75776_a(1, new EntityAIPanic(this, 0.8d));
            this.field_70715_bh.func_75776_a(2, new EntityAIHurtByTarget(this, true, new Class[0]));
            this.field_70714_bg.func_75776_a(3, new EntityAIAttackMelee(this, 0.8d, true));
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
            EntityHunTieShou04.$_dependencies.put("entity", this);
            ProcedureShouJiNbt.executeProcedure(EntityHunTieShou04.$_dependencies);
            if ((source.func_76364_f() instanceof EntityArrow) || (source.func_76364_f() instanceof EntityPotion) || source == DamageSource.field_76379_h || source == DamageSource.field_76369_e) {
                return false;
            }
            return super.func_70097_a(source, amount);
        }

        public void func_70645_a(DamageSource source) {
            super.func_70645_a(source);
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            EntityHunTieShou04.$_dependencies.put("entity", this);
            EntityHunTieShou04.$_dependencies.put("x", Integer.valueOf(x));
            EntityHunTieShou04.$_dependencies.put("y", Integer.valueOf(y));
            EntityHunTieShou04.$_dependencies.put("z", Integer.valueOf(z));
            EntityHunTieShou04.$_dependencies.put("world", this.field_70170_p);
            ProcedureHunTieShouDie.executeProcedure(EntityHunTieShou04.$_dependencies);
        }

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityHunTieShou04.$_dependencies.put("entity", this);
            EntityHunTieShou04.$_dependencies.put("world", this.field_70170_p);
            ProcedureHunTieShouUpdate.executeProcedure(EntityHunTieShou04.$_dependencies);
        }

        protected void func_110147_ax() {
            super.func_110147_ax();
            if (func_110148_a(SharedMonsterAttributes.field_188791_g) != null) {
                func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(4.0d);
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

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityHunTieShou04$Modelhun_tie_shou.class */
    public static class Modelhun_tie_shou extends ModelBase {
        private final ModelRenderer right_hand;
        private final ModelRenderer cube_r1;
        private final ModelRenderer left_hand;
        private final ModelRenderer cube_r2;
        private final ModelRenderer right_leg;
        private final ModelRenderer cube_r3;
        private final ModelRenderer left_leg;
        private final ModelRenderer cube_r4;
        private final ModelRenderer bb_main;

        public Modelhun_tie_shou() {
            this.field_78090_t = 84;
            this.field_78089_u = 80;
            this.right_hand = new ModelRenderer(this);
            this.right_hand.func_78793_a(0.0f, 24.0f, 0.0f);
            this.right_hand.field_78804_l.add(new ModelBox(this.right_hand, 35, 9, -13.0f, -17.0f, -14.0f, 9, 17, 1, 0.0f, false));
            this.right_hand.field_78804_l.add(new ModelBox(this.right_hand, 52, 60, -12.0f, -12.0f, -13.0f, 8, 12, 8, 0.0f, false));
            this.cube_r1 = new ModelRenderer(this);
            this.cube_r1.func_78793_a(-29.0f, 0.0f, -13.0f);
            this.right_hand.func_78792_a(this.cube_r1);
            setRotationAngle(this.cube_r1, 0.0f, -1.5708f, 0.0f);
            this.cube_r1.field_78804_l.add(new ModelBox(this.cube_r1, 52, 9, -1.0f, -17.0f, -17.0f, 9, 17, 1, 0.0f, false));
            this.left_hand = new ModelRenderer(this);
            this.left_hand.func_78793_a(-1.0f, 24.0f, 0.0f);
            setRotationAngle(this.left_hand, 0.0f, -1.5708f, 0.0f);
            this.left_hand.field_78804_l.add(new ModelBox(this.left_hand, 35, 9, -14.0f, -17.0f, -14.0f, 9, 17, 1, 0.0f, false));
            this.left_hand.field_78804_l.add(new ModelBox(this.left_hand, 52, 60, -13.0f, -12.0f, -13.0f, 8, 12, 8, 0.0f, false));
            this.cube_r2 = new ModelRenderer(this);
            this.cube_r2.func_78793_a(-30.0f, 0.0f, -13.0f);
            this.left_hand.func_78792_a(this.cube_r2);
            setRotationAngle(this.cube_r2, 0.0f, -1.5708f, 0.0f);
            this.cube_r2.field_78804_l.add(new ModelBox(this.cube_r2, 52, 9, -1.0f, -17.0f, -17.0f, 9, 17, 1, 0.0f, false));
            this.right_leg = new ModelRenderer(this);
            this.right_leg.func_78793_a(-17.0f, 24.0f, 1.0f);
            setRotationAngle(this.right_leg, 0.0f, 1.5708f, 0.0f);
            this.right_leg.field_78804_l.add(new ModelBox(this.right_leg, 35, 9, -13.0f, -17.0f, 4.0f, 9, 17, 1, 0.0f, false));
            this.right_leg.field_78804_l.add(new ModelBox(this.right_leg, 52, 60, -12.0f, -12.0f, 5.0f, 8, 12, 8, 0.0f, false));
            this.cube_r3 = new ModelRenderer(this);
            this.cube_r3.func_78793_a(-29.0f, 0.0f, 5.0f);
            this.right_leg.func_78792_a(this.cube_r3);
            setRotationAngle(this.cube_r3, 0.0f, -1.5708f, 0.0f);
            this.cube_r3.field_78804_l.add(new ModelBox(this.cube_r3, 52, 9, -1.0f, -17.0f, -17.0f, 9, 17, 1, 0.0f, false));
            this.left_leg = new ModelRenderer(this);
            this.left_leg.func_78793_a(17.0f, 24.0f, 0.0f);
            setRotationAngle(this.left_leg, 0.0f, 3.1416f, 0.0f);
            this.left_leg.field_78804_l.add(new ModelBox(this.left_leg, 35, 9, 4.0f, -17.0f, -14.0f, 9, 17, 1, 0.0f, false));
            this.left_leg.field_78804_l.add(new ModelBox(this.left_leg, 52, 60, 5.0f, -12.0f, -13.0f, 8, 12, 8, 0.0f, false));
            this.cube_r4 = new ModelRenderer(this);
            this.cube_r4.func_78793_a(-30.0f, 0.0f, -13.0f);
            this.left_leg.func_78792_a(this.cube_r4);
            setRotationAngle(this.cube_r4, 0.0f, -1.5708f, 0.0f);
            this.cube_r4.field_78804_l.add(new ModelBox(this.cube_r4, 52, 9, -1.0f, -17.0f, -35.0f, 9, 17, 1, 0.0f, false));
            this.bb_main = new ModelRenderer(this);
            this.bb_main.func_78793_a(0.0f, 24.0f, 0.0f);
            this.bb_main.field_78804_l.add(new ModelBox(this.bb_main, 0, 54, -6.0f, -14.0f, -7.0f, 12, 12, 14, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.right_hand.func_78785_a(f5);
            this.left_hand.func_78785_a(f5);
            this.right_leg.func_78785_a(f5);
            this.left_leg.func_78785_a(f5);
            this.bb_main.func_78785_a(f5);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.field_78795_f = x;
            modelRenderer.field_78796_g = y;
            modelRenderer.field_78808_h = z;
        }

        public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
            super.func_78087_a(f, f1, f2, f3, f4, f5, e);
            this.left_leg.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
            this.right_leg.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
            this.right_hand.field_78795_f = MathHelper.func_76134_b((f * 0.6662f) + 3.1415927f) * f1;
            this.left_hand.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
        }
    }
}
