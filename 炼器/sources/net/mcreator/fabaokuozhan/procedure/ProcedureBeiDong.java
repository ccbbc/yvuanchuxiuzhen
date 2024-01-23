package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureBeiDong.class */
public class ProcedureBeiDong extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureBeiDong(ElementsFabaokuozhanMod instance) {
        super(instance, 423);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        World world = (World) dependencies.get("world");
        Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
            if (world instanceof WorldServer) {
                ((WorldServer) world).func_175739_a(EnumParticleTypes.FLAME, entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 0, Math.sin(entity.getEntityData().func_74769_h("JinGuBangdu")) * 5.0d, 0.0d, Math.cos(entity.getEntityData().func_74769_h("JinGuBangdu")) * 5.0d, 0.1d, new int[0]);
            }
        }, 160L, TimeUnit.MILLISECONDS);
    }
}
