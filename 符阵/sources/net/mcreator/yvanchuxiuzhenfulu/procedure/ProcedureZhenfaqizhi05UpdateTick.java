package net.mcreator.yvanchuxiuzhenfulu.procedure;

import com.google.common.collect.UnmodifiableIterator;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhenfulu.ElementsYvanchuxiuzhenfuluMod;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenfuluMod.ModElement.Tag
/* loaded from: 符阵-mc1.12.2-2.0.11.jar:net/mcreator/yvanchuxiuzhenfulu/procedure/ProcedureZhenfaqizhi05UpdateTick.class */
public class ProcedureZhenfaqizhi05UpdateTick extends ElementsYvanchuxiuzhenfuluMod.ModElement {
    public ProcedureZhenfaqizhi05UpdateTick(ElementsYvanchuxiuzhenfuluMod instance) {
        super(instance, 174);
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick$5] */
    /* JADX WARN: Type inference failed for: r0v27, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick$7] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick$9] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick$11] */
    /* JADX WARN: Type inference failed for: r0v66, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick$13] */
    /* JADX WARN: Type inference failed for: r2v41, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick$1] */
    /* JADX WARN: Type inference failed for: r3v12, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick$10] */
    /* JADX WARN: Type inference failed for: r3v16, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick$8] */
    /* JADX WARN: Type inference failed for: r3v23, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick$6] */
    /* JADX WARN: Type inference failed for: r3v29, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick$2] */
    /* JADX WARN: Type inference failed for: r3v31, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick$3] */
    /* JADX WARN: Type inference failed for: r3v7, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick$12] */
    /* JADX WARN: Type inference failed for: r4v34, types: [net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick$4] */
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
                _tileEntity.getTileData().func_74780_a("qianghua", new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick.1
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghuaW") + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick.2
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghuaE") + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick.3
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghuaN") + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick.4
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghuaS"));
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick.5
            public EnumFacing getEnumFacing(BlockPos pos) {
                try {
                    IBlockState _bs2 = world.func_180495_p(pos);
                    UnmodifiableIterator it = _bs2.func_177228_b().keySet().iterator();
                    while (it.hasNext()) {
                        PropertyDirection propertyDirection = (IProperty) it.next();
                        if (propertyDirection.func_177701_a().equals("facing")) {
                            return _bs2.func_177229_b(propertyDirection);
                        }
                    }
                    return EnumFacing.NORTH;
                } catch (Exception e) {
                    return EnumFacing.NORTH;
                }
            }
        }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.NORTH) {
            if (!world.field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z - 2);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74780_a("qianghuaS", 1.0d + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick.6
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "qianghua"));
                }
                world.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick.7
            public EnumFacing getEnumFacing(BlockPos pos) {
                try {
                    IBlockState _bs3 = world.func_180495_p(pos);
                    UnmodifiableIterator it = _bs3.func_177228_b().keySet().iterator();
                    while (it.hasNext()) {
                        PropertyDirection propertyDirection = (IProperty) it.next();
                        if (propertyDirection.func_177701_a().equals("facing")) {
                            return _bs3.func_177229_b(propertyDirection);
                        }
                    }
                    return EnumFacing.NORTH;
                } catch (Exception e) {
                    return EnumFacing.NORTH;
                }
            }
        }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.SOUTH) {
            if (!world.field_72995_K) {
                BlockPos _bp3 = new BlockPos(x, y, z + 2);
                TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                IBlockState _bs3 = world.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74780_a("qianghuaN", 1.0d + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick.8
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "qianghua"));
                }
                world.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick.9
            public EnumFacing getEnumFacing(BlockPos pos) {
                try {
                    IBlockState _bs4 = world.func_180495_p(pos);
                    UnmodifiableIterator it = _bs4.func_177228_b().keySet().iterator();
                    while (it.hasNext()) {
                        PropertyDirection propertyDirection = (IProperty) it.next();
                        if (propertyDirection.func_177701_a().equals("facing")) {
                            return _bs4.func_177229_b(propertyDirection);
                        }
                    }
                    return EnumFacing.NORTH;
                } catch (Exception e) {
                    return EnumFacing.NORTH;
                }
            }
        }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.WEST) {
            if (!world.field_72995_K) {
                BlockPos _bp4 = new BlockPos(x - 2, y, z);
                TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                IBlockState _bs4 = world.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74780_a("qianghuaE", 1.0d + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick.10
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "qianghua"));
                }
                world.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick.11
            public EnumFacing getEnumFacing(BlockPos pos) {
                try {
                    IBlockState _bs5 = world.func_180495_p(pos);
                    UnmodifiableIterator it = _bs5.func_177228_b().keySet().iterator();
                    while (it.hasNext()) {
                        PropertyDirection propertyDirection = (IProperty) it.next();
                        if (propertyDirection.func_177701_a().equals("facing")) {
                            return _bs5.func_177229_b(propertyDirection);
                        }
                    }
                    return EnumFacing.NORTH;
                } catch (Exception e) {
                    return EnumFacing.NORTH;
                }
            }
        }.getEnumFacing(new BlockPos(x, y, z)) == EnumFacing.EAST && !world.field_72995_K) {
            BlockPos _bp5 = new BlockPos(x + 2, y, z);
            TileEntity _tileEntity5 = world.func_175625_s(_bp5);
            IBlockState _bs5 = world.func_180495_p(_bp5);
            if (_tileEntity5 != null) {
                _tileEntity5.getTileData().func_74780_a("qianghuaW", 1.0d + new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick.12
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "qianghua"));
            }
            world.func_184138_a(_bp5, _bs5, _bs5, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhenfulu.procedure.ProcedureZhenfaqizhi05UpdateTick.13
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "zhuanxiang")) {
            Map<String, Object> $_dependencies = new HashMap<>();
            $_dependencies.put("world", world);
            $_dependencies.put("x", Integer.valueOf(x));
            $_dependencies.put("y", Integer.valueOf(y));
            $_dependencies.put("z", Integer.valueOf(z));
            ProcedureZhenfaqizhi05BlockDestroyedByPlayer.executeProcedure($_dependencies);
            if (!world.field_72995_K) {
                BlockPos _bp6 = new BlockPos(x, y, z);
                TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                IBlockState _bs6 = world.func_180495_p(_bp6);
                if (_tileEntity6 != null) {
                    _tileEntity6.getTileData().func_74757_a("zhuanxiang", false);
                }
                world.func_184138_a(_bp6, _bs6, _bs6, 3);
            }
        }
    }
}
