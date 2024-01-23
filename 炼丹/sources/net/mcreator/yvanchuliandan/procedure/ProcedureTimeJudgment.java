package net.mcreator.yvanchuliandan.procedure;

import java.util.Date;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureTimeJudgment.class */
public class ProcedureTimeJudgment extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureTimeJudgment(ElementsYvanchuliandanMod instance) {
        super(instance, 910);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [net.mcreator.yvanchuliandan.procedure.ProcedureTimeJudgment$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        Date date = new Date();
        double a = date.getTime() / 1000.0d;
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!world.field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = world.func_175625_s(_bp);
            IBlockState _bs = world.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("TimeDifference", a - new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureTimeJudgment.1
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "TimeObtain"));
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
    }
}
