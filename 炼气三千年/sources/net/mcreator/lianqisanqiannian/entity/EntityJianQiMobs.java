package net.mcreator.lianqisanqiannian.entity;

import java.util.ArrayList;
import java.util.Iterator;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.mcreator.lianqisanqiannian.LianqisanqiannianMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityFlyHelper;
import net.minecraft.item.Item;
import net.minecraft.pathfinding.PathNavigateFlying;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.RegistryNamespaced;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/entity/EntityJianQiMobs.class */
public class EntityJianQiMobs extends ElementsLianqisanqiannianMod.ModElement {
    public static final int ENTITYID = 1;
    public static final int ENTITYID_RANGED = 2;

    public EntityJianQiMobs(ElementsLianqisanqiannianMod instance) {
        super(instance, 16);
    }

    @Override // net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(LianqisanqiannianMod.MODID, "jian_qi_mobs"), 1).name("jian_qi_mobs").tracker(64, 3, true).build();
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

    @Override // net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            return new RenderLiving(renderManager, new Modeljian_qi3(), 0.0f) { // from class: net.mcreator.lianqisanqiannian.entity.EntityJianQiMobs.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("lianqisanqiannian:textures/jian_qi2.png");
                }
            };
        });
    }

    /* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/entity/EntityJianQiMobs$EntityCustom.class */
    public static class EntityCustom extends EntityCreature {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(1.0f, 1.0f);
            this.field_70728_aV = 0;
            this.field_70178_ae = false;
            func_94061_f(true);
            func_110163_bv();
            this.field_70699_by = new PathNavigateFlying(this, this.field_70170_p);
            this.field_70765_h = new EntityFlyHelper(this);
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
            return (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation(""));
        }

        public SoundEvent func_184615_bR() {
            return (SoundEvent) SoundEvent.field_187505_a.func_82594_a(new ResourceLocation(""));
        }

        protected float func_70599_aP() {
            return 1.0f;
        }

        public void func_180430_e(float l, float d) {
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
                func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(1.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111264_e) != null) {
                func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(1.0d);
            }
            func_110140_aT().func_111150_b(SharedMonsterAttributes.field_193334_e);
            func_110148_a(SharedMonsterAttributes.field_193334_e).func_111128_a(0.3d);
        }

        public void func_70071_h_() {
            super.func_70071_h_();
            func_189654_d(true);
        }

        protected void func_184231_a(double y, boolean onGroundIn, IBlockState state, BlockPos pos) {
        }

        public void func_189654_d(boolean ignored) {
            super.func_189654_d(true);
        }
    }

    /* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/entity/EntityJianQiMobs$Modeljian_qi3.class */
    public static class Modeljian_qi3 extends ModelBase {
        private final ModelRenderer jian_qi;

        public Modeljian_qi3() {
            this.field_78090_t = 32;
            this.field_78089_u = 32;
            this.jian_qi = new ModelRenderer(this);
            this.jian_qi.func_78793_a(0.0f, 24.0f, 0.0f);
            this.jian_qi.field_78804_l.add(new ModelBox(this.jian_qi, -16, 0, -8.0f, -8.0f, -8.0f, 16, 0, 16, 0.0f, false));
        }

        public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.jian_qi.func_78785_a(f5);
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
