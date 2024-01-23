package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockZhenFa1;
import net.mcreator.yvanchuxiuzhenfulu.block.BlockZhenfaqizhi01;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureLieKongZhen0.class */
public class ProcedureLieKongZhen0 extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureLieKongZhen0(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 356);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        world.func_180501_a(new BlockPos(x, y, z), BlockZhenFa1.block.func_176223_P(), 3);
        if (!world.field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = world.func_175625_s(_bp);
            IBlockState _bs = world.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("阵法", 2.0d);
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (!world.field_72995_K) {
            BlockPos _bp2 = new BlockPos(x, y, z);
            TileEntity _tileEntity2 = world.func_175625_s(_bp2);
            IBlockState _bs2 = world.func_180495_p(_bp2);
            if (_tileEntity2 != null) {
                _tileEntity2.getTileData().func_74780_a("阵法时间", 180.0d);
            }
            world.func_184138_a(_bp2, _bs2, _bs2, 3);
        }
        if (!world.field_72995_K) {
            BlockPos _bp3 = new BlockPos(x, y, z);
            TileEntity _tileEntity3 = world.func_175625_s(_bp3);
            IBlockState _bs3 = world.func_180495_p(_bp3);
            if (_tileEntity3 != null) {
                _tileEntity3.getTileData().func_74780_a("阵法时间1", 9.0d);
            }
            world.func_184138_a(_bp3, _bs3, _bs3, 3);
        }
        world.func_180501_a(new BlockPos(x, y, z - 8), BlockZhenfaqizhi01.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 8, y, z - 2), BlockZhenfaqizhi01.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x - 5, y, z + 7), BlockZhenfaqizhi01.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 5, y, z + 7), BlockZhenfaqizhi01.block.func_176223_P(), 3);
        world.func_180501_a(new BlockPos(x + 8, y, z - 2), BlockZhenfaqizhi01.block.func_176223_P(), 3);
    }
}
