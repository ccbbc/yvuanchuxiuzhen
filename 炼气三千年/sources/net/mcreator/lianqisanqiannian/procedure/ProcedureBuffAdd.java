package net.mcreator.lianqisanqiannian.procedure;

import java.util.Map;
import net.mcreator.lianqisanqiannian.ElementsLianqisanqiannianMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLianqisanqiannianMod.ModElement.Tag
/* loaded from: 练气三千年-mc1.12.2-1.1.2.jar:net/mcreator/lianqisanqiannian/procedure/ProcedureBuffAdd.class */
public class ProcedureBuffAdd extends ElementsLianqisanqiannianMod.ModElement {
    public ProcedureBuffAdd(ElementsLianqisanqiannianMod instance) {
        super(instance, 27);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (entityLivingBase.func_70051_ag() && entityLivingBase.getEntityData().func_74769_h("BuffAdd1") > 0.0d) {
            if (entityLivingBase.getEntityData().func_74769_h("BuffAdd1") > 2.0d) {
                entityLivingBase.getEntityData().func_74780_a("BuffAdd1", 2.0d);
            }
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76424_c, 20, (int) (entityLivingBase.getEntityData().func_74769_h("BuffAdd1") - 1.0d), false, false));
            }
        } else if (entityLivingBase.getEntityData().func_74769_h("BuffAdd2") > 0.0d) {
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_188425_z, 20, (int) (entityLivingBase.getEntityData().func_74769_h("BuffAdd2") - 1.0d), false, false));
            }
        } else if (!entityLivingBase.getEntityData().func_74767_n("战斗状态") && entityLivingBase.getEntityData().func_74769_h("BuffAdd3") > 0.0d) {
            if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) < (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f)) {
                if (entityLivingBase.getEntityData().func_74769_h("BuffAdd3") > 5.0d) {
                    entityLivingBase.getEntityData().func_74780_a("BuffAdd3", 5.0d);
                }
                if (entityLivingBase instanceof EntityLivingBase) {
                    entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76428_l, 20, (int) (entityLivingBase.getEntityData().func_74769_h("BuffAdd3") - 1.0d), false, false));
                }
            }
        } else if (new ItemStack(world.func_180495_p(new BlockPos(x, y, z)).func_177230_c()).func_77973_b().getRegistryName().toString().contains("water") && new ItemStack(world.func_180495_p(new BlockPos(x, y + 1, z)).func_177230_c()).func_77973_b().getRegistryName().toString().contains("water") && entityLivingBase.getEntityData().func_74769_h("BuffAdd9") > 0.0d) {
            if (entityLivingBase.getEntityData().func_74769_h("BuffAdd9") > 1.0d) {
                entityLivingBase.getEntityData().func_74780_a("BuffAdd9", 1.0d);
            }
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76427_o, 20, (int) (entityLivingBase.getEntityData().func_74769_h("BuffAdd9") - 1.0d), false, false));
            }
        } else if (entityLivingBase.getEntityData().func_74769_h("BuffAdd10") > 0.0d) {
            if (entityLivingBase.getEntityData().func_74769_h("BuffAdd10") > 1.0d) {
                entityLivingBase.getEntityData().func_74780_a("BuffAdd10", 1.0d);
            }
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76443_y, 20, (int) (entityLivingBase.getEntityData().func_74769_h("BuffAdd10") - 1.0d), false, false));
            }
        } else if ((new ItemStack(world.func_180495_p(new BlockPos(x, y, z)).func_177230_c()).func_77973_b().getRegistryName().toString().contains("water") || new ItemStack(world.func_180495_p(new BlockPos(x, y, z)).func_177230_c()).func_77973_b().getRegistryName().toString().contains("fire") || new ItemStack(world.func_180495_p(new BlockPos(x, y - 1, z)).func_177230_c()).func_77973_b().getRegistryName().toString().contains("magma")) && entityLivingBase.getEntityData().func_74769_h("BuffAdd11") > 0.0d) {
            if (entityLivingBase.getEntityData().func_74769_h("BuffAdd11") > 1.0d) {
                entityLivingBase.getEntityData().func_74780_a("BuffAdd11", 1.0d);
            }
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76426_n, 20, (int) (entityLivingBase.getEntityData().func_74769_h("BuffAdd11") - 1.0d), false, false));
            }
        } else if (entityLivingBase.func_70093_af() && entityLivingBase.getEntityData().func_74769_h("BuffAdd12") > 0.0d) {
            if (entityLivingBase.getEntityData().func_74769_h("BuffAdd12") > 1.0d) {
                entityLivingBase.getEntityData().func_74780_a("BuffAdd12", 1.0d);
            }
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76441_p, 20, (int) (entityLivingBase.getEntityData().func_74769_h("BuffAdd12") - 1.0d), false, false));
            }
        } else if (!world.func_72935_r() && entityLivingBase.getEntityData().func_74769_h("BuffAdd13") > 0.0d) {
            if (entityLivingBase.getEntityData().func_74769_h("BuffAdd13") > 1.0d) {
                entityLivingBase.getEntityData().func_74780_a("BuffAdd13", 1.0d);
            }
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70690_d(new PotionEffect(MobEffects.field_76439_r, 20, (int) (entityLivingBase.getEntityData().func_74769_h("BuffAdd13") - 1.0d), false, false));
            }
        }
    }
}
