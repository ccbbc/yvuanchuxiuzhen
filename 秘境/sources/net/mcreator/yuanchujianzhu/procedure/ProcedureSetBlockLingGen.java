package net.mcreator.yuanchujianzhu.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYuanchujianzhuMod.ModElement.Tag
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/procedure/ProcedureSetBlockLingGen.class */
public class ProcedureSetBlockLingGen extends ElementsYuanchujianzhuMod.ModElement {
    public ProcedureSetBlockLingGen(ElementsYuanchujianzhuMod instance) {
        super(instance, 168);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureSetBlockLingGen$1] */
    /* JADX WARN: Type inference failed for: r0v58, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureSetBlockLingGen$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureSetBlockLingGen.1
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "灵根设置")) {
            for (int index0 = 0; index0 < 5; index0++) {
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("灵根需求", 1.0d);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                    IBlockState _bs2 = world.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74780_a("灵根需求", 2.0d);
                    }
                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74780_a("灵根需求", 3.0d);
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z);
                    TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                    IBlockState _bs4 = world.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74780_a("灵根需求", 4.0d);
                    }
                    world.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
                if (Math.random() <= 0.25d && !world.field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y, z);
                    TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                    IBlockState _bs5 = world.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74780_a("灵根需求", 5.0d);
                    }
                    world.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
                if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureSetBlockLingGen.2
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "灵根需求") > 0.0d) {
                    break;
                }
            }
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            $_dependencies.put("world", world);
            ProcedureTreasureChestLevel.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp6 = new BlockPos(x, y, z);
                TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                IBlockState _bs6 = world.func_180495_p(_bp6);
                if (_tileEntity6 != null) {
                    _tileEntity6.getTileData().func_74757_a("灵根设置", true);
                }
                world.func_184138_a(_bp6, _bs6, _bs6, 3);
            }
        }
    }
}
