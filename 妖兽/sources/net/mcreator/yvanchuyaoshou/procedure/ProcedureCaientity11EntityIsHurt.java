package net.mcreator.yvanchuyaoshou.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuyaoshou.ElementsYvanchuyaoshouMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuyaoshouMod.ModElement.Tag
/* loaded from: 妖兽-mc1.12.2-2.0.16.jar:net/mcreator/yvanchuyaoshou/procedure/ProcedureCaientity11EntityIsHurt.class */
public class ProcedureCaientity11EntityIsHurt extends ElementsYvanchuyaoshouMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCaientity11EntityIsHurt(ElementsYvanchuyaoshouMod instance) {
        super(instance, 110);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        WorldServer worldServer = (World) dependencies.get("world");
        if (Math.random() < 0.1d) {
            entity.getEntityData().func_74757_a("mianyi", true);
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.FLAME, x + 0.5d, y, z + 0.5d, 100, 3.0d, 0.5d, 3.0d, 0.0d, new int[0]);
            }
            if (!entity.field_70170_p.field_72995_K && entity.field_70170_p.func_73046_m() != null) {
                entity.field_70170_p.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuyaoshou.procedure.ProcedureCaientity11EntityIsHurt.1
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
                }, "execute @e[rm=0,r=5] ~ ~ ~ shanghai30");
            }
        }
        $_dependencies.put("entity", entity);
        ProcedureShouJiNbt.executeProcedure($_dependencies);
    }
}
