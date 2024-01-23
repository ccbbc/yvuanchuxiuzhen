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
/* loaded from: 本体-mc1.12.2-2.0.22.jar:net/mcreator/yvanchuxiuzhen/procedure/ProcedureSectJob1Up.class */
public class ProcedureSectJob1Up extends ElementsYvanchuxiuzhenMod.ModElement {
    static Map<String, Object> $_dependencies = new HashMap();

    public ProcedureSectJob1Up(ElementsYvanchuxiuzhenMod instance) {
        super(instance, 537);
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up$4] */
    /* JADX WARN: Type inference failed for: r1v19, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up$7] */
    /* JADX WARN: Type inference failed for: r1v25, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up$6] */
    /* JADX WARN: Type inference failed for: r1v31, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up$3] */
    /* JADX WARN: Type inference failed for: r2v19, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up$1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up$5] */
    /* JADX WARN: Type inference failed for: r2v8, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up$8] */
    /* JADX WARN: Type inference failed for: r4v16, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up$2] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (entity.getEntityData().func_74769_h("SectJobLevel") >= 3.0d) {
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74778_a("SectJobUpdateNameTemp", "SectJobUpdate1");
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74778_a("SectJobUpdateNameTemp2", "SectJob1");
                }
                world.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp3 = new BlockPos(x, y, z);
                TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                IBlockState _bs3 = world.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74778_a("SectJobUpdateNameTemp3", "SectJob1All");
                }
                world.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                IBlockState _bs4 = world.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74780_a(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up.3
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "SectJobUpdateNameTemp"), new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up.1
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up.2
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "SectJobUpdateNameTemp")) - 1.0d);
                }
                world.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
            if (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up.4
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up.5
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74779_i(tag);
                    }
                    return "";
                }
            }.getValue(new BlockPos(x, y, z), "SectJobUpdateNameTemp")) <= 1.0d && !world.field_72995_K) {
                BlockPos _bp5 = new BlockPos(x, y, z);
                TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                IBlockState _bs5 = world.func_180495_p(_bp5);
                if (_tileEntity5 != null) {
                    _tileEntity5.getTileData().func_74780_a(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up.6
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "SectJobUpdateNameTemp"), 1.0d);
                }
                world.func_184138_a(_bp5, _bs5, _bs5, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp6 = new BlockPos(x, y, z);
                TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                IBlockState _bs6 = world.func_180495_p(_bp6);
                if (_tileEntity6 != null) {
                    _tileEntity6.getTileData().func_74778_a(new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up.7
                        public String getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74779_i(tag);
                            }
                            return "";
                        }
                    }.getValue(new BlockPos(x, y, z), "SectJobUpdateNameTemp2"), new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up.8
                        String string;
                        String[] value;
                        String indexvalue;

                        /* JADX WARN: Type inference failed for: r1v4, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up$8$1] */
                        /* JADX WARN: Type inference failed for: r2v3, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up$8$3] */
                        /* JADX WARN: Type inference failed for: r3v2, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up$8$2] */
                        /* JADX WARN: Type inference failed for: r4v6, types: [net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up$8$4] */
                        {
                            this.string = new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up.8.1
                                public String getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74779_i(tag);
                                    }
                                    return "";
                                }
                            }.getValue(new BlockPos(x, y, z), new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up.8.2
                                public String getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74779_i(tag);
                                    }
                                    return "";
                                }
                            }.getValue(new BlockPos(x, y, z), "SectJobUpdateNameTemp3"));
                            this.value = this.string.split("");
                            this.indexvalue = this.value[(int) (new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up.8.3
                                public double getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74769_h(tag);
                                    }
                                    return -1.0d;
                                }
                            }.getValue(new BlockPos(x, y, z), new Object() { // from class: net.mcreator.yvanchuxiuzhen.procedure.ProcedureSectJob1Up.8.4
                                public String getValue(BlockPos pos, String tag) {
                                    TileEntity tileEntity = world.func_175625_s(pos);
                                    if (tileEntity != null) {
                                        return tileEntity.getTileData().func_74779_i(tag);
                                    }
                                    return "";
                                }
                            }.getValue(new BlockPos(x, y, z), "SectJobUpdateNameTemp")) - 1.0d)];
                        }

                        String getString() {
                            String s = this.indexvalue;
                            return s;
                        }
                    }.getString());
                }
                world.func_184138_a(_bp6, _bs6, _bs6, 3);
            }
        }
    }
}
