package net.mcreator.yvanchuyaoshou.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityCaientity02;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu01;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu0102;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu02;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu0202;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu03;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu0302;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu04;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu05;
import net.mcreator.yvanchuyaoshou.entity.EntitySanXiu0502;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureHeHuanZongDie;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureHeHuanZongUpdate;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureNameSet;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureShouJiNbt;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
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
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.RegistryNamespaced;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityHeHuanZong2.class */
public class EntityHeHuanZong2 extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 208;
    public static final int ENTITYID_RANGED = 209;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityHeHuanZong2(ElementsYvanchuyaoshouMod instance) {
        super(instance, 92);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "he_huan_zong_2"), (int) ENTITYID).name("he_huan_zong_2").tracker(64, 3, true).egg(-10092391, -26317).build();
        });
    }

    private Biome[] allbiomes(RegistryNamespaced<ResourceLocation, Biome> in) {
        Iterator<Biome> itr = in.iterator();
        ArrayList<Biome> ls = new ArrayList<>();
        while (itr.hasNext()) {
            ls.add(itr.next());
        }
        return (Biome[]) ls.toArray(new Biome[ls.size()]);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modelsteve(), 0.5f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityHeHuanZong2.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/he_huan_zong_2.png");
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityHeHuanZong2$EntityCustom.class */
    public static class EntityCustom extends EntityMob {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(0.6f, 1.8f);
            this.field_70728_aV = 0;
            this.field_70178_ae = false;
            func_94061_f(false);
            func_110163_bv();
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70715_bh.func_75776_a(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true, true));
            this.field_70715_bh.func_75776_a(2, new EntityAINearestAttackableTarget(this, EntitySanXiu01.EntityCustom.class, true, true));
            this.field_70715_bh.func_75776_a(3, new EntityAINearestAttackableTarget(this, EntitySanXiu02.EntityCustom.class, true, true));
            this.field_70715_bh.func_75776_a(4, new EntityAINearestAttackableTarget(this, EntitySanXiu03.EntityCustom.class, true, true));
            this.field_70715_bh.func_75776_a(5, new EntityAINearestAttackableTarget(this, EntitySanXiu04.EntityCustom.class, true, true));
            this.field_70715_bh.func_75776_a(6, new EntityAINearestAttackableTarget(this, EntitySanXiu05.EntityCustom.class, true, true));
            this.field_70715_bh.func_75776_a(7, new EntityAINearestAttackableTarget(this, EntitySanXiu0102.EntityCustom.class, true, true));
            this.field_70715_bh.func_75776_a(8, new EntityAINearestAttackableTarget(this, EntitySanXiu0202.EntityCustom.class, true, true));
            this.field_70715_bh.func_75776_a(9, new EntityAINearestAttackableTarget(this, EntitySanXiu0302.EntityCustom.class, true, true));
            this.field_70715_bh.func_75776_a(10, new EntityAINearestAttackableTarget(this, EntityCaientity02.EntityCustom.class, true, true));
            this.field_70715_bh.func_75776_a(11, new EntityAINearestAttackableTarget(this, EntitySanXiu0502.EntityCustom.class, true, true));
            this.field_70714_bg.func_75776_a(12, new EntityAIAttackMelee(this, 1.2d, false));
            this.field_70714_bg.func_75776_a(13, new EntityAIWander(this, 1.0d));
            this.field_70715_bh.func_75776_a(14, new EntityAIHurtByTarget(this, false, new Class[0]));
            this.field_70714_bg.func_75776_a(15, new EntityAILookIdle(this));
            this.field_70714_bg.func_75776_a(16, new EntityAISwimming(this));
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
            EntityHeHuanZong2.$_dependencies.put("entity", this);
            ProcedureShouJiNbt.executeProcedure(EntityHeHuanZong2.$_dependencies);
            return super.func_70097_a(source, amount);
        }

        public void func_70645_a(DamageSource source) {
            super.func_70645_a(source);
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            EntityHeHuanZong2.$_dependencies.put("entity", this);
            EntityHeHuanZong2.$_dependencies.put("x", Integer.valueOf(x));
            EntityHeHuanZong2.$_dependencies.put("y", Integer.valueOf(y));
            EntityHeHuanZong2.$_dependencies.put("z", Integer.valueOf(z));
            EntityHeHuanZong2.$_dependencies.put("world", this.field_70170_p);
            ProcedureHeHuanZongDie.executeProcedure(EntityHeHuanZong2.$_dependencies);
        }

        public IEntityLivingData func_180482_a(DifficultyInstance difficulty, IEntityLivingData livingdata) {
            IEntityLivingData retval = super.func_180482_a(difficulty, livingdata);
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityHeHuanZong2.$_dependencies.put("entity", this);
            ProcedureNameSet.executeProcedure(EntityHeHuanZong2.$_dependencies);
            return retval;
        }

        public void func_70030_z() {
            super.func_70030_z();
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            EntityHeHuanZong2.$_dependencies.put("entity", this);
            EntityHeHuanZong2.$_dependencies.put("x", Integer.valueOf(x));
            EntityHeHuanZong2.$_dependencies.put("y", Integer.valueOf(y));
            EntityHeHuanZong2.$_dependencies.put("z", Integer.valueOf(z));
            EntityHeHuanZong2.$_dependencies.put("world", this.field_70170_p);
            ProcedureHeHuanZongUpdate.executeProcedure(EntityHeHuanZong2.$_dependencies);
        }

        protected void func_110147_ax() {
            super.func_110147_ax();
            if (func_110148_a(SharedMonsterAttributes.field_188791_g) != null) {
                func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(12.0d);
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

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityHeHuanZong2$Modelsteve.class */
    public static class Modelsteve extends ModelBase {
        private final ModelRenderer Head;
        private final ModelRenderer Body;
        private final ModelRenderer RightArm;
        private final ModelRenderer LeftArm;
        private final ModelRenderer RightLeg;
        private final ModelRenderer LeftLeg;

        public Modelsteve() {
            this.field_78090_t = 64;
            this.field_78089_u = 64;
            this.Head = new ModelRenderer(this);
            this.Head.func_78793_a(0.0f, 0.0f, 0.0f);
            this.Head.field_78804_l.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f, false));
            this.Head.field_78804_l.add(new ModelBox(this.Head, 32, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.5f, false));
            this.Body = new ModelRenderer(this);
            this.Body.func_78793_a(0.0f, 0.0f, 0.0f);
            this.Body.field_78804_l.add(new ModelBox(this.Body, 16, 16, -4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f, false));
            this.Body.field_78804_l.add(new ModelBox(this.Body, 16, 32, -4.0f, 0.0f, -2.0f, 8, 12, 4, 0.25f, false));
            this.RightArm = new ModelRenderer(this);
            this.RightArm.func_78793_a(-5.0f, 2.0f, 0.0f);
            this.RightArm.field_78804_l.add(new ModelBox(this.RightArm, 40, 16, -3.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f, false));
            this.RightArm.field_78804_l.add(new ModelBox(this.RightArm, 40, 32, -3.0f, -2.0f, -2.0f, 4, 12, 4, 0.25f, false));
            this.LeftArm = new ModelRenderer(this);
            this.LeftArm.func_78793_a(5.0f, 2.0f, 0.0f);
            this.LeftArm.field_78804_l.add(new ModelBox(this.LeftArm, 32, 48, -1.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f, false));
            this.LeftArm.field_78804_l.add(new ModelBox(this.LeftArm, 48, 48, -1.0f, -2.0f, -2.0f, 4, 12, 4, 0.25f, false));
            this.RightLeg = new ModelRenderer(this);
            this.RightLeg.func_78793_a(-1.9f, 12.0f, 0.0f);
            this.RightLeg.field_78804_l.add(new ModelBox(this.RightLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f, false));
            this.RightLeg.field_78804_l.add(new ModelBox(this.RightLeg, 0, 32, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.25f, false));
            this.LeftLeg = new ModelRenderer(this);
            this.LeftLeg.func_78793_a(1.9f, 12.0f, 0.0f);
            this.LeftLeg.field_78804_l.add(new ModelBox(this.LeftLeg, 16, 48, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f, false));
            this.LeftLeg.field_78804_l.add(new ModelBox(this.LeftLeg, 0, 48, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.25f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.Head.func_78785_a(f5);
            this.Body.func_78785_a(f5);
            this.RightArm.func_78785_a(f5);
            this.LeftArm.func_78785_a(f5);
            this.RightLeg.func_78785_a(f5);
            this.LeftLeg.func_78785_a(f5);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.field_78795_f = x;
            modelRenderer.field_78796_g = y;
            modelRenderer.field_78808_h = z;
        }

        public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
            super.func_78087_a(f, f1, f2, f3, f4, f5, e);
            this.RightArm.field_78795_f = MathHelper.func_76134_b((f * 0.6662f) + 3.1415927f) * f1;
            this.LeftLeg.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
            this.Head.field_78796_g = f3 / 57.295776f;
            this.Head.field_78795_f = f4 / 57.295776f;
            this.LeftArm.field_78795_f = MathHelper.func_76134_b(f * 0.6662f) * f1;
            this.RightLeg.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
        }
    }
}
