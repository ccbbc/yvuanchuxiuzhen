package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureHuoyan0302UpdateTick.class */
public class ProcedureHuoyan0302UpdateTick extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureHuoyan0302UpdateTick(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 206);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan0302UpdateTick$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final WorldServer worldServer = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureHuoyan0302UpdateTick.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = worldServer.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "点击火焰") > 0.0d) {
            if (worldServer instanceof WorldServer) {
                worldServer.func_175739_a(EnumParticleTypes.FLAME, x + 0.5d, y, z + 0.5d, 20, 5.0d, 1.0d, 5.0d, 0.0d, new int[0]);
            }
            if (!((World) worldServer).field_72995_K) {
                worldServer.func_72876_a((Entity) null, (int) (x + (Math.random() * 10.0d)), y, (int) (z + (Math.random() * 10.0d)), 2.0f, true);
            }
            if (!((World) worldServer).field_72995_K) {
                worldServer.func_72876_a((Entity) null, (int) (x - (Math.random() * 10.0d)), y, (int) (z + (Math.random() * 10.0d)), 2.0f, true);
            }
            if (!((World) worldServer).field_72995_K) {
                worldServer.func_72876_a((Entity) null, (int) (x - (Math.random() * 10.0d)), y, (int) (z - (Math.random() * 10.0d)), 2.0f, true);
            }
            if (!((World) worldServer).field_72995_K) {
                worldServer.func_72876_a((Entity) null, (int) (x + (Math.random() * 10.0d)), y, (int) (z - (Math.random() * 10.0d)), 2.0f, true);
            }
        }
    }
}
