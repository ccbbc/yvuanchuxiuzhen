package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureYiZiMobsUpdate.class */
public class ProcedureYiZiMobsUpdate extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureYiZiMobsUpdate(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 459);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        entity.getEntityData().func_74757_a("无敌", true);
        if (!entity.getEntityData().func_74767_n("初始化")) {
            entity.getEntityData().func_74778_a("坐标", entity.field_70165_t + " " + entity.field_70163_u + " " + entity.field_70161_v);
            entity.getEntityData().func_74757_a("初始化", true);
        } else if (entity.getEntityData().func_74767_n("初始化") && !(entity.field_70165_t + " " + entity.field_70163_u + " " + entity.field_70161_v).equals(entity.getEntityData().func_74779_i("坐标")) && !entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
            entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureYiZiMobsUpdate.1
                public String func_70005_c_() {
                    return "";
                }

                public boolean func_70003_b(int permission, String command) {
                    return true;
                }

                public World func_130014_f_() {
                    return entity.field_70170_p;
                }

                public MinecraftServer func_184102_h() {
                    return entity.field_70170_p.func_73046_m();
                }

                public boolean func_174792_t_() {
                    return false;
                }

                public BlockPos func_180425_c() {
                    return entity.func_180425_c();
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v);
                }

                public Entity func_174793_f() {
                    return entity;
                }
            }, "tp @s " + entity.getEntityData().func_74779_i("坐标"));
        }
    }
}
