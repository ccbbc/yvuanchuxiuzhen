package net.mcreator.yvanchuyaoshou.entity;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureCaientity11EntityIsHurt;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureJiuWeiHuoHuDie;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureJiuWeiHuoHuUpdate;
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
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity11.class */
public class EntityCaientity11 extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 17;
    public static final int ENTITYID_RANGED = 18;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityCaientity11(ElementsYvanchuyaoshouMod instance) {
        super(instance, 58);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "caientity11"), 17).name("caientity11").tracker(64, 3, true).egg(-3355444, -52429).build();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modelcaientity11(), 1.0f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityCaientity11.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/caientity11.png");
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity11$EntityCustom.class */
    public static class EntityCustom extends EntityMob {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(1.0f, 1.0f);
            this.field_70728_aV = 100;
            this.field_70178_ae = true;
            func_94061_f(false);
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70715_bh.func_75776_a(1, new EntityAIHurtByTarget(this, true, new Class[0]));
            this.field_70714_bg.func_75776_a(2, new EntityAIAttackMelee(this, 1.2d, true));
            this.field_70714_bg.func_75776_a(3, new EntityAILeapAtTarget(this, 0.3f));
            this.field_70714_bg.func_75776_a(4, new EntityAILookIdle(this));
            this.field_70714_bg.func_75776_a(5, new EntityAISwimming(this));
            this.field_70714_bg.func_75776_a(6, new EntityAITempt(this, 1.0d, new ItemStack(Items.field_179558_bo, 1).func_77973_b(), true));
            this.field_70714_bg.func_75776_a(7, new EntityAIWander(this, 1.3d));
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
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            source.func_76346_g();
            EntityCaientity11.$_dependencies.put("entity", this);
            EntityCaientity11.$_dependencies.put("x", Integer.valueOf(x));
            EntityCaientity11.$_dependencies.put("y", Integer.valueOf(y));
            EntityCaientity11.$_dependencies.put("z", Integer.valueOf(z));
            EntityCaientity11.$_dependencies.put("world", this.field_70170_p);
            ProcedureCaientity11EntityIsHurt.executeProcedure(EntityCaientity11.$_dependencies);
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
            EntityCaientity11.$_dependencies.put("entity", this);
            EntityCaientity11.$_dependencies.put("x", Integer.valueOf(x));
            EntityCaientity11.$_dependencies.put("y", Integer.valueOf(y));
            EntityCaientity11.$_dependencies.put("z", Integer.valueOf(z));
            EntityCaientity11.$_dependencies.put("world", this.field_70170_p);
            ProcedureJiuWeiHuoHuDie.executeProcedure(EntityCaientity11.$_dependencies);
        }

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityCaientity11.$_dependencies.put("entity", this);
            EntityCaientity11.$_dependencies.put("world", this.field_70170_p);
            ProcedureJiuWeiHuoHuUpdate.executeProcedure(EntityCaientity11.$_dependencies);
        }

        protected void func_110147_ax() {
            super.func_110147_ax();
            if (func_110148_a(SharedMonsterAttributes.field_188791_g) != null) {
                func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(18.0d);
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

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity11$Modelcaientity11.class */
    public static class Modelcaientity11 extends ModelBase {
        private final ModelRenderer leftleg;
        private final ModelRenderer leftarm;
        private final ModelRenderer rightleg;
        private final ModelRenderer rightarm;
        private final ModelRenderer body;
        private final ModelRenderer bone15;
        private final ModelRenderer bone13;
        private final ModelRenderer bone16;
        private final ModelRenderer bone22;
        private final ModelRenderer bone23;
        private final ModelRenderer bone20;
        private final ModelRenderer bone19;
        private final ModelRenderer bone17;
        private final ModelRenderer bone21;
        private final ModelRenderer bone18;
        private final ModelRenderer bone3;
        private final ModelRenderer bone6;
        private final ModelRenderer bone2;
        private final ModelRenderer bone4;
        private final ModelRenderer bone5;
        private final ModelRenderer bone10;
        private final ModelRenderer bone9;
        private final ModelRenderer bone7;
        private final ModelRenderer bone11;
        private final ModelRenderer bone8;
        private final ModelRenderer head;
        private final ModelRenderer head2;

        public Modelcaientity11() {
            this.field_78090_t = 64;
            this.field_78089_u = 64;
            this.leftleg = new ModelRenderer(this);
            this.leftleg.func_78793_a(2.0f, 17.0f, 6.0f);
            this.leftleg.field_78804_l.add(new ModelBox(this.leftleg, 0, 26, -1.0f, 0.0f, -1.0f, 2, 7, 2, 0.0f, false));
            this.leftarm = new ModelRenderer(this);
            this.leftarm.func_78793_a(2.0f, 17.0f, -5.0f);
            this.leftarm.field_78804_l.add(new ModelBox(this.leftarm, 24, 26, -1.0f, 0.0f, -1.0f, 2, 7, 2, 0.0f, false));
            this.rightleg = new ModelRenderer(this);
            this.rightleg.func_78793_a(-2.0f, 17.0f, 6.0f);
            this.rightleg.field_78804_l.add(new ModelBox(this.rightleg, 8, 26, -1.0f, 0.0f, -1.0f, 2, 7, 2, 0.0f, false));
            this.rightarm = new ModelRenderer(this);
            this.rightarm.func_78793_a(-2.0f, 17.0f, -5.0f);
            this.rightarm.field_78804_l.add(new ModelBox(this.rightarm, 16, 26, -1.0f, 0.0f, -1.0f, 2, 7, 2, 0.0f, false));
            this.body = new ModelRenderer(this);
            this.body.func_78793_a(0.0f, 24.0f, 0.0f);
            setRotationAngle(this.body, 0.0f, -1.5708f, 0.0f);
            this.body.field_78804_l.add(new ModelBox(this.body, 0, 0, -7.0f, -13.0f, -3.0f, 15, 6, 6, 0.0f, false));
            this.bone15 = new ModelRenderer(this);
            this.bone15.func_78793_a(0.0f, 0.0f, 0.0f);
            this.body.func_78792_a(this.bone15);
            this.bone13 = new ModelRenderer(this);
            this.bone13.func_78793_a(22.0f, 6.0f, -2.0f);
            setRotationAngle(this.bone13, 0.0f, 0.0f, 0.3491f);
            this.bone15.func_78792_a(this.bone13);
            this.bone13.field_78804_l.add(new ModelBox(this.bone13, 52, 57, -3.0f, -23.0f, 0.0f, 3, 5, 3, 0.0f, false));
            this.bone13.field_78804_l.add(new ModelBox(this.bone13, 52, 62, -3.0f, -20.0f, 3.0f, 2, 2, 1, 0.0f, false));
            this.bone13.field_78804_l.add(new ModelBox(this.bone13, 52, 62, -3.0f, -20.0f, -1.0f, 2, 2, 1, 0.0f, false));
            this.bone13.field_78804_l.add(new ModelBox(this.bone13, 56, 61, -3.0f, -18.0f, 1.0f, 2, 1, 2, 0.0f, false));
            this.bone13.field_78804_l.add(new ModelBox(this.bone13, 52, 62, -4.0f, -20.0f, 1.0f, 1, 2, 2, 0.0f, false));
            this.bone13.field_78804_l.add(new ModelBox(this.bone13, 52, 62, -2.0f, -24.0f, 0.0f, 2, 1, 2, 0.0f, false));
            this.bone13.field_78804_l.add(new ModelBox(this.bone13, 52, 62, 0.0f, -20.0f, 1.0f, 1, 2, 2, 0.0f, false));
            this.bone13.field_78804_l.add(new ModelBox(this.bone13, 60, 62, -3.0f, -21.0f, 3.0f, 1, 1, 1, 0.0f, false));
            this.bone13.field_78804_l.add(new ModelBox(this.bone13, 60, 62, -1.0f, -22.0f, 3.0f, 1, 1, 1, 0.0f, false));
            this.bone13.field_78804_l.add(new ModelBox(this.bone13, 60, 62, -3.0f, -21.0f, -1.0f, 1, 1, 1, 0.0f, false));
            this.bone13.field_78804_l.add(new ModelBox(this.bone13, 60, 62, -2.0f, -22.0f, -1.0f, 1, 1, 1, 0.0f, false));
            this.bone13.field_78804_l.add(new ModelBox(this.bone13, 60, 62, -4.0f, -21.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone13.field_78804_l.add(new ModelBox(this.bone13, 60, 62, -4.0f, -22.0f, 0.0f, 1, 1, 1, 0.0f, false));
            this.bone13.field_78804_l.add(new ModelBox(this.bone13, 60, 62, -3.0f, -24.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone13.field_78804_l.add(new ModelBox(this.bone13, 60, 62, -2.0f, -26.0f, 1.0f, 1, 2, 1, 0.0f, false));
            this.bone13.field_78804_l.add(new ModelBox(this.bone13, 60, 62, 0.0f, -21.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone13.field_78804_l.add(new ModelBox(this.bone13, 60, 62, 0.0f, -22.0f, 0.0f, 1, 1, 1, 0.0f, false));
            this.bone16 = new ModelRenderer(this);
            this.bone16.func_78793_a(14.0f, 5.0f, -7.0f);
            setRotationAngle(this.bone16, 0.3491f, 0.0f, 0.6109f);
            this.bone15.func_78792_a(this.bone16);
            this.bone16.field_78804_l.add(new ModelBox(this.bone16, 52, 57, -3.0f, -23.0f, 0.0f, 3, 5, 3, 0.0f, false));
            this.bone16.field_78804_l.add(new ModelBox(this.bone16, 52, 62, -3.0f, -20.0f, 3.0f, 2, 2, 1, 0.0f, false));
            this.bone16.field_78804_l.add(new ModelBox(this.bone16, 52, 62, -3.0f, -20.0f, -1.0f, 2, 2, 1, 0.0f, false));
            this.bone16.field_78804_l.add(new ModelBox(this.bone16, 56, 61, -3.0f, -18.0f, 1.0f, 2, 1, 2, 0.0f, false));
            this.bone16.field_78804_l.add(new ModelBox(this.bone16, 52, 62, -4.0f, -20.0f, 1.0f, 1, 2, 2, 0.0f, false));
            this.bone16.field_78804_l.add(new ModelBox(this.bone16, 52, 62, -2.0f, -24.0f, 0.0f, 2, 1, 2, 0.0f, false));
            this.bone16.field_78804_l.add(new ModelBox(this.bone16, 52, 62, 0.0f, -20.0f, 1.0f, 1, 2, 2, 0.0f, false));
            this.bone16.field_78804_l.add(new ModelBox(this.bone16, 60, 62, -3.0f, -21.0f, 3.0f, 1, 1, 1, 0.0f, false));
            this.bone16.field_78804_l.add(new ModelBox(this.bone16, 60, 62, -1.0f, -22.0f, 3.0f, 1, 1, 1, 0.0f, false));
            this.bone16.field_78804_l.add(new ModelBox(this.bone16, 60, 62, -3.0f, -21.0f, -1.0f, 1, 1, 1, 0.0f, false));
            this.bone16.field_78804_l.add(new ModelBox(this.bone16, 60, 62, -2.0f, -22.0f, -1.0f, 1, 1, 1, 0.0f, false));
            this.bone16.field_78804_l.add(new ModelBox(this.bone16, 60, 62, -4.0f, -21.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone16.field_78804_l.add(new ModelBox(this.bone16, 60, 62, -4.0f, -22.0f, 0.0f, 1, 1, 1, 0.0f, false));
            this.bone16.field_78804_l.add(new ModelBox(this.bone16, 60, 62, -3.0f, -24.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone16.field_78804_l.add(new ModelBox(this.bone16, 58, 60, -2.0f, -26.0f, 1.0f, 1, 2, 1, 0.0f, false));
            this.bone16.field_78804_l.add(new ModelBox(this.bone16, 60, 62, 0.0f, -21.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone16.field_78804_l.add(new ModelBox(this.bone16, 60, 62, 0.0f, -22.0f, 0.0f, 1, 1, 1, 0.0f, false));
            this.bone22 = new ModelRenderer(this);
            this.bone22.func_78793_a(18.0f, -2.0f, -5.0f);
            setRotationAngle(this.bone22, 0.3491f, 0.0f, 0.2618f);
            this.bone15.func_78792_a(this.bone22);
            this.bone22.field_78804_l.add(new ModelBox(this.bone22, 52, 57, -3.0f, -23.0f, 0.0f, 3, 5, 3, 0.0f, false));
            this.bone22.field_78804_l.add(new ModelBox(this.bone22, 52, 62, -3.0f, -20.0f, 3.0f, 2, 2, 1, 0.0f, false));
            this.bone22.field_78804_l.add(new ModelBox(this.bone22, 52, 62, -3.0f, -20.0f, -1.0f, 2, 2, 1, 0.0f, false));
            this.bone22.field_78804_l.add(new ModelBox(this.bone22, 56, 61, -3.0f, -18.0f, 1.0f, 2, 1, 2, 0.0f, false));
            this.bone22.field_78804_l.add(new ModelBox(this.bone22, 52, 62, -4.0f, -20.0f, 1.0f, 1, 2, 2, 0.0f, false));
            this.bone22.field_78804_l.add(new ModelBox(this.bone22, 52, 62, -2.0f, -24.0f, 0.0f, 2, 1, 2, 0.0f, false));
            this.bone22.field_78804_l.add(new ModelBox(this.bone22, 52, 62, 0.0f, -20.0f, 1.0f, 1, 2, 2, 0.0f, false));
            this.bone22.field_78804_l.add(new ModelBox(this.bone22, 60, 62, -3.0f, -21.0f, 3.0f, 1, 1, 1, 0.0f, false));
            this.bone22.field_78804_l.add(new ModelBox(this.bone22, 60, 62, -1.0f, -22.0f, 3.0f, 1, 1, 1, 0.0f, false));
            this.bone22.field_78804_l.add(new ModelBox(this.bone22, 60, 62, -3.0f, -21.0f, -1.0f, 1, 1, 1, 0.0f, false));
            this.bone22.field_78804_l.add(new ModelBox(this.bone22, 60, 62, -2.0f, -22.0f, -1.0f, 1, 1, 1, 0.0f, false));
            this.bone22.field_78804_l.add(new ModelBox(this.bone22, 60, 62, -4.0f, -21.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone22.field_78804_l.add(new ModelBox(this.bone22, 60, 62, -4.0f, -22.0f, 0.0f, 1, 1, 1, 0.0f, false));
            this.bone22.field_78804_l.add(new ModelBox(this.bone22, 60, 62, -3.0f, -24.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone22.field_78804_l.add(new ModelBox(this.bone22, 58, 60, -2.0f, -26.0f, 1.0f, 1, 2, 1, 0.0f, false));
            this.bone22.field_78804_l.add(new ModelBox(this.bone22, 60, 62, 0.0f, -21.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone22.field_78804_l.add(new ModelBox(this.bone22, 60, 62, 0.0f, -22.0f, 0.0f, 1, 1, 1, 0.0f, false));
            this.bone23 = new ModelRenderer(this);
            this.bone23.func_78793_a(17.0f, -3.0f, 5.0f);
            setRotationAngle(this.bone23, 0.3491f, -2.2689f, 0.0f);
            this.bone15.func_78792_a(this.bone23);
            this.bone23.field_78804_l.add(new ModelBox(this.bone23, 52, 57, -3.0f, -23.0f, 0.0f, 3, 5, 3, 0.0f, false));
            this.bone23.field_78804_l.add(new ModelBox(this.bone23, 52, 62, -3.0f, -20.0f, 3.0f, 2, 2, 1, 0.0f, false));
            this.bone23.field_78804_l.add(new ModelBox(this.bone23, 52, 62, -3.0f, -20.0f, -1.0f, 2, 2, 1, 0.0f, false));
            this.bone23.field_78804_l.add(new ModelBox(this.bone23, 56, 61, -3.0f, -18.0f, 1.0f, 2, 1, 2, 0.0f, false));
            this.bone23.field_78804_l.add(new ModelBox(this.bone23, 52, 62, -4.0f, -20.0f, 1.0f, 1, 2, 2, 0.0f, false));
            this.bone23.field_78804_l.add(new ModelBox(this.bone23, 52, 62, -2.0f, -24.0f, 0.0f, 2, 1, 2, 0.0f, false));
            this.bone23.field_78804_l.add(new ModelBox(this.bone23, 52, 62, 0.0f, -20.0f, 1.0f, 1, 2, 2, 0.0f, false));
            this.bone23.field_78804_l.add(new ModelBox(this.bone23, 60, 62, -3.0f, -21.0f, 3.0f, 1, 1, 1, 0.0f, false));
            this.bone23.field_78804_l.add(new ModelBox(this.bone23, 60, 62, -1.0f, -22.0f, 3.0f, 1, 1, 1, 0.0f, false));
            this.bone23.field_78804_l.add(new ModelBox(this.bone23, 60, 62, -3.0f, -21.0f, -1.0f, 1, 1, 1, 0.0f, false));
            this.bone23.field_78804_l.add(new ModelBox(this.bone23, 60, 62, -2.0f, -22.0f, -1.0f, 1, 1, 1, 0.0f, false));
            this.bone23.field_78804_l.add(new ModelBox(this.bone23, 60, 62, -4.0f, -21.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone23.field_78804_l.add(new ModelBox(this.bone23, 60, 62, -4.0f, -22.0f, 0.0f, 1, 1, 1, 0.0f, false));
            this.bone23.field_78804_l.add(new ModelBox(this.bone23, 60, 62, -3.0f, -24.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone23.field_78804_l.add(new ModelBox(this.bone23, 58, 60, -2.0f, -26.0f, 1.0f, 1, 2, 1, 0.0f, false));
            this.bone23.field_78804_l.add(new ModelBox(this.bone23, 60, 62, 0.0f, -21.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone23.field_78804_l.add(new ModelBox(this.bone23, 60, 62, 0.0f, -22.0f, 0.0f, 1, 1, 1, 0.0f, false));
            this.bone20 = new ModelRenderer(this);
            this.bone20.func_78793_a(14.0f, 14.0f, -5.0f);
            setRotationAngle(this.bone20, 0.3491f, 0.0f, 0.6109f);
            this.bone15.func_78792_a(this.bone20);
            this.bone20.field_78804_l.add(new ModelBox(this.bone20, 52, 57, -3.0f, -23.0f, 0.0f, 3, 5, 3, 0.0f, false));
            this.bone20.field_78804_l.add(new ModelBox(this.bone20, 52, 62, -3.0f, -20.0f, 3.0f, 2, 2, 1, 0.0f, false));
            this.bone20.field_78804_l.add(new ModelBox(this.bone20, 52, 62, -3.0f, -20.0f, -1.0f, 2, 2, 1, 0.0f, false));
            this.bone20.field_78804_l.add(new ModelBox(this.bone20, 56, 61, -3.0f, -18.0f, 1.0f, 2, 1, 2, 0.0f, false));
            this.bone20.field_78804_l.add(new ModelBox(this.bone20, 52, 62, -4.0f, -20.0f, 1.0f, 1, 2, 2, 0.0f, false));
            this.bone20.field_78804_l.add(new ModelBox(this.bone20, 52, 62, -2.0f, -24.0f, 0.0f, 2, 1, 2, 0.0f, false));
            this.bone20.field_78804_l.add(new ModelBox(this.bone20, 52, 62, 0.0f, -20.0f, 1.0f, 1, 2, 2, 0.0f, false));
            this.bone20.field_78804_l.add(new ModelBox(this.bone20, 60, 62, -3.0f, -21.0f, 3.0f, 1, 1, 1, 0.0f, false));
            this.bone20.field_78804_l.add(new ModelBox(this.bone20, 60, 62, -1.0f, -22.0f, 3.0f, 1, 1, 1, 0.0f, false));
            this.bone20.field_78804_l.add(new ModelBox(this.bone20, 60, 62, -3.0f, -21.0f, -1.0f, 1, 1, 1, 0.0f, false));
            this.bone20.field_78804_l.add(new ModelBox(this.bone20, 60, 62, -2.0f, -22.0f, -1.0f, 1, 1, 1, 0.0f, false));
            this.bone20.field_78804_l.add(new ModelBox(this.bone20, 60, 62, -4.0f, -21.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone20.field_78804_l.add(new ModelBox(this.bone20, 60, 62, -4.0f, -22.0f, 0.0f, 1, 1, 1, 0.0f, false));
            this.bone20.field_78804_l.add(new ModelBox(this.bone20, 60, 62, -3.0f, -24.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone20.field_78804_l.add(new ModelBox(this.bone20, 58, 60, -2.0f, -26.0f, 1.0f, 1, 2, 1, 0.0f, false));
            this.bone20.field_78804_l.add(new ModelBox(this.bone20, 60, 62, 0.0f, -21.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone20.field_78804_l.add(new ModelBox(this.bone20, 60, 62, 0.0f, -22.0f, 0.0f, 1, 1, 1, 0.0f, false));
            this.bone19 = new ModelRenderer(this);
            this.bone19.func_78793_a(7.0f, 5.0f, -13.0f);
            setRotationAngle(this.bone19, 0.3491f, 0.0f, 0.6109f);
            this.bone15.func_78792_a(this.bone19);
            this.bone19.field_78804_l.add(new ModelBox(this.bone19, 52, 57, -3.0f, -23.0f, 0.0f, 3, 5, 3, 0.0f, false));
            this.bone19.field_78804_l.add(new ModelBox(this.bone19, 52, 62, -3.0f, -20.0f, 3.0f, 2, 2, 1, 0.0f, false));
            this.bone19.field_78804_l.add(new ModelBox(this.bone19, 52, 62, -3.0f, -20.0f, -1.0f, 2, 2, 1, 0.0f, false));
            this.bone19.field_78804_l.add(new ModelBox(this.bone19, 56, 61, -3.0f, -18.0f, 1.0f, 2, 1, 2, 0.0f, false));
            this.bone19.field_78804_l.add(new ModelBox(this.bone19, 52, 62, -4.0f, -20.0f, 1.0f, 1, 2, 2, 0.0f, false));
            this.bone19.field_78804_l.add(new ModelBox(this.bone19, 52, 62, -2.0f, -24.0f, 0.0f, 2, 1, 2, 0.0f, false));
            this.bone19.field_78804_l.add(new ModelBox(this.bone19, 52, 62, 0.0f, -20.0f, 1.0f, 1, 2, 2, 0.0f, false));
            this.bone19.field_78804_l.add(new ModelBox(this.bone19, 60, 62, -3.0f, -21.0f, 3.0f, 1, 1, 1, 0.0f, false));
            this.bone19.field_78804_l.add(new ModelBox(this.bone19, 60, 62, -1.0f, -22.0f, 3.0f, 1, 1, 1, 0.0f, false));
            this.bone19.field_78804_l.add(new ModelBox(this.bone19, 60, 62, -3.0f, -21.0f, -1.0f, 1, 1, 1, 0.0f, false));
            this.bone19.field_78804_l.add(new ModelBox(this.bone19, 60, 62, -2.0f, -22.0f, -1.0f, 1, 1, 1, 0.0f, false));
            this.bone19.field_78804_l.add(new ModelBox(this.bone19, 60, 62, -4.0f, -21.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone19.field_78804_l.add(new ModelBox(this.bone19, 60, 62, -4.0f, -22.0f, 0.0f, 1, 1, 1, 0.0f, false));
            this.bone19.field_78804_l.add(new ModelBox(this.bone19, 60, 62, -3.0f, -24.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone19.field_78804_l.add(new ModelBox(this.bone19, 58, 60, -2.0f, -26.0f, 1.0f, 1, 2, 1, 0.0f, false));
            this.bone19.field_78804_l.add(new ModelBox(this.bone19, 60, 62, 0.0f, -21.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone19.field_78804_l.add(new ModelBox(this.bone19, 60, 62, 0.0f, -22.0f, 0.0f, 1, 1, 1, 0.0f, false));
            this.bone17 = new ModelRenderer(this);
            this.bone17.func_78793_a(11.0f, 2.0f, 6.0f);
            setRotationAngle(this.bone17, 0.3491f, -3.0543f, 0.6109f);
            this.bone15.func_78792_a(this.bone17);
            this.bone17.field_78804_l.add(new ModelBox(this.bone17, 52, 57, -3.0f, -23.0f, 0.0f, 3, 5, 3, 0.0f, false));
            this.bone17.field_78804_l.add(new ModelBox(this.bone17, 52, 62, -3.0f, -20.0f, 3.0f, 2, 2, 1, 0.0f, false));
            this.bone17.field_78804_l.add(new ModelBox(this.bone17, 52, 62, -3.0f, -20.0f, -1.0f, 2, 2, 1, 0.0f, false));
            this.bone17.field_78804_l.add(new ModelBox(this.bone17, 56, 61, -3.0f, -18.0f, 1.0f, 2, 1, 2, 0.0f, false));
            this.bone17.field_78804_l.add(new ModelBox(this.bone17, 52, 62, -4.0f, -20.0f, 1.0f, 1, 2, 2, 0.0f, false));
            this.bone17.field_78804_l.add(new ModelBox(this.bone17, 52, 62, -2.0f, -24.0f, 0.0f, 2, 1, 2, 0.0f, false));
            this.bone17.field_78804_l.add(new ModelBox(this.bone17, 52, 62, 0.0f, -20.0f, 1.0f, 1, 2, 2, 0.0f, false));
            this.bone17.field_78804_l.add(new ModelBox(this.bone17, 60, 62, -3.0f, -21.0f, 3.0f, 1, 1, 1, 0.0f, false));
            this.bone17.field_78804_l.add(new ModelBox(this.bone17, 60, 62, -1.0f, -22.0f, 3.0f, 1, 1, 1, 0.0f, false));
            this.bone17.field_78804_l.add(new ModelBox(this.bone17, 60, 62, -3.0f, -21.0f, -1.0f, 1, 1, 1, 0.0f, false));
            this.bone17.field_78804_l.add(new ModelBox(this.bone17, 60, 62, -2.0f, -22.0f, -1.0f, 1, 1, 1, 0.0f, false));
            this.bone17.field_78804_l.add(new ModelBox(this.bone17, 60, 62, -4.0f, -21.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone17.field_78804_l.add(new ModelBox(this.bone17, 60, 62, -4.0f, -22.0f, 0.0f, 1, 1, 1, 0.0f, false));
            this.bone17.field_78804_l.add(new ModelBox(this.bone17, 60, 62, -3.0f, -24.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone17.field_78804_l.add(new ModelBox(this.bone17, 60, 62, -2.0f, -26.0f, 1.0f, 1, 2, 1, 0.0f, false));
            this.bone17.field_78804_l.add(new ModelBox(this.bone17, 60, 62, 0.0f, -21.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone17.field_78804_l.add(new ModelBox(this.bone17, 60, 62, 0.0f, -22.0f, 0.0f, 1, 1, 1, 0.0f, false));
            this.bone21 = new ModelRenderer(this);
            this.bone21.func_78793_a(11.0f, 10.0f, 4.0f);
            setRotationAngle(this.bone21, 0.3491f, -3.0543f, 0.6109f);
            this.bone15.func_78792_a(this.bone21);
            this.bone21.field_78804_l.add(new ModelBox(this.bone21, 52, 57, -3.0f, -23.0f, 0.0f, 3, 5, 3, 0.0f, false));
            this.bone21.field_78804_l.add(new ModelBox(this.bone21, 52, 62, -3.0f, -20.0f, 3.0f, 2, 2, 1, 0.0f, false));
            this.bone21.field_78804_l.add(new ModelBox(this.bone21, 52, 62, -3.0f, -20.0f, -1.0f, 2, 2, 1, 0.0f, false));
            this.bone21.field_78804_l.add(new ModelBox(this.bone21, 56, 61, -3.0f, -18.0f, 1.0f, 2, 1, 2, 0.0f, false));
            this.bone21.field_78804_l.add(new ModelBox(this.bone21, 52, 62, -4.0f, -20.0f, 1.0f, 1, 2, 2, 0.0f, false));
            this.bone21.field_78804_l.add(new ModelBox(this.bone21, 52, 62, -2.0f, -24.0f, 0.0f, 2, 1, 2, 0.0f, false));
            this.bone21.field_78804_l.add(new ModelBox(this.bone21, 52, 62, 0.0f, -20.0f, 1.0f, 1, 2, 2, 0.0f, false));
            this.bone21.field_78804_l.add(new ModelBox(this.bone21, 60, 62, -3.0f, -21.0f, 3.0f, 1, 1, 1, 0.0f, false));
            this.bone21.field_78804_l.add(new ModelBox(this.bone21, 60, 62, -1.0f, -22.0f, 3.0f, 1, 1, 1, 0.0f, false));
            this.bone21.field_78804_l.add(new ModelBox(this.bone21, 60, 62, -3.0f, -21.0f, -1.0f, 1, 1, 1, 0.0f, false));
            this.bone21.field_78804_l.add(new ModelBox(this.bone21, 60, 62, -2.0f, -22.0f, -1.0f, 1, 1, 1, 0.0f, false));
            this.bone21.field_78804_l.add(new ModelBox(this.bone21, 60, 62, -4.0f, -21.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone21.field_78804_l.add(new ModelBox(this.bone21, 60, 62, -4.0f, -22.0f, 0.0f, 1, 1, 1, 0.0f, false));
            this.bone21.field_78804_l.add(new ModelBox(this.bone21, 60, 62, -3.0f, -24.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone21.field_78804_l.add(new ModelBox(this.bone21, 60, 62, -2.0f, -26.0f, 1.0f, 1, 2, 1, 0.0f, false));
            this.bone21.field_78804_l.add(new ModelBox(this.bone21, 60, 62, 0.0f, -21.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone21.field_78804_l.add(new ModelBox(this.bone21, 60, 62, 0.0f, -22.0f, 0.0f, 1, 1, 1, 0.0f, false));
            this.bone18 = new ModelRenderer(this);
            this.bone18.func_78793_a(3.0f, 2.0f, 12.0f);
            setRotationAngle(this.bone18, 0.3491f, -3.0543f, 0.6109f);
            this.bone15.func_78792_a(this.bone18);
            this.bone18.field_78804_l.add(new ModelBox(this.bone18, 52, 57, -3.0f, -23.0f, 0.0f, 3, 5, 3, 0.0f, false));
            this.bone18.field_78804_l.add(new ModelBox(this.bone18, 52, 62, -3.0f, -20.0f, 3.0f, 2, 2, 1, 0.0f, false));
            this.bone18.field_78804_l.add(new ModelBox(this.bone18, 52, 62, -3.0f, -20.0f, -1.0f, 2, 2, 1, 0.0f, false));
            this.bone18.field_78804_l.add(new ModelBox(this.bone18, 56, 61, -3.0f, -18.0f, 1.0f, 2, 1, 2, 0.0f, false));
            this.bone18.field_78804_l.add(new ModelBox(this.bone18, 52, 62, -4.0f, -20.0f, 1.0f, 1, 2, 2, 0.0f, false));
            this.bone18.field_78804_l.add(new ModelBox(this.bone18, 52, 62, -2.0f, -24.0f, 0.0f, 2, 1, 2, 0.0f, false));
            this.bone18.field_78804_l.add(new ModelBox(this.bone18, 52, 62, 0.0f, -20.0f, 1.0f, 1, 2, 2, 0.0f, false));
            this.bone18.field_78804_l.add(new ModelBox(this.bone18, 60, 62, -3.0f, -21.0f, 3.0f, 1, 1, 1, 0.0f, false));
            this.bone18.field_78804_l.add(new ModelBox(this.bone18, 60, 62, -1.0f, -22.0f, 3.0f, 1, 1, 1, 0.0f, false));
            this.bone18.field_78804_l.add(new ModelBox(this.bone18, 60, 62, -3.0f, -21.0f, -1.0f, 1, 1, 1, 0.0f, false));
            this.bone18.field_78804_l.add(new ModelBox(this.bone18, 60, 62, -2.0f, -22.0f, -1.0f, 1, 1, 1, 0.0f, false));
            this.bone18.field_78804_l.add(new ModelBox(this.bone18, 60, 62, -4.0f, -21.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone18.field_78804_l.add(new ModelBox(this.bone18, 60, 62, -4.0f, -22.0f, 0.0f, 1, 1, 1, 0.0f, false));
            this.bone18.field_78804_l.add(new ModelBox(this.bone18, 60, 62, -3.0f, -24.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone18.field_78804_l.add(new ModelBox(this.bone18, 60, 62, -2.0f, -26.0f, 1.0f, 1, 2, 1, 0.0f, false));
            this.bone18.field_78804_l.add(new ModelBox(this.bone18, 60, 62, 0.0f, -21.0f, 2.0f, 1, 1, 1, 0.0f, false));
            this.bone18.field_78804_l.add(new ModelBox(this.bone18, 60, 62, 0.0f, -22.0f, 0.0f, 1, 1, 1, 0.0f, false));
            this.bone3 = new ModelRenderer(this);
            this.bone3.func_78793_a(6.0f, -2.0f, 0.0f);
            this.body.func_78792_a(this.bone3);
            this.bone6 = new ModelRenderer(this);
            this.bone6.func_78793_a(-1.0f, 4.0f, 3.0f);
            this.bone3.func_78792_a(this.bone6);
            this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 56, 11.0f, -16.0f, -5.0f, 8, 4, 4, 0.0f, false));
            this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 56, 6.0f, -15.0f, -5.0f, 5, 3, 3, 0.0f, false));
            this.bone6.field_78804_l.add(new ModelBox(this.bone6, 0, 56, 3.0f, -14.0f, -4.0f, 3, 2, 1, 0.0f, false));
            this.bone2 = new ModelRenderer(this);
            this.bone2.func_78793_a(6.0f, 4.0f, 1.0f);
            setRotationAngle(this.bone2, 0.0873f, -0.4363f, -0.6109f);
            this.bone3.func_78792_a(this.bone2);
            this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 56, 11.0f, -16.0f, -5.0f, 8, 4, 4, 0.0f, false));
            this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 56, 6.0f, -15.0f, -5.0f, 5, 3, 3, 0.0f, false));
            this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, 56, 3.0f, -14.0f, -4.0f, 3, 2, 1, 0.0f, false));
            this.bone4 = new ModelRenderer(this);
            this.bone4.func_78793_a(9.0f, 2.0f, 5.0f);
            setRotationAngle(this.bone4, 0.0873f, 0.5236f, -0.6109f);
            this.bone3.func_78792_a(this.bone4);
            this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 56, 11.0f, -16.0f, -5.0f, 8, 4, 4, 0.0f, false));
            this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 56, 6.0f, -15.0f, -5.0f, 5, 3, 3, 0.0f, false));
            this.bone4.field_78804_l.add(new ModelBox(this.bone4, 0, 56, 3.0f, -14.0f, -4.0f, 3, 2, 1, 0.0f, false));
            this.bone5 = new ModelRenderer(this);
            this.bone5.func_78793_a(2.0f, 4.0f, 4.0f);
            setRotationAngle(this.bone5, 0.0f, 0.6981f, 0.0f);
            this.bone3.func_78792_a(this.bone5);
            this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 56, 10.6313f, -15.2223f, -5.5091f, 8, 4, 4, 0.0f, false));
            this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 56, 6.0f, -15.0f, -5.0f, 5, 3, 3, 0.0f, false));
            this.bone5.field_78804_l.add(new ModelBox(this.bone5, 0, 56, 3.0f, -14.0f, -4.0f, 3, 2, 1, 0.0f, false));
            this.bone10 = new ModelRenderer(this);
            this.bone10.func_78793_a(-5.0f, 2.0f, 4.0f);
            setRotationAngle(this.bone10, 0.0f, 0.5236f, 0.6109f);
            this.bone3.func_78792_a(this.bone10);
            this.bone10.field_78804_l.add(new ModelBox(this.bone10, 0, 56, 10.6313f, -15.2223f, -5.5091f, 8, 4, 4, 0.0f, false));
            this.bone10.field_78804_l.add(new ModelBox(this.bone10, 0, 56, 6.0f, -15.0f, -5.0f, 5, 3, 3, 0.0f, false));
            this.bone10.field_78804_l.add(new ModelBox(this.bone10, 0, 56, 3.0f, -14.0f, -4.0f, 3, 2, 1, 0.0f, false));
            this.bone9 = new ModelRenderer(this);
            this.bone9.func_78793_a(5.0f, 4.0f, 4.0f);
            setRotationAngle(this.bone9, 0.0f, 1.2217f, 0.0f);
            this.bone3.func_78792_a(this.bone9);
            this.bone9.field_78804_l.add(new ModelBox(this.bone9, 0, 56, 10.6313f, -15.2223f, -5.5091f, 8, 4, 4, 0.0f, false));
            this.bone9.field_78804_l.add(new ModelBox(this.bone9, 0, 56, 6.0f, -15.0f, -5.0f, 5, 3, 3, 0.0f, false));
            this.bone9.field_78804_l.add(new ModelBox(this.bone9, 0, 56, 3.0f, -14.0f, -4.0f, 3, 2, 1, 0.0f, false));
            this.bone7 = new ModelRenderer(this);
            this.bone7.func_78793_a(-2.0f, 4.0f, 0.0f);
            setRotationAngle(this.bone7, 0.0f, -0.6981f, 0.0f);
            this.bone3.func_78792_a(this.bone7);
            this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 56, 10.6313f, -15.2223f, -5.5091f, 8, 4, 4, 0.0f, false));
            this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 56, 6.0f, -15.0f, -5.0f, 5, 3, 3, 0.0f, false));
            this.bone7.field_78804_l.add(new ModelBox(this.bone7, 0, 56, 3.0f, -14.0f, -4.0f, 3, 2, 1, 0.0f, false));
            this.bone11 = new ModelRenderer(this);
            this.bone11.func_78793_a(-7.0f, 2.0f, 1.0f);
            setRotationAngle(this.bone11, 0.0f, -0.5236f, 0.4363f);
            this.bone3.func_78792_a(this.bone11);
            this.bone11.field_78804_l.add(new ModelBox(this.bone11, 0, 56, 10.6313f, -15.2223f, -5.5091f, 8, 4, 4, 0.0f, false));
            this.bone11.field_78804_l.add(new ModelBox(this.bone11, 0, 56, 6.0f, -15.0f, -5.0f, 5, 3, 3, 0.0f, false));
            this.bone11.field_78804_l.add(new ModelBox(this.bone11, 0, 56, 3.0f, -14.0f, -4.0f, 3, 2, 1, 0.0f, false));
            this.bone8 = new ModelRenderer(this);
            this.bone8.func_78793_a(-2.0f, 4.0f, -3.0f);
            setRotationAngle(this.bone8, 0.0f, -1.2217f, 0.0f);
            this.bone3.func_78792_a(this.bone8);
            this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 56, 10.6313f, -15.2223f, -5.5091f, 8, 4, 4, 0.0f, false));
            this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 56, 6.0f, -15.0f, -5.0f, 5, 3, 3, 0.0f, false));
            this.bone8.field_78804_l.add(new ModelBox(this.bone8, 0, 56, 3.0f, -14.0f, -4.0f, 3, 2, 1, 0.0f, false));
            this.head = new ModelRenderer(this);
            this.head.func_78793_a(0.0f, 14.0f, -7.0f);
            this.head2 = new ModelRenderer(this);
            this.head2.func_78793_a(0.0f, 0.0f, 0.0f);
            setRotationAngle(this.head2, 0.0f, -1.5708f, 0.0f);
            this.head.func_78792_a(this.head2);
            this.head2.field_78804_l.add(new ModelBox(this.head2, 0, 0, -5.0f, -6.0f, -3.0f, 1, 2, 2, 0.0f, false));
            this.head2.field_78804_l.add(new ModelBox(this.head2, 24, 26, -5.0f, -6.0f, 1.0f, 1, 2, 2, 0.0f, false));
            this.head2.field_78804_l.add(new ModelBox(this.head2, 0, 12, -7.0f, -4.0f, -4.0f, 7, 6, 8, 0.0f, false));
            this.head2.field_78804_l.add(new ModelBox(this.head2, 22, 12, -10.0f, 0.0f, -2.0f, 3, 2, 4, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.leftleg.func_78785_a(f5);
            this.leftarm.func_78785_a(f5);
            this.rightleg.func_78785_a(f5);
            this.rightarm.func_78785_a(f5);
            this.body.func_78785_a(f5);
            this.head.func_78785_a(f5);
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
            this.rightleg.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
            this.rightarm.field_78796_g = MathHelper.func_76134_b(f * 0.6662f) * f1;
            this.leftleg.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
            this.leftarm.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
        }
    }
}
