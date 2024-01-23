package net.mcreator.yvanchuyaoshou.entity;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureQiLinDie;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureQiLinUpdate;
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
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity02.class */
public class EntityCaientity02 extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 3;
    public static final int ENTITYID_RANGED = 4;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityCaientity02(ElementsYvanchuyaoshouMod instance) {
        super(instance, 59);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "caientity02"), 3).name("caientity02").tracker(64, 3, true).egg(-256, -13382656).build();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modelcaientity02(), 2.0f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityCaientity02.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/caientity02.png");
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity02$EntityCustom.class */
    public static class EntityCustom extends EntityMob {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(2.0f, 3.0f);
            this.field_70728_aV = 20;
            this.field_70178_ae = true;
            func_94061_f(false);
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70715_bh.func_75776_a(1, new EntityAIHurtByTarget(this, false, new Class[0]));
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
            EntityCaientity02.$_dependencies.put("entity", this);
            ProcedureShouJiNbt.executeProcedure(EntityCaientity02.$_dependencies);
            return super.func_70097_a(source, amount);
        }

        public void func_70645_a(DamageSource source) {
            super.func_70645_a(source);
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            EntityCaientity02.$_dependencies.put("entity", this);
            EntityCaientity02.$_dependencies.put("x", Integer.valueOf(x));
            EntityCaientity02.$_dependencies.put("y", Integer.valueOf(y));
            EntityCaientity02.$_dependencies.put("z", Integer.valueOf(z));
            EntityCaientity02.$_dependencies.put("world", this.field_70170_p);
            ProcedureQiLinDie.executeProcedure(EntityCaientity02.$_dependencies);
        }

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityCaientity02.$_dependencies.put("entity", this);
            EntityCaientity02.$_dependencies.put("world", this.field_70170_p);
            ProcedureQiLinUpdate.executeProcedure(EntityCaientity02.$_dependencies);
        }

        protected void func_110147_ax() {
            super.func_110147_ax();
            if (func_110148_a(SharedMonsterAttributes.field_188791_g) != null) {
                func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(0.0d);
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

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityCaientity02$Modelcaientity02.class */
    public static class Modelcaientity02 extends ModelBase {
        private final ModelRenderer head;
        private final ModelRenderer body;
        private final ModelRenderer rightarm;
        private final ModelRenderer leftarm;
        private final ModelRenderer leftleg;
        private final ModelRenderer rightleg;

        public Modelcaientity02() {
            this.field_78090_t = 126;
            this.field_78089_u = EntityMoXiu01.ENTITYID;
            this.head = new ModelRenderer(this);
            this.head.func_78793_a(0.0f, -20.0f, -18.0f);
            this.head.field_78804_l.add(new ModelBox(this.head, 44, 0, -5.0f, -22.0f, -7.0f, 10, 27, 7, 0.0f, false));
            this.head.field_78804_l.add(new ModelBox(this.head, 78, 0, 0.0f, -32.0f, 0.0f, 0, 27, 12, 0.0f, false));
            this.head.field_78804_l.add(new ModelBox(this.head, 0, 33, -4.0f, -44.0f, 0.0f, 0, 14, 14, 0.0f, false));
            this.head.field_78804_l.add(new ModelBox(this.head, 0, 33, 4.0f, -44.0f, 0.0f, 0, 14, 14, 0.0f, false));
            this.head.field_78804_l.add(new ModelBox(this.head, 0, 19, 6.0f, -35.0f, -5.0f, 0, 14, 14, 0.0f, false));
            this.head.field_78804_l.add(new ModelBox(this.head, 0, 19, -6.0f, -35.0f, -5.0f, 0, 14, 14, 0.0f, false));
            this.head.field_78804_l.add(new ModelBox(this.head, 28, 34, -4.0f, -22.0f, -9.0f, 8, 17, 2, 0.0f, false));
            this.head.field_78804_l.add(new ModelBox(this.head, 48, 34, -5.0f, 5.0f, -5.0f, 10, 4, 5, 0.0f, false));
            this.head.field_78804_l.add(new ModelBox(this.head, 0, 0, -5.0f, -32.0f, -12.0f, 10, 10, 12, 0.0f, false));
            this.head.field_78804_l.add(new ModelBox(this.head, 0, 22, -4.0f, -27.0f, -18.0f, 8, 5, 6, 0.0f, false));
            this.body = new ModelRenderer(this);
            this.body.func_78793_a(0.0f, -24.0f, 4.0f);
            this.body.field_78804_l.add(new ModelBox(this.body, 0, 66, -8.0f, -1.0f, -22.0f, 16, 16, 16, 0.0f, false));
            this.body.field_78804_l.add(new ModelBox(this.body, 0, 98, -6.0f, 2.0f, -6.0f, 12, 14, 10, 0.0f, false));
            this.body.field_78804_l.add(new ModelBox(this.body, 50, 92, -7.0f, 0.0f, 4.0f, 14, 16, 14, 0.0f, false));
            this.body.field_78804_l.add(new ModelBox(this.body, 106, 96, 0.0f, 0.0f, 18.0f, 0, 16, 10, 0.0f, false));
            this.rightarm = new ModelRenderer(this);
            this.rightarm.func_78793_a(-8.0f, -14.0f, -11.0f);
            this.rightarm.field_78804_l.add(new ModelBox(this.rightarm, 92, 77, -6.0f, -6.0f, -5.0f, 6, 19, 10, 0.0f, false));
            this.rightarm.field_78804_l.add(new ModelBox(this.rightarm, 110, 52, -4.0f, 13.0f, -3.0f, 4, 21, 4, 0.0f, false));
            this.rightarm.field_78804_l.add(new ModelBox(this.rightarm, 64, 83, -4.5f, 34.0f, -5.0f, 5, 4, 5, 0.0f, false));
            this.rightarm.field_78804_l.add(new ModelBox(this.rightarm, 0, 19, -7.0f, -10.0f, -5.0f, 0, 14, 14, 0.0f, false));
            this.leftarm = new ModelRenderer(this);
            this.leftarm.func_78793_a(8.0f, -14.0f, -11.0f);
            this.leftarm.field_78804_l.add(new ModelBox(this.leftarm, 92, 77, 0.0f, -6.0f, -5.0f, 6, 19, 10, 0.0f, false));
            this.leftarm.field_78804_l.add(new ModelBox(this.leftarm, 110, 52, 0.0f, 13.0f, -3.0f, 4, 21, 4, 0.0f, false));
            this.leftarm.field_78804_l.add(new ModelBox(this.leftarm, 64, 83, -0.5f, 34.0f, -5.0f, 5, 4, 5, 0.0f, false));
            this.leftarm.field_78804_l.add(new ModelBox(this.leftarm, 0, 19, 7.0f, -10.0f, -5.0f, 0, 14, 14, 0.0f, false));
            this.leftleg = new ModelRenderer(this);
            this.leftleg.func_78793_a(7.0f, -14.0f, 16.0f);
            this.leftleg.field_78804_l.add(new ModelBox(this.leftleg, 92, 77, 0.0f, -6.0f, -5.0f, 6, 19, 10, 0.0f, false));
            this.leftleg.field_78804_l.add(new ModelBox(this.leftleg, 110, 52, 0.0f, 13.0f, 0.0f, 4, 21, 4, 0.0f, false));
            this.leftleg.field_78804_l.add(new ModelBox(this.leftleg, 64, 83, -0.5f, 34.0f, -2.0f, 5, 4, 5, 0.0f, false));
            this.leftleg.field_78804_l.add(new ModelBox(this.leftleg, 0, 19, 7.0f, -10.0f, -5.0f, 0, 14, 14, 0.0f, false));
            this.rightleg = new ModelRenderer(this);
            this.rightleg.func_78793_a(-7.0f, -14.0f, 16.0f);
            this.rightleg.field_78804_l.add(new ModelBox(this.rightleg, 92, 77, -6.0f, -6.0f, -5.0f, 6, 19, 10, 0.0f, false));
            this.rightleg.field_78804_l.add(new ModelBox(this.rightleg, 110, 52, -4.0f, 13.0f, 0.0f, 4, 21, 4, 0.0f, false));
            this.rightleg.field_78804_l.add(new ModelBox(this.rightleg, 64, 83, -4.5f, 34.0f, -2.0f, 5, 4, 5, 0.0f, false));
            this.rightleg.field_78804_l.add(new ModelBox(this.rightleg, 0, 19, -7.0f, -10.0f, -5.0f, 0, 14, 14, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.head.func_78785_a(f5);
            this.body.func_78785_a(f5);
            this.rightarm.func_78785_a(f5);
            this.leftarm.func_78785_a(f5);
            this.leftleg.func_78785_a(f5);
            this.rightleg.func_78785_a(f5);
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
            this.rightarm.field_78795_f = MathHelper.func_76134_b((f * 0.6662f) + 3.1415927f) * f1;
            this.leftleg.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
            this.leftarm.field_78795_f = MathHelper.func_76134_b(f * 0.6662f) * f1;
        }
    }
}
