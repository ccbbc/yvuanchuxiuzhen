package net.mcreator.yvanchuxiuzhenfulu.procedure;

import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenfaqizhi05BlockDestroyedByPlayer.class */
public class ProcedureZhenfaqizhi05BlockDestroyedByPlayer extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhenfaqizhi05BlockDestroyedByPlayer(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 216);
    }

    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        World world = (World) dependencies.get("world");
        if (!world.field_72995_K) {
            BlockPos _bp = new BlockPos(x - 2, y, z);
            TileEntity _tileEntity = world.func_175625_s(_bp);
            IBlockState _bs = world.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("qianghuaE", 0.0d);
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (!world.field_72995_K) {
            BlockPos _bp2 = new BlockPos(x, y, z + 2);
            TileEntity _tileEntity2 = world.func_175625_s(_bp2);
            IBlockState _bs2 = world.func_180495_p(_bp2);
            if (_tileEntity2 != null) {
                _tileEntity2.getTileData().func_74780_a("qianghuaN", 0.0d);
            }
            world.func_184138_a(_bp2, _bs2, _bs2, 3);
        }
        if (!world.field_72995_K) {
            BlockPos _bp3 = new BlockPos(x, y, z - 2);
            TileEntity _tileEntity3 = world.func_175625_s(_bp3);
            IBlockState _bs3 = world.func_180495_p(_bp3);
            if (_tileEntity3 != null) {
                _tileEntity3.getTileData().func_74780_a("qianghuaS", 0.0d);
            }
            world.func_184138_a(_bp3, _bs3, _bs3, 3);
        }
        if (!world.field_72995_K) {
            BlockPos _bp4 = new BlockPos(x + 2, y, z);
            TileEntity _tileEntity4 = world.func_175625_s(_bp4);
            IBlockState _bs4 = world.func_180495_p(_bp4);
            if (_tileEntity4 != null) {
                _tileEntity4.getTileData().func_74780_a("qianghuaW", 0.0d);
            }
            world.func_184138_a(_bp4, _bs4, _bs4, 3);
        }
    }
}
