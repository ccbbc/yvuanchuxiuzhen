package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.mcreator.yvanchuyaoshou.entity.EntityMoXiu0302;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureMobsShuXingSet.class */
public class ProcedureMobsShuXingSet extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureMobsShuXingSet(ElementsYvanchuyaoshouMod instance) {
        super(instance, EntityMoXiu0302.ENTITYID);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if ((entityLivingBase.func_145748_c_().func_150260_c().contains("散修") || entityLivingBase.func_145748_c_().func_150260_c().contains("魔修")) && !((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
            ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureMobsShuXingSet.1
                public String func_70005_c_() {
                    return "";
                }

                public boolean func_70003_b(int permission, String command) {
                    return true;
                }

                public World func_130014_f_() {
                    return entityLivingBase.field_70170_p;
                }

                public MinecraftServer func_184102_h() {
                    return entityLivingBase.field_70170_p.func_73046_m();
                }

                public boolean func_174792_t_() {
                    return false;
                }

                public BlockPos func_180425_c() {
                    return entityLivingBase.func_180425_c();
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(entityLivingBase.field_70165_t, entityLivingBase.field_70163_u, entityLivingBase.field_70161_v);
                }

                public Entity func_174793_f() {
                    return entityLivingBase;
                }
            }, "execute @s ~ ~ ~ scoreboard players tag @s add xiushi");
        }
        if (!((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
            ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureMobsShuXingSet.2
                public String func_70005_c_() {
                    return "";
                }

                public boolean func_70003_b(int permission, String command) {
                    return true;
                }

                public World func_130014_f_() {
                    return entityLivingBase.field_70170_p;
                }

                public MinecraftServer func_184102_h() {
                    return entityLivingBase.field_70170_p.func_73046_m();
                }

                public boolean func_174792_t_() {
                    return false;
                }

                public BlockPos func_180425_c() {
                    return entityLivingBase.func_180425_c();
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(entityLivingBase.field_70165_t, entityLivingBase.field_70163_u, entityLivingBase.field_70161_v);
                }

                public Entity func_174793_f() {
                    return entityLivingBase;
                }
            }, "execute @s ~ ~ ~ scoreboard players tag @s add xiuxianmobs");
        }
        entityLivingBase.getEntityData().func_74757_a("XiuXianMobs", true);
        if (entityLivingBase.func_145748_c_().func_150260_c().contains("散修") || entityLivingBase.func_145748_c_().func_150260_c().contains("魔修")) {
            $_dependencies.put("entity", entityLivingBase);
            ProcedureNameSet.executeProcedure($_dependencies);
        }
        entityLivingBase.getEntityData().func_74778_a("名称", entityLivingBase.func_145748_c_().func_150260_c());
        entityLivingBase.func_96094_a(entityLivingBase.func_145748_c_().func_150260_c().replace(" ", "_"));
        entityLivingBase.getEntityData().func_74780_a("Defense", entityLivingBase.getEntityData().func_74769_h("defense"));
        entityLivingBase.getEntityData().func_74780_a("MagicAttack", entityLivingBase.getEntityData().func_74769_h("法攻"));
        entityLivingBase.getEntityData().func_74780_a("MagicDefense", entityLivingBase.getEntityData().func_74769_h("法防"));
        entityLivingBase.getEntityData().func_74780_a("ThunderAttack", entityLivingBase.getEntityData().func_74769_h("雷攻"));
        entityLivingBase.getEntityData().func_74780_a("ThunderDefense", entityLivingBase.getEntityData().func_74769_h("雷防"));
        entityLivingBase.getEntityData().func_74780_a("FireAttack", entityLivingBase.getEntityData().func_74769_h("火攻"));
        entityLivingBase.getEntityData().func_74780_a("FireDefense", entityLivingBase.getEntityData().func_74769_h("火防"));
        entityLivingBase.getEntityData().func_74780_a("PoisonAttack", entityLivingBase.getEntityData().func_74769_h("毒攻"));
        entityLivingBase.getEntityData().func_74780_a("PoisonDefense", entityLivingBase.getEntityData().func_74769_h("毒防"));
        entityLivingBase.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a((float) entityLivingBase.getEntityData().func_74769_h("生命"));
        entityLivingBase.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a((float) entityLivingBase.getEntityData().func_74769_h("攻击"));
    }
}
