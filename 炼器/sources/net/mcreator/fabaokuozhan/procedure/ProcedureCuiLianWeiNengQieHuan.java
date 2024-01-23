package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureCuiLianWeiNengQieHuan.class */
public class ProcedureCuiLianWeiNengQieHuan extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureCuiLianWeiNengQieHuan(ElementsFabaokuozhanMod instance) {
        super(instance, 551);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianWeiNengQieHuan$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureCuiLianWeiNengQieHuan.1
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "淬炼方向").equals("威能")) {
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74778_a("淬炼方向", "威能");
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
        } else if (!world.field_72995_K) {
            BlockPos _bp2 = new BlockPos(x, y, z);
            TileEntity _tileEntity2 = world.func_175625_s(_bp2);
            IBlockState _bs2 = world.func_180495_p(_bp2);
            if (_tileEntity2 != null) {
                _tileEntity2.getTileData().func_74778_a("淬炼方向", "普攻");
            }
            world.func_184138_a(_bp2, _bs2, _bs2, 3);
        }
    }
}
