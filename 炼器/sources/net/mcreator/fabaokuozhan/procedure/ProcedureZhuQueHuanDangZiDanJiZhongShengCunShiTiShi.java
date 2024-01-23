package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureZhuQueHuanDangZiDanJiZhongShengCunShiTiShi.class */
public class ProcedureZhuQueHuanDangZiDanJiZhongShengCunShiTiShi extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureZhuQueHuanDangZiDanJiZhongShengCunShiTiShi(ElementsFabaokuozhanMod instance) {
        super(instance, 513);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        WorldServer worldServer = (World) dependencies.get("world");
        entity.getEntityData().func_74757_a("远程攻击", true);
        if (worldServer.func_180495_p(new BlockPos(0, 0, 0)).func_177230_c() == Blocks.field_150378_br.func_176223_P().func_177230_c()) {
            if (!((World) worldServer).field_72995_K) {
                worldServer.func_72876_a((Entity) null, x, y, z, 5.0f, false);
            }
        } else if (!((World) worldServer).field_72995_K) {
            worldServer.func_72876_a((Entity) null, x, y, z, 5.0f, true);
        }
        if (worldServer instanceof WorldServer) {
            worldServer.func_175739_a(EnumParticleTypes.FLAME, x + 0.5d, y + 0.5d, z + 0.5d, 100, 2.0d, 2.0d, 2.0d, 1.0d, new int[0]);
        }
        if (worldServer instanceof WorldServer) {
            worldServer.func_175739_a(EnumParticleTypes.SMOKE_NORMAL, x + 0.5d, y + 0.5d, z + 0.5d, 40, 2.0d, 2.0d, 2.0d, 1.0d, new int[0]);
        }
    }
}
