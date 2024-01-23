package net.mcreator.yvanchujiguan.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod;
import net.mcreator.yvanchujiguan.YvanchujiguanMod;
import net.mcreator.yvanchujiguan.procedure.ProcedurePutuanDangRightClickDo;
import net.mcreator.yvanchujiguan.procedure.ProcedurePutuanEntityFalls;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
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

@ElementsYvanchujiguanMod.ModElement.Tag
/* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/entity/EntityPutuan.class */
public class EntityPutuan extends ElementsYvanchujiguanMod.ModElement {
    public static final int ENTITYID = 1;
    public static final int ENTITYID_RANGED = 2;
    static Map<String, Object> $_dependencies = new HashMap();

    public EntityPutuan(ElementsYvanchujiguanMod instance) {
        super(instance, 38);
    }

    @Override // net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(YvanchujiguanMod.MODID, "putuan"), 1).name("putuan").tracker(64, 3, true).build();
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

    @Override // net.mcreator.yvanchujiguan.ElementsYvanchujiguanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modelputuan(), 0.7f) { // from class: net.mcreator.yvanchujiguan.entity.EntityPutuan.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("yvanchujiguan:textures/putuan.png");
                }
            };
        });
    }

    /* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/entity/EntityPutuan$EntityCustom.class */
    public static class EntityCustom extends EntityCreature {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(1.0f, 0.2f);
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

        public boolean func_70097_a(DamageSource source, float amount) {
            int x = (int) this.field_70165_t;
            int y = (int) this.field_70163_u;
            int z = (int) this.field_70161_v;
            source.func_76346_g();
            EntityPutuan.$_dependencies.put("entity", this);
            EntityPutuan.$_dependencies.put("x", Integer.valueOf(x));
            EntityPutuan.$_dependencies.put("y", Integer.valueOf(y));
            EntityPutuan.$_dependencies.put("z", Integer.valueOf(z));
            EntityPutuan.$_dependencies.put("world", this.field_70170_p);
            ProcedurePutuanEntityFalls.executeProcedure(EntityPutuan.$_dependencies);
            if ((source.func_76364_f() instanceof EntityPotion) || source == DamageSource.field_76379_h || source == DamageSource.field_76367_g || source == DamageSource.field_76369_e) {
                return false;
            }
            return super.func_70097_a(source, amount);
        }

        public boolean func_184645_a(EntityPlayer entity, EnumHand hand) {
            super.func_184645_a(entity, hand);
            if (!entity.func_70093_af()) {
                entity.func_184220_m(this);
            }
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            entity.func_184586_b(hand);
            EntityPutuan.$_dependencies.put("entity", entity);
            ProcedurePutuanDangRightClickDo.executeProcedure(EntityPutuan.$_dependencies);
            return true;
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
                func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(10.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111264_e) != null) {
                func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(3.0d);
            }
        }
    }

    /* loaded from: 功法-mc1.12.2-2.0.25.jar:net/mcreator/yvanchujiguan/entity/EntityPutuan$Modelputuan.class */
    public static class Modelputuan extends ModelBase {
        private final ModelRenderer bb_main;

        public Modelputuan() {
            this.field_78090_t = 48;
            this.field_78089_u = 54;
            this.bb_main = new ModelRenderer(this);
            this.bb_main.func_78793_a(0.0f, 24.0f, 0.0f);
            this.bb_main.field_78804_l.add(new ModelBox(this.bb_main, 0, 0, -4.0f, -4.0f, -8.0f, 8, 4, 16, 0.0f, false));
            this.bb_main.field_78804_l.add(new ModelBox(this.bb_main, 0, 20, -6.0f, -4.0f, -7.0f, 2, 4, 14, 0.0f, false));
            this.bb_main.field_78804_l.add(new ModelBox(this.bb_main, 0, 38, -7.0f, -4.0f, -6.0f, 1, 4, 12, 0.0f, false));
            this.bb_main.field_78804_l.add(new ModelBox(this.bb_main, 26, 38, -8.0f, -4.0f, -4.0f, 1, 4, 8, 0.0f, false));
            this.bb_main.field_78804_l.add(new ModelBox(this.bb_main, 0, 20, 4.0f, -4.0f, -7.0f, 2, 4, 14, 0.0f, false));
            this.bb_main.field_78804_l.add(new ModelBox(this.bb_main, 0, 38, 6.0f, -4.0f, -6.0f, 1, 4, 12, 0.0f, false));
            this.bb_main.field_78804_l.add(new ModelBox(this.bb_main, 26, 38, 7.0f, -4.0f, -4.0f, 1, 4, 8, 0.0f, false));
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
