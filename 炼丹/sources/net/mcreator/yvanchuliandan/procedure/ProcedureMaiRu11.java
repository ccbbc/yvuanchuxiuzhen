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
/* loaded from: 炼丹-mc1.12.2-2.0.14.jar:net/mcreator/yvanchuliandan/procedure/ProcedureMaiRu11.class */
public class ProcedureMaiRu11 extends ElementsYvanchuliandanMod.ModElement {
    public ProcedureMaiRu11(ElementsYvanchuliandanMod instance) {
        super(instance, 853);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$2] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$8] */
    /* JADX WARN: Type inference failed for: r0v29, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$14] */
    /* JADX WARN: Type inference failed for: r0v32, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$20] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$26] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$32] */
    /* JADX WARN: Type inference failed for: r0v41, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$38] */
    /* JADX WARN: Type inference failed for: r0v44, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$44] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$50] */
    /* JADX WARN: Type inference failed for: r0v50, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$56] */
    /* JADX WARN: Type inference failed for: r3v103, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$48] */
    /* JADX WARN: Type inference failed for: r3v111, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$47] */
    /* JADX WARN: Type inference failed for: r3v128, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$42] */
    /* JADX WARN: Type inference failed for: r3v13, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$13] */
    /* JADX WARN: Type inference failed for: r3v136, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$41] */
    /* JADX WARN: Type inference failed for: r3v153, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$36] */
    /* JADX WARN: Type inference failed for: r3v161, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$35] */
    /* JADX WARN: Type inference failed for: r3v178, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$30] */
    /* JADX WARN: Type inference failed for: r3v18, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$19] */
    /* JADX WARN: Type inference failed for: r3v186, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$29] */
    /* JADX WARN: Type inference failed for: r3v203, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$24] */
    /* JADX WARN: Type inference failed for: r3v211, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$23] */
    /* JADX WARN: Type inference failed for: r3v228, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$18] */
    /* JADX WARN: Type inference failed for: r3v23, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$25] */
    /* JADX WARN: Type inference failed for: r3v236, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$17] */
    /* JADX WARN: Type inference failed for: r3v253, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$12] */
    /* JADX WARN: Type inference failed for: r3v261, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$11] */
    /* JADX WARN: Type inference failed for: r3v278, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$6] */
    /* JADX WARN: Type inference failed for: r3v28, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$31] */
    /* JADX WARN: Type inference failed for: r3v286, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$5] */
    /* JADX WARN: Type inference failed for: r3v3, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$1] */
    /* JADX WARN: Type inference failed for: r3v33, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$37] */
    /* JADX WARN: Type inference failed for: r3v38, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$43] */
    /* JADX WARN: Type inference failed for: r3v43, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$49] */
    /* JADX WARN: Type inference failed for: r3v48, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$55] */
    /* JADX WARN: Type inference failed for: r3v53, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$60] */
    /* JADX WARN: Type inference failed for: r3v61, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$59] */
    /* JADX WARN: Type inference failed for: r3v78, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$54] */
    /* JADX WARN: Type inference failed for: r3v8, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$7] */
    /* JADX WARN: Type inference failed for: r3v86, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$53] */
    /* JADX WARN: Type inference failed for: r4v102, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$34] */
    /* JADX WARN: Type inference failed for: r4v117, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$28] */
    /* JADX WARN: Type inference failed for: r4v132, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$22] */
    /* JADX WARN: Type inference failed for: r4v147, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$16] */
    /* JADX WARN: Type inference failed for: r4v162, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$10] */
    /* JADX WARN: Type inference failed for: r4v177, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$4] */
    /* JADX WARN: Type inference failed for: r4v42, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$58] */
    /* JADX WARN: Type inference failed for: r4v57, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$52] */
    /* JADX WARN: Type inference failed for: r4v72, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$46] */
    /* JADX WARN: Type inference failed for: r4v87, types: [net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11$40] */
    public static void executeProcedure(Map<String, Object> dependencies) {
        if (dependencies.get("x") == null || dependencies.get("y") == null || dependencies.get("z") == null || dependencies.get("world") == null) {
            return;
        }
        final int x = ((Integer) dependencies.get("x")).intValue();
        final int y = ((Integer) dependencies.get("y")).intValue();
        final int z = ((Integer) dependencies.get("z")).intValue();
        final World world = (World) dependencies.get("world");
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.2
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.1
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "序列")) == 101.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.3
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.4
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "序列") - 1.0d) + " yvanchuxiuzhenfulu:fu_zhi_4 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp = new BlockPos(x, y, z);
                TileEntity _tileEntity = world.func_175625_s(_bp);
                IBlockState _bs = world.func_180495_p(_bp);
                if (_tileEntity != null) {
                    _tileEntity.getTileData().func_74780_a("JiaGe" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.5
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(7) + 6);
                }
                world.func_184138_a(_bp, _bs, _bs, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                TileEntity _tileEntity2 = world.func_175625_s(_bp2);
                IBlockState _bs2 = world.func_180495_p(_bp2);
                if (_tileEntity2 != null) {
                    _tileEntity2.getTileData().func_74780_a("XianLiang" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.6
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(39) + 1);
                }
                world.func_184138_a(_bp2, _bs2, _bs2, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.8
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.7
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "序列")) == 102.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.9
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.10
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "序列") - 1.0d) + " yvanchuxiuzhenfulu:fu_zhi_5 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp3 = new BlockPos(x, y, z);
                TileEntity _tileEntity3 = world.func_175625_s(_bp3);
                IBlockState _bs3 = world.func_180495_p(_bp3);
                if (_tileEntity3 != null) {
                    _tileEntity3.getTileData().func_74780_a("JiaGe" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.11
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(97) + 96);
                }
                world.func_184138_a(_bp3, _bs3, _bs3, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                TileEntity _tileEntity4 = world.func_175625_s(_bp4);
                IBlockState _bs4 = world.func_180495_p(_bp4);
                if (_tileEntity4 != null) {
                    _tileEntity4.getTileData().func_74780_a("XianLiang" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.12
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(39) + 1);
                }
                world.func_184138_a(_bp4, _bs4, _bs4, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.14
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.13
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "序列")) == 103.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.15
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.16
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "序列") - 1.0d) + " fabaokuozhan:lianqi01 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp5 = new BlockPos(x, y, z);
                TileEntity _tileEntity5 = world.func_175625_s(_bp5);
                IBlockState _bs5 = world.func_180495_p(_bp5);
                if (_tileEntity5 != null) {
                    _tileEntity5.getTileData().func_74780_a("JiaGe" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.17
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(2) + 2);
                }
                world.func_184138_a(_bp5, _bs5, _bs5, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp6 = new BlockPos(x, y, z);
                TileEntity _tileEntity6 = world.func_175625_s(_bp6);
                IBlockState _bs6 = world.func_180495_p(_bp6);
                if (_tileEntity6 != null) {
                    _tileEntity6.getTileData().func_74780_a("XianLiang" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.18
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(3) + 1);
                }
                world.func_184138_a(_bp6, _bs6, _bs6, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.20
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.19
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "序列")) == 104.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.21
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.22
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "序列") - 1.0d) + " fabaokuozhan:lianqi02 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp7 = new BlockPos(x, y, z);
                TileEntity _tileEntity7 = world.func_175625_s(_bp7);
                IBlockState _bs7 = world.func_180495_p(_bp7);
                if (_tileEntity7 != null) {
                    _tileEntity7.getTileData().func_74780_a("JiaGe" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.23
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(7) + 6);
                }
                world.func_184138_a(_bp7, _bs7, _bs7, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp8 = new BlockPos(x, y, z);
                TileEntity _tileEntity8 = world.func_175625_s(_bp8);
                IBlockState _bs8 = world.func_180495_p(_bp8);
                if (_tileEntity8 != null) {
                    _tileEntity8.getTileData().func_74780_a("XianLiang" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.24
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(3) + 1);
                }
                world.func_184138_a(_bp8, _bs8, _bs8, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.26
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.25
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "序列")) == 105.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.27
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.28
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "序列") - 1.0d) + " fabaokuozhan:lianqi03 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp9 = new BlockPos(x, y, z);
                TileEntity _tileEntity9 = world.func_175625_s(_bp9);
                IBlockState _bs9 = world.func_180495_p(_bp9);
                if (_tileEntity9 != null) {
                    _tileEntity9.getTileData().func_74780_a("JiaGe" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.29
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(31) + 30);
                }
                world.func_184138_a(_bp9, _bs9, _bs9, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp10 = new BlockPos(x, y, z);
                TileEntity _tileEntity10 = world.func_175625_s(_bp10);
                IBlockState _bs10 = world.func_180495_p(_bp10);
                if (_tileEntity10 != null) {
                    _tileEntity10.getTileData().func_74780_a("XianLiang" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.30
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(3) + 1);
                }
                world.func_184138_a(_bp10, _bs10, _bs10, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.32
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.31
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "序列")) == 106.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.33
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.34
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "序列") - 1.0d) + " fabaokuozhan:lianqi04 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp11 = new BlockPos(x, y, z);
                TileEntity _tileEntity11 = world.func_175625_s(_bp11);
                IBlockState _bs11 = world.func_180495_p(_bp11);
                if (_tileEntity11 != null) {
                    _tileEntity11.getTileData().func_74780_a("JiaGe" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.35
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(91) + 90);
                }
                world.func_184138_a(_bp11, _bs11, _bs11, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp12 = new BlockPos(x, y, z);
                TileEntity _tileEntity12 = world.func_175625_s(_bp12);
                IBlockState _bs12 = world.func_180495_p(_bp12);
                if (_tileEntity12 != null) {
                    _tileEntity12.getTileData().func_74780_a("XianLiang" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.36
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(3) + 1);
                }
                world.func_184138_a(_bp12, _bs12, _bs12, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.38
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.37
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "序列")) == 107.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.39
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.40
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "序列") - 1.0d) + " fabaokuozhan:lianqi05 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp13 = new BlockPos(x, y, z);
                TileEntity _tileEntity13 = world.func_175625_s(_bp13);
                IBlockState _bs13 = world.func_180495_p(_bp13);
                if (_tileEntity13 != null) {
                    _tileEntity13.getTileData().func_74780_a("JiaGe" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.41
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(481) + 480);
                }
                world.func_184138_a(_bp13, _bs13, _bs13, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp14 = new BlockPos(x, y, z);
                TileEntity _tileEntity14 = world.func_175625_s(_bp14);
                IBlockState _bs14 = world.func_180495_p(_bp14);
                if (_tileEntity14 != null) {
                    _tileEntity14.getTileData().func_74780_a("XianLiang" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.42
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(3) + 1);
                }
                world.func_184138_a(_bp14, _bs14, _bs14, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.44
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.43
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "序列")) == 108.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.45
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.46
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "序列") - 1.0d) + " fabaokuozhan:cailiao9101 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp15 = new BlockPos(x, y, z);
                TileEntity _tileEntity15 = world.func_175625_s(_bp15);
                IBlockState _bs15 = world.func_180495_p(_bp15);
                if (_tileEntity15 != null) {
                    _tileEntity15.getTileData().func_74780_a("JiaGe" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.47
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(2) + 1);
                }
                world.func_184138_a(_bp15, _bs15, _bs15, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp16 = new BlockPos(x, y, z);
                TileEntity _tileEntity16 = world.func_175625_s(_bp16);
                IBlockState _bs16 = world.func_180495_p(_bp16);
                if (_tileEntity16 != null) {
                    _tileEntity16.getTileData().func_74780_a("XianLiang" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.48
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(39) + 1);
                }
                world.func_184138_a(_bp16, _bs16, _bs16, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.50
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.49
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "序列")) == 109.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.51
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.52
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "序列") - 1.0d) + " fabaokuozhan:cailiao94 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp17 = new BlockPos(x, y, z);
                TileEntity _tileEntity17 = world.func_175625_s(_bp17);
                IBlockState _bs17 = world.func_180495_p(_bp17);
                if (_tileEntity17 != null) {
                    _tileEntity17.getTileData().func_74780_a("JiaGe" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.53
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(2) + 1);
                }
                world.func_184138_a(_bp17, _bs17, _bs17, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp18 = new BlockPos(x, y, z);
                TileEntity _tileEntity18 = world.func_175625_s(_bp18);
                IBlockState _bs18 = world.func_180495_p(_bp18);
                if (_tileEntity18 != null) {
                    _tileEntity18.getTileData().func_74780_a("XianLiang" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.54
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(39) + 1);
                }
                world.func_184138_a(_bp18, _bs18, _bs18, 3);
            }
        }
        if (new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.56
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "初始化" + new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.55
            public double getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = world.func_175625_s(pos);
                if (tileEntity != null) {
                    return tileEntity.getTileData().func_74769_h(tag);
                }
                return -1.0d;
            }
        }.getValue(new BlockPos(x, y, z), "序列")) == 110.0d) {
            if (!world.field_72995_K && world.func_73046_m() != null) {
                world.func_73046_m().func_71187_D().func_71556_a(new ICommandSender() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.57
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
                }, "replaceitem block ~ ~ ~ slot.container." + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.58
                    public double getValue(BlockPos pos, String tag) {
                        TileEntity tileEntity = world.func_175625_s(pos);
                        if (tileEntity != null) {
                            return tileEntity.getTileData().func_74769_h(tag);
                        }
                        return -1.0d;
                    }
                }.getValue(new BlockPos(x, y, z), "序列") - 1.0d) + " fabaokuozhan:cailiao92 1");
            }
            if (!world.field_72995_K) {
                BlockPos _bp19 = new BlockPos(x, y, z);
                TileEntity _tileEntity19 = world.func_175625_s(_bp19);
                IBlockState _bs19 = world.func_180495_p(_bp19);
                if (_tileEntity19 != null) {
                    _tileEntity19.getTileData().func_74780_a("JiaGe" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.59
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(3) + 2);
                }
                world.func_184138_a(_bp19, _bs19, _bs19, 3);
            }
            if (!world.field_72995_K) {
                BlockPos _bp20 = new BlockPos(x, y, z);
                TileEntity _tileEntity20 = world.func_175625_s(_bp20);
                IBlockState _bs20 = world.func_180495_p(_bp20);
                if (_tileEntity20 != null) {
                    _tileEntity20.getTileData().func_74780_a("XianLiang" + new DecimalFormat("0").format(new Object() { // from class: net.mcreator.yvanchuliandan.procedure.ProcedureMaiRu11.60
                        public double getValue(BlockPos pos, String tag) {
                            TileEntity tileEntity = world.func_175625_s(pos);
                            if (tileEntity != null) {
                                return tileEntity.getTileData().func_74769_h(tag);
                            }
                            return -1.0d;
                        }
                    }.getValue(new BlockPos(x, y, z), "序列")), new Random().nextInt(39) + 1);
                }
                world.func_184138_a(_bp20, _bs20, _bs20, 3);
            }
        }
    }
}
