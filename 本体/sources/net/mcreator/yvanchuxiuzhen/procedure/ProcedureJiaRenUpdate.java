package net.mcreator.yvanchuxiuzhen.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureJiaRenUpdate.class */
public class ProcedureJiaRenUpdate extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureJiaRenUpdate(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 434);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final EntityLivingBase entityLivingBase = (Entity) dependencies.get("entity");
        if (!entityLivingBase.getEntityData().func_74767_n("初始化")) {
            entityLivingBase.getEntityData().func_74780_a("生命", 51200.0d);
            if (!((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
                ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJiaRenUpdate.1
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
                }, "execute @s ~ ~ ~ attribute MAX_HEALTH " + entityLivingBase.func_145748_c_().func_150260_c() + " " + new DecimalFormat("0").format(entityLivingBase.getEntityData().func_74769_h("生命") - 1024.0d));
            }
            entityLivingBase.getEntityData().func_74778_a("坐标", ((Entity) entityLivingBase).field_70165_t + " " + ((Entity) entityLivingBase).field_70163_u + " " + ((Entity) entityLivingBase).field_70161_v);
            entityLivingBase.getEntityData().func_74757_a("初始化", true);
        }
        if (!entityLivingBase.getEntityData().func_74767_n("初始化2")) {
            entityLivingBase.getEntityData().func_74780_a("计时", entityLivingBase.getEntityData().func_74769_h("计时") + 1.0d);
            if (entityLivingBase.getEntityData().func_74769_h("计时") >= 2.0d) {
                if (entityLivingBase instanceof EntityLivingBase) {
                    entityLivingBase.func_70606_j(entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f);
                }
                entityLivingBase.getEntityData().func_74757_a("初始化2", true);
            }
        }
        if (entityLivingBase.getEntityData().func_74767_n("初始化") && !((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
            ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJiaRenUpdate.2
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
            }, "execute @s ~ ~ ~ tp @s " + entityLivingBase.getEntityData().func_74779_i("坐标"));
        }
        if (entityLivingBase.getEntityData().func_74767_n("被攻击")) {
            return;
        }
        if ((entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f) < (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f)) {
            entityLivingBase.getEntityData().func_74780_a("生命2", (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f) - (entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110143_aJ() : -1.0f));
            if (!((Entity) entityLivingBase).field_70170_p.field_72995_K && ((Entity) entityLivingBase).field_70170_p.func_73046_m() != null) {
                ((Entity) entityLivingBase).field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureJiaRenUpdate.3
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
                }, "execute @s ~ ~ ~ tellraw @a[name=" + entityLivingBase.getEntityData().func_74779_i("造成伤害者") + "] {\"text\":\"造成伤害 " + new DecimalFormat("0.##").format(entityLivingBase.getEntityData().func_74769_h("生命2")) + " 点\"}");
            }
            if (entityLivingBase instanceof EntityLivingBase) {
                entityLivingBase.func_70606_j(entityLivingBase instanceof EntityLivingBase ? entityLivingBase.func_110138_aP() : -1.0f);
            }
        }
    }
}
