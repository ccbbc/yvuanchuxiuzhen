package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureFabao07WhileBulletFlyingTick.class */
public class ProcedureFabao07WhileBulletFlyingTick extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureFabao07WhileBulletFlyingTick(ElementsFabaokuozhanMod instance) {
        super(instance, 123);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        WorldServer worldServer = (World) dependencies.get("world");
        if (worldServer instanceof WorldServer) {
            worldServer.func_175739_a(EnumParticleTypes.FLAME, x + 0.5d, y + 0.5d, z + 0.5d, 5, 0.3d, 0.3d, 0.3d, 0.0d, new int[0]);
        }
    }
}
