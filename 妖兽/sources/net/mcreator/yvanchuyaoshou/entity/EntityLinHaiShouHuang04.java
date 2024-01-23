package net.mcreator.yvanchuyaoshou.entity;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureLinHaiShouHuangDie;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureLinHaiShouHuangUpdate;
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
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityLinHaiShouHuang04.class */
public class EntityLinHaiShouHuang04 extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 86;
    public static final int ENTITYID_RANGED = 87;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityLinHaiShouHuang04(ElementsYvanchuyaoshouMod instance) {
        super(instance, 53);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "lin_hai_shou_huang_04"), 86).name("lin_hai_shou_huang_04").tracker(64, 3, true).egg(-256, -3368704).build();
        });
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modelcaientity09(), 2.0f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityLinHaiShouHuang04.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/caientity09.png");
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityLinHaiShouHuang04$EntityCustom.class */
    public static class EntityCustom extends EntityMob {
        private final BossInfoServer bossInfo;

        public EntityCustom(World world) {
            super(world);
            this.bossInfo = new BossInfoServer(func_145748_c_(), BossInfo.Color.YELLOW, BossInfo.Overlay.PROGRESS);
            func_70105_a(2.0f, 2.0f);
            this.field_70728_aV = 80;
            this.field_70178_ae = true;
            func_94061_f(false);
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70715_bh.func_75776_a(1, new EntityAIHurtByTarget(this, true, new Class[0]));
            this.field_70715_bh.func_75776_a(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true, true));
            this.field_70715_bh.func_75776_a(3, new EntityAINearestAttackableTarget(this, EntityAnimal.class, true, true));
            this.field_70714_bg.func_75776_a(4, new EntityAIAttackMelee(this, 1.2d, true));
            this.field_70714_bg.func_75776_a(5, new EntityAILookIdle(this));
            this.field_70714_bg.func_75776_a(6, new EntityAISwimming(this));
            this.field_70714_bg.func_75776_a(7, new EntityAILeapAtTarget(this, 0.3f));
            this.field_70714_bg.func_75776_a(8, new EntityAIWander(this, 1.2d));
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
            EntityLinHaiShouHuang04.$_dependencies.put("entity", this);
            ProcedureShouJiNbt.executeProcedure(EntityLinHaiShouHuang04.$_dependencies);
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
            EntityLinHaiShouHuang04.$_dependencies.put("entity", this);
            EntityLinHaiShouHuang04.$_dependencies.put("x", Integer.valueOf(x));
            EntityLinHaiShouHuang04.$_dependencies.put("y", Integer.valueOf(y));
            EntityLinHaiShouHuang04.$_dependencies.put("z", Integer.valueOf(z));
            EntityLinHaiShouHuang04.$_dependencies.put("world", this.field_70170_p);
            ProcedureLinHaiShouHuangDie.executeProcedure(EntityLinHaiShouHuang04.$_dependencies);
        }

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityLinHaiShouHuang04.$_dependencies.put("entity", this);
            EntityLinHaiShouHuang04.$_dependencies.put("world", this.field_70170_p);
            ProcedureLinHaiShouHuangUpdate.executeProcedure(EntityLinHaiShouHuang04.$_dependencies);
        }

        protected void func_110147_ax() {
            super.func_110147_ax();
            if (func_110148_a(SharedMonsterAttributes.field_188791_g) != null) {
                func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(10.0d);
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

        public boolean func_184222_aU() {
            return false;
        }

        public void func_184178_b(EntityPlayerMP player) {
            super.func_184178_b(player);
            this.bossInfo.func_186760_a(player);
        }

        public void func_184203_c(EntityPlayerMP player) {
            super.func_184203_c(player);
            this.bossInfo.func_186761_b(player);
        }

        public void func_70071_h_() {
            super.func_70071_h_();
            this.bossInfo.func_186735_a(func_110143_aJ() / func_110138_aP());
        }
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityLinHaiShouHuang04$Modelcaientity09.class */
    public static class Modelcaientity09 extends ModelBase {
        private final ModelRenderer body;
        private final ModelRenderer wei;
        private final ModelRenderer rightleg;
        private final ModelRenderer rightleg2;
        private final ModelRenderer leftleg;
        private final ModelRenderer leftleg2;
        private final ModelRenderer rightarm;
        private final ModelRenderer rightarm2;
        private final ModelRenderer leftarm;
        private final ModelRenderer leftarm2;
        private final ModelRenderer head;
        private final ModelRenderer bone;
        private final ModelRenderer bone2;
        private final ModelRenderer bone3;

        public Modelcaientity09() {
            this.field_78090_t = EntityMoXiu02.ENTITYID;
            this.field_78089_u = EntityMoXiu04.ENTITYID;
            this.body = new ModelRenderer(this);
            this.body.func_78793_a(0.0f, 24.0f, 0.0f);
            this.body.field_78804_l.add(new ModelBox(this.body, 0, 0, -8.0f, -36.0f, -13.0f, 16, 16, 16, 0.0f, false));
            this.body.field_78804_l.add(new ModelBox(this.body, 0, 84, -9.0f, -37.0f, -14.0f, 18, 18, 18, 0.0f, false));
            this.body.field_78804_l.add(new ModelBox(this.body, 0, 32, -7.0f, -34.0f, 3.0f, 14, 14, 10, 0.0f, false));
            this.body.field_78804_l.add(new ModelBox(this.body, 64, 0, -7.0f, -36.0f, 13.0f, 14, 16, 16, 0.0f, false));
            this.wei = new ModelRenderer(this);
            this.wei.func_78793_a(0.0f, -34.0f, 29.0f);
            setRotationAngle(this.wei, 0.3491f, 0.0f, 0.0f);
            this.body.func_78792_a(this.wei);
            this.wei.field_78804_l.add(new ModelBox(this.wei, 36, 56, -1.0f, 0.0f, -1.0f, 2, 16, 2, 0.0f, false));
            this.wei.field_78804_l.add(new ModelBox(this.wei, 44, 56, -1.5f, 16.0f, -1.5f, 3, 8, 3, 0.0f, false));
            this.rightleg = new ModelRenderer(this);
            this.rightleg.func_78793_a(-7.0f, -5.0f, 20.0f);
            this.rightleg.field_78804_l.add(new ModelBox(this.rightleg, 0, 56, -5.0f, -2.0f, -6.0f, 6, 16, 12, 0.0f, false));
            this.rightleg2 = new ModelRenderer(this);
            this.rightleg2.func_78793_a(0.0f, 14.0f, 1.0f);
            this.rightleg.func_78792_a(this.rightleg2);
            this.rightleg2.field_78804_l.add(new ModelBox(this.rightleg2, 100, 43, -4.0f, 0.0f, 0.0f, 4, 12, 7, 0.0f, false));
            this.rightleg2.field_78804_l.add(new ModelBox(this.rightleg2, 100, 32, -5.0f, 12.0f, -3.0f, 6, 3, 8, 0.0f, false));
            this.leftleg = new ModelRenderer(this);
            this.leftleg.func_78793_a(7.0f, -5.0f, 20.0f);
            this.leftleg.field_78804_l.add(new ModelBox(this.leftleg, 0, 56, -1.0f, -2.0f, -6.0f, 6, 16, 12, 0.0f, false));
            this.leftleg2 = new ModelRenderer(this);
            this.leftleg2.func_78793_a(0.0f, 14.0f, 1.0f);
            this.leftleg.func_78792_a(this.leftleg2);
            this.leftleg2.field_78804_l.add(new ModelBox(this.leftleg2, 100, 43, 0.0f, 0.0f, 0.0f, 4, 12, 7, 0.0f, false));
            this.leftleg2.field_78804_l.add(new ModelBox(this.leftleg2, 100, 32, -1.0f, 12.0f, -3.0f, 6, 3, 8, 0.0f, false));
            this.rightarm = new ModelRenderer(this);
            this.rightarm.func_78793_a(-9.0f, -3.0f, -4.5f);
            this.rightarm.field_78804_l.add(new ModelBox(this.rightarm, 48, 32, -4.0f, -2.0f, -5.5f, 6, 14, 10, 0.0f, false));
            this.rightarm2 = new ModelRenderer(this);
            this.rightarm2.func_78793_a(-1.0f, 12.0f, 4.5f);
            this.rightarm.func_78792_a(this.rightarm2);
            this.rightarm2.field_78804_l.add(new ModelBox(this.rightarm2, 80, 32, -2.0f, 0.0f, -6.0f, 4, 12, 6, 0.0f, false));
            this.rightarm2.field_78804_l.add(new ModelBox(this.rightarm2, 100, 32, -3.0f, 12.0f, -9.0f, 6, 3, 8, 0.0f, false));
            this.leftarm = new ModelRenderer(this);
            this.leftarm.func_78793_a(9.0f, -3.0f, -4.5f);
            this.leftarm.field_78804_l.add(new ModelBox(this.leftarm, 48, 32, -2.0f, -2.0f, -5.5f, 6, 14, 10, 0.0f, false));
            this.leftarm2 = new ModelRenderer(this);
            this.leftarm2.func_78793_a(1.0f, 12.0f, 4.5f);
            this.leftarm.func_78792_a(this.leftarm2);
            this.leftarm2.field_78804_l.add(new ModelBox(this.leftarm2, 80, 32, -2.0f, 0.0f, -6.0f, 4, 12, 6, 0.0f, false));
            this.leftarm2.field_78804_l.add(new ModelBox(this.leftarm2, 100, 32, -3.0f, 12.0f, -9.0f, 6, 3, 8, 0.0f, false));
            this.head = new ModelRenderer(this);
            this.head.func_78793_a(0.0f, -11.0f, -14.0f);
            this.head.field_78804_l.add(new ModelBox(this.head, 56, 56, -6.0f, -5.0f, -9.0f, 12, 12, 10, 0.0f, false));
            this.head.field_78804_l.add(new ModelBox(this.head, 56, 78, -5.0f, 0.0f, -14.0f, 10, 8, 6, 0.0f, false));
            this.head.field_78804_l.add(new ModelBox(this.head, 72, 92, -3.0f, -14.0f, -4.0f, 6, 12, 14, 0.0f, false));
            this.bone = new ModelRenderer(this);
            this.bone.func_78793_a(0.0f, -5.0f, -4.0f);
            setRotationAngle(this.bone, 0.5236f, 0.0f, 0.0f);
            this.head.func_78792_a(this.bone);
            this.bone.field_78804_l.add(new ModelBox(this.bone, 0, (int) EntitySanXiu05.ENTITYID, -6.0f, 0.0f, 0.0f, 12, 0, 12, 0.0f, false));
            this.bone2 = new ModelRenderer(this);
            this.bone2.func_78793_a(6.0f, -5.0f, -3.0f);
            setRotationAngle(this.bone2, 0.6109f, 0.0f, 1.5708f);
            this.head.func_78792_a(this.bone2);
            this.bone2.field_78804_l.add(new ModelBox(this.bone2, 0, (int) EntitySanXiu05.ENTITYID, -2.0f, 0.0f, 0.0f, 12, 0, 12, 0.0f, false));
            this.bone3 = new ModelRenderer(this);
            this.bone3.func_78793_a(-6.0f, -5.0f, -3.0f);
            setRotationAngle(this.bone3, -0.6109f, 0.0f, 1.5708f);
            this.head.func_78792_a(this.bone3);
            this.bone3.field_78804_l.add(new ModelBox(this.bone3, 0, (int) EntitySanXiu05.ENTITYID, -2.0f, 0.0f, 0.0f, 12, 0, 12, 0.0f, false));
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
            this.rightleg2.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
            this.rightarm.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
            this.leftleg.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
            this.rightarm2.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
            this.leftarm2.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
            this.head.field_78796_g = f3 / 57.295776f;
            this.head.field_78795_f = f4 / 57.295776f;
            this.rightleg.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
            this.leftarm.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * 1.0f * f1;
            this.leftleg2.field_78795_f = MathHelper.func_76134_b(f * 1.0f) * (-1.0f) * f1;
        }
    }
}
