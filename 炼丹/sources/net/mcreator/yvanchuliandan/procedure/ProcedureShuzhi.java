package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureShuzhi.class */
public class ProcedureShuzhi extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureShuzhi(ElementsYvanchuliandanMod instance) {
        super(instance, 270);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi$1] */
    /* JADX WARN: Type inference failed for: r0v27, types: [net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi$2] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi$3] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi$4] */
    /* JADX WARN: Type inference failed for: r0v39, types: [net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi$5] */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi$6] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi$7] */
    /* JADX WARN: Type inference failed for: r0v51, types: [net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi$8] */
    /* JADX WARN: Type inference failed for: r0v55, types: [net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi$9] */
    /* JADX WARN: Type inference failed for: r0v59, types: [net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi$10] */
    /* JADX WARN: Type inference failed for: r0v63, types: [net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi$11] */
    /* JADX WARN: Type inference failed for: r0v67, types: [net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi$12] */
    /* JADX WARN: Type inference failed for: r0v71, types: [net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi$13] */
    /* JADX WARN: Type inference failed for: r0v75, types: [net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi$14] */
    /* JADX WARN: Type inference failed for: r0v79, types: [net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi$15] */
    /* JADX WARN: Type inference failed for: r0v83, types: [net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi$16] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "liandanLEVEL") + 1.0d == 1.0d && !world.field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = world.func_175625_s(_bp);
            IBlockState _bs = world.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74778_a("shuzhi1", "1");
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "liandanLEVEL") + 1.0d == 2.0d && !world.field_72995_K) {
            BlockPos _bp2 = new BlockPos(x, y, z);
            TileEntity _tileEntity2 = world.func_175625_s(_bp2);
            IBlockState _bs2 = world.func_180495_p(_bp2);
            if (_tileEntity2 != null) {
                _tileEntity2.getTileData().func_74778_a("shuzhi1", "2");
            }
            world.func_184138_a(_bp2, _bs2, _bs2, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi.3
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "liandanLEVEL") + 1.0d == 3.0d && !world.field_72995_K) {
            BlockPos _bp3 = new BlockPos(x, y, z);
            TileEntity _tileEntity3 = world.func_175625_s(_bp3);
            IBlockState _bs3 = world.func_180495_p(_bp3);
            if (_tileEntity3 != null) {
                _tileEntity3.getTileData().func_74778_a("shuzhi1", "3");
            }
            world.func_184138_a(_bp3, _bs3, _bs3, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi.4
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "liandanLEVEL") + 1.0d == 4.0d && !world.field_72995_K) {
            BlockPos _bp4 = new BlockPos(x, y, z);
            TileEntity _tileEntity4 = world.func_175625_s(_bp4);
            IBlockState _bs4 = world.func_180495_p(_bp4);
            if (_tileEntity4 != null) {
                _tileEntity4.getTileData().func_74778_a("shuzhi1", "4");
            }
            world.func_184138_a(_bp4, _bs4, _bs4, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi.5
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "liandanLEVEL") + 1.0d == 5.0d && !world.field_72995_K) {
            BlockPos _bp5 = new BlockPos(x, y, z);
            TileEntity _tileEntity5 = world.func_175625_s(_bp5);
            IBlockState _bs5 = world.func_180495_p(_bp5);
            if (_tileEntity5 != null) {
                _tileEntity5.getTileData().func_74778_a("shuzhi1", "5");
            }
            world.func_184138_a(_bp5, _bs5, _bs5, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi.6
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "liandanLEVEL") + 1.0d == 6.0d && !world.field_72995_K) {
            BlockPos _bp6 = new BlockPos(x, y, z);
            TileEntity _tileEntity6 = world.func_175625_s(_bp6);
            IBlockState _bs6 = world.func_180495_p(_bp6);
            if (_tileEntity6 != null) {
                _tileEntity6.getTileData().func_74778_a("shuzhi1", "6");
            }
            world.func_184138_a(_bp6, _bs6, _bs6, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi.7
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "liandanLEVEL") + 1.0d == 7.0d && !world.field_72995_K) {
            BlockPos _bp7 = new BlockPos(x, y, z);
            TileEntity _tileEntity7 = world.func_175625_s(_bp7);
            IBlockState _bs7 = world.func_180495_p(_bp7);
            if (_tileEntity7 != null) {
                _tileEntity7.getTileData().func_74778_a("shuzhi1", "7");
            }
            world.func_184138_a(_bp7, _bs7, _bs7, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi.8
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "liandanLEVEL") + 1.0d == 8.0d && !world.field_72995_K) {
            BlockPos _bp8 = new BlockPos(x, y, z);
            TileEntity _tileEntity8 = world.func_175625_s(_bp8);
            IBlockState _bs8 = world.func_180495_p(_bp8);
            if (_tileEntity8 != null) {
                _tileEntity8.getTileData().func_74778_a("shuzhi1", "8");
            }
            world.func_184138_a(_bp8, _bs8, _bs8, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi.9
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "liandanLEVEL") + 1.0d == 9.0d && !world.field_72995_K) {
            BlockPos _bp9 = new BlockPos(x, y, z);
            TileEntity _tileEntity9 = world.func_175625_s(_bp9);
            IBlockState _bs9 = world.func_180495_p(_bp9);
            if (_tileEntity9 != null) {
                _tileEntity9.getTileData().func_74778_a("shuzhi1", "9");
            }
            world.func_184138_a(_bp9, _bs9, _bs9, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi.10
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "liandanLEVEL") + 1.0d == 10.0d && !world.field_72995_K) {
            BlockPos _bp10 = new BlockPos(x, y, z);
            TileEntity _tileEntity10 = world.func_175625_s(_bp10);
            IBlockState _bs10 = world.func_180495_p(_bp10);
            if (_tileEntity10 != null) {
                _tileEntity10.getTileData().func_74778_a("shuzhi1", "10");
            }
            world.func_184138_a(_bp10, _bs10, _bs10, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi.11
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "liandanLEVEL") + 1.0d == 11.0d && !world.field_72995_K) {
            BlockPos _bp11 = new BlockPos(x, y, z);
            TileEntity _tileEntity11 = world.func_175625_s(_bp11);
            IBlockState _bs11 = world.func_180495_p(_bp11);
            if (_tileEntity11 != null) {
                _tileEntity11.getTileData().func_74778_a("shuzhi1", "11");
            }
            world.func_184138_a(_bp11, _bs11, _bs11, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi.12
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "liandanLEVEL") + 1.0d == 12.0d && !world.field_72995_K) {
            BlockPos _bp12 = new BlockPos(x, y, z);
            TileEntity _tileEntity12 = world.func_175625_s(_bp12);
            IBlockState _bs12 = world.func_180495_p(_bp12);
            if (_tileEntity12 != null) {
                _tileEntity12.getTileData().func_74778_a("shuzhi1", "12");
            }
            world.func_184138_a(_bp12, _bs12, _bs12, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi.13
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "liandanLEVEL") + 1.0d == 13.0d && !world.field_72995_K) {
            BlockPos _bp13 = new BlockPos(x, y, z);
            TileEntity _tileEntity13 = world.func_175625_s(_bp13);
            IBlockState _bs13 = world.func_180495_p(_bp13);
            if (_tileEntity13 != null) {
                _tileEntity13.getTileData().func_74778_a("shuzhi1", "13");
            }
            world.func_184138_a(_bp13, _bs13, _bs13, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi.14
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "liandanLEVEL") + 1.0d == 14.0d && !world.field_72995_K) {
            BlockPos _bp14 = new BlockPos(x, y, z);
            TileEntity _tileEntity14 = world.func_175625_s(_bp14);
            IBlockState _bs14 = world.func_180495_p(_bp14);
            if (_tileEntity14 != null) {
                _tileEntity14.getTileData().func_74778_a("shuzhi1", "14");
            }
            world.func_184138_a(_bp14, _bs14, _bs14, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi.15
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "liandanLEVEL") + 1.0d == 15.0d && !world.field_72995_K) {
            BlockPos _bp15 = new BlockPos(x, y, z);
            TileEntity _tileEntity15 = world.func_175625_s(_bp15);
            IBlockState _bs15 = world.func_180495_p(_bp15);
            if (_tileEntity15 != null) {
                _tileEntity15.getTileData().func_74778_a("shuzhi1", "15");
            }
            world.func_184138_a(_bp15, _bs15, _bs15, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureShuzhi.16
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "liandanLEVEL") + 1.0d == 16.0d && !world.field_72995_K) {
            BlockPos _bp16 = new BlockPos(x, y, z);
            TileEntity _tileEntity16 = world.func_175625_s(_bp16);
            IBlockState _bs16 = world.func_180495_p(_bp16);
            if (_tileEntity16 != null) {
                _tileEntity16.getTileData().func_74778_a("shuzhi1", "16");
            }
            world.func_184138_a(_bp16, _bs16, _bs16, 3);
        }
    }
}
