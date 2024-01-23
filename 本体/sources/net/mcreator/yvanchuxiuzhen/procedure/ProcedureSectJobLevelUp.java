package net.mcreator.yvanchuxiuzhen.procedure;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.yvanchuxiuzhen.ElementsYvanchuxiuzhenMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsYvanchuxiuzhenMod.ModElement.Tag
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureSectJobLevelUp.class */
public class ProcedureSectJobLevelUp extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSectJobLevelUp(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 532);
    }

    /* JADX WARN: Type inference failed for: r0v127, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelUp$3] */
    /* JADX WARN: Type inference failed for: r0v30, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelUp$2] */
    /* JADX WARN: Type inference failed for: r0v45, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelUp$5] */
    /* JADX WARN: Type inference failed for: r0v59, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelUp$4] */
    /* JADX WARN: Type inference failed for: r0v73, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelUp$6] */
    /* JADX WARN: Type inference failed for: r0v76, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelUp$7] */
    /* JADX WARN: Type inference failed for: r0v79, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelUp$8] */
    /* JADX WARN: Type inference failed for: r0v93, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelUp$9] */
    /* JADX WARN: Type inference failed for: r2v54, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelUp$1] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = ((Integer) dependencies.get("x")).intValue();
        int y = ((Integer) dependencies.get("y")).intValue();
        int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (!world.field_72995_K) {
            BlockPos _bp = new BlockPos(x, y, z);
            TileEntity _tileEntity = world.func_175625_s(_bp);
            IBlockState _bs = world.func_180495_p(_bp);
            if (_tileEntity != null) {
                _tileEntity.getTileData().func_74780_a("SectJobLevel", new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelUp.1
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "SectJobLevel") - 1.0d);
            }
            world.func_184138_a(_bp, _bs, _bs, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelUp.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "SectJobLevel") < 0.0d && !world.field_72995_K) {
            BlockPos _bp2 = new BlockPos(x, y, z);
            TileEntity _tileEntity2 = world.func_175625_s(_bp2);
            IBlockState _bs2 = world.func_180495_p(_bp2);
            if (_tileEntity2 != null) {
                _tileEntity2.getTileData().func_74780_a("SectJobLevel", 6.0d);
            }
            world.func_184138_a(_bp2, _bs2, _bs2, 3);
        }
        if (entity.getEntityData().func_74769_h("SectJobLevel") == 3.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelUp.3
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "SectJobLevel") < 1.0d && !world.field_72995_K) {
                BlockPos _bp3 = new BlockPos(x, y, z);
                TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                IBlockState _bs3 = world.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74780_a("SectJobLevel", 2.0d);
                }
                world.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
        } else if (entity.getEntityData().func_74769_h("SectJobLevel") == 4.0d) {
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelUp.4
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "SectJobLevel") < 1.0d && !world.field_72995_K) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                IBlockState _bs4 = world.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74780_a("SectJobLevel", 3.0d);
                }
                world.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
        } else if (entity.getEntityData().func_74769_h("SectJobLevel") == 5.0d && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelUp.5
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "SectJobLevel") < 1.0d && !world.field_72995_K) {
            BlockPos _bp5 = new BlockPos(x, y, z);
            TileEntity _tileEntity5 = world.func_175625_s(_bp5);
            IBlockState _bs5 = world.func_180495_p(_bp5);
            if (_tileEntity5 != null) {
                _tileEntity5.getTileData().func_74780_a("SectJobLevel", 4.0d);
            }
            world.func_184138_a(_bp5, _bs5, _bs5, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelUp.6
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "SectLevel") == 1.0d) {
            if (!world.field_72995_K) {
                BlockPos _bp6 = new BlockPos(x, y, z);
                TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                IBlockState _bs6 = world.func_180495_p(_bp6);
                if (_tileEntity6 != null) {
                    _tileEntity6.getTileData().func_74780_a("SectJobLevel", 1.0d);
                }
                world.func_184138_a(_bp6, _bs6, _bs6, 3);
            }
        } else if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelUp.7
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "SectLevel") == 2.0d && new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelUp.8
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "SectJobLevel") < 1.0d && !world.field_72995_K) {
            BlockPos _bp7 = new BlockPos(x, y, z);
            TileEntity _tileEntity7 = world.func_175625_s(_bp7);
            IBlockState _bs7 = world.func_180495_p(_bp7);
            if (_tileEntity7 != null) {
                _tileEntity7.getTileData().func_74780_a("SectJobLevel", 4.0d);
            }
            world.func_184138_a(_bp7, _bs7, _bs7, 3);
        }
        if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJobLevelUp.9
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74779_i(tag);
                }
                return "";
            }
        }.getValue(new BlockPos(x, y, z), "SectJob6").equals("") && !world.field_72995_K) {
            BlockPos _bp8 = new BlockPos(x, y, z);
            TileEntity _tileEntity8 = world.func_175625_s(_bp8);
            IBlockState _bs8 = world.func_180495_p(_bp8);
            if (_tileEntity8 != null) {
                _tileEntity8.getTileData().func_74780_a("SectJobLevel", 6.0d);
            }
            world.func_184138_a(_bp8, _bs8, _bs8, 3);
        }
        $_dependencies.put("world", world);
        $_dependencies.put("x", Integer.valueOf(x));
        $_dependencies.put("y", Integer.valueOf(y));
        $_dependencies.put("z", Integer.valueOf(z));
        ProcedureSectJobUpdate.executeProcedure($_dependencies);
    }
}
