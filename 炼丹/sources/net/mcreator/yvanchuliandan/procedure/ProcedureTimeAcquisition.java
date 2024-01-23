package net.mcreator.yvanchuliandan.procedure;

import java.util.Date;
import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureTimeAcquisition.class */
public class ProcedureTimeAcquisition extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureTimeAcquisition(ElementsYvanchuliandanMod instance) {
        super(instance, 909);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        Date date = new Date();
        double a = date.getTime() / 1000.0d;
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (!world.field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = world.func_175625_s(_bp);
            IBlockState _bs = world.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("TimeObtain", a);
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
    }
}
