package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureYiZiBreak.class */
public class ProcedureYiZiBreak extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureYiZiBreak(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 460);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!world.field_72995_K && world.func_73046_m() != null) {
            world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureYiZiBreak.1
                public String func_70005_c_() {
                    return "";
                }

                public boolean func_70003_b(int permission, String command) {
                    return true;
                }

                public World func_130014_f_() {
                    return world;
                }

                public MinecraftServer func_184102_h() {
                    return world.func_73046_m();
                }

                public boolean func_174792_t_() {
                    return false;
                }

                public BlockPos func_180425_c() {
                    return new BlockPos((int) (x + 0.5d), y, (int) (z + 0.5d));
                }

                public Vec3d func_174791_d() {
                    return new Vec3d(x + 0.5d, y, z + 0.5d);
                }
            }, "effect @e[type=yvanchuxiuzhen:yi_zi_mobs,c=1] yvanchuxiuzhen:yi_zi_buff 1 1 true");
        }
    }
}
