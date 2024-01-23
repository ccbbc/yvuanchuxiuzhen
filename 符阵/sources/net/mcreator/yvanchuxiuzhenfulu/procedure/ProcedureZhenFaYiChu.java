package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenFaYiChu.class */
public class ProcedureZhenFaYiChu extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhenFaYiChu(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 346);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYiChu$1] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYiChu$2] */
    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYiChu$3] */
    /* JADX WARN: Type inference failed for: r0v44, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYiChu$4] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYiChu$5] */
    /* JADX WARN: Type inference failed for: r0v50, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYiChu$6] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYiChu.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "阵法") == 2.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYiChu.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "阵法") == 3.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYiChu.3
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "阵法") == 4.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYiChu.4
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "阵法") == 5.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYiChu.5
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "阵法") == 6.0d || new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenFaYiChu.6
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "阵法") == 17.0d) {
            world.func_175698_g(new BlockPos(x, y, z));
            world.func_175698_g(new BlockPos(x, y, z - 8));
            world.func_175698_g(new BlockPos(x - 8, y, z - 2));
            world.func_175698_g(new BlockPos(x - 5, y, z + 7));
            world.func_175698_g(new BlockPos(x + 5, y, z + 7));
            world.func_175698_g(new BlockPos(x + 8, y, z - 2));
            return;
        }
        world.func_175698_g(new BlockPos(x, y, z));
        world.func_175698_g(new BlockPos(x, y, z - 11));
        world.func_175698_g(new BlockPos(x - 11, y, z - 2));
        world.func_175698_g(new BlockPos(x - 8, y, z + 10));
        world.func_175698_g(new BlockPos(x + 8, y, z + 10));
        world.func_175698_g(new BlockPos(x + 11, y, z - 2));
    }
}
