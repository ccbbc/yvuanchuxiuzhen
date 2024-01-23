package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureFulu1601GengXinYouXiKe.class */
public class ProcedureFulu1601GengXinYouXiKe extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureFulu1601GengXinYouXiKe(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 246);
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1601GengXinYouXiKe$2] */
    /* JADX WARN: Type inference failed for: r2v6, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1601GengXinYouXiKe$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
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
                _tileEntity.getTileData().func_74780_a("xiaoshi", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1601GengXinYouXiKe.1
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "xiaoshi") + 1.0d);
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureFulu1601GengXinYouXiKe.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "xiaoshi") >= 14.0d) {
            world.func_175698_g(new BlockPos(x, y, z));
        }
    }
}
