package net.mcreator.yvanchuyaoshou.entity;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureGuLangDie;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureGuLangUpdate;
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
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
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
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity16.class */
public class EntityCaientity16 extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 27;
    public static final int ENTITYID_RANGED = 28;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityCaientity16(ElementsYvanchuyaoshouMod instance) {
        super(instance, 46);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "caientity16"), 27).name("caientity16").tracker(64, 3, true).egg(-1, -52429).build();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modelcaientity16(), 0.7f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityCaientity16.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/caientity16.png");
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity16$EntityCustom.class */
    public static class EntityCustom extends EntityMob {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(1.2f, 1.0f);
            this.field_70728_aV = 20;
            this.field_70178_ae = false;
            func_94061_f(false);
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70715_bh.func_75776_a(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true, true));
            this.field_70715_bh.func_75776_a(2, new EntityAIHurtByTarget(this, true, new Class[0]));
            this.field_70714_bg.func_75776_a(3, new EntityAIAttackMelee(this, 1.2d, false));
            this.field_70714_bg.func_75776_a(4, new EntityAILeapAtTarget(this, 0.5f));
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
            EntityCaientity16.$_dependencies.put("entity", this);
            ProcedureShouJiNbt.executeProcedure(EntityCaientity16.$_dependencies);
            return super.func_70097_a(source, amount);
        }

        public void func_70645_a(DamageSource source) {
            super.func_70645_a(source);
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            EntityCaientity16.$_dependencies.put("entity", this);
            EntityCaientity16.$_dependencies.put("x", Integer.valueOf(x));
            EntityCaientity16.$_dependencies.put("y", Integer.valueOf(y));
            EntityCaientity16.$_dependencies.put("z", Integer.valueOf(z));
            EntityCaientity16.$_dependencies.put("world", this.field_70170_p);
            ProcedureGuLangDie.executeProcedure(EntityCaientity16.$_dependencies);
        }

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityCaientity16.$_dependencies.put("entity", this);
            EntityCaientity16.$_dependencies.put("world", this.field_70170_p);
            ProcedureGuLangUpdate.executeProcedure(EntityCaientity16.$_dependencies);
        }

        protected void func_110147_ax() {
            super.func_110147_ax();
            if (func_110148_a(SharedMonsterAttributes.field_188791_g) != null) {
                func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(7.0d);
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

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity16$Modelcaientity16.class */
    public static class Modelcaientity16 extends ModelBase {
        private final ModelRenderer body;
        private final ModelRenderer weiba;
        private final ModelRenderer rightleg;
        private final ModelRenderer leftleg;
        private final ModelRenderer rightarm;
        private final ModelRenderer leftarm;
        private final ModelRenderer head;

        public Modelcaientity16() {
            this.field_78090_t = 64;
            this.field_78089_u = 32;
            this.body = new ModelRenderer(this);
            this.body.func_78793_a(-0.5f, 19.5f, -3.0f);
            setRotationAngle(this.body, 1.5708f, 0.0f, 0.0f);
            this.body.field_78804_l.add(new ModelBox(this.body, 21, 0, -3.5f, -4.5f, 3.0f, 8, 6, 7, 0.0f, false));
            this.body.field_78804_l.add(new ModelBox(this.body, 18, 14, -2.5f, 1.5f, 3.0f, 6, 9, 6, 0.0f, false));
            this.weiba = new ModelRenderer(this);
            this.weiba.func_78793_a(0.5f, 10.5f, 8.0f);
            setRotationAngle(this.weiba, -0.5236f, 0.0f, 0.0f);
            this.body.func_78792_a(this.weiba);
            this.weiba.field_78804_l.add(new ModelBox(this.weiba, 9, 18, -1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f, false));
            this.rightleg = new ModelRenderer(this);
            this.rightleg.func_78793_a(-2.0f, 16.0f, 6.0f);
            this.rightleg.field_78804_l.add(new ModelBox(this.rightleg, 0, 18, -1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f, false));
            this.leftleg = new ModelRenderer(this);
            this.leftleg.func_78793_a(2.0f, 16.0f, 6.0f);
            this.leftleg.field_78804_l.add(new ModelBox(this.leftleg, 0, 18, -1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f, false));
            this.rightarm = new ModelRenderer(this);
            this.rightarm.func_78793_a(-2.0f, 16.0f, -5.0f);
            this.rightarm.field_78804_l.add(new ModelBox(this.rightarm, 0, 18, -1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f, false));
            this.leftarm = new ModelRenderer(this);
            this.leftarm.func_78793_a(2.0f, 16.0f, -5.0f);
            this.leftarm.field_78804_l.add(new ModelBox(this.leftarm, 0, 18, -1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f, false));
            this.head = new ModelRenderer(this);
            this.head.func_78793_a(0.0f, 11.75f, -8.0f);
            this.head.field_78804_l.add(new ModelBox(this.head, 0, 0, -3.0f, -3.75f, -4.0f, 6, 6, 4, 0.0f, false));
            this.head.field_78804_l.add(new ModelBox(this.head, 0, 10, -1.5f, -0.75f, -8.0f, 3, 3, 4, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.body.func_78785_a(f5);
            this.rightleg.func_78785_a(f5);
            this.leftleg.func_78785_a(f5);
            this.rightarm.func_78785_a(f5);
            this.leftarm.func_78785_a(f5);
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
            this.rightarm.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
            this.leftleg.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
            this.leftarm.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
        }
    }
}
