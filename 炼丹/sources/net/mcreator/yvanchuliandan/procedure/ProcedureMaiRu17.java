package net.mcreator.yvanchuliandan.procedure;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.Random;
import net.mcreator.yvanchuliandan.ElementsYvanchuliandanMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

@ElementsYvanchuliandanMod.ModElement.Tag
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureMaiRu17.class */
public class ProcedureMaiRu17 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureMaiRu17(ElementsYvanchuliandanMod instance) {
        super(instance, 859);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$2] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$8] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$14] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$20] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$26] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$32] */
    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$38] */
    /* JADX WARN: Type inference failed for: r0v44, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$44] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$50] */
    /* JADX WARN: Type inference failed for: r0v50, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$56] */
    /* JADX WARN: Type inference failed for: r3v102, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$47] */
    /* JADX WARN: Type inference failed for: r3v119, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$42] */
    /* JADX WARN: Type inference failed for: r3v127, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$41] */
    /* JADX WARN: Type inference failed for: r3v13, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$13] */
    /* JADX WARN: Type inference failed for: r3v144, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$36] */
    /* JADX WARN: Type inference failed for: r3v152, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$35] */
    /* JADX WARN: Type inference failed for: r3v169, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$30] */
    /* JADX WARN: Type inference failed for: r3v177, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$29] */
    /* JADX WARN: Type inference failed for: r3v18, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$19] */
    /* JADX WARN: Type inference failed for: r3v194, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$24] */
    /* JADX WARN: Type inference failed for: r3v202, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$23] */
    /* JADX WARN: Type inference failed for: r3v219, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$18] */
    /* JADX WARN: Type inference failed for: r3v227, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$17] */
    /* JADX WARN: Type inference failed for: r3v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$25] */
    /* JADX WARN: Type inference failed for: r3v244, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$12] */
    /* JADX WARN: Type inference failed for: r3v252, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$11] */
    /* JADX WARN: Type inference failed for: r3v269, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$6] */
    /* JADX WARN: Type inference failed for: r3v277, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$5] */
    /* JADX WARN: Type inference failed for: r3v28, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$31] */
    /* JADX WARN: Type inference failed for: r3v3, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$1] */
    /* JADX WARN: Type inference failed for: r3v33, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$37] */
    /* JADX WARN: Type inference failed for: r3v38, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$43] */
    /* JADX WARN: Type inference failed for: r3v43, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$49] */
    /* JADX WARN: Type inference failed for: r3v48, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$55] */
    /* JADX WARN: Type inference failed for: r3v53, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$60] */
    /* JADX WARN: Type inference failed for: r3v58, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$59] */
    /* JADX WARN: Type inference failed for: r3v75, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$54] */
    /* JADX WARN: Type inference failed for: r3v8, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$7] */
    /* JADX WARN: Type inference failed for: r3v80, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$53] */
    /* JADX WARN: Type inference failed for: r3v97, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$48] */
    /* JADX WARN: Type inference failed for: r4v102, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$34] */
    /* JADX WARN: Type inference failed for: r4v117, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$28] */
    /* JADX WARN: Type inference failed for: r4v132, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$22] */
    /* JADX WARN: Type inference failed for: r4v147, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$16] */
    /* JADX WARN: Type inference failed for: r4v162, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$10] */
    /* JADX WARN: Type inference failed for: r4v177, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$4] */
    /* JADX WARN: Type inference failed for: r4v42, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$58] */
    /* JADX WARN: Type inference failed for: r4v57, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$52] */
    /* JADX WARN: Type inference failed for: r4v72, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$46] */
    /* JADX WARN: Type inference failed for: r4v87, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17$40] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "序列")) == 161.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.3
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.4
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "序列") - 1.0d) + " fabaokuozhan:cailiao19 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74780_a("JiaGe" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.5
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(601) + 600);
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74780_a("XianLiang" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.6
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(9) + 1);
                }
                world.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.8
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.7
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "序列")) == 162.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.9
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.10
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "序列") - 1.0d) + " yvanchuxiuzhenfulu:cailiao32 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp3 = new BlockPos(x, y, z);
                TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                IBlockState _bs3 = world.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74780_a("JiaGe" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.11
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(5) + 4);
                }
                world.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                IBlockState _bs4 = world.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74780_a("XianLiang" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.12
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(19) + 1);
                }
                world.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.14
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.13
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "序列")) == 163.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.15
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.16
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "序列") - 1.0d) + " yvanchuxiuzhenfulu:cailiao35 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp5 = new BlockPos(x, y, z);
                TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                IBlockState _bs5 = world.func_180495_p(_bp5);
                if (_tileEntity5 != null) {
                    _tileEntity5.getTileData().func_74780_a("JiaGe" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.17
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(5) + 4);
                }
                world.func_184138_a(_bp5, _bs5, _bs5, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp6 = new BlockPos(x, y, z);
                TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                IBlockState _bs6 = world.func_180495_p(_bp6);
                if (_tileEntity6 != null) {
                    _tileEntity6.getTileData().func_74780_a("XianLiang" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.18
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(19) + 1);
                }
                world.func_184138_a(_bp6, _bs6, _bs6, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.20
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.19
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "序列")) == 164.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.21
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.22
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "序列") - 1.0d) + " yvanchuxiuzhenfulu:cailiao36 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp7 = new BlockPos(x, y, z);
                TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                IBlockState _bs7 = world.func_180495_p(_bp7);
                if (_tileEntity7 != null) {
                    _tileEntity7.getTileData().func_74780_a("JiaGe" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.23
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(401) + 400);
                }
                world.func_184138_a(_bp7, _bs7, _bs7, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp8 = new BlockPos(x, y, z);
                TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                IBlockState _bs8 = world.func_180495_p(_bp8);
                if (_tileEntity8 != null) {
                    _tileEntity8.getTileData().func_74780_a("XianLiang" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.24
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(19) + 1);
                }
                world.func_184138_a(_bp8, _bs8, _bs8, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.26
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.25
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "序列")) == 165.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.27
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.28
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "序列") - 1.0d) + " yvanchuxiuzhenfulu:cailiao37 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp9 = new BlockPos(x, y, z);
                TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                IBlockState _bs9 = world.func_180495_p(_bp9);
                if (_tileEntity9 != null) {
                    _tileEntity9.getTileData().func_74780_a("JiaGe" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.29
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(801) + 800);
                }
                world.func_184138_a(_bp9, _bs9, _bs9, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp10 = new BlockPos(x, y, z);
                TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                IBlockState _bs10 = world.func_180495_p(_bp10);
                if (_tileEntity10 != null) {
                    _tileEntity10.getTileData().func_74780_a("XianLiang" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.30
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(19) + 1);
                }
                world.func_184138_a(_bp10, _bs10, _bs10, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.32
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.31
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "序列")) == 166.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.33
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.34
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "序列") - 1.0d) + " yvanchuxiuzhenfulu:cailiao34 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp11 = new BlockPos(x, y, z);
                TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                IBlockState _bs11 = world.func_180495_p(_bp11);
                if (_tileEntity11 != null) {
                    _tileEntity11.getTileData().func_74780_a("JiaGe" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.35
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(6) + 5);
                }
                world.func_184138_a(_bp11, _bs11, _bs11, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp12 = new BlockPos(x, y, z);
                TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                IBlockState _bs12 = world.func_180495_p(_bp12);
                if (_tileEntity12 != null) {
                    _tileEntity12.getTileData().func_74780_a("XianLiang" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.36
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(9) + 1);
                }
                world.func_184138_a(_bp12, _bs12, _bs12, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.38
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.37
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "序列")) == 167.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.39
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.40
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "序列") - 1.0d) + " yvanchuxiuzhenfulu:caiitem01 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp13 = new BlockPos(x, y, z);
                TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                IBlockState _bs13 = world.func_180495_p(_bp13);
                if (_tileEntity13 != null) {
                    _tileEntity13.getTileData().func_74780_a("JiaGe" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.41
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(17) + 16);
                }
                world.func_184138_a(_bp13, _bs13, _bs13, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp14 = new BlockPos(x, y, z);
                TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                IBlockState _bs14 = world.func_180495_p(_bp14);
                if (_tileEntity14 != null) {
                    _tileEntity14.getTileData().func_74780_a("XianLiang" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.42
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(9) + 1);
                }
                world.func_184138_a(_bp14, _bs14, _bs14, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.44
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.43
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "序列")) == 168.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.45
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.46
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "序列") - 1.0d) + " yvanchuxiuzhenfulu:zhenfa04 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp15 = new BlockPos(x, y, z);
                TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                IBlockState _bs15 = world.func_180495_p(_bp15);
                if (_tileEntity15 != null) {
                    _tileEntity15.getTileData().func_74780_a("JiaGe" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.47
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(3) + 1);
                }
                world.func_184138_a(_bp15, _bs15, _bs15, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp16 = new BlockPos(x, y, z);
                TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                IBlockState _bs16 = world.func_180495_p(_bp16);
                if (_tileEntity16 != null) {
                    _tileEntity16.getTileData().func_74780_a("XianLiang" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.48
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), 1.0d);
                }
                world.func_184138_a(_bp16, _bs16, _bs16, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.50
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.49
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "序列")) == 169.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.51
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.52
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "序列") - 1.0d) + " fabaokuozhan:lianqi1201 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp17 = new BlockPos(x, y, z);
                TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                IBlockState _bs17 = world.func_180495_p(_bp17);
                if (_tileEntity17 != null) {
                    _tileEntity17.getTileData().func_74780_a("JiaGe" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.53
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(12) + 11);
                }
                world.func_184138_a(_bp17, _bs17, _bs17, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp18 = new BlockPos(x, y, z);
                TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                IBlockState _bs18 = world.func_180495_p(_bp18);
                if (_tileEntity18 != null) {
                    _tileEntity18.getTileData().func_74780_a("XianLiang" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.54
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), 1.0d);
                }
                world.func_184138_a(_bp18, _bs18, _bs18, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.56
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.55
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "序列")) == 170.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.57
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.58
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "序列") - 1.0d) + " fabaokuozhan:fu_ling_tai_1 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp19 = new BlockPos(x, y, z);
                TileEntity _tileEntity19 = world.func_175625_s(_bp19);
                IBlockState _bs19 = world.func_180495_p(_bp19);
                if (_tileEntity19 != null) {
                    _tileEntity19.getTileData().func_74780_a("JiaGe" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.59
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(3) + 1);
                }
                world.func_184138_a(_bp19, _bs19, _bs19, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp20 = new BlockPos(x, y, z);
                TileEntity _tileEntity20 = world.func_175625_s(_bp20);
                IBlockState _bs20 = world.func_180495_p(_bp20);
                if (_tileEntity20 != null) {
                    _tileEntity20.getTileData().func_74780_a("XianLiang" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu17.60
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), 1.0d);
                }
                world.func_184138_a(_bp20, _bs20, _bs20, 3);
            }
        }
    }
}
