package net.mcreator.yuanchujianzhu.procedure;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.mcreator.yuanchujianzhu.ElementsYuanchujianzhuMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYuanchujianzhuMod.ModElement.Tag
/* loaded from: 秘境-mc1.12.2-2.0.3.jar:net/mcreator/yuanchujianzhu/procedure/ProcedureDanXiangSet3.class */
public class ProcedureDanXiangSet3 extends ElementsYuanchujianzhuMod.ModElement {
    public ProcedureDanXiangSet3(ElementsYuanchujianzhuMod instance) {
        super(instance, 194);
    }

    /* JADX WARN: Type inference failed for: r0v104, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$53] */
    /* JADX WARN: Type inference failed for: r0v109, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$58] */
    /* JADX WARN: Type inference failed for: r0v50, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$1] */
    /* JADX WARN: Type inference failed for: r0v52, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$2] */
    /* JADX WARN: Type inference failed for: r0v54, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$3] */
    /* JADX WARN: Type inference failed for: r0v59, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$8] */
    /* JADX WARN: Type inference failed for: r0v64, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$13] */
    /* JADX WARN: Type inference failed for: r0v69, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$18] */
    /* JADX WARN: Type inference failed for: r0v74, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$23] */
    /* JADX WARN: Type inference failed for: r0v79, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$28] */
    /* JADX WARN: Type inference failed for: r0v84, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$33] */
    /* JADX WARN: Type inference failed for: r0v89, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$38] */
    /* JADX WARN: Type inference failed for: r0v94, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$43] */
    /* JADX WARN: Type inference failed for: r0v99, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$48] */
    /* JADX WARN: Type inference failed for: r2v115, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$52] */
    /* JADX WARN: Type inference failed for: r2v120, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$51] */
    /* JADX WARN: Type inference failed for: r2v144, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$47] */
    /* JADX WARN: Type inference failed for: r2v149, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$46] */
    /* JADX WARN: Type inference failed for: r2v173, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$42] */
    /* JADX WARN: Type inference failed for: r2v178, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$41] */
    /* JADX WARN: Type inference failed for: r2v202, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$37] */
    /* JADX WARN: Type inference failed for: r2v207, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$36] */
    /* JADX WARN: Type inference failed for: r2v231, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$32] */
    /* JADX WARN: Type inference failed for: r2v236, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$31] */
    /* JADX WARN: Type inference failed for: r2v260, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$27] */
    /* JADX WARN: Type inference failed for: r2v265, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$26] */
    /* JADX WARN: Type inference failed for: r2v289, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$22] */
    /* JADX WARN: Type inference failed for: r2v294, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$21] */
    /* JADX WARN: Type inference failed for: r2v318, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$17] */
    /* JADX WARN: Type inference failed for: r2v323, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$16] */
    /* JADX WARN: Type inference failed for: r2v347, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$12] */
    /* JADX WARN: Type inference failed for: r2v352, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$11] */
    /* JADX WARN: Type inference failed for: r2v376, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$7] */
    /* JADX WARN: Type inference failed for: r2v381, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$6] */
    /* JADX WARN: Type inference failed for: r2v62, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$61] */
    /* JADX WARN: Type inference failed for: r2v86, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$57] */
    /* JADX WARN: Type inference failed for: r2v91, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$56] */
    /* JADX WARN: Type inference failed for: r4v113, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$30] */
    /* JADX WARN: Type inference failed for: r4v127, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$25] */
    /* JADX WARN: Type inference failed for: r4v141, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$20] */
    /* JADX WARN: Type inference failed for: r4v155, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$15] */
    /* JADX WARN: Type inference failed for: r4v172, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$10] */
    /* JADX WARN: Type inference failed for: r4v186, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$5] */
    /* JADX WARN: Type inference failed for: r4v23, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$60] */
    /* JADX WARN: Type inference failed for: r4v40, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$55] */
    /* JADX WARN: Type inference failed for: r4v57, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$50] */
    /* JADX WARN: Type inference failed for: r4v71, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$45] */
    /* JADX WARN: Type inference failed for: r4v85, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$40] */
    /* JADX WARN: Type inference failed for: r4v99, types: [net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3$35] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null || dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        Object entity = (Entity) dependencies.get("entity");
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        Map<String, Object> $_dependencies = new HashMap<>();
        $_dependencies.put("world", world);
        $_dependencies.put("x", Integer.valueOf(x));
        $_dependencies.put("y", Integer.valueOf(y));
        $_dependencies.put("z", Integer.valueOf(z));
        ProcedureSetBlockLingGen.executeProcedure($_dependencies);
        Map<String, Object> $_dependencies2 = new HashMap<>();
        $_dependencies2.put("entity", entity);
        $_dependencies2.put("world", world);
        $_dependencies2.put("x", Integer.valueOf(x));
        $_dependencies2.put("y", Integer.valueOf(y));
        $_dependencies2.put("z", Integer.valueOf(z));
        ProcedureOpenGuiTiaoJian.executeProcedure($_dependencies2);
        if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.1
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "打开") && !new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.2
            public boolean getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74767_n(tag);
                }
                return false;
            }
        }.getValue(new BlockPos(x, y, z), "初始化")) {
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.3
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 3.0d && Math.random() <= 0.3d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.4
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return new BlockPos(x, y, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y, z);
                        }
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.5
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuliandan:dan_yao_31 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    TileEntity _tileEntity = world.func_175625_s(_bp);
                    IBlockState _bs = world.func_180495_p(_bp);
                    if (_tileEntity != null) {
                        _tileEntity.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.6
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp, _bs, _bs, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.7
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.8
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 3.0d && Math.random() <= 0.3d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.9
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return new BlockPos(x, y, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y, z);
                        }
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.10
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuliandan:dan_yao_32 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp3 = new BlockPos(x, y, z);
                    TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                    IBlockState _bs3 = world.func_180495_p(_bp3);
                    if (_tileEntity3 != null) {
                        _tileEntity3.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.11
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp3, _bs3, _bs3, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                IBlockState _bs4 = world.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.12
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.13
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 3.0d && Math.random() <= 0.3d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.14
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return new BlockPos(x, y, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y, z);
                        }
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.15
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuliandan:dan_yao_33a " + (new Random().nextInt(2) + 1) + " 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp5 = new BlockPos(x, y, z);
                    TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                    IBlockState _bs5 = world.func_180495_p(_bp5);
                    if (_tileEntity5 != null) {
                        _tileEntity5.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.16
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp5, _bs5, _bs5, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp6 = new BlockPos(x, y, z);
                TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                IBlockState _bs6 = world.func_180495_p(_bp6);
                if (_tileEntity6 != null) {
                    _tileEntity6.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.17
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp6, _bs6, _bs6, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.18
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 3.0d && Math.random() <= 0.3d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.19
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return new BlockPos(x, y, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y, z);
                        }
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.20
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuliandan:dan_yao_34 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp7 = new BlockPos(x, y, z);
                    TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                    IBlockState _bs7 = world.func_180495_p(_bp7);
                    if (_tileEntity7 != null) {
                        _tileEntity7.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.21
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp7, _bs7, _bs7, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp8 = new BlockPos(x, y, z);
                TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                IBlockState _bs8 = world.func_180495_p(_bp8);
                if (_tileEntity8 != null) {
                    _tileEntity8.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.22
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp8, _bs8, _bs8, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.23
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 3.0d && Math.random() <= 0.3d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.24
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return new BlockPos(x, y, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y, z);
                        }
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.25
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuliandan:dan_yao_35 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp9 = new BlockPos(x, y, z);
                    TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                    IBlockState _bs9 = world.func_180495_p(_bp9);
                    if (_tileEntity9 != null) {
                        _tileEntity9.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.26
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp9, _bs9, _bs9, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp10 = new BlockPos(x, y, z);
                TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                IBlockState _bs10 = world.func_180495_p(_bp10);
                if (_tileEntity10 != null) {
                    _tileEntity10.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.27
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp10, _bs10, _bs10, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.28
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 3.0d && Math.random() <= 0.3d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.29
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return new BlockPos(x, y, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y, z);
                        }
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.30
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuliandan:dan_yao_36 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp11 = new BlockPos(x, y, z);
                    TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                    IBlockState _bs11 = world.func_180495_p(_bp11);
                    if (_tileEntity11 != null) {
                        _tileEntity11.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.31
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp11, _bs11, _bs11, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp12 = new BlockPos(x, y, z);
                TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                IBlockState _bs12 = world.func_180495_p(_bp12);
                if (_tileEntity12 != null) {
                    _tileEntity12.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.32
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp12, _bs12, _bs12, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.33
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 3.0d && Math.random() <= 0.3d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.34
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return new BlockPos(x, y, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y, z);
                        }
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.35
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuliandan:dan_yao_37 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp13 = new BlockPos(x, y, z);
                    TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                    IBlockState _bs13 = world.func_180495_p(_bp13);
                    if (_tileEntity13 != null) {
                        _tileEntity13.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.36
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp13, _bs13, _bs13, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp14 = new BlockPos(x, y, z);
                TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                IBlockState _bs14 = world.func_180495_p(_bp14);
                if (_tileEntity14 != null) {
                    _tileEntity14.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.37
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp14, _bs14, _bs14, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.38
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 3.0d && Math.random() <= 0.3d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.39
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return new BlockPos(x, y, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y, z);
                        }
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.40
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuliandan:dan_yao_38 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp15 = new BlockPos(x, y, z);
                    TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                    IBlockState _bs15 = world.func_180495_p(_bp15);
                    if (_tileEntity15 != null) {
                        _tileEntity15.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.41
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp15, _bs15, _bs15, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp16 = new BlockPos(x, y, z);
                TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                IBlockState _bs16 = world.func_180495_p(_bp16);
                if (_tileEntity16 != null) {
                    _tileEntity16.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.42
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp16, _bs16, _bs16, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.43
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 3.0d && Math.random() <= 0.3d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.44
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return new BlockPos(x, y, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y, z);
                        }
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.45
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuliandan:dan_yao_spoils_02 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp17 = new BlockPos(x, y, z);
                    TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                    IBlockState _bs17 = world.func_180495_p(_bp17);
                    if (_tileEntity17 != null) {
                        _tileEntity17.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.46
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp17, _bs17, _bs17, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp18 = new BlockPos(x, y, z);
                TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                IBlockState _bs18 = world.func_180495_p(_bp18);
                if (_tileEntity18 != null) {
                    _tileEntity18.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.47
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp18, _bs18, _bs18, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.48
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 3.0d && Math.random() <= 0.3d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.49
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return new BlockPos(x, y, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y, z);
                        }
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.50
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuliandan:dan_yao_spoils_03 1 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp19 = new BlockPos(x, y, z);
                    TileEntity _tileEntity19 = world.func_175625_s(_bp19);
                    IBlockState _bs19 = world.func_180495_p(_bp19);
                    if (_tileEntity19 != null) {
                        _tileEntity19.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.51
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp19, _bs19, _bs19, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp20 = new BlockPos(x, y, z);
                TileEntity _tileEntity20 = world.func_175625_s(_bp20);
                IBlockState _bs20 = world.func_180495_p(_bp20);
                if (_tileEntity20 != null) {
                    _tileEntity20.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.52
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp20, _bs20, _bs20, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.53
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 3.0d && Math.random() <= 0.3d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.54
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return new BlockPos(x, y, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y, z);
                        }
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.55
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuliandan:caoyaocong02 " + (new Random().nextInt(5) + 1) + " 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp21 = new BlockPos(x, y, z);
                    TileEntity _tileEntity21 = world.func_175625_s(_bp21);
                    IBlockState _bs21 = world.func_180495_p(_bp21);
                    if (_tileEntity21 != null) {
                        _tileEntity21.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.56
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp21, _bs21, _bs21, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp22 = new BlockPos(x, y, z);
                TileEntity _tileEntity22 = world.func_175625_s(_bp22);
                IBlockState _bs22 = world.func_180495_p(_bp22);
                if (_tileEntity22 != null) {
                    _tileEntity22.getTileData().func_74780_a("Slot", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.57
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot") + 1.0d);
                }
                world.func_184138_a(_bp22, _bs22, _bs22, 3);
            }
            if (new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.58
                public double getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.func_175625_s(pos);
                    if (tileEntity != null) {
                        return tileEntity.getTileData().func_74769_h(tag);
                    }
                    return -1.0d;
                }
            }.getValue(new BlockPos(x, y, z), "数量") < 3.0d && Math.random() <= 0.3d) {
                if (!world.field_72995_K && world.func_73046_m() != null) {
                    world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.59
                        public String func_70005_c_() {
                            return "";
                        }

                        public boolean func_70003_b(int permission, String command) {
                            return true;
                        }

                        public World func_130014_f_() {
                            return world;
                        }

                        public MinecraftServer func_184102_h() {
                            return world.func_73046_m();
                        }

                        public boolean func_174792_t_() {
                            return false;
                        }

                        public BlockPos func_180425_c() {
                            return new BlockPos(x, y, z);
                        }

                        public Vec3d func_174791_d() {
                            return new Vec3d(x, y, z);
                        }
                    }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.60
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "Slot")) + " yvanchuliandan:cao_yao_06 " + (new Random().nextInt(2) + 1) + " 0");
                }
                if (!world.field_72995_K) {
                    BlockPos _bp23 = new BlockPos(x, y, z);
                    TileEntity _tileEntity23 = world.func_175625_s(_bp23);
                    IBlockState _bs23 = world.func_180495_p(_bp23);
                    if (_tileEntity23 != null) {
                        _tileEntity23.getTileData().func_74780_a("数量", new Object() { // from class: net.mcreator.yuanchujianzhu.procedure.ProcedureDanXiangSet3.61
                            public double getValue(BlockPos pos, String tag) {
                                TileEntity tileEntity = world.func_175625_s(pos);
                                if (tileEntity != null) {
                                    return tileEntity.getTileData().func_74769_h(tag);
                                }
                                return -1.0d;
                            }
                        }.getValue(new BlockPos(x, y, z), "数量") + 1.0d);
                    }
                    world.func_184138_a(_bp23, _bs23, _bs23, 3);
                }
            }
            if (!world.field_72995_K) {
                BlockPos _bp24 = new BlockPos(x, y, z);
                TileEntity _tileEntity24 = world.func_175625_s(_bp24);
                IBlockState _bs24 = world.func_180495_p(_bp24);
                if (_tileEntity24 != null) {
                    _tileEntity24.getTileData().func_74757_a("初始化", true);
                }
                world.func_184138_a(_bp24, _bs24, _bs24, 3);
            }
        }
    }
}
