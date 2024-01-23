package net.mcreator.yvanchuyaoshou.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.YvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.procedure.ProcedureZhadanOnEntityTickUpdate;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
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

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityZhadan.class */
public class EntityZhadan extends ElementsYvanchuyaoshouMod.ModElement {
    public static final int ENTITYID = 31;
    public static final int ENTITYID_RANGED = 32;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityZhadan(ElementsYvanchuyaoshouMod instance) {
        super(instance, 98);
    }

    @Override // net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchuyaoshouMod.MODID, "zhadan"), 31).name("zhadan").tracker(64, 3, true).build();
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
            return new RenderLiving(renderManager, new Modelzhadan(), 0.5f) { // from class: net.mcreator.yvanchuyaoshou.entity.EntityZhadan.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchuyaoshou:textures/zhadan.png");
                }
            };
        });
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityZhadan$EntityCustom.class */
    public static class EntityCustom extends EntityCreature {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(0.6f, 0.5f);
            this.field_70728_aV = 0;
            this.field_70178_ae = false;
            func_94061_f(false);
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70714_bg.func_75776_a(1, new EntityAILookIdle(this));
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
            if (source == DamageSource.field_76379_h) {
                return false;
            }
            return super.func_70097_a(source, amount);
        }

        public void func_70030_z() {
            super.func_70030_z();
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            EntityZhadan.$_dependencies.put("entity", this);
            EntityZhadan.$_dependencies.put("x", Integer.valueOf(x));
            EntityZhadan.$_dependencies.put("y", Integer.valueOf(y));
            EntityZhadan.$_dependencies.put("z", Integer.valueOf(z));
            EntityZhadan.$_dependencies.put("world", this.field_70170_p);
            ProcedureZhadanOnEntityTickUpdate.executeProcedure(EntityZhadan.$_dependencies);
        }

        protected void func_110147_ax() {
            super.func_110147_ax();
            if (func_110148_a(SharedMonsterAttributes.field_188791_g) != null) {
                func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(0.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111263_d) != null) {
                func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111267_a) != null) {
                func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(1.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111264_e) != null) {
                func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(3.0d);
            }
        }
    }

    /* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/entity/EntityZhadan$Modelzhadan.class */
    public static class Modelzhadan extends ModelBase {
        private final ModelRenderer bb_main;

        public Modelzhadan() {
            this.field_78090_t = 16;
            this.field_78089_u = 12;
            this.bb_main = new ModelRenderer(this);
            this.bb_main.func_78793_a(0.0f, 24.0f, 0.0f);
            this.bb_main.field_78804_l.add(new ModelBox(this.bb_main, 0, 0, -2.0f, -4.0f, -2.0f, 4, 4, 4, 0.0f, false));
            this.bb_main.field_78804_l.add(new ModelBox(this.bb_main, 0, 8, -1.5f, -5.0f, -1.5f, 3, 1, 3, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
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
