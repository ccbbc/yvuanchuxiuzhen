package net.mcreator.fabaokuozhan.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.fabaokuozhan.ElementsFabaokuozhanMod;
import net.mcreator.fabaokuozhan.block.BlockLianqi01;
import net.mcreator.fabaokuozhan.block.BlockLianqi02;
import net.mcreator.fabaokuozhan.block.BlockLianqi03;
import net.mcreator.fabaokuozhan.block.BlockLianqi04;
import net.mcreator.fabaokuozhan.block.BlockLianqi05;
import net.mcreator.fabaokuozhan.block.BlockLianqi06;
import net.mcreator.fabaokuozhan.block.BlockLianqi07;
import net.mcreator.fabaokuozhan.block.BlockLianqi08;
import net.mcreator.fabaokuozhan.block.BlockLianqi09;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsFabaokuozhanMod.ModElement.Tag
/* loaded from: 炼器-mc1.12.2-2.0.12.jar:net/mcreator/fabaokuozhan/procedure/ProcedureLianqi01BlockAdded.class */
public class ProcedureLianqi01BlockAdded extends ElementsFabaokuozhanMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureLianqi01BlockAdded(ElementsFabaokuozhanMod instance) {
        super(instance, 167);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded$1] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded$2] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded$3] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded$4] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded$5] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded$6] */
    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded$7] */
    /* JADX WARN: Type inference failed for: r0v44, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded$8] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded$9] */
    /* JADX WARN: Type inference failed for: r0v50, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded$10] */
    /* JADX WARN: Type inference failed for: r0v53, types: [net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded$11] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "dingluLEVEL") < 1.0d) {
            if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLianqi01.block.func_176223_P().func_177230_c()) {
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("dingluLEVEL", 1.0d);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                    IBlockState _bs2 = world.func_180495_p(_bp2);
                    if (_tileEntity2 != null) {
                        _tileEntity2.getTileData().func_74778_a("级别", "一");
                    }
                    world.func_184138_a(_bp2, _bs2, _bs2, 3);
                }
            } else if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLianqi02.block.func_176223_P().func_177230_c()) {
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74780_a("dingluLEVEL", 2.0d);
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp4 = new BlockPos(x, y, z);
                    TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                    IBlockState _bs4 = world.func_180495_p(_bp4);
                    if (_tileEntity4 != null) {
                        _tileEntity4.getTileData().func_74778_a("级别", "二");
                    }
                    world.func_184138_a(_bp4, _bs4, _bs4, 3);
                }
            } else if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLianqi03.block.func_176223_P().func_177230_c()) {
                if (!world.field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y, z);
                    TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                    IBlockState _bs5 = world.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74780_a("dingluLEVEL", 3.0d);
                    }
                    world.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp6 = new BlockPos(x, y, z);
                    TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                    IBlockState _bs6 = world.func_180495_p(_bp6);
                    if (_tileEntity6 != null) {
                        _tileEntity6.getTileData().func_74778_a("级别", "三");
                    }
                    world.func_184138_a(_bp6, _bs6, _bs6, 3);
                }
            } else if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLianqi04.block.func_176223_P().func_177230_c()) {
                if (!world.field_72995_K) {
                    BlockPos _bp7 = new BlockPos(x, y, z);
                    TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                    IBlockState _bs7 = world.func_180495_p(_bp7);
                    if (_tileEntity7 != null) {
                        _tileEntity7.getTileData().func_74780_a("dingluLEVEL", 4.0d);
                    }
                    world.func_184138_a(_bp7, _bs7, _bs7, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp8 = new BlockPos(x, y, z);
                    TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                    IBlockState _bs8 = world.func_180495_p(_bp8);
                    if (_tileEntity8 != null) {
                        _tileEntity8.getTileData().func_74778_a("级别", "四");
                    }
                    world.func_184138_a(_bp8, _bs8, _bs8, 3);
                }
            } else if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLianqi05.block.func_176223_P().func_177230_c()) {
                if (!world.field_72995_K) {
                    BlockPos _bp9 = new BlockPos(x, y, z);
                    TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                    IBlockState _bs9 = world.func_180495_p(_bp9);
                    if (_tileEntity9 != null) {
                        _tileEntity9.getTileData().func_74780_a("dingluLEVEL", 5.0d);
                    }
                    world.func_184138_a(_bp9, _bs9, _bs9, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp10 = new BlockPos(x, y, z);
                    TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                    IBlockState _bs10 = world.func_180495_p(_bp10);
                    if (_tileEntity10 != null) {
                        _tileEntity10.getTileData().func_74778_a("级别", "五");
                    }
                    world.func_184138_a(_bp10, _bs10, _bs10, 3);
                }
            } else if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLianqi06.block.func_176223_P().func_177230_c()) {
                if (!world.field_72995_K) {
                    BlockPos _bp11 = new BlockPos(x, y, z);
                    TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                    IBlockState _bs11 = world.func_180495_p(_bp11);
                    if (_tileEntity11 != null) {
                        _tileEntity11.getTileData().func_74780_a("dingluLEVEL", 6.0d);
                    }
                    world.func_184138_a(_bp11, _bs11, _bs11, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp12 = new BlockPos(x, y, z);
                    TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                    IBlockState _bs12 = world.func_180495_p(_bp12);
                    if (_tileEntity12 != null) {
                        _tileEntity12.getTileData().func_74778_a("级别", "六");
                    }
                    world.func_184138_a(_bp12, _bs12, _bs12, 3);
                }
            } else if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLianqi07.block.func_176223_P().func_177230_c()) {
                if (!world.field_72995_K) {
                    BlockPos _bp13 = new BlockPos(x, y, z);
                    TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                    IBlockState _bs13 = world.func_180495_p(_bp13);
                    if (_tileEntity13 != null) {
                        _tileEntity13.getTileData().func_74780_a("dingluLEVEL", 7.0d);
                    }
                    world.func_184138_a(_bp13, _bs13, _bs13, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp14 = new BlockPos(x, y, z);
                    TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                    IBlockState _bs14 = world.func_180495_p(_bp14);
                    if (_tileEntity14 != null) {
                        _tileEntity14.getTileData().func_74778_a("级别", "七");
                    }
                    world.func_184138_a(_bp14, _bs14, _bs14, 3);
                }
            } else if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLianqi08.block.func_176223_P().func_177230_c()) {
                if (!world.field_72995_K) {
                    BlockPos _bp15 = new BlockPos(x, y, z);
                    TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                    IBlockState _bs15 = world.func_180495_p(_bp15);
                    if (_tileEntity15 != null) {
                        _tileEntity15.getTileData().func_74780_a("dingluLEVEL", 8.0d);
                    }
                    world.func_184138_a(_bp15, _bs15, _bs15, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp16 = new BlockPos(x, y, z);
                    TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                    IBlockState _bs16 = world.func_180495_p(_bp16);
                    if (_tileEntity16 != null) {
                        _tileEntity16.getTileData().func_74778_a("级别", "八");
                    }
                    world.func_184138_a(_bp16, _bs16, _bs16, 3);
                }
            } else if (world.func_180495_p(new BlockPos(x, y, z)).func_177230_c() == BlockLianqi09.block.func_176223_P().func_177230_c()) {
                if (!world.field_72995_K) {
                    BlockPos _bp17 = new BlockPos(x, y, z);
                    TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                    IBlockState _bs17 = world.func_180495_p(_bp17);
                    if (_tileEntity17 != null) {
                        _tileEntity17.getTileData().func_74780_a("dingluLEVEL", 9.0d);
                    }
                    world.func_184138_a(_bp17, _bs17, _bs17, 3);
                }
                if (!world.field_72995_K) {
                    BlockPos _bp18 = new BlockPos(x, y, z);
                    TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                    IBlockState _bs18 = world.func_180495_p(_bp18);
                    if (_tileEntity18 != null) {
                        _tileEntity18.getTileData().func_74778_a("级别", "九");
                    }
                    world.func_184138_a(_bp18, _bs18, _bs18, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp19 = new BlockPos(x, y, z);
                TileEntity _tileEntity19 = world.func_175625_s(_bp19);
                IBlockState _bs19 = world.func_180495_p(_bp19);
                if (_tileEntity19 != null) {
                    _tileEntity19.getTileData().func_74778_a("炼器模式", "炼器");
                }
                world.func_184138_a(_bp19, _bs19, _bs19, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "huoyan") < 1.0d) {
            if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded.3
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y - 1, z), "huoyan") == 1.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp20 = new BlockPos(x, y, z);
                    TileEntity _tileEntity20 = world.func_175625_s(_bp20);
                    IBlockState _bs20 = world.func_180495_p(_bp20);
                    if (_tileEntity20 != null) {
                        _tileEntity20.getTileData().func_74780_a("huoyan", 1.0d);
                    }
                    world.func_184138_a(_bp20, _bs20, _bs20, 3);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded.4
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y - 1, z), "huoyan") == 2.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp21 = new BlockPos(x, y, z);
                    TileEntity _tileEntity21 = world.func_175625_s(_bp21);
                    IBlockState _bs21 = world.func_180495_p(_bp21);
                    if (_tileEntity21 != null) {
                        _tileEntity21.getTileData().func_74780_a("huoyan", 2.0d);
                    }
                    world.func_184138_a(_bp21, _bs21, _bs21, 3);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded.5
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y - 1, z), "huoyan") == 3.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp22 = new BlockPos(x, y, z);
                    TileEntity _tileEntity22 = world.func_175625_s(_bp22);
                    IBlockState _bs22 = world.func_180495_p(_bp22);
                    if (_tileEntity22 != null) {
                        _tileEntity22.getTileData().func_74780_a("huoyan", 3.0d);
                    }
                    world.func_184138_a(_bp22, _bs22, _bs22, 3);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded.6
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y - 1, z), "huoyan") == 4.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp23 = new BlockPos(x, y, z);
                    TileEntity _tileEntity23 = world.func_175625_s(_bp23);
                    IBlockState _bs23 = world.func_180495_p(_bp23);
                    if (_tileEntity23 != null) {
                        _tileEntity23.getTileData().func_74780_a("huoyan", 4.0d);
                    }
                    world.func_184138_a(_bp23, _bs23, _bs23, 3);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded.7
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y - 1, z), "huoyan") == 5.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp24 = new BlockPos(x, y, z);
                    TileEntity _tileEntity24 = world.func_175625_s(_bp24);
                    IBlockState _bs24 = world.func_180495_p(_bp24);
                    if (_tileEntity24 != null) {
                        _tileEntity24.getTileData().func_74780_a("huoyan", 5.0d);
                    }
                    world.func_184138_a(_bp24, _bs24, _bs24, 3);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded.8
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y - 1, z), "huoyan") == 6.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp25 = new BlockPos(x, y, z);
                    TileEntity _tileEntity25 = world.func_175625_s(_bp25);
                    IBlockState _bs25 = world.func_180495_p(_bp25);
                    if (_tileEntity25 != null) {
                        _tileEntity25.getTileData().func_74780_a("huoyan", 6.0d);
                    }
                    world.func_184138_a(_bp25, _bs25, _bs25, 3);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded.9
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y - 1, z), "huoyan") == 7.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp26 = new BlockPos(x, y, z);
                    TileEntity _tileEntity26 = world.func_175625_s(_bp26);
                    IBlockState _bs26 = world.func_180495_p(_bp26);
                    if (_tileEntity26 != null) {
                        _tileEntity26.getTileData().func_74780_a("huoyan", 7.0d);
                    }
                    world.func_184138_a(_bp26, _bs26, _bs26, 3);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded.10
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y - 1, z), "huoyan") == 8.0d) {
                if (!world.field_72995_K) {
                    BlockPos _bp27 = new BlockPos(x, y, z);
                    TileEntity _tileEntity27 = world.func_175625_s(_bp27);
                    IBlockState _bs27 = world.func_180495_p(_bp27);
                    if (_tileEntity27 != null) {
                        _tileEntity27.getTileData().func_74780_a("huoyan", 8.0d);
                    }
                    world.func_184138_a(_bp27, _bs27, _bs27, 3);
                }
            } else if (new Object() { // from class: net.mcreator.fabaokuozhan.procedure.ProcedureLianqi01BlockAdded.11
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y - 1, z), "huoyan") == 9.0d && !world.field_72995_K) {
                BlockPos _bp28 = new BlockPos(x, y, z);
                TileEntity _tileEntity28 = world.func_175625_s(_bp28);
                IBlockState _bs28 = world.func_180495_p(_bp28);
                if (_tileEntity28 != null) {
                    _tileEntity28.getTileData().func_74780_a("huoyan", 9.0d);
                }
                world.func_184138_a(_bp28, _bs28, _bs28, 3);
            }
        }
    }
}
