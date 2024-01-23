package net.mcreator.fabaokuozhan.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.FabaokuozhanMod;
import net.mcreator.fabaokuozhan.procedure.ProcedureInjuryExecutorDangShiTiGengXinKeShi;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
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

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/entity/EntityInjuryExecutor.class */
public class EntityInjuryExecutor extends ElementsFabaokuozhanMod.ModElement {
    public static final int ENTITYID = 21;
    public static final int ENTITYID_RANGED = 22;

    public EntityInjuryExecutor(ElementsFabaokuozhanMod instance) {
        super(instance, 383);
    }

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    public void initElements() {
        this.elements.entities.add(() -> {
            return EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation(FabaokuozhanMod.MODID, "injury_executor"), 21).name("injury_executor").tracker(64, 3, true).build();
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

    @Override // net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod.ModElement
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            RenderBiped customRender = new RenderBiped(renderManager, new ModelBiped(), 0.0f) { // from class: net.mcreator.fabaokuozhan.entity.EntityInjuryExecutor.1
                protected ResourceLocation func_110775_a(Entity entity) {
                    return new ResourceLocation("fabaokuozhan:textures/lianqiziti06.png");
                }
            };
            customRender.func_177094_a(new LayerBipedArmor(customRender) { // from class: net.mcreator.fabaokuozhan.entity.EntityInjuryExecutor.2
                protected void func_177177_a() {
                    this.field_177189_c = new ModelBiped(0.5f);
                    this.field_177186_d = new ModelBiped(1.0f);
                }
            });
            return customRender;
        });
    }

    /* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/entity/EntityInjuryExecutor$EntityCustom.class */
    public static class EntityCustom extends EntityCreature {
        public EntityCustom(World world) {
            super(world);
            func_70105_a(0.6f, 1.8f);
            this.field_70728_aV = 0;
            this.field_70178_ae = false;
            func_94061_f(false);
            this.field_70699_by = new PathNavigateFlying(this, this.field_70170_p);
            this.field_70765_h = new EntityFlyHelper(this);
        }

        protected void func_184651_r() {
            super.func_184651_r();
            this.field_70714_bg.func_75776_a(1, new EntityAIAttackMelee(this, 1.2d, false));
            this.field_70714_bg.func_75776_a(2, new EntityAIWander(this, 1.0d));
            this.field_70715_bh.func_75776_a(3, new EntityAIHurtByTarget(this, false, new Class[0]));
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

        public void func_70030_z() {
            super.func_70030_z();
            int i = (int) this.field_70165_t;
            int i2 = (int) this.field_70163_u;
            int i3 = (int) this.field_70161_v;
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("entity", this);
            ProcedureInjuryExecutorDangShiTiGengXinKeShi.executeProcedure($_dependencies);
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
                func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(10.0d);
            }
            if (func_110148_a(SharedMonsterAttributes.field_111264_e) != null) {
                func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(0.0d);
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
}
