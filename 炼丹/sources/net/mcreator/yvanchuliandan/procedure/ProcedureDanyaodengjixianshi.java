package net.mcreator.yvanchuliandan.procedure;

import java.util.Map;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureDanyaodengjixianshi.class */
public class ProcedureDanyaodengjixianshi extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureDanyaodengjixianshi(ElementsYvanchuliandanMod instance) {
        super(instance, 276);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanyaodengjixianshi$1] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanyaodengjixianshi$2] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanyaodengjixianshi$3] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanyaodengjixianshi$4] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanyaodengjixianshi$5] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanyaodengjixianshi$6] */
    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanyaodengjixianshi$7] */
    /* JADX WARN: Type inference failed for: r0v44, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanyaodengjixianshi$8] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.yvanchuliandan.procedure.ProcedureDanyaodengjixianshi$9] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanyaodengjixianshi.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "danyaodengji") == 1.0d && !world.field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = world.func_175625_s(_bp);
            IBlockState _bs = world.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74778_a("danyaodengjixianshi", "一");
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanyaodengjixianshi.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "danyaodengji") == 2.0d && !world.field_72995_K) {
            BlockPos _bp2 = new BlockPos(x, y, z);
            TileEntity _tileEntity2 = world.func_175625_s(_bp2);
            IBlockState _bs2 = world.func_180495_p(_bp2);
            if (_tileEntity2 != null) {
                _tileEntity2.getTileData().func_74778_a("danyaodengjixianshi", "二");
            }
            world.func_184138_a(_bp2, _bs2, _bs2, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanyaodengjixianshi.3
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "danyaodengji") == 3.0d && !world.field_72995_K) {
            BlockPos _bp3 = new BlockPos(x, y, z);
            TileEntity _tileEntity3 = world.func_175625_s(_bp3);
            IBlockState _bs3 = world.func_180495_p(_bp3);
            if (_tileEntity3 != null) {
                _tileEntity3.getTileData().func_74778_a("danyaodengjixianshi", "三");
            }
            world.func_184138_a(_bp3, _bs3, _bs3, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanyaodengjixianshi.4
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "danyaodengji") == 4.0d && !world.field_72995_K) {
            BlockPos _bp4 = new BlockPos(x, y, z);
            TileEntity _tileEntity4 = world.func_175625_s(_bp4);
            IBlockState _bs4 = world.func_180495_p(_bp4);
            if (_tileEntity4 != null) {
                _tileEntity4.getTileData().func_74778_a("danyaodengjixianshi", "四");
            }
            world.func_184138_a(_bp4, _bs4, _bs4, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanyaodengjixianshi.5
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "danyaodengji") == 5.0d && !world.field_72995_K) {
            BlockPos _bp5 = new BlockPos(x, y, z);
            TileEntity _tileEntity5 = world.func_175625_s(_bp5);
            IBlockState _bs5 = world.func_180495_p(_bp5);
            if (_tileEntity5 != null) {
                _tileEntity5.getTileData().func_74778_a("danyaodengjixianshi", "五");
            }
            world.func_184138_a(_bp5, _bs5, _bs5, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanyaodengjixianshi.6
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "danyaodengji") == 6.0d && !world.field_72995_K) {
            BlockPos _bp6 = new BlockPos(x, y, z);
            TileEntity _tileEntity6 = world.func_175625_s(_bp6);
            IBlockState _bs6 = world.func_180495_p(_bp6);
            if (_tileEntity6 != null) {
                _tileEntity6.getTileData().func_74778_a("danyaodengjixianshi", "六");
            }
            world.func_184138_a(_bp6, _bs6, _bs6, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanyaodengjixianshi.7
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "danyaodengji") == 7.0d && !world.field_72995_K) {
            BlockPos _bp7 = new BlockPos(x, y, z);
            TileEntity _tileEntity7 = world.func_175625_s(_bp7);
            IBlockState _bs7 = world.func_180495_p(_bp7);
            if (_tileEntity7 != null) {
                _tileEntity7.getTileData().func_74778_a("danyaodengjixianshi", "七");
            }
            world.func_184138_a(_bp7, _bs7, _bs7, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanyaodengjixianshi.8
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "danyaodengji") == 8.0d && !world.field_72995_K) {
            BlockPos _bp8 = new BlockPos(x, y, z);
            TileEntity _tileEntity8 = world.func_175625_s(_bp8);
            IBlockState _bs8 = world.func_180495_p(_bp8);
            if (_tileEntity8 != null) {
                _tileEntity8.getTileData().func_74778_a("danyaodengjixianshi", "八");
            }
            world.func_184138_a(_bp8, _bs8, _bs8, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureDanyaodengjixianshi.9
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "danyaodengji") == 9.0d && !world.field_72995_K) {
            BlockPos _bp9 = new BlockPos(x, y, z);
            TileEntity _tileEntity9 = world.func_175625_s(_bp9);
            IBlockState _bs9 = world.func_180495_p(_bp9);
            if (_tileEntity9 != null) {
                _tileEntity9.getTileData().func_74778_a("danyaodengjixianshi", "九");
            }
            world.func_184138_a(_bp9, _bs9, _bs9, 3);
        }
    }
}
