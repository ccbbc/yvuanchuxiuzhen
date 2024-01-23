package net.mcreator.yvanchuxiuzhen.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.YvanchuxiuzhenMod;
import net.mcreator.yvanchuxiuzhen.procedure.ProcedureJiaRenUpdate;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.registry.RegistryNamespaced;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/entity/EntityJiaRen.class */
public class EntityJiaRen extends ElementsYvanchuxiuzhenMod.ModElement {
    public static final int ENTITYID = 57;
    public static final int ENTITYID_RANGED = 58;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityJiaRen(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 430);
    }

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuxiuzhenMod.MODID, "jia_ren"), 57).name("jia_ren").tracker(64, 3, true).egg(-3381760, -3407872).build();
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

    @Override // net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modeljia_ren(), 0.5f) { // from class: net.mcreator.yvanchuxiuzhen.entity.EntityJiaRen.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuxiuzhen:textures/jia_ren.png");
                }
            };
        });
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/entity/EntityJiaRen$EntityCustom.class */
    public static class EntityCustom extends EntityCreature {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(0.6f, 2.0f);
            this.field_70728_aV = 0;
            this.field_70178_ae = false;
            func_94061_f(true);
            func_110163_bv();
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

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            EntityJiaRen.$_dependencies.put("entity", this);
            ProcedureJiaRenUpdate.executeProcedure(EntityJiaRen.$_dependencies);
        }

        protected void func_110147_ax() {
            super.func_110147_ax();
            if (func_110148_a(SharedMonsterAttributes.field_188791_g) != null) {
                func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(0.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111263_d) != null) {
                func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.3d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111267_a) != null) {
                func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(1024.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111264_e) != null) {
                func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(1.0d);
            }
        }
    }

    /* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/entity/EntityJiaRen$Modeljia_ren.class */
    public static class Modeljia_ren extends ModelBase {
        private final ModelRenderer Head;
        private final ModelRenderer RightArm;
        private final ModelRenderer Body;
        private final ModelRenderer LeftArm;
        private final ModelRenderer RightLeg;
        private final ModelRenderer LeftLeg;

        public Modeljia_ren() {
            this.field_78090_t = 128;
            this.field_78089_u = 128;
            this.Head = new ModelRenderer(this);
            this.Head.func_78793_a(0.0f, -1.0f, 0.0f);
            this.Head.field_78804_l.add(new ModelBox(this.Head, 0, 18, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f, false));
            this.Head.field_78804_l.add(new ModelBox(this.Head, 0, 0, -4.5f, -8.0f, -4.5f, 9, 9, 9, 0.0f, false));
            this.RightArm = new ModelRenderer(this);
            this.RightArm.func_78793_a(-5.0f, 2.0f, 0.0f);
            this.Head.func_78792_a(this.RightArm);
            this.RightArm.field_78804_l.add(new ModelBox(this.RightArm, 16, 58, -3.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f, false));
            this.RightArm.field_78804_l.add(new ModelBox(this.RightArm, 52, 26, -3.25f, -2.25f, -2.25f, 4, 12, 4, 0.0f, false));
            this.Body = new ModelRenderer(this);
            this.Body.func_78793_a(0.0f, 0.0f, 0.0f);
            this.Head.func_78792_a(this.Body);
            this.Body.field_78804_l.add(new ModelBox(this.Body, 32, 14, -4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f, false));
            this.Body.field_78804_l.add(new ModelBox(this.Body, 28, 30, -4.25f, -0.25f, -2.25f, 8, 12, 4, 0.0f, false));
            this.LeftArm = new ModelRenderer(this);
            this.LeftArm.func_78793_a(5.0f, 2.0f, 0.0f);
            this.Head.func_78792_a(this.LeftArm);
            this.LeftArm.field_78804_l.add(new ModelBox(this.LeftArm, 52, 0, -1.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f, false));
            this.LeftArm.field_78804_l.add(new ModelBox(this.LeftArm, 0, 50, -1.25f, -2.25f, -2.25f, 4, 12, 4, 0.0f, false));
            this.RightLeg = new ModelRenderer(this);
            this.RightLeg.func_78793_a(-1.9f, 12.0f, 0.0f);
            this.Head.func_78792_a(this.RightLeg);
            this.RightLeg.field_78804_l.add(new ModelBox(this.RightLeg, 48, 42, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f, false));
            this.RightLeg.field_78804_l.add(new ModelBox(this.RightLeg, 32, 46, -2.25f, -0.25f, -2.25f, 4, 12, 4, 0.0f, false));
            this.LeftLeg = new ModelRenderer(this);
            this.LeftLeg.func_78793_a(1.9f, 12.0f, 0.0f);
            this.Head.func_78792_a(this.LeftLeg);
            this.LeftLeg.field_78804_l.add(new ModelBox(this.LeftLeg, 16, 42, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f, false));
            this.LeftLeg.field_78804_l.add(new ModelBox(this.LeftLeg, 0, 34, -2.25f, -0.25f, -2.25f, 4, 12, 4, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.Head.func_78785_a(f5);
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
